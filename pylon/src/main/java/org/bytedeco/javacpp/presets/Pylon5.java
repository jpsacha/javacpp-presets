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
                        "<GenApi/IEnumerationT.h>",

                        // <pylon/NodeMapProxy.h> cannot parse macro defining custom Node map proxy, l.33
//                        "<pylon/NodeMapProxy.h>",

                        // USB camera
//                        "<pylon/usb/_BaslerUsbCameraParams.h>",
//                        "<pylon/usb/BaslerUsbDeviceInfo.h>",
//                        "<pylon/usb/BaslerUsbConfigurationEventHandler.h>",
//                        "<pylon/usb/BaslerUsbImageEventHandler.h>",
//                        "<pylon/usb/BaslerUsbCameraEventHandler.h>",
////                        "<pylon/usb/BaslerUsbGrabResultPtr.h>",
//                        "<pylon/private/DeviceSpecificInstantCamera.h>",
//                        "<pylon/usb/_UsbStreamParams.h>",
//                        "<pylon/usb/_UsbEventParams.h>",
//                        "<pylon/usb/_UsbTLParams.h>",
//                        "<pylon/usb/BaslerUsbInstantCamera.h>",
                }),
                @Platform(value = "linux", link = "pylon@.5", includepath = "/usr/include/pylon/"),
                @Platform(value = "windows",
                        link = {"PylonBase_MD_VC120_v5_0", "PylonGUI_MD_VC120_v5_0", "PylonUtility_MD_VC120_v5_0"},
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
                /* "<pylon/DeviceAccessMode.h>" */
                .put(new Info("std::bitset<Pylon::_NumModes>").pointerTypes("BitSetNumModes").define())
//                /* ignore to avoid problem with "std::bitset<Pylon::_NumModes>" */
//                .put(new Info("Pylon::CTlFactory::IsDeviceAccessible").skip())
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
                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_ImageFormatConverterParams::MonoConversionMethodEnums>").pointerTypes("IEnumerationT_MonoConversionMethodEnums").define())
                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_ImageFormatConverterParams::OutputOrientationEnums>").pointerTypes("IEnumerationT_OutputOrientationEnums").define())
                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_ImageFormatConverterParams::InconvertibleEdgeHandlingEnums>").pointerTypes("IEnumerationT_InconvertibleEdgeHandlingEnums").define())
                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_ImageFormatConverterParams::OutputBitAlignmentEnums>").pointerTypes("IEnumerationT_OutputBitAlignmentEnums").define())

                /* EventHandlers intended for subclassing */
                .put(new Info("Pylon::CConfigurationEventHandler").purify().virtualize())

//                /* <pylon/usb/_BaslerUsbCameraParams.h> */
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SequencerModeEnums>").pointerTypes("IEnumerationT_SequencerModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SequencerConfigurationModeEnums>").pointerTypes("IEnumerationT_SequencerConfigurationModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SequencerTriggerSourceEnums>").pointerTypes("IEnumerationT_SequencerTriggerSourceEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SequencerTriggerActivationEnums>").pointerTypes("IEnumerationT_SequencerTriggerActivationEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::BinningHorizontalModeEnums>").pointerTypes("IEnumerationT_BinningHorizontalModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::BinningVerticalModeEnums>").pointerTypes("IEnumerationT_BinningVerticalModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::PixelFormatEnums>").pointerTypes("IEnumerationT_PixelFormatEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::PixelSizeEnums>").pointerTypes("IEnumerationT_PixelSizeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::PixelColorFilterEnums>").pointerTypes("IEnumerationT_PixelColorFilterEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TestImageSelectorEnums>").pointerTypes("IEnumerationT_TestImageSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::GainAutoEnums>").pointerTypes("IEnumerationT_GainAutoEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::GainSelectorEnums>").pointerTypes("IEnumerationT_GainSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::BlackLevelSelectorEnums>").pointerTypes("IEnumerationT_BlackLevelSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LightSourcePresetEnums>").pointerTypes("IEnumerationT_LightSourcePresetEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ColorSpaceEnums>").pointerTypes("IEnumerationT_ColorSpaceEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::BalanceWhiteAutoEnums>").pointerTypes("IEnumerationT_BalanceWhiteAutoEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::BalanceRatioSelectorEnums>").pointerTypes("IEnumerationT_BalanceRatioSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ColorAdjustmentSelectorEnums>").pointerTypes("IEnumerationT_ColorAdjustmentSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ColorTransformationSelectorEnums>").pointerTypes("IEnumerationT_ColorTransformationSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ColorTransformationValueSelectorEnums>").pointerTypes("IEnumerationT_ColorTransformationValueSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::AcquisitionModeEnums>").pointerTypes("IEnumerationT_AcquisitionModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ShutterModeEnums>").pointerTypes("IEnumerationT_ShutterModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ExposureAutoEnums>").pointerTypes("IEnumerationT_ExposureAutoEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ExposureModeEnums>").pointerTypes("IEnumerationT_ExposureModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ExposureOverlapTimeModeEnums>").pointerTypes("IEnumerationT_ExposureOverlapTimeModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SensorReadoutModeEnums>").pointerTypes("IEnumerationT_SensorReadoutModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TriggerSelectorEnums>").pointerTypes("IEnumerationT_TriggerSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TriggerModeEnums>").pointerTypes("IEnumerationT_TriggerModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TriggerSourceEnums>").pointerTypes("IEnumerationT_TriggerSourceEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TriggerActivationEnums>").pointerTypes("IEnumerationT_TriggerActivationEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::AcquisitionStatusSelectorEnums>").pointerTypes("IEnumerationT_AcquisitionStatusSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::AutoFunctionProfileEnums>").pointerTypes("IEnumerationT_AutoFunctionProfileEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::AutoFunctionROISelectorEnums>").pointerTypes("IEnumerationT_AutoFunctionROISelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LUTSelectorEnums>").pointerTypes("IEnumerationT_LUTSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LineSelectorEnums>").pointerTypes("IEnumerationT_LineSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LineModeEnums>").pointerTypes("IEnumerationT_LineModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LineFormatEnums>").pointerTypes("IEnumerationT_PixelColorFilterEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LineLogicEnums>").pointerTypes("IEnumerationT_LineLogicEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LineSourceEnums>").pointerTypes("IEnumerationT_LineSourceEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::UserOutputSelectorEnums>").pointerTypes("IEnumerationT_UserOutputSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SoftwareSignalSelectorEnums>").pointerTypes("IEnumerationT_SoftwareSignalSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TimerSelectorEnums>").pointerTypes("IEnumerationT_TimerSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TimerTriggerSourceEnums>").pointerTypes("IEnumerationT_TimerTriggerSourceEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::CounterSelectorEnums>").pointerTypes("IEnumerationT_CounterSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::CounterEventSourceEnums>").pointerTypes("IEnumerationT_CounterEventSourceEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::CounterResetSourceEnums>").pointerTypes("IEnumerationT_CounterResetSourceEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::CounterResetActivationEnums>").pointerTypes("IEnumerationT_CounterResetActivationEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::UserSetSelectorEnums>").pointerTypes("IEnumerationT_UserSetSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::UserSetDefaultEnums>").pointerTypes("IEnumerationT_UserSetDefaultEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ChunkSelectorEnums>").pointerTypes("IEnumerationT_ChunkSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ChunkGainSelectorEnums>").pointerTypes("IEnumerationT_ChunkGainSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ChunkCounterSelectorEnums>").pointerTypes("IEnumerationT_ChunkCounterSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::EventSelectorEnums>").pointerTypes("IEnumerationT_EventSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::EventNotificationEnums>").pointerTypes("IEnumerationT_EventNotificationEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::BslUSBSpeedModeEnums>").pointerTypes("IEnumerationT_BslUSBSpeedModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::DeviceScanTypeEnums>").pointerTypes("IEnumerationT_DeviceScanTypeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::DeviceLinkThroughputLimitModeEnums>").pointerTypes("IEnumerationT_DeviceLinkThroughputLimitModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::DeviceTemperatureSelectorEnums>").pointerTypes("IEnumerationT_DeviceTemperatureSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TemperatureStateEnums>").pointerTypes("IEnumerationT_TemperatureStateEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::UserDefinedValueSelectorEnums>").pointerTypes("IEnumerationT_UserDefinedValueSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::RemoveParameterLimitSelectorEnums>").pointerTypes("IEnumerationT_RemoveParameterLimitSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ExpertFeatureAccessSelectorEnums>").pointerTypes("IEnumerationT_ExpertFeatureAccessSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::FileSelectorEnums>").pointerTypes("IEnumerationT_FileSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::FileOperationSelectorEnums>").pointerTypes("FileOperationSelectorEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::FileOpenModeEnums>").pointerTypes("IEnumerationT_FileOpenModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::FileOperationStatusEnums>").pointerTypes("IEnumerationT_FileOperationStatusEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TestPatternEnums>").pointerTypes("IEnumerationT_TestPatternEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SensorShutterModeEnums>").pointerTypes("IEnumerationT_SensorShutterModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::OverlapModeEnums>").pointerTypes("IEnumerationT_OverlapModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::DefectPixelCorrectionModeEnums>").pointerTypes("IEnumerationT_DefectPixelCorrectionModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::DeviceIndicatorModeEnums>").pointerTypes("IEnumerationT_DeviceIndicatorModeEnums").define())
//                .put(new Info("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::AutoFunctionAOISelectorEnums>").pointerTypes("IEnumerationT_AutoFunctionAOISelectorEnums").define())

        ;
    }
}
