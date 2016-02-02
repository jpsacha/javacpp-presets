// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.GenICam3.*;

public class Pylon5 extends org.bytedeco.javacpp.presets.Pylon5 {
    static { Loader.load(); }

@Name("std::bitset<Pylon::_NumModes>") public static class BitSet__NumModes extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BitSet__NumModes(Pointer p) { super(p); }
    public BitSet__NumModes()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef BitSet__NumModes put(@ByRef BitSet__NumModes x);

    public native long size();

    @Index public native @ByRef boolean get(@Cast("size_t") long i);
    public native BitSet__NumModes put(@Cast("size_t") long i, boolean value);
}

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
        /**Identifies the human readable name of the device. */
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer FriendlyNameKey();
        /**Identifies the full name identifying the device. */
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer FullNameKey();
        /**Identifies the vendor name of the device. */
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer VendorNameKey();
        /**Identifies the device class device, e.g. Basler1394. */
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

        /**Retrieves the human readable name of the device.
        /**This property is identified by Key::FriendlyNameKey. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetFriendlyName();
        /**Sets the above property. */
        public native @ByRef CInfoBase SetFriendlyName( @Cast("const Pylon::String_t*") @ByRef gcstring FriendlyNameValue);
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsFriendlyNameAvailable();

        /**Retrieves the full name identifying the device.
         * This property is identified by Key::FullNameKey. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetFullName();
        /**Sets the above property. */
        public native @ByRef CInfoBase SetFullName( @Cast("const Pylon::String_t*") @ByRef gcstring FullNameValue);
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsFullNameAvailable();

        /**Retrieves the vendor name of the device.
         * This property is identified by Key::VendorNameKey. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetVendorName();
        /**Sets the above property. */
        public native @ByRef CInfoBase SetVendorName( @Cast("const Pylon::String_t*") @ByRef gcstring VendorNameValue);
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsVendorNameAvailable();

        /**Retrieves the device class device, e.g. Basler1394.
         * This property is identified by Key::DeviceClassKey. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetDeviceClass();
        /**Sets the above property. */
        public native @ByRef CInfoBase SetDeviceClass( @Cast("const Pylon::String_t*") @ByRef gcstring DeviceClassValue);
        /**Returns true if the above property is available. */
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
//  Copyright (c) 2006-2015 Basler AG
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
    <p>
    Enumerating the available Transport Layer objects returns a list of
    CTlInfo objects (Pylon::TlInfoList_t). A CTlInfo object holds information
    about the enumerated transport layer.
    */
// #ifdef PYLON_LINUX_BUILD
// #else
    //not exported to get delayed loading to work
    @Namespace("Pylon") public static class CTlInfo extends CInfoBase {
        static { Loader.load(); }
        /** Default native constructor. */
        public CTlInfo() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CTlInfo(int size) { super((Pointer)null); allocateArray(size); }
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
//  Copyright (c) 2008-2015 Basler AG
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
     * \{
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
     * \}
     */

// #endif


// Parsed from <pylon/DeviceInfo.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2015 Basler AG
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

    /**This namespace contains keys for accessing the properties of pylon info objects */
        /**Identifies the serial number if it supported by the underlying implementation */
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer SerialNumberKey();
        /**Identifies the user-defined name if present. */
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer UserDefinedNameKey();
        /**Identifies the model name of the device. */
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer ModelNameKey();
        /**Identifies the version string of the device. */
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer DeviceVersionKey();
        /**Identifies the identifier for the transport layer able to create this device. */
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer DeviceFactoryKey();
        /**Identifies the source of the XML used to create the node map of this device. */
        @Namespace("Pylon::Key") @MemberGetter public static native @Cast("const char*") BytePointer XMLSourceKey();
    

    /** Holds information about an enumerated device.
    /**
        The device enumeration process creates a list of CDeviceInfo objects
        (Pylon::DeviceInfoList_t). Each CDeviceInfo objects stores information
        about a device. The information is retrieved during the device enumeration process (ITransportLayer::EnumerateDevices resp.
        CTlFactory::EnumerateDevices)
        <p>
        \ingroup Pylon_TransportLayer
    */
    @Namespace("Pylon") public static class CDeviceInfo extends CInfoBase {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CDeviceInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CDeviceInfo(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CDeviceInfo position(int position) {
            return (CDeviceInfo)super.position(position);
        }
    

        public CDeviceInfo() { super((Pointer)null); allocate(); }
        private native void allocate();
        public CDeviceInfo( @Const @ByRef CDeviceInfo arg0 ) { super((Pointer)null); allocate(arg0); }
        private native void allocate( @Const @ByRef CDeviceInfo arg0 );

        /* The underlying implementation does not need to support all the listed properties.
        The properties that are not supported always have the value "N/A" which is the value of CInfoBase::PropertyNotAvailable */

        /**Retrieves the serial number if it supported by the underlying implementation
        /**This property is identified by Key::SerialNumberKey. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetSerialNumber();
        /**Sets the above property. */
        public native @ByRef CDeviceInfo SetSerialNumber(@Cast("const Pylon::String_t*") @ByRef gcstring SerialNumberValue);
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsSerialNumberAvailable();

        /**Retrieves the user-defined name if present.
         * This property is identified by Key::UserDefinedNameKey. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetUserDefinedName();
        /**Sets the above property. */
        public native @ByRef CDeviceInfo SetUserDefinedName(@Cast("const Pylon::String_t*") @ByRef gcstring UserDefinedNameValue);
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsUserDefinedNameAvailable();

        /**Retrieves the model name of the device.
         * This property is identified by Key::ModelNameKey. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetModelName();
        /**Sets the above property. */
        public native @ByRef CDeviceInfo SetModelName(@Cast("const Pylon::String_t*") @ByRef gcstring ModelNameValue);
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsModelNameAvailable();

        /**Retrieves the version string of the device.
         * This property is identified by Key::DeviceVersionKey. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetDeviceVersion();
        /**Sets the above property. */
        public native @ByRef CDeviceInfo SetDeviceVersion(@Cast("const Pylon::String_t*") @ByRef gcstring DeviceVersionValue);
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsDeviceVersionAvailable();

        /**Retrieves the identifier for the transport layer able to create this device.
         * This property is identified by Key::DeviceFactoryKey. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetDeviceFactory();
        /**Sets the above property. */
        public native @ByRef CDeviceInfo SetDeviceFactory(@Cast("const Pylon::String_t*") @ByRef gcstring DeviceFactoryValue);
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsDeviceFactoryAvailable();

        /**Retrieves the location where the XML file was loaded from.
         * This property is identified by Key::XMLSourceKey.
         * You must use the DeviceInfo of an opened IPylonDevice to retrieve this property. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetXMLSource();
        /**Sets the above property. */
        public native @ByRef CDeviceInfo SetXMLSource(@Cast("const Pylon::String_t*") @ByRef gcstring XMLSource);
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsXMLSourceAvailable();

        /**Sets the display friendly name of the device.
         * This property is identified by Key::FriendlyNameKey.
         * This method overrides a method of a base class returning a reference to CDeviceInfo */
        public native @ByRef CDeviceInfo SetFriendlyName(@Cast("const Pylon::String_t*") @ByRef gcstring FriendlyNameValue);

        /**Sets the full name identifying the device.
         * This property is identified by Key::FullNameKey.
         * This method overrides a method of a base class returning a reference to CDeviceInfo */
        public native @ByRef CDeviceInfo SetFullName(@Cast("const Pylon::String_t*") @ByRef gcstring FullNameValue);

        /**Sets the vendor name of the device.
         * This property is identified by Key::VendorNameKey.
         * This method overrides a method of a base class returning a reference to CDeviceInfo */
        public native @ByRef CDeviceInfo SetVendorName(@Cast("const Pylon::String_t*") @ByRef gcstring VendorNameValue);

        /**Sets the device class device, e.g. Basler1394.
         * This property is identified by Key::DeviceClassKey.
         * This method overrides a method of a base class returning a reference to CDeviceInfo */
        public native @ByRef CDeviceInfo SetDeviceClass(@Cast("const Pylon::String_t*") @ByRef gcstring DeviceClassValue);

        /** Modifies a property value
         * This method overrides a method of a base class returning a reference to CDeviceInfo */
        public native @ByRef CDeviceInfo SetPropertyValue(@Cast("const Pylon::String_t*") @ByRef gcstring Name, @Cast("const Pylon::String_t*") @ByRef gcstring Value);
    }


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif //__DEVICEINFO_H__


// Parsed from <pylon/InterfaceInfo.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
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
    <p>
    \brief Class used for storing information about an interface object provided by a transport layer.
    <p>
    Enumerating the available Transport Layer Interface objects returns a list of
    CInterface objects (Pylon::InterfaceInfoList_t). A CInterfaceInfo object holds information
    about the enumerated interface.
    */
    @Namespace("Pylon") public static class CInterfaceInfo extends CInfoBase {
        static { Loader.load(); }
        /** Default native constructor. */
        public CInterfaceInfo() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CInterfaceInfo(int size) { super((Pointer)null); allocateArray(size); }
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
//  Copyright (c) 2006-2015 Basler AG
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
    /**
     *  \brief STL std::vector like container class.
    /**
    //  Based on the GenICam::gcstring_vector class.
    */
    // --------------------------------------------------------------------------- */
    @Name("Pylon::TList<Pylon::CDeviceInfo>") @NoOffset public static class TList_CDeviceInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TList_CDeviceInfo(Pointer p) { super(p); }
    

        // \brief Const iterator for the DeviceInfoList container.
        @NoOffset public static class const_iterator extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public const_iterator(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(int)}. */
            public const_iterator(int size) { super((Pointer)null); allocateArray(size); }
            private native void allocateArray(int size);
            @Override public const_iterator position(int position) {
                return (const_iterator)super.position(position);
            }
        
            public const_iterator( CDeviceInfo pPtr/*=0*/ ) { super((Pointer)null); allocate(pPtr); }
            private native void allocate( CDeviceInfo pPtr/*=0*/ );
            public const_iterator( ) { super((Pointer)null); allocate(); }
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
            public iterator(int size) { super((Pointer)null); allocateArray(size); }
            private native void allocateArray(int size);
            @Override public iterator position(int position) {
                return (iterator)super.position(position);
            }
        
            // iterator traits
            // -------------------------------------------------------------------------
            public iterator( CDeviceInfo pPtr/*=0*/ ) { super((Pointer)null); allocate(pPtr); }
            private native void allocate( CDeviceInfo pPtr/*=0*/ );
            public iterator( ) { super((Pointer)null); allocate(); }
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
        public TList_CDeviceInfo( ) { super((Pointer)null); allocate(); }
        private native void allocate( );
        public TList_CDeviceInfo( @Cast("size_t") int uiSize) { super((Pointer)null); allocate(uiSize); }
        private native void allocate( @Cast("size_t") int uiSize);
        public TList_CDeviceInfo( @Const @ByRef TList_CDeviceInfo obj) { super((Pointer)null); allocate(obj); }
        private native void allocate( @Const @ByRef TList_CDeviceInfo obj);
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
        public native @ByRef @Name("operator =") TList_CDeviceInfo put( @Const @ByRef TList_CDeviceInfo obj );
        public native @ByRef @Name("operator []") CDeviceInfo get( @Cast("size_t") int uiIndex );
        public native @Name("operator delete") void _delete( Pointer pWhere );
        public native @Name("operator new") Pointer _new( @Cast("size_t") int uiSize );
    }
    @Name("Pylon::TList<Pylon::CTlInfo>") @NoOffset public static class TList_CTlInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TList_CTlInfo(Pointer p) { super(p); }
    

        // \brief Const iterator for the DeviceInfoList container.
        @NoOffset public static class const_iterator extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public const_iterator(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(int)}. */
            public const_iterator(int size) { super((Pointer)null); allocateArray(size); }
            private native void allocateArray(int size);
            @Override public const_iterator position(int position) {
                return (const_iterator)super.position(position);
            }
        
            public const_iterator( CTlInfo pPtr/*=0*/ ) { super((Pointer)null); allocate(pPtr); }
            private native void allocate( CTlInfo pPtr/*=0*/ );
            public const_iterator( ) { super((Pointer)null); allocate(); }
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
            public iterator(int size) { super((Pointer)null); allocateArray(size); }
            private native void allocateArray(int size);
            @Override public iterator position(int position) {
                return (iterator)super.position(position);
            }
        
            // iterator traits
            // -------------------------------------------------------------------------
            public iterator( CTlInfo pPtr/*=0*/ ) { super((Pointer)null); allocate(pPtr); }
            private native void allocate( CTlInfo pPtr/*=0*/ );
            public iterator( ) { super((Pointer)null); allocate(); }
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
        public TList_CTlInfo( ) { super((Pointer)null); allocate(); }
        private native void allocate( );
        public TList_CTlInfo( @Cast("size_t") int uiSize) { super((Pointer)null); allocate(uiSize); }
        private native void allocate( @Cast("size_t") int uiSize);
        public TList_CTlInfo( @Const @ByRef TList_CTlInfo obj) { super((Pointer)null); allocate(obj); }
        private native void allocate( @Const @ByRef TList_CTlInfo obj);
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
        public native @ByRef @Name("operator =") TList_CTlInfo put( @Const @ByRef TList_CTlInfo obj );
        public native @ByRef @Name("operator []") CTlInfo get( @Cast("size_t") int uiIndex );
        public native @Name("operator delete") void _delete( Pointer pWhere );
        public native @Name("operator new") Pointer _new( @Cast("size_t") int uiSize );
    }
    @Name("Pylon::TList<Pylon::CInterfaceInfo>") @NoOffset public static class TList_CInterfaceInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TList_CInterfaceInfo(Pointer p) { super(p); }
    

        // \brief Const iterator for the DeviceInfoList container.
        @NoOffset public static class const_iterator extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public const_iterator(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(int)}. */
            public const_iterator(int size) { super((Pointer)null); allocateArray(size); }
            private native void allocateArray(int size);
            @Override public const_iterator position(int position) {
                return (const_iterator)super.position(position);
            }
        
            public const_iterator( CInterfaceInfo pPtr/*=0*/ ) { super((Pointer)null); allocate(pPtr); }
            private native void allocate( CInterfaceInfo pPtr/*=0*/ );
            public const_iterator( ) { super((Pointer)null); allocate(); }
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
            public iterator(int size) { super((Pointer)null); allocateArray(size); }
            private native void allocateArray(int size);
            @Override public iterator position(int position) {
                return (iterator)super.position(position);
            }
        
            // iterator traits
            // -------------------------------------------------------------------------
            public iterator( CInterfaceInfo pPtr/*=0*/ ) { super((Pointer)null); allocate(pPtr); }
            private native void allocate( CInterfaceInfo pPtr/*=0*/ );
            public iterator( ) { super((Pointer)null); allocate(); }
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
        public TList_CInterfaceInfo( ) { super((Pointer)null); allocate(); }
        private native void allocate( );
        public TList_CInterfaceInfo( @Cast("size_t") int uiSize) { super((Pointer)null); allocate(uiSize); }
        private native void allocate( @Cast("size_t") int uiSize);
        public TList_CInterfaceInfo( @Const @ByRef TList_CInterfaceInfo obj) { super((Pointer)null); allocate(obj); }
        private native void allocate( @Const @ByRef TList_CInterfaceInfo obj);
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
        public native @ByRef @Name("operator =") TList_CInterfaceInfo put( @Const @ByRef TList_CInterfaceInfo obj );
        public native @ByRef @Name("operator []") CInterfaceInfo get( @Cast("size_t") int uiIndex );
        public native @Name("operator delete") void _delete( Pointer pWhere );
        public native @Name("operator new") Pointer _new( @Cast("size_t") int uiSize );
    }


    // ---------------------------------------------------------------------------
    /** \brief Gets the sum of the given \a iInc and the given \a iter.
     * 
     *  @param [in] iInc Increment from which the sum is calculated.
     *  @param [in] iter Iterator from which the sum is calculated.
     *  @return Sum of iterator. */
    // ---------------------------------------------------------------------------


// #ifndef PYLONBASE_EXPORT_TEMPLATE
// #pragma warning(push)
// #pragma warning(disable:4231 4910) // Nonstandard extension used : 'extern' before template explicit instantiation


///
// #pragma warning(pop)
// #endif

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //   DeviceInfoList
    //
    /////////////////////////////////////////////////////////////////////////////////////////

    /**
     *  \brief STL std::vector like container for Pylon::CDeviceInfo objects.
    /**
    // \ingroup Pylon_TransportLayer
    */
    // --------------------------------------------------------------------------- */
    @Namespace("Pylon") public static class DeviceInfoList extends TList_CDeviceInfo {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public DeviceInfoList(Pointer p) { super(p); }
    
        public DeviceInfoList( ) { super((Pointer)null); allocate(); }
        private native void allocate( );
        public DeviceInfoList( @Cast("size_t") int uiSize) { super((Pointer)null); allocate(uiSize); }
        private native void allocate( @Cast("size_t") int uiSize);
        public DeviceInfoList( @Const @ByRef DeviceInfoList obj) { super((Pointer)null); allocate(obj); }
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
    @Namespace("Pylon") public static class TlInfoList extends TList_CTlInfo {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TlInfoList(Pointer p) { super(p); }
    
        public TlInfoList( ) { super((Pointer)null); allocate(); }
        private native void allocate( );
        public TlInfoList( @Cast("size_t") int uiSize) { super((Pointer)null); allocate(uiSize); }
        private native void allocate( @Cast("size_t") int uiSize);
        public TlInfoList( @Const @ByRef TlInfoList obj) { super((Pointer)null); allocate(obj); }
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
    @Namespace("Pylon") public static class InterfaceInfoList extends TList_CInterfaceInfo {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public InterfaceInfoList(Pointer p) { super(p); }
    
        public InterfaceInfoList( ) { super((Pointer)null); allocate(); }
        private native void allocate( );
        public InterfaceInfoList( @Cast("size_t") int uiSize) { super((Pointer)null); allocate(uiSize); }
        private native void allocate( @Cast("size_t") int uiSize);
        public InterfaceInfoList( @Const @ByRef InterfaceInfoList obj) { super((Pointer)null); allocate(obj); }
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


// Parsed from <pylon/DeviceAccessMode.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Hartmut Nebelung
//-----------------------------------------------------------------------------
/**
\file
\brief    Definition of Device Access Mode
*/

// #ifndef INCLUDED_DEVICEACCESSMODE_H_6600916
// #define INCLUDED_DEVICEACCESSMODE_H_6600916

// #include <pylon/PylonBase.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <bitset>
    // --------------------------------------------------------------------------
    // enum EDeviceAccessMode
    // --------------------------------------------------------------------------
    /** The available access modes when opening a camera object
    /**
        \ingroup Pylon_TransportLayer
    */
    /** enum Pylon::EDeviceAccessMode */
    public static final int
        /** access the control and status registers */
        Control =  0x1,
        /** access a streaming data channel */
        Stream  =  0x3,
        /** access the event data channel */
        Event   =  0x4,
        /** exclusive access to the device */
        Exclusive =  0x5,
        _NumModes =  0x5 + 1;

    // pylon 2.x compatibility.

    // --------------------------------------------------------------------------
    // class AccessModeSet
    // --------------------------------------------------------------------------
    /** Collection of access mode bits
    /**
        Used for defining how a device is accessed.
        <p>
        \par Low Level API:
        This set is used when a device is opened. The combination of
        different access modes specifies how the device is opened.
        Not all combinations may be allowed because the
        device implementations have certain restrictions.
        <p>
        <pre>{@code
        AccessModeSet a = Exclusive | Stream;
        if (a.test( Exclusive ))
        {
            // Exclusive implies Control access, so set it also
            a |= Control;
        }
        }</pre>
        \sa The method of IDevice::Open() uses it to define a default value.
        \sa The global operator |( EDeviceAccessMode lhs, EDeviceAccessMode rhs ) allows to combine
        two modes to a set.
        \ingroup Pylon_TransportLayer
    */
    @Namespace("Pylon") public static class AccessModeSet extends BitSet__NumModes {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public AccessModeSet(Pointer p) { super(p); }
    
            /** Default constructor creates an empty set. */
            public AccessModeSet() { super((Pointer)null); allocate(); }
            private native void allocate();
            /** Converts an access mode into a set. */
            public AccessModeSet(@Cast("Pylon::EDeviceAccessMode") int arg0) { super((Pointer)null); allocate(arg0); }
            private native void allocate(@Cast("Pylon::EDeviceAccessMode") int arg0);
            /** Copy constructor */
            
            ///
            public AccessModeSet(@Const @ByRef AccessModeSet s) { super((Pointer)null); allocate(s); }
            private native void allocate(@Const @ByRef AccessModeSet s);
            /** */
// #if _MSC_VER < 1600
            public AccessModeSet(@Cast("unsigned long") long l) { super((Pointer)null); allocate(l); }
            private native void allocate(@Cast("unsigned long") long l);
// #else
// #endif

    }

    // -------------------------------------------------------------------------
    // Access mode operators
    // -------------------------------------------------------------------------

    /**
       \brief Creates a set containing lhs and rhs operands
       @param lhs left operand
       @param rhs right operand
       @return returns an AccessModeSet containing both operands
        \ingroup Pylon_TransportLayer
    */
    @Namespace("Pylon") public static native @ByVal @Name("operator +") AccessModeSet add(@Cast("Pylon::EDeviceAccessMode") int lhs, @Cast("Pylon::EDeviceAccessMode") int rhs);

    /**
        \brief Creates a set containing lhs and rhs operands.
       @param lhs left operand
       @param rhs right operand
        \ingroup Pylon_TransportLayer
    */
    @Namespace("Pylon") public static native @ByVal @Name("operator |") AccessModeSet or(@Cast("Pylon::EDeviceAccessMode") int lhs, @Cast("Pylon::EDeviceAccessMode") int rhs);

    /**
        \brief Adds the operand rhs to the set lhs
        @param lhs a set of bits.
        @param rhs the additional bit
        \ingroup Pylon_LowLevelApi
    */
    @Namespace("Pylon") public static native @ByVal @Name("operator +") AccessModeSet add(@Const @ByRef AccessModeSet lhs, @Cast("Pylon::EDeviceAccessMode") int rhs);

    /**
        \brief Adds the operand rhs to the set lhs
        @param lhs a set of bits.
        @param rhs the additional bit
        \ingroup Pylon_TransportLayer
    */
    @Namespace("Pylon") public static native @ByVal @Name("operator |") AccessModeSet or(@Const @ByRef AccessModeSet lhs, @Cast("Pylon::EDeviceAccessMode") int rhs);

// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */


// #endif /* INCLUDED_DEVICEACCESSMODE_H_6600916 */


// Parsed from <pylon/DeviceFactory.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2015 Basler AG
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
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public IPylonDevice() { super((Pointer)null); }
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
<p>
Each transport layer object is a device factory. These device factories must implement
the IDeviceFactory interface.
<p>
\ingroup Pylon_TransportLayer
*/

@Namespace("Pylon") public static class IDeviceFactory extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IDeviceFactory(Pointer p) { super(p); }

    /** Retrieves a list of available devices.
    /**
    The list contains Pylon::CDeviceInfo objects used for the device creation.
    <p>
    By default, the list passed in will be cleared before the device discovery is started.
    <p>
    @param list List to be filled with device info objects.
    @param addToList If true, the found devices will be added to the list instead of deleting the list.
    @return Number of devices found.
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
    <p>
    @param list List to be filled with device info objects.
    @param filter A list of device info objects with user-provided properties that a device can match.
    @param addToList If true, found devices will be added to the list instead of deleting the list.
    @return Number of devices found.
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
        <p>
        If the device creation fails, a GenApi::GenericException will be thrown.
        @param di Device info object containing all information needed to identify exactly one device.
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
    <p>
    This method accepts either a device info object from a device enumeration or a user-provided device info object.
    User-provided device info objects can be preset with properties required for a device, e.g.
    the user-provided name or the serial number. The implementation tries to find a matching camera by using device
    enumeration.
    When the device class property is set, the search is limited to the required transport layer.
    <p>
    @param [in]  deviceInfo         Properties of the camera device.
    @param [in]  mode               Used for defining how a device is accessed.
                                   The use of the mode information is transport layer-specific.
                                   For IIDC 1394 devices the mode information is ignored.
                                   For GigE devices the \c Exclusive and \c Control flags are used for defining how a device is accessed.
    @param [in]  pAccessibilityInfo Optionally provides more information about why a device is not accessible.
    @return True if device can be opened with provided access mode.
    <p>
    \pre The \c deviceInfo object properties specify exactly one device.
         This is the case when the device info object has been obtained using device enumeration.
    <p>
    \error
         Throws a C++ exception, if the preconditions are not met.
    */
    public native @Cast("bool") boolean IsDeviceAccessible( @Const @ByRef CDeviceInfo deviceInfo, @ByVal(nullValue = "Pylon::Control") AccessModeSet mode/*=Pylon::Control*/, @Cast("Pylon::EDeviceAccessiblityInfo*") IntPointer pAccessibilityInfo/*=NULL*/);
    public native @Cast("bool") boolean IsDeviceAccessible( @Const @ByRef CDeviceInfo deviceInfo);
    public native @Cast("bool") boolean IsDeviceAccessible( @Const @ByRef CDeviceInfo deviceInfo, @ByVal(nullValue = "Pylon::Control") AccessModeSet mode/*=Pylon::Control*/, @Cast("Pylon::EDeviceAccessiblityInfo*") IntBuffer pAccessibilityInfo/*=NULL*/);
    public native @Cast("bool") boolean IsDeviceAccessible( @Const @ByRef CDeviceInfo deviceInfo, @ByVal(nullValue = "Pylon::Control") AccessModeSet mode/*=Pylon::Control*/, @Cast("Pylon::EDeviceAccessiblityInfo*") int[] pAccessibilityInfo/*=NULL*/);
}







 // namespace PYLON

// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif


// Parsed from <pylon/TransportLayer.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2015 Basler AG
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

// #include <GenICamFwd.h>
// #include <pylon/stdinclude.h>
// #include <pylon/PylonBase.h>
// #include <pylon/DeviceFactory.h>
// #include <pylon/TlInfo.h>


    /**
    \ingroup Pylon_TransportLayer
    \interface ITransportLayer
    \brief The interface of Transport Layer objects
    <p>
    Transport Layer objects are used for enumerating and creating devices accessible
    by a specific transport layer (like the Pylon1394 or the PylonGigE transport layer).
    */
    @Namespace("Pylon") public static class ITransportLayer extends IDeviceFactory {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ITransportLayer(Pointer p) { super(p); }
    
        public native @ByVal CTlInfo GetTlInfo();

        /** \brief Creates and returns an 'empty' Device Info object appropriate
        for the transport layer.
        <p>
        Device Info objects returned by the CreateDeviceInfo() method are used to create
        devices from device info objects that are not the result of a device enumeration process but are
        provided by the user. The user is responsible for
        filling in the fields of the Device Info object that are needed to identify and create a device.
        <p>
        Example: To open a GigE device for which the IP address is known, the user lets the Transport Layer object
        create a Device Info object, specifies the IP address and passes the device info object to the
        CreateDevice() method.
        <p>
        */
        public native @ByVal CDeviceInfo CreateDeviceInfo();

        /** \brief Returns the GenApi node map used for accessing parameters provided by the transport layer.
        <p>
        @return NULL, if the transport layer doesn't provide parameters, a pointer to the parameter node map otherwise.
        */
        public native INodeMap GetNodeMap();

        /** \brief Retrieves a list of available interfaces.
        <p>
        The concept of interfaces is not supported by all transport layers.
        Depending on the transport layer, an interface may represent a frame grabber board, a network card, etc.
        <p>
        By default, the list passed in will be cleared.
        <p>
        If the transport layer doesn't support the interface concept, EnumerateInterfaces() always returns 0.
        <p>
        @param list The list to be filled with interface info objects
        @param addToList If true, found devices will be added to the list instead of deleting the list
        @return Number of interfaces provided by the transport layer.
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
//  Copyright (c) 2006-2015 Basler AG
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
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public CSimpleMutex() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CSimpleMutex(Pointer p) { super(p); }
    }
    @Namespace("Pylon") @Opaque public static class TlMap extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public TlMap() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TlMap(Pointer p) { super(p); }
    }
    @Namespace("Pylon") @Opaque public static class ImplicitTlRefs extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public ImplicitTlRefs() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ImplicitTlRefs(Pointer p) { super(p); }
    }

    //------------------------------------------------------------------------
    // class CTlFactory
    //------------------------------------------------------------------------
    /**
        \ingroup Pylon_TransportLayer
        \brief the Transport Layer Factory
        <p>
        Creates, Destroys and Enumerates transport layers as well as
        their devices.
    */
    @Namespace("Pylon") @NoOffset public static class CTlFactory extends IDeviceFactory {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CTlFactory(Pointer p) { super(p); }
    
        /** Retrieve the transport layer factory singleton.
         *  Throws an exception when Pylon::PylonInitialize() has not been called before. */
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
        public native @Cast("bool") boolean IsDeviceAccessible( @Const @ByRef CDeviceInfo deviceInfo, @ByVal(nullValue = "Pylon::Control") AccessModeSet mode/*=Pylon::Control*/, @Cast("Pylon::EDeviceAccessiblityInfo*") IntPointer pAccessibilityInfo/*=NULL*/);
        public native @Cast("bool") boolean IsDeviceAccessible( @Const @ByRef CDeviceInfo deviceInfo);
        public native @Cast("bool") boolean IsDeviceAccessible( @Const @ByRef CDeviceInfo deviceInfo, @ByVal(nullValue = "Pylon::Control") AccessModeSet mode/*=Pylon::Control*/, @Cast("Pylon::EDeviceAccessiblityInfo*") IntBuffer pAccessibilityInfo/*=NULL*/);
        public native @Cast("bool") boolean IsDeviceAccessible( @Const @ByRef CDeviceInfo deviceInfo, @ByVal(nullValue = "Pylon::Control") AccessModeSet mode/*=Pylon::Control*/, @Cast("Pylon::EDeviceAccessiblityInfo*") int[] pAccessibilityInfo/*=NULL*/);
    }



// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* __TLFACTORY_H__ */


// Parsed from <pylon/EventAdapter.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2015 Basler AG
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
//  Copyright (c) 2006-2015 Basler AG
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
     * \{
     */

    // Bitmask value of the monochrome type. Internal use only.
public static final int PIXEL_MONO =  0x01000000;
    // Bitmask value of the color pixel type. Internal use only.
public static final int PIXEL_COLOR = 0x02000000;
    // Sets the bit count of pixel type. Internal use only.
// #define PIXEL_BIT_COUNT(n) ((n) << 16)

    /**
    \brief Lists the available pixel types.
    <p>
    These pixel types are returned by a grab result and are used by the Image Handling Support classes.
    <p>
    The camera parameter interface classes define additional pixel format enumerations. These pixel format enumerations
    are different from the enumeration EPixelType pylon uses, e.g. the pylon pixel type PixelType_Mono1packed
    corresponds to PixelFormat_Mono1packed or PixelFormat_Mono1p. See
    the documentation of the parameter interface classes for more information.
    <p>
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

        /** alias PixelFormat_BayerGR10p. */
        PixelType_BayerGR10p         =  PIXEL_MONO | ((10) << 16) | 0x0056,
        /** alias PixelFormat_BayerRG10p. */
        PixelType_BayerRG10p         =  PIXEL_MONO | ((10) << 16) | 0x0058,
        /** alias PixelFormat_BayerGB10p. */
        PixelType_BayerGB10p         =  PIXEL_MONO | ((10) << 16) | 0x0054,
        /** alias PixelFormat_BayerBG10p. */
        PixelType_BayerBG10p         =  PIXEL_MONO | ((10) << 16) | 0x0052,
                                     
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
     *  See the camera User's Manual or the Pixel Format Naming Convention (PFNC) of the GenICam standard group for more information. */
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
    <p>
    BitPerPixel(PixelType_Mono12) returns 16 and BitPerPixel(PixelType_Mono12packed)
    returns 12 for example.
    <p>
    @param [in] pixelType The pixel type.
    \pre The pixel type must be defined.
    <p>
    \error
        Throws an exception when the pixel type is undefined.
    */
    @Namespace("Pylon") public static native @Cast("uint32_t") int BitPerPixel(@Cast("Pylon::EPixelType") int pixelType);

    /**
    \brief Returns the number of measured values per pixel.
    <p>
    SamplesPerPixel(PixelType_Mono8) returns 1 and SamplesPerPixel(PixelType_RGB8packed)
    returns 3 for example.
    <p>
    @param [in] pixelType The pixel type.
    \pre The pixel type must be defined. The pixel type is not PixelType_YUV411packed.
    <p>
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
    <p>
    This may be less than the size needed to store the pixel.
    BitDepth(PixelType_Mono12) returns 12, BitDepth(PixelType_Mono12packed)
    returns 12, and  BitDepth(PixelType_RGB8packed) returns 8 for example.
    <p>
    @param [in] pixelType The pixel type.
    <p>
    \pre The pixel type must be valid.
    <p>
    \error
        Throws an exception when the pixel type is undefined.
    */
    @Namespace("Pylon") public static native @Cast("uint32_t") int BitDepth( @Cast("Pylon::EPixelType") int pixelType );

    /**
    \brief Computes the stride in byte.
    <p>
    The stride indicates the number of bytes between the beginning of one row
    in an image and the beginning of the next row.
    For planar pixel types the returned value represents the stride of a plane.
    <p>
    The stride in bytes cannot be computed for packed image format when the stride is not byte aligned and paddingX == 0.
    If paddingX is larger than zero and the stride without padding is not byte aligned then the rest of the partially
    filled byte is considered as padding, e.g. pixelType = PixelType_Mono12packed, width = 5, paddingX = 10 results
    in a stride of 18 Bytes (stride without padding is 5 * BitPerPixel( PixelType_Mono12packed) = 5 * 12 = 60 Bits = 7.5 Bytes).
    <p>
    See also Pylon::IsPacked().
    <p>
    @param [out] strideBytes  The stride in byte if it can be computed.
    @param [in] pixelType The pixel type.
    @param [in] width     The number of pixels in a row.
    @param [in] paddingX  The number of additional bytes at the end of a row (byte aligned).
    <p>
    @return Returns true if the stride can be computed.
    <p>
    \pre
            The \c width value must be >= 0 and <= _I32_MAX.
    <p>
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
    <p>
    @param [out] strideBytes  The stride in byte.
    @param [in] pixelType The pixel type.
    @param [in] width     The number of pixels in a row.
    <p>
    @return Returns the paddingX value for the given stride value (byte aligned).
    <p>
    \pre
        <ul>
        <li> The value of \c strideBytes must be large enough to contain a line described by \c pixelType and \c width.
        <li> The pixel type must be valid.
        <li> The \c width value must be >= 0 and <= _I32_MAX.
        </ul>
    <p>
    \error
        Throws an exception when the preconditions are not met.
    */
    @Namespace("Pylon") public static native @Cast("size_t") int ComputePaddingX( @Cast("size_t") int strideBytes, @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width);

    /**
    \brief Computes the buffer size in byte.
    <p>
    @param [in] pixelType The pixel type.
    @param [in] width     The number of pixels in a row.
    @param [in] height    The number of rows in an image.
    @param [in] paddingX  The number of extra data bytes at the end of each row (byte aligned).
    @return The buffer size in byte.
    <p>
    \pre
        <ul>
        <li> The pixel type must be valid.
        <li> The \c width value must be >= 0 and <= _I32_MAX.
        <li> The \c height value must be >= 0 and <= _I32_MAX.
        </ul>
    <p>
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
     * \}
     */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_PIXELTYPE_H_1534845 */


// Parsed from <pylon/PayloadType.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2011-2015 Basler AG
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
//  Copyright (c) 2010-2015 Basler AG
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
     * \{
     */

    /**Defines the vertical orientation of an image in memory. */
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
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IImage(Pointer p) { super(p); }
    
        /** Ensure proper destruction by using a virtual destructor. */
        // Do not add implemenation here in class as older compilers doesn't accept in-class definitions (see definition below)

        //
        /**
        \brief Can be used to check whether an image is valid.
        <p>
        @return Returns false if the image is invalid.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean IsValid();


        /**
        \brief Get the current pixel type.
        <p>
        @return Returns the pixel type or PixelType_Undefined if the image is invalid.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("Pylon::EPixelType") int GetPixelType();


        /**
        \brief Get the current number of columns in pixels.
        <p>
        @return Returns the current number of columns in pixels or 0 if the image is invalid.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("uint32_t") int GetWidth();


        /**
        \brief Get the current number of rows.
        <p>
        @return Returns the current number of rows or 0 if the image is invalid.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("uint32_t") int GetHeight();


        /**
        \brief Get the number of extra data bytes at the end of each row.
        <p>
        @return Returns the number of extra data bytes at the end of each row or 0 if the image is invalid.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("size_t") int GetPaddingX();


        /**
        \brief Get the vertical orientation of the image in memory.
        <p>
        @return Returns the orientation of the image or ImageOrientation_TopDown if the image is invalid.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("Pylon::EImageOrientation") int GetOrientation();


        /**
        \brief Get the pointer to the buffer.
        <p>
        @return Returns the pointer to the used buffer or NULL if the image is invalid.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native Pointer GetBuffer();


        /**
        \brief Get the pointer to the buffer containing the image.
        <p>
        The buffer is at least as large as the value returned by GetImageSize().
        <p>
        @return Returns the pointer to the used buffer or NULL if the image is invalid.
        <p>
        \error
            Does not throw C++ exceptions.
        */


        /**
        \brief Get the size of the image in bytes.
        <p>
        @return Returns the size of the image in bytes or 0 if the image is invalid.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("size_t") int GetImageSize();


        /**
        \brief Indicates that the referenced buffer is only referenced by this image.
        <p>
        @return Returns true if the referenced buffer is only referenced by this image. Returns false if the image is invalid.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean IsUnique();


        /**
        \brief Get the stride in bytes.
        <p>
        The stride in bytes can not be computed for packed image format when the stride is not byte aligned. See also Pylon::IsPacked().
        The stride in bytes can not be computed if the image is invalid.
        <p>
        @param [out] strideBytes  The stride in byte if it can be computed.
        @return Returns true if the stride can be computed.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean GetStride( @Cast("size_t*") @ByRef IntPointer strideBytes);
        public native @Cast("bool") boolean GetStride( @Cast("size_t*") @ByRef IntBuffer strideBytes);
        public native @Cast("bool") boolean GetStride( @Cast("size_t*") @ByRef int[] strideBytes);
    }

    /**
     * \}
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
//  Copyright (c) 2010-2015 Basler AG
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
// #include <GenApi/GenApiDll.h> // [temporary] namespace alias
// #include <GenICamFwd.h>
    /** \addtogroup Pylon_InstantCameraApiGeneric
     * \{
     */

    /**
    \class  CGrabResultData
    \brief  Makes the data for one grabbed buffer available.
    */
    @Namespace("Pylon") @NoOffset public static class CGrabResultData extends Pointer {
        static { Loader.load(); }
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
        <p>
        \par GigE Camera Devices
        The sequence number starts with 1 and
        wraps at 65535. The value 0 has a special meaning and indicates
        that this feature is not supported by the camera.
        <p>
        \par USB Camera Devices
        The sequence number starts with 0 and uses the full 64 Bit range.
        <p>
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
            /** Empty constructor. Calls {@code super((Pointer)null)}. */
            public CGrabResultDataImpl() { super((Pointer)null); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public CGrabResultDataImpl(Pointer p) { super(p); }
        }
        public native CGrabResultDataImpl GetGrabResultDataImpl();
    }

    /**
     * \}
     */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_GRABRESULTDATA_H_1758952 */


// Parsed from <pylon/GrabResultPtr.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
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
    

    /** \addtogroup Pylon_InstantCameraApiGeneric
     * \{
     */

    /**
    \class  CGrabResultPtr
    \brief  A smart pointer holding a reference to grab result data.
    <p>
    This class is used for distributing the grab result data of a camera. It controls
    the reuse and lifetime of the referenced buffer. When all smart pointers referencing
    a buffer go out of scope the referenced buffer is reused or destroyed.
    The data and the held buffer are still valid after the camera object it originated from
    has been destroyed.
    \attention The grabbing will stop with an input queue underrun, when the grab results are
    never released, e.g. when put into a container.
    <p>
    The CGrabResultPtr class provides a cast operator that allows passing the grab result directly to functions or methods
    that take an const IImage& as parameter, e.g. image saving functions or image format converter methods.
    <p>
    \attention The returned reference to IImage is only valid as long the CGrabResultPtr object it came from is not destroyed.
    <p>
    \threading Instances of CGrabResultPtr referencing the same grab result can be used from any thread context.
    */
    @Namespace("Pylon") @NoOffset public static class CGrabResultPtr extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CGrabResultPtr(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CGrabResultPtr(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CGrabResultPtr position(int position) {
            return (CGrabResultPtr)super.position(position);
        }
    
        /**
        \brief Creates a smart pointer.
        \post No grab result is referenced.
        */
        public CGrabResultPtr() { super((Pointer)null); allocate(); }
        private native void allocate();


        /**
        \brief Creates a copy of a smart pointer.
        <p>
        @param [in] rhs Another smart pointer, source of the result data to reference.
        <p>
        The data itself is not copied.
        <p>
        \post
        <ul>
        <li>Another reference to the grab result of the source is held if it references a grab result.
        <li>No grab result is referenced if the source does not reference a grab result.
        </ul>
        <p>
        \error
            Still valid after error.
        */
        public CGrabResultPtr( @Const @ByRef CGrabResultPtr rhs) { super((Pointer)null); allocate(rhs); }
        private native void allocate( @Const @ByRef CGrabResultPtr rhs);


        /**
        \brief Assignment of a smart pointer.
        <p>
        @param [in] rhs Another smart pointer, source of the result data to reference.
        <p>
        The data itself is not copied.
        <p>
        \post
        <ul>
        <li>The currently referenced data is released.
        <li>Another reference to the grab result of the source is held if it references a grab result.
        <li>No grab result is referenced if the source does not reference a grab result.
        </ul>
        <p>
        \error
            Still valid after error.
        */
        public native @ByRef @Name("operator =") CGrabResultPtr put( @Const @ByRef CGrabResultPtr rhs);


        /**
        \brief Destroys the smart pointer.
        <p>
        \post The currently referenced data is released.
        <p>
        \error
            Does not throw C++ exceptions.
        */


        /**
        \brief Allows accessing the referenced data.
        <p>
        @return The pointer to the grab result data.
        <p>
        \pre The pointer must reference a grab result.
        IsValid() or the overloaded bool operator can be used to check whether data is referenced.
        <p>
        \error
            Still valid after error. Throws an exception when no data is referenced.
        */
        public native @Name("operator ->") CGrabResultData access();


        /**
        \brief Check whether data is referenced.
        <p>
        @return True if data is referenced.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean IsValid();


        /**
        \brief Check whether data is referenced.
        <p>
        @return IsValid().
        <p>
        The overloaded bool operator can be used to check whether data is referenced.
        Example:
        <pre>{@code
        if ( grabResult)
        {
            grabResult->GetStatus();
        }
        }</pre>
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Name("operator bool") boolean asBoolean();


        /**
        \brief The currently referenced data is released.
        <p>
        \post The currently referenced data is released.
        <p>
        \error
            Still valid after error.
        */
        public native void Release();


        /**
        \brief Provides an IImage interface to the grab result.
        <p>
        This cast operator allows passing the grab result to saving functions or image format converter.
        The returned image is invalid if the grab was not successful, see CGrabResultData::GrabSucceeded().
        <p>
        \attention The returned reference is only valid as long the grab result ptr is not destroyed.
        <p>
        \error
            Still valid after error.
        */
        public native @ByRef @Name("operator Pylon::IImage&") IImage asIImage();


        /**
        \brief Indicates that the held grab result data and buffer is only referenced by this grab result.
        <p>
        @return Returns true if the held grab result data and buffer is only referenced by this grab result. Returns false if the grab result is invalid.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean IsUnique();


        /** Internal use only. */
        @Opaque public static class CGrabResultPtrImpl extends Pointer {
            /** Empty constructor. Calls {@code super((Pointer)null)}. */
            public CGrabResultPtrImpl() { super((Pointer)null); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public CGrabResultPtrImpl(Pointer p) { super(p); }
        }
        public native @ByRef @Name("operator =") CGrabResultPtr put( @Const @ByRef CGrabResultPtrImpl rhs);
    }

    /**
     * \}
     */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_GRABRESULTPTR_H_4356898 */


// Parsed from <pylon/WaitObject.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2006-2015 Basler AG
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
    <p>
    Wait objects are used by the Pylon::IStreamGrabber and Pylon::IEventGrabber interfaces to provide a platform independent mechanism for
    allowing an application to wait for data buffers to be filled.
    <p>
    For the Windows version of %pylon, WaitObjects are wrappers for Win32 objects that can be used with \c WaitForSingleObject() and \c WaitForMultipleObjects().
    <p>
    For the Linux version of %pylon, WaitObjects are implemented based on file descriptors. The wait operation is implemented using the \c select()  function.
    <p>
    Although the class provides a default constructor, the default constructor doesn't create a "usable" wait objects  wrapping a handle resp. file descriptor.
    Valid instances of Pylon::WaitObject cannot be created by the application, instead the pylon libraries return fully created wait objects.
    The Pylon::WaitObjectEx class can be used to create wait objects that can be controlled by the application.
    <p>
    The Pylon::WaitObject class provides access to the wrapped handle resp. file descriptor. This allows to use  to allow use pylon wait objects as input for
    "native" APIs like \c WaitForMultipleObjects() (Windows),  and \c select() (Linux).
    <p>
    Multiple Pylon::WaitObjects can be put in the Pylon::WaitObjects container class allowing to wait "simultaneously" for multiple events.
    <p>
    <p>
    \ingroup PYLON_PUBLIC
    */
    // ----------------------------------------------------------------------
    @Namespace("Pylon") @NoOffset public static class WaitObject extends Pointer {
        static { Loader.load(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public WaitObject(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public WaitObject position(int position) {
            return (WaitObject)super.position(position);
        }
    
        /** Constructs an "empty" wait object, i.e., the wait object is not attached to a platform dependent wait object (IsValid() == false)
        /** The Pylon::WaitObjectEx class can be used to create wait objects controllable by an application. */
        public WaitObject() { super((Pointer)null); allocate(); }
        private native void allocate();
        /** Destructor */
        /** Copy constructor (duplicates the wrapped handle/file descriptor) */
        public WaitObject(@Const @ByRef WaitObject arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(@Const @ByRef WaitObject arg0);
        /** Assignment operator (duplicates the wrapped handle/file descriptor) */
        public native @ByRef @Name("operator =") WaitObject put(@Const @ByRef WaitObject arg0);

        /** Suspend calling thread for specified time.
        /**
        @param ms wait time in ms
        */
        public static native void Sleep(@Cast("unsigned long") long ms);
        /** Checks if the wait object is valid.
        /**
        Don't call the  Wait methods() for an invalid wait object. Wait objects returned by the pylon libraries are valid.
        @return true if the object contains a valid handle/file descriptor
        */
        public native @Cast("bool") boolean IsValid();
        /** Wait for the object to be signaled
        /**
        @param timeout timeout in ms
        @return false when the timeout has been expired, true when the waiting was successful before
        the timeout has been expired.
        */
        public native @Cast("bool") boolean Wait(@Cast("unsigned int") int timeout);

        /** Wait for the object to be signaled  (interruptible)
        /**
        <p>
        @param timeout timeout in ms
        @param bAlertable    When the bAlertable parameter is set to true, the function waits until either the timeout elapses, the object enters
        the signaled state, or the wait operation has been interrupted.
        For Windows, the wait operation is interrupted by queued APCs or I/O completion routines.
        For Linux, the wait operation can be interrupted by signals.
        <p>
        @return The returned Pylon::EWaitExResult  value indicates the result of the wait operation.
        <p>
        */
        public native @Cast("Pylon::EWaitExResult") int WaitEx(@Cast("unsigned int") int timeout, @Cast("bool") boolean bAlertable);
        /** Constructor taking existing handle (duplicate=false -> take ownership like std:auto_ptr)
        /** This method allows to wrap an exiting windows handle that can be used with the \c WaitForSingleObject() and
        \c WaitForMultipleObjects methods. */
        public WaitObject(@Cast("HANDLE") Pointer h, @Cast("bool") boolean duplicate/*=true*/) { super((Pointer)null); allocate(h, duplicate); }
        private native void allocate(@Cast("HANDLE") Pointer h, @Cast("bool") boolean duplicate/*=true*/);
        public WaitObject(@Cast("HANDLE") Pointer h) { super((Pointer)null); allocate(h); }
        private native void allocate(@Cast("HANDLE") Pointer h);


        /** conversion operator
        /** @return the native Win32 handle wrapped by the WaitObject. (Not supported by pylon4Linux) */
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
        public WaitObjectEx(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public WaitObjectEx position(int position) {
            return (WaitObjectEx)super.position(position);
        }
    
        /** Creates an event object (manual reset event) */
        public static native @ByVal WaitObjectEx Create(@Cast("bool") boolean initiallySignalled/*=false*/);
        public static native @ByVal WaitObjectEx Create();


        /** Constructs an "empty" wait object, i.e., the wait object is not attached to a platform dependent wait object (IsValid() == false)
        /** Use the static WaitObjectEx::Create() method to create instances of the WaitObjectEx class instead. */
        public WaitObjectEx() { super((Pointer)null); allocate(); }
        private native void allocate();
        /** Set the object to signaled state */
        public native void Signal();
        /** Reset the object to unsignaled state */
        public native void Reset();
        /** Constructor using an existing windows handle (duplicate=false -> take ownership like std:auto_ptr) */
        public WaitObjectEx(@Cast("HANDLE") Pointer h, @Cast("bool") boolean duplicate/*=true*/) { super((Pointer)null); allocate(h, duplicate); }
        private native void allocate(@Cast("HANDLE") Pointer h, @Cast("bool") boolean duplicate/*=true*/);
        public WaitObjectEx(@Cast("HANDLE") Pointer h) { super((Pointer)null); allocate(h); }
        private native void allocate(@Cast("HANDLE") Pointer h);
// #endif

        // -------------------------------
        // Linux specific stuff
        // -------------------------------
// #if defined (PYLON_LINUX_BUILD)
// #endif
    }


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



// #ifndef Basler_InstantCameraParams_PARAMS_H
// #define Basler_InstantCameraParams_PARAMS_H

// #ifdef __GNUC__
// #define GENAPI_DEPRECATED_FEATURE __attribute__((deprecated))
// #elif defined(_MSC_VER)
// #define GENAPI_DEPRECATED_FEATURE __declspec(deprecated)
// #else
// #define GENAPI_DEPRECATED_FEATURE
// #endif

// #include <GenApi/IEnumerationT.h>
// #include <GenApi/NodeMapRef.h>
// #include <GenApi/DLLLoad.h>


// common node types
// #include <GenApi/IBoolean.h>
// #include <GenApi/ICategory.h>
// #include <GenApi/ICommand.h>
// #include <GenApi/IEnumeration.h>
// #include <GenApi/IEnumEntry.h>
// #include <GenApi/IFloat.h>
// #include <GenApi/IInteger.h>
// #include <GenApi/IString.h>
// #include <GenApi/IRegister.h>


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
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CInstantCameraParams_Params(Pointer p) { super(p); }
    
        
    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The maximum number of buffers that are allocated and used for grabbing.
        
    
        <p>
        
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger MaxNumBuffer(); public native CInstantCameraParams_Params MaxNumBuffer(IInteger MaxNumBuffer);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The maximum number of buffers that are queued in the stream grabber input queue.
        
    
        <p>
        
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger MaxNumQueuedBuffer(); public native CInstantCameraParams_Params MaxNumQueuedBuffer(IInteger MaxNumQueuedBuffer);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The maximum number of grab results available at any time during a grab session. This value can be limited to save resources. Furthermore, it can be used to check that the grab results are returned correctly.
        
    
        <p>
        
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger MaxNumGrabResults(); public native CInstantCameraParams_Params MaxNumGrabResults(IInteger MaxNumGrabResults);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief Enables/disables the use of a chunk node map for each grab result. Grab result chunk node maps can be disabled to save resources.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IBoolean ChunkNodeMapsEnable(); public native CInstantCameraParams_Params ChunkNodeMapsEnable(IBoolean ChunkNodeMapsEnable);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief If larger than 0, a static chunk node map pool is used instead of dynamic chunk node map creation.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger StaticChunkNodeMapPoolSize(); public native CInstantCameraParams_Params StaticChunkNodeMapPoolSize(IInteger StaticChunkNodeMapPoolSize);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief Enables/disables the grabbing of camera events while images are grabbed. Is writable when the camera object is closed.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IBoolean GrabCameraEvents(); public native CInstantCameraParams_Params GrabCameraEvents(IBoolean GrabCameraEvents);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The camera object is set to monitor mode when enabled, e.g. when using the GigE multicast feature. Is writable when the camera object is closed.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IBoolean MonitorModeActive(); public native CInstantCameraParams_Params MonitorModeActive(IBoolean MonitorModeActive);
    
    //@}
    

    /** \name InternalGrabEngineThread - Parameters of the internal grab engine thread. */
    //@{
    /**
        \brief If enabled, the user can set a custom priority for the internal grab engine thread operating the stream grabber. Otherwise the priority defaults to 25.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IBoolean InternalGrabEngineThreadPriorityOverride(); public native CInstantCameraParams_Params InternalGrabEngineThreadPriorityOverride(IBoolean InternalGrabEngineThreadPriorityOverride);
    
    //@}
    

    /** \name InternalGrabEngineThread - Parameters of the internal grab engine thread. */
    //@{
    /**
        \brief The internal grab engine thread priority.
        <p>
        This value sets the absolute thread priority for the internal grab engine thread operating the stream grabber.
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger InternalGrabEngineThreadPriority(); public native CInstantCameraParams_Params InternalGrabEngineThreadPriority(IInteger InternalGrabEngineThreadPriority);
    
    //@}
    

    /** \name GrabLoopThread - Parameters of the optional grab loop  thread. */
    //@{
    /**
        \brief If enabled, the user can set a custom timeout for the grab loop thread's call to RetrieveResult. RetrieveResult is configured to throw an exception on timeout, which will stop the grab session.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IBoolean GrabLoopThreadUseTimeout(); public native CInstantCameraParams_Params GrabLoopThreadUseTimeout(IBoolean GrabLoopThreadUseTimeout);
    
    //@}
    

    /** \name GrabLoopThread - Parameters of the optional grab loop  thread. */
    //@{
    /**
        \brief A custom timeout for the grab loop thread's call to RetrieveResult. RetrieveResult is configured to throw an exception on timeout, which will stop the grab session.
        
    
        <p>
        
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger GrabLoopThreadTimeout(); public native CInstantCameraParams_Params GrabLoopThreadTimeout(IInteger GrabLoopThreadTimeout);
    
    //@}
    

    /** \name GrabLoopThread - Parameters of the optional grab loop  thread. */
    //@{
    /**
        \brief If enabled, the user can set a custom priority for the grab loop thread. Otherwise, the priority of the newly created thread is not changed.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IBoolean GrabLoopThreadPriorityOverride(); public native CInstantCameraParams_Params GrabLoopThreadPriorityOverride(IBoolean GrabLoopThreadPriorityOverride);
    
    //@}
    

    /** \name GrabLoopThread - Parameters of the optional grab loop  thread. */
    //@{
    /**
        \brief The grab loop thread priority.
        <p>
        This value sets the absolute thread priority for the grab loop thread.
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger GrabLoopThreadPriority(); public native CInstantCameraParams_Params GrabLoopThreadPriority(IInteger GrabLoopThreadPriority);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The number of buffers queued at Low Level API stream grabber.
        
        
            <p>
        
        
            This is the number of buffers that are queued for grabbing in the stream grabber.
            The number is influenced by the number of available free buffers and the
            maximum number of buffers that can be queued.
            See also the MaxNumBuffer and MaxNumQueuedBuffer parameters.
            <p>
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
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger NumReadyBuffers(); public native CInstantCameraParams_Params NumReadyBuffers(IInteger NumReadyBuffers);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The number of empty buffers that are not used for grabbing yet.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger NumEmptyBuffers(); public native CInstantCameraParams_Params NumEmptyBuffers(IInteger NumEmptyBuffers);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The size of the grab result buffer output queue.
        
    
        <p>
        
    
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
//  Copyright (c) 2010-2015 Basler AG
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
     * \{
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
        public CConfigurationEventHandler(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CConfigurationEventHandler position(int position) {
            return (CConfigurationEventHandler)super.position(position);
        }
    
        /**
        \brief This method is called before a %Pylon Device (Pylon::IPylonDevice) is attached by calling the Instant Camera object's Attach() method.
        <p>
        This method can not be used for detecting that a camera device has been attached to the PC.
        The camera's Attach() method must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnAttach( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after a %Pylon Device (Pylon::IPylonDevice) has been attached by calling the Instant Camera object's Attach() method.
        <p>
        This method can not be used for detecting that a camera device has been attached to the PC.
        The camera's Attach() method must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnAttached( @ByRef CInstantCamera camera);

        /**
        \brief This method is called before the attached %Pylon Device is detached from the Instant Camera object.
        <p>
        The camera's Detach() method  must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnDetach( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after the attached %Pylon Device has been detached from the Instant Camera object.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnDetached( @ByRef CInstantCamera camera);

        /**
        \brief This method is called before the attached %Pylon Device is destroyed.
        <p>
        Camera DestroyDevice must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnDestroy( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after the attached %Pylon Device has been destroyed.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnDestroyed( @ByRef CInstantCamera camera);

        /**
        \brief This method is called before the attached %Pylon Device is opened.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnOpen( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after the attached %Pylon Device has been opened.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnOpened( @ByRef CInstantCamera camera);

        /**
        \brief This method is called before the attached %Pylon Device is closed.
        <p>
        Camera Close must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnClose( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after the attached %Pylon Device has been closed.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnClosed( @ByRef CInstantCamera camera);

        /**
        \brief This method is called before a grab session is started.
        <p>
        Camera StartGrabbing must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnGrabStart( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after a grab session has been started.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnGrabStarted( @ByRef CInstantCamera camera);

        /**
        \brief This method is called before a grab session is stopped.
        <p>
        Camera StopGrabbing must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnGrabStop( @ByRef CInstantCamera camera);

        /**
        \brief This method is called after a grab session has been stopped.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnGrabStopped( @ByRef CInstantCamera camera);

        /**
        \brief This method is called when an exception has been triggered during grabbing.
        <p>
        An exception has been triggered by a grab thread. The grab will be stopped after this event call.
        <p>
        @param [in]  camera The source of the call.
        @param [in]  errorMessage The message of the exception that signaled an error during grabbing.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnGrabError( @ByRef CInstantCamera camera, @Cast("const char*") BytePointer errorMessage);

        /**
        \brief This method is called when a camera device removal from the PC has been detected.
        <p>
        The %Pylon Device attached to the Instant Camera is not operable after this event.
        After it is made sure that no access to the %Pylon Device or any of its node maps is made anymore
        the %Pylon Device should be destroyed using InstantCamera::DeviceDestroy().
        The access to the %Pylon Device can be protected using the lock provided by GetLock(), e.g. when accessing parameters.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object from an additional thread.
        */
        @Virtual public native void OnCameraDeviceRemoved( @ByRef CInstantCamera camera);


        /**
        \brief This method is called when the configuration event handler has been registered.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            Exceptions from this call will propagate through.
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnConfigurationRegistered( @ByRef CInstantCamera camera);

        /**
        \brief This method is called when the configuration event handler has been deregistered.
        <p>
        The configuration event handler is automatically deregistered when the Instant Camera object
        is destroyed.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored.
        \threading
            This method is called inside the lock of the camera object.
        */
        @Virtual public native void OnConfigurationDeregistered( @ByRef CInstantCamera camera);

        /**
        \brief Destroys the configuration event handler.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored.
        */
        @Virtual public native void DestroyConfiguration();

        /** Create. */
        public CConfigurationEventHandler() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Copy. */
        public CConfigurationEventHandler(@Const @ByRef CConfigurationEventHandler arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(@Const @ByRef CConfigurationEventHandler arg0);

        /** Assign. */
        public native @ByRef @Name("operator =") CConfigurationEventHandler put(@Const @ByRef CConfigurationEventHandler arg0);

        /** Destruct. */

        // Internal use only. Subject to change without notice.
        public native long DebugGetEventHandlerRegistrationCount();
    }

    /**
     * \}
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
//  Copyright (c) 2010-2015 Basler AG
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
     * \{
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
        public CImageEventHandler(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CImageEventHandler position(int position) {
            return (CImageEventHandler)super.position(position);
        }
    

        /**
        \brief This method is called when images have been skipped using the GrabStrategy_LatestImageOnly strategy or the GrabStrategy_LatestImages strategy.
        <p>
        @param [in]  camera The source of the call.
        @param [in]  countOfSkippedImages The number of images skipped. This \c countOfSkippedImages does not include the number of images lost in the case of a buffer under run in the driver.
        <p>
        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.
        <p>
        \threading
            This method is called outside the lock of the camera object but inside the lock of the image event handler registry.
        */
        public native void OnImagesSkipped( @ByRef CInstantCamera camera, @Cast("size_t") int countOfSkippedImages);

        /**
        \brief This method is called when an image has been grabbed.
        <p>
        The grab result smart pointer passed does always reference a grab result data object.
        The status of the grab needs to be checked before accessing the grab result data.
        See CGrabResultData::GrabSucceeded(), CGrabResultData::GetErrorCode() and
        CGrabResultData::GetErrorDescription() for more information.
        <p>
        @param [in]  camera The source of the call.
        @param [in]  grabResult The grab result data.
        <p>
        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.
        <p>
        \threading
            This method is called outside the lock of the camera object but inside the lock of the image event handler registry.
        */
        public native void OnImageGrabbed( @ByRef CInstantCamera camera, @Const @ByRef CGrabResultPtr grabResult);

        /**
        \brief This method is called when the image event handler has been registered.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            Exceptions from this call will propagate through.
        \threading
            This method is called inside the lock of the image event handler registry.
        */
        public native void OnImageEventHandlerRegistered( @ByRef CInstantCamera camera);

        /**
        \brief This method is called when the image event handler has been deregistered.
        <p>
        The image event handler is automatically deregistered when the Instant Camera object
        is destroyed.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored.
        \threading
            This method is called inside the lock of the image event handler registry.
        */
        public native void OnImageEventHandlerDeregistered( @ByRef CInstantCamera camera);

        /**
        \brief Destroys the image event handler.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored.
        */
        public native void DestroyImageEventHandler();

        /** Create. */
        public CImageEventHandler() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Copy. */
        public CImageEventHandler(@Const @ByRef CImageEventHandler arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(@Const @ByRef CImageEventHandler arg0);

        /** Assign. */
        public native @ByRef @Name("operator =") CImageEventHandler put(@Const @ByRef CImageEventHandler arg0);

        /** Destruct. */

        // Internal use only. Subject to change without notice.
        public native long DebugGetEventHandlerRegistrationCount();
    }

    /**
     * \}
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
//  Copyright (c) 2010-2015 Basler AG
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
     * \{
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
        public CCameraEventHandler(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CCameraEventHandler position(int position) {
            return (CCameraEventHandler)super.position(position);
        }
    

        /**
        \brief This method is called when a camera event has been received.
        <p>
        Only very short processing tasks should be performed by this method. Otherwise, the event notification will block the
        processing of images.
        <p>
        @param [in]  camera The source of the call.
        @param [in]  userProvidedId  The ID passed when registering for the event. It can be used to distinguish between different events.
        @param [in]  pNode The node identified by node name when registering.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        \threading
            This method is called outside the lock of the camera object, outside the lock of the node map, and inside the lock of the camera event handler registry.
        */
        public native void OnCameraEvent( @ByRef CInstantCamera camera, @Cast("intptr_t") long userProvidedId, INode pNode);

        /**
        \brief This method is called when the camera event handler has been registered.
        <p>
        @param [in]  camera The source of the call.
        @param [in]  nodeName  The name of the event data node updated on camera event, e.g. "ExposureEndEventTimestamp" for exposure end event.
        @param [in]  userProvidedId  This ID is passed as a parameter in CCameraEventHandler::OnCameraEvent and can be used to distinguish between different events.
        <p>
        \error
            Exceptions from this call will propagate through.
        \threading
            This method is called inside the lock of the camera event handler registry.
        */
        public native void OnCameraEventHandlerRegistered( @ByRef CInstantCamera camera, @Cast("const Pylon::String_t*") @ByRef gcstring nodeName, @Cast("intptr_t") long userProvidedId);

        /**
        \brief This method is called when the camera event handler has been deregistered.
        <p>
        The camera event handler is automatically deregistered when the Instant Camera object
        is destroyed.
        <p>
        @param [in]  camera The source of the call.
        @param [in]  nodeName  The name of the event data node updated on camera event, e.g. "ExposureEndEventTimestamp" for exposure end event.
        @param [in]  userProvidedId  This ID is passed as a parameter in CCameraEventHandler::OnCameraEvent and can be used to distinguish between different events.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored.
        \threading
            This method is called inside the lock of the camera event handler registry.
        */
        public native void OnCameraEventHandlerDeregistered( @ByRef CInstantCamera camera, @Cast("const Pylon::String_t*") @ByRef gcstring nodeName, @Cast("intptr_t") long userProvidedId);

        /**
        \brief Destroys the camera event handler.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored.
        */
        public native void DestroyCameraEventHandler();

        /** Create. */
        public CCameraEventHandler() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Copy. */
        public CCameraEventHandler(@Const @ByRef CCameraEventHandler arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(@Const @ByRef CCameraEventHandler arg0);

        /** Assign. */
        public native @ByRef @Name("operator =") CCameraEventHandler put(@Const @ByRef CCameraEventHandler arg0);

        /** Destruct. */

        // Internal use only. Subject to change without notice.
        public native long DebugGetEventHandlerRegistrationCount();
    }

    /**
     * \}
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
//  Copyright (c) 2010-2015 Basler AG
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
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IBufferFactory(Pointer p) { super(p); }
    
        /** Ensure proper destruction by using a virtual destructor. */

        /**
        \brief Allocates a buffer and provides additional context information.
        <p>
        <p>
        @param [in] bufferSize      The size of the buffer that has to be allocated.
        @param [out] pCreatedBuffer Return the pointer to the allocated buffer. May return NULL if the allocation fails.
        @param [out] bufferContext  Context information that belongs to the buffer.
                                   This context information is provided when FreeBuffer() is called.
                                   The value can be left unchanged if not needed.
        <p>
        \threading
        This method can be run by different threads. It is called from threads that
        call Pylon::CInstantCamera::StartGrabbing() and it can be called by the internal
        grab engine thread.
        <p>
        \error
            May throw an exception if the allocation fails.
        */
        public native void AllocateBuffer( @Cast("size_t") int bufferSize, @Cast("void**") PointerPointer pCreatedBuffer, @Cast("intptr_t*") @ByRef LongPointer bufferContext);
        public native void AllocateBuffer( @Cast("size_t") int bufferSize, @Cast("void**") @ByPtrPtr Pointer pCreatedBuffer, @Cast("intptr_t*") @ByRef LongPointer bufferContext);
        public native void AllocateBuffer( @Cast("size_t") int bufferSize, @Cast("void**") @ByPtrPtr Pointer pCreatedBuffer, @Cast("intptr_t*") @ByRef LongBuffer bufferContext);
        public native void AllocateBuffer( @Cast("size_t") int bufferSize, @Cast("void**") @ByPtrPtr Pointer pCreatedBuffer, @Cast("intptr_t*") @ByRef long[] bufferContext);


        /**
        \brief Frees a previously allocated buffer.
        <p>
        @param [in] pCreatedBuffer The pointer to the allocated buffer. Created by this factory.
        @param [in] bufferContext  Context information of the buffer returned by AllocateBuffer().
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native void FreeBuffer( Pointer pCreatedBuffer, @Cast("intptr_t") long bufferContext);


        /**
        \brief Destroys the buffer factory.
        <p>
        This method is called when the buffer factory is not needed any longer.
        The object implementing IBufferFactory can be deleted by calling: delete this.
        <p>
        \threading
        This method can be run by different threads. It is called from threads that are running the
        destructor of a Pylon::CGrabResultPtr or call Pylon::CInstantCamera::StopGrabbing().
        <p>
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
//  Copyright (c) 2010-2015 Basler AG
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

// #include <pylon/stdinclude.h>
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
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public IInstantCameraExtensions() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IInstantCameraExtensions(Pointer p) { super(p); }
    }


// #ifdef _MSC_VER
// #pragma warning( push )
// #pragma warning( disable : 4275 ) // Class needs to have a dll interface to be used by clients of the class.
// #endif

// #include <pylon/_InstantCameraParams.h>
    /** \addtogroup Pylon_InstantCameraApiGeneric
     * \{
     */

    /**Lists the possible grab strategies. */
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

    /**Defines who deletes a passed object if it is not needed anymore. */
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
    /**Deprecated: Use ECleanup instead. */

    /**Defines the use of an additional grab loop thread. */
    /** enum Pylon::EGrabLoop */
    public static final int
        /** The grab loop thread is provided by the Instant Camera. It calls RetrieveResult() in a loop. Grabbed images are processed by registered image event handlers. The grab loop thread is started when the grab starts. */
        GrabLoop_ProvidedByInstantCamera = 0,
        /** The user code calls RetrieveResult() in a loop to process grabbed images and camera events. */
        GrabLoop_ProvidedByUser = 1;

    /**Defines how to register an item. */
    /** enum Pylon::ERegistrationMode */
    public static final int
        /** The item is appended to the list of registered items. */
        RegistrationMode_Append = 0,
        /** The item replaces all other registered items. */
        RegistrationMode_ReplaceAll = 1;

    /**Defines how to register a camera event handler. */
    /** enum Pylon::ECameraEventAvailability */
    public static final int
        /** The camera event must be provided by the camera, otherwise an exception is thrown. */
        CameraEventAvailability_Mandatory = 0,
        /** The camera event handler is not used if the camera does not support the camera event. */
        CameraEventAvailability_Optional = 1;

    /**Defines how to handle a timeout for a method. */
    /** enum Pylon::ETimeoutHandling */
    public static final int
        /** The method returns on timeout. What data is returned can be found in the documentation of the method. */
        TimeoutHandling_Return = 0,
        /** An exception is thrown on timeout. */
        TimeoutHandling_ThrowException = 1;

    /**
    \class  CInstantCamera
    \brief  Provides convenient access to a camera device.
    <p>
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
    @Namespace("Pylon") @NoOffset public static class CInstantCamera extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CInstantCamera(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CInstantCamera(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CInstantCamera position(int position) {
            return (CInstantCamera)super.position(position);
        }
        public CInstantCameraParams_Params asCInstantCameraParams_Params() { return asCInstantCameraParams_Params(this); }
        @Namespace public static native @Name("static_cast<Basler_InstantCameraParams::CInstantCameraParams_Params*>") CInstantCameraParams_Params asCInstantCameraParams_Params(CInstantCamera pointer);
            
    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The maximum number of buffers that are allocated and used for grabbing.
        
    
        <p>
        
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger MaxNumBuffer(); public native CInstantCamera MaxNumBuffer(IInteger MaxNumBuffer);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The maximum number of buffers that are queued in the stream grabber input queue.
        
    
        <p>
        
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger MaxNumQueuedBuffer(); public native CInstantCamera MaxNumQueuedBuffer(IInteger MaxNumQueuedBuffer);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The maximum number of grab results available at any time during a grab session. This value can be limited to save resources. Furthermore, it can be used to check that the grab results are returned correctly.
        
    
        <p>
        
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger MaxNumGrabResults(); public native CInstantCamera MaxNumGrabResults(IInteger MaxNumGrabResults);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief Enables/disables the use of a chunk node map for each grab result. Grab result chunk node maps can be disabled to save resources.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IBoolean ChunkNodeMapsEnable(); public native CInstantCamera ChunkNodeMapsEnable(IBoolean ChunkNodeMapsEnable);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief If larger than 0, a static chunk node map pool is used instead of dynamic chunk node map creation.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger StaticChunkNodeMapPoolSize(); public native CInstantCamera StaticChunkNodeMapPoolSize(IInteger StaticChunkNodeMapPoolSize);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief Enables/disables the grabbing of camera events while images are grabbed. Is writable when the camera object is closed.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IBoolean GrabCameraEvents(); public native CInstantCamera GrabCameraEvents(IBoolean GrabCameraEvents);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The camera object is set to monitor mode when enabled, e.g. when using the GigE multicast feature. Is writable when the camera object is closed.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IBoolean MonitorModeActive(); public native CInstantCamera MonitorModeActive(IBoolean MonitorModeActive);
    
    //@}
    

    /** \name InternalGrabEngineThread - Parameters of the internal grab engine thread. */
    //@{
    /**
        \brief If enabled, the user can set a custom priority for the internal grab engine thread operating the stream grabber. Otherwise the priority defaults to 25.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IBoolean InternalGrabEngineThreadPriorityOverride(); public native CInstantCamera InternalGrabEngineThreadPriorityOverride(IBoolean InternalGrabEngineThreadPriorityOverride);
    
    //@}
    

    /** \name InternalGrabEngineThread - Parameters of the internal grab engine thread. */
    //@{
    /**
        \brief The internal grab engine thread priority.
        <p>
        This value sets the absolute thread priority for the internal grab engine thread operating the stream grabber.
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger InternalGrabEngineThreadPriority(); public native CInstantCamera InternalGrabEngineThreadPriority(IInteger InternalGrabEngineThreadPriority);
    
    //@}
    

    /** \name GrabLoopThread - Parameters of the optional grab loop  thread. */
    //@{
    /**
        \brief If enabled, the user can set a custom timeout for the grab loop thread's call to RetrieveResult. RetrieveResult is configured to throw an exception on timeout, which will stop the grab session.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IBoolean GrabLoopThreadUseTimeout(); public native CInstantCamera GrabLoopThreadUseTimeout(IBoolean GrabLoopThreadUseTimeout);
    
    //@}
    

    /** \name GrabLoopThread - Parameters of the optional grab loop  thread. */
    //@{
    /**
        \brief A custom timeout for the grab loop thread's call to RetrieveResult. RetrieveResult is configured to throw an exception on timeout, which will stop the grab session.
        
    
        <p>
        
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger GrabLoopThreadTimeout(); public native CInstantCamera GrabLoopThreadTimeout(IInteger GrabLoopThreadTimeout);
    
    //@}
    

    /** \name GrabLoopThread - Parameters of the optional grab loop  thread. */
    //@{
    /**
        \brief If enabled, the user can set a custom priority for the grab loop thread. Otherwise, the priority of the newly created thread is not changed.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IBoolean GrabLoopThreadPriorityOverride(); public native CInstantCamera GrabLoopThreadPriorityOverride(IBoolean GrabLoopThreadPriorityOverride);
    
    //@}
    

    /** \name GrabLoopThread - Parameters of the optional grab loop  thread. */
    //@{
    /**
        \brief The grab loop thread priority.
        <p>
        This value sets the absolute thread priority for the grab loop thread.
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger GrabLoopThreadPriority(); public native CInstantCamera GrabLoopThreadPriority(IInteger GrabLoopThreadPriority);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The number of buffers queued at Low Level API stream grabber.
        
        
            <p>
        
        
            This is the number of buffers that are queued for grabbing in the stream grabber.
            The number is influenced by the number of available free buffers and the
            maximum number of buffers that can be queued.
            See also the MaxNumBuffer and MaxNumQueuedBuffer parameters.
            <p>
            This parameter can be used to check whether the number of buffers ready for grabbing
            is stable, which means that the image processing is fast enough to keep up with the
            rate of incoming images when using the GrabStrategy_OneByOne grab strategy.
        
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger NumQueuedBuffers(); public native CInstantCamera NumQueuedBuffers(IInteger NumQueuedBuffers);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The number of grab result buffers in the output queue that are ready for retrieval.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger NumReadyBuffers(); public native CInstantCamera NumReadyBuffers(IInteger NumReadyBuffers);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The number of empty buffers that are not used for grabbing yet.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger NumEmptyBuffers(); public native CInstantCamera NumEmptyBuffers(IInteger NumEmptyBuffers);
    
    //@}
    

    /** \name Root - Instant camera parameters. */
    //@{
    /**
        \brief The size of the grab result buffer output queue.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger OutputQueueSize(); public native CInstantCamera OutputQueueSize(IInteger OutputQueueSize);
    
        //Creation and life time------------------------------------------------

        /**
        \brief Creates an Instant Camera object with no attached %Pylon device.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public CInstantCamera() { super((Pointer)null); allocate(); }
        private native void allocate();


        /**
        \brief Creates an Instant Camera object and calls Attach().
        <p>
        See Attach() for more information.
        <p>
        @param [in]  pDevice The %Pylon device to attach.
        @param [in]  cleanupProcedure If cleanupProcedure equals Cleanup_Delete, the %Pylon device is destroyed when the Instant Camera object is destroyed.
        <p>
        \error
            May throw an exception if the passed %Pylon device is open.
            Does not throw C++ exceptions if the passed %Pylon device is closed or NULL.
        */
        public CInstantCamera( IPylonDevice pDevice, @Cast("Pylon::ECleanup") int cleanupProcedure/*=Pylon::Cleanup_Delete*/) { super((Pointer)null); allocate(pDevice, cleanupProcedure); }
        private native void allocate( IPylonDevice pDevice, @Cast("Pylon::ECleanup") int cleanupProcedure/*=Pylon::Cleanup_Delete*/);
        public CInstantCamera( IPylonDevice pDevice) { super((Pointer)null); allocate(pDevice); }
        private native void allocate( IPylonDevice pDevice);


        /**
        \brief Destroys an Instant Camera object.
        <p>
        Calls Attach( NULL) for destroying or removing a %Pylon device depending on the passed cleanup procedure.
        <p>
        \error
            Does not throw C++ exceptions.
        */


        /**
        \brief  Attaches a %Pylon device to the Instant Camera.
        <p>
        @param [in]  pDevice The %Pylon device to attach.
        @param [in]  cleanupProcedure If cleanupProcedure equals Cleanup_Delete, the %Pylon device is destroyed when the Instant Camera object is destroyed.
        <p>
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
        <p>
        \post
        <ul>
        <li>If the passed pointer to the %Pylon device is NULL, the Instant Camera object is in the "no device attached" state.
        <li>If the passed pointer to the %Pylon device is not NULL, the passed %Pylon device is attached.
        <li>If the set cleanup procedure equals Cleanup_Delete, the %Pylon device is destroyed when the Instant Camera object is destroyed or a new device is attached.
        <li>If the passed %Pylon device is open and the registration of callbacks fails, the Instant Camera object is in the "no device attached" state.
        <li>The opened-by-user flag is set, preventing closing of the %Pylon device on StopGrabbing() when the attached %Pylon device is already open.
        </ul>
        <p>
        \error
            May throw an exception if the passed %Pylon device is open.
            Does not throw C++ exceptions if the passed %Pylon device is closed or NULL.
         <p>
         \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void Attach( IPylonDevice pDevice, @Cast("Pylon::ECleanup") int cleanupProcedure/*=Pylon::Cleanup_Delete*/);
        public native void Attach( IPylonDevice pDevice);


        /**
        \brief Returns the %Pylon device attached state of the Instant Camera object.
        <p>
        @return True if a %Pylon device is attached.
        <p>
        \error
            Does not throw C++ exceptions.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsPylonDeviceAttached();


        /**
        \brief Returns the connection state of the camera device.
        <p>
        The device removal is only detected while the Instant Camera and therefore the attached %Pylon device are open.
        <p>
        The attached %Pylon device is not operable anymore if the camera device has been removed from the PC.
        After it is made sure that no access to the %Pylon device or any of its node maps is made anymore
        the %Pylon device should be destroyed using InstantCamera::DeviceDestroy().
        The access to the %Pylon device can be protected using the lock provided by GetLock(), e.g. when accessing parameters.
        <p>
        @return True if the camera device removal from the PC has been detected.
        <p>
        \error
            Does not throw C++ exceptions.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsCameraDeviceRemoved();


        /**
        \brief Returns the ownership of the attached %Pylon device.
        <p>
        @return True if a %Pylon device is attached and the Instant Camera object has been given the ownership
                by passing the cleanup procedure Cleanup_Delete when calling Attach().
        <p>
        \error
            Does not throw C++ exceptions.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean HasOwnership();


        /**
        \brief  Destroys the attached %Pylon device.
        <p>
        \attention The node maps, e.g. the camera node map, of the attached %Pylon device must not be accessed anymore while destroying the %Pylon device.
        <p>
        <ul>
        <li> If no %Pylon device is attached, nothing is done.
        <li> If the %Pylon device is open, it is closed by calling Close().
        <li> The configuration event OnDestroy is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        <li> The %Pylon device is destroyed even if the cleanup procedure Cleanup_None has been passed when calling Attach() before.
        <li> The configuration event OnDestroyed is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        </ul>
        <p>
        \post No %Pylon device is attached.
        <p>
        \error
            Does not throw C++ exceptions. Possible C++ exceptions are caught and ignored.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void DestroyDevice();


        /**
        \brief  Detaches an attached %Pylon device.
        <p>
        <ul>
        <li> If no %Pylon device is attached, nothing is done.
        <li> If a grab is in progress, it is stopped by calling StopGrabbing().
        <li> The configuration event OnDetach is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        <li> The %Pylon device is detached.
        <li> The configuration event OnDetached is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        </ul>
        <p>
        @return The attached %Pylon device or NULL if nothing has been attached before.
        <p>
        \post
        <ul>
        <li> No %Pylon device is attached.
        <li> The ownership of the %Pylon device goes to the caller who is responsible for destroying the %Pylon device.
        </ul>
        <p>
        \error
            Does not throw C++ exceptions. Possible C++ exceptions are caught and ignored.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native IPylonDevice DetachDevice();


        //Control opening and closing of the device-----------------------------

        /**
        \brief Opens the attached %Pylon device.
        <p>
        <ul>
        <li> Opened by user flag is set, preventing closing of the device on StopGrabbing().
        <li> If the %Pylon device is already open, nothing more is done.
        <li> The OnOpen configuration event is fired. The notification of event handlers stops when an event call triggers an exception.
        <li> The %Pylon device is opened.
        <li> A device removal call back is registered at the %Pylon device.
        <li> Callbacks for camera events are registered at the camera node map.
        <li> The OnOpened configuration event is fired if the %Pylon device has been opened successfully. The notification of event handlers stops when an event call triggers an exception.
        </ul>
        <p>
        \pre A %Pylon device is attached.
        <p>
        \post
        <ul>
        <li> The %Pylon device is open.
        <li> Opened by user flag is set, preventing closing of the %Pylon device on StopGrabbing().
        </ul>
        <p>
        \error
            The Instant Camera object is still valid after error.
            The %Pylon device open may throw.
            Configuration event calls may throw.
            Callback registrations may throw.
            The %Pylon device is closed with Close() if the OnOpened event call triggers an exception.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void Open();


        /**
        \brief Returns the open state of the %Pylon device.
        \error Does not throw C++ exceptions.
        @return Returns true if a %Pylon device is attached and it is open.
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsOpen();


        /**
        \brief Closes the attached %Pylon device.
        <p>
        <ul>
        <li> If no %Pylon device is attached, nothing is done.
        <li> If the %Pylon device is already closed, nothing is done.
        <li> If a grab is in progress, it is stopped by calling StopGrabbing().
        <li> The configuration event OnClose is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        <li> The %Pylon device is closed.
        <li> The configuration event OnClosed is fired if the %Pylon device has been closed successfully. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        </ul>
        <p>
        \post The %Pylon device is closed.
        <p>
        \error
            Does not throw C++ exceptions. Possible C++ exceptions are caught and ignored.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void Close();


        //Grab -----------------------------------------------------------------

        /**
        \brief Starts the grabbing of images.
        <p>
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
        <p>
        @param [in]  strategy The grab strategy. See Pylon::EGrabStrategy for more information
        @param [in]  grabLoopType If grabLoopType equals GrabLoop_ProvidedByInstantCamera, an additional grab loop thread is used to run the grab loop.
        <p>
        \pre
        <ul>
        <li> A %Pylon device is attached.
        <li> The stream grabber of the %Pylon device is closed.
        <li> The grabbing is stopped.
        <li> The attached %Pylon device supports grabbing.
        <li> Must not be called while holding the lock provided by GetLock() when using the grab loop thread.
        </ul>
        <p>
        \post
        <ul>
        <li> The grabbing is started.
        <li> Grab-specific parameters of the camera object are locked, e.g. MaxNumBuffers.
        <li> If grabLoopType equals GrabLoop_ProvidedByInstantCamera, an additional grab loop thread is running that calls RetrieveResult( GrabLoopThreadTimeout, grabResult) in a loop. Images are processed by registered image event handlers.
        <li> Operating the stream grabber from outside the camera object will result in undefined behavior.
        </ul>
        <p>
        \error
            The Instant Camera object is still valid after error. Open() may throw. Configuration event calls may throw. The grab implementation may throw.
            The grabbing is stopped with StopGrabbing() if the OnGrabStarted event call triggers an exception. Throws a C++ exception, if Upcoming Image grab strategy
            is used together with USB camera devices.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void StartGrabbing( @Cast("Pylon::EGrabStrategy") int strategy/*=Pylon::GrabStrategy_OneByOne*/, @Cast("Pylon::EGrabLoop") int grabLoopType/*=Pylon::GrabLoop_ProvidedByUser*/);
        public native void StartGrabbing();


        /**
        \brief Starts the grabbing for a maximum number of images.
        <p>
        Extends the StartGrabbing(EStrategy, EGrabLoop) by a number of images to grab. If the passed count of images has been reached, StopGrabbing is called
        automatically. The images are counted according to the grab strategy. Skipped images are not taken into account.
        <p>
        The amount of allocated buffers is reduced to maxImages when grabbing fewer images
        than according to the value of the \link Pylon::CInstantCamera::MaxNumBuffer \c MaxNumBuffer \endlink parameter
        and the grab strategy is GrabStrategy_OneByOne.
        <p>
        @param [in]  maxImages The count of images to grab. This value must be larger than one.
        @param [in]  strategy The grab strategy. See Pylon::InstantCamera::EStrategy for more information.
        @param [in]  grabLoopType If grabLoopType equals GrabLoop_ProvidedByInstantCamera, an additional grab loop thread is used to run the grab loop.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void StartGrabbing( @Cast("size_t") int maxImages, @Cast("Pylon::EGrabStrategy") int strategy/*=Pylon::GrabStrategy_OneByOne*/, @Cast("Pylon::EGrabLoop") int grabLoopType/*=Pylon::GrabLoop_ProvidedByUser*/);
        public native void StartGrabbing( @Cast("size_t") int maxImages);


        /**
        \brief Retrieves a grab result according to the strategy, waits if it is not yet available
        <p>
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
        <p>
        It needs to be checked whether the grab represented by the grab result has been successful, see CGrabResultData::GrabSucceeded().
        <p>
        @param [in]  timeoutMs  A timeout value in ms for waiting for a grab result, or the INFINITE value.
        @param [out] grabResult  Receives the grab result.
        @param [in]  timeoutHandling  If timeoutHandling equals TimeoutHandling_ThrowException, a timeout exception is thrown on timeout.
        <p>
        @return True if the call successfully retrieved a grab result, false otherwise.
        <p>
        \pre
        <ul>
        <li> There is no other thread waiting for a result. This will be the case when the Instant Camera grab loop thread is used.
        </ul>
        <p>
        \post
        <ul>
        <li> If a grab result has been retrieved, one image is removed from the output queue and is returned in the grabResult parameter.
        <li> If no grab result has been retrieved, an empty grab result is returned in the grabResult parameter.
        <li> If the maximum number of images has been grabbed, the grabbing is stopped.
        <li> If camera event handling is enabled and camera events were received, at least one or more camera event messages have been processed.
        </ul>
        <p>
        \error
            The Instant Camera object is still valid after error. The grabbing is stopped if an exception is thrown.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock() while not waiting.
        */
        public native @Cast("bool") boolean RetrieveResult( @Cast("unsigned int") int timeoutMs, @ByRef CGrabResultPtr grabResult, @Cast("Pylon::ETimeoutHandling") int timeoutHandling/*=Pylon::TimeoutHandling_ThrowException*/);
        public native @Cast("bool") boolean RetrieveResult( @Cast("unsigned int") int timeoutMs, @ByRef CGrabResultPtr grabResult);


        /**
        \brief Stops the grabbing of images.
        <p>
        <ul>
        <li> Nothing is done if the Instant Camera is not currently grabbing.
        <li> The configuration event OnGrabStop is fired. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        <li> The grabbing is stopped.
        <li> All buffer queues of the Instant Camera are cleared.
        <li> The OnGrabStopped configuration event is fired if the grab has been stopped successfully. Possible C++ exceptions from event calls are caught and ignored. All event handlers are notified.
        <li> If the Instant Camera has been opened by StartGrabbing, it is closed by calling Close().
        <li> Grab-specific parameters of the camera object are unlocked, e.g. MaxNumBuffers.
        </ul>
        <p>
        \post
        <ul>
        <li> The grabbing is stopped.
        <li> If the %Pylon device has been opened by StartGrabbing and no other camera object service requires it to be open, it is closed.
        <li> Grab specific parameters of the camera object are unlocked, e.g. MaxNumBuffers.
        </ul>
        <p>
        \error
            Does not throw C++ exceptions. Possible C++ exceptions are caught and ignored.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void StopGrabbing();


        /**
        \brief Returns state of grabbing.
        <p>
        The camera object is grabbing after a successful call to StartGrabbing() until StopGrabbing() is called.
        <p>
        @return Returns true if still grabbing.
        <p>
        \error
            Does not throw C++ exceptions.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsGrabbing();


        /**
        \brief Grabs one image.
        <p>
        The following code shows a simplified version of what is done (happy path):
        <p>
        <pre>{@code
            //grab one image
            StartGrabbing( 1, GrabStrategy_OneByOne, GrabLoop_ProvidedByUser);

            //grab is stopped automatically due to maxImages = 1
            return RetrieveResult( timeoutMs, grabResult, timeoutHandling) && grabResult->GrabSucceeded();
        }</pre>
        <p>
        GrabOne() can be used to together with the CAcquireSingleFrameConfiguration.
        <p>
        \note Using GrabOne is more efficient if the %Pylon device is already open, otherwise the %Pylon device is opened and closed for each call.
        <p>
        \note Grabbing single images using Software Trigger (CSoftwareTriggerConfiguration) is recommended if you want to maximize frame rate.
              This is because the overhead per grabbed image is reduced compared to Single Frame Acquisition.
              The grabbing can be started using StartGrabbing().
              Images are grabbed using the WaitForFrameTriggerReady(), ExecuteSoftwareTrigger() and RetrieveResult() methods instead of using GrabOne.
              The grab can be stopped using StopGrabbing() when done.
        <p>
        @param [in]  timeoutMs  A timeout value in ms for waiting for a grab result, or the INFINITE value.
        @param [out] grabResult  Receives the grab result.
        @param [in]  timeoutHandling  If timeoutHandling equals TimeoutHandling_ThrowException, a timeout exception is thrown on timeout.
        <p>
        @return Returns true if the call successfully retrieved a grab result and the grab succeeded (CGrabResultData::GrabSucceeded()).
        <p>
        \pre Must meet the preconditions of start grabbing.
        \post Meets the postconditions of stop grabbing.
        <p>
        \error
            The Instant Camera object is still valid after error. See StartGrabbing(), RetrieveResult(), and StopGrabbing() .
            In the case of exceptions after StartGrabbing() the grabbing is stopped using StopGrabbing().
        */
        public native @Cast("bool") boolean GrabOne( @Cast("unsigned int") int timeoutMs, @ByRef CGrabResultPtr grabResult, @Cast("Pylon::ETimeoutHandling") int timeoutHandling/*=Pylon::TimeoutHandling_ThrowException*/);
        public native @Cast("bool") boolean GrabOne( @Cast("unsigned int") int timeoutMs, @ByRef CGrabResultPtr grabResult);


        /**
        \brief Deprecated: This method has been deprecated. Use the NumQueuedBuffers parameter instead.
        @return The number of buffers that are queued for grabbing.
        */
        public native @Cast("size_t") int GetQueuedBufferCount();


        /**
        \brief Provides access to a wait object indicating available grab results.
        <p>
        @return A wait object indicating available grab results.
        <p>
        \error
            Does not throw C++ exceptions.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Const @ByRef WaitObject GetGrabResultWaitObject();


        /**
        \brief Provides access to a wait object indicating that the grabbing has stopped.
        <p>
        @return A wait object indicating that the grabbing has stopped.
        <p>
        \error
            Does not throw C++ exceptions.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Const @ByRef WaitObject GetGrabStopWaitObject();


        /**
        \brief Provides access to a wait object indicating available camera events.
        <p>
        This wait object is %Pylon device specific and changes when a new %Pylon device is attached to
        the camera.
        <p>
        @return A wait object indicating available camera events.
        <p>
        \pre
        <ul>
        <li> A %Pylon device is attached.
        <li> The %Pylon device is open.
        </ul>
        <p>
        \error
            The Instant Camera object is still valid after error.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */

        public native @Const @ByRef WaitObject GetCameraEventWaitObject();


        //Event handling--------------------------------------------------------

        /**
        \brief Adds a configurator to the list of registered configurator objects.
        <p>
        <ul>
        <li> If mode equals RegistrationMode_ReplaceAll, the list of registered configurators is cleared.
        <li> If pointer \c pConfigurator is not NULL, it is appended to the list of configurators.
        </ul>
        <p>
        @param [in]  pConfigurator  The receiver of configuration events.
        @param [in]  mode  Indicates how to register the new configurator.
        @param [in]  cleanupProcedure If cleanupProcedure equals Cleanup_Delete, the passed event handler is deleted when no longer needed.
        <p>
        \post The configurator is registered and called on configuration events.
        <p>
        \error
            Does not throw C++ exceptions, except when memory allocation fails.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void RegisterConfiguration( CConfigurationEventHandler pConfigurator, @Cast("Pylon::ERegistrationMode") int mode, @Cast("Pylon::ECleanup") int cleanupProcedure);


        /**
        \brief Removes a configurator from the list of registered configurator objects.
        <p>
        If the configurator is not found, nothing is done.
        <p>
        @param [in]  configurator  The registered receiver of configuration events.
        <p>
        @return True if successful
        <p>
        \post
        <ul>
        <li> The configurator is deregistered.
        <li> If the configuration has been registered by passing a pointer and the cleanup procedure is Cleanup_Delete, the event handler is deleted.
        </ul>
        <p>
        \error
            Does not throw C++ exceptions.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean DeregisterConfiguration( CConfigurationEventHandler configurator);


        /**
        \brief Adds an image event handler to the list of registered image event handler objects.
        <p>
        <ul>
        <li> If mode equals RegistrationMode_ReplaceAll, the list of registered image event handlers is cleared.
        <li> If pointer \c pImageEventHandler is not NULL, it is appended to the list of image event handlers.
        </ul>
        <p>
        @param [in]  pImageEventHandler  The receiver of image events.
        @param [in]  mode  Indicates how to register the new imageEventHandler.
        @param [in]  cleanupProcedure If cleanupProcedure equals Cleanup_Delete, the passed event handler is deleted when no longer needed.
        <p>
        \post The imageEventHandler is registered and called on image related events.
        <p>
        \error
            Does not throw C++ exceptions, except when memory allocation fails.
        <p>
        \threading
            This method is synchronized using the internal image event handler registry lock.
        */
        public native void RegisterImageEventHandler( CImageEventHandler pImageEventHandler, @Cast("Pylon::ERegistrationMode") int mode, @Cast("Pylon::ECleanup") int cleanupProcedure);


        /**
        \brief Removes an image event handler from the list of registered image event handler objects.
        <p>
        If the image event handler is not found, nothing is done.
        <p>
        @param [in]  imageEventHandler  The registered receiver of configuration events.
        <p>
        @return True if successful
        <p>
        \post
        <ul>
        <li> The imageEventHandler is deregistered.
        <li> If the image event handler has been registered by passing a pointer and the cleanup procedure is Cleanup_Delete, the event handler is deleted.
        </ul>
        <p>
        \error
            Does not throw C++ exceptions.
        <p>
        \threading
            This method is synchronized using the internal image event handler registry lock.
        */
        public native @Cast("bool") boolean DeregisterImageEventHandler( CImageEventHandler imageEventHandler);


        /**
        \brief Adds an camera event handler to the list of registered camera event handler objects.
        <p>
        <ul>
        <li> If mode equals RegistrationMode_ReplaceAll, the list of registered camera event handlers is cleared.
        <li> If the pointer \c pCameraEventHandler is not NULL, it is appended to the list of camera event handlers.
        </ul>
        <p>
        @param [in]  pCameraEventHandler  The receiver of camera events.
        @param [in]  nodeName  The name of the event data node updated on camera event, e.g. "ExposureEndEventTimestamp" for exposure end event.
        @param [in]  userProvidedId  This ID is passed as a parameter in CCameraEventHandler::OnCameraEvent and can be used to distinguish between different events.
                                    It is recommended to create an own application specific enum and use it's values as IDs.
        @param [in]  mode  Indicates how to register the new cameraEventHandler.
        @param [in]  cleanupProcedure If cleanupProcedure equals Cleanup_Delete, the passed event handler is deleted when no longer needed.
        @param [in]  availability  If availability equals CameraEventAvailability_Mandatory, the camera must support the data node specified by node name.
                                  If not, an exception is thrown when the Instant Camera is open, the Instant Camera is opened, or an open %Pylon device is attached.
        <p>
        Internally, a GenApi node call back is registered for the node identified by \c nodeName.
        This callback triggers a call to the \c CCameraEventHandler::OnCameraEvent() method.
        That's why a Camera Event Handler can be registered for any node of the camera node map to get informed about changes.
        <p>
        \post The cameraEventHandler is registered and called on camera events.
        <p>
        \error
            Throws an exception if the availability is set to CameraEventAvailability_Mandatory and the node with the name \c nodeName is not available in the camera node map (see GetNodeMap()).
            Throws an exception fail if the node callback registration fails.
            The event handler is not registered when an C++ exception is thrown.
        <p>
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
        <p>
        If the camera event handler is not found, nothing is done.
        <p>
        @param [in]  cameraEventHandler  The registered receiver of camera events.
        @param [in]  nodeName  The name of the event data node updated on camera event, e.g. "ExposureEndEventTimestamp" for exposure end event.
        <p>
        @return True if successful
        <p>
        \post
        <ul>
        <li> The cameraEventHandler is deregistered.
        <li> If the camera event handler has been registered by passing a pointer and the cleanup procedure is Cleanup_Delete, the event handler is deleted.
        </ul>
        <p>
        \error
            Does not throw C++ exceptions.
        <p>
        \threading
        This method is synchronized using the camera event handler lock. If the camera is open, the camera node map lock
        is also used for synchronization.
        */
        public native @Cast("bool") boolean DeregisterCameraEventHandler( CCameraEventHandler cameraEventHandler, @Cast("const Pylon::String_t*") @ByRef gcstring nodeName);



        //Additional features---------------------------------------------------

        /**
        \brief Actively waits until the the camera is ready to accept a frame trigger.
        <p>
        The implementation selects 'FrameTriggerWait' for the 'AcquisitionStatusSelector'
        and waits until the 'AcquisitionStatus' is true.
        If the above mentioned nodes are not available and the 'SoftwareTrigger' node is readable,
        the implementation waits for SoftwareTrigger.IsDone().
        <p>
        The WaitForFrameTriggerReady method does not work for A600 Firewire cameras.
        <p>
        @param [in]  timeoutMs The timeout in ms for active waiting.
        @param [in]  timeoutHandling  If timeoutHandling equals TimeoutHandling_ThrowException, a timeout exception is thrown on timeout.
        @return True if the camera can execute a frame trigger.
        <p>
        \pre The 'AcquisitionStatusSelector' node is writable and the 'AcquisitionStatus' node is readable or the 'SoftwareTrigger' node is readable.
             This depends on the used camera model.
        <p>
        \error
            Accessing the camera registers may fail.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean WaitForFrameTriggerReady( @Cast("unsigned int") int timeoutMs, @Cast("Pylon::ETimeoutHandling") int timeoutHandling/*=Pylon::TimeoutHandling_ThrowException*/);
        public native @Cast("bool") boolean WaitForFrameTriggerReady( @Cast("unsigned int") int timeoutMs);


        /**
        \brief Checks to see whether the camera device can be queried whether it is ready to accept the next frame trigger.
        <p>
        If 'FrameTriggerWait' can be selected for 'AcquisitionStatusSelector' and 'AcquisitionStatus' is readable, the
        camera device can be queried whether it is ready to accept the next frame trigger.
        <p>
        If the nodes mentioned above are not available and the 'SoftwareTrigger' node is readable, the
        camera device can be queried whether it is ready to accept the next frame trigger.
        <p>
        \note If a camera device can't be queried whether it is ready to accept the next frame trigger, the camera device is
        ready to accept the next trigger after the last image triggered has been grabbed, e.g. after you have retrieved
        the last image triggered using RetrieveResult(). Camera devices that can be queried whether they are ready to accept the
        next frame trigger, may not be ready for the next frame trigger after the last image triggered has been grabbed.
        <p>
        @return Returns true if the camera is open and the camera device can be queried whether it is ready to accept the next frame trigger.
        <p>
        \post The 'AcquisitionStatusSelector' is set to 'FrameTriggerWait' if writable.
        <p>
        \error
        Accessing the camera registers may fail.
        <p>
        \threading
        This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean CanWaitForFrameTriggerReady();


        /**
        \brief Executes the software trigger command.
        <p>
        The camera needs to be configured for software trigger mode.
        Additionally, the camera needs to be ready to accept triggers.
        When triggering a frame this can be checked using the WaitForFrameTriggerReady() method;
        <p>
        \note The application has to make sure that the correct trigger is selected
              before calling ExecuteSoftwareTrigger().
              This can be done via the camera's TriggerSelector node.
              The \c Pylon::CSoftwareTriggerConfiguration
              selects the correct trigger when the Instant Camera is opened.
        <p>
        \pre
        <ul>
        <li> The grabbing is started.
        <li> The camera device supports software trigger.
        <li> The software trigger is available. This depends on the configuration of the camera device.
        </ul>
        <p>
        \error
            Accessing the camera registers may fail. Throws an exception on timeout if \c timeoutHandling is TimeoutHandling_ThrowException.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void ExecuteSoftwareTrigger();


        /**
        \brief Sets a context that is attached to each grab result of the camera object on RetrieveResult().
        This is useful when handling multiple cameras. It has nothing in common with the context passed to the stream grabber when queuing a buffer.
        <p>
        \error
            Does not throw C++ exceptions.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void SetCameraContext( @Cast("intptr_t") long context);


        /**
        \brief Returns the context that is attached to each grab result of the camera object
        <p>
        \error
            Does not throw C++ exceptions.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("intptr_t") long GetCameraContext();


        /**
        \brief Provides access to the device info object of the attached %Pylon device or an empty one.
        @return The info object of the attached %Pylon device or an empty one.
        <p>
        \error
            Does not throw C++ exceptions.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @Const @ByRef CDeviceInfo GetDeviceInfo();


        /**
        \brief Provides access to the node map of the camera device.
        <p>
        The %Pylon device must be opened before reading ore writing any parameters of the camera device.
        This can be done using the Open() method of the Instant Camera class.
        <p>
        @return Reference to the node map of the camera device.
        <p>
        \pre A %Pylon device is attached.
        <p>
        \error
            The Instant Camera object is still valid after error.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByRef INodeMap GetNodeMap();


        /**
        \brief Provides access to the transport layer node map of the attached %Pylon device.
        @return Reference to the transport layer node map of the attached %Pylon device
            or the reference to the empty node map if a transport layer node map is not supported.
            The GenApi::INodeMap::GetNumNodes() method can be used to check whether the node map is empty.
        <p>
        \pre A %Pylon device is attached.
        <p>
        \error
            The Instant Camera object is still valid after error.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByRef INodeMap GetTLNodeMap();


        /**
        \brief Provides access to the stream grabber node map of the attached %Pylon device.
        @return Reference to the stream grabber node map of the attached %Pylon device
            or the reference to the empty node map if grabbing is not supported.
            The GenApi::INodeMap::GetNumNodes() method can be used to check whether the node map is empty.
        <p>
        \pre
        <ul>
        <li> A %Pylon device is attached.
        <li> The %Pylon device is open.
        </ul>
        <p>
        \error
            The Instant Camera object is still valid after error.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByRef INodeMap GetStreamGrabberNodeMap();


        /**
        \brief Provides access to the event grabber node map of the attached %Pylon device.
        @return Reference to the event grabber node map of the attached %Pylon device
            or a reference to the empty node map if event grabbing is not supported.
            The GenApi::INodeMap::GetNumNodes() method can be used to check whether the node map is empty.
        <p>
        \pre
        <ul>
        <li> A %Pylon device is attached.
        <li> The %Pylon device is open.
        </ul>
        <p>
        \error
            The Instant Camera object is still valid after error.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByRef INodeMap GetEventGrabberNodeMap();


        /**
        \brief Provides access to the node map of the Instant Camera object.
        <p>
        The node map of the camera device is made available by the GetNodeMap() method.
        <p>
        @return Reference to the node map of the Instant Camera object.
        <p>
        \error
            Does not throw C++ exceptions.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByRef INodeMap GetInstantCameraNodeMap();


        /**
        \brief Sets an alternative buffer factory that is used for buffer allocation.
        <p>
        This use of this method is optional and intended for advanced use cases only.
        <p>
        If NULL is passed as buffer factory then the default buffer factory is used.
        Buffers are allocated when StartGrabbing is called.
        A buffer factory must not be deleted while it is attached to the camera object
        and it must not be deleted until the last buffer is freed. To free all buffers
        the grab needs to be stopped and all grab results must be released or destroyed.
        <p>
        @param [in]  pFactory  A pointer to a buffer factory.
        @param [in]  cleanupProcedure If ownership is cleanupProcedure Cleanup_Delete, the passed factory is destroyed when no longer needed.
        <p>
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native void SetBufferFactory( IBufferFactory pFactory, @Cast("Pylon::ECleanup") int cleanupProcedure/*=Pylon::Cleanup_Delete*/);
        public native void SetBufferFactory( IBufferFactory pFactory);


        /**
        \brief Returns true if an IEEE 1394 %Pylon device is attached to the Instant Camera object.
        <p>
        This method is provided for convenience only. The device type can also be determined as shown in the following example.
        <p>
        <pre>{@code
        #include <pylon/DeviceClass.h>
        ...
        if (camera.GetDeviceInfo().GetDeviceClass() == Basler1394DeviceClass)
        {
            ...
        }
        }</pre>
        <p>
        \threading
        This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean Is1394();


        /**
        \brief Returns true if a GigE %Pylon device is attached to the Instant Camera object.
        <p>
        This method is provided for convenience only. The device type can also be determined as shown in the following example.
        <p>
        <pre>{@code
        #include <pylon/DeviceClass.h>
        ...
        if (camera.GetDeviceInfo().GetDeviceClass() == BaslerGigEDeviceClass)
        {
        ...
        }
        }</pre>
        <p>
        \threading
        This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsGigE();


        /**
        \brief Returns true if a USB %Pylon device is attached to the Instant Camera object.
        <p>
        This method is provided for convenience only. The device type can also be determined as shown in the following example.
        <p>
        <pre>{@code
        #include <pylon/DeviceClass.h>
        ...
        if (camera.GetDeviceInfo().GetDeviceClass() == BaslerUsbDeviceClass)
        {
        ...
        }
        }</pre>
        <p>
        \threading
        This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsUsb();


        /**
        \brief Returns true if a Camera Link %Pylon device is attached to the Instant Camera object.
        <p>
        This method is provided for convenience only. The device type can also be determined as shown in the following example.
        <p>
        <pre>{@code
        #include <pylon/DeviceClass.h>
        ...
        if (camera.GetDeviceInfo().GetDeviceClass() == BaslerCameraLinkDeviceClass)
        {
        ...
        }
        }</pre>
        <p>
        \threading
        This method is synchronized using the lock provided by GetLock().
        */
        public native @Cast("bool") boolean IsCameraLink();


        /**
        \brief Returns the SFNC version read from the camera node map.
        <p>
        The SFNC version is read from the camera node map using the integer nodes
        DeviceSFNCVersionMajor, DeviceSFNCVersionMinor, and DeviceSFNCVersionSubMinor.
        <p>
        @return The SFNC version used by the camera device. The returned SFNC version is 0.0.0 (Pylon::Sfnc_VersionUndefined)
                if no SFNC version information is provided by the camera device.
        <p>
        \pre A %Pylon device is attached.
        <p>
        \error
            The Instant Camera object is still valid after error.
        <p>
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
     * \}
     */

// #ifdef _MSC_VER
// #pragma warning( pop )
// #endif

// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_INSTANTCAMERA_H_08725703 */


// Parsed from <pylon/AcquireSingleFrameConfiguration.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief An instant camera configuration for single frame acquisition.
    Use together with Pylon::CInstantCamera::GrabOne() only.
    This  instant camera configuration is provided as header-only file. The code
    can be copied and modified for creating own configuration classes.
*/

// #ifndef INCLUDED_ACQUIRESINGLEFRAMECONFIGURATION_H_6529309
// #define INCLUDED_ACQUIRESINGLEFRAMECONFIGURATION_H_6529309

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/InstantCamera.h>
    /** \addtogroup Pylon_InstantCameraApiGeneric
     * \{
     */

    /**
    \class  CAcquireSingleFrameConfiguration
    \brief  An instant camera configuration for single frame acquisition, Use together with CInstantCamera::GrabOne() only.
        <p>
        The %CAcquireSingleFrameConfiguration is provided as header-only file.
        The code can be copied and modified for creating own configuration classes.
        <p>
        \note Grabbing single images using Software Trigger (CSoftwareTriggerConfiguration) is recommended if you want to maximize frame rate.
        This is because the overhead per grabbed image is reduced compared to Single Frame Acquisition.
        The grabbing can be started using CInstantCamera::StartGrabbing().
        Images are grabbed using the CInstantCamera::WaitForFrameTriggerReady(), CInstantCamera::ExecuteSoftwareTrigger() and CInstantCamera::RetrieveResult() methods instead of using CInstantCamera::GrabOne().
        The grab can be stopped using CInstantCamera::StopGrabbing() when done.
    <p>
    */
    @Namespace("Pylon") public static class CAcquireSingleFrameConfiguration extends CConfigurationEventHandler {
        static { Loader.load(); }
        /** Default native constructor. */
        public CAcquireSingleFrameConfiguration() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CAcquireSingleFrameConfiguration(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CAcquireSingleFrameConfiguration(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public CAcquireSingleFrameConfiguration position(int position) {
            return (CAcquireSingleFrameConfiguration)super.position(position);
        }
    
        /** Apply acquire single frame configuration. */
        public static native void ApplyConfiguration( @ByRef INodeMap nodemap);

        //Set basic camera settings
        public native void OnOpened( @ByRef CInstantCamera camera);
    }

    /**
     * \}
     */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_ACQUIRESINGLEFRAMECONFIGURATION_H_6529309 */


// Parsed from <pylon/AcquireContinuousConfiguration.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief An instant camera configuration for free-running continuous acquisition.
    This  instant camera configuration is provided as header-only file. The code
    can be copied and modified for creating own configuration classes.
*/

// #ifndef INCLUDED_ACQUIRECONTINUOUSCONFIGURATION_H_7346765
// #define INCLUDED_ACQUIRECONTINUOUSCONFIGURATION_H_7346765

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/InstantCamera.h>
    /** \addtogroup Pylon_InstantCameraApiGeneric
     * \{
     */

    /**
    \class  CAcquireContinuousConfiguration
    \brief Changes the configuration of the camera to free-running continuous acquisition.
        <p>
        The \c CAcquireContinuousConfiguration is the default configuration of the Instant Camera class.
        The CAcquireContinuousConfiguration is automatically registered when an Instant Camera object is created.
        <p>
        This instant camera configuration is provided as header-only file. The code
        can be copied and modified for creating own configuration classes.
    */
    @Namespace("Pylon") public static class CAcquireContinuousConfiguration extends CConfigurationEventHandler {
        static { Loader.load(); }
        /** Default native constructor. */
        public CAcquireContinuousConfiguration() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CAcquireContinuousConfiguration(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CAcquireContinuousConfiguration(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public CAcquireContinuousConfiguration position(int position) {
            return (CAcquireContinuousConfiguration)super.position(position);
        }
    
        /** Apply acquire continuous configuration. */
        public static native void ApplyConfiguration( @ByRef INodeMap nodemap);


        //Set basic camera settings.
        public native void OnOpened( @ByRef CInstantCamera camera);
    }

    /**
     * \}
     */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_ACQUIRECONTINUOUSCONFIGURATION_H_7346765 */


// Parsed from <pylon/SoftwareTriggerConfiguration.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief An instant camera configuration for software trigger,
       Use together with Pylon::CInstantCamera::WaitForFrameTriggerReady() and Pylon::CInstantCamera::ExecuteSoftwareTrigger().
       This  instant camera configuration is provided as header-only file. The code
       can be copied and modified for creating own configuration classes.
*/

// #ifndef INCLUDED_SOFTWARETRIGGERCONFIGURATION_H_4655834
// #define INCLUDED_SOFTWARETRIGGERCONFIGURATION_H_4655834

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/InstantCamera.h>
    /** \addtogroup Pylon_InstantCameraApiGeneric
     * \{
     */

    /**
    \class  CSoftwareTriggerConfiguration
    \brief  Changes the configuration of the camera so that the acquisition of frames is triggered by software trigger.
            Use together with CInstantCamera::WaitForFrameTriggerReady() and CInstantCamera::ExecuteSoftwareTrigger().
        <p>
        The %CSoftwareTriggerConfiguration is provided as header-only file.
        The code can be copied and modified for creating own configuration classes.
    */
    @Namespace("Pylon") public static class CSoftwareTriggerConfiguration extends CConfigurationEventHandler {
        static { Loader.load(); }
        /** Default native constructor. */
        public CSoftwareTriggerConfiguration() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CSoftwareTriggerConfiguration(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CSoftwareTriggerConfiguration(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public CSoftwareTriggerConfiguration position(int position) {
            return (CSoftwareTriggerConfiguration)super.position(position);
        }
    
        /** Apply software trigger configuration. */
        public static native void ApplyConfiguration( @ByRef INodeMap nodemap);

        //Set basic camera settings.
        public native void OnOpened( @ByRef CInstantCamera camera);
    }

    /**
     * \}
     */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_SOFTWARETRIGGERCONFIGURATION_H_4655834 */


// Parsed from <pylon/ReusableImage.h>

//------------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//------------------------------------------------------------------------------
/**
    \file
    \brief  Contains an interface for a reusable image.
*/

// #ifndef INCLUDED_REUSABLEIMAGE_H_1558802
// #define INCLUDED_REUSABLEIMAGE_H_1558802

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/PylonBase.h>
// #include <pylon/Image.h>
    /** \addtogroup Pylon_ImageHandlingSupport
     * \{
     */

    /**
    \interface  IReusableImage
    \brief  Extends the IImage interface to be able to reuse the image's resources to represent a different image.
    */
    @Namespace("Pylon") public static class IReusableImage extends IImage {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IReusableImage(Pointer p) { super(p); }
    
        /** Ensure proper destruction by using a virtual destructor. */
        // implementation must be out of class or older compilers will throw an error (see below)


        /**
        \brief Can be used to check whether the pixel type is supported.
        <p>
        @return Returns true if the pixel type is supported.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean IsSupportedPixelType( @Cast("Pylon::EPixelType") int pixelType);


        /**
        \brief Can be used to check whether the value of PaddingX can be defined by the user.
        <p>
        @return Returns true if the value of PaddingX can be defined by the user.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean IsAdditionalPaddingSupported();


        /**
        \brief Resets the image properties and provides a buffer to hold the image.
        <p>
        @param [in]   pixelType   The pixel type of the new image.
        @param [in]   width       The number of pixels in a row in the new image.
        @param [in]   height      The number of rows in the new image.
        @param [in]   orientation The vertical orientation of the image in the image buffer.
        <p>
        \pre
        <ul>
        <li> The IsSupportedPixelType() method returns true.
        <li> The \c width value must be >= 0 and < _I32_MAX.
        <li> The \c height value must be >= 0 and < _I32_MAX.
        </ul>
        <p>
        \post
        <ul>
        <li> The properties of the image are changed.
        <li> A buffer large enough to hold the image is provided.
        </ul>
        <p>
        \error
            Throws an exception when the preconditions are not met.
            Throws an exception when no buffer with the required size can be provided, e.g. by allocation.
            The original representation is preserved on error.
        */
        public native void Reset( @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("Pylon::EImageOrientation") int orientation/*=Pylon::ImageOrientation_TopDown*/);
        public native void Reset( @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height);


        /**
        \brief Resets the image properties including user defined PaddingX and provides a buffer to hold the image.
        <p>
        Extends the Reset(EPixelType, uint32_t, uint32_t) method with user provided padding.
        <p>
        @param [in]   pixelType The pixel type of the new image.
        @param [in]   width     The number of pixels in a row in the new image.
        @param [in]   height    The number of rows in the new image.
        @param [in]   paddingX  The number of extra data bytes at the end of each row.
        @param [in]   orientation The vertical orientation of the image in the image buffer.
        <p>
        \pre
        <ul>
        <li> The preconditions of the Reset() method without paddingX parameter apply.
        <li> The IsAdditionalPaddingSupported() method returns true.
        </ul>
        */
        public native void Reset( @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX, @Cast("Pylon::EImageOrientation") int orientation/*=Pylon::ImageOrientation_TopDown*/);


        /**
        \brief Releases the image buffer and resets to an invalid image.
        <p>
        \post
            <ul>
            <li> PixelType = PixelType_Undefined.
            <li> Width = 0.
            <li> Height = 0.
            <li> PaddingX = 0.
            <li> No buffer is allocated.
            </ul>
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native void Release();
    }

    /**
     * \}
     */

     // implementation for d'tor must be out of class
     



// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_REUSABLEIMAGE_H_1558802 */


// Parsed from <pylon/ImagePersistence.h>

//------------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2011-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//------------------------------------------------------------------------------
/**
    \file
    \brief  Contains an image loading and saving support class.
*/
// #ifndef INCLUDED_IMAGEPERSISTENCE_H_3336145
// #define INCLUDED_IMAGEPERSISTENCE_H_3336145

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */


// #include <pylon/stdinclude.h>
// #include <pylon/PylonUtility.h>
// #include <pylon/ReusableImage.h>
    /** \addtogroup Pylon_ImageHandlingSupport
     * \{
     */

// #if defined(PYLON_WIN_BUILD)
    /** Lists the available file formats */
    /** enum Pylon::EImageFileFormat */
    public static final int
        /** Windows Bitmap, no compression. */
        ImageFileFormat_Bmp = 0,
        /** Tagged Image File Format, no compression, supports mono images with more than 8 bit bit depth. */
        ImageFileFormat_Tiff = 1,
        /** Joint Photographic Experts Group, lossy data compression. */
        ImageFileFormat_Jpeg = 2,
        /** Portable Network Graphics, lossless data compression. */
        ImageFileFormat_Png = 3;
// #elif defined(PYLON_LINUX_BUILD)
// #else
// #   error unsupported platform
// #endif


    /** Used to pass options to CImagePersistence methods. */
    @Namespace("Pylon") @NoOffset public static class CImagePersistenceOptions extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CImagePersistenceOptions(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CImagePersistenceOptions(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CImagePersistenceOptions position(int position) {
            return (CImagePersistenceOptions)super.position(position);
        }
    
        public CImagePersistenceOptions() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Set the image quality options. Valid quality values range from 0 to 100. */
        public native void SetQuality( int quality);

        /** Returns the set quality level. */
        public native int GetQuality();
    }


    /**
    \class  CImagePersistence
    \brief  Contains static functions supporting loading and saving of images.
    */
    @Namespace("Pylon") public static class CImagePersistence extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public CImagePersistence() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CImagePersistence(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CImagePersistence(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public CImagePersistence position(int position) {
            return (CImagePersistence)super.position(position);
        }
    
        /**
        \brief Saves the image to disk. Converts the image to a format that can be saved if required.
        <p>
        If required, the image is automatically converted to a new image and then saved. See
        CanSaveWithoutConversion() for more information.
        An image with a bit depth higher than 8 bit is stored with 16 bit bit depth
        if supported by the image file format. In this case the pixel data is MSB aligned.
        <p>
        If more control over the conversion is required then the CImageFormatConverter class
        can be used to convert the input image before saving it.
        <p>
        @param [in]   imageFileFormat The file format to save the image in.
        @param [in]   filename        Name and path of the image.
        @param [in]   pBuffer    The pointer to the buffer of the image.
        @param [in]   bufferSize The size of the buffer in byte.
        @param [in]   pixelType  The pixel type of the image to save.
        @param [in]   width      The number of pixels in a row of the image to save.
        @param [in]   height     The number of rows of the image to save.
        @param [in]   paddingX   The number of extra data bytes at the end of each row.
        @param [in]   orientation The vertical orientation of the image in the image buffer.
        @param [in]   pOptions   Additional options.
        <p>
        \pre
        <ul>
        <li> The pixel type of the image to save must be a supported input format of the Pylon::CImageFormatConverter.
        <li> The \c width value must be >= 0 and < _I32_MAX.
        <li> The \c height value must be >= 0 and < _I32_MAX.
        </ul>
        <p>
        \error
            Throws an exception if saving the image fails.
        */
        public static native void Save( @Cast("Pylon::EImageFileFormat") int imageFileFormat, @Cast("const Pylon::String_t*") @ByRef gcstring filename, @Const Pointer pBuffer, @Cast("size_t") int bufferSize, @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX, @Cast("Pylon::EImageOrientation") int orientation, CImagePersistenceOptions pOptions/*=NULL*/);
        public static native void Save( @Cast("Pylon::EImageFileFormat") int imageFileFormat, @Cast("const Pylon::String_t*") @ByRef gcstring filename, @Const Pointer pBuffer, @Cast("size_t") int bufferSize, @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX, @Cast("Pylon::EImageOrientation") int orientation);


        /**
        \brief Saves the image to disk. Converts the image to a format that can be if required.
        <p>
        If required, the image is automatically converted to a new image and then saved. See
        CanSaveWithoutConversion() for more information.
        An image with a bit depth higher than 8 bit is stored with 16 bit bit depth
        if supported by the image file format. In this case the pixel data is MSB aligned.
        <p>
        If more control over the conversion is required then the CImageFormatConverter class
        can be used to convert the input image before saving it.
        <p>
        @param [in]   imageFileFormat The target file format for the image to save.
        @param [in]   filename        Name and path of the image.
        @param [in]   image           The image to save, e.g. a CPylonImage, CPylonBitmapImage, or Grab Result Smart Pointer object.
        @param [in]   pOptions        Additional options.
        <p>
        \pre
            The pixel type of the image to save must be a supported input format of the Pylon::CImageFormatConverter.
        <p>
        \error
            Throws an exception if saving the image fails.
        */
        public static native void Save( @Cast("Pylon::EImageFileFormat") int imageFileFormat, @Cast("const Pylon::String_t*") @ByRef gcstring filename, @Const @ByRef IImage image, CImagePersistenceOptions pOptions/*=NULL*/);
        public static native void Save( @Cast("Pylon::EImageFileFormat") int imageFileFormat, @Cast("const Pylon::String_t*") @ByRef gcstring filename, @Const @ByRef IImage image);


        /**
        \brief Can be used to check whether the given image can be saved without prior conversion.
        <p>
        See the CImagePersistence::CanSaveWithoutConversion( EImageFileFormat, const IImage&) method documentation for a list of supported pixel formats.
        <p>
        @param [in]   imageFileFormat The target file format for the image to save.
        @param [in]   pixelType The pixel type of the image to save.
        @param [in]   width     The number of pixels in a row of the image to save.
        @param [in]   height    The number of rows of the image to save.
        @param [in]   paddingX  The number of extra data bytes at the end of each row.
        @param [in]   orientation The vertical orientation of the image in the image buffer.
        @return Returns true if the image can be saved without prior conversion.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public static native @Cast("bool") boolean CanSaveWithoutConversion( @Cast("Pylon::EImageFileFormat") int imageFileFormat, @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX, @Cast("Pylon::EImageOrientation") int orientation);


        /**
        \brief Can be used to check whether the image can be saved without prior conversion.
        <p>
        Supported formats for TIFF:
        <ul>
        <li> PixelType_Mono8
        <li> PixelType_Mono16
        <li> PixelType_RGB8packed
        <li> PixelType_RGB16packed
        </ul>
        <p>
        Supported formats for BMP, JPEG and PNG:
        <ul>
        <li> PixelType_Mono8
        <li> PixelType_BGR8packed
        <li> PixelType_BGRA8packed
        </ul>
        <p>
        @param [in]   imageFileFormat The target file format for the image to save.
        @param [in]   image           The image to save, e.g. a CPylonImage, CPylonBitmapImage, or Grab Result Smart Pointer object.
        @return Returns true if the image can be saved without prior conversion.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public static native @Cast("bool") boolean CanSaveWithoutConversion( @Cast("Pylon::EImageFileFormat") int imageFileFormat, @Const @ByRef IImage image);


        /**
        \brief Loads an image from disk.
        <p>
        The orientation of loaded images is always ImageOrientation_TopDown.
        <p>
        @param [in]   filename        Name and path of the image.
        @param [in]   image           The target image object, e.g. a CPylonImage or CPylonBitmapImage object.
                                     When passing a CPylonBitmapImage object the loaded format must be supported by the CPylonBitmapImage class.
        <p>
        \error
            Throws an exception if the image cannot be loaded. The image buffer content is undefined when the loading of the image fails.
        */
        public static native void Load( @Cast("const Pylon::String_t*") @ByRef gcstring filename, @ByRef IReusableImage image);

        /**
        \brief Loads an image from memory.
        <p>
        The orientation of loaded images is always ImageOrientation_TopDown.
        Currently BMP, JPEG & PNG images are supported.
        <p>
        @param [in]   pBuffer         The pointer to the buffer of the source image.
        @param [in]   bufferSizeBytes The size of the buffer of the source image.
        @param [in]   image           The target image object, e.g. a CPylonImage or CPylonBitmapImage object.
                                     When passing a CPylonBitmapImage object the loaded format must be supported by the CPylonBitmapImage class.
        <p>
        \error
            Throws an exception if the image cannot be loaded. The image buffer content is undefined when the loading of the image fails.
        */
        public static native void LoadFromMemory( @Const Pointer pBuffer, @Cast("size_t") int bufferSizeBytes, @ByRef IReusableImage image);

    }

    /**
     * \}
     */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_IMAGEPERSISTENCE_H_3336145 */


// Parsed from <pylon/PixelData.h>

//------------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2012-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//------------------------------------------------------------------------------
/**
    \file
    \brief  Contains a data structure describing the data of one pixel.
*/

// #ifndef INCLUDED_PIXELDATA_H_9714014
// #define INCLUDED_PIXELDATA_H_9714014

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/PylonBase.h>
    /** \addtogroup Pylon_ImageHandlingSupport
     * \{
     */

    /**
    \class  SPixelData
    \brief  Describes the data of one pixel.
    */
    @Namespace("Pylon") @NoOffset public static class SPixelData extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public SPixelData(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public SPixelData(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public SPixelData position(int position) {
            return (SPixelData)super.position(position);
        }
    
        /** Construct and clear. */
        public SPixelData() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Lists the possible pixel data types.
         *  Do not confound this enumeration with the Pylon::PixelType enumeration that lists all pixel formats. */
        /** enum Pylon::SPixelData::EPixelDataType */
        public static final int
            /** Will be returned, if the pixel data cannot be determined. */
            PixelDataType_Unknown = 0,
            /** Pixel data of monochrome images. */
            PixelDataType_Mono = 1,
            /** Pixel data of YUV images. */
            PixelDataType_YUV = 2,
            /** Pixel data of RGB or BGR images. */
            PixelDataType_RGB = 3,
            /** Pixel data of RGB or BGR images with alpha channel. */
            PixelDataType_RGBA = 4,
            /** Pixel data of a red pixel of bayer images. */
            PixelDataType_BayerR = 5,
            /** Pixel data of a green pixel of bayer images. */
            PixelDataType_BayerG = 6,
            /** Pixel data of a blue pixel of bayer images. */
            PixelDataType_BayerB = 7;

        /** The type of pixel data held. */
        public native @Cast("Pylon::SPixelData::EPixelDataType") int PixelDataType(); public native SPixelData PixelDataType(int PixelDataType);
        /** The bit depth of the data held. */
        public native @Cast("uint32_t") int BitDepth(); public native SPixelData BitDepth(int BitDepth);

            /** Pixel data of monochrome images. */
            @Name("Data.Mono") public native int Data_Mono(); public native SPixelData Data_Mono(int Data_Mono);
            /** Pixel data of a red pixel of bayer images. */
            @Name("Data.BayerR") public native int Data_BayerR(); public native SPixelData Data_BayerR(int Data_BayerR);
            /** Pixel data of a green pixel of bayer images. */
            @Name("Data.BayerG") public native int Data_BayerG(); public native SPixelData Data_BayerG(int Data_BayerG);
            /** Pixel data of a blue pixel of bayer images. */
            @Name("Data.BayerB") public native int Data_BayerB(); public native SPixelData Data_BayerB(int Data_BayerB);

                /** Brightness. */
                @Name("Data.YUV.Y") public native int Data_YUV_Y(); public native SPixelData Data_YUV_Y(int Data_YUV_Y);
                /** Chroma U. */
                @Name("Data.YUV.U") public native int Data_YUV_U(); public native SPixelData Data_YUV_U(int Data_YUV_U);
                /** Chroma V. */
                @Name("Data.YUV.V") public native int Data_YUV_V(); public native SPixelData Data_YUV_V(int Data_YUV_V);

                /** Red. */
                @Name("Data.RGB.R") public native int Data_RGB_R(); public native SPixelData Data_RGB_R(int Data_RGB_R);
                /** Green. */
                @Name("Data.RGB.G") public native int Data_RGB_G(); public native SPixelData Data_RGB_G(int Data_RGB_G);
                /** Blue. */
                @Name("Data.RGB.B") public native int Data_RGB_B(); public native SPixelData Data_RGB_B(int Data_RGB_B);

                /** Red. */
                @Name("Data.RGBA.R") public native int Data_RGBA_R(); public native SPixelData Data_RGBA_R(int Data_RGBA_R);
                /** Green. */
                @Name("Data.RGBA.G") public native int Data_RGBA_G(); public native SPixelData Data_RGBA_G(int Data_RGBA_G);
                /** Blue. */
                @Name("Data.RGBA.B") public native int Data_RGBA_B(); public native SPixelData Data_RGBA_B(int Data_RGBA_B);
                /** Transparency. */
                @Name("Data.RGBA.A") public native int Data_RGBA_A(); public native SPixelData Data_RGBA_A(int Data_RGBA_A);

        /** Compares pixel data. */
        public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef SPixelData rhs);

        /** Compares pixel data. */
        public native @Cast("bool") @Name("operator !=") boolean notEquals( @Const @ByRef SPixelData rhs);
    }

    /**
     * \}
     */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_PIXELDATA_H_9714014 */


// Parsed from <pylon/PylonImageBase.h>

//------------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//------------------------------------------------------------------------------
/**
    \file
    \brief  Contains the pylon image base class.
*/

// #ifndef INCLUDED_PYLONIMAGEBASE_H_6835095
// #define INCLUDED_PYLONIMAGEBASE_H_6835095

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/stdinclude.h>
// #include <pylon/PylonUtility.h>
// #include <pylon/ReusableImage.h>
// #include <pylon/ImagePersistence.h>
// #include <pylon/PixelData.h>
    /** \addtogroup Pylon_ImageHandlingSupport
     * \{
     */

    /**
    \class  CPylonImageBase
    \brief  Provides basic functionality for pylon image classes.
    */
    @Namespace("Pylon") public static class CPylonImageBase extends IReusableImage {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CPylonImageBase(Pointer p) { super(p); }
    

        /**
        \brief Saves the image to disk. Converts the image to a format that can be saved if required.
        <p>
        This is a convenience method that calls CImagePersistence::Save().
        <p>
        If required, the image is automatically converted into a new image and saved afterwards. See
        CImagePersistence::CanSaveWithoutConversion() for more information.
        An image with a bit depth higher than 8 bit is stored with 16 bit bit depth,
        if supported by the image file format. In this case the pixel data is MSB aligned.
        <p>
        If more control over the conversion is required, the CImageFormatConverter class
        can be used to convert the input image before saving it.
        <p>
        @param [in]   imageFileFormat File format to save the image in.
        @param [in]   filename        Name and path of the image.
        @param [in]   pOptions        Additional options.
        <p>
        \pre
            The pixel type of the image to be saved must be a supported input format of the Pylon::CImageFormatConverter.
        <p>
        \error
            Throws an exception if the saving of the image fails.
        */
        public native void Save(  @Cast("Pylon::EImageFileFormat") int imageFileFormat, @Cast("const Pylon::String_t*") @ByRef gcstring filename, CImagePersistenceOptions pOptions/*=NULL*/);
        public native void Save(  @Cast("Pylon::EImageFileFormat") int imageFileFormat, @Cast("const Pylon::String_t*") @ByRef gcstring filename);


        /**
        \brief Loads an image from a disk.
        <p>
        This is a convenience method that calls CImagePersistence::Load()
        <p>
        @param [in]   filename Name and path of the image.
        <p>
        \pre
            The image object must be able to hold the image format of the loaded image.
        <p>
        \error
            Throws an exception if the image cannot be loaded. The image buffer content is undefined when the loading of the image fails.
        */
        public native void Load( @Cast("const Pylon::String_t*") @ByRef gcstring filename);


        /**
        \brief Can be used to check whether the image can be saved without prior conversion.
         <p>
         This is a convenience method that calls CImagePersistence::CanSaveWithoutConversion().
        <p>
        @param [in]   imageFileFormat Target file format for the image to be saved.
        @return Returns true, if the image can be saved without prior conversion.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean CanSaveWithoutConversion( @Cast("Pylon::EImageFileFormat") int imageFileFormat);

        /**
        \brief Retrieves the data of a pixel.
        <p>
        \note This method is relativly slow. Do not use it for image processing tasks.
        <p>
        @param [in]   posX Horizontal position of the pixel. The first column has position 0.
        @param [in]   posY Vertical position of the pixel. The first row has position 0.
        @return Returns the data of a pixel for supported pixel types. For unsupported pixel types pixel data of the SPixelData::PixelDataType_Unknown type is returned.
        <p>
        \pre
        <ul>
        <li> The image must be valid.
        <li> The pixel position defined by \c posX and \c posY must be located inside the image area.
        </ul>
        <p>
        Supported pixel types:
        <ul>
        <li> PixelType_Mono1packed
        <li> PixelType_Mono2packed
        <li> PixelType_Mono4packed
        <li> PixelType_Mono8
        <li> PixelType_Mono8signed
        <li> PixelType_Mono10
        <li> PixelType_Mono10packed
        <li> PixelType_Mono10p
        <li> PixelType_Mono12
        <li> PixelType_Mono12packed
        <li> PixelType_Mono12p
        <li> PixelType_Mono16
        </ul>
        <ul>
        <li> PixelType_BayerGR8
        <li> PixelType_BayerRG8
        <li> PixelType_BayerGB8
        <li> PixelType_BayerBG8
        <li> PixelType_BayerGR10
        <li> PixelType_BayerRG10
        <li> PixelType_BayerGB10
        <li> PixelType_BayerBG10
        <li> PixelType_BayerGR12
        <li> PixelType_BayerRG12
        <li> PixelType_BayerGB12
        <li> PixelType_BayerBG12
        <li> PixelType_BayerGR12Packed
        <li> PixelType_BayerRG12Packed
        <li> PixelType_BayerGB12Packed
        <li> PixelType_BayerBG12Packed
        <li> PixelType_BayerGR10p
        <li> PixelType_BayerRG10p
        <li> PixelType_BayerGB10p
        <li> PixelType_BayerBG10p
        <li> PixelType_BayerGR12p
        <li> PixelType_BayerRG12p
        <li> PixelType_BayerGB12p
        <li> PixelType_BayerBG12p
        <li> PixelType_BayerGR16
        <li> PixelType_BayerRG16
        <li> PixelType_BayerGB16
        <li> PixelType_BayerBG16
        </ul>
        <ul>
        <li> PixelType_RGB8packed
        <li> PixelType_BGR8packed
        <li> PixelType_RGBA8packed
        <li> PixelType_BGRA8packed
        <li> PixelType_RGB10packed
        <li> PixelType_BGR10packed
        <li> PixelType_RGB12packed
        <li> PixelType_BGR12packed
        <li> PixelType_RGB12V1packed
        <li> PixelType_RGB16packed
        <li> PixelType_RGB8planar
        <li> PixelType_RGB10planar
        <li> PixelType_RGB12planar
        <li> PixelType_RGB16planar
        </ul>
        <ul>
        <li> PixelType_YUV422packed
        <li> PixelType_YUV422_YUYV_Packed
        </ul>
        <p>
        \error
            Throws an exception, if the preconditions are not met.
        */
        public native @ByVal SPixelData GetPixelData( @Cast("uint32_t") int posX, @Cast("uint32_t") int posY);

       }

    /**
     * \}
     */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_PYLONIMAGEBASE_H_6835095 */


// Parsed from <pylon/PylonImage.h>

//------------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//------------------------------------------------------------------------------
/**
    \file
    \brief  Contains an image class.
*/

// #ifndef INCLUDED_PYLONIMAGE_H_6241114
// #define INCLUDED_PYLONIMAGE_H_6241114

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/stdinclude.h>
// #include <pylon/PylonUtility.h>
// #include <pylon/PylonImageBase.h>
    // Forward references.

    /** \addtogroup Pylon_ImageHandlingSupport
     * \{
     */

    /**
    \class  CPylonImage
    \brief  Describes an image.
    <p>
    <ul>
    <li> Automatically handles size and lifetime of the image buffer.
    <li> Allows to take over a buffer of grab result which is preventing its reuse as long as required.
    <li> Allows to connect user buffers or buffers provided by third party software packages.
    <li> Provides methods for loading and saving an image in different file formats.
    <li> Serves as the main target format for the image format converter \c CImageFormatConverter.
    <li> Eases working with planar images.
    <li> Eases extraction of AOIs, e.g. for thumbnail images of defects.
    </ul>
    <p>
    \par Buffer Handling:
    The buffer that is automatically created by the CPylonImage class or a hosted grab result buffer are replaced by a larger buffer if required.
    The size of the allocated buffer is never decreased.
    Referenced user buffers are never automatically replaced by a larger buffer.
    Referenced grab result buffers are never reused. See the Reset() method for more details.
    The Release() method can be used to detach a user buffer, release a hosted grab result buffer or to free an allocated buffer.
    <p>
    \threading
        The CPylonImage class is not thread-safe.
    */
    @Namespace("Pylon") @NoOffset public static class CPylonImage extends CPylonImageBase {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CPylonImage(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CPylonImage(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CPylonImage position(int position) {
            return (CPylonImage)super.position(position);
        }
    

        /**
        \brief Creates an invalid image.
        <p>
        See Pylon::IImage on how the properties of an invalid image are returned.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public CPylonImage() { super((Pointer)null); allocate(); }
        private native void allocate();


        /**
        \brief  Copies the image properties and creates a reference to the buffer of the source image.
        <p>
        @param [in] source The source image.
        <p>
        \post
        <ul>
        <li> Another reference to the source image buffer is created.
        <li> Creates an invalid image if the source image is invalid.
        </ul>
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public CPylonImage( @Const @ByRef CPylonImage source) { super((Pointer)null); allocate(source); }
        private native void allocate( @Const @ByRef CPylonImage source);


        /**
        \brief Destroys a pylon image object.
        <p>
        \error
            Does not throw C++ exceptions.
        */


        /**
        \brief  Copies the image properties and creates a reference to the buffer of the source image.
        <p>
        @param [in] source The source image.
        <p>
        \post
        <ul>
        <li> Another reference to the source image buffer is created.
        <li> Creates an invalid image if the source image is invalid.
        </ul>
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @ByRef @Name("operator =") CPylonImage put( @Const @ByRef CPylonImage source);


        /**
        \brief Creates an image and allocates a buffer for it.
        <p>
        @param [in]   pixelType The pixel type of the new image.
        @param [in]   width     The number of pixels in a row in the new image.
        @param [in]   height    The number of rows in the new image.
        @param [in]   paddingX  The number of extra data bytes at the end of each row.
        @param [in]   orientation The vertical orientation of the image in the image buffer.
        <p>
        \pre
        <ul>
        <li> The pixel type must be valid.
        <li> The \c width value must be >= 0 and < _I32_MAX.
        <li> The \c height value must be >= 0 and < _I32_MAX.
        </ul>
        <p>
        \error
            Throws an exception when the parameters are invalid.
            Throws an exception when no buffer with the required size could be allocated.
        */
        public static native @ByVal CPylonImage Create( @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX/*=0*/, @Cast("Pylon::EImageOrientation") int orientation/*=Pylon::ImageOrientation_TopDown*/);
        public static native @ByVal CPylonImage Create( @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height);


        /**
        \brief Copies the image data from a different image.
        <p>
        This method is used for making a full copy of an image.
        Calls the Reset() method to set the same image properties as the source image and
        copies the image data.
        <p>
        @param [in]   image The source image, e.g. a CPylonImage, CPylonBitmapImage, or Grab Result Smart Pointer object.
        <p>
        \pre
            The preconditions of the Reset() method must be met.
        <p>
        <p>
        \post
        <ul>
        <li> The image contains a copy of the image data contained by the source image.
        <li> Creates an invalid image if the source image is invalid.
        </ul>
        <p>
        \error
            Throws an exception when no buffer with the required size could be allocated.
            Throws an exception when the preconditions of the Reset() method are not met.
        */
        public native void CopyImage( @Const @ByRef IImage image);


        /**
        \brief Copies the image data from a different image and changes the padding while copying.
        <p>
        This method is used for making a full copy of an image except for changing the padding.
        Calls the Reset() method to set the same image properties as the source image and
        copies the image data.
        This method is useful in combination with the GetAoi() method.
        <p>
        @param [in]   image The source image, e.g. a CPylonImage, CPylonBitmapImage, or Grab Result Smart Pointer object.
        @param [in]   newPaddingX The number of extra data bytes at the end of each row.
        <p>
        \pre
        <ul>
        <li> The preconditions of the Reset() method must be met.
        <li> The rows of the source image must be byte aligned. This may not be the case for packed pixel types. See Pylon::IsPacked().
        <li> The rows of the newly created image must be byte aligned. This may not be the case for packed pixel types. See Pylon::IsPacked().
        </ul>
        <p>
        \post
        <ul>
        <li> The image contains a copy of the image data contained by the source image.
        <li> The line padding is adjusted.
        <li> The byte aligned row padding area is set to zero.
        <li> Creates an invalid image if the source image is invalid.
        </ul>
        <p>
        \error
            Throws an exception when no buffer with the required size could be allocated.
            Throws an exception when the preconditions of the Reset() method are not met.
        */
        public native void CopyImage( @Const @ByRef IImage image, @Cast("size_t") int newPaddingX);


        /**
        \brief Copies the image data from a provided buffer.
        <p>
        This method is used for making a full copy of an image.
        Calls the Reset() method to set the same image properties as the source image and
        copies the image data.
        <p>
        @param [in]   pBuffer          The pointer to the buffer of the source image.
        @param [in]   bufferSizeBytes  The size of the buffer of the source image.
        @param [in]   pixelType The pixel type of the source image.
        @param [in]   width     The number of pixels in a row in the source image.
        @param [in]   height    The number of rows in the source image.
        @param [in]   paddingX  The number of extra data bytes at the end of each row.
        @param [in]   orientation The vertical orientation of the image in the image buffer.
        <p>
        \pre
        <ul>
        <li> The pixel type must be valid.
        <li> The \c width value must be >= 0 and < _I32_MAX.
        <li> The \c height value must be >= 0 and < _I32_MAX.
        <li> The pointer to the source buffer must not be NULL.
        <li> The source buffer must be large enough to hold the image described by the parameters.
        <li> The preconditions of the Reset() method must be met.
        </ul>
        <p>
        \post A copy of the image contained by the source image buffer is made.
        <p>
        \error
            Throws an exception when no buffer with the required size could be allocated.
            Throws an exception when the preconditions of the Reset() method are not met.
        */
        public native void CopyImage(
                    Pointer pBuffer,
                    @Cast("size_t") int bufferSizeBytes,
                    @Cast("Pylon::EPixelType") int pixelType,
                    @Cast("uint32_t") int width,
                    @Cast("uint32_t") int height,
                    @Cast("size_t") int paddingX,
                    @Cast("Pylon::EImageOrientation") int orientation/*=Pylon::ImageOrientation_TopDown*/);
        public native void CopyImage(
                    Pointer pBuffer,
                    @Cast("size_t") int bufferSizeBytes,
                    @Cast("Pylon::EPixelType") int pixelType,
                    @Cast("uint32_t") int width,
                    @Cast("uint32_t") int height,
                    @Cast("size_t") int paddingX);


        /**
        \brief Attaches a grab result buffer.
        <p>
        @param [in]   grabResult The source image represented by a grab result.
        <p>
        \post
        <ul>
        <li> The image properties are taken over from the grab result.
        <li> The grab result buffer is used by the image class.
        <li> Another reference to the grab result buffer is created. This prevents the buffer's reuse for grabbing.
        <li> Creates an invalid image if the \c grabResult is invalid.
        <li> Creates an invalid image if the grab was not successful. See CGrabResultData::GrabSucceeded().
        </ul>
        <p>
        \error
            Throws an exception when no buffer with the required size could be allocated.
            Throws an exception when the preconditions of the Reset() method are not met.
        */
        public native void AttachGrabResultBuffer( @Const @ByRef CGrabResultPtr grabResult);


        /**
        \brief Attaches a user buffer.
        <p>
        @param [in]   pBuffer          The pointer to the buffer of the source image.
        @param [in]   bufferSizeBytes  The size of the buffer of the source image.
        @param [in]   pixelType The pixel type of the source image.
        @param [in]   width     The number of pixels in a row in the source image.
        @param [in]   height    The number of rows in the source image.
        @param [in]   paddingX  The number of extra data bytes at the end of each row.
        @param [in]   orientation The vertical orientation of the image in the image buffer.
        <p>
        \pre
        <ul>
        <li> The pixel type must be valid.
        <li> The \c width value must be >= 0 and < _I32_MAX.
        <li> The \c height value must be >= 0 and < _I32_MAX.
        <li> The pointer to the source buffer must not be NULL.
        <li> The source buffer must be large enough to hold the image described by the parameters.
        </ul>
        <p>
        \post
        <ul>
        <li> The image properties are taken over from the passed parameters.
        <li> The user buffer is used by the image class.
        <li> The buffer must not be freed while being attached.
        </ul>
        <p>
        \error
            Throws an exception if the preconditions are not met.
        */
        public native void AttachUserBuffer(
                    Pointer pBuffer,
                    @Cast("size_t") int bufferSizeBytes,
                    @Cast("Pylon::EPixelType") int pixelType,
                    @Cast("uint32_t") int width,
                    @Cast("uint32_t") int height,
                    @Cast("size_t") int paddingX,
                    @Cast("Pylon::EImageOrientation") int orientation/*=Pylon::ImageOrientation_TopDown*/);
        public native void AttachUserBuffer(
                    Pointer pBuffer,
                    @Cast("size_t") int bufferSizeBytes,
                    @Cast("Pylon::EPixelType") int pixelType,
                    @Cast("uint32_t") int width,
                    @Cast("uint32_t") int height,
                    @Cast("size_t") int paddingX);


        // Implements Pylon::IImage.
        public native @Cast("bool") boolean IsValid();

        // Implements Pylon::IImage.
        public native @Cast("Pylon::EPixelType") int GetPixelType();

        // Implements Pylon::IImage.
        public native @Cast("uint32_t") int GetWidth();

        // Implements Pylon::IImage.
        public native @Cast("uint32_t") int GetHeight();

        // Implements Pylon::IImage.
        public native @Cast("size_t") int GetPaddingX();

        // Implements Pylon::IImage.
        public native @Cast("Pylon::EImageOrientation") int GetOrientation();

        // Implements Pylon::IImage.
        public native Pointer GetBuffer();

        // Implements Pylon::IImage.

        // Implements Pylon::IImage.
        public native @Cast("size_t") int GetImageSize();

        // Implements Pylon::IImage.
        public native @Cast("bool") boolean IsUnique();

        // Implements Pylon::IImage.
        public native @Cast("bool") boolean GetStride( @Cast("size_t*") @ByRef IntPointer strideBytes);
        public native @Cast("bool") boolean GetStride( @Cast("size_t*") @ByRef IntBuffer strideBytes);
        public native @Cast("bool") boolean GetStride( @Cast("size_t*") @ByRef int[] strideBytes);

        // Implements Pylon::IReusableImage.
        public native @Cast("bool") boolean IsSupportedPixelType( @Cast("Pylon::EPixelType") int pixelType);

        // Implements Pylon::IReusableImage, always returns true.
        public native @Cast("bool") boolean IsAdditionalPaddingSupported();


        //Implements Pylon::IReusableImage
        /**
        \brief Resets the image properties and allocates a new buffer if required.
        <p>
        @param [in]   pixelType The pixel type of the new image.
        @param [in]   width     The number of pixels in a row in the new image.
        @param [in]   height    The number of rows in the new image.
        @param [in]   orientation The vertical orientation of the image in the image buffer.
        <p>
        \pre
        <ul>
        <li> The \c width value must be >= 0 and < _I32_MAX.
        <li> The \c height value must be >= 0 and < _I32_MAX.
        <li> If a user buffer is referenced then this buffer must not be referenced by another pylon image. See the IsUnique() and IsUserBufferAttached() methods.
        <li> If a user buffer is referenced then this buffer must be large enough to hold the destination image. See the GetAllocatedBufferSize() and IsUserBufferAttached() methods.
        </ul>
        <p>
        \post
        <ul>
        <li> If the previously referenced buffer is a grab result buffer, a new buffer has been allocated.
        <li> If the previously referenced buffer is also referenced by another pylon image, a new buffer has been allocated.
        <li> If the previously referenced buffer is not large enough to hold an image with the given properties, a new buffer has been allocated.
        <li> If no buffer has been allocated before, a buffer has been allocated.
        </ul>
        <p>
        \error
            Throws an exception when the preconditions are not met.
            Throws an exception when no buffer with the required size could be allocated.
        */
        public native void Reset( @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("Pylon::EImageOrientation") int orientation/*=Pylon::ImageOrientation_TopDown*/);
        public native void Reset( @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height);


        // Implements Pylon::IReusableImage, user defined padding is always supported.
        /**
            \brief Extends the Reset( EPixelType, uint32_t, uint32_t, EImageOrientation) method by settable paddingX.
            \copydetails Reset( EPixelType, uint32_t, uint32_t, EImageOrientation)
            @param [in]   paddingX  The number of extra data bytes at the end of each row.
        */
        public native void Reset( @Cast("Pylon::EPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX, @Cast("Pylon::EImageOrientation") int orientation/*=Pylon::ImageOrientation_TopDown*/);

        // Implements Pylon::IReusableImage.
        public native void Release();

        /** Returns true if the referenced buffer has been provided by the user. */
        public native @Cast("bool") boolean IsUserBufferAttached();

        /** Returns true if the referenced buffer has been provided by a grab result. */
        public native @Cast("bool") boolean IsGrabResultBufferAttached();

        /**
        \brief Returns the size of the used buffer.
        <p>
        This method is useful when working with so-called user buffers.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("size_t") int GetAllocatedBufferSize();

        /**
        \brief Changes the pixel type of the image.
        <p>
        @param [in]   pixelType The new pixel type.
        <p>
        \pre
        <ul>
        <li> Pylon::SamplesPerPixel( oldPixelType) == Pylon::SamplesPerPixel( newPixelType)
        <li> Pylon::BitPerPixel( oldPixelType) == Pylon::BitPerPixel( newPixelType)
        </ul>
        <p>
        \error
            Throws an exception when the new pixel type properties do not match the existing ones.
        */
        public native void ChangePixelType( @Cast("Pylon::EPixelType") int pixelType);


        /**
        \brief Creates a new pylon image for a plane of the image. No image data is copied.
        <p>
        Use CopyImage( const IImage& image) to create a full copy.
        <p>
        <pre>{@code
            copiedPlane.CopyImage( planarImage.GetPlane( 2));
        }</pre>
        <p>
        @param [in]   planeIndex The zero based index of the plane.
        @return A pylon image referencing a plane of the image.
        <p>
        \pre
            The value of planeIndex < Pylon::PlaneCount( GetPixelType()).
        <p>
        \post
        <ul>
        <li> A reference to the same buffer is created. No image data is copied.
        <li> The returned image has the Pylon::GetPlanePixelType( GetPixelType()) pixel type.
        <li> If the image is not planar only index 0 is allowed. A call passing index 0 returns a copy of the image. No image data is copied.
        </ul>
        <p>
        \error
            Throws an exception when the plane index is out of range.
        */
        public native @ByVal CPylonImage GetPlane( @Cast("size_t") int planeIndex);


        /**
        \brief Creates a new pylon image for an image area of interest (Image AOI) derived from the image. No image data is copied.
        <p>
        Use CopyImage( const IImage& image, size_t newPaddingX) to create a full copy and to remove the additional padding.
        <p>
        <pre>{@code
            copiedAoi.CopyImage( image.GetAoi( 80, 90, 100, 100), 0);
        }</pre>
        <p>
        @param [in]   topLeftX The x-coordinate of the top left corner of the image AOI in pixels.
        @param [in]   topLeftY The y-coordinate of the top left corner of the image AOI in pixels.
        @param [in]   width The width of the image AOI in pixels.
        @param [in]   height The height of the image AOI in pixels.
        <p>
        @return A pylon image referencing an image AOI of the image.
        <p>
        \pre
        <ul>
        <li> The image must be valid.
        <li> The image AOI is located inside the image.
        <li> The image is not in a planar format, see Pylon::IsPlanar(). Use GetPlane() first in this case.
        <li> The rows of the image must be byte aligned. This may not be the case for packed pixel types. See Pylon::IsPacked().
        <li> The x-coordinate must be byte aligned. This may not be the case for packed pixel types. See Pylon::IsPacked().
        <li> The \c topLeftX parameter must be divisible by the return value of Pylon::GetPixelIncrementX() for the image's pixel type.
        <li> The \c topLeftY parameter must be divisible by the return value of Pylon::GetPixelIncrementY() for the image's pixel type.
        </ul>
        <p>
        \post
        <ul>
        <li> A reference to the same buffer is created. The image data is not copied.
        <li> The returned image uses the paddingX property to skip over image content outside of the image AOI.
        </ul>
        <p>
        \error
            Throws an exception when the preconditions are not met.
        */
        public native @ByVal CPylonImage GetAoi( @Cast("uint32_t") int topLeftX, @Cast("uint32_t") int topLeftY, @Cast("uint32_t") int width, @Cast("uint32_t") int height );
    }

    /**
     * \}
     */


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_PYLONIMAGE_H_6241114 */


// Parsed from <pylon/_ImageFormatConverterParams.h>







//-----------------------------------------------------------------------------
//  (c) 2004-2008 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//-----------------------------------------------------------------------------
/**
\file
\brief Interface to image format converter parameters.
*/

//-----------------------------------------------------------------------------
//  This file is generated automatically
//  Do not modify!
//-----------------------------------------------------------------------------



// #ifndef Basler_ImageFormatConverterParams_PARAMS_H
// #define Basler_ImageFormatConverterParams_PARAMS_H

// #ifdef __GNUC__
// #define GENAPI_DEPRECATED_FEATURE __attribute__((deprecated))
// #elif defined(_MSC_VER)
// #define GENAPI_DEPRECATED_FEATURE __declspec(deprecated)
// #else
// #define GENAPI_DEPRECATED_FEATURE
// #endif

// #include <GenApi/IEnumerationT.h>
// #include <GenApi/NodeMapRef.h>
// #include <GenApi/DLLLoad.h>


// common node types
// #include <GenApi/IBoolean.h>
// #include <GenApi/ICategory.h>
// #include <GenApi/ICommand.h>
// #include <GenApi/IEnumeration.h>
// #include <GenApi/IEnumEntry.h>
// #include <GenApi/IFloat.h>
// #include <GenApi/IInteger.h>
// #include <GenApi/IString.h>
// #include <GenApi/IRegister.h>


/** The namespace containing the device's control interface and related enumeration types */

    //**************************************************************************************************
    // Enumerations
    //**************************************************************************************************
    
    /** Valid values for MonoConversionMethod */
    /** enum Basler_ImageFormatConverterParams::MonoConversionMethodEnums */
    public static final int
        /**Gamma conversion is used to convert from input to output format. */
        MonoConversionMethod_Gamma = 0,
        /**Image data is shifted when using this conversion method. */
        MonoConversionMethod_Truncate = 1;

    /** Valid values for OutputOrientation */
    /** enum Basler_ImageFormatConverterParams::OutputOrientationEnums */
    public static final int
        /**The orientation of the image is not changed. */
        OutputOrientation_Unchanged = 0,
        /**The first row of the image is located at the start of the image buffer. */
        OutputOrientation_TopDown = 1,
        /**The last row of the image is located at the start of the image buffer. */
        OutputOrientation_BottomUp = 2;

    /** Valid values for InconvertibleEdgeHandling */
    /** enum Basler_ImageFormatConverterParams::InconvertibleEdgeHandlingEnums */
    public static final int
        /**Rows and columns that cannot be converted are set to zero. */
        InconvertibleEdgeHandling_SetZero = 0,
        /**Rows and columns that cannot be converted are removed from the output image. */
        InconvertibleEdgeHandling_Clip = 1;

    /** Valid values for OutputBitAlignment */
    /** enum Basler_ImageFormatConverterParams::OutputBitAlignmentEnums */
    public static final int
        /**The data is aligned at the least significant bit. */
        OutputBitAlignment_LsbAligned = 0,
        /**The data is aligned at the most significant bit. */
        OutputBitAlignment_MsbAligned = 1;


    //**************************************************************************************************
    // Parameter class
    //**************************************************************************************************
    

    /** Interface to image format converter parameters. */
    @Namespace("Basler_ImageFormatConverterParams") @NoOffset public static class CImageFormatConverterParams_Params extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CImageFormatConverterParams_Params(Pointer p) { super(p); }
    
        
    /** \name MonoConversion - Parameters for converting monochrome images. */
    //@{
    /**
        \brief Sets the conversion method for monochrome images.
        <p>
        Sets the conversion method for monochrome images.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_MonoConversionMethodEnums MonoConversionMethod(); public native CImageFormatConverterParams_Params MonoConversionMethod(IEnumerationT_MonoConversionMethodEnums MonoConversionMethod);
    
    //@}
    

    /** \name MonoConversion - Parameters for converting monochrome images. */
    //@{
    /**
        \brief Sets the gamma value for converting monochrome images.
        <p>
        Sets the gamma value for converting monochrome images.	The image data is converted using a lookup table. The values of the lookup table are computed using the following formula: valueOut = min((((valueIn ^ Gamma) / (valueInMax ^ Gamma)) * valueOutMax), valueOutMax).
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat Gamma(); public native CImageFormatConverterParams_Params Gamma(IFloat Gamma);
    
    //@}
    

    /** \name MonoConversion - Parameters for converting monochrome images. */
    //@{
    /**
        \brief Sets the value for additional shifting when converting monochrome images in Truncate mode.
        <p>
        Sets the value for additional shifting when converting monochrome images in Truncate mode. The image data is converted using a lookup table if the parameter value differs from zero. Shifted values exceeding the maximum output value boundary are set to the maximum allowed value. Negative values are treated as right shifted values.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger AdditionalLeftShift(); public native CImageFormatConverterParams_Params AdditionalLeftShift(IInteger AdditionalLeftShift);
    
    //@}
    

    /** \name Root - Image Format Converter parameters. */
    //@{
    /**
        \brief The number of additional data bytes at the end of each line.
        <p>
        The number of additional data bytes at the end of each line. These bytes are set to zero during the conversion.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger OutputPaddingX(); public native CImageFormatConverterParams_Params OutputPaddingX(IInteger OutputPaddingX);
    
    //@}
    

    /** \name Root - Image Format Converter parameters. */
    //@{
    /**
        \brief Defines the vertical orientation of the output image in memory.
        <p>
        Defines the vertical orientation of the output image in memory.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_OutputOrientationEnums OutputOrientation(); public native CImageFormatConverterParams_Params OutputOrientation(IEnumerationT_OutputOrientationEnums OutputOrientation);
    
    //@}
    

    /** \name Root - Image Format Converter parameters. */
    //@{
    /**
        \brief Sets the handling for rows and columns that cannot be converted.
        <p>
        Sets the handling for rows and columns that cannot be converted.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_InconvertibleEdgeHandlingEnums InconvertibleEdgeHandling(); public native CImageFormatConverterParams_Params InconvertibleEdgeHandling(IEnumerationT_InconvertibleEdgeHandlingEnums InconvertibleEdgeHandling);
    
    //@}
    

    /** \name Root - Image Format Converter parameters. */
    //@{
    /**
        \brief Controls the alignment of the bits in the target pixel type.
        <p>
        Controls the alignment of the bits in the target pixel type if the target value has more bits than the source value.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_OutputBitAlignmentEnums OutputBitAlignment(); public native CImageFormatConverterParams_Params OutputBitAlignment(IEnumerationT_OutputBitAlignmentEnums OutputBitAlignment);
    }


    //**************************************************************************************************
    // Parameter class implementation
    //**************************************************************************************************

    /** \cond HIDE_CLASS_METHODS */

    

    

    

    

    

    /** \endcond */

 // namespace Basler_ImageFormatConverterParams

// #undef GENAPI_DEPRECATED_FEATURE
// #endif // Basler_ImageFormatConverterParams_PARAMS_H


// Parsed from <pylon/ImageFormatConverter.h>

//------------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//------------------------------------------------------------------------------
/**
    \file
    \brief  Contains an image format converter class.
*/

// #ifndef INCLUDED_IMAGEFORMATCONVERTER_H_1564142
// #define INCLUDED_IMAGEFORMATCONVERTER_H_1564142

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #ifdef _MSC_VER
// #pragma warning( push )
// #pragma warning( disable : 4275 ) // Class must have a dll interface to be used by clients of the class.
// #endif

// #include <pylon/stdinclude.h>
// #include <pylon/PylonUtility.h>
// #include <pylon/_ImageFormatConverterParams.h>
// #include <pylon/ReusableImage.h>


    /** \addtogroup Pylon_ImageHandlingSupport
     * \{
     */

    /**
    \class  CImageFormatConverter
    \brief  Creates new images by converting a source image to another format.
    <p>
    Supported input image formats defined by the pixel type:
        <p>
        <ul>
        <li> PixelType_Mono1packed
        <li> PixelType_Mono2packed
        <li> PixelType_Mono4packed
        <li> PixelType_Mono8
        <li> PixelType_Mono10
        <li> PixelType_Mono10packed
        <li> PixelType_Mono10p
        <li> PixelType_Mono12
        <li> PixelType_Mono12packed
        <li> PixelType_Mono12p
        <li> PixelType_Mono16
        </ul>
        <ul>
        <li> PixelType_BayerGR8
        <li> PixelType_BayerRG8
        <li> PixelType_BayerGB8
        <li> PixelType_BayerBG8
        <li> PixelType_BayerGR10
        <li> PixelType_BayerRG10
        <li> PixelType_BayerGB10
        <li> PixelType_BayerBG10
        <li> PixelType_BayerGR12
        <li> PixelType_BayerRG12
        <li> PixelType_BayerGB12
        <li> PixelType_BayerBG12
        <li> PixelType_BayerGR12Packed
        <li> PixelType_BayerRG12Packed
        <li> PixelType_BayerGB12Packed
        <li> PixelType_BayerBG12Packed
        <li> PixelType_BayerGR10p
        <li> PixelType_BayerRG10p
        <li> PixelType_BayerGB10p
        <li> PixelType_BayerBG10p
        <li> PixelType_BayerGR12p
        <li> PixelType_BayerRG12p
        <li> PixelType_BayerGB12p
        <li> PixelType_BayerBG12p
        <li> PixelType_BayerGR16
        <li> PixelType_BayerRG16
        <li> PixelType_BayerGB16
        <li> PixelType_BayerBG16
        </ul>
        <ul>
        <li> PixelType_RGB8packed
        <li> PixelType_BGR8packed
        <li> PixelType_RGBA8packed
        <li> PixelType_BGRA8packed
        <li> PixelType_RGB10packed
        <li> PixelType_BGR10packed
        <li> PixelType_RGB12packed
        <li> PixelType_BGR12packed
        <li> PixelType_RGB12V1packed
        <li> PixelType_RGB16packed
        <li> PixelType_RGB8planar
        <li> PixelType_RGB16planar
        </ul>
        <ul>
        <li> PixelType_YUV422packed
        <li> PixelType_YUV422_YUYV_Packed
        </ul>
    <p>
    Supported ouput image formats defined by the pixel type:
        <p>
        <ul>
        <li> PixelType_BGRA8packed - This pixel type can be used in Windows bitmaps. See Pylon::SBGRA8Pixel.
        <li> PixelType_BGR8packed - This pixel type can be used in Windows bitmaps. See Pylon::SBGR8Pixel.
        <li> PixelType_RGB8packed - See Pylon::SRGB8Pixel.
        <li> PixelType_RGB16packed - See Pylon::SRGB16Pixel.
        <li> PixelType_RGB8planar
        <li> PixelType_RGB16planar
        <li> PixelType_Mono8
        <li> PixelType_Mono16
        </ul>
    <p>
    <p>
    All input image formats can be converted to all output image formats.
    <p>
    RGB, BGR and Bayer image formats are converted to monochrome formats by using the following formula:
    <p>
    <pre>{@code
            mono = (0.25 * red) + (0.625 * green) + (0.125 * blue);
    }</pre>
    <p>
    YUV formats are converted to 16 bit bit depth in an intermediate conversion step. This is why the output
    is always aligned at the most significant bit when converting to 16 bit color output formats like PixelType_RGB16packed.
    <p>
    \par Limitations:
    The last column of a YUV input image with odd width cannot be converted.
    The last column and the last row of a Bayer input image cannot be converted.
    <p>
    The default treatment of rows and columns that cannot be converted due to their location on edges,
    can be controlled using the CImageFormatConverter::InconvertibleEdgeHandling parameter.
    See also the Convert() method description.
    <p>
    \threading
        The CImageFormatConverter class is not thread-safe.
    */
    @Namespace("Pylon") @NoOffset public static class CImageFormatConverter extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CImageFormatConverter(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CImageFormatConverter(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CImageFormatConverter position(int position) {
            return (CImageFormatConverter)super.position(position);
        }
        public CImageFormatConverterParams_Params asCImageFormatConverterParams_Params() { return asCImageFormatConverterParams_Params(this); }
        @Namespace public static native @Name("static_cast<Basler_ImageFormatConverterParams::CImageFormatConverterParams_Params*>") CImageFormatConverterParams_Params asCImageFormatConverterParams_Params(CImageFormatConverter pointer);
            
    /** \name MonoConversion - Parameters for converting monochrome images. */
    //@{
    /**
        \brief Sets the conversion method for monochrome images.
        <p>
        Sets the conversion method for monochrome images.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_MonoConversionMethodEnums MonoConversionMethod(); public native CImageFormatConverter MonoConversionMethod(IEnumerationT_MonoConversionMethodEnums MonoConversionMethod);
    
    //@}
    

    /** \name MonoConversion - Parameters for converting monochrome images. */
    //@{
    /**
        \brief Sets the gamma value for converting monochrome images.
        <p>
        Sets the gamma value for converting monochrome images.	The image data is converted using a lookup table. The values of the lookup table are computed using the following formula: valueOut = min((((valueIn ^ Gamma) / (valueInMax ^ Gamma)) * valueOutMax), valueOutMax).
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat Gamma(); public native CImageFormatConverter Gamma(IFloat Gamma);
    
    //@}
    

    /** \name MonoConversion - Parameters for converting monochrome images. */
    //@{
    /**
        \brief Sets the value for additional shifting when converting monochrome images in Truncate mode.
        <p>
        Sets the value for additional shifting when converting monochrome images in Truncate mode. The image data is converted using a lookup table if the parameter value differs from zero. Shifted values exceeding the maximum output value boundary are set to the maximum allowed value. Negative values are treated as right shifted values.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger AdditionalLeftShift(); public native CImageFormatConverter AdditionalLeftShift(IInteger AdditionalLeftShift);
    
    //@}
    

    /** \name Root - Image Format Converter parameters. */
    //@{
    /**
        \brief The number of additional data bytes at the end of each line.
        <p>
        The number of additional data bytes at the end of each line. These bytes are set to zero during the conversion.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger OutputPaddingX(); public native CImageFormatConverter OutputPaddingX(IInteger OutputPaddingX);
    
    //@}
    

    /** \name Root - Image Format Converter parameters. */
    //@{
    /**
        \brief Defines the vertical orientation of the output image in memory.
        <p>
        Defines the vertical orientation of the output image in memory.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_OutputOrientationEnums OutputOrientation(); public native CImageFormatConverter OutputOrientation(IEnumerationT_OutputOrientationEnums OutputOrientation);
    
    //@}
    

    /** \name Root - Image Format Converter parameters. */
    //@{
    /**
        \brief Sets the handling for rows and columns that cannot be converted.
        <p>
        Sets the handling for rows and columns that cannot be converted.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_InconvertibleEdgeHandlingEnums InconvertibleEdgeHandling(); public native CImageFormatConverter InconvertibleEdgeHandling(IEnumerationT_InconvertibleEdgeHandlingEnums InconvertibleEdgeHandling);
    
    //@}
    

    /** \name Root - Image Format Converter parameters. */
    //@{
    /**
        \brief Controls the alignment of the bits in the target pixel type.
        <p>
        Controls the alignment of the bits in the target pixel type if the target value has more bits than the source value.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_OutputBitAlignmentEnums OutputBitAlignment(); public native CImageFormatConverter OutputBitAlignment(IEnumerationT_OutputBitAlignmentEnums OutputBitAlignment);
    

        /**
        \brief Creates an image format converter.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public CImageFormatConverter() { super((Pointer)null); allocate(); }
        private native void allocate();


        /**
        \brief Destroys the image format converter.
        <p>
        \error
            Does not throw C++ exceptions.
        */


        /**
        \brief Optionally initializes the image format converter before conversion.
        <p>
        @param [in]   sourcePixelType The pixel type of the source image.
        <p>
        <ul>
        <li> Depending on parameter settings and the input format, data structures required for conversion are created, e.g. lookup tables.
        <li> Initialization is done automatically when calling Convert() if needed. This may add a delay when converting the first image.
        </ul>
        <p>
        \pre
            <ul>
            <li> The converter parameters are set up.
            <li> The \c pixelTypeSource must be supported by the converter.
            </ul>
        <p>
        Lookup tables are created when using monochrome images as input and when
        the gamma conversion method is selected
        or when the shift conversion method is selected and the value of AdditionalLeftShift is not zero.
        The converter can be reinitialized with other settings if required.
        <p>
        \error
            Throws an exception if the passed pixel type does not represent a valid input format.
            The converter object is still valid after error and can be initialized again.
        */
        public native void Initialize( @Cast("Pylon::EPixelType") int sourcePixelType);


        /**
        \brief  Returns information about the converter being initialized.
        <p>
        @param [in]   sourcePixelType The pixel type of the source image.
        <p>
        The result depends on the converter settings.
        <p>
        @return True if initialized.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean IsInitialized( @Cast("Pylon::EPixelType") int sourcePixelType);


        /**
        \brief  Destroys data structures required for conversion.
        <p>
        This function can be called to free resources held by the format converter.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native void Uninitialize();


        /**
        \brief Checks to see if a conversion is required or if the source image already has the desired format.
        <p>
        @param [in]  sourceImage The source image, e.g. a CPylonImage, CPylonBitmapImage, or Grab Result Smart Pointer object.
        @return  Returns true if the source image already has the desired format.
        <p>
        A conversion may even be required image format does not change e.g. if the gamma conversion method is selected and the format describes a monochrome image.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean ImageHasDestinationFormat( @Const @ByRef IImage sourceImage);


        /**
        \brief Checks to see if a conversion is required or if the source image already has the desired format.
        <p>
        @param [in]   sourcePixelType The pixel type of the source image.
        @param [in]   sourcePaddingX  The number of extra data bytes at the end of each row. The default value is usually 0.
        @param [in]   sourceOrientation The vertical orientation of the image in the image buffer. The default value is usually ImageOrientation_TopDown.
        <p>
        @return  Returns true if the source image already has the desired format. This is done according to the current converter settings.
        <p>
        A conversion may even be required image format does not change e.g. if the gamma conversion method is selected and the format describes a monochrome image.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean ImageHasDestinationFormat( @Cast("Pylon::EPixelType") int sourcePixelType, @Cast("size_t") int sourcePaddingX, @Cast("Pylon::EImageOrientation") int sourceOrientation);


        /**
        \brief Computes the size of the destination image buffer in byte.
        <p>
        @param [in]  sourceImage The source image, e.g. a CPylonImage, CPylonBitmapImage, or Grab Result Smart Pointer object.
        @return  The size of the destination image when converting the given source image using current converter settings.
        <p>
        \error
            Throws an exception if the destination image size for the passed input cannot be computed. The converter object is still valid after error.
        */
        public native @Cast("size_t") int GetBufferSizeForConversion( @Const @ByRef IImage sourceImage);


        /**
        \brief Computes the size of the destination image buffer in byte.
        <p>
        @param [in]  sourceWidth     The number of pixels in a row in the source image.
        @param [in]  sourceHeight    The number of rows in the source image.
        @param [in]  sourcePixelType The pixel type of the source image.
        @return  The size of the destination image when converting the source image using current converter settings.
        <p>
        \pre
            <ul>
            <li> The \c sourceWidth value must be >= 0 and < _I32_MAX.
            <li> The \c sourceHeight value must be >= 0 and < _I32_MAX.
            </ul>
        <p>
        \error
            Throws an exception if the destination image size for the passed input cannot be computed. The converter object is still valid after error.
        */
        public native @Cast("size_t") int GetBufferSizeForConversion( @Cast("Pylon::EPixelType") int sourcePixelType, @Cast("uint32_t") int sourceWidth, @Cast("uint32_t") int sourceHeight);


        /**
        \brief Creates a new image by converting an image to a different format.
        <p>
        The IReusableImage::Reset() method of the destination image is called to set the destination format.
        The image is converted to the destination image according to the current converter settings.
        The padding area of a row in the destination image is set to zero.
        <p>
        The OutputPaddingX setting is ignored for images that do not support user defined padding, e.g.
        CPylonBitmapImage. See also IReusableImage::IsAdditionalPaddingSupported().
        <p>
        @param [out]  destinationImage The destination image, e.g. a CPylonImage or CPylonBitmapImage object.
                                      When passing a CPylonBitmapImage object the target format must be supported by the CPylonBitmapImage class.
        @param [in]   sourceImage      The source image, e.g. a CPylonImage, CPylonBitmapImage, or Grab Result Smart Pointer object.
        <p>
        \pre
            <ul>
            <li> The source and destination images must be different images.
            <li> The source image must be valid.
            <li> The format of the source image must be supported by the converter.
            <li> The destination image must support the destination format.
            <li> The destination image must be able to provide a large enough buffer to hold the image.
            </ul>
        <p>
        \error
            Throws an exception if the passed parameters are not valid. The converter object is still valid after error.
        */
        public native void Convert( @ByRef IReusableImage destinationImage, @Const @ByRef IImage sourceImage);


        /**
        \brief Creates a new image by converting an image to a different format.
        <p>
        The IReusableImage::Reset() method of the destination image is called to set the destination format.
        The image is converted to the destination image according to the current converter settings.
        The padding area of a row in the destination image is set to zero.
        <p>
        The OutputPaddingX setting is ignored for images that do not support user defined padding, e.g.
        CPylonBitmapImage. See also IReusableImage::IsAdditionalPaddingSupported().
        <p>
        @param [out]  destinationImage The destination image.
        @param [in]   pSourceBuffer The pointer to the buffer of the source image.
        @param [in]   sourceBufferSizeBytes  The size of the buffer of the source image.
        @param [in]   sourcePixelType The pixel type of the source image.
        @param [in]   sourceWidth     The number of pixels in a row in the source image.
        @param [in]   sourceHeight    The number of rows in the source image.
        @param [in]   sourcePaddingX  The number of extra data bytes at the end of each row. The default value is usually 0.
        @param [in]   sourceOrientation The vertical orientation of the source image in the image buffer. The default value is usually ImageOrientation_TopDown.
        <p>
        \pre
            <ul>
            <li> The pixel type must be valid.
            <li> The \c sourceWidth value must be >= 0 and < _I32_MAX.
            <li> The \c sourceHeight value must be >= 0 and < _I32_MAX.
            <li> The pointer to the source buffer must not be NULL.
            <li> The source buffer must be large enough to hold the image described by the parameters.
            <li> The format of the input image represented by the given parameter must be supported by the converter.
            <li> The destination image must support the destination format.
            <li> The destination image must be able to provide a large enough buffer to hold the image.
            <li> The source image buffer and the destination image buffer must not be identical.
            </ul>
        <p>
        \error
            Throws an exception if the passed parameters are not valid. The converter object is still valid after error.
        */
        public native void Convert( @ByRef IReusableImage destinationImage,
                              @Const Pointer pSourceBuffer,
                              @Cast("size_t") int sourceBufferSizeBytes,
                              @Cast("Pylon::EPixelType") int sourcePixelType,
                              @Cast("uint32_t") int sourceWidth,
                              @Cast("uint32_t") int sourceHeight,
                              @Cast("size_t") int sourcePaddingX,
                              @Cast("Pylon::EImageOrientation") int sourceOrientation
                              );


        /**
        \brief Creates a new image by converting an image to a different format.
        <p>
        The image is converted to the destination image according to the current converter settings.
        The padding area of a row in the destination image is set to zero.
        <p>
        @param [out]  pDestinationBuffer The pointer to the buffer of the destination image.
        @param [in]   destinationBufferSizeBytes The size of the buffer of the destination image.
        @param [in]   sourceImage      The source image, e.g. a CPylonImage, CPylonBitmapImage, or Grab Result Smart Pointer object.
        <p>
        \pre
            <ul>
            <li> The format of the source image must be supported by the converter.
            <li> The destination image buffer must be large enough to hold the destination image.
            <li> The source image buffer and the destination image buffer must not be identical.
            </ul>
        <p>
        \error
            Throws an exception if the passed parameters are not valid. The converter object is still valid after error.
        */
        public native void Convert( Pointer pDestinationBuffer, @Cast("size_t") int destinationBufferSizeBytes, @Const @ByRef IImage sourceImage);


        /**
        \brief Creates a new image by converting an image to a different format.
        <p>
        The image is converted to the destination image according to the current converter settings.
        The padding area of a row in the destination image is set to zero.
        <p>
        @param [out]  pDestinationBuffer The pointer to the buffer of the destination image.
        @param [in]   destinationBufferSizeBytes The size of the buffer of the destination image.
        @param [in]   pSourceBuffer The pointer to the buffer of the source image.
        @param [in]   sourceBufferSizeBytes  The size of the buffer of the source image.
        @param [in]   sourcePixelType   The pixel type of the source image.
        @param [in]   sourceWidth       The number of pixels in a row in the source image.
        @param [in]   sourceHeight      The number of rows in the source image.
        @param [in]   sourcePaddingX    The number of extra data bytes at the end of each row. The default value is usually 0.
        @param [in]   sourceOrientation The vertical orientation of the source image in the image buffer. The default value is usually ImageOrientation_TopDown.
        <p>
        \pre
            <ul>
            <li> The parameters regarding the source buffer must describe a valid image.
            <li> The format of the input image represented by the given parameter must be supported by the converter.
            <li> If the destination image buffer must be large enough to hold the destination image.
            <li> The the source buffer can not be equal the destination buffer.
            </ul>
        <p>
        \error
            Throws an exception if the passed parameters are not valid. The converter object is still valid after error.
        */
        public native void Convert( Pointer pDestinationBuffer,
                              @Cast("size_t") int destinationBufferSizeBytes,
                              @Const Pointer pSourceBuffer,
                              @Cast("size_t") int sourceBufferSizeBytes,
                              @Cast("Pylon::EPixelType") int sourcePixelType,
                              @Cast("uint32_t") int sourceWidth,
                              @Cast("uint32_t") int sourceHeight,
                              @Cast("size_t") int sourcePaddingX,
                              @Cast("Pylon::EImageOrientation") int sourceOrientation
                              );


        /**
        \brief Returns true if the image format defined by the given pixel type is a supported input format.
        <p>
        @param [in]   sourcePixelType The pixel type of the source image.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public static native @Cast("bool") boolean IsSupportedInputFormat( @Cast("Pylon::EPixelType") int sourcePixelType);


        /**
        \brief Returns true if the image format defined by the given pixel type is a supported output format.
        <p>
        @param [in]   destinationPixelType The pixel type of the destination image.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public static native @Cast("bool") boolean IsSupportedOutputFormat( @Cast("Pylon::EPixelType") int destinationPixelType);


        /**
        \brief Provides access to the node map of the format converter.
        @return Reference to the node map of the format converter.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @ByRef INodeMap GetNodeMap();
        // This class emulates part of the behavior of a GenApi::IEnumerationT<T> interface used for native parameter access.
        // This allows using the EPixelType enumeration.
        public static class IOutputPixelFormatEnum extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public IOutputPixelFormatEnum(Pointer p) { super(p); }
        
            public native @Name("operator =") void put( @Cast("Pylon::EPixelType") int outputPixelType);
            public native void SetValue( @Cast("Pylon::EPixelType") int outputPixelType);

            public native @Cast("Pylon::EPixelType") int GetValue();
            public native @Cast("Pylon::EPixelType") @Name("operator ()") int apply();
        }

        /**
            \brief The pixel data format of the output image.
            <p>
            This member can be used to get and set the output pixel format using the EPixelType enumeration.
            It emulates the behavior of native parameter access.
            <p>
            \pre
                The pixel format set must be a supported output pixel format. See IsSupportedOutputFormat().
            \error
                Throws an exception if the set output pixel format is not supported.
        */
        public native @ByRef IOutputPixelFormatEnum OutputPixelFormat(); public native CImageFormatConverter OutputPixelFormat(IOutputPixelFormatEnum OutputPixelFormat);
    }

    /**
     * \}
     */


// #ifdef _MSC_VER
// #pragma warning(pop)
// #endif

// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_IMAGEFORMATCONVERTER_H_1564142 */


// Parsed from <pylon/NodeMapProxy.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2007-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  AH
//-----------------------------------------------------------------------------
/**
\file
\brief Pylon generic node map interface declaration
<p>
\ingroup PYLON_INTERNAL
*/


// #ifndef __PYLON_NODEMAPROXY__H__
// #define __PYLON_NODEMAPROXY__H__

// #if _MSC_VER > 1000
// #pragma once
// #endif

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <Base/GCException.h>
// #include <GenApi/INodeMap.h>
// #include <GenApi/INode.h>

/** Macro to define a custom Node map proxy */
// #define PYLON_DEFINE_NODEMAP(ClassName, BaseClass)
//     class ClassName : public BaseClass
//     {
//     public:
//         /** \name Construction */
//         /*@{*/
//         /** \brief \copybrief Pylon::CNodeMapProxyT::CNodeMapProxyT()
//        \copydetails Pylon::CNodeMapProxyT::CNodeMapProxyT()
//        */
//         ClassName() {};
//         /** \brief \copybrief Pylon::CNodeMapProxyT::CNodeMapProxyT(GenApi::INodeMap*)
//        \copydetails Pylon::CNodeMapProxyT::CNodeMapProxyT(GenApi::INodeMap*)
//        */
//         ClassName(GenApi::INodeMap* pNodeMap)
//             : BaseClass(pNodeMap) {}
//         /*@}*/
//     };
    //**************************************************************************************************
    /** Implementation Detail: This class wraps programming interfaces that are generated from %GenICam parameter description files to provide native parameter access.
    /**
    @see \ref configuringcameras
    <p>
    \tparam TParams  The specific parameter class (auto generated from the parameter xml file)
    \ingroup PYLON_INTERNAL
    */
    //************************************************************************************************** */
    @Name("Pylon::CNodeMapProxyT<Basler_UsbTLParams::CUsbTLParams_Params>") @NoOffset public static class CNodeMapProxyT_UsbTLParams_Params extends CUsbTLParams_Params {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CNodeMapProxyT_UsbTLParams_Params(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CNodeMapProxyT_UsbTLParams_Params(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CNodeMapProxyT_UsbTLParams_Params position(int position) {
            return (CNodeMapProxyT_UsbTLParams_Params)super.position(position);
        }
    
        /** \name Construction */
        // \{

        /** Creates a CNodeMapProxyT object that is not attached to a node map. Use the Attach() method to attach the pylon node map. */
        public CNodeMapProxyT_UsbTLParams_Params() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Creates a CNodeMapProxyT object and attaches it to a pylon node map. */
        public CNodeMapProxyT_UsbTLParams_Params(INodeMap arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(INodeMap arg0);

        /** Destructor */
        /** \name Some smart pointer functionality */
        // \{

        /** Attach a pylon node map */
        public native void Attach(INodeMap arg0, @Cast("bool") boolean replace/*=false*/);
        public native void Attach(INodeMap arg0);

        /** Checks if a pylon node map is attached */
        public native @Cast("bool") boolean IsAttached();

        /** Returns the pylon node map interface pointer */
        public native INodeMap GetNodeMap();
        /** \name Partial implementation of the INodeMap interface
         *  See GenApi::INodeMap for more details */
        // \{
        /** \brief \copybrief GenApi::INodeMap::GetNodes()
            <p>
            \copydetails GenApi::INodeMap::GetNodes()
        */
        public native void GetNodes(@Cast("GenApi_3_0_Basler_pylon_v5_0::NodeList_t*") @ByRef Pointer Nodes);

        /** \brief \copybrief GenApi::INodeMap::GetNode()
        <p>
        \copydetails GenApi::INodeMap::GetNode()
        */
        public native INode GetNode( @Const @ByRef gcstring Name);

        /** \brief \copybrief GenApi::INodeMap::InvalidateNodes()
        <p>
        \copydetails GenApi::INodeMap::InvalidateNodes()
        */
        public native void InvalidateNodes();

        /** \brief \copybrief GenApi::INodeMap::Poll()
        <p>
        \copydetails GenApi::INodeMap::Poll()
        */
        public native void Poll( @Cast("int64_t") long ElapsedTime );
    }
    @Name("Pylon::CNodeMapProxyT<Basler_UsbStreamParams::CUsbStreamParams_Params>") @NoOffset public static class CNodeMapProxyT_CUsbStreamParams_Params extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CNodeMapProxyT_CUsbStreamParams_Params(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CNodeMapProxyT_CUsbStreamParams_Params(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CNodeMapProxyT_CUsbStreamParams_Params position(int position) {
            return (CNodeMapProxyT_CUsbStreamParams_Params)super.position(position);
        }
        public CUsbStreamParams_Params asCUsbStreamParams_Params() { return asCUsbStreamParams_Params(this); }
        @Namespace public static native @Name("static_cast<Basler_UsbStreamParams::CUsbStreamParams_Params*>") CUsbStreamParams_Params asCUsbStreamParams_Params(CNodeMapProxyT_CUsbStreamParams_Params pointer);
    
        /** \name Construction */
        // \{

        /** Creates a CNodeMapProxyT object that is not attached to a node map. Use the Attach() method to attach the pylon node map. */
        public CNodeMapProxyT_CUsbStreamParams_Params() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Creates a CNodeMapProxyT object and attaches it to a pylon node map. */
        public CNodeMapProxyT_CUsbStreamParams_Params(INodeMap arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(INodeMap arg0);

        /** Destructor */
        /** \name Some smart pointer functionality */
        // \{

        /** Attach a pylon node map */
        public native void Attach(INodeMap arg0, @Cast("bool") boolean replace/*=false*/);
        public native void Attach(INodeMap arg0);

        /** Checks if a pylon node map is attached */
        public native @Cast("bool") boolean IsAttached();

        /** Returns the pylon node map interface pointer */
        public native INodeMap GetNodeMap();
        /** \name Partial implementation of the INodeMap interface
         *  See GenApi::INodeMap for more details */
        // \{
        /** \brief \copybrief GenApi::INodeMap::GetNodes()
            <p>
            \copydetails GenApi::INodeMap::GetNodes()
        */
        public native void GetNodes(@Cast("GenApi_3_0_Basler_pylon_v5_0::NodeList_t*") @ByRef Pointer Nodes);

        /** \brief \copybrief GenApi::INodeMap::GetNode()
        <p>
        \copydetails GenApi::INodeMap::GetNode()
        */
        public native INode GetNode( @Const @ByRef gcstring Name);

        /** \brief \copybrief GenApi::INodeMap::InvalidateNodes()
        <p>
        \copydetails GenApi::INodeMap::InvalidateNodes()
        */
        public native void InvalidateNodes();

        /** \brief \copybrief GenApi::INodeMap::Poll()
        <p>
        \copydetails GenApi::INodeMap::Poll()
        */
        public native void Poll( @Cast("int64_t") long ElapsedTime );
    }
    @Name("Pylon::CNodeMapProxyT<Basler_UsbEventParams::CUsbEventParams_Params>") @NoOffset public static class CNodeMapProxyT_CUsbEventParams_Params extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CNodeMapProxyT_CUsbEventParams_Params(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CNodeMapProxyT_CUsbEventParams_Params(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CNodeMapProxyT_CUsbEventParams_Params position(int position) {
            return (CNodeMapProxyT_CUsbEventParams_Params)super.position(position);
        }
        public CUsbEventParams_Params asCUsbEventParams_Params() { return asCUsbEventParams_Params(this); }
        @Namespace public static native @Name("static_cast<Basler_UsbEventParams::CUsbEventParams_Params*>") CUsbEventParams_Params asCUsbEventParams_Params(CNodeMapProxyT_CUsbEventParams_Params pointer);
    
        /** \name Construction */
        // \{

        /** Creates a CNodeMapProxyT object that is not attached to a node map. Use the Attach() method to attach the pylon node map. */
        public CNodeMapProxyT_CUsbEventParams_Params() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Creates a CNodeMapProxyT object and attaches it to a pylon node map. */
        public CNodeMapProxyT_CUsbEventParams_Params(INodeMap arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(INodeMap arg0);

        /** Destructor */
        /** \name Some smart pointer functionality */
        // \{

        /** Attach a pylon node map */
        public native void Attach(INodeMap arg0, @Cast("bool") boolean replace/*=false*/);
        public native void Attach(INodeMap arg0);

        /** Checks if a pylon node map is attached */
        public native @Cast("bool") boolean IsAttached();

        /** Returns the pylon node map interface pointer */
        public native INodeMap GetNodeMap();
        /** \name Partial implementation of the INodeMap interface
         *  See GenApi::INodeMap for more details */
        // \{
        /** \brief \copybrief GenApi::INodeMap::GetNodes()
            <p>
            \copydetails GenApi::INodeMap::GetNodes()
        */
        public native void GetNodes(@Cast("GenApi_3_0_Basler_pylon_v5_0::NodeList_t*") @ByRef Pointer Nodes);

        /** \brief \copybrief GenApi::INodeMap::GetNode()
        <p>
        \copydetails GenApi::INodeMap::GetNode()
        */
        public native INode GetNode( @Const @ByRef gcstring Name);

        /** \brief \copybrief GenApi::INodeMap::InvalidateNodes()
        <p>
        \copydetails GenApi::INodeMap::InvalidateNodes()
        */
        public native void InvalidateNodes();

        /** \brief \copybrief GenApi::INodeMap::Poll()
        <p>
        \copydetails GenApi::INodeMap::Poll()
        */
        public native void Poll( @Cast("int64_t") long ElapsedTime );
    }


    //**************************************************************************************************
    // CPylonDeviceProxyT implementation
    //**************************************************************************************************


    

    

    

    

    

    



// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif // __PYLON_NODEMAPROXY__H__


// Parsed from <pylon/usb/_UsbChunkData.h>







//-----------------------------------------------------------------------------
//  (c) 2004-2008 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//-----------------------------------------------------------------------------
/**
\file
\brief Basler USB3Vision camera interface
*/

//-----------------------------------------------------------------------------
//  This file is generated automatically
//  Do not modify!
//-----------------------------------------------------------------------------



// #ifndef Basler_UsbChunkData_PARAMS_H
// #define Basler_UsbChunkData_PARAMS_H

// #ifdef __GNUC__
// #define GENAPI_DEPRECATED_FEATURE __attribute__((deprecated))
// #elif defined(_MSC_VER)
// #define GENAPI_DEPRECATED_FEATURE __declspec(deprecated)
// #else
// #define GENAPI_DEPRECATED_FEATURE
// #endif

// #include <GenApi/IEnumerationT.h>
// #include <GenApi/NodeMapRef.h>
// #include <GenApi/DLLLoad.h>


// common node types
// #include <GenApi/IBoolean.h>
// #include <GenApi/ICategory.h>
// #include <GenApi/ICommand.h>
// #include <GenApi/IEnumeration.h>
// #include <GenApi/IEnumEntry.h>
// #include <GenApi/IFloat.h>
// #include <GenApi/IInteger.h>
// #include <GenApi/IString.h>
// #include <GenApi/IRegister.h>


/** The namespace containing the device's control interface and related enumeration types */

    //**************************************************************************************************
    // Enumerations
    //**************************************************************************************************
    
    /** Valid values for ChunkGainSelector */
    

    /** Valid values for ChunkCounterSelector */
    


    //**************************************************************************************************
    // Parameter class
    //**************************************************************************************************
    

    /** Basler USB3Vision camera interface */
    @Namespace("Basler_UsbChunkData") @NoOffset public static class CUsbChunkData_Params extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CUsbChunkData_Params(Pointer p) { super(p); }
    
        
    /** \name ChunkData - This category includes items related to the chunk data that can be appended to the image data */
    //@{
    /**
        \brief Selects which Gain to retrieve data from. Applies to: ace
        <p>
        Selects which Gain to retrieve data from.
    
        \b Visibility = Expert
    
    */
    
    
    //@}
    

    /** \name ChunkData - This category includes items related to the chunk data that can be appended to the image data */
    //@{
    /**
        \brief Returns the gain used to capture the image. Applies to: ace
        <p>
        Returns the gain used to capture the image.
    
        \b Visibility = Beginner
        
    
        \b Selected by : ChunkGainSelector
    
    */
    public native @ByRef IFloat ChunkGain(); public native CUsbChunkData_Params ChunkGain(IFloat ChunkGain);
    
    //@}
    

    /** \name ChunkData - This category includes items related to the chunk data that can be appended to the image data */
    //@{
    /**
        \brief Returns the exposure time used to capture the image. Applies to: ace
        <p>
        Returns the exposure time used to capture the image.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat ChunkExposureTime(); public native CUsbChunkData_Params ChunkExposureTime(IFloat ChunkExposureTime);
    
    //@}
    

    /** \name ChunkData - This category includes items related to the chunk data that can be appended to the image data */
    //@{
    /**
        \brief Indicates the value of the timestamp when the image was acquired. Applies to: ace
        <p>
        This integer indicates the value of the timestamp when the image was acquired.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger ChunkTimestamp(); public native CUsbChunkData_Params ChunkTimestamp(IInteger ChunkTimestamp);
    
    //@}
    

    /** \name ChunkData - This category includes items related to the chunk data that can be appended to the image data */
    //@{
    /**
        \brief A bit field that indicates the status of all of the camera's input and output lines when the image was acquired. Applies to: ace
        <p>
        This value is a bit field that indicates the status of all of the camera's input and output lines when the image was acquired.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger ChunkLineStatusAll(); public native CUsbChunkData_Params ChunkLineStatusAll(IInteger ChunkLineStatusAll);
    
    //@}
    

    /** \name ChunkData - This category includes items related to the chunk data that can be appended to the image data */
    //@{
    /**
        \brief Selects which counter to retrieve data from. Applies to: ace
        <p>
        Selects which counter to retrieve data from.
    
        \b Visibility = Expert
    
    */
    
    
    //@}
    

    /** \name ChunkData - This category includes items related to the chunk data that can be appended to the image data */
    //@{
    /**
        \brief Indicates the value of the selected Chunk counter. Applies to: ace
        <p>
        Indicates the value of the selected Chunk counter.
    
        \b Visibility = Beginner
        
    
        \b Selected by : ChunkCounterSelector
    
    */
    public native @ByRef IInteger ChunkCounterValue(); public native CUsbChunkData_Params ChunkCounterValue(IInteger ChunkCounterValue);
    
    //@}
    

    /** \name ChunkData - This category includes items related to the chunk data that can be appended to the image data */
    //@{
    /**
        \brief Return the index of the active set of the running sequencer included in the payload. Applies to: ace
        <p>
        Return the index of the active set of the running sequencer included in the payload
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger ChunkSequencerSetActive(); public native CUsbChunkData_Params ChunkSequencerSetActive(IInteger ChunkSequencerSetActive);
    
    //@}
    

    /** \name ChunkData - This category includes items related to the chunk data that can be appended to the image data */
    //@{
    /**
        \brief Indicates the value of CRC checksum. Applies to: ace
        <p>
        This integer indicates the value of CRC checksum.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger ChunkPayloadCRC16(); public native CUsbChunkData_Params ChunkPayloadCRC16(IInteger ChunkPayloadCRC16);
    }


    //**************************************************************************************************
    // Parameter class implementation
    //**************************************************************************************************

    /** \cond HIDE_CLASS_METHODS */

    

    

    

    

    

    /** \endcond */

 // namespace Basler_UsbChunkData

// #undef GENAPI_DEPRECATED_FEATURE
// #endif // Basler_UsbChunkData_PARAMS_H


// Parsed from <pylon/usb/_BaslerUsbCameraParams.h>







//-----------------------------------------------------------------------------
//  (c) 2004-2008 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//-----------------------------------------------------------------------------
/**
\file
\brief Basler USB3Vision camera interface
*/

//-----------------------------------------------------------------------------
//  This file is generated automatically
//  Do not modify!
//-----------------------------------------------------------------------------



// #ifndef Basler_UsbCameraParams_PARAMS_H
// #define Basler_UsbCameraParams_PARAMS_H

// #ifdef __GNUC__
// #define GENAPI_DEPRECATED_FEATURE __attribute__((deprecated))
// #elif defined(_MSC_VER)
// #define GENAPI_DEPRECATED_FEATURE __declspec(deprecated)
// #else
// #define GENAPI_DEPRECATED_FEATURE
// #endif

// #include <GenApi/IEnumerationT.h>
// #include <GenApi/NodeMapRef.h>
// #include <GenApi/DLLLoad.h>


// common node types
// #include <GenApi/IBoolean.h>
// #include <GenApi/ICategory.h>
// #include <GenApi/ICommand.h>
// #include <GenApi/IEnumeration.h>
// #include <GenApi/IEnumEntry.h>
// #include <GenApi/IFloat.h>
// #include <GenApi/IInteger.h>
// #include <GenApi/IString.h>
// #include <GenApi/IRegister.h>


/** The namespace containing the device's control interface and related enumeration types */

    //**************************************************************************************************
    // Enumerations
    //**************************************************************************************************
    
    /** Valid values for SequencerMode */
    /** enum Basler_UsbCameraParams::SequencerModeEnums */
    public static final int
        /**Disables the sequencer for image acquisition. */
        SequencerMode_Off = 0,
        /**Enables the sequencer for image acquisition. */
        SequencerMode_On = 1;

    /** Valid values for SequencerConfigurationMode */
    /** enum Basler_UsbCameraParams::SequencerConfigurationModeEnums */
    public static final int
        /**Disables the sequencer for configuration. */
        SequencerConfigurationMode_Off = 0,
        /**Enables the sequencer for configuration. */
        SequencerConfigurationMode_On = 1;

    /** Valid values for SequencerTriggerSource */
    /** enum Basler_UsbCameraParams::SequencerTriggerSourceEnums */
    public static final int
        /**Selects Line 1 as the trigger source for sequencer set advance. */
        SequencerTriggerSource_Line1 = 0,
        /**Selects Line 2 as the trigger source for sequencer set advance. */
        SequencerTriggerSource_Line2 = 1,
        /**Selects Line 3 as the trigger source for sequencer set advance. */
        SequencerTriggerSource_Line3 = 2,
        /**Selects Line 4 as the trigger source for sequencer set advance. */
        SequencerTriggerSource_Line4 = 3,
        /**Selects SoftwareSignal1 as the trigger source for sequencer set advance. */
        SequencerTriggerSource_SoftwareSignal1 = 4,
        /**Selects SoftwareSignal2 as the trigger source for sequencer set advance. */
        SequencerTriggerSource_SoftwareSignal2 = 5,
        /**Selects SoftwareSignal3 as the trigger source for sequencer set advance. */
        SequencerTriggerSource_SoftwareSignal3 = 6,
        /**Selects Counter1End as the trigger source for sequencer set advance. */
        SequencerTriggerSource_Counter1End = 7,
        /**Selects Counter2End as the trigger source for sequencer set advance. */
        SequencerTriggerSource_Counter2End = 8,
        /**Selects Counter3End as the trigger source for sequencer set advance. */
        SequencerTriggerSource_Counter3End = 9,
        /**Selects FrameSart as the trigger source for sequencer set advance. */
        SequencerTriggerSource_FrameStart = 10,
        //!<
        SequencerTriggerSource_FrameEnd = 11;

    /** Valid values for SequencerTriggerActivation */
    /** enum Basler_UsbCameraParams::SequencerTriggerActivationEnums */
    public static final int
        /**Sets the selected trigger to become active on the rising edge of the source signal. */
        SequencerTriggerActivation_RisingEdge = 0,
        /**Sets the selected trigger to become active on the falling edge of the source signal. */
        SequencerTriggerActivation_FallingEdge = 1,
        /**Sets the selected trigger to become active on the falling or rising edge of the source signal. */
        SequencerTriggerActivation_AnyEdge = 2,
        /**Sets the selected trigger to become active when the source signal is high. */
        SequencerTriggerActivation_LevelHigh = 3,
        /**Sets the selected trigger to become active when the source signal is low. */
        SequencerTriggerActivation_LevelLow = 4;

    /** Valid values for BinningHorizontalMode */
    /** enum Basler_UsbCameraParams::BinningHorizontalModeEnums */
    public static final int
        /**Sets the binning mode to sum. */
        BinningHorizontalMode_Sum = 0,
        /**Sets the binning mode to average. */
        BinningHorizontalMode_Average = 1;

    /** Valid values for BinningVerticalMode */
    /** enum Basler_UsbCameraParams::BinningVerticalModeEnums */
    public static final int
        /**Sets the binning mode to sum. */
        BinningVerticalMode_Sum = 0,
        /**Sets the binning mode to average. */
        BinningVerticalMode_Average = 1;

    /** Valid values for PixelFormat */
    /** enum Basler_UsbCameraParams::PixelFormatEnums */
    public static final int
        /**Sets the pixel format to Mono 8. */
        PixelFormat_Mono8 = 0,
        /**Sets the pixel format to Mono 10. */
        PixelFormat_Mono10 = 1,
        /**Sets the pixel format to Mono 10p. */
        PixelFormat_Mono10p = 2,
        /**Sets the pixel format to Mono 12. */
        PixelFormat_Mono12 = 3,
        /**Sets the pixel format to Mono 12p. */
        PixelFormat_Mono12p = 4,
        /**Sets the pixel format to Bayer GR 8. */
        PixelFormat_BayerGR8 = 5,
        /**Sets the pixel format to Bayer RG 8. */
        PixelFormat_BayerRG8 = 6,
        /**Sets the pixel format to Bayer GB 8. */
        PixelFormat_BayerGB8 = 7,
        /**Sets the pixel format to Bayer BG 8. */
        PixelFormat_BayerBG8 = 8,
        /**Sets the pixel format to Bayer GR 10. */
        PixelFormat_BayerGR10 = 9,
        /**Sets the pixel format to Bayer GR 10p. */
        PixelFormat_BayerGR10p = 10,
        /**Sets the pixel format to Bayer RG 10. */
        PixelFormat_BayerRG10 = 11,
        /**Sets the pixel format to Bayer RG 10p. */
        PixelFormat_BayerRG10p = 12,
        /**Sets the pixel format to Bayer GB 10. */
        PixelFormat_BayerGB10 = 13,
        /**Sets the pixel format to Bayer GB 10p. */
        PixelFormat_BayerGB10p = 14,
        /**Sets the pixel format to Bayer BG 10. */
        PixelFormat_BayerBG10 = 15,
        /**Sets the pixel format to Bayer BG 10p. */
        PixelFormat_BayerBG10p = 16,
        /**Sets the pixel format to Bayer GR 12. */
        PixelFormat_BayerGR12 = 17,
        /**Sets the pixel format to Bayer GR 12p. */
        PixelFormat_BayerGR12p = 18,
        /**Sets the pixel format to Bayer RG 12. */
        PixelFormat_BayerRG12 = 19,
        /**Sets the pixel format to Bayer RG 12p. */
        PixelFormat_BayerRG12p = 20,
        /**Sets the pixel format to Bayer GB 12. */
        PixelFormat_BayerGB12 = 21,
        /**Sets the pixel format to Bayer GB 12p. */
        PixelFormat_BayerGB12p = 22,
        /**Sets the pixel format to Bayer BG 12. */
        PixelFormat_BayerBG12 = 23,
        /**Sets the pixel format to Bayer BG 12p. */
        PixelFormat_BayerBG12p = 24,
        /**Sets the pixel format to RGB 8 */
        PixelFormat_RGB8 = 25,
        /**Sets the pixel format to BGR 8 */
        PixelFormat_BGR8 = 26,
        /**Sets the pixel format to YCbCr 422. */
        PixelFormat_YCbCr422_8 = 27;

    /** Valid values for PixelSize */
    /** enum Basler_UsbCameraParams::PixelSizeEnums */
    public static final int
        /**The depth of the pixel values in the acquired images is 1 bit per pixel. */
        PixelSize_Bpp1 = 0,
        /**The depth of the pixel values in the acquired images is 2 bits per pixel. */
        PixelSize_Bpp2 = 1,
        /**The depth of the pixel values in the acquired images is 4 bits per pixel. */
        PixelSize_Bpp4 = 2,
        /**The depth of the pixel values in the acquired images is 8 bits per pixel. */
        PixelSize_Bpp8 = 3,
        /**The depth of the pixel values in the acquired images is 10 bits per pixel. */
        PixelSize_Bpp10 = 4,
        /**The depth of the pixel values in the acquired images is 12 bits per pixel. */
        PixelSize_Bpp12 = 5,
        /**The depth of the pixel values in the acquired images is 16 bits per pixel. */
        PixelSize_Bpp16 = 6,
        /**The depth of the pixel values in the acquired images is 24 bits per pixel. */
        PixelSize_Bpp24 = 7;

    /** Valid values for PixelColorFilter */
    /** enum Basler_UsbCameraParams::PixelColorFilterEnums */
    public static final int
        /**No Bayer filter is present on the camera. */
        PixelColorFilter_None = 0,
        /**The Bayer filter has an RG/GB alignment to the pixels in the acquired images. */
        PixelColorFilter_BayerRG = 1,
        /**The Bayer filter has a GB/RG alignment to the pixels in the acquired images. */
        PixelColorFilter_BayerGB = 2,
        /**The Bayer filter has a GR/BG alignment to the pixels in the acquired images. */
        PixelColorFilter_BayerGR = 3,
        /**The Bayer filter has a BG/GR alignment to the pixels in the acquired images. */
        PixelColorFilter_BayerBG = 4;

    /** Valid values for TestImageSelector */
    /** enum Basler_UsbCameraParams::TestImageSelectorEnums */
    public static final int
        /**No test image will be output from the camera. */
        TestImageSelector_Off = 0,
        /**The camera generates and transmits test images with a test image 1 pattern. */
        TestImageSelector_Testimage1 = 1,
        /**The camera generates and transmits test images with a test image 2 pattern. */
        TestImageSelector_Testimage2 = 2,
        /**The camera generates and transmits test images with a test image 3 pattern. */
        TestImageSelector_Testimage3 = 3,
        /**The camera generates and transmits test images with a test image 4 pattern. */
        TestImageSelector_Testimage4 = 4,
        /**The camera generates and transmits test images with a test image 5 pattern. */
        TestImageSelector_Testimage5 = 5,
        /**The camera generates and transmits test images with a test image 6 pattern. */
        TestImageSelector_Testimage6 = 6;

    /** Valid values for GainAuto */
    /** enum Basler_UsbCameraParams::GainAutoEnums */
    public static final int
        /**Disables the Gain Auto function. */
        GainAuto_Off = 0,
        /**Sets the auto function mode of operation to 'once'. */
        GainAuto_Once = 1,
        /**Sets the auto function mode of operation to 'continuous'. */
        GainAuto_Continuous = 2;

    /** Valid values for GainSelector */
    /** enum Basler_UsbCameraParams::GainSelectorEnums */
    public static final int
        /**Selects all gain controls for adjustment. */
        GainSelector_All = 0,
        /**Selects all digital gain controls for adjustment */
        GainSelector_DigitalAll = 1,
        /**Selects all analog gain controls for adjustment */
        GainSelector_AnalogAll = 2;

    /** Valid values for BlackLevelSelector */
    /** enum Basler_UsbCameraParams::BlackLevelSelectorEnums */
    public static final int
        /**Selects all black level controls for adjustment. */
        BlackLevelSelector_All = 0;

    /** Valid values for LightSourcePreset */
    /** enum Basler_UsbCameraParams::LightSourcePresetEnums */
    public static final int
        /**No light source preset selected. */
        LightSourcePreset_Off = 0,
        /**Color preset for image acquisition with daylight of 5000 K. */
        LightSourcePreset_Daylight5000K = 1,
        /**Color preset for image acquisition with daylight of 6500 K. */
        LightSourcePreset_Daylight6500K = 2,
        /**Color preset for image acquisition with tungsten incandescent light (2800 K). */
        LightSourcePreset_Tungsten2800K = 3;

    /** Valid values for ColorSpace */
    /** enum Basler_UsbCameraParams::ColorSpaceEnums */
    public static final int
        /**Colors in accord with the RGB color space. */
        ColorSpace_RGB = 0,
        /**Colors in accord with the sRGB color space. */
        ColorSpace_sRGB = 1;

    /** Valid values for BalanceWhiteAuto */
    /** enum Basler_UsbCameraParams::BalanceWhiteAutoEnums */
    public static final int
        /**Disables the balance white auto function. */
        BalanceWhiteAuto_Off = 0,
        /**Sets the balance white auto function to 'once' operation mode. */
        BalanceWhiteAuto_Once = 1,
        /**Sets the balance white auto function to 'continuous' operation mode. */
        BalanceWhiteAuto_Continuous = 2;

    /** Valid values for BalanceRatioSelector */
    /** enum Basler_UsbCameraParams::BalanceRatioSelectorEnums */
    public static final int
        /**Selects the red balance ratio control for adjustment. */
        BalanceRatioSelector_Red = 0,
        /**Selects the green balance ratio control for adjustment. */
        BalanceRatioSelector_Green = 1,
        /**Selects the blue balance ratio control for adjustment. */
        BalanceRatioSelector_Blue = 2;

    /** Valid values for ColorAdjustmentSelector */
    /** enum Basler_UsbCameraParams::ColorAdjustmentSelectorEnums */
    public static final int
        /**Selects red for the adjustment of colors with predominant red. */
        ColorAdjustmentSelector_Red = 0,
        /**Selects yellow for the adjustment of colors with predominant yellow. */
        ColorAdjustmentSelector_Yellow = 1,
        /**Selects green the adjustment of colors with predominant green. */
        ColorAdjustmentSelector_Green = 2,
        /**Selects cyan for the adjustment of colors with predominant cyan. */
        ColorAdjustmentSelector_Cyan = 3,
        /**Selects blue for the adjustment of colors with predominant blue. */
        ColorAdjustmentSelector_Blue = 4,
        /**Selects magenta for the adjustment of colors with predominant magenta. */
        ColorAdjustmentSelector_Magenta = 5;

    /** Valid values for ColorTransformationSelector */
    /** enum Basler_UsbCameraParams::ColorTransformationSelectorEnums */
    public static final int
        /**Matrix color transformation from RGB to RGB. */
        ColorTransformationSelector_RGBtoRGB = 0,
        /**Matrix color transformation from YUV to RGB. */
        ColorTransformationSelector_RGBtoYUV = 1,
        /**Matrix color transformation from RGB to YUV. */
        ColorTransformationSelector_YUVtoRGB = 2;

    /** Valid values for ColorTransformationValueSelector */
    /** enum Basler_UsbCameraParams::ColorTransformationValueSelectorEnums */
    public static final int
        /**Element in row 0 and column 0 of the color transformation matrix. */
        ColorTransformationValueSelector_Gain00 = 0,
        /**Element in row 0 and column 1 of the color transformation matrix. */
        ColorTransformationValueSelector_Gain01 = 1,
        /**Element in row 0 and column 2 of the color transformation matrix. */
        ColorTransformationValueSelector_Gain02 = 2,
        /**Element in row 1 and column 0 of the color transformation matrix. */
        ColorTransformationValueSelector_Gain10 = 3,
        /**Element in row 1 and column 1 of the color transformation matrix */
        ColorTransformationValueSelector_Gain11 = 4,
        /**Element in row 1 and column 2 of the color transformation matrix. */
        ColorTransformationValueSelector_Gain12 = 5,
        /**Element in row 2 and column 0 of the color transformation matrix. */
        ColorTransformationValueSelector_Gain20 = 6,
        /**Element in row 2 and column 1 of the color transformation matrix. */
        ColorTransformationValueSelector_Gain21 = 7,
        /**Element in row 2 and column 2 of the color transformation matrix. */
        ColorTransformationValueSelector_Gain22 = 8;

    /** Valid values for AcquisitionMode */
    /** enum Basler_UsbCameraParams::AcquisitionModeEnums */
    public static final int
        /**Sets the acquisition mode to single frame */
        AcquisitionMode_SingleFrame = 0,
        /**Sets the acquisition mode to continuous */
        AcquisitionMode_Continuous = 1;

    /** Valid values for ShutterMode */
    /** enum Basler_UsbCameraParams::ShutterModeEnums */
    public static final int
        /**Sets the shutter mode to global shutter */
        ShutterMode_Global = 0,
        /**Sets the shutter mode to rolling shutter */
        ShutterMode_Rolling = 1,
        /**Sets the shutter mode to global reset release shutter */
        ShutterMode_GlobalResetRelease = 2;

    /** Valid values for ExposureAuto */
    /** enum Basler_UsbCameraParams::ExposureAutoEnums */
    public static final int
        /**Disables the exposure auto function. */
        ExposureAuto_Off = 0,
        /**Sets the exposure auto function mode of operation to 'once'. */
        ExposureAuto_Once = 1,
        /**Sets the exposure auto function mode of operation to 'continuous'. */
        ExposureAuto_Continuous = 2;

    /** Valid values for ExposureMode */
    /** enum Basler_UsbCameraParams::ExposureModeEnums */
    public static final int
        /**Sets the exposure mode to 'timed'. */
        ExposureMode_Timed = 0,
        /**Sets the exposure mode to 'trigger width'. */
        ExposureMode_TriggerWidth = 1;

    /** Valid values for ExposureOverlapTimeMode */
    /** enum Basler_UsbCameraParams::ExposureOverlapTimeModeEnums */
    public static final int
        /**Manually sets the ExposureOverlapTimeMax parameter value. */
        ExposureOverlapTimeMode_Manual = 0,
        /**Automatic control of the overlap between image acquisitions. */
        ExposureOverlapTimeMode_Automatic = 1;

    /** Valid values for SensorReadoutMode */
    /** enum Basler_UsbCameraParams::SensorReadoutModeEnums */
    public static final int
        /**Image readout to achieve optimized image quality */
        SensorReadoutMode_Normal = 0,
        /**Fast image readout with increased framerate: */
        SensorReadoutMode_Fast = 1;

    /** Valid values for TriggerSelector */
    /** enum Basler_UsbCameraParams::TriggerSelectorEnums */
    public static final int
        /**Selects the frame burst start trigger for configuration. */
        TriggerSelector_FrameBurstStart = 0,
        /**Selects the frame start trigger for configuration. */
        TriggerSelector_FrameStart = 1;

    /** Valid values for TriggerMode */
    /** enum Basler_UsbCameraParams::TriggerModeEnums */
    public static final int
        /**Sets the mode for the selected trigger to 'off'. */
        TriggerMode_Off = 0,
        /**Sets the mode for the selected trigger to 'on'. */
        TriggerMode_On = 1;

    /** Valid values for TriggerSource */
    /** enum Basler_UsbCameraParams::TriggerSourceEnums */
    public static final int
        /**Sets the software trigger as the signal source for the selected trigger. */
        TriggerSource_Software = 0,
        /**Sets the signal source for the selected trigger to 'line 1'. */
        TriggerSource_Line1 = 1,
        /**Sets the signal source for the selected trigger to 'line 2'. */
        TriggerSource_Line2 = 2,
        /**Sets the signal source for the selected trigger to 'line 3'. */
        TriggerSource_Line3 = 3,
        /**Sets the signal source for the selected trigger to 'line 4'. */
        TriggerSource_Line4 = 4,
        /**Selects the SoftwareSignal1 software command. */
        TriggerSource_SoftwareSignal1 = 5,
        /**Selects the SoftwareSignal2 software command. */
        TriggerSource_SoftwareSignal2 = 6,
        /**Selects the SoftwareSignal3 software command. */
        TriggerSource_SoftwareSignal3 = 7;

    /** Valid values for TriggerActivation */
    /** enum Basler_UsbCameraParams::TriggerActivationEnums */
    public static final int
        /**Sets the selected trigger to become active on the rising edge of the source signal. */
        TriggerActivation_RisingEdge = 0,
        /**Sets the selected trigger to become active on the falling edge of the source signal. */
        TriggerActivation_FallingEdge = 1,
        /**Sets the selected trigger to become active on the falling or rising edge of the source signal. */
        TriggerActivation_AnyEdge = 2,
        /**Sets the selected trigger to become active when the source signal is high. */
        TriggerActivation_LevelHigh = 3,
        /**Sets the selected trigger to become active when the source signal is low. */
        TriggerActivation_LevelLow = 4;

    /** Valid values for AcquisitionStatusSelector */
    /** enum Basler_UsbCameraParams::AcquisitionStatusSelectorEnums */
    public static final int
        /**Device is currently waiting for a trigger for the capture of one or many frames. */
        AcquisitionStatusSelector_FrameBurstTriggerWait = 0,
        /**Device is currently doing a frame burst of one or many frames. */
        AcquisitionStatusSelector_FrameBurstTriggerActive = 1,
        /**Device is currently transferring a frame burst of one or many frames. */
        AcquisitionStatusSelector_FrameBurstTriggerTransfer = 2,
        /**Device is currently waiting for a Frame trigger. */
        AcquisitionStatusSelector_FrameTriggerWait = 3,
        /**Device is currently doing the capture of a frame. */
        AcquisitionStatusSelector_FrameActive = 4,
        /**Device is currently transferring a frame. */
        AcquisitionStatusSelector_FrameTransfer = 5,
        /**Device is doing the exposure of a frame. */
        AcquisitionStatusSelector_ExposureActive = 6;

    /** Valid values for AutoFunctionProfile */
    /** enum Basler_UsbCameraParams::AutoFunctionProfileEnums */
    public static final int
        /**Keeps gain at minimum. */
        AutoFunctionProfile_MinimizeGain = 0,
        /**Keeps exposure time at minimum. */
        AutoFunctionProfile_MinimizeExposureTime = 1,
        //!<
        AutoFunctionProfile_Smart = 2,
        //!<
        AutoFunctionProfile_AntiFlicker50Hz = 3,
        //!<
        AutoFunctionProfile_AntiFlicker60Hz = 4;

    /** Valid values for AutoFunctionROISelector */
    /** enum Basler_UsbCameraParams::AutoFunctionROISelectorEnums */
    public static final int
        /**Selects Auto Function ROI 1. */
        AutoFunctionROISelector_ROI1 = 0,
        /**Selects Auto Function ROI 2. */
        AutoFunctionROISelector_ROI2 = 1;

    /** Valid values for AutoFunctionAOISelector */
    /** enum Basler_UsbCameraParams::AutoFunctionAOISelectorEnums */
    public static final int
        /**Selects Auto Function AOI 1. */
        AutoFunctionAOISelector_AOI1 = 0,
        /**Selects Auto Function AOI 2. */
        AutoFunctionAOISelector_AOI2 = 1;

    /** Valid values for LUTSelector */
    /** enum Basler_UsbCameraParams::LUTSelectorEnums */
    public static final int
        /**Selects the luminance LUT for configuration */
        LUTSelector_Luminance = 0;

    /** Valid values for LineSelector */
    /** enum Basler_UsbCameraParams::LineSelectorEnums */
    public static final int
        /**Selects line 1 for configuration. */
        LineSelector_Line1 = 0,
        /**Selects line 2 for configuration. */
        LineSelector_Line2 = 1,
        /**Selects line 3 for configuration. */
        LineSelector_Line3 = 2,
        /**Selects line 4 for configuration. */
        LineSelector_Line4 = 3;

    /** Valid values for LineMode */
    /** enum Basler_UsbCameraParams::LineModeEnums */
    public static final int
        /**Sets the mode for the selected line to 'input'. */
        LineMode_Input = 0,
        /**Sets the mode for the selected line to 'output'. */
        LineMode_Output = 1;

    /** Valid values for LineFormat */
    /** enum Basler_UsbCameraParams::LineFormatEnums */
    public static final int
        /**Sets the electrical configuration of the selected line to 'not connected'. */
        LineFormat_NoConnect = 0,
        /**Sets the electrical configuration of the selected line to 'tri-state'. */
        LineFormat_TriState = 1,
        /**Sets the electrical configuration of the selected line to 'TTL'. */
        LineFormat_TTL = 2,
        /**Sets the electrical configuration of the selected line to 'LVDS'. */
        LineFormat_LVDS = 3,
        /**Sets the electrical configuration of the selected line to 'RS-422'. */
        LineFormat_RS422 = 4,
        /**Sets the electrical configuration of the selected line to 'opto-coupled'. */
        LineFormat_OptoCoupled = 5,
        /**The line is currently accepting or sending LVTTL level signals. */
        LineFormat_LVTTL = 6;

    /** Valid values for LineLogic */
    /** enum Basler_UsbCameraParams::LineLogicEnums */
    public static final int
        /**Positive line logic */
        LineLogic_Positive = 0,
        /**Negative line logic */
        LineLogic_Negative = 1;

    /** Valid values for LineSource */
    /** enum Basler_UsbCameraParams::LineSourceEnums */
    public static final int
        /**Sets the source signal for the selected output line to 'off'. */
        LineSource_Off = 0,
        /**Sets the source signal for the selected output line to 'exposure active'. */
        LineSource_ExposureActive = 1,
        /**Associates the 'Frame Trigger Wait' status with the selected output line. */
        LineSource_FrameTriggerWait = 2,
        /**Associates the 'Frame Burst Trigger Wait' status with the selected output line. */
        LineSource_FrameBurstTriggerWait = 3,
        /**Sets the source signal for the selected output line to timer 1 active */
        LineSource_Timer1Active = 4,
        /**Sets the source signal for the selected output line to user settable output signal 0. */
        LineSource_UserOutput0 = 5,
        /**Sets the source signal for the selected output line to user settable output signal 1. */
        LineSource_UserOutput1 = 6,
        /**Sets the source signal for the selected output line to user settable output signal 2. */
        LineSource_UserOutput2 = 7,
        /**Sets the source signal for the selected output line to user settable output signal 3. */
        LineSource_UserOutput3 = 8,
        /**Flash Window signal as a line source. */
        LineSource_FlashWindow = 9;

    /** Valid values for UserOutputSelector */
    /** enum Basler_UsbCameraParams::UserOutputSelectorEnums */
    public static final int
        /**Selects user settable output signal 0 for configuration. */
        UserOutputSelector_UserOutput0 = 0,
        /**Selects user settable output signal 1 for configuration. */
        UserOutputSelector_UserOutput1 = 1,
        /**Selects user settable output signal 2 for configuration. */
        UserOutputSelector_UserOutput2 = 2,
        /**Selects user settable output signal 3 for configuration. */
        UserOutputSelector_UserOutput3 = 3;

    /** Valid values for SoftwareSignalSelector */
    /** enum Basler_UsbCameraParams::SoftwareSignalSelectorEnums */
    public static final int
        //!<
        SoftwareSignalSelector_SoftwareSignal1 = 0,
        //!<
        SoftwareSignalSelector_SoftwareSignal2 = 1,
        //!<
        SoftwareSignalSelector_SoftwareSignal3 = 2,
        //!<
        SoftwareSignalSelector_SoftwareSignal4 = 3;

    /** Valid values for TimerSelector */
    /** enum Basler_UsbCameraParams::TimerSelectorEnums */
    public static final int
        /**Selects Timer 1 for configuration. */
        TimerSelector_Timer1 = 0;

    /** Valid values for TimerTriggerSource */
    /** enum Basler_UsbCameraParams::TimerTriggerSourceEnums */
    public static final int
        /**Starts with the reception of the Exposure Start. */
        TimerTriggerSource_ExposureStart = 0,
        /**Starts with the reception of the flash window start. */
        TimerTriggerSource_FlashWindowStart = 1;

    /** Valid values for CounterSelector */
    /** enum Basler_UsbCameraParams::CounterSelectorEnums */
    public static final int
        /**Selects Counter 1 for configuration. */
        CounterSelector_Counter1 = 0,
        /**Selects Counter 2 for configuration. */
        CounterSelector_Counter2 = 1;

    /** Valid values for CounterEventSource */
    /** enum Basler_UsbCameraParams::CounterEventSourceEnums */
    public static final int
        /**Counts the number of Frame Triggers. */
        CounterEventSource_FrameTrigger = 0,
        /**Counts the number of Frame Start. */
        CounterEventSource_FrameStart = 1,
        /**Counts the number of Counter End. */
        CounterEventSource_Counter1End = 2,
        /**Counts the number of Counter End. */
        CounterEventSource_Counter2End = 3,
        /**Counts the number of Counter End. */
        CounterEventSource_Counter3End = 4;

    /** Valid values for CounterResetSource */
    /** enum Basler_UsbCameraParams::CounterResetSourceEnums */
    public static final int
        /**Disable the Counter Reset trigger */
        CounterResetSource_Off = 0,
        /**Selects software command as the source for counter reset */
        CounterResetSource_Software = 1,
        /**Selects line 1 as the source for counter reset */
        CounterResetSource_Line1 = 2,
        /**Selects line 2 as the source for counter reset */
        CounterResetSource_Line2 = 3,
        /**Selects line 3 as the source for counter reset */
        CounterResetSource_Line3 = 4,
        /**Selects line 4 as the source for counter reset */
        CounterResetSource_Line4 = 5,
        /**Selects counter 1 end as the source for counter reset */
        CounterResetSource_Counter1End = 6,
        /**Selects counter 2 end as the source for counter reset */
        CounterResetSource_Counter2End = 7,
        /**Selects counter 3 end as the source for counter reset */
        CounterResetSource_Counter3End = 8,
        /**Selects counter 4 end as the source for counter reset */
        CounterResetSource_Counter4End = 9;

    /** Valid values for CounterResetActivation */
    /** enum Basler_UsbCameraParams::CounterResetActivationEnums */
    public static final int
        /**Resets the counter on the rising edge of the signal */
        CounterResetActivation_RisingEdge = 0,
        /**Resets the counter on the falling edge of the signal */
        CounterResetActivation_FallingEdge = 1,
        /**Resets the counter on the falling or rising edge of the selected signal */
        CounterResetActivation_AnyEdge = 2,
        /**Resets the counter as long as the selected signal level is high */
        CounterResetActivation_LevelHigh = 3,
        /**Resets the counter as long as the selected signal level is low */
        CounterResetActivation_LevelLow = 4;

    /** Valid values for UserSetSelector */
    /** enum Basler_UsbCameraParams::UserSetSelectorEnums */
    public static final int
        /**Selects the default user set. */
        UserSetSelector_Default = 0,
        /**High gain factory set */
        UserSetSelector_HighGain = 1,
        /**Factory set using auto functions */
        UserSetSelector_AutoFunctions = 2,
        /**Factory set enabling color adjustments */
        UserSetSelector_Color = 3,
        /**Factory set disabling color adjustments */
        UserSetSelector_ColorRaw = 4,
        /**Selects the user set 1 configuration set. */
        UserSetSelector_UserSet1 = 5,
        /**Selects the user set 2 configuration set. */
        UserSetSelector_UserSet2 = 6,
        /**Selects the user set 3 configuration set. */
        UserSetSelector_UserSet3 = 7;

    /** Valid values for UserSetDefault */
    /** enum Basler_UsbCameraParams::UserSetDefaultEnums */
    public static final int
        /**Selects the default user set as the default startup set. */
        UserSetDefault_Default = 0,
        /**Selects the high gain user set as the default startup set. */
        UserSetDefault_HighGain = 1,
        /**Selects the auto function user set as the default startup set. */
        UserSetDefault_AutoFunctions = 2,
        /**Selects the color user set as the default startup set. */
        UserSetDefault_Color = 3,
        /**Selects the color raw user set as the default startup set. */
        UserSetDefault_ColorRaw = 4,
        /**Selects user set 1 as the default startup set. */
        UserSetDefault_UserSet1 = 5,
        /**Selects user set 2 as the default startup set. */
        UserSetDefault_UserSet2 = 6,
        /**Selects user set 3 as the default startup set. */
        UserSetDefault_UserSet3 = 7;

    /** Valid values for ChunkSelector */
    /** enum Basler_UsbCameraParams::ChunkSelectorEnums */
    public static final int
        /**Selects the image chunk for enabling. */
        ChunkSelector_Image = 0,
        /**Selects the gain chunk for enabling. */
        ChunkSelector_Gain = 1,
        /**Selects the exposure time chunk for enabling. */
        ChunkSelector_ExposureTime = 2,
        /**Selects the timestamp chunk for enabling. */
        ChunkSelector_Timestamp = 3,
        /**Selects the line status all chunk for enabling. */
        ChunkSelector_LineStatusAll = 4,
        /**Selects the counter value chunk for configuration */
        ChunkSelector_CounterValue = 5,
        /**Selects the sequencer set active chunk for configuration */
        ChunkSelector_SequencerSetActive = 6,
        /**Selects the CRC checksum chunk for configuration */
        ChunkSelector_PayloadCRC16 = 7;

    /** Valid values for ChunkGainSelector */
    /** enum Basler_UsbCameraParams::ChunkGainSelectorEnums */
    public static final int
        /**Gain will be applied to all channels or taps */
        ChunkGainSelector_All = 0;

    /** Valid values for ChunkCounterSelector */
    /** enum Basler_UsbCameraParams::ChunkCounterSelectorEnums */
    public static final int
        /**Select counter 1 */
        ChunkCounterSelector_Counter1 = 0,
        /**Select counter 2 */
        ChunkCounterSelector_Counter2 = 1;

    /** Valid values for EventSelector */
    /** enum Basler_UsbCameraParams::EventSelectorEnums */
    public static final int
        /**Device just completed the exposure of one Frame. */
        EventSelector_ExposureEnd = 0,
        /**Device just started the capture of one frame. */
        EventSelector_FrameStart = 1,
        /**Device just started the capture of a frame burst. */
        EventSelector_FrameBurstStart = 2,
        /**Selects the frame start overtrigger event for enabling. */
        EventSelector_FrameStartOvertrigger = 3,
        /**Selects the frame burst start overtrigger event for enabling. */
        EventSelector_FrameBurstStartOvertrigger = 4,
        /**Selects the critical temperature event for enabling. */
        EventSelector_CriticalTemperature = 5,
        /**Selects the over temperature event for enabling. */
        EventSelector_OverTemperature = 6;

    /** Valid values for EventNotification */
    /** enum Basler_UsbCameraParams::EventNotificationEnums */
    public static final int
        /**The selected Event notification is disabled. */
        EventNotification_Off = 0,
        /**The selected Event notification is enabled. */
        EventNotification_On = 1;

    /** Valid values for BslUSBSpeedMode */
    /** enum Basler_UsbCameraParams::BslUSBSpeedModeEnums */
    public static final int
        //!<
        BslUSBSpeedMode_LowSpeed = 0,
        //!<
        BslUSBSpeedMode_FullSpeed = 1,
        /**Indicates the USB 'Hi-Speed' speed mode. */
        BslUSBSpeedMode_HighSpeed = 2,
        /**Indicates the USB 'Super Speed' speed mode. */
        BslUSBSpeedMode_SuperSpeed = 3;

    /** Valid values for DeviceScanType */
    /** enum Basler_UsbCameraParams::DeviceScanTypeEnums */
    public static final int
        /**Indicates that the device has an area scan type of sensor. */
        DeviceScanType_Areascan = 0,
        /**Indicates that the device has an Line scan type of sensor. */
        DeviceScanType_Linescan = 1;

    /** Valid values for DeviceLinkThroughputLimitMode */
    /** enum Basler_UsbCameraParams::DeviceLinkThroughputLimitModeEnums */
    public static final int
        /**Disables the device link throughput limit feature. */
        DeviceLinkThroughputLimitMode_Off = 0,
        /**Enables the device link throughput limit feature. */
        DeviceLinkThroughputLimitMode_On = 1;

    /** Valid values for DeviceTemperatureSelector */
    /** enum Basler_UsbCameraParams::DeviceTemperatureSelectorEnums */
    public static final int
        /**Temperature on sensor board */
        DeviceTemperatureSelector_Sensorboard = 0,
        /**Temperature on core board */
        DeviceTemperatureSelector_Coreboard = 1,
        /**Temperature on framegrabber board */
        DeviceTemperatureSelector_Framegrabberboard = 2;

    /** Valid values for TemperatureState */
    /** enum Basler_UsbCameraParams::TemperatureStateEnums */
    public static final int
        /**Ok */
        TemperatureState_Ok = 0,
        /**Critical */
        TemperatureState_Critical = 1,
        /**Error */
        TemperatureState_Error = 2;

    /** Valid values for UserDefinedValueSelector */
    /** enum Basler_UsbCameraParams::UserDefinedValueSelectorEnums */
    public static final int
        /**Selects Value1. */
        UserDefinedValueSelector_Value1 = 0,
        /**Selects Value2. */
        UserDefinedValueSelector_Value2 = 1,
        /**Selects Value3. */
        UserDefinedValueSelector_Value3 = 2,
        /**Selects Value4. */
        UserDefinedValueSelector_Value4 = 3,
        /**Selects Value5. */
        UserDefinedValueSelector_Value5 = 4;

    /** Valid values for RemoveParameterLimitSelector */
    /** enum Basler_UsbCameraParams::RemoveParameterLimitSelectorEnums */
    public static final int
        /**Selects the gain limits for configuration */
        RemoveParameterLimitSelector_Gain = 0,
        /**Selects the blacklevel limits for configuration */
        RemoveParameterLimitSelector_BlackLevel = 1,
        /**Selects the exposure time limits for configuration */
        RemoveParameterLimitSelector_ExposureTime = 2,
        /**Selects the target gray value for atuofunc */
        RemoveParameterLimitSelector_AutoTargetValue = 3,
        /**Selects the exposure overhead limits for configuration */
        RemoveParameterLimitSelector_ExposureOverhead = 4;

    /** Valid values for ExpertFeatureAccessSelector */
    /** enum Basler_UsbCameraParams::ExpertFeatureAccessSelectorEnums */
    public static final int
        /**Selects the Expert Feature 1 for configuration */
        ExpertFeatureAccessSelector_ExpertFeature1 = 0,
        /**Selects the Expert Feature 2 for configuration */
        ExpertFeatureAccessSelector_ExpertFeature2 = 1,
        /**Selects the Expert Feature 3 for configuration */
        ExpertFeatureAccessSelector_ExpertFeature3 = 2,
        /**Selects the Expert Feature 4 for configuration */
        ExpertFeatureAccessSelector_ExpertFeature4 = 3,
        /**Selects the Expert Feature 5 for configuration */
        ExpertFeatureAccessSelector_ExpertFeature5 = 4,
        /**Selects the Expert Feature 6 for configuration */
        ExpertFeatureAccessSelector_ExpertFeature6 = 5,
        /**Selects the Expert Feature 7 for configuration */
        ExpertFeatureAccessSelector_ExpertFeature7 = 6,
        /**Selects the Expert Feature 8 for configuration */
        ExpertFeatureAccessSelector_ExpertFeature8 = 7;

    /** Valid values for FileSelector */
    /** enum Basler_UsbCameraParams::FileSelectorEnums */
    public static final int
        /**Selects the file 'User Data' */
        FileSelector_UserData = 0,
        /**Selects the file 'User Set 1' */
        FileSelector_UserSet1 = 1,
        /**Selects the file 'User Set 2' */
        FileSelector_UserSet2 = 2,
        /**Selects the file 'User Set 3' */
        FileSelector_UserSet3 = 3,
        /**Selects the file 'User Gain Shading 1' */
        FileSelector_UserGainShading1 = 4,
        /**Selects the file 'User Gain Shading 2' */
        FileSelector_UserGainShading2 = 5,
        /**Selects the file 'User Offset Shading 1' */
        FileSelector_UserOffsetShading1 = 6,
        /**Selects the file 'User Offset Shading 2' */
        FileSelector_UserOffsetShading2 = 7,
        /**Selects the file 'Expert Feature 7 File' */
        FileSelector_ExpertFeature7File = 8;

    /** Valid values for FileOperationSelector */
    /** enum Basler_UsbCameraParams::FileOperationSelectorEnums */
    public static final int
        /**Opens the file selected by FileSelector */
        FileOperationSelector_Open = 0,
        /**Closes the file selected by FileSelector */
        FileOperationSelector_Close = 1,
        /**Reads data from the selected file */
        FileOperationSelector_Read = 2,
        /**Writes data to the selected file */
        FileOperationSelector_Write = 3;

    /** Valid values for FileOpenMode */
    /** enum Basler_UsbCameraParams::FileOpenModeEnums */
    public static final int
        /**Selects read-only open mode */
        FileOpenMode_Read = 0,
        /**Selects write-only open mode */
        FileOpenMode_Write = 1;

    /** Valid values for FileOperationStatus */
    /** enum Basler_UsbCameraParams::FileOperationStatusEnums */
    public static final int
        /**Successful file operation */
        FileOperationStatus_Success = 0,
        /**Failing file operation */
        FileOperationStatus_Failure = 1;

    /** Valid values for TestPattern */
    /** enum Basler_UsbCameraParams::TestPatternEnums */
    public static final int
        /**No test pattern. Displays the original image. */
        TestPattern_Off = 0,
        //!<
        TestPattern_GreyDiagonalSawtooth8 = 1,
        //!<
        TestPattern_ColorDiagonalSawtooth8 = 2;

    /** Valid values for SensorShutterMode */
    /** enum Basler_UsbCameraParams::SensorShutterModeEnums */
    public static final int
        /**The shutter opens and closes at the same time for all pixels. */
        SensorShutterMode_Global = 0,
        /**The shutter opens and closes sequentially for groups (typically lines) of pixels. */
        SensorShutterMode_Rolling = 1,
        /**The shutter opens at the same time for all pixels but ends in a sequential manner. */
        SensorShutterMode_GlobalReset = 2;

    /** Valid values for OverlapMode */
    /** enum Basler_UsbCameraParams::OverlapModeEnums */
    public static final int
        /**Overlapping exposure and image readout. */
        OverlapMode_On = 0,
        /**Non-overlapping exposure and image readout. */
        OverlapMode_Off = 1;

    /** Valid values for DefectPixelCorrectionMode */
    /** enum Basler_UsbCameraParams::DefectPixelCorrectionModeEnums */
    public static final int
        //!<
        DefectPixelCorrectionMode_Off = 0,
        //!<
        DefectPixelCorrectionMode_On = 1;

    /** Valid values for DeviceIndicatorMode */
    /** enum Basler_UsbCameraParams::DeviceIndicatorModeEnums */
    public static final int
        /**Indicators are inactive (off). */
        DeviceIndicatorMode_Inactive = 0,
        /**Indicators are active showing their respective status. */
        DeviceIndicatorMode_Active = 1;


    //**************************************************************************************************
    // Parameter class
    //**************************************************************************************************
    

    /** Basler USB3Vision camera interface */
    @Namespace("Basler_UsbCameraParams") @NoOffset public static class CUsbCameraParams_Params extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CUsbCameraParams_Params(Pointer p) { super(p); }
    
        
    /** \name SequencerControl - This category includes sequencer controls. Applies to: ace */
    //@{
    /**
        \brief Enables or disables the sequencer for image acquisition. Applies to: ace
        <p>
        Enables or disables the sequencer for image acquisition.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_SequencerModeEnums SequencerMode(); public native CUsbCameraParams_Params SequencerMode(IEnumerationT_SequencerModeEnums SequencerMode);
    
    //@}
    

    /** \name SequencerControl - This category includes sequencer controls. Applies to: ace */
    //@{
    /**
        \brief Indicates the index number of the currently active sequencer set. Applies to: ace
        <p>
        Indicates the index number of the current set, i.e. of the sequencer set whose parameter values are currently present in the active set.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger SequencerSetActive(); public native CUsbCameraParams_Params SequencerSetActive(IInteger SequencerSetActive);
    
    //@}
    

    /** \name SequencerControl - This category includes sequencer controls. Applies to: ace */
    //@{
    /**
        \brief Enables or disables the sequencer for configuration. Applies to: ace
        <p>
        Enables or disables the sequencer for configuration.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_SequencerConfigurationModeEnums SequencerConfigurationMode(); public native CUsbCameraParams_Params SequencerConfigurationMode(IEnumerationT_SequencerConfigurationModeEnums SequencerConfigurationMode);
    
    //@}
    

    /** \name SequencerControl - This category includes sequencer controls. Applies to: ace */
    //@{
    /**
        \brief Sequencer set that will be used with the first frame start trigger after SequencerMode was set to On. Applies to: ace
        <p>
        Sequencer set that will be used with the first frame start trigger after SequencerMode was set to On. Only sequencer set 0 is available.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger SequencerSetStart(); public native CUsbCameraParams_Params SequencerSetStart(IInteger SequencerSetStart);
    
    //@}
    

    /** \name SequencerControl - This category includes sequencer controls. Applies to: ace */
    //@{
    /**
        \brief Selects the sequencer set index number. Applies to: ace
        <p>
        Selects the sequencer set index number.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger SequencerSetSelector(); public native CUsbCameraParams_Params SequencerSetSelector(IInteger SequencerSetSelector);
    
    //@}
    

    /** \name SequencerControl - This category includes sequencer controls. Applies to: ace */
    //@{
    /**
        \brief Loads the parameter values of a sequencer set into the the active set. Applies to: ace
        <p>
        Loads the parameter values of a sequencer set into the the active set. The sequencer set will then be the currrent set.
    
        \b Visibility = Expert
    
    */
    public native @ByRef ICommand SequencerSetLoad(); public native CUsbCameraParams_Params SequencerSetLoad(ICommand SequencerSetLoad);
    
    //@}
    

    /** \name SequencerControl - This category includes sequencer controls. Applies to: ace */
    //@{
    /**
        \brief Saves the sequencer parameter values that are currently in the active set. Applies to: ace
        <p>
        Saves the sequencer parameter values that are currently in the active set. The values will be saved for the sequencer set whose sequencer set index number is currently selected.
    
        \b Visibility = Expert
    
    */
    public native @ByRef ICommand SequencerSetSave(); public native CUsbCameraParams_Params SequencerSetSave(ICommand SequencerSetSave);
    
    //@}
    

    /** \name SequencerControl - This category includes sequencer controls. Applies to: ace */
    //@{
    /**
        \brief Selects the sequencer path. Applies to: ace
        <p>
        Selects a sequencer path by selecting its number.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger SequencerPathSelector(); public native CUsbCameraParams_Params SequencerPathSelector(IInteger SequencerPathSelector);
    
    //@}
    

    /** \name SequencerControl - This category includes sequencer controls. Applies to: ace */
    //@{
    /**
        \brief Specifies the next sequencer set to follow after the current one. Applies to: ace
        <p>
        The parameter selects, for the selected sequencer set and path, the sequencer set that can be loaded after the current sequencer set.
    
        \b Visibility = Expert
    
        \b Selected by : SequencerPathSelector
    
    */
    public native @ByRef IInteger SequencerSetNext(); public native CUsbCameraParams_Params SequencerSetNext(IInteger SequencerSetNext);
    
    //@}
    

    /** \name SequencerControl - This category includes sequencer controls. Applies to: ace */
    //@{
    /**
        \brief Selects the trigger source for sequencer set advance. Applies to: ace
        <p>
        Selects, for the currently selected path, the trigger source for sequencer set advance.
    
        \b Visibility = Expert
    
        \b Selected by : SequencerPathSelector
    
    */
    public native @ByRef IEnumerationT_SequencerTriggerSourceEnums SequencerTriggerSource(); public native CUsbCameraParams_Params SequencerTriggerSource(IEnumerationT_SequencerTriggerSourceEnums SequencerTriggerSource);
    
    //@}
    

    /** \name SequencerControl - This category includes sequencer controls. Applies to: ace */
    //@{
    /**
        \brief Selects the level for the trigger source. Applies to: ace
        <p>
        Selects, for the currently selected path and trigger source, the effective logical level for sequencer set advance. Only LevelHigh is available.
    
        \b Visibility = Expert
    
        \b Selected by : SequencerPathSelector
    
    */
    public native @ByRef IEnumerationT_SequencerTriggerActivationEnums SequencerTriggerActivation(); public native CUsbCameraParams_Params SequencerTriggerActivation(IEnumerationT_SequencerTriggerActivationEnums SequencerTriggerActivation);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Indicates the width of the camera's sensor in pixels. Applies to: ace, dart, pulse
        <p>
        This is a read only parameter. It is of integer type and indicates the actual width of the camera's sensor in pixels.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger SensorWidth(); public native CUsbCameraParams_Params SensorWidth(IInteger SensorWidth);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Indicates the height of the camera's sensor in pixels. Applies to: ace, dart, pulse
        <p>
        This is a read only parameter. It is of integer type and indicates the actual height of the camera's sensor in pixels.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger SensorHeight(); public native CUsbCameraParams_Params SensorHeight(IInteger SensorHeight);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Indicates the camera's maximum allowed width of the area of interest (AOI) in pixels. Applies to: ace, dart, pulse
        <p>
        This is a read only parameter. It is of integer type and indicates the maximum allowed width of the camera's area of interest (AOI) in pixels. It takes into account any function that may limit the maximum width.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger WidthMax(); public native CUsbCameraParams_Params WidthMax(IInteger WidthMax);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Indicates the camera's maximum allowed height of the area of interest (AOI) in pixels. Applies to: ace, dart, pulse
        <p>
        This is a read only parameter. It is of integer type and indicates the maximum allowed height of the camera's area of interest (AOI) in pixels. It takes into account any function that may limit the maximum height.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger HeightMax(); public native CUsbCameraParams_Params HeightMax(IInteger HeightMax);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the width of the camera's area of interest (AOI) in pixels. Applies to: ace, dart, pulse
        <p>
        This parameter is of integer type and determines the width of the camera's area of interest (AOI) in pixels. Depending on the camera model, the parameter can be set in different increments.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IInteger Width(); public native CUsbCameraParams_Params Width(IInteger Width);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the height of the camera's area of interest (AOI) in pixels. Applies to: ace, dart, pulse
        <p>
        This parameter is of integer type and determines the height of the camera's area of interest (AOI) in pixels. Depending on the camera model, the parameter can be set in different increments.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IInteger Height(); public native CUsbCameraParams_Params Height(IInteger Height);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the X offset (left offset) of the area of interest (AOI) in pixels. Applies to: ace, dart, pulse
        <p>
        The Offset X parameter determines the position of the area of interest (AOI) in the x direction. Since the position of the AOI is referenced to the top left corner of the sensor array, the Offset X parameter sets the distance in pixels between the left side of the sensor and the left side of the AOI.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IInteger OffsetX(); public native CUsbCameraParams_Params OffsetX(IInteger OffsetX);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the Y offset (top offset) of the area of interest (AOI) in pixels. Applies to: ace, dart, pulse
        <p>
        The Offset Y parameter determines the position of the area of interest (AOI) in the y direction. Since the position of the AOI is referenced to the top left corner of the sensor array, the Offset Y parameter sets the distance in pixels between the top of the sensor and the top of the AOI.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IInteger OffsetY(); public native CUsbCameraParams_Params OffsetY(IInteger OffsetY);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Align output image data to multiples of 4 bytes. Applies to: ace
        <p>
        Align output image data to multiples of 4 bytes.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IBoolean LinePitchEnable(); public native CUsbCameraParams_Params LinePitchEnable(IBoolean LinePitchEnable);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief The number of bytes separating the starting pixels of two consecutive lines. Applies to: ace
        <p>
        The number of bytes separating the starting pixels of two consecutive lines. This feature is used to facilitate alignment of image data.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger LinePitch(); public native CUsbCameraParams_Params LinePitch(IInteger LinePitch);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Enables the horizontal centering of the image. Applies to: ace
        <p>
        This feature is used to center the image horizontally.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IBoolean CenterX(); public native CUsbCameraParams_Params CenterX(IBoolean CenterX);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Enables the vertical centering of the image. Applies to: ace
        <p>
        This feature is used to center the image vertically.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IBoolean CenterY(); public native CUsbCameraParams_Params CenterY(IBoolean CenterY);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Enables the horizontal mirroring of the image. Applies to: ace, dart, pulse
        <p>
        This feature is used to mirror the captured image horizontally. The pixel values for each line in a captured image will be swapped end-for-end about the line's center. You can use the AOI feature when using the reverse X feature. Note that the position of the AOI relative to the sensor remains the same.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IBoolean ReverseX(); public native CUsbCameraParams_Params ReverseX(IBoolean ReverseX);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Enables the vertical mirroring of the image. Applies to: ace, dart, pulse
        <p>
        This feature is used to mirror the captured image vertically. The pixel values for each row in a captured image will be swapped end-for-end about the row's center. You can use the AOI feature when using the reverse Y feature. Note that the position of the AOI relative to the sensor remains the same.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IBoolean ReverseY(); public native CUsbCameraParams_Params ReverseY(IBoolean ReverseY);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the horizontal binning mode. Applies to: ace, dart, pulse
        <p>
        This enumeration sets the horizontal binning mode.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_BinningHorizontalModeEnums BinningHorizontalMode(); public native CUsbCameraParams_Params BinningHorizontalMode(IEnumerationT_BinningHorizontalModeEnums BinningHorizontalMode);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the number of adjacent horizontal pixels to be summed. Applies to: ace, dart, pulse
        <p>
        Binning increases the camera's response to light by summing the charges from adjacent pixels into one pixel. The Binning Horizontal parameter sets the number of adjacent horizontal pixels to be summed. Their summed charges will be reported out of the camera as a single pixel.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger BinningHorizontal(); public native CUsbCameraParams_Params BinningHorizontal(IInteger BinningHorizontal);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the vertical binning mode. Applies to: ace, dart, pulse
        <p>
        This enumeration sets the vertical binning mode.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_BinningVerticalModeEnums BinningVerticalMode(); public native CUsbCameraParams_Params BinningVerticalMode(IEnumerationT_BinningVerticalModeEnums BinningVerticalMode);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the number of adjacent vertical pixels to be summed. Applies to: ace, dart, pulse
        <p>
        Binning increases the camera's response to light by summing the charges from adjacent pixels into one pixel. The Binning Vertical parameter sets the number of adjacent vertical pixels to be summed. Their summed charges will be reported out of the camera as a single pixel.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger BinningVertical(); public native CUsbCameraParams_Params BinningVertical(IInteger BinningVertical);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets horizontal sub-sampling. Applies to: ace
        <p>
        Horizontal sub-sampling of the image. This has the net effect of reducing the horizontal resolution (width) of the image by the specified horizontal decimation factor. A value of 1 indicates that the camera performs no horizontal decimation.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger DecimationHorizontal(); public native CUsbCameraParams_Params DecimationHorizontal(IInteger DecimationHorizontal);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets vertical sub-sampling. Applies to: ace
        <p>
        Vertical sub-sampling of the image. This has the net effect of reducing the vertical resolution (height) of the image by the specified vertical decimation factor. A value of 1 indicates that the camera performs no vertical decimation.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger DecimationVertical(); public native CUsbCameraParams_Params DecimationVertical(IInteger DecimationVertical);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the horizontal scaling factor. Applies to: ace
        <p>
        This is a float value that sets the horizontal scaling factor of the image.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat ScalingHorizontal(); public native CUsbCameraParams_Params ScalingHorizontal(IFloat ScalingHorizontal);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the vertical scaling factor. Applies to: ace
        <p>
        This is a float value that sets the vertical scaling factor of the image.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat ScalingVertical(); public native CUsbCameraParams_Params ScalingVertical(IFloat ScalingVertical);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the format of the pixel data transmitted for acquired images. Applies to: ace, dart, pulse
        <p>
        The Pixel Format parameter determines the format (layout) of the image data that will be output from the camera. The available pixel formats depend on the camera model and whether the camera is monochrome or color.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IEnumerationT_PixelFormatEnums PixelFormat(); public native CUsbCameraParams_Params PixelFormat(IEnumerationT_PixelFormatEnums PixelFormat);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Indicates the depth of the pixel values in the image in bits per pixel. Applies to: ace, dart, pulse
        <p>
        This is a read only feature. This enumeration provides a list of values that indicate the depth of the pixel values in the acquired images in bits per pixel. This value will always be coherent with the pixel format setting.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_PixelSizeEnums PixelSize(); public native CUsbCameraParams_Params PixelSize(IEnumerationT_PixelSizeEnums PixelSize);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Indicates the current alignment of the camera's Bayer filter to the pixels in the acquired images. Applies to: ace, dart, pulse
        <p>
        This is a read only feature. This enumeration provides a list of values that indicate the current alignment of the camera's Bayer filter to the pixels in the acquired images. The alignment of the Bayer filter depends on the camera model.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_PixelColorFilterEnums PixelColorFilter(); public native CUsbCameraParams_Params PixelColorFilter(IEnumerationT_PixelColorFilterEnums PixelColorFilter);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Indicates the minimum possible pixel value that could be transferred from the camera. Applies to: ace, dart, pulse
        <p>
        This a read only feature. The Dynamic Range Min parameter indicates the minimum possible pixel value that could be transferred from the camera.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger PixelDynamicRangeMin(); public native CUsbCameraParams_Params PixelDynamicRangeMin(IInteger PixelDynamicRangeMin);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Indicates the maximum possible pixel value that could be transferred from the camera. Applies to: ace, dart, pulse
        <p>
        This a read only feature. The Dynamic Range Max parameter indicates the maximum possible pixel value that could be transferred from the camera.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger PixelDynamicRangeMax(); public native CUsbCameraParams_Params PixelDynamicRangeMax(IInteger PixelDynamicRangeMax);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Selecting a test image from the list will output the test image. Applies to: ace
        <p>
        The Test Image Selector is used to set the camera to output a test image. You can set the value of the Test Image Selector to one of the test images or to 'test image off'.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_TestImageSelectorEnums TestImageSelector(); public native CUsbCameraParams_Params TestImageSelector(IEnumerationT_TestImageSelectorEnums TestImageSelector);
    
    //@}
    

    /** \name AnalogControl -  */
    //@{
    /**
        \brief Adjusts the Gain Raw parameter value automatically. Applies to: ace, dart, pulse
        <p>
        The gain auto function is the 'automatic' counterpart to manually setting the Gain Raw parameter. It allows to adjust the Gain Raw parameter value automatically within set limits until a target average gray value for the pixel data from the related Auto Function AOI is reached.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_GainAutoEnums GainAuto(); public native CUsbCameraParams_Params GainAuto(IEnumerationT_GainAutoEnums GainAuto);
    
    //@}
    

    /** \name AnalogControl -  */
    //@{
    /**
        \brief Selects the gain control to configure. Applies to: ace, dart, pulse
        <p>
        The Gain Selector parameter is used to select the gain control to configure. Once a gain control has been selected, all changes to the gain settings will be applied to the selected control.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_GainSelectorEnums GainSelector(); public native CUsbCameraParams_Params GainSelector(IEnumerationT_GainSelectorEnums GainSelector);
    
    //@}
    

    /** \name AnalogControl -  */
    //@{
    /**
        \brief Sets the selected gain control in dB. Applies to: ace, dart, pulse
        <p>
        This is a float value that sets the selected gain control in dB.
    
        \b Visibility = Beginner
        
    
        \b Selected by : GainSelector
    
    */
    public native @ByRef IFloat Gain(); public native CUsbCameraParams_Params Gain(IFloat Gain);
    
    //@}
    

    /** \name AnalogControl -  */
    //@{
    /**
        \brief Selcts a black level control to configure. Applies to: ace, dart, pulse
        <p>
        This enumeration selects the black level control to configure. Once a black level control has been selected, all changes to the black level settings will be applied to the selected control.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_BlackLevelSelectorEnums BlackLevelSelector(); public native CUsbCameraParams_Params BlackLevelSelector(IEnumerationT_BlackLevelSelectorEnums BlackLevelSelector);
    
    //@}
    

    /** \name AnalogControl -  */
    //@{
    /**
        \brief Sets the value of the selected black level control as a float. Applies to: ace, dart, pulse
        <p>
        This value sets the selected black level control as a float value. Adjusting the camera's black level will result in an offset to the pixel values output by the camera.
    
        \b Visibility = Beginner
        
    
        \b Selected by : BlackLevelSelector
    
    */
    public native @ByRef IFloat BlackLevel(); public native CUsbCameraParams_Params BlackLevel(IFloat BlackLevel);
    
    //@}
    

    /** \name AnalogControl -  */
    //@{
    /**
        \brief Performs gamma correction of pixel intensity. Applies to: ace, dart, pulse
        <p>
        The gamma correction feature lets you modify the brightness of the pixel values output by the camera's sensor to account for a non-linearity in the human perception of brightness.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat Gamma(); public native CUsbCameraParams_Params Gamma(IFloat Gamma);
    
    //@}
    

    /** \name AnalogControl -  */
    //@{
    /**
        \brief Sets the value of the selected digital shift control. Applies to: ace
        <p>
        This value sets the selected digital shift control
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger DigitalShift(); public native CUsbCameraParams_Params DigitalShift(IInteger DigitalShift);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Selects the light source preset. Applies to: ace, dart, pulse
        <p>
        This parameter determines the light source preset. The colors in the image will be corrected so that they are appropriate for the selected light source.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IEnumerationT_LightSourcePresetEnums LightSourcePreset(); public native CUsbCameraParams_Params LightSourcePreset(IEnumerationT_LightSourcePresetEnums LightSourcePreset);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Currently effective color space. Applies to: ace
        <p>
        Reports the currently effective color space (read only). When no light source preset is selected, the camera delivers colors in accord with the RGB color space. RGB is reported as the currently effective color space. When a light source preset is selected the colors are automatically corrected to bring them in accord with the sRGB color space. sRGB is reported as the currently effective color space.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_ColorSpaceEnums ColorSpace(); public native CUsbCameraParams_Params ColorSpace(IEnumerationT_ColorSpaceEnums ColorSpace);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Adjusts the white balance setting automatically. Applies to: ace, dart, pulse
        <p>
        Balance White Auto is the 'automatic' counterpart to manually setting the white balance. Automatic white balancing is a two-step process. First, the Balance Ratio Abs parameter values for red, green, and blue are each set to 1.5. Then, assuming a 'gray world' model, the Balance Ratio Abs parameter values are automatically adjusted such that the average values for the 'red' and 'blue' pixels match the average value for the 'green' pixels.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_BalanceWhiteAutoEnums BalanceWhiteAuto(); public native CUsbCameraParams_Params BalanceWhiteAuto(IEnumerationT_BalanceWhiteAutoEnums BalanceWhiteAuto);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Selects a balance ratio to configure. Applies to: ace, dart, pulse
        <p>
        This enumeration selects a balance ratio control to configure. Once a balance ratio control has been selected, all changes to the balance ratio settings will be applied to the selected control.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_BalanceRatioSelectorEnums BalanceRatioSelector(); public native CUsbCameraParams_Params BalanceRatioSelector(IEnumerationT_BalanceRatioSelectorEnums BalanceRatioSelector);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Sets the value of the selected balance ratio control as a float. Applies to: ace, dart, pulse
        <p>
        This value sets the selected balance ratio control as a float value.
    
        \b Visibility = Beginner
        
    
        \b Selected by : BalanceRatioSelector
    
    */
    public native @ByRef IFloat BalanceRatio(); public native CUsbCameraParams_Params BalanceRatio(IFloat BalanceRatio);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Selects the color for color adjustment. Applies to: ace
        <p>
        Selects the color for color adjustment.
Those colors in the image will be adjusted where the selected color predominates.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_ColorAdjustmentSelectorEnums ColorAdjustmentSelector(); public native CUsbCameraParams_Params ColorAdjustmentSelector(IEnumerationT_ColorAdjustmentSelectorEnums ColorAdjustmentSelector);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Adjustment of hue of the selected color (float). Applies to: ace
        <p>
        Sets a floating point value for the adjustment of hue of the selected color.
    
        \b Visibility = Expert
    
        \b Selected by : ColorAdjustmentSelector
    
    */
    public native @ByRef IFloat ColorAdjustmentHue(); public native CUsbCameraParams_Params ColorAdjustmentHue(IFloat ColorAdjustmentHue);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Adjustment of saturation of the selected color (float). Applies to: ace
        <p>
        Sets a floating point value for the adjustment of saturation of the selected color.
    
        \b Visibility = Expert
    
        \b Selected by : ColorAdjustmentSelector
    
    */
    public native @ByRef IFloat ColorAdjustmentSaturation(); public native CUsbCameraParams_Params ColorAdjustmentSaturation(IFloat ColorAdjustmentSaturation);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Selects the matrix color transformation between color spaces. Applies to: ace
        <p>
        Selects the matrix color transformation between color spaces.
Generally, the related color spaces are used for internal processing: The color signals provided by the sensor are transformed to the RGB color space to allow further transformations (to account for the type of light source, for color adjustment, for white balance, etc.).
The color transformation selected here does not refer to the color space selected for the transmission of image data out of the camera.
    
        <p>
    
        \b Visibility = Guru
    
    */
    public native @ByRef IEnumerationT_ColorTransformationSelectorEnums ColorTransformationSelector(); public native CUsbCameraParams_Params ColorTransformationSelector(IEnumerationT_ColorTransformationSelectorEnums ColorTransformationSelector);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Selects the element to be entered in the color transformation matrix. Applies to: ace
        <p>
        Selects the element to be entered in the 3 x 3 color transformation matrix for custom matrix color transformation.
Note: Depending on the camera model, some elements in the color transformation matrix may be preset and can not be changed.
    
        <p>
    
        \b Visibility = Guru
    
        \b Selected by : ColorTransformationSelector
    
    */
    public native @ByRef IEnumerationT_ColorTransformationValueSelectorEnums ColorTransformationValueSelector(); public native CUsbCameraParams_Params ColorTransformationValueSelector(IEnumerationT_ColorTransformationValueSelectorEnums ColorTransformationValueSelector);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Sets a floating point value for the selected element in the color transformation matrix. Applies to: ace
        <p>
        Sets a floating point value for the selected element in the color transformation matrix.
    
        \b Visibility = Guru
    
        \b Selected by : ColorTransformationSelector, ColorTransformationValueSelector
    
    */
    public native @ByRef IFloat ColorTransformationValue(); public native CUsbCameraParams_Params ColorTransformationValue(IFloat ColorTransformationValue);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Sets the image acquisition mode. Applies to: ace, dart, pulse
        <p>
        This enumeration sets the image acquisition mode. 
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_AcquisitionModeEnums AcquisitionMode(); public native CUsbCameraParams_Params AcquisitionMode(IEnumerationT_AcquisitionModeEnums AcquisitionMode);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Starts the acquisition of images. Applies to: ace, dart, pulse
        <p>
        This command starts the acquisition of images. If the camera is set for single frame acquisition, it will start acquisition of one frame. If the camera is set for continuous frame acquisition, it will start continuous acquisition of frames.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef ICommand AcquisitionStart(); public native CUsbCameraParams_Params AcquisitionStart(ICommand AcquisitionStart);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Stops the acquisition of images. Applies to: ace, dart, pulse
        <p>
        If the camera is set for continuous image acquisition and acquisition has been started, this command stops the acquisition of images.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef ICommand AcquisitionStop(); public native CUsbCameraParams_Params AcquisitionStop(ICommand AcquisitionStop);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Sets the shutter mode. Applies to: ace
        <p>
        This enumeration sets the shutter mode.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_ShutterModeEnums ShutterMode(); public native CUsbCameraParams_Params ShutterMode(IEnumerationT_ShutterModeEnums ShutterMode);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Adjusts the Auto Exposure Time Abs parameter value automatically. Applies to: ace, dart, pulse
        <p>
        Exposure Auto is the 'automatic' counterpart to manually setting the Exposure Time Abs parameter. It adjusts the Exposure Time Abs parameter value automatically within set limits until a target average gray value for the pixel data of the related Auto Function AOI is reached.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_ExposureAutoEnums ExposureAuto(); public native CUsbCameraParams_Params ExposureAuto(IEnumerationT_ExposureAutoEnums ExposureAuto);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Sets the exposure mode. Applies to: ace, dart, pulse
        <p>
        This enumeration sets the exposure mode.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_ExposureModeEnums ExposureMode(); public native CUsbCameraParams_Params ExposureMode(IEnumerationT_ExposureModeEnums ExposureMode);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Sets the camera's exposure time directly in microseconds. Applies to: ace, dart, pulse
        <p>
        This float value sets the camera's exposure time in microseconds.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat ExposureTime(); public native CUsbCameraParams_Params ExposureTime(IFloat ExposureTime);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Selects the Exposure Overlap Time Mode. Applies to: ace
        <p>
        Selects the manual or automatic control of the maximum overlap between immediately succeeding image acquisitions.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_ExposureOverlapTimeModeEnums ExposureOverlapTimeMode(); public native CUsbCameraParams_Params ExposureOverlapTimeMode(IEnumerationT_ExposureOverlapTimeModeEnums ExposureOverlapTimeMode);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Sets the maximum overlap time of the sensor exposure with sensor readout in trigger width exposure mode in microseconds. Applies to: ace
        <p>
        This float value sets the maximum overlap time (in microseconds) of the sensor exposure with sensor readout in trigger width exposure mode.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IFloat ExposureOverlapTimeMax(); public native CUsbCameraParams_Params ExposureOverlapTimeMax(IFloat ExposureOverlapTimeMax);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Sets the readout mode of the device. Applies to: ace
        <p>
        Sets the readout mode of the device
    
        \b Visibility = Guru
    
    */
    public native @ByRef IEnumerationT_SensorReadoutModeEnums SensorReadoutMode(); public native CUsbCameraParams_Params SensorReadoutMode(IEnumerationT_SensorReadoutModeEnums SensorReadoutMode);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Number of frames to acquire for each FrameBurstStart trigger. Applies to: ace
        <p>
        Number of frames to acquire for each FrameBurstStart trigger
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger AcquisitionBurstFrameCount(); public native CUsbCameraParams_Params AcquisitionBurstFrameCount(IInteger AcquisitionBurstFrameCount);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Selects the trigger type to configure. Applies to: ace, dart, pulse
        <p>
        This enumeration selects the trigger type to configure. Once a trigger type has been selected, all changes to the trigger settings will be applied to the selected trigger.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_TriggerSelectorEnums TriggerSelector(); public native CUsbCameraParams_Params TriggerSelector(IEnumerationT_TriggerSelectorEnums TriggerSelector);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Sets the mode for the selected trigger. Applies to: ace, dart, pulse
        <p>
        This enumeration sets the trigger mode for the selected trigger.
    
        \b Visibility = Beginner
        
    
        \b Selected by : TriggerSelector
    
    */
    public native @ByRef IEnumerationT_TriggerModeEnums TriggerMode(); public native CUsbCameraParams_Params TriggerMode(IEnumerationT_TriggerModeEnums TriggerMode);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Generates a software trigger signal that is used when the trigger source is set to 'software trigger'. Applies to: ace, dart, pulse
        <p>
        This command generates a software trigger signal. The software trigger signal will be used when the trigger source is set to 'software trigger'.
    
        \b Visibility = Expert
    
        \b Selected by : TriggerSelector
    
    */
    public native @ByRef ICommand TriggerSoftware(); public native CUsbCameraParams_Params TriggerSoftware(ICommand TriggerSoftware);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Sets the signal source for the selected trigger. Applies to: ace, dart, pulse
        <p>
        The Trigger Source parameter specifies the source signal that will act as the frame start trigger signal.
    
        \b Visibility = Expert
    
        \b Selected by : TriggerSelector
    
    */
    public native @ByRef IEnumerationT_TriggerSourceEnums TriggerSource(); public native CUsbCameraParams_Params TriggerSource(IEnumerationT_TriggerSourceEnums TriggerSource);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Sets the signal transition needed to activate the selected trigger. Applies to: ace, dart, pulse
        <p>
        This enumeration sets the signal transition needed to activate the selected trigger.
    
        \b Visibility = Expert
    
        \b Selected by : TriggerSelector
    
    */
    public native @ByRef IEnumerationT_TriggerActivationEnums TriggerActivation(); public native CUsbCameraParams_Params TriggerActivation(IEnumerationT_TriggerActivationEnums TriggerActivation);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Sets the trigger delay time in microseconds. Applies to: ace
        <p>
        This float value sets the absolute trigger delay in microseconds to apply after the trigger reception before effectively activating it.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IFloat TriggerDelay(); public native CUsbCameraParams_Params TriggerDelay(IFloat TriggerDelay);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Enables setting the camera's acquisition frame rate to a specified value. Applies to: ace
        <p>
        This boolean value enables setting the camera's acquisition frame rate to a specified value.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IBoolean AcquisitionFrameRateEnable(); public native CUsbCameraParams_Params AcquisitionFrameRateEnable(IBoolean AcquisitionFrameRateEnable);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Sets the camera's acquisition frame rate in frames per second. Applies to: ace, dart, pulse
        <p>
        The Acquisition Frame Rate parameter sets the 'absolute' value of the acquisition frame rate. The 'absolute' value is a float value that sets the acquisition frame rate in frames per second.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IFloat AcquisitionFrameRate(); public native CUsbCameraParams_Params AcquisitionFrameRate(IFloat AcquisitionFrameRate);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Indicates the maximum allowed frame acquisition rate. Applies to: ace
        <p>
        The Resulting Frame Rate parameter indicates the 'absolute' value of the maximum allowed acquisition frame rate. The 'absolute' value is a float value that indicates the maximum allowed acquisition frame rate in frames per second given the current settings for the area of interest, exposure time, and bandwidth.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat ResultingFrameRate(); public native CUsbCameraParams_Params ResultingFrameRate(IFloat ResultingFrameRate);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Indicates the sensor readout time given the current settings. Applies to: ace
        <p>
        The Sensor Readout Time parameter indicates the sensor readout time given the current settings.
    
        \b Visibility = Guru
    
    */
    public native @ByRef IFloat SensorReadoutTime(); public native CUsbCameraParams_Params SensorReadoutTime(IFloat SensorReadoutTime);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Selects which internal acquisition signal to read using the Acquisition Status parameter. Applies to: ace
        <p>
        This enumeration is used to select which internal acquisition signal to read using Acquisition Status parameter.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_AcquisitionStatusSelectorEnums AcquisitionStatusSelector(); public native CUsbCameraParams_Params AcquisitionStatusSelector(IEnumerationT_AcquisitionStatusSelectorEnums AcquisitionStatusSelector);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Reports the selected acquisition status. Applies to: ace
        <p>
        This feature is used to read the state (true or false) of the internal acquisition signal selected using the Acquisition Status Selector parameter.
    
        \b Visibility = Expert
    
        \b Selected by : AcquisitionStatusSelector
    
    */
    public native @ByRef IBoolean AcquisitionStatus(); public native CUsbCameraParams_Params AcquisitionStatus(IBoolean AcquisitionStatus);
    
    //@}
    

    /** \name AutoFunctionControl - This category includes items that parameterize the Auto Functions. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the target average brightness for the gain auto function and the exposure auto function. Applies to: ace, dart, pulse
        <p>
        This float value sets the target average brightness for the gain auto function and the exposure auto function.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat AutoTargetBrightness(); public native CUsbCameraParams_Params AutoTargetBrightness(IFloat AutoTargetBrightness);
    
    //@}
    

    /** \name AutoFunctionControl - This category includes items that parameterize the Auto Functions. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Selects the strategy for controlling gain and shutter simultaneously. Applies to: ace, dart, pulse
        <p>
        The auto function profile specifies whether the gain or the exposure time will be kept as low as possible when the camera is making automatic adjustments to achieve a target average gray value for the pixel data from the Auto Function AOI that was related to the gain auto and the exposure auto function. By default, the auto function profile feature minimizes gain.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_AutoFunctionProfileEnums AutoFunctionProfile(); public native CUsbCameraParams_Params AutoFunctionProfile(IEnumerationT_AutoFunctionProfileEnums AutoFunctionProfile);
    
    //@}
    

    /** \name AutoFunctionControl - This category includes items that parameterize the Auto Functions. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the lower limit of the Gain parameter. Applies to: ace, dart, pulse
        <p>
        This float value sets the lower limit of the Gain parameter.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat AutoGainLowerLimit(); public native CUsbCameraParams_Params AutoGainLowerLimit(IFloat AutoGainLowerLimit);
    
    //@}
    

    /** \name AutoFunctionControl - This category includes items that parameterize the Auto Functions. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the upper limit of the Gain parameter. Applies to: ace, dart, pulse
        <p>
        This float value sets the upper limit of the Gain parameter.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat AutoGainUpperLimit(); public native CUsbCameraParams_Params AutoGainUpperLimit(IFloat AutoGainUpperLimit);
    
    //@}
    

    /** \name AutoFunctionControl - This category includes items that parameterize the Auto Functions. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the lower limit of the Exposure Time parameter. Applies to: ace, dart, pulse
        <p>
        This float value sets the lower limit of the Exposure Time parameter.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat AutoExposureTimeLowerLimit(); public native CUsbCameraParams_Params AutoExposureTimeLowerLimit(IFloat AutoExposureTimeLowerLimit);
    
    //@}
    

    /** \name AutoFunctionControl - This category includes items that parameterize the Auto Functions. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the upper limit of the Exposure Time parameter. Applies to: ace, dart, pulse
        <p>
        This float value sets the upper limit of the Exposure Time parameter.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat AutoExposureTimeUpperLimit(); public native CUsbCameraParams_Params AutoExposureTimeUpperLimit(IFloat AutoExposureTimeUpperLimit);
    
    //@}
    

    /** \name AutoFunctionROIControl - Selects and configures Auto Function ROIs. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Selects the Auto Function ROI. Applies to: ace, dart, pulse
        <p>
        Selects the Auto Function ROI.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_AutoFunctionROISelectorEnums AutoFunctionROISelector(); public native CUsbCameraParams_Params AutoFunctionROISelector(IEnumerationT_AutoFunctionROISelectorEnums AutoFunctionROISelector);
    
    //@}
    

    /** \name AutoFunctionROIControl - Selects and configures Auto Function ROIs. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the width of the auto function region of interest in pixels. Applies to: ace, dart, pulse
        <p>
        This value sets the width of the auto function region of interest in pixels.
    
        \b Visibility = Beginner
        
    
        \b Selected by : AutoFunctionROISelector
    
    */
    public native @ByRef IInteger AutoFunctionROIWidth(); public native CUsbCameraParams_Params AutoFunctionROIWidth(IInteger AutoFunctionROIWidth);
    
    //@}
    

    /** \name AutoFunctionROIControl - Selects and configures Auto Function ROIs. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the height of the auto function region of interest in pixels. Applies to: ace, dart, pulse
        <p>
        This value sets the height of the auto function region of interest in pixels.
    
        \b Visibility = Beginner
        
    
        \b Selected by : AutoFunctionROISelector
    
    */
    public native @ByRef IInteger AutoFunctionROIHeight(); public native CUsbCameraParams_Params AutoFunctionROIHeight(IInteger AutoFunctionROIHeight);
    
    //@}
    

    /** \name AutoFunctionROIControl - Selects and configures Auto Function ROIs. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the starting column of the auto function region of interest in pixels. Applies to: ace, dart, pulse
        <p>
        The Offset X parameter determines the position of the auto function region of interest in the x direction.
    
        \b Visibility = Beginner
        
    
        \b Selected by : AutoFunctionROISelector
    
    */
    public native @ByRef IInteger AutoFunctionROIOffsetX(); public native CUsbCameraParams_Params AutoFunctionROIOffsetX(IInteger AutoFunctionROIOffsetX);
    
    //@}
    

    /** \name AutoFunctionROIControl - Selects and configures Auto Function ROIs. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the starting line of the auto function region of interest in pixels. Applies to: ace, dart, pulse
        <p>
        The Offset Y parameter determines the position of the auto function region of interest in the y direction.
    
        \b Visibility = Beginner
        
    
        \b Selected by : AutoFunctionROISelector
    
    */
    public native @ByRef IInteger AutoFunctionROIOffsetY(); public native CUsbCameraParams_Params AutoFunctionROIOffsetY(IInteger AutoFunctionROIOffsetY);
    
    //@}
    

    /** \name AutoFunctionROIControl - Selects and configures Auto Function ROIs. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Selects brightness to be adjusted by an auto function. Applies to: ace, dart, pulse
        <p>
        For the selected Auto Function ROI, brightness will be adjusted by an auto function. Depending on the Auto Function Profile setting, the adjustment will be done either by the Gain Auto or by the Exposure Auto auto function. 
    
        \b Visibility = Beginner
        
    
        \b Selected by : AutoFunctionROISelector
    
    */
    public native @ByRef IBoolean AutoFunctionROIUseBrightness(); public native CUsbCameraParams_Params AutoFunctionROIUseBrightness(IBoolean AutoFunctionROIUseBrightness);
    
    //@}
    

    /** \name AutoFunctionROIControl - Selects and configures Auto Function ROIs. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Selects white balance to be adjusted by the related auto function. Applies to: ace, dart, pulse
        <p>
        For the selected Auto Function ROI, white balance will be adjusted by the Balance White Auto auto function.
    
        \b Visibility = Beginner
        
    
        \b Selected by : AutoFunctionROISelector
    
    */
    public native @ByRef IBoolean AutoFunctionROIUseWhiteBalance(); public native CUsbCameraParams_Params AutoFunctionROIUseWhiteBalance(IBoolean AutoFunctionROIUseWhiteBalance);
    
    //@}
    

    /** \name AutoFunctionAOIControl - Selects and configures Auto Function AOIs */
    //@{
    /**
        \brief This feature has been \b deprecated. Selects the Auto Function AOI.
        <p>
        Selects the Auto Function AOI.
    
        \b Visibility = Invisible
    
    */
    
// #if defined (_MSC_VER)
// #   pragma warning(push)
// #   pragma warning(disable: 4996) // name has been marked as deprecated
// #endif

    public native @ByRef IEnumerationT_AutoFunctionAOISelectorEnums AutoFunctionAOISelector(); public native CUsbCameraParams_Params AutoFunctionAOISelector(IEnumerationT_AutoFunctionAOISelectorEnums AutoFunctionAOISelector);
    
// #if defined (_MSC_VER)	
// #   pragma warning(pop)
// #endif
    
    //@}
    

    /** \name AutoFunctionAOIControl - Selects and configures Auto Function AOIs */
    //@{
    /**
        \brief This feature has been \b deprecated. Sets the width of the auto function area of interest in pixels.
        <p>
        This value sets the width of the auto function area of interest in pixels.
    
        \b Visibility = Invisible
    
        \b Selected by : AutoFunctionAOISelector
    
    */
    
// #if defined (_MSC_VER)
// #   pragma warning(push)
// #   pragma warning(disable: 4996) // name has been marked as deprecated
// #endif

    public native @ByRef IInteger AutoFunctionAOIWidth(); public native CUsbCameraParams_Params AutoFunctionAOIWidth(IInteger AutoFunctionAOIWidth);
    
// #if defined (_MSC_VER)	
// #   pragma warning(pop)
// #endif
    
    //@}
    

    /** \name AutoFunctionAOIControl - Selects and configures Auto Function AOIs */
    //@{
    /**
        \brief This feature has been \b deprecated. Sets the height of the auto function area of interest in pixels.
        <p>
        This value sets the height of the auto function area of interest in pixels.
    
        \b Visibility = Invisible
    
        \b Selected by : AutoFunctionAOISelector
    
    */
    
// #if defined (_MSC_VER)
// #   pragma warning(push)
// #   pragma warning(disable: 4996) // name has been marked as deprecated
// #endif

    public native @ByRef IInteger AutoFunctionAOIHeight(); public native CUsbCameraParams_Params AutoFunctionAOIHeight(IInteger AutoFunctionAOIHeight);
    
// #if defined (_MSC_VER)	
// #   pragma warning(pop)
// #endif
    
    //@}
    

    /** \name AutoFunctionAOIControl - Selects and configures Auto Function AOIs */
    //@{
    /**
        \brief This feature has been \b deprecated. Sets the starting column of the auto function area of interest in pixels.
        <p>
        The Offset X parameter determines the position of the auto function area of interest in the x direction.
    
        \b Visibility = Invisible
    
        \b Selected by : AutoFunctionAOISelector
    
    */
    
// #if defined (_MSC_VER)
// #   pragma warning(push)
// #   pragma warning(disable: 4996) // name has been marked as deprecated
// #endif

    public native @ByRef IInteger AutoFunctionAOIOffsetX(); public native CUsbCameraParams_Params AutoFunctionAOIOffsetX(IInteger AutoFunctionAOIOffsetX);
    
// #if defined (_MSC_VER)	
// #   pragma warning(pop)
// #endif
    
    //@}
    

    /** \name AutoFunctionAOIControl - Selects and configures Auto Function AOIs */
    //@{
    /**
        \brief This feature has been \b deprecated. Sets the starting line of the auto function area of interest in pixels.
        <p>
        The Offset Y parameter determines the position of the auto function area of interest in the y direction.
    
        \b Visibility = Invisible
    
        \b Selected by : AutoFunctionAOISelector
    
    */
    
// #if defined (_MSC_VER)
// #   pragma warning(push)
// #   pragma warning(disable: 4996) // name has been marked as deprecated
// #endif

    public native @ByRef IInteger AutoFunctionAOIOffsetY(); public native CUsbCameraParams_Params AutoFunctionAOIOffsetY(IInteger AutoFunctionAOIOffsetY);
    
// #if defined (_MSC_VER)	
// #   pragma warning(pop)
// #endif
    
    //@}
    

    /** \name AutoFunctionAOIControl - Selects and configures Auto Function AOIs */
    //@{
    /**
        \brief This feature has been \b deprecated. Selects brightness to be adjusted by an auto function.
        <p>
        For the selected Auto Function AOI, brightness will be adjusted by an auto function. Depending on the Auto Function Profile setting, the adjustment will be done either by the Gain Auto or by the Exposure Auto auto function. 
    
        \b Visibility = Invisible
    
        \b Selected by : AutoFunctionAOISelector
    
    */
    
// #if defined (_MSC_VER)
// #   pragma warning(push)
// #   pragma warning(disable: 4996) // name has been marked as deprecated
// #endif

    public native @ByRef IBoolean AutoFunctionAOIUseBrightness(); public native CUsbCameraParams_Params AutoFunctionAOIUseBrightness(IBoolean AutoFunctionAOIUseBrightness);
    
// #if defined (_MSC_VER)	
// #   pragma warning(pop)
// #endif
    
    //@}
    

    /** \name AutoFunctionAOIControl - Selects and configures Auto Function AOIs */
    //@{
    /**
        \brief This feature has been \b deprecated. Selects white balance to be adjusted by the related auto function.
        <p>
        For the selected Auto Function AOI, white balance will be adjusted by the Balance White Auto auto function.
    
        \b Visibility = Invisible
    
        \b Selected by : AutoFunctionAOISelector
    
    */
    
// #if defined (_MSC_VER)
// #   pragma warning(push)
// #   pragma warning(disable: 4996) // name has been marked as deprecated
// #endif

    public native @ByRef IBoolean AutoFunctionAOIUseWhiteBalance(); public native CUsbCameraParams_Params AutoFunctionAOIUseWhiteBalance(IBoolean AutoFunctionAOIUseWhiteBalance);
    
// #if defined (_MSC_VER)	
// #   pragma warning(pop)
// #endif
    
    //@}
    

    /** \name LUTControl - This category includes items used to control the operation of the camera's lookup table (LUT). Applies to: ace */
    //@{
    /**
        \brief Selects the lookup table (LUT) to configure. Once a LUT has been selected, all changes to the LUT settings will be applied to the selected LUT. Applies to: ace
        <p>
        This enumeration the lookup table (LUT) to configure. Once a LUT has been selected, all changes to the LUT settings will be applied to the selected LUT.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_LUTSelectorEnums LUTSelector(); public native CUsbCameraParams_Params LUTSelector(IEnumerationT_LUTSelectorEnums LUTSelector);
    
    //@}
    

    /** \name LUTControl - This category includes items used to control the operation of the camera's lookup table (LUT). Applies to: ace */
    //@{
    /**
        \brief Enables the selected LUT. Applies to: ace
        <p>
        This boolean value enables the selected LUT.
    
        \b Visibility = Expert
    
        \b Selected by : LUTSelector
    
    */
    public native @ByRef IBoolean LUTEnable(); public native CUsbCameraParams_Params LUTEnable(IBoolean LUTEnable);
    
    //@}
    

    /** \name LUTControl - This category includes items used to control the operation of the camera's lookup table (LUT). Applies to: ace */
    //@{
    /**
        \brief Sets the LUT element to access. Applies to: ace
        <p>
        This value sets the LUT element to access. This value is used to index into a LUT array.
    
        \b Visibility = Guru
    
        \b Selected by : LUTSelector
    
    */
    public native @ByRef IInteger LUTIndex(); public native CUsbCameraParams_Params LUTIndex(IInteger LUTIndex);
    
    //@}
    

    /** \name LUTControl - This category includes items used to control the operation of the camera's lookup table (LUT). Applies to: ace */
    //@{
    /**
        \brief Sets the value of the LUT element at the LUT index. Applies to: ace
        <p>
        This value sets the value of the LUT element at the LUT index.
    
        \b Visibility = Guru
    
        \b Selected by : LUTSelector, LUTIndex
    
    */
    public native @ByRef IInteger LUTValue(); public native CUsbCameraParams_Params LUTValue(IInteger LUTValue);
    
    //@}
    

    /** \name LUTControl - This category includes items used to control the operation of the camera's lookup table (LUT). Applies to: ace */
    //@{
    /**
        \brief Accesses the entire content of the selected LUT in one chunk access. Applies to: ace
        <p>
        Accesses the entire content of the selected LUT in one chunk access
    
        \b Visibility = Guru
    
        \b Selected by : LUTSelector
    
    */
    public native @ByRef IRegister LUTValueAll(); public native CUsbCameraParams_Params LUTValueAll(IRegister LUTValueAll);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief Selects the I/O line to configure. Applies to: ace, dart
        <p>
        This enumeration selects the I/O line to configure. Once a line has been selected, all changes to the line settings will be applied to the selected line.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_LineSelectorEnums LineSelector(); public native CUsbCameraParams_Params LineSelector(IEnumerationT_LineSelectorEnums LineSelector);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief Sets the mode for the selected line. Applies to: ace, dart
        <p>
        This feature controls whether the physical line is used to input or output a signal. When a line supports input and output mode, the default state is 'input' to avoid possible electrical contention. The Line Mode parameter can take any of the following values: Input: The selected physical line is used to input an electrical signal. Output: The selected physical line is used to output an electrical signal.
    
        \b Visibility = Beginner
        
    
        \b Selected by : LineSelector
    
    */
    public native @ByRef IEnumerationT_LineModeEnums LineMode(); public native CUsbCameraParams_Params LineMode(IEnumerationT_LineModeEnums LineMode);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief Reports the electrical configuration of the selected line. Applies to: ace, dart
        <p>
        This feature reports the current electrical format of the selected physical input or output line. The Line Format parameter can take any of the following values: No Connect: The line is not connected. Tri-state: The line is currently in tri-state mode (not driven). TTL: The line is currently accepting or sending TTL level signals. LVDS: The line is currently accepting or sending LVDS level signals. RS-422: The line is currently accepting or sending RS-422 level signals. Opto-coupled: The line is opto-coupled.
    
        \b Visibility = Beginner
        
    
        \b Selected by : LineSelector
    
    */
    public native @ByRef IEnumerationT_LineFormatEnums LineFormat(); public native CUsbCameraParams_Params LineFormat(IEnumerationT_LineFormatEnums LineFormat);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief Reports the line logic of the selected line. Applies to: ace
        <p>
        Reports the line logic of the selected line. The line logic can be positive or negative.
    
        \b Visibility = Beginner
        
    
        \b Selected by : LineSelector
    
    */
    public native @ByRef IEnumerationT_LineLogicEnums LineLogic(); public native CUsbCameraParams_Params LineLogic(IEnumerationT_LineLogicEnums LineLogic);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief Sets the source signal for the selected line (if the selected line is an output). Applies to: ace, dart
        <p>
        This enumeration selects the internally generated camera signal (source signal) for the selected line when the selected line is an output. 
    
        \b Visibility = Beginner
        
    
        \b Selected by : LineSelector
    
    */
    public native @ByRef IEnumerationT_LineSourceEnums LineSource(); public native CUsbCameraParams_Params LineSource(IEnumerationT_LineSourceEnums LineSource);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief Enables the signal inverter function for the selected input or output line. Applies to: ace, dart
        <p>
        This boolean value enables the signal inverter function for the selected input or output line.
    
        \b Visibility = Beginner
        
    
        \b Selected by : LineSelector
    
    */
    public native @ByRef IBoolean LineInverter(); public native CUsbCameraParams_Params LineInverter(IBoolean LineInverter);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief Sets the absolute value of the selected line debouncer time in microseconds. Applies to: ace, dart
        <p>
        This float value sets the absolute value of the selected line debouncer time in microseconds.
    
        \b Visibility = Beginner
        
    
        \b Selected by : LineSelector
    
    */
    public native @ByRef IFloat LineDebouncerTime(); public native CUsbCameraParams_Params LineDebouncerTime(IFloat LineDebouncerTime);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief Sets the absolute value (in microseconds) for the minimum signal width of an output signal. Applies to: ace
        <p>
        This float value sets the absolute value (in microseconds) for the minimum signal width of a signal that is received from the frequency converter or from the shaft encoder module and that is associated with a digital output line.
    
        \b Visibility = Beginner
        
    
        \b Selected by : LineSelector
    
    */
    public native @ByRef IFloat LineMinimumOutputPulseWidth(); public native CUsbCameraParams_Params LineMinimumOutputPulseWidth(IFloat LineMinimumOutputPulseWidth);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief Indicates that an overload condition was detected on the selected line. Applies to: ace
        <p>
        This boolean value indicates that an overload condition was detected on the selected line.
    
        \b Visibility = Beginner
        
    
        \b Selected by : LineSelector
    
    */
    public native @ByRef IBoolean LineOverloadStatus(); public native CUsbCameraParams_Params LineOverloadStatus(IBoolean LineOverloadStatus);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief Resets the overload status of the selected line. Applies to: ace
        <p>
        This command resets the overload status of the selected line. Should the overload condition still persist then the overload status will be set again immediately.
    
        \b Visibility = Beginner
        
    
        \b Selected by : LineSelector
    
    */
    public native @ByRef ICommand LineOverloadReset(); public native CUsbCameraParams_Params LineOverloadReset(ICommand LineOverloadReset);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief Indicates the current logical state for the selected line. Applies to: ace, dart
        <p>
        This boolean value indicates the current logical state for the selected line at the time of polling.
    
        \b Visibility = Beginner
        
    
        \b Selected by : LineSelector
    
    */
    public native @ByRef IBoolean LineStatus(); public native CUsbCameraParams_Params LineStatus(IBoolean LineStatus);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief A single bitfield indicating the current logical state of all available line signals at time of polling. Applies to: ace, dart
        <p>
        This integer value is a single bitfield that indicates the current logical state of all available lines at time of polling.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger LineStatusAll(); public native CUsbCameraParams_Params LineStatusAll(IInteger LineStatusAll);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief Selects the user settable output signal to configure. Applies to: ace, dart
        <p>
        This enumeration selects the user settable output signal to configure. Once a user settable output signal has been selected, all changes to the user settable output signal settings will be applied to the selected user settable output signal.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_UserOutputSelectorEnums UserOutputSelector(); public native CUsbCameraParams_Params UserOutputSelector(IEnumerationT_UserOutputSelectorEnums UserOutputSelector);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief Sets the state of the selected user settable output signal. Applies to: ace, dart
        <p>
        This boolean value sets the state of the selected user settable output signal.
    
        \b Visibility = Beginner
        
    
        \b Selected by : UserOutputSelector
    
    */
    public native @ByRef IBoolean UserOutputValue(); public native CUsbCameraParams_Params UserOutputValue(IBoolean UserOutputValue);
    
    //@}
    

    /** \name DigitalIOControl - This category includes items used to control the operation of the camera's digital I/O lines. Applies to: ace, dart */
    //@{
    /**
        \brief A single bitfield that sets the state of all user settable output signals in one access. Applies to: ace
        <p>
        This integer value is a single bitfield that sets the state of all user settable output signals in one access.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger UserOutputValueAll(); public native CUsbCameraParams_Params UserOutputValueAll(IInteger UserOutputValueAll);
    
    //@}
    

    /** \name SoftwareSignalControl -  */
    //@{
    /**
        \brief Selects the software signal to control. Applies to: ace
        <p>
        Selects the software signal to control.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IEnumerationT_SoftwareSignalSelectorEnums SoftwareSignalSelector(); public native CUsbCameraParams_Params SoftwareSignalSelector(IEnumerationT_SoftwareSignalSelectorEnums SoftwareSignalSelector);
    
    //@}
    

    /** \name SoftwareSignalControl -  */
    //@{
    /**
        \brief Generates a signal that can be used as a software trigger. Applies to: ace
        <p>
        Generates a signal that can be used as a software trigger.
    
        \b Visibility = Beginner
    
        \b Selected by : SoftwareSignalSelector
    
    */
    public native @ByRef ICommand SoftwareSignalPulse(); public native CUsbCameraParams_Params SoftwareSignalPulse(ICommand SoftwareSignalPulse);
    
    //@}
    

    /** \name CounterAndTimerControl - This category contains the Counter and Timer control features. Applies to: ace */
    //@{
    /**
        \brief Selects which Timer to configure. Applies to: ace
        <p>
        Selects which Timer to configure.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_TimerSelectorEnums TimerSelector(); public native CUsbCameraParams_Params TimerSelector(IEnumerationT_TimerSelectorEnums TimerSelector);
    
    //@}
    

    /** \name CounterAndTimerControl - This category contains the Counter and Timer control features. Applies to: ace */
    //@{
    /**
        \brief Sets the duration (in microseconds) of the Timer pulse. Applies to: ace
        <p>
        Sets the duration (in microseconds) of the Timer pulse.
    
        \b Visibility = Beginner
        
    
        \b Selected by : TimerSelector
    
    */
    public native @ByRef IFloat TimerDuration(); public native CUsbCameraParams_Params TimerDuration(IFloat TimerDuration);
    
    //@}
    

    /** \name CounterAndTimerControl - This category contains the Counter and Timer control features. Applies to: ace */
    //@{
    /**
        \brief Sets the delay (in microseconds) of the Timer pulse. Applies to: ace
        <p>
        Sets the delay (in microseconds) of the Timer pulse.
    
        \b Visibility = Beginner
        
    
        \b Selected by : TimerSelector
    
    */
    public native @ByRef IFloat TimerDelay(); public native CUsbCameraParams_Params TimerDelay(IFloat TimerDelay);
    
    //@}
    

    /** \name CounterAndTimerControl - This category contains the Counter and Timer control features. Applies to: ace */
    //@{
    /**
        \brief Selects the source of the trigger to start the Timer. Applies to: ace
        <p>
        Selects the source of the trigger to start the Timer.
    
        \b Visibility = Beginner
        
    
        \b Selected by : TimerSelector
    
    */
    public native @ByRef IEnumerationT_TimerTriggerSourceEnums TimerTriggerSource(); public native CUsbCameraParams_Params TimerTriggerSource(IEnumerationT_TimerTriggerSourceEnums TimerTriggerSource);
    
    //@}
    

    /** \name CounterAndTimerControl - This category contains the Counter and Timer control features. Applies to: ace */
    //@{
    /**
        \brief Selects which Counter to configure. Applies to: ace
        <p>
        Selects which Counter to configure.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_CounterSelectorEnums CounterSelector(); public native CUsbCameraParams_Params CounterSelector(IEnumerationT_CounterSelectorEnums CounterSelector);
    
    //@}
    

    /** \name CounterAndTimerControl - This category contains the Counter and Timer control features. Applies to: ace */
    //@{
    /**
        \brief Select the events that will be the source to increment the Counter. Applies to: ace
        <p>
        Select the events that will be the source to increment the Counter.
    
        \b Visibility = Beginner
        
    
        \b Selected by : CounterSelector
    
    */
    public native @ByRef IEnumerationT_CounterEventSourceEnums CounterEventSource(); public native CUsbCameraParams_Params CounterEventSource(IEnumerationT_CounterEventSourceEnums CounterEventSource);
    
    //@}
    

    /** \name CounterAndTimerControl - This category contains the Counter and Timer control features. Applies to: ace */
    //@{
    /**
        \brief Selects the signals that will be the source to reset the Counter. Applies to: ace
        <p>
        Selects the signals that will be the source to reset the Counter.
    
        \b Visibility = Beginner
        
    
        \b Selected by : CounterSelector
    
    */
    public native @ByRef IEnumerationT_CounterResetSourceEnums CounterResetSource(); public native CUsbCameraParams_Params CounterResetSource(IEnumerationT_CounterResetSourceEnums CounterResetSource);
    
    //@}
    

    /** \name CounterAndTimerControl - This category contains the Counter and Timer control features. Applies to: ace */
    //@{
    /**
        \brief Selects the Activation mode of the Counter Reset Source signal. Applies to: ace
        <p>
        Selects the Activation mode of the Counter Reset Source signal.
    
        \b Visibility = Beginner
        
    
        \b Selected by : CounterSelector
    
    */
    public native @ByRef IEnumerationT_CounterResetActivationEnums CounterResetActivation(); public native CUsbCameraParams_Params CounterResetActivation(IEnumerationT_CounterResetActivationEnums CounterResetActivation);
    
    //@}
    

    /** \name CounterAndTimerControl - This category contains the Counter and Timer control features. Applies to: ace */
    //@{
    /**
        \brief Does a software reset of the selected counter. Applies to: ace
        <p>
        Does a software reset of the selected counter.
    
        \b Visibility = Beginner
        
    
        \b Selected by : CounterSelector
    
    */
    public native @ByRef ICommand CounterReset(); public native CUsbCameraParams_Params CounterReset(ICommand CounterReset);
    
    //@}
    

    /** \name CounterAndTimerControl - This category contains the Counter and Timer control features. Applies to: ace */
    //@{
    /**
        \brief Sets the duration (or number of events) before the CounterEnd event is generated. Applies to: ace
        <p>
        Sets the duration (or number of events) before the CounterEnd event is generated.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger CounterDuration(); public native CUsbCameraParams_Params CounterDuration(IInteger CounterDuration);
    
    //@}
    

    /** \name UserSetControl - This category includes items that control the user sets feature that is used to save sets of parameters in the camera. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Selects the user set to load, save, or configure. Applies to: ace, dart, pulse
        <p>
        This enumeration selects the user set to load, save, or configure. Once a user set has been selected, all changes to the user set settings will be applied to the selected user set.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_UserSetSelectorEnums UserSetSelector(); public native CUsbCameraParams_Params UserSetSelector(IEnumerationT_UserSetSelectorEnums UserSetSelector);
    
    //@}
    

    /** \name UserSetControl - This category includes items that control the user sets feature that is used to save sets of parameters in the camera. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Loads the selected configuration into the camera's volatile memory and makes it the active user set. Applies to: ace, dart, pulse
        <p>
        This command loads the selected user set from the non-volatile memory in the camera to the volatile memory and makes the selected set the active user set. Once the selected set is loaded, the parameters in the selected set will control the camera.
    
        \b Visibility = Beginner
        
    
        \b Selected by : UserSetSelector
    
    */
    public native @ByRef ICommand UserSetLoad(); public native CUsbCameraParams_Params UserSetLoad(ICommand UserSetLoad);
    
    //@}
    

    /** \name UserSetControl - This category includes items that control the user sets feature that is used to save sets of parameters in the camera. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Saves the current active user set into the selected user set. Applies to: ace, dart, pulse
        <p>
        This command copies the parameters in the current active user set into the selected user set in the camera's non-volatile memory.
    
        \b Visibility = Beginner
        
    
        \b Selected by : UserSetSelector
    
    */
    public native @ByRef ICommand UserSetSave(); public native CUsbCameraParams_Params UserSetSave(ICommand UserSetSave);
    
    //@}
    

    /** \name UserSetControl - This category includes items that control the user sets feature that is used to save sets of parameters in the camera. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the user set to be used as the default startup set. Applies to: ace, dart, pulse
        <p>
        This enumeration sets the user set to be used as the default startup set. The user set that has been selected as the default startup set will be loaded as the active set whenever the camera is powered on or reset.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_UserSetDefaultEnums UserSetDefault(); public native CUsbCameraParams_Params UserSetDefault(IEnumerationT_UserSetDefaultEnums UserSetDefault);
    
    //@}
    

    /** \name ChunkDataControl - This category includes items that control the chunk features available on the camera. Applies to: ace */
    //@{
    /**
        \brief Enables the chunk mode. Applies to: ace
        <p>
        This boolean value enables the camera's chunk mode.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IBoolean ChunkModeActive(); public native CUsbCameraParams_Params ChunkModeActive(IBoolean ChunkModeActive);
    
    //@}
    

    /** \name ChunkDataControl - This category includes items that control the chunk features available on the camera. Applies to: ace */
    //@{
    /**
        \brief Selects chunks for enabling. Applies to: ace
        <p>
        This enumeration selects chunks for enabling.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_ChunkSelectorEnums ChunkSelector(); public native CUsbCameraParams_Params ChunkSelector(IEnumerationT_ChunkSelectorEnums ChunkSelector);
    
    //@}
    

    /** \name ChunkDataControl - This category includes items that control the chunk features available on the camera. Applies to: ace */
    //@{
    /**
        \brief Enables the inclusion of the selected chunk in the payload data. Applies to: ace
        <p>
        This boolean value enables the inclusion of the selected chunk in the payload data.
    
        \b Visibility = Beginner
        
    
        \b Selected by : ChunkSelector
    
    */
    public native @ByRef IBoolean ChunkEnable(); public native CUsbCameraParams_Params ChunkEnable(IBoolean ChunkEnable);
    
    //@}
    

    /** \name ChunkDataControl - This category includes items that control the chunk features available on the camera. Applies to: ace */
    //@{
    /**
        \brief Selects which Gain to retrieve data from. Applies to: ace
        <p>
        Selects which Gain to retrieve data from.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_ChunkGainSelectorEnums ChunkGainSelector(); public native CUsbCameraParams_Params ChunkGainSelector(IEnumerationT_ChunkGainSelectorEnums ChunkGainSelector);
    
    //@}
    

    /** \name ChunkDataControl - This category includes items that control the chunk features available on the camera. Applies to: ace */
    //@{
    /**
        \brief Returns the gain used to capture the image. Applies to: ace
        <p>
        Returns the gain used to capture the image.
    
        \b Visibility = Beginner
        
    
        \b Selected by : ChunkGainSelector
    
    */
    public native @ByRef IFloat ChunkGain(); public native CUsbCameraParams_Params ChunkGain(IFloat ChunkGain);
    
    //@}
    

    /** \name ChunkDataControl - This category includes items that control the chunk features available on the camera. Applies to: ace */
    //@{
    /**
        \brief Returns the exposure time used to capture the image. Applies to: ace
        <p>
        Returns the exposure time used to capture the image.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat ChunkExposureTime(); public native CUsbCameraParams_Params ChunkExposureTime(IFloat ChunkExposureTime);
    
    //@}
    

    /** \name ChunkDataControl - This category includes items that control the chunk features available on the camera. Applies to: ace */
    //@{
    /**
        \brief Indicates the value of the timestamp when the image was acquired. Applies to: ace
        <p>
        This integer indicates the value of the timestamp when the image was acquired.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger ChunkTimestamp(); public native CUsbCameraParams_Params ChunkTimestamp(IInteger ChunkTimestamp);
    
    //@}
    

    /** \name ChunkDataControl - This category includes items that control the chunk features available on the camera. Applies to: ace */
    //@{
    /**
        \brief A bit field that indicates the status of all of the camera's input and output lines when the image was acquired. Applies to: ace
        <p>
        This value is a bit field that indicates the status of all of the camera's input and output lines when the image was acquired.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger ChunkLineStatusAll(); public native CUsbCameraParams_Params ChunkLineStatusAll(IInteger ChunkLineStatusAll);
    
    //@}
    

    /** \name ChunkDataControl - This category includes items that control the chunk features available on the camera. Applies to: ace */
    //@{
    /**
        \brief Selects which counter to retrieve data from. Applies to: ace
        <p>
        Selects which counter to retrieve data from.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_ChunkCounterSelectorEnums ChunkCounterSelector(); public native CUsbCameraParams_Params ChunkCounterSelector(IEnumerationT_ChunkCounterSelectorEnums ChunkCounterSelector);
    
    //@}
    

    /** \name ChunkDataControl - This category includes items that control the chunk features available on the camera. Applies to: ace */
    //@{
    /**
        \brief Indicates the value of the selected Chunk counter. Applies to: ace
        <p>
        Indicates the value of the selected Chunk counter.
    
        \b Visibility = Beginner
        
    
        \b Selected by : ChunkCounterSelector
    
    */
    public native @ByRef IInteger ChunkCounterValue(); public native CUsbCameraParams_Params ChunkCounterValue(IInteger ChunkCounterValue);
    
    //@}
    

    /** \name ChunkDataControl - This category includes items that control the chunk features available on the camera. Applies to: ace */
    //@{
    /**
        \brief Return the index of the active set of the running sequencer included in the payload. Applies to: ace
        <p>
        Return the index of the active set of the running sequencer included in the payload
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger ChunkSequencerSetActive(); public native CUsbCameraParams_Params ChunkSequencerSetActive(IInteger ChunkSequencerSetActive);
    
    //@}
    

    /** \name ChunkDataControl - This category includes items that control the chunk features available on the camera. Applies to: ace */
    //@{
    /**
        \brief Indicates the value of CRC checksum. Applies to: ace
        <p>
        This integer indicates the value of CRC checksum.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger ChunkPayloadCRC16(); public native CUsbCameraParams_Params ChunkPayloadCRC16(IInteger ChunkPayloadCRC16);
    
    //@}
    

    /** \name EventControl - This category contains Event control features. Applies to: ace */
    //@{
    /**
        \brief Selects which Event to signal to the host application. Applies to: ace
        <p>
        Selects which Event to signal to the host application.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_EventSelectorEnums EventSelector(); public native CUsbCameraParams_Params EventSelector(IEnumerationT_EventSelectorEnums EventSelector);
    
    //@}
    

    /** \name EventControl - This category contains Event control features. Applies to: ace */
    //@{
    /**
        \brief Activate or deactivate the notification to the host application of the occurrence of the selected
Event. Applies to: ace
        <p>
        Activate or deactivate the notification to the host application of the occurrence of the selected
Event.
    
        \b Visibility = Expert
    
        \b Selected by : EventSelector
    
    */
    public native @ByRef IEnumerationT_EventNotificationEnums EventNotification(); public native CUsbCameraParams_Params EventNotification(IEnumerationT_EventNotificationEnums EventNotification);
    
    //@}
    

    /** \name EventControl - This category contains Event control features. Applies to: ace */
    //@{
    /**
        \brief Triggers a test event for EventTest.
        <p>
        Triggers a test event for EventTest. Event notification must be set to 'On'.
    
        \b Visibility = Invisible
    
    */
    public native @ByRef ICommand TriggerEventTest(); public native CUsbCameraParams_Params TriggerEventTest(ICommand TriggerEventTest);
    
    //@}
    

    /** \name EventExposureEndData - This category includes items available for an exposure end event. Applies to: ace */
    //@{
    /**
        \brief Returns the unique identifier of the ExposureEnd type of Event. Applies to: ace
        <p>
        Returns the unique identifier of the ExposureEnd type of Event. This feature can be used to register a callback function to be notified of the event occurrence. Its value uniquely identifies the type of event that will be received.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventExposureEnd(); public native CUsbCameraParams_Params EventExposureEnd(IInteger EventExposureEnd);
    
    //@}
    

    /** \name EventExposureEndData - This category includes items available for an exposure end event. Applies to: ace */
    //@{
    /**
        \brief Indicates the time stamp for an exposure end event. Applies to: ace
        <p>
        This enumeration value indicates the time stamp for an exposure end event.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventExposureEndTimestamp(); public native CUsbCameraParams_Params EventExposureEndTimestamp(IInteger EventExposureEndTimestamp);
    
    //@}
    

    /** \name EventExposureEndData - This category includes items available for an exposure end event. Applies to: ace */
    //@{
    /**
        \brief Indicates the frame ID for an exposure end event. Applies to: ace
        <p>
        This enumeration value indicates the frame ID for an exposure end event.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventExposureEndFrameID(); public native CUsbCameraParams_Params EventExposureEndFrameID(IInteger EventExposureEndFrameID);
    
    //@}
    

    /** \name EventFrameStartData - This category includes items available for a frame start event. Applies to: ace */
    //@{
    /**
        \brief Returns the unique identifier of the FrameStart type of Event. Applies to: ace
        <p>
        Returns the unique identifier of the FrameStart type of Event. This feature can be used to register a callback function to be notified of the event occurrence. Its value uniquely identifies the type of event that will be received.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventFrameStart(); public native CUsbCameraParams_Params EventFrameStart(IInteger EventFrameStart);
    
    //@}
    

    /** \name EventFrameStartData - This category includes items available for a frame start event. Applies to: ace */
    //@{
    /**
        \brief Indicates the time stamp for a frame start event. Applies to: ace
        <p>
        This enumeration value indicates the time stamp for a frame start event.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventFrameStartTimestamp(); public native CUsbCameraParams_Params EventFrameStartTimestamp(IInteger EventFrameStartTimestamp);
    
    //@}
    

    /** \name EventFrameStartData - This category includes items available for a frame start event. Applies to: ace */
    //@{
    /**
        \brief Indicates the frame ID for a frame start event. Applies to: ace
        <p>
        This enumeration value indicates the frame ID for a frame start event.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventFrameStartFrameID(); public native CUsbCameraParams_Params EventFrameStartFrameID(IInteger EventFrameStartFrameID);
    
    //@}
    

    /** \name EventFrameBurstStartData - This category includes items available for a frame burst start event. Applies to: ace */
    //@{
    /**
        \brief Returns the unique identifier of the FrameBurstStart type of Event. Applies to: ace
        <p>
        Returns the unique identifier of the FrameBurstStart type of Event. This feature can be used to register a callback function to be notified of the event occurrence. Its value uniquely identifies the type of event that will be received.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventFrameBurstStart(); public native CUsbCameraParams_Params EventFrameBurstStart(IInteger EventFrameBurstStart);
    
    //@}
    

    /** \name EventFrameBurstStartData - This category includes items available for a frame burst start event. Applies to: ace */
    //@{
    /**
        \brief Indicates the time stamp for a frame burst start event. Applies to: ace
        <p>
        This enumeration value indicates the time stamp for a frame burst start event.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventFrameBurstStartTimestamp(); public native CUsbCameraParams_Params EventFrameBurstStartTimestamp(IInteger EventFrameBurstStartTimestamp);
    
    //@}
    

    /** \name EventFrameBurstStartData - This category includes items available for a frame burst start event. Applies to: ace */
    //@{
    /**
        \brief Indicates the frame ID for a frame burst start event. Applies to: ace
        <p>
        This enumeration value indicates the frame ID for a frame burst start event.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventFrameBurstStartFrameID(); public native CUsbCameraParams_Params EventFrameBurstStartFrameID(IInteger EventFrameBurstStartFrameID);
    
    //@}
    

    /** \name EventFrameStartOvertriggerData - This category includes items available for a frame start overtrigger event. Applies to: ace */
    //@{
    /**
        \brief Returns the unique identifier of the FrameOvertriggerStart type of Event. Applies to: ace
        <p>
        Returns the unique identifier of the FrameStartOvertrigger type of Event. This feature can be used to register a callback function to be notified of the event occurrence. Its value uniquely identifies the type of event that will be received.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventFrameStartOvertrigger(); public native CUsbCameraParams_Params EventFrameStartOvertrigger(IInteger EventFrameStartOvertrigger);
    
    //@}
    

    /** \name EventFrameStartOvertriggerData - This category includes items available for a frame start overtrigger event. Applies to: ace */
    //@{
    /**
        \brief Indicates the time stamp for a frame start overtrigger event. Applies to: ace
        <p>
        This enumeration value indicates the time stamp for a frame start overtrigger event.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventFrameStartOvertriggerTimestamp(); public native CUsbCameraParams_Params EventFrameStartOvertriggerTimestamp(IInteger EventFrameStartOvertriggerTimestamp);
    
    //@}
    

    /** \name EventFrameStartOvertriggerData - This category includes items available for a frame start overtrigger event. Applies to: ace */
    //@{
    /**
        \brief Indicates the frame ID for a frame start overtrigger event. Applies to: ace
        <p>
        This enumeration value indicates the frame ID for a frame start overtrigger event.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventFrameStartOvertriggerFrameID(); public native CUsbCameraParams_Params EventFrameStartOvertriggerFrameID(IInteger EventFrameStartOvertriggerFrameID);
    
    //@}
    

    /** \name EventFrameBurstStartOvertriggerData - This category includes items available for a frame burst start overtrigger event. Applies to: ace */
    //@{
    /**
        \brief Returns the unique identifier of the FrameBurstOvertriggerStart type of Event. Applies to: ace
        <p>
        Returns the unique identifier of the FrameBurstStartOvertrigger type of Event. This feature can be used to register a callback function to be notified of the event occurrence. Its value uniquely identifies the type of event that will be received.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventFrameBurstStartOvertrigger(); public native CUsbCameraParams_Params EventFrameBurstStartOvertrigger(IInteger EventFrameBurstStartOvertrigger);
    
    //@}
    

    /** \name EventFrameBurstStartOvertriggerData - This category includes items available for a frame burst start overtrigger event. Applies to: ace */
    //@{
    /**
        \brief Indicates the time stamp for a frame burst start overtrigger event. Applies to: ace
        <p>
        This enumeration value indicates the time stamp for a frame burst start overtrigger event.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventFrameBurstStartOvertriggerTimestamp(); public native CUsbCameraParams_Params EventFrameBurstStartOvertriggerTimestamp(IInteger EventFrameBurstStartOvertriggerTimestamp);
    
    //@}
    

    /** \name EventFrameBurstStartOvertriggerData - This category includes items available for a frame burst start overtrigger event. Applies to: ace */
    //@{
    /**
        \brief Indicates the frame ID for a frame burst start overtrigger event. Applies to: ace
        <p>
        This enumeration value indicates the frame ID for a frame burst start overtrigger event.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger EventFrameBurstStartOvertriggerFrameID(); public native CUsbCameraParams_Params EventFrameBurstStartOvertriggerFrameID(IInteger EventFrameBurstStartOvertriggerFrameID);
    
    //@}
    

    /** \name EventTestData - This category includes items available for a test event */
    //@{
    /**
        \brief Returns the unique event ID.
        <p>
        Returns the unique event ID for the EventTest test event.
    
        \b Visibility = Invisible
    
    */
    public native @ByRef IInteger EventTest(); public native CUsbCameraParams_Params EventTest(IInteger EventTest);
    
    //@}
    

    /** \name EventTestData - This category includes items available for a test event */
    //@{
    /**
        \brief Timestamp of EventTest event.
        <p>
        Provides the Timestamp of an EventTest test event.
    
        \b Visibility = Invisible
    
    */
    public native @ByRef IInteger EventTestTimestamp(); public native CUsbCameraParams_Params EventTestTimestamp(IInteger EventTestTimestamp);
    
    //@}
    

    /** \name EventCriticalTemperatureData - This category includes items available for a critical temperature event. Applies to: ace */
    //@{
    /**
        \brief Returns the unique event ID. Applies to: ace
        <p>
        Returns the unique event ID for the critical temperature event.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger EventCriticalTemperature(); public native CUsbCameraParams_Params EventCriticalTemperature(IInteger EventCriticalTemperature);
    
    //@}
    

    /** \name EventCriticalTemperatureData - This category includes items available for a critical temperature event. Applies to: ace */
    //@{
    /**
        \brief Indicates the time stamp for a critical temperature event. Applies to: ace
        <p>
        This enumeration value indicates the time stamp for a critical temperature event.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger EventCriticalTemperatureTimestamp(); public native CUsbCameraParams_Params EventCriticalTemperatureTimestamp(IInteger EventCriticalTemperatureTimestamp);
    
    //@}
    

    /** \name EventOverTemperatureData - This category includes items available for an over temperature event. Applies to: ace */
    //@{
    /**
        \brief Returns the unique identifier of the OverTemperature type of Event. Applies to: ace
        <p>
        Returns the unique identifier of the OverTemperature type of Event. This feature can be used to register a callback function to be notified of the event occurrence. Its value uniquely identifies the type of event that will be received.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger EventOverTemperature(); public native CUsbCameraParams_Params EventOverTemperature(IInteger EventOverTemperature);
    
    //@}
    

    /** \name EventOverTemperatureData - This category includes items available for an over temperature event. Applies to: ace */
    //@{
    /**
        \brief Indicates the time stamp for an over temperature event. Applies to: ace
        <p>
        This enumeration value indicates the time stamp for an over temperature event.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger EventOverTemperatureTimestamp(); public native CUsbCameraParams_Params EventOverTemperatureTimestamp(IInteger EventOverTemperatureTimestamp);
    
    //@}
    

    /** \name TransportLayerControl - This category includes items related to the USB3 Vision transport layer. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Size of the payload in bytes. Applies to: ace, dart, pulse
        <p>
        Size of the payload in bytes. This is the total number of bytes sent in the payload. 
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IInteger PayloadSize(); public native CUsbCameraParams_Params PayloadSize(IInteger PayloadSize);
    
    //@}
    

    /** \name TransportLayerControl - This category includes items related to the USB3 Vision transport layer. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Informs about the USB speed mode. Applies to: ace, dart, pulse
        <p>
        Informs about the current USB speed mode.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IEnumerationT_BslUSBSpeedModeEnums BslUSBSpeedMode(); public native CUsbCameraParams_Params BslUSBSpeedMode(IEnumerationT_BslUSBSpeedModeEnums BslUSBSpeedMode);
    
    //@}
    

    /** \name TransportLayerControl - This category includes items related to the USB3 Vision transport layer. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Expected Size of a single Payload Transfer. Applies to: ace
        <p>
        Expected Size of a single Payload Transfer.
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger SIPayloadTransferSize(); public native CUsbCameraParams_Params SIPayloadTransferSize(IInteger SIPayloadTransferSize);
    
    //@}
    

    /** \name TransportLayerControl - This category includes items related to the USB3 Vision transport layer. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Expected Number of Payload Transfers. Applies to: ace
        <p>
        Expected Number of Payload Transfers.
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger SIPayloadTransferCount(); public native CUsbCameraParams_Params SIPayloadTransferCount(IInteger SIPayloadTransferCount);
    
    //@}
    

    /** \name TransportLayerControl - This category includes items related to the USB3 Vision transport layer. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Size of first final Payload Transfer. Applies to: ace
        <p>
        Size of first final Payload Transfer.
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger SIPayloadFinalTransfer1Size(); public native CUsbCameraParams_Params SIPayloadFinalTransfer1Size(IInteger SIPayloadFinalTransfer1Size);
    
    //@}
    

    /** \name TransportLayerControl - This category includes items related to the USB3 Vision transport layer. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Size of second final Payload Transfer. Applies to: ace
        <p>
        Size of second final Payload Transfer.
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger SIPayloadFinalTransfer2Size(); public native CUsbCameraParams_Params SIPayloadFinalTransfer2Size(IInteger SIPayloadFinalTransfer2Size);
    
    //@}
    

    /** \name TransportLayerControl - This category includes items related to the USB3 Vision transport layer. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Test PENDING_ACK feature. Applies to: dart, pulse
        <p>
        On write, the device waits a time period of TestPendingAck ms before acknowledging the write.
If this time period is longer than the value in the Maximum Device Response Time register, the device must use PENDING_ACK during the completion of this request.
On reads the device returns the current value without any additional wait time.
    
        \b Visibility = Invisible
    
    */
    public native @ByRef IInteger TestPendingAck(); public native CUsbCameraParams_Params TestPendingAck(IInteger TestPendingAck);
    
    //@}
    

    /** \name TransportLayerControl - This category includes items related to the USB3 Vision transport layer. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief 
        <p>
        This parameter takes effect only when the sequencer mode is set to On. The parameter can only be set when the sequencer configuration mode is set to On.
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger PayloadTransferBlockDelay(); public native CUsbCameraParams_Params PayloadTransferBlockDelay(IInteger PayloadTransferBlockDelay);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Indicates the name of the device's vendor. Applies to: ace
        <p>
        This is a read only element. It is a text description that indicates the name of the device's vendor.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IString DeviceVendorName(); public native CUsbCameraParams_Params DeviceVendorName(IString DeviceVendorName);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Indicates the model name of the device. Applies to: ace
        <p>
        This is a read only element. It is a text description that indicates the model name of the device.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IString DeviceModelName(); public native CUsbCameraParams_Params DeviceModelName(IString DeviceModelName);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Provides additional information from the vendor about the device. Applies to: ace
        <p>
        This is a read only element. It is a string that provides additional information from the vendor about the camera.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IString DeviceManufacturerInfo(); public native CUsbCameraParams_Params DeviceManufacturerInfo(IString DeviceManufacturerInfo);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Indicates the version of the device. Applies to: ace
        <p>
        This is a read only element. It is a string that indicates the version of the device.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IString DeviceVersion(); public native CUsbCameraParams_Params DeviceVersion(IString DeviceVersion);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Indicates the version of the device's firmware and software. Applies to: ace
        <p>
        This is a read only element. It is a string that indicates the version of the device's firmware and software.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IString DeviceFirmwareVersion(); public native CUsbCameraParams_Params DeviceFirmwareVersion(IString DeviceFirmwareVersion);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Indicates the serial number of the device. Applies to: ace
        <p>
        This is a read only element. It is a string that indicates the serial number of the device.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IString DeviceSerialNumber(); public native CUsbCameraParams_Params DeviceSerialNumber(IString DeviceSerialNumber);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Indicates the scan type of the device's sensor. Applies to: ace, dart, pulse
        <p>
        This enumeration lists the possible scan types for the sensor in the device.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IEnumerationT_DeviceScanTypeEnums DeviceScanType(); public native CUsbCameraParams_Params DeviceScanType(IEnumerationT_DeviceScanTypeEnums DeviceScanType);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Latches the current timestamp counter into TimestampLatchValue. Applies to: ace
        <p>
        Latches the current timestamp counter into TimestampLatchValue.
    
        \b Visibility = Expert
    
    */
    public native @ByRef ICommand TimestampLatch(); public native CUsbCameraParams_Params TimestampLatch(ICommand TimestampLatch);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Returns the latched value of the timestamp counter. Applies to: ace
        <p>
        Returns the latched value of the timestamp counter.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger TimestampLatchValue(); public native CUsbCameraParams_Params TimestampLatchValue(IInteger TimestampLatchValue);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief A device ID that is user programmable. Applies to: ace
        <p>
        This is a read/write element. It is a user programmable string.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IString DeviceUserID(); public native CUsbCameraParams_Params DeviceUserID(IString DeviceUserID);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Selects the link of the device to control. Applies to: ace, dart, pulse
        <p>
        The Device Link Selector parameter is of type integer and selects the link of the device to control.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger DeviceLinkSelector(); public native CUsbCameraParams_Params DeviceLinkSelector(IInteger DeviceLinkSelector);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Indicates the speed of transmission negotiated on the selected link. Applies to: ace, dart, pulse
        <p>
        The Device Link Speed parameter is of type integer and indicates the speed of transmission negotiated on the selected link.
    
        \b Visibility = Expert
    
        \b Selected by : DeviceLinkSelector
    
    */
    public native @ByRef IInteger DeviceLinkSpeed(); public native CUsbCameraParams_Params DeviceLinkSpeed(IInteger DeviceLinkSpeed);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Controls if the device link throughput limit is active. Applies to: ace, dart, pulse
        <p>
        Controls if the device link throughput limit is active. When disabled, lower level throughput limit specific features are expected to control the throughput. When enabled, the device link throughput limit controls the overall throughput.
    
        \b Visibility = Beginner
        
    
        \b Selected by : DeviceLinkSelector
    
    */
    public native @ByRef IEnumerationT_DeviceLinkThroughputLimitModeEnums DeviceLinkThroughputLimitMode(); public native CUsbCameraParams_Params DeviceLinkThroughputLimitMode(IEnumerationT_DeviceLinkThroughputLimitModeEnums DeviceLinkThroughputLimitMode);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Limits the average stream interface bandwidth to device link throughput limit bytes per second. Applies to: ace, dart, pulse
        <p>
        The Device Link Throughput Limit parameter is of type integer and sets the limit of the average stream interface bandwidth to device link throughput limit bytes per second.
    
        \b Visibility = Beginner
    
        \b Selected by : DeviceLinkSelector
    
    */
    public native @ByRef IInteger DeviceLinkThroughputLimit(); public native CUsbCameraParams_Params DeviceLinkThroughputLimit(IInteger DeviceLinkThroughputLimit);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Indicates the actual bandwidth the camera will use. Applies to: ace
        <p>
        This value indicates the actual bandwidth (in bytes per second) that the camera will use to transmit image data and chunk data given the current AOI settings, chunk feature settings, and the pixel format setting.
    
        \b Visibility = Expert
    
        \b Selected by : DeviceLinkSelector
    
    */
    public native @ByRef IInteger DeviceLinkCurrentThroughput(); public native CUsbCameraParams_Params DeviceLinkCurrentThroughput(IInteger DeviceLinkCurrentThroughput);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Lists the temperature sources available for readout. Applies to: ace
        <p>
        This enumeration lists the temperature sources available for readout.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_DeviceTemperatureSelectorEnums DeviceTemperatureSelector(); public native CUsbCameraParams_Params DeviceTemperatureSelector(IEnumerationT_DeviceTemperatureSelectorEnums DeviceTemperatureSelector);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Shows the current temperature of the selected target in degrees centigrade. Applies to: ace
        <p>
        This float value shows the current temperature of the selected target in degrees centigrade.
    
        \b Visibility = Expert
    
        \b Selected by : DeviceTemperatureSelector
    
    */
    public native @ByRef IFloat DeviceTemperature(); public native CUsbCameraParams_Params DeviceTemperature(IFloat DeviceTemperature);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Temperature State. Applies to: ace
        <p>
        Temperature State
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_TemperatureStateEnums TemperatureState(); public native CUsbCameraParams_Params TemperatureState(IEnumerationT_TemperatureStateEnums TemperatureState);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Immediately resets and reboots the device. Applies to: ace, dart, pulse
        <p>
        This is a command that immediately resets and reboots the device.
    
        \b Visibility = Guru
    
    */
    public native @ByRef ICommand DeviceReset(); public native CUsbCameraParams_Params DeviceReset(ICommand DeviceReset);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Major version of the underlying SFNC. Applies to: ace, dart, pulse
        <p>
        Indicates the Major version of the Standard Features Naming Convention (SFNC) that was used for the camera's GenICam XML file.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IInteger DeviceSFNCVersionMajor(); public native CUsbCameraParams_Params DeviceSFNCVersionMajor(IInteger DeviceSFNCVersionMajor);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Minor version of the underlying SFNC. Applies to: ace, dart, pulse
        <p>
        Indicates the Minor version of the Standard Features Naming Convention (SFNC) that was used for the camera's GenICam XML file.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IInteger DeviceSFNCVersionMinor(); public native CUsbCameraParams_Params DeviceSFNCVersionMinor(IInteger DeviceSFNCVersionMinor);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief SubMinor version of the underlying SFNC. Applies to: ace, dart, pulse
        <p>
        Indicates the SubMinor version of the Standard Features Naming Convention (SFNC) that was used for the camera's GenICam XML file.
    
        \b Visibility = Beginner
    
    */
    public native @ByRef IInteger DeviceSFNCVersionSubMinor(); public native CUsbCameraParams_Params DeviceSFNCVersionSubMinor(IInteger DeviceSFNCVersionSubMinor);
    
    //@}
    

    /** \name UserDefinedValueControl - Controls for the User Defined Values feature. Applies to: ace */
    //@{
    /**
        \brief Selects a User Defined Value. Applies to: ace
        <p>
        Selects a User Defined Value.
    
        \b Visibility = Guru
    
    */
    public native @ByRef IEnumerationT_UserDefinedValueSelectorEnums UserDefinedValueSelector(); public native CUsbCameraParams_Params UserDefinedValueSelector(IEnumerationT_UserDefinedValueSelectorEnums UserDefinedValueSelector);
    
    //@}
    

    /** \name UserDefinedValueControl - Controls for the User Defined Values feature. Applies to: ace */
    //@{
    /**
        \brief Sets a value for a User Defined Value. Applies to: ace
        <p>
        Sets a parameter value for the currently selected User Defined Value.
    
        \b Visibility = Guru
    
        \b Selected by : UserDefinedValueSelector
    
    */
    public native @ByRef IInteger UserDefinedValue(); public native CUsbCameraParams_Params UserDefinedValue(IInteger UserDefinedValue);
    
    //@}
    

    /** \name RemoveParameterLimitControl - This category includes items that allow removing the limits of camera parameters. Applies to: ace */
    //@{
    /**
        \brief Selects the parameter to configure. Once a parameter has been selected, all changes made using the Remove Limits feature will be applied to the selected parameter. Applies to: ace
        <p>
        This enumeration selects the parameter to configure. Selects the parameter to configure. Once a parameter has been selected, all changes made using the Remove Limits feature will be applied to the selected parameter
    
        \b Visibility = Guru
    
    */
    public native @ByRef IEnumerationT_RemoveParameterLimitSelectorEnums RemoveParameterLimitSelector(); public native CUsbCameraParams_Params RemoveParameterLimitSelector(IEnumerationT_RemoveParameterLimitSelectorEnums RemoveParameterLimitSelector);
    
    //@}
    

    /** \name RemoveParameterLimitControl - This category includes items that allow removing the limits of camera parameters. Applies to: ace */
    //@{
    /**
        \brief Removes the factory-set limits of the selected parameter. Applies to: ace
        <p>
        Removes the factory-set limits of the selected parameter. Having removed the factory-set limits you may set the parameter within extended limits. These are only defined by technical restrictions. Note:  Inferior image quality may result.
    
        \b Visibility = Guru
    
        \b Selected by : RemoveParameterLimitSelector
    
    */
    public native @ByRef IBoolean RemoveParameterLimit(); public native CUsbCameraParams_Params RemoveParameterLimit(IBoolean RemoveParameterLimit);
    
    //@}
    

    /** \name ExpertFeatureAccess -  */
    //@{
    /**
        \brief Selects the feature to configure. Once a feature has been selected, all changes made using the feature enable feature will be applied to the selected feature. Applies to: ace
        <p>
        Selects the feature to configure. Once a feature has been selected, all changes made using the feature enable feature will be applied to the selected feature
    
        \b Visibility = Guru
    
    */
    public native @ByRef IEnumerationT_ExpertFeatureAccessSelectorEnums ExpertFeatureAccessSelector(); public native CUsbCameraParams_Params ExpertFeatureAccessSelector(IEnumerationT_ExpertFeatureAccessSelectorEnums ExpertFeatureAccessSelector);
    
    //@}
    

    /** \name ExpertFeatureAccess -  */
    //@{
    /**
        \brief Sets the key to access the selected feature. Applies to: ace
        <p>
        Sets the key to access the selected feature
    
        \b Visibility = Guru
    
        \b Selected by : ExpertFeatureAccessSelector
    
    */
    public native @ByRef IInteger ExpertFeatureAccessKey(); public native CUsbCameraParams_Params ExpertFeatureAccessKey(IInteger ExpertFeatureAccessKey);
    
    //@}
    

    /** \name ExpertFeatureAccess -  */
    //@{
    /**
        \brief Enable the selected Feature. Applies to: ace
        <p>
        Enable the selected Feature
    
        \b Visibility = Guru
    
        \b Selected by : ExpertFeatureAccessSelector
    
    */
    public native @ByRef IBoolean ExpertFeatureEnable(); public native CUsbCameraParams_Params ExpertFeatureEnable(IBoolean ExpertFeatureEnable);
    
    //@}
    

    /** \name FileAccessControl - This category includes items used to conduct file operations. Applies to: ace */
    //@{
    /**
        \brief This feature selects the target file in the device. Applies to: ace
        <p>
        The File Selector feature selects the target file in the device.
    
        \b Visibility = Guru
    
    */
    public native @ByRef IEnumerationT_FileSelectorEnums FileSelector(); public native CUsbCameraParams_Params FileSelector(IEnumerationT_FileSelectorEnums FileSelector);
    
    //@}
    

    /** \name FileAccessControl - This category includes items used to conduct file operations. Applies to: ace */
    //@{
    /**
        \brief Selects the target operation for the selected file. Applies to: ace
        <p>
        The File Operation Selector feature selects the target operation for the selected file in the device. This Operation is executed when the FileOperationExecute feature is called.
    
        \b Visibility = Guru
    
        \b Selected by : FileSelector
    
    */
    public native @ByRef IEnumerationT_FileOperationSelectorEnums FileOperationSelector(); public native CUsbCameraParams_Params FileOperationSelector(IEnumerationT_FileOperationSelectorEnums FileOperationSelector);
    
    //@}
    

    /** \name FileAccessControl - This category includes items used to conduct file operations. Applies to: ace */
    //@{
    /**
        \brief Selects the access mode in which a file is opened. Applies to: ace
        <p>
        The File Open Mode feature selects the access mode in which a file is opened in the device.
    
        \b Visibility = Guru
    
        \b Selected by : FileSelector
    
    */
    public native @ByRef IEnumerationT_FileOpenModeEnums FileOpenMode(); public native CUsbCameraParams_Params FileOpenMode(IEnumerationT_FileOpenModeEnums FileOpenMode);
    
    //@}
    

    /** \name FileAccessControl - This category includes items used to conduct file operations. Applies to: ace */
    //@{
    /**
        \brief Defines the intermediate access buffer. Applies to: ace
        <p>
        The File Access Buffer feature defines the intermediate access buffer that allows the exchange of data between the device file storage and the application.
    
        \b Visibility = Guru
    
        \b Selected by : FileSelector
    
    */
    public native @ByRef IRegister FileAccessBuffer(); public native CUsbCameraParams_Params FileAccessBuffer(IRegister FileAccessBuffer);
    
    //@}
    

    /** \name FileAccessControl - This category includes items used to conduct file operations. Applies to: ace */
    //@{
    /**
        \brief Controls the mapping between the device file storage and the FileAccessBuffer. Applies to: ace
        <p>
        This feature controls the mapping between the device file storage and the FileAccessBuffer.
    
        \b Visibility = Guru
    
        \b Selected by : FileSelector, FileOperationSelector
    
    */
    public native @ByRef IInteger FileAccessOffset(); public native CUsbCameraParams_Params FileAccessOffset(IInteger FileAccessOffset);
    
    //@}
    

    /** \name FileAccessControl - This category includes items used to conduct file operations. Applies to: ace */
    //@{
    /**
        \brief Controls the mapping between the device file storage and the FileAccessBuffer. Applies to: ace
        <p>
        This feature controls the mapping between the device file storage and the FileAccessBuffer.
    
        \b Visibility = Guru
    
        \b Selected by : FileSelector, FileOperationSelector
    
    */
    public native @ByRef IInteger FileAccessLength(); public native CUsbCameraParams_Params FileAccessLength(IInteger FileAccessLength);
    
    //@}
    

    /** \name FileAccessControl - This category includes items used to conduct file operations. Applies to: ace */
    //@{
    /**
        \brief Represents the file operation execution status. Applies to: ace
        <p>
        The File Operation Status feature represents the file operation execution status.
    
        \b Visibility = Guru
    
        \b Selected by : FileSelector, FileOperationSelector
    
    */
    public native @ByRef IEnumerationT_FileOperationStatusEnums FileOperationStatus(); public native CUsbCameraParams_Params FileOperationStatus(IEnumerationT_FileOperationStatusEnums FileOperationStatus);
    
    //@}
    

    /** \name FileAccessControl - This category includes items used to conduct file operations. Applies to: ace */
    //@{
    /**
        \brief Represents the file operation result. Applies to: ace
        <p>
        The File Operation Result feature represents the file operation result. For Read or Write operations, the number of successfully read/written bytes is returned.
    
        \b Visibility = Guru
    
        \b Selected by : FileSelector, FileOperationSelector
    
    */
    public native @ByRef IInteger FileOperationResult(); public native CUsbCameraParams_Params FileOperationResult(IInteger FileOperationResult);
    
    //@}
    

    /** \name FileAccessControl - This category includes items used to conduct file operations. Applies to: ace */
    //@{
    /**
        \brief Represents the size of the selected file. Applies to: ace
        <p>
        The File Size feature represents the size of the selected file in bytes.
    
        \b Visibility = Guru
    
        \b Selected by : FileSelector
    
    */
    public native @ByRef IInteger FileSize(); public native CUsbCameraParams_Params FileSize(IInteger FileSize);
    
    //@}
    

    /** \name FileAccessControl - This category includes items used to conduct file operations. Applies to: ace */
    //@{
    /**
        \brief Executes the selected operation. Applies to: ace
        <p>
        The File Operation Execute feature is the command that executes the operation selected by FileOperationSelector on the selected file.
    
        \b Visibility = Guru
    
        \b Selected by : FileSelector, FileOperationSelector
    
    */
    public native @ByRef ICommand FileOperationExecute(); public native CUsbCameraParams_Params FileOperationExecute(ICommand FileOperationExecute);
    
    //@}
    

    /** \name ImageFormatControl - This category includes image format controls. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Selects the type of image test pattern that is generated by the device. Applies to: dart, pulse
        <p>
        Selects the type of image test pattern that is generated by the device.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IEnumerationT_TestPatternEnums TestPattern(); public native CUsbCameraParams_Params TestPattern(IEnumerationT_TestPatternEnums TestPattern);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Sets the shutter mode of the device. Applies to: dart, pulse
        <p>
        Sets the shutter mode of the device.
    
        \b Visibility = Guru
    
    */
    public native @ByRef IEnumerationT_SensorShutterModeEnums SensorShutterMode(); public native CUsbCameraParams_Params SensorShutterMode(IEnumerationT_SensorShutterModeEnums SensorShutterMode);
    
    //@}
    

    /** \name AcquisitionControl -  */
    //@{
    /**
        \brief Configures overlapping exposure and image readout. Applies to: dart, pulse
        <p>
        Configures overlapping exposure and image readout.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_OverlapModeEnums OverlapMode(); public native CUsbCameraParams_Params OverlapMode(IEnumerationT_OverlapModeEnums OverlapMode);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Increases the contrast by setting the darkest regions of the image to black. Applies to: dart, pulse
        <p>
        Increases the contrast by setting the darkest regions of the image to black. A digital gain is applied to the remaining pixels to maintain the original saturation level.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat ContrastEnhancement(); public native CUsbCameraParams_Params ContrastEnhancement(IFloat ContrastEnhancement);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Identifies outlier pixels and adjusts their intensity value. Applies to: dart, pulse
        <p>
        Identifies pixels that have a significantly greater or lesser intensity value than its neighboring pixels (outlier pixels) and adjusts their intensity value.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_DefectPixelCorrectionModeEnums DefectPixelCorrectionMode(); public native CUsbCameraParams_Params DefectPixelCorrectionMode(IEnumerationT_DefectPixelCorrectionModeEnums DefectPixelCorrectionMode);
    
    //@}
    

    /** \name AutoFunctionControl - This category includes items that parameterize the Auto Functions. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Sets the backlight compensation. Applies to: dart, pulse
        <p>
        Sets the backlight compensation that allows the camera to compensate for underexposure. This is done by excluding a given percentage of the brightest pixels in the image from the target average gray value calculations.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IFloat AutoBacklightCompensation(); public native CUsbCameraParams_Params AutoBacklightCompensation(IFloat AutoBacklightCompensation);
    
    //@}
    

    /** \name TransportLayerControl - This category includes items related to the USB3 Vision transport layer. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Payload Transfer Size. Applies to: dart, pulse
        <p>
        Payload Transfer Size
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger PayloadTransferSize(); public native CUsbCameraParams_Params PayloadTransferSize(IInteger PayloadTransferSize);
    
    //@}
    

    /** \name TransportLayerControl - This category includes items related to the USB3 Vision transport layer. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Payload Transfer Count. Applies to: dart, pulse
        <p>
        Payload Transfer Count
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger PayloadTransferCount(); public native CUsbCameraParams_Params PayloadTransferCount(IInteger PayloadTransferCount);
    
    //@}
    

    /** \name TransportLayerControl - This category includes items related to the USB3 Vision transport layer. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Payload Final Transfer 1 Size. Applies to: dart, pulse
        <p>
        Payload Final Transfer 1 Size
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger PayloadFinalTransfer1Size(); public native CUsbCameraParams_Params PayloadFinalTransfer1Size(IInteger PayloadFinalTransfer1Size);
    
    //@}
    

    /** \name TransportLayerControl - This category includes items related to the USB3 Vision transport layer. Applies to: ace, dart, pulse */
    //@{
    /**
        \brief Payload Final Transfer 2 Size. Applies to: dart, pulse
        <p>
        Payload Final Transfer 2 Size
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger PayloadFinalTransfer2Size(); public native CUsbCameraParams_Params PayloadFinalTransfer2Size(IInteger PayloadFinalTransfer2Size);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Controls the behavior of the indicators (such as LEDs) showing the status of the device. Applies to: dart
        <p>
        Controls the behavior of the indicators (such as LEDs) showing the status of the device.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IEnumerationT_DeviceIndicatorModeEnums DeviceIndicatorMode(); public native CUsbCameraParams_Params DeviceIndicatorMode(IEnumerationT_DeviceIndicatorModeEnums DeviceIndicatorMode);
    
    //@}
    

    /** \name ImageQualityControl -  */
    //@{
    /**
        \brief Increases the sharpness of the captured images. Applies to: dart, pulse
        <p>
        Increases the sharpness of the captured images. The higher the sharpness, the more distinct the image subject's contours will be.
    
        \b Visibility = Beginner
        
    
    */
    public native @ByRef IFloat SharpnessEnhancement(); public native CUsbCameraParams_Params SharpnessEnhancement(IFloat SharpnessEnhancement);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Prepare the device for registers streaming without checking for consistency. Applies to: dart, pulse
        <p>
        Prepare the device for registers streaming without checking for consistency.
    
        \b Visibility = Guru
    
    */
    public native @ByRef ICommand DeviceRegistersStreamingStart(); public native CUsbCameraParams_Params DeviceRegistersStreamingStart(ICommand DeviceRegistersStreamingStart);
    
    //@}
    

    /** \name DeviceControl -  */
    //@{
    /**
        \brief Announce the end of registers streaming. Applies to: dart, pulse
        <p>
        Announce the end of registers streaming.
    
        \b Visibility = Guru
    
    */
    public native @ByRef ICommand DeviceRegistersStreamingEnd(); public native CUsbCameraParams_Params DeviceRegistersStreamingEnd(ICommand DeviceRegistersStreamingEnd);
    }


    //**************************************************************************************************
    // Parameter class implementation
    //**************************************************************************************************

    /** \cond HIDE_CLASS_METHODS */

    

    

    

    

    

    /** \endcond */

 // namespace Basler_UsbCameraParams

// #undef GENAPI_DEPRECATED_FEATURE
// #endif // Basler_UsbCameraParams_PARAMS_H


// Parsed from <GenApi/IEnumerationT.h>

//-----------------------------------------------------------------------------
//  (c) 2006 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//  Author:  Fritz Dierks
//  $Header$
//
//  License: This file is published under the license of the EMVA GenICam  Standard Group.
//  A text file describing the legal terms is included in  your installation as 'GenICam_license.pdf'.
//  If for some reason you are missing  this file please contact the EMVA or visit the website
//  (http://www.genicam.org) for a full copy.
//
//  THIS SOFTWARE IS PROVIDED BY THE EMVA GENICAM STANDARD GROUP "AS IS"
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
//  THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
//  PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE EMVA GENICAM STANDARD  GROUP
//  OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,  SPECIAL,
//  EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT  LIMITED TO,
//  PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,  DATA, OR PROFITS;
//  OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY  THEORY OF LIABILITY,
//  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)
//  ARISING IN ANY WAY OUT OF THE USE  OF THIS SOFTWARE, EVEN IF ADVISED OF THE
//  POSSIBILITY OF SUCH DAMAGE.
//-----------------------------------------------------------------------------
/**
\file
\brief    Definition of interface IEnumerationT
\ingroup GenApi_PublicInterface
*/

// #ifndef GENAPI_IENUMERATIONT_H
// #define GENAPI_IENUMERATIONT_H

// #include <GenApi/GenApiDll.h>
// #include <GenApi/Types.h>
// #include <GenApi/Pointer.h>
// #include <GenApi/IEnumeration.h>
// #include <GenApi/Compatibility.h>
// #include <vector>
    //*************************************************************
    // Enumeration template interface
    //*************************************************************

    /**
    \brief Interface for enumeration properties
    \ingroup GenApi_PublicInterface
    */
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_ImageFormatConverterParams::MonoConversionMethodEnums>") public static class IEnumerationT_MonoConversionMethodEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_MonoConversionMethodEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_ImageFormatConverterParams::MonoConversionMethodEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_ImageFormatConverterParams::MonoConversionMethodEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_ImageFormatConverterParams::MonoConversionMethodEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_ImageFormatConverterParams::MonoConversionMethodEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_ImageFormatConverterParams::MonoConversionMethodEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_ImageFormatConverterParams::MonoConversionMethodEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_ImageFormatConverterParams::MonoConversionMethodEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_ImageFormatConverterParams::OutputOrientationEnums>") public static class IEnumerationT_OutputOrientationEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_OutputOrientationEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_ImageFormatConverterParams::OutputOrientationEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_ImageFormatConverterParams::OutputOrientationEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_ImageFormatConverterParams::OutputOrientationEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_ImageFormatConverterParams::OutputOrientationEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_ImageFormatConverterParams::OutputOrientationEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_ImageFormatConverterParams::OutputOrientationEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_ImageFormatConverterParams::OutputOrientationEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_ImageFormatConverterParams::InconvertibleEdgeHandlingEnums>") public static class IEnumerationT_InconvertibleEdgeHandlingEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_InconvertibleEdgeHandlingEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_ImageFormatConverterParams::InconvertibleEdgeHandlingEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_ImageFormatConverterParams::InconvertibleEdgeHandlingEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_ImageFormatConverterParams::InconvertibleEdgeHandlingEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_ImageFormatConverterParams::InconvertibleEdgeHandlingEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_ImageFormatConverterParams::InconvertibleEdgeHandlingEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_ImageFormatConverterParams::InconvertibleEdgeHandlingEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_ImageFormatConverterParams::InconvertibleEdgeHandlingEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_ImageFormatConverterParams::OutputBitAlignmentEnums>") public static class IEnumerationT_OutputBitAlignmentEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_OutputBitAlignmentEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_ImageFormatConverterParams::OutputBitAlignmentEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_ImageFormatConverterParams::OutputBitAlignmentEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_ImageFormatConverterParams::OutputBitAlignmentEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_ImageFormatConverterParams::OutputBitAlignmentEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_ImageFormatConverterParams::OutputBitAlignmentEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_ImageFormatConverterParams::OutputBitAlignmentEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_ImageFormatConverterParams::OutputBitAlignmentEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SequencerModeEnums>") public static class IEnumerationT_SequencerModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_SequencerModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::SequencerModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::SequencerModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::SequencerModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::SequencerModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::SequencerModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::SequencerModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::SequencerModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SequencerConfigurationModeEnums>") public static class IEnumerationT_SequencerConfigurationModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_SequencerConfigurationModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::SequencerConfigurationModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::SequencerConfigurationModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::SequencerConfigurationModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::SequencerConfigurationModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::SequencerConfigurationModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::SequencerConfigurationModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::SequencerConfigurationModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SequencerTriggerSourceEnums>") public static class IEnumerationT_SequencerTriggerSourceEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_SequencerTriggerSourceEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::SequencerTriggerSourceEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::SequencerTriggerSourceEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::SequencerTriggerSourceEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::SequencerTriggerSourceEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::SequencerTriggerSourceEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::SequencerTriggerSourceEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::SequencerTriggerSourceEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SequencerTriggerActivationEnums>") public static class IEnumerationT_SequencerTriggerActivationEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_SequencerTriggerActivationEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::SequencerTriggerActivationEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::SequencerTriggerActivationEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::SequencerTriggerActivationEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::SequencerTriggerActivationEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::SequencerTriggerActivationEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::SequencerTriggerActivationEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::SequencerTriggerActivationEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::BinningHorizontalModeEnums>") public static class IEnumerationT_BinningHorizontalModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_BinningHorizontalModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::BinningHorizontalModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::BinningHorizontalModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::BinningHorizontalModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::BinningHorizontalModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::BinningHorizontalModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::BinningHorizontalModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::BinningHorizontalModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::BinningVerticalModeEnums>") public static class IEnumerationT_BinningVerticalModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_BinningVerticalModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::BinningVerticalModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::BinningVerticalModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::BinningVerticalModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::BinningVerticalModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::BinningVerticalModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::BinningVerticalModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::BinningVerticalModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::PixelFormatEnums>") public static class IEnumerationT_PixelFormatEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_PixelFormatEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::PixelFormatEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::PixelFormatEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::PixelFormatEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::PixelFormatEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::PixelFormatEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::PixelFormatEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::PixelFormatEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::PixelSizeEnums>") public static class IEnumerationT_PixelSizeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_PixelSizeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::PixelSizeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::PixelSizeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::PixelSizeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::PixelSizeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::PixelSizeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::PixelSizeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::PixelSizeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::PixelColorFilterEnums>") public static class IEnumerationT_PixelColorFilterEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_PixelColorFilterEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::PixelColorFilterEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::PixelColorFilterEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::PixelColorFilterEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::PixelColorFilterEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::PixelColorFilterEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::PixelColorFilterEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::PixelColorFilterEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TestImageSelectorEnums>") public static class IEnumerationT_TestImageSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_TestImageSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::TestImageSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::TestImageSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::TestImageSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::TestImageSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::TestImageSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::TestImageSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::TestImageSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::GainAutoEnums>") public static class IEnumerationT_GainAutoEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_GainAutoEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::GainAutoEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::GainAutoEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::GainAutoEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::GainAutoEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::GainAutoEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::GainAutoEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::GainAutoEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::GainSelectorEnums>") public static class IEnumerationT_GainSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_GainSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::GainSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::GainSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::GainSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::GainSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::GainSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::GainSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::GainSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::BlackLevelSelectorEnums>") public static class IEnumerationT_BlackLevelSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_BlackLevelSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::BlackLevelSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::BlackLevelSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::BlackLevelSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::BlackLevelSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::BlackLevelSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::BlackLevelSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::BlackLevelSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LightSourcePresetEnums>") public static class IEnumerationT_LightSourcePresetEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_LightSourcePresetEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::LightSourcePresetEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::LightSourcePresetEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::LightSourcePresetEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::LightSourcePresetEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::LightSourcePresetEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::LightSourcePresetEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::LightSourcePresetEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ColorSpaceEnums>") public static class IEnumerationT_ColorSpaceEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_ColorSpaceEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::ColorSpaceEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::ColorSpaceEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::ColorSpaceEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::ColorSpaceEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::ColorSpaceEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::ColorSpaceEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::ColorSpaceEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::BalanceWhiteAutoEnums>") public static class IEnumerationT_BalanceWhiteAutoEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_BalanceWhiteAutoEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::BalanceWhiteAutoEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::BalanceWhiteAutoEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::BalanceWhiteAutoEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::BalanceWhiteAutoEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::BalanceWhiteAutoEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::BalanceWhiteAutoEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::BalanceWhiteAutoEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::BalanceRatioSelectorEnums>") public static class IEnumerationT_BalanceRatioSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_BalanceRatioSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::BalanceRatioSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::BalanceRatioSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::BalanceRatioSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::BalanceRatioSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::BalanceRatioSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::BalanceRatioSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::BalanceRatioSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ColorAdjustmentSelectorEnums>") public static class IEnumerationT_ColorAdjustmentSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_ColorAdjustmentSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::ColorAdjustmentSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::ColorAdjustmentSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::ColorAdjustmentSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::ColorAdjustmentSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::ColorAdjustmentSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::ColorAdjustmentSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::ColorAdjustmentSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ColorTransformationSelectorEnums>") public static class IEnumerationT_ColorTransformationSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_ColorTransformationSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::ColorTransformationSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::ColorTransformationSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::ColorTransformationSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::ColorTransformationSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::ColorTransformationSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::ColorTransformationSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::ColorTransformationSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ColorTransformationValueSelectorEnums>") public static class IEnumerationT_ColorTransformationValueSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_ColorTransformationValueSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::ColorTransformationValueSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::ColorTransformationValueSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::ColorTransformationValueSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::ColorTransformationValueSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::ColorTransformationValueSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::ColorTransformationValueSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::ColorTransformationValueSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::AcquisitionModeEnums>") public static class IEnumerationT_AcquisitionModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_AcquisitionModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::AcquisitionModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::AcquisitionModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::AcquisitionModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::AcquisitionModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::AcquisitionModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::AcquisitionModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::AcquisitionModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ShutterModeEnums>") public static class IEnumerationT_ShutterModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_ShutterModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::ShutterModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::ShutterModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::ShutterModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::ShutterModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::ShutterModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::ShutterModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::ShutterModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ExposureAutoEnums>") public static class IEnumerationT_ExposureAutoEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_ExposureAutoEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::ExposureAutoEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::ExposureAutoEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::ExposureAutoEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::ExposureAutoEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::ExposureAutoEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::ExposureAutoEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::ExposureAutoEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ExposureModeEnums>") public static class IEnumerationT_ExposureModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_ExposureModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::ExposureModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::ExposureModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::ExposureModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::ExposureModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::ExposureModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::ExposureModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::ExposureModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ExposureOverlapTimeModeEnums>") public static class IEnumerationT_ExposureOverlapTimeModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_ExposureOverlapTimeModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::ExposureOverlapTimeModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::ExposureOverlapTimeModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::ExposureOverlapTimeModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::ExposureOverlapTimeModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::ExposureOverlapTimeModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::ExposureOverlapTimeModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::ExposureOverlapTimeModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SensorReadoutModeEnums>") public static class IEnumerationT_SensorReadoutModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_SensorReadoutModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::SensorReadoutModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::SensorReadoutModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::SensorReadoutModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::SensorReadoutModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::SensorReadoutModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::SensorReadoutModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::SensorReadoutModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TriggerSelectorEnums>") public static class IEnumerationT_TriggerSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_TriggerSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::TriggerSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::TriggerSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::TriggerSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::TriggerSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::TriggerSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::TriggerSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::TriggerSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TriggerModeEnums>") public static class IEnumerationT_TriggerModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_TriggerModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::TriggerModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::TriggerModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::TriggerModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::TriggerModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::TriggerModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::TriggerModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::TriggerModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TriggerSourceEnums>") public static class IEnumerationT_TriggerSourceEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_TriggerSourceEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::TriggerSourceEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::TriggerSourceEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::TriggerSourceEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::TriggerSourceEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::TriggerSourceEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::TriggerSourceEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::TriggerSourceEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TriggerActivationEnums>") public static class IEnumerationT_TriggerActivationEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_TriggerActivationEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::TriggerActivationEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::TriggerActivationEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::TriggerActivationEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::TriggerActivationEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::TriggerActivationEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::TriggerActivationEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::TriggerActivationEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::AcquisitionStatusSelectorEnums>") public static class IEnumerationT_AcquisitionStatusSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_AcquisitionStatusSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::AcquisitionStatusSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::AcquisitionStatusSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::AcquisitionStatusSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::AcquisitionStatusSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::AcquisitionStatusSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::AcquisitionStatusSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::AcquisitionStatusSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::AutoFunctionProfileEnums>") public static class IEnumerationT_AutoFunctionProfileEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_AutoFunctionProfileEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::AutoFunctionProfileEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::AutoFunctionProfileEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::AutoFunctionProfileEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::AutoFunctionProfileEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::AutoFunctionProfileEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::AutoFunctionProfileEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::AutoFunctionProfileEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::AutoFunctionROISelectorEnums>") public static class IEnumerationT_AutoFunctionROISelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_AutoFunctionROISelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::AutoFunctionROISelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::AutoFunctionROISelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::AutoFunctionROISelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::AutoFunctionROISelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::AutoFunctionROISelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::AutoFunctionROISelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::AutoFunctionROISelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LUTSelectorEnums>") public static class IEnumerationT_LUTSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_LUTSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::LUTSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::LUTSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::LUTSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::LUTSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::LUTSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::LUTSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::LUTSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LineSelectorEnums>") public static class IEnumerationT_LineSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_LineSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::LineSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::LineSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::LineSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::LineSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::LineSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::LineSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::LineSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LineModeEnums>") public static class IEnumerationT_LineModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_LineModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::LineModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::LineModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::LineModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::LineModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::LineModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::LineModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::LineModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LineFormatEnums>") public static class IEnumerationT_LineFormatEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_LineFormatEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::LineFormatEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::LineFormatEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::LineFormatEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::LineFormatEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::LineFormatEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::LineFormatEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::LineFormatEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LineLogicEnums>") public static class IEnumerationT_LineLogicEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_LineLogicEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::LineLogicEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::LineLogicEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::LineLogicEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::LineLogicEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::LineLogicEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::LineLogicEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::LineLogicEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::LineSourceEnums>") public static class IEnumerationT_LineSourceEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_LineSourceEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::LineSourceEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::LineSourceEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::LineSourceEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::LineSourceEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::LineSourceEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::LineSourceEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::LineSourceEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::UserOutputSelectorEnums>") public static class IEnumerationT_UserOutputSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_UserOutputSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::UserOutputSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::UserOutputSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::UserOutputSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::UserOutputSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::UserOutputSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::UserOutputSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::UserOutputSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SoftwareSignalSelectorEnums>") public static class IEnumerationT_SoftwareSignalSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_SoftwareSignalSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::SoftwareSignalSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::SoftwareSignalSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::SoftwareSignalSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::SoftwareSignalSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::SoftwareSignalSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::SoftwareSignalSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::SoftwareSignalSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TimerSelectorEnums>") public static class IEnumerationT_TimerSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_TimerSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::TimerSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::TimerSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::TimerSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::TimerSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::TimerSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::TimerSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::TimerSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TimerTriggerSourceEnums>") public static class IEnumerationT_TimerTriggerSourceEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_TimerTriggerSourceEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::TimerTriggerSourceEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::TimerTriggerSourceEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::TimerTriggerSourceEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::TimerTriggerSourceEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::TimerTriggerSourceEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::TimerTriggerSourceEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::TimerTriggerSourceEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::CounterSelectorEnums>") public static class IEnumerationT_CounterSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_CounterSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::CounterSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::CounterSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::CounterSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::CounterSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::CounterSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::CounterSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::CounterSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::CounterEventSourceEnums>") public static class IEnumerationT_CounterEventSourceEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_CounterEventSourceEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::CounterEventSourceEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::CounterEventSourceEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::CounterEventSourceEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::CounterEventSourceEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::CounterEventSourceEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::CounterEventSourceEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::CounterEventSourceEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::CounterResetSourceEnums>") public static class IEnumerationT_CounterResetSourceEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_CounterResetSourceEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::CounterResetSourceEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::CounterResetSourceEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::CounterResetSourceEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::CounterResetSourceEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::CounterResetSourceEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::CounterResetSourceEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::CounterResetSourceEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::CounterResetActivationEnums>") public static class IEnumerationT_CounterResetActivationEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_CounterResetActivationEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::CounterResetActivationEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::CounterResetActivationEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::CounterResetActivationEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::CounterResetActivationEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::CounterResetActivationEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::CounterResetActivationEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::CounterResetActivationEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::UserSetSelectorEnums>") public static class IEnumerationT_UserSetSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_UserSetSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::UserSetSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::UserSetSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::UserSetSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::UserSetSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::UserSetSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::UserSetSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::UserSetSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::UserSetDefaultEnums>") public static class IEnumerationT_UserSetDefaultEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_UserSetDefaultEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::UserSetDefaultEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::UserSetDefaultEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::UserSetDefaultEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::UserSetDefaultEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::UserSetDefaultEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::UserSetDefaultEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::UserSetDefaultEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ChunkSelectorEnums>") public static class IEnumerationT_ChunkSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_ChunkSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::ChunkSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::ChunkSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::ChunkSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::ChunkSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::ChunkSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::ChunkSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::ChunkSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ChunkGainSelectorEnums>") public static class IEnumerationT_ChunkGainSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_ChunkGainSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::ChunkGainSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::ChunkGainSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::ChunkGainSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::ChunkGainSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::ChunkGainSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::ChunkGainSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::ChunkGainSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ChunkCounterSelectorEnums>") public static class IEnumerationT_ChunkCounterSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_ChunkCounterSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::ChunkCounterSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::ChunkCounterSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::ChunkCounterSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::ChunkCounterSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::ChunkCounterSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::ChunkCounterSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::ChunkCounterSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::EventSelectorEnums>") public static class IEnumerationT_EventSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_EventSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::EventSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::EventSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::EventSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::EventSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::EventSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::EventSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::EventSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::EventNotificationEnums>") public static class IEnumerationT_EventNotificationEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_EventNotificationEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::EventNotificationEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::EventNotificationEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::EventNotificationEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::EventNotificationEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::EventNotificationEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::EventNotificationEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::EventNotificationEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::BslUSBSpeedModeEnums>") public static class IEnumerationT_BslUSBSpeedModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_BslUSBSpeedModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::BslUSBSpeedModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::BslUSBSpeedModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::BslUSBSpeedModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::BslUSBSpeedModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::BslUSBSpeedModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::BslUSBSpeedModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::BslUSBSpeedModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::DeviceScanTypeEnums>") public static class IEnumerationT_DeviceScanTypeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_DeviceScanTypeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::DeviceScanTypeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::DeviceScanTypeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::DeviceScanTypeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::DeviceScanTypeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::DeviceScanTypeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::DeviceScanTypeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::DeviceScanTypeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::DeviceLinkThroughputLimitModeEnums>") public static class IEnumerationT_DeviceLinkThroughputLimitModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_DeviceLinkThroughputLimitModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::DeviceLinkThroughputLimitModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::DeviceLinkThroughputLimitModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::DeviceLinkThroughputLimitModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::DeviceLinkThroughputLimitModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::DeviceLinkThroughputLimitModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::DeviceLinkThroughputLimitModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::DeviceLinkThroughputLimitModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::DeviceTemperatureSelectorEnums>") public static class IEnumerationT_DeviceTemperatureSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_DeviceTemperatureSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::DeviceTemperatureSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::DeviceTemperatureSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::DeviceTemperatureSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::DeviceTemperatureSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::DeviceTemperatureSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::DeviceTemperatureSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::DeviceTemperatureSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TemperatureStateEnums>") public static class IEnumerationT_TemperatureStateEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_TemperatureStateEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::TemperatureStateEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::TemperatureStateEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::TemperatureStateEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::TemperatureStateEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::TemperatureStateEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::TemperatureStateEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::TemperatureStateEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::UserDefinedValueSelectorEnums>") public static class IEnumerationT_UserDefinedValueSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_UserDefinedValueSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::UserDefinedValueSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::UserDefinedValueSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::UserDefinedValueSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::UserDefinedValueSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::UserDefinedValueSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::UserDefinedValueSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::UserDefinedValueSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::RemoveParameterLimitSelectorEnums>") public static class IEnumerationT_RemoveParameterLimitSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_RemoveParameterLimitSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::RemoveParameterLimitSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::RemoveParameterLimitSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::RemoveParameterLimitSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::RemoveParameterLimitSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::RemoveParameterLimitSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::RemoveParameterLimitSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::RemoveParameterLimitSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::ExpertFeatureAccessSelectorEnums>") public static class IEnumerationT_ExpertFeatureAccessSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_ExpertFeatureAccessSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::ExpertFeatureAccessSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::ExpertFeatureAccessSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::ExpertFeatureAccessSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::ExpertFeatureAccessSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::ExpertFeatureAccessSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::ExpertFeatureAccessSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::ExpertFeatureAccessSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::FileSelectorEnums>") public static class IEnumerationT_FileSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_FileSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::FileSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::FileSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::FileSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::FileSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::FileSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::FileSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::FileSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::FileOperationSelectorEnums>") public static class IEnumerationT_FileOperationSelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_FileOperationSelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::FileOperationSelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::FileOperationSelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::FileOperationSelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::FileOperationSelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::FileOperationSelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::FileOperationSelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::FileOperationSelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::FileOpenModeEnums>") public static class IEnumerationT_FileOpenModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_FileOpenModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::FileOpenModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::FileOpenModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::FileOpenModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::FileOpenModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::FileOpenModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::FileOpenModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::FileOpenModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::FileOperationStatusEnums>") public static class IEnumerationT_FileOperationStatusEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_FileOperationStatusEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::FileOperationStatusEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::FileOperationStatusEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::FileOperationStatusEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::FileOperationStatusEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::FileOperationStatusEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::FileOperationStatusEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::FileOperationStatusEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::TestPatternEnums>") public static class IEnumerationT_TestPatternEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_TestPatternEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::TestPatternEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::TestPatternEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::TestPatternEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::TestPatternEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::TestPatternEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::TestPatternEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::TestPatternEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::SensorShutterModeEnums>") public static class IEnumerationT_SensorShutterModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_SensorShutterModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::SensorShutterModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::SensorShutterModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::SensorShutterModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::SensorShutterModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::SensorShutterModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::SensorShutterModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::SensorShutterModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::OverlapModeEnums>") public static class IEnumerationT_OverlapModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_OverlapModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::OverlapModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::OverlapModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::OverlapModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::OverlapModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::OverlapModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::OverlapModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::OverlapModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::DefectPixelCorrectionModeEnums>") public static class IEnumerationT_DefectPixelCorrectionModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_DefectPixelCorrectionModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::DefectPixelCorrectionModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::DefectPixelCorrectionModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::DefectPixelCorrectionModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::DefectPixelCorrectionModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::DefectPixelCorrectionModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::DefectPixelCorrectionModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::DefectPixelCorrectionModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::DeviceIndicatorModeEnums>") public static class IEnumerationT_DeviceIndicatorModeEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_DeviceIndicatorModeEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::DeviceIndicatorModeEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::DeviceIndicatorModeEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::DeviceIndicatorModeEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::DeviceIndicatorModeEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::DeviceIndicatorModeEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::DeviceIndicatorModeEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::DeviceIndicatorModeEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }
    @Name("GenApi_3_0_Basler_pylon_v5_0::IEnumerationT<Basler_UsbCameraParams::AutoFunctionAOISelectorEnums>") public static class IEnumerationT_AutoFunctionAOISelectorEnums extends IEnumeration {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumerationT_AutoFunctionAOISelectorEnums(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("Basler_UsbCameraParams::AutoFunctionAOISelectorEnums") int Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("Basler_UsbCameraParams::AutoFunctionAOISelectorEnums") int Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Cast("Basler_UsbCameraParams::AutoFunctionAOISelectorEnums") int Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("Basler_UsbCameraParams::AutoFunctionAOISelectorEnums") int GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("Basler_UsbCameraParams::AutoFunctionAOISelectorEnums") int GetValue();

        /** Get node value */
        public native @Cast("Basler_UsbCameraParams::AutoFunctionAOISelectorEnums") @Name("operator ()") int apply();

        /** Set node value
        /** Note : the operator= is not inherited thus the operator= versions
        from IEnumeration must be implemented again */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** returns the EnumEntry object belonging to the Value */
        public native IEnumEntry GetEntry(@Cast("const Basler_UsbCameraParams::AutoFunctionAOISelectorEnums") int Value);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }

    //*************************************************************
    // CEnumerationTRef class
    //*************************************************************

// #ifndef DOXYGEN_IGNORE

    /**
    \internal
    \brief Reference to an IEnumerationT pointer
    \ingroup GenApi_PublicImpl
    */

// #endif



// #endif // ifndef GENAPI_IENUMERATIONT_H


// Parsed from <pylon/usb/BaslerUsbDeviceInfo.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2011-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  AH
//-----------------------------------------------------------------------------
/**
\file
\brief    Definition of the CBaslerUsbDeviceInfo class
*/

// #ifndef INCLUDED_BASLERUSBDEVICEINFO_H_8532831
// #define INCLUDED_BASLERUSBDEVICEINFO_H_8532831

// #include <pylon/Platform.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/PylonBase.h>
// #include <pylon/DeviceInfo.h>
        
        
        
        
        
        
        
        // Internal use only
        
        // Internal use only
        
        // Internal use only
        
    


    /**
    \ingroup Pylon_TransportLayer
    \class CBaslerUsbDeviceInfo
    \brief PylonUsb specific Device Info object.
    */
    @Namespace("Pylon") public static class CBaslerUsbDeviceInfo extends CDeviceInfo {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CBaslerUsbDeviceInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CBaslerUsbDeviceInfo(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CBaslerUsbDeviceInfo position(int position) {
            return (CBaslerUsbDeviceInfo)super.position(position);
        }
    
        public CBaslerUsbDeviceInfo() { super((Pointer)null); allocate(); }
        private native void allocate();
        public CBaslerUsbDeviceInfo(@Const @ByRef CDeviceInfo di) { super((Pointer)null); allocate(di); }
        private native void allocate(@Const @ByRef CDeviceInfo di);

        /**Retrieves the device GUID.
         * This property is identified by Key::DeviceGUID. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetDeviceGUID();
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsDeviceGUIDAvailable();

        /**Retrieves the manufacturer info.
         * This property is identified by Key::ManufacturerInfo. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetManufacturerInfo();
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsManufacturerInfoAvailable();

        /**Retrieves the device index. For internal use only.
         * This property is identified by Key::DeviceIdx. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetDeviceIdx();
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsDeviceIdxAvailable();

        /**Retrieves the product ID. For internal use only.
         * This property is identified by Key::DeviceIdx. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetProductId();
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsProductIdAvailable();

        /**Retrieves the vendor ID. For internal use only.
         * This property is identified by Key::DeviceIdx. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetVendorId();
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsVendorIdAvailable();

        /**Retrieves the driver key name. For internal use only.
         * This property is identified by Key::DriverKeyName. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetDriverKeyName();
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsDriverKeyNameAvailable();

        /**Retrieves the usb driver type. For internal use only.
         * This property is identified by Key::UsbDriverTypeKey. */
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetUsbDriverType();
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsUsbDriverTypeAvailable();

        /**Retrieves the transfer mode. For internal use only.
         * This property is identified by Key::TransferModeKey */
        // Returns either dtx or btx (direct vs. buffered transfer)
        public native @ByVal @Cast("Pylon::String_t*") gcstring GetTransferMode();
        /**Returns true if the above property is available. */
        public native @Cast("bool") boolean IsTransferModeAvailable();
    }


// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_BASLERUSBDEVICEINFO_H_8532831 */


// Parsed from <pylon/usb/BaslerUsbConfigurationEventHandler.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Contains the configuration event handler base class.
*/

// #ifndef INCLUDED_BASLERUSBCONFIGURATIONEVENTHANDLERH_01627755
// #define INCLUDED_BASLERUSBCONFIGURATIONEVENTHANDLERH_01627755

// #include <pylon/stdinclude.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #if _MSC_VER
// #   pragma warning( push)
// #   pragma warning( disable : 4100) //warning C4100: 'identifier' : unreferenced formal parameter
// #endif

    /** \addtogroup Pylon_InstantCameraApiUsb
     * \{
     */

    /**
    \class  CBaslerUsbConfigurationEventHandler
    \brief The configuration event handler base class.
    */
    @Namespace("Pylon") @NoOffset public static class CBaslerUsbConfigurationEventHandler extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CBaslerUsbConfigurationEventHandler(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CBaslerUsbConfigurationEventHandler(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CBaslerUsbConfigurationEventHandler position(int position) {
            return (CBaslerUsbConfigurationEventHandler)super.position(position);
        }
    
        /**
        \brief This method is called before a %Pylon Device (Pylon::IPylonDevice) is attached by calling the Instant Camera object's Attach() method.
        <p>
        This method can not be used for detecting that a camera device has been attached to the PC.
        The camera's Attach() method must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnAttach( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called after a %Pylon Device (Pylon::IPylonDevice) has been attached by calling the Instant Camera object's Attach() method.
        <p>
        This method can not be used for detecting that a camera device has been attached to the PC.
        The camera's Attach() method must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnAttached( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called before the attached %Pylon Device is detached from the Instant Camera object.
        <p>
        The camera's Detach() method  must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnDetach( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called after the attached %Pylon Device has been detached from the Instant Camera object.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnDetached( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called before the attached %Pylon Device is destroyed.
        <p>
        Camera DestroyDevice must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnDestroy( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called after the attached %Pylon Device has been destroyed.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnDestroyed( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called before the attached %Pylon Device is opened.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnOpen( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called after the attached %Pylon Device has been opened.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnOpened( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called before the attached %Pylon Device is closed.
        <p>
        Camera Close must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnClose( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called after the attached %Pylon Device has been closed.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnClosed( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called before a grab session is started.
        <p>
        Camera StartGrabbing must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnGrabStart( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called after a grab session has been started.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnGrabStarted( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called before a grab session is stopped.
        <p>
        Camera StopGrabbing must not be called from here or from subsequent calls to avoid infinite recursion.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnGrabStop( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called after a grab session has been stopped.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnGrabStopped( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called when an exception has been triggered during grabbing.
        <p>
        An exception has been triggered by a grab thread. The grab will be stopped after this event call.
        <p>
        @param [in]  camera The source of the call.
        @param [in]  errorMessage The message of the exception that signaled an error during grabbing.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnGrabError( @ByRef CBaslerUsbInstantCamera camera, @Cast("const char*") BytePointer errorMessage);
        public native void OnGrabError( @ByRef CBaslerUsbInstantCamera camera, String errorMessage);

        /**
        \brief This method is called when a camera device removal from the PC has been detected.
        <p>
        The %Pylon Device attached to the Instant Camera is not operable after this event.
        After it is made sure that no access to the %Pylon Device or any of its node maps is made anymore
        the %Pylon Device should be destroyed using InstantCamera::DeviceDestroy().
        The access to the %Pylon Device can be protected using the lock provided by GetLock(), e.g. when accessing parameters.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        <p>
        \threading
            This method is called inside the lock of the camera object from an additional thread.
        */
        public native void OnCameraDeviceRemoved( @ByRef CBaslerUsbInstantCamera camera);


        /**
        \brief This method is called when the configuration event handler has been registered.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            Exceptions from this call will propagate through.
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnConfigurationRegistered( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called when the configuration event handler has been deregistered.
        <p>
        The configuration event handler is automatically deregistered when the Instant Camera object
        is destroyed.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored.
        \threading
            This method is called inside the lock of the camera object.
        */
        public native void OnConfigurationDeregistered( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief Destroys the configuration event handler.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored.
        */
        public native void DestroyConfiguration();

        /** Create. */
        public CBaslerUsbConfigurationEventHandler() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Copy. */
        public CBaslerUsbConfigurationEventHandler(@Const @ByRef CBaslerUsbConfigurationEventHandler arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(@Const @ByRef CBaslerUsbConfigurationEventHandler arg0);

        /** Assign. */
        public native @ByRef @Name("operator =") CBaslerUsbConfigurationEventHandler put(@Const @ByRef CBaslerUsbConfigurationEventHandler arg0);

        /** Destruct. */

        // Internal use only. Subject to change without notice.
        public native long DebugGetEventHandlerRegistrationCount();
    }

    /**
     * \}
     */


// #if _MSC_VER
// #   pragma warning( pop)
// #endif

// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_BASLERUSBCONFIGURATIONEVENTHANDLERH_01627755 */


// Parsed from <pylon/private/DeviceSpecificGrabResultPtr.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Contains a smart pointer that holds a reference to device specific grab result data.
*/

// #ifndef INCLUDED_DEVICESPECIFICGRABRESULTPTR_H_9329951
// #define INCLUDED_DEVICESPECIFICGRABRESULTPTR_H_9329951

// #include <pylon/GrabResultPtr.h>

// #define PYLON_DEFINE_DEVICE_SPECIFIC_GRAB_RESULT_PTR(ClassName, ResultDataName)
//     class ClassName : public CDeviceSpecificGrabResultPtr<ResultDataName>
//     {
//     public:
//         /*!
//            \copybrief Pylon::CGrabResultPtr::CGrabResultPtr()
//            \copydetails Pylon::CGrabResultPtr::CGrabResultPtr()
//        */
//         ClassName()
//         {
//         }
//         /*!
//            \copybrief Pylon::CDeviceSpecificGrabResultPtr::CDeviceSpecificGrabResultPtr( const CGrabResultPtr& rhs)
//            \copydetails Pylon::CDeviceSpecificGrabResultPtr::CDeviceSpecificGrabResultPtr( const CGrabResultPtr& rhs)
//        */
//         ClassName( const CGrabResultPtr& rhs)
//             : CDeviceSpecificGrabResultPtr<ResultDataName>( rhs)
//         {
//         }
//         /*!
//            \copybrief Pylon::CGrabResultPtr::CGrabResultPtr( const CGrabResultPtr& rhs)
//            \copydetails Pylon::CGrabResultPtr::CGrabResultPtr( const CGrabResultPtr& rhs)
//        */
//         ClassName( const ClassName& rhs)
//             : CDeviceSpecificGrabResultPtr<ResultDataName>( rhs)
//         {
//         }
//     };
        // Internal use only. This is subject to change without notice.
        @Namespace("Pylon::PylonPrivate") public static class CGrabResultDataConverter extends Pointer {
            static { Loader.load(); }
            /** Default native constructor. */
            public CGrabResultDataConverter() { super((Pointer)null); allocate(); }
            /** Native array allocator. Access with {@link Pointer#position(int)}. */
            public CGrabResultDataConverter(int size) { super((Pointer)null); allocateArray(size); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public CGrabResultDataConverter(Pointer p) { super(p); }
            private native void allocate();
            private native void allocateArray(int size);
            @Override public CGrabResultDataConverter position(int position) {
                return (CGrabResultDataConverter)super.position(position);
            }
        
            // Internal use only. This is subject to change without notice.
        }
    

    /**
         \brief Implementation Detail: Header only implementation class for creating device specific grab result ptrs.
         \copydetails Pylon::CGrabResultPtr
    */
    @Name("Pylon::CDeviceSpecificGrabResultPtr<Pylon::CBaslerUsbGrabResultData>") @NoOffset public static class CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData position(int position) {
            return (CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData)super.position(position);
        }
    
        /**
            \copybrief Pylon::CGrabResultPtr::CGrabResultPtr
            \copydetails Pylon::CGrabResultPtr::CGrabResultPtr
        */
        public CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData() { super((Pointer)null); allocate(); }
        private native void allocate();


        /**
        \brief Creates a copy of a smart pointer.
        <p>
        @param [in] rhs Another smart pointer, source of the result data to reference.
        The data itself is not copied.
        <p>
        \post
        <ul>
        <li>Another reference to the grab result of the source is held if it references a grab result.
        <li>No grab result is referenced if the source does not reference a grab result or if the result data is not convertible.
        </ul>
        <p>
        \error
            Still valid after error.
        */
        public CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData( @Const @ByRef CGrabResultPtr rhs) { super((Pointer)null); allocate(rhs); }
        private native void allocate( @Const @ByRef CGrabResultPtr rhs);


        /**
        \brief Assignment of a smart pointer.
        <p>
        @param [in] rhs Another smart pointer, source of the result data to reference.
        <p>
        The data itself is not copied.
        <p>
        \post
        <ul>
        <li>The currently referenced data is released.
        <li>Another reference to the grab result of the source is held if it references a grab result.
        <li>No grab result is referenced if the source does not reference a grab result or if the result data is not convertible.
        </ul>
        <p>
        \error
            Still valid after error.
        */
        public native @ByRef @Name("operator =") CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData put( @Const @ByRef CGrabResultPtr rhs);


        /**
            \copybrief Pylon::CGrabResultPtr::CGrabResultPtr( const CGrabResultPtr& rhs)
            \copydetails Pylon::CGrabResultPtr::CGrabResultPtr( const CGrabResultPtr& rhs)
        */
        public CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData( @Const @ByRef CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData rhs) { super((Pointer)null); allocate(rhs); }
        private native void allocate( @Const @ByRef CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData rhs);


        /**
            \copybrief Pylon::CGrabResultPtr::operator=( const CGrabResultPtr& rhs)
            \copydetails Pylon::CGrabResultPtr::operator=( const CGrabResultPtr& rhs)
        */
        public native @ByRef @Name("operator =") CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData put( @Const @ByRef CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData rhs);


        /**
            \copybrief Pylon::CGrabResultPtr::~CGrabResultPtr
            \copydetails Pylon::CGrabResultPtr::~CGrabResultPtr
        */


        /**
            \copybrief Pylon::CGrabResultPtr::operator->()
            \copydetails Pylon::CGrabResultPtr::operator->()
        */
        public native @Name("operator ->") CBaslerUsbGrabResultData access();


        /**
            \copybrief Pylon::CGrabResultPtr::IsValid
            \copydetails Pylon::CGrabResultPtr::IsValid
        */
        public native @Cast("bool") boolean IsValid();


        /**
        \brief Check whether data is referenced.
        <p>
        @return IsValid().
        <p>
        The overloaded bool operator can be used to check whether data is referenced.
        Example:
        <pre>{@code
        if ( grabResult)
        {
            grabResult->GetStatus();
        }
        }</pre>
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Name("operator bool") boolean asBoolean();


        /**
        */
        public native @ByVal @Name("operator Pylon::CGrabResultPtr") CGrabResultPtr asCGrabResultPtr();


        /**
        \brief Provides an IImage interface to the grab result.
        <p>
        This cast operator allows passing the grab result to saving functions or image format converter.
        The returned image is invalid if the grab was not successful. See CGrabResultData::GrabSucceeded().
        <p>
        \attention The returned reference is only valid as long the grab result ptr is not destroyed.
        <p>
        \error
            Still valid after error.
        */
        public native @ByRef @Name("operator Pylon::IImage&") IImage asIImage();


        /**
        \brief Indicates that the held grab result data and buffer are only referenced by this grab result.
        <p>
        @return Returns true if the held grab result data and buffer are only referenced by this grab result. Returns false if the grab result is invalid.
        <p>
        \error
            Does not throw C++ exceptions.
        */
        public native @Cast("bool") boolean IsUnique();


        /**
            \copybrief Pylon::CGrabResultPtr::Release
            \copydetails Pylon::CGrabResultPtr::Release
        */
        public native void Release();
    }






    // Implementation ----------------------------------------------------------

    


    


    


    


    


    


    


    


    


    

    

    

    


// #endif /* INCLUDED_DEVICESPECIFICGRABRESULTPTR_H_9329951 */


// Parsed from <pylon/usb/BaslerUsbGrabResultData.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2012-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief USB specific grab result data class.
*/
// #ifndef INCLUDED_BASLERUSBGRABRESULTDATA_H_7474481
// #define INCLUDED_BASLERUSBGRABRESULTDATA_H_7474481

// #include <pylon/usb/_UsbChunkData.h>
// #include <pylon/GrabResultData.h>
    /** \addtogroup Pylon_InstantCameraApiUsb
     * \{
     */

    /** The USB specific grab result data class. */
    @Namespace("Pylon") public static class CBaslerUsbGrabResultData extends CGrabResultData {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CBaslerUsbGrabResultData(Pointer p) { super(p); }
        public CUsbChunkData_Params asCUsbChunkData_Params() { return asCUsbChunkData_Params(this); }
        @Namespace public static native @Name("static_cast<Basler_UsbChunkData::CUsbChunkData_Params*>") CUsbChunkData_Params asCUsbChunkData_Params(CBaslerUsbGrabResultData pointer);
    
    }

    /**
     * \}
     */


// #endif /* INCLUDED_BASLERUSBGRABRESULTDATA_H_7474481 */


// Parsed from <pylon/usb/BaslerUsbGrabResultPtr.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2012-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Contains the USB specific grab result ptr class.
*/

// #ifndef INCLUDED_BASLERUSBGRABRESULTPTR_H_03519839
// #define INCLUDED_BASLERUSBGRABRESULTPTR_H_03519839

// #include <pylon/usb/BaslerUsbGrabResultData.h>
// #include <pylon/private/DeviceSpecificGrabResultPtr.h>
    /** \addtogroup Pylon_InstantCameraApiUsb
     * \{
     */

    /** The USB specific grab result smart pointer. */
    @Namespace("Pylon") public static class CBaslerUsbGrabResultPtr extends CDeviceSpecificGrabResultPtr_CBaslerUsbGrabResultData {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CBaslerUsbGrabResultPtr(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CBaslerUsbGrabResultPtr(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CBaslerUsbGrabResultPtr position(int position) {
            return (CBaslerUsbGrabResultPtr)super.position(position);
        }
    
        /**
            \copybrief Pylon::CGrabResultPtr::CGrabResultPtr()
            \copydetails Pylon::CGrabResultPtr::CGrabResultPtr()
        */ public CBaslerUsbGrabResultPtr() { super((Pointer)null); allocate(); }
private native void allocate();
        /**
            \copybrief Pylon::CDeviceSpecificGrabResultPtr::CDeviceSpecificGrabResultPtr( const CGrabResultPtr& rhs)
            \copydetails Pylon::CDeviceSpecificGrabResultPtr::CDeviceSpecificGrabResultPtr( const CGrabResultPtr& rhs)
        */ public CBaslerUsbGrabResultPtr( @Const @ByRef CGrabResultPtr rhs) { super((Pointer)null); allocate(rhs); }
private native void allocate( @Const @ByRef CGrabResultPtr rhs);
        /**
            \copybrief Pylon::CGrabResultPtr::CGrabResultPtr( const CGrabResultPtr& rhs)
            \copydetails Pylon::CGrabResultPtr::CGrabResultPtr( const CGrabResultPtr& rhs)
        */ public CBaslerUsbGrabResultPtr( @Const @ByRef CBaslerUsbGrabResultPtr rhs) { super((Pointer)null); allocate(rhs); }
private native void allocate( @Const @ByRef CBaslerUsbGrabResultPtr rhs);
    }

     /**
     * \}
     */


// #endif /* INCLUDED_BASLERUSBGRABRESULTPTR_H_03519839 */


// Parsed from <pylon/usb/BaslerUsbImageEventHandler.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Contains the image event handler base class.
*/

// #ifndef INCLUDED_BASLERUSBIMAGEEVENTHANDLER_H_8866388
// #define INCLUDED_BASLERUSBIMAGEEVENTHANDLER_H_8866388

// #include <pylon/stdinclude.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <pylon/usb/BaslerUsbGrabResultPtr.h>

// #if _MSC_VER
// #   pragma warning( push)
// #   pragma warning( disable : 4100) //warning C4100: 'identifier' : unreferenced formal parameter
// #endif

    /** \addtogroup Pylon_InstantCameraApiUsb
     * \{
     */

    /**
    \class  CBaslerUsbImageEventHandler
    \brief  The image event handler base class.
    */
    @Namespace("Pylon") @NoOffset public static class CBaslerUsbImageEventHandler extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CBaslerUsbImageEventHandler(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CBaslerUsbImageEventHandler(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CBaslerUsbImageEventHandler position(int position) {
            return (CBaslerUsbImageEventHandler)super.position(position);
        }
    

        /**
        \brief This method is called when images have been skipped using the GrabStrategy_LatestImageOnly strategy or the GrabStrategy_LatestImages strategy.
        <p>
        @param [in]  camera The source of the call.
        @param [in]  countOfSkippedImages The number of images skipped. This \c countOfSkippedImages does not include the number of images lost in the case of a buffer under run in the driver.
        <p>
        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.
        <p>
        \threading
            This method is called outside the lock of the camera object but inside the lock of the image event handler registry.
        */
        public native void OnImagesSkipped( @ByRef CBaslerUsbInstantCamera camera, @Cast("size_t") int countOfSkippedImages);

        /**
        \brief This method is called when an image has been grabbed.
        <p>
        The grab result smart pointer passed does always reference a grab result data object.
        The status of the grab needs to be checked before accessing the grab result data.
        See CGrabResultData::GrabSucceeded(), CGrabResultData::GetErrorCode() and
        CGrabResultData::GetErrorDescription() for more information.
        <p>
        @param [in]  camera The source of the call.
        @param [in]  grabResult The grab result data.
        <p>
        \error
            Exceptions from this call will propagate through. The notification of event handlers stops when an exception is triggered.
        <p>
        \threading
            This method is called outside the lock of the camera object but inside the lock of the image event handler registry.
        */
        public native void OnImageGrabbed( @ByRef CBaslerUsbInstantCamera camera, @Const @ByRef CBaslerUsbGrabResultPtr grabResult);

        /**
        \brief This method is called when the image event handler has been registered.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            Exceptions from this call will propagate through.
        \threading
            This method is called inside the lock of the image event handler registry.
        */
        public native void OnImageEventHandlerRegistered( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief This method is called when the image event handler has been deregistered.
        <p>
        The image event handler is automatically deregistered when the Instant Camera object
        is destroyed.
        <p>
        @param [in]  camera The source of the call.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored.
        \threading
            This method is called inside the lock of the image event handler registry.
        */
        public native void OnImageEventHandlerDeregistered( @ByRef CBaslerUsbInstantCamera camera);

        /**
        \brief Destroys the image event handler.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored.
        */
        public native void DestroyImageEventHandler();

        /** Create. */
        public CBaslerUsbImageEventHandler() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Copy. */
        public CBaslerUsbImageEventHandler(@Const @ByRef CBaslerUsbImageEventHandler arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(@Const @ByRef CBaslerUsbImageEventHandler arg0);

        /** Assign. */
        public native @ByRef @Name("operator =") CBaslerUsbImageEventHandler put(@Const @ByRef CBaslerUsbImageEventHandler arg0);

        /** Destruct. */

        // Internal use only. Subject to change without notice.
        public native long DebugGetEventHandlerRegistrationCount();
    }

    /**
     * \}
     */


// #if _MSC_VER
// #   pragma warning( pop)
// #endif

// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_BASLERUSBIMAGEEVENTHANDLER_H_8866388 */


// Parsed from <pylon/usb/BaslerUsbCameraEventHandler.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Contains the camera event handler base class.
*/

// #ifndef INCLUDED_BASLERUSBCAMERAEVENTHANDLER_H_3102315
// #define INCLUDED_BASLERUSBCAMERAEVENTHANDLER_H_3102315

// #include <pylon/stdinclude.h>

// #ifdef _MSC_VER
// #   pragma pack(push, PYLON_PACKING)
// #endif /* _MSC_VER */

// #include <GenApi/INode.h>

// #if _MSC_VER
// #   pragma warning( push)
// #   pragma warning( disable : 4100) //warning C4100: 'identifier' : unreferenced formal parameter
// #endif

    /** \addtogroup Pylon_InstantCameraApiUsb
     * \{
     */

    /**
    \class  CBaslerUsbCameraEventHandler
    \brief  The camera event handler base class.
    */
    @Namespace("Pylon") @NoOffset public static class CBaslerUsbCameraEventHandler extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CBaslerUsbCameraEventHandler(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CBaslerUsbCameraEventHandler(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CBaslerUsbCameraEventHandler position(int position) {
            return (CBaslerUsbCameraEventHandler)super.position(position);
        }
    

        /**
        \brief This method is called when a camera event has been received.
        <p>
        Only very short processing tasks should be performed by this method. Otherwise, the event notification will block the
        processing of images.
        <p>
        @param [in]  camera The source of the call.
        @param [in]  userProvidedId  The ID passed when registering for the event. It can be used to distinguish between different events.
        @param [in]  pNode The node identified by node name when registering.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored. All event handlers are notified.
        \threading
            This method is called outside the lock of the camera object, outside the lock of the node map, and inside the lock of the camera event handler registry.
        */
        public native void OnCameraEvent( @ByRef CBaslerUsbInstantCamera camera, @Cast("intptr_t") long userProvidedId, INode pNode);

        /**
        \brief This method is called when the camera event handler has been registered.
        <p>
        @param [in]  camera The source of the call.
        @param [in]  nodeName  The name of the event data node updated on camera event, e.g. "ExposureEndEventTimestamp" for exposure end event.
        @param [in]  userProvidedId  This ID is passed as a parameter in CBaslerUsbCameraEventHandler::OnCameraEvent and can be used to distinguish between different events.
        <p>
        \error
            Exceptions from this call will propagate through.
        \threading
            This method is called inside the lock of the camera event handler registry.
        */
        public native void OnCameraEventHandlerRegistered( @ByRef CBaslerUsbInstantCamera camera, @Cast("const Pylon::String_t*") @ByRef gcstring nodeName, @Cast("intptr_t") long userProvidedId);

        /**
        \brief This method is called when the camera event handler has been deregistered.
        <p>
        The camera event handler is automatically deregistered when the Instant Camera object
        is destroyed.
        <p>
        @param [in]  camera The source of the call.
        @param [in]  nodeName  The name of the event data node updated on camera event, e.g. "ExposureEndEventTimestamp" for exposure end event.
        @param [in]  userProvidedId  This ID is passed as a parameter in CBaslerUsbCameraEventHandler::OnCameraEvent and can be used to distinguish between different events.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored.
        \threading
            This method is called inside the lock of the camera event handler registry.
        */
        public native void OnCameraEventHandlerDeregistered( @ByRef CBaslerUsbInstantCamera camera, @Cast("const Pylon::String_t*") @ByRef gcstring nodeName, @Cast("intptr_t") long userProvidedId);

        /**
        \brief Destroys the camera event handler.
        <p>
        \error
            C++ exceptions from this call will be caught and ignored.
        */
        public native void DestroyCameraEventHandler();

        /** Create. */
        public CBaslerUsbCameraEventHandler() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Copy. */
        public CBaslerUsbCameraEventHandler(@Const @ByRef CBaslerUsbCameraEventHandler arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(@Const @ByRef CBaslerUsbCameraEventHandler arg0);

        /** Assign. */
        public native @ByRef @Name("operator =") CBaslerUsbCameraEventHandler put(@Const @ByRef CBaslerUsbCameraEventHandler arg0);

        /** Destruct. */

        // Internal use only. Subject to change without notice.
        public native long DebugGetEventHandlerRegistrationCount();
    }

    /**
     * \}
     */


// #if _MSC_VER
// #   pragma warning( pop)
// #endif

// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif /* INCLUDED_BASLERUSBCAMERAEVENTHANDLER_H_3102315 */


// Parsed from <pylon/usb/_UsbEventParams.h>







//-----------------------------------------------------------------------------
//  (c) 2004-2008 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//-----------------------------------------------------------------------------
/**
\file
\brief Interface to the PylonUsb Event Grabber parameters
*/

//-----------------------------------------------------------------------------
//  This file is generated automatically
//  Do not modify!
//-----------------------------------------------------------------------------



// #ifndef Basler_UsbEventParams_PARAMS_H
// #define Basler_UsbEventParams_PARAMS_H

// #ifdef __GNUC__
// #define GENAPI_DEPRECATED_FEATURE __attribute__((deprecated))
// #elif defined(_MSC_VER)
// #define GENAPI_DEPRECATED_FEATURE __declspec(deprecated)
// #else
// #define GENAPI_DEPRECATED_FEATURE
// #endif

// #include <GenApi/IEnumerationT.h>
// #include <GenApi/NodeMapRef.h>
// #include <GenApi/DLLLoad.h>


// common node types
// #include <GenApi/IBoolean.h>
// #include <GenApi/ICategory.h>
// #include <GenApi/ICommand.h>
// #include <GenApi/IEnumeration.h>
// #include <GenApi/IEnumEntry.h>
// #include <GenApi/IFloat.h>
// #include <GenApi/IInteger.h>
// #include <GenApi/IString.h>
// #include <GenApi/IRegister.h>


/** The namespace containing the device's control interface and related enumeration types */

    //**************************************************************************************************
    // Enumerations
    //**************************************************************************************************
    
    /** Valid values for Status */
    /** enum Basler_UsbEventParams::StatusEnums */
    public static final int
        /**The low level event grabber is closed. */
        Status_Closed = 0,
        /**The low level event grabber is open. */
        Status_Open = 1;


    //**************************************************************************************************
    // Parameter class
    //**************************************************************************************************
    

    /** Interface to the PylonUsb Event Grabber parameters */
    @Namespace("Basler_UsbEventParams") @NoOffset public static class CUsbEventParams_Params extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CUsbEventParams_Params(Pointer p) { super(p); }
    
        
    /** \name Root - USB event grabber parameters. */
    //@{
    /**
        \brief Number of buffers to be used.
        <p>
        Number of Buffers that are going to be used receiving events.
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger NumBuffer(); public native CUsbEventParams_Params NumBuffer(IInteger NumBuffer);
    
    //@}
    

    /** \name Root - USB event grabber parameters. */
    //@{
    /**
        \brief The maximum number of requests to be enqueued to the driver.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger NumMaxQueuedUrbs(); public native CUsbEventParams_Params NumMaxQueuedUrbs(IInteger NumMaxQueuedUrbs);
    
    //@}
    

    /** \name Root - USB event grabber parameters. */
    //@{
    /**
        \brief The priority of the thread that handles USB requests of the event stream interface.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger TransferLoopThreadPriority(); public native CUsbEventParams_Params TransferLoopThreadPriority(IInteger TransferLoopThreadPriority);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The total count of processed events.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Total_Event_Count(); public native CUsbEventParams_Params Statistic_Total_Event_Count(IInteger Statistic_Total_Event_Count);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The count of processed events with an error status.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Failed_Event_Count(); public native CUsbEventParams_Params Statistic_Failed_Event_Count(IInteger Statistic_Failed_Event_Count);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The status code of the last failed event buffer.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Last_Failed_Event_Buffer_Status(); public native CUsbEventParams_Params Statistic_Last_Failed_Event_Buffer_Status(IInteger Statistic_Last_Failed_Event_Buffer_Status);
    }


    //**************************************************************************************************
    // Parameter class implementation
    //**************************************************************************************************

    /** \cond HIDE_CLASS_METHODS */

    

    

    

    

    

    /** \endcond */

 // namespace Basler_UsbEventParams

// #undef GENAPI_DEPRECATED_FEATURE
// #endif // Basler_UsbEventParams_PARAMS_H


// Parsed from <pylon/usb/_UsbStreamParams.h>







//-----------------------------------------------------------------------------
//  (c) 2004-2008 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//-----------------------------------------------------------------------------
/**
\file
\brief Interface to the PylonUsb Stream Grabber parameters
*/

//-----------------------------------------------------------------------------
//  This file is generated automatically
//  Do not modify!
//-----------------------------------------------------------------------------



// #ifndef Basler_UsbStreamParams_PARAMS_H
// #define Basler_UsbStreamParams_PARAMS_H

// #ifdef __GNUC__
// #define GENAPI_DEPRECATED_FEATURE __attribute__((deprecated))
// #elif defined(_MSC_VER)
// #define GENAPI_DEPRECATED_FEATURE __declspec(deprecated)
// #else
// #define GENAPI_DEPRECATED_FEATURE
// #endif

// #include <GenApi/IEnumerationT.h>
// #include <GenApi/NodeMapRef.h>
// #include <GenApi/DLLLoad.h>


// common node types
// #include <GenApi/IBoolean.h>
// #include <GenApi/ICategory.h>
// #include <GenApi/ICommand.h>
// #include <GenApi/IEnumeration.h>
// #include <GenApi/IEnumEntry.h>
// #include <GenApi/IFloat.h>
// #include <GenApi/IInteger.h>
// #include <GenApi/IString.h>
// #include <GenApi/IRegister.h>


/** The namespace containing the device's control interface and related enumeration types */

    //**************************************************************************************************
    // Enumerations
    //**************************************************************************************************
    
    /** Valid values for Status */
    


    //**************************************************************************************************
    // Parameter class
    //**************************************************************************************************
    

    /** Interface to the PylonUsb Stream Grabber parameters */
    @Namespace("Basler_UsbStreamParams") @NoOffset public static class CUsbStreamParams_Params extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CUsbStreamParams_Params(Pointer p) { super(p); }
    
        
    /** \name Root - Interface to the USB-specific stream parameters. */
    //@{
    /**
        \brief The maximum number of buffers that can be used simultaneously.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger MaxNumBuffer(); public native CUsbStreamParams_Params MaxNumBuffer(IInteger MaxNumBuffer);
    
    //@}
    

    /** \name Root - Interface to the USB-specific stream parameters. */
    //@{
    /**
        \brief The maximum buffer size in bytes that can be registered.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger MaxBufferSize(); public native CUsbStreamParams_Params MaxBufferSize(IInteger MaxBufferSize);
    
    //@}
    

    /** \name Root - Interface to the USB-specific stream parameters. */
    //@{
    /**
        \brief The maximum number of requests to be enqueued to the driver.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger NumMaxQueuedUrbs(); public native CUsbStreamParams_Params NumMaxQueuedUrbs(IInteger NumMaxQueuedUrbs);
    
    //@}
    

    /** \name Root - Interface to the USB-specific stream parameters. */
    //@{
    /**
        \brief Controls the maximum size of USB transfers.
        
        
        <p>
        
        
        The default value is appropriate for most applications. 
        Reducing the value may cause a higher CPU load. USB host adapter drivers may require 
        to decrease the value in case the application fails to receive the image stream. The maximum value 
        for the Maximum Transfer Size depends on the operating system version and may be limited by the host adapter drivers.
        
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger MaxTransferSize(); public native CUsbStreamParams_Params MaxTransferSize(IInteger MaxTransferSize);
    
    //@}
    

    /** \name Root - Interface to the USB-specific stream parameters. */
    //@{
    /**
        \brief The priority of the thread that handles USB requests of the stream interface.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IInteger TransferLoopThreadPriority(); public native CUsbStreamParams_Params TransferLoopThreadPriority(IInteger TransferLoopThreadPriority);
    
    //@}
    

    /** \name Root - Interface to the USB-specific stream parameters. */
    //@{
    /**
        \brief Timeout for payload and trailer transfers.
        
    <p>
        
    Timeout for payload and trailer transfers.
    
    
        \b Visibility = Invisible
    
    */
    public native @ByRef IInteger TransferTimeout(); public native CUsbStreamParams_Params TransferTimeout(IInteger TransferTimeout);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The total count of processed buffers.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Total_Buffer_Count(); public native CUsbStreamParams_Params Statistic_Total_Buffer_Count(IInteger Statistic_Total_Buffer_Count);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The count of buffers that returned with an error status.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Failed_Buffer_Count(); public native CUsbStreamParams_Params Statistic_Failed_Buffer_Count(IInteger Statistic_Failed_Buffer_Count);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The count of bad or missed frames between successfully grabbed images.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Missed_Frame_Count(); public native CUsbStreamParams_Params Statistic_Missed_Frame_Count(IInteger Statistic_Missed_Frame_Count);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The count of stream resynchronizations.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Resynchronization_Count(); public native CUsbStreamParams_Params Statistic_Resynchronization_Count(IInteger Statistic_Resynchronization_Count);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The last grabbed block ID.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Last_Block_Id(); public native CUsbStreamParams_Params Statistic_Last_Block_Id(IInteger Statistic_Last_Block_Id);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The status code of the last failed buffer.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Last_Failed_Buffer_Status(); public native CUsbStreamParams_Params Statistic_Last_Failed_Buffer_Status(IInteger Statistic_Last_Failed_Buffer_Status);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The message text of the status code of the last failed buffer.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IString Statistic_Last_Failed_Buffer_Status_Text(); public native CUsbStreamParams_Params Statistic_Last_Failed_Buffer_Status_Text(IString Statistic_Last_Failed_Buffer_Status_Text);
    }


    //**************************************************************************************************
    // Parameter class implementation
    //**************************************************************************************************

    /** \cond HIDE_CLASS_METHODS */

    

    

    

    

    

    /** \endcond */

 // namespace Basler_UsbStreamParams

// #undef GENAPI_DEPRECATED_FEATURE
// #endif // Basler_UsbStreamParams_PARAMS_H


// Parsed from <pylon/usb/_UsbTLParams.h>







//-----------------------------------------------------------------------------
//  (c) 2004-2008 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//-----------------------------------------------------------------------------
/**
\file
\brief Interface to the USB transport layer specific parameters.
*/

//-----------------------------------------------------------------------------
//  This file is generated automatically
//  Do not modify!
//-----------------------------------------------------------------------------



// #ifndef Basler_UsbTLParams_PARAMS_H
// #define Basler_UsbTLParams_PARAMS_H

// #ifdef __GNUC__
// #define GENAPI_DEPRECATED_FEATURE __attribute__((deprecated))
// #elif defined(_MSC_VER)
// #define GENAPI_DEPRECATED_FEATURE __declspec(deprecated)
// #else
// #define GENAPI_DEPRECATED_FEATURE
// #endif

// #include <GenApi/IEnumerationT.h>
// #include <GenApi/NodeMapRef.h>
// #include <GenApi/DLLLoad.h>


// common node types
// #include <GenApi/IBoolean.h>
// #include <GenApi/ICategory.h>
// #include <GenApi/ICommand.h>
// #include <GenApi/IEnumeration.h>
// #include <GenApi/IEnumEntry.h>
// #include <GenApi/IFloat.h>
// #include <GenApi/IInteger.h>
// #include <GenApi/IString.h>
// #include <GenApi/IRegister.h>


/** The namespace containing the device's control interface and related enumeration types */

    //**************************************************************************************************
    // Enumerations
    //**************************************************************************************************
    

    //**************************************************************************************************
    // Parameter class
    //**************************************************************************************************
    

    /** Interface to the USB transport layer specific parameters. */
    @Namespace("Basler_UsbTLParams") @NoOffset public static class CUsbTLParams_Params extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CUsbTLParams_Params(Pointer p) { super(p); }
    
        
    /** \name Root - Transport layer-specific parameters. */
    //@{
    /**
        \brief Maps certain SFNC1.X node names to compatible nodes when enabled.
        
    
        <p>
        
    
        \b Visibility = Guru
    
    */
    public native @ByRef IBoolean MigrationModeEnable(); public native CUsbTLParams_Params MigrationModeEnable(IBoolean MigrationModeEnable);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The total count of read pipe resets.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Read_Pipe_Reset_Count(); public native CUsbTLParams_Params Statistic_Read_Pipe_Reset_Count(IInteger Statistic_Read_Pipe_Reset_Count);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The total count of write pipe resets.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Write_Pipe_Reset_Count(); public native CUsbTLParams_Params Statistic_Write_Pipe_Reset_Count(IInteger Statistic_Write_Pipe_Reset_Count);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The total count of failed read operations.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Read_Operations_Failed_Count(); public native CUsbTLParams_Params Statistic_Read_Operations_Failed_Count(IInteger Statistic_Read_Operations_Failed_Count);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The total count of failed write operations.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Write_Operations_Failed_Count(); public native CUsbTLParams_Params Statistic_Write_Operations_Failed_Count(IInteger Statistic_Write_Operations_Failed_Count);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The last error status for a read or write operation.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IInteger Statistic_Last_Error_Status(); public native CUsbTLParams_Params Statistic_Last_Error_Status(IInteger Statistic_Last_Error_Status);
    
    //@}
    

    /** \name Statistic - Statistical data. */
    //@{
    /**
        \brief The message text of the last error status for a read or write operation.
        
    
        <p>
        
    
        \b Visibility = Expert
    
    */
    public native @ByRef IString Statistic_Last_Error_Status_Text(); public native CUsbTLParams_Params Statistic_Last_Error_Status_Text(IString Statistic_Last_Error_Status_Text);
    }


    //**************************************************************************************************
    // Parameter class implementation
    //**************************************************************************************************

    /** \cond HIDE_CLASS_METHODS */

    

    

    

    

    

    /** \endcond */

 // namespace Basler_UsbTLParams

// #undef GENAPI_DEPRECATED_FEATURE
// #endif // Basler_UsbTLParams_PARAMS_H


// Parsed from <pylon/private/DeviceSpecificConfigurationEventHandlerTie.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Contains an adapter class for device specific configuration event handlers.
*/

// #ifndef INCLUDED_DEVICESPECIFICCONFIGURATIONEVENTHANDLERTIE_H_5249532
// #define INCLUDED_DEVICESPECIFICCONFIGURATIONEVENTHANDLERTIE_H_5249532

// #include <pylon/ConfigurationEventHandler.h>
// #include <pylon/stdinclude.h>
    /**
    \class  CDeviceSpecificConfigurationEventHandlerTie
    \brief  Implementation Detail: Adapter for device specific configuration event handlers.
    */


// #endif /* INCLUDED_DEVICESPECIFICCONFIGURATIONEVENTHANDLERTIE_H_5249532 */


// Parsed from <pylon/private/DeviceSpecificImageEventHandlerTie.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Contains an adapter class for device specific image event handlers.
*/

// #ifndef INCLUDED_DEVICESPECIFICIMAGEEVENTHANDLERTIE_H_009136379
// #define INCLUDED_DEVICESPECIFICIMAGEEVENTHANDLERTIE_H_009136379

// #include <pylon/ImageEventHandler.h>
// #include <pylon/stdinclude.h>
    /**
    \class  CDeviceSpecificImageEventHandlerTie
    \brief  Implementation Detail: Adapter for device specific image event handlers.
    */


// #endif /* INCLUDED_DEVICESPECIFICIMAGEEVENTHANDLERTIE_H_009136379 */


// Parsed from <pylon/private/DeviceSpecificCameraEventHandlerTie.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Contains an adapter class for device specific camera event handlers.
*/

// #ifndef INCLUDED_DEVICESPECIFICCAMERAEVENTHANDLERTIE_H_4759899
// #define INCLUDED_DEVICESPECIFICCAMERAEVENTHANDLERTIE_H_4759899

// #include <pylon/CameraEventHandler.h>
// #include <pylon/stdinclude.h>
    /**
    \class  CDeviceSpecificCameraEventHandlerTie
    \brief  Implementation Detail: Adapter for device specific camera event handlers.
    */


// #endif /* INCLUDED_DEVICESPECIFICCAMERAEVENTHANDLERTIE_H_4759899 */


// Parsed from <pylon/private/DeviceSpecificInstantCamera.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2010-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief Template for device specific instant camera class.
*/

// #ifndef INCLUDED_DEVICESPECIFICINSTANTCAMERA_H_4510266
// #define INCLUDED_DEVICESPECIFICINSTANTCAMERA_H_4510266

// #include <pylon/stdinclude.h>
// #include <pylon/InstantCamera.h>
// #include <pylon/private/DeviceSpecificConfigurationEventHandlerTie.h>
// #include <pylon/private/DeviceSpecificImageEventHandlerTie.h>
// #include <pylon/private/DeviceSpecificCameraEventHandlerTie.h>

/** Macro for defining a custom instant camera class. */
// #define PYLON_DEFINE_INSTANT_CAMERA(ClassName, BaseClass)
//     class ClassName : public BaseClass
//     {
//     public:
//         /*!
//            \copybrief CInstantCamera::CInstantCamera()
//            \copydetails CInstantCamera::CInstantCamera()
//        */
//         ClassName() {}
//         /*!
//            \copybrief CInstantCamera::CInstantCamera( IPylonDevice* , ECleanup )
//            \copydetails CInstantCamera::CInstantCamera( IPylonDevice* , ECleanup )
//        */
//         ClassName(IPylonDevice* pDevice, ECleanup cleanupProcedure = Cleanup_Delete)
//             : BaseClass(pDevice, cleanupProcedure) {}
//         /*!
//            \copybrief CInstantCamera::~CInstantCamera
//            \copydetails CInstantCamera::~CInstantCamera
//        */
//         ~ClassName()
//         {
//             Attach( NULL);
//             InternalShutdownEventHandlers();
//         }
//     protected:
//         /*Create device specific grab result data. This is subject to change without notice*/
//         virtual CGrabResultData* CreateDeviceSpecificGrabResultData()
//         {
//             return new GrabResultData_t();
//         }
//     };
    /**
    \class  CDeviceSpecificInstantCameraT
    \brief  Implementation Detail: Header only implementation class for creating device specific Instant Camera classes.
    */

    @Name("Pylon::CDeviceSpecificInstantCameraT<Pylon::CBaslerUsbInstantCameraTraits>") @NoOffset public static class CDeviceSpecificInstantCameraT_CBaslerUsbInstantCameraTraits extends CInstantCamera {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CDeviceSpecificInstantCameraT_CBaslerUsbInstantCameraTraits(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CDeviceSpecificInstantCameraT_CBaslerUsbInstantCameraTraits(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CDeviceSpecificInstantCameraT_CBaslerUsbInstantCameraTraits position(int position) {
            return (CDeviceSpecificInstantCameraT_CBaslerUsbInstantCameraTraits)super.position(position);
        }
        public CUsbCameraParams_Params asCUsbCameraParams_Params() { return asCUsbCameraParams_Params(this); }
        @Namespace public static native @Name("static_cast<Pylon::CBaslerUsbInstantCameraTraits::CameraParams_t*>") CUsbCameraParams_Params asCUsbCameraParams_Params(CDeviceSpecificInstantCameraT_CBaslerUsbInstantCameraTraits pointer);
        public CBaslerUsbInstantCameraTraits asCBaslerUsbInstantCameraTraits() { return asCBaslerUsbInstantCameraTraits(this); }
        @Namespace public static native @Name("static_cast<Pylon::CBaslerUsbInstantCameraTraits*>") CBaslerUsbInstantCameraTraits asCBaslerUsbInstantCameraTraits(CDeviceSpecificInstantCameraT_CBaslerUsbInstantCameraTraits pointer);
    
        /**
            \copybrief Pylon::CInstantCamera::CInstantCamera()
            \copydetails Pylon::CInstantCamera::CInstantCamera()
        */
        public CDeviceSpecificInstantCameraT_CBaslerUsbInstantCameraTraits() { super((Pointer)null); allocate(); }
        private native void allocate();

        /**
            \copybrief Pylon::CInstantCamera::CInstantCamera( IPylonDevice* , ECleanup )
            \copydetails Pylon::CInstantCamera::CInstantCamera( IPylonDevice* , ECleanup )
        */
        public CDeviceSpecificInstantCameraT_CBaslerUsbInstantCameraTraits( IPylonDevice pDevice, @Cast("Pylon::ECleanup") int cleanupProcedure/*=Pylon::Cleanup_Delete*/) { super((Pointer)null); allocate(pDevice, cleanupProcedure); }
        private native void allocate( IPylonDevice pDevice, @Cast("Pylon::ECleanup") int cleanupProcedure/*=Pylon::Cleanup_Delete*/);
        public CDeviceSpecificInstantCameraT_CBaslerUsbInstantCameraTraits( IPylonDevice pDevice) { super((Pointer)null); allocate(pDevice); }
        private native void allocate( IPylonDevice pDevice);



        /*
            \copybrief Pylon::CInstantCamera::Attach
            \copydetails Pylon::CInstantCamera::Attach
        */
        public native void Attach( IPylonDevice pDevice, @Cast("Pylon::ECleanup") int cleanupProcedure/*=Pylon::Cleanup_Delete*/);
        public native void Attach( IPylonDevice pDevice);

        /*
            \copybrief Pylon::CInstantCamera::DestroyDevice
            \copydetails Pylon::CInstantCamera::DestroyDevice
        */
        public native void DestroyDevice();

        /*
            \copybrief Pylon::CInstantCamera::DetachDevice
            \copydetails Pylon::CInstantCamera::DetachDevice
        */
        public native IPylonDevice DetachDevice();



        /*
            \copybrief Pylon::CInstantCamera::Open
            \copydetails Pylon::CInstantCamera::Open
        */
        public native void Open();

        /*
            \copybrief Pylon::CInstantCamera::Close
            \copydetails Pylon::CInstantCamera::Close
        */
        public native void Close();



        /**
            \copybrief Pylon::CInstantCamera::RetrieveResult
            \copydetails Pylon::CInstantCamera::RetrieveResult
        */
        public native @Cast("bool") boolean RetrieveResult( @Cast("unsigned int") int timeoutMs, @ByRef CBaslerUsbGrabResultPtr grabResult, @Cast("Pylon::ETimeoutHandling") int timeoutHandling/*=Pylon::TimeoutHandling_ThrowException*/);
        public native @Cast("bool") boolean RetrieveResult( @Cast("unsigned int") int timeoutMs, @ByRef CBaslerUsbGrabResultPtr grabResult);

        // Also available

        /**
            \copybrief Pylon::CInstantCamera::GrabOne
            \copydetails Pylon::CInstantCamera::GrabOne
        */
        public native @Cast("bool") boolean GrabOne( @Cast("unsigned int") int timeoutMs, @ByRef CBaslerUsbGrabResultPtr grabResult, @Cast("Pylon::ETimeoutHandling") int timeoutHandling/*=Pylon::TimeoutHandling_ThrowException*/);
        public native @Cast("bool") boolean GrabOne( @Cast("unsigned int") int timeoutMs, @ByRef CBaslerUsbGrabResultPtr grabResult);

        // Also available



        /**
            \copybrief Pylon::CInstantCamera::RegisterConfiguration( CConfigurationEventHandler*, ERegistrationMode, ECleanup)
            \copydetails Pylon::CInstantCamera::RegisterConfiguration( CConfigurationEventHandler*, ERegistrationMode, ECleanup)
        */
        public native void RegisterConfiguration( CBaslerUsbConfigurationEventHandler pConfigurator, @Cast("Pylon::ERegistrationMode") int mode, @Cast("Pylon::ECleanup") int cleanupProcedure);

        // Also available

        /**
            \copybrief Pylon::CInstantCamera::DeregisterConfiguration( CConfigurationEventHandler*)
            \copydetails Pylon::CInstantCamera::DeregisterConfiguration( CConfigurationEventHandler*)
        */
        public native @Cast("bool") boolean DeregisterConfiguration( CBaslerUsbConfigurationEventHandler configurator);

        // Also available



        /**
            \copybrief Pylon::CInstantCamera::RegisterImageEventHandler( CImageEventHandler*, ERegistrationMode, ECleanup)
            \copydetails Pylon::CInstantCamera::RegisterImageEventHandler( CImageEventHandler*, ERegistrationMode, ECleanup)
        */
        public native void RegisterImageEventHandler( CBaslerUsbImageEventHandler pImageEventHandler, @Cast("Pylon::ERegistrationMode") int mode, @Cast("Pylon::ECleanup") int cleanupProcedure);

        // Also available

        /**
            \copybrief Pylon::CInstantCamera::DeregisterImageEventHandler( CImageEventHandler*)
            \copydetails Pylon::CInstantCamera::DeregisterImageEventHandler( CImageEventHandler*)
        */
        public native @Cast("bool") boolean DeregisterImageEventHandler( CBaslerUsbImageEventHandler imageEventHandler);

        // Also available



        /**
            \copybrief Pylon::CInstantCamera::RegisterCameraEventHandler( CCameraEventHandler*, const String_t&, intptr_t, ERegistrationMode, ECleanup, ECameraEventAvailability)
            \copydetails Pylon::CInstantCamera::RegisterCameraEventHandler( CCameraEventHandler*, const String_t&, intptr_t, ERegistrationMode, ECleanup, ECameraEventAvailability)
        */
        public native void RegisterCameraEventHandler( CBaslerUsbCameraEventHandler pCameraEventHandler, @Cast("const Pylon::String_t*") @ByRef gcstring nodeName, @Cast("intptr_t") long userProvidedId, @Cast("Pylon::ERegistrationMode") int mode, @Cast("Pylon::ECleanup") int cleanupProcedure, @Cast("Pylon::ECameraEventAvailability") int availability/*=Pylon::CameraEventAvailability_Mandatory*/);
        public native void RegisterCameraEventHandler( CBaslerUsbCameraEventHandler pCameraEventHandler, @Cast("const Pylon::String_t*") @ByRef gcstring nodeName, @Cast("intptr_t") long userProvidedId, @Cast("Pylon::ERegistrationMode") int mode, @Cast("Pylon::ECleanup") int cleanupProcedure);

        // Also available

        /**
            \copybrief Pylon::CInstantCamera::DeregisterCameraEventHandler( CCameraEventHandler*, const String_t&)
            \copydetails Pylon::CInstantCamera::DeregisterCameraEventHandler( CCameraEventHandler*, const String_t&)
        */
        public native @Cast("bool") boolean DeregisterCameraEventHandler( CBaslerUsbCameraEventHandler cameraEventHandler, @Cast("const Pylon::String_t*") @ByRef gcstring nodeName);

        // Also available



        /**
            \copybrief Pylon::CInstantCamera::GetDeviceInfo
            \copydetails Pylon::CInstantCamera::GetDeviceInfo
        */
        public native @Const @ByRef CBaslerUsbDeviceInfo GetDeviceInfo();


        /**
        \brief Provides access to the transport layer parameters of the attached %Pylon Device.
        @return Reference to the transport layer parameters.
        \pre A %Pylon Device is attached.
        \error
            The Instant Camera object is still valid after error.
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByRef CNodeMapProxyT_UsbTLParams_Params GetTLParams();


        /**
        \brief Provides access to the stream grabber parameters of the attached %Pylon Device.
        @return Reference to the stream grabber parameters.
        \pre
        <ul>
        <li> A %Pylon Device is attached.
        <li> The %Pylon Device is open.
        </ul>
        \error
            The Instant Camera object is still valid after error.
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByRef CNodeMapProxyT_CUsbStreamParams_Params GetStreamGrabberParams();


        /**
        \brief Provides access to the event grabber parameters of the attached %Pylon Device.
        @return Reference to the event grabber parameters.
        \pre
        <ul>
        <li> A %Pylon Device is attached.
        <li> The %Pylon Device is open.
        </ul>
        \error
            The Instant Camera object is still valid after error.
        \threading
            This method is synchronized using the lock provided by GetLock().
        */
        public native @ByRef CNodeMapProxyT_CUsbEventParams_Params GetEventGrabberParams();

        // Types used by camera--------------------------------------------------

        // Overload CInstantCamera type definitions
    }






    // Implementation ----------------------------------------------------------

    


    

    

    

    

    

    



    


    



    

    


    

    


    

    


    

    

    

    

 // namespace Pylon

// #endif /* INCLUDED_DEVICESPECIFICINSTANTCAMERA_H_4510266 */


// Parsed from <pylon/usb/BaslerUsbInstantCamera.h>

//-----------------------------------------------------------------------------
//  Basler pylon SDK
//  Copyright (c) 2012-2015 Basler AG
//  http://www.baslerweb.com
//  Author:  Andreas Gau
//-----------------------------------------------------------------------------
/**
\file
\brief USB Specific Instant Camera class for Basler USB devices.
*/

// #ifndef INCLUDED_BASLERUSBINSTANTCAMERA_H_6872827
// #define INCLUDED_BASLERUSBINSTANTCAMERA_H_6872827

// #include <pylon/usb/_BaslerUsbCameraParams.h>
// #include <pylon/usb/BaslerUsbDeviceInfo.h>
// #include <pylon/usb/BaslerUsbConfigurationEventHandler.h>
// #include <pylon/usb/BaslerUsbImageEventHandler.h>
// #include <pylon/usb/BaslerUsbCameraEventHandler.h>
// #include <pylon/usb/BaslerUsbGrabResultPtr.h>
// #include <pylon/private/DeviceSpecificInstantCamera.h>
// #include <pylon/DeviceClass.h>
// #include <pylon/NodeMapProxy.h>
// #include <pylon/usb/_UsbStreamParams.h>
// #include <pylon/usb/_UsbEventParams.h>
// #include <pylon/usb/_UsbTLParams.h>
    /** \addtogroup Pylon_InstantCameraApiUsb
     * \{
     */

    /** Lists all the types used by the Device Specific Instant Camera class for USB. */
    @Namespace("Pylon") public static class CBaslerUsbInstantCameraTraits extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public CBaslerUsbInstantCameraTraits() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CBaslerUsbInstantCameraTraits(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CBaslerUsbInstantCameraTraits(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public CBaslerUsbInstantCameraTraits position(int position) {
            return (CBaslerUsbInstantCameraTraits)super.position(position);
        }
    
        /** The type of the final camera class. */
        /** \copybrief Basler_UsbCameraParams::CUsbCameraParams_Params */
        /** \copybrief Pylon::IPylonDevice */
        /** \copybrief Pylon::CBaslerUsbDeviceInfo */
        /** The parameters of the USB transport layer. */
        /** The parameters of the USB stream grabber. */
        /** The parameters of the USB event grabber. */
        /** The USB specific configuration event handler class. */
        /** The USB specific image event handler class. */
        /** The USB specific camera event handler class. */
        /** The USB specific grab result data. */
        /** The USB specific grab result smart pointer. */

        /** The name of this device class. Use this one for enumeration. */
        public static native @ByVal @Cast("Pylon::String_t*") gcstring DeviceClass();
    }


    /**
    \class  CBaslerUsbInstantCamera
    \brief  Extends the CInstantCamera by USB specific parameter interface classes.
    */
    @Namespace("Pylon") public static class CBaslerUsbInstantCamera extends CDeviceSpecificInstantCameraT_CBaslerUsbInstantCameraTraits {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CBaslerUsbInstantCamera(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CBaslerUsbInstantCamera(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CBaslerUsbInstantCamera position(int position) {
            return (CBaslerUsbInstantCamera)super.position(position);
        }
    
        /**
            \copybrief CInstantCamera::CInstantCamera()
            \copydetails CInstantCamera::CInstantCamera()
        */ public CBaslerUsbInstantCamera() { super((Pointer)null); allocate(); }
private native void allocate();
        /**
            \copybrief CInstantCamera::CInstantCamera( IPylonDevice* , ECleanup )
            \copydetails CInstantCamera::CInstantCamera( IPylonDevice* , ECleanup )
        */ public CBaslerUsbInstantCamera(IPylonDevice pDevice, @Cast("Pylon::ECleanup") int cleanupProcedure/*=Pylon::Cleanup_Delete*/) { super((Pointer)null); allocate(pDevice, cleanupProcedure); }
private native void allocate(IPylonDevice pDevice, @Cast("Pylon::ECleanup") int cleanupProcedure/*=Pylon::Cleanup_Delete*/);
public CBaslerUsbInstantCamera(IPylonDevice pDevice) { super((Pointer)null); allocate(pDevice); }
private native void allocate(IPylonDevice pDevice);
        /**
            \copybrief CInstantCamera::~CInstantCamera
            \copydetails CInstantCamera::~CInstantCamera
        */
    }

    /**
     * \}
     */
 // namespace Pylon

// #endif /* INCLUDED_BASLERUSBINSTANTCAMERA_H_6872827 */


}
