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
                        "<pylon/DeviceAccessMode.h>",
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

                        "<pylon/NodeMapProxy.h>",

                        // USB camera
                        "<pylon/usb/_UsbChunkData.h>",
                        "<pylon/usb/_BaslerUsbCameraParams.h>",
                        "<GenApi/IEnumerationT.h>",
                        "<pylon/usb/BaslerUsbDeviceInfo.h>",
                        "<pylon/usb/BaslerUsbConfigurationEventHandler.h>",
                        "<pylon/private/DeviceSpecificGrabResultPtr.h>",
                        "<pylon/usb/BaslerUsbGrabResultData.h>",
                        "<pylon/usb/BaslerUsbGrabResultPtr.h>",
                        "<pylon/usb/BaslerUsbImageEventHandler.h>",
                        "<pylon/usb/BaslerUsbCameraEventHandler.h>",
                        "<pylon/usb/_UsbEventParams.h>",
                        "<pylon/usb/_UsbStreamParams.h>",
                        "<pylon/usb/_UsbTLParams.h>",
                        "<pylon/private/DeviceSpecificConfigurationEventHandlerTie.h>",
                        "<pylon/private/DeviceSpecificImageEventHandlerTie.h>",
                        "<pylon/private/DeviceSpecificCameraEventHandlerTie.h>",
                        "<pylon/private/DeviceSpecificInstantCamera.h>",
                        "<pylon/usb/BaslerUsbInstantCamera.h>",
                }),
                @Platform(value = "linux", link = "pylon@.5", includepath = "/usr/include/pylon/"),
                @Platform(value = "windows",
                        define = {
                                // Use GenICam-specific exception instead of std:exception
                                "GENERIC_EXCEPTION_CLASS GenICam::GenericException"},
                        link = {"PylonBase_MD_VC120_v5_0", "PylonGUI_MD_VC120_v5_0", "PylonUtility_MD_VC120_v5_0"},
                        includepath = "C:/Program Files/Basler/pylon 5/Development/include/"),
                @Platform(
                        value = "windows-x86",
                        define = {"WIN32", "GC_W64 1",
                                // Use GenICam-specific exception instead of std:exception
                                "GENERIC_EXCEPTION_CLASS GenICam::GenericException"},
                        linkpath = "C:/Program Files/Basler/pylon 4/Development/lib/Win32/",
                        preloadpath = "C:/Program Files/Basler/pylon 4/Runtime/Win32/"),
                @Platform(
                        value = "windows-x86_64",
                        define = {"WIN64", "GC_W64 1",
                                // Use GenICam-specific exception instead of std:exception
                                "GENERIC_EXCEPTION_CLASS GenICam::GenericException"},
                        linkpath = "C:/Program Files/Basler/pylon 4/Development/lib/x64/",
                        preloadpath = "C:/Program Files/Basler/pylon 4/Runtime/x64/"
                )})
public class Pylon5 implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("defined(WIN32) || defined(WIN64)").define())
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
                .put(new Info("Pylon::TList<Pylon::CDeviceInfo>").pointerTypes("TList_CDeviceInfo"))
                .put(new Info("Pylon::TList<Pylon::CTlInfo>").pointerTypes("TList_CTlInfo"))
                .put(new Info("Pylon::TList<Pylon::CInterfaceInfo>").pointerTypes("TList_CInterfaceInfo"))
                /* "<pylon/DeviceAccessMode.h>" */
                .put(new Info("std::bitset<Pylon::_NumModes>").pointerTypes("BitSet__NumModes").define())
//
                /* "<pylon/WaitObject.h>" */
                .put(new Info("defined (PYLON_LINUX_BUILD)").define(false))
                .put(new Info("HANDLE").cast().valueTypes("Pointer").pointerTypes("void"))

                /* <pylon/ImagePersistence.h> */
                .put(new Info("defined(PYLON_WIN_BUILD)").define())
                .put(new Info("defined(PYLON_LINUX_BUILD)").define(false))

                /* <pylon/ImagePersistence.h> */
                // Use `purify` to request creation of an abstract class, otherwise get error: "cannot instantiate abstract class"
