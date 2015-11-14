// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class GenICam3 extends org.bytedeco.javacpp.presets.GenICam3 {
    static { Loader.load(); }

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
public static native @MemberGetter int GC_W64();
public static final int GC_W64 = GC_W64();
// #       else
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
    @Namespace("GENICAM_NAMESPACE") public static class Version_t extends Pointer {
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
public static native @MemberGetter int GCSTRING_NPOS();
public static final int GCSTRING_NPOS = GCSTRING_NPOS();
    /**
    \brief A string class which is a clone of std::string
    \ingroup Base_PublicUtilities
    */
    @Namespace("GENICAM_NAMESPACE") @NoOffset public static class gcstring extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public gcstring(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public gcstring(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public gcstring position(int position) {
            return (gcstring)super.position(position);
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
// #       endif
        public native int compare( @Const @ByRef gcstring str );
// #       if defined(_MSC_VER) && !defined(PHARLAP_WIN32)
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
        public native @ByVal gcstring substr( @Cast("size_t") int offset/*=0*/, @Cast("size_t") int count/*=GCSTRING_NPOS*/ );
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
    }

    // this is necessary due to the circular dependency between string/exception
    @Namespace("GENICAM_NAMESPACE") public static native void ThrowBadAlloc(@Cast("const char*") BytePointer source, int line);
    @Namespace("GENICAM_NAMESPACE") public static native void ThrowBadAlloc(String source, int line);

    /** STL getline
     *  \ingroup Base_PublicUtilities */
    @Namespace("GENICAM_NAMESPACE") public static native @Cast("std::istream*") @ByRef Pointer getline(@Cast("std::istream*") @ByRef Pointer is, @ByRef gcstring str);

    /** STL getline
     *  \ingroup Base_PublicUtilities */
    @Namespace("GENICAM_NAMESPACE") public static native @Cast("std::istream*") @ByRef Pointer getline(@Cast("std::istream*") @ByRef Pointer is, @ByRef gcstring str, @Cast("char") byte delim);




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
    @Namespace("GENICAM_NAMESPACE") @NoOffset public static class gcstring_vector extends Pointer {
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
        public gcstring_vector(@Cast("size_t") int uiSize, @Const @ByRef(nullValue = "GENICAM_NAMESPACE::gcstring()") gcstring str/*=GENICAM_NAMESPACE::gcstring()*/) { super((Pointer)null); allocate(uiSize, str); }
        private native void allocate(@Cast("size_t") int uiSize, @Const @ByRef(nullValue = "GENICAM_NAMESPACE::gcstring()") gcstring str/*=GENICAM_NAMESPACE::gcstring()*/);
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
        public native void resize(@Cast("size_t") int uiSize, @Const @ByRef(nullValue = "GENICAM_NAMESPACE::gcstring()") gcstring str/*=GENICAM_NAMESPACE::gcstring()*/);
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


}
