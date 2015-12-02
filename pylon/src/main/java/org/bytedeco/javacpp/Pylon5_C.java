// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.GenICam3.*;

public class Pylon5_C extends org.bytedeco.javacpp.presets.Pylon5_C {
    static { Loader.load(); }

// Parsed from <genapic/GenApiCDefines.h>

/**
  \file
  \brief    Platform-dependent macro definitions.
 */
// #ifndef GenApiCDefines_h__
// #define GenApiCDefines_h__

// #if defined (_MSC_VER) || defined (__BORLANDC__)
/** Will be set when building for windows platforms. */
// #   define GENAPIC_WIN_BUILD
// #elif defined (__GNUC__) && defined (__linux__)
/** Will be set when building for linux platforms. */
// #   define GENAPIC_LINUX_BUILD
// #else
// #  error Unsupported platform
// #endif

// #if defined (GENAPIC_WIN_BUILD)
// #elif defined (GENAPIC_LINUX_BUILD)
// #    define GENAPIC_API
// #    define GENAPIC_CC
// #    define OUT_PAR
// #    define IN_OUT_PAR
// #    define STRING_PAR
// #    define CONST_PAR
// #    define IDL_ENTRY( _module, _entry, _help )
// #    define IDL_PUBLIC
public static final int GENAPIC_PACKING = 8;
// #else
// #  error Unsupported platform
// #endif

// #ifndef _HRESULT_DEFINED
// #define _HRESULT_DEFINED
// #endif // !_HRESULT_DEFINED

// #define PINVOKE
// #define PINVOKE_DOC
// #define PINVOKE_RETVAL_PAR
// #define PINVOKEAT(entryPoint)

// #endif // GenApiCDefines_h__


// Parsed from <genapic/GenApiCEnums.h>

// #ifndef GENAPICENUMS_H_INCLUDED
// #define GENAPICENUMS_H_INCLUDED

// #include <genapic/GenApiCDefines.h>

/**
 * \file
 * \brief GenApi enumeration types.
 *
 * Definitions of enumerated types used by GenApi C functions.
 */

/**
  * \addtogroup genapi GenApi Interface
 * \{
  */

/**
 * \brief Node type.
 */
/** enum EGenApiNodeType */
public static final int
    /** \brief Node represents an integer-valued parameter. */
    IntegerNode = 0,
    /** \brief Node represents a boolean (true/false) parameter. */
    BooleanNode = 1,
    /** \brief Node represents a floating point-valued parameter. */
    FloatNode = 2,
    /** \brief Node can trigger a command. */
    CommandNode = 3,
    /** \brief Node represents a string-valued parameter. */
    StringNode = 4,
    /** \brief Node represents an enumeration-valued parameter. */
    EnumerationNode = 5,
    /** \brief Node represents an 'enumeration entry' parameter. */
    EnumEntryNode = 6,
    /** \brief Node for grouping parameters in a category. */
    Category = 7,
    /** \brief Node type invalid. */
    _UnknownNodeType    = -1;

/**
 * \brief Access mode of a node.
 */
/** enum EGenApiAccessMode */
public static final int
    /** \brief Not implemented. */
    NI = 0,
    /** \brief Not available. */
    NA = 1,
    /** \brief Write Only.*/
    WO = 2,
    /** \brief Read Only. */
    RO = 3,
    /** \brief Read and Write. */
    RW = 4,
    /** \brief Access mode invalid. */
    _UndefinedAccesMode  = -1;

/**
 * \brief Node name spaces.
 */
/** enum EGenApiNameSpace */
public static final int
    /** \brief Name resides in custom name space. */
    Custom = 0,
    /** \brief Name resides in one of the standard name spaces. */
    Standard = 1,
    /** \brief Name space invalid. */
    _UndefinedNameSpace = -1;

/**
 * \brief Node visibility.
 */
/** enum EGenApiVisibility */
public static final int
    /** \brief Visible to everyone. */
    Beginner = 0,
    /** \brief Visible to experts or gurus only. */
    Expert = 1,
    /** \brief Visible to gurus only. */
    Guru = 2,
    /** \brief Not visible at all. */
    Invisible = 3,
    /** \brief Visibility invalid. */
    _UndefinedVisibility  = -1;

/**
 * \brief Node caching modes.
 */
/** enum EGenApiCachingMode */
public static final int
    /** \brief Do not use cache. */
    NoCache = 0,
    /** \brief Write to cache and register. */
    WriteThrough = 1,
    /** \brief Write to register, write to cache on read. */
    WriteAround = 2,
    /** \brief Caching mode invalid. */
    _UndefinedCachingMode = -1;

/**
 * \brief Node representation.
 */
/** enum EGenApiRepresentation */
public static final int
    /** \brief Slider with linear behavior. */
    Linear = 0,
    /** \brief Slider with logarithmic behavior. */
    Logarithmic = 1,
    /** \brief Checkbox. */
    Boolean = 2,
    /** \brief Decimal number in an edit control. */
    PureNumber = 3,
    /** \brief Hex number in an edit control. */
    HexNumber = 4,
    /** \brief Representation invalid. */
    _UndefinedRepresentation = -1;

/**
 * \brief File access modes.
 */
/** enum EGenApiFileAccessMode */
public static final int
    /** \brief For specifying file read access on file open. */
    GenApiFileReadAccess = 0,
    /** \brief For specifying file write access on file open. */
    GenApiFileWriteAccess = 1;

/**
  * \}
  */

// #endif


// Parsed from <genapic/GenApiCModule.h>

// #ifndef GENAPI_GENAPICMODULE_H_
// #define GENAPI_GENAPICMODULE_H_

/* doxygen comments removed intentionally */

// #if defined( GENAPIC_EXPORTS )

// #endif


// #endif


// Parsed from <genapic/GenApiCTypes.h>

/*-----------------------------------------------------------------------------
    Basler pylon C SDK
    Copyright (c) 2009-2015 Basler AG
    http://www.baslerweb.com
    Author:  AH, TK
-----------------------------------------------------------------------------*/

/**
 * \file
 * \brief    Platform-dependent type definitions.
 * Define a subset of the types and macros that are provided by the
 * stdint.h header on systems that comply with the C99 standard. This
 * is meant to aid in portability.
**/

// #ifndef GENAPIC_TYPES_H
// #define GENAPIC_TYPES_H

// #if __STDC_VERSION__ >= 199901L

/* Compiler is c99-compliant. */
// #   define  __STDC_LIMIT_MACROS
// #   define  __STDC_CONSTANT_MACROS
// #   include <inttypes.h>
// #   include <stdint.h>

// #elif defined (_WIN32)

// #   if defined(_MSC_VER) && _MSC_VER >= 1600
// VS2010 provides stdint.h
// #     include <stdint.h>
// #   else
// #     ifndef _STDINT // only define if not already done
/** Portable 8 bit-wide signed integer type. */
/** Portable 8 bit-wide unsigned integer type. */

/** Portable 16 bit-wide signed integer type. */
/** Portable 16 bit-wide unsigned integer type. */

/** Portable 32 bit-wide signed integer type. */
/** Portable 32 bit-wide unsigned integer type. */

/** Portable 64 bit-wide signed integer type. */
/** Portable 64 bit-wide unsigned integer type. */

// #if defined(_WIN64)
/** Portable signed integer type capable of holding a pointer. */
/** Portable unsigned integer type capable of holding a pointer. */
// #else
/** Portable signed integer type capable of holding a pointer. */
/** Portable unsigned integer type capable of holding a pointer. */
// #endif

// #      endif // _STDINT
// #    endif // _MSC_VER >= 1600


/** Mimic c99 built-in _Bool type. */
// #if defined(__cplusplus)
/* for C++ builds use the same typedef as in <yvals.h> */
// #  if defined(_MSC_VER)
// #  endif
// #else
/* for VC Version >= 1800 : bool is now a proper type and you can�t create identifiers with that name */
// #   if (defined(_MSC_VER) && _MSC_VER <= 1700) || defined(__BORLANDC__)
// #   endif
// #endif



// #else
// #   error No platform-specific type definitions
// #endif /* __STDC_VERSION__ >= 199901L */



// #ifndef INT64_MAX
public static native @MemberGetter long INT64_MAX();
public static final long INT64_MAX = INT64_MAX();    /* Maximum signed int64 value. */
// #endif

// #ifndef INT64_MIN
public static native @MemberGetter long INT64_MIN();
public static final long INT64_MIN = INT64_MIN();    /* Minimum signed int64 value. */
// #endif

// #ifndef UINT64_MAX
public static native @MemberGetter long UINT64_MAX();
public static final long UINT64_MAX = UINT64_MAX();   /* Maximum unsigned int64 value. */
// #endif

// #ifndef INT32_MAX
public static native @MemberGetter long INT32_MAX();
public static final long INT32_MAX = INT32_MAX();    /* Maximum signed int32 value. */
// #endif

// #ifndef INT32_MIN
public static native @MemberGetter long INT32_MIN();
public static final long INT32_MIN = INT32_MIN();    /* Minimum signed int32 value. */
// #endif

// #ifndef UINT32_MAX
public static native @MemberGetter long UINT32_MAX();
public static final long UINT32_MAX = UINT32_MAX();   /* Maximum unsigned int32 value. */
// #endif

// #ifndef INT8_MAX
public static native @MemberGetter long INT8_MAX();
public static final long INT8_MAX = INT8_MAX();    /* Maximum signed int8 value. */
// #endif

// #ifndef INT8_MIN
public static native @MemberGetter long INT8_MIN();
public static final long INT8_MIN = INT8_MIN();    /* Minimum signed int8 value. */
// #endif

// #ifndef UINT8_MAX
public static native @MemberGetter long UINT8_MAX();
public static final long UINT8_MAX = UINT8_MAX();   /* Maximum unsigned int8 value. */
// #endif

// #ifdef PYLONC_BOOL_DEFINED
// #undef _Bool
// #undef PYLONC_BOOL_DEFINED
// #endif


// #endif /* GENAPIC_TYPES_H */


// Parsed from <genapic/GenApiC.h>

/*-----------------------------------------------------------------------------
    Basler pylon C SDK
    Copyright (c) 2009-2015 Basler AG
    http://www.baslerweb.com
    Author:  AH, TK
-----------------------------------------------------------------------------*/

/**
  \file
  \brief GenApi C bindings.
*/

// #ifndef GENAPI_GENAPIC_H_
// #define GENAPI_GENAPIC_H_

// #include <stddef.h>

// #include <genapic/GenApiCDefines.h>

// #ifdef _MSC_VER
// #   pragma pack(push, GENAPIC_PACKING)
// #endif /* _MSC_VER */

// #include <genapic/GenApiCTypes.h>
// #include <genapic/GenApiCEnums.h>
// #include <genapic/GenApiCError.h>
// #include <genapic/GenApiCModule.h>

// #if defined GENAPIC_EXPORTS
// #endif

// #if defined GENAPIC_EXPORTS
// #endif

// #if defined( GENAPIC_EXPORTS )
// #else
// #   define GENAPIC_DECLARE_HANDLE(name)
//         struct name##_; typedef struct name##_ *name
// #endif

/**
  * \addtogroup genapi GenApi Interface
  * \{
  */

/** \brief A value for invalid / uninitialized handles. */
// #ifdef __cplusplus
// #else
public static native @MemberGetter int GENAPIC_INVALID_HANDLE();
public static final int GENAPIC_INVALID_HANDLE = GENAPIC_INVALID_HANDLE();
// #endif

@Opaque public static class NODE_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public NODE_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NODE_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class NODEMAP_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public NODEMAP_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NODEMAP_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class GENAPI_FILE_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public GENAPI_FILE_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GENAPI_FILE_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class NODE_CALLBACK_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public NODE_CALLBACK_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NODE_CALLBACK_HANDLE__(Pointer p) { super(p); }
}

/**
 * \}
 */


// #ifdef __cplusplus
// #endif /* __cplusplus */

public static class NodeCallbackFunction_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    NodeCallbackFunction_t(Pointer p) { super(p); }
    protected NodeCallbackFunction_t() { allocate(); }
    private native void allocate();
    public native void call(@ByVal @Cast("NODE_HANDLE*") Pointer h);
}


/*
 * ----------------------------------------------------------------------------
 * Error handling
 * ----------------------------------------------------------------------------
 */

// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiGetLastErrorMessage( @Cast("char*") BytePointer pBuf, @Cast("size_t*") IntPointer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiGetLastErrorMessage( @Cast("char*") ByteBuffer pBuf, @Cast("size_t*") IntBuffer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiGetLastErrorMessage( @Cast("char*") byte[] pBuf, @Cast("size_t*") int[] pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiGetLastErrorDetail( @Cast("char*") BytePointer pBuf, @Cast("size_t*") IntPointer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiGetLastErrorDetail( @Cast("char*") ByteBuffer pBuf, @Cast("size_t*") IntBuffer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiGetLastErrorDetail( @Cast("char*") byte[] pBuf, @Cast("size_t*") int[] pBufLen );
// #endif



