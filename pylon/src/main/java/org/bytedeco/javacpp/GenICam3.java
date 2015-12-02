// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class GenICam3 extends org.bytedeco.javacpp.presets.GenICam3 {
    static { Loader.load(); }

// Parsed from <_GenICamVersion.h>

//  This file is generated automatically. Do not modify! 
// #define GENICAM_VERSION_MAJOR 3 
// #define GENICAM_VERSION_MINOR 0 
public static final int GENICAM_VERSION_SUBMINOR = 0;

// #define GENICAM_MAIN_COMPILER VC120

// #define GENICAM_COMPANY_SUFFIX Basler_pylon_v5_0
public static final int GENICAM_SVN_REVISION = 3676;


// Parsed from <GenICamVersion.h>

//-----------------------------------------------------------------------------
//  (c) 2006 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenICam
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
\brief    central versioning counters
*/

// #ifndef GENICAM_VERSION_H
// #define GENICAM_VERSION_H

// The following symbols are defined in a cmake generated include file
//#define GENICAM_VERSION_MAJOR 3 
//#define GENICAM_VERSION_MINOR 0 
//#define GENICAM_VERSION_SUBMINOR 0
//#define GENICAM_MAIN_COMPILER VC120 / gcc421
// #include <_GenICamVersion.h>

// The Build is not supported any more
public static final int GENICAM_VERSION_BUILD = 0; 

// Normally GENICAM_COMPILER is fed via cmake; however in pure library mode it is not
// #ifndef GENICAM_COMPILER
// #  define GENICAM_COMPILER GENICAM_MAIN_COMPILER
// #endif 

// Don't ask...
// #define STRINGIFY(x) #x
// #define TOSTRING(x) STRINGIFY(x)
// #define GENICAM_RAW_UNDERSCORE(a, b, c) a ## _ ## b ## _ ## c 
// #define GENICAM_SEP_UNDERSCORE(a, b, c) GENICAM_RAW_UNDERSCORE(a, b, c)
// #define GENICAM_RAW_UNDERSCORE_COMPANY(a, b, c, d) a ## _ ## b ## _ ## c ## _ ## d
// #define GENICAM_SEP_UNDERSCORE_COMPANY(a, b, c, d) GENICAM_RAW_UNDERSCORE_COMPANY(a, b, c, d)

// String versions of the version numbers
// #define GENICAM_VERSION_MAJOR_STR           TOSTRING( GENICAM_VERSION_MAJOR )
// #define GENICAM_VERSION_MINOR_STR           TOSTRING( GENICAM_VERSION_MINOR )
// #define GENICAM_VERSION_SUBMINOR_STR        TOSTRING( GENICAM_VERSION_SUBMINOR )
// #define GENICAM_VERSION_BUILD_STR           TOSTRING( GENICAM_VERSION_BUILD )
// #define GENICAM_COMPILER_STR                TOSTRING( GENICAM_COMPILER )
public static final String GENICAM_ROOT =                        "GENICAM_ROOT";
// #define GENICAM_CACHE_VERSION               "GENICAM_CACHE_V" GENICAM_VERSION_MAJOR_STR "_" GENICAM_VERSION_MINOR_STR
// #define GENICAM_LOG_CONFIG_VERSION          "GENICAM_LOG_CONFIG_V" GENICAM_VERSION_MAJOR_STR "_" GENICAM_VERSION_MINOR_STR
public static final String GENICAM_CLPROTOCOL =                  "GENICAM_CLPROTOCOL";

// #endif // GENICAM_VERSION_H


// Parsed from <GenApi/GenApiNamespace.h>

//-----------------------------------------------------------------------------
//  (c) 2006 by Basler Vision Technologies
//  Section: Vision Components
//  (c) 2015 by STEMMER IMAGING GmbH
//
//  Project: GenApi
//  Author:  Sascha Dorenbeck
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
\file GenApiNamespace.h
\brief GenICam versioned namespace.
\ingroup GenApi_PublicImpl
*/

// #ifndef GENAPI_NAMESPACE_H
// #define GENAPI_NAMESPACE_H

// #include <GenICamVersion.h>

// This is the development namespace for the GenApi library
// #if defined(GENICAM_COMPANY_SUFFIX)
// #define GENAPI_NAMESPACE GENICAM_SEP_UNDERSCORE_COMPANY(GenApi, GENICAM_VERSION_MAJOR, GENICAM_VERSION_MINOR, GENICAM_COMPANY_SUFFIX)
// #else
// #endif

// And make it usable nicely by api's clients

// Public alias

// #endif // GENAPI_NAMESPACE_H


// Parsed from <Base/GCNamespace.h>

/****************************************************************************
(c) 2004 by Basler Vision Technologies
(c) 2005 STEMMER IMAGING
<p>
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
<p>
<p>
****************************************************************************/

/** \file 
/** \brief GenICam versioned namespace.
/** \ingroup Base_PublicUtilities */

// #ifndef GENICAM_NAMESPACE_H
// #define GENICAM_NAMESPACE_H

// #include <GenICamVersion.h>

// This is the development namespace for the GenICam libraries
// #if defined(GENICAM_COMPANY_SUFFIX)
// #   define GENICAM_NAMESPACE GENICAM_SEP_UNDERSCORE_COMPANY(GenICam, GENICAM_VERSION_MAJOR, GENICAM_VERSION_MINOR, GENICAM_COMPANY_SUFFIX)
// #else
// #endif



// Public alias

// #endif // GENICAM_NAMESPACE_H


// Parsed from <Base/GCTypes.h>

/****************************************************************************
(c) 2004 by Basler Vision Technologies
(c) 2005 STEMMER IMAGING
<p>
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
<p>
<p>
****************************************************************************/

/** \file
/** \brief    Platform-dependent type definitions
/** \ingroup Base_PublicUtilities */


// #ifndef GENICAM_TYPES_H
// #define GENICAM_TYPES_H

// #include <Base/GCNamespace.h>

// Make sure WIN32 is defined if the toolchain does not already do it.
// #if defined (_WIN32) && !defined(WIN32)
// #    define WIN32
// #endif

// #if !defined (_WIN32)

// #    ifndef __STDC_LIMIT_MACROS
// #       define  __STDC_LIMIT_MACROS
// #    endif

// #    ifndef __STDC_CONSTANT_MACROS
// #       define  __STDC_CONSTANT_MACROS
// #    endif

// #    include <stddef.h>
// #ifndef VXWORKS
// #    include <inttypes.h>
// #endif
// #    include <stdint.h>

// #elif defined (_WIN32)

/** \addtogroup Base_PublicUtilities
 *  \{ */

// tag to perform 64 compatibility warnings checks on a type
// #   if !defined(GC_W64)
// #       if defined(_M_IX86) && _MSC_VER >= 1300
// #           define GC_W64 __w64
// #       else
// #           define GC_W64
// #       endif
// #   endif

// #   if defined(_MSC_VER) && _MSC_VER >= 1600
        // VS2010 provides stdint.h
// #       include <stdint.h>
// #   else
// #       ifndef _STDINT // only define if not already done

            /** makes int 8 portable across different platforms */
            /** makes unsigned char portable across different platforms */

            /** makes short portable across different platforms */
            /** makes unsigned short portable across different platforms */

            /** makes __int32 portable across different platforms */
            /** makes unsigned int32 portable across different platforms */

            /** makes int64 portable across different platforms */
            /** makes unsigned int64 portable across different platforms */

// #       endif // _STDINT
// #    endif // _MSC_VER >= 1600

    // Deprecated, use int8_t instead
    // typedef char char8_t;

    // Deprecated, use uint8_t instead
    // typedef unsigned char uchar8_t;

    /** use a universal platform dependent int */
    /** use a universal platform dependent unsigned int */

// #   ifndef _SIZE_T_DEFINED
// #       ifdef  _WIN64
            /** use a universal platform dependent unsigned int */
// #       else
            /** use a universal platform dependent unsigned int */
// #       endif
// #       define _SIZE_T_DEFINED
// #   endif

// #   ifndef _INTPTR_T_DEFINED
// #       ifdef  _WIN64
            /** use a universal platform dependent intptr_t */
// #       else
            /** use a universal platform dependent intptr_t */
// #       endif
// #       define _INTPTR_T_DEFINED
// #   endif

// #   ifndef _UINTPTR_T_DEFINED
// #       ifdef  _WIN64
            /** use a universal platform dependent uintptr_t */
// #       else
            /** use a universal platform dependent intptr_t */
// #       endif
// #       define _UINTPTR_T_DEFINED
// #   endif

// #else
// #   error No platform-specific type definitions
// #endif /* __unix__ */

// \}


// #ifndef GC_INT64_MAX
// #ifdef INT64_MAX
// #else
public static native @MemberGetter long GC_INT64_MAX();
public static final long GC_INT64_MAX = GC_INT64_MAX();    /* maximum signed int64 value */
// #endif
// #endif // GC_INT64_MAX

// #ifndef GC_INT64_MIN
// #ifdef INT64_MIN
// #else
public static native @MemberGetter long GC_INT64_MIN();
public static final long GC_INT64_MIN = GC_INT64_MIN();    /* minimum signed int64 value */
// #endif
// #endif // GC_INT64_MIN

// #ifndef GC_UINT64_MAX
// #ifdef UINT64_MAX
// #else
public static native @MemberGetter long GC_UINT64_MAX();
public static final long GC_UINT64_MAX = GC_UINT64_MAX();   /* maximum unsigned int64 value */
// #endif
// #endif // GC_UINT64_MAX

// #ifndef GC_INT32_MAX
// #ifdef INT32_MAX
// #else
public static native @MemberGetter long GC_INT32_MAX();
public static final long GC_INT32_MAX = GC_INT32_MAX();    /* maximum signed int32 value */
// #endif
// #endif // GC_INT32_MAX

