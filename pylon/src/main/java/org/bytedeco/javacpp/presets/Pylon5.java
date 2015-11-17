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
@Properties(inherit = GenICam3.class,
        target = "org.bytedeco.javacpp.Pylon5",
        value = {
                @Platform(value = {"linux", "windows"}, include = {
                        "<pylon/Platform.h>",
                        "<pylon/stdinclude.h>",
                        "<pylon/PylonBase.h>",
                        "<pylon/PylonVersionInfo.h>",
                        "<pylon/Info.h>",
                        "<pylon/TlInfo.h>",
                        "<pylon/DeviceClass.h>",
                        "<pylon/DeviceInfo.h>",
                        "<pylon/InterfaceInfo.h>",
                        "<pylon/Container.h>",
                        // DeviceAccessMode Excluded due to linker problems with bitset
//                        "<pylon/DeviceAccessMode.h>",
                        "<pylon/DeviceFactory.h>",
                        "<pylon/TransportLayer.h>",
                        "<pylon/TlFactory.h>",
                        "<pylon/EventAdapter.h>",

                        "<pylon/PixelType.h>",
                        "<pylon/PayloadType.h>",
                        "<pylon/Image.h>",
                        "<pylon/GrabResultData.h>",
                        "<pylon/GrabResultPtr.h>",

                        "<pylon/WaitObject.h>",
                        "<pylon/_InstantCameraParams.h>",
                        "<pylon/ConfigurationEventHandler.h>",
                        "<pylon/ImageEventHandler.h>",
                        "<pylon/CameraEventHandler.h>",
                        "<pylon/BufferFactory.h>",
                        "<pylon/InstantCamera.h>",
                        // Acquisition Configurations
                        "<pylon/AcquireSingleFrameConfiguration.h>",
                        "<pylon/AcquireContinuousConfiguration.h>",
                        "<pylon/SoftwareTriggerConfiguration.h>",
                        // "<pylon/gige/ActionTriggerConfiguration.h>",

                        // Images and conversions
                        "<pylon/ReusableImage.h>",
                        "<pylon/ImagePersistence.h>",
                        "<pylon/PixelData.h>",
                        "<pylon/PylonImageBase.h>",
                        "<pylon/PylonImage.h>",
//                        "<pylon/PylonBitmapImage.h>",
                        "<pylon/_ImageFormatConverterParams.h>",
                        "<pylon/ImageFormatConverter.h>",
                }),
                @Platform(value = "linux", link = "pylon@.5", includepath = "/usr/include/pylon/"),
                @Platform(value = "windows",
                        link = {"PylonBase_MD_VC120_v5_0" , "PylonGUI_MD_VC120_v5_0", "PylonUtility_MD_VC120_v5_0"},
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
public class Pylon5 implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("defined(WIN32) || defined(WIN64)").define())
//                /* "<pylon/stdinclude.h>" - Fix missing definition > */
//                .put(new Info("!defined(GENAPI_DLL_MANAGER_INVALID_HANDLE)").define(false))
//                .put(new Info("!defined(GENAPI_DLL_MANAGER_INVALID_SYMBOL)").define(false))
//                .put(new Info("GCSTRING_NPOS").skip())
                .put(new Info("PYLON_FUNC").skip())
                .put(new Info("GENAPI_DEPRECATED_FEATURE").skip())
                /* "<pylon/PylonBase.h>" */
                .put(new Info("PYLONBASE_API").cppTypes().annotations().cppText(""))
                /* "<pylon/PylonBase.h>" Do not generate wrapper for PylonAutoInitTerm to avoid JNI compilation error
                /* (cannot access `new`, which is intentionally private). */
                .put(new Info("Pylon::PylonAutoInitTerm").skip())

                /* <pylon/TlInfo.h> */
                .put(new Info("PYLON_LINUX_BUILD").define(false).skip())

                /* <pylon/Container.h> correct template wrapping. */
//                .put(new Info("PYLONBASE_EXPORT_TEMPLATE").define())
//                .put(new Info("Pylon::TList::iterator").skip())
//                .put(new Info("Pylon::TList::const_iterator").skip())
                .put(new Info("Pylon::TList<Pylon::CDeviceInfo>").pointerTypes("TListCDeviceInfo"))
                .put(new Info("Pylon::TList<Pylon::CTlInfo>").pointerTypes("TListCTlInfo"))
                .put(new Info("Pylon::TList<Pylon::CInterfaceInfo>").pointerTypes("TListCInterfaceInfo"))
////                /* "<pylon/DeviceAccessMode.h>" */
////                .put(new Info("std::bitset<Pylon::_NumModes>").pointerTypes("ModeBitSet").define())
//                /* ignore to avoid problem with "std::bitset<Pylon::_NumModes>" */
//                .put(new Info("Pylon::CTlFactory::IsDeviceAccessible").skip())
//
                /* Workaround for not being able to parse <pylon/DeviceAccessMode.h>*/
                .put(new Info("Pylon::AccessModeSet").cast().pointerTypes("Pointer"))
                .put(new Info("Pylon::Control").cast().valueTypes("int").cppText("0x1"))
//                .put(new Info("Pylon::IDeviceFactory::IsDeviceAccessible").skip())
//
                /* "<pylon/WaitObject.h>" */
                .put(new Info("defined (PYLON_LINUX_BUILD)").define(false))
                /* typedef void *HANDLE */
//                .put(new Info("HANDLE").valueTypes("HANDLE").pointerTypes("@Cast(\"HANDLE*\") @ByPtrPtr HANDLE").define())
                .put(new Info("HANDLE").cast().valueTypes("Pointer").pointerTypes("void"))

                /* <pylon/ImagePersistence.h> */
                .put(new Info("defined(PYLON_WIN_BUILD)").define())
                .put(new Info("defined(PYLON_LINUX_BUILD)").define(false))

                /* <pylon/ImagePersistence.h> */
                // Use `purify` to request creation of an abstract class, otherwise get error: "cannot instantiate abstract class"
//                .put(new Info("Pylon::IImage").purify())
                .put(new Info("Pylon::CPylonImageBase").purify())

                /* <pylon/_ImageFormatConverterParams.h> */
                .put(new Info("GenApi::IEnumerationT<Basler_ImageFormatConverterParams::MonoConversionMethodEnums>").pointerTypes("IEnumerationTMonoConversionMethodEnums"))
                .put(new Info("GenApi::IEnumerationT<Basler_ImageFormatConverterParams::OutputOrientationEnums>").pointerTypes("EnumerationTOutputOrientationEnums"))
                .put(new Info("GenApi::IEnumerationT<Basler_ImageFormatConverterParams::InconvertibleEdgeHandlingEnums>").pointerTypes("IEnumerationTInconvertibleEdgeHandlingEnums"))
                .put(new Info("GenApi::IEnumerationT<Basler_ImageFormatConverterParams::OutputBitAlignmentEnums>").pointerTypes("IEnumerationTOutputBitAlignmentEnums"))
       ;
    }
}