public static native @Cast("GENAPIC_RESULT") long GenApiNodeMapGetNode( @ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("const char*") BytePointer pName, @Cast("NODE_HANDLE*") Pointer phNode );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeMapGetNode( @ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, String pName, @Cast("NODE_HANDLE*") Pointer phNode );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeMapGetNumNodes( @ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("size_t*") IntPointer pValue);
public static native @Cast("GENAPIC_RESULT") long GenApiNodeMapGetNumNodes( @ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("size_t*") IntBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long GenApiNodeMapGetNumNodes( @ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("size_t*") int[] pValue);

public static native @Cast("GENAPIC_RESULT") long GenApiNodeMapGetNodeByIndex( @ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("size_t") int index, @Cast("NODE_HANDLE*") Pointer phNode );

// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiNodeMapPoll( @ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("int64_t") long timestamp );
// #endif

public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetAccessMode( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiAccessMode*") IntPointer pAccessMode );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetAccessMode( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiAccessMode*") IntBuffer pAccessMode );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetAccessMode( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiAccessMode*") int[] pAccessMode );

// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetName( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") BytePointer pBuf, @Cast("size_t*") IntPointer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetName( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") ByteBuffer pBuf, @Cast("size_t*") IntBuffer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetName( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") byte[] pBuf, @Cast("size_t*") int[] pBufLen );
// #endif

public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetNameSpace( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiNameSpace*") IntPointer pNamespace );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetNameSpace( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiNameSpace*") IntBuffer pNamespace );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetNameSpace( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiNameSpace*") int[] pNamespace );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetVisibility( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiVisibility*") IntPointer pVisibility );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetVisibility( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiVisibility*") IntBuffer pVisibility );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetVisibility( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiVisibility*") int[] pVisibility );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeInvalidateNode( @ByVal @Cast("NODE_HANDLE*") Pointer hNode );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetCachingMode( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiCachingMode*") IntPointer pCachingMode );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetCachingMode( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiCachingMode*") IntBuffer pCachingMode );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetCachingMode( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiCachingMode*") int[] pCachingMode );

// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetToolTip( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") BytePointer pBuf, @Cast("size_t*") IntPointer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetToolTip( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") ByteBuffer pBuf, @Cast("size_t*") IntBuffer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetToolTip( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") byte[] pBuf, @Cast("size_t*") int[] pBufLen );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetDescription( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") BytePointer pBuf, @Cast("size_t*") IntPointer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetDescription( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") ByteBuffer pBuf, @Cast("size_t*") IntBuffer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetDescription( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") byte[] pBuf, @Cast("size_t*") int[] pBufLen );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetDisplayName( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") BytePointer pBuf, @Cast("size_t*") IntPointer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetDisplayName( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") ByteBuffer pBuf, @Cast("size_t*") IntBuffer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetDisplayName( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") byte[] pBuf, @Cast("size_t*") int[] pBufLen );
// #endif

public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetType( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiNodeType*") IntPointer pType );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetType( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiNodeType*") IntBuffer pType );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetType( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiNodeType*") int[] pType );

// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetPollingTime( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") LongPointer pPollingTime );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetPollingTime( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") LongBuffer pPollingTime );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetPollingTime( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") long[] pPollingTime );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeRegisterCallback( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, NodeCallbackFunction_t pCbFunction, @Cast("NODE_CALLBACK_HANDLE*") Pointer phCb );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeDeregisterCallback( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @ByVal @Cast("NODE_CALLBACK_HANDLE*") Pointer hCb );
// #endif



public static native @Cast("GENAPIC_RESULT") long GenApiNodeImposeAccessMode( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiAccessMode") int imposedAccessMode );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeImposeVisibility( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiVisibility") int imposedVisibility );


/* IValue */
// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiNodeToString( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") BytePointer pBuf, @Cast("size_t*") IntPointer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeToString( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") ByteBuffer pBuf, @Cast("size_t*") IntBuffer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeToString( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") byte[] pBuf, @Cast("size_t*") int[] pBufLen );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeToStringEx( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean verify, @Cast("char*") BytePointer pBuf, @Cast("size_t*") IntPointer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeToStringEx( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean verify, @Cast("char*") ByteBuffer pBuf, @Cast("size_t*") IntBuffer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeToStringEx( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean verify, @Cast("char*") byte[] pBuf, @Cast("size_t*") int[] pBufLen );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeFromStringEx( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean verify, @Cast("const char*") BytePointer pString );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeFromStringEx( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean verify, String pString );
// #endif

public static native @Cast("GENAPIC_RESULT") long GenApiNodeFromString( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("const char*") BytePointer pString );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeFromString( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, String pString );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeGetAlias( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("NODE_HANDLE*") Pointer phNode );

/* IInteger */
// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiIntegerSetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t") long value );

public static native @Cast("GENAPIC_RESULT") long GenApiIntegerSetValueEx( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean verify, @Cast("int64_t") long value );

public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") LongPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") LongBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") long[] pValue );