// #ifndef GC_INT32_MIN
// #ifdef INT32_MIN
// #else
public static native @MemberGetter long GC_INT32_MIN();
public static final long GC_INT32_MIN = GC_INT32_MIN();    /* minimum signed int32 value */
// #endif
// #endif // GC_INT32_MIN

// #ifndef GC_UINT32_MAX
// #ifdef UINT32_MAX
// #else
public static native @MemberGetter long GC_UINT32_MAX();
public static final long GC_UINT32_MAX = GC_UINT32_MAX();   /* maximum unsigned int32 value */
// #endif
// #endif // GC_UINT32_MAX

// #ifndef GC_INT8_MAX
// #ifdef INT8_MAX
// #else
public static native @MemberGetter long GC_INT8_MAX();
public static final long GC_INT8_MAX = GC_INT8_MAX();    /* maximum signed int8 value */
// #endif
// #endif // GC_INT8_MAX

// #ifndef GC_INT8_MIN
// #ifdef INT8_MIN
// #else
public static native @MemberGetter long GC_INT8_MIN();
public static final long GC_INT8_MIN = GC_INT8_MIN();    /* minimum signed int8 value */
// #endif
// #endif // GC_INT8_MIN

// #ifndef GC_UINT8_MAX
// #ifdef UINT8_MAX
// #else
public static native @MemberGetter long GC_UINT8_MAX();
public static final long GC_UINT8_MAX = GC_UINT8_MAX();   /* maximum unsigned int8 value */
// #endif
// #endif // GC_UINT8_MAX

/** \addtogroup Base_PublicUtilities
/** \{ */

// Utility Types

// Deprecated, use const uint8_t* instead
// typedef const char *      pcchar8_t;

// Deprecated, use uint8_t* instead
// typedef char *            pchar8_t;

/** 32 bit floating point */

/** 64 bit floating point */

/** \} */

// gc base import/export
// #if defined(_MSC_VER)
// #   ifdef GCBASE_EXPORTS
// #       define GCBASE_API __declspec( dllexport )
// #       define GCBASE_RTTI_CLASS_API __declspec( dllexport )
// #   else
// #       define GCBASE_API __declspec( dllimport )
// #       define GCBASE_RTTI_CLASS_API __declspec( dllimport )
// #   endif
// #elif defined (__GNUC__)
// #   ifdef GCBASE_EXPORTS
// #          define GCBASE_API __attribute__((visibility("default")))
// #          define GCBASE_RTTI_CLASS_API __attribute__((visibility("default")))
// #   else
// #      define GCBASE_API
       // Classes that need RTTI info across library boundaries (like Exception classes)
       // need to always use default visibility, even when symbols are being imported.
