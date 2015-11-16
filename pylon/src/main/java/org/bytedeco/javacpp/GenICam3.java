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
    @Namespace("GENAPI_NAMESPACE") @NoOffset public static class int64_autovector_t extends Pointer {
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
    @Namespace("GENAPI_NAMESPACE") @NoOffset public static class double_autovector_t extends Pointer {
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
    @Namespace("GENAPI_NAMESPACE") public static class IReference extends Pointer {
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
    @Namespace("GENAPI_NAMESPACE") public static class IEnumReference extends Pointer {
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
    @Name("GENAPI_NAMESPACE::CReferenceT<GENAPI_NAMESPACE::IInteger,GENAPI_NAMESPACE::IInteger>") @NoOffset public static class CReferenceTInteger extends IInteger {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CReferenceTInteger(Pointer p) { super(p); }
        public IReference asIReference() { return asIReference(this); }
        @Namespace public static native @Name("static_cast<GENAPI_NAMESPACE::IReference*>") IReference asIReference(CReferenceTInteger pointer);
    
        // Constructor

        /*--------------------------------------------------------*/
        // IReference
        /*--------------------------------------------------------*/

        /** sets the implementation to the reference */
        public native void SetReference( IBase ptr );
    }



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
    @Namespace("GENAPI_NAMESPACE") public static class IBase extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IBase(Pointer p) { super(p); }
    
        /** Get the access mode of the node */
        public native @Cast("GENAPI_NAMESPACE::EAccessMode") int GetAccessMode();

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
    @Name("GENAPI_NAMESPACE::CBaseRefT<GENAPI_NAMESPACE::IInteger,GENAPI_NAMESPACE::IInteger>") public static class CBaseRefTInteger extends CReferenceTInteger {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CBaseRefTInteger(Pointer p) { super(p); }
    
        /*--------------------------------------------------------*/
        // IBase
        /*--------------------------------------------------------*/

        /** Get the access mode of the node */
        public native @Cast("GENAPI_NAMESPACE::EAccessMode") int GetAccessMode();

    }

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
    @Namespace("GENAPI_NAMESPACE") public static class IValue extends IBase {
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
    @Name("GENAPI_NAMESPACE::CValueRefT<GENAPI_NAMESPACE::IInteger,GENAPI_NAMESPACE::IInteger>") public static class CValueRefTInteger extends CBaseRefTInteger {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CValueRefTInteger(Pointer p) { super(p); }
    
        /*--------------------------------------------------------*/
        // IValue
        /*--------------------------------------------------------*/

        /** Get the INode interface of the node */
        public native INode GetNode();

        /** Get content of the node as string */
        public native @ByVal gcstring ToString(@Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/);
        public native @ByVal gcstring ToString();

        /** Set content of the node as string */
        public native void FromString(@Const @ByRef gcstring ValueStr, @Cast("bool") boolean Verify/*=true*/);
        public native void FromString(@Const @ByRef gcstring ValueStr);

        /** Checks if the value comes from cache or is requested from another node */
        public native @Cast("bool") boolean IsValueCacheValid();
    }

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
    @Namespace("GENAPI_NAMESPACE") public static class IBoolean extends IValue {
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
    @Namespace("GENAPI_NAMESPACE") public static class IInteger extends IValue {
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
        public native @Cast("GENAPI_NAMESPACE::EIncMode") int GetIncMode();

        /** Get increment */
        public native @Cast("int64_t") long GetInc();

        /** Get list of valid value */
        public native @ByVal int64_autovector_t GetListOfValidValues(@Cast("bool") boolean bounded/*=true*/);
        public native @ByVal int64_autovector_t GetListOfValidValues();

        /** Get recommended representation */
        public native @Cast("GENAPI_NAMESPACE::ERepresentation") int GetRepresentation();

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
    @Name("GENAPI_NAMESPACE::CIntegerRefT<GENAPI_NAMESPACE::IInteger,GENAPI_NAMESPACE::IInteger>") public static class CIntegerRef extends CValueRefTInteger {
        static { Loader.load(); }
        /** Default native constructor. */
        public CIntegerRef() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CIntegerRef(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CIntegerRef(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public CIntegerRef position(int position) {
            return (CIntegerRef)super.position(position);
        }
    
        /*--------------------------------------------------------*/
        // IInteger
        /*--------------------------------------------------------*/

        /** Set node value */
        public native void SetValue(@Cast("int64_t") long Value, @Cast("bool") boolean Verify/*=true*/);
        public native void SetValue(@Cast("int64_t") long Value);

        /** Set node value */
        public native @ByRef @Name("operator =") IInteger put(@Cast("int64_t") long Value);

        /** Get node value */
        public native @Cast("int64_t") long GetValue( @Cast("bool") boolean Verify/*=false*/, @Cast("bool") boolean IgnoreCache/*=false*/ );
        public native @Cast("int64_t") long GetValue( );

        /** Get node value */
        public native @Cast("int64_t") @Name("operator ()") long apply();

        /** Get node value */
        public native @Cast("int64_t") @Name("operator *") long multiply();

        /** Get minimum value allowed */
        public native @Cast("int64_t") long GetMin();

        /** Get maximum value allowed */
        public native @Cast("int64_t") long GetMax();

        /** Get increment */
        public native @Cast("GENAPI_NAMESPACE::EIncMode") int GetIncMode();

        /** Get increment */
        public native @Cast("int64_t") long GetInc();

        /** Implementation of IInteger::GetListOfValidValues */
        public native @ByVal int64_autovector_t GetListOfValidValues(@Cast("bool") boolean bounded/*=true*/);
        public native @ByVal int64_autovector_t GetListOfValidValues();

        /** Get recommended representation */
        public native @Cast("GENAPI_NAMESPACE::ERepresentation") int GetRepresentation();

        /** Get the physical unit name */
        public native @ByVal gcstring GetUnit();

        /** gets the interface of an alias node. */
        public native IFloat GetFloatAlias();

        /** Restrict minimum value */
        public native void ImposeMin(@Cast("int64_t") long Value);

        /** Restrict maximum value */
        public native void ImposeMax(@Cast("int64_t") long Value);

    }

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
    @Namespace("GENAPI_NAMESPACE") public static class IFloat extends IValue {
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
        public native @Cast("GENAPI_NAMESPACE::EIncMode") int GetIncMode();

        /** Get the constant increment if there is any */
        public native double GetInc();

        /** Get list of valid value */
        public native @ByVal double_autovector_t GetListOfValidValues( @Cast("bool") boolean bounded/*=true*/);
        public native @ByVal double_autovector_t GetListOfValidValues();

        /** Get recommended representation */
        public native @Cast("GENAPI_NAMESPACE::ERepresentation") int GetRepresentation();

        /** Get the physical unit name */
        public native @ByVal gcstring GetUnit();

        /** Get the way the float should be converted to a string */
        public native @Cast("GENAPI_NAMESPACE::EDisplayNotation") int GetDisplayNotation();

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
    @Namespace("GENAPI_NAMESPACE") @Opaque public static class IEnumeration extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public IEnumeration() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IEnumeration(Pointer p) { super(p); }
    }

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
    @Namespace("GENAPI_NAMESPACE") public static class IPort extends IBase {
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
    @Namespace("GENAPI_NAMESPACE") @Opaque public static class INodeMap extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public INodeMap() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public INodeMap(Pointer p) { super(p); }
    }

    /** a list of node references */

    /** the callback handle for nodes */

    @Namespace("GENAPI_NAMESPACE") @Opaque public static class CNodeCallback extends Pointer {
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
    @Namespace("GENAPI_NAMESPACE") public static class INode extends IBase {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public INode(Pointer p) { super(p); }
    
        /** Get node name */
        public native @ByVal gcstring GetName(@Cast("bool") boolean FullQualified/*=false*/);
        public native @ByVal gcstring GetName();

        /** Get name space */
        public native @Cast("GENAPI_NAMESPACE::ENameSpace") int GetNameSpace();

        /** Get the recommended visibility of the node */
        public native @Cast("GENAPI_NAMESPACE::EVisibility") int GetVisibility();

        /** Indicates that the node's value may have changed.
        /** Fires the callback on this and all dependent nodes */
        public native void InvalidateNode();

        /** Is the node value cachable */
        public native @Cast("bool") boolean IsCachable();

        /** True if the AccessMode can be cached */
        public native @Cast("GENAPI_NAMESPACE::EYesNo") int IsAccessModeCacheable();

        /** Get Caching Mode */
        public native @Cast("GENAPI_NAMESPACE::ECachingMode") int GetCachingMode();

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
        public native void GetChildren(@Cast("GENAPI_NAMESPACE::NodeList_t*") @ByRef Pointer Children, @Cast("GENAPI_NAMESPACE::ELinkType") int LinkType/*=ctReadingChildren*/);
        public native void GetChildren(@Cast("GENAPI_NAMESPACE::NodeList_t*") @ByRef Pointer Children);

        /**
        \brief Gets all nodes this node is directly depending on
        @param [out] Parents List of parent nodes
        */
        public native void GetParents(@Cast("GENAPI_NAMESPACE::NodeList_t*") @ByRef Pointer Parents);

        /** Register change callback
        /** Takes ownership of the CNodeCallback object */
        public native @Cast("GENAPI_NAMESPACE::CallbackHandleType") long RegisterCallback( CNodeCallback pCallback );

        /** De register change callback
        /** Destroys CNodeCallback object
        @return true if the callback handle was valid
        */
        public native @Cast("bool") boolean DeregisterCallback( @Cast("GENAPI_NAMESPACE::CallbackHandleType") long hCallback );

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
        public native void ImposeAccessMode(@Cast("GENAPI_NAMESPACE::EAccessMode") int ImposedAccessMode);

        /** Imposes a visibility  to the natural visibility of the node */
        public native void ImposeVisibility(@Cast("GENAPI_NAMESPACE::EVisibility") int ImposedVisibility);

        /** Retrieves the a node which describes the same feature in a different way */
        public native INode GetAlias();

        /** Retrieves the a node which describes the same feature so that it can be casted */
        public native INode GetCastAlias();

        /** Gets a URL pointing to the documentation of that feature */
        public native @ByVal gcstring GetDocuURL();

        /** True if the node should not be used any more */
        public native @Cast("bool") boolean IsDeprecated();

        /** Get the type of the main interface of a node */
        public native @Cast("GENAPI_NAMESPACE::EInterfaceType") int GetPrincipalInterfaceType();

        /** True if the node can be reached via category nodes from a category node named "Root" */
        public native @Cast("bool") boolean IsFeature();

    }

    /** \addtogroup GenApi_PublicInterface
     *  \{

     *  Tests if readable */
    @Namespace("GENAPI_NAMESPACE") public static native @Cast("bool") boolean IsReadable( @Cast("GENAPI_NAMESPACE::EAccessMode") int AccessMode );

    /** Checks if a node is readable */
    @Namespace("GENAPI_NAMESPACE") public static native @Cast("bool") boolean IsReadable( @Const IBase p);

    /** Checks if a node is readable */

    /** Tests if writable */
    @Namespace("GENAPI_NAMESPACE") public static native @Cast("bool") boolean IsWritable( @Cast("GENAPI_NAMESPACE::EAccessMode") int AccessMode );

    /** Checks if a node is writable */
    @Namespace("GENAPI_NAMESPACE") public static native @Cast("bool") boolean IsWritable( @Const IBase p);

    /** Checks if a node is writable */

    /** Tests if implemented */
    @Namespace("GENAPI_NAMESPACE") public static native @Cast("bool") boolean IsImplemented( @Cast("GENAPI_NAMESPACE::EAccessMode") int AccessMode );

    /** Checks if a node is implemented */
    @Namespace("GENAPI_NAMESPACE") public static native @Cast("bool") boolean IsImplemented( @Const IBase p);

    /** Checks if a node is implemented */

    /** Tests if available */
    @Namespace("GENAPI_NAMESPACE") public static native @Cast("bool") boolean IsAvailable( @Cast("GENAPI_NAMESPACE::EAccessMode") int AccessMode );

    /** Checks if a node is available */
    @Namespace("GENAPI_NAMESPACE") public static native @Cast("bool") boolean IsAvailable( @Const IBase p);
    
    /** Checks if a node is available */

    /** Computes which access mode the two guards allow together */
    @Namespace("GENAPI_NAMESPACE") public static native @Cast("GENAPI_NAMESPACE::EAccessMode") int Combine(@Cast("GENAPI_NAMESPACE::EAccessMode") int Peter, @Cast("GENAPI_NAMESPACE::EAccessMode") int Paul);


    /** Tests Visibility
    /** CAVE : this relys on the EVisibility enum's coding */
    @Namespace("GENAPI_NAMESPACE") public static native @Cast("bool") boolean IsVisible( @Cast("GENAPI_NAMESPACE::EVisibility") int Visibility, @Cast("GENAPI_NAMESPACE::EVisibility") int MaxVisiblity );


    /** Computes which visibility the two guards allow together */


    /** Tests Cacheability */
    @Namespace("GENAPI_NAMESPACE") public static native @Cast("bool") boolean IsCacheable( @Cast("GENAPI_NAMESPACE::ECachingMode") int CachingMode );

    /** Computes which CachingMode results from a combination */

    /** \} */



// #pragma warning ( pop )

// #endif // ifndef GENAPI_INODE_H


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
    @Namespace("GENAPI_NAMESPACE") @NoOffset public static class CLock extends Pointer {
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
    @Namespace("GENAPI_NAMESPACE") public static class CLockEx extends CLock {
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
    @Namespace("GENAPI_NAMESPACE") @NoOffset public static class AutoLock extends Pointer {
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


}