public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetValueEx( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean verify, @Cast("int64_t*") LongPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetValueEx( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean verify, @Cast("int64_t*") LongBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetValueEx( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean verify, @Cast("int64_t*") long[] pValue );

public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetMin( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") LongPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetMin( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") LongBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetMin( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") long[] pValue );

public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetMax( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") LongPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetMax( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") LongBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetMax( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") long[] pValue );

public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetInc( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") LongPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetInc( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") LongBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetInc( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("int64_t*") long[] pValue );
// #endif

public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetRepresentation( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiRepresentation*") IntPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetRepresentation( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiRepresentation*") IntBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiIntegerGetRepresentation( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiRepresentation*") int[] pValue );

/* IBoolean */
// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiBooleanSetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean value );

public static native @Cast("GENAPIC_RESULT") long GenApiBooleanGetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool*") BoolPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiBooleanGetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool*") boolean[] pValue );
// #endif

/* IFloat */
public static native @Cast("GENAPIC_RESULT") long GenApiFloatSetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, double value );

// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiFloatSetValueEx( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean verify, double value );
// #endif

public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, DoublePointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, DoubleBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, double[] pValue );

// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetValueEx( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean verify, DoublePointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetValueEx( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean verify, DoubleBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetValueEx( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool") boolean verify, double[] pValue );
// #endif

public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetMin( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, DoublePointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetMin( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, DoubleBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetMin( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, double[] pValue );

public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetMax( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, DoublePointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetMax( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, DoubleBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetMax( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, double[] pValue );

public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetRepresentation( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiRepresentation*") IntPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetRepresentation( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiRepresentation*") IntBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetRepresentation( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("EGenApiRepresentation*") int[] pValue );

// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetUnit( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") BytePointer pBuf, @Cast("size_t*") IntPointer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetUnit( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") ByteBuffer pBuf, @Cast("size_t*") IntBuffer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiFloatGetUnit( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") byte[] pBuf, @Cast("size_t*") int[] pBufLen );
// #endif

/* ICommand */
public static native @Cast("GENAPIC_RESULT") long GenApiCommandExecute( @ByVal @Cast("NODE_HANDLE*") Pointer hNode );

// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiCommandIsDone( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool*") BoolPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiCommandIsDone( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool*") boolean[] pValue );
// #endif

/* IEnumeration */
public static native @Cast("GENAPIC_RESULT") long GenApiEnumerationGetNumEntries( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t*") IntPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiEnumerationGetNumEntries( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t*") IntBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiEnumerationGetNumEntries( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t*") int[] pValue );

public static native @Cast("GENAPIC_RESULT") long GenApiEnumerationGetEntryByIndex( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t") int index, @Cast("NODE_HANDLE*") Pointer pEntry );

public static native @Cast("GENAPIC_RESULT") long GenApiEnumerationGetEntryByName( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("const char*") BytePointer pName, @Cast("NODE_HANDLE*") Pointer pEntry );
public static native @Cast("GENAPIC_RESULT") long GenApiEnumerationGetEntryByName( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, String pName, @Cast("NODE_HANDLE*") Pointer pEntry );

/* IEnumEntry */
public static native @Cast("GENAPIC_RESULT") long GenApiEnumerationEntryGetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, IntPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiEnumerationEntryGetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, IntBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiEnumerationEntryGetValue( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, int[] pValue );

// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiEnumerationEntryGetSymbolic( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") BytePointer pBuf, @Cast("size_t*") IntPointer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiEnumerationEntryGetSymbolic( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") ByteBuffer pBuf, @Cast("size_t*") IntBuffer pBufLen );
public static native @Cast("GENAPIC_RESULT") long GenApiEnumerationEntryGetSymbolic( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("char*") byte[] pBuf, @Cast("size_t*") int[] pBufLen );
// #endif

/* Convenience */
// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiNodeIsImplemented( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool*") BoolPointer pResult );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeIsImplemented( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool*") boolean[] pResult );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeIsReadable( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool*") BoolPointer pResult );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeIsReadable( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool*") boolean[] pResult );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeIsWritable( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool*") BoolPointer pResult );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeIsWritable( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool*") boolean[] pResult );

public static native @Cast("GENAPIC_RESULT") long GenApiNodeIsAvailable( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool*") BoolPointer pResult );
public static native @Cast("GENAPIC_RESULT") long GenApiNodeIsAvailable( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("_Bool*") boolean[] pResult );
// #endif

/* Category */
public static native @Cast("GENAPIC_RESULT") long GenApiCategoryGetNumFeatures( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t*") IntPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiCategoryGetNumFeatures( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t*") IntBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiCategoryGetNumFeatures( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t*") int[] pValue );

public static native @Cast("GENAPIC_RESULT") long GenApiCategoryGetFeatureByIndex( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t") int index, @Cast("NODE_HANDLE*") Pointer phEntry );



/* IPort */
// #ifndef GENAPIC_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long GenApiPortRead(@ByVal @Cast("NODE_HANDLE*") Pointer hNode, Pointer pBuffer, @Cast("int64_t") long Address, @Cast("size_t") int Length);

public static native @Cast("GENAPIC_RESULT") long GenApiPortWrite(@ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Const Pointer pBuffer, @Cast("int64_t") long Address, @Cast("size_t") int Length);
// #endif

// #ifndef GENAPIC_TLB_ONLY
/* DeviceFileStream */
public static native @Cast("GENAPIC_RESULT") long GenApiFilesAreSupported( @ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("_Bool*") BoolPointer pResult);
public static native @Cast("GENAPIC_RESULT") long GenApiFilesAreSupported( @ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("_Bool*") boolean[] pResult);

public static native @Cast("GENAPIC_RESULT") long GenApiFileExists( @ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("const char*") BytePointer pFileName, @Cast("_Bool*") BoolPointer pResult);
public static native @Cast("GENAPIC_RESULT") long GenApiFileExists( @ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, String pFileName, @Cast("_Bool*") boolean[] pResult);
// #endif

public static native @Cast("GENAPIC_RESULT") long GenApiFileOpen( @ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("const char*") BytePointer pFileName, @Cast("EGenApiFileAccessMode") int accessMode, @Cast("GENAPI_FILE_HANDLE*") Pointer phFile);
public static native @Cast("GENAPIC_RESULT") long GenApiFileOpen( @ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, String pFileName, @Cast("EGenApiFileAccessMode") int accessMode, @Cast("GENAPI_FILE_HANDLE*") Pointer phFile);

public static native @Cast("GENAPIC_RESULT") long GenApiFileRead( @ByVal @Cast("GENAPI_FILE_HANDLE*") Pointer hFile, Pointer pBuffer, @Cast("size_t*") IntPointer pLength);
public static native @Cast("GENAPIC_RESULT") long GenApiFileRead( @ByVal @Cast("GENAPI_FILE_HANDLE*") Pointer hFile, Pointer pBuffer, @Cast("size_t*") IntBuffer pLength);
public static native @Cast("GENAPIC_RESULT") long GenApiFileRead( @ByVal @Cast("GENAPI_FILE_HANDLE*") Pointer hFile, Pointer pBuffer, @Cast("size_t*") int[] pLength);

public static native @Cast("GENAPIC_RESULT") long GenApiFileWrite( @ByVal @Cast("GENAPI_FILE_HANDLE*") Pointer hFile, @Const Pointer pBuffer, @Cast("size_t") int length);

public static native @Cast("GENAPIC_RESULT") long GenApiFileClose( @ByVal @Cast("GENAPI_FILE_HANDLE*") Pointer hFile);

/* ISelector*/

public static native @Cast("GENAPIC_RESULT") long GenApiSelectorGetNumSelectingFeatures( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t*") IntPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiSelectorGetNumSelectingFeatures( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t*") IntBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiSelectorGetNumSelectingFeatures( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t*") int[] pValue );

public static native @Cast("GENAPIC_RESULT") long GenApiSelectorGetSelectingFeatureByIndex( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t") int index, @Cast("NODE_HANDLE*") Pointer phNode );

public static native @Cast("GENAPIC_RESULT") long GenApiSelectorGetNumSelectedFeatures( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t*") IntPointer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiSelectorGetNumSelectedFeatures( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t*") IntBuffer pValue );
public static native @Cast("GENAPIC_RESULT") long GenApiSelectorGetNumSelectedFeatures( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t*") int[] pValue );

public static native @Cast("GENAPIC_RESULT") long GenApiSelectorGetSelectedFeatureByIndex( @ByVal @Cast("NODE_HANDLE*") Pointer hNode, @Cast("size_t") int index, @Cast("NODE_HANDLE*") Pointer phNode );


// #ifdef __cplusplus

// #endif /* __cplusplus */

// #include <genapic/GenApiC32BitMethods.h>

// #ifdef _MSC_VER
// #   pragma pack(pop)
// #endif /* _MSC_VER */

// #endif


// Parsed from <pylonc/PylonC32BitMethods.h>

/*-----------------------------------------------------------------------------
    Basler pylon C SDK
    Copyright (c) 2009-2015 Basler AG
    http://www.baslerweb.com
    Author:  AH, TK
-----------------------------------------------------------------------------*/

// #ifndef PylonC32BitMethods_h__
// #define PylonC32BitMethods_h__

// #include <genapic/GenApiCDefines.h>
// #include <genapic/GenApiCTypes.h>

// #include <pylonc/PylonCDefines.h>
// #pragma pack(push, PYLONC_PACKING)

// #include <pylonc/PylonC.h>

/**
  \file
  \brief pylon C bindings - 32 bit functions.
*/


// #ifdef __cplusplus
// #endif /* __cplusplus */

public static native @Cast("GENAPIC_RESULT") long PylonDeviceSetIntegerFeatureInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, @Cast("const char*") BytePointer name, @Cast("int32_t") int value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceSetIntegerFeatureInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, String name, @Cast("int32_t") int value);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, @Cast("const char*") BytePointer name, @Cast("int32_t*") IntPointer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, String name, @Cast("int32_t*") IntBuffer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, @Cast("const char*") BytePointer name, @Cast("int32_t*") int[] value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, String name, @Cast("int32_t*") IntPointer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, @Cast("const char*") BytePointer name, @Cast("int32_t*") IntBuffer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, String name, @Cast("int32_t*") int[] value);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMinInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, @Cast("const char*") BytePointer name, @Cast("int32_t*") IntPointer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMinInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, String name, @Cast("int32_t*") IntBuffer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMinInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, @Cast("const char*") BytePointer name, @Cast("int32_t*") int[] value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMinInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, String name, @Cast("int32_t*") IntPointer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMinInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, @Cast("const char*") BytePointer name, @Cast("int32_t*") IntBuffer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMinInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, String name, @Cast("int32_t*") int[] value);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMaxInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, @Cast("const char*") BytePointer name, @Cast("int32_t*") IntPointer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMaxInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, String name, @Cast("int32_t*") IntBuffer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMaxInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, @Cast("const char*") BytePointer name, @Cast("int32_t*") int[] value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMaxInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, String name, @Cast("int32_t*") IntPointer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMaxInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, @Cast("const char*") BytePointer name, @Cast("int32_t*") IntBuffer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMaxInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, String name, @Cast("int32_t*") int[] value);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureIncInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, @Cast("const char*") BytePointer name, @Cast("int32_t*") IntPointer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureIncInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, String name, @Cast("int32_t*") IntBuffer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureIncInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, @Cast("const char*") BytePointer name, @Cast("int32_t*") int[] value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureIncInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, String name, @Cast("int32_t*") IntPointer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureIncInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, @Cast("const char*") BytePointer name, @Cast("int32_t*") IntBuffer value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureIncInt32(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer dev, String name, @Cast("int32_t*") int[] value);

// #ifdef __cplusplus
// #endif /* __cplusplus */

// #pragma pack(pop)

// #endif // PylonC32BitMethods_h__


// Parsed from <pylonc/PylonCEnums.h>

// #ifndef PYLON_ENUMS_H
// #define PYLON_ENUMS_H

// #include <genapic/GenApiCDefines.h>

/**
 * \file
 * \brief pylon enumeration types.
 *
 * Definitions of enumerated types used by pylon C functions.
 */

/**
 * \addtogroup pylon pylon Interface
 * \{
 */

/**
 * \brief The reason why a wait operation terminated.
 */
/** enum EPylonWaitExResult */
public static final int
    /** \brief The time-out interval elapsed */
    waitex_timeout    = 0,
    /** \brief The wait operation completed successfully */
    waitex_signaled   = 1,
    /** \brief Windows only (see MSDN for more information) */
    waitex_abandoned  = 2,
    /** \brief The wait was interrupted (Windows: queued APC or I/O completion routine; UNIX: signal) */
    waitex_alerted    = -1;

/**
 * \brief The grab status.
 */
/** enum EPylonGrabStatus */
public static final int
    /** \brief status not defined */
    UndefinedGrabStatus = -1,
    /** \brief currently not used */
    Idle = 0,
    /** \brief in the input queue */
    Queued = 1,
    /** \brief filled with data */
    Grabbed = 2,
    /** \brief request was canceled */
    Canceled = 3,
    /** \brief request failed */
    Failed = 4;

/**
  * \brief PayloadType for PylonGrabResult_t
  */
/** enum EPylonPayloadType */
public static final int
    /** \brief The buffer content is undefined. */
    PayloadType_Undefined = -1,
    /** \brief The buffer contains image data. */
    PayloadType_Image = 0,
    /** \brief The buffer contains raw data. */
    PayloadType_RawData = 1,
    /** \brief The buffer contains file data. */
    PayloadType_File = 2,
    /** \brief The buffer contains chunk data. */
    PayloadType_ChunkData = 3,
    /** \brief The buffer contains device specific data. */
    PayloadType_DeviceSpecific =  0x8000;

public static final int PIXEL_MONO =          0x01000000;
public static final int PIXEL_COLOR =         0x02000000;
// #define PIXEL_BIT_COUNT(n)  ((n) << 16)

/** \brief List all possible pixel formats. See the camera User's Manual for a detailed description of the available pixel formats. */
/** enum EPylonPixelType */
public static final int
    /** \brief Indicates that the pixel format is undefined or not valid. */
    PixelType_Undefined         = -1,
    /** \brief Indicates the Mono 8 pixel format. */
    PixelType_Mono8             =  PIXEL_MONO | ((8) << 16)  | 0x0001,
    /** \brief Indicates the Mono 8 Signed pixel format. */
    PixelType_Mono8signed       =  PIXEL_MONO | ((8) << 16)  | 0x0002,
    /** \brief Indicates the Mono 10 pixel format. */
    PixelType_Mono10            =  PIXEL_MONO | ((16) << 16) | 0x0003,
    /** \brief Indicates the Mono 10 Packed pixel format. The memory layout of PixelType_Mono10packed and PixelType_Mono10p is different*/
    PixelType_Mono10packed      =  PIXEL_MONO | ((12) << 16) | 0x0004,
    /** \brief Indicates the Mono10p pixel format. The memory layout of PixelType_Mono10packed and PixelType_Mono10p is different*/
    PixelType_Mono10p           =  PIXEL_MONO | ((10) << 16) | 0x0046,
    /** \brief Indicates the Mono 12 pixel format. */
    PixelType_Mono12            =  PIXEL_MONO | ((16) << 16) | 0x0005,
    /** \brief Indicates the Mono 12 Packed pixel format. The memory layout of PixelType_Mono12packed and PixelType_Mono12p is different.*/
    PixelType_Mono12packed      =  PIXEL_MONO | ((12) << 16) | 0x0006,
    /** \brief Indicates the Mono12p pixel format. The memory layout of PixelType_Mono12packed and PixelType_Mono12p is different.*/
    PixelType_Mono12p           =  PIXEL_MONO | ((12) << 16) | 0x0047,
    /** \brief Indicates the Mono 16 pixel format. */
    PixelType_Mono16            =  PIXEL_MONO | ((16) << 16) | 0x0007,

    /** \brief Indicates the Bayer GR 8 pixel format. */
    PixelType_BayerGR8          =  PIXEL_MONO | ((8) << 16)  | 0x0008,
    /** \brief Indicates the Bayer RG 8 pixel format. */
    PixelType_BayerRG8          =  PIXEL_MONO | ((8) << 16)  | 0x0009,
    /** \brief Indicates the Bayer GB 8 pixel format. */
    PixelType_BayerGB8          =  PIXEL_MONO | ((8) << 16)  | 0x000a,
    /** \brief Indicates the Bayer BG 8 pixel format. */
    PixelType_BayerBG8          =  PIXEL_MONO | ((8) << 16)  | 0x000b,

    /** \brief Indicates the Bayer GR 10 pixel format. */
    PixelType_BayerGR10         =  PIXEL_MONO | ((16) << 16) | 0x000c,
    /** \brief Indicates the Bayer RG 10 pixel format. */
    PixelType_BayerRG10         =  PIXEL_MONO | ((16) << 16) | 0x000d,
    /** \brief Indicates the Bayer GB 10 pixel format. */
    PixelType_BayerGB10         =  PIXEL_MONO | ((16) << 16) | 0x000e,
    /** \brief Indicates the Bayer BG 10 pixel format. */
    PixelType_BayerBG10         =  PIXEL_MONO | ((16) << 16) | 0x000f,

    /** \brief Indicates the Bayer GR 12 pixel format. */
    PixelType_BayerGR12         =  PIXEL_MONO | ((16) << 16) | 0x0010,
    /** \brief Indicates the Bayer RG 12 pixel format. */
    PixelType_BayerRG12         =  PIXEL_MONO | ((16) << 16) | 0x0011,
    /** \brief Indicates the Bayer GB 12 pixel format. */
    PixelType_BayerGB12         =  PIXEL_MONO | ((16) << 16) | 0x0012,
    /** \brief Indicates the Bayer BG 12 pixel format. */
    PixelType_BayerBG12         =  PIXEL_MONO | ((16) << 16) | 0x0013,

    /** \brief Indicates the RGB 8 Packed pixel format. */
    PixelType_RGB8packed        =  PIXEL_COLOR | ((24) << 16) | 0x0014,
    /** \brief Indicates the BGR 8 Packed pixel format. */
    PixelType_BGR8packed        =  PIXEL_COLOR | ((24) << 16) | 0x0015,

    /** \brief Indicates the RGBA 8 Packed pixel format. */
    PixelType_RGBA8packed       =  PIXEL_COLOR | ((32) << 16) | 0x0016,
    /** \brief Indicates the BGRA 8 Packed pixel format. */
    PixelType_BGRA8packed       =  PIXEL_COLOR | ((32) << 16) | 0x0017,

    /** \brief Indicates the RGB 10 Packed pixel format. */
    PixelType_RGB10packed       =  PIXEL_COLOR | ((48) << 16) | 0x0018,
    /** \brief Indicates the BGR 10 Packed pixel format. */
    PixelType_BGR10packed       =  PIXEL_COLOR | ((48) << 16) | 0x0019,

    /** \brief Indicates the RGB 12 Packed pixel format. */
    PixelType_RGB12packed       =  PIXEL_COLOR | ((48) << 16) | 0x001a,
    /** \brief Indicates the BGR 12 Packed pixel format. */
    PixelType_BGR12packed       =  PIXEL_COLOR | ((48) << 16) | 0x001b,

    /** \brief Indicates the RGB 16 Packed pixel format. */
    PixelType_RGB16packed       =  PIXEL_COLOR | ((48) << 16) | 0x0033,

    /** \brief Indicates the BGR 10 V1 Packed pixel format. */
    PixelType_BGR10V1packed     =  PIXEL_COLOR | ((32) << 16) | 0x001c,
    /** \brief Indicates the BGR 10 V2 Packed pixel format. */
    PixelType_BGR10V2packed     =  PIXEL_COLOR | ((32) << 16) | 0x001d,

    /** \brief Indicates the YUV 411 Packed pixel format. */
    PixelType_YUV411packed      =  PIXEL_COLOR | ((12) << 16) | 0x001e,
    /** \brief Indicates the YUV 422 Packed pixel format. */
    PixelType_YUV422packed      =  PIXEL_COLOR | ((16) << 16) | 0x001f,
    /** \brief Indicates the YUV 444 Packed pixel format. */
    PixelType_YUV444packed      =  PIXEL_COLOR | ((24) << 16) | 0x0020,

    /** \brief Indicates the RGB 8 Planar pixel format. */
    PixelType_RGB8planar        =  PIXEL_COLOR | ((24) << 16) | 0x0021,
    /** \brief Indicates the RGB 10 Planar pixel format. */
    PixelType_RGB10planar       =  PIXEL_COLOR | ((48) << 16) | 0x0022,
    /** \brief Indicates the RGB 12 Planar pixel format. */
    PixelType_RGB12planar       =  PIXEL_COLOR | ((48) << 16) | 0x0023,
    /** \brief Indicates the RGB 16 Planar pixel format. */
    PixelType_RGB16planar       =  PIXEL_COLOR | ((48) << 16) | 0x0024,

    /** \brief Indicates the YUV 422 (YUYV) Packed pixel format. */
    PixelType_YUV422_YUYV_Packed =  PIXEL_COLOR | ((16) << 16) | 0x0032,

    /** \brief Indicates the Bayer GR 12 Packed pixel format. The memory layout of PixelType_BayerGR12Packed and PixelType_BayerGR12p is different.*/
    PixelType_BayerGR12Packed =  PIXEL_MONO | ((12) << 16) | 0x002A,
    /** \brief Indicates the Bayer RG 12 Packed pixel format. The memory layout of PixelType_BayerRG12Packed and PixelType_BayerRG12p is different.*/
    PixelType_BayerRG12Packed =  PIXEL_MONO | ((12) << 16) | 0x002B,
    /** \brief Indicates the Bayer GB 12 Packed pixel format. The memory layout of PixelType_BayerGB12Packed and PixelType_BayerGB12p is different.*/
    PixelType_BayerGB12Packed =  PIXEL_MONO | ((12) << 16) | 0x002C,
    /** \brief Indicates the Bayer BG 12 Packed pixel format. The memory layout of PixelType_BayerBG12Packed and PixelType_BayerBG12p is different.*/
    PixelType_BayerBG12Packed =  PIXEL_MONO | ((12) << 16) | 0x002D,

    /** \brief Indicates the BayerGR10p pixel format. */
    PixelType_BayerGR10p      =  PIXEL_MONO | ((10) << 16) | 0x0056,
    /** \brief Indicates the BayerRG10p pixel format. */
    PixelType_BayerRG10p      =  PIXEL_MONO | ((10) << 16) | 0x0058,
    /** \brief Indicates the BayerGB10p pixel format. */
    PixelType_BayerGB10p      =  PIXEL_MONO | ((10) << 16) | 0x0054,
    /** \brief Indicates the BayerBG10p pixel format. */
    PixelType_BayerBG10p      =  PIXEL_MONO | ((10) << 16) | 0x0052,

    /** \brief Indicates the BayerGR12p pixel format. The memory layout of PixelType_BayerGR12Packed and PixelType_BayerGR12p is different.*/
    PixelType_BayerGR12p      =  PIXEL_MONO | ((12) << 16) | 0x0057,
    /** \brief Indicates the BayerRG12p pixel format. The memory layout of PixelType_BayerRG12Packed and PixelType_BayerRG12p is different.*/
    PixelType_BayerRG12p      =  PIXEL_MONO | ((12) << 16) | 0x0059,
    /** \brief Indicates the BayerGB12p pixel format. The memory layout of PixelType_BayerGB12Packed and PixelType_BayerGB12p is different.*/
    PixelType_BayerGB12p      =  PIXEL_MONO | ((12) << 16) | 0x0055,
    /** \brief Indicates the BayerBG12p pixel format. The memory layout of PixelType_BayerBG12Packed and PixelType_BayerBG12p is different.*/
    PixelType_BayerBG12p      =  PIXEL_MONO | ((12) << 16) | 0x0053,

    /** \brief Indicates the Bayer GR 16 pixel format. */
    PixelType_BayerGR16       =  PIXEL_MONO | ((16) << 16) | 0x002E,
    /** \brief Indicates the Bayer RG 16 pixel format. */
    PixelType_BayerRG16       =  PIXEL_MONO | ((16) << 16) | 0x002F,
    /** \brief Indicates the Bayer GB 16 pixel format. */
    PixelType_BayerGB16       =  PIXEL_MONO | ((16) << 16) | 0x0030,
    /** \brief Indicates the Bayer BG 16 pixel format. */
    PixelType_BayerBG16       =  PIXEL_MONO | ((16) << 16) | 0x0031,

    /** \brief Indicates the RGB 12 V1 packed pixel format. */
    PixelType_RGB12V1packed   =  PIXEL_COLOR | ((36) << 16) | 0X0034,

    // custom codes
    /** \brief Indicates the Double pixel format. */
    PixelType_Double            =   0x80000000 | PIXEL_MONO | ((48) << 16) | 0x100;

// #ifndef PYLON_TLB_ONLY

/** \brief Lists the available file formats */
/** enum EPylonImageFileFormat */
public static final int
    /** \brief Windows Bitmap, no compression. */
    ImageFileFormat_Bmp = 0,
    /** \brief Tagged Image File Format, no compression, supports mono images with more than 8 bit bit depth. */
    ImageFileFormat_Tiff = 1,
    /** \brief Joint Photographic Experts Group, lossy data compression. */
    ImageFileFormat_Jpeg = 2,
    /** \brief Portable Network Graphics, lossless data compression. */
    ImageFileFormat_Png = 3;

/** \brief Defines the vertical orientation of an image in memory. */
/** enum EPylonImageOrientation */
public static final int
    /** \brief The first row of the image is located at the start of the image buffer. This is the default for images taken by a camera. */
    ImageOrientation_TopDown = 0,
    /** \brief The last row of the image is located at the start of the image buffer. */
    ImageOrientation_BottomUp = 1;

/** \brief Lists the possibilities for selecting a key frame when using compression. */
/** enum EPylonKeyFrameSelection */
public static final int
    /** \brief Indicates that an image is not a key frame. */
    KeyFrameSelection_NoKeyFrame = 0,
    /** \brief Indicates that an image is a key frame. */
    KeyFrameSelection_KeyFrame = 1,
    /** \brief Every nth frame is a key frame. The value of n is specified by passing its value in the SAviCompressionOptions in the autoKeyFrameInsertionRate member when opening the AVI Writer. */
    KeyFrameSelection_Auto = 2;

/** \brief Lists the possibilities for selecting a show window command. */
/** enum EPylonShowWindow */
public static final int
    /** \brief Same as SW_HIDE in WinUser.h */
    EPylonShowWindow_SW_HIDE            = 0,
    /** \brief Same as SW_SHOWNORMAL and SW_NORMAL in WinUser.h */
    EPylonShowWindow_SW_SHOWNORMAL      = 1,
    /** \brief Same as SW_SHOWMINIMIZED in WinUser.h */
    EPylonShowWindow_SW_SHOWMINIMIZED   = 2,
    /** \brief Same as SW_SHOWMAXIMIZED and SW_MAXIMIZE in WinUser.h */
    EPylonShowWindow_SW_SHOWMAXIMIZED   = 3,
    /** \brief Same as SW_SHOWNOACTIVATE in WinUser.h */
    EPylonShowWindow_SW_SHOWNOACTIVATE  = 4,
    /** \brief Same as SW_SHOWNOACTIVATE in WinUser.h */
    EPylonShowWindow_SW_SHOW            = 5,
    /** \brief Same as SW_MINIMIZE in WinUser.h */
    EPylonShowWindow_SW_MINIMIZE        = 6,
    /** \brief Same as SW_SHOWMINNOACTIVE in WinUser.h */
    EPylonShowWindow_SW_SHOWMINNOACTIVE = 7,
    /** \brief Same as SW_SHOWNA in WinUser.h */
    EPylonShowWindow_SW_SHOWNA          = 8,
    /** \brief Same as SW_RESTORE in WinUser.h */
    EPylonShowWindow_SW_RESTORE         = 9,
    /** \brief Same as SW_SHOWDEFAULT in WinUser.h */
    EPylonShowWindow_SW_SHOWDEFAULT     = 10,
    /** \brief Same as SW_FORCEMINIMIZE in WinUser.h */
    EPylonShowWindow_SW_FORCEMINIMIZE   = 11;

/**
\if forC
  \brief Lists possible status codes returned by PylonGigEIssueActionCommand() or PylonGigEIssueScheduledActionCommand().
\else
  \brief Lists possible status codes returned by Pylon.GigEIssueActionCommand() or Pylon.GigEIssueScheduledActionCommand().
\endif
*/
/** enum EPylonGigEActionCommandStatus */
public static final int
    /**
    \brief The device acknowledged the command.
    */
    PylonGigEActionCommandStatus_Ok = 0,

    /**
    \brief The device is not synchronized to a master clock to be used as time reference.
    Typically used when scheduled action commands cannot be scheduled for
    a future time since the reference time coming from IEEE 1588 is not locked.
    The action command has been ignored by the device.
    */
    PylonGigEActionCommandStatus_NoRefTime = -519995373,

    /**
    \brief Returned when the scheduled action commands queue is full and the device cannot accept the additional request.
    The action command has been discarded by the device.
    */
    PylonGigEActionCommandStatus_Overflow = -519995371,

    /**
    \brief The requested scheduled action command was requested at a point in time that is in the past.
    If the time tag of the scheduled action command is in the past (relative to the device timestamp), and if it is a valid action
    command, then the device will execute this action command immediately and return \c PylonGigEActionCommandStatus_ActionLate.
    This status code is used as an indicator to the application requesting the action command that a mis-synchronization might have
    occurred.
    */
    PylonGigEActionCommandStatus_ActionLate = -519995370;

// #endif

/**
 * \}
 */

// #endif /* PYLON_ENUMS_H */


// Parsed from <pylonc/PylonC.h>

/*-----------------------------------------------------------------------------
    Basler pylon C SDK
    Copyright (c) 2009-2015 Basler AG
    http://www.baslerweb.com
    Author:  AH, TK
-----------------------------------------------------------------------------*/

// #ifndef PYLONC_PYLONC_H_
// #define PYLONC_PYLONC_H_

/**
  \file
  \brief pylon C bindings
*/


// #include <stdio.h>   /* for FILENAME_MAX */
// #include <genapic/GenApiCDefines.h>
// #ifdef GENAPIC_WIN_BUILD
// #   ifndef RPC_NO_WINDOWS_H
// #       define RPC_NO_WINDOWS_H // otherwise <rpcasync.h> generates warnings on VC6
// #       define RPC_NO_WINDOWS_H_DEFINED_BY_PYLONC
// #   endif
// #   include <windows.h> /* thread api needs windows headers */
// #endif
// #include <genapic/GenApiC.h>

// #include <pylonc/PylonCDefines.h>
// #pragma pack(push, PYLONC_PACKING)

// #include <pylonc/PylonCModule.h>
// #include <pylonc/PylonCError.h>
// #include <pylonc/PylonCEnums.h>

// #if defined PYLONC_EXPORTS
// #endif


// #ifdef __cplusplus
// #endif /* __cplusplus */

/** \addtogroup pylon pylon Interface
 * \{
 */

/* pylon invalid handle type */
public static final int PYLONC_INVALID_HANDLE = GENAPIC_INVALID_HANDLE;

/* pylon device access modes */
public static final int PYLONC_ACCESS_MODE_MONITOR =      0;
public static final int PYLONC_ACCESS_MODE_CONTROL =      (1 << 0);
public static final int PYLONC_ACCESS_MODE_STREAM =       (1 << 1);
public static final int PYLONC_ACCESS_MODE_EVENT =        (1 << 2);
public static final int PYLONC_ACCESS_MODE_EXCLUSIVE =    (1 << 3);

/* pylon handle types */
@Opaque public static class PYLON_DEVICE_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PYLON_DEVICE_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PYLON_DEVICE_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class PYLON_DEVICE_INFO_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PYLON_DEVICE_INFO_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PYLON_DEVICE_INFO_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class PYLON_STREAMGRABBER_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PYLON_STREAMGRABBER_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PYLON_STREAMGRABBER_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class PYLON_EVENTGRABBER_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PYLON_EVENTGRABBER_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PYLON_EVENTGRABBER_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class PYLON_CHUNKPARSER_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PYLON_CHUNKPARSER_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PYLON_CHUNKPARSER_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class PYLON_EVENTADAPTER_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PYLON_EVENTADAPTER_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PYLON_EVENTADAPTER_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class PYLON_WAITOBJECT_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PYLON_WAITOBJECT_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PYLON_WAITOBJECT_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class PYLON_WAITOBJECTS_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PYLON_WAITOBJECTS_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PYLON_WAITOBJECTS_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class PYLON_STREAMBUFFER_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PYLON_STREAMBUFFER_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PYLON_STREAMBUFFER_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class PYLON_DEVICECALLBACK_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PYLON_DEVICECALLBACK_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PYLON_DEVICECALLBACK_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class PYLON_FORMAT_CONVERTER_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PYLON_FORMAT_CONVERTER_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PYLON_FORMAT_CONVERTER_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class PYLON_IMAGE_FORMAT_CONVERTER_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PYLON_IMAGE_FORMAT_CONVERTER_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PYLON_IMAGE_FORMAT_CONVERTER_HANDLE__(Pointer p) { super(p); }
}
@Opaque public static class PYLON_AVI_WRITER_HANDLE__ extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PYLON_AVI_WRITER_HANDLE__() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PYLON_AVI_WRITER_HANDLE__(Pointer p) { super(p); }
}

/** \brief pylon device removal callback handler type. */
public static class PylonDeviceRemCb_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PylonDeviceRemCb_t(Pointer p) { super(p); }
    protected PylonDeviceRemCb_t() { allocate(); }
    private native void allocate();
    public native void call(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer h);
}


// #ifndef PYLON_TLB_ONLY
/** \brief Result data struct for PylonStreamGrabberRetrieveResult().
 *  This data describes grab results (typically image data) retrieved from the device.
 *  Some items are optional (marked as "optional") and are only filled in if they are supported by the device.
**/
public static class PylonGrabResult_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PylonGrabResult_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public PylonGrabResult_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PylonGrabResult_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public PylonGrabResult_t position(int position) {
        return (PylonGrabResult_t)super.position(position);
    }

    /** Application specific context specified when calling PylonStreamGrabberRegisterBuffer() */
    @MemberGetter public native @Const Pointer Context();
    /** Data buffer handle returned when calling PylonStreamGrabberRegisterBuffer() */
    public native @ByRef @Cast("PYLON_STREAMBUFFER_HANDLE*") IntPointer hBuffer(); public native PylonGrabResult_t hBuffer(IntPointer hBuffer);
    /** Pointer to the raw data */
    @MemberGetter public native @Const Pointer pBuffer();
    /** Result status. check this to check whether the result contains valid data. */
    public native @Cast("EPylonGrabStatus") int Status(); public native PylonGrabResult_t Status(int Status);
    /** Deprecated: FrameNr has been deprecated. Use BlockID instead. */
    public native @Cast("unsigned int") int FrameNr(); public native PylonGrabResult_t FrameNr(int FrameNr);
    /** Type of data contained in buffer */
    public native @Cast("EPylonPayloadType") int PayloadType(); public native PylonGrabResult_t PayloadType(int PayloadType);
    /** Pixel type (if the result contains pixel data) */
    public native @Cast("EPylonPixelType") int PixelType(); public native PylonGrabResult_t PixelType(int PixelType);
    /** Time stamp generated by the device when filling the result (optional)*/
    public native @Cast("uint64_t") int TimeStamp(); public native PylonGrabResult_t TimeStamp(int TimeStamp);
    /** Number of columns, in pixels (only if payload is image data) */
    public native int SizeX(); public native PylonGrabResult_t SizeX(int SizeX);
    /** Number of rows, in pixels (only if payload is image data) */
    public native int SizeY(); public native PylonGrabResult_t SizeY(int SizeY);
    /** Starting column, in pixels (only if payload is image data) */
    public native int OffsetX(); public native PylonGrabResult_t OffsetX(int OffsetX);
    /** Starting row, in pixels (only if payload is image data) */
    public native int OffsetY(); public native PylonGrabResult_t OffsetY(int OffsetY);
    /** Number of extra data bytes at end of row (only if payload is image data) */
    public native int PaddingX(); public native PylonGrabResult_t PaddingX(int PaddingX);
    /** Number of extra data bytes at end of image (only if payload is image data) */
    public native int PaddingY(); public native PylonGrabResult_t PaddingY(int PaddingY);
    /** Total payload size, in bytes, pointed to by pBuffer */
    public native @Cast("uint64_t") int PayloadSize(); public native PylonGrabResult_t PayloadSize(int PayloadSize);
    /** Additional error code in case Status is gst_Failed (optional) */
    public native @Cast("unsigned int") int ErrorCode(); public native PylonGrabResult_t ErrorCode(int ErrorCode);
    /** The block ID of the grabbed frame (camera device specific).
                                                \par IEEE 1394 Camera Devices
                                                The value of block ID is always UINT64_MAX.
                                                <p>
                                                \par GigE Camera Devices
                                                The sequence number starts with 1 and
                                                wraps at 65535. The value 0 has a special meaning and indicates
                                                that this feature is not supported by the camera.
                                                <p>
                                                \par USB Camera Devices
                                                The sequence number starts with 0 and uses the full 64 Bit range.
                                                <p>
                                                \attention A block ID of value UINT64_MAX indicates that the Block ID is invalid and must not be used. */
    public native @Cast("uint64_t") int BlockID(); public native PylonGrabResult_t BlockID(int BlockID);
}
// #endif

// #ifndef PYLON_TLB_ONLY
/** \brief Result data struct for PylonEventGrabberRetrieveEvent(). */
public static class PylonEventResult_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PylonEventResult_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public PylonEventResult_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PylonEventResult_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public PylonEventResult_t position(int position) {
        return (PylonEventResult_t)super.position(position);
    }

    /** Raw chunk data which can be passed to PylonChunkParserAttachBuffer() */
    public native @Cast("unsigned char") byte Buffer(int i); public native PylonEventResult_t Buffer(int i, byte Buffer);
    @MemberGetter public native @Cast("unsigned char*") BytePointer Buffer();
    /** Error code if there was an error retrieving the event data */
    public native @Cast("unsigned int") int ErrorCode(); public native PylonEventResult_t ErrorCode(int ErrorCode);
}
// #endif

@Opaque public static class tag_PylonAviCompressionOptions_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public tag_PylonAviCompressionOptions_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public tag_PylonAviCompressionOptions_t(Pointer p) { super(p); }
}
@Opaque public static class PylonAviCompressionOptions_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PylonAviCompressionOptions_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PylonAviCompressionOptions_t(Pointer p) { super(p); }
}

/** \brief Holds the image persistence options.
*/
public static class PylonImagePersistenceOptions_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PylonImagePersistenceOptions_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public PylonImagePersistenceOptions_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PylonImagePersistenceOptions_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public PylonImagePersistenceOptions_t position(int position) {
        return (PylonImagePersistenceOptions_t)super.position(position);
    }

    /** Can be used to control the quality when saving JPEG images. Valid quality values range from 0 to 100. */
    public native int quality(); public native PylonImagePersistenceOptions_t quality(int quality);
}