// #      define GCBASE_RTTI_CLASS_API __attribute__((visibility("default")))
// #   endif
// #else
// #   error Unsupported compiler or platform
// #endif
    /** version */
    @Namespace("GenICam_3_0_Basler_pylon_v5_0") public static class Version_t extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public Version_t() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public Version_t(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Version_t(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public Version_t position(int position) {
            return (Version_t)super.position(position);
        }
    
        public native @Cast("uint16_t") short Major(); public native Version_t Major(short Major);        /**> a is incompatible with b if a != b */
        public native @Cast("uint16_t") short Minor(); public native Version_t Minor(short Minor);        /**> a is incompatible b a > b */
        public native @Cast("uint16_t") short SubMinor(); public native Version_t SubMinor(short SubMinor);     /**> a is aways compatible with b */
    }


// mark a variable as unused. This prevents unused parameter/ unused local variable warnings on warning level 4.
// #if defined(_MSC_VER)
// #   define GC_UNUSED(unused_var) (void)(unused_var)
// #elif defined(__GNUC__)
// #   define GC_UNUSED(unused_var) // no changes to unused params with GCC
// #else
// #   error Unsupported compiler or platform
// #endif


// #endif // GENICAM_TYPES_H


// Parsed from <Base/GCString.h>

/****************************************************************************
(c) 2005 by STEMMER IMAGING
<p>
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
<p>
<p>
****************************************************************************/

/** \file
/** \brief    Portable string implementation
/** \ingroup Base_PublicUtilities */


// #ifndef GENICAM_GCSTRING_H
// #define GENICAM_GCSTRING_H

// #include <new>
// #include <string>
// #include <iostream>
// #include <Base/GCTypes.h>

// #pragma pack(push, 8)


/** 
\brief Indicates either 'not found' or 'all remaining characters'.
\ingroup GenApi_Implementation
*/
// #define GCSTRING_NPOS size_t(-1)
    /**
    \brief A string class which is a clone of std::string
    \ingroup Base_PublicUtilities
    */
    @Namespace("GenICam_3_0_Basler_pylon_v5_0") @NoOffset public static class gcstring extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public gcstring(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public gcstring(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public gcstring position(int position) {
            return (gcstring)super.position(position);
        }
    
            /** Helper class for storing shared-ownership wchar_t * */
            @NoOffset public static class gcwchar extends Pointer {
                static { Loader.load(); }
                /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                public gcwchar(Pointer p) { super(p); }
            
                /** Creates a buffer of \a n wchar_ts */
                public gcwchar( @Cast("size_t") int n ) { super((Pointer)null); allocate(n); }
                private native void allocate( @Cast("size_t") int n );

                // copy constructor
                public gcwchar( @Const @ByRef gcwchar rhs ) { super((Pointer)null); allocate(rhs); }
                private native void allocate( @Const @ByRef gcwchar rhs );

                // assignment operator
                public native @ByRef @Name("operator =") gcwchar put(@Const @ByRef gcwchar rhs);

                /** Gets the c-string. */
                public native @Cast("const wchar_t*") CharPointer c_str();

                /** Gets the length of the buffer. */
                public native @Cast("size_t") int length();

                /** destructor  */
            }
        public gcstring() { super((Pointer)null); allocate(); }
        private native void allocate();
        public gcstring( @Cast("const char*") BytePointer pc ) { super((Pointer)null); allocate(pc); }
        private native void allocate( @Cast("const char*") BytePointer pc );
        public gcstring( String pc ) { super((Pointer)null); allocate(pc); }
        private native void allocate( String pc );
        public gcstring( @Cast("const char*") BytePointer pc, @Cast("size_t") int n ) { super((Pointer)null); allocate(pc, n); }
        private native void allocate( @Cast("const char*") BytePointer pc, @Cast("size_t") int n );
        public gcstring( String pc, @Cast("size_t") int n ) { super((Pointer)null); allocate(pc, n); }
        private native void allocate( String pc, @Cast("size_t") int n );
        public gcstring( @Cast("size_t") int count, @Cast("char") byte ch ) { super((Pointer)null); allocate(count, ch); }
        private native void allocate( @Cast("size_t") int count, @Cast("char") byte ch );
        public gcstring( @Const @ByRef gcstring str ) { super((Pointer)null); allocate(str); }
        private native void allocate( @Const @ByRef gcstring str );
// #       if defined(_MSC_VER) && !defined(PHARLAP_WIN32)
            public gcstring( @Cast("const wchar_t*") CharPointer pBufferUTF16 ) { super((Pointer)null); allocate(pBufferUTF16); }
            private native void allocate( @Cast("const wchar_t*") CharPointer pBufferUTF16 );
            public gcstring( @Cast("const wchar_t*") CharPointer pBufferUTF16, @Cast("size_t") int n ) { super((Pointer)null); allocate(pBufferUTF16, n); }
            private native void allocate( @Cast("const wchar_t*") CharPointer pBufferUTF16, @Cast("size_t") int n );
// #       endif
        public native @ByRef gcstring append( @Const @ByRef gcstring str );
        public native @ByRef gcstring append( @Cast("size_t") int count, @Cast("char") byte ch );
        public native @ByRef gcstring assign( @Const @ByRef gcstring str );
        public native @ByRef gcstring assign( @Cast("size_t") int count, @Cast("char") byte ch );
        public native @ByRef gcstring assign( @Cast("const char*") BytePointer pc );
        public native @ByRef gcstring assign( String pc );
        public native @ByRef gcstring assign( @Cast("const char*") BytePointer pc, @Cast("size_t") int n );
        public native @ByRef gcstring assign( String pc, @Cast("size_t") int n );
// #       if defined(_MSC_VER) && !defined(PHARLAP_WIN32)
            public native @ByRef gcstring assign( @Cast("const wchar_t*") CharPointer pStringUTF16 );
            public native @ByRef gcstring assign( @Cast("const wchar_t*") CharPointer pStringUTF16, int n );
// #       endif
        public native int compare( @Const @ByRef gcstring str );
// #       if defined(_MSC_VER) && !defined(PHARLAP_WIN32)
            public native @ByVal gcwchar w_str( );
// #       endif
        public native @Cast("const char*") BytePointer c_str( );
        public native @Cast("bool") boolean empty( );
        public native @Cast("size_t") int find( @Cast("char") byte ch, @Cast("size_t") int offset/*=0*/ );
        public native @Cast("size_t") int find( @Cast("char") byte ch );
        public native @Cast("size_t") int find( @Const @ByRef gcstring str, @Cast("size_t") int offset/*=0*/ );
        public native @Cast("size_t") int find( @Const @ByRef gcstring str );
        public native @Cast("size_t") int find( @Const @ByRef gcstring str, @Cast("size_t") int offset, @Cast("size_t") int count );
        public native @Cast("size_t") int find( @Cast("const char*") BytePointer pc, @Cast("size_t") int offset/*=0*/);
        public native @Cast("size_t") int find( @Cast("const char*") BytePointer pc);
        public native @Cast("size_t") int find( String pc, @Cast("size_t") int offset/*=0*/);
        public native @Cast("size_t") int find( String pc);
        public native @Cast("size_t") int find( @Cast("const char*") BytePointer pc, @Cast("size_t") int offset, @Cast("size_t") int count );
        public native @Cast("size_t") int find( String pc, @Cast("size_t") int offset, @Cast("size_t") int count );
        public native @Cast("size_t") int length( );
        public native @Cast("size_t") int size( );
        public native void resize( @Cast("size_t") int n );
        public native @Cast("size_t") int max_size( );
        public native @ByVal gcstring substr( @Cast("size_t") int offset/*=0*/, @Cast("size_t") int count/*=size_t(-1)*/ );
        public native @ByVal gcstring substr( );
        public native @Cast("size_t") int find_first_of( @Const @ByRef gcstring str, @Cast("size_t") int offset/*=0*/ );
        public native @Cast("size_t") int find_first_of( @Const @ByRef gcstring str );
        public native @Cast("size_t") int find_first_not_of( @Const @ByRef gcstring str, @Cast("size_t") int offset/*=0*/ );
        public native @Cast("size_t") int find_first_not_of( @Const @ByRef gcstring str );
        public static native @Cast("size_t") int _npos( );
        public native void swap( @ByRef gcstring Right );
        public native @Cast("bool") @Name("operator !=") boolean notEquals( @Const @ByRef gcstring str );
        public native @Cast("bool") @Name("operator !=") boolean notEquals( @Cast("const char*") BytePointer pc );
        public native @Cast("bool") @Name("operator !=") boolean notEquals( String pc );
        public native @ByRef @Name("operator +=") gcstring addPut( @Const @ByRef gcstring str );
        public native @ByRef @Name("operator +=") gcstring addPut( @Cast("const char*") BytePointer pc );
        public native @ByRef @Name("operator +=") gcstring addPut( String pc );

        public native @ByRef @Name("operator +=") gcstring addPut( @Cast("char") byte ch );
        public native @ByRef @Name("operator =") gcstring put( @Const @ByRef gcstring str );
// #       if defined(_MSC_VER) && !defined(PHARLAP_WIN32)
            public native @ByRef @Name("operator =") gcstring put( @Cast("const wchar_t*") CharPointer pStringUTF16 );
// #       endif
        public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef gcstring str );
        public native @Cast("bool") @Name("operator ==") boolean equals( @Cast("const char*") BytePointer pc );
        public native @Cast("bool") @Name("operator ==") boolean equals( String pc );
        public native @Cast("bool") @Name("operator <") boolean lessThan( @Const @ByRef gcstring str );
        public native @Cast("bool") @Name("operator >") boolean greaterThan( @Const @ByRef gcstring str );
        public native @Const @Name("operator const char*") BytePointer asBytePointer( );
        public native @Name("operator delete") void _delete( Pointer pWhere );
        public native @Name("operator delete") void _delete( Pointer pWhere, Pointer pNewWhere );
        public native @Name("operator new") Pointer _new( @Cast("size_t") int uiSize );
        public native @Name("operator new") Pointer _new( @Cast("size_t") int uiSize, Pointer pWhere );
        
        
        
        // Beware : this static member prevents delay loading
        // use _npos() instead
        @MemberGetter public static native @Cast("const size_t") int npos();
        public static final int npos = npos();
    }

    // this is necessary due to the circular dependency between string/exception
    @Namespace("GenICam_3_0_Basler_pylon_v5_0") public static native void ThrowBadAlloc(@Cast("const char*") BytePointer source, int line);
    @Namespace("GenICam_3_0_Basler_pylon_v5_0") public static native void ThrowBadAlloc(String source, int line);

    /** STL getline
     *  \ingroup Base_PublicUtilities */
    @Namespace("GenICam_3_0_Basler_pylon_v5_0") public static native @Cast("std::istream*") @ByRef Pointer getline(@Cast("std::istream*") @ByRef Pointer is, @ByRef gcstring str);

    /** STL getline
     *  \ingroup Base_PublicUtilities */
    @Namespace("GenICam_3_0_Basler_pylon_v5_0") public static native @Cast("std::istream*") @ByRef Pointer getline(@Cast("std::istream*") @ByRef Pointer is, @ByRef gcstring str, @Cast("char") byte delim);




/** STL operator out
 *  \ingroup Base_PublicUtilities */
public static native @Cast("std::ostream*") @ByRef @Name("operator <<") Pointer shiftLeft(@Cast("std::ostream*") @ByRef Pointer ostr, @Const @ByRef gcstring str);

/** STL operator in
 *  \ingroup Base_PublicUtilities */
public static native @Cast("std::istream*") @ByRef @Name("operator >>") Pointer shiftRight(@Cast("std::istream*") @ByRef Pointer istr, @ByRef gcstring str);

// #pragma pack(pop)

// #endif // GENICAM_GCSTRING_H


// Parsed from <Base/GCStringVector.h>

/****************************************************************************
 (c) 2005 by STEMMER IMAGING
 <p>
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
 <p>
 <p>
 ****************************************************************************/

/** \file
/** \brief    Portable string vector implementation
/** \ingroup Base_PublicUtilities */



// #ifndef GENICAM_GCSTRINGLIST_H
// #define GENICAM_GCSTRINGLIST_H

// #include <Base/GCTypes.h>
// #include <Base/GCString.h>

// #pragma pack(push, 8)


// #if defined (_WIN32) || (defined (__GNUC__) && (defined (__linux__) || defined(__APPLE__) ||  defined(VXWORKS)))

    /**
    \brief A vector of gcstrings which is a clone of std::vector<std::string>
    \ingroup Base_PublicUtilities
    */
    @Namespace("GenICam_3_0_Basler_pylon_v5_0") @NoOffset public static class gcstring_vector extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public gcstring_vector(Pointer p) { super(p); }
    
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
        
            public const_iterator(gcstring pStr/*=0*/) { super((Pointer)null); allocate(pStr); }
            private native void allocate(gcstring pStr/*=0*/);
            public const_iterator() { super((Pointer)null); allocate(); }
            private native void allocate();
            public native @Const @ByRef @Name("operator *") gcstring multiply();
            public native @Const @Name("operator ->") gcstring access();
            public native @ByRef @Name("operator ++") const_iterator increment();
            public native @ByVal @Name("operator ++") const_iterator increment(int arg0);
            public native @ByRef @Name("operator --") const_iterator decrement();
            public native @ByVal @Name("operator --") const_iterator decrement(int arg0);
            public native @ByRef @Name("operator +=") const_iterator addPut(@Cast("intptr_t") long iInc);
            public native @ByVal @Name("operator +") const_iterator add(@Cast("intptr_t") long iInc);
            public native @ByRef @Name("operator -=") const_iterator subtractPut(@Cast("intptr_t") long iDec);
            public native @Cast("intptr_t") @Name("operator -") long subtract(@Const @ByRef const_iterator iter);
            public native @ByVal @Name("operator -") const_iterator subtract(@Cast("intptr_t") long iDec);
            public native @Const @ByRef @Name("operator []") gcstring get(@Cast("intptr_t") long iIndex);
            public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef const_iterator iter);
            public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef const_iterator iter);
            public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef const_iterator iter);
            public native @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef const_iterator iter);
            public native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef const_iterator iter);
            public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef const_iterator iter);
            
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
        
            public iterator(gcstring pStr/*=0*/) { super((Pointer)null); allocate(pStr); }
            private native void allocate(gcstring pStr/*=0*/);
            public iterator() { super((Pointer)null); allocate(); }
            private native void allocate();
            public native @ByRef @Name("operator *") gcstring multiply();
            public native @Name("operator ->") gcstring access();
            public native @ByRef @Name("operator ++") iterator increment();
            public native @ByVal @Name("operator ++") iterator increment(int arg0);
            public native @ByRef @Name("operator --") iterator decrement();
            public native @ByVal @Name("operator --") iterator decrement(int arg0);
            public native @ByRef @Name("operator +=") iterator addPut(@Cast("intptr_t") long iInc);
            public native @ByVal @Name("operator +") iterator add(@Cast("intptr_t") long iInc);
            public native @ByRef @Name("operator -=") iterator subtractPut(@Cast("intptr_t") long iDec);
            public native @Cast("intptr_t") @Name("operator -") long subtract(@Const @ByRef iterator iter);
            public native @ByVal @Name("operator -") iterator subtract(@Cast("intptr_t") long iDec);
            public native @ByRef @Name("operator []") gcstring get(@Cast("intptr_t") long iIndex);
            
        }
        public gcstring_vector() { super((Pointer)null); allocate(); }
        private native void allocate();
        public gcstring_vector(@Cast("size_t") int uiSize, @Const @ByRef(nullValue = "GenICam_3_0_Basler_pylon_v5_0::gcstring()") gcstring str/*=GenICam_3_0_Basler_pylon_v5_0::gcstring()*/) { super((Pointer)null); allocate(uiSize, str); }
        private native void allocate(@Cast("size_t") int uiSize, @Const @ByRef(nullValue = "GenICam_3_0_Basler_pylon_v5_0::gcstring()") gcstring str/*=GenICam_3_0_Basler_pylon_v5_0::gcstring()*/);
        public gcstring_vector(@Cast("size_t") int uiSize) { super((Pointer)null); allocate(uiSize); }
        private native void allocate(@Cast("size_t") int uiSize);
        public gcstring_vector(@Const @ByRef gcstring_vector obj) { super((Pointer)null); allocate(obj); }
        private native void allocate(@Const @ByRef gcstring_vector obj);
        public native void assign(@Cast("size_t") int n, @Const @ByRef gcstring val);
        public native void clear();
        public native @ByVal iterator erase(@ByVal iterator pos);
        public native @ByRef gcstring at(@Cast("size_t") int uiIndex);
        public native @ByRef gcstring back();
        public native @ByVal iterator begin();
        public native @Cast("size_t") @Name("capacity") int _capacity();
        public native @ByVal iterator end();
        public native @ByRef gcstring front();
        public native @Cast("size_t") int max_size();
        public native @Cast("size_t") int size();
        public native @ByVal iterator insert(@ByVal iterator pos, @Const @ByRef gcstring str);
        public native @Cast("bool") boolean empty();
        public native void pop_back();
        public native void push_back(@Const @ByRef gcstring str);
        public native void resize(@Cast("size_t") int uiSize, @Const @ByRef(nullValue = "GenICam_3_0_Basler_pylon_v5_0::gcstring()") gcstring str/*=GenICam_3_0_Basler_pylon_v5_0::gcstring()*/);
        public native void resize(@Cast("size_t") int uiSize);
        public native void reserve(@Cast("size_t") int uiSize);

        // Do not use the methods below - they only exist for
        // backwards compatibility
        public native @ByRef gcstring_vector assign(@Const @ByRef gcstring_vector obj);
        public native void erase(@Cast("size_t") int uiIndex);
        public native void insert(@Cast("size_t") int uiIndex, @Const @ByRef gcstring str);
        public native @ByRef @Name("operator =") gcstring_vector put(@Const @ByRef gcstring_vector obj);
        public native @ByRef @Name("operator []") gcstring get(@Cast("size_t") int uiIndex);
        public native @Name("operator delete") void _delete(Pointer pWhere);
        public native @Name("operator new") Pointer _new(@Cast("size_t") int uiSize);
    }



