// Targeted by JavaCPP version 1.1

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.GenICam2.*;

public class Pylon4 extends org.bytedeco.javacpp.presets.Pylon4 {
    static { Loader.load(); }

// Parsed from <pylon/Platform.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2008-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Thomas Koeller
//-----------------------------------------------------------------------------
/** \file 
\brief Provides platform-specific defines
*/


// #if !defined(PYLON_PLATFORM_H)
// #define PYLON_PLATFORM_H

// #if defined (_MSC_VER) && defined (_WIN32)
// Platform Microsoft windows, Microsoft tool chain



/** \brief Is defined, when using the pylon for Windows API */
// #   define PYLON_WIN_BUILD  // we are building for windows

// define PYLON_XX_BUILD to distinguish between 32 & 64 bit builds
// #   if defined(_WIN32) && !defined(_WIN64)
// #       define PYLON_32_BUILD
// #   elif defined(_WIN32) && defined(_WIN64)
// #       define PYLON_64_BUILD
// #   else
// #       error unsupported wordsize (32/64 platform)
// #   endif



// #   if defined(PYLON_STATIC)
// #       define APIEXPORT
// #       define APIIMPORT
// #       define PUBLIC_INTERFACE
// #   else
// #       define APIEXPORT __declspec(dllexport)
// #       define APIIMPORT __declspec(dllimport)
// #       define PUBLIC_INTERFACE
// #   endif

// #   if !defined(CDECL)
// #       define CDECL
// #   endif

// #   if defined PYLON_NO_DEPRECATE
// #       define PYLON_DEPRECATED(x)
// #   else
// #       if _MSC_VER >= 1400
// #           define PYLON_DEPRECATED(x) __declspec(deprecated(x))
// #       else
// #           define PYLON_DEPRECATED(x) __declspec(deprecated)
// #       endif
// #   endif

// packing used for pylon structs/classes
public static final int PYLON_PACKING = 8;

// mark char8_t and uchar8_t as deprecated
// We'll typedef them here again, so can use declspec(deprecated) instead of #deprecated

// #elif defined(__GNUC__) && defined(__linux__)
// Platform Linux, gcc toolchain


/** \brief Is defined when using the pylon for Linux API */
// #   define PYLON_LINUX_BUILD  // we are building for linux

// #   include <pylon/api_autoconf.h>
// #   include <stdint.h>

// gnu compiler needs explicit visibility of interfaces, so dynamic_cast works
// #   define PUBLIC_INTERFACE APIEXPORT

// define PYLON_XX_BUILD to distinguish between 32 & 64 bit builds
// #   if __WORDSIZE == 32
// #       define PYLON_32_BUILD
// #   elif __WORDSIZE == 64
// #       define PYLON_64_BUILD
// #   else
// #       error unsupported wordsize (32/64 platform)
// #   endif

// packing used for pylon structs/classes

// #else

// #   error Unsupported platform

// #endif

// check whether genicam headers (GCLinkage.h) has been included before this one.
// This leads to wrong DLL suffixes as we're currently using debug libs in debug builds
// #if defined(LINKAGE_H) && !defined(GENICAM_BUILD)
// genicam linkage included before including this platform.h
//#error You must include pylon/platform.h (or at least define GENICAM_BUILD) before including any genicam headers. Note: If you include pylon/pylonIncludes.h this will be done automatically.
// #endif


// #endif /* !defined(PYLON_PLATFORM_H) */


// Parsed from <pylon/stdinclude.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Hartmut Nebelung
//-----------------------------------------------------------------------------
/**
\file
\brief    standard definitions
*/
// #ifndef __STDINCLUDE_H__
// #define __STDINCLUDE_H__

// #include <assert.h>

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */


// #ifdef PYLON_WIN_BUILD
// #   include <objbase.h>     // for definition of type 'interface'
// #endif


///////////////////////////////////////////////////////////////////////////////
// Note:
///////////////////////////////////////////////////////////////////////////////
// The PY_ macros are only for backward compatibility
// please use the PYLON_ macros instead. Thank you!
///////////////////////////////////////////////////////////////////////////////

// mark a variable as unused. This prevents unused parameter / unused local variable warnings on warning level 4.
// #define PYLON_UNUSED(unused_var)    ((void)(unused_var))
// #define PY_UNUSED(unused_var)       PYLON_UNUSED(unused_var)

// returns the number of elements in an array
// #define PYLON_COUNTOF(arr)          (sizeof(arr)/sizeof(*arr))
// #define PY_COUNTOF(arr)             PYLON_COUNTOF(arr)

// PY_ASSERT works like normal assertion
// #define PYLON_ASSERT(cond)          assert(cond)
// #define PY_ASSERT(cond)             PYLON_ASSERT(cond)
// PY_ASSERT2 works like a normal assertion but can be passed a descriptive text string
// #define PYLON_ASSERT2(cond, tx)     assert(cond && tx)
// #define PY_ASSERT2(cond, tx)        PYLON_ASSERT2(cond, tx)

// verify macro
// #ifndef NDEBUG
// assert in debug builds but do not remove in release builds
// #   define PYLON_VERIFY(cond)       PYLON_ASSERT(cond)
// #   define PY_VERIFY(cond)          PYLON_ASSERT(cond)
// assert in debug builds but do not remove in release builds but can be passed a descriptive text string
// #   define PYLON_VERIFY2(cond, tx)  PYLON_ASSERT2(cond, tx)
// #   define PY_VERIFY2(cond, tx)     PYLON_ASSERT2(cond, tx)
// #else
// #   define PYLON_VERIFY(cond)       ((void)(cond))
// #   define PY_VERIFY(cond)          ((void)(cond))
// #   define PYLON_VERIFY2(cond, tx)  PYLON_VERIFY(cond)
// #   define PY_VERIFY2(cond, tx)     PYLON_VERIFY(cond)
// #endif

// #if defined(PYLON_WIN_BUILD)
// #   if defined(PYLON_32_BUILD)
// #       define PYLON_UNALIGNED
// #   elif defined(PYLON_64_BUILD)
// #       define PYLON_UNALIGNED __unaligned
// #   endif
// #elif defined(PYLON_LINUX_BUILD)
// #       define PYLON_UNALIGNED
// #else
// #   error Invalid platform
// #endif

// Attention in MSVC this is a string literal
// but under gnuc this is a local variable!
// #if defined(_MSC_VER) && _MSC_VER >= 1300
    // Attention this does not behave like a string literal! Use it as a variable of type const char[]
// #   define PYLON_FUNC  __FUNCTION__
// #elif defined(__GNUC__)
    // Attention this does not behave like a string literal! Use it as a variable of type const char[]
// #   define PYLON_FUNC  __func__
// #else
    // Attention this does not behave like a string literal! Use it as a variable of type const char[]
// #   define PYLON_FUNC  "sorry_funcname_na"
// #endif

//  use defines instead of static member vars to support when delay loading of genicam dlls
// #if !defined(GENAPI_DLL_MANAGER_INVALID_HANDLE)
// #endif

// #if !defined(GENAPI_DLL_MANAGER_INVALID_SYMBOL)
// #endif

// #include <Base/GCString.h>
// #include <Base/GCStringVector.h>
    /** Pylon's string definition */
    /** Pylon's string list definition */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif //__STDINCLUDE_H__


// Parsed from <pylon/PylonBase.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  AH
//-----------------------------------------------------------------------------
/**
\file
\brief  Function and classes for initializing the pylon runtime.
*/

// #ifndef __PYLONBASE_H__
// #define __PYLONBASE_H__

// #if _MSC_VER > 1000
// #pragma once
// #endif // _MSC_VER > 1000

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */


// #include <pylon/stdinclude.h>

// #ifdef PYLONBASE_EXPORTS
// #  define PYLONBASE_API APIEXPORT
// #else
// #  define PYLONBASE_API APIIMPORT
// #endif

// #if defined(PYLON_BASE_3_0_NO_DEPRECATE)
// #   define PYLON_BASE_3_0_DEPRECATED(message)
// #else
// #   define PYLON_BASE_3_0_DEPRECATED(message) PYLON_DEPRECATED(message)
// #endif
/**
  \brief Initializes the pylon runtime system.

  You must call PylonInitialize before calling any other pylon functions.
  When finished you must call PylonTerminate to free up all resources used by pylon.

  You can use the helperclass PylonAutoInitTerm to let the compiler call
  PylonInitialze and PylonTerminate.

  Just create a local object on the stack in your main function and
  the constructor and destructor will call the functions.
  See PylonAutoInitTerm for a sample.

  \if windows
  For MFC applications we recommend to call PylonInitialize and PylonTerminate in the
  application's InitInstance() and ExitInstance() methods.
  This prevents the MFC runtime from reporting a huge number of pretended memory leaks.
  \endif

  */
@Namespace("Pylon") public static native void PylonInitialize();

/**
    \brief Frees resources allocated by the pylon runtime system.

    Call this function before terminating the application. Don't use any pylon methods or pylon objects after
    having called PylonTerminate().

    */
@Namespace("Pylon") public static native void PylonTerminate(@Cast("bool") boolean ShutDownLogging/*=true*/);
@Namespace("Pylon") public static native void PylonTerminate();

/**
    \brief Returns the version number of pylon

    It is possible to pass a NULL pointer for a version number category if the value is not of interest.
    */ @Namespace("Pylon") public static native void GetPylonVersion( @Cast("unsigned int*") IntPointer major, @Cast("unsigned int*") IntPointer minor, @Cast("unsigned int*") IntPointer subminor, @Cast("unsigned int*") IntPointer build);
@Namespace("Pylon") public static native void GetPylonVersion( @Cast("unsigned int*") IntBuffer major, @Cast("unsigned int*") IntBuffer minor, @Cast("unsigned int*") IntBuffer subminor, @Cast("unsigned int*") IntBuffer build);
@Namespace("Pylon") public static native void GetPylonVersion( @Cast("unsigned int*") int[] major, @Cast("unsigned int*") int[] minor, @Cast("unsigned int*") int[] subminor, @Cast("unsigned int*") int[] build);

/**
    \brief Returns the version number of pylon as string.
    */ @Namespace("Pylon") public static native @Cast("const char*") BytePointer GetPylonVersionString();

/**
    \brief Helper class to automagically call PylonInitialize and PylonTerminate in constructor and destructor

    \code

    #include <pylon/TlFactory.h>

    // ...

    using namespace Pylon;

    int main(int argc, char* argv[])
    {

        PylonAutoInitTerm autoInitTerm;

        // Get the transport layer factory
        CTlFactory& TlFactory = CTlFactory::GetInstance();

        // Get all attached cameras and exit application if no camera is found
        DeviceInfoList_t devices;
        if ( 0 == TlFactory.EnumerateDevices( devices ) )
        {
            cerr << "No camera present!" << endl;
            return 1;
        }
        else
        {
            // do something with devices ...
            //...
        }


        return 0;

    }  // When leaving the main function, the destructor of the PylonAutoInitTerm object will be called
       // and it will in turn call PylonTerminate.
    \endcode
*/



// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* __PYLONBASE_H__ */


// Parsed from <pylon/PylonVersionInfo.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2009-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  JS
//-----------------------------------------------------------------------------
/**
\file
\brief  Contains the VersionInfo class, which is a utility for comparing version numbers.
*/

// #ifndef INCLUDED_PYLONVERSIONINFO_H_3453485
// #define INCLUDED_PYLONVERSIONINFO_H_3453485

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/PylonBase.h>

    /**
    \class  VersionInfo
    \brief  Holds a four-part version number consisting of major.minor.subminor.build
 
    This class stores a four-part version number and provides comparison operators.
    If you use the constructor with one parameter, the version info object will be
    initialized with pylon base version numbers.

    You can also call the static getVersionString() method to retrieve
    a string containing the complete version separated by dots.
    */
    @Namespace("Pylon") @NoOffset public static class VersionInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public VersionInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public VersionInfo(int size) { allocateArray(size); }
        private native void allocateArray(int size);
        @Override public VersionInfo position(int position) {
            return (VersionInfo)super.position(position);
        }
    
        /** Constructs a version info object using pylon base version numbers.
         *  If checkBuild is set to false, the build number will not be used in comparison operators. */
        public VersionInfo(@Cast("bool") boolean checkBuild/*=false*/) { allocate(checkBuild); }
        private native void allocate(@Cast("bool") boolean checkBuild/*=false*/);
        public VersionInfo() { allocate(); }
        private native void allocate();


        /** Constructs a version info object using the version number parts passed. */
        public VersionInfo(@Cast("unsigned int") int major,
                            @Cast("unsigned int") int minor,
                            @Cast("unsigned int") int subminor) { allocate(major, minor, subminor); }
        private native void allocate(@Cast("unsigned int") int major,
                            @Cast("unsigned int") int minor,
                            @Cast("unsigned int") int subminor);


        /** Constructs a version info object using the version number parts passed. */
        public VersionInfo(@Cast("unsigned int") int major,
                            @Cast("unsigned int") int minor,
                            @Cast("unsigned int") int subminor,
                            @Cast("unsigned int") int build) { allocate(major, minor, subminor, build); }
        private native void allocate(@Cast("unsigned int") int major,
                            @Cast("unsigned int") int minor,
                            @Cast("unsigned int") int subminor,
                            @Cast("unsigned int") int build);


        /** The VersionInfo destructor. */
        /** Returns the complete version number as a string. */
        public static native @Cast("const char*") BytePointer getVersionString();
    

        /** Returns the major version number.
         *  For version 2.1.3.1234 the value 2 would be returned. */
        public native @Cast("unsigned int") int getMajor();
    
    
        /** Returns the minor version number.
         *  For version 2.1.3.1234 the value 1 would be returned. */
        public native @Cast("unsigned int") int getMinor();
    
    
        /** Returns the subminor version number.
         *  For version 2.1.3.1234 the value 3 would be returned. */
        public native @Cast("unsigned int") int getSubminor();
    

        /** Returns the build number.
         *  For version 2.1.3.1234 the value 1234 would be returned. */
        public native @Cast("unsigned int") int getBuild();
        /** Compares two version info objects. */
        public native @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef VersionInfo rhs);


        /** Compares two version info objects. */
        public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef VersionInfo rhs);


        /** Compares two version info objects. */
        public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef VersionInfo rhs);


        /** Compares two version info objects. */
        public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef VersionInfo rhs);


        /** Compares two version info objects. */
        public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef VersionInfo rhs);


        /** compares two version info objects. */
        public native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef VersionInfo rhs);
    }


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_PYLONVERSIONINFO_H_3453485 */


// Parsed from <pylon/Info.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  AH
//-----------------------------------------------------------------------------
/**
\file
\brief Definition of the IProperties interface and the CInfoBase class
*/

// #ifndef __INFO_H__
// #define __INFO_H__

// #if _MSC_VER > 1000
// #pragma once
// #endif

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/stdinclude.h>
// #include <pylon/PylonBase.h>
    /**
        \interface IProperties
        \brief interface for a property container
    */
    @Namespace("Pylon") public static class IProperties extends Pointer {
        static { Loader.load(); }
        /** Empty constructor. */
        public IProperties() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IProperties(Pointer p) { super(p); }
    
        /** Retrieves a list of property names */
        public native int GetPropertyNames( @Cast("Pylon::StringList_t*") @ByRef gcstring_vector arg0 );
        /** Returns true if a property with the provided name is available */
        public native @Cast("bool") boolean GetPropertyAvailable( @Cast("const Pylon::String_t*") @ByRef gcstring Name);
        /** Retrieves a property value */
        public native @Cast("bool") boolean GetPropertyValue( @Cast("const Pylon::String_t*") @ByRef gcstring Name, @Cast("Pylon::String_t*") @ByRef gcstring Value );
        /** Modifies a property value */
        public native @ByRef IProperties SetPropertyValue( @Cast("const Pylon::String_t*") @ByRef gcstring Name, @Cast("const Pylon::String_t*") @ByRef gcstring Value);
        /** Returns true if all properties of the subset can be found and the values are equal
         *  The implementing container may use special knowledge on how to compare the values
         *  For instance for IP adresses, 192.2.3.45 == 192.2.3.0x2D */
        public native @Cast("bool") boolean IsSubset( @Const @ByRef IProperties Subset);

    }
        ///Identifies the human readable name of the device.
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer FriendlyNameKey();
        ///Identifies the full name identifying the device.
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer FullNameKey();
        ///Identifies the vendor name of the device.
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer VendorNameKey();
        ///Identifies the device class device, e.g. Basler1394.
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer DeviceClassKey();
    

    @Namespace("Pylon") @Opaque public static class CInfoImpl extends Pointer {
        /** Empty constructor. */
        public CInfoImpl() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CInfoImpl(Pointer p) { super(p); }
    }

    /**
    \brief Base implementation for PYLON info container.

    Info container allow a generic access to implemented properties. All
    Properties and their values can be accessed without knowing them in
    advance. It is possible to enumerate all properties available and corresponding
    values. Properties and values are represented as String_t. The normal usage
    is to have enumerators that create the info objects and clients that read only.

    If the type of the info object is known before client can use specific
    accessor function to retrieve the property values

    */
    @Namespace("Pylon") @NoOffset public static class CInfoBase extends IProperties {
        static { Loader.load(); }
        /** Empty constructor. */
        public CInfoBase() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CInfoBase(Pointer p) { super(p); }
    
        @MemberGetter public static native @Cast("const char*") BytePointer PropertyNotAvailable();

        public native @ByRef @Name("operator =") CInfoBase put(@Const @ByRef CInfoBase arg0);

        /** compare two info objects */
        public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef CInfoBase rhs);

        /* The underlying implementation does not need to support all the listed properties.
        The properties that are not supported always have the value "N/A" which is the value of CInfoBase::PropertyNotAvailable */

        ///Retrieves the human readable name of the device.
        ///This property is identified by Key::FriendlyNameKey.
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetFriendlyName();
        ///Sets the above property.
        public native @ByRef CInfoBase SetFriendlyName( @Cast("const Pylon::String_t*") @ByRef gcstring FriendlyNameValue);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsFriendlyNameAvailable();
        
        ///Retrieves the full name identifying the device.
        ///This property is identified by Key::FullNameKey.
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetFullName();
        ///Sets the above property.
        public native @ByRef CInfoBase SetFullName( @Cast("const Pylon::String_t*") @ByRef gcstring FullNameValue);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsFullNameAvailable();
        
        ///Retrieves the vendor name of the device.
        ///This property is identified by Key::VendorNameKey.
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetVendorName();
        ///Sets the above property.
        public native @ByRef CInfoBase SetVendorName( @Cast("const Pylon::String_t*") @ByRef gcstring VendorNameValue);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsVendorNameAvailable();
        
        ///Retrieves the device class device, e.g. Basler1394.
        ///This property is identified by Key::DeviceClassKey.
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetDeviceClass();
        ///Sets the above property.
        public native @ByRef CInfoBase SetDeviceClass( @Cast("const Pylon::String_t*") @ByRef gcstring DeviceClassValue);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsDeviceClassAvailable();
        public static native @Cast("const char*") BytePointer GetPropertyNotAvailable();
        public native int GetPropertyNames( @Cast("Pylon::StringList_t*") @ByRef gcstring_vector arg0 );
        public native @Cast("bool") boolean GetPropertyAvailable( @Cast("const Pylon::String_t*") @ByRef gcstring Name);
        /* Returns the value of the property if this property is supported by the underlying implementation or "N/A". */
        public native @Cast("bool") boolean GetPropertyValue( @Cast("const Pylon::String_t*") @ByRef gcstring Name, @Cast("Pylon::String_t*") @ByRef gcstring Value );
        public native @ByRef IProperties SetPropertyValue( @Cast("const Pylon::String_t*") @ByRef gcstring Name, @Cast("const Pylon::String_t*") @ByRef gcstring Value);
        public native @Cast("bool") boolean IsUserProvided();
        public native @Cast("bool") boolean IsSubset( @Const @ByRef IProperties Subset);
    }


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif


// Parsed from <pylon/TlInfo.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  AH
//-----------------------------------------------------------------------------
/**
\file
\brief Definition of Transport layer information object
*/

// #ifndef __TLINFO_H__
// #define __TLINFO_H__

