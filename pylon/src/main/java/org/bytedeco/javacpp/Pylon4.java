// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.GenICam3.*;

public class Pylon4 extends org.bytedeco.javacpp.presets.Pylon4 {
    static { Loader.load(); }

// Parsed from <pylon/Platform.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2008-2015 Basler AG
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

// #   define PYLON_HAS_AVI_SUPPORT

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

//TODO this works only on a C99 compiler. We must ensure, that things like SIZE_MAX UINTPTR_MAX are always defined
// #   define  __STDC_LIMIT_MACROS
// #   define  __STDC_CONSTANT_MACROS

// #   include <pylon/api_autoconf.h>
// #   include <stdint.h>

// gnu compiler needs explicit visibility of interfaces, so dynamic_cast works
// #   define PUBLIC_INTERFACE APIEXPORT

// define PYLON_XX_BUILD to distinguish between 32 & 64 bit builds
// __WORDSIZE is not always defined and sometimes set to 32 on 64 bit platforms. So we prefer other sources.
// #if __GNUC__
// #   if __x86_64__ || __ppc64__ || __powerpc64__
// #       define PYLON_64_BUILD
// #   else
// #       define PYLON_32_BUILD
// #   endif
// #else
//fallback to the unsafe wordsize method
// #   if __WORDSIZE == 32
// #       define PYLON_32_BUILD
// #   elif __WORDSIZE == 64
// #       define PYLON_64_BUILD
// #   else
// #       error unsupported wordsize (32/64 platform)
// #   endif
// #endif


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
//  Copyright (c) 2006-2015 Basler AG
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


// namespace aliases
// #include <Base/GCNamespace.h>
// #include <GenApi/GenApiNamespace.h>

// #include <pylon/TypeMappings.h> // for String_t, StringList_t 
    /** Pylon's string definition */
    /** Pylon's string list definition */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif //__STDINCLUDE_H__


// Parsed from <pylon/PylonBase.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  AH
//-----------------------------------------------------------------------------
/**
\file
\brief  Function and classes for initializing the pylon runtime.
*/
// #pragma once

// #ifndef PYLONBASE_H__
// #define PYLONBASE_H__

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
  <p>
  You must call PylonInitialize before calling any other pylon functions.
  When finished you must call PylonTerminate to free up all resources used by pylon.
  <p>
  You can use the helperclass PylonAutoInitTerm to let the compiler call
  PylonInitialze and PylonTerminate.
  <p>
  Just create a local object on the stack in your main function and
  the constructor and destructor will call the functions.
  See PylonAutoInitTerm for a sample.
  <p>
  PylonInitialize/PylonTerminate is reference counted. For every call of PylonInitialize, a call to PylonTerminate is required.
  The last call to PylonTerminate will free up all resources.
  <p>
  \if windows
  For MFC applications we recommend to call PylonInitialize and PylonTerminate in the
  application's InitInstance() and ExitInstance() methods.
  This prevents the MFC runtime from reporting a huge number of pretended memory leaks.
  \endif
  <p>
  */
@Namespace("Pylon") public static native void PylonInitialize();

/**
    \brief Frees up resources allocated by the pylon runtime system.
    <p>
    Call this function before terminating the application. Don't use any pylon methods or pylon objects after
    having called PylonTerminate().
    <p>
    PylonInitialize/PylonTerminate is reference counted. For every call of PylonInitialize, a call to PylonTerminate is required.
    The last call to PylonTerminate will free up all resources.
    */
@Namespace("Pylon") public static native void PylonTerminate(@Cast("bool") boolean ShutDownLogging/*=true*/);
@Namespace("Pylon") public static native void PylonTerminate();

/**
    \brief Returns the version number of pylon
    <p>
    It is possible to pass a NULL pointer for a version number category if the value is not of interest.
    */ @Namespace("Pylon") public static native void GetPylonVersion( @Cast("unsigned int*") IntPointer major, @Cast("unsigned int*") IntPointer minor, @Cast("unsigned int*") IntPointer subminor, @Cast("unsigned int*") IntPointer build);
@Namespace("Pylon") public static native void GetPylonVersion( @Cast("unsigned int*") IntBuffer major, @Cast("unsigned int*") IntBuffer minor, @Cast("unsigned int*") IntBuffer subminor, @Cast("unsigned int*") IntBuffer build);
@Namespace("Pylon") public static native void GetPylonVersion( @Cast("unsigned int*") int[] major, @Cast("unsigned int*") int[] minor, @Cast("unsigned int*") int[] subminor, @Cast("unsigned int*") int[] build);

/**
    \brief Returns the version number of pylon as string.
    */ @Namespace("Pylon") public static native @Cast("const char*") BytePointer GetPylonVersionString();

/**
    \brief Helper class to automagically call PylonInitialize and PylonTerminate in constructor and destructor
    <p>
    <pre>{@code

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
    }</pre>
*/



// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* PYLONBASE_H__ */


// Parsed from <pylon/PylonVersionInfo.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2009-2015 Basler AG
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
    <p>
    This class stores a four-part version number and provides comparison operators.
    If you use the constructor with one parameter, the version info object will be
    initialized with pylon base version numbers.
    <p>
    You can also call the static getVersionString() method to retrieve
    a string containing the complete version separated by dots.
    */
    @Namespace("Pylon") @NoOffset public static class VersionInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public VersionInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public VersionInfo(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public VersionInfo position(int position) {
            return (VersionInfo)super.position(position);
        }
    
        /** Constructs a version info object using pylon base version numbers.
         *  If checkBuild is set to false, the build number will not be used in comparison operators. */
        public VersionInfo(@Cast("bool") boolean checkBuild/*=false*/) { super((Pointer)null); allocate(checkBuild); }
        private native void allocate(@Cast("bool") boolean checkBuild/*=false*/);
        public VersionInfo() { super((Pointer)null); allocate(); }
        private native void allocate();


        /** Constructs a version info object using the version number parts passed. */
        public VersionInfo(@Cast("unsigned int") int major,
                            @Cast("unsigned int") int minor,
                            @Cast("unsigned int") int subminor) { super((Pointer)null); allocate(major, minor, subminor); }
        private native void allocate(@Cast("unsigned int") int major,
                            @Cast("unsigned int") int minor,
                            @Cast("unsigned int") int subminor);


        /** Constructs a version info object using the version number parts passed. */
        public VersionInfo(@Cast("unsigned int") int major,
                            @Cast("unsigned int") int minor,
                            @Cast("unsigned int") int subminor,
                            @Cast("unsigned int") int build) { super((Pointer)null); allocate(major, minor, subminor, build); }
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
//  Copyright (c) 2006-2015 Basler AG
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
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IProperties(Pointer p) { super(p); }
    
        /** Retrieves a list of property names */
        public native int GetPropertyNames( @Cast("Pylon::StringList_t*") @ByRef GenICam::gcstring_vector arg0 );
        /** Returns true if a property with the provided name is available */
        public native @Cast("bool") boolean GetPropertyAvailable( @Cast("const Pylon::String_t*") @ByRef GenICam::gcstring Name);
        /** Retrieves a property value */
        public native @Cast("bool") boolean GetPropertyValue( @Cast("const Pylon::String_t*") @ByRef GenICam::gcstring Name, @Cast("Pylon::String_t*") @ByRef GenICam::gcstring Value );
        /** Modifies a property value */
        public native @ByRef IProperties SetPropertyValue( @Cast("const Pylon::String_t*") @ByRef GenICam::gcstring Name, @Cast("const Pylon::String_t*") @ByRef GenICam::gcstring Value);
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
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public CInfoImpl() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CInfoImpl(Pointer p) { super(p); }
    }