//                .put(new Info("Pylon::IImage").purify())
                .put(new Info("Pylon::CPylonImageBase").purify())

                /* <pylon/_ImageFormatConverterParams.h> */
                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_ImageFormatConverterParams::MonoConversionMethodEnums>").pointerTypes("IEnumerationT_MonoConversionMethodEnums").define())
                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_ImageFormatConverterParams::OutputOrientationEnums>").pointerTypes("IEnumerationT_OutputOrientationEnums").define())
                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_ImageFormatConverterParams::InconvertibleEdgeHandlingEnums>").pointerTypes("IEnumerationT_InconvertibleEdgeHandlingEnums").define())
                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_ImageFormatConverterParams::OutputBitAlignmentEnums>").pointerTypes("IEnumerationT_OutputBitAlignmentEnums").define())

                /* EventHandlers intended for subclassing */
                .put(new Info("Pylon::CConfigurationEventHandler").purify().virtualize());


        //
        // <pylon/usb/_UsbChunkData.h>
        //
//        final String[] usbChunkDataEnums = {"ChunkGainSelectorEnums", "ChunkCounterSelectorEnums",};
//        for (String e : usbChunkDataEnums) {
//            infoMap.put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbChunkData::" + e + ">")
//                    .pointerTypes("IEnumerationT_" + e).define());
//        }
        // Ignore enums that conflict with names of enums from _BaslerUsbCameraParams.h
        infoMap.put(new Info("Basler_UsbChunkData::ChunkGainSelectorEnums").skip());
        infoMap.put(new Info("Basler_UsbChunkData::ChunkCounterSelectorEnums").skip());
        // Also ignore methods that use skipped enums.
        infoMap.put(new Info("Basler_UsbChunkData::CUsbChunkData_Params::ChunkGainSelector").skip());
        infoMap.put(new Info("Basler_UsbChunkData::CUsbChunkData_Params::ChunkCounterSelector").skip());


        /* <pylon/usb/_BaslerUsbCameraParams.h> */
        final String[] usbCameraParamsEnums = {
                // <pylon/usb/_BaslerUsbCameraParams.h>
                "SequencerModeEnums", "SequencerConfigurationModeEnums", "SequencerTriggerSourceEnums",
                "SequencerTriggerActivationEnums", "BinningHorizontalModeEnums", "BinningVerticalModeEnums",
                "PixelFormatEnums", "PixelSizeEnums", "PixelColorFilterEnums", "TestImageSelectorEnums",
                "GainAutoEnums", "GainSelectorEnums", "BlackLevelSelectorEnums", "LightSourcePresetEnums",
                "ColorSpaceEnums", "BalanceWhiteAutoEnums", "BalanceRatioSelectorEnums", "ColorAdjustmentSelectorEnums",
                "ColorTransformationSelectorEnums", "ColorTransformationValueSelectorEnums", "AcquisitionModeEnums",
                "ShutterModeEnums", "ExposureAutoEnums", "ExposureModeEnums", "ExposureOverlapTimeModeEnums",
                "SensorReadoutModeEnums", "TriggerSelectorEnums", "TriggerModeEnums", "TriggerSourceEnums",
                "TriggerActivationEnums", "AcquisitionStatusSelectorEnums", "AutoFunctionProfileEnums",
                "AutoFunctionROISelectorEnums", "LUTSelectorEnums", "LineSelectorEnums", "LineModeEnums",
                "LineFormatEnums", "LineLogicEnums", "LineSourceEnums", "UserOutputSelectorEnums",
                "SoftwareSignalSelectorEnums", "TimerSelectorEnums", "TimerTriggerSourceEnums", "CounterSelectorEnums",
                "CounterEventSourceEnums", "CounterResetSourceEnums", "CounterResetActivationEnums",
                "UserSetSelectorEnums", "UserSetDefaultEnums", "ChunkSelectorEnums", "ChunkGainSelectorEnums",
                "ChunkCounterSelectorEnums", "EventSelectorEnums", "EventNotificationEnums", "BslUSBSpeedModeEnums",
                "DeviceScanTypeEnums", "DeviceLinkThroughputLimitModeEnums", "DeviceTemperatureSelectorEnums",
                "TemperatureStateEnums", "UserDefinedValueSelectorEnums", "RemoveParameterLimitSelectorEnums",
                "ExpertFeatureAccessSelectorEnums", "FileSelectorEnums", "FileOperationSelectorEnums",
                "FileOpenModeEnums", "FileOperationStatusEnums", "TestPatternEnums", "SensorShutterModeEnums",
                "OverlapModeEnums", "DefectPixelCorrectionModeEnums", "DeviceIndicatorModeEnums",
                "AutoFunctionAOISelectorEnums",
        };
        for (String e : usbCameraParamsEnums) {
            infoMap.put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::" + e + ">")
                    .pointerTypes("IEnumerationT_" + e));
        }

        // <pylon/usb/BaslerUsbDeviceInfo.h> ignore incorrectly generated "const char* const"
        // TODO: report javacpp problems leading to this issue
        final String[] keys = {
                "DeviceGUIDKey", "ManufacturerInfoKey", "DeviceIdxKey", "VendorIdKey", "ProductIdKey",
                "DriverKeyNameKey", "UsbDriverTypeKey", "UsbPortVersionBcdKey", "SpeedSupportBitmaskKey",
                "TransferModeKey"};
        for (String k : keys) infoMap.put(new Info("Pylon::Key::" + k).skip());

        infoMap.put(new Info("Pylon::CDeviceSpecificGrabResultPtr<Pylon::CBaslerUsbGrabResultData>").pointerTypes("CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData").define());

        // Ignore enum `Basler_UsbStreamParams::StatusEnums` to avoid conflict with one in `Basler_UsbEventParams`,
        // both have the same named entries. JavaCPP would generate `int` constants with the same names, resulting in compilation error.
        infoMap.put(new Info("Basler_UsbStreamParams::StatusEnums").skip());


        // Workaround lack of virtual destructor definitions in sub-classes
        final String[] classesToFlatten = {
                "Basler_InstantCameraParams::CInstantCameraParams_Params",
                "Basler_ImageFormatConverterParams::CImageFormatConverterParams_Params",
                "Basler_UsbCameraParams::CUsbCameraParams_Params",
                "Basler_UsbTLParams::CUsbTLParams_Param",
                "Basler_UsbStreamParams::CUsbStreamParams_Params",
                "Basler_UsbEventParams::CUsbEventParams_Params"
        };
        for (String c : classesToFlatten) infoMap.put(new Info(c).flatten());


        instantiateTemplates(infoMap, "", "", new String[][]{
                {"Pylon::CDeviceSpecificInstantCameraT<Pylon::CBaslerUsbInstantCameraTraits>",
                        "CDeviceSpecificInstantCameraT_CBaslerUsbInstantCameraTraits"},
                {"Pylon::CNodeMapProxyT<Basler_UsbTLParams::CUsbTLParams_Params>",
                        "CNodeMapProxyT_UsbTLParams_Params"},
                {"Pylon::CNodeMapProxyT<Basler_UsbStreamParams::CUsbStreamParams_Params>",
                        "CNodeMapProxyT_CUsbStreamParams_Params"},
                {"Pylon::CNodeMapProxyT<Basler_UsbEventParams::CUsbEventParams_Params>",
                        "CNodeMapProxyT_CUsbEventParams_Params"}
        });

        // `Pylon::CBaslerUsbInstantCameraTraits` is using typedefs that are not expanded by JavaCPP when instantiating template
        // `Pylon::CDeviceSpecificInstantCameraT<Pylon::CBaslerUsbInstantCameraTraits>`
        // Make equivalent of those typedefs here,
        typeDefs(infoMap, "Pylon::CBaslerUsbInstantCameraTraits::", new String[][]{
                {"CameraParams_t", "CUsbCameraParams_Params"},
                {"IPylonDevice_t", "IPylonDevice"},
                {"DeviceInfo_t", "CBaslerUsbDeviceInfo"}, //Pylon::CBaslerUsbDeviceInfo
                {"TlParams_t", "CNodeMapProxyT_UsbTLParams_Params"},
                {"StreamGrabberParams_t", "CNodeMapProxyT_CUsbStreamParams_Params"},
                {"EventGrabberParams_t", "CNodeMapProxyT_CUsbEventParams_Params"},
                {"ConfigurationEventHandler_t", "CBaslerUsbConfigurationEventHandler"},
                {"ImageEventHandler_t", "CBaslerUsbImageEventHandler"},
                {"CameraEventHandler_t", "CBaslerUsbCameraEventHandler"},
                {"GrabResultData_t", "CBaslerUsbGrabResultData"},
                {"GrabResultPtr_t", "CBaslerUsbGrabResultPtr"},
        });
    }

    private void instantiateTemplates(InfoMap infoMap, String prefix, String postfix, String[][] pairs) {
        for (String[] p : pairs) {
            infoMap.put(new Info(prefix + p[0]).pointerTypes(p[1] + postfix).define());
        }
    }

    private void typeDefs(InfoMap infoMap, String prefix, String[][] pairs) {
        for (String[] p : pairs) {
            infoMap.put(new Info(prefix + p[0]).pointerTypes(p[1]));
        }
    }
}