// #if _MSC_VER > 1000
// #pragma once
// #endif

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/stdinclude.h>
// #include <pylon/Info.h>

    /**
        \ingroup Pylon_TransportLayer     
        \brief Class used for storing the result of the transport
               layer enumeration process.

    Enumerating the available Transport Layer objects returns a list of 
    CTlInfo objects (Pylon::TlInfoList_t). A CTlInfo object holds information
    about the enumerated transport layer.
    */
    @Namespace("Pylon") public static class CTlInfo extends CInfoBase {
        static { Loader.load(); }
        /** Default native constructor. */
        public CTlInfo() { allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CTlInfo(int size) { allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CTlInfo(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public CTlInfo position(int position) {
            return (CTlInfo)super.position(position);
        }
    
    }





// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* __TLINFO_H__ */


// Parsed from <pylon/DeviceClass.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2008-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Thomas Koeller
//-----------------------------------------------------------------------------
/**
\file 
\brief Device class definitions
*/

// #ifndef __DEVICE_CLASS_H__
// #define __DEVICE_CLASS_H__

// #if _MSC_VER > 1000
// #pragma once
// #endif //_MSC_VER > 1000

// #include <pylon/PylonBase.h>
    /** \addtogroup Pylon_TransportLayer
     * @{
     */
    /** This device class can be used to create the corresponding Transport Layer object or when creating Devices with the Transport Layer Factory. */
    @Namespace("Pylon") @MemberGetter public static native @Cast("const char*") BytePointer Basler1394DeviceClass();
    /** This device class can be used to create the corresponding Transport Layer object or when creating Devices with the Transport Layer Factory. */
    @Namespace("Pylon") @MemberGetter public static native @Cast("const char*") BytePointer BaslerGigEDeviceClass();
    @Namespace("Pylon") @MemberGetter public static native @Cast("const char*") BytePointer BaslerCamEmuDeviceClass();
    @Namespace("Pylon") @MemberGetter public static native @Cast("const char*") BytePointer BaslerIpCamDeviceClass();
    /** This device class can be used to create the corresponding Transport Layer object or when creating Devices with the Transport Layer Factory. */
    @Namespace("Pylon") @MemberGetter public static native @Cast("const char*") BytePointer BaslerCameraLinkDeviceClass();
    @Namespace("Pylon") @MemberGetter public static native @Cast("const char*") BytePointer BaslerGenTlDeviceClass();
    /** This device class can be used to create the corresponding Transport Layer object or when creating Devices with the Transport Layer Factory. */
    @Namespace("Pylon") @MemberGetter public static native @Cast("const char*") BytePointer BaslerUsbDeviceClass();
    @Namespace("Pylon") @MemberGetter public static native @Cast("const char*") BytePointer BaslerCLSerDeviceClass();
    @Namespace("Pylon") @MemberGetter public static native @Cast("const char*") BytePointer IpCamDeviceClass();
    /**
     * @}
     */

// #endif


// Parsed from <pylon/DeviceInfo.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Hartmut Nebelung, AH
//-----------------------------------------------------------------------------
/**
\file
\brief Definition of CDeviceInfo class 
*/

// #ifndef __DEVICEINFO_H__
// #define __DEVICEINFO_H__

// #if _MSC_VER > 1000
// #pragma once
// #endif

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/PylonBase.h>
// #include <pylon/stdinclude.h>
// #include <pylon/Info.h>

    ///This namespace contains keys for accessing the properties of pylon info objects
        ///Identifies the serial number if it supported by the underlying implementation
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer SerialNumberKey();
        ///Identifies the user-defined name if present.
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer UserDefinedNameKey();
        ///Identifies the model name of the device.
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer ModelNameKey();
        ///Identifies the version string of the device.
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer DeviceVersionKey();
        ///Identifies the identifier for the transport layer able to create this device.
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer DeviceFactoryKey();
        ///Identifies the source of the XML used to create the node map of this device.
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer XMLSourceKey();
    

    /** Holds information about an enumerated device.
    /**
        The device enumeration process creates a list of CDeviceInfo objects 
        (Pylon::DeviceInfoList_t). Each CDeviceInfo objects stores information
        about a device. The information is retrieved during the device enumeration process (ITransportLayer::EnumerateDevices resp. 
        CTlFactory::EnumerateDevices)

        \ingroup Pylon_TransportLayer
    */
    @Namespace("Pylon") public static class CDeviceInfo extends CInfoBase {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CDeviceInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CDeviceInfo(int size) { allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CDeviceInfo position(int position) {
            return (CDeviceInfo)super.position(position);
        }
    

        public CDeviceInfo() { allocate(); }
        private native void allocate();
        public CDeviceInfo( @Const @ByRef CDeviceInfo arg0 ) { allocate(arg0); }
        private native void allocate( @Const @ByRef CDeviceInfo arg0 );

        /* The underlying implementation does not need to support all the listed properties.
        The properties that are not supported always have the value "N/A" which is the value of CInfoBase::PropertyNotAvailable */

        ///Retrieves the serial number if it supported by the underlying implementation
        ///This property is identified by Key::SerialNumberKey.
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetSerialNumber();
        ///Sets the above property.
        public native @ByRef CDeviceInfo SetSerialNumber(@Cast("const Pylon::String_t*") @ByRef gcstring SerialNumberValue);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsSerialNumberAvailable();
        
        ///Retrieves the user-defined name if present.
        ///This property is identified by Key::UserDefinedNameKey.
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetUserDefinedName();
        ///Sets the above property.
        public native @ByRef CDeviceInfo SetUserDefinedName(@Cast("const Pylon::String_t*") @ByRef gcstring UserDefinedNameValue);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsUserDefinedNameAvailable();
        
        ///Retrieves the model name of the device.
        ///This property is identified by Key::ModelNameKey.
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetModelName();
        ///Sets the above property.
        public native @ByRef CDeviceInfo SetModelName(@Cast("const Pylon::String_t*") @ByRef gcstring ModelNameValue);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsModelNameAvailable();
        
        ///Retrieves the version string of the device.
        ///This property is identified by Key::DeviceVersionKey.
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetDeviceVersion();
        ///Sets the above property.
        public native @ByRef CDeviceInfo SetDeviceVersion(@Cast("const Pylon::String_t*") @ByRef gcstring DeviceVersionValue);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsDeviceVersionAvailable();
        
        ///Retrieves the identifier for the transport layer able to create this device.
        ///This property is identified by Key::DeviceFactoryKey.
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetDeviceFactory();
        ///Sets the above property.
        public native @ByRef CDeviceInfo SetDeviceFactory(@Cast("const Pylon::String_t*") @ByRef gcstring DeviceFactoryValue);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsDeviceFactoryAvailable();

        ///Retrieves the location where the XML file was loaded from.
        ///This property is identified by Key::XMLSourceKey.
        ///You must use the DeviceInfo of an opened IPylonDevice to retrieve this property.
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetXMLSource();
        ///Sets the above property.
        public native @ByRef CDeviceInfo SetXMLSource(@Cast("const Pylon::String_t*") @ByRef gcstring XMLSource);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsXMLSourceAvailable();

        ///Sets the display friendly name of the device.
        ///This property is identified by Key::FriendlyNameKey.
        ///This method overrides a method of a base class returning a reference to CDeviceInfo
        public native @ByRef CDeviceInfo SetFriendlyName(@Cast("const Pylon::String_t*") @ByRef gcstring FriendlyNameValue);

        ///Sets the full name identifying the device.
        ///This property is identified by Key::FullNameKey.
        ///This method overrides a method of a base class returning a reference to CDeviceInfo
        public native @ByRef CDeviceInfo SetFullName(@Cast("const Pylon::String_t*") @ByRef gcstring FullNameValue);

        ///Sets the vendor name of the device.
        ///This property is identified by Key::VendorNameKey.
        ///This method overrides a method of a base class returning a reference to CDeviceInfo
        public native @ByRef CDeviceInfo SetVendorName(@Cast("const Pylon::String_t*") @ByRef gcstring VendorNameValue);

        ///Sets the device class device, e.g. Basler1394.
        ///This property is identified by Key::DeviceClassKey.
        ///This method overrides a method of a base class returning a reference to CDeviceInfo
        public native @ByRef CDeviceInfo SetDeviceClass(@Cast("const Pylon::String_t*") @ByRef gcstring DeviceClassValue);

        /** Modifies a property value
        ///This method overrides a method of a base class returning a reference to CDeviceInfo */
        public native @ByRef CDeviceInfo SetPropertyValue(@Cast("const Pylon::String_t*") @ByRef gcstring Name, @Cast("const Pylon::String_t*") @ByRef gcstring Value);
    }


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif //__DEVICEINFO_H__


// Parsed from <pylon/InterfaceInfo.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  AH
//-----------------------------------------------------------------------------
/**
\file
\brief Declaration of the interface information class.
*/

// #ifndef __INTERFACE_INFO_H__
// #define __INTERFACE_INFO_H__

// #if _MSC_VER > 1000
// #pragma once
// #endif

// #include <pylon/stdinclude.h>
// #include <pylon/Info.h>

    /** 
    \ingroup PYLON_PUBLIC

    \brief Class used for storing information about an interface object provided by a transport layer.

    Enumerating the available Transport Layer Interface objects returns a list of 
    CInterface objects (Pylon::InterfaceInfoList_t). A CInterfaceInfo object holds information
    about the enumerated interface.
    */
    @Namespace("Pylon") public static class CInterfaceInfo extends CInfoBase {
        static { Loader.load(); }
        /** Default native constructor. */
        public CInterfaceInfo() { allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CInterfaceInfo(int size) { allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CInterfaceInfo(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public CInterfaceInfo position(int position) {
            return (CInterfaceInfo)super.position(position);
        }
    
    }





// #endif


// Parsed from <pylon/Container.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  AH
//-----------------------------------------------------------------------------
/**
\file
\brief Definition of the DeviceInfoList_t, TLInfoList_t, and InterfaceInfoList_t classes
*/

// #ifndef __CONTAINER_H__
// #define __CONTAINER_H__

// #if _MSC_VER > 1000
// #pragma once
// #endif // _MSC_VER > 1000

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/PylonBase.h>
// #include <pylon/DeviceInfo.h>
// #include <pylon/TlInfo.h>
// #include <pylon/InterfaceInfo.h>

    // ---------------------------------------------------------------------------
    ///
    /** \brief STL std::vector like container class. 
    /**
    //  Based on the GenICam::gcstring_vector class. 
    */
    // --------------------------------------------------------------------------- */
    @Name("Pylon::TList<Pylon::CDeviceInfo>") @NoOffset public static class TListCDeviceInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TListCDeviceInfo(Pointer p) { super(p); }
    

        // \brief Const iterator for the DeviceInfoList container.
        @NoOffset public static class const_iterator extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public const_iterator(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(int)}. */
            public const_iterator(int size) { allocateArray(size); }
            private native void allocateArray(int size);
            @Override public const_iterator position(int position) {
                return (const_iterator)super.position(position);
            }
        
            public const_iterator( CDeviceInfo pPtr/*=0*/ ) { allocate(pPtr); }
            private native void allocate( CDeviceInfo pPtr/*=0*/ );
            public const_iterator( ) { allocate(); }
            private native void allocate( );
            public native @Const @ByRef @Name("operator *") CDeviceInfo multiply( );
            public native @Const @Name("operator ->") CDeviceInfo access( );
            public native @ByRef @Name("operator ++") const_iterator increment( );
            public native @ByVal @Name("operator ++") const_iterator increment( int arg0 );
            public native @ByRef @Name("operator --") const_iterator decrement( );
            public native @ByVal @Name("operator --") const_iterator decrement( int arg0 );
            public native @ByRef @Name("operator +=") const_iterator addPut( @Cast("intptr_t") long iInc );
            public native @ByVal @Name("operator +") const_iterator add( @Cast("intptr_t") long iInc );
            public native @ByRef @Name("operator -=") const_iterator subtractPut( @Cast("intptr_t") long iDec );
            public native @Cast("intptr_t") @Name("operator -") long subtract( @Const @ByRef const_iterator iter );
            public native @ByVal @Name("operator -") const_iterator subtract( @Cast("intptr_t") long iDec );
            public native @Const @ByRef @Name("operator []") CDeviceInfo get( @Cast("intptr_t") long iIndex );
            public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator !=") boolean notEquals( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator <") boolean lessThan( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator >") boolean greaterThan( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator <=") boolean lessThanEquals( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals( @Const @ByRef const_iterator iter );
            
        }

        public static class iterator extends const_iterator {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public iterator(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(int)}. */
            public iterator(int size) { allocateArray(size); }
            private native void allocateArray(int size);
            @Override public iterator position(int position) {
                return (iterator)super.position(position);
            }
        
            // iterator traits
            // -------------------------------------------------------------------------
            public iterator( CDeviceInfo pPtr/*=0*/ ) { allocate(pPtr); }
            private native void allocate( CDeviceInfo pPtr/*=0*/ );
            public iterator( ) { allocate(); }
            private native void allocate( );
            public native @ByRef @Name("operator *") CDeviceInfo multiply( );
            public native @Name("operator ->") CDeviceInfo access( );
            public native @ByRef @Name("operator ++") iterator increment( );
            public native @ByVal @Name("operator ++") iterator increment( int arg0 );
            public native @ByRef @Name("operator --") iterator decrement( );
            public native @ByVal @Name("operator --") iterator decrement( int arg0 );
            public native @ByRef @Name("operator +=") iterator addPut( @Cast("intptr_t") long iInc );
            public native @ByVal @Name("operator +") iterator add( @Cast("intptr_t") long iInc );
            public native @ByRef @Name("operator -=") iterator subtractPut( @Cast("intptr_t") long iDec );
            public native @Cast("intptr_t") @Name("operator -") long subtract( @Const @ByRef iterator iter );
            public native @ByVal @Name("operator -") iterator subtract( @Cast("intptr_t") long iDec );
            public native @ByRef @Name("operator []") CDeviceInfo get( @Cast("intptr_t") long iIndex );
            
        }
        public TListCDeviceInfo( ) { allocate(); }
        private native void allocate( );
        public TListCDeviceInfo( @Cast("size_t") int uiSize) { allocate(uiSize); }
        private native void allocate( @Cast("size_t") int uiSize);
        public TListCDeviceInfo( @Const @ByRef TListCDeviceInfo obj) { allocate(obj); }
        private native void allocate( @Const @ByRef TListCDeviceInfo obj);
        public native void assign( @Cast("size_t") int n, @Const @ByRef CDeviceInfo val );
        public native void clear( );
        public native @ByVal iterator erase( @ByVal iterator pos );
        public native @ByRef CDeviceInfo at( @Cast("size_t") int uiIndex );
        public native @ByRef CDeviceInfo back( );
        public native @ByVal iterator begin( );
        public native @Cast("size_t") @Name("capacity") int _capacity( );
        public native @ByVal iterator end( );
        public native @ByRef CDeviceInfo front( );
        public native @Cast("size_t") int max_size( );
        public native @Cast("size_t") int size( );
        public native @ByVal iterator insert( @ByVal iterator pos,  @Const @ByRef CDeviceInfo val);
        public native @Cast("bool") boolean empty( );
        public native void pop_back( );
        public native void push_back( @Const @ByRef CDeviceInfo val );
        public native void resize( @Cast("size_t") int uiSize );
        public native void reserve( @Cast("size_t") int uiSize );

        // Do not use - only left in for backwards compatibility!
        public native void erase(@Cast("size_t") int uiIndex);
        public native void insert(@Cast("size_t") int uiIndex, @Const @ByRef CDeviceInfo val);
        public native @ByRef @Name("operator =") TListCDeviceInfo put( @Const @ByRef TListCDeviceInfo obj );
        public native @ByRef @Name("operator []") CDeviceInfo get( @Cast("size_t") int uiIndex );
        public native @Name("operator delete") void _delete( Pointer pWhere );
        public native @Name("operator new") Pointer _new( @Cast("size_t") int uiSize );
    }
    @Name("Pylon::TList<Pylon::CTlInfo>") @NoOffset public static class TListCTlInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TListCTlInfo(Pointer p) { super(p); }
    

        // \brief Const iterator for the DeviceInfoList container.
        @NoOffset public static class const_iterator extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public const_iterator(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(int)}. */
            public const_iterator(int size) { allocateArray(size); }
            private native void allocateArray(int size);
            @Override public const_iterator position(int position) {
                return (const_iterator)super.position(position);
            }
        
            public const_iterator( CTlInfo pPtr/*=0*/ ) { allocate(pPtr); }
            private native void allocate( CTlInfo pPtr/*=0*/ );
            public const_iterator( ) { allocate(); }
            private native void allocate( );
            public native @Const @ByRef @Name("operator *") CTlInfo multiply( );
            public native @Const @Name("operator ->") CTlInfo access( );
            public native @ByRef @Name("operator ++") const_iterator increment( );
            public native @ByVal @Name("operator ++") const_iterator increment( int arg0 );
            public native @ByRef @Name("operator --") const_iterator decrement( );
            public native @ByVal @Name("operator --") const_iterator decrement( int arg0 );
            public native @ByRef @Name("operator +=") const_iterator addPut( @Cast("intptr_t") long iInc );
            public native @ByVal @Name("operator +") const_iterator add( @Cast("intptr_t") long iInc );
            public native @ByRef @Name("operator -=") const_iterator subtractPut( @Cast("intptr_t") long iDec );
            public native @Cast("intptr_t") @Name("operator -") long subtract( @Const @ByRef const_iterator iter );
            public native @ByVal @Name("operator -") const_iterator subtract( @Cast("intptr_t") long iDec );
            public native @Const @ByRef @Name("operator []") CTlInfo get( @Cast("intptr_t") long iIndex );
            public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator !=") boolean notEquals( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator <") boolean lessThan( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator >") boolean greaterThan( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator <=") boolean lessThanEquals( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals( @Const @ByRef const_iterator iter );
            
        }

        public static class iterator extends const_iterator {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public iterator(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(int)}. */
            public iterator(int size) { allocateArray(size); }
            private native void allocateArray(int size);
            @Override public iterator position(int position) {
                return (iterator)super.position(position);
            }
        
            // iterator traits
            // -------------------------------------------------------------------------
            public iterator( CTlInfo pPtr/*=0*/ ) { allocate(pPtr); }
            private native void allocate( CTlInfo pPtr/*=0*/ );
            public iterator( ) { allocate(); }
            private native void allocate( );
            public native @ByRef @Name("operator *") CTlInfo multiply( );
            public native @Name("operator ->") CTlInfo access( );
            public native @ByRef @Name("operator ++") iterator increment( );
            public native @ByVal @Name("operator ++") iterator increment( int arg0 );
            public native @ByRef @Name("operator --") iterator decrement( );
            public native @ByVal @Name("operator --") iterator decrement( int arg0 );
            public native @ByRef @Name("operator +=") iterator addPut( @Cast("intptr_t") long iInc );
            public native @ByVal @Name("operator +") iterator add( @Cast("intptr_t") long iInc );
            public native @ByRef @Name("operator -=") iterator subtractPut( @Cast("intptr_t") long iDec );
            public native @Cast("intptr_t") @Name("operator -") long subtract( @Const @ByRef iterator iter );
            public native @ByVal @Name("operator -") iterator subtract( @Cast("intptr_t") long iDec );
            public native @ByRef @Name("operator []") CTlInfo get( @Cast("intptr_t") long iIndex );
            
        }
        public TListCTlInfo( ) { allocate(); }
        private native void allocate( );
        public TListCTlInfo( @Cast("size_t") int uiSize) { allocate(uiSize); }
        private native void allocate( @Cast("size_t") int uiSize);
        public TListCTlInfo( @Const @ByRef TListCTlInfo obj) { allocate(obj); }
        private native void allocate( @Const @ByRef TListCTlInfo obj);
        public native void assign( @Cast("size_t") int n, @Const @ByRef CTlInfo val );
        public native void clear( );
        public native @ByVal iterator erase( @ByVal iterator pos );
        public native @ByRef CTlInfo at( @Cast("size_t") int uiIndex );
        public native @ByRef CTlInfo back( );
        public native @ByVal iterator begin( );
        public native @Cast("size_t") @Name("capacity") int _capacity( );
        public native @ByVal iterator end( );
        public native @ByRef CTlInfo front( );
        public native @Cast("size_t") int max_size( );
        public native @Cast("size_t") int size( );
        public native @ByVal iterator insert( @ByVal iterator pos,  @Const @ByRef CTlInfo val);
        public native @Cast("bool") boolean empty( );
        public native void pop_back( );
        public native void push_back( @Const @ByRef CTlInfo val );
        public native void resize( @Cast("size_t") int uiSize );
        public native void reserve( @Cast("size_t") int uiSize );

        // Do not use - only left in for backwards compatibility!
        public native void erase(@Cast("size_t") int uiIndex);
        public native void insert(@Cast("size_t") int uiIndex, @Const @ByRef CTlInfo val);
        public native @ByRef @Name("operator =") TListCTlInfo put( @Const @ByRef TListCTlInfo obj );
        public native @ByRef @Name("operator []") CTlInfo get( @Cast("size_t") int uiIndex );
        public native @Name("operator delete") void _delete( Pointer pWhere );
        public native @Name("operator new") Pointer _new( @Cast("size_t") int uiSize );
    }
    @Name("Pylon::TList<Pylon::CInterfaceInfo>") @NoOffset public static class TListCInterfaceInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TListCInterfaceInfo(Pointer p) { super(p); }
    

        // \brief Const iterator for the DeviceInfoList container.
        @NoOffset public static class const_iterator extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public const_iterator(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(int)}. */
            public const_iterator(int size) { allocateArray(size); }
            private native void allocateArray(int size);
            @Override public const_iterator position(int position) {
                return (const_iterator)super.position(position);
            }
        
            public const_iterator( CInterfaceInfo pPtr/*=0*/ ) { allocate(pPtr); }
            private native void allocate( CInterfaceInfo pPtr/*=0*/ );
            public const_iterator( ) { allocate(); }
            private native void allocate( );
            public native @Const @ByRef @Name("operator *") CInterfaceInfo multiply( );
            public native @Const @Name("operator ->") CInterfaceInfo access( );
            public native @ByRef @Name("operator ++") const_iterator increment( );
            public native @ByVal @Name("operator ++") const_iterator increment( int arg0 );
            public native @ByRef @Name("operator --") const_iterator decrement( );
            public native @ByVal @Name("operator --") const_iterator decrement( int arg0 );
            public native @ByRef @Name("operator +=") const_iterator addPut( @Cast("intptr_t") long iInc );
            public native @ByVal @Name("operator +") const_iterator add( @Cast("intptr_t") long iInc );
            public native @ByRef @Name("operator -=") const_iterator subtractPut( @Cast("intptr_t") long iDec );
            public native @Cast("intptr_t") @Name("operator -") long subtract( @Const @ByRef const_iterator iter );
            public native @ByVal @Name("operator -") const_iterator subtract( @Cast("intptr_t") long iDec );
            public native @Const @ByRef @Name("operator []") CInterfaceInfo get( @Cast("intptr_t") long iIndex );
            public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator !=") boolean notEquals( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator <") boolean lessThan( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator >") boolean greaterThan( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator <=") boolean lessThanEquals( @Const @ByRef const_iterator iter );
            public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals( @Const @ByRef const_iterator iter );
            
        }

        public static class iterator extends const_iterator {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public iterator(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(int)}. */
            public iterator(int size) { allocateArray(size); }
            private native void allocateArray(int size);
            @Override public iterator position(int position) {
                return (iterator)super.position(position);
            }
        
            // iterator traits
            // -------------------------------------------------------------------------
            public iterator( CInterfaceInfo pPtr/*=0*/ ) { allocate(pPtr); }
            private native void allocate( CInterfaceInfo pPtr/*=0*/ );
            public iterator( ) { allocate(); }
            private native void allocate( );
            public native @ByRef @Name("operator *") CInterfaceInfo multiply( );
            public native @Name("operator ->") CInterfaceInfo access( );
            public native @ByRef @Name("operator ++") iterator increment( );
            public native @ByVal @Name("operator ++") iterator increment( int arg0 );
            public native @ByRef @Name("operator --") iterator decrement( );
            public native @ByVal @Name("operator --") iterator decrement( int arg0 );
            public native @ByRef @Name("operator +=") iterator addPut( @Cast("intptr_t") long iInc );
            public native @ByVal @Name("operator +") iterator add( @Cast("intptr_t") long iInc );
            public native @ByRef @Name("operator -=") iterator subtractPut( @Cast("intptr_t") long iDec );
            public native @Cast("intptr_t") @Name("operator -") long subtract( @Const @ByRef iterator iter );
            public native @ByVal @Name("operator -") iterator subtract( @Cast("intptr_t") long iDec );
            public native @ByRef @Name("operator []") CInterfaceInfo get( @Cast("intptr_t") long iIndex );
            
        }
        public TListCInterfaceInfo( ) { allocate(); }
        private native void allocate( );
        public TListCInterfaceInfo( @Cast("size_t") int uiSize) { allocate(uiSize); }
        private native void allocate( @Cast("size_t") int uiSize);
        public TListCInterfaceInfo( @Const @ByRef TListCInterfaceInfo obj) { allocate(obj); }
        private native void allocate( @Const @ByRef TListCInterfaceInfo obj);
        public native void assign( @Cast("size_t") int n, @Const @ByRef CInterfaceInfo val );
        public native void clear( );
        public native @ByVal iterator erase( @ByVal iterator pos );
        public native @ByRef CInterfaceInfo at( @Cast("size_t") int uiIndex );
        public native @ByRef CInterfaceInfo back( );
        public native @ByVal iterator begin( );
        public native @Cast("size_t") @Name("capacity") int _capacity( );
        public native @ByVal iterator end( );
        public native @ByRef CInterfaceInfo front( );
        public native @Cast("size_t") int max_size( );
        public native @Cast("size_t") int size( );
        public native @ByVal iterator insert( @ByVal iterator pos,  @Const @ByRef CInterfaceInfo val);
        public native @Cast("bool") boolean empty( );
        public native void pop_back( );
        public native void push_back( @Const @ByRef CInterfaceInfo val );
        public native void resize( @Cast("size_t") int uiSize );
        public native void reserve( @Cast("size_t") int uiSize );

        // Do not use - only left in for backwards compatibility!
        public native void erase(@Cast("size_t") int uiIndex);
        public native void insert(@Cast("size_t") int uiIndex, @Const @ByRef CInterfaceInfo val);
        public native @ByRef @Name("operator =") TListCInterfaceInfo put( @Const @ByRef TListCInterfaceInfo obj );
        public native @ByRef @Name("operator []") CInterfaceInfo get( @Cast("size_t") int uiIndex );
        public native @Name("operator delete") void _delete( Pointer pWhere );
        public native @Name("operator new") Pointer _new( @Cast("size_t") int uiSize );
    }


    // ---------------------------------------------------------------------------
    /** \brief Gets the sum of the given \a iInc and the given \a iter. 
    ///
     *  \param[in] iInc Increment from which the sum is calculated.
     *  \param[in] iter Iterator from which the sum is calculated.
     *  \return Sum of iterator. */
    // ---------------------------------------------------------------------------