// #else
// #   error No known support for shared libraries
// #endif

// #pragma pack(pop)

// #endif // GENICAM_GCSTRINGLIST_H


// Parsed from <GenApi/Types.h>

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
\brief Common types used in the public GenApi interface.
\ingroup GenApi_PublicUtilities
*/

// #ifndef GENAPI_TYPES_H
// #define GENAPI_TYPES_H

// #include <Base/GCTypes.h>
// #include <Base/GCStringVector.h>
// #include <GenApi/GenApiDll.h>
// #include <GenApi/Autovector.h>
// #include <GenICamFwd.h>

    /** signed or unsigned integers
     *  \ingroup GenApi_PublicUtilities */
    /** enum GenApi_3_0_Basler_pylon_v5_0::ESign */
    public static final int
        /** Integer is signed */
        Signed = 0,
        /** Integer is unsigned */
        Unsigned = 1,
        /** Object is not yet initialized */
        _UndefinedSign = 2;

    /** access mode of a node
     *  \ingroup GenApi_PublicUtilities */
    /** enum GenApi_3_0_Basler_pylon_v5_0::EAccessMode */
    public static final int
        /** Not implemented */
        NI = 0,
        /** Not available */
        NA = 1,
        /** Write Only */
        WO = 2,
        /** Read Only */
        RO = 3,
        /** Read and Write */
        RW = 4,
        /** Object is not yet initialized */
        _UndefinedAccesMode = 5,
        /** used internally for AccessMode cycle detection */
        _CycleDetectAccesMode = 6;

    /** recommended visibility of a node
     *  \ingroup GenApi_PublicUtilities */
    /** enum GenApi_3_0_Basler_pylon_v5_0::EVisibility */
    public static final int
        /** Always visible */
        Beginner = 0,
        /** Visible for experts or Gurus */
        Expert = 1,
        /** Visible for Gurus */
        Guru = 2,
        /** Not Visible */
        Invisible = 3,
        /** Object is not yet initialized */
        _UndefinedVisibility  = 99;

    /** caching mode of a register
     *  \ingroup GenApi_PublicUtilities */
    /** enum GenApi_3_0_Basler_pylon_v5_0::ECachingMode */
    public static final int
        /** Do not use cache */
        NoCache = 0,
        /** Write to cache and register */
        WriteThrough = 1,
        /** Write to register, write to cache on read */
        WriteAround = 2,
        /** Not yet initialized */
        _UndefinedCachingMode = 3;

    /** recommended representation of a node value
     *  \ingroup GenApi_PublicUtilities */
    /** enum GenApi_3_0_Basler_pylon_v5_0::ERepresentation */
    public static final int
        /** Slider with linear behavior */
        Linear = 0,
        /** Slider with logarithmic behaviour */
        Logarithmic = 1,
        /** Check box */
        Boolean = 2,
        /** Decimal number in an edit control */
        PureNumber = 3,
        /** Hex number in an edit control */
        HexNumber = 4,
        /** IP-Address */
        IPV4Address = 5,
        /** MAC-Address */
        MACAddress = 6,
        _UndefinedRepresentation = 7;

// this define is required to deal with a spelling error corrected in v1.2
// #ifndef NO_UNDEFINEDED_REPRESENTATION
public static final int _UndefindedRepresentation = _UndefinedRepresentation;
// #endif

    /** Endianess of a value in a register
     *  \ingroup GenApi_PublicUtilities */
    /** enum GenApi_3_0_Basler_pylon_v5_0::EEndianess */
    public static final int
        /** Register is big endian */
        BigEndian = 0,
        /** Register is little endian */
        LittleEndian = 1,
        /** Object is not yet initialized */
        _UndefinedEndian = 2;


    /** Defines if a node name is standard or custom
     *  \ingroup GenApi_PublicUtilities */
    /** enum GenApi_3_0_Basler_pylon_v5_0::ENameSpace */
    public static final int
        /** name resides in custom namespace */
        Custom = 0,
        /** name resides in one of the standard namespaces */
        Standard = 1,
        /** Object is not yet initialized */
        _UndefinedNameSpace = 2;


    /** Defines from which standard namespace a node name comes from
     *  \ingroup GenApi_PublicUtilities */
    /** enum GenApi_3_0_Basler_pylon_v5_0::EStandardNameSpace */
    public static final int
        /** name resides in custom namespace */
        None = 0,
        /** name resides in GigE Vision namespace */
        GEV = 1,
        /** name resides in 1394 IIDC namespace */
        IIDC = 2,
        /** name resides in camera link namespace */
        CL = 3,
        /** name resides in USB namespace */
        USB = 4,
        /** Object is not yet initialized */
        _UndefinedStandardNameSpace = 5;


    /** Defines the chices of a Yes/No alternaitve
     *  \ingroup GenApi_PublicUtilities */
    /** enum GenApi_3_0_Basler_pylon_v5_0::EYesNo */
    public static final int
        /** yes */
        Yes = 1,
        /** no */
        No = 0,
        /** Object is not yet initialized */
        _UndefinedYesNo = 2;

    /** A list of strings
     *  \ingroup GenApi_PublicImpl */


    /** typedef for fomula type
     *  \ingroup GenApi_PublicImpl */
    /** enum GenApi_3_0_Basler_pylon_v5_0::ESlope */
    public static final int
        Increasing = 0,      /**> strictly monotonous increasing */
        Decreasing = 1,      /**> strictly monotonous decreasing */
        Varying = 2,         /**> slope changes, e.g. at run-time */
        Automatic = 3,       /**> slope is determined automatically by probing the function */
        /** Object is not yet initialized */
        _UndefinedESlope = 4;

    /** typedef describing the different validity checks which can be performed on an XML file
    /** The enum values for a bitfield of length uint32_t */
    /** \ingroup GenApi_PublicImpl */
    /** enum GenApi_3_0_Basler_pylon_v5_0::EXMLValidation */
    public static final long
        xvLoad      =  0x00000001L,    /**> Creates a dummy node map */
        xvCycles    =  0x00000002L,    /**> checks for write and dependency cycles (implies xvLoad) */
        xvSFNC      =  0x00000004L,    /**> checks for conformance with the standard feature naming convention (SFNC) */
        xvDefault   =  0x00000000L,    /**> checks performed if nothing else is said */
        xvAll       =  0xffffffffL,    /**> all possible checks */
        /** Object is not yet initialized */
        _UndefinedEXMLValidation =  0x8000000L;

    /** typedef for float notation
     *  \ingroup GenApi_PublicImpl */
    /** enum GenApi_3_0_Basler_pylon_v5_0::EDisplayNotation */
    public static final int
        fnAutomatic = 0,                /**> the notation if either scientific or fixed depending on what is shorter */
        fnFixed = 1,                    /**> the notation is fixed, e.g. 123.4 */
        fnScientific = 2,               /**> the notation is scientific, e.g. 1.234e2 */
        /** Object is not yet initialized */
        _UndefinedEDisplayNotation = 3;

    /** typedef for interface type
     *  \ingroup GenApi_PublicImpl */
    /** enum GenApi_3_0_Basler_pylon_v5_0::EInterfaceType */
    public static final int
        intfIValue = 0,       /**> IValue interface */
        intfIBase = 1,        /**> IBase interface */
        intfIInteger = 2,     /**> IInteger interface */
        intfIBoolean = 3,     /**> IBoolean interface */
        intfICommand = 4,     /**> ICommand interface */
        intfIFloat = 5,       /**> IFloat interface */
        intfIString = 6,      /**> IString interface */
        intfIRegister = 7,    /**> IRegister interface */
        intfICategory = 8,    /**> ICategory interface */
        intfIEnumeration = 9, /**> IEnumeration interface */
        intfIEnumEntry = 10,   /**> IEnumEntry interface */
        intfIPort = 11;         /**> IPort interface */

    /** typedef for link type
    /** For details see GenICam wiki : GenApi/SoftwareArchitecture/NodeDependencies
    \ingroup GenApi_PublicImpl
    */
    /** enum GenApi_3_0_Basler_pylon_v5_0::ELinkType */
    public static final int
        ctParentNodes = 0,			/**> All nodes for which this node is at least an invalidating child */
        ctReadingChildren = 1,		/**> All nodes which can be read from  */
        ctWritingChildren = 2,		/**> All nodes which can write a value further down the node stack */
        ctInvalidatingChildren = 3, /**> All directly connected nodes which invalidate this node */
        ctDependingNodes = 4,	/**> All directly or indirectly connected nodes which are invalidated by this nodes (i.e. which are dependent on this node) */
        ctTerminalNodes = 5;		/**> All indirectly connected terminal nodes */

    /** typedef for increment mode
     *  \ingroup GenApi_PublicImpl */
    /** enum GenApi_3_0_Basler_pylon_v5_0::EIncMode */
    public static final int
        noIncrement = 0,    // !> The feature has no increment
        fixedIncrement = 1, // !> The feature has a fix increment
        listIncrement = 2;   // !> The feature has a list of valid value

    /** typedef for link type
     *  \ingroup GenApi_PublicImpl */
    /** enum GenApi_3_0_Basler_pylon_v5_0::EInputDirection */
    public static final int
        idFrom = 0, /**> Indicates a swiss knife that it is used as worker for a converter computing FROM */
        idTo = 1,   /**> Indicates a swiss knife that it is used as worker for a converter computing TO */
        idNone = 2;  /**> SwissKnife is not used within a converter */