/** \brief Optional result structure of IGigETransportLayer::IssueActionCommand and IGigETransportLayer::IssueScheduledActionCommand.
*/
public static class PylonGigEActionCommandResult_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PylonGigEActionCommandResult_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public PylonGigEActionCommandResult_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PylonGigEActionCommandResult_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public PylonGigEActionCommandResult_t position(int position) {
        return (PylonGigEActionCommandResult_t)super.position(position);
    }

    /** IP address of the device. */
    public native @Cast("char") byte DeviceAddress(int i); public native PylonGigEActionCommandResult_t DeviceAddress(int i, byte DeviceAddress);
    @MemberGetter public native @Cast("char*") BytePointer DeviceAddress();
    /** GigE Vision status code returned by the device. See Pylon::EGigEActionCommandStatus for more information. */
    public native @Cast("int32_t") int Status(); public native PylonGigEActionCommandResult_t Status(int Status);
}

/**
 * \}
 */

/*
* ----------------------------------------------------------------------------
* Initialization/Deinitialization
* ----------------------------------------------------------------------------
*/

public static native @Cast("GENAPIC_RESULT") long PylonInitialize();

public static native @Cast("GENAPIC_RESULT") long PylonTerminate();

/*
* ----------------------------------------------------------------------------
* Device factory: device enumeration, device creation
* ----------------------------------------------------------------------------
*/