    /**
    \brief Base implementation for PYLON info container.
    <p>
    Info container allow a generic access to implemented properties. All
    Properties and their values can be accessed without knowing them in
    advance. It is possible to enumerate all properties available and corresponding
    values. Properties and values are represented as String_t. The normal usage
    is to have enumerators that create the info objects and clients that read only.
    <p>
    If the type of the info object is known before client can use specific
    accessor function to retrieve the property values
    <p>
    */
    @Namespace("Pylon") @NoOffset public static class CInfoBase extends IProperties {
        static { Loader.load(); }
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
        public native @ByVal @Cast("Pylon::String_t*") GenICam::gcstring GetFriendlyName();
        ///Sets the above property.
        public native @ByRef CInfoBase SetFriendlyName( @Cast("const Pylon::String_t*") @ByRef GenICam::gcstring FriendlyNameValue);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsFriendlyNameAvailable();

        ///Retrieves the full name identifying the device.
        ///This property is identified by Key::FullNameKey.
        public native @ByVal @Cast("Pylon::String_t*") GenICam::gcstring GetFullName();
        ///Sets the above property.
        public native @ByRef CInfoBase SetFullName( @Cast("const Pylon::String_t*") @ByRef GenICam::gcstring FullNameValue);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsFullNameAvailable();

        ///Retrieves the vendor name of the device.
        ///This property is identified by Key::VendorNameKey.
        public native @ByVal @Cast("Pylon::String_t*") GenICam::gcstring GetVendorName();
        ///Sets the above property.
        public native @ByRef CInfoBase SetVendorName( @Cast("const Pylon::String_t*") @ByRef GenICam::gcstring VendorNameValue);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsVendorNameAvailable();

        ///Retrieves the device class device, e.g. Basler1394.
        ///This property is identified by Key::DeviceClassKey.
        public native @ByVal @Cast("Pylon::String_t*") GenICam::gcstring GetDeviceClass();
        ///Sets the above property.
        public native @ByRef CInfoBase SetDeviceClass( @Cast("const Pylon::String_t*") @ByRef GenICam::gcstring DeviceClassValue);
        ///Returns true if the above property is available.
        public native @Cast("bool") boolean IsDeviceClassAvailable();
        public static native @Cast("const char*") BytePointer GetPropertyNotAvailable();
        public native int GetPropertyNames( @Cast("Pylon::StringList_t*") @ByRef GenICam::gcstring_vector arg0 );
        public native @Cast("bool") boolean GetPropertyAvailable( @Cast("const Pylon::String_t*") @ByRef GenICam::gcstring Name);
        /* Returns the value of the property if this property is supported by the underlying implementation or "N/A". */
        public native @Cast("bool") boolean GetPropertyValue( @Cast("const Pylon::String_t*") @ByRef GenICam::gcstring Name, @Cast("Pylon::String_t*") @ByRef GenICam::gcstring Value );
        public native @ByRef IProperties SetPropertyValue( @Cast("const Pylon::String_t*") @ByRef GenICam::gcstring Name, @Cast("const Pylon::String_t*") @ByRef GenICam::gcstring Value);
        public native @Cast("bool") boolean IsUserProvided();
        public native @Cast("bool") boolean IsSubset( @Const @ByRef IProperties Subset);
    }


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif


}
