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
 * Wrapper for Basler Pylon library (the C API v.4).
 *
 * @author Jarek Sacha
 */
@Properties(inherit = GenICam3.class,
        target = "org.bytedeco.javacpp.Pylon4_C",
        value = {
                @Platform(value = {"linux", "windows"}, include = {
                        "<genapic/GenApiCDefines.h>",
//                        "<genapic/GenApiCError.h>",
                        "<genapic/GenApiCEnums.h>",
                        "<genapic/GenApiCModule.h>",
                        "<genapic/GenApiCTypes.h>",
                        "<genapic/GenApiC.h>",

                        "<pylonc/PylonC32BitMethods.h>",
                        "<pylonc/PylonCEnums.h>",
                        "<pylonc/PylonC.h>"
                }),
                @Platform(value = "linux", link = "pylonc@.4", includepath = "/usr/include/pylon/"),
                @Platform(value = "windows",
                        link = "PylonC_MD_VC120",
                        includepath = "C:/Program Files/Basler/pylon 5/Development/include/"),
                @Platform(
                        value = "windows-x86",
                        define = {"WIN32", "GC_W64 1"},
                        linkpath = "C:/Program Files/Basler/pylon 4/Development/lib/Win32/",
                        preloadpath = "C:/Program Files/Basler/pylon 4/Runtime/Win32/"),
                @Platform(
                        value = "windows-x86_64",
                        define = {"WIN64", "GC_W64 1"},
                        linkpath = "C:/Program Files/Basler/pylon 4/Development/lib/x64/",
                        preloadpath = "C:/Program Files/Basler/pylon 4/Runtime/x64/"
                )})
public class Pylon4_C implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("defined GENAPIC_EXPORTS").define(false))
                .put(new Info("GENAPIC_CC").cppTypes().annotations().cppText(""))
                .put(new Info("defined (GENAPIC_WIN_BUILD)").define(false))
                .put(new Info("defined( GENAPIC_EXPORTS )").define(false))
                .put(new Info("defined PYLONC_EXPORTS").define(false))
                .put(new Info("defined(_MSC_VER)").define(false))
                .put(new Info("__cplusplus").define(false))
                .put(new Info("GENAPIC_API").cppTypes().annotations().cppText(""))
                .put(new Info("GENAPIC_INVALID_HANDLE").cast().pointerTypes("Pointer"))
                .put(new Info("NODE_HANDLE").cast().pointerTypes("Pointer"))
                .put(new Info("NODEMAP_HANDLE").cast().pointerTypes("Pointer"))
                .put(new Info("GENAPI_FILE_HANDLE").cast().pointerTypes("Pointer"))
                .put(new Info("NODE_CALLBACK_HANDLE").cast().pointerTypes("Pointer"))
                .put(new Info("GENAPIC_RESULT").cast().cppTypes("long").valueTypes("long"))
                .put(new Info("HRESULT").cast().cppTypes("long").valueTypes("long"))
                .put(new Info("STRING_PAR").cppTypes().annotations().cppText(""))
                .put(new Info("RETVAL_PAR").cppTypes().annotations().cppText(""))

//                .put(new Info("GENAPI_E_OK").cast().cppTypes("long").translate())


//                .put(new Info("_Bool").cast().valueTypes("boolean"))

                .put(new Info("PYLONC_API").cppTypes().annotations().cppText(""))

                /* Pointers defined using macro GENAPIC_DECLARE_HANDLE          */
                /*                                                              */
                /*   #   define GENAPIC_DECLARE_HANDLE(name) \                  */
                /*           struct name##_; typedef struct name##_ *name       */
                /*                                                              */
                /*   GENAPIC_DECLARE_HANDLE( PYLON_DEVICE_HANDLE )              */
                /*                                                              */
                .put(new Info("PYLON_DEVICE_HANDLE").cast().pointerTypes("IntPointer"))
                .put(new Info("PYLON_DEVICE_INFO_HANDLE").cast().pointerTypes("IntPointer"))
                .put(new Info("PYLON_STREAMGRABBER_HANDLE").cast().pointerTypes("IntPointer"))
                .put(new Info("PYLON_EVENTGRABBER_HANDLE").cast().pointerTypes("IntPointer"))
                .put(new Info("PYLON_CHUNKPARSER_HANDLE").cast().pointerTypes("IntPointer"))
                .put(new Info("PYLON_EVENTADAPTER_HANDLE").cast().pointerTypes("IntPointer"))
                .put(new Info("PYLON_WAITOBJECT_HANDLE").cast().pointerTypes("IntPointer"))
                .put(new Info("PYLON_WAITOBJECTS_HANDLE").cast().pointerTypes("IntPointer"))
                .put(new Info("PYLON_STREAMBUFFER_HANDLE").cast().pointerTypes("IntPointer"))
                .put(new Info("PYLON_DEVICECALLBACK_HANDLE").cast().pointerTypes("IntPointer"))
                .put(new Info("PYLON_FORMAT_CONVERTER_HANDLE").cast().pointerTypes("IntPointer"))
                .put(new Info("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE").cast().pointerTypes("IntPointer"))
                .put(new Info("PYLON_AVI_WRITER_HANDLE").cast().pointerTypes("IntPointer"))

                /* typedef void *HANDLE;  */
                .put(new Info("HANDLE").cast().pointerTypes("Pointer"))
                /* typedef HANDLE *PHANDLE;  */
                .put(new Info("PHANDLE").cast().pointerTypes("Pointer"))

                .put(new Info("HWND").cast().pointerTypes("Pointer"))
        ;
    }
}