/** \addtogroup pylon pylon Interface
 * \{
 */

/** \brief Fixed string size for PylonDeviceInfo_t members. */
public static final int PYLON_MAX_DEVICEINFO_ENTRY_LENGTH = 64;

/** \brief Device info struct.
 *
 *  This struct provides general information about the device gathered during enumeration.
**/
public static class PylonDeviceInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PylonDeviceInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public PylonDeviceInfo_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PylonDeviceInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public PylonDeviceInfo_t position(int position) {
        return (PylonDeviceInfo_t)super.position(position);
    }

    /** Full unique device name for identification */
    public native @Cast("char") byte FullName(int i); public native PylonDeviceInfo_t FullName(int i, byte FullName);
    @MemberGetter public native @Cast("char*") BytePointer FullName();
    /** User friendly device name for display purpose */
    public native @Cast("char") byte FriendlyName(int i); public native PylonDeviceInfo_t FriendlyName(int i, byte FriendlyName);
    @MemberGetter public native @Cast("char*") BytePointer FriendlyName();
    /** Manufacturer of the device*/
    public native @Cast("char") byte VendorName(int i); public native PylonDeviceInfo_t VendorName(int i, byte VendorName);
    @MemberGetter public native @Cast("char*") BytePointer VendorName();
    /** Model name of the device*/
    public native @Cast("char") byte ModelName(int i); public native PylonDeviceInfo_t ModelName(int i, byte ModelName);
    @MemberGetter public native @Cast("char*") BytePointer ModelName();
    /** Serial number of the device */
    public native @Cast("char") byte SerialNumber(int i); public native PylonDeviceInfo_t SerialNumber(int i, byte SerialNumber);
    @MemberGetter public native @Cast("char*") BytePointer SerialNumber();
    /** The device class (transport layer) used by the device  */
    public native @Cast("char") byte DeviceClass(int i); public native PylonDeviceInfo_t DeviceClass(int i, byte DeviceClass);
    @MemberGetter public native @Cast("char*") BytePointer DeviceClass();
    /** The device version as reported by the device */
    public native @Cast("char") byte DeviceVersion(int i); public native PylonDeviceInfo_t DeviceVersion(int i, byte DeviceVersion);
    @MemberGetter public native @Cast("char*") BytePointer DeviceVersion();
    /** User defined name, if present, as reported by the device */
    public native @Cast("char") byte UserDefinedName(int i); public native PylonDeviceInfo_t UserDefinedName(int i, byte UserDefinedName);
    @MemberGetter public native @Cast("char*") BytePointer UserDefinedName();
}

/**
 * \}
 */

/* Device enumeration / creation */
public static native @Cast("GENAPIC_RESULT") long PylonEnumerateDevices(@Cast("size_t*") IntPointer numDevices);
public static native @Cast("GENAPIC_RESULT") long PylonEnumerateDevices(@Cast("size_t*") IntBuffer numDevices);
public static native @Cast("GENAPIC_RESULT") long PylonEnumerateDevices(@Cast("size_t*") int[] numDevices);

/* GigE Device enumeration / creation */
public static native @Cast("GENAPIC_RESULT") long PylonGigEEnumerateAllDevices(@Cast("size_t*") IntPointer numDevices);
public static native @Cast("GENAPIC_RESULT") long PylonGigEEnumerateAllDevices(@Cast("size_t*") IntBuffer numDevices);
public static native @Cast("GENAPIC_RESULT") long PylonGigEEnumerateAllDevices(@Cast("size_t*") int[] numDevices);

public static native @Cast("GENAPIC_RESULT") long PylonGigEForceIp( @Cast("const char*") BytePointer pMacAddress, @Cast("const char*") BytePointer pIpAddress, @Cast("const char*") BytePointer pSubnetMask, @Cast("const char*") BytePointer pDefaultGateway);
public static native @Cast("GENAPIC_RESULT") long PylonGigEForceIp( String pMacAddress, String pIpAddress, String pSubnetMask, String pDefaultGateway);

public static native @Cast("GENAPIC_RESULT") long PylonGigERestartIpConfiguration( @Cast("const char*") BytePointer pMacAddress);
public static native @Cast("GENAPIC_RESULT") long PylonGigERestartIpConfiguration( String pMacAddress);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonGigEChangeIpConfiguration( @ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("_Bool") boolean EnablePersistentIp, @Cast("_Bool") boolean EnableDhcp );
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonGigESetPersistentIpAddress( @ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pIpAddress, @Cast("const char*") BytePointer pSubnetMask, @Cast("const char*") BytePointer pDefaultGateway);
public static native @Cast("GENAPIC_RESULT") long PylonGigESetPersistentIpAddress( @ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pIpAddress, String pSubnetMask, String pDefaultGateway);

public static native @Cast("GENAPIC_RESULT") long PylonGigEAnnounceRemoteDevice( @Cast("const char*") BytePointer pIpAddress);
public static native @Cast("GENAPIC_RESULT") long PylonGigEAnnounceRemoteDevice( String pIpAddress);

public static native @Cast("GENAPIC_RESULT") long PylonGigERenounceRemoteDevice( @Cast("const char*") BytePointer pIpAddress, @Cast("_Bool*") BoolPointer pFound);
public static native @Cast("GENAPIC_RESULT") long PylonGigERenounceRemoteDevice( String pIpAddress, @Cast("_Bool*") boolean[] pFound);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonGigEGetPersistentIpAddress( @ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("char*") BytePointer pIpAddress, @Cast("size_t*") IntPointer pIpAddressLen, @Cast("char*") BytePointer pSubnetMask, @Cast("size_t*") IntPointer pSubnetMaskLen, @Cast("char*") BytePointer pDefaultGateway, @Cast("size_t*") IntPointer pDefaultGatewayLen);
public static native @Cast("GENAPIC_RESULT") long PylonGigEGetPersistentIpAddress( @ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("char*") ByteBuffer pIpAddress, @Cast("size_t*") IntBuffer pIpAddressLen, @Cast("char*") ByteBuffer pSubnetMask, @Cast("size_t*") IntBuffer pSubnetMaskLen, @Cast("char*") ByteBuffer pDefaultGateway, @Cast("size_t*") IntBuffer pDefaultGatewayLen);
public static native @Cast("GENAPIC_RESULT") long PylonGigEGetPersistentIpAddress( @ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("char*") byte[] pIpAddress, @Cast("size_t*") int[] pIpAddressLen, @Cast("char*") byte[] pSubnetMask, @Cast("size_t*") int[] pSubnetMaskLen, @Cast("char*") byte[] pDefaultGateway, @Cast("size_t*") int[] pDefaultGatewayLen);
// #endif


// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonGigEBroadcastIpConfiguration(
                                  @Cast("const char*") BytePointer pMacAddress,
                                  @Cast("_Bool") boolean EnablePersistentIp,
                                  @Cast("_Bool") boolean EnableDHCP,
                                  @Cast("const char*") BytePointer pIpAddress,
                                  @Cast("const char*") BytePointer pSubnetMask,
                                  @Cast("const char*") BytePointer pDefaultGateway,
                                  @Cast("const char*") BytePointer pUserdefinedName,
                                  @Cast("_Bool*") BoolPointer pRetval
                                  );
public static native @Cast("GENAPIC_RESULT") long PylonGigEBroadcastIpConfiguration(
                                  String pMacAddress,
                                  @Cast("_Bool") boolean EnablePersistentIp,
                                  @Cast("_Bool") boolean EnableDHCP,
                                  String pIpAddress,
                                  String pSubnetMask,
                                  String pDefaultGateway,
                                  String pUserdefinedName,
                                  @Cast("_Bool*") boolean[] pRetval
                                  );

public static native @Cast("GENAPIC_RESULT") long PylonGigEIssueActionCommand( @Cast("uint32_t") int deviceKey, @Cast("uint32_t") int groupKey, @Cast("uint32_t") int groupMask, @Cast("const char*") BytePointer pBroadcastAddress, @Cast("uint32_t") int timeoutMs,  @Cast("uint32_t*") IntPointer pNumResults, PylonGigEActionCommandResult_t pResults );
public static native @Cast("GENAPIC_RESULT") long PylonGigEIssueActionCommand( @Cast("uint32_t") int deviceKey, @Cast("uint32_t") int groupKey, @Cast("uint32_t") int groupMask, String pBroadcastAddress, @Cast("uint32_t") int timeoutMs,  @Cast("uint32_t*") IntBuffer pNumResults, PylonGigEActionCommandResult_t pResults );
public static native @Cast("GENAPIC_RESULT") long PylonGigEIssueActionCommand( @Cast("uint32_t") int deviceKey, @Cast("uint32_t") int groupKey, @Cast("uint32_t") int groupMask, @Cast("const char*") BytePointer pBroadcastAddress, @Cast("uint32_t") int timeoutMs,  @Cast("uint32_t*") int[] pNumResults, PylonGigEActionCommandResult_t pResults );
public static native @Cast("GENAPIC_RESULT") long PylonGigEIssueActionCommand( @Cast("uint32_t") int deviceKey, @Cast("uint32_t") int groupKey, @Cast("uint32_t") int groupMask, String pBroadcastAddress, @Cast("uint32_t") int timeoutMs,  @Cast("uint32_t*") IntPointer pNumResults, PylonGigEActionCommandResult_t pResults );
public static native @Cast("GENAPIC_RESULT") long PylonGigEIssueActionCommand( @Cast("uint32_t") int deviceKey, @Cast("uint32_t") int groupKey, @Cast("uint32_t") int groupMask, @Cast("const char*") BytePointer pBroadcastAddress, @Cast("uint32_t") int timeoutMs,  @Cast("uint32_t*") IntBuffer pNumResults, PylonGigEActionCommandResult_t pResults );
public static native @Cast("GENAPIC_RESULT") long PylonGigEIssueActionCommand( @Cast("uint32_t") int deviceKey, @Cast("uint32_t") int groupKey, @Cast("uint32_t") int groupMask, String pBroadcastAddress, @Cast("uint32_t") int timeoutMs,  @Cast("uint32_t*") int[] pNumResults, PylonGigEActionCommandResult_t pResults );