// #endif // ifndef GENAPI_TYPES_H


// Parsed from <GenApi/Autovector.h>

//-----------------------------------------------------------------------------
//  (c) 2012 by Teledyne DALSA
//  Section: Digital Imaging
//  Project: GenAPI
//  Author:  Eric Bourbonnais
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
//
/**
\file
\brief   This file contains the public definition of the autovector classes.
\ingroup GenApi_PublicInterface
*/

//////////////////////////////////////////////////////////////////////////////

// #ifndef GENAPI_AUTOVECTOR_H
// #define GENAPI_AUTOVECTOR_H

// #include <vector>
// #include <Base/GCTypes.h>
// #include <GenApi/GenApiDll.h>

// #if defined (_WIN32)
// #elif (defined(__GNUC__) && (defined (__linux__)) || defined (__APPLE__)) || defined(VXWORKS)
// #else
// #   error Unsupported platform
// #endif
    /**
    \brief Vector of integers with reference counting
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") @NoOffset public static class int64_autovector_t extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public int64_autovector_t(Pointer p) { super(p); }
    
        public int64_autovector_t() { super((Pointer)null); allocate(); }
        private native void allocate();
                  public int64_autovector_t( @Const @ByRef int64_autovector_t obj ) { super((Pointer)null); allocate(obj); }
                  private native void allocate( @Const @ByRef int64_autovector_t obj );
        public int64_autovector_t( @Cast("size_t") int n ) { super((Pointer)null); allocate(n); }
        private native void allocate( @Cast("size_t") int n );

        public native @ByRef @Name("operator =") int64_autovector_t put( @Const @ByRef int64_autovector_t obj );

        public native @Cast("int64_t*") @ByRef @Name("operator []") LongPointer get( @Cast("size_t") int uiIndex );
        public native @Cast("size_t") int size( );
    }
    
    /**
    \brief Vector of doubles with reference counting
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") @NoOffset public static class double_autovector_t extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public double_autovector_t(Pointer p) { super(p); }
    
        public double_autovector_t() { super((Pointer)null); allocate(); }
        private native void allocate();
                  public double_autovector_t( @Const @ByRef double_autovector_t obj ) { super((Pointer)null); allocate(obj); }
                  private native void allocate( @Const @ByRef double_autovector_t obj );
        public double_autovector_t( @Cast("size_t") int n ) { super((Pointer)null); allocate(n); }
        private native void allocate( @Cast("size_t") int n );

        public native @ByRef @Name("operator =") double_autovector_t put( @Const @ByRef double_autovector_t obj );

        public native @ByRef @Name("operator []") DoublePointer get( @Cast("size_t") int uiIndex );
        public native @Cast("size_t") int size( );
    }


// #endif // GENAPI_AUTOVECTOR_H


// Parsed from <GenApi/Reference.h>

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
\brief    Definition of template CReference
\ingroup GenApi_PublicImpl
*/

// #ifndef GENAPI_REFERENCE_H
// #define GENAPI_REFERENCE_H

// #include <GenApi/Types.h>
// #include <GenApi/GenApiDll.h>

    //*************************************************************
    // IReference interface
    //*************************************************************

    /**
    \brief Interface to construct a reference
    \ingroup GenApi_PublicImpl
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class IReference extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IReference(Pointer p) { super(p); }
    
        /** sets the implementation to a reference */
        public native void SetReference( IBase pBase );
    }

    //*************************************************************
    // IEnumReference interface
    //*************************************************************

    /**
    \brief Interface to construct an enum reference
    \ingroup GenApi_PublicImpl
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class IEnumReference extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumReference(Pointer p) { super(p); }
    
        /** sets the Enum value corresponding to a value */
        public native void SetEnumReference( int Index, @ByVal gcstring Name);

        /** sets the number of enum vallues */
        public native void SetNumEnums( int NumEnums );
    }

    //*************************************************************
    // CReference class
    //*************************************************************

    /**
    \brief Reference to an IBase derived pointer
    \ingroup GenApi_PublicImpl
    */



// #endif // ifndef GENAPI_REFERENCE_H


// Parsed from <GenApi/IBase.h>

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
\brief  Definition of interface IBase
\ingroup GenApi_PublicInterface
*/


// #ifndef GENAPI_IBASE_H
// #define GENAPI_IBASE_H

// #include <GenApi/GenApiDll.h>
// #include <GenApi/Types.h>
// #include <GenApi/Reference.h>

// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY
    //*************************************************************
    // IBase interface
    //*************************************************************

    /**
    \brief Base interface common to all nodes
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class IBase extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IBase(Pointer p) { super(p); }
    
        /** Get the access mode of the node */
        public native @Cast("GenApi_3_0_Basler_pylon_v5_0::EAccessMode") int GetAccessMode();

		/** Virtual destructor enforcing virtual destructor on all derived classes */
    }

	// Implementation required for Windows only.
	// Note: the C++ standard >= 11 prohibit pure virtual destructors with a function body
	// in the declaration. Consequently gcc 4.0 and newer reject an inline implementation
	// in the class.
	

    //*************************************************************
    // CBaseRef class
    //*************************************************************

// #ifndef DOXYGEN_IGNORE

    /**
    \internal
    \brief Reference to an IBase pointer
    \ingroup GenApi_PublicImpl
    */

    /** Reference to an IBase pointer
     *  \ingroup GenApi_PublicImpl */

// #endif


// #pragma warning ( pop )

// #endif // ifndef GENAPI_IBASE_H


// Parsed from <GenApi/IValue.h>

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
\brief    Definition of the interface IValue.
\ingroup GenApi_PublicInterface
*/

// #ifndef GENAPI_IVALUE_H
// #define GENAPI_IVALUE_H

// #include <GenApi/GenApiDll.h>
// #include <GenApi/Types.h>
// #include <GenApi/IBase.h>
// #include <GenApi/INode.h>
// #include <Base/GCString.h>
// #include <Base/GCException.h>

// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY

    //*************************************************************
    // IValue interface
    //*************************************************************

    /**
    \brief Interface for value properties
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class IValue extends IBase {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IValue(Pointer p) { super(p); }
    
        /** Get the INode interface of the node */
        public native INode GetNode();

        /** Get content of the node as string
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @ByVal gcstring ToString(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @ByVal gcstring ToString();

        /** Set content of the node as string
        /**
        @param ValueStr The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void FromString(@Const @ByRef gcstring ValueStr, @Cast("bool") boolean Verify/*=true*/);
        public native void FromString(@Const @ByRef gcstring ValueStr);

        /** Checks if the value comes from cache or is requested from another node */
        public native @Cast("bool") boolean IsValueCacheValid();
    }


    //*************************************************************
    // CValueRef class
    //*************************************************************

// #ifndef DOXYGEN_IGNORE

    /**
    \internal
    \brief Reference to an IValue pointer
    \ingroup GenApi_PublicImpl
    */

    /** Reference to an IValue pointer
     *  \ingroup GenApi_PublicImpl */

// #endif



// #pragma warning ( pop )

// #endif // ifndef GENAPI_IVALUE_H


// Parsed from <GenApi/IBoolean.h>

//-----------------------------------------------------------------------------
//  (c) 2006 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//  Author:  Margret Albrecht
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
\brief    Definition of IBoolean interface
\ingroup GenApi_PublicInterface
*/

// #ifndef GENAPI_IBOOLEAN_H
// #define GENAPI_IBOOLEAN_H

// #include <GenApi/GenApiDll.h>
// #include <GenApi/Types.h>
// #include <GenApi/IValue.h>

// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY
    //*************************************************************
    // IBoolean interface
    //*************************************************************

    /**
    \brief Interface for Boolean  properties
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class IBoolean extends IValue {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IBoolean(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("bool") boolean Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("bool") boolean Value);

        /** Set node value */
        public native @Name("operator =") void put(@Cast("bool") boolean Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("bool") boolean GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("bool") boolean GetValue();

        /** Get node value */
        public native @Cast("bool") @Name("operator ()") boolean apply();
    }


    //*************************************************************
    // CBooleanRef class
    //*************************************************************

// #ifndef DOXYGEN_IGNORE
    /**
    \internal
    \brief Reference to an IInteger pointer
    \ingroup GenApi_PublicImpl
    */

    /** Reference to an IBoolean pointer
     *  \ingroup GenApi_PublicImpl */

// #endif





// #pragma warning ( pop )

// #endif // ifndef GENAPI_IBOOLEAN_H


// Parsed from <GenApi/ICategory.h>

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
\brief  Definition of interface ICategory and types FeatureList_t :
\ingroup GenApi_PublicInterface
*/


// #ifndef GENAPI_ICATEGORY_H
// #define GENAPI_ICATEGORY_H

// #include <Base/GCString.h>
// #include <GenApi/GenApiDll.h>
// #include <GenApi/Types.h>
// #include <GenApi/IValue.h>
// #include <GenApi/Container.h>

// #include <assert.h>

// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY


    //*************************************************************
    // ICategory interface
    //*************************************************************

    /**
    \brief Gives access to a category node
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class ICategory extends IValue {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ICategory(Pointer p) { super(p); }
    

        /** Get all features of the category (including sub-categories) */
        public native void GetFeatures(@Cast("GenApi_3_0_Basler_pylon_v5_0::FeatureList_t*") @ByRef Pointer Features);

    }


    //*************************************************************
    // CCategoryRef class
    //*************************************************************

