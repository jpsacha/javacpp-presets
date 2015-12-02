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
 * Wrapper for Basler Pylon library (the C++ API v.5).
 *
 * @author Jarek Sacha
 */
@Properties(target = "org.bytedeco.javacpp.GenICam3", value = {
        @Platform(value = {"linux", "windows"}, include = {
                "<_GenICamVersion.h>",
                "<GenICamVersion.h>",
                "<GenApi/GenApiNamespace.h>",
                "<Base/GCNamespace.h>",
                "<Base/GCTypes.h>",
                "<Base/GCString.h>",
                "<Base/GCStringVector.h>",
//                "<Base/GCException.h>",
//                "<Base/GCUtilities.h>",
//                "<Base/GCBase.h>",
//                "<GenApi/GenApi.h>",
                "<GenApi/Types.h>",
                "<GenApi/Autovector.h>",
                "<GenApi/Reference.h>",
                "<GenApi/IBase.h>",
                "<GenApi/IValue.h>",
                "<GenApi/IBoolean.h>",
                "<GenApi/ICategory.h>",
                "<GenApi/ICommand.h>",
                "<GenApi/IInteger.h>",
                "<GenApi/IFloat.h>",
                "<GenApi/IPort.h>",
                "<GenApi/INode.h>",
                "<GenApi/IString.h>",
                "<GenApi/IRegister.h>",
                "<GenApi/Synch.h>",
//                "<GenApi/Container.h>",
                "<GenApi/INodeMap.h>",
                "<GenApi/IEnumEntry.h>",
                "<GenApi/IEnumeration.h>",
                "<GenApi/IEnumerationT.h>",
        }),
        @Platform(value = "linux", link = "genicam@.3", includepath = "/usr/include/pylon/genicam"),
        @Platform(value = "windows",
                link = {/* GeniCam */
                        "GenApi_MD_VC120_v3_0_Basler_pylon_v5_0",
                        "GCBase_MD_VC120_v3_0_Basler_pylon_v5_0",
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
        infoMap
////        infoMap.put(new Info("defined(WIN32) || defined(WIN64)").define())
                /* _GenICamVersion.h and GenICamVersion.h */
                .put(new Info("GENICAM_MAIN_COMPILER", "GENICAM_COMPILER").skip())
                .put(new Info(
                        "GENICAM_VERSION_MAJOR",
                        "GENICAM_VERSION_MINOR",
                        "GENICAM_COMPANY_SUFFIX",
                        "GENICAM_VERSION_MAJOR_STR",
                        "GENICAM_VERSION_MINOR_STR",
                        "GENICAM_VERSION_SUBMINOR_STR",
                        "GENICAM_VERSION_BUILD_STR",
                        "GENICAM_COMPILER_STR",
                        "GENICAM_CACHE_VERSION",
                        "GENICAM_LOG_CONFIG_VERSION",
                        "GENICAM_NAMESPACE", "GENAPI_NAMESPACE",
                        "GC_W64",
                        "GCSTRING_NPOS").cppTypes())
                .put(new Info("defined(GENICAM_COMPANY_SUFFIX)").define())

                /* "Base/GCTypes.h" - Fix wrapping of > */
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
//
//                /* "Base/GCString.h" prevent parsing of things related to inner class `gcwchar` **/
//
//                .put(new Info("defined(_MSC_VER) && !defined(PHARLAP_WIN32)").define(false))

                .put(new Info("GENAPI_NAMESPACE::CReferenceT<GENAPI_NAMESPACE::IInteger,GENAPI_NAMESPACE::IInteger>").pointerTypes("CReferenceTInteger").purify())
                .put(new Info("GENAPI_NAMESPACE::CBaseRefT<GENAPI_NAMESPACE::IInteger,GENAPI_NAMESPACE::IInteger>").pointerTypes("CBaseRefTInteger").purify())
                .put(new Info("GENAPI_NAMESPACE::CValueRefT<GENAPI_NAMESPACE::IInteger,GENAPI_NAMESPACE::IInteger>").pointerTypes("CValueRefTInteger").purify())
                .put(new Info("GENAPI_NAMESPACE::CIntegerRefT<GENAPI_NAMESPACE::IInteger,GENAPI_NAMESPACE::IInteger>").pointerTypes("CIntegerRef"))

                /* Workaround for not being able to parse <GenApi/Container.h>*/
                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::node_vector").cast().pointerTypes("Pointer"))
                // typedef value_vector FeatureList_t;
                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::FeatureList_t").cast().pointerTypes("Pointer"))

        ;
    }
}