public static native @Cast("GENAPIC_RESULT") long PylonGigEIssueScheduledActionCommand( @Cast("uint32_t") int deviceKey, @Cast("uint32_t") int groupKey, @Cast("uint32_t") int groupMask, @Cast("uint64_t") int actiontimeNs, @Cast("const char*") BytePointer pBroadcastAddress, @Cast("uint32_t") int timeoutMs,  @Cast("uint32_t*") IntPointer pNumResults, PylonGigEActionCommandResult_t pResults );
public static native @Cast("GENAPIC_RESULT") long PylonGigEIssueScheduledActionCommand( @Cast("uint32_t") int deviceKey, @Cast("uint32_t") int groupKey, @Cast("uint32_t") int groupMask, @Cast("uint64_t") int actiontimeNs, String pBroadcastAddress, @Cast("uint32_t") int timeoutMs,  @Cast("uint32_t*") IntBuffer pNumResults, PylonGigEActionCommandResult_t pResults );
public static native @Cast("GENAPIC_RESULT") long PylonGigEIssueScheduledActionCommand( @Cast("uint32_t") int deviceKey, @Cast("uint32_t") int groupKey, @Cast("uint32_t") int groupMask, @Cast("uint64_t") int actiontimeNs, @Cast("const char*") BytePointer pBroadcastAddress, @Cast("uint32_t") int timeoutMs,  @Cast("uint32_t*") int[] pNumResults, PylonGigEActionCommandResult_t pResults );
public static native @Cast("GENAPIC_RESULT") long PylonGigEIssueScheduledActionCommand( @Cast("uint32_t") int deviceKey, @Cast("uint32_t") int groupKey, @Cast("uint32_t") int groupMask, @Cast("uint64_t") int actiontimeNs, String pBroadcastAddress, @Cast("uint32_t") int timeoutMs,  @Cast("uint32_t*") IntPointer pNumResults, PylonGigEActionCommandResult_t pResults );
public static native @Cast("GENAPIC_RESULT") long PylonGigEIssueScheduledActionCommand( @Cast("uint32_t") int deviceKey, @Cast("uint32_t") int groupKey, @Cast("uint32_t") int groupMask, @Cast("uint64_t") int actiontimeNs, @Cast("const char*") BytePointer pBroadcastAddress, @Cast("uint32_t") int timeoutMs,  @Cast("uint32_t*") IntBuffer pNumResults, PylonGigEActionCommandResult_t pResults );
public static native @Cast("GENAPIC_RESULT") long PylonGigEIssueScheduledActionCommand( @Cast("uint32_t") int deviceKey, @Cast("uint32_t") int groupKey, @Cast("uint32_t") int groupMask, @Cast("uint64_t") int actiontimeNs, String pBroadcastAddress, @Cast("uint32_t") int timeoutMs,  @Cast("uint32_t*") int[] pNumResults, PylonGigEActionCommandResult_t pResults );

// #endif

public static native @Cast("GENAPIC_RESULT") long PylonGetDeviceInfo(@Cast("size_t") int index, PylonDeviceInfo_t pDi);

public static native @Cast("GENAPIC_RESULT") long PylonGetDeviceInfoHandle( @Cast("size_t") int index, @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer phDi );

public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetNumProperties( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, @Cast("size_t*") IntPointer numProperties );
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetNumProperties( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, @Cast("size_t*") IntBuffer numProperties );
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetNumProperties( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, @Cast("size_t*") int[] numProperties );

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetPropertyValueByName( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, @Cast("const char*") BytePointer pName, @Cast("char*") BytePointer pValue, @Cast("size_t*") IntPointer pBufLen );
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetPropertyValueByName( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, String pName, @Cast("char*") ByteBuffer pValue, @Cast("size_t*") IntBuffer pBufLen );
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetPropertyValueByName( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, @Cast("const char*") BytePointer pName, @Cast("char*") byte[] pValue, @Cast("size_t*") int[] pBufLen );
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetPropertyValueByName( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, String pName, @Cast("char*") BytePointer pValue, @Cast("size_t*") IntPointer pBufLen );
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetPropertyValueByName( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, @Cast("const char*") BytePointer pName, @Cast("char*") ByteBuffer pValue, @Cast("size_t*") IntBuffer pBufLen );
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetPropertyValueByName( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, String pName, @Cast("char*") byte[] pValue, @Cast("size_t*") int[] pBufLen );
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetPropertyValueByIndex( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, @Cast("size_t") int index, @Cast("char*") BytePointer pBuf, @Cast("size_t*") IntPointer pBufLen );
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetPropertyValueByIndex( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, @Cast("size_t") int index, @Cast("char*") ByteBuffer pBuf, @Cast("size_t*") IntBuffer pBufLen );
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetPropertyValueByIndex( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, @Cast("size_t") int index, @Cast("char*") byte[] pBuf, @Cast("size_t*") int[] pBufLen );
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetPropertyName( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, @Cast("size_t") int index, @Cast("char*") BytePointer pName, @Cast("size_t*") IntPointer pBufLen);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetPropertyName( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, @Cast("size_t") int index, @Cast("char*") ByteBuffer pName, @Cast("size_t*") IntBuffer pBufLen);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceInfoGetPropertyName( @ByVal @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer hDi, @Cast("size_t") int index, @Cast("char*") byte[] pName, @Cast("size_t*") int[] pBufLen);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonCreateDeviceByIndex( @Cast("size_t") int index, @Cast("PYLON_DEVICE_HANDLE*") IntPointer phDev);

public static native @Cast("GENAPIC_RESULT") long PylonCreateDeviceFromDirectShowID( int id, @Cast("PYLON_DEVICE_HANDLE*") IntPointer phDev);

public static native @Cast("GENAPIC_RESULT") long PylonDestroyDevice(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev);

public static native @Cast("GENAPIC_RESULT") long PylonIsDeviceAccessible( @Cast("size_t") int index, int accessMode, @Cast("_Bool*") BoolPointer pIsAccessible );
public static native @Cast("GENAPIC_RESULT") long PylonIsDeviceAccessible( @Cast("size_t") int index, int accessMode, @Cast("_Bool*") boolean[] pIsAccessible );