// #ifndef DOXYGEN_IGNORE

    /**
    \internal
    \brief Reference to an ICategory pointer
    \ingroup GenApi_PublicImpl
    */

    /** Reference to an ICategory pointer
     *  \ingroup GenApi_PublicImpl */

// #endif


// #pragma warning ( pop )

// #endif // ifndef GENAPI_ICATEGORY_H


// Parsed from <GenApi/ICommand.h>

//-----------------------------------------------------------------------------
//  (c) 2006 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//  Author:  Hartmut Nebelung
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
\brief    Definition of ICommand interface
\ingroup GenApi_PublicInterface
*/

// #ifndef GENAPI_ICOMMAND_H
// #define GENAPI_ICOMMAND_H

// #include <GenApi/GenApiDll.h>
// #include <GenApi/Types.h>
// #include <GenApi/IValue.h>

// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY
    //*************************************************************
    // ICommand interface
    //*************************************************************

    /** Interface for command like  properties
     *  \ingroup GenApi_PublicInterface */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class ICommand extends IValue {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ICommand(Pointer p) { super(p); }
    

        /** Execute the command
        /**
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void Execute(@Cast("bool") boolean Verify/*=true*/);
        public native void Execute();

        /** Execute the command */
        public native @Name("operator ()") void apply();

        /** Query whether the command is executed
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @return True if the Execute command has finished; false otherwise
        */
        public native @Cast("bool") boolean IsDone(@Cast("bool") boolean Verify/*=true*/);
        public native @Cast("bool") boolean IsDone();


    }


    //*************************************************************
    // CCommandRef class
    //*************************************************************

// #ifndef DOXYGEN_IGNORE

    /**
    \internal
    \brief Reference to an IInteger pointer
    \ingroup GenApi_PublicImpl
    */

    /** Reference to an ICommand pointer
     *  \ingroup GenApi_PublicImpl */

// #endif



// #pragma warning ( pop )

// #endif // ifndef GENAPI_ICOMMAND_H


// Parsed from <GenApi/IInteger.h>

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
\brief    Definition of the interface IInteger.
\ingroup GenApi_PublicInterface
*/

// #ifndef GENAPI_IIINTEGER_H
// #define GENAPI_IIINTEGER_H

// #include <Base/GCUtilities.h>
// #include <GenApi/GenApiDll.h>
// #include <GenApi/Types.h>
// #include <GenApi/IValue.h>
// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY
    //*************************************************************
    // IInteger interface
    //*************************************************************

    /**
    \brief Interface for integer properties
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class IInteger extends IValue {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IInteger(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Cast("int64_t") long Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("int64_t") long Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IInteger put(@Cast("int64_t") long Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("int64_t") long GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/ );
        public native @Cast("int64_t") long GetValue( );

        /** Get node value */
        public native @Cast("int64_t") @Name("operator ()") long apply();

        /** Get node value */
        public native @Cast("int64_t") @Name("operator *") long multiply();

        /** Get minimum value allowed */
        public native @Cast("int64_t") long GetMin();

        /** Get maximum value allowed */
        public native @Cast("int64_t") long GetMax();

        /** Get increment mode */
        public native @Cast("GenApi_3_0_Basler_pylon_v5_0::EIncMode") int GetIncMode();

        /** Get increment */
        public native @Cast("int64_t") long GetInc();

        /** Get list of valid value */
        public native @ByVal int64_autovector_t GetListOfValidValues(@Cast("bool") boolean bounded/*=true*/);
        public native @ByVal int64_autovector_t GetListOfValidValues();

        /** Get recommended representation */
        public native @Cast("GenApi_3_0_Basler_pylon_v5_0::ERepresentation") int GetRepresentation();

        /** Get the physical unit name */
        public native @ByVal gcstring GetUnit();

        /** Restrict minimum value */
        public native void ImposeMin(@Cast("int64_t") long Value);

        /** Restrict maximum value */
        public native void ImposeMax(@Cast("int64_t") long Value);
    }


    //*************************************************************
    // CIntegerRef class
    //*************************************************************

// #ifndef DOXYGEN_IGNORE

    /**
    \internal
    \brief Reference to an IInteger pointer
    \ingroup GenApi_PublicImpl
    */

    /** Reference to an IInteger pointer
     *  \ingroup GenApi_PublicImpl */

// #endif



// #pragma warning ( pop )

// #endif // ifndef GENAPI_IIINTEGER_H


// Parsed from <GenApi/IFloat.h>

//-----------------------------------------------------------------------------
//  (c) 2006 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//  Author:  Margret Albrecht
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
\brief    Definition of the IFloat interface
\ingroup GenApi_PublicInterface
*/

// #ifndef GENAPI_IFLOAT_H
// #define GENAPI_IFLOAT_H

// #include <GenApi/GenApiDll.h>
// #include <GenApi/Types.h>
// #include <GenApi/IValue.h>

// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY
    //*************************************************************
    // IFloat interface
    //*************************************************************

    /**
    \brief Interface for float properties
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class IFloat extends IValue {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IFloat(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(double Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(double Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IFloat put(double Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native double GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native double GetValue();

        /** Get node value */
        public native @Name("operator ()") double apply();

        /** Get node value */
        public native @Name("operator *") double multiply();

        /** Get minimum value allowed */
        public native double GetMin();

        /** Get maximum value allowed */
        public native double GetMax();

        /** True if the float has a constant increment */
        public native @Cast("bool") boolean HasInc();

        /** Get increment mode */
        public native @Cast("GenApi_3_0_Basler_pylon_v5_0::EIncMode") int GetIncMode();

        /** Get the constant increment if there is any */
        public native double GetInc();

        /** Get list of valid value */
        public native @ByVal double_autovector_t GetListOfValidValues( @Cast("bool") boolean bounded/*=true*/);
        public native @ByVal double_autovector_t GetListOfValidValues();

        /** Get recommended representation */
        public native @Cast("GenApi_3_0_Basler_pylon_v5_0::ERepresentation") int GetRepresentation();

        /** Get the physical unit name */
        public native @ByVal gcstring GetUnit();

        /** Get the way the float should be converted to a string */
        public native @Cast("GenApi_3_0_Basler_pylon_v5_0::EDisplayNotation") int GetDisplayNotation();

        /** Get the precision to be used when converting the float to a string */
        public native @Cast("int64_t") long GetDisplayPrecision();

        /** Restrict minimum value */
        public native void ImposeMin(double Value);

        /** Restrict maximum value */
        public native void ImposeMax(double Value);
    }

    //*************************************************************
    // CFloatRef class
    //*************************************************************

// #ifndef DOXYGEN_IGNORE

    /**
    \internal
    \brief Reference to an IEnumEntry pointer
    \ingroup GenApi_PublicImpl
    */

    /** Reference to an IFloat pointer
     *  \ingroup GenApi_PublicImpl */

// #endif



// #pragma warning ( pop )

// #endif // ifndef GENAPI_IFLOAT_H


// Parsed from <GenApi/IPort.h>

//-----------------------------------------------------------------------------
//  (c) 2006 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//  Author:  Margret Albrecht
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
\brief    Definition of interface IPort
\ingroup GenApi_PublicInterface
*/

// #ifndef GENAPI_IPORT_H
// #define GENAPI_IPORT_H

// #include <Base/GCException.h>
// #include <GenApi/GenApiDll.h>
// #include <GenApi/Types.h>
// #include <GenApi/IBase.h>

// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY
    //*************************************************************
    // IPort interface
    //*************************************************************

    /**
    \brief Interface for ports
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class IPort extends IBase {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IPort(Pointer p) { super(p); }
    
        /** Reads a chunk of bytes from the port */
        public native void Read(Pointer pBuffer, @Cast("int64_t") long Address, @Cast("int64_t") long Length);

        /** Writes a chunk of bytes to the port */
        public native void Write(@Const Pointer pBuffer, @Cast("int64_t") long Address, @Cast("int64_t") long Length);
    }

    //*************************************************************
    // CPortRef class
    //*************************************************************

// #ifndef DOXYGEN_IGNORE

    /**
    \internal
    \brief Reference to an IPort pointer
    \ingroup GenApi_PublicImpl
    */

    /** Reference to an IEnumEntry pointer
     *  \ingroup GenApi_PublicImpl */

// #endif



// #pragma warning ( pop )

// #endif // ifndef GENAPI_IPORT_H


// Parsed from <GenApi/INode.h>

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
\brief  Definition of interface INode and types NodeList_t and CallbackHandleType:
\ingroup GenApi_PublicInterface
*/


// #ifndef GENAPI_INODE_H
// #define GENAPI_INODE_H

// #include <Base/GCString.h>
// #include <GenApi/GenApiDll.h>
// #include <GenApi/Types.h>
// #include <GenApi/IBase.h>
// #include <GenApi/Container.h>

// #include <assert.h>

// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY

    /** a list of node references */

    /** the callback handle for nodes */

    @Namespace("GenApi_3_0_Basler_pylon_v5_0") @Opaque public static class CNodeCallback extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public CNodeCallback() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CNodeCallback(Pointer p) { super(p); }
    }

    //*************************************************************
    // INode interface
    //*************************************************************

    /**
    \brief Interface common to all nodes
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class INode extends IBase {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public INode(Pointer p) { super(p); }
    
        /** Get node name */
        public native @ByVal gcstring GetName(@Cast("bool") boolean FullQualified/*=false*/);
        public native @ByVal gcstring GetName();

        /** Get name space */
        public native @Cast("GenApi_3_0_Basler_pylon_v5_0::ENameSpace") int GetNameSpace();

        /** Get the recommended visibility of the node */
        public native @Cast("GenApi_3_0_Basler_pylon_v5_0::EVisibility") int GetVisibility();

        /** Indicates that the node's value may have changed.
        /** Fires the callback on this and all dependent nodes */
        public native void InvalidateNode();

        /** Is the node value cachable */
        public native @Cast("bool") boolean IsCachable();

        /** True if the AccessMode can be cached */
        public native @Cast("GenApi_3_0_Basler_pylon_v5_0::EYesNo") int IsAccessModeCacheable();

        /** Get Caching Mode */
        public native @Cast("GenApi_3_0_Basler_pylon_v5_0::ECachingMode") int GetCachingMode();

        /** recommended polling time (for not cachable nodes) */
        public native @Cast("int64_t") long GetPollingTime();

        /** Get a short description of the node */
        public native @ByVal gcstring GetToolTip();

        /** Get a long description of the node */
        public native @ByVal gcstring GetDescription();

        /** Get a name string for display */
        public native @ByVal gcstring GetDisplayName();

        /** Get a name of the device */
        public native @ByVal gcstring GetDeviceName();

        /**
        \brief Get all nodes this node directly depends on.
        @param [out] Children List of children nodes
        @param LinkType The link type
        */
        public native void GetChildren(@Cast("GenApi_3_0_Basler_pylon_v5_0::NodeList_t*") @ByRef Pointer Children, @Cast("GenApi_3_0_Basler_pylon_v5_0::ELinkType") int LinkType/*=GenApi_3_0_Basler_pylon_v5_0::ctReadingChildren*/);
        public native void GetChildren(@Cast("GenApi_3_0_Basler_pylon_v5_0::NodeList_t*") @ByRef Pointer Children);

        /**
        \brief Gets all nodes this node is directly depending on
        @param [out] Parents List of parent nodes
        */
        public native void GetParents(@Cast("GenApi_3_0_Basler_pylon_v5_0::NodeList_t*") @ByRef Pointer Parents);

        /** Register change callback
        /** Takes ownership of the CNodeCallback object */
        public native @Cast("GenApi_3_0_Basler_pylon_v5_0::CallbackHandleType") long RegisterCallback( CNodeCallback pCallback );

        /** De register change callback
        /** Destroys CNodeCallback object
        @return true if the callback handle was valid
        */
        public native @Cast("bool") boolean DeregisterCallback( @Cast("GenApi_3_0_Basler_pylon_v5_0::CallbackHandleType") long hCallback );

        /** Retrieves the central node map */
        public native INodeMap GetNodeMap();

        /** Get the EventId of the node */
        public native @ByVal gcstring GetEventID();

        /** True if the node is streamable */
        public native @Cast("bool") boolean IsStreamable();

        /** Returns a list of the names all properties set during initialization */
        public native void GetPropertyNames(@ByRef gcstring_vector PropertyNames);

        /** Retrieves a property plus an additional attribute by name
        /** If a property has multiple values/attribute they come with Tabs as delimiters */
        public native @Cast("bool") boolean GetProperty(@Const @ByRef gcstring PropertyName, @ByRef gcstring ValueStr, @ByRef gcstring AttributeStr);

        /** Imposes an access mode to the natural access mode of the node */
        public native void ImposeAccessMode(@Cast("GenApi_3_0_Basler_pylon_v5_0::EAccessMode") int ImposedAccessMode);

        /** Imposes a visibility  to the natural visibility of the node */
        public native void ImposeVisibility(@Cast("GenApi_3_0_Basler_pylon_v5_0::EVisibility") int ImposedVisibility);

        /** Retrieves the a node which describes the same feature in a different way */
        public native INode GetAlias();

        /** Retrieves the a node which describes the same feature so that it can be casted */
        public native INode GetCastAlias();

        /** Gets a URL pointing to the documentation of that feature */
        public native @ByVal gcstring GetDocuURL();

        /** True if the node should not be used any more */
        public native @Cast("bool") boolean IsDeprecated();

        /** Get the type of the main interface of a node */
        public native @Cast("GenApi_3_0_Basler_pylon_v5_0::EInterfaceType") int GetPrincipalInterfaceType();

        /** True if the node can be reached via category nodes from a category node named "Root" */
        public native @Cast("bool") boolean IsFeature();

    }

    /** \addtogroup GenApi_PublicInterface
     *  \{
     <p>
     *  Tests if readable */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static native @Cast("bool") boolean IsReadable( @Cast("GenApi_3_0_Basler_pylon_v5_0::EAccessMode") int AccessMode );

    /** Checks if a node is readable */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static native @Cast("bool") boolean IsReadable( @Const IBase p);

    /** Checks if a node is readable */

    /** Tests if writable */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static native @Cast("bool") boolean IsWritable( @Cast("GenApi_3_0_Basler_pylon_v5_0::EAccessMode") int AccessMode );

    /** Checks if a node is writable */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static native @Cast("bool") boolean IsWritable( @Const IBase p);

    /** Checks if a node is writable */

    /** Tests if implemented */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static native @Cast("bool") boolean IsImplemented( @Cast("GenApi_3_0_Basler_pylon_v5_0::EAccessMode") int AccessMode );

    /** Checks if a node is implemented */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static native @Cast("bool") boolean IsImplemented( @Const IBase p);

    /** Checks if a node is implemented */

    /** Tests if available */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static native @Cast("bool") boolean IsAvailable( @Cast("GenApi_3_0_Basler_pylon_v5_0::EAccessMode") int AccessMode );

    /** Checks if a node is available */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static native @Cast("bool") boolean IsAvailable( @Const IBase p);
    
    /** Checks if a node is available */

    /** Computes which access mode the two guards allow together */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static native @Cast("GenApi_3_0_Basler_pylon_v5_0::EAccessMode") int Combine(@Cast("GenApi_3_0_Basler_pylon_v5_0::EAccessMode") int Peter, @Cast("GenApi_3_0_Basler_pylon_v5_0::EAccessMode") int Paul);


    /** Tests Visibility
    /** CAVE : this relys on the EVisibility enum's coding */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static native @Cast("bool") boolean IsVisible( @Cast("GenApi_3_0_Basler_pylon_v5_0::EVisibility") int Visibility, @Cast("GenApi_3_0_Basler_pylon_v5_0::EVisibility") int MaxVisiblity );


    /** Computes which visibility the two guards allow together */


    /** Tests Cacheability */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static native @Cast("bool") boolean IsCacheable( @Cast("GenApi_3_0_Basler_pylon_v5_0::ECachingMode") int CachingMode );

    /** Computes which CachingMode results from a combination */

    /** \} */



// #pragma warning ( pop )

// #endif // ifndef GENAPI_INODE_H


// Parsed from <GenApi/IString.h>

//-----------------------------------------------------------------------------
//  (c) 2006 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//  Author:  Margret Albrecht
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
\brief    Definition of interface IString
\ingroup GenApi_PublicInterface
*/

// #ifndef GENAPI_ISTRING_H
// #define GENAPI_ISTRING_H

// #include <Base/GCString.h>
// #include <GenApi/GenApiDll.h>
// #include <GenApi/Types.h>
// #include <GenApi/IValue.h>

// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY
    //*************************************************************
    // IString interface
    //*************************************************************

    /**
    \brief Interface for string properties
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class IString extends IValue {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IString(Pointer p) { super(p); }
    
        /** Set node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetValue(@Const @ByRef gcstring Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Const @ByRef gcstring Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IString put(@Const @ByRef gcstring Value);

        /** Get node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @ByVal gcstring GetValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @ByVal gcstring GetValue();

        /** Get node value */
        public native @ByVal @Name("operator ()") gcstring apply();

        /** Get node value */
        public native @ByVal @Name("operator *") gcstring multiply();

        /** Retrieves the maximum length of the string in bytes */
        public native @Cast("int64_t") long GetMaxLength();

    }
    //*************************************************************
    // CStringRef class
    //*************************************************************

// #ifndef DOXYGEN_IGNORE

    /**
    \internal
    \brief Reference to an IEnumEntry pointer
    \ingroup GenApi_PublicImpl
    */

    /** Reference to an IString pointer
     *  \ingroup GenApi_PublicImpl */

// #endif



// #pragma warning ( pop )

// #endif // ifndef GENAPI_ISTRING_H


// Parsed from <GenApi/IRegister.h>

//-----------------------------------------------------------------------------
//  (c) 2006 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//  Author:  Margret Albrecht
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
\brief    Definition of RegisterList_t type and the interface IRegister
\ingroup GenApi_PublicInterface
*/

// #ifndef GENAPI_IREGISTER_H
// #define GENAPI_IREGISTER_H

// #include <GenApi/GenApiDll.h>
// #include <GenApi/Types.h>
// #include <GenApi/IValue.h>

// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY
    //*************************************************************
    // IRegister interface
    //*************************************************************

    /**
    \brief Interface for registers
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class IRegister extends IValue {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IRegister(Pointer p) { super(p); }
    
        /** Set the register's contents
        /**
        @param pBuffer The buffer containing the data to set
        @param Length The number of bytes in pBuffer
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void Set(@Cast("const uint8_t*") BytePointer pBuffer, @Cast("int64_t") long Length, @Cast("bool") boolean Verify/*=true*/);
        public native void Set(@Cast("const uint8_t*") BytePointer pBuffer, @Cast("int64_t") long Length);
        public native void Set(@Cast("const uint8_t*") ByteBuffer pBuffer, @Cast("int64_t") long Length, @Cast("bool") boolean Verify/*=true*/);
        public native void Set(@Cast("const uint8_t*") ByteBuffer pBuffer, @Cast("int64_t") long Length);
        public native void Set(@Cast("const uint8_t*") byte[] pBuffer, @Cast("int64_t") long Length, @Cast("bool") boolean Verify/*=true*/);
        public native void Set(@Cast("const uint8_t*") byte[] pBuffer, @Cast("int64_t") long Length);

        /** Fills a buffer with the register's contents
        /**
        @param pBuffer The buffer receiving the data to read
        @param Length The number of bytes to retrieve
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        */
        public native void Get(@Cast("uint8_t*") BytePointer pBuffer, @Cast("int64_t") long Length, @Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native void Get(@Cast("uint8_t*") BytePointer pBuffer, @Cast("int64_t") long Length);
        public native void Get(@Cast("uint8_t*") ByteBuffer pBuffer, @Cast("int64_t") long Length, @Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native void Get(@Cast("uint8_t*") ByteBuffer pBuffer, @Cast("int64_t") long Length);
        public native void Get(@Cast("uint8_t*") byte[] pBuffer, @Cast("int64_t") long Length, @Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native void Get(@Cast("uint8_t*") byte[] pBuffer, @Cast("int64_t") long Length);

        /** Retrieves the Length of the register [Bytes] */
        public native @Cast("int64_t") long GetLength();

        /** Retrieves the Address of the register */
        public native @Cast("int64_t") long GetAddress();
    }

    //*************************************************************
    // CRegisterRef class
    //*************************************************************


// #ifndef DOXYGEN_IGNORE

    /**
    \internal
    \brief Reference to an IRegister pointer
    \ingroup GenApi_PublicImpl
    */

    /** Reference to an IRegister pointer
     *  \ingroup GenApi_PublicImpl */

// #endif



// #pragma warning ( pop )

// #endif // ifndef GENAPI_IREGISTER_H


// Parsed from <GenApi/Synch.h>

//-----------------------------------------------------------------------------
//  (c) 2006 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//  Author:  Hartmut Nebelung
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
\brief    Definition of Lock classes
\ingroup GenApi_PublicImpl
*/

// #ifndef GENAPI_SYNCH_H
// #define GENAPI_SYNCH_H

// #include <GenApi/GenApiDll.h>
// #include <Base/GCException.h>

// #if defined (_WIN32)
// #   include <windows.h>
// #   include <winbase.h>
// #elif defined (__GNUC__) && (defined (__linux__) || defined (__APPLE__))
// #   include <pthread.h>
// #   include <errno.h>
// #   include <list>
// #elif defined(VXWORKS)
//    #include <vxworks.h>
//    #include <intLib.h>
//    #include <taskLib.h>
// #else
// #   error No/unknown platform thread support
// #endif

    //-----------------------------------------------------------------
    // CLock
    //-----------------------------------------------------------------

    /**
    \brief A lock class
    \ingroup GenApi_PublicImpl
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") @NoOffset public static class CLock extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CLock(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CLock(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CLock position(int position) {
            return (CLock)super.position(position);
        }
    
        /** Constructor */
        public CLock() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Destructor */

        /** tries to enter the critical section; returns true if successful */
        public native @Cast("bool") boolean TryLock();

        /** enters the critical section (may block) */
        public native void Lock();

        /** leaves the critical section */
        public native void Unlock();

    }


    /** This class is for testing purposes only. It should not be used for
     *  client code because it exists only for Windows but not for Linux
     *  since it uses internal data structures of a Win32 object */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class CLockEx extends CLock {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CLockEx(Pointer p) { super(p); }
    

// #       if defined (_WIN32)

            /** Gives access to internal data member for test and purposes */
            public native @Cast("int64_t") long GetLockCount();

            /** Gives access to internal data member for test and purposes */
            public native @Cast("int64_t") long GetRecursionCount();

// #       elif defined (__GNUC__) && (defined (__linux__) || defined (__APPLE__) || defined(VXWORKS))
            // nothing implemented for Unix
// #       else
// #           error No/unknown platform support

    }


    //-----------------------------------------------------------------
    // AutoLock
    //-----------------------------------------------------------------
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") @NoOffset public static class AutoLock extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public AutoLock(Pointer p) { super(p); }
    
        public AutoLock(@ByRef CLock lock) { super((Pointer)null); allocate(lock); }
        private native void allocate(@ByRef CLock lock);
    }


    //-----------------------------------------------------------------
    // template LockableObject<Object,ThreadingModel>
    //-----------------------------------------------------------------

    /**
    \brief Instance-Lock for an object
    \ingroup GenApi_PublicImpl
    */

 // namespace GenApi

// #endif // GENAPI_SYNCH_H


// Parsed from <GenApi/INodeMap.h>

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
\brief  Definition of interface INodeMap
\ingroup GenApi_PublicInterface
*/

// #ifndef GENAPI_INODEMAP_H
// #define GENAPI_INODEMAP_H

// #include <Base/GCBase.h>
// #include <GenApi/INode.h>
// #include <GenApi/IPort.h>
// #include <GenApi/Synch.h>


// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY

    //*************************************************************
    // INodeMap interface
    //*************************************************************

    /**
    \brief Interface to access the node map
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class INodeMap extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public INodeMap(Pointer p) { super(p); }
    
        /** Retrieves all nodes in the node map */
        public native void GetNodes(@Cast("GenApi_3_0_Basler_pylon_v5_0::NodeList_t*") @ByRef Pointer Nodes);

        /** Retrieves the node from the central map by Name */
        public native INode GetNode( @Const @ByRef gcstring Name);

        /** Invalidates all nodes */
        public native void InvalidateNodes();

        /** Connects a port to a port node with given name */
        public native @Cast("bool") boolean Connect( IPort pPort, @Const @ByRef gcstring PortName);

        /** Connects a port to the standard port "Device" */
        public native @Cast("bool") boolean Connect( IPort pPort);

        /** Get device name
        /** The device name identifies a device instance, e.g. for debuggin purposes.
        The default ist "Device". */
        public native @ByVal gcstring GetDeviceName();

        /** Fires nodes which have a polling time */
        public native void Poll( @Cast("int64_t") long ElapsedTime );

        /** Returns the lock which guards the node map */
        public native @ByRef CLock GetLock();

        /** Get the number of nodes in the map */
        public native @Cast("uint64_t") int GetNumNodes();
    }


// #pragma warning ( pop )

// #endif // ifndef GENAPI_INODEMAP_H


// Parsed from <GenApi/IEnumEntry.h>

//-----------------------------------------------------------------------------
//  (c) 2006 by Basler Vision Technologies
//  Section: Vision Components
//  Project: GenApi
//  Author:  Margret Albrecht
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
\ingroup GenApi_PublicInterface
*/

// #ifndef GENAPI_IENUMENTRY_H
// #define GENAPI_IENUMENTRY_H


// #include <Base/GCString.h>
// #include <GenApi/GenApiDll.h>
// #include <GenApi/IValue.h>

// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY

    //*************************************************************
    // IEnumEntry interface
    //*************************************************************

    /**
    \brief Interface of single enum value
    \ingroup GenApi_PublicInterface
    */
    /** Maps of Enum Values to symbolic values */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class IEnumEntry extends IValue {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumEntry(Pointer p) { super(p); }
    
        /** Get numeric enum value */
        public native @Cast("int64_t") long GetValue();

        /** Get symbolic enum value */
        public native @ByVal gcstring GetSymbolic();

        /** Get double number associated with the entry */
        public native double GetNumericValue();

        /** Indicates if the corresponding EnumEntry is self clearing */
        public native @Cast("bool") boolean IsSelfClearing();
    }

    //*************************************************************
    // CEnumEntryRef class
    //*************************************************************

// #ifndef DOXYGEN_IGNORE

    /**
    \internal
    \brief Reference to an IEnumEntry pointer
    \ingroup GenApi_PublicImpl
    */

    /** Reference to an IEnumEntry pointer
     *  \ingroup GenApi_PublicImpl */

// #endif



// #pragma warning ( pop )

// #endif // ifndef GENAPI_IENUMENTRY_H


// Parsed from <GenApi/IEnumeration.h>

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
\brief    Definition of interface IEnumeration
\ingroup GenApi_PublicInterface
*/

// #ifndef GENAPI_IENUMERATION_H
// #define GENAPI_IENUMERATION_H

// #include <Base/GCStringVector.h>
// #include <GenApi/GenApiDll.h>
// #include <GenApi/IEnumEntry.h>
// #include <GenApi/Types.h>
// #include <GenApi/IValue.h>

// #pragma warning ( push )
// #pragma warning ( disable : 4251 ) // XXX needs to have dll-interface to be used by clients of class YYY
    //*************************************************************
    // Enumeration interface
    //*************************************************************

    /**
    \brief Interface for enumeration properties
    \ingroup GenApi_PublicInterface
    */
    @Namespace("GenApi_3_0_Basler_pylon_v5_0") public static class IEnumeration extends IValue {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumeration(Pointer p) { super(p); }
    

        /** Get list of symbolic Values */
        public native void GetSymbolics(@Cast("GenApi_3_0_Basler_pylon_v5_0::StringList_t*") @ByRef gcstring_vector Symbolics);

        /** Get list of entry nodes */
        public native void GetEntries(@Cast("GenApi_3_0_Basler_pylon_v5_0::NodeList_t*") @ByRef Pointer Entries);

        /** Set string node value */
        public native @ByRef @Name("operator =") IEnumeration put(@Const @ByRef gcstring ValueStr);

        /** Set integer node value
        /**
        @param Value The value to set
        @param Verify Enables AccessMode and Range verification (default = true)
        */
        public native void SetIntValue(@Cast("int64_t") long Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetIntValue(@Cast("int64_t") long Value);

        /** Get string node value */
        public native @ByVal @Name("operator *") gcstring multiply();

        /** Get integer node value
        /**
        @param Verify Enables Range verification (default = false). The AccessMode is always checked
        @param IgnoreCache If true the value is read ignoring any caches (default = false)
        @return The value read
        */
        public native @Cast("int64_t") long GetIntValue(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @Cast("int64_t") long GetIntValue();

        /** Get an entry node by name */
        public native IEnumEntry GetEntryByName(@Const @ByRef gcstring Symbolic);

        /** Get an entry node by its IntValue */
        public native IEnumEntry GetEntry(@Cast("const int64_t") long IntValue);

        /** Get the current entry */
        public native IEnumEntry GetCurrentEntry(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native IEnumEntry GetCurrentEntry();

    }



// #pragma warning ( pop )

// #endif // ifndef GENAPI_IENUMERATION_H


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


}