// #ifndef PYLONBASE_EXPORT_TEMPLATE
// #endif

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //   DeviceInfoList
    //
    /////////////////////////////////////////////////////////////////////////////////////////

    ///
    /** \brief STL std::vector like container for Pylon::CDeviceInfo objects.
    /**
    // \ingroup Pylon_TransportLayer
    */
    // --------------------------------------------------------------------------- */
    @Namespace("Pylon") public static class DeviceInfoList extends TListCDeviceInfo {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public DeviceInfoList(Pointer p) { super(p); }
    
        public DeviceInfoList( ) { allocate(); }
        private native void allocate( );
        public DeviceInfoList( @Cast("size_t") int uiSize) { allocate(uiSize); }
        private native void allocate( @Cast("size_t") int uiSize);
        public DeviceInfoList( @Const @ByRef DeviceInfoList obj) { allocate(obj); }
        private native void allocate( @Const @ByRef DeviceInfoList obj);

    }

    /** \copybrief Pylon::DeviceInfoList
    /** \copydoc Pylon::DeviceInfoList */

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //   TlInfoList
    //
    /////////////////////////////////////////////////////////////////////////////////////////

    // ---------------------------------------------------------------------------
    /**
    // \brief STL std::vector like container for Pylon::CTlInfo objects.
    //
    // \ingroup Pylon_TransportLayer
    */
    // ---------------------------------------------------------------------------
    @Namespace("Pylon") public static class TlInfoList extends TListCTlInfo {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TlInfoList(Pointer p) { super(p); }
    
        public TlInfoList( ) { allocate(); }
        private native void allocate( );
        public TlInfoList( @Cast("size_t") int uiSize) { allocate(uiSize); }
        private native void allocate( @Cast("size_t") int uiSize);
        public TlInfoList( @Const @ByRef TlInfoList obj) { allocate(obj); }
        private native void allocate( @Const @ByRef TlInfoList obj);

    }

    /**
    \copybrief Pylon::TlInfoList
    \copydoc Pylon::TlInfoList
    */


    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //   InterfaceInfoList
    //
    /////////////////////////////////////////////////////////////////////////////////////////

    // ---------------------------------------------------------------------------
    /**
    // \brief STL std::vector like container for Pylon::CInterfaceInfo objects.
    //
    */
    // ---------------------------------------------------------------------------
    @Namespace("Pylon") public static class InterfaceInfoList extends TListCInterfaceInfo {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public InterfaceInfoList(Pointer p) { super(p); }
    
        public InterfaceInfoList( ) { allocate(); }
        private native void allocate( );
        public InterfaceInfoList( @Cast("size_t") int uiSize) { allocate(uiSize); }
        private native void allocate( @Cast("size_t") int uiSize);
        public InterfaceInfoList( @Const @ByRef InterfaceInfoList obj) { allocate(obj); }
        private native void allocate( @Const @ByRef InterfaceInfoList obj);

    }

    /**
    \copybrief Pylon::InterfaceInfoList
    \copydoc Pylon::InterfaceInfoList
    */



// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif //__CONTAINER_H__


// Parsed from <pylon/DeviceFactory.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  AH
//-----------------------------------------------------------------------------
/**
\file
\brief Definition of the IDeviceFactory interface
*/

// #ifndef __DEVICEFACTORY_H__
// #define __DEVICEFACTORY_H__

// #if _MSC_VER > 1000
// #pragma once
// #endif

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/stdinclude.h>
// #include <pylon/DeviceInfo.h>
// #include <pylon/Container.h>
// #include <pylon/DeviceAccessMode.h>
@Namespace("Pylon") @Opaque public static class IPylonDevice extends Pointer {
    /** Empty constructor. */
    public IPylonDevice() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPylonDevice(Pointer p) { super(p); }
}


// --------------------------------------------------------------------------
// enum EDeviceAccessiblityInfo
// --------------------------------------------------------------------------
/** Information about the accessibility of a device
/**
    \ingroup Pylon_TransportLayer
*/
/** enum Pylon::EDeviceAccessiblityInfo */
public static final int
      Accessibility_Unknown = 0, Accessibility_Ok = 1, Accessibility_Opened = 2, Accessibility_OpenedExclusively = 3, Accessibility_NotReachable = 4;    /** The device could not be reached or does not exist. No connection to the device is possible. */


/** 
\interface IDeviceFactory
\brief Interface to be implemented by device factories used to create devices.

Each transport layer object is a device factory. These device factories must implement
the IDeviceFactory interface.

\ingroup Pylon_TransportLayer
*/

@Namespace("Pylon") public static class IDeviceFactory extends Pointer {
    static { Loader.load(); }
    /** Empty constructor. */
    public IDeviceFactory() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IDeviceFactory(Pointer p) { super(p); }

    /** Retrieves a list of available devices.
    /**
    The list contains Pylon::CDeviceInfo objects used for the device creation.

    By default, the list passed in will be cleared before the device discovery is started. 

    \param list List to be filled with device info objects.
    \param addToList If true, the found devices will be added to the list instead of deleting the list.
    \return Number of devices found.
    */
    public native int EnumerateDevices( @Cast("Pylon::DeviceInfoList_t*") @ByRef DeviceInfoList list, @Cast("bool") boolean addToList/*=false*/ );
    public native int EnumerateDevices( @Cast("Pylon::DeviceInfoList_t*") @ByRef DeviceInfoList list );

    /** Retrieves a list of available devices filtered by given properties, usable for looking for specific devices.
    /**
    The list contains Pylon::CDeviceInfo objects used for the device creation.
    By default, the list passed in will be cleared before the device discovery is started. 
    The filter list can contain a list of device info objects containing properties a device must have, e.g.
    the user-provided name or the serial number. A device is returned, if it matches the properties of any of the
    device info objects in the filter list.
    When the device class property is set in the filter device info objects, the search is
    limited to the required transport layers.

    \param list List to be filled with device info objects.
    \param filter A list of device info objects with user-provided properties that a device can match.
    \param addToList If true, found devices will be added to the list instead of deleting the list.
    \return Number of devices found.
    */
    public native int EnumerateDevices( @Cast("Pylon::DeviceInfoList_t*") @ByRef DeviceInfoList list, @Cast("const Pylon::DeviceInfoList_t*") @ByRef DeviceInfoList filter, @Cast("bool") boolean addToList/*=false*/ );
    public native int EnumerateDevices( @Cast("Pylon::DeviceInfoList_t*") @ByRef DeviceInfoList list, @Cast("const Pylon::DeviceInfoList_t*") @ByRef DeviceInfoList filter );

    /** Creates a camera object from a device info object.
    /**
        This method accepts either a device info object from a device enumeration or a user-provided device info object.
        User-provided device info objects can be preset with properties required for a device, e.g.
        the user-provided name or the serial number. The implementation tries to find a matching camera by using device
        enumeration.
        When the device class property is set, the search is limited to the required transport layer.

        If the device creation fails, a GenApi::GenericException will be thrown.
        \param di Device info object containing all information needed to identify exactly one device.
    */
    public native IPylonDevice CreateDevice( @Const @ByRef CDeviceInfo di );

    /** If multiple devices match the provided properties, the first device found is created.
     *  The order in which the devices are found can vary from call to call. */
    public native IPylonDevice CreateFirstDevice( @Const @ByRef(nullValue = "Pylon::CDeviceInfo()") CDeviceInfo di/*=Pylon::CDeviceInfo()*/);
    public native IPylonDevice CreateFirstDevice();

    /** Creates a camera object from a device info object, injecting additional GenICam XML definition strings.
     *  Currently only one injected xml string is supported. */
    public native IPylonDevice CreateDevice( @Const @ByRef CDeviceInfo di, @Cast("const Pylon::StringList_t*") @ByRef gcstring_vector InjectedXmlStrings );

    /** Creates the first found camera device matching the provided properties, injecting additional GenICam XML definition strings.
     *  Currently only one injected xml string is supported. */
    public native IPylonDevice CreateFirstDevice( @Const @ByRef CDeviceInfo di, @Cast("const Pylon::StringList_t*") @ByRef gcstring_vector InjectedXmlStrings );

    /** This method is deprecated. Use CreateDevice receiving a CDeviceInfo object that contains the full name as property.
     *  Example: IPylonDevice* device = TlFactory.CreateDevice( CDeviceInfo().SetFullName( fullname));
     *  Creates a device by its unique name (i.e. fullname as returned by CDeviceInfo::GetFullName ). */
    public native IPylonDevice CreateDevice( @Cast("const Pylon::String_t*") @ByRef gcstring arg0 );

    /** Destroys a device.
    /** \note: Never try to delete a pointer to a camera device by calling free or delete. 
        Always use the DestroyDevice method.
    */
    public native void DestroyDevice( IPylonDevice arg0 );

    /**
    \brief This method can be used to check if a camera device can be created and opened.

    This method accepts either a device info object from a device enumeration or a user-provided device info object.
    User-provided device info objects can be preset with properties required for a device, e.g.
    the user-provided name or the serial number. The implementation tries to find a matching camera by using device
    enumeration.
    When the device class property is set, the search is limited to the required transport layer.

    \param[in]  deviceInfo         Properties of the camera device.
    \param[in]  mode               Used for defining how a device is accessed.
                                   The use of the mode information is transport layer-specific.
                                   For IIDC 1394 devices the mode information is ignored.
                                   For GigE devices the \c Exclusive and \c Control flags are used for defining how a device is accessed.
    \param[in]  pAccessibilityInfo Optionally provides more information about why a device is not accessible.
    \return True if device can be opened with provided access mode.

    \pre The \c deviceInfo object properties specify exactly one device.
         This is the case when the device info object has been obtained using device enumeration.

    \error
         Throws a C++ exception, if the preconditions are not met.
    */
    public native @Cast("bool") boolean IsDeviceAccessible( @Const @ByRef CDeviceInfo deviceInfo, @ByVal(nullValue = "Pylon::Control") @Cast("Pylon::AccessModeSet*") Pointer mode/*=Pylon::Control*/, @Cast("Pylon::EDeviceAccessiblityInfo*") IntPointer pAccessibilityInfo/*=NULL*/);
    public native @Cast("bool") boolean IsDeviceAccessible( @Const @ByRef CDeviceInfo deviceInfo);
    public native @Cast("bool") boolean IsDeviceAccessible( @Const @ByRef CDeviceInfo deviceInfo, @ByVal(nullValue = "Pylon::Control") @Cast("Pylon::AccessModeSet*") Pointer mode/*=Pylon::Control*/, @Cast("Pylon::EDeviceAccessiblityInfo*") IntBuffer pAccessibilityInfo/*=NULL*/);
    public native @Cast("bool") boolean IsDeviceAccessible( @Const @ByRef CDeviceInfo deviceInfo, @ByVal(nullValue = "Pylon::Control") @Cast("Pylon::AccessModeSet*") Pointer mode/*=Pylon::Control*/, @Cast("Pylon::EDeviceAccessiblityInfo*") int[] pAccessibilityInfo/*=NULL*/);
}







 // namespace PYLON

// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif


// Parsed from <pylon/TransportLayer.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  AH
//-----------------------------------------------------------------------------
/**
\file
\brief Definiton of Transportlayer interface and the common Transportlayer base class
*/

// #ifndef __TRANSPORTLAYER__
// #define __TRANSPORTLAYER__

// #if _MSC_VER>1000
// #pragma once
// #endif // _MSC_VER>1000

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/stdinclude.h>
// #include <pylon/PylonBase.h>
// #include <pylon/DeviceFactory.h>
// #include <pylon/TlInfo.h>
    @Namespace("GenApi") @Opaque public static class INodeMap extends Pointer {
        /** Empty constructor. */
        public INodeMap() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public INodeMap(Pointer p) { super(p); }
    }



    /**
    \ingroup Pylon_TransportLayer
    \interface ITransportLayer
    \brief The interface of Transport Layer objects

    Transport Layer objects are used for enumerating and creating devices accessible
    by a specific transport layer (like the Pylon1394 or the PylonGigE transport layer).
    */
    @Namespace("Pylon") public static class ITransportLayer extends IDeviceFactory {
        static { Loader.load(); }
        /** Empty constructor. */
        public ITransportLayer() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ITransportLayer(Pointer p) { super(p); }
    
        public native @ByVal CTlInfo GetTlInfo();

        /** \brief Creates and returns an 'empty' Device Info object appropriate
        for the transport layer.

        Device Info objects returned by the CreateDeviceInfo() method are used to create
        devices from device info objects that are not the result of a device enumeration process but are
        provided by the user. The user is responsible for
        filling in the fields of the Device Info object that are needed to identify and create a device.

        Example: To open a GigE device for which the IP address is known, the user lets the Transport Layer object
        create a Device Info object, specifies the IP address and passes the device info object to the
        CreateDevice() method.

        */
        public native @ByVal CDeviceInfo CreateDeviceInfo();

        /** \brief Returns the GenApi node map used for accessing parameters provided by the transport layer.

        \return NULL, if the transport layer doesn't provide parameters, a pointer to the parameter node map otherwise.
        */
        public native INodeMap GetNodeMap();

        /** \brief Retrieves a list of available interfaces.

        The concept of interfaces is not supported by all transport layers. 
        Depending on the transport layer, an interface may represent a frame grabber board, a network card, etc. 

        By default, the list passed in will be cleared.

        If the transport layer doesn't support the interface concept, EnumerateInterfaces() always returns 0. 

        \param list The list to be filled with interface info objects
        \param addToList If true, found devices will be added to the list instead of deleting the list
        \return Number of interfaces provided by the transport layer. 
        */
        public native int EnumerateInterfaces( @Cast("Pylon::InterfaceInfoList_t*") @ByRef InterfaceInfoList list, @Cast("bool") boolean addToList/*=false*/ );
        public native int EnumerateInterfaces( @Cast("Pylon::InterfaceInfoList_t*") @ByRef InterfaceInfoList list );


    }




// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* __TRANSPORTLAYER__ */


// Parsed from <pylon/TlFactory.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  AH
//-----------------------------------------------------------------------------
/**
\file
\brief Definition of CTlFactory class
*/

// #ifndef __TLFACTORY_H__
// #define __TLFACTORY_H__

// #if _MSC_VER>1000
// #pragma once
// #endif // _MSC_VER>1000

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/stdinclude.h>
// #include <pylon/PylonBase.h>
// #include <pylon/TlInfo.h>
// #include <pylon/TransportLayer.h>
// #include <pylon/DeviceFactory.h>

    @Namespace("Pylon") @Opaque public static class CSimpleMutex extends Pointer {
        /** Empty constructor. */
        public CSimpleMutex() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CSimpleMutex(Pointer p) { super(p); }
    }
    @Namespace("Pylon") @Opaque public static class TlMap extends Pointer {
        /** Empty constructor. */
        public TlMap() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TlMap(Pointer p) { super(p); }
    }
    @Namespace("Pylon") @Opaque public static class ImplicitTlRefs extends Pointer {
        /** Empty constructor. */
        public ImplicitTlRefs() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ImplicitTlRefs(Pointer p) { super(p); }
    }

    //------------------------------------------------------------------------
    // class CTlFactory
    //------------------------------------------------------------------------
    /**
        \ingroup Pylon_TransportLayer
        \brief the Transport Layer Factory

        Creates, Destroys and Enumerates transport layers as well as
        their devices.
    */
    @Namespace("Pylon") @NoOffset public static class CTlFactory extends IDeviceFactory {
        static { Loader.load(); }
        /** Empty constructor. */
        public CTlFactory() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CTlFactory(Pointer p) { super(p); }
    
        /** Retrieve the transport layer factory singleton */
        public static native @ByRef CTlFactory GetInstance();

        /** Retrieve a list of available transport layers */
        public native int EnumerateTls( @Cast("Pylon::TlInfoList_t*") @ByRef TlInfoList arg0 );

        /** Create a transport layer object from a TlInfo object */
        public native ITransportLayer CreateTl( @Const @ByRef CTlInfo arg0 );

        /** Create a transport layer object specified by the transport layer's device class identifier */
        public native ITransportLayer CreateTl( @Cast("const Pylon::String_t*") @ByRef gcstring DeviceClass );

        /** Destroys a transport layer object */
        public native void ReleaseTl( @Const ITransportLayer arg0 );

        /** returns a list of available devices, see IDeviceFactory for more information */
        public native int EnumerateDevices( @Cast("Pylon::DeviceInfoList_t*") @ByRef DeviceInfoList arg0, @Cast("bool") boolean addToList/*=false*/ );
        public native int EnumerateDevices( @Cast("Pylon::DeviceInfoList_t*") @ByRef DeviceInfoList arg0 );

        /** returns a list of available devices that match the filter, see IDeviceFactory for more information */
        public native int EnumerateDevices( @Cast("Pylon::DeviceInfoList_t*") @ByRef DeviceInfoList list, @Cast("const Pylon::DeviceInfoList_t*") @ByRef DeviceInfoList filter, @Cast("bool") boolean addToList/*=false*/ );
        public native int EnumerateDevices( @Cast("Pylon::DeviceInfoList_t*") @ByRef DeviceInfoList list, @Cast("const Pylon::DeviceInfoList_t*") @ByRef DeviceInfoList filter );

        /** creates a device from a device info object, see IDeviceFactory for more information */
        public native IPylonDevice CreateDevice( @Const @ByRef CDeviceInfo di );

        /** creates first found device from a device info object, see IDeviceFactory for more information */
        public native IPylonDevice CreateFirstDevice( @Const @ByRef(nullValue = "Pylon::CDeviceInfo()") CDeviceInfo di/*=Pylon::CDeviceInfo()*/);
        public native IPylonDevice CreateFirstDevice();

        /** creates a device from a device info object, injecting additional GenICam XML definition strings */
        public native IPylonDevice CreateDevice( @Const @ByRef CDeviceInfo di, @Cast("const Pylon::StringList_t*") @ByRef gcstring_vector InjectedXmlStrings );

        /** creates first found device from a device info object, injecting additional GenICam XML definition strings */
        public native IPylonDevice CreateFirstDevice( @Const @ByRef CDeviceInfo di, @Cast("const Pylon::StringList_t*") @ByRef gcstring_vector InjectedXmlStrings );

        /** This method is deprecated. Use CreateDevice receiving a CDeviceInfo object containing the full name as property.
         *  example: IPylonDevice* device = TlFactory.CreateDevice( CDeviceInfo().SetFullName( fullname));
         *  creates a device by its unique name (i.e. fullname) */
        public native IPylonDevice CreateDevice( @Cast("const Pylon::String_t*") @ByRef gcstring arg0 );

        /** destroys a device */
        public native void DestroyDevice( IPylonDevice arg0 );

        // implements IDeviceFactory::IsDeviceAccessible
        
    }



// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* __TLFACTORY_H__ */


// Parsed from <pylon/EventAdapter.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  HN
//-----------------------------------------------------------------------------
/**
\file
\brief Low Level API: Definition of the IEventAdapter interface
*/
// #ifndef __PYLON_EVENT_ADAPTER_H__
// #define __PYLON_EVENT_ADAPTER_H__

// #if _MSC_VER > 1000
// #pragma once
// #endif

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */


// #include <pylon/stdinclude.h>
    /**
        \interface IEventAdapter 
        \brief Low Level API: IEventAdapter delivers event messages to ports
        \ingroup Pylon_LowLevelApi
    */
    @Namespace("Pylon") public static class IEventAdapter extends Pointer {
        static { Loader.load(); }
        /** Empty constructor. */
        public IEventAdapter() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEventAdapter(Pointer p) { super(p); }
    
        /** Deliver message */
        public native void DeliverMessage( @Cast("const uint8_t*") BytePointer msg, @Cast("uint32_t") int numBytes );
        public native void DeliverMessage( @Cast("const uint8_t*") ByteBuffer msg, @Cast("uint32_t") int numBytes );
        public native void DeliverMessage( @Cast("const uint8_t*") byte[] msg, @Cast("uint32_t") int numBytes );
    }


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif //__PYLON_EVENT_ADAPTER_H__


// Parsed from <pylon/PixelType.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Hartmut Nebelung, Edgar Katzer, AG
//-----------------------------------------------------------------------------
/**
\file
\brief    Definition of types of helper functions concerning image format and pixel type.
\ingroup  PYLON_PUBLIC
*/

// #ifndef INCLUDED_PIXELTYPE_H_1534845
// #define INCLUDED_PIXELTYPE_H_1534845

// #if _MSC_VER > 1000
// #pragma once
// #endif

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */


// #include <pylon/PylonBase.h>
     /** \addtogroup Pylon_ImageHandlingSupport
     * @{
     */

    // Bitmask value of the monochrome type. Internal use only.
public static final int PIXEL_MONO =  0x01000000;
    // Bitmask value of the color pixel type. Internal use only.
public static final int PIXEL_COLOR = 0x02000000;
    // Sets the bit count of pixel type. Internal use only.