/* Device operations */
public static native @Cast("GENAPIC_RESULT") long PylonDeviceOpen(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, int accessMode);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceClose(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonDeviceIsOpen(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("_Bool*") BoolPointer pOpen);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceIsOpen(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("_Bool*") boolean[] pOpen);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonDeviceAccessMode(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, IntPointer pAccessMode);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceAccessMode(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, IntBuffer pAccessMode);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceAccessMode(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, int[] pAccessMode);

/* Returns the device info object from which the device was created */
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetDeviceInfo(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, PylonDeviceInfo_t pDeviceInfo);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetDeviceInfoHandle(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("PYLON_DEVICE_INFO_HANDLE*") IntPointer phDi );

public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetNumStreamGrabberChannels(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("size_t*") IntPointer pNumChannels);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetNumStreamGrabberChannels(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("size_t*") IntBuffer pNumChannels);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetNumStreamGrabberChannels(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("size_t*") int[] pNumChannels);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetStreamGrabber(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("size_t") int index, @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer phStg);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetEventGrabber(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("PYLON_EVENTGRABBER_HANDLE*") IntPointer phEvg);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetNodeMap(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("NODEMAP_HANDLE*") Pointer phMap);


/* returns GENAPIC_INVALID_HANDLE when there is no transport layer nodemap */
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetTLNodeMap(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("NODEMAP_HANDLE*") Pointer phMap);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceCreateChunkParser(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("PYLON_CHUNKPARSER_HANDLE*") IntPointer phChp);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceDestroyChunkParser(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @ByVal @Cast("PYLON_CHUNKPARSER_HANDLE*") IntPointer hChp);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceCreateEventAdapter(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("PYLON_EVENTADAPTER_HANDLE*") IntPointer phEva);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceDestroyEventAdapter(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @ByVal @Cast("PYLON_EVENTADAPTER_HANDLE*") IntPointer hEva);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonDeviceRegisterRemovalCallback(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, PylonDeviceRemCb_t pCbFunction, @Cast("PYLON_DEVICECALLBACK_HANDLE*") IntPointer phCb);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceDeregisterRemovalCallback(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @ByVal @Cast("PYLON_DEVICECALLBACK_HANDLE*") IntPointer hCb);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceRegisterRemovalCallbackHwnd(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, Pointer hwnd, PylonDeviceRemCb_t pCbFunction, @Cast("PYLON_DEVICECALLBACK_HANDLE*") IntPointer phCb);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceDeregisterRemovalCallbackHwnd(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @ByVal @Cast("PYLON_DEVICECALLBACK_HANDLE*") IntPointer hCb);
// #endif

/* Device convenience methods */

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonDeviceSetIntegerFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("int64_t") long value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceSetIntegerFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("int64_t") long value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("int64_t*") LongPointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("int64_t*") LongBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("int64_t*") long[] pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("int64_t*") LongPointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("int64_t*") LongBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("int64_t*") long[] pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMin(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("int64_t*") LongPointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMin(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("int64_t*") LongBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMin(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("int64_t*") long[] pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMin(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("int64_t*") LongPointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMin(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("int64_t*") LongBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMin(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("int64_t*") long[] pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMax(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("int64_t*") LongPointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMax(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("int64_t*") LongBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMax(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("int64_t*") long[] pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMax(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("int64_t*") LongPointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMax(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("int64_t*") LongBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureMax(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("int64_t*") long[] pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureInc(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("int64_t*") LongPointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureInc(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("int64_t*") LongBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureInc(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("int64_t*") long[] pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureInc(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("int64_t*") LongPointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureInc(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("int64_t*") LongBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetIntegerFeatureInc(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("int64_t*") long[] pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGrabSingleFrame(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("size_t") int channel, Pointer pBuffer, @Cast("size_t") int bufferSize, PylonGrabResult_t pGrabResult, @Cast("_Bool*") BoolPointer pReady, @Cast("uint32_t") int timeout);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGrabSingleFrame(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("size_t") int channel, Pointer pBuffer, @Cast("size_t") int bufferSize, PylonGrabResult_t pGrabResult, @Cast("_Bool*") boolean[] pReady, @Cast("uint32_t") int timeout);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonDeviceSetFloatFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, double value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceSetFloatFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, double value);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, DoublePointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, DoubleBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, double[] pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, DoublePointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, DoubleBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, double[] pValue);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeatureMin(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, DoublePointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeatureMin(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, DoubleBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeatureMin(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, double[] pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeatureMin(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, DoublePointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeatureMin(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, DoubleBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeatureMin(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, double[] pValue);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeatureMax(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, DoublePointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeatureMax(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, DoubleBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeatureMax(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, double[] pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeatureMax(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, DoublePointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeatureMax(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, DoubleBuffer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetFloatFeatureMax(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, double[] pValue);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonDeviceSetBooleanFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("_Bool") boolean value);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceSetBooleanFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("_Bool") boolean value);

public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetBooleanFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("_Bool*") BoolPointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceGetBooleanFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("_Bool*") boolean[] pValue);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonDeviceExecuteCommandFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceExecuteCommandFeature(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonDeviceIsCommandDone(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("_Bool*") BoolPointer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceIsCommandDone(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("_Bool*") boolean[] pResult);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureFromString(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("const char*") BytePointer pValue);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureFromString(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, String pValue);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureToString(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("char*") BytePointer pBuf, @Cast("size_t*") IntPointer pBufLen);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureToString(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("char*") ByteBuffer pBuf, @Cast("size_t*") IntBuffer pBufLen);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureToString(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("char*") byte[] pBuf, @Cast("size_t*") int[] pBufLen);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureToString(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("char*") BytePointer pBuf, @Cast("size_t*") IntPointer pBufLen);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureToString(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("char*") ByteBuffer pBuf, @Cast("size_t*") IntBuffer pBufLen);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureToString(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("char*") byte[] pBuf, @Cast("size_t*") int[] pBufLen);

public static native @Cast("_Bool") boolean PylonDeviceFeatureIsImplemented(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName);
public static native @Cast("_Bool") boolean PylonDeviceFeatureIsImplemented(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName);

public static native @Cast("_Bool") boolean PylonDeviceFeatureIsAvailable(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName);
public static native @Cast("_Bool") boolean PylonDeviceFeatureIsAvailable(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName);

public static native @Cast("_Bool") boolean PylonDeviceFeatureIsReadable(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName);
public static native @Cast("_Bool") boolean PylonDeviceFeatureIsReadable(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName);

public static native @Cast("_Bool") boolean PylonDeviceFeatureIsWritable(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName);
public static native @Cast("_Bool") boolean PylonDeviceFeatureIsWritable(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureGetAccessMode( @ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("EGenApiAccessMode*") IntPointer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureGetAccessMode( @ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("EGenApiAccessMode*") IntBuffer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureGetAccessMode( @ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("EGenApiAccessMode*") int[] pResult);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureGetAccessMode( @ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("EGenApiAccessMode*") IntPointer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureGetAccessMode( @ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Cast("const char*") BytePointer pName, @Cast("EGenApiAccessMode*") IntBuffer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonDeviceFeatureGetAccessMode( @ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, String pName, @Cast("EGenApiAccessMode*") int[] pResult);

/* Stream grabber operations */
public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberOpen(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg);

public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberClose(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberIsOpen(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @Cast("_Bool*") BoolPointer pOpen);
public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberIsOpen(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @Cast("_Bool*") boolean[] pOpen);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberGetWaitObject(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer phWobj);

public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberSetMaxNumBuffer(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @Cast("size_t") int numBuffers );

public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberGetMaxNumBuffer(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @Cast("size_t*") IntPointer pNumBuffers );
public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberGetMaxNumBuffer(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @Cast("size_t*") IntBuffer pNumBuffers );
public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberGetMaxNumBuffer(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @Cast("size_t*") int[] pNumBuffers );

public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberSetMaxBufferSize(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @Cast("size_t") int maxSize );

public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberGetMaxBufferSize(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @Cast("size_t*") IntPointer pMaxSize );
public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberGetMaxBufferSize(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @Cast("size_t*") IntBuffer pMaxSize );
public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberGetMaxBufferSize(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @Cast("size_t*") int[] pMaxSize );


// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberRegisterBuffer(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, Pointer pBuffer, @Cast("size_t") int BufLen, @Cast("PYLON_STREAMBUFFER_HANDLE*") IntPointer phBuf);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberDeregisterBuffer(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @ByVal @Cast("PYLON_STREAMBUFFER_HANDLE*") IntPointer hBuf);

public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberPrepareGrab(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg);

public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberFinishGrab(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg);

public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberCancelGrab(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberRetrieveResult(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, PylonGrabResult_t pGrabResult, @Cast("_Bool*") BoolPointer pReady);
public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberRetrieveResult(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, PylonGrabResult_t pGrabResult, @Cast("_Bool*") boolean[] pReady);
public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberQueueBuffer(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @ByVal @Cast("PYLON_STREAMBUFFER_HANDLE*") IntPointer hBuf, @Const Pointer pContext);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonStreamGrabberGetNodeMap(@ByVal @Cast("PYLON_STREAMGRABBER_HANDLE*") IntPointer hStg, @Cast("NODEMAP_HANDLE*") Pointer phMap);



/* Wait objects */
// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectIsValid(@ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj, @Cast("_Bool*") BoolPointer pValid);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectIsValid(@ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj, @Cast("_Bool*") boolean[] pValid);

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectWait(@ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj, @Cast("uint32_t") int timeout, @Cast("_Bool*") BoolPointer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectWait(@ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj, @Cast("uint32_t") int timeout, @Cast("_Bool*") boolean[] pResult);

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectWaitEx(@ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj, @Cast("uint32_t") int timeout, @Cast("_Bool") boolean alertable, @Cast("EPylonWaitExResult*") IntPointer pWaitResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectWaitEx(@ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj, @Cast("uint32_t") int timeout, @Cast("_Bool") boolean alertable, @Cast("EPylonWaitExResult*") IntBuffer pWaitResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectWaitEx(@ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj, @Cast("uint32_t") int timeout, @Cast("_Bool") boolean alertable, @Cast("EPylonWaitExResult*") int[] pWaitResult);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectCreate(@Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer phWobj);

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectDestroy(@ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj);

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectSignal(@ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj);

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectReset(@ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj);

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsCreate(@Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer phWos);

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsDestroy(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos);



// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsAdd(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj, @Cast("size_t*") IntPointer pIndex);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsAdd(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj, @Cast("size_t*") IntBuffer pIndex);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsAdd(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj, @Cast("size_t*") int[] pIndex);

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsAddMany(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("size_t") int numWaitObjects);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsRemoveAll(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAll(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("_Bool*") BoolPointer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAll(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("_Bool*") boolean[] pResult);

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAny(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("size_t*") IntPointer pIndex, @Cast("_Bool*") BoolPointer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAny(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("size_t*") IntBuffer pIndex, @Cast("_Bool*") boolean[] pResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAny(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("size_t*") int[] pIndex, @Cast("_Bool*") BoolPointer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAny(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("size_t*") IntPointer pIndex, @Cast("_Bool*") boolean[] pResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAny(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("size_t*") IntBuffer pIndex, @Cast("_Bool*") BoolPointer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAny(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("size_t*") int[] pIndex, @Cast("_Bool*") boolean[] pResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAllEx(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("_Bool") boolean alertable, @Cast("EPylonWaitExResult*") IntPointer pWaitResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAllEx(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("_Bool") boolean alertable, @Cast("EPylonWaitExResult*") IntBuffer pWaitResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAllEx(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("_Bool") boolean alertable, @Cast("EPylonWaitExResult*") int[] pWaitResult);

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAnyEx(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("size_t*") IntPointer pIndex, @Cast("_Bool") boolean alertable, @Cast("EPylonWaitExResult*") IntPointer pWaitResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAnyEx(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("size_t*") IntBuffer pIndex, @Cast("_Bool") boolean alertable, @Cast("EPylonWaitExResult*") IntBuffer pWaitResult);
public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectsWaitForAnyEx(@ByVal @Cast("PYLON_WAITOBJECTS_HANDLE*") IntPointer hWos, @Cast("uint32_t") int timeout, @Cast("size_t*") int[] pIndex, @Cast("_Bool") boolean alertable, @Cast("EPylonWaitExResult*") int[] pWaitResult);
// #endif



/* Event grabber operations */
@MemberGetter public static native @Cast("const size_t") int PylonEventGrabberBufferSize();

public static native @Cast("GENAPIC_RESULT") long PylonEventGrabberOpen(@ByVal @Cast("PYLON_EVENTGRABBER_HANDLE*") IntPointer hEvg);

public static native @Cast("GENAPIC_RESULT") long PylonEventGrabberClose(@ByVal @Cast("PYLON_EVENTGRABBER_HANDLE*") IntPointer hEvg);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonEventGrabberIsOpen(@ByVal @Cast("PYLON_EVENTGRABBER_HANDLE*") IntPointer hEvg, @Cast("_Bool*") BoolPointer pOpen);
public static native @Cast("GENAPIC_RESULT") long PylonEventGrabberIsOpen(@ByVal @Cast("PYLON_EVENTGRABBER_HANDLE*") IntPointer hEvg, @Cast("_Bool*") boolean[] pOpen);

public static native @Cast("GENAPIC_RESULT") long PylonEventGrabberRetrieveEvent(@ByVal @Cast("PYLON_EVENTGRABBER_HANDLE*") IntPointer hEvg, PylonEventResult_t pEventResult, @Cast("_Bool*") BoolPointer pReady);
public static native @Cast("GENAPIC_RESULT") long PylonEventGrabberRetrieveEvent(@ByVal @Cast("PYLON_EVENTGRABBER_HANDLE*") IntPointer hEvg, PylonEventResult_t pEventResult, @Cast("_Bool*") boolean[] pReady);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonEventGrabberGetWaitObject(@ByVal @Cast("PYLON_EVENTGRABBER_HANDLE*") IntPointer hEvg, @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer phWobj);

public static native @Cast("GENAPIC_RESULT") long PylonEventGrabberGetNodeMap(@ByVal @Cast("PYLON_EVENTGRABBER_HANDLE*") IntPointer hEvg, @Cast("NODEMAP_HANDLE*") Pointer phMap);

/* Event grabber convenience methods */
public static native @Cast("GENAPIC_RESULT") long PylonEventGrabberGetNumBuffers(@ByVal @Cast("PYLON_EVENTGRABBER_HANDLE*") IntPointer hEvg, @Cast("size_t*") IntPointer pNumBuffers);
public static native @Cast("GENAPIC_RESULT") long PylonEventGrabberGetNumBuffers(@ByVal @Cast("PYLON_EVENTGRABBER_HANDLE*") IntPointer hEvg, @Cast("size_t*") IntBuffer pNumBuffers);
public static native @Cast("GENAPIC_RESULT") long PylonEventGrabberGetNumBuffers(@ByVal @Cast("PYLON_EVENTGRABBER_HANDLE*") IntPointer hEvg, @Cast("size_t*") int[] pNumBuffers);

public static native @Cast("GENAPIC_RESULT") long PylonEventGrabberSetNumBuffers(@ByVal @Cast("PYLON_EVENTGRABBER_HANDLE*") IntPointer hEvg, @Cast("size_t") int numBuffers);

/* event adapter operations */
// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonEventAdapterDeliverMessage(@ByVal @Cast("PYLON_EVENTADAPTER_HANDLE*") IntPointer hEva, @Const PylonEventResult_t pEventResult);
// #endif



/* Chunk parser operations */
// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonChunkParserAttachBuffer(@ByVal @Cast("PYLON_CHUNKPARSER_HANDLE*") IntPointer hChp, @Const Pointer pBuffer, @Cast("size_t") int BufLen);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonChunkParserDetachBuffer(@ByVal @Cast("PYLON_CHUNKPARSER_HANDLE*") IntPointer hChp);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonChunkParserUpdateBuffer(@ByVal @Cast("PYLON_CHUNKPARSER_HANDLE*") IntPointer hChp, @Const Pointer pBuffer);

public static native @Cast("GENAPIC_RESULT") long PylonChunkParserHasCRC(@ByVal @Cast("PYLON_CHUNKPARSER_HANDLE*") IntPointer hChp, @Cast("_Bool*") BoolPointer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonChunkParserHasCRC(@ByVal @Cast("PYLON_CHUNKPARSER_HANDLE*") IntPointer hChp, @Cast("_Bool*") boolean[] pResult);

public static native @Cast("GENAPIC_RESULT") long PylonChunkParserCheckCRC(@ByVal @Cast("PYLON_CHUNKPARSER_HANDLE*") IntPointer hChp, @Cast("_Bool*") BoolPointer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonChunkParserCheckCRC(@ByVal @Cast("PYLON_CHUNKPARSER_HANDLE*") IntPointer hChp, @Cast("_Bool*") boolean[] pResult);
// #endif

/* Deprecated: PylonPixelFormatConverterCreate has been deprecated. Use PylonImageFormatConverterCreate instead. */
public static native @Cast("GENAPIC_RESULT") long PylonPixelFormatConverterCreate(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, int outAlign, @Cast("PYLON_FORMAT_CONVERTER_HANDLE*") IntPointer phConv);

/* Deprecated: PylonPixelFormatConverterConvert has been deprecated. Use PylonImageFormatConverterConvert instead. */
// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonPixelFormatConverterConvert( @ByVal @Cast("PYLON_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, Pointer targetBuffer, @Cast("size_t") int targetBufferSize, @Const Pointer sourceBuffer, @Cast("size_t") int sourceBufferSize );

/* Deprecated: PylonPixelFormatConverterGetOutputBufferSize has been deprecated. Use PylonImageFormatConverterGetBufferSizeForConversion instead. */
public static native @Cast("GENAPIC_RESULT") long PylonPixelFormatConverterGetOutputBufferSize(@ByVal @Cast("PYLON_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("size_t*") IntPointer pBufSiz);
public static native @Cast("GENAPIC_RESULT") long PylonPixelFormatConverterGetOutputBufferSize(@ByVal @Cast("PYLON_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("size_t*") IntBuffer pBufSiz);
public static native @Cast("GENAPIC_RESULT") long PylonPixelFormatConverterGetOutputBufferSize(@ByVal @Cast("PYLON_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("size_t*") int[] pBufSiz);
// #endif

/* Deprecated: PylonPixelFormatConverterDestroy has been deprecated. Use PylonImageFormatConverterDestroy instead. */
public static native @Cast("GENAPIC_RESULT") long PylonPixelFormatConverterDestroy( @ByVal @Cast("PYLON_FORMAT_CONVERTER_HANDLE*") IntPointer hConv );

/* Pixel Type operations */
public static native @Cast("GENAPIC_RESULT") long PylonBitsPerPixel(@Cast("EPylonPixelType") int pixelType, IntPointer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonBitsPerPixel(@Cast("EPylonPixelType") int pixelType, IntBuffer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonBitsPerPixel(@Cast("EPylonPixelType") int pixelType, int[] pResult);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonIsMono(@Cast("EPylonPixelType") int pixelType, @Cast("_Bool*") BoolPointer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonIsMono(@Cast("EPylonPixelType") int pixelType, @Cast("_Bool*") boolean[] pResult);
public static native @Cast("GENAPIC_RESULT") long PylonIsBayer(@Cast("EPylonPixelType") int pixelType, @Cast("_Bool*") BoolPointer pResult);
public static native @Cast("GENAPIC_RESULT") long PylonIsBayer(@Cast("EPylonPixelType") int pixelType, @Cast("_Bool*") boolean[] pResult);
// #endif

public static native @Cast("GENAPIC_RESULT") long PylonPixelTypeFromString(@Cast("const char*") BytePointer pString, @Cast("EPylonPixelType*") IntPointer pPixelType);
public static native @Cast("GENAPIC_RESULT") long PylonPixelTypeFromString(String pString, @Cast("EPylonPixelType*") IntBuffer pPixelType);
public static native @Cast("GENAPIC_RESULT") long PylonPixelTypeFromString(@Cast("const char*") BytePointer pString, @Cast("EPylonPixelType*") int[] pPixelType);
public static native @Cast("GENAPIC_RESULT") long PylonPixelTypeFromString(String pString, @Cast("EPylonPixelType*") IntPointer pPixelType);
public static native @Cast("GENAPIC_RESULT") long PylonPixelTypeFromString(@Cast("const char*") BytePointer pString, @Cast("EPylonPixelType*") IntBuffer pPixelType);
public static native @Cast("GENAPIC_RESULT") long PylonPixelTypeFromString(String pString, @Cast("EPylonPixelType*") int[] pPixelType);



// #ifdef GENAPIC_WIN_BUILD   /* Stuff that requires the Win32 API */

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectFromW32(@ByVal @Cast("HANDLE*") Pointer hW32, @Cast("_Bool") boolean duplicate, @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer phWobj);

public static native @Cast("GENAPIC_RESULT") long PylonWaitObjectGetW32Handle(@ByVal @Cast("PYLON_WAITOBJECT_HANDLE*") IntPointer hWobj, @ByVal @Cast("PHANDLE*") Pointer phW32);

public static native @Cast("GENAPIC_RESULT") long PylonRTThreadGetPriorityCapabilities(@Cast("int32_t*") IntPointer pPriorityMin, @Cast("int32_t*") IntPointer pPriorityMax);
public static native @Cast("GENAPIC_RESULT") long PylonRTThreadGetPriorityCapabilities(@Cast("int32_t*") IntBuffer pPriorityMin, @Cast("int32_t*") IntBuffer pPriorityMax);
public static native @Cast("GENAPIC_RESULT") long PylonRTThreadGetPriorityCapabilities(@Cast("int32_t*") int[] pPriorityMin, @Cast("int32_t*") int[] pPriorityMax);

public static native @Cast("GENAPIC_RESULT") long PylonRTThreadSetPriority(@ByVal @Cast("HANDLE*") Pointer hThread, @Cast("int32_t") int priority);

public static native @Cast("GENAPIC_RESULT") long PylonRTThreadGetPriority(@ByVal @Cast("HANDLE*") Pointer hThread, @Cast("int32_t*") IntPointer pPriority);
public static native @Cast("GENAPIC_RESULT") long PylonRTThreadGetPriority(@ByVal @Cast("HANDLE*") Pointer hThread, @Cast("int32_t*") IntBuffer pPriority);
public static native @Cast("GENAPIC_RESULT") long PylonRTThreadGetPriority(@ByVal @Cast("HANDLE*") Pointer hThread, @Cast("int32_t*") int[] pPriority);

// #endif /* GENAPIC_WIN_BUILD */

/* Port read and write operations */
// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonDevicePortRead(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, Pointer pBuffer, @Cast("int64_t") long Address, @Cast("size_t") int Length);

public static native @Cast("GENAPIC_RESULT") long PylonDevicePortWrite(@ByVal @Cast("PYLON_DEVICE_HANDLE*") IntPointer hDev, @Const Pointer pBuffer, @Cast("int64_t") long Address, @Cast("size_t") int Length);
// #endif

/* Feature Persistence */
public static native @Cast("GENAPIC_RESULT") long PylonFeaturePersistenceSave(@ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("const char*") BytePointer pFileName);
public static native @Cast("GENAPIC_RESULT") long PylonFeaturePersistenceSave(@ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, String pFileName);

// #ifndef PYLON_TLB_ONLY
public static native @Cast("GENAPIC_RESULT") long PylonFeaturePersistenceLoad(@ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap,  @Cast("const char*") BytePointer pFileName, @Cast("_Bool") boolean verify);
public static native @Cast("GENAPIC_RESULT") long PylonFeaturePersistenceLoad(@ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap,  String pFileName, @Cast("_Bool") boolean verify);

public static native @Cast("GENAPIC_RESULT") long PylonFeaturePersistenceSaveToString(@ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("char*") BytePointer pFeatures, @Cast("size_t*") IntPointer pFeaturesLen);
public static native @Cast("GENAPIC_RESULT") long PylonFeaturePersistenceSaveToString(@ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("char*") ByteBuffer pFeatures, @Cast("size_t*") IntBuffer pFeaturesLen);
public static native @Cast("GENAPIC_RESULT") long PylonFeaturePersistenceSaveToString(@ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("char*") byte[] pFeatures, @Cast("size_t*") int[] pFeaturesLen);

public static native @Cast("GENAPIC_RESULT") long PylonFeaturePersistenceLoadFromString(@ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, @Cast("const char*") BytePointer pFeatures, @Cast("_Bool") boolean verify);
public static native @Cast("GENAPIC_RESULT") long PylonFeaturePersistenceLoadFromString(@ByVal @Cast("NODEMAP_HANDLE*") Pointer hMap, String pFeatures, @Cast("_Bool") boolean verify);


/* Image Persistence */
public static native @Cast("GENAPIC_RESULT") long PylonImagePersistenceSave(@Cast("EPylonImageFileFormat") int imageFileFormat,  @Cast("const char*") BytePointer pFilename, @Const Pointer pBuffer, @Cast("size_t") int bufferSize, @Cast("EPylonPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX, @Cast("EPylonImageOrientation") int orientation, PylonImagePersistenceOptions_t pOptions);
public static native @Cast("GENAPIC_RESULT") long PylonImagePersistenceSave(@Cast("EPylonImageFileFormat") int imageFileFormat,  String pFilename, @Const Pointer pBuffer, @Cast("size_t") int bufferSize, @Cast("EPylonPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX, @Cast("EPylonImageOrientation") int orientation, PylonImagePersistenceOptions_t pOptions);

public static native @Cast("GENAPIC_RESULT") long PylonImagePersistenceLoad(@Cast("const char*") BytePointer pFilename, Pointer pBuffer, @Cast("size_t*") IntPointer pBufferSize, @Cast("EPylonPixelType*") IntPointer pPixelType, @Cast("uint32_t*") IntPointer pWidth, @Cast("uint32_t*") IntPointer pHeight, @Cast("size_t*") IntPointer pPaddingX, @Cast("EPylonImageOrientation*") IntPointer pOrientation);
public static native @Cast("GENAPIC_RESULT") long PylonImagePersistenceLoad(String pFilename, Pointer pBuffer, @Cast("size_t*") IntBuffer pBufferSize, @Cast("EPylonPixelType*") IntBuffer pPixelType, @Cast("uint32_t*") IntBuffer pWidth, @Cast("uint32_t*") IntBuffer pHeight, @Cast("size_t*") IntBuffer pPaddingX, @Cast("EPylonImageOrientation*") IntBuffer pOrientation);
public static native @Cast("GENAPIC_RESULT") long PylonImagePersistenceLoad(@Cast("const char*") BytePointer pFilename, Pointer pBuffer, @Cast("size_t*") int[] pBufferSize, @Cast("EPylonPixelType*") int[] pPixelType, @Cast("uint32_t*") int[] pWidth, @Cast("uint32_t*") int[] pHeight, @Cast("size_t*") int[] pPaddingX, @Cast("EPylonImageOrientation*") int[] pOrientation);
public static native @Cast("GENAPIC_RESULT") long PylonImagePersistenceLoad(String pFilename, Pointer pBuffer, @Cast("size_t*") IntPointer pBufferSize, @Cast("EPylonPixelType*") IntPointer pPixelType, @Cast("uint32_t*") IntPointer pWidth, @Cast("uint32_t*") IntPointer pHeight, @Cast("size_t*") IntPointer pPaddingX, @Cast("EPylonImageOrientation*") IntPointer pOrientation);
public static native @Cast("GENAPIC_RESULT") long PylonImagePersistenceLoad(@Cast("const char*") BytePointer pFilename, Pointer pBuffer, @Cast("size_t*") IntBuffer pBufferSize, @Cast("EPylonPixelType*") IntBuffer pPixelType, @Cast("uint32_t*") IntBuffer pWidth, @Cast("uint32_t*") IntBuffer pHeight, @Cast("size_t*") IntBuffer pPaddingX, @Cast("EPylonImageOrientation*") IntBuffer pOrientation);
public static native @Cast("GENAPIC_RESULT") long PylonImagePersistenceLoad(String pFilename, Pointer pBuffer, @Cast("size_t*") int[] pBufferSize, @Cast("EPylonPixelType*") int[] pPixelType, @Cast("uint32_t*") int[] pWidth, @Cast("uint32_t*") int[] pHeight, @Cast("size_t*") int[] pPaddingX, @Cast("EPylonImageOrientation*") int[] pOrientation);

/* Image Format Converter */
public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterCreate(@Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer phConv);

public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterGetNodeMap(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("NODEMAP_HANDLE*") Pointer phMap);

public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterSetOutputPixelFormat(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("EPylonPixelType") int pixelType);

public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterGetOutputPixelFormat(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("EPylonPixelType*") IntPointer pPixelType);
public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterGetOutputPixelFormat(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("EPylonPixelType*") IntBuffer pPixelType);
public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterGetOutputPixelFormat(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("EPylonPixelType*") int[] pPixelType);

public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterSetOutputPaddingX(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("size_t") int paddingX);

public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterGetOutputPaddingX(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("size_t*") IntPointer pPaddingX);
public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterGetOutputPaddingX(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("size_t*") IntBuffer pPaddingX);
public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterGetOutputPaddingX(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("size_t*") int[] pPaddingX);

public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterConvert(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, Pointer targetBuffer, @Cast("size_t") int targetBufferSize, @Const Pointer sourceBuffer, @Cast("size_t") int sourceBufferSize, @Cast("EPylonPixelType") int sourcePixelType, @Cast("uint32_t") int sourceWidth, @Cast("uint32_t") int sourceHeight, @Cast("size_t") int sourcePaddingX, @Cast("EPylonImageOrientation") int sourceOrientation);

public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterGetBufferSizeForConversion(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("EPylonPixelType") int sourcePixelType, @Cast("uint32_t") int sourceWidth, @Cast("uint32_t") int sourceHeight, @Cast("size_t*") IntPointer pBufSize);
public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterGetBufferSizeForConversion(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("EPylonPixelType") int sourcePixelType, @Cast("uint32_t") int sourceWidth, @Cast("uint32_t") int sourceHeight, @Cast("size_t*") IntBuffer pBufSize);
public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterGetBufferSizeForConversion(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv, @Cast("EPylonPixelType") int sourcePixelType, @Cast("uint32_t") int sourceWidth, @Cast("uint32_t") int sourceHeight, @Cast("size_t*") int[] pBufSize);

public static native @Cast("GENAPIC_RESULT") long PylonImageFormatConverterDestroy(@ByVal @Cast("PYLON_IMAGE_FORMAT_CONVERTER_HANDLE*") IntPointer hConv);


/* Avi Writer */
public static native @Cast("GENAPIC_RESULT") long PylonAviWriterCreate(@Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer phWriter);

public static native @Cast("GENAPIC_RESULT") long PylonAviWriterDestroy(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter);

public static native @Cast("GENAPIC_RESULT") long PylonAviWriterOpen(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter, @Cast("const char*") BytePointer pFilename, double framesPerSecondPlayback, @Cast("EPylonPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("EPylonImageOrientation") int orientation, PylonAviCompressionOptions_t pCompressionOptions);
public static native @Cast("GENAPIC_RESULT") long PylonAviWriterOpen(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter, String pFilename, double framesPerSecondPlayback, @Cast("EPylonPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("EPylonImageOrientation") int orientation, PylonAviCompressionOptions_t pCompressionOptions);

public static native @Cast("GENAPIC_RESULT") long PylonAviWriterClose(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter);

public static native @Cast("GENAPIC_RESULT") long PylonAviWriterIsOpen(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter, @Cast("_Bool*") BoolPointer pIsOpen);
public static native @Cast("GENAPIC_RESULT") long PylonAviWriterIsOpen(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter, @Cast("_Bool*") boolean[] pIsOpen);

public static native @Cast("GENAPIC_RESULT") long PylonAviWriterAdd(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter, @Const Pointer pBuffer, @Cast("size_t") int bufferSize, @Cast("EPylonPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX, @Cast("EPylonImageOrientation") int orientation, @Cast("EPylonKeyFrameSelection") int keyFrameSelection);

public static native @Cast("GENAPIC_RESULT") long PylonAviWriterCanAddWithoutConversion(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter, @Cast("EPylonPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX, @Cast("EPylonImageOrientation") int orientation, @Cast("_Bool*") BoolPointer pCanAddWithoutConversion);
public static native @Cast("GENAPIC_RESULT") long PylonAviWriterCanAddWithoutConversion(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter, @Cast("EPylonPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX, @Cast("EPylonImageOrientation") int orientation, @Cast("_Bool*") boolean[] pCanAddWithoutConversion);

public static native @Cast("GENAPIC_RESULT") long PylonAviWriterGetImageDataBytesWritten(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter, @Cast("size_t*") IntPointer pImageDataBytesWritten);
public static native @Cast("GENAPIC_RESULT") long PylonAviWriterGetImageDataBytesWritten(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter, @Cast("size_t*") IntBuffer pImageDataBytesWritten);
public static native @Cast("GENAPIC_RESULT") long PylonAviWriterGetImageDataBytesWritten(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter, @Cast("size_t*") int[] pImageDataBytesWritten);

public static native @Cast("GENAPIC_RESULT") long PylonAviWriterGetCountOfAddedImages(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter, @Cast("size_t*") IntPointer pCountOfAddedImages);
public static native @Cast("GENAPIC_RESULT") long PylonAviWriterGetCountOfAddedImages(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter, @Cast("size_t*") IntBuffer pCountOfAddedImages);
public static native @Cast("GENAPIC_RESULT") long PylonAviWriterGetCountOfAddedImages(@ByVal @Cast("PYLON_AVI_WRITER_HANDLE*") IntPointer hWriter, @Cast("size_t*") int[] pCountOfAddedImages);


/* Pylon Image Window */
public static native @Cast("GENAPIC_RESULT") long PylonImageWindowCreate(@Cast("size_t") int winIndex, int x, int y, int nWidth, int nHeight);

public static native @Cast("GENAPIC_RESULT") long PylonImageWindowShow(@Cast("size_t") int winIndex, int nShow);

public static native @Cast("GENAPIC_RESULT") long PylonImageWindowHide(@Cast("size_t") int winIndex);

public static native @Cast("GENAPIC_RESULT") long PylonImageWindowClose(@Cast("size_t") int winIndex);

public static native @Cast("GENAPIC_RESULT") long PylonImageWindowGetWindowHandle(@Cast("size_t") int winIndex, @Cast("HWND*") Pointer phWindow);

public static native @Cast("GENAPIC_RESULT") long PylonImageWindowSetImage(@Cast("size_t") int winIndex, @Const Pointer buffer, @Cast("size_t") int bufferSize, @Cast("EPylonPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX, @Cast("EPylonImageOrientation") int orientation);

public static native @Cast("GENAPIC_RESULT") long PylonImageWindowDisplayImage(@Cast("size_t") int winIndex, @Const Pointer buffer, @Cast("size_t") int bufferSize, @Cast("EPylonPixelType") int pixelType, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("size_t") int paddingX, @Cast("EPylonImageOrientation") int orientation);

public static native @Cast("GENAPIC_RESULT") long PylonImageWindowDisplayImageGrabResult(@Cast("size_t") int winIndex, PylonGrabResult_t grabResult);
// #endif

// #ifdef __cplusplus

// #endif /* __cplusplus */

// #include <pylonc/PylonC32BitMethods.h>

// undefine macros defined by this header
// #if defined(RPC_NO_WINDOWS_H_DEFINED_BY_PYLONC)
// #   undef RPC_NO_WINDOWS_H_DEFINED_BY_PYLONC
// #   undef RPC_NO_WINDOWS_H
// #endif

// #pragma pack(pop)

// #endif /* PYLONC_PYLONC_H_ */


}
