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
@Properties(target = "org.bytedeco.javacpp.GenICam2", value = {
        @Platform(value = {"linux", "windows"}, include = {
                "<Base/GCTypes.h>",
                "<Base/GCString.h>",
                "<Base/GCStringVector.h>",
                "<GenApi/Reference.h>",
                "<GenApi/IBase.h>",
                "<GenApi/IValue.h>",
                "<GenApi/IBoolean.h>",
                "<GenApi/IInteger.h>",
//                "<GenApi/GenApi.h>",
//                "<GenApi/Types.h>",
//                "<Base/GCException.h>",
//                "<Base/GCUtilities.h>",
//                "<Base/GCBase.h>",
        }),
        @Platform(value = "linux", link = "genicam@.2", includepath = "/usr/include/pylon/genicam"),
        @Platform(value = "windows",
                link = {/* GeniCam */
                        "CLAllSerial_MD_VC100_v2_3",
                        "CLProtocol_MD_VC100_v2_3",
                        "CLSerCOM",
                        "GCBase_MD_VC100_v2_3",
                        "GenApi_MD_VC100_v2_3"},
                includepath = "C:/Program Files/Basler/pylon 4/genicam/library/cpp/include/"),
        @Platform(
                value = "windows-x86",
                linkpath = "C:/Program Files/Basler/pylon 4/genicam/library/cpp/lib/win32_i86/",
                preloadpath = {
                        "C:/Program Files/Basler/pylon 4/genicam/bin/win32_i86/",
                        "C:/Program Files/Basler/pylon 4/genicam/bin/win32_i86/CLProtocol",
                        "C:/Program Files/Basler/pylon 4/genicam/bin/win32_i86/GenApi/Generic"}),
        @Platform(
                value = "windows-x86_64",
                define = {"WIN32", "GC_W64 1"},
                linkpath = "C:/Program Files/Basler/pylon 4/genicam/library/cpp/lib/win64_x64/",
                preloadpath = {
                        "C:/Program Files/Basler/pylon 4/genicam/bin/win64_x64/",
                        "C:/Program Files/Basler/pylon 4/genicam/bin/win64_x64/CLProtocol",
                        "C:/Program Files/Basler/pylon 4/genicam/bin/win64_x64/GenApi/Generic"}
        )})
public class GenICam2 implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("defined(WIN32) || defined(WIN64)").define())
                .put(new Info("GCBASE_API").cppTypes().annotations().cppText(""))
                /* "Base/GCTypes.h" - Fix wrapping of > */
                .put(new Info("GC_W64").define(true))
                /* "Base/GCString.h" prevent parsing of things related to inner class `gcwchar` **/
                .put(new Info("defined(_MSC_VER) && !defined(PHARLAP_WIN32)").define(false))
                /* typedef enum _EAccessMode { ... } EAccessMode */
                .put(new Info("EAccessMode").cast().valueTypes("int"))
                .put(new Info("ERepresentation").cast().valueTypes("int"))
                .put(new Info("GenApi::IReference").purify())
                /* Define concrete classes implementing templates to get access to CIntegerRef/IInteger */
//                .put(new Info("GenApi::CReferenceT<GenApi::IInteger,GenApi::IInteger>").pointerTypes("CReferenceTInteger").define())
//                .put(new Info("GenApi::CBaseRefT<GenApi::IInteger,GenApi::IInteger>").pointerTypes("CBaseRefTInteger").define())
//                .put(new Info("GenApi::CValueRefT<GenApi::IInteger,GenApi::IInteger>").pointerTypes("CValueRefTInteger").define())
//                .put(new Info("GenApi::CIntegerRefT<GenApi::IInteger,GenApi::IInteger>").pointerTypes("CIntegerRef").define())
//                /* Mark IInteger as virtual */
//                .put(new Info("GenApi::IInteger").purify().virtualize())
                .put(new Info("GenApi::IBase").purify())
                .put(new Info("GenApi::IValue").purify())
                .put(new Info("GenApi::IInteger").purify())
//                /* ... skip `operator =` that returns reference to IInteger causing compilation problem */
//                /* ... `error cannot instantiate abstract class`                                        */
//                .put(new Info("GenApi::IInteger::operator =").skip())
                .put(new Info("GenApi::CReferenceT").purify())
                .put(new Info("GenApi::CBaseRefT").purify())
                .put(new Info("GenApi::CValueRefT").purify())
                .put(new Info("GenApi::CIntegerRefT").purify())
        ;
    }
}
