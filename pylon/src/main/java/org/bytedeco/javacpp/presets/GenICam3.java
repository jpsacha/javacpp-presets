/*
 * Copyright (C) 2015 Samuel Audet, Jarek Sacha
 *
 * Licensed either under the Apache License, Version 2.0, or (at your option)
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation (subject to the "Classpath" exception),
 * either version 2, or any later version (collectively, the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     http://www.gnu.org/licenses/
 *     http://www.gnu.org/software/classpath/license.html
 *
 * or as provided in the LICENSE.txt file that accompanied this code.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.bytedeco.javacpp.presets;

import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

/**
 * Wrapper for Basler Pylon library (the C++ API v.4).
 *
 * @author Jarek Sacha
 */
@Properties(target = "org.bytedeco.javacpp.GenICam3", value = {
        @Platform(value = {"linux", "windows"}, include = {
//                "<_GenICamVersion.h>",
//                "<GenICamVersion.h>",
//                "<Base/GCNamespace.h>",
                "<Base/GCTypes.h>",
                "<Base/GCString.h>",
                "<Base/GCStringVector.h>",
////                "<Base/GCException.h>",
////                "<Base/GCUtilities.h>",
////                "<Base/GCBase.h>",
////                "<GenApi/GenApi.h>",
//                // <GenApi/Types.h> commented out due to issues with enums with Long values
////                "<GenApi/Types.h>",
//                "<GenApi/Reference.h>",
//                "<GenApi/IBase.h>",
//                "<GenApi/IValue.h>",
//                "<GenApi/IBoolean.h>",
//                "<GenApi/IInteger.h>",
//                "<GenApi/IFloat.h>",
//                "<GenApi/IPort.h>",
//                "<GenApi/INode.h>",
//                "<GenApi/Synch.h>",
////                "<GenApi/Container.h>",
////                "<GenApi/INodeMap.h>",
        }),
        @Platform(value = "linux", link = "genicam@.2", includepath = "/usr/include/pylon/genicam"),
        @Platform(value = "windows",
                link = {/* GeniCam */
//                        "CLAllSerial_MD_VC100_v2_3",
//                        "CLProtocol_MD_VC100_v2_3",
//                        "CLSerCOM",
                        "GCBase_MD_VC120_v3_0_Basler_pylon_v5_0",
//                        "GenApi_MD_VC100_v2_3"
                },
                includepath = "C:/Program Files/Basler/pylon 5/Development/include/"),
        @Platform(
                value = "windows-x86",
                linkpath = "C:/Program Files/Basler/pylon 5/Development/lib/Win32/",
                preloadpath = "C:/Program Files/Basler/pylon 4/Runtime/Win32/"),
        @Platform(
                value = "windows-x86_64",
                define = {"WIN32", "GC_W64 1"},
                linkpath = "C:/Program Files/Basler/pylon 5/Development/lib/x64/",
                preloadpath = "C:/Program Files/Basler/pylon 5/Runtime/x64/"
        )})
public class GenICam3 implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("defined(WIN32) || defined(WIN64)").define())
//                /* _GenICamVersion.h and GenICamVersion.h */
                .put(new Info("GENICAM_MAIN_COMPILER").skip())
                .put(new Info("GENICAM_COMPANY_SUFFIX").skip())
                .put(new Info("GENICAM_COMPILER").skip())

//                .put(new Info("GENICAM_NAMESPACE").annotations().cppText("GenICam"))

                /* "Base/GCTypes.h" - Fix wrapping of > */
                .put(new Info("GC_W64").define(true))
                .put(new Info("INT64_MAX").define(false))
                .put(new Info("INT64_MIN").define(false))
                .put(new Info("UINT64_MAX").define(false))
                .put(new Info("INT32_MAX").define(false))
                .put(new Info("INT32_MIN").define(false))
                .put(new Info("UINT32_MAX").define(false))
                .put(new Info("INT8_MAX").define(false))
                .put(new Info("INT8_MIN").define(false))
                .put(new Info("UINT8_MAX").define(false))
                .put(new Info("GCBASE_API").cppTypes().cppTypes().annotations().cppText(""))
                .put(new Info("GCBASE_RTTI_CLASS_API").cppTypes().annotations().cppText(""))

                /* "Base/GCString.h" prevent parsing of things related to inner class `gcwchar` **/

                .put(new Info("defined(_MSC_VER) && !defined(PHARLAP_WIN32)").define(false))
                /* Enums defined here since <GenApi/Types.h> cannot be parsed due to Long enums */
                .put(new Info("GenApi::EAccessMode").cast().valueTypes("int"))
                .put(new Info("GenApi::ECachingMode").cast().valueTypes("int"))
                .put(new Info("GenApi::ECachingMode").cast().valueTypes("int"))
                .put(new Info("GenApi::EDisplayNotation").cast().valueTypes("int"))
                .put(new Info("GenApi::EInterfaceType").cast().valueTypes("int"))
                .put(new Info("GenApi::ELinkType").cast().valueTypes("int"))
                .put(new Info("GenApi::ENameSpace").cast().valueTypes("int"))
                .put(new Info("GenApi::ERepresentation").cast().valueTypes("int"))
                .put(new Info("GenApi::EVisibility").cast().valueTypes("int"))
                .put(new Info("GenApi::EYesNo").cast().valueTypes("int"))

                .put(new Info("GenApi::CReferenceT<GenApi::IInteger,GenApi::IInteger>").pointerTypes("CReferenceTInteger").purify())
                .put(new Info("GenApi::CBaseRefT<GenApi::IInteger,GenApi::IInteger>").pointerTypes("CBaseRefTInteger").purify())
                .put(new Info("GenApi::CValueRefT<GenApi::IInteger,GenApi::IInteger>").pointerTypes("CValueRefTInteger").purify())
                .put(new Info("GenApi::CIntegerRefT<GenApi::IInteger,GenApi::IInteger>").pointerTypes("CIntegerRef"))

                /* Workaround for not be ing able to parse <GenApi/Container.h>*/
                .put(new Info("GenApi::node_vector").cast().pointerTypes("Pointer"))

        ;
    }
}