// #define PIXEL_BIT_COUNT(n) ((n) << 16)

    /**
    \brief Lists the available pixel types.

    These pixel types are returned by a grab result and are used by the Image Handling Support classes.
    
    The camera parameter interface classes define additional pixel format enumerations. These pixel format enumerations
    are different from the enumeration EPixelType pylon uses, e.g. the pylon pixel type PixelType_Mono1packed
    corresponds to PixelFormat_Mono1packed or PixelFormat_Mono1p. See
    the documentation of the parameter interface classes for more information.

    The camera User's Manual provides more information on pixel formats and the memory layout of the image data.
    */
    /** enum Pylon::EPixelType */
    public static final int
        /** Undefined pixel type. */
        PixelType_Undefined = -1,
        /** alias PixelFormat_Mono1Packed or PixelFormat_Mono1p */
        PixelType_Mono1packed        =  0x80000000 | PIXEL_MONO | ((1) << 16)  | 0x000c,
        /** alias PixelFormat_Mono2Packed or PixelFormat_Mono2p */
        PixelType_Mono2packed        =  0x80000000 | PIXEL_MONO | ((2) << 16)  | 0x000d,
        /** alias PixelFormat_Mono4Packed or PixelFormat_Mono4p */
        PixelType_Mono4packed        =  0x80000000 | PIXEL_MONO | ((4) << 16)  | 0x000e,

        /** alias PixelFormat_Mono8 */
        PixelType_Mono8              =  PIXEL_MONO | ((8) << 16)  | 0x0001,
        /** alias PixelFormat_Mono8signed or PixelFormat_Mono8s */
        PixelType_Mono8signed        =  PIXEL_MONO | ((8) << 16)  | 0x0002,
        /** alias PixelFormat_Mono10 */
        PixelType_Mono10             =  PIXEL_MONO | ((16) << 16) | 0x0003,
        /** alias PixelFormat_Mono10Packed. The memory layouts of PixelType_Mono10packed and PixelType_Mono10p are different. */
        PixelType_Mono10packed       =  PIXEL_MONO | ((12) << 16) | 0x0004,
        /** alias PixelFormat_Mono10p. The memory layouts of PixelType_Mono10packed and PixelType_Mono10p are different. */
        PixelType_Mono10p            =  PIXEL_MONO | ((10) << 16) | 0x0046,
        /** alias PixelFormat_Mono12 */
        PixelType_Mono12             =  PIXEL_MONO | ((16) << 16) | 0x0005,
        /** alias PixelFormat_Mono12Packed. The memory layouts of PixelType_Mono12packed and PixelType_Mono12p are different. */
        PixelType_Mono12packed       =  PIXEL_MONO | ((12) << 16) | 0x0006,
        /** alias PixelFormat_Mono12p. The memory layouts of PixelType_Mono12packed and PixelType_Mono12p are different. */
        PixelType_Mono12p            =  PIXEL_MONO | ((12) << 16) | 0x0047,
        /** alias PixelFormat_Mono16 */
        PixelType_Mono16             =  PIXEL_MONO | ((16) << 16) | 0x0007,

        /** alias PixelFormat_BayerGR8 */
        PixelType_BayerGR8           =  PIXEL_MONO | ((8) << 16)  | 0x0008,
        /** alias PixelFormat_BayerRG8 */
        PixelType_BayerRG8           =  PIXEL_MONO | ((8) << 16)  | 0x0009,
        /** alias PixelFormat_BayerGB8 */
        PixelType_BayerGB8           =  PIXEL_MONO | ((8) << 16)  | 0x000a,
        /** alias PixelFormat_BayerBG8 */
        PixelType_BayerBG8           =  PIXEL_MONO | ((8) << 16)  | 0x000b,

        /** alias PixelFormat_BayerGR10 */
        PixelType_BayerGR10          =  PIXEL_MONO | ((16) << 16) | 0x000c,
        /** alias PixelFormat_BayerRG10 */
        PixelType_BayerRG10          =  PIXEL_MONO | ((16) << 16) | 0x000d,
        /** alias PixelFormat_BayerGB10 */
        PixelType_BayerGB10          =  PIXEL_MONO | ((16) << 16) | 0x000e,
        /** alias PixelFormat_BayerBG10 */
        PixelType_BayerBG10          =  PIXEL_MONO | ((16) << 16) | 0x000f,

        /** alias PixelFormat_BayerGR12 */
        PixelType_BayerGR12          =  PIXEL_MONO | ((16) << 16) | 0x0010,
        /** alias PixelFormat_BayerRG12 */
        PixelType_BayerRG12          =  PIXEL_MONO | ((16) << 16) | 0x0011,
        /** alias PixelFormat_BayerGB12 */
        PixelType_BayerGB12          =  PIXEL_MONO | ((16) << 16) | 0x0012,
        /** alias PixelFormat_BayerBG12 */
        PixelType_BayerBG12          =  PIXEL_MONO | ((16) << 16) | 0x0013,

        /** alias PixelFormat_RGB8Packed or PixelFormat_RGB8 */
        PixelType_RGB8packed         =  PIXEL_COLOR | ((24) << 16) | 0x0014,
        /** alias PixelFormat_BGR8Packed or PixelFormat_BGR8 */
        PixelType_BGR8packed         =  PIXEL_COLOR | ((24) << 16) | 0x0015,

        /** alias PixelFormat_RGBA8Packed or PixelFormat_RGBa8 */
        PixelType_RGBA8packed        =  PIXEL_COLOR | ((32) << 16) | 0x0016,
        /** alias PixelFormat_BGRA8Packed or PixelFormat_BGRa8 */
        PixelType_BGRA8packed        =  PIXEL_COLOR | ((32) << 16) | 0x0017,

        /** alias PixelFormat_RGB10Packed or PixelFormat_RGB10 */
        PixelType_RGB10packed        =  PIXEL_COLOR | ((48) << 16) | 0x0018,
        /** alias PixelFormat_BGR10Packed or PixelFormat_BGR10 */
        PixelType_BGR10packed        =  PIXEL_COLOR | ((48) << 16) | 0x0019,

        /** alias PixelFormat_RGB12Packed or PixelFormat_RGB12 */
        PixelType_RGB12packed        =  PIXEL_COLOR | ((48) << 16) | 0x001a,
        /** alias PixelFormat_BGR12Packed or PixelFormat_BGR12 */
        PixelType_BGR12packed        =  PIXEL_COLOR | ((48) << 16) | 0x001b,

        /** alias PixelFormat_RGB16Packed or PixelFormat_RGB16 */
        PixelType_RGB16packed        =  PIXEL_COLOR | ((48) << 16) | 0x0033,

        /** alias PixelFormat_BGR10V1Packed */
        PixelType_BGR10V1packed      =  PIXEL_COLOR | ((32) << 16) | 0x001c,
        /** alias PixelFormat_BGR10V2Packed */
        PixelType_BGR10V2packed      =  PIXEL_COLOR | ((32) << 16) | 0x001d,

        /** alias PixelFormat_YUV411Packed or PixelFormat_YCbCr411_8 */
        PixelType_YUV411packed       =  PIXEL_COLOR | ((12) << 16) | 0x001e,
        /** alias PixelFormat_YUV422Packed */
        PixelType_YUV422packed       =  PIXEL_COLOR | ((16) << 16) | 0x001f,
        /** alias PixelFormat_YUV444Packed or PixelFormat_YCbCr8 */
        PixelType_YUV444packed       =  PIXEL_COLOR | ((24) << 16) | 0x0020,

        /** alias PixelFormat_RGB8Planar or PixelFormat_RGB8_Planar */
        PixelType_RGB8planar         =  PIXEL_COLOR | ((24) << 16) | 0x0021,
        /** alias PixelFormat_RGB10Planar or PixelFormat_RGB10_Planar */
        PixelType_RGB10planar        =  PIXEL_COLOR | ((48) << 16) | 0x0022,
        /** alias PixelFormat_RGB12Planar or PixelFormat_RGB12_Planar */
        PixelType_RGB12planar        =  PIXEL_COLOR | ((48) << 16) | 0x0023,
        /** alias PixelFormat_RGB16Planar or PixelFormat_RGB16_Planar */
        PixelType_RGB16planar        =  PIXEL_COLOR | ((48) << 16) | 0x0024,

        /** alias PixelFormat_YUV422_YUYV_Packed or PixelFormat_YCbCr422_8 */
        PixelType_YUV422_YUYV_Packed =  PIXEL_COLOR | ((16) << 16) | 0x0032,

        /** alias PixelFormat_BayerGR12Packed. The memory layouts of PixelType_BayerGR12Packed and PixelType_BayerGR12p are different. */
        PixelType_BayerGR12Packed    =  PIXEL_MONO | ((12) << 16) | 0x002A,
        /** alias PixelFormat_BayerRG12Packed. The memory layouts of PixelType_BayerRG12Packed and PixelType_BayerRG12p are different. */
        PixelType_BayerRG12Packed    =  PIXEL_MONO | ((12) << 16) | 0x002B,
        /** alias PixelFormat_BayerGB12Packed. The memory layouts of PixelType_BayerGB12Packed and PixelType_BayerGB12p are different. */
        PixelType_BayerGB12Packed    =  PIXEL_MONO | ((12) << 16) | 0x002C,
        /** alias PixelFormat_BayerBG12Packed. The memory layouts of PixelType_BayerBG12Packed and PixelType_BayerBG12p are different. */
        PixelType_BayerBG12Packed    =  PIXEL_MONO | ((12) << 16) | 0x002D,

        /** alias PixelFormat_BayerGR12p. The memory layouts of PixelType_BayerGR12Packed and PixelType_BayerGR12p are different. */
        PixelType_BayerGR12p         =  PIXEL_MONO | ((12) << 16) | 0x0057,
        /** alias PixelFormat_BayerRG12p. The memory layouts of PixelType_BayerRG12Packed and PixelType_BayerRG12p are different. */
        PixelType_BayerRG12p         =  PIXEL_MONO | ((12) << 16) | 0x0059,
        /** alias PixelFormat_BayerGB12p. The memory layouts of PixelType_BayerGB12Packed and PixelType_BayerGB12p are different. */
        PixelType_BayerGB12p         =  PIXEL_MONO | ((12) << 16) | 0x0055,
        /** alias PixelFormat_BayerBG12p. The memory layouts of PixelType_BayerBG12Packed and PixelType_BayerBG12p are different. */
        PixelType_BayerBG12p         =  PIXEL_MONO | ((12) << 16) | 0x0053,

        /** alias PixelFormat_BayerGR16 */
        PixelType_BayerGR16          =  PIXEL_MONO | ((16) << 16) | 0x002E,
        /** alias PixelFormat_BayerRG16 */
        PixelType_BayerRG16          =  PIXEL_MONO | ((16) << 16) | 0x002F,
        /** alias PixelFormat_BayerGB16 */
        PixelType_BayerGB16          =  PIXEL_MONO | ((16) << 16) | 0x0030,
        /** alias PixelFormat_BayerBG16 */
        PixelType_BayerBG16          =  PIXEL_MONO | ((16) << 16) | 0x0031,

        /** alias PixelFormat_RGB12V1Packed */
        PixelType_RGB12V1packed      =  PIXEL_COLOR | ((36) << 16) | 0X0034,

        /** alias PixelFormat_Double */
        PixelType_Double             =  0x80000000 | PIXEL_MONO | ((48) << 16) | 0x100;

    // pylon 2.x compatibility.

    /** Returns true if the pixel type is Mono and the pixel values are not byte aligned. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsMonoPacked(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns true if the pixel type is Bayer and the pixel values are not byte aligned. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsBayerPacked(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns true if the pixel type is RGB and the pixel values are not byte aligned. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsRGBPacked(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns true if the pixel type is BGR and the pixel values are not byte aligned. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsBGRPacked(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns true if the pixels of the given pixel type are not byte aligned. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsPacked(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns true if the pixel type is packed in lsb packed format.
     *  For lsb packed format, the data is filled lsb first in the lowest address byte (byte 0) starting with the first pixel
     *  and continued in the lsb of byte 1 (and so on).
     *  See the camera User's Manual or the Pixel Format Naming Convention (PFNC) of the Automated Imaging Association (AIA) for more information. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsPackedInLsbFormat(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns number of planes in the image composed of the pixel type. */
    @Namespace("Pylon") public static native @Cast("uint32_t") int PlaneCount(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns the pixel type of a plane. */
    @Namespace("Pylon") public static native @Cast("Pylon::EPixelType") int GetPlanePixelType(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns true if images of the pixel type are divided into multiple planes. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsPlanar(@Cast("Pylon::EPixelType") int pixelType);

    /** Lists the Bayer color filter types. */
    /** enum Pylon::EPixelColorFilter */
    public static final int
        /**red green */
        PCF_BayerRG = 0,
        /**green blue */
        PCF_BayerGB = 1,
        /**green red */
        PCF_BayerGR = 2,
        /**blue green */
        PCF_BayerBG = 3,
        /** undefined color filter or not applicable */
        PCF_Undefined = 4;

    // pylon 2.x compatibility.

    /** Returns the Bayer color filter type. */
    @Namespace("Pylon") public static native @Cast("Pylon::EPixelColorFilter") int GetPixelColorFilter(@Cast("Pylon::EPixelType") int pixelType);

    /**
    \brief Returns the bits needed to store a pixel.

    BitPerPixel(PixelType_Mono12) returns 16 and BitPerPixel(PixelType_Mono12packed)
    returns 12 for example.

    \param[in] pixelType The pixel type.
    \pre The pixel type must be defined.

    \error
        Throws an exception when the pixel type is undefined.
    */
    @Namespace("Pylon") public static native @Cast("uint32_t") int BitPerPixel(@Cast("Pylon::EPixelType") int pixelType);

    /**
    \brief Returns the number of measured values per pixel.

    SamplesPerPixel(PixelType_Mono8) returns 1 and SamplesPerPixel(PixelType_RGB8packed)
    returns 3 for example.

    \param[in] pixelType The pixel type.
    \pre The pixel type must be defined. The pixel type is not PixelType_YUV411packed.

    \error
        Throws an exception when the pixel type is undefined.
    */
    @Namespace("Pylon") public static native @Cast("uint32_t") int SamplesPerPixel(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns true when the pixel type represents a YUV format. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsYUV( @Cast("Pylon::EPixelType") int pixelType);

    /** Returns true when the pixel type represents an RGBA format. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsRGBA(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns true when the pixel type represents an RGB or RGBA format. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsRGB(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns true when the pixel type represents a BGRA format. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsBGRA(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns true when the pixel type represents a BGR or BGRA format. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsBGR(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns true when the pixel type represents a Bayer format. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsBayer(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns true when a given pixel is monochrome, e.g. PixelType_Mono8 or PixelType_BayerGR8. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsMono(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns true when an image using the given pixel type is monochrome, e.g. PixelType_Mono8. */
    @Namespace("Pylon") public static native @Cast("bool") boolean IsMonoImage(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns the minimum step size expressed in pixels for extracting an AOI. */
    @Namespace("Pylon") public static native @Cast("uint32_t") int GetPixelIncrementX(@Cast("Pylon::EPixelType") int pixelType);

    /** Returns the minimum step size expressed in pixels for extracting an AOI. */
    @Namespace("Pylon") public static native @Cast("uint32_t") int GetPixelIncrementY(@Cast("Pylon::EPixelType") int pixelType);

    /**
    \brief Returns the bit depth of a value of the pixel in bits.

    This may be less than the size needed to store the pixel.
    BitDepth(PixelType_Mono12) returns 12, BitDepth(PixelType_Mono12packed)
    returns 12, and  BitDepth(PixelType_RGB8packed) returns 8 for example.

    \param[in] pixelType The pixel type.

    \pre The pixel type must be valid.

    \error
        Throws an exception when the pixel type is undefined.
    */
    @Namespace("Pylon") public static native @Cast("uint32_t") int BitDepth( @Cast("Pylon::EPixelType") int pixelType );

    /**
    \brief Computes the stride in byte.

    The stride indicates the number of bytes between the beginning of one row 
    in an image and the beginning of the next row.
    For planar pixel types the returned value represents the stride of a plane.
    
    The stride in bytes cannot be computed for packed image format when the stride is not byte aligned and paddingX == 0.
    If paddingX is larger than zero and the stride without padding is not byte aligned then the rest of the partially
    filled byte is considered as padding, e.g. pixelType = PixelType_Mono12packed, width = 5, paddingX = 10 results
    in a stride of 18 Bytes (stride without padding is 5 * BitPerPixel( PixelType_Mono12packed) = 5 * 12 = 60 Bits = 7.5 Bytes).

    See also Pylon::IsPacked().

    \param[out] strideBytes  The stride in byte if it can be computed.
    \param[in] pixelType The pixel type.
    \param[in] width     The number of pixels in a row.
    \param[in] paddingX  The number of additional bytes at the end of a row (byte aligned).

    \return Returns true if the stride can be computed.

    \pre 
            The \c width value must be >= 0 and <= _I32_MAX.

    \error
        Throws an exception when the preconditions are not met.
    */
    @Namespace("Pylon") public static native @Cast("bool") boolean ComputeStride( @Cast("size_t*") @ByRef IntPointer strideBytes, @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("size_t") int paddingX/*=0*/);
    @Namespace("Pylon") public static native @Cast("bool") boolean ComputeStride( @Cast("size_t*") @ByRef IntPointer strideBytes, @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width);
    @Namespace("Pylon") public static native @Cast("bool") boolean ComputeStride( @Cast("size_t*") @ByRef IntBuffer strideBytes, @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("size_t") int paddingX/*=0*/);
    @Namespace("Pylon") public static native @Cast("bool") boolean ComputeStride( @Cast("size_t*") @ByRef IntBuffer strideBytes, @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width);
    @Namespace("Pylon") public static native @Cast("bool") boolean ComputeStride( @Cast("size_t*") @ByRef int[] strideBytes, @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("size_t") int paddingX/*=0*/);
    @Namespace("Pylon") public static native @Cast("bool") boolean ComputeStride( @Cast("size_t*") @ByRef int[] strideBytes, @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width);

    /**
    \brief Computes the padding value from row stride in byte.

    \param[out] strideBytes  The stride in byte.
    \param[in] pixelType The pixel type.
    \param[in] width     The number of pixels in a row.

    \return Returns the paddingX value for the given stride value (byte aligned).

    \pre 
        <ul>
        <li> The value of \c strideBytes must be large enough to contain a line described by \c pixelType and \c width.
        <li> The pixel type must be valid.
        <li> The \c width value must be >= 0 and <= _I32_MAX.
        </ul>

    \error
        Throws an exception when the preconditions are not met.
    */
    @Namespace("Pylon") public static native @Cast("size_t") int ComputePaddingX( @Cast("size_t") int strideBytes, @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width);

    /**
    \brief Computes the buffer size in byte.

    \param[in] pixelType The pixel type.
    \param[in] width     The number of pixels in a row.
    \param[in] height    The number of rows in an image.
    \param[in] paddingX  The number of extra data bytes at the end of each row (byte aligned). 
    \return The buffer size in byte.

    \pre 
        <ul>
        <li> The pixel type must be valid.
        <li> The \c width value must be >= 0 and <= _I32_MAX.
        <li> The \c height value must be >= 0 and <= _I32_MAX.
        </ul>

    \error
        Throws an exception when the preconditions are not met.
    */
    @Namespace("Pylon") public static native @Cast("size_t") int ComputeBufferSize( @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX/*=0*/);
    @Namespace("Pylon") public static native @Cast("size_t") int ComputeBufferSize( @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height);

    //-----------------------------------------------------------------------
    //  Deprecated functions: These functions will be removed in future releases.
    //-----------------------------------------------------------------------

    @Namespace("Pylon") public static native @Cast("bool") boolean IsValidRGB(@Cast("Pylon::EPixelType") int pixelType);


    @Namespace("Pylon") public static native @Cast("bool") boolean IsValidBGR(@Cast("Pylon::EPixelType") int pixelType);

    /** enum Pylon:: */
    public static final int
        PS_Undefined = -1;


    @Namespace("Pylon") public static native int PixelSize(@Cast("Pylon::EPixelType") int pixelType);

    /** 
     * @}
     */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_PIXELTYPE_H_1534845 */


// Parsed from <pylon/PayloadType.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2011-2014 Basler AG
//  http://www.baslerweb.com
//-----------------------------------------------------------------------------
/**
    \file
    \brief  Contains possible payload type values.
*/

// #ifndef INCLUDED_PAYLOADTYPE_H_835705
// #define INCLUDED_PAYLOADTYPE_H_835705

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */
    // -------------------------------------------------------------------------
    // enum EPayloadType
    // -------------------------------------------------------------------------
    /**
    \brief Possible payload type values
    \ingroup Pylon_InstantCameraApiGeneric
    */
    /** enum Pylon::EPayloadType */
    public static final int
        /** Undefined payload */
        PayloadType_Undefined = -1,
        /** The buffer contains image data. */
        PayloadType_Image = 0,
        /** The buffer contains raw data. */
        PayloadType_RawData = 1,
        /** The buffer contains file data. */
        PayloadType_File = 2,
        /** The buffer contains chunk data. */
        PayloadType_ChunkData = 3,
        /** The buffer contains device specific data. */
        PayloadType_DeviceSpecific =  0x8000;

    // pylon 2.x compatibility.


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_PAYLOADTYPE_H_835705 */


// Parsed from <pylon/Image.h>

//------------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//------------------------------------------------------------------------------
/**
    \file
    \brief  Contains an interface for an image.
*/

// #ifndef INCLUDED_IMAGE_H_9730799
// #define INCLUDED_IMAGE_H_9730799

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/PylonBase.h>
// #include <pylon/PixelType.h>
     /** \addtogroup Pylon_ImageHandlingSupport
     * @{
     */

    ///Defines the vertical orientation of an image in memory.
    /** enum Pylon::EImageOrientation */
    public static final int
        /**The first row of the image is located at the start of the image buffer. This is the default for images taken by a camera. */
        ImageOrientation_TopDown = 0,
        /**The last row of the image is located at the start of the image buffer. */
        ImageOrientation_BottomUp = 1;

    /**
    \interface  IImage
    \brief  Usable to access image properties and image buffer.
    */
    @Namespace("Pylon") public static class IImage extends Pointer {
        static { Loader.load(); }
        /** Empty constructor. */
        public IImage() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IImage(Pointer p) { super(p); }
    
        /** Ensure proper destruction by using a virtual destructor. */
        // Do not add implemenation here in class as older compilers doesn't accept in-class definitions (see definition below)

        //
        /**
        \brief Can be used to check whether an image is valid.

        \return Returns false if the image is invalid.

        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean IsValid();


        /**
        \brief Get the current pixel type.

        \return Returns the pixel type or PixelType_Undefined if the image is invalid.

        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("Pylon::EPixelType") int GetPixelType();


        /**
        \brief Get the current number of columns in pixels.

        \return Returns the current number of columns in pixels or 0 if the image is invalid.

        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("uint32_t") int GetWidth();


        /**
        \brief Get the current number of rows.

        \return Returns the current number of rows or 0 if the image is invalid.

        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("uint32_t") int GetHeight();


        /**
        \brief Get the number of extra data bytes at the end of each row.

        \return Returns the number of extra data bytes at the end of each row or 0 if the image is invalid.

        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("size_t") int GetPaddingX();


        /**
        \brief Get the vertical orientation of the image in memory.

        \return Returns the orientation of the image or ImageOrientation_TopDown if the image is invalid.

        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("Pylon::EImageOrientation") int GetOrientation();


        /**
        \brief Get the pointer to the buffer.

        \return Returns the pointer to the used buffer or NULL if the image is invalid.

        \error
            Does not throw C++ exceptions.
        */
        public native Pointer GetBuffer();


        /**
        \brief Get the pointer to the buffer containing the image.

        The buffer is at least as large as the value returned by GetImageSize().

        \return Returns the pointer to the used buffer or NULL if the image is invalid.

        \error
            Does not throw C++ exceptions.
        */


        /**
        \brief Get the size of the image in bytes.

        \return Returns the size of the image in bytes or 0 if the image is invalid.

        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("size_t") int GetImageSize();


        /**
        \brief Indicates that the referenced buffer is only referenced by this image.

        \return Returns true if the referenced buffer is only referenced by this image. Returns false if the image is invalid.

        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean IsUnique();


        /**
        \brief Get the stride in bytes.

        The stride in bytes can not be computed for packed image format when the stride is not byte aligned. See also Pylon::IsPacked().
        The stride in bytes can not be computed if the image is invalid.

        \param[out] strideBytes  The stride in byte if it can be computed.
        \return Returns true if the stride can be computed.

        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean GetStride( @Cast("size_t*") @ByRef IntPointer strideBytes);
        public native @Cast("bool") boolean GetStride( @Cast("size_t*") @ByRef IntBuffer strideBytes);
        public native @Cast("bool") boolean GetStride( @Cast("size_t*") @ByRef int[] strideBytes);
    }

    /**
     * @}
     */

    // Implementation required for Windows only.
    // Note: the C++ standard >= 11 prohibit pure virtual destructors with a function body
    // in the declaration. Consequently gcc 4.0 and newer reject an inline implementation
    // in the class.
        


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_IMAGE_H_9730799 */


// Parsed from <pylon/GrabResultData.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Contains a class that makes the data for one grabbed buffer available.
*/

// #ifndef INCLUDED_GRABRESULTDATA_H_1758952
// #define INCLUDED_GRABRESULTDATA_H_1758952

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/PylonBase.h>
// #include <pylon/PixelType.h>
// #include <pylon/PayloadType.h>

    /** \addtogroup Pylon_InstantCameraApiGeneric
     * @{
     */

    /**
    \class  CGrabResultData
    \brief  Makes the data for one grabbed buffer available.
    */
    @Namespace("Pylon") @NoOffset public static class CGrabResultData extends Pointer {
        static { Loader.load(); }
        /** Empty constructor. */
        public CGrabResultData() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CGrabResultData(Pointer p) { super(p); }
    
        /** Returns true if an image has been grabbed successfully and false in the case of an error. */
        public native @Cast("bool") boolean GrabSucceeded();


        /** This method returns a description of the error if GrabSucceeded() returns false due to an error. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetErrorDescription();


        /** This method returns the error code if GrabSucceeded() returns false due to an error. */
        public native @Cast("uint32_t") int GetErrorCode();


        /** Get the current payload type. */
        public native @Cast("Pylon::EPayloadType") int GetPayloadType();


        /** Get the current pixel type. */
        public native @Cast("Pylon::EPixelType") int GetPixelType();


        /** Get the current number of columns. */
        public native @Cast("uint32_t") int GetWidth();


        /** Get the current number of rows expressed as number of pixels. */
        public native @Cast("uint32_t") int GetHeight();


        /** Get the current starting column. */
        public native @Cast("uint32_t") int GetOffsetX();


        /** Get the current starting row. */
        public native @Cast("uint32_t") int GetOffsetY();


        /** Get the number of extra data at the end of each row in bytes. */
        public native @Cast("uint32_t") int GetPaddingX();


        /** Get the number of extra data at the end of the image data in bytes. */
        public native @Cast("uint32_t") int GetPaddingY();


        /** Get the pointer to the buffer.
        /**
        If the chunk data feature is activated for the device, chunk data is appended to the image data.
        When writing past the image section while performing image processing, the chunk data will be corrupted.
        */
        public native Pointer GetBuffer();


        /** Get the current payload size in bytes. */
        public native @Cast("size_t") int GetPayloadSize();


        /** Deprecated: GetBlockID() should be used instead. Get the index of the grabbed frame (camera device specific). */
        public native @Cast("uint32_t") int GetFrameNumber();

        /** Get the block ID of the grabbed frame (camera device specific).
        /**
        \par IEEE 1394 Camera Devices
        The value of Block ID is always UINT64_MAX.

        \par GigE Camera Devices
        The sequence number starts with 1 and  
        wraps at 65535. The value 0 has a special meaning and indicates
        that this feature is not supported by the camera.

        \par USB Camera Devices
        The sequence number starts with 0 and uses the full 64 Bit range.

        \attention A block ID with the value UINT64_MAX indicates that the block ID is invalid and must not be used.
        */
        public native @Cast("uint64_t") int GetBlockID();

        /** Get the camera specific tick count (camera device specific).
        /**
        This describes when the image exposure was started.
        Cameras that do not support this feature return zero. If supported, this
        can be used to determine which image AOIs were acquired simultaneously.
        */
        public native @Cast("uint64_t") int GetTimeStamp();


        /** Get the stride in byte. */
        /*
            Uses Pylon::ComputeStride to compute the stride from the result data.

        \return The stride in byte.

        \pre The preconditions of Pylon::ComputeStride must be met.

        \error
            Throws an exception if the stride value cannot be computed from the result data.
        */
        public native @Cast("bool") boolean GetStride( @Cast("size_t*") @ByRef IntPointer strideBytes);
        public native @Cast("bool") boolean GetStride( @Cast("size_t*") @ByRef IntBuffer strideBytes);
        public native @Cast("bool") boolean GetStride( @Cast("size_t*") @ByRef int[] strideBytes);


        /** Get the size of the image in byte. */
        /*
            Uses Pylon::ComputeBufferSize to compute the stride from the result data.
            PaddingY is not taken into account.

        \return The buffer size in byte.

        \pre The preconditions of Pylon::ComputeBufferSize must be met.

        \error
            Throws an exception if the buffer size cannot be computed from the result data.
        */
        public native @Cast("size_t") int GetImageSize();


        /** Get the context value assigned to the camera object. The context is attached to the result when it is retrieved. */
        public native @Cast("intptr_t") long GetCameraContext();


        /** Get the ID of the grabbed image.
        /** Always returns a number larger than 0. The counting starts with 1 and is never reset during the lifetime of the Instant Camera object. */
        public native @Cast("int64_t") long GetID();


        /** Get the number of the image. This number is incremented when an image is retrieved using CInstantCamera::RetrieveResult().
        /** Always returns a number larger than 0. The counting starts with 1 and is reset with every call to CInstantCamera::StartGrabbing(). */
        public native @Cast("int64_t") long GetImageNumber();


        /** Get the number of skipped images before this image.
        /**
        This value can be larger than 0 if EGrabStrategy_LatestImageOnly grab strategy or GrabStrategy_LatestImages grab strategy is used.
        Always returns a number larger than or equal 0. This number does not include the number of images lost in case of a buffer underrun in the driver.
        */
        public native @Cast("int64_t") long GetNumberOfSkippedImages();


        /** Returns true if chunk data is available.
        /**
        This is the case if the chunk mode is enabled for the camera device.
        The parameter CInstantCamera::ChunkNodeMapsEnable of the used Instant Camera object is set to true (default setting).
        Chunk data node maps are supported by the Transport Layer of the camera device.
        */
        public native @Cast("bool") boolean IsChunkDataAvailable();


        /** Get the reference to the chunk data node map connected to the result.
        /** An empty node map is returned when the device does not support this feature or when chunks are disabled. */
        public native @ByRef INodeMap GetChunkDataNodeMap();


        /** Checks if buffer has a CRC attached. This needs not be activated for the device. See the PayloadCRC16 chunk. */
        /* The chunk feature must be supported and activated, otherwise false is returned. */
        public native @Cast("bool") boolean HasCRC();


        /** Checks CRC sum of buffer, returns true if CRC sum is OK. */
        /*
        \error
            Throws an exception if GetHasCRC() is false and chunks are activated.
        */
        public native @Cast("bool") boolean CheckCRC();

        /** Get the context value assigned to the buffer. The context is set when CInstamtCamera is using a custom buffer factory. */
        public native @Cast("intptr_t") long GetBufferContext();

        /** Internal use only. */
        @Opaque public static class CGrabResultDataImpl extends Pointer {
            /** Empty constructor. */
            public CGrabResultDataImpl() { }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public CGrabResultDataImpl(Pointer p) { super(p); }
        }
        public native CGrabResultDataImpl GetGrabResultDataImpl();
    }

    /**
     * @}
     */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_GRABRESULTDATA_H_1758952 */


// Parsed from <pylon/GrabResultPtr.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Contains a smart pointer that holds a reference to grab result data.
*/

// #ifndef INCLUDED_GRABRESULTPTR_H_4356898
// #define INCLUDED_GRABRESULTPTR_H_4356898

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/PylonBase.h>
// #include <pylon/GrabResultData.h>
// #include <pylon/Image.h>
        @Namespace("Pylon::PylonPrivate") @Opaque public static class CGrabResultDataConverter extends Pointer {
            /** Empty constructor. */
            public CGrabResultDataConverter() { }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public CGrabResultDataConverter(Pointer p) { super(p); }
        }
    

    /** \addtogroup Pylon_InstantCameraApiGeneric
     * @{
     */

    /**
    \class  CGrabResultPtr
    \brief  A smart pointer holding a reference to grab result data.

    This class is used for distributing the grab result data of a camera. It controls
    the reuse and lifetime of the referenced buffer. When all smart pointers referencing
    a buffer go out of scope the referenced buffer is reused or destroyed.
    The data and the held buffer are still valid after the camera object it originated from
    has been destroyed.
    \attention The grabbing will stop with an input queue underrun, when the grab results are 
    never released, e.g. when put into a container.

    The CGrabResultPtr class provides a cast operator that allows passing the grab result directly to functions or methods
    that take an const IImage& as parameter, e.g. image saving functions or image format converter methods.

    \attention The returned reference to IImage is only valid as long the CGrabResultPtr object it came from is not destroyed.

    \threading Instances of CGrabResultPtr referencing the same grab result can be used from any thread context.
    */
    @Namespace("Pylon") @NoOffset public static class CGrabResultPtr extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CGrabResultPtr(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CGrabResultPtr(int size) { allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CGrabResultPtr position(int position) {
            return (CGrabResultPtr)super.position(position);
        }
    
        /**
        \brief Creates a smart pointer.
        \post No grab result is referenced.
        */
        public CGrabResultPtr() { allocate(); }
        private native void allocate();


        /**
        \brief Creates a copy of a smart pointer.

        \param[in] rhs Another smart pointer, source of the result data to reference.

        The data itself is not copied. 

        \post 
        <ul>
        <li>Another reference to the grab result of the source is held if it references a grab result.
        <li>No grab result is referenced if the source does not reference a grab result.
        </ul>

        \error 
            Still valid after error.
        */
        public CGrabResultPtr( @Const @ByRef CGrabResultPtr rhs) { allocate(rhs); }
        private native void allocate( @Const @ByRef CGrabResultPtr rhs);


        /**
        \brief Assignment of a smart pointer.

        \param[in] rhs Another smart pointer, source of the result data to reference.

        The data itself is not copied. 

        \post 
        <ul>
        <li>The currently referenced data is released.
        <li>Another reference to the grab result of the source is held if it references a grab result.
        <li>No grab result is referenced if the source does not reference a grab result.
        </ul>

        \error 
            Still valid after error.
        */
        public native @ByRef @Name("operator =") CGrabResultPtr put( @Const @ByRef CGrabResultPtr rhs);


        /**
        \brief Destroys the smart pointer.

        \post The currently referenced data is released.

        \error 
            Does not throw C++ exceptions.
        */


        /**
        \brief Allows accessing the referenced data.

        \return The pointer to the grab result data.

        \pre The pointer must reference a grab result.
        IsValid() or the overloaded bool operator can be used to check whether data is referenced.

        \error
            Still valid after error. Throws an exception when no data is referenced.
        */
        public native @Name("operator ->") CGrabResultData access();


        /**
        \brief Check whether data is referenced.

        \return True if data is referenced.

        \error 
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean IsValid();


        /**
        \brief Check whether data is referenced.

        \return IsValid().

        The overloaded bool operator can be used to check whether data is referenced.
        Example:
        \code
        if ( grabResult)
        {
            grabResult->GetStatus();
        }
        \endcode

        \error
            Does not throw C++ exceptions.
        */
        public native @Name("operator bool") boolean asBoolean();

 
        /**
        \brief The currently referenced data is released.

        \post The currently referenced data is released.

        \error
            Still valid after error.
        */
        public native void Release();

        
        /**
        \brief Provides an IImage interface to the grab result.

        This cast operator allows passing the grab result to saving functions or image format converter.
        The returned image is invalid if the grab was not successful, see CGrabResultData::GrabSucceeded().

        \attention The returned reference is only valid as long the grab result ptr is not destroyed.

        \error
            Still valid after error.
        */
        public native @ByRef @Name("operator Pylon::IImage&") IImage asIImage();


        /**
        \brief Indicates that the held grab result data and buffer is only referenced by this grab result.
        
        \return Returns true if the held grab result data and buffer is only referenced by this grab result. Returns false if the grab result is invalid.

        \error
            Does not throw C++ exceptions.
        */        
        public native @Cast("bool") boolean IsUnique();
    

        /** Internal use only. */
        @Opaque public static class CGrabResultPtrImpl extends Pointer {
            /** Empty constructor. */
            public CGrabResultPtrImpl() { }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public CGrabResultPtrImpl(Pointer p) { super(p); }
        }
        public native @ByRef @Name("operator =") CGrabResultPtr put( @Const @ByRef CGrabResultPtrImpl rhs);
    }

    /** 
     * @}
     */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_GRABRESULTPTR_H_4356898 */


// Parsed from <pylon/WaitObject.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Urs Helmig
//-----------------------------------------------------------------------------
/**
\file
\brief    Declaration of WaitObject classes
*/
// #ifndef __WAITOBJECT_H__
// #define __WAITOBJECT_H__

// #if _MSC_VER > 1000
// #pragma once
// #endif // _MSC_VER > 1000

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */


// #include <pylon/stdinclude.h>
// #include <pylon/PylonBase.h>


// #if defined (PYLON_LINUX_BUILD)
// #endif
    // -------------------------------------------------------------------------
    // enum EWaitExResult
    // ----------------------------------------------------------------------
    /**
    \brief The return value of the Pylon::WaitObject::WaitEx() and Pylon::WaitObjectEx::WaitEx() methods
    \ingroup PYLON_PUBLIC
    */
    // ----------------------------------------------------------------------
    /** enum Pylon::EWaitExResult */
    public static final int
        /** The time-out interval elapsed */
        waitex_timeout       = 0,
        /** The wait operation completed successfully */
        waitex_signaled      = 1,
        /** Windows only (see MSDN for more information) */
        waitex_abandoned     = 2,
        /** The wait was interrupted (Windows: queued APC or I/O completion routine; UNIX: signal) */
        waitex_alerted       = -1;

    // pylon 2.x compatibility.



// #if defined (PYLON_LINUX_BUILD)
// #endif

    // ----------------------------------------------------------------------
    @Namespace("Pylon") @MemberGetter public static native @Cast("const unsigned int") int waitForever();

// #if defined (PYLON_LINUX_BUILD)
// #endif

    // ----------------------------------------------------------------------
    /**
    \brief A platform independent wait object.

    Wait objects are used by the Pylon::IStreamGrabber and Pylon::IEventGrabber interfaces to provide a platform independent mechanism for
    allowing an application to wait for data buffers to be filled.

    For the Windows version of %pylon, WaitObjects are wrappers for Win32 objects that can be used with \c WaitForSingleObject() and \c WaitForMultipleObjects().

    For the Linux version of %pylon, WaitObjects are implemented based on file descriptors. The wait operation is implemented using the \c select()  function.

    Although the class provides a default constructor, the default constructor doesn't create a "usable" wait objects  wrapping a handle resp. file descriptor.
    Valid instances of Pylon::WaitObject cannot be created by the application, instead the pylon libraries return fully created wait objects.
    The Pylon::WaitObjectEx class can be used to create wait objects that can be controlled by the application.

    The Pylon::WaitObject class provides access to the wrapped handle resp. file descriptor. This allows to use  to allow use pylon wait objects as input for
    "native" APIs like \c WaitForMultipleObjects() (Windows),  and \c select() (Linux).

    Multiple Pylon::WaitObjects can be put in the Pylon::WaitObjects container class allowing to wait "simultaneously" for multiple events.


    \ingroup PYLON_PUBLIC
    */
    // ----------------------------------------------------------------------
    @Namespace("Pylon") @NoOffset public static class WaitObject extends Pointer {
        static { Loader.load(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public WaitObject(int size) { allocateArray(size); }
        private native void allocateArray(int size);
        @Override public WaitObject position(int position) {
            return (WaitObject)super.position(position);
        }
    
        /** Constructs an "empty" wait object, i.e., the wait object is not attached to a platform dependent wait object (IsValid() == false)
        /** The Pylon::WaitObjectEx class can be used to create wait objects controllable by an application. */
        public WaitObject() { allocate(); }
        private native void allocate();
        /** Destructor */
        /** Copy constructor (duplicates the wrapped handle/file descriptor) */
        public WaitObject(@Const @ByRef WaitObject arg0) { allocate(arg0); }
        private native void allocate(@Const @ByRef WaitObject arg0);
        /** Assignment operator (duplicates the wrapped handle/file descriptor) */
        public native @ByRef @Name("operator =") WaitObject put(@Const @ByRef WaitObject arg0);

        /** Suspend calling thread for specified time.
        /**
        \param ms wait time in ms
        */
        public static native void Sleep(@Cast("unsigned long") long ms);
        /** Checks if the wait object is valid.
        /**
        Don't call the  Wait methods() for an invalid wait object. Wait objects returned by the pylon libraries are valid.
        \return true if the object contains a valid handle/file descriptor
        */
        public native @Cast("bool") boolean IsValid();
        /** Wait for the object to be signaled
        /**
        \param timeout timeout in ms
        \return false when the timeout has been expired, true when the waiting was successful before
        the timeout has been expired.
        */
        public native @Cast("bool") boolean Wait(@Cast("unsigned int") int timeout);

        /** Wait for the object to be signaled  (interruptible)
        /**

        \param timeout timeout in ms
        \param bAlertable    When the bAlertable parameter is set to true, the function waits until either the timeout elapses, the object enters
        the signaled state, or the wait operation has been interrupted.
        For Windows, the wait operation is interrupted by queued APCs or I/O completion routines.
        For Linux, the wait operation can be interrupted by signals.

        \return The returned Pylon::EWaitExResult  value indicates the result of the wait operation.

        */
        public native @Cast("Pylon::EWaitExResult") int WaitEx(@Cast("unsigned int") int timeout, @Cast("bool") boolean bAlertable);
        /** Constructor taking existing handle (duplicate=false -> take ownership like std:auto_ptr)
        /** This method allows to wrap an exiting windows handle that can be used with the \c WaitForSingleObject() and
        \c WaitForMultipleObjects methods. */
        public WaitObject(@Cast("HANDLE") Pointer h, @Cast("bool") boolean duplicate/*=true*/) { allocate(h, duplicate); }
        private native void allocate(@Cast("HANDLE") Pointer h, @Cast("bool") boolean duplicate/*=true*/);
        public WaitObject(@Cast("HANDLE") Pointer h) { allocate(h); }
        private native void allocate(@Cast("HANDLE") Pointer h);


        /** conversion operator
        /** \return the native Win32 handle wrapped by the WaitObject. (Not supported by pylon4Linux) */
        public native @Name("operator HANDLE") Pointer asPointer();
    }


    // ----------------------------------------------------------------------
    /**
    \brief A wait object that the user may signal
    \ingroup PYLON_PUBLIC
    */
    // ----------------------------------------------------------------------
    @Namespace("Pylon") public static class WaitObjectEx extends WaitObject {
        static { Loader.load(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public WaitObjectEx(int size) { allocateArray(size); }
        private native void allocateArray(int size);
        @Override public WaitObjectEx position(int position) {
            return (WaitObjectEx)super.position(position);
        }
    
        /** Creates an event object (manual reset event) */
        public static native @ByVal WaitObjectEx Create(@Cast("bool") boolean initiallySignalled/*=false*/);
        public static native @ByVal WaitObjectEx Create();


        /** Constructs an "empty" wait object, i.e., the wait object is not attached to a platform dependent wait object (IsValid() == false)
        /** Use the static WaitObjectEx::Create() method to create instances of the WaitObjectEx class instead. */
        public WaitObjectEx() { allocate(); }
        private native void allocate();
        /** Set the object to signaled state */
        public native void Signal();
        /** Reset the object to unsignaled state */
        public native void Reset();
        /** Constructor using an existing windows handle (duplicate=false -> take ownership like std:auto_ptr) */
        public WaitObjectEx(@Cast("HANDLE") Pointer h, @Cast("bool") boolean duplicate/*=true*/) { allocate(h, duplicate); }
        private native void allocate(@Cast("HANDLE") Pointer h, @Cast("bool") boolean duplicate/*=true*/);
        public WaitObjectEx(@Cast("HANDLE") Pointer h) { allocate(h); }
        private native void allocate(@Cast("HANDLE") Pointer h);
// #endif

        // -------------------------------
        // Linux specific stuff
        // -------------------------------
// #if defined (PYLON_LINUX_BUILD)
// #endif
    }


// #if defined(PYLON_WIN_BUILD)
    // ----------------------------------------------------------------------
    /*
    This class is deprecated. Please use Pylon::WaitObjectEx instead.
    */
    // ----------------------------------------------------------------------
    @Namespace("Pylon") public static class AlertableWaitObject extends WaitObjectEx {
        static { Loader.load(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public AlertableWaitObject(int size) { allocateArray(size); }
        private native void allocateArray(int size);
        @Override public AlertableWaitObject position(int position) {
            return (AlertableWaitObject)super.position(position);
        }
    
            public AlertableWaitObject( @Cast("bool") boolean manualReset/*=false*/, @Cast("bool") boolean initiallySignalled/*=false*/ ) { allocate(manualReset, initiallySignalled); }
            private native void allocate( @Cast("bool") boolean manualReset/*=false*/, @Cast("bool") boolean initiallySignalled/*=false*/ );
            public AlertableWaitObject( ) { allocate(); }
            private native void allocate( );
            public AlertableWaitObject( @Cast("HANDLE") Pointer h, @Cast("bool") boolean duplicate/*=true*/ ) { allocate(h, duplicate); }
            private native void allocate( @Cast("HANDLE") Pointer h, @Cast("bool") boolean duplicate/*=true*/ );
            public AlertableWaitObject( @Cast("HANDLE") Pointer h ) { allocate(h); }
            private native void allocate( @Cast("HANDLE") Pointer h );
    }
// #endif


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif //__WAITOBJECT_H__


// Parsed from <pylon/_InstantCameraParams.h>


    




//-----------------------------------------------------------------------------
//  (c) 2004-2008 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//-----------------------------------------------------------------------------
/**
\file
\brief Interface to instant camera parameters
  */

  //-----------------------------------------------------------------------------
  //  This file is generated automatically
  //  Do not modify!
  //-----------------------------------------------------------------------------

//   #ifdef __GNUC__
//   #define GENAPI_DEPRECATED_FEATURE __attribute__((deprecated))
//   #elif defined(_MSC_VER) 
//   #define GENAPI_DEPRECATED_FEATURE __declspec(deprecated)
//   #else
//   #define GENAPI_DEPRECATED_FEATURE
//   #endif


  

// #ifndef Basler_InstantCameraParams_PARAMS_H
// #define Basler_InstantCameraParams_PARAMS_H

// #include <GenApi/IEnumerationT.h>
// #include <GenApi/NodeMapRef.h>
// #include <GenApi/DLLLoad.h>

/** The namespace containing the device's control interface and related enumeration types */

    //**************************************************************************************************
    // Enumerations
    //**************************************************************************************************
    

    //**************************************************************************************************
    // Parameter class
    //**************************************************************************************************
    

    /** Interface to instant camera parameters */
    @Namespace("Basler_InstantCameraParams") @NoOffset public static class CInstantCameraParams_Params extends Pointer {
        static { Loader.load(); }
        /** Empty constructor. */
        public CInstantCameraParams_Params() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CInstantCameraParams_Params(Pointer p) { super(p); }
    
        
	/** \name Root - Instant camera parameters. */
    //@{
	/**	
		\brief The maximum number of buffers that are allocated and used for grabbing.

	
	
		\b Visibility = Beginner
        
	
    */
    public native @ByRef IInteger MaxNumBuffer(); public native CInstantCameraParams_Params MaxNumBuffer(IInteger MaxNumBuffer);
    
    //@}
    

	/** \name Root - Instant camera parameters. */
    //@{
	/**	
		\brief The maximum number of buffers that are queued in the stream grabber input queue.

	
	
		\b Visibility = Beginner
        
	
    */
    public native @ByRef IInteger MaxNumQueuedBuffer(); public native CInstantCameraParams_Params MaxNumQueuedBuffer(IInteger MaxNumQueuedBuffer);
    
    //@}
    

	/** \name Root - Instant camera parameters. */
    //@{
	/**	
		\brief The maximum number of grab results available at any time during a grab session. This value can be limited to save resources. Furthermore, it can be used to check that the grab results are returned correctly.

	
	
		\b Visibility = Beginner
        
	
    */
    public native @ByRef IInteger MaxNumGrabResults(); public native CInstantCameraParams_Params MaxNumGrabResults(IInteger MaxNumGrabResults);
    
    //@}
    

	/** \name Root - Instant camera parameters. */
    //@{
	/**	
		\brief Enables/disables the use of a chunk node map for each grab result. Grab result chunk node maps can be disabled to save resources.

	
	
		\b Visibility = Guru
	
    */
    public native @ByRef IBoolean ChunkNodeMapsEnable(); public native CInstantCameraParams_Params ChunkNodeMapsEnable(IBoolean ChunkNodeMapsEnable);
    
    //@}
    

	/** \name Root - Instant camera parameters. */
    //@{
	/**	
		\brief If larger than 0, a static chunk node map pool is used instead of dynamic chunk node map creation.

	
	
		\b Visibility = Guru
	
    */
    public native @ByRef IInteger StaticChunkNodeMapPoolSize(); public native CInstantCameraParams_Params StaticChunkNodeMapPoolSize(IInteger StaticChunkNodeMapPoolSize);
    
    //@}
    

	/** \name Root - Instant camera parameters. */
    //@{
	/**	
		\brief Enables/disables the grabbing of camera events while images are grabbed. Is writable when the camera object is closed.

	
	
		\b Visibility = Expert
	
    */
    public native @ByRef IBoolean GrabCameraEvents(); public native CInstantCameraParams_Params GrabCameraEvents(IBoolean GrabCameraEvents);
    
    //@}
    

	/** \name Root - Instant camera parameters. */
    //@{
	/**	
		\brief The camera object is set to monitor mode when enabled, e.g. when using the GigE multicast feature. Is writable when the camera object is closed.

	
	
		\b Visibility = Guru
	
    */
    public native @ByRef IBoolean MonitorModeActive(); public native CInstantCameraParams_Params MonitorModeActive(IBoolean MonitorModeActive);
    
    //@}
    

	/** \name InternalGrabEngineThread - Parameters of the internal grab engine thread. */
    //@{
	/**	
		\brief If enabled, the user can set a custom priority for the internal grab engine thread operating the stream grabber. Otherwise the priority defaults to 25.

	
	
		\b Visibility = Guru
	
    */
    public native @ByRef IBoolean InternalGrabEngineThreadPriorityOverride(); public native CInstantCameraParams_Params InternalGrabEngineThreadPriorityOverride(IBoolean InternalGrabEngineThreadPriorityOverride);
    
    //@}
    

	/** \name InternalGrabEngineThread - Parameters of the internal grab engine thread. */
    //@{
	/**	
		\brief The internal grab engine thread priority.

	This value sets the absolute thread priority for the internal grab engine thread operating the stream grabber.
	
		\b Visibility = Guru
	
    */
    public native @ByRef IInteger InternalGrabEngineThreadPriority(); public native CInstantCameraParams_Params InternalGrabEngineThreadPriority(IInteger InternalGrabEngineThreadPriority);
    
    //@}
    

	/** \name GrabLoopThread - Parameters of the optional grab loop  thread. */
    //@{
	/**	
		\brief If enabled, the user can set a custom timeout for the grab loop thread's call to RetrieveResult. RetrieveResult is configured to throw an exception on timeout, which will stop the grab session.

	
	
		\b Visibility = Guru
	
    */
    public native @ByRef IBoolean GrabLoopThreadUseTimeout(); public native CInstantCameraParams_Params GrabLoopThreadUseTimeout(IBoolean GrabLoopThreadUseTimeout);
    
    //@}
    

	/** \name GrabLoopThread - Parameters of the optional grab loop  thread. */
    //@{
	/**	
		\brief A custom timeout for the grab loop thread's call to RetrieveResult. RetrieveResult is configured to throw an exception on timeout, which will stop the grab session.

	
	
		\b Visibility = Beginner
        
	
    */
    public native @ByRef IInteger GrabLoopThreadTimeout(); public native CInstantCameraParams_Params GrabLoopThreadTimeout(IInteger GrabLoopThreadTimeout);
    
    //@}
    

	/** \name GrabLoopThread - Parameters of the optional grab loop  thread. */
    //@{
	/**	
		\brief If enabled, the user can set a custom priority for the grab loop thread. Otherwise, the priority of the newly created thread is not changed.

	
	
		\b Visibility = Guru
	
    */
    public native @ByRef IBoolean GrabLoopThreadPriorityOverride(); public native CInstantCameraParams_Params GrabLoopThreadPriorityOverride(IBoolean GrabLoopThreadPriorityOverride);
    
    //@}
    

	/** \name GrabLoopThread - Parameters of the optional grab loop  thread. */
    //@{
	/**	
		\brief The grab loop thread priority.

	This value sets the absolute thread priority for the grab loop thread.
	
		\b Visibility = Guru
	
    */
    public native @ByRef IInteger GrabLoopThreadPriority(); public native CInstantCameraParams_Params GrabLoopThreadPriority(IInteger GrabLoopThreadPriority);
    
    //@}
    

	/** \name Root - Instant camera parameters. */
    //@{
	/**	
		\brief The number of buffers queued at Low Level API stream grabber.

	
        
            This is the number of buffers that are queued for grabbing in the stream grabber.
            The number is influenced by the number of available free buffers and the
            maximum number of buffers that can be queued.
            See also the MaxNumBuffer and MaxNumQueuedBuffer parameters.

            This parameter can be used to check whether the number of buffers ready for grabbing
            is stable, which means that the image processing is fast enough to keep up with the
            rate of incoming images when using the GrabStrategy_OneByOne grab strategy.
        
        
	
		\b Visibility = Expert
	
    */
    public native @ByRef IInteger NumQueuedBuffers(); public native CInstantCameraParams_Params NumQueuedBuffers(IInteger NumQueuedBuffers);
    
    //@}
    

	/** \name Root - Instant camera parameters. */
    //@{
	/**	
		\brief The number of grab result buffers in the output queue that are ready for retrieval.

	
	
		\b Visibility = Expert
	
    */
    public native @ByRef IInteger NumReadyBuffers(); public native CInstantCameraParams_Params NumReadyBuffers(IInteger NumReadyBuffers);
    
    //@}
    

	/** \name Root - Instant camera parameters. */
    //@{
	/**	
		\brief The number of empty buffers that are not used for grabbing yet.

	
	
		\b Visibility = Expert
	
    */
    public native @ByRef IInteger NumEmptyBuffers(); public native CInstantCameraParams_Params NumEmptyBuffers(IInteger NumEmptyBuffers);
    
    //@}
    

	/** \name Root - Instant camera parameters. */
    //@{
	/**	
		\brief The size of the grab result buffer output queue.

	
	
		\b Visibility = Expert
	
    */
    public native @ByRef IInteger OutputQueueSize(); public native CInstantCameraParams_Params OutputQueueSize(IInteger OutputQueueSize);
    }


    //**************************************************************************************************
    // Parameter class implementation
    //**************************************************************************************************

    /** \cond HIDE_CLASS_METHODS */

    

    

    

    

    

    /** \endcond */

 // namespace Basler_InstantCameraParams

// #undef GENAPI_DEPRECATED_FEATURE
// #endif // Basler_InstantCameraParams_PARAMS_H


// Parsed from <pylon/ConfigurationEventHandler.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Contains the configuration event handler base class.
*/

// #ifndef INCLUDED_CONFIGURATIONEVENTHANDLER_H_01627755
// #define INCLUDED_CONFIGURATIONEVENTHANDLER_H_01627755

// #include <pylon/stdinclude.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #if _MSC_VER
// #   pragma warning( push)
// #   pragma warning( disable : 4100) //warning C4100: 'identifier' : unreferenced formal parameter
// #endif

    /** \addtogroup Pylon_InstantCameraApiGeneric
     * @{
     */

    /**
    \class  CConfigurationEventHandler
    \brief The configuration event handler base class.
    */
    @Namespace("Pylon") @NoOffset public static class CConfigurationEventHandler extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CConfigurationEventHandler(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CConfigurationEventHandler(int size) { allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CConfigurationEventHandler position(int position) {
            return (CConfigurationEventHandler)super.position(position);
        }
        
        /**
        \brief This method is called before a %Pylon Device (Pylon::IPylonDevice) is attached by calling the Instant Camera object's Attach() method.

        This method can not be used for detecting that a camera device has been attached to the PC.
        The camera's Attach() method must not be called from here or from subsequent calls to avoid infinite recursion.

        \param[in]  camera The source of the call.

        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnAttach( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after a %Pylon Device (Pylon::IPylonDevice) has been attached by calling the Instant Camera object's Attach() method.

        This method can not be used for detecting that a camera device has been attached to the PC.
        The camera's Attach() method must not be called from here or from subsequent calls to avoid infinite recursion.

        \param[in]  camera The source of the call.

        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnAttached( @ByRef CInstantCamera camera);

        /**
        \brief This method is called before the attached %Pylon Device is detached from the Instant Camera object.

        The camera's Detach() method  must not be called from here or from subsequent calls to avoid infinite recursion.

        \param[in]  camera The source of the call.

        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnDetach( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after the attached %Pylon Device has been detached from the Instant Camera object.

        \param[in]  camera The source of the call.

        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnDetached( @ByRef CInstantCamera camera);

        /**
        \brief This method is called before the attached %Pylon Device is destroyed.

        Camera DestroyDevice must not be called from here or from subsequent calls to avoid infinite recursion.

        \param[in]  camera The source of the call.

        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnDestroy( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after the attached %Pylon Device has been destroyed.

        \param[in]  camera The source of the call.

        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnDestroyed( @ByRef CInstantCamera camera);

        /**
        \brief This method is called before the attached %Pylon Device is opened.

        \param[in]  camera The source of the call.

        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnOpen( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after the attached %Pylon Device has been opened.

        \param[in]  camera The source of the call.

        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnOpened( @ByRef CInstantCamera camera);

        /**
        \brief This method is called before the attached %Pylon Device is closed.

        Camera Close must not be called from here or from subsequent calls to avoid infinite recursion.

        \param[in]  camera The source of the call.

        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnClose( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after the attached %Pylon Device has been closed.

        \param[in]  camera The source of the call.

        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnClosed( @ByRef CInstantCamera camera);

        /**
        \brief This method is called before a grab session is started.

        Camera StartGrabbing must not be called from here or from subsequent calls to avoid infinite recursion.

        \param[in]  camera The source of the call.

        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnGrabStart( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after a grab session has been started.

        \param[in]  camera The source of the call.

        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnGrabStarted( @ByRef CInstantCamera camera);

        /**
        \brief This method is called before a grab session is stopped.

        Camera StopGrabbing must not be called from here or from subsequent calls to avoid infinite recursion.

        \param[in]  camera The source of the call.

        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnGrabStop( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after a grab session has been stopped.

        \param[in]  camera The source of the call.

        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnGrabStopped( @ByRef CInstantCamera camera);
        
        /**
        \brief This method is called when an exception has been triggered during grabbing.

        An exception has been triggered by a grab thread. The grab will be stopped after this event call.

        \param[in]  camera The source of the call.
        \param[in]  errorMessage The message of the exception that signaled an error during grabbing.

        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.

        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnGrabError( @ByRef CInstantCamera camera, @Cast("const char*") BytePointer errorMessage);
        public native void OnGrabError( @ByRef CInstantCamera camera, String errorMessage);

        /**
        \brief This method is called when a camera device removal from the PC has been detected.

        The %Pylon Device attached to the Instant Camera is not operable after this event.
        After it is made sure that no access to the %Pylon Device or any of its node maps is made anymore
        the %Pylon Device should be destroyed using InstantCamera::DeviceDestroy().
        The access to the %Pylon Device can be protected using the lock provided by GetLock(), e.g. when accessing parameters.

        \param[in]  camera The source of the call.

        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.

        \threading
            This method is called inside the lock of the camera object from an additional thread.
        */
        public native void OnCameraDeviceRemoved( @ByRef CInstantCamera camera);


        /**
        \brief This method is called when the configuration event handler has been registered.

        \param[in]  camera The source of the call.

        \error
            Exceptions from this call will propagate through.
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnConfigurationRegistered( @ByRef CInstantCamera camera);

        /**
        \brief This method is called when the configuration event handler has been deregistered.

        The configuration event handler is automatically deregistered when the Instant Camera object
        is destroyed.

        \param[in]  camera The source of the call.

        \error
            C++ exceptions from this call will be caught and ignored.
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnConfigurationDeregistered( @ByRef CInstantCamera camera);

        /**
        \brief Destroys the configuration event handler.

        \error
            C++ exceptions from this call will be caught and ignored.
        */        
        public native void DestroyConfiguration();

        /** Create. */
        public CConfigurationEventHandler() { allocate(); }
        private native void allocate();

        /** Copy. */
        public CConfigurationEventHandler(@Const @ByRef CConfigurationEventHandler arg0) { allocate(arg0); }
        private native void allocate(@Const @ByRef CConfigurationEventHandler arg0);

        /** Assign. */
        public native @ByRef @Name("operator =") CConfigurationEventHandler put(@Const @ByRef CConfigurationEventHandler arg0);

        /** Destruct. */

        // Internal use only. Subject to change without notice.
        public native long DebugGetEventHandlerRegistrationCount();
    }

    /** 
     * @}
     */


// #if _MSC_VER
// #   pragma warning( pop)
// #endif

// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_CONFIGURATIONEVENTHANDLER_H_01627755 */


// Parsed from <pylon/ImageEventHandler.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Contains the image event handler base class.
*/

// #ifndef INCLUDED_IMAGEEVENTHANDLER_H_8866388
// #define INCLUDED_IMAGEEVENTHANDLER_H_8866388

// #include <pylon/stdinclude.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/GrabResultPtr.h>

// #if _MSC_VER
// #   pragma warning( push)
// #   pragma warning( disable : 4100) //warning C4100: 'identifier' : unreferenced formal parameter
// #endif

    /** \addtogroup Pylon_InstantCameraApiGeneric
     * @{
     */

    /**
    \class  CImageEventHandler
    \brief  The image event handler base class.
    */
    @Namespace("Pylon") @NoOffset public static class CImageEventHandler extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CImageEventHandler(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CImageEventHandler(int size) { allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CImageEventHandler position(int position) {
            return (CImageEventHandler)super.position(position);
        }
    

        /**
        \brief This method is called when images have been skipped using the GrabStrategy_LatestImageOnly strategy or the GrabStrategy_LatestImages strategy.
        
        \param[in]  camera The source of the call.
        \param[in]  countOfSkippedImages The number of images skipped. This \c countOfSkippedImages does not include the number of images lost in the case of a buffer under run in the driver.

        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.

        \threading
            This method is called outside the lock of the camera object but inside the lock of the image event handler registry.
        */
        public native void OnImagesSkipped( @ByRef CInstantCamera camera, @Cast("size_t") int countOfSkippedImages);

        /**
        \brief This method is called when an image has been grabbed.

        The grab result smart pointer passed does always reference a grab result data object.
        The status of the grab needs to be checked before accessing the grab result data.
        See CGrabResultData::GrabSucceeded(), CGrabResultData::GetErrorCode() and 
        CGrabResultData::GetErrorDescription() for more information.

        \param[in]  camera The source of the call.
        \param[in]  grabResult The grab result data.

        \error 
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.

        \threading
            This method is called outside the lock of the camera object but inside the lock of the image event handler registry.
        */
        public native void OnImageGrabbed( @ByRef CInstantCamera camera, @Const @ByRef CGrabResultPtr grabResult);

        /**
        \brief This method is called when the image event handler has been registered.

        \param[in]  camera The source of the call.

        \error
            Exceptions from this call will propagate through.
        \threading
            This method is called inside the lock of the image event handler registry.
        */
        public native void OnImageEventHandlerRegistered( @ByRef CInstantCamera camera);

        /**
        \brief This method is called when the image event handler has been deregistered.

        The image event handler is automatically deregistered when the Instant Camera object
        is destroyed.

        \param[in]  camera The source of the call.

        \error
            C++ exceptions from this call will be caught and ignored.
        \threading
            This method is called inside the lock of the image event handler registry.
        */
        public native void OnImageEventHandlerDeregistered( @ByRef CInstantCamera camera);

        /**
        \brief Destroys the image event handler.

        \error
            C++ exceptions from this call will be caught and ignored.
        */        
        public native void DestroyImageEventHandler();

        /** Create. */
        public CImageEventHandler() { allocate(); }
        private native void allocate();

        /** Copy. */
        public CImageEventHandler(@Const @ByRef CImageEventHandler arg0) { allocate(arg0); }
        private native void allocate(@Const @ByRef CImageEventHandler arg0);

        /** Assign. */
        public native @ByRef @Name("operator =") CImageEventHandler put(@Const @ByRef CImageEventHandler arg0);

        /** Destruct. */

        // Internal use only. Subject to change without notice.
        public native long DebugGetEventHandlerRegistrationCount();
    }

    /** 
     * @}
     */


// #if _MSC_VER
// #   pragma warning( pop)
// #endif

// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_IMAGEEVENTHANDLER_H_8866388 */


// Parsed from <pylon/CameraEventHandler.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Contains the camera event handler base class.
*/

// #ifndef INCLUDED_CAMERAEVENTHANDLER_H_3102315
// #define INCLUDED_CAMERAEVENTHANDLER_H_3102315

// #include <pylon/stdinclude.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <GenApi/INode.h>

// #if _MSC_VER
// #   pragma warning( push)
// #   pragma warning( disable : 4100) //warning C4100: 'identifier' : unreferenced formal parameter
// #endif

    /** \addtogroup Pylon_InstantCameraApiGeneric
     * @{
     */

    /**
    \class  CCameraEventHandler
    \brief  The camera event handler base class.
    */
    @Namespace("Pylon") @NoOffset public static class CCameraEventHandler extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CCameraEventHandler(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CCameraEventHandler(int size) { allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CCameraEventHandler position(int position) {
            return (CCameraEventHandler)super.position(position);
        }
    

        /**
        \brief This method is called when a camera event has been received.

        Only very short processing tasks should be performed by this method. Otherwise, the event notification will block the
        processing of images.

        \param[in]  camera The source of the call.
        \param[in]  userProvidedId  The ID passed when registering for the event. It can be used to distinguish between different events.
        \param[in]  pNode The node identified by node name when registering.

        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        \threading
            This method is called outside the lock of the camera object, outside the lock of the node map, and inside the lock of the camera event handler registry.
        */
        public native void OnCameraEvent( @ByRef CInstantCamera camera, @Cast("intptr_t") long userProvidedId, INode pNode);
        
        /**
        \brief This method is called when the camera event handler has been registered.

        \param[in]  camera The source of the call.
        \param[in]  nodeName  The name of the event data node updated on camera event, e.g. "ExposureEndEventTimestamp" for exposure end event.
        \param[in]  userProvidedId  This ID is passed as a parameter in CCameraEventHandler::OnCameraEvent and can be used to distinguish between different events.

        \error
            Exceptions from this call will propagate through.
        \threading
            This method is called inside the lock of the camera event handler registry.
        */
        public native void OnCameraEventHandlerRegistered( @ByRef CInstantCamera camera, @Cast("const Pylon::String_t*") @ByRef gcstring nodeName, @Cast("intptr_t") long userProvidedId);
        
        /**
        \brief This method is called when the camera event handler has been deregistered.

        The camera event handler is automatically deregistered when the Instant Camera object
        is destroyed.

        \param[in]  camera The source of the call.
        \param[in]  nodeName  The name of the event data node updated on camera event, e.g. "ExposureEndEventTimestamp" for exposure end event.
        \param[in]  userProvidedId  This ID is passed as a parameter in CCameraEventHandler::OnCameraEvent and can be used to distinguish between different events.

        \error
            C++ exceptions from this call will be caught and ignored.
        \threading
            This method is called inside the lock of the camera event handler registry.
        */
        public native void OnCameraEventHandlerDeregistered( @ByRef CInstantCamera camera, @Cast("const Pylon::String_t*") @ByRef gcstring nodeName, @Cast("intptr_t") long userProvidedId);

        /**
        \brief Destroys the camera event handler.

        \error
            C++ exceptions from this call will be caught and ignored.
        */        
        public native void DestroyCameraEventHandler();

        /** Create. */
        public CCameraEventHandler() { allocate(); }
        private native void allocate();

        /** Copy. */
        public CCameraEventHandler(@Const @ByRef CCameraEventHandler arg0) { allocate(arg0); }
        private native void allocate(@Const @ByRef CCameraEventHandler arg0);

        /** Assign. */
        public native @ByRef @Name("operator =") CCameraEventHandler put(@Const @ByRef CCameraEventHandler arg0);

        /** Destruct. */

        // Internal use only. Subject to change without notice.
        public native long DebugGetEventHandlerRegistrationCount();
    }

    /** 
     * @}
     */


// #if _MSC_VER
// #   pragma warning( pop)
// #endif

// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_CAMERAEVENTHANDLER_H_3102315 */


// Parsed from <pylon/BufferFactory.h>

//------------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//------------------------------------------------------------------------------
/**
    \file
    \brief  Contains an interface for a buffer factory.
*/

// #ifndef INCLUDED_BUFFERFACTORY_H_264599
// #define INCLUDED_BUFFERFACTORY_H_264599

// #include <pylon/stdinclude.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */
    /**
    \class  IBufferFactory
    \brief  Usable to create a custom buffer factory when needed.
    \ingroup Pylon_InstantCameraApiGeneric
    */
    @Namespace("Pylon") public static class IBufferFactory extends Pointer {
        static { Loader.load(); }
        /** Empty constructor. */
        public IBufferFactory() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IBufferFactory(Pointer p) { super(p); }
    
        /** Ensure proper destruction by using a virtual destructor. */

        /**
        \brief Allocates a buffer and provides additional context information.


        \param[in] bufferSize      The size of the buffer that has to be allocated.
        \param[out] pCreatedBuffer Return the pointer to the allocated buffer. May return NULL if the allocation fails.
        \param[out] bufferContext  Context information that belongs to the buffer.
                                   This context information is provided when FreeBuffer() is called.
                                   The value can be left unchanged if not needed.

        \threading
        This method can be run by different threads. It is called from threads that 
        call Pylon::CInstantCamera::StartGrabbing() and it can be called by the internal
        grab engine thread.

        \error
            May throw an exception if the allocation fails.
        */
        public native void AllocateBuffer( @Cast("size_t") int bufferSize, @Cast("void**") PointerPointer pCreatedBuffer, @Cast("intptr_t*") @ByRef LongPointer bufferContext);
        public native void AllocateBuffer( @Cast("size_t") int bufferSize, @Cast("void**") @ByPtrPtr Pointer pCreatedBuffer, @Cast("intptr_t*") @ByRef LongPointer bufferContext);
        public native void AllocateBuffer( @Cast("size_t") int bufferSize, @Cast("void**") @ByPtrPtr Pointer pCreatedBuffer, @Cast("intptr_t*") @ByRef LongBuffer bufferContext);
        public native void AllocateBuffer( @Cast("size_t") int bufferSize, @Cast("void**") @ByPtrPtr Pointer pCreatedBuffer, @Cast("intptr_t*") @ByRef long[] bufferContext);


        /**
        \brief Frees a previously allocated buffer.

        \param[in] pCreatedBuffer The pointer to the allocated buffer. Created by this factory.
        \param[in] bufferContext  Context information of the buffer returned by AllocateBuffer().

        \error
            Does not throw C++ exceptions.
        */
        public native void FreeBuffer( Pointer pCreatedBuffer, @Cast("intptr_t") long bufferContext);


        /**
        \brief Destroys the buffer factory.

        This method is called when the buffer factory is not needed any longer.
        The object implementing IBufferFactory can be deleted by calling: delete this.

        \threading
        This method can be run by different threads. It is called from threads that are running the
        destructor of a Pylon::CGrabResultPtr or call Pylon::CInstantCamera::StopGrabbing().

        \error
            C++ exceptions from this call will be caught and ignored.
        */
        public native void DestroyBufferFactory();
    }

    // Implementation required for Windows only.
    // Note: the C++ standards >= C11 prohibit pure virtual destructors with a function body
    // in the declaration. Consequently GCC 4.0 and newer GCC versions reject an inline implementation
    // in the class.
    


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_BUFFERFACTORY_H_264599 */


// Parsed from <pylon/InstantCamera.h>

//------------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2014 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//------------------------------------------------------------------------------
/**
\file
\brief Contains a camera class establishing convenient access to a camera device. 
*/

// #ifndef INCLUDED_INSTANTCAMERA_H_08725703
// #define INCLUDED_INSTANTCAMERA_H_08725703

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <GenApi/Synch.h>
// #include <pylon/PylonBase.h>
// #include <pylon/ImageEventHandler.h>
// #include <pylon/ConfigurationEventHandler.h>
// #include <pylon/CameraEventHandler.h>
// #include <pylon/BufferFactory.h>
// #include <pylon/GrabResultPtr.h>
// #include <pylon/DeviceInfo.h>
// #include <pylon/WaitObject.h>
// #include <pylon/Device.h>
// #include <pylon/SfncVersion.h>
    /** Internal use only. */
    @Namespace("Pylon") @Opaque public static class IInstantCameraExtensions extends Pointer {
        /** Empty constructor. */
        public IInstantCameraExtensions() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IInstantCameraExtensions(Pointer p) { super(p); }
    }


// #ifdef _MSC_VER
// #pragma warning( push )
// #pragma warning( disable : 4275 ) // Class needs to have a dll interface to be used by clients of the class.
// #endif

// #include <pylon/_InstantCameraParams.h>
    /** \addtogroup Pylon_InstantCameraApiGeneric
     * @{
     */

    ///Lists the possible grab strategies.
    /** enum Pylon::EGrabStrategy */
    public static final int
        /** The images are processed in the order of their arrival. This is the default grab strategy. */
        GrabStrategy_OneByOne = 0,

        /** Only the latest image is kept in the output queue, all other grabbed images are skipped.
 *  If no image is in the output queue when retrieving an image with \c CInstantCamera::RetrieveResult(), 
 *  the processing waits for the upcoming image. */
        GrabStrategy_LatestImageOnly = 1,

        /** This strategy can be used to grab images while keeping only the latest images. If the application does not
 *  retrieve all images in time, all other grabbed images are skipped. The CInstantCamera::OutputQueueSize parameter can be used to
 *  control how many images can be queued in the output queue. When setting the output queue size to 1, this strategy is equivalent to 
 *  GrabStrategy_LatestImageOnly grab strategy. When setting the output queue size to CInstantCamera::MaxNumBuffer,
 *  this strategy is equivalent to GrabStrategy_OneByOne. */
        GrabStrategy_LatestImages = 2,

        /** The input buffer queue is kept empty. This prevents grabbing.
 *  However, when retrieving an image with a call to the \c CInstantCamera::RetrieveResult() method 
 *  a buffer is queued into the input queue and then the call waits for the upcoming image.
 *  The buffer is removed from the queue on timeout.
 *  Hence after the call to the \c CInstantCamera::RetrieveResult() method the input buffer queue is empty again.
 *  The upcoming image grab strategy cannot be used together with USB camera devices. See the advanced topics section of 
 *  the %pylon Programmer's Guide for more information. */
        GrabStrategy_UpcomingImage = 3;

    ///Defines who deletes a passed object if it is not needed anymore.
    /** enum Pylon::ECleanup */
    public static final int
        /** The caller is responsible for deleting the passed object. The object needs to be detached or deregistered before deletion. */
        Cleanup_None = 0,
        /** The passed object is deleted if it is not needed anymore. */
        Cleanup_Delete = 1,
        /** Deprecated: Use Cleanup_None instead. */
        Ownership_ExternalOwnership =  Cleanup_None,
        /** Deprecated: Use Cleanup_Delete instead. */
        Ownership_TakeOwnership =  Cleanup_Delete;
    ///Deprecated: Use ECleanup instead.

    ///Defines the use of an additional grab loop thread.
    /** enum Pylon::EGrabLoop */
    public static final int
        /** The grab loop thread is provided by the Instant Camera. It calls RetrieveResult() in a loop. Grabbed images are processed by registered image event handlers. The grab loop thread is started when the grab starts. */
        GrabLoop_ProvidedByInstantCamera = 0,
        /** The user code calls RetrieveResult() in a loop to process grabbed images and camera events. */
        GrabLoop_ProvidedByUser = 1;

    ///Defines how to register an item.
    /** enum Pylon::ERegistrationMode */
    public static final int
        /** The item is appended to the list of registered items. */
        RegistrationMode_Append = 0,
        /** The item replaces all other registered items. */
        RegistrationMode_ReplaceAll = 1;

    ///Defines how to register a camera event handler.
    /** enum Pylon::ECameraEventAvailability */
    public static final int
        /** The camera event must be provided by the camera, otherwise an exception is thrown. */
        CameraEventAvailability_Mandatory = 0,
        /** The camera event handler is not used if the camera does not support the camera event. */
        CameraEventAvailability_Optional = 1;

    ///Defines how to handle a timeout for a method.
    /** enum Pylon::ETimeoutHandling */
    public static final int
        /** The method returns on timeout. What data is returned can be found in the documentation of the method. */
        TimeoutHandling_Return = 0,
        /** An exception is thrown on timeout. */
        TimeoutHandling_ThrowException = 1;

    /**
    \class  CInstantCamera
    \brief  Provides convenient access to a camera device.
     
    <ul>
    <li> Establishes a single access point for accessing camera functionality.
    <li> The class can be used off the shelf without any parameters. The camera uses a default configuration for the camera device. This can be overridden.
    <li> Handles %Pylon device lifetime. This can be overridden.
    <li> Handles opening and closing of a %Pylon device automatically.
    <li> Handles chunk data parsing automatically returning the chunk data in the grab result.
    <li> Handles event grabbing automatically providing a convenient interface for event callbacks. This can be overridden.
    <li> Handles physical camera device removal.
    <li> Handles the creation, reuse, and destruction of buffers.
    <li> The grabbing can be done in the context of the caller or by using an additional grab loop thread.
    <li> The Instant Camera class is extensible using derivation or by registering event handler objects.
    </ul>
    */
    @Namespace("Pylon") @NoOffset public static class CInstantCamera extends CInstantCameraParams_Params {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CInstantCamera(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CInstantCamera(int size) { allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CInstantCamera position(int position) {
            return (CInstantCamera)super.position(position);
        }
    
        //Creation and life time------------------------------------------------

        /**
        \brief Creates an Instant Camera object with no attached %Pylon device.

        \error
            Does not throw C++ exceptions.
        */
        public CInstantCamera() { allocate(); }
        private native void allocate();


        /**
        \brief Creates an Instant Camera object and calls Attach().

        See Attach() for more information.

        \param[in]  pDevice The %Pylon device to attach.
        \param[in]  cleanupProcedure If cleanupProcedure equals Cleanup_Delete, the %Pylon device is destroyed when the Instant Camera object is destroyed.

        \error
            May throw an exception if the passed %Pylon device is open.
            Does not throw C++ exceptions if the passed %Pylon device is closed or NULL.
        */
        public CInstantCamera( IPylonDevice pDevice, @Cast("Pylon::ECleanup") int cleanupProcedure/*=Pylon::Cleanup_Delete*/) { allocate(pDevice, cleanupProcedure); }
        private native void allocate( IPylonDevice pDevice, @Cast("Pylon::ECleanup") int cleanupProcedure/*=Pylon::Cleanup_Delete*/);
        public CInstantCamera( IPylonDevice pDevice) { allocate(pDevice); }
        private native void allocate( IPylonDevice pDevice);


        /**
        \brief Destroys an Instant Camera object.

        Calls Attach( NULL) for destroying or removing a %Pylon device depending on the passed cleanup procedure.

        \error
            Does not throw C++ exceptions.
        */


        /**
        \brief  Attaches a %Pylon device to the Instant Camera.
         
        \param[in]  pDevice The %Pylon device to attach.
        \param[in]  cleanupProcedure If cleanupProcedure equals Cleanup_Delete, the %Pylon device is destroyed when the Instant Camera object is destroyed.

        <ul>
        <li> If a %Pylon device is currently attached, it is destroyed (DestroyDevice()) or removed (DetachDevice()) depending on the previously set cleanup procedure value.
        <li> If the pDevice parameter is NULL, nothing more is done.
        <li> The OnAttach configuration event is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        <li> The new %Pylon device is attached.
        <li> If the passed %Pylon device is open, callbacks for camera events are registered at the camera node map. (This may fail)
        <li> If the passed %Pylon device is open, a device removal call back is registered. (This may fail)
        <li> If the passed %Pylon device is open, access modifiers (see IPylonDevice::Open()) are overtaken as camera parameters.
        <li> The OnAttached configuration event is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        </ul>

        \post
        <ul>
        <li>If the passed pointer to the %Pylon device is NULL, the Instant Camera object is in the "no device attached" state.
        <li>If the passed pointer to the %Pylon device is not NULL, the passed %Pylon device is attached.
        <li>If the set cleanup procedure equals Cleanup_Delete, the %Pylon device is destroyed when the Instant Camera object is destroyed or a new device is attached.
        <li>If the passed %Pylon device is open and the registration of callbacks fails, the Instant Camera object is in the "no device attached" state.
        <li>The opened-by-user flag is set, preventing closing of the %Pylon device on StopGrabbing() when the attached %Pylon device is already open.
        </ul>

        \error
            May throw an exception if the passed %Pylon device is open.
            Does not throw C++ exceptions if the passed %Pylon device is closed or NULL.

         \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void Attach( IPylonDevice pDevice, @Cast("Pylon::ECleanup") int cleanupProcedure/*=Pylon::Cleanup_Delete*/);
        public native void Attach( IPylonDevice pDevice);


        /**
        \brief Returns the %Pylon device attached state of the Instant Camera object.

        \return True if a %Pylon device is attached.

        \error
            Does not throw C++ exceptions.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsPylonDeviceAttached();


        /**
        \brief Returns the connection state of the camera device.

        The device removal is only detected while the Instant Camera and therefore the attached %Pylon device are open.

        The attached %Pylon device is not operable anymore if the camera device has been removed from the PC.
        After it is made sure that no access to the %Pylon device or any of its node maps is made anymore
        the %Pylon device should be destroyed using InstantCamera::DeviceDestroy().
        The access to the %Pylon device can be protected using the lock provided by GetLock(), e.g. when accessing parameters.

        \return True if the camera device removal from the PC has been detected.

        \error
            Does not throw C++ exceptions.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsCameraDeviceRemoved();


        /**
        \brief Returns the ownership of the attached %Pylon device.

        \return True if a %Pylon device is attached and the Instant Camera object has been given the ownership
                by passing the cleanup procedure Cleanup_Delete when calling Attach().

        \error
            Does not throw C++ exceptions.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean HasOwnership();


        /**
        \brief  Destroys the attached %Pylon device.

        \attention The node maps, e.g. the camera node map, of the attached %Pylon device must not be accessed anymore while destroying the %Pylon device.

        <ul>
        <li> If no %Pylon device is attached, nothing is done.
        <li> If the %Pylon device is open, it is closed by calling Close().
        <li> The configuration event OnDestroy is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        <li> The %Pylon device is destroyed even if the cleanup procedure Cleanup_None has been passed when calling Attach() before.
        <li> The configuration event OnDestroyed is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        </ul>

        \post No %Pylon device is attached.
                
        \error
            Does not throw C++ exceptions. Possible C++ exceptions are caught and ignored.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void DestroyDevice();


        /**
        \brief  Detaches an attached %Pylon device.

        <ul>
        <li> If no %Pylon device is attached, nothing is done.
        <li> If a grab is in progress, it is stopped by calling StopGrabbing().
        <li> The configuration event OnDetach is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        <li> The %Pylon device is detached.
        <li> The configuration event OnDetached is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        </ul>

        \return The attached %Pylon device or NULL if nothing has been attached before.
        
        \post
        <ul>
        <li> No %Pylon device is attached.
        <li> The ownership of the %Pylon device goes to the caller who is responsible for destroying the %Pylon device.
        </ul>
        
        \error
            Does not throw C++ exceptions. Possible C++ exceptions are caught and ignored.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native IPylonDevice DetachDevice();


        //Control opening and closing of the device-----------------------------

        /**
        \brief Opens the attached %Pylon device.

        <ul>
        <li> Opened by user flag is set, preventing closing of the device on StopGrabbing().
        <li> If the %Pylon device is already open, nothing more is done.
        <li> The OnOpen configuration event is fired. The notification of event handlers stops when an event call triggers an exception.
        <li> The %Pylon device is opened.
        <li> A device removal call back is registered at the %Pylon device.
        <li> Callbacks for camera events are registered at the camera node map.
        <li> The OnOpened configuration event is fired if the %Pylon device has been opened successfully. The notification of event handlers stops when an event call triggers an exception.
        </ul>

        \pre A %Pylon device is attached.

        \post
        <ul>
        <li> The %Pylon device is open.
        <li> Opened by user flag is set, preventing closing of the %Pylon device on StopGrabbing().
        </ul>

        \error
            The Instant Camera object is still valid after error.
            The %Pylon device open may throw.
            Configuration event calls may throw.
            Callback registrations may throw.
            The %Pylon device is closed with Close() if the OnOpened event call triggers an exception.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void Open();


        /**
        \brief Returns the open state of the %Pylon device.
        \error Does not throw C++ exceptions.
        \return Returns true if a %Pylon device is attached and it is open.
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsOpen();


        /**
        \brief Closes the attached %Pylon device.

        <ul>
        <li> If no %Pylon device is attached, nothing is done.
        <li> If the %Pylon device is already closed, nothing is done.
        <li> If a grab is in progress, it is stopped by calling StopGrabbing().
        <li> The configuration event OnClose is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        <li> The %Pylon device is closed.
        <li> The configuration event OnClosed is fired if the %Pylon device has been closed successfully. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        </ul>

        \post The %Pylon device is closed.
        
        \error
            Does not throw C++ exceptions. Possible C++ exceptions are caught and ignored.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void Close();
        

        //Grab -----------------------------------------------------------------

        /**
        \brief Starts the grabbing of images.

        <ul>
        <li> If a grab loop thread has been used in the last grab session, the grab loop thread context is joined with the caller's context.
        <li> If the %Pylon device is not already open, it is opened by calling Open().
        <li> The configuration event OnGrabStart is fired. The notification of event handlers stops when an event call triggers an exception.
        <li> Grab-specific parameters of the camera object are locked, e.g. MaxNumBuffers.
        <li> If the camera device parameter ChunkModeActive is enabled, the Instant Camera chunk parsing support is initialized.
        <li> If the Instant Camera parameter GrabCameraEvents is enabled, the Instant Camera event grabbing support is initialized.
        <li> The grabbing is started.
        <li> The configuration event OnGrabStarted is fired if the grab has been started successfully. The notification of event handlers stops when an event call triggers an exception.
        <li> If grabLoopType equals GrabLoop_ProvidedByInstantCamera, an additional grab loop thread is started calling RetrieveResult( GrabLoopThreadTimeout, grabResult) in a loop.
        </ul>

        \param[in]  strategy The grab strategy. See Pylon::EGrabStrategy for more information
        \param[in]  grabLoopType If grabLoopType equals GrabLoop_ProvidedByInstantCamera, an additional grab loop thread is used to run the grab loop.

        \pre 
        <ul>
        <li> A %Pylon device is attached.
        <li> The stream grabber of the %Pylon device is closed.
        <li> The grabbing is stopped.
        <li> The attached %Pylon device supports grabbing.
        <li> Must not be called while holding the lock provided by GetLock() when using the grab loop thread.
        </ul>

        \post
        <ul>
        <li> The grabbing is started.
        <li> Grab-specific parameters of the camera object are locked, e.g. MaxNumBuffers.
        <li> If grabLoopType equals GrabLoop_ProvidedByInstantCamera, an additional grab loop thread is running that calls RetrieveResult( GrabLoopThreadTimeout, grabResult) in a loop. Images are processed by registered image event handlers.
        <li> Operating the stream grabber from outside the camera object will result in undefined behavior.
        </ul>

        \error
            The Instant Camera object is still valid after error. Open() may throw. Configuration event calls may throw. The grab implementation may throw.
            The grabbing is stopped with StopGrabbing() if the OnGrabStarted event call triggers an exception. Throws a C++ exception, if Upcoming Image grab strategy
            is used together with USB camera devices.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void StartGrabbing( @Cast("Pylon::EGrabStrategy") int strategy/*=Pylon::GrabStrategy_OneByOne*/, @Cast("Pylon::EGrabLoop") int grabLoopType/*=Pylon::GrabLoop_ProvidedByUser*/);
        public native void StartGrabbing();


        /**
        \brief Starts the grabbing for a maximum number of images.
    
        Extends the StartGrabbing(EStrategy, EGrabLoop) by a number of images to grab. If the passed count of images has been reached, StopGrabbing is called
        automatically. The images are counted according to the grab strategy. Skipped images are not taken into account.

        The amount of allocated buffers is reduced to maxImages when grabbing fewer images 
        than according to the value of the \link Pylon::CInstantCamera::MaxNumBuffer \c MaxNumBuffer \endlink parameter
        and the grab strategy is GrabStrategy_OneByOne.

        \param[in]  maxImages The count of images to grab. This value must be larger than one.
        \param[in]  strategy The grab strategy. See Pylon::InstantCamera::EStrategy for more information.
        \param[in]  grabLoopType If grabLoopType equals GrabLoop_ProvidedByInstantCamera, an additional grab loop thread is used to run the grab loop.

        \threading
            This method is synchronized using the lock provided by GetLock(). 
        */
        public native void StartGrabbing( @Cast("size_t") int maxImages, @Cast("Pylon::EGrabStrategy") int strategy/*=Pylon::GrabStrategy_OneByOne*/, @Cast("Pylon::EGrabLoop") int grabLoopType/*=Pylon::GrabLoop_ProvidedByUser*/);
        public native void StartGrabbing( @Cast("size_t") int maxImages);


        /**
        \brief Retrieves a grab result according to the strategy, waits if it is not yet available
         
        <ul>
        <li> The content of the passed grab result is released.
        <li> If no %Pylon device is attached or the grabbing is not started, the method returns immediately "false".
        <li> Wait for a grab result if it is not yet available. The access to the camera is not locked during waiting. Camera events are handled.
        <li> Only if camera events are used: Incoming camera events are handled.
        <li> One grab result is retrieved per call according to the strategy applied.
        <li> Only if chunk mode is used: The chunk data parsing is performed. The grab result data is updated using chunk data.
        <li> The image event OnImagesSkipped is fired if grab results have been skipped according to the strategy. The notification of event handlers stops when an event call triggers an exception.
        <li> The image event OnImageGrabbed is fired if a grab result becomes available. The notification of event handlers stops when an event call triggers an exception.
        <li> Stops the grabbing by calling StopGrabbing() if the maximum number of images has been grabbed.
        </ul>

        It needs to be checked whether the grab represented by the grab result has been successful, see CGrabResultData::GrabSucceeded().

        \param[in]  timeoutMs  A timeout value in ms for waiting for a grab result, or the INFINITE value.
        \param[out] grabResult  Receives the grab result.
        \param[in]  timeoutHandling  If timeoutHandling equals TimeoutHandling_ThrowException, a timeout exception is thrown on timeout.
        
        \return True if the call successfully retrieved a grab result, false otherwise.
         
        \pre
        <ul>
        <li> There is no other thread waiting for a result. This will be the case when the Instant Camera grab loop thread is used.
        </ul>
         
        \post
        <ul>
        <li> If a grab result has been retrieved, one image is removed from the output queue and is returned in the grabResult parameter.
        <li> If no grab result has been retrieved, an empty grab result is returned in the grabResult parameter.
        <li> If the maximum number of images has been grabbed, the grabbing is stopped.
        <li> If camera event handling is enabled and camera events were received, at least one or more camera event messages have been processed.
        </ul>
        
        \error
            The Instant Camera object is still valid after error. The grabbing is stopped if an exception is thrown.

        \threading
            This method is synchronized using the lock provided by GetLock() while not waiting.
        */
        public native @Cast("bool") boolean RetrieveResult( @Cast("unsigned int") int timeoutMs, @ByRef CGrabResultPtr grabResult, @Cast("Pylon::ETimeoutHandling") int timeoutHandling/*=Pylon::TimeoutHandling_ThrowException*/);
        public native @Cast("bool") boolean RetrieveResult( @Cast("unsigned int") int timeoutMs, @ByRef CGrabResultPtr grabResult);


        /**
        \brief Stops the grabbing of images.

        <ul>
        <li> Nothing is done if the Instant Camera is not currently grabbing.
        <li> The configuration event OnGrabStop is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        <li> The grabbing is stopped.
        <li> All buffer queues of the Instant Camera are cleared.
        <li> The OnGrabStopped configuration event is fired if the grab has been stopped successfully. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        <li> If the Instant Camera has been opened by StartGrabbing, it is closed by calling Close().
        <li> Grab-specific parameters of the camera object are unlocked, e.g. MaxNumBuffers.
        </ul>

        \post
        <ul>
        <li> The grabbing is stopped.
        <li> If the %Pylon device has been opened by StartGrabbing and no other camera object service requires it to be open, it is closed.
        <li> Grab specific parameters of the camera object are unlocked, e.g. MaxNumBuffers.
        </ul>

        \error
            Does not throw C++ exceptions. Possible C++ exceptions are caught and ignored.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void StopGrabbing();


        /**
        \brief Returns state of grabbing.

        The camera object is grabbing after a successful call to StartGrabbing() until StopGrabbing() is called.

        \return Returns true if still grabbing.

        \error
            Does not throw C++ exceptions.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsGrabbing();


        /**
        \brief Grabs one image.

        The following code shows a simplified version of what is done (happy path):

        \code
            //grab one image
            StartGrabbing( 1, GrabStrategy_OneByOne, GrabLoop_ProvidedByUser);

            //grab is stopped automatically due to maxImages = 1
            return RetrieveResult( timeoutMs, grabResult, timeoutHandling) && grabResult->GrabSucceeded();
        \endcode

        GrabOne() can be used to together with the CAcquireSingleFrameConfiguration.

        \note Using GrabOne is more efficient if the %Pylon device is already open, otherwise the %Pylon device is opened and closed for each call. 

        \note Grabbing single images using Software Trigger (CSoftwareTriggerConfiguration) is recommended if you want to maximize frame rate.
              This is because the overhead per grabbed image is reduced compared to Single Frame Acquisition.
              The grabbing can be started using StartGrabbing().
              Images are grabbed using the WaitForFrameTriggerReady(), ExecuteSoftwareTrigger() and RetrieveResult() methods instead of using GrabOne.
              The grab can be stopped using StopGrabbing() when done.

        \param[in]  timeoutMs  A timeout value in ms for waiting for a grab result, or the INFINITE value. 
        \param[out] grabResult  Receives the grab result.
        \param[in]  timeoutHandling  If timeoutHandling equals TimeoutHandling_ThrowException, a timeout exception is thrown on timeout.

        \return Returns true if the call successfully retrieved a grab result and the grab succeeded (CGrabResultData::GrabSucceeded()).

        \pre Must meet the preconditions of start grabbing.
        \post Meets the postconditions of stop grabbing.

        \error
            The Instant Camera object is still valid after error. See StartGrabbing(), RetrieveResult(), and StopGrabbing() .
            In the case of exceptions after StartGrabbing() the grabbing is stopped using StopGrabbing().
        */
        public native @Cast("bool") boolean GrabOne( @Cast("unsigned int") int timeoutMs, @ByRef CGrabResultPtr grabResult, @Cast("Pylon::ETimeoutHandling") int timeoutHandling/*=Pylon::TimeoutHandling_ThrowException*/);
        public native @Cast("bool") boolean GrabOne( @Cast("unsigned int") int timeoutMs, @ByRef CGrabResultPtr grabResult);


        /**
        \brief Deprecated: This method has been deprecated. Use the NumQueuedBuffers parameter instead.
        \return The number of buffers that are queued for grabbing.
        */
        public native @Cast("size_t") int GetQueuedBufferCount();


        /**
        \brief Provides access to a wait object indicating available grab results.

        \return A wait object indicating available grab results.

        \error
            Does not throw C++ exceptions.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Const @ByRef WaitObject GetGrabResultWaitObject();


        /**
        \brief Provides access to a wait object indicating that the grabbing has stopped.

        \return A wait object indicating that the grabbing has stopped.

        \error
            Does not throw C++ exceptions.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Const @ByRef WaitObject GetGrabStopWaitObject();


        /**
        \brief Provides access to a wait object indicating available camera events.

        This wait object is %Pylon device specific and changes when a new %Pylon device is attached to
        the camera.

        \return A wait object indicating available camera events.

        \pre
        <ul>
        <li> A %Pylon device is attached.
        <li> The %Pylon device is open.
        </ul>

        \error
            The Instant Camera object is still valid after error.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */

        public native @Const @ByRef WaitObject GetCameraEventWaitObject();


        //Event handling--------------------------------------------------------

        /**
        \brief Adds a configurator to the list of registered configurator objects.

        <ul>
        <li> If mode equals RegistrationMode_ReplaceAll, the list of registered configurators is cleared.
        <li> If pointer \c pConfigurator is not NULL, it is appended to the list of configurators.
        </ul>

        \param[in]  pConfigurator  The receiver of configuration events. 
        \param[in]  mode  Indicates how to register the new configurator.
        \param[in]  cleanupProcedure If cleanupProcedure equals Cleanup_Delete, the passed event handler is deleted when no longer needed.

        \post The configurator is registered and called on configuration events.

        \error
            Does not throw C++ exceptions, except when memory allocation fails.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void RegisterConfiguration( CConfigurationEventHandler pConfigurator, @Cast("Pylon::ERegistrationMode") int mode, @Cast("Pylon::ECleanup") int cleanupProcedure);


        /**
        \brief Removes a configurator from the list of registered configurator objects.

        If the configurator is not found, nothing is done.

        \param[in]  configurator  The registered receiver of configuration events. 

        \return True if successful

        \post
        <ul>
        <li> The configurator is deregistered.
        <li> If the configuration has been registered by passing a pointer and the cleanup procedure is Cleanup_Delete, the event handler is deleted.
        </ul>        
        
        \error
            Does not throw C++ exceptions.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean DeregisterConfiguration( CConfigurationEventHandler configurator);


        /**
        \brief Adds an image event handler to the list of registered image event handler objects.

        <ul>
        <li> If mode equals RegistrationMode_ReplaceAll, the list of registered image event handlers is cleared.
        <li> If pointer \c pImageEventHandler is not NULL, it is appended to the list of image event handlers.
        </ul>

        \param[in]  pImageEventHandler  The receiver of image events. 
        \param[in]  mode  Indicates how to register the new imageEventHandler.
        \param[in]  cleanupProcedure If cleanupProcedure equals Cleanup_Delete, the passed event handler is deleted when no longer needed.

        \post The imageEventHandler is registered and called on image related events.

        \error
            Does not throw C++ exceptions, except when memory allocation fails.

        \threading
            This method is synchronized using the internal image event handler registry lock.
        */
        public native void RegisterImageEventHandler( CImageEventHandler pImageEventHandler, @Cast("Pylon::ERegistrationMode") int mode, @Cast("Pylon::ECleanup") int cleanupProcedure);


        /**
        \brief Removes an image event handler from the list of registered image event handler objects.

        If the image event handler is not found, nothing is done.

        \param[in]  imageEventHandler  The registered receiver of configuration events. 

        \return True if successful

        \post
        <ul>
        <li> The imageEventHandler is deregistered.
        <li> If the image event handler has been registered by passing a pointer and the cleanup procedure is Cleanup_Delete, the event handler is deleted.
        </ul>
        
        \error
            Does not throw C++ exceptions.

        \threading
            This method is synchronized using the internal image event handler registry lock.
        */
        public native @Cast("bool") boolean DeregisterImageEventHandler( CImageEventHandler imageEventHandler);


        /**
        \brief Adds an camera event handler to the list of registered camera event handler objects.

        <ul>
        <li> If mode equals RegistrationMode_ReplaceAll, the list of registered camera event handlers is cleared.
        <li> If the pointer \c pCameraEventHandler is not NULL, it is appended to the list of camera event handlers.
        </ul>

        \param[in]  pCameraEventHandler  The receiver of camera events. 
        \param[in]  nodeName  The name of the event data node updated on camera event, e.g. "ExposureEndEventTimestamp" for exposure end event.
        \param[in]  userProvidedId  This ID is passed as a parameter in CCameraEventHandler::OnCameraEvent and can be used to distinguish between different events.
                                    It is recommended to create an own application specific enum and use it's values as IDs.
        \param[in]  mode  Indicates how to register the new cameraEventHandler.
        \param[in]  cleanupProcedure If cleanupProcedure equals Cleanup_Delete, the passed event handler is deleted when no longer needed.
        \param[in]  availability  If availability equals CameraEventAvailability_Mandatory, the camera must support the data node specified by node name.
                                  If not, an exception is thrown when the Instant Camera is open, the Instant Camera is opened, or an open %Pylon device is attached.

        Internally, a GenApi node call back is registered for the node identified by \c nodeName.
        This callback triggers a call to the \c CCameraEventHandler::OnCameraEvent() method.
        That's why a Camera Event Handler can be registered for any node of the camera node map to get informed about changes.

        \post The cameraEventHandler is registered and called on camera events.

        \error
            Throws an exception if the availability is set to CameraEventAvailability_Mandatory and the node with the name \c nodeName is not available in the camera node map (see GetNodeMap()).
            Throws an exception fail if the node callback registration fails.
            The event handler is not registered when an C++ exception is thrown.

        \threading
            This method is synchronized using the camera event handler lock. If the camera is open, the lock provided by GetLock() and the camera 
            node map lock are also used for synchronization.
        */
        
        public native void RegisterCameraEventHandler(
                    CCameraEventHandler pCameraEventHandler,
                    @Cast("const Pylon::String_t*") @ByRef gcstring nodeName,
                    @Cast("intptr_t") long userProvidedId,
                    @Cast("Pylon::ERegistrationMode") int mode,
                    @Cast("Pylon::ECleanup") int cleanupProcedure,
                    @Cast("Pylon::ECameraEventAvailability") int availability/*=Pylon::CameraEventAvailability_Mandatory*/);
        public native void RegisterCameraEventHandler(
                    CCameraEventHandler pCameraEventHandler,
                    @Cast("const Pylon::String_t*") @ByRef gcstring nodeName,
                    @Cast("intptr_t") long userProvidedId,
                    @Cast("Pylon::ERegistrationMode") int mode,
                    @Cast("Pylon::ECleanup") int cleanupProcedure);


        /**
        \brief Removes a camera event handler from the list of registered camera event handler objects.

        If the camera event handler is not found, nothing is done.

        \param[in]  cameraEventHandler  The registered receiver of camera events. 
        \param[in]  nodeName  The name of the event data node updated on camera event, e.g. "ExposureEndEventTimestamp" for exposure end event.
        
        \return True if successful

        \post
        <ul>
        <li> The cameraEventHandler is deregistered.
        <li> If the camera event handler has been registered by passing a pointer and the cleanup procedure is Cleanup_Delete, the event handler is deleted.
        </ul>
        
        \error
            Does not throw C++ exceptions.

        \threading
        This method is synchronized using the camera event handler lock. If the camera is open, the camera node map lock
        is also used for synchronization.
        */
        public native @Cast("bool") boolean DeregisterCameraEventHandler( CCameraEventHandler cameraEventHandler, @Cast("const Pylon::String_t*") @ByRef gcstring nodeName);



        //Additional features---------------------------------------------------
        
        /**
        \brief Actively waits until the the camera is ready to accept a frame trigger.

        The implementation selects 'FrameTriggerWait' for the 'AcquisitionStatusSelector'
        and waits until the 'AcquisitionStatus' is true.
        If the above mentioned nodes do are not available and the SoftwareTrigger node is readable,
        the implementation waits for SoftwareTrigger.IsDone().

        The WaitForFrameTriggerReady method does not work for A600 Firewire cameras.

        \param[in]  timeoutMs The timeout in ms for active waiting.
        \param[in]  timeoutHandling  If timeoutHandling equals TimeoutHandling_ThrowException, a timeout exception is thrown on timeout.
        \return True if the camera can execute a frame trigger.

        \pre The 'AcquisitionStatusSelector' node is writable and the 'AcquisitionStatus' node is readable or the 'SoftwareTrigger' node is readable.
             This depends on the used camera model.

        \error
            Accessing the camera registers may fail.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean WaitForFrameTriggerReady( @Cast("unsigned int") int timeoutMs, @Cast("Pylon::ETimeoutHandling") int timeoutHandling/*=Pylon::TimeoutHandling_ThrowException*/);
        public native @Cast("bool") boolean WaitForFrameTriggerReady( @Cast("unsigned int") int timeoutMs);


        /**
        \brief Executes the software trigger command.

        The camera needs to be configured for software trigger mode.
        Additionally, the camera needs to be ready to accept triggers.
        When triggering a frame this can be checked using the WaitForFrameTriggerReady() method;

        \note The application has to make sure that the correct trigger is selected
              before calling ExecuteSoftwareTrigger().
              This can be done via the camera's TriggerSelector node.
              The \c Pylon::CSoftwareTriggerConfiguration
              selects the correct trigger when the Instant Camera is opened.

        \pre
        <ul>
        <li> The grabbing is started.
        <li> The camera device supports software trigger.
        <li> The software trigger is available. This depends on the configuration of the camera device.
        </ul>

        \error
            Accessing the camera registers may fail. Throws an exception on timeout if \c timeoutHandling is TimeoutHandling_ThrowException.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void ExecuteSoftwareTrigger();


        /**
        \brief Sets a context that is attached to each grab result of the camera object on RetrieveResult().
        This is useful when handling multiple cameras. It has nothing in common with the context passed to the stream grabber when queuing a buffer.

        \error
            Does not throw C++ exceptions.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void SetCameraContext( @Cast("intptr_t") long context);


        /**
        \brief Returns the context that is attached to each grab result of the camera object

        \error
            Does not throw C++ exceptions.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("intptr_t") long GetCameraContext();


        /**
        \brief Provides access to the device info object of the attached %Pylon device or an empty one.
        \return The info object of the attached %Pylon device or an empty one.

        \error
            Does not throw C++ exceptions.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Const @ByRef CDeviceInfo GetDeviceInfo();


        /**
        \brief Provides access to the node map of the camera device.

        The %Pylon device must be opened before reading ore writing any parameters of the camera device.
        This can be done using the Open() method of the Instant Camera class.

        \return Reference to the node map of the camera device.

        \pre A %Pylon device is attached. 

        \error
            The Instant Camera object is still valid after error.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByRef INodeMap GetNodeMap();


        /**
        \brief Provides access to the transport layer node map of the attached %Pylon device.
        \return Reference to the transport layer node map of the attached %Pylon device 
            or the reference to the empty node map if a transport layer node map is not supported.
            The GenApi::INodeMap::GetNumNodes() method can be used to check whether the node map is empty.

        \pre A %Pylon device is attached.

        \error
            The Instant Camera object is still valid after error.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByRef INodeMap GetTLNodeMap();


        /**
        \brief Provides access to the stream grabber node map of the attached %Pylon device.
        \return Reference to the stream grabber node map of the attached %Pylon device 
            or the reference to the empty node map if grabbing is not supported.
            The GenApi::INodeMap::GetNumNodes() method can be used to check whether the node map is empty.

        \pre 
        <ul>
        <li> A %Pylon device is attached.
        <li> The %Pylon device is open.
        </ul>  

        \error
            The Instant Camera object is still valid after error.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByRef INodeMap GetStreamGrabberNodeMap();


        /**
        \brief Provides access to the event grabber node map of the attached %Pylon device.
        \return Reference to the event grabber node map of the attached %Pylon device 
            or a reference to the empty node map if event grabbing is not supported.
            The GenApi::INodeMap::GetNumNodes() method can be used to check whether the node map is empty.

        \pre 
        <ul>
        <li> A %Pylon device is attached.
        <li> The %Pylon device is open.
        </ul>  

        \error
            The Instant Camera object is still valid after error.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByRef INodeMap GetEventGrabberNodeMap();


        /**
        \brief Provides access to the node map of the Instant Camera object.

        The node map of the camera device is made available by the GetNodeMap() method.

        \return Reference to the node map of the Instant Camera object.

        \error
            Does not throw C++ exceptions.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByRef INodeMap GetInstantCameraNodeMap();


        /**
        \brief Sets an alternative buffer factory that is used for buffer allocation.

        This use of this method is optional and intended for advanced use cases only.

        If NULL is passed as buffer factory then the default buffer factory is used.
        Buffers are allocated when StartGrabbing is called.
        A buffer factory must not be deleted while it is attached to the camera object
        and it must not be deleted until the last buffer is freed. To free all buffers
        the grab needs to be stopped and all grab results must be released or destroyed.

        \param[in]  pFactory  A pointer to a buffer factory.
        \param[in]  cleanupProcedure If ownership is cleanupProcedure Cleanup_Delete, the passed factory is destroyed when no longer needed.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void SetBufferFactory( IBufferFactory pFactory, @Cast("Pylon::ECleanup") int cleanupProcedure/*=Pylon::Cleanup_Delete*/);
        public native void SetBufferFactory( IBufferFactory pFactory);


        /**
        \brief Returns true if an IEEE 1394 %Pylon device is attached to the Instant Camera object.

        This method is provided for convenience only. The device type can also be determined as shown in the following example.

        \code
        #include <pylon/DeviceClass.h>
        ...
        if (camera.GetDeviceInfo().GetDeviceClass() == Basler1394DeviceClass)
        {
            ...
        }
        \endcode

        \threading
        This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean Is1394();


        /**
        \brief Returns true if a GigE %Pylon device is attached to the Instant Camera object.

        This method is provided for convenience only. The device type can also be determined as shown in the following example.

        \code
        #include <pylon/DeviceClass.h>
        ...
        if (camera.GetDeviceInfo().GetDeviceClass() == BaslerGigEDeviceClass)
        {
        ...
        }
        \endcode

        \threading
        This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsGigE();


        /**
        \brief Returns true if a USB %Pylon device is attached to the Instant Camera object.

        This method is provided for convenience only. The device type can also be determined as shown in the following example.

        \code
        #include <pylon/DeviceClass.h>
        ...
        if (camera.GetDeviceInfo().GetDeviceClass() == BaslerUsbDeviceClass)
        {
        ...
        }
        \endcode

        \threading
        This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsUsb();


        /**
        \brief Returns true if a Camera Link %Pylon device is attached to the Instant Camera object.

        This method is provided for convenience only. The device type can also be determined as shown in the following example.

        \code
        #include <pylon/DeviceClass.h>
        ...
        if (camera.GetDeviceInfo().GetDeviceClass() == BaslerCameraLinkDeviceClass)
        {
        ...
        }
        \endcode

        \threading
        This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsCameraLink();
    

        /**
        \brief Returns the SFNC version read from the camera node map.

        The SFNC version is read from the camera node map using the integer nodes 
        DeviceSFNCVersionMajor, DeviceSFNCVersionMinor, and DeviceSFNCVersionSubMinor.

        \return The SFNC version used by the camera device. The returned SFNC version is 0.0.0 (Pylon::Sfnc_VersionUndefined)
                if no SFNC version information is provided by the camera device.

        \pre A %Pylon device is attached.

        \error
            The Instant Camera object is still valid after error.

        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByVal VersionInfo GetSfncVersion();


        //Types used by camera--------------------------------------------------

        /** The type of the camera class */
        /** \copybrief Pylon::IPylonDevice */
        /** \copybrief Pylon::CDeviceInfo */
        /** The generic configuration event handler class */
        /** The generic image event handler class */
        /** The generic image event handler class */
        /** The generic grab result data */
        /** The generic grab result smart pointer */
        // Internal use only. Subject to change without notice.
        public native @ByRef IInstantCameraExtensions GetExtensionInterface();
    }

    /** 
     * @}
     */

// #ifdef _MSC_VER
// #pragma warning( pop ) 
// #endif

// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_INSTANTCAMERA_H_08725703 */


}
