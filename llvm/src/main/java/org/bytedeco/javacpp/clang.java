// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.LLVM.*;

public class clang extends org.bytedeco.javacpp.presets.clang {
    static { Loader.load(); }

// Parsed from <clang-c/Platform.h>

/*===-- clang-c/Platform.h - C Index platform decls   -------------*- C -*-===*\
|*                                                                            *|
|*                     The LLVM Compiler Infrastructure                       *|
|*                                                                            *|
|* This file is distributed under the University of Illinois Open Source      *|
|* License. See LICENSE.TXT for details.                                      *|
|*                                                                            *|
|*===----------------------------------------------------------------------===*|
|*                                                                            *|
|* This header provides platform specific macros (dllimport, deprecated, ...) *|
|*                                                                            *|
\*===----------------------------------------------------------------------===*/

// #ifndef LLVM_CLANG_C_PLATFORM_H
// #define LLVM_CLANG_C_PLATFORM_H

// #ifdef __cplusplus
// #endif

/* MSVC DLL import/export. */
// #ifdef _MSC_VER
//   #ifdef _CINDEX_LIB_
//     #define CINDEX_LINKAGE __declspec(dllexport)
//   #else
//     #define CINDEX_LINKAGE __declspec(dllimport)
//   #endif
// #else
//   #define CINDEX_LINKAGE
// #endif

// #ifdef __GNUC__
//   #define CINDEX_DEPRECATED __attribute__((deprecated))
// #else
//   #ifdef _MSC_VER
//     #define CINDEX_DEPRECATED __declspec(deprecated)
//   #else
//     #define CINDEX_DEPRECATED
//   #endif
// #endif

// #ifdef __cplusplus
// #endif
// #endif


// Parsed from <clang-c/CXErrorCode.h>

/*===-- clang-c/CXErrorCode.h - C Index Error Codes  --------------*- C -*-===*\
|*                                                                            *|
|*                     The LLVM Compiler Infrastructure                       *|
|*                                                                            *|
|* This file is distributed under the University of Illinois Open Source      *|
|* License. See LICENSE.TXT for details.                                      *|
|*                                                                            *|
|*===----------------------------------------------------------------------===*|
|*                                                                            *|
|* This header provides the CXErrorCode enumerators.                          *|
|*                                                                            *|
\*===----------------------------------------------------------------------===*/

// #ifndef LLVM_CLANG_C_CXERRORCODE_H
// #define LLVM_CLANG_C_CXERRORCODE_H

// #include "clang-c/Platform.h"

// #ifdef __cplusplus
// #endif

/**
 * \brief Error codes returned by libclang routines.
 *
 * Zero (\c CXError_Success) is the only error code indicating success.  Other
 * error codes, including not yet assigned non-zero values, indicate errors.
 */
/** enum CXErrorCode */
public static final int
  /**
   * \brief No error.
   */
  CXError_Success = 0,

  /**
   * \brief A generic error code, no further details are available.
   *
   * Errors of this kind can get their own specific error codes in future
   * libclang versions.
   */
  CXError_Failure = 1,

  /**
   * \brief libclang crashed while performing the requested operation.
   */
  CXError_Crashed = 2,

  /**
   * \brief The function detected that the arguments violate the function
   * contract.
   */
  CXError_InvalidArguments = 3,

  /**
   * \brief An AST deserialization error has occurred.
   */
  CXError_ASTReadError = 4;

// #ifdef __cplusplus
// #endif
// #endif



// Parsed from <clang-c/CXString.h>

/*===-- clang-c/CXString.h - C Index strings  --------------------*- C -*-===*\
|*                                                                            *|
|*                     The LLVM Compiler Infrastructure                       *|
|*                                                                            *|
|* This file is distributed under the University of Illinois Open Source      *|
|* License. See LICENSE.TXT for details.                                      *|
|*                                                                            *|
|*===----------------------------------------------------------------------===*|
|*                                                                            *|
|* This header provides the interface to C Index strings.                     *|
|*                                                                            *|
\*===----------------------------------------------------------------------===*/

// #ifndef LLVM_CLANG_C_CXSTRING_H
// #define LLVM_CLANG_C_CXSTRING_H

// #include "clang-c/Platform.h"

// #ifdef __cplusplus
// #endif

/**
 * \defgroup CINDEX_STRING String manipulation routines
 * \ingroup CINDEX
 *
 * \{
 */

/**
 * \brief A character string.
 *
 * The \c CXString type is used to return strings from the interface when
 * the ownership of that string might differ from one call to the next.
 * Use \c clang_getCString() to retrieve the string data and, once finished
 * with the string data, call \c clang_disposeString() to free the string.
 */
public static class CXString extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXString() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXString(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXString(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXString position(int position) {
        return (CXString)super.position(position);
    }

  @MemberGetter public native @Const Pointer data();
  public native @Cast("unsigned") int private_flags(); public native CXString private_flags(int private_flags);
}

/**
 * \brief Retrieve the character data associated with the given string.
 */
public static native @Cast("const char*") BytePointer clang_getCString(@ByVal CXString string);

/**
 * \brief Free the given string.
 */
public static native void clang_disposeString(@ByVal CXString string);

/**
 * \}
 */

// #ifdef __cplusplus
// #endif
// #endif



// Parsed from <clang-c/CXCompilationDatabase.h>

/*===-- clang-c/CXCompilationDatabase.h - Compilation database  ---*- C -*-===*\
|*                                                                            *|
|*                     The LLVM Compiler Infrastructure                       *|
|*                                                                            *|
|* This file is distributed under the University of Illinois Open Source      *|
|* License. See LICENSE.TXT for details.                                      *|
|*                                                                            *|
|*===----------------------------------------------------------------------===*|
|*                                                                            *|
|* This header provides a public inferface to use CompilationDatabase without *|
|* the full Clang C++ API.                                                    *|
|*                                                                            *|
\*===----------------------------------------------------------------------===*/

// #ifndef LLVM_CLANG_C_CXCOMPILATIONDATABASE_H
// #define LLVM_CLANG_C_CXCOMPILATIONDATABASE_H

// #include "clang-c/Platform.h"
// #include "clang-c/CXString.h"

// #ifdef __cplusplus
// #endif

/** \defgroup COMPILATIONDB CompilationDatabase functions
 * \ingroup CINDEX
 *
 * \{
 */

/**
 * A compilation database holds all information used to compile files in a
 * project. For each file in the database, it can be queried for the working
 * directory or the command line used for the compiler invocation.
 *
 * Must be freed by \c clang_CompilationDatabase_dispose
 */
@Namespace @Name("void") @Opaque public static class CXCompilationDatabase extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXCompilationDatabase() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXCompilationDatabase(Pointer p) { super(p); }
}

/**
 * \brief Contains the results of a search in the compilation database
 *
 * When searching for the compile command for a file, the compilation db can
 * return several commands, as the file may have been compiled with
 * different options in different places of the project. This choice of compile
 * commands is wrapped in this opaque data structure. It must be freed by
 * \c clang_CompileCommands_dispose.
 */
@Namespace @Name("void") @Opaque public static class CXCompileCommands extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXCompileCommands() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXCompileCommands(Pointer p) { super(p); }
}

/**
 * \brief Represents the command line invocation to compile a specific file.
 */
@Namespace @Name("void") @Opaque public static class CXCompileCommand extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXCompileCommand() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXCompileCommand(Pointer p) { super(p); }
}

/**
 * \brief Error codes for Compilation Database
 */
/** enum CXCompilationDatabase_Error */
public static final int
  /*
   * \brief No error occurred
   */
  CXCompilationDatabase_NoError = 0,

  /*
   * \brief Database can not be loaded
   */
  CXCompilationDatabase_CanNotLoadDatabase = 1;

/**
 * \brief Creates a compilation database from the database found in directory
 * buildDir. For example, CMake can output a compile_commands.json which can
 * be used to build the database.
 *
 * It must be freed by \c clang_CompilationDatabase_dispose.
 */
public static native CXCompilationDatabase clang_CompilationDatabase_fromDirectory(@Cast("const char*") BytePointer BuildDir,
                                        @Cast("CXCompilationDatabase_Error*") IntPointer ErrorCode);
public static native CXCompilationDatabase clang_CompilationDatabase_fromDirectory(String BuildDir,
                                        @Cast("CXCompilationDatabase_Error*") IntBuffer ErrorCode);
public static native CXCompilationDatabase clang_CompilationDatabase_fromDirectory(@Cast("const char*") BytePointer BuildDir,
                                        @Cast("CXCompilationDatabase_Error*") int[] ErrorCode);
public static native CXCompilationDatabase clang_CompilationDatabase_fromDirectory(String BuildDir,
                                        @Cast("CXCompilationDatabase_Error*") IntPointer ErrorCode);
public static native CXCompilationDatabase clang_CompilationDatabase_fromDirectory(@Cast("const char*") BytePointer BuildDir,
                                        @Cast("CXCompilationDatabase_Error*") IntBuffer ErrorCode);
public static native CXCompilationDatabase clang_CompilationDatabase_fromDirectory(String BuildDir,
                                        @Cast("CXCompilationDatabase_Error*") int[] ErrorCode);

/**
 * \brief Free the given compilation database
 */
public static native void clang_CompilationDatabase_dispose(CXCompilationDatabase arg0);

/**
 * \brief Find the compile commands used for a file. The compile commands
 * must be freed by \c clang_CompileCommands_dispose.
 */
public static native CXCompileCommands clang_CompilationDatabase_getCompileCommands(CXCompilationDatabase arg0,
                                             @Cast("const char*") BytePointer CompleteFileName);
public static native CXCompileCommands clang_CompilationDatabase_getCompileCommands(CXCompilationDatabase arg0,
                                             String CompleteFileName);

/**
 * \brief Get all the compile commands in the given compilation database.
 */
public static native CXCompileCommands clang_CompilationDatabase_getAllCompileCommands(CXCompilationDatabase arg0);

/**
 * \brief Free the given CompileCommands
 */
public static native void clang_CompileCommands_dispose(CXCompileCommands arg0);

/**
 * \brief Get the number of CompileCommand we have for a file
 */
public static native @Cast("unsigned") int clang_CompileCommands_getSize(CXCompileCommands arg0);

/**
 * \brief Get the I'th CompileCommand for a file
 *
 * Note : 0 <= i < clang_CompileCommands_getSize(CXCompileCommands)
 */
public static native CXCompileCommand clang_CompileCommands_getCommand(CXCompileCommands arg0, @Cast("unsigned") int I);

/**
 * \brief Get the working directory where the CompileCommand was executed from
 */
public static native @ByVal CXString clang_CompileCommand_getDirectory(CXCompileCommand arg0);

/**
 * \brief Get the number of arguments in the compiler invocation.
 *
 */
public static native @Cast("unsigned") int clang_CompileCommand_getNumArgs(CXCompileCommand arg0);

/**
 * \brief Get the I'th argument value in the compiler invocations
 *
 * Invariant :
 *  - argument 0 is the compiler executable
 */
public static native @ByVal CXString clang_CompileCommand_getArg(CXCompileCommand arg0, @Cast("unsigned") int I);

/**
 * \brief Get the number of source mappings for the compiler invocation.
 */
public static native @Cast("unsigned") int clang_CompileCommand_getNumMappedSources(CXCompileCommand arg0);

/**
 * \brief Get the I'th mapped source path for the compiler invocation.
 */
public static native @ByVal CXString clang_CompileCommand_getMappedSourcePath(CXCompileCommand arg0, @Cast("unsigned") int I);

/**
 * \brief Get the I'th mapped source content for the compiler invocation.
 */
public static native @ByVal CXString clang_CompileCommand_getMappedSourceContent(CXCompileCommand arg0, @Cast("unsigned") int I);

/**
 * \}
 */

// #ifdef __cplusplus
// #endif
// #endif



// Parsed from <clang-c/BuildSystem.h>

/*==-- clang-c/BuildSystem.h - Utilities for use by build systems -*- C -*-===*\
|*                                                                            *|
|*                     The LLVM Compiler Infrastructure                       *|
|*                                                                            *|
|* This file is distributed under the University of Illinois Open Source      *|
|* License. See LICENSE.TXT for details.                                      *|
|*                                                                            *|
|*===----------------------------------------------------------------------===*|
|*                                                                            *|
|* This header provides various utilities for use by build systems.           *|
|*                                                                            *|
\*===----------------------------------------------------------------------===*/

// #ifndef LLVM_CLANG_C_BUILDSYSTEM_H
// #define LLVM_CLANG_C_BUILDSYSTEM_H

// #include "clang-c/Platform.h"
// #include "clang-c/CXErrorCode.h"
// #include "clang-c/CXString.h"

// #ifdef __cplusplus
// #endif

/**
 * \defgroup BUILD_SYSTEM Build system utilities
 * \{
 */

/**
 * \brief Return the timestamp for use with Clang's
 * \c -fbuild-session-timestamp= option.
 */
public static native @Cast("unsigned long long") long clang_getBuildSessionTimestamp();

/**
 * \brief Object encapsulating information about overlaying virtual
 * file/directories over the real file system.
 */
@Name("CXVirtualFileOverlayImpl") @Opaque public static class CXVirtualFileOverlay extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXVirtualFileOverlay() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXVirtualFileOverlay(Pointer p) { super(p); }
}

/**
 * \brief Create a \c CXVirtualFileOverlay object.
 * Must be disposed with \c clang_VirtualFileOverlay_dispose().
 *
 * @param options is reserved, always pass 0.
 */
public static native CXVirtualFileOverlay clang_VirtualFileOverlay_create(@Cast("unsigned") int options);

/**
 * \brief Map an absolute virtual file path to an absolute real one.
 * The virtual path must be canonicalized (not contain "."/"..").
 * @return 0 for success, non-zero to indicate an error.
 */
public static native @Cast("CXErrorCode") int clang_VirtualFileOverlay_addFileMapping(CXVirtualFileOverlay arg0,
                                        @Cast("const char*") BytePointer virtualPath,
                                        @Cast("const char*") BytePointer realPath);
public static native @Cast("CXErrorCode") int clang_VirtualFileOverlay_addFileMapping(CXVirtualFileOverlay arg0,
                                        String virtualPath,
                                        String realPath);

/**
 * \brief Set the case sensitivity for the \c CXVirtualFileOverlay object.
 * The \c CXVirtualFileOverlay object is case-sensitive by default, this
 * option can be used to override the default.
 * @return 0 for success, non-zero to indicate an error.
 */
public static native @Cast("CXErrorCode") int clang_VirtualFileOverlay_setCaseSensitivity(CXVirtualFileOverlay arg0,
											int caseSensitive);

/**
 * \brief Write out the \c CXVirtualFileOverlay object to a char buffer.
 *
 * @param options is reserved, always pass 0.
 * @param out_buffer_ptr pointer to receive the buffer pointer, which should be
 * disposed using \c clang_free().
 * @param out_buffer_size pointer to receive the buffer size.
 * @return 0 for success, non-zero to indicate an error.
 */
public static native @Cast("CXErrorCode") int clang_VirtualFileOverlay_writeToBuffer(CXVirtualFileOverlay arg0, @Cast("unsigned") int options,
                                       @Cast("char**") PointerPointer out_buffer_ptr,
                                       @Cast("unsigned*") IntPointer out_buffer_size);
public static native @Cast("CXErrorCode") int clang_VirtualFileOverlay_writeToBuffer(CXVirtualFileOverlay arg0, @Cast("unsigned") int options,
                                       @Cast("char**") @ByPtrPtr BytePointer out_buffer_ptr,
                                       @Cast("unsigned*") IntPointer out_buffer_size);
public static native @Cast("CXErrorCode") int clang_VirtualFileOverlay_writeToBuffer(CXVirtualFileOverlay arg0, @Cast("unsigned") int options,
                                       @Cast("char**") @ByPtrPtr ByteBuffer out_buffer_ptr,
                                       @Cast("unsigned*") IntBuffer out_buffer_size);
public static native @Cast("CXErrorCode") int clang_VirtualFileOverlay_writeToBuffer(CXVirtualFileOverlay arg0, @Cast("unsigned") int options,
                                       @Cast("char**") @ByPtrPtr byte[] out_buffer_ptr,
                                       @Cast("unsigned*") int[] out_buffer_size);

/**
 * \brief free memory allocated by libclang, such as the buffer returned by
 * \c CXVirtualFileOverlay() or \c clang_ModuleMapDescriptor_writeToBuffer().
 *
 * @param buffer memory pointer to free.
 */
public static native void clang_free(Pointer buffer);

/**
 * \brief Dispose a \c CXVirtualFileOverlay object.
 */
public static native void clang_VirtualFileOverlay_dispose(CXVirtualFileOverlay arg0);

/**
 * \brief Object encapsulating information about a module.map file.
 */
@Name("CXModuleMapDescriptorImpl") @Opaque public static class CXModuleMapDescriptor extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXModuleMapDescriptor() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXModuleMapDescriptor(Pointer p) { super(p); }
}

/**
 * \brief Create a \c CXModuleMapDescriptor object.
 * Must be disposed with \c clang_ModuleMapDescriptor_dispose().
 *
 * @param options is reserved, always pass 0.
 */
public static native CXModuleMapDescriptor clang_ModuleMapDescriptor_create(@Cast("unsigned") int options);

/**
 * \brief Sets the framework module name that the module.map describes.
 * @return 0 for success, non-zero to indicate an error.
 */
public static native @Cast("CXErrorCode") int clang_ModuleMapDescriptor_setFrameworkModuleName(CXModuleMapDescriptor arg0,
                                                 @Cast("const char*") BytePointer name);
public static native @Cast("CXErrorCode") int clang_ModuleMapDescriptor_setFrameworkModuleName(CXModuleMapDescriptor arg0,
                                                 String name);

/**
 * \brief Sets the umbrealla header name that the module.map describes.
 * @return 0 for success, non-zero to indicate an error.
 */
public static native @Cast("CXErrorCode") int clang_ModuleMapDescriptor_setUmbrellaHeader(CXModuleMapDescriptor arg0,
                                            @Cast("const char*") BytePointer name);
public static native @Cast("CXErrorCode") int clang_ModuleMapDescriptor_setUmbrellaHeader(CXModuleMapDescriptor arg0,
                                            String name);

/**
 * \brief Write out the \c CXModuleMapDescriptor object to a char buffer.
 *
 * @param options is reserved, always pass 0.
 * @param out_buffer_ptr pointer to receive the buffer pointer, which should be
 * disposed using \c clang_free().
 * @param out_buffer_size pointer to receive the buffer size.
 * @return 0 for success, non-zero to indicate an error.
 */
public static native @Cast("CXErrorCode") int clang_ModuleMapDescriptor_writeToBuffer(CXModuleMapDescriptor arg0, @Cast("unsigned") int options,
                                       @Cast("char**") PointerPointer out_buffer_ptr,
                                       @Cast("unsigned*") IntPointer out_buffer_size);
public static native @Cast("CXErrorCode") int clang_ModuleMapDescriptor_writeToBuffer(CXModuleMapDescriptor arg0, @Cast("unsigned") int options,
                                       @Cast("char**") @ByPtrPtr BytePointer out_buffer_ptr,
                                       @Cast("unsigned*") IntPointer out_buffer_size);
public static native @Cast("CXErrorCode") int clang_ModuleMapDescriptor_writeToBuffer(CXModuleMapDescriptor arg0, @Cast("unsigned") int options,
                                       @Cast("char**") @ByPtrPtr ByteBuffer out_buffer_ptr,
                                       @Cast("unsigned*") IntBuffer out_buffer_size);
public static native @Cast("CXErrorCode") int clang_ModuleMapDescriptor_writeToBuffer(CXModuleMapDescriptor arg0, @Cast("unsigned") int options,
                                       @Cast("char**") @ByPtrPtr byte[] out_buffer_ptr,
                                       @Cast("unsigned*") int[] out_buffer_size);

/**
 * \brief Dispose a \c CXModuleMapDescriptor object.
 */
public static native void clang_ModuleMapDescriptor_dispose(CXModuleMapDescriptor arg0);

/**
 * \}
 */

// #ifdef __cplusplus
// #endif

// #endif /* CLANG_C_BUILD_SYSTEM_H */



// Parsed from <clang-c/Index.h>

/*===-- clang-c/Index.h - Indexing Public C Interface -------------*- C -*-===*\
|*                                                                            *|
|*                     The LLVM Compiler Infrastructure                       *|
|*                                                                            *|
|* This file is distributed under the University of Illinois Open Source      *|
|* License. See LICENSE.TXT for details.                                      *|
|*                                                                            *|
|*===----------------------------------------------------------------------===*|
|*                                                                            *|
|* This header provides a public inferface to a Clang library for extracting  *|
|* high-level symbol information from source files without exposing the full  *|
|* Clang C++ API.                                                             *|
|*                                                                            *|
\*===----------------------------------------------------------------------===*/

// #ifndef LLVM_CLANG_C_INDEX_H
// #define LLVM_CLANG_C_INDEX_H

// #include <time.h>

// #include "clang-c/Platform.h"
// #include "clang-c/CXErrorCode.h"
// #include "clang-c/CXString.h"
// #include "clang-c/BuildSystem.h"

/**
 * \brief The version constants for the libclang API.
 * CINDEX_VERSION_MINOR should increase when there are API additions.
 * CINDEX_VERSION_MAJOR is intended for "major" source/ABI breaking changes.
 *
 * The policy about the libclang API was always to keep it source and ABI
 * compatible, thus CINDEX_VERSION_MAJOR is expected to remain stable.
 */
public static final int CINDEX_VERSION_MAJOR = 0;
public static final int CINDEX_VERSION_MINOR = 30;

// #define CINDEX_VERSION_ENCODE(major, minor) (
//       ((major) * 10000)
//     + ((minor) *     1))

public static native @MemberGetter int CINDEX_VERSION();
public static final int CINDEX_VERSION = CINDEX_VERSION();

// #define CINDEX_VERSION_STRINGIZE_(major, minor)
//     #major"."#minor
// #define CINDEX_VERSION_STRINGIZE(major, minor)
//     CINDEX_VERSION_STRINGIZE_(major, minor)

// #define CINDEX_VERSION_STRING CINDEX_VERSION_STRINGIZE(
//     CINDEX_VERSION_MAJOR,
//     CINDEX_VERSION_MINOR)

// #ifdef __cplusplus
// #endif

/** \defgroup CINDEX libclang: C Interface to Clang
 *
 * The C Interface to Clang provides a relatively small API that exposes
 * facilities for parsing source code into an abstract syntax tree (AST),
 * loading already-parsed ASTs, traversing the AST, associating
 * physical source locations with elements within the AST, and other
 * facilities that support Clang-based development tools.
 *
 * This C interface to Clang will never provide all of the information
 * representation stored in Clang's C++ AST, nor should it: the intent is to
 * maintain an API that is relatively stable from one release to the next,
 * providing only the basic functionality needed to support development tools.
 *
 * To avoid namespace pollution, data types are prefixed with "CX" and
 * functions are prefixed with "clang_".
 *
 * \{
 */

/**
 * \brief An "index" that consists of a set of translation units that would
 * typically be linked together into an executable or library.
 */
@Namespace @Name("void") @Opaque public static class CXIndex extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXIndex() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIndex(Pointer p) { super(p); }
}

/**
 * \brief A single translation unit, which resides in an index.
 */
@Name("CXTranslationUnitImpl") @Opaque public static class CXTranslationUnit extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXTranslationUnit() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXTranslationUnit(Pointer p) { super(p); }
}

/**
 * \brief Opaque pointer representing client data that will be passed through
 * to various callbacks and visitors.
 */
@Namespace @Name("void") @Opaque public static class CXClientData extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXClientData() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXClientData(Pointer p) { super(p); }
}

/**
 * \brief Provides the contents of a file that has not yet been saved to disk.
 *
 * Each CXUnsavedFile instance provides the name of a file on the
 * system along with the current contents of that file that have not
 * yet been saved to disk.
 */
public static class CXUnsavedFile extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXUnsavedFile() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXUnsavedFile(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXUnsavedFile(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXUnsavedFile position(int position) {
        return (CXUnsavedFile)super.position(position);
    }

  /**
   * \brief The file whose contents have not yet been saved.
   *
   * This file must already exist in the file system.
   */
  @MemberGetter public native @Cast("const char*") BytePointer Filename();

  /**
   * \brief A buffer containing the unsaved contents of this file.
   */
  @MemberGetter public native @Cast("const char*") BytePointer Contents();

  /**
   * \brief The length of the unsaved contents of this buffer.
   */
  public native @Cast("unsigned long") long Length(); public native CXUnsavedFile Length(long Length);
}

/**
 * \brief Describes the availability of a particular entity, which indicates
 * whether the use of this entity will result in a warning or error due to
 * it being deprecated or unavailable.
 */
/** enum CXAvailabilityKind */
public static final int
  /**
   * \brief The entity is available.
   */
  CXAvailability_Available = 0,
  /**
   * \brief The entity is available, but has been deprecated (and its use is
   * not recommended).
   */
  CXAvailability_Deprecated = 1,
  /**
   * \brief The entity is not available; any use of it will be an error.
   */
  CXAvailability_NotAvailable = 2,
  /**
   * \brief The entity is available, but not accessible; any use of it will be
   * an error.
   */
  CXAvailability_NotAccessible = 3;

/**
 * \brief Describes a version number of the form major.minor.subminor.
 */
public static class CXVersion extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXVersion() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXVersion(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXVersion(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXVersion position(int position) {
        return (CXVersion)super.position(position);
    }

  /**
   * \brief The major version number, e.g., the '10' in '10.7.3'. A negative
   * value indicates that there is no version number at all.
   */
  public native int Major(); public native CXVersion Major(int Major);
  /**
   * \brief The minor version number, e.g., the '7' in '10.7.3'. This value
   * will be negative if no minor version number was provided, e.g., for 
   * version '10'.
   */
  public native int Minor(); public native CXVersion Minor(int Minor);
  /**
   * \brief The subminor version number, e.g., the '3' in '10.7.3'. This value
   * will be negative if no minor or subminor version number was provided,
   * e.g., in version '10' or '10.7'.
   */
  public native int Subminor(); public native CXVersion Subminor(int Subminor);
}
  
/**
 * \brief Provides a shared context for creating translation units.
 *
 * It provides two options:
 *
 * - excludeDeclarationsFromPCH: When non-zero, allows enumeration of "local"
 * declarations (when loading any new translation units). A "local" declaration
 * is one that belongs in the translation unit itself and not in a precompiled
 * header that was used by the translation unit. If zero, all declarations
 * will be enumerated.
 *
 * Here is an example:
 *
 * <pre>{@code
 *   // excludeDeclsFromPCH = 1, displayDiagnostics=1
 *   Idx = clang_createIndex(1, 1);
 *
 *   // IndexTest.pch was produced with the following command:
 *   // "clang -x c IndexTest.h -emit-ast -o IndexTest.pch"
 *   TU = clang_createTranslationUnit(Idx, "IndexTest.pch");
 *
 *   // This will load all the symbols from 'IndexTest.pch'
 *   clang_visitChildren(clang_getTranslationUnitCursor(TU),
 *                       TranslationUnitVisitor, 0);
 *   clang_disposeTranslationUnit(TU);
 *
 *   // This will load all the symbols from 'IndexTest.c', excluding symbols
 *   // from 'IndexTest.pch'.
 *   char *args[] = { "-Xclang", "-include-pch=IndexTest.pch" };
 *   TU = clang_createTranslationUnitFromSourceFile(Idx, "IndexTest.c", 2, args,
 *                                                  0, 0);
 *   clang_visitChildren(clang_getTranslationUnitCursor(TU),
 *                       TranslationUnitVisitor, 0);
 *   clang_disposeTranslationUnit(TU);
 * }</pre>
 *
 * This process of creating the 'pch', loading it separately, and using it (via
 * -include-pch) allows 'excludeDeclsFromPCH' to remove redundant callbacks
 * (which gives the indexer the same performance benefit as the compiler).
 */
public static native CXIndex clang_createIndex(int excludeDeclarationsFromPCH,
                                         int displayDiagnostics);

/**
 * \brief Destroy the given index.
 *
 * The index must not be destroyed until all of the translation units created
 * within that index have been destroyed.
 */
public static native void clang_disposeIndex(CXIndex index);

/** enum CXGlobalOptFlags */
public static final int
  /**
   * \brief Used to indicate that no special CXIndex options are needed.
   */
  CXGlobalOpt_None =  0x0,

  /**
   * \brief Used to indicate that threads that libclang creates for indexing
   * purposes should use background priority.
   *
   * Affects #clang_indexSourceFile, #clang_indexTranslationUnit,
   * #clang_parseTranslationUnit, #clang_saveTranslationUnit.
   */
  CXGlobalOpt_ThreadBackgroundPriorityForIndexing =  0x1,

  /**
   * \brief Used to indicate that threads that libclang creates for editing
   * purposes should use background priority.
   *
   * Affects #clang_reparseTranslationUnit, #clang_codeCompleteAt,
   * #clang_annotateTokens
   */
  CXGlobalOpt_ThreadBackgroundPriorityForEditing =  0x2,

  /**
   * \brief Used to indicate that all threads that libclang creates should use
   * background priority.
   */
  CXGlobalOpt_ThreadBackgroundPriorityForAll = 
      CXGlobalOpt_ThreadBackgroundPriorityForIndexing |
      CXGlobalOpt_ThreadBackgroundPriorityForEditing;

/**
 * \brief Sets general options associated with a CXIndex.
 *
 * For example:
 * <pre>{@code
 * CXIndex idx = ...;
 * clang_CXIndex_setGlobalOptions(idx,
 *     clang_CXIndex_getGlobalOptions(idx) |
 *     CXGlobalOpt_ThreadBackgroundPriorityForIndexing);
 * }</pre>
 *
 * @param options A bitmask of options, a bitwise OR of CXGlobalOpt_XXX flags.
 */
public static native void clang_CXIndex_setGlobalOptions(CXIndex arg0, @Cast("unsigned") int options);

/**
 * \brief Gets the general options associated with a CXIndex.
 *
 * @return A bitmask of options, a bitwise OR of CXGlobalOpt_XXX flags that
 * are associated with the given CXIndex object.
 */
public static native @Cast("unsigned") int clang_CXIndex_getGlobalOptions(CXIndex arg0);

/**
 * \defgroup CINDEX_FILES File manipulation routines
 *
 * \{
 */

/**
 * \brief A particular source file that is part of a translation unit.
 */
@Namespace @Name("void") @Opaque public static class CXFile extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXFile() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXFile(Pointer p) { super(p); }
}


/**
 * \brief Retrieve the complete file and path name of the given file.
 */
public static native @ByVal CXString clang_getFileName(CXFile SFile);

/**
 * \brief Retrieve the last modification time of the given file.
 */
public static native @ByVal @Cast("time_t*") Pointer clang_getFileTime(CXFile SFile);

/**
 * \brief Uniquely identifies a CXFile, that refers to the same underlying file,
 * across an indexing session.
 */
public static class CXFileUniqueID extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXFileUniqueID() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXFileUniqueID(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXFileUniqueID(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXFileUniqueID position(int position) {
        return (CXFileUniqueID)super.position(position);
    }

  public native @Cast("unsigned long long") long data(int i); public native CXFileUniqueID data(int i, long data);
  @MemberGetter public native @Cast("unsigned long long*") LongPointer data();
}

/**
 * \brief Retrieve the unique ID for the given \c file.
 *
 * @param file the file to get the ID for.
 * @param outID stores the returned CXFileUniqueID.
 * @return If there was a failure getting the unique ID, returns non-zero,
 * otherwise returns 0.
*/
public static native int clang_getFileUniqueID(CXFile file, CXFileUniqueID outID);

/**
 * \brief Determine whether the given header is guarded against
 * multiple inclusions, either with the conventional
 * \#ifndef/\#define/\#endif macro guards or with \#pragma once.
 */
public static native @Cast("unsigned") int clang_isFileMultipleIncludeGuarded(CXTranslationUnit tu, CXFile file);

/**
 * \brief Retrieve a file handle within the given translation unit.
 *
 * @param tu the translation unit
 *
 * @param file_name the name of the file.
 *
 * @return the file handle for the named file in the translation unit \p tu,
 * or a NULL file handle if the file was not a part of this translation unit.
 */
public static native CXFile clang_getFile(CXTranslationUnit tu,
                                    @Cast("const char*") BytePointer file_name);
public static native CXFile clang_getFile(CXTranslationUnit tu,
                                    String file_name);

/**
 * \brief Returns non-zero if the \c file1 and \c file2 point to the same file,
 * or they are both NULL.
 */
public static native int clang_File_isEqual(CXFile file1, CXFile file2);

/**
 * \}
 */

/**
 * \defgroup CINDEX_LOCATIONS Physical source locations
 *
 * Clang represents physical source locations in its abstract syntax tree in
 * great detail, with file, line, and column information for the majority of
 * the tokens parsed in the source code. These data types and functions are
 * used to represent source location information, either for a particular
 * point in the program or for a range of points in the program, and extract
 * specific location information from those data types.
 *
 * \{
 */

/**
 * \brief Identifies a specific source location within a translation
 * unit.
 *
 * Use clang_getExpansionLocation() or clang_getSpellingLocation()
 * to map a source location to a particular file, line, and column.
 */
public static class CXSourceLocation extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXSourceLocation() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXSourceLocation(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXSourceLocation(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXSourceLocation position(int position) {
        return (CXSourceLocation)super.position(position);
    }

  @MemberGetter public native @Const Pointer ptr_data(int i);
  @MemberGetter public native @Cast("const void**") PointerPointer ptr_data();
  public native @Cast("unsigned") int int_data(); public native CXSourceLocation int_data(int int_data);
}

/**
 * \brief Identifies a half-open character range in the source code.
 *
 * Use clang_getRangeStart() and clang_getRangeEnd() to retrieve the
 * starting and end locations from a source range, respectively.
 */
public static class CXSourceRange extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXSourceRange() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXSourceRange(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXSourceRange(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXSourceRange position(int position) {
        return (CXSourceRange)super.position(position);
    }

  @MemberGetter public native @Const Pointer ptr_data(int i);
  @MemberGetter public native @Cast("const void**") PointerPointer ptr_data();
  public native @Cast("unsigned") int begin_int_data(); public native CXSourceRange begin_int_data(int begin_int_data);
  public native @Cast("unsigned") int end_int_data(); public native CXSourceRange end_int_data(int end_int_data);
}

/**
 * \brief Retrieve a NULL (invalid) source location.
 */
public static native @ByVal CXSourceLocation clang_getNullLocation();

/**
 * \brief Determine whether two source locations, which must refer into
 * the same translation unit, refer to exactly the same point in the source
 * code.
 *
 * @return non-zero if the source locations refer to the same location, zero
 * if they refer to different locations.
 */
public static native @Cast("unsigned") int clang_equalLocations(@ByVal CXSourceLocation loc1,
                                             @ByVal CXSourceLocation loc2);

/**
 * \brief Retrieves the source location associated with a given file/line/column
 * in a particular translation unit.
 */
public static native @ByVal CXSourceLocation clang_getLocation(CXTranslationUnit tu,
                                                  CXFile file,
                                                  @Cast("unsigned") int line,
                                                  @Cast("unsigned") int column);
/**
 * \brief Retrieves the source location associated with a given character offset
 * in a particular translation unit.
 */
public static native @ByVal CXSourceLocation clang_getLocationForOffset(CXTranslationUnit tu,
                                                           CXFile file,
                                                           @Cast("unsigned") int offset);

/**
 * \brief Returns non-zero if the given source location is in a system header.
 */
public static native int clang_Location_isInSystemHeader(@ByVal CXSourceLocation location);

/**
 * \brief Returns non-zero if the given source location is in the main file of
 * the corresponding translation unit.
 */
public static native int clang_Location_isFromMainFile(@ByVal CXSourceLocation location);

/**
 * \brief Retrieve a NULL (invalid) source range.
 */
public static native @ByVal CXSourceRange clang_getNullRange();

/**
 * \brief Retrieve a source range given the beginning and ending source
 * locations.
 */
public static native @ByVal CXSourceRange clang_getRange(@ByVal CXSourceLocation begin,
                                            @ByVal CXSourceLocation end);

/**
 * \brief Determine whether two ranges are equivalent.
 *
 * @return non-zero if the ranges are the same, zero if they differ.
 */
public static native @Cast("unsigned") int clang_equalRanges(@ByVal CXSourceRange range1,
                                          @ByVal CXSourceRange range2);

/**
 * \brief Returns non-zero if \p range is null.
 */
public static native int clang_Range_isNull(@ByVal CXSourceRange range);

/**
 * \brief Retrieve the file, line, column, and offset represented by
 * the given source location.
 *
 * If the location refers into a macro expansion, retrieves the
 * location of the macro expansion.
 *
 * @param location the location within a source file that will be decomposed
 * into its parts.
 *
 * @param file [out] if non-NULL, will be set to the file to which the given
 * source location points.
 *
 * @param line [out] if non-NULL, will be set to the line to which the given
 * source location points.
 *
 * @param column [out] if non-NULL, will be set to the column to which the given
 * source location points.
 *
 * @param offset [out] if non-NULL, will be set to the offset into the
 * buffer to which the given source location points.
 */
public static native void clang_getExpansionLocation(@ByVal CXSourceLocation location,
                                               @ByPtrPtr CXFile file,
                                               @Cast("unsigned*") IntPointer line,
                                               @Cast("unsigned*") IntPointer column,
                                               @Cast("unsigned*") IntPointer offset);
public static native void clang_getExpansionLocation(@ByVal CXSourceLocation location,
                                               @ByPtrPtr CXFile file,
                                               @Cast("unsigned*") IntBuffer line,
                                               @Cast("unsigned*") IntBuffer column,
                                               @Cast("unsigned*") IntBuffer offset);
public static native void clang_getExpansionLocation(@ByVal CXSourceLocation location,
                                               @ByPtrPtr CXFile file,
                                               @Cast("unsigned*") int[] line,
                                               @Cast("unsigned*") int[] column,
                                               @Cast("unsigned*") int[] offset);

/**
 * \brief Retrieve the file, line, column, and offset represented by
 * the given source location, as specified in a # line directive.
 *
 * Example: given the following source code in a file somefile.c
 *
 * <pre>{@code
 * #123 "dummy.c" 1
 *
 * static int func(void)
 * {
 *     return 0;
 * }
 * }</pre>
 *
 * the location information returned by this function would be
 *
 * File: dummy.c Line: 124 Column: 12
 *
 * whereas clang_getExpansionLocation would have returned
 *
 * File: somefile.c Line: 3 Column: 12
 *
 * @param location the location within a source file that will be decomposed
 * into its parts.
 *
 * @param filename [out] if non-NULL, will be set to the filename of the
 * source location. Note that filenames returned will be for "virtual" files,
 * which don't necessarily exist on the machine running clang - e.g. when
 * parsing preprocessed output obtained from a different environment. If
 * a non-NULL value is passed in, remember to dispose of the returned value
 * using \c clang_disposeString() once you've finished with it. For an invalid
 * source location, an empty string is returned.
 *
 * @param line [out] if non-NULL, will be set to the line number of the
 * source location. For an invalid source location, zero is returned.
 *
 * @param column [out] if non-NULL, will be set to the column number of the
 * source location. For an invalid source location, zero is returned.
 */
public static native void clang_getPresumedLocation(@ByVal CXSourceLocation location,
                                              CXString filename,
                                              @Cast("unsigned*") IntPointer line,
                                              @Cast("unsigned*") IntPointer column);
public static native void clang_getPresumedLocation(@ByVal CXSourceLocation location,
                                              CXString filename,
                                              @Cast("unsigned*") IntBuffer line,
                                              @Cast("unsigned*") IntBuffer column);
public static native void clang_getPresumedLocation(@ByVal CXSourceLocation location,
                                              CXString filename,
                                              @Cast("unsigned*") int[] line,
                                              @Cast("unsigned*") int[] column);

/**
 * \brief Legacy API to retrieve the file, line, column, and offset represented
 * by the given source location.
 *
 * This interface has been replaced by the newer interface
 * #clang_getExpansionLocation(). See that interface's documentation for
 * details.
 */
public static native void clang_getInstantiationLocation(@ByVal CXSourceLocation location,
                                                   @ByPtrPtr CXFile file,
                                                   @Cast("unsigned*") IntPointer line,
                                                   @Cast("unsigned*") IntPointer column,
                                                   @Cast("unsigned*") IntPointer offset);
public static native void clang_getInstantiationLocation(@ByVal CXSourceLocation location,
                                                   @ByPtrPtr CXFile file,
                                                   @Cast("unsigned*") IntBuffer line,
                                                   @Cast("unsigned*") IntBuffer column,
                                                   @Cast("unsigned*") IntBuffer offset);
public static native void clang_getInstantiationLocation(@ByVal CXSourceLocation location,
                                                   @ByPtrPtr CXFile file,
                                                   @Cast("unsigned*") int[] line,
                                                   @Cast("unsigned*") int[] column,
                                                   @Cast("unsigned*") int[] offset);

/**
 * \brief Retrieve the file, line, column, and offset represented by
 * the given source location.
 *
 * If the location refers into a macro instantiation, return where the
 * location was originally spelled in the source file.
 *
 * @param location the location within a source file that will be decomposed
 * into its parts.
 *
 * @param file [out] if non-NULL, will be set to the file to which the given
 * source location points.
 *
 * @param line [out] if non-NULL, will be set to the line to which the given
 * source location points.
 *
 * @param column [out] if non-NULL, will be set to the column to which the given
 * source location points.
 *
 * @param offset [out] if non-NULL, will be set to the offset into the
 * buffer to which the given source location points.
 */
public static native void clang_getSpellingLocation(@ByVal CXSourceLocation location,
                                              @ByPtrPtr CXFile file,
                                              @Cast("unsigned*") IntPointer line,
                                              @Cast("unsigned*") IntPointer column,
                                              @Cast("unsigned*") IntPointer offset);
public static native void clang_getSpellingLocation(@ByVal CXSourceLocation location,
                                              @ByPtrPtr CXFile file,
                                              @Cast("unsigned*") IntBuffer line,
                                              @Cast("unsigned*") IntBuffer column,
                                              @Cast("unsigned*") IntBuffer offset);
public static native void clang_getSpellingLocation(@ByVal CXSourceLocation location,
                                              @ByPtrPtr CXFile file,
                                              @Cast("unsigned*") int[] line,
                                              @Cast("unsigned*") int[] column,
                                              @Cast("unsigned*") int[] offset);

/**
 * \brief Retrieve the file, line, column, and offset represented by
 * the given source location.
 *
 * If the location refers into a macro expansion, return where the macro was
 * expanded or where the macro argument was written, if the location points at
 * a macro argument.
 *
 * @param location the location within a source file that will be decomposed
 * into its parts.
 *
 * @param file [out] if non-NULL, will be set to the file to which the given
 * source location points.
 *
 * @param line [out] if non-NULL, will be set to the line to which the given
 * source location points.
 *
 * @param column [out] if non-NULL, will be set to the column to which the given
 * source location points.
 *
 * @param offset [out] if non-NULL, will be set to the offset into the
 * buffer to which the given source location points.
 */
public static native void clang_getFileLocation(@ByVal CXSourceLocation location,
                                          @ByPtrPtr CXFile file,
                                          @Cast("unsigned*") IntPointer line,
                                          @Cast("unsigned*") IntPointer column,
                                          @Cast("unsigned*") IntPointer offset);
public static native void clang_getFileLocation(@ByVal CXSourceLocation location,
                                          @ByPtrPtr CXFile file,
                                          @Cast("unsigned*") IntBuffer line,
                                          @Cast("unsigned*") IntBuffer column,
                                          @Cast("unsigned*") IntBuffer offset);
public static native void clang_getFileLocation(@ByVal CXSourceLocation location,
                                          @ByPtrPtr CXFile file,
                                          @Cast("unsigned*") int[] line,
                                          @Cast("unsigned*") int[] column,
                                          @Cast("unsigned*") int[] offset);

/**
 * \brief Retrieve a source location representing the first character within a
 * source range.
 */
public static native @ByVal CXSourceLocation clang_getRangeStart(@ByVal CXSourceRange range);

/**
 * \brief Retrieve a source location representing the last character within a
 * source range.
 */
public static native @ByVal CXSourceLocation clang_getRangeEnd(@ByVal CXSourceRange range);

/**
 * \brief Identifies an array of ranges.
 */
public static class CXSourceRangeList extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXSourceRangeList() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXSourceRangeList(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXSourceRangeList(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXSourceRangeList position(int position) {
        return (CXSourceRangeList)super.position(position);
    }

  /** \brief The number of ranges in the \c ranges array. */
  public native @Cast("unsigned") int count(); public native CXSourceRangeList count(int count);
  /**
   * \brief An array of \c CXSourceRanges.
   */
  public native CXSourceRange ranges(); public native CXSourceRangeList ranges(CXSourceRange ranges);
}

/**
 * \brief Retrieve all ranges that were skipped by the preprocessor.
 *
 * The preprocessor will skip lines when they are surrounded by an
 * if/ifdef/ifndef directive whose condition does not evaluate to true.
 */
public static native CXSourceRangeList clang_getSkippedRanges(CXTranslationUnit tu,
                                                         CXFile file);

/**
 * \brief Destroy the given \c CXSourceRangeList.
 */
public static native void clang_disposeSourceRangeList(CXSourceRangeList ranges);

/**
 * \}
 */

/**
 * \defgroup CINDEX_DIAG Diagnostic reporting
 *
 * \{
 */

/**
 * \brief Describes the severity of a particular diagnostic.
 */
/** enum CXDiagnosticSeverity */
public static final int
  /**
   * \brief A diagnostic that has been suppressed, e.g., by a command-line
   * option.
   */
  CXDiagnostic_Ignored = 0,

  /**
   * \brief This diagnostic is a note that should be attached to the
   * previous (non-note) diagnostic.
   */
  CXDiagnostic_Note    = 1,

  /**
   * \brief This diagnostic indicates suspicious code that may not be
   * wrong.
   */
  CXDiagnostic_Warning = 2,

  /**
   * \brief This diagnostic indicates that the code is ill-formed.
   */
  CXDiagnostic_Error   = 3,

  /**
   * \brief This diagnostic indicates that the code is ill-formed such
   * that future parser recovery is unlikely to produce useful
   * results.
   */
  CXDiagnostic_Fatal   = 4;

/**
 * \brief A single diagnostic, containing the diagnostic's severity,
 * location, text, source ranges, and fix-it hints.
 */
@Namespace @Name("void") @Opaque public static class CXDiagnostic extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXDiagnostic() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXDiagnostic(Pointer p) { super(p); }
}

/**
 * \brief A group of CXDiagnostics.
 */
@Namespace @Name("void") @Opaque public static class CXDiagnosticSet extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXDiagnosticSet() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXDiagnosticSet(Pointer p) { super(p); }
}
  
/**
 * \brief Determine the number of diagnostics in a CXDiagnosticSet.
 */
public static native @Cast("unsigned") int clang_getNumDiagnosticsInSet(CXDiagnosticSet Diags);

/**
 * \brief Retrieve a diagnostic associated with the given CXDiagnosticSet.
 *
 * @param Diags the CXDiagnosticSet to query.
 * @param Index the zero-based diagnostic number to retrieve.
 *
 * @return the requested diagnostic. This diagnostic must be freed
 * via a call to \c clang_disposeDiagnostic().
 */
public static native CXDiagnostic clang_getDiagnosticInSet(CXDiagnosticSet Diags,
                                                     @Cast("unsigned") int Index);  


/**
 * \brief Describes the kind of error that occurred (if any) in a call to
 * \c clang_loadDiagnostics.
 */
/** enum CXLoadDiag_Error */
public static final int
  /**
   * \brief Indicates that no error occurred.
   */
  CXLoadDiag_None = 0,
  
  /**
   * \brief Indicates that an unknown error occurred while attempting to
   * deserialize diagnostics.
   */
  CXLoadDiag_Unknown = 1,
  
  /**
   * \brief Indicates that the file containing the serialized diagnostics
   * could not be opened.
   */
  CXLoadDiag_CannotLoad = 2,
  
  /**
   * \brief Indicates that the serialized diagnostics file is invalid or
   * corrupt.
   */
  CXLoadDiag_InvalidFile = 3;
  
/**
 * \brief Deserialize a set of diagnostics from a Clang diagnostics bitcode
 * file.
 *
 * @param file The name of the file to deserialize.
 * @param error A pointer to a enum value recording if there was a problem
 *        deserializing the diagnostics.
 * @param errorString A pointer to a CXString for recording the error string
 *        if the file was not successfully loaded.
 *
 * @return A loaded CXDiagnosticSet if successful, and NULL otherwise.  These
 * diagnostics should be released using clang_disposeDiagnosticSet().
 */
public static native CXDiagnosticSet clang_loadDiagnostics(@Cast("const char*") BytePointer file,
                                                  @Cast("CXLoadDiag_Error*") IntPointer error,
                                                  CXString errorString);
public static native CXDiagnosticSet clang_loadDiagnostics(String file,
                                                  @Cast("CXLoadDiag_Error*") IntBuffer error,
                                                  CXString errorString);
public static native CXDiagnosticSet clang_loadDiagnostics(@Cast("const char*") BytePointer file,
                                                  @Cast("CXLoadDiag_Error*") int[] error,
                                                  CXString errorString);
public static native CXDiagnosticSet clang_loadDiagnostics(String file,
                                                  @Cast("CXLoadDiag_Error*") IntPointer error,
                                                  CXString errorString);
public static native CXDiagnosticSet clang_loadDiagnostics(@Cast("const char*") BytePointer file,
                                                  @Cast("CXLoadDiag_Error*") IntBuffer error,
                                                  CXString errorString);
public static native CXDiagnosticSet clang_loadDiagnostics(String file,
                                                  @Cast("CXLoadDiag_Error*") int[] error,
                                                  CXString errorString);

/**
 * \brief Release a CXDiagnosticSet and all of its contained diagnostics.
 */
public static native void clang_disposeDiagnosticSet(CXDiagnosticSet Diags);

/**
 * \brief Retrieve the child diagnostics of a CXDiagnostic. 
 *
 * This CXDiagnosticSet does not need to be released by
 * clang_disposeDiagnosticSet.
 */
public static native CXDiagnosticSet clang_getChildDiagnostics(CXDiagnostic D);

/**
 * \brief Determine the number of diagnostics produced for the given
 * translation unit.
 */
public static native @Cast("unsigned") int clang_getNumDiagnostics(CXTranslationUnit Unit);

/**
 * \brief Retrieve a diagnostic associated with the given translation unit.
 *
 * @param Unit the translation unit to query.
 * @param Index the zero-based diagnostic number to retrieve.
 *
 * @return the requested diagnostic. This diagnostic must be freed
 * via a call to \c clang_disposeDiagnostic().
 */
public static native CXDiagnostic clang_getDiagnostic(CXTranslationUnit Unit,
                                                @Cast("unsigned") int Index);

/**
 * \brief Retrieve the complete set of diagnostics associated with a
 *        translation unit.
 *
 * @param Unit the translation unit to query.
 */
public static native CXDiagnosticSet clang_getDiagnosticSetFromTU(CXTranslationUnit Unit);  

/**
 * \brief Destroy a diagnostic.
 */
public static native void clang_disposeDiagnostic(CXDiagnostic Diagnostic);

/**
 * \brief Options to control the display of diagnostics.
 *
 * The values in this enum are meant to be combined to customize the
 * behavior of \c clang_formatDiagnostic().
 */
/** enum CXDiagnosticDisplayOptions */
public static final int
  /**
   * \brief Display the source-location information where the
   * diagnostic was located.
   *
   * When set, diagnostics will be prefixed by the file, line, and
   * (optionally) column to which the diagnostic refers. For example,
   *
   * <pre>{@code
   * test.c:28: warning: extra tokens at end of #endif directive
   * }</pre>
   *
   * This option corresponds to the clang flag \c -fshow-source-location.
   */
  CXDiagnostic_DisplaySourceLocation =  0x01,

  /**
   * \brief If displaying the source-location information of the
   * diagnostic, also include the column number.
   *
   * This option corresponds to the clang flag \c -fshow-column.
   */
  CXDiagnostic_DisplayColumn =  0x02,

  /**
   * \brief If displaying the source-location information of the
   * diagnostic, also include information about source ranges in a
   * machine-parsable format.
   *
   * This option corresponds to the clang flag
   * \c -fdiagnostics-print-source-range-info.
   */
  CXDiagnostic_DisplaySourceRanges =  0x04,
  
  /**
   * \brief Display the option name associated with this diagnostic, if any.
   *
   * The option name displayed (e.g., -Wconversion) will be placed in brackets
   * after the diagnostic text. This option corresponds to the clang flag
   * \c -fdiagnostics-show-option.
   */
  CXDiagnostic_DisplayOption =  0x08,
  
  /**
   * \brief Display the category number associated with this diagnostic, if any.
   *
   * The category number is displayed within brackets after the diagnostic text.
   * This option corresponds to the clang flag 
   * \c -fdiagnostics-show-category=id.
   */
  CXDiagnostic_DisplayCategoryId =  0x10,

  /**
   * \brief Display the category name associated with this diagnostic, if any.
   *
   * The category name is displayed within brackets after the diagnostic text.
   * This option corresponds to the clang flag 
   * \c -fdiagnostics-show-category=name.
   */
  CXDiagnostic_DisplayCategoryName =  0x20;

/**
 * \brief Format the given diagnostic in a manner that is suitable for display.
 *
 * This routine will format the given diagnostic to a string, rendering
 * the diagnostic according to the various options given. The
 * \c clang_defaultDiagnosticDisplayOptions() function returns the set of
 * options that most closely mimics the behavior of the clang compiler.
 *
 * @param Diagnostic The diagnostic to print.
 *
 * @param Options A set of options that control the diagnostic display,
 * created by combining \c CXDiagnosticDisplayOptions values.
 *
 * @return A new string containing for formatted diagnostic.
 */
public static native @ByVal CXString clang_formatDiagnostic(CXDiagnostic Diagnostic,
                                               @Cast("unsigned") int Options);

/**
 * \brief Retrieve the set of display options most similar to the
 * default behavior of the clang compiler.
 *
 * @return A set of display options suitable for use with \c
 * clang_formatDiagnostic().
 */
public static native @Cast("unsigned") int clang_defaultDiagnosticDisplayOptions();

/**
 * \brief Determine the severity of the given diagnostic.
 */
public static native @Cast("CXDiagnosticSeverity") int clang_getDiagnosticSeverity(CXDiagnostic arg0);

/**
 * \brief Retrieve the source location of the given diagnostic.
 *
 * This location is where Clang would print the caret ('^') when
 * displaying the diagnostic on the command line.
 */
public static native @ByVal CXSourceLocation clang_getDiagnosticLocation(CXDiagnostic arg0);

/**
 * \brief Retrieve the text of the given diagnostic.
 */
public static native @ByVal CXString clang_getDiagnosticSpelling(CXDiagnostic arg0);

/**
 * \brief Retrieve the name of the command-line option that enabled this
 * diagnostic.
 *
 * @param Diag The diagnostic to be queried.
 *
 * @param Disable If non-NULL, will be set to the option that disables this
 * diagnostic (if any).
 *
 * @return A string that contains the command-line option used to enable this
 * warning, such as "-Wconversion" or "-pedantic". 
 */
public static native @ByVal CXString clang_getDiagnosticOption(CXDiagnostic Diag,
                                                  CXString Disable);

/**
 * \brief Retrieve the category number for this diagnostic.
 *
 * Diagnostics can be categorized into groups along with other, related
 * diagnostics (e.g., diagnostics under the same warning flag). This routine 
 * retrieves the category number for the given diagnostic.
 *
 * @return The number of the category that contains this diagnostic, or zero
 * if this diagnostic is uncategorized.
 */
public static native @Cast("unsigned") int clang_getDiagnosticCategory(CXDiagnostic arg0);

/**
 * \brief Retrieve the name of a particular diagnostic category.  This
 *  is now deprecated.  Use clang_getDiagnosticCategoryText()
 *  instead.
 *
 * @param Category A diagnostic category number, as returned by 
 * \c clang_getDiagnosticCategory().
 *
 * @return The name of the given diagnostic category.
 */
public static native @ByVal CXString clang_getDiagnosticCategoryName(@Cast("unsigned") int Category);

/**
 * \brief Retrieve the diagnostic category text for a given diagnostic.
 *
 * @return The text of the given diagnostic category.
 */
public static native @ByVal CXString clang_getDiagnosticCategoryText(CXDiagnostic arg0);
  
/**
 * \brief Determine the number of source ranges associated with the given
 * diagnostic.
 */
public static native @Cast("unsigned") int clang_getDiagnosticNumRanges(CXDiagnostic arg0);

/**
 * \brief Retrieve a source range associated with the diagnostic.
 *
 * A diagnostic's source ranges highlight important elements in the source
 * code. On the command line, Clang displays source ranges by
 * underlining them with '~' characters.
 *
 * @param Diagnostic the diagnostic whose range is being extracted.
 *
 * @param Range the zero-based index specifying which range to
 *
 * @return the requested source range.
 */
public static native @ByVal CXSourceRange clang_getDiagnosticRange(CXDiagnostic Diagnostic,
                                                      @Cast("unsigned") int Range);

/**
 * \brief Determine the number of fix-it hints associated with the
 * given diagnostic.
 */
public static native @Cast("unsigned") int clang_getDiagnosticNumFixIts(CXDiagnostic Diagnostic);

/**
 * \brief Retrieve the replacement information for a given fix-it.
 *
 * Fix-its are described in terms of a source range whose contents
 * should be replaced by a string. This approach generalizes over
 * three kinds of operations: removal of source code (the range covers
 * the code to be removed and the replacement string is empty),
 * replacement of source code (the range covers the code to be
 * replaced and the replacement string provides the new code), and
 * insertion (both the start and end of the range point at the
 * insertion location, and the replacement string provides the text to
 * insert).
 *
 * @param Diagnostic The diagnostic whose fix-its are being queried.
 *
 * @param FixIt The zero-based index of the fix-it.
 *
 * @param ReplacementRange The source range whose contents will be
 * replaced with the returned replacement string. Note that source
 * ranges are half-open ranges [a, b), so the source code should be
 * replaced from a and up to (but not including) b.
 *
 * @return A string containing text that should be replace the source
 * code indicated by the \c ReplacementRange.
 */
public static native @ByVal CXString clang_getDiagnosticFixIt(CXDiagnostic Diagnostic,
                                                 @Cast("unsigned") int FixIt,
                                               CXSourceRange ReplacementRange);

/**
 * \}
 */

/**
 * \defgroup CINDEX_TRANSLATION_UNIT Translation unit manipulation
 *
 * The routines in this group provide the ability to create and destroy
 * translation units from files, either by parsing the contents of the files or
 * by reading in a serialized representation of a translation unit.
 *
 * \{
 */

/**
 * \brief Get the original translation unit source file name.
 */
public static native @ByVal CXString clang_getTranslationUnitSpelling(CXTranslationUnit CTUnit);

/**
 * \brief Return the CXTranslationUnit for a given source file and the provided
 * command line arguments one would pass to the compiler.
 *
 * Note: The 'source_filename' argument is optional.  If the caller provides a
 * NULL pointer, the name of the source file is expected to reside in the
 * specified command line arguments.
 *
 * Note: When encountered in 'clang_command_line_args', the following options
 * are ignored:
 *
 *   '-c'
 *   '-emit-ast'
 *   '-fsyntax-only'
 *   '-o \<output file>'  (both '-o' and '\<output file>' are ignored)
 *
 * @param CIdx The index object with which the translation unit will be
 * associated.
 *
 * @param source_filename The name of the source file to load, or NULL if the
 * source file is included in \p clang_command_line_args.
 *
 * @param num_clang_command_line_args The number of command-line arguments in
 * \p clang_command_line_args.
 *
 * @param clang_command_line_args The command-line arguments that would be
 * passed to the \c clang executable if it were being invoked out-of-process.
 * These command-line options will be parsed and will affect how the translation
 * unit is parsed. Note that the following options are ignored: '-c',
 * '-emit-ast', '-fsyntax-only' (which is the default), and '-o \<output file>'.
 *
 * @param num_unsaved_files the number of unsaved file entries in \p
 * unsaved_files.
 *
 * @param unsaved_files the files that have not yet been saved to disk
 * but may be required for code completion, including the contents of
 * those files.  The contents and name of these files (as specified by
 * CXUnsavedFile) are copied when necessary, so the client only needs to
 * guarantee their validity until the call to this function returns.
 */
public static native CXTranslationUnit clang_createTranslationUnitFromSourceFile(
                                         CXIndex CIdx,
                                         @Cast("const char*") BytePointer source_filename,
                                         int num_clang_command_line_args,
                                   @Cast("const char*const*") PointerPointer clang_command_line_args,
                                         @Cast("unsigned") int num_unsaved_files,
                                         CXUnsavedFile unsaved_files);
public static native CXTranslationUnit clang_createTranslationUnitFromSourceFile(
                                         CXIndex CIdx,
                                         @Cast("const char*") BytePointer source_filename,
                                         int num_clang_command_line_args,
                                   @Cast("const char*const*") @ByPtrPtr BytePointer clang_command_line_args,
                                         @Cast("unsigned") int num_unsaved_files,
                                         CXUnsavedFile unsaved_files);
public static native CXTranslationUnit clang_createTranslationUnitFromSourceFile(
                                         CXIndex CIdx,
                                         String source_filename,
                                         int num_clang_command_line_args,
                                   @Cast("const char*const*") @ByPtrPtr ByteBuffer clang_command_line_args,
                                         @Cast("unsigned") int num_unsaved_files,
                                         CXUnsavedFile unsaved_files);
public static native CXTranslationUnit clang_createTranslationUnitFromSourceFile(
                                         CXIndex CIdx,
                                         @Cast("const char*") BytePointer source_filename,
                                         int num_clang_command_line_args,
                                   @Cast("const char*const*") @ByPtrPtr byte[] clang_command_line_args,
                                         @Cast("unsigned") int num_unsaved_files,
                                         CXUnsavedFile unsaved_files);
public static native CXTranslationUnit clang_createTranslationUnitFromSourceFile(
                                         CXIndex CIdx,
                                         String source_filename,
                                         int num_clang_command_line_args,
                                   @Cast("const char*const*") @ByPtrPtr BytePointer clang_command_line_args,
                                         @Cast("unsigned") int num_unsaved_files,
                                         CXUnsavedFile unsaved_files);
public static native CXTranslationUnit clang_createTranslationUnitFromSourceFile(
                                         CXIndex CIdx,
                                         @Cast("const char*") BytePointer source_filename,
                                         int num_clang_command_line_args,
                                   @Cast("const char*const*") @ByPtrPtr ByteBuffer clang_command_line_args,
                                         @Cast("unsigned") int num_unsaved_files,
                                         CXUnsavedFile unsaved_files);
public static native CXTranslationUnit clang_createTranslationUnitFromSourceFile(
                                         CXIndex CIdx,
                                         String source_filename,
                                         int num_clang_command_line_args,
                                   @Cast("const char*const*") @ByPtrPtr byte[] clang_command_line_args,
                                         @Cast("unsigned") int num_unsaved_files,
                                         CXUnsavedFile unsaved_files);

/**
 * \brief Same as \c clang_createTranslationUnit2, but returns
 * the \c CXTranslationUnit instead of an error code.  In case of an error this
 * routine returns a \c NULL \c CXTranslationUnit, without further detailed
 * error codes.
 */
public static native CXTranslationUnit clang_createTranslationUnit(
    CXIndex CIdx,
    @Cast("const char*") BytePointer ast_filename);
public static native CXTranslationUnit clang_createTranslationUnit(
    CXIndex CIdx,
    String ast_filename);

/**
 * \brief Create a translation unit from an AST file (\c -emit-ast).
 *
 * @param [out] out_TU A non-NULL pointer to store the created
 * \c CXTranslationUnit.
 *
 * @return Zero on success, otherwise returns an error code.
 */
public static native @Cast("CXErrorCode") int clang_createTranslationUnit2(
    CXIndex CIdx,
    @Cast("const char*") BytePointer ast_filename,
    @ByPtrPtr CXTranslationUnit out_TU);
public static native @Cast("CXErrorCode") int clang_createTranslationUnit2(
    CXIndex CIdx,
    String ast_filename,
    @Cast("CXTranslationUnit*") PointerPointer out_TU);

/**
 * \brief Flags that control the creation of translation units.
 *
 * The enumerators in this enumeration type are meant to be bitwise
 * ORed together to specify which options should be used when
 * constructing the translation unit.
 */
/** enum CXTranslationUnit_Flags */
public static final int
  /**
   * \brief Used to indicate that no special translation-unit options are
   * needed.
   */
  CXTranslationUnit_None =  0x0,

  /**
   * \brief Used to indicate that the parser should construct a "detailed"
   * preprocessing record, including all macro definitions and instantiations.
   *
   * Constructing a detailed preprocessing record requires more memory
   * and time to parse, since the information contained in the record
   * is usually not retained. However, it can be useful for
   * applications that require more detailed information about the
   * behavior of the preprocessor.
   */
  CXTranslationUnit_DetailedPreprocessingRecord =  0x01,

  /**
   * \brief Used to indicate that the translation unit is incomplete.
   *
   * When a translation unit is considered "incomplete", semantic
   * analysis that is typically performed at the end of the
   * translation unit will be suppressed. For example, this suppresses
   * the completion of tentative declarations in C and of
   * instantiation of implicitly-instantiation function templates in
   * C++. This option is typically used when parsing a header with the
   * intent of producing a precompiled header.
   */
  CXTranslationUnit_Incomplete =  0x02,
  
  /**
   * \brief Used to indicate that the translation unit should be built with an 
   * implicit precompiled header for the preamble.
   *
   * An implicit precompiled header is used as an optimization when a
   * particular translation unit is likely to be reparsed many times
   * when the sources aren't changing that often. In this case, an
   * implicit precompiled header will be built containing all of the
   * initial includes at the top of the main file (what we refer to as
   * the "preamble" of the file). In subsequent parses, if the
   * preamble or the files in it have not changed, \c
   * clang_reparseTranslationUnit() will re-use the implicit
   * precompiled header to improve parsing performance.
   */
  CXTranslationUnit_PrecompiledPreamble =  0x04,
  
  /**
   * \brief Used to indicate that the translation unit should cache some
   * code-completion results with each reparse of the source file.
   *
   * Caching of code-completion results is a performance optimization that
   * introduces some overhead to reparsing but improves the performance of
   * code-completion operations.
   */
  CXTranslationUnit_CacheCompletionResults =  0x08,

  /**
   * \brief Used to indicate that the translation unit will be serialized with
   * \c clang_saveTranslationUnit.
   *
   * This option is typically used when parsing a header with the intent of
   * producing a precompiled header.
   */
  CXTranslationUnit_ForSerialization =  0x10,

  /**
   * \brief DEPRECATED: Enabled chained precompiled preambles in C++.
   *
   * Note: this is a *temporary* option that is available only while
   * we are testing C++ precompiled preamble support. It is deprecated.
   */
  CXTranslationUnit_CXXChainedPCH =  0x20,

  /**
   * \brief Used to indicate that function/method bodies should be skipped while
   * parsing.
   *
   * This option can be used to search for declarations/definitions while
   * ignoring the usages.
   */
  CXTranslationUnit_SkipFunctionBodies =  0x40,

  /**
   * \brief Used to indicate that brief documentation comments should be
   * included into the set of code completions returned from this translation
   * unit.
   */
  CXTranslationUnit_IncludeBriefCommentsInCodeCompletion =  0x80;

/**
 * \brief Returns the set of flags that is suitable for parsing a translation
 * unit that is being edited.
 *
 * The set of flags returned provide options for \c clang_parseTranslationUnit()
 * to indicate that the translation unit is likely to be reparsed many times,
 * either explicitly (via \c clang_reparseTranslationUnit()) or implicitly
 * (e.g., by code completion (\c clang_codeCompletionAt())). The returned flag
 * set contains an unspecified set of optimizations (e.g., the precompiled 
 * preamble) geared toward improving the performance of these routines. The
 * set of optimizations enabled may change from one version to the next.
 */
public static native @Cast("unsigned") int clang_defaultEditingTranslationUnitOptions();

/**
 * \brief Same as \c clang_parseTranslationUnit2, but returns
 * the \c CXTranslationUnit instead of an error code.  In case of an error this
 * routine returns a \c NULL \c CXTranslationUnit, without further detailed
 * error codes.
 */
public static native CXTranslationUnit clang_parseTranslationUnit(CXIndex CIdx,
                           @Cast("const char*") BytePointer source_filename,
                           @Cast("const char*const*") PointerPointer command_line_args,
                           int num_command_line_args,
                           CXUnsavedFile unsaved_files,
                           @Cast("unsigned") int num_unsaved_files,
                           @Cast("unsigned") int options);
public static native CXTranslationUnit clang_parseTranslationUnit(CXIndex CIdx,
                           @Cast("const char*") BytePointer source_filename,
                           @Cast("const char*const*") @ByPtrPtr BytePointer command_line_args,
                           int num_command_line_args,
                           CXUnsavedFile unsaved_files,
                           @Cast("unsigned") int num_unsaved_files,
                           @Cast("unsigned") int options);
public static native CXTranslationUnit clang_parseTranslationUnit(CXIndex CIdx,
                           String source_filename,
                           @Cast("const char*const*") @ByPtrPtr ByteBuffer command_line_args,
                           int num_command_line_args,
                           CXUnsavedFile unsaved_files,
                           @Cast("unsigned") int num_unsaved_files,
                           @Cast("unsigned") int options);
public static native CXTranslationUnit clang_parseTranslationUnit(CXIndex CIdx,
                           @Cast("const char*") BytePointer source_filename,
                           @Cast("const char*const*") @ByPtrPtr byte[] command_line_args,
                           int num_command_line_args,
                           CXUnsavedFile unsaved_files,
                           @Cast("unsigned") int num_unsaved_files,
                           @Cast("unsigned") int options);
public static native CXTranslationUnit clang_parseTranslationUnit(CXIndex CIdx,
                           String source_filename,
                           @Cast("const char*const*") @ByPtrPtr BytePointer command_line_args,
                           int num_command_line_args,
                           CXUnsavedFile unsaved_files,
                           @Cast("unsigned") int num_unsaved_files,
                           @Cast("unsigned") int options);
public static native CXTranslationUnit clang_parseTranslationUnit(CXIndex CIdx,
                           @Cast("const char*") BytePointer source_filename,
                           @Cast("const char*const*") @ByPtrPtr ByteBuffer command_line_args,
                           int num_command_line_args,
                           CXUnsavedFile unsaved_files,
                           @Cast("unsigned") int num_unsaved_files,
                           @Cast("unsigned") int options);
public static native CXTranslationUnit clang_parseTranslationUnit(CXIndex CIdx,
                           String source_filename,
                           @Cast("const char*const*") @ByPtrPtr byte[] command_line_args,
                           int num_command_line_args,
                           CXUnsavedFile unsaved_files,
                           @Cast("unsigned") int num_unsaved_files,
                           @Cast("unsigned") int options);

/**
 * \brief Parse the given source file and the translation unit corresponding
 * to that file.
 *
 * This routine is the main entry point for the Clang C API, providing the
 * ability to parse a source file into a translation unit that can then be
 * queried by other functions in the API. This routine accepts a set of
 * command-line arguments so that the compilation can be configured in the same
 * way that the compiler is configured on the command line.
 *
 * @param CIdx The index object with which the translation unit will be 
 * associated.
 *
 * @param source_filename The name of the source file to load, or NULL if the
 * source file is included in \c command_line_args.
 *
 * @param command_line_args The command-line arguments that would be
 * passed to the \c clang executable if it were being invoked out-of-process.
 * These command-line options will be parsed and will affect how the translation
 * unit is parsed. Note that the following options are ignored: '-c', 
 * '-emit-ast', '-fsyntax-only' (which is the default), and '-o \<output file>'.
 *
 * @param num_command_line_args The number of command-line arguments in
 * \c command_line_args.
 *
 * @param unsaved_files the files that have not yet been saved to disk
 * but may be required for parsing, including the contents of
 * those files.  The contents and name of these files (as specified by
 * CXUnsavedFile) are copied when necessary, so the client only needs to
 * guarantee their validity until the call to this function returns.
 *
 * @param num_unsaved_files the number of unsaved file entries in \p
 * unsaved_files.
 *
 * @param options A bitmask of options that affects how the translation unit
 * is managed but not its compilation. This should be a bitwise OR of the
 * CXTranslationUnit_XXX flags.
 *
 * @param [out] out_TU A non-NULL pointer to store the created
 * \c CXTranslationUnit, describing the parsed code and containing any
 * diagnostics produced by the compiler.
 *
 * @return Zero on success, otherwise returns an error code.
 */
public static native @Cast("CXErrorCode") int clang_parseTranslationUnit2(CXIndex CIdx,
                            @Cast("const char*") BytePointer source_filename,
                            @Cast("const char*const*") PointerPointer command_line_args,
                            int num_command_line_args,
                            CXUnsavedFile unsaved_files,
                            @Cast("unsigned") int num_unsaved_files,
                            @Cast("unsigned") int options,
                            @ByPtrPtr CXTranslationUnit out_TU);
public static native @Cast("CXErrorCode") int clang_parseTranslationUnit2(CXIndex CIdx,
                            @Cast("const char*") BytePointer source_filename,
                            @Cast("const char*const*") @ByPtrPtr BytePointer command_line_args,
                            int num_command_line_args,
                            CXUnsavedFile unsaved_files,
                            @Cast("unsigned") int num_unsaved_files,
                            @Cast("unsigned") int options,
                            @ByPtrPtr CXTranslationUnit out_TU);
public static native @Cast("CXErrorCode") int clang_parseTranslationUnit2(CXIndex CIdx,
                            String source_filename,
                            @Cast("const char*const*") @ByPtrPtr ByteBuffer command_line_args,
                            int num_command_line_args,
                            CXUnsavedFile unsaved_files,
                            @Cast("unsigned") int num_unsaved_files,
                            @Cast("unsigned") int options,
                            @Cast("CXTranslationUnit*") PointerPointer out_TU);
public static native @Cast("CXErrorCode") int clang_parseTranslationUnit2(CXIndex CIdx,
                            @Cast("const char*") BytePointer source_filename,
                            @Cast("const char*const*") @ByPtrPtr byte[] command_line_args,
                            int num_command_line_args,
                            CXUnsavedFile unsaved_files,
                            @Cast("unsigned") int num_unsaved_files,
                            @Cast("unsigned") int options,
                            @ByPtrPtr CXTranslationUnit out_TU);
public static native @Cast("CXErrorCode") int clang_parseTranslationUnit2(CXIndex CIdx,
                            String source_filename,
                            @Cast("const char*const*") @ByPtrPtr BytePointer command_line_args,
                            int num_command_line_args,
                            CXUnsavedFile unsaved_files,
                            @Cast("unsigned") int num_unsaved_files,
                            @Cast("unsigned") int options,
                            @Cast("CXTranslationUnit*") PointerPointer out_TU);
public static native @Cast("CXErrorCode") int clang_parseTranslationUnit2(CXIndex CIdx,
                            @Cast("const char*") BytePointer source_filename,
                            @Cast("const char*const*") @ByPtrPtr ByteBuffer command_line_args,
                            int num_command_line_args,
                            CXUnsavedFile unsaved_files,
                            @Cast("unsigned") int num_unsaved_files,
                            @Cast("unsigned") int options,
                            @ByPtrPtr CXTranslationUnit out_TU);
public static native @Cast("CXErrorCode") int clang_parseTranslationUnit2(CXIndex CIdx,
                            String source_filename,
                            @Cast("const char*const*") @ByPtrPtr byte[] command_line_args,
                            int num_command_line_args,
                            CXUnsavedFile unsaved_files,
                            @Cast("unsigned") int num_unsaved_files,
                            @Cast("unsigned") int options,
                            @Cast("CXTranslationUnit*") PointerPointer out_TU);

/**
 * \brief Flags that control how translation units are saved.
 *
 * The enumerators in this enumeration type are meant to be bitwise
 * ORed together to specify which options should be used when
 * saving the translation unit.
 */
/** enum CXSaveTranslationUnit_Flags */
public static final int
  /**
   * \brief Used to indicate that no special saving options are needed.
   */
  CXSaveTranslationUnit_None =  0x0;

/**
 * \brief Returns the set of flags that is suitable for saving a translation
 * unit.
 *
 * The set of flags returned provide options for
 * \c clang_saveTranslationUnit() by default. The returned flag
 * set contains an unspecified set of options that save translation units with
 * the most commonly-requested data.
 */
public static native @Cast("unsigned") int clang_defaultSaveOptions(CXTranslationUnit TU);

/**
 * \brief Describes the kind of error that occurred (if any) in a call to
 * \c clang_saveTranslationUnit().
 */
/** enum CXSaveError */
public static final int
  /**
   * \brief Indicates that no error occurred while saving a translation unit.
   */
  CXSaveError_None = 0,
  
  /**
   * \brief Indicates that an unknown error occurred while attempting to save
   * the file.
   *
   * This error typically indicates that file I/O failed when attempting to 
   * write the file.
   */
  CXSaveError_Unknown = 1,
  
  /**
   * \brief Indicates that errors during translation prevented this attempt
   * to save the translation unit.
   * 
   * Errors that prevent the translation unit from being saved can be
   * extracted using \c clang_getNumDiagnostics() and \c clang_getDiagnostic().
   */
  CXSaveError_TranslationErrors = 2,
  
  /**
   * \brief Indicates that the translation unit to be saved was somehow
   * invalid (e.g., NULL).
   */
  CXSaveError_InvalidTU = 3;
  
/**
 * \brief Saves a translation unit into a serialized representation of
 * that translation unit on disk.
 *
 * Any translation unit that was parsed without error can be saved
 * into a file. The translation unit can then be deserialized into a
 * new \c CXTranslationUnit with \c clang_createTranslationUnit() or,
 * if it is an incomplete translation unit that corresponds to a
 * header, used as a precompiled header when parsing other translation
 * units.
 *
 * @param TU The translation unit to save.
 *
 * @param FileName The file to which the translation unit will be saved.
 *
 * @param options A bitmask of options that affects how the translation unit
 * is saved. This should be a bitwise OR of the
 * CXSaveTranslationUnit_XXX flags.
 *
 * @return A value that will match one of the enumerators of the CXSaveError
 * enumeration. Zero (CXSaveError_None) indicates that the translation unit was 
 * saved successfully, while a non-zero value indicates that a problem occurred.
 */
public static native int clang_saveTranslationUnit(CXTranslationUnit TU,
                                             @Cast("const char*") BytePointer FileName,
                                             @Cast("unsigned") int options);
public static native int clang_saveTranslationUnit(CXTranslationUnit TU,
                                             String FileName,
                                             @Cast("unsigned") int options);

/**
 * \brief Destroy the specified CXTranslationUnit object.
 */
public static native void clang_disposeTranslationUnit(CXTranslationUnit arg0);

/**
 * \brief Flags that control the reparsing of translation units.
 *
 * The enumerators in this enumeration type are meant to be bitwise
 * ORed together to specify which options should be used when
 * reparsing the translation unit.
 */
/** enum CXReparse_Flags */
public static final int
  /**
   * \brief Used to indicate that no special reparsing options are needed.
   */
  CXReparse_None =  0x0;
 
/**
 * \brief Returns the set of flags that is suitable for reparsing a translation
 * unit.
 *
 * The set of flags returned provide options for
 * \c clang_reparseTranslationUnit() by default. The returned flag
 * set contains an unspecified set of optimizations geared toward common uses
 * of reparsing. The set of optimizations enabled may change from one version 
 * to the next.
 */
public static native @Cast("unsigned") int clang_defaultReparseOptions(CXTranslationUnit TU);

/**
 * \brief Reparse the source files that produced this translation unit.
 *
 * This routine can be used to re-parse the source files that originally
 * created the given translation unit, for example because those source files
 * have changed (either on disk or as passed via \p unsaved_files). The
 * source code will be reparsed with the same command-line options as it
 * was originally parsed. 
 *
 * Reparsing a translation unit invalidates all cursors and source locations
 * that refer into that translation unit. This makes reparsing a translation
 * unit semantically equivalent to destroying the translation unit and then
 * creating a new translation unit with the same command-line arguments.
 * However, it may be more efficient to reparse a translation 
 * unit using this routine.
 *
 * @param TU The translation unit whose contents will be re-parsed. The
 * translation unit must originally have been built with 
 * \c clang_createTranslationUnitFromSourceFile().
 *
 * @param num_unsaved_files The number of unsaved file entries in \p
 * unsaved_files.
 *
 * @param unsaved_files The files that have not yet been saved to disk
 * but may be required for parsing, including the contents of
 * those files.  The contents and name of these files (as specified by
 * CXUnsavedFile) are copied when necessary, so the client only needs to
 * guarantee their validity until the call to this function returns.
 * 
 * @param options A bitset of options composed of the flags in CXReparse_Flags.
 * The function \c clang_defaultReparseOptions() produces a default set of
 * options recommended for most uses, based on the translation unit.
 *
 * @return 0 if the sources could be reparsed.  A non-zero error code will be
 * returned if reparsing was impossible, such that the translation unit is
 * invalid. In such cases, the only valid call for \c TU is
 * \c clang_disposeTranslationUnit(TU).  The error codes returned by this
 * routine are described by the \c CXErrorCode enum.
 */
public static native int clang_reparseTranslationUnit(CXTranslationUnit TU,
                                                @Cast("unsigned") int num_unsaved_files,
                                          CXUnsavedFile unsaved_files,
                                                @Cast("unsigned") int options);

/**
  * \brief Categorizes how memory is being used by a translation unit.
  */
/** enum CXTUResourceUsageKind */
public static final int
  CXTUResourceUsage_AST = 1,
  CXTUResourceUsage_Identifiers = 2,
  CXTUResourceUsage_Selectors = 3,
  CXTUResourceUsage_GlobalCompletionResults = 4,
  CXTUResourceUsage_SourceManagerContentCache = 5,
  CXTUResourceUsage_AST_SideTables = 6,
  CXTUResourceUsage_SourceManager_Membuffer_Malloc = 7,
  CXTUResourceUsage_SourceManager_Membuffer_MMap = 8,
  CXTUResourceUsage_ExternalASTSource_Membuffer_Malloc = 9, 
  CXTUResourceUsage_ExternalASTSource_Membuffer_MMap = 10, 
  CXTUResourceUsage_Preprocessor = 11,
  CXTUResourceUsage_PreprocessingRecord = 12,
  CXTUResourceUsage_SourceManager_DataStructures = 13,
  CXTUResourceUsage_Preprocessor_HeaderSearch = 14,
  CXTUResourceUsage_MEMORY_IN_BYTES_BEGIN =  CXTUResourceUsage_AST,
  CXTUResourceUsage_MEMORY_IN_BYTES_END = 
    CXTUResourceUsage_Preprocessor_HeaderSearch,

  CXTUResourceUsage_First =  CXTUResourceUsage_AST,
  CXTUResourceUsage_Last =  CXTUResourceUsage_Preprocessor_HeaderSearch;

/**
  * \brief Returns the human-readable null-terminated C string that represents
  *  the name of the memory category.  This string should never be freed.
  */
public static native @Cast("const char*") BytePointer clang_getTUResourceUsageName(@Cast("CXTUResourceUsageKind") int kind);

public static class CXTUResourceUsageEntry extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXTUResourceUsageEntry() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXTUResourceUsageEntry(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXTUResourceUsageEntry(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXTUResourceUsageEntry position(int position) {
        return (CXTUResourceUsageEntry)super.position(position);
    }

  /* \brief The memory usage category. */
  public native @Cast("CXTUResourceUsageKind") int kind(); public native CXTUResourceUsageEntry kind(int kind);  
  /* \brief Amount of resources used. 
      The units will depend on the resource kind. */
  public native @Cast("unsigned long") long amount(); public native CXTUResourceUsageEntry amount(long amount);
}

/**
  * \brief The memory usage of a CXTranslationUnit, broken into categories.
  */
public static class CXTUResourceUsage extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXTUResourceUsage() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXTUResourceUsage(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXTUResourceUsage(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXTUResourceUsage position(int position) {
        return (CXTUResourceUsage)super.position(position);
    }

  /* \brief Private data member, used for queries. */
  public native Pointer data(); public native CXTUResourceUsage data(Pointer data);

  /* \brief The number of entries in the 'entries' array. */
  public native @Cast("unsigned") int numEntries(); public native CXTUResourceUsage numEntries(int numEntries);

  /* \brief An array of key-value pairs, representing the breakdown of memory
            usage. */
  public native CXTUResourceUsageEntry entries(); public native CXTUResourceUsage entries(CXTUResourceUsageEntry entries);

}

/**
  * \brief Return the memory usage of a translation unit.  This object
  *  should be released with clang_disposeCXTUResourceUsage().
  */
public static native @ByVal CXTUResourceUsage clang_getCXTUResourceUsage(CXTranslationUnit TU);

public static native void clang_disposeCXTUResourceUsage(@ByVal CXTUResourceUsage usage);

/**
 * \}
 */

/**
 * \brief Describes the kind of entity that a cursor refers to.
 */
/** enum CXCursorKind */
public static final int
  /* Declarations */
  /**
   * \brief A declaration whose specific kind is not exposed via this
   * interface.
   *
   * Unexposed declarations have the same operations as any other kind
   * of declaration; one can extract their location information,
   * spelling, find their definitions, etc. However, the specific kind
   * of the declaration is not reported.
   */
  CXCursor_UnexposedDecl                 = 1,
  /** \brief A C or C++ struct. */
  CXCursor_StructDecl                    = 2,
  /** \brief A C or C++ union. */
  CXCursor_UnionDecl                     = 3,
  /** \brief A C++ class. */
  CXCursor_ClassDecl                     = 4,
  /** \brief An enumeration. */
  CXCursor_EnumDecl                      = 5,
  /**
   * \brief A field (in C) or non-static data member (in C++) in a
   * struct, union, or C++ class.
   */
  CXCursor_FieldDecl                     = 6,
  /** \brief An enumerator constant. */
  CXCursor_EnumConstantDecl              = 7,
  /** \brief A function. */
  CXCursor_FunctionDecl                  = 8,
  /** \brief A variable. */
  CXCursor_VarDecl                       = 9,
  /** \brief A function or method parameter. */
  CXCursor_ParmDecl                      = 10,
  /** \brief An Objective-C \\interface. */
  CXCursor_ObjCInterfaceDecl             = 11,
  /** \brief An Objective-C \\interface for a category. */
  CXCursor_ObjCCategoryDecl              = 12,
  /** \brief An Objective-C \\protocol declaration. */
  CXCursor_ObjCProtocolDecl              = 13,
  /** \brief An Objective-C \\property declaration. */
  CXCursor_ObjCPropertyDecl              = 14,
  /** \brief An Objective-C instance variable. */
  CXCursor_ObjCIvarDecl                  = 15,
  /** \brief An Objective-C instance method. */
  CXCursor_ObjCInstanceMethodDecl        = 16,
  /** \brief An Objective-C class method. */
  CXCursor_ObjCClassMethodDecl           = 17,
  /** \brief An Objective-C \\implementation. */
  CXCursor_ObjCImplementationDecl        = 18,
  /** \brief An Objective-C \\implementation for a category. */
  CXCursor_ObjCCategoryImplDecl          = 19,
  /** \brief A typedef */
  CXCursor_TypedefDecl                   = 20,
  /** \brief A C++ class method. */
  CXCursor_CXXMethod                     = 21,
  /** \brief A C++ namespace. */
  CXCursor_Namespace                     = 22,
  /** \brief A linkage specification, e.g. 'extern "C"'. */
  CXCursor_LinkageSpec                   = 23,
  /** \brief A C++ constructor. */
  CXCursor_Constructor                   = 24,
  /** \brief A C++ destructor. */
  CXCursor_Destructor                    = 25,
  /** \brief A C++ conversion function. */
  CXCursor_ConversionFunction            = 26,
  /** \brief A C++ template type parameter. */
  CXCursor_TemplateTypeParameter         = 27,
  /** \brief A C++ non-type template parameter. */
  CXCursor_NonTypeTemplateParameter      = 28,
  /** \brief A C++ template template parameter. */
  CXCursor_TemplateTemplateParameter     = 29,
  /** \brief A C++ function template. */
  CXCursor_FunctionTemplate              = 30,
  /** \brief A C++ class template. */
  CXCursor_ClassTemplate                 = 31,
  /** \brief A C++ class template partial specialization. */
  CXCursor_ClassTemplatePartialSpecialization = 32,
  /** \brief A C++ namespace alias declaration. */
  CXCursor_NamespaceAlias                = 33,
  /** \brief A C++ using directive. */
  CXCursor_UsingDirective                = 34,
  /** \brief A C++ using declaration. */
  CXCursor_UsingDeclaration              = 35,
  /** \brief A C++ alias declaration */
  CXCursor_TypeAliasDecl                 = 36,
  /** \brief An Objective-C \\synthesize definition. */
  CXCursor_ObjCSynthesizeDecl            = 37,
  /** \brief An Objective-C \\dynamic definition. */
  CXCursor_ObjCDynamicDecl               = 38,
  /** \brief An access specifier. */
  CXCursor_CXXAccessSpecifier            = 39,

  CXCursor_FirstDecl                     =  CXCursor_UnexposedDecl,
  CXCursor_LastDecl                      =  CXCursor_CXXAccessSpecifier,

  /* References */
  CXCursor_FirstRef                      = 40, /* Decl references */
  CXCursor_ObjCSuperClassRef             = 40,
  CXCursor_ObjCProtocolRef               = 41,
  CXCursor_ObjCClassRef                  = 42,
  /**
   * \brief A reference to a type declaration.
   *
   * A type reference occurs anywhere where a type is named but not
   * declared. For example, given:
   *
   * <pre>{@code
   * typedef unsigned size_type;
   * size_type size;
   * }</pre>
   *
   * The typedef is a declaration of size_type (CXCursor_TypedefDecl),
   * while the type of the variable "size" is referenced. The cursor
   * referenced by the type of size is the typedef for size_type.
   */
  CXCursor_TypeRef                       = 43,
  CXCursor_CXXBaseSpecifier              = 44,
  /** 
   * \brief A reference to a class template, function template, template
   * template parameter, or class template partial specialization.
   */
  CXCursor_TemplateRef                   = 45,
  /**
   * \brief A reference to a namespace or namespace alias.
   */
  CXCursor_NamespaceRef                  = 46,
  /**
   * \brief A reference to a member of a struct, union, or class that occurs in 
   * some non-expression context, e.g., a designated initializer.
   */
  CXCursor_MemberRef                     = 47,
  /**
   * \brief A reference to a labeled statement.
   *
   * This cursor kind is used to describe the jump to "start_over" in the 
   * goto statement in the following example:
   *
   * <pre>{@code
   *   start_over:
   *     ++counter;
   *
   *     goto start_over;
   * }</pre>
   *
   * A label reference cursor refers to a label statement.
   */
  CXCursor_LabelRef                      = 48,
  
  /**
   * \brief A reference to a set of overloaded functions or function templates
   * that has not yet been resolved to a specific function or function template.
   *
   * An overloaded declaration reference cursor occurs in C++ templates where
   * a dependent name refers to a function. For example:
   *
   * <pre>{@code
   * template<typename T> void swap(T&, T&);
   *
   * struct X { ... };
   * void swap(X&, X&);
   *
   * template<typename T>
   * void reverse(T* first, T* last) {
   *   while (first < last - 1) {
   *     swap(*first, *--last);
   *     ++first;
   *   }
   * }
   *
   * struct Y { };
   * void swap(Y&, Y&);
   * }</pre>
   *
   * Here, the identifier "swap" is associated with an overloaded declaration
   * reference. In the template definition, "swap" refers to either of the two
   * "swap" functions declared above, so both results will be available. At
   * instantiation time, "swap" may also refer to other functions found via
   * argument-dependent lookup (e.g., the "swap" function at the end of the
   * example).
   *
   * The functions \c clang_getNumOverloadedDecls() and 
   * \c clang_getOverloadedDecl() can be used to retrieve the definitions
   * referenced by this cursor.
   */
  CXCursor_OverloadedDeclRef             = 49,
  
  /**
   * \brief A reference to a variable that occurs in some non-expression 
   * context, e.g., a C++ lambda capture list.
   */
  CXCursor_VariableRef                   = 50,
  
  CXCursor_LastRef                       =  CXCursor_VariableRef,

  /* Error conditions */
  CXCursor_FirstInvalid                  = 70,
  CXCursor_InvalidFile                   = 70,
  CXCursor_NoDeclFound                   = 71,
  CXCursor_NotImplemented                = 72,
  CXCursor_InvalidCode                   = 73,
  CXCursor_LastInvalid                   =  CXCursor_InvalidCode,

  /* Expressions */
  CXCursor_FirstExpr                     = 100,

  /**
   * \brief An expression whose specific kind is not exposed via this
   * interface.
   *
   * Unexposed expressions have the same operations as any other kind
   * of expression; one can extract their location information,
   * spelling, children, etc. However, the specific kind of the
   * expression is not reported.
   */
  CXCursor_UnexposedExpr                 = 100,

  /**
   * \brief An expression that refers to some value declaration, such
   * as a function, variable, or enumerator.
   */
  CXCursor_DeclRefExpr                   = 101,

  /**
   * \brief An expression that refers to a member of a struct, union,
   * class, Objective-C class, etc.
   */
  CXCursor_MemberRefExpr                 = 102,

  /** \brief An expression that calls a function. */
  CXCursor_CallExpr                      = 103,

  /** \brief An expression that sends a message to an Objective-C
   object or class. */
  CXCursor_ObjCMessageExpr               = 104,

  /** \brief An expression that represents a block literal. */
  CXCursor_BlockExpr                     = 105,

  /** \brief An integer literal.
   */
  CXCursor_IntegerLiteral                = 106,

  /** \brief A floating point number literal.
   */
  CXCursor_FloatingLiteral               = 107,

  /** \brief An imaginary number literal.
   */
  CXCursor_ImaginaryLiteral              = 108,

  /** \brief A string literal.
   */
  CXCursor_StringLiteral                 = 109,

  /** \brief A character literal.
   */
  CXCursor_CharacterLiteral              = 110,

  /** \brief A parenthesized expression, e.g. "(1)".
   *
   * This AST node is only formed if full location information is requested.
   */
  CXCursor_ParenExpr                     = 111,

  /** \brief This represents the unary-expression's (except sizeof and
   * alignof).
   */
  CXCursor_UnaryOperator                 = 112,

  /** \brief [C99 6.5.2.1] Array Subscripting.
   */
  CXCursor_ArraySubscriptExpr            = 113,

  /** \brief A builtin binary operation expression such as "x + y" or
   * "x <= y".
   */
  CXCursor_BinaryOperator                = 114,

  /** \brief Compound assignment such as "+=".
   */
  CXCursor_CompoundAssignOperator        = 115,

  /** \brief The ?: ternary operator.
   */
  CXCursor_ConditionalOperator           = 116,

  /** \brief An explicit cast in C (C99 6.5.4) or a C-style cast in C++
   * (C++ [expr.cast]), which uses the syntax (Type)expr.
   *
   * For example: (int)f.
   */
  CXCursor_CStyleCastExpr                = 117,

  /** \brief [C99 6.5.2.5]
   */
  CXCursor_CompoundLiteralExpr           = 118,

  /** \brief Describes an C or C++ initializer list.
   */
  CXCursor_InitListExpr                  = 119,

  /** \brief The GNU address of label extension, representing &&label.
   */
  CXCursor_AddrLabelExpr                 = 120,

  /** \brief This is the GNU Statement Expression extension: ({int X=4; X;})
   */
  CXCursor_StmtExpr                      = 121,

  /** \brief Represents a C11 generic selection.
   */
  CXCursor_GenericSelectionExpr          = 122,

  /** \brief Implements the GNU __null extension, which is a name for a null
   * pointer constant that has integral type (e.g., int or long) and is the same
   * size and alignment as a pointer.
   *
   * The __null extension is typically only used by system headers, which define
   * NULL as __null in C++ rather than using 0 (which is an integer that may not
   * match the size of a pointer).
   */
  CXCursor_GNUNullExpr                   = 123,

  /** \brief C++'s static_cast<> expression.
   */
  CXCursor_CXXStaticCastExpr             = 124,

  /** \brief C++'s dynamic_cast<> expression.
   */
  CXCursor_CXXDynamicCastExpr            = 125,

  /** \brief C++'s reinterpret_cast<> expression.
   */
  CXCursor_CXXReinterpretCastExpr        = 126,

  /** \brief C++'s const_cast<> expression.
   */
  CXCursor_CXXConstCastExpr              = 127,

  /** \brief Represents an explicit C++ type conversion that uses "functional"
   * notion (C++ [expr.type.conv]).
   *
   * Example:
   * <pre>{@code
   *   x = int(0.5);
   * }</pre>
   */
  CXCursor_CXXFunctionalCastExpr         = 128,

  /** \brief A C++ typeid expression (C++ [expr.typeid]).
   */
  CXCursor_CXXTypeidExpr                 = 129,

  /** \brief [C++ 2.13.5] C++ Boolean Literal.
   */
  CXCursor_CXXBoolLiteralExpr            = 130,

  /** \brief [C++0x 2.14.7] C++ Pointer Literal.
   */
  CXCursor_CXXNullPtrLiteralExpr         = 131,

  /** \brief Represents the "this" expression in C++
   */
  CXCursor_CXXThisExpr                   = 132,

  /** \brief [C++ 15] C++ Throw Expression.
   *
   * This handles 'throw' and 'throw' assignment-expression. When
   * assignment-expression isn't present, Op will be null.
   */
  CXCursor_CXXThrowExpr                  = 133,

  /** \brief A new expression for memory allocation and constructor calls, e.g:
   * "new CXXNewExpr(foo)".
   */
  CXCursor_CXXNewExpr                    = 134,

  /** \brief A delete expression for memory deallocation and destructor calls,
   * e.g. "delete[] pArray".
   */
  CXCursor_CXXDeleteExpr                 = 135,

  /** \brief A unary expression.
   */
  CXCursor_UnaryExpr                     = 136,

  /** \brief An Objective-C string literal i.e. \"foo".
   */
  CXCursor_ObjCStringLiteral             = 137,

  /** \brief An Objective-C \\encode expression.
   */
  CXCursor_ObjCEncodeExpr                = 138,

  /** \brief An Objective-C \\selector expression.
   */
  CXCursor_ObjCSelectorExpr              = 139,

  /** \brief An Objective-C \\protocol expression.
   */
  CXCursor_ObjCProtocolExpr              = 140,

  /** \brief An Objective-C "bridged" cast expression, which casts between
   * Objective-C pointers and C pointers, transferring ownership in the process.
   *
   * <pre>{@code
   *   NSString *str = (__bridge_transfer NSString *)CFCreateString();
   * }</pre>
   */
  CXCursor_ObjCBridgedCastExpr           = 141,

  /** \brief Represents a C++0x pack expansion that produces a sequence of
   * expressions.
   *
   * A pack expansion expression contains a pattern (which itself is an
   * expression) followed by an ellipsis. For example:
   *
   * <pre>{@code
   * template<typename F, typename ...Types>
   * void forward(F f, Types &&...args) {
   *  f(static_cast<Types&&>(args)...);
   * }
   * }</pre>
   */
  CXCursor_PackExpansionExpr             = 142,

  /** \brief Represents an expression that computes the length of a parameter
   * pack.
   *
   * <pre>{@code
   * template<typename ...Types>
   * struct count {
   *   static const unsigned value = sizeof...(Types);
   * };
   * }</pre>
   */
  CXCursor_SizeOfPackExpr                = 143,

  /* \brief Represents a C++ lambda expression that produces a local function
   * object.
   *
   * \code
   * void abssort(float *x, unsigned N) {
   *   std::sort(x, x + N,
   *             [](float a, float b) {
   *               return std::abs(a) < std::abs(b);
   *             });
   * }
   * \endcode
   */
  CXCursor_LambdaExpr                    = 144,
  
  /** \brief Objective-c Boolean Literal.
   */
  CXCursor_ObjCBoolLiteralExpr           = 145,

  /** \brief Represents the "self" expression in an Objective-C method.
   */
  CXCursor_ObjCSelfExpr                  = 146,

  CXCursor_LastExpr                      =  CXCursor_ObjCSelfExpr,

  /* Statements */
  CXCursor_FirstStmt                     = 200,
  /**
   * \brief A statement whose specific kind is not exposed via this
   * interface.
   *
   * Unexposed statements have the same operations as any other kind of
   * statement; one can extract their location information, spelling,
   * children, etc. However, the specific kind of the statement is not
   * reported.
   */
  CXCursor_UnexposedStmt                 = 200,
  
  /** \brief A labelled statement in a function. 
   *
   * This cursor kind is used to describe the "start_over:" label statement in 
   * the following example:
   *
   * <pre>{@code
   *   start_over:
   *     ++counter;
   * }</pre>
   *
   */
  CXCursor_LabelStmt                     = 201,

  /** \brief A group of statements like { stmt stmt }.
   *
   * This cursor kind is used to describe compound statements, e.g. function
   * bodies.
   */
  CXCursor_CompoundStmt                  = 202,

  /** \brief A case statement.
   */
  CXCursor_CaseStmt                      = 203,

  /** \brief A default statement.
   */
  CXCursor_DefaultStmt                   = 204,

  /** \brief An if statement
   */
  CXCursor_IfStmt                        = 205,

  /** \brief A switch statement.
   */
  CXCursor_SwitchStmt                    = 206,

  /** \brief A while statement.
   */
  CXCursor_WhileStmt                     = 207,

  /** \brief A do statement.
   */
  CXCursor_DoStmt                        = 208,

  /** \brief A for statement.
   */
  CXCursor_ForStmt                       = 209,

  /** \brief A goto statement.
   */
  CXCursor_GotoStmt                      = 210,

  /** \brief An indirect goto statement.
   */
  CXCursor_IndirectGotoStmt              = 211,

  /** \brief A continue statement.
   */
  CXCursor_ContinueStmt                  = 212,

  /** \brief A break statement.
   */
  CXCursor_BreakStmt                     = 213,

  /** \brief A return statement.
   */
  CXCursor_ReturnStmt                    = 214,

  /** \brief A GCC inline assembly statement extension.
   */
  CXCursor_GCCAsmStmt                    = 215,
  CXCursor_AsmStmt                       =  CXCursor_GCCAsmStmt,

  /** \brief Objective-C's overall \\try-\\catch-\\finally statement.
   */
  CXCursor_ObjCAtTryStmt                 = 216,

  /** \brief Objective-C's \\catch statement.
   */
  CXCursor_ObjCAtCatchStmt               = 217,

  /** \brief Objective-C's \\finally statement.
   */
  CXCursor_ObjCAtFinallyStmt             = 218,

  /** \brief Objective-C's \\throw statement.
   */
  CXCursor_ObjCAtThrowStmt               = 219,

  /** \brief Objective-C's \\synchronized statement.
   */
  CXCursor_ObjCAtSynchronizedStmt        = 220,

  /** \brief Objective-C's autorelease pool statement.
   */
  CXCursor_ObjCAutoreleasePoolStmt       = 221,

  /** \brief Objective-C's collection statement.
   */
  CXCursor_ObjCForCollectionStmt         = 222,

  /** \brief C++'s catch statement.
   */
  CXCursor_CXXCatchStmt                  = 223,

  /** \brief C++'s try statement.
   */
  CXCursor_CXXTryStmt                    = 224,

  /** \brief C++'s for (* : *) statement.
   */
  CXCursor_CXXForRangeStmt               = 225,

  /** \brief Windows Structured Exception Handling's try statement.
   */
  CXCursor_SEHTryStmt                    = 226,

  /** \brief Windows Structured Exception Handling's except statement.
   */
  CXCursor_SEHExceptStmt                 = 227,

  /** \brief Windows Structured Exception Handling's finally statement.
   */
  CXCursor_SEHFinallyStmt                = 228,

  /** \brief A MS inline assembly statement extension.
   */
  CXCursor_MSAsmStmt                     = 229,

  /** \brief The null statement ";": C99 6.8.3p3.
   *
   * This cursor kind is used to describe the null statement.
   */
  CXCursor_NullStmt                      = 230,

  /** \brief Adaptor class for mixing declarations with statements and
   * expressions.
   */
  CXCursor_DeclStmt                      = 231,

  /** \brief OpenMP parallel directive.
   */
  CXCursor_OMPParallelDirective          = 232,

  /** \brief OpenMP SIMD directive.
   */
  CXCursor_OMPSimdDirective              = 233,

  /** \brief OpenMP for directive.
   */
  CXCursor_OMPForDirective               = 234,

  /** \brief OpenMP sections directive.
   */
  CXCursor_OMPSectionsDirective          = 235,

  /** \brief OpenMP section directive.
   */
  CXCursor_OMPSectionDirective           = 236,

  /** \brief OpenMP single directive.
   */
  CXCursor_OMPSingleDirective            = 237,

  /** \brief OpenMP parallel for directive.
   */
  CXCursor_OMPParallelForDirective       = 238,

  /** \brief OpenMP parallel sections directive.
   */
  CXCursor_OMPParallelSectionsDirective  = 239,

  /** \brief OpenMP task directive.
   */
  CXCursor_OMPTaskDirective              = 240,

  /** \brief OpenMP master directive.
   */
  CXCursor_OMPMasterDirective            = 241,

  /** \brief OpenMP critical directive.
   */
  CXCursor_OMPCriticalDirective          = 242,

  /** \brief OpenMP taskyield directive.
   */
  CXCursor_OMPTaskyieldDirective         = 243,

  /** \brief OpenMP barrier directive.
   */
  CXCursor_OMPBarrierDirective           = 244,

  /** \brief OpenMP taskwait directive.
   */
  CXCursor_OMPTaskwaitDirective          = 245,

  /** \brief OpenMP flush directive.
   */
  CXCursor_OMPFlushDirective             = 246,

  /** \brief Windows Structured Exception Handling's leave statement.
   */
  CXCursor_SEHLeaveStmt                  = 247,

  /** \brief OpenMP ordered directive.
   */
  CXCursor_OMPOrderedDirective           = 248,

  /** \brief OpenMP atomic directive.
   */
  CXCursor_OMPAtomicDirective            = 249,

  /** \brief OpenMP for SIMD directive.
   */
  CXCursor_OMPForSimdDirective           = 250,

  /** \brief OpenMP parallel for SIMD directive.
   */
  CXCursor_OMPParallelForSimdDirective   = 251,

  /** \brief OpenMP target directive.
   */
  CXCursor_OMPTargetDirective            = 252,

  /** \brief OpenMP teams directive.
   */
  CXCursor_OMPTeamsDirective             = 253,

  /** \brief OpenMP taskgroup directive.
   */
  CXCursor_OMPTaskgroupDirective          = 254,

  /** \brief OpenMP cancellation point directive.
   */
  CXCursor_OMPCancellationPointDirective  = 255,

  /** \brief OpenMP cancel directive.
   */
  CXCursor_OMPCancelDirective             = 256,

  CXCursor_LastStmt                    =  CXCursor_OMPCancelDirective,

  /**
   * \brief Cursor that represents the translation unit itself.
   *
   * The translation unit cursor exists primarily to act as the root
   * cursor for traversing the contents of a translation unit.
   */
  CXCursor_TranslationUnit               = 300,

  /* Attributes */
  CXCursor_FirstAttr                     = 400,
  /**
   * \brief An attribute whose specific kind is not exposed via this
   * interface.
   */
  CXCursor_UnexposedAttr                 = 400,

  CXCursor_IBActionAttr                  = 401,
  CXCursor_IBOutletAttr                  = 402,
  CXCursor_IBOutletCollectionAttr        = 403,
  CXCursor_CXXFinalAttr                  = 404,
  CXCursor_CXXOverrideAttr               = 405,
  CXCursor_AnnotateAttr                  = 406,
  CXCursor_AsmLabelAttr                  = 407,
  CXCursor_PackedAttr                    = 408,
  CXCursor_PureAttr                      = 409,
  CXCursor_ConstAttr                     = 410,
  CXCursor_NoDuplicateAttr               = 411,
  CXCursor_CUDAConstantAttr              = 412,
  CXCursor_CUDADeviceAttr                = 413,
  CXCursor_CUDAGlobalAttr                = 414,
  CXCursor_CUDAHostAttr                  = 415,
  CXCursor_CUDASharedAttr                = 416,
  CXCursor_LastAttr                      =  CXCursor_CUDASharedAttr,

  /* Preprocessing */
  CXCursor_PreprocessingDirective        = 500,
  CXCursor_MacroDefinition               = 501,
  CXCursor_MacroExpansion                = 502,
  CXCursor_MacroInstantiation            =  CXCursor_MacroExpansion,
  CXCursor_InclusionDirective            = 503,
  CXCursor_FirstPreprocessing            =  CXCursor_PreprocessingDirective,
  CXCursor_LastPreprocessing             =  CXCursor_InclusionDirective,

  /* Extra Declarations */
  /**
   * \brief A module import declaration.
   */
  CXCursor_ModuleImportDecl              = 600,
  CXCursor_FirstExtraDecl                =  CXCursor_ModuleImportDecl,
  CXCursor_LastExtraDecl                 =  CXCursor_ModuleImportDecl,

  /**
   * \brief A code completion overload candidate.
   */
  CXCursor_OverloadCandidate             = 700;

/**
 * \brief A cursor representing some element in the abstract syntax tree for
 * a translation unit.
 *
 * The cursor abstraction unifies the different kinds of entities in a
 * program--declaration, statements, expressions, references to declarations,
 * etc.--under a single "cursor" abstraction with a common set of operations.
 * Common operation for a cursor include: getting the physical location in
 * a source file where the cursor points, getting the name associated with a
 * cursor, and retrieving cursors for any child nodes of a particular cursor.
 *
 * Cursors can be produced in two specific ways.
 * clang_getTranslationUnitCursor() produces a cursor for a translation unit,
 * from which one can use clang_visitChildren() to explore the rest of the
 * translation unit. clang_getCursor() maps from a physical source location
 * to the entity that resides at that location, allowing one to map from the
 * source code into the AST.
 */
public static class CXCursor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXCursor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXCursor(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXCursor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXCursor position(int position) {
        return (CXCursor)super.position(position);
    }

  public native @Cast("CXCursorKind") int kind(); public native CXCursor kind(int kind);
  public native int xdata(); public native CXCursor xdata(int xdata);
  @MemberGetter public native @Const Pointer data(int i);
  @MemberGetter public native @Cast("const void**") PointerPointer data();
}

/**
 * \defgroup CINDEX_CURSOR_MANIP Cursor manipulations
 *
 * \{
 */

/**
 * \brief Retrieve the NULL cursor, which represents no entity.
 */
public static native @ByVal CXCursor clang_getNullCursor();

/**
 * \brief Retrieve the cursor that represents the given translation unit.
 *
 * The translation unit cursor can be used to start traversing the
 * various declarations within the given translation unit.
 */
public static native @ByVal CXCursor clang_getTranslationUnitCursor(CXTranslationUnit arg0);

/**
 * \brief Determine whether two cursors are equivalent.
 */
public static native @Cast("unsigned") int clang_equalCursors(@ByVal CXCursor arg0, @ByVal CXCursor arg1);

/**
 * \brief Returns non-zero if \p cursor is null.
 */
public static native int clang_Cursor_isNull(@ByVal CXCursor cursor);

/**
 * \brief Compute a hash value for the given cursor.
 */
public static native @Cast("unsigned") int clang_hashCursor(@ByVal CXCursor arg0);
  
/**
 * \brief Retrieve the kind of the given cursor.
 */
public static native @Cast("CXCursorKind") int clang_getCursorKind(@ByVal CXCursor arg0);

/**
 * \brief Determine whether the given cursor kind represents a declaration.
 */
public static native @Cast("unsigned") int clang_isDeclaration(@Cast("CXCursorKind") int arg0);

/**
 * \brief Determine whether the given cursor kind represents a simple
 * reference.
 *
 * Note that other kinds of cursors (such as expressions) can also refer to
 * other cursors. Use clang_getCursorReferenced() to determine whether a
 * particular cursor refers to another entity.
 */
public static native @Cast("unsigned") int clang_isReference(@Cast("CXCursorKind") int arg0);

/**
 * \brief Determine whether the given cursor kind represents an expression.
 */
public static native @Cast("unsigned") int clang_isExpression(@Cast("CXCursorKind") int arg0);

/**
 * \brief Determine whether the given cursor kind represents a statement.
 */
public static native @Cast("unsigned") int clang_isStatement(@Cast("CXCursorKind") int arg0);

/**
 * \brief Determine whether the given cursor kind represents an attribute.
 */
public static native @Cast("unsigned") int clang_isAttribute(@Cast("CXCursorKind") int arg0);

/**
 * \brief Determine whether the given cursor kind represents an invalid
 * cursor.
 */
public static native @Cast("unsigned") int clang_isInvalid(@Cast("CXCursorKind") int arg0);

/**
 * \brief Determine whether the given cursor kind represents a translation
 * unit.
 */
public static native @Cast("unsigned") int clang_isTranslationUnit(@Cast("CXCursorKind") int arg0);

/***
 * \brief Determine whether the given cursor represents a preprocessing
 * element, such as a preprocessor directive or macro instantiation.
 */
public static native @Cast("unsigned") int clang_isPreprocessing(@Cast("CXCursorKind") int arg0);
  
/***
 * \brief Determine whether the given cursor represents a currently
 *  unexposed piece of the AST (e.g., CXCursor_UnexposedStmt).
 */
public static native @Cast("unsigned") int clang_isUnexposed(@Cast("CXCursorKind") int arg0);

/**
 * \brief Describe the linkage of the entity referred to by a cursor.
 */
/** enum CXLinkageKind */
public static final int
  /** \brief This value indicates that no linkage information is available
   * for a provided CXCursor. */
  CXLinkage_Invalid = 0,
  /**
   * \brief This is the linkage for variables, parameters, and so on that
   *  have automatic storage.  This covers normal (non-extern) local variables.
   */
  CXLinkage_NoLinkage = 1,
  /** \brief This is the linkage for static variables and static functions. */
  CXLinkage_Internal = 2,
  /** \brief This is the linkage for entities with external linkage that live
   * in C++ anonymous namespaces.*/
  CXLinkage_UniqueExternal = 3,
  /** \brief This is the linkage for entities with true, external linkage. */
  CXLinkage_External = 4;

/**
 * \brief Determine the linkage of the entity referred to by a given cursor.
 */
public static native @Cast("CXLinkageKind") int clang_getCursorLinkage(@ByVal CXCursor cursor);

/**
 * \brief Determine the availability of the entity that this cursor refers to,
 * taking the current target platform into account.
 *
 * @param cursor The cursor to query.
 *
 * @return The availability of the cursor.
 */
public static native @Cast("CXAvailabilityKind") int clang_getCursorAvailability(@ByVal CXCursor cursor);

/**
 * Describes the availability of a given entity on a particular platform, e.g.,
 * a particular class might only be available on Mac OS 10.7 or newer.
 */
public static class CXPlatformAvailability extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXPlatformAvailability() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXPlatformAvailability(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXPlatformAvailability(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXPlatformAvailability position(int position) {
        return (CXPlatformAvailability)super.position(position);
    }

  /**
   * \brief A string that describes the platform for which this structure
   * provides availability information.
   *
   * Possible values are "ios" or "macosx".
   */
  public native @ByRef CXString Platform(); public native CXPlatformAvailability Platform(CXString Platform);
  /**
   * \brief The version number in which this entity was introduced.
   */
  public native @ByRef CXVersion Introduced(); public native CXPlatformAvailability Introduced(CXVersion Introduced);
  /**
   * \brief The version number in which this entity was deprecated (but is
   * still available).
   */
  public native @ByRef CXVersion Deprecated(); public native CXPlatformAvailability Deprecated(CXVersion Deprecated);
  /**
   * \brief The version number in which this entity was obsoleted, and therefore
   * is no longer available.
   */
  public native @ByRef CXVersion Obsoleted(); public native CXPlatformAvailability Obsoleted(CXVersion Obsoleted);
  /**
   * \brief Whether the entity is unconditionally unavailable on this platform.
   */
  public native int Unavailable(); public native CXPlatformAvailability Unavailable(int Unavailable);
  /**
   * \brief An optional message to provide to a user of this API, e.g., to
   * suggest replacement APIs.
   */
  public native @ByRef CXString Message(); public native CXPlatformAvailability Message(CXString Message);
}

/**
 * \brief Determine the availability of the entity that this cursor refers to
 * on any platforms for which availability information is known.
 *
 * @param cursor The cursor to query.
 *
 * @param always_deprecated If non-NULL, will be set to indicate whether the 
 * entity is deprecated on all platforms.
 *
 * @param deprecated_message If non-NULL, will be set to the message text 
 * provided along with the unconditional deprecation of this entity. The client
 * is responsible for deallocating this string.
 *
 * @param always_unavailable If non-NULL, will be set to indicate whether the
 * entity is unavailable on all platforms.
 *
 * @param unavailable_message If non-NULL, will be set to the message text
 * provided along with the unconditional unavailability of this entity. The 
 * client is responsible for deallocating this string.
 *
 * @param availability If non-NULL, an array of CXPlatformAvailability instances
 * that will be populated with platform availability information, up to either
 * the number of platforms for which availability information is available (as
 * returned by this function) or \c availability_size, whichever is smaller.
 *
 * @param availability_size The number of elements available in the 
 * \c availability array.
 *
 * @return The number of platforms (N) for which availability information is
 * available (which is unrelated to \c availability_size).
 *
 * Note that the client is responsible for calling 
 * \c clang_disposeCXPlatformAvailability to free each of the 
 * platform-availability structures returned. There are 
 * \c min(N, availability_size) such structures.
 */
public static native int clang_getCursorPlatformAvailability(@ByVal CXCursor cursor,
                                    IntPointer always_deprecated,
                                    CXString deprecated_message,
                                    IntPointer always_unavailable,
                                    CXString unavailable_message,
                                    CXPlatformAvailability availability,
                                    int availability_size);
public static native int clang_getCursorPlatformAvailability(@ByVal CXCursor cursor,
                                    IntBuffer always_deprecated,
                                    CXString deprecated_message,
                                    IntBuffer always_unavailable,
                                    CXString unavailable_message,
                                    CXPlatformAvailability availability,
                                    int availability_size);
public static native int clang_getCursorPlatformAvailability(@ByVal CXCursor cursor,
                                    int[] always_deprecated,
                                    CXString deprecated_message,
                                    int[] always_unavailable,
                                    CXString unavailable_message,
                                    CXPlatformAvailability availability,
                                    int availability_size);

/**
 * \brief Free the memory associated with a \c CXPlatformAvailability structure.
 */
public static native void clang_disposeCXPlatformAvailability(CXPlatformAvailability availability);
  
/**
 * \brief Describe the "language" of the entity referred to by a cursor.
 */
/** enum CXLanguageKind */
public static final int
  CXLanguage_Invalid = 0,
  CXLanguage_C = 1,
  CXLanguage_ObjC = 2,
  CXLanguage_CPlusPlus = 3;

/**
 * \brief Determine the "language" of the entity referred to by a given cursor.
 */
public static native @Cast("CXLanguageKind") int clang_getCursorLanguage(@ByVal CXCursor cursor);

/**
 * \brief Returns the translation unit that a cursor originated from.
 */
public static native CXTranslationUnit clang_Cursor_getTranslationUnit(@ByVal CXCursor arg0);


/**
 * \brief A fast container representing a set of CXCursors.
 */
@Name("CXCursorSetImpl") @Opaque public static class CXCursorSet extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXCursorSet() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXCursorSet(Pointer p) { super(p); }
}

/**
 * \brief Creates an empty CXCursorSet.
 */
public static native CXCursorSet clang_createCXCursorSet();

/**
 * \brief Disposes a CXCursorSet and releases its associated memory.
 */
public static native void clang_disposeCXCursorSet(CXCursorSet cset);

/**
 * \brief Queries a CXCursorSet to see if it contains a specific CXCursor.
 *
 * @return non-zero if the set contains the specified cursor.
*/
public static native @Cast("unsigned") int clang_CXCursorSet_contains(CXCursorSet cset,
                                                   @ByVal CXCursor cursor);

/**
 * \brief Inserts a CXCursor into a CXCursorSet.
 *
 * @return zero if the CXCursor was already in the set, and non-zero otherwise.
*/
public static native @Cast("unsigned") int clang_CXCursorSet_insert(CXCursorSet cset,
                                                 @ByVal CXCursor cursor);

/**
 * \brief Determine the semantic parent of the given cursor.
 *
 * The semantic parent of a cursor is the cursor that semantically contains
 * the given \p cursor. For many declarations, the lexical and semantic parents
 * are equivalent (the lexical parent is returned by 
 * \c clang_getCursorLexicalParent()). They diverge when declarations or
 * definitions are provided out-of-line. For example:
 *
 * <pre>{@code
 * class C {
 *  void f();
 * };
 *
 * void C::f() { }
 * }</pre>
 *
 * In the out-of-line definition of \c C::f, the semantic parent is
 * the class \c C, of which this function is a member. The lexical parent is
 * the place where the declaration actually occurs in the source code; in this
 * case, the definition occurs in the translation unit. In general, the
 * lexical parent for a given entity can change without affecting the semantics
 * of the program, and the lexical parent of different declarations of the
 * same entity may be different. Changing the semantic parent of a declaration,
 * on the other hand, can have a major impact on semantics, and redeclarations
 * of a particular entity should all have the same semantic context.
 *
 * In the example above, both declarations of \c C::f have \c C as their
 * semantic context, while the lexical context of the first \c C::f is \c C
 * and the lexical context of the second \c C::f is the translation unit.
 *
 * For global declarations, the semantic parent is the translation unit.
 */
public static native @ByVal CXCursor clang_getCursorSemanticParent(@ByVal CXCursor cursor);

/**
 * \brief Determine the lexical parent of the given cursor.
 *
 * The lexical parent of a cursor is the cursor in which the given \p cursor
 * was actually written. For many declarations, the lexical and semantic parents
 * are equivalent (the semantic parent is returned by 
 * \c clang_getCursorSemanticParent()). They diverge when declarations or
 * definitions are provided out-of-line. For example:
 *
 * <pre>{@code
 * class C {
 *  void f();
 * };
 *
 * void C::f() { }
 * }</pre>
 *
 * In the out-of-line definition of \c C::f, the semantic parent is
 * the class \c C, of which this function is a member. The lexical parent is
 * the place where the declaration actually occurs in the source code; in this
 * case, the definition occurs in the translation unit. In general, the
 * lexical parent for a given entity can change without affecting the semantics
 * of the program, and the lexical parent of different declarations of the
 * same entity may be different. Changing the semantic parent of a declaration,
 * on the other hand, can have a major impact on semantics, and redeclarations
 * of a particular entity should all have the same semantic context.
 *
 * In the example above, both declarations of \c C::f have \c C as their
 * semantic context, while the lexical context of the first \c C::f is \c C
 * and the lexical context of the second \c C::f is the translation unit.
 *
 * For declarations written in the global scope, the lexical parent is
 * the translation unit.
 */
public static native @ByVal CXCursor clang_getCursorLexicalParent(@ByVal CXCursor cursor);

/**
 * \brief Determine the set of methods that are overridden by the given
 * method.
 *
 * In both Objective-C and C++, a method (aka virtual member function,
 * in C++) can override a virtual method in a base class. For
 * Objective-C, a method is said to override any method in the class's
 * base class, its protocols, or its categories' protocols, that has the same
 * selector and is of the same kind (class or instance).
 * If no such method exists, the search continues to the class's superclass,
 * its protocols, and its categories, and so on. A method from an Objective-C
 * implementation is considered to override the same methods as its
 * corresponding method in the interface.
 *
 * For C++, a virtual member function overrides any virtual member
 * function with the same signature that occurs in its base
 * classes. With multiple inheritance, a virtual member function can
 * override several virtual member functions coming from different
 * base classes.
 *
 * In all cases, this function determines the immediate overridden
 * method, rather than all of the overridden methods. For example, if
 * a method is originally declared in a class A, then overridden in B
 * (which in inherits from A) and also in C (which inherited from B),
 * then the only overridden method returned from this function when
 * invoked on C's method will be B's method. The client may then
 * invoke this function again, given the previously-found overridden
 * methods, to map out the complete method-override set.
 *
 * @param cursor A cursor representing an Objective-C or C++
 * method. This routine will compute the set of methods that this
 * method overrides.
 * 
 * @param overridden A pointer whose pointee will be replaced with a
 * pointer to an array of cursors, representing the set of overridden
 * methods. If there are no overridden methods, the pointee will be
 * set to NULL. The pointee must be freed via a call to 
 * \c clang_disposeOverriddenCursors().
 *
 * @param num_overridden A pointer to the number of overridden
 * functions, will be set to the number of overridden functions in the
 * array pointed to by \p overridden.
 */
public static native void clang_getOverriddenCursors(@ByVal CXCursor cursor, 
                                               @Cast("CXCursor**") PointerPointer overridden,
                                               @Cast("unsigned*") IntPointer num_overridden);
public static native void clang_getOverriddenCursors(@ByVal CXCursor cursor, 
                                               @ByPtrPtr CXCursor overridden,
                                               @Cast("unsigned*") IntPointer num_overridden);
public static native void clang_getOverriddenCursors(@ByVal CXCursor cursor, 
                                               @ByPtrPtr CXCursor overridden,
                                               @Cast("unsigned*") IntBuffer num_overridden);
public static native void clang_getOverriddenCursors(@ByVal CXCursor cursor, 
                                               @ByPtrPtr CXCursor overridden,
                                               @Cast("unsigned*") int[] num_overridden);

/**
 * \brief Free the set of overridden cursors returned by \c
 * clang_getOverriddenCursors().
 */
public static native void clang_disposeOverriddenCursors(CXCursor overridden);

/**
 * \brief Retrieve the file that is included by the given inclusion directive
 * cursor.
 */
public static native CXFile clang_getIncludedFile(@ByVal CXCursor cursor);
  
/**
 * \}
 */

/**
 * \defgroup CINDEX_CURSOR_SOURCE Mapping between cursors and source code
 *
 * Cursors represent a location within the Abstract Syntax Tree (AST). These
 * routines help map between cursors and the physical locations where the
 * described entities occur in the source code. The mapping is provided in
 * both directions, so one can map from source code to the AST and back.
 *
 * \{
 */

/**
 * \brief Map a source location to the cursor that describes the entity at that
 * location in the source code.
 *
 * clang_getCursor() maps an arbitrary source location within a translation
 * unit down to the most specific cursor that describes the entity at that
 * location. For example, given an expression \c x + y, invoking
 * clang_getCursor() with a source location pointing to "x" will return the
 * cursor for "x"; similarly for "y". If the cursor points anywhere between
 * "x" or "y" (e.g., on the + or the whitespace around it), clang_getCursor()
 * will return a cursor referring to the "+" expression.
 *
 * @return a cursor representing the entity at the given source location, or
 * a NULL cursor if no such entity can be found.
 */
public static native @ByVal CXCursor clang_getCursor(CXTranslationUnit arg0, @ByVal CXSourceLocation arg1);

/**
 * \brief Retrieve the physical location of the source constructor referenced
 * by the given cursor.
 *
 * The location of a declaration is typically the location of the name of that
 * declaration, where the name of that declaration would occur if it is
 * unnamed, or some keyword that introduces that particular declaration.
 * The location of a reference is where that reference occurs within the
 * source code.
 */
public static native @ByVal CXSourceLocation clang_getCursorLocation(@ByVal CXCursor arg0);

/**
 * \brief Retrieve the physical extent of the source construct referenced by
 * the given cursor.
 *
 * The extent of a cursor starts with the file/line/column pointing at the
 * first character within the source construct that the cursor refers to and
 * ends with the last character within that source construct. For a
 * declaration, the extent covers the declaration itself. For a reference,
 * the extent covers the location of the reference (e.g., where the referenced
 * entity was actually used).
 */
public static native @ByVal CXSourceRange clang_getCursorExtent(@ByVal CXCursor arg0);

/**
 * \}
 */
    
/**
 * \defgroup CINDEX_TYPES Type information for CXCursors
 *
 * \{
 */

/**
 * \brief Describes the kind of type
 */
/** enum CXTypeKind */
public static final int
  /**
   * \brief Represents an invalid type (e.g., where no type is available).
   */
  CXType_Invalid = 0,

  /**
   * \brief A type whose specific kind is not exposed via this
   * interface.
   */
  CXType_Unexposed = 1,

  /* Builtin types */
  CXType_Void = 2,
  CXType_Bool = 3,
  CXType_Char_U = 4,
  CXType_UChar = 5,
  CXType_Char16 = 6,
  CXType_Char32 = 7,
  CXType_UShort = 8,
  CXType_UInt = 9,
  CXType_ULong = 10,
  CXType_ULongLong = 11,
  CXType_UInt128 = 12,
  CXType_Char_S = 13,
  CXType_SChar = 14,
  CXType_WChar = 15,
  CXType_Short = 16,
  CXType_Int = 17,
  CXType_Long = 18,
  CXType_LongLong = 19,
  CXType_Int128 = 20,
  CXType_Float = 21,
  CXType_Double = 22,
  CXType_LongDouble = 23,
  CXType_NullPtr = 24,
  CXType_Overload = 25,
  CXType_Dependent = 26,
  CXType_ObjCId = 27,
  CXType_ObjCClass = 28,
  CXType_ObjCSel = 29,
  CXType_FirstBuiltin =  CXType_Void,
  CXType_LastBuiltin  =  CXType_ObjCSel,

  CXType_Complex = 100,
  CXType_Pointer = 101,
  CXType_BlockPointer = 102,
  CXType_LValueReference = 103,
  CXType_RValueReference = 104,
  CXType_Record = 105,
  CXType_Enum = 106,
  CXType_Typedef = 107,
  CXType_ObjCInterface = 108,
  CXType_ObjCObjectPointer = 109,
  CXType_FunctionNoProto = 110,
  CXType_FunctionProto = 111,
  CXType_ConstantArray = 112,
  CXType_Vector = 113,
  CXType_IncompleteArray = 114,
  CXType_VariableArray = 115,
  CXType_DependentSizedArray = 116,
  CXType_MemberPointer = 117;

/**
 * \brief Describes the calling convention of a function type
 */
/** enum CXCallingConv */
public static final int
  CXCallingConv_Default = 0,
  CXCallingConv_C = 1,
  CXCallingConv_X86StdCall = 2,
  CXCallingConv_X86FastCall = 3,
  CXCallingConv_X86ThisCall = 4,
  CXCallingConv_X86Pascal = 5,
  CXCallingConv_AAPCS = 6,
  CXCallingConv_AAPCS_VFP = 7,
  /* Value 8 was PnaclCall, but it was never used, so it could safely be re-used. */
  CXCallingConv_IntelOclBicc = 9,
  CXCallingConv_X86_64Win64 = 10,
  CXCallingConv_X86_64SysV = 11,
  CXCallingConv_X86VectorCall = 12,

  CXCallingConv_Invalid = 100,
  CXCallingConv_Unexposed = 200;


/**
 * \brief The type of an element in the abstract syntax tree.
 *
 */
public static class CXType extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXType() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXType(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXType(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXType position(int position) {
        return (CXType)super.position(position);
    }

  public native @Cast("CXTypeKind") int kind(); public native CXType kind(int kind);
  public native Pointer data(int i); public native CXType data(int i, Pointer data);
  @MemberGetter public native @Cast("void**") PointerPointer data();
}

/**
 * \brief Retrieve the type of a CXCursor (if any).
 */
public static native @ByVal CXType clang_getCursorType(@ByVal CXCursor C);

/**
 * \brief Pretty-print the underlying type using the rules of the
 * language of the translation unit from which it came.
 *
 * If the type is invalid, an empty string is returned.
 */
public static native @ByVal CXString clang_getTypeSpelling(@ByVal CXType CT);

/**
 * \brief Retrieve the underlying type of a typedef declaration.
 *
 * If the cursor does not reference a typedef declaration, an invalid type is
 * returned.
 */
public static native @ByVal CXType clang_getTypedefDeclUnderlyingType(@ByVal CXCursor C);

/**
 * \brief Retrieve the integer type of an enum declaration.
 *
 * If the cursor does not reference an enum declaration, an invalid type is
 * returned.
 */
public static native @ByVal CXType clang_getEnumDeclIntegerType(@ByVal CXCursor C);

/**
 * \brief Retrieve the integer value of an enum constant declaration as a signed
 *  long long.
 *
 * If the cursor does not reference an enum constant declaration, LLONG_MIN is returned.
 * Since this is also potentially a valid constant value, the kind of the cursor
 * must be verified before calling this function.
 */
public static native long clang_getEnumConstantDeclValue(@ByVal CXCursor C);

/**
 * \brief Retrieve the integer value of an enum constant declaration as an unsigned
 *  long long.
 *
 * If the cursor does not reference an enum constant declaration, ULLONG_MAX is returned.
 * Since this is also potentially a valid constant value, the kind of the cursor
 * must be verified before calling this function.
 */
public static native @Cast("unsigned long long") long clang_getEnumConstantDeclUnsignedValue(@ByVal CXCursor C);

/**
 * \brief Retrieve the bit width of a bit field declaration as an integer.
 *
 * If a cursor that is not a bit field declaration is passed in, -1 is returned.
 */
public static native int clang_getFieldDeclBitWidth(@ByVal CXCursor C);

/**
 * \brief Retrieve the number of non-variadic arguments associated with a given
 * cursor.
 *
 * The number of arguments can be determined for calls as well as for
 * declarations of functions or methods. For other cursors -1 is returned.
 */
public static native int clang_Cursor_getNumArguments(@ByVal CXCursor C);

/**
 * \brief Retrieve the argument cursor of a function or method.
 *
 * The argument cursor can be determined for calls as well as for declarations
 * of functions or methods. For other cursors and for invalid indices, an
 * invalid cursor is returned.
 */
public static native @ByVal CXCursor clang_Cursor_getArgument(@ByVal CXCursor C, @Cast("unsigned") int i);

/**
 * \brief Describes the kind of a template argument.
 *
 * See the definition of llvm::clang::TemplateArgument::ArgKind for full
 * element descriptions.
 */
/** enum CXTemplateArgumentKind */
public static final int
  CXTemplateArgumentKind_Null = 0,
  CXTemplateArgumentKind_Type = 1,
  CXTemplateArgumentKind_Declaration = 2,
  CXTemplateArgumentKind_NullPtr = 3,
  CXTemplateArgumentKind_Integral = 4,
  CXTemplateArgumentKind_Template = 5,
  CXTemplateArgumentKind_TemplateExpansion = 6,
  CXTemplateArgumentKind_Expression = 7,
  CXTemplateArgumentKind_Pack = 8,
  /* Indicates an error case, preventing the kind from being deduced. */
  CXTemplateArgumentKind_Invalid = 9;

/**
 *\brief Returns the number of template args of a function decl representing a
 * template specialization.
 *
 * If the argument cursor cannot be converted into a template function
 * declaration, -1 is returned.
 *
 * For example, for the following declaration and specialization:
 *   template <typename T, int kInt, bool kBool>
 *   void foo() { ... }
 *
 *   template <>
 *   void foo<float, -7, true>();
 *
 * The value 3 would be returned from this call.
 */
public static native int clang_Cursor_getNumTemplateArguments(@ByVal CXCursor C);

/**
 * \brief Retrieve the kind of the I'th template argument of the CXCursor C.
 *
 * If the argument CXCursor does not represent a FunctionDecl, an invalid
 * template argument kind is returned.
 *
 * For example, for the following declaration and specialization:
 *   template <typename T, int kInt, bool kBool>
 *   void foo() { ... }
 *
 *   template <>
 *   void foo<float, -7, true>();
 *
 * For I = 0, 1, and 2, Type, Integral, and Integral will be returned,
 * respectively.
 */
public static native @Cast("CXTemplateArgumentKind") int clang_Cursor_getTemplateArgumentKind(
    @ByVal CXCursor C, @Cast("unsigned") int I);

/**
 * \brief Retrieve a CXType representing the type of a TemplateArgument of a
 *  function decl representing a template specialization.
 *
 * If the argument CXCursor does not represent a FunctionDecl whose I'th
 * template argument has a kind of CXTemplateArgKind_Integral, an invalid type
 * is returned.
 *
 * For example, for the following declaration and specialization:
 *   template <typename T, int kInt, bool kBool>
 *   void foo() { ... }
 *
 *   template <>
 *   void foo<float, -7, true>();
 *
 * If called with I = 0, "float", will be returned.
 * Invalid types will be returned for I == 1 or 2.
 */
public static native @ByVal CXType clang_Cursor_getTemplateArgumentType(@ByVal CXCursor C,
                                                           @Cast("unsigned") int I);

/**
 * \brief Retrieve the value of an Integral TemplateArgument (of a function
 *  decl representing a template specialization) as a signed long long.
 *
 * It is undefined to call this function on a CXCursor that does not represent a
 * FunctionDecl or whose I'th template argument is not an integral value.
 *
 * For example, for the following declaration and specialization:
 *   template <typename T, int kInt, bool kBool>
 *   void foo() { ... }
 *
 *   template <>
 *   void foo<float, -7, true>();
 *
 * If called with I = 1 or 2, -7 or true will be returned, respectively.
 * For I == 0, this function's behavior is undefined.
 */
public static native long clang_Cursor_getTemplateArgumentValue(@ByVal CXCursor C,
                                                               @Cast("unsigned") int I);

/**
 * \brief Retrieve the value of an Integral TemplateArgument (of a function
 *  decl representing a template specialization) as an unsigned long long.
 *
 * It is undefined to call this function on a CXCursor that does not represent a
 * FunctionDecl or whose I'th template argument is not an integral value.
 *
 * For example, for the following declaration and specialization:
 *   template <typename T, int kInt, bool kBool>
 *   void foo() { ... }
 *
 *   template <>
 *   void foo<float, 2147483649, true>();
 *
 * If called with I = 1 or 2, 2147483649 or true will be returned, respectively.
 * For I == 0, this function's behavior is undefined.
 */
public static native @Cast("unsigned long long") long clang_Cursor_getTemplateArgumentUnsignedValue(
    @ByVal CXCursor C, @Cast("unsigned") int I);

/**
 * \brief Determine whether two CXTypes represent the same type.
 *
 * @return non-zero if the CXTypes represent the same type and
 *          zero otherwise.
 */
public static native @Cast("unsigned") int clang_equalTypes(@ByVal CXType A, @ByVal CXType B);

/**
 * \brief Return the canonical type for a CXType.
 *
 * Clang's type system explicitly models typedefs and all the ways
 * a specific type can be represented.  The canonical type is the underlying
 * type with all the "sugar" removed.  For example, if 'T' is a typedef
 * for 'int', the canonical type for 'T' would be 'int'.
 */
public static native @ByVal CXType clang_getCanonicalType(@ByVal CXType T);

/**
 * \brief Determine whether a CXType has the "const" qualifier set,
 * without looking through typedefs that may have added "const" at a
 * different level.
 */
public static native @Cast("unsigned") int clang_isConstQualifiedType(@ByVal CXType T);

/**
 * \brief Determine whether a CXType has the "volatile" qualifier set,
 * without looking through typedefs that may have added "volatile" at
 * a different level.
 */
public static native @Cast("unsigned") int clang_isVolatileQualifiedType(@ByVal CXType T);

/**
 * \brief Determine whether a CXType has the "restrict" qualifier set,
 * without looking through typedefs that may have added "restrict" at a
 * different level.
 */
public static native @Cast("unsigned") int clang_isRestrictQualifiedType(@ByVal CXType T);

/**
 * \brief For pointer types, returns the type of the pointee.
 */
public static native @ByVal CXType clang_getPointeeType(@ByVal CXType T);

/**
 * \brief Return the cursor for the declaration of the given type.
 */
public static native @ByVal CXCursor clang_getTypeDeclaration(@ByVal CXType T);

/**
 * Returns the Objective-C type encoding for the specified declaration.
 */
public static native @ByVal CXString clang_getDeclObjCTypeEncoding(@ByVal CXCursor C);

/**
 * \brief Retrieve the spelling of a given CXTypeKind.
 */
public static native @ByVal CXString clang_getTypeKindSpelling(@Cast("CXTypeKind") int K);

/**
 * \brief Retrieve the calling convention associated with a function type.
 *
 * If a non-function type is passed in, CXCallingConv_Invalid is returned.
 */
public static native @Cast("CXCallingConv") int clang_getFunctionTypeCallingConv(@ByVal CXType T);

/**
 * \brief Retrieve the return type associated with a function type.
 *
 * If a non-function type is passed in, an invalid type is returned.
 */
public static native @ByVal CXType clang_getResultType(@ByVal CXType T);

/**
 * \brief Retrieve the number of non-variadic parameters associated with a
 * function type.
 *
 * If a non-function type is passed in, -1 is returned.
 */
public static native int clang_getNumArgTypes(@ByVal CXType T);

/**
 * \brief Retrieve the type of a parameter of a function type.
 *
 * If a non-function type is passed in or the function does not have enough
 * parameters, an invalid type is returned.
 */
public static native @ByVal CXType clang_getArgType(@ByVal CXType T, @Cast("unsigned") int i);

/**
 * \brief Return 1 if the CXType is a variadic function type, and 0 otherwise.
 */
public static native @Cast("unsigned") int clang_isFunctionTypeVariadic(@ByVal CXType T);

/**
 * \brief Retrieve the return type associated with a given cursor.
 *
 * This only returns a valid type if the cursor refers to a function or method.
 */
public static native @ByVal CXType clang_getCursorResultType(@ByVal CXCursor C);

/**
 * \brief Return 1 if the CXType is a POD (plain old data) type, and 0
 *  otherwise.
 */
public static native @Cast("unsigned") int clang_isPODType(@ByVal CXType T);

/**
 * \brief Return the element type of an array, complex, or vector type.
 *
 * If a type is passed in that is not an array, complex, or vector type,
 * an invalid type is returned.
 */
public static native @ByVal CXType clang_getElementType(@ByVal CXType T);

/**
 * \brief Return the number of elements of an array or vector type.
 *
 * If a type is passed in that is not an array or vector type,
 * -1 is returned.
 */
public static native long clang_getNumElements(@ByVal CXType T);

/**
 * \brief Return the element type of an array type.
 *
 * If a non-array type is passed in, an invalid type is returned.
 */
public static native @ByVal CXType clang_getArrayElementType(@ByVal CXType T);

/**
 * \brief Return the array size of a constant array.
 *
 * If a non-array type is passed in, -1 is returned.
 */
public static native long clang_getArraySize(@ByVal CXType T);

/**
 * \brief List the possible error codes for \c clang_Type_getSizeOf,
 *   \c clang_Type_getAlignOf, \c clang_Type_getOffsetOf and
 *   \c clang_Cursor_getOffsetOf.
 *
 * A value of this enumeration type can be returned if the target type is not
 * a valid argument to sizeof, alignof or offsetof.
 */
/** enum CXTypeLayoutError */
public static final int
  /**
   * \brief Type is of kind CXType_Invalid.
   */
  CXTypeLayoutError_Invalid = -1,
  /**
   * \brief The type is an incomplete Type.
   */
  CXTypeLayoutError_Incomplete = -2,
  /**
   * \brief The type is a dependent Type.
   */
  CXTypeLayoutError_Dependent = -3,
  /**
   * \brief The type is not a constant size type.
   */
  CXTypeLayoutError_NotConstantSize = -4,
  /**
   * \brief The Field name is not valid for this record.
   */
  CXTypeLayoutError_InvalidFieldName = -5;

/**
 * \brief Return the alignment of a type in bytes as per C++[expr.alignof]
 *   standard.
 *
 * If the type declaration is invalid, CXTypeLayoutError_Invalid is returned.
 * If the type declaration is an incomplete type, CXTypeLayoutError_Incomplete
 *   is returned.
 * If the type declaration is a dependent type, CXTypeLayoutError_Dependent is
 *   returned.
 * If the type declaration is not a constant size type,
 *   CXTypeLayoutError_NotConstantSize is returned.
 */
public static native long clang_Type_getAlignOf(@ByVal CXType T);

/**
 * \brief Return the class type of an member pointer type.
 *
 * If a non-member-pointer type is passed in, an invalid type is returned.
 */
public static native @ByVal CXType clang_Type_getClassType(@ByVal CXType T);

/**
 * \brief Return the size of a type in bytes as per C++[expr.sizeof] standard.
 *
 * If the type declaration is invalid, CXTypeLayoutError_Invalid is returned.
 * If the type declaration is an incomplete type, CXTypeLayoutError_Incomplete
 *   is returned.
 * If the type declaration is a dependent type, CXTypeLayoutError_Dependent is
 *   returned.
 */
public static native long clang_Type_getSizeOf(@ByVal CXType T);

/**
 * \brief Return the offset of a field named S in a record of type T in bits
 *   as it would be returned by __offsetof__ as per C++11[18.2p4]
 *
 * If the cursor is not a record field declaration, CXTypeLayoutError_Invalid
 *   is returned.
 * If the field's type declaration is an incomplete type,
 *   CXTypeLayoutError_Incomplete is returned.
 * If the field's type declaration is a dependent type,
 *   CXTypeLayoutError_Dependent is returned.
 * If the field's name S is not found,
 *   CXTypeLayoutError_InvalidFieldName is returned.
 */
public static native long clang_Type_getOffsetOf(@ByVal CXType T, @Cast("const char*") BytePointer S);
public static native long clang_Type_getOffsetOf(@ByVal CXType T, String S);

/**
 * \brief Return the offset of the field represented by the Cursor.
 *
 * If the cursor is not a field declaration, -1 is returned.
 * If the cursor semantic parent is not a record field declaration,
 *   CXTypeLayoutError_Invalid is returned.
 * If the field's type declaration is an incomplete type,
 *   CXTypeLayoutError_Incomplete is returned.
 * If the field's type declaration is a dependent type,
 *   CXTypeLayoutError_Dependent is returned.
 * If the field's name S is not found,
 *   CXTypeLayoutError_InvalidFieldName is returned.
 */
public static native long clang_Cursor_getOffsetOfField(@ByVal CXCursor C);

/**
 * \brief Determine whether the given cursor represents an anonymous record
 * declaration.
 */
public static native @Cast("unsigned") int clang_Cursor_isAnonymous(@ByVal CXCursor C);


/** enum CXRefQualifierKind */
public static final int
  /** \brief No ref-qualifier was provided. */
  CXRefQualifier_None = 0,
  /** \brief An lvalue ref-qualifier was provided (\c &). */
  CXRefQualifier_LValue = 1,
  /** \brief An rvalue ref-qualifier was provided (\c &&). */
  CXRefQualifier_RValue = 2;

/**
 * \brief Returns the number of template arguments for given class template
 * specialization, or -1 if type \c T is not a class template specialization.
 *
 * Variadic argument packs count as only one argument, and can not be inspected
 * further.
 */
public static native int clang_Type_getNumTemplateArguments(@ByVal CXType T);

/**
 * \brief Returns the type template argument of a template class specialization
 * at given index.
 *
 * This function only returns template type arguments and does not handle
 * template template arguments or variadic packs.
 */
public static native @ByVal CXType clang_Type_getTemplateArgumentAsType(@ByVal CXType T, @Cast("unsigned") int i);

/**
 * \brief Retrieve the ref-qualifier kind of a function or method.
 *
 * The ref-qualifier is returned for C++ functions or methods. For other types
 * or non-C++ declarations, CXRefQualifier_None is returned.
 */
public static native @Cast("CXRefQualifierKind") int clang_Type_getCXXRefQualifier(@ByVal CXType T);

/**
 * \brief Returns non-zero if the cursor specifies a Record member that is a
 *   bitfield.
 */
public static native @Cast("unsigned") int clang_Cursor_isBitField(@ByVal CXCursor C);

/**
 * \brief Returns 1 if the base class specified by the cursor with kind
 *   CX_CXXBaseSpecifier is virtual.
 */
public static native @Cast("unsigned") int clang_isVirtualBase(@ByVal CXCursor arg0);
    
/**
 * \brief Represents the C++ access control level to a base class for a
 * cursor with kind CX_CXXBaseSpecifier.
 */
/** enum CX_CXXAccessSpecifier */
public static final int
  CX_CXXInvalidAccessSpecifier = 0,
  CX_CXXPublic = 1,
  CX_CXXProtected = 2,
  CX_CXXPrivate = 3;

/**
 * \brief Returns the access control level for the referenced object.
 *
 * If the cursor refers to a C++ declaration, its access control level within its
 * parent scope is returned. Otherwise, if the cursor refers to a base specifier or
 * access specifier, the specifier itself is returned.
 */
public static native @Cast("CX_CXXAccessSpecifier") int clang_getCXXAccessSpecifier(@ByVal CXCursor arg0);

/**
 * \brief Represents the storage classes as declared in the source. CX_SC_Invalid
 * was added for the case that the passed cursor in not a declaration.
 */
/** enum CX_StorageClass */
public static final int
  CX_SC_Invalid = 0,
  CX_SC_None = 1,
  CX_SC_Extern = 2,
  CX_SC_Static = 3,
  CX_SC_PrivateExtern = 4,
  CX_SC_OpenCLWorkGroupLocal = 5,
  CX_SC_Auto = 6,
  CX_SC_Register = 7;

/**
 * \brief Returns the storage class for a function or variable declaration.
 *
 * If the passed in Cursor is not a function or variable declaration,
 * CX_SC_Invalid is returned else the storage class.
 */
public static native @Cast("CX_StorageClass") int clang_Cursor_getStorageClass(@ByVal CXCursor arg0);

/**
 * \brief Determine the number of overloaded declarations referenced by a 
 * \c CXCursor_OverloadedDeclRef cursor.
 *
 * @param cursor The cursor whose overloaded declarations are being queried.
 *
 * @return The number of overloaded declarations referenced by \c cursor. If it
 * is not a \c CXCursor_OverloadedDeclRef cursor, returns 0.
 */
public static native @Cast("unsigned") int clang_getNumOverloadedDecls(@ByVal CXCursor cursor);

/**
 * \brief Retrieve a cursor for one of the overloaded declarations referenced
 * by a \c CXCursor_OverloadedDeclRef cursor.
 *
 * @param cursor The cursor whose overloaded declarations are being queried.
 *
 * @param index The zero-based index into the set of overloaded declarations in
 * the cursor.
 *
 * @return A cursor representing the declaration referenced by the given 
 * \c cursor at the specified \c index. If the cursor does not have an 
 * associated set of overloaded declarations, or if the index is out of bounds,
 * returns \c clang_getNullCursor();
 */
public static native @ByVal CXCursor clang_getOverloadedDecl(@ByVal CXCursor cursor, 
                                                @Cast("unsigned") int index);
  
/**
 * \}
 */
  
/**
 * \defgroup CINDEX_ATTRIBUTES Information for attributes
 *
 * \{
 */


/**
 * \brief For cursors representing an iboutletcollection attribute,
 *  this function returns the collection element type.
 *
 */
public static native @ByVal CXType clang_getIBOutletCollectionType(@ByVal CXCursor arg0);

/**
 * \}
 */

/**
 * \defgroup CINDEX_CURSOR_TRAVERSAL Traversing the AST with cursors
 *
 * These routines provide the ability to traverse the abstract syntax tree
 * using cursors.
 *
 * \{
 */

/**
 * \brief Describes how the traversal of the children of a particular
 * cursor should proceed after visiting a particular child cursor.
 *
 * A value of this enumeration type should be returned by each
 * \c CXCursorVisitor to indicate how clang_visitChildren() proceed.
 */
/** enum CXChildVisitResult */
public static final int
  /**
   * \brief Terminates the cursor traversal.
   */
  CXChildVisit_Break = 0,
  /**
   * \brief Continues the cursor traversal with the next sibling of
   * the cursor just visited, without visiting its children.
   */
  CXChildVisit_Continue = 1,
  /**
   * \brief Recursively traverse the children of this cursor, using
   * the same visitor and client data.
   */
  CXChildVisit_Recurse = 2;

/**
 * \brief Visitor invoked for each cursor found by a traversal.
 *
 * This visitor function will be invoked for each cursor found by
 * clang_visitCursorChildren(). Its first argument is the cursor being
 * visited, its second argument is the parent visitor for that cursor,
 * and its third argument is the client data provided to
 * clang_visitCursorChildren().
 *
 * The visitor should return one of the \c CXChildVisitResult values
 * to direct clang_visitCursorChildren().
 */
public static class CXCursorVisitor extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CXCursorVisitor(Pointer p) { super(p); }
    protected CXCursorVisitor() { allocate(); }
    private native void allocate();
    public native @Cast("CXChildVisitResult") int call(@ByVal CXCursor cursor,
                                                   @ByVal CXCursor parent,
                                                   CXClientData client_data);
}

/**
 * \brief Visit the children of a particular cursor.
 *
 * This function visits all the direct children of the given cursor,
 * invoking the given \p visitor function with the cursors of each
 * visited child. The traversal may be recursive, if the visitor returns
 * \c CXChildVisit_Recurse. The traversal may also be ended prematurely, if
 * the visitor returns \c CXChildVisit_Break.
 *
 * @param parent the cursor whose child may be visited. All kinds of
 * cursors can be visited, including invalid cursors (which, by
 * definition, have no children).
 *
 * @param visitor the visitor function that will be invoked for each
 * child of \p parent.
 *
 * @param client_data pointer data supplied by the client, which will
 * be passed to the visitor each time it is invoked.
 *
 * @return a non-zero value if the traversal was terminated
 * prematurely by the visitor returning \c CXChildVisit_Break.
 */
public static native @Cast("unsigned") int clang_visitChildren(@ByVal CXCursor parent,
                                            CXCursorVisitor visitor,
                                            CXClientData client_data);
// #ifdef __has_feature
// #  if __has_feature(blocks)
// #  endif
// #endif

/**
 * \}
 */

/**
 * \defgroup CINDEX_CURSOR_XREF Cross-referencing in the AST
 *
 * These routines provide the ability to determine references within and
 * across translation units, by providing the names of the entities referenced
 * by cursors, follow reference cursors to the declarations they reference,
 * and associate declarations with their definitions.
 *
 * \{
 */

/**
 * \brief Retrieve a Unified Symbol Resolution (USR) for the entity referenced
 * by the given cursor.
 *
 * A Unified Symbol Resolution (USR) is a string that identifies a particular
 * entity (function, class, variable, etc.) within a program. USRs can be
 * compared across translation units to determine, e.g., when references in
 * one translation refer to an entity defined in another translation unit.
 */
public static native @ByVal CXString clang_getCursorUSR(@ByVal CXCursor arg0);

/**
 * \brief Construct a USR for a specified Objective-C class.
 */
public static native @ByVal CXString clang_constructUSR_ObjCClass(@Cast("const char*") BytePointer class_name);
public static native @ByVal CXString clang_constructUSR_ObjCClass(String class_name);

/**
 * \brief Construct a USR for a specified Objective-C category.
 */
public static native @ByVal CXString clang_constructUSR_ObjCCategory(@Cast("const char*") BytePointer class_name,
                                 @Cast("const char*") BytePointer category_name);
public static native @ByVal CXString clang_constructUSR_ObjCCategory(String class_name,
                                 String category_name);

/**
 * \brief Construct a USR for a specified Objective-C protocol.
 */
public static native @ByVal CXString clang_constructUSR_ObjCProtocol(@Cast("const char*") BytePointer protocol_name);
public static native @ByVal CXString clang_constructUSR_ObjCProtocol(String protocol_name);


/**
 * \brief Construct a USR for a specified Objective-C instance variable and
 *   the USR for its containing class.
 */
public static native @ByVal CXString clang_constructUSR_ObjCIvar(@Cast("const char*") BytePointer name,
                                                    @ByVal CXString classUSR);
public static native @ByVal CXString clang_constructUSR_ObjCIvar(String name,
                                                    @ByVal CXString classUSR);

/**
 * \brief Construct a USR for a specified Objective-C method and
 *   the USR for its containing class.
 */
public static native @ByVal CXString clang_constructUSR_ObjCMethod(@Cast("const char*") BytePointer name,
                                                      @Cast("unsigned") int isInstanceMethod,
                                                      @ByVal CXString classUSR);
public static native @ByVal CXString clang_constructUSR_ObjCMethod(String name,
                                                      @Cast("unsigned") int isInstanceMethod,
                                                      @ByVal CXString classUSR);

/**
 * \brief Construct a USR for a specified Objective-C property and the USR
 *  for its containing class.
 */
public static native @ByVal CXString clang_constructUSR_ObjCProperty(@Cast("const char*") BytePointer property,
                                                        @ByVal CXString classUSR);
public static native @ByVal CXString clang_constructUSR_ObjCProperty(String property,
                                                        @ByVal CXString classUSR);

/**
 * \brief Retrieve a name for the entity referenced by this cursor.
 */
public static native @ByVal CXString clang_getCursorSpelling(@ByVal CXCursor arg0);

/**
 * \brief Retrieve a range for a piece that forms the cursors spelling name.
 * Most of the times there is only one range for the complete spelling but for
 * Objective-C methods and Objective-C message expressions, there are multiple
 * pieces for each selector identifier.
 * 
 * @param pieceIndex the index of the spelling name piece. If this is greater
 * than the actual number of pieces, it will return a NULL (invalid) range.
 *  
 * @param options Reserved.
 */
public static native @ByVal CXSourceRange clang_Cursor_getSpellingNameRange(@ByVal CXCursor arg0,
                                                          @Cast("unsigned") int pieceIndex,
                                                          @Cast("unsigned") int options);

/**
 * \brief Retrieve the display name for the entity referenced by this cursor.
 *
 * The display name contains extra information that helps identify the cursor,
 * such as the parameters of a function or template or the arguments of a 
 * class template specialization.
 */
public static native @ByVal CXString clang_getCursorDisplayName(@ByVal CXCursor arg0);
  
/** \brief For a cursor that is a reference, retrieve a cursor representing the
 * entity that it references.
 *
 * Reference cursors refer to other entities in the AST. For example, an
 * Objective-C superclass reference cursor refers to an Objective-C class.
 * This function produces the cursor for the Objective-C class from the
 * cursor for the superclass reference. If the input cursor is a declaration or
 * definition, it returns that declaration or definition unchanged.
 * Otherwise, returns the NULL cursor.
 */
public static native @ByVal CXCursor clang_getCursorReferenced(@ByVal CXCursor arg0);

/**
 *  \brief For a cursor that is either a reference to or a declaration
 *  of some entity, retrieve a cursor that describes the definition of
 *  that entity.
 *
 *  Some entities can be declared multiple times within a translation
 *  unit, but only one of those declarations can also be a
 *  definition. For example, given:
 *
 *  <pre>{@code
 *  int f(int, int);
 *  int g(int x, int y) { return f(x, y); }
 *  int f(int a, int b) { return a + b; }
 *  int f(int, int);
 *  }</pre>
 *
 *  there are three declarations of the function "f", but only the
 *  second one is a definition. The clang_getCursorDefinition()
 *  function will take any cursor pointing to a declaration of "f"
 *  (the first or fourth lines of the example) or a cursor referenced
 *  that uses "f" (the call to "f' inside "g") and will return a
 *  declaration cursor pointing to the definition (the second "f"
 *  declaration).
 *
 *  If given a cursor for which there is no corresponding definition,
 *  e.g., because there is no definition of that entity within this
 *  translation unit, returns a NULL cursor.
 */
public static native @ByVal CXCursor clang_getCursorDefinition(@ByVal CXCursor arg0);

/**
 * \brief Determine whether the declaration pointed to by this cursor
 * is also a definition of that entity.
 */
public static native @Cast("unsigned") int clang_isCursorDefinition(@ByVal CXCursor arg0);

/**
 * \brief Retrieve the canonical cursor corresponding to the given cursor.
 *
 * In the C family of languages, many kinds of entities can be declared several
 * times within a single translation unit. For example, a structure type can
 * be forward-declared (possibly multiple times) and later defined:
 *
 * <pre>{@code
 * struct X;
 * struct X;
 * struct X {
 *   int member;
 * };
 * }</pre>
 *
 * The declarations and the definition of \c X are represented by three 
 * different cursors, all of which are declarations of the same underlying 
 * entity. One of these cursor is considered the "canonical" cursor, which
 * is effectively the representative for the underlying entity. One can 
 * determine if two cursors are declarations of the same underlying entity by
 * comparing their canonical cursors.
 *
 * @return The canonical cursor for the entity referred to by the given cursor.
 */
public static native @ByVal CXCursor clang_getCanonicalCursor(@ByVal CXCursor arg0);


/**
 * \brief If the cursor points to a selector identifier in an Objective-C
 * method or message expression, this returns the selector index.
 *
 * After getting a cursor with #clang_getCursor, this can be called to
 * determine if the location points to a selector identifier.
 *
 * @return The selector index if the cursor is an Objective-C method or message
 * expression and the cursor is pointing to a selector identifier, or -1
 * otherwise.
 */
public static native int clang_Cursor_getObjCSelectorIndex(@ByVal CXCursor arg0);

/**
 * \brief Given a cursor pointing to a C++ method call or an Objective-C
 * message, returns non-zero if the method/message is "dynamic", meaning:
 * 
 * For a C++ method: the call is virtual.
 * For an Objective-C message: the receiver is an object instance, not 'super'
 * or a specific class.
 * 
 * If the method/message is "static" or the cursor does not point to a
 * method/message, it will return zero.
 */
public static native int clang_Cursor_isDynamicCall(@ByVal CXCursor C);

/**
 * \brief Given a cursor pointing to an Objective-C message, returns the CXType
 * of the receiver.
 */
public static native @ByVal CXType clang_Cursor_getReceiverType(@ByVal CXCursor C);

/**
 * \brief Property attributes for a \c CXCursor_ObjCPropertyDecl.
 */
/** enum CXObjCPropertyAttrKind */
public static final int
  CXObjCPropertyAttr_noattr    =  0x00,
  CXObjCPropertyAttr_readonly  =  0x01,
  CXObjCPropertyAttr_getter    =  0x02,
  CXObjCPropertyAttr_assign    =  0x04,
  CXObjCPropertyAttr_readwrite =  0x08,
  CXObjCPropertyAttr_retain    =  0x10,
  CXObjCPropertyAttr_copy      =  0x20,
  CXObjCPropertyAttr_nonatomic =  0x40,
  CXObjCPropertyAttr_setter    =  0x80,
  CXObjCPropertyAttr_atomic    =  0x100,
  CXObjCPropertyAttr_weak      =  0x200,
  CXObjCPropertyAttr_strong    =  0x400,
  CXObjCPropertyAttr_unsafe_unretained =  0x800;

/**
 * \brief Given a cursor that represents a property declaration, return the
 * associated property attributes. The bits are formed from
 * \c CXObjCPropertyAttrKind.
 *
 * @param reserved Reserved for future use, pass 0.
 */
public static native @Cast("unsigned") int clang_Cursor_getObjCPropertyAttributes(@ByVal CXCursor C,
                                                             @Cast("unsigned") int reserved);

/**
 * \brief 'Qualifiers' written next to the return and parameter types in
 * Objective-C method declarations.
 */
/** enum CXObjCDeclQualifierKind */
public static final int
  CXObjCDeclQualifier_None =  0x0,
  CXObjCDeclQualifier_In =  0x1,
  CXObjCDeclQualifier_Inout =  0x2,
  CXObjCDeclQualifier_Out =  0x4,
  CXObjCDeclQualifier_Bycopy =  0x8,
  CXObjCDeclQualifier_Byref =  0x10,
  CXObjCDeclQualifier_Oneway =  0x20;

/**
 * \brief Given a cursor that represents an Objective-C method or parameter
 * declaration, return the associated Objective-C qualifiers for the return
 * type or the parameter respectively. The bits are formed from
 * CXObjCDeclQualifierKind.
 */
public static native @Cast("unsigned") int clang_Cursor_getObjCDeclQualifiers(@ByVal CXCursor C);

/**
 * \brief Given a cursor that represents an Objective-C method or property
 * declaration, return non-zero if the declaration was affected by "\optional".
 * Returns zero if the cursor is not such a declaration or it is "\required".
 */
public static native @Cast("unsigned") int clang_Cursor_isObjCOptional(@ByVal CXCursor C);

/**
 * \brief Returns non-zero if the given cursor is a variadic function or method.
 */
public static native @Cast("unsigned") int clang_Cursor_isVariadic(@ByVal CXCursor C);

/**
 * \brief Given a cursor that represents a declaration, return the associated
 * comment's source range.  The range may include multiple consecutive comments
 * with whitespace in between.
 */
public static native @ByVal CXSourceRange clang_Cursor_getCommentRange(@ByVal CXCursor C);

/**
 * \brief Given a cursor that represents a declaration, return the associated
 * comment text, including comment markers.
 */
public static native @ByVal CXString clang_Cursor_getRawCommentText(@ByVal CXCursor C);

/**
 * \brief Given a cursor that represents a documentable entity (e.g.,
 * declaration), return the associated \\brief paragraph; otherwise return the
 * first paragraph.
 */
public static native @ByVal CXString clang_Cursor_getBriefCommentText(@ByVal CXCursor C);

/**
 * \}
 */

/** \defgroup CINDEX_MANGLE Name Mangling API Functions
 *
 * \{
 */

/**
 * \brief Retrieve the CXString representing the mangled name of the cursor.
 */
public static native @ByVal CXString clang_Cursor_getMangling(@ByVal CXCursor arg0);

/**
 * \}
 */

/**
 * \defgroup CINDEX_MODULE Module introspection
 *
 * The functions in this group provide access to information about modules.
 *
 * \{
 */

@Namespace @Name("void") @Opaque public static class CXModule extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXModule() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXModule(Pointer p) { super(p); }
}

/**
 * \brief Given a CXCursor_ModuleImportDecl cursor, return the associated module.
 */
public static native CXModule clang_Cursor_getModule(@ByVal CXCursor C);

/**
 * \brief Given a CXFile header file, return the module that contains it, if one
 * exists.
 */
public static native CXModule clang_getModuleForFile(CXTranslationUnit arg0, CXFile arg1);

/**
 * @param Module a module object.
 *
 * @return the module file where the provided module object came from.
 */
public static native CXFile clang_Module_getASTFile(CXModule Module);

/**
 * @param Module a module object.
 *
 * @return the parent of a sub-module or NULL if the given module is top-level,
 * e.g. for 'std.vector' it will return the 'std' module.
 */
public static native CXModule clang_Module_getParent(CXModule Module);

/**
 * @param Module a module object.
 *
 * @return the name of the module, e.g. for the 'std.vector' sub-module it
 * will return "vector".
 */
public static native @ByVal CXString clang_Module_getName(CXModule Module);

/**
 * @param Module a module object.
 *
 * @return the full name of the module, e.g. "std.vector".
 */
public static native @ByVal CXString clang_Module_getFullName(CXModule Module);

/**
 * @param Module a module object.
 *
 * @return non-zero if the module is a system one.
 */
public static native int clang_Module_isSystem(CXModule Module);

/**
 * @param Module a module object.
 *
 * @return the number of top level headers associated with this module.
 */
public static native @Cast("unsigned") int clang_Module_getNumTopLevelHeaders(CXTranslationUnit arg0,
                                                           CXModule Module);

/**
 * @param Module a module object.
 *
 * @param Index top level header index (zero-based).
 *
 * @return the specified top level header associated with the module.
 */
public static native CXFile clang_Module_getTopLevelHeader(CXTranslationUnit arg0,
                                      CXModule Module, @Cast("unsigned") int Index);

/**
 * \}
 */

/**
 * \defgroup CINDEX_CPP C++ AST introspection
 *
 * The routines in this group provide access information in the ASTs specific
 * to C++ language features.
 *
 * \{
 */

/**
 * \brief Determine if a C++ member function or member function template is
 * pure virtual.
 */
public static native @Cast("unsigned") int clang_CXXMethod_isPureVirtual(@ByVal CXCursor C);

/**
 * \brief Determine if a C++ member function or member function template is 
 * declared 'static'.
 */
public static native @Cast("unsigned") int clang_CXXMethod_isStatic(@ByVal CXCursor C);

/**
 * \brief Determine if a C++ member function or member function template is
 * explicitly declared 'virtual' or if it overrides a virtual method from
 * one of the base classes.
 */
public static native @Cast("unsigned") int clang_CXXMethod_isVirtual(@ByVal CXCursor C);

/**
 * \brief Determine if a C++ member function or member function template is
 * declared 'const'.
 */
public static native @Cast("unsigned") int clang_CXXMethod_isConst(@ByVal CXCursor C);

/**
 * \brief Given a cursor that represents a template, determine
 * the cursor kind of the specializations would be generated by instantiating
 * the template.
 *
 * This routine can be used to determine what flavor of function template,
 * class template, or class template partial specialization is stored in the
 * cursor. For example, it can describe whether a class template cursor is
 * declared with "struct", "class" or "union".
 *
 * @param C The cursor to query. This cursor should represent a template
 * declaration.
 *
 * @return The cursor kind of the specializations that would be generated
 * by instantiating the template \p C. If \p C is not a template, returns
 * \c CXCursor_NoDeclFound.
 */
public static native @Cast("CXCursorKind") int clang_getTemplateCursorKind(@ByVal CXCursor C);
  
/**
 * \brief Given a cursor that may represent a specialization or instantiation
 * of a template, retrieve the cursor that represents the template that it
 * specializes or from which it was instantiated.
 *
 * This routine determines the template involved both for explicit 
 * specializations of templates and for implicit instantiations of the template,
 * both of which are referred to as "specializations". For a class template
 * specialization (e.g., \c std::vector<bool>), this routine will return 
 * either the primary template (\c std::vector) or, if the specialization was
 * instantiated from a class template partial specialization, the class template
 * partial specialization. For a class template partial specialization and a
 * function template specialization (including instantiations), this
 * this routine will return the specialized template.
 *
 * For members of a class template (e.g., member functions, member classes, or
 * static data members), returns the specialized or instantiated member. 
 * Although not strictly "templates" in the C++ language, members of class
 * templates have the same notions of specializations and instantiations that
 * templates do, so this routine treats them similarly.
 *
 * @param C A cursor that may be a specialization of a template or a member
 * of a template.
 *
 * @return If the given cursor is a specialization or instantiation of a 
 * template or a member thereof, the template or member that it specializes or
 * from which it was instantiated. Otherwise, returns a NULL cursor.
 */
public static native @ByVal CXCursor clang_getSpecializedCursorTemplate(@ByVal CXCursor C);

/**
 * \brief Given a cursor that references something else, return the source range
 * covering that reference.
 *
 * @param C A cursor pointing to a member reference, a declaration reference, or
 * an operator call.
 * @param NameFlags A bitset with three independent flags: 
 * CXNameRange_WantQualifier, CXNameRange_WantTemplateArgs, and
 * CXNameRange_WantSinglePiece.
 * @param PieceIndex For contiguous names or when passing the flag 
 * CXNameRange_WantSinglePiece, only one piece with index 0 is 
 * available. When the CXNameRange_WantSinglePiece flag is not passed for a
 * non-contiguous names, this index can be used to retrieve the individual
 * pieces of the name. See also CXNameRange_WantSinglePiece.
 *
 * @return The piece of the name pointed to by the given cursor. If there is no
 * name, or if the PieceIndex is out-of-range, a null-cursor will be returned.
 */
public static native @ByVal CXSourceRange clang_getCursorReferenceNameRange(@ByVal CXCursor C,
                                                @Cast("unsigned") int NameFlags, 
                                                @Cast("unsigned") int PieceIndex);

/** enum CXNameRefFlags */
public static final int
  /**
   * \brief Include the nested-name-specifier, e.g. Foo:: in x.Foo::y, in the
   * range.
   */
  CXNameRange_WantQualifier =  0x1,
  
  /**
   * \brief Include the explicit template arguments, e.g. \<int> in x.f<int>,
   * in the range.
   */
  CXNameRange_WantTemplateArgs =  0x2,

  /**
   * \brief If the name is non-contiguous, return the full spanning range.
   *
   * Non-contiguous names occur in Objective-C when a selector with two or more
   * parameters is used, or in C++ when using an operator:
   * <pre>{@code
   * [object doSomething:here withValue:there]; // Objective-C
   * return some_vector[1]; // C++
   * }</pre>
   */
  CXNameRange_WantSinglePiece =  0x4;
  
/**
 * \}
 */

/**
 * \defgroup CINDEX_LEX Token extraction and manipulation
 *
 * The routines in this group provide access to the tokens within a
 * translation unit, along with a semantic mapping of those tokens to
 * their corresponding cursors.
 *
 * \{
 */

/**
 * \brief Describes a kind of token.
 */
/** enum CXTokenKind */
public static final int
  /**
   * \brief A token that contains some kind of punctuation.
   */
  CXToken_Punctuation = 0,

  /**
   * \brief A language keyword.
   */
  CXToken_Keyword = 1,

  /**
   * \brief An identifier (that is not a keyword).
   */
  CXToken_Identifier = 2,

  /**
   * \brief A numeric, string, or character literal.
   */
  CXToken_Literal = 3,

  /**
   * \brief A comment.
   */
  CXToken_Comment = 4;

/**
 * \brief Describes a single preprocessing token.
 */
public static class CXToken extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXToken() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXToken(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXToken(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXToken position(int position) {
        return (CXToken)super.position(position);
    }

  public native @Cast("unsigned") int int_data(int i); public native CXToken int_data(int i, int int_data);
  @MemberGetter public native @Cast("unsigned*") IntPointer int_data();
  public native Pointer ptr_data(); public native CXToken ptr_data(Pointer ptr_data);
}

/**
 * \brief Determine the kind of the given token.
 */
public static native @Cast("CXTokenKind") int clang_getTokenKind(@ByVal CXToken arg0);

/**
 * \brief Determine the spelling of the given token.
 *
 * The spelling of a token is the textual representation of that token, e.g.,
 * the text of an identifier or keyword.
 */
public static native @ByVal CXString clang_getTokenSpelling(CXTranslationUnit arg0, @ByVal CXToken arg1);

/**
 * \brief Retrieve the source location of the given token.
 */
public static native @ByVal CXSourceLocation clang_getTokenLocation(CXTranslationUnit arg0,
                                                       @ByVal CXToken arg1);

/**
 * \brief Retrieve a source range that covers the given token.
 */
public static native @ByVal CXSourceRange clang_getTokenExtent(CXTranslationUnit arg0, @ByVal CXToken arg1);

/**
 * \brief Tokenize the source code described by the given range into raw
 * lexical tokens.
 *
 * @param TU the translation unit whose text is being tokenized.
 *
 * @param Range the source range in which text should be tokenized. All of the
 * tokens produced by tokenization will fall within this source range,
 *
 * @param Tokens this pointer will be set to point to the array of tokens
 * that occur within the given source range. The returned pointer must be
 * freed with clang_disposeTokens() before the translation unit is destroyed.
 *
 * @param NumTokens will be set to the number of tokens in the \c *Tokens
 * array.
 *
 */
public static native void clang_tokenize(CXTranslationUnit TU, @ByVal CXSourceRange Range,
                                   @Cast("CXToken**") PointerPointer Tokens, @Cast("unsigned*") IntPointer NumTokens);
public static native void clang_tokenize(CXTranslationUnit TU, @ByVal CXSourceRange Range,
                                   @ByPtrPtr CXToken Tokens, @Cast("unsigned*") IntPointer NumTokens);
public static native void clang_tokenize(CXTranslationUnit TU, @ByVal CXSourceRange Range,
                                   @ByPtrPtr CXToken Tokens, @Cast("unsigned*") IntBuffer NumTokens);
public static native void clang_tokenize(CXTranslationUnit TU, @ByVal CXSourceRange Range,
                                   @ByPtrPtr CXToken Tokens, @Cast("unsigned*") int[] NumTokens);

/**
 * \brief Annotate the given set of tokens by providing cursors for each token
 * that can be mapped to a specific entity within the abstract syntax tree.
 *
 * This token-annotation routine is equivalent to invoking
 * clang_getCursor() for the source locations of each of the
 * tokens. The cursors provided are filtered, so that only those
 * cursors that have a direct correspondence to the token are
 * accepted. For example, given a function call \c f(x),
 * clang_getCursor() would provide the following cursors:
 *
 *   * when the cursor is over the 'f', a DeclRefExpr cursor referring to 'f'.
 *   * when the cursor is over the '(' or the ')', a CallExpr referring to 'f'.
 *   * when the cursor is over the 'x', a DeclRefExpr cursor referring to 'x'.
 *
 * Only the first and last of these cursors will occur within the
 * annotate, since the tokens "f" and "x' directly refer to a function
 * and a variable, respectively, but the parentheses are just a small
 * part of the full syntax of the function call expression, which is
 * not provided as an annotation.
 *
 * @param TU the translation unit that owns the given tokens.
 *
 * @param Tokens the set of tokens to annotate.
 *
 * @param NumTokens the number of tokens in \p Tokens.
 *
 * @param Cursors an array of \p NumTokens cursors, whose contents will be
 * replaced with the cursors corresponding to each token.
 */
public static native void clang_annotateTokens(CXTranslationUnit TU,
                                         CXToken Tokens, @Cast("unsigned") int NumTokens,
                                         CXCursor Cursors);

/**
 * \brief Free the given set of tokens.
 */
public static native void clang_disposeTokens(CXTranslationUnit TU,
                                        CXToken Tokens, @Cast("unsigned") int NumTokens);

/**
 * \}
 */

/**
 * \defgroup CINDEX_DEBUG Debugging facilities
 *
 * These routines are used for testing and debugging, only, and should not
 * be relied upon.
 *
 * \{
 */

/* for debug/testing */
public static native @ByVal CXString clang_getCursorKindSpelling(@Cast("CXCursorKind") int Kind);
public static native void clang_getDefinitionSpellingAndExtent(@ByVal CXCursor arg0,
                                          @Cast("const char**") PointerPointer startBuf,
                                          @Cast("const char**") PointerPointer endBuf,
                                          @Cast("unsigned*") IntPointer startLine,
                                          @Cast("unsigned*") IntPointer startColumn,
                                          @Cast("unsigned*") IntPointer endLine,
                                          @Cast("unsigned*") IntPointer endColumn);
public static native void clang_getDefinitionSpellingAndExtent(@ByVal CXCursor arg0,
                                          @Cast("const char**") @ByPtrPtr BytePointer startBuf,
                                          @Cast("const char**") @ByPtrPtr BytePointer endBuf,
                                          @Cast("unsigned*") IntPointer startLine,
                                          @Cast("unsigned*") IntPointer startColumn,
                                          @Cast("unsigned*") IntPointer endLine,
                                          @Cast("unsigned*") IntPointer endColumn);
public static native void clang_getDefinitionSpellingAndExtent(@ByVal CXCursor arg0,
                                          @Cast("const char**") @ByPtrPtr ByteBuffer startBuf,
                                          @Cast("const char**") @ByPtrPtr ByteBuffer endBuf,
                                          @Cast("unsigned*") IntBuffer startLine,
                                          @Cast("unsigned*") IntBuffer startColumn,
                                          @Cast("unsigned*") IntBuffer endLine,
                                          @Cast("unsigned*") IntBuffer endColumn);
public static native void clang_getDefinitionSpellingAndExtent(@ByVal CXCursor arg0,
                                          @Cast("const char**") @ByPtrPtr byte[] startBuf,
                                          @Cast("const char**") @ByPtrPtr byte[] endBuf,
                                          @Cast("unsigned*") int[] startLine,
                                          @Cast("unsigned*") int[] startColumn,
                                          @Cast("unsigned*") int[] endLine,
                                          @Cast("unsigned*") int[] endColumn);
public static native void clang_enableStackTraces();
public static class Fn_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Fn_Pointer(Pointer p) { super(p); }
    protected Fn_Pointer() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0);
}
public static native void clang_executeOnThread(Fn_Pointer fn, Pointer user_data,
                                          @Cast("unsigned") int stack_size);

/**
 * \}
 */

/**
 * \defgroup CINDEX_CODE_COMPLET Code completion
 *
 * Code completion involves taking an (incomplete) source file, along with
 * knowledge of where the user is actively editing that file, and suggesting
 * syntactically- and semantically-valid constructs that the user might want to
 * use at that particular point in the source code. These data structures and
 * routines provide support for code completion.
 *
 * \{
 */

/**
 * \brief A semantic string that describes a code-completion result.
 *
 * A semantic string that describes the formatting of a code-completion
 * result as a single "template" of text that should be inserted into the
 * source buffer when a particular code-completion result is selected.
 * Each semantic string is made up of some number of "chunks", each of which
 * contains some text along with a description of what that text means, e.g.,
 * the name of the entity being referenced, whether the text chunk is part of
 * the template, or whether it is a "placeholder" that the user should replace
 * with actual code,of a specific kind. See \c CXCompletionChunkKind for a
 * description of the different kinds of chunks.
 */
@Namespace @Name("void") @Opaque public static class CXCompletionString extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXCompletionString() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXCompletionString(Pointer p) { super(p); }
}

/**
 * \brief A single result of code completion.
 */
public static class CXCompletionResult extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXCompletionResult() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXCompletionResult(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXCompletionResult(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXCompletionResult position(int position) {
        return (CXCompletionResult)super.position(position);
    }

  /**
   * \brief The kind of entity that this completion refers to.
   *
   * The cursor kind will be a macro, keyword, or a declaration (one of the
   * *Decl cursor kinds), describing the entity that the completion is
   * referring to.
   *
   * \todo In the future, we would like to provide a full cursor, to allow
   * the client to extract additional information from declaration.
   */
  public native @Cast("CXCursorKind") int CursorKind(); public native CXCompletionResult CursorKind(int CursorKind);

  /**
   * \brief The code-completion string that describes how to insert this
   * code-completion result into the editing buffer.
   */
  public native CXCompletionString CompletionString(); public native CXCompletionResult CompletionString(CXCompletionString CompletionString);
}

/**
 * \brief Describes a single piece of text within a code-completion string.
 *
 * Each "chunk" within a code-completion string (\c CXCompletionString) is
 * either a piece of text with a specific "kind" that describes how that text
 * should be interpreted by the client or is another completion string.
 */
/** enum CXCompletionChunkKind */
public static final int
  /**
   * \brief A code-completion string that describes "optional" text that
   * could be a part of the template (but is not required).
   *
   * The Optional chunk is the only kind of chunk that has a code-completion
   * string for its representation, which is accessible via
   * \c clang_getCompletionChunkCompletionString(). The code-completion string
   * describes an additional part of the template that is completely optional.
   * For example, optional chunks can be used to describe the placeholders for
   * arguments that match up with defaulted function parameters, e.g. given:
   *
   * <pre>{@code
   * void f(int x, float y = 3.14, double z = 2.71828);
   * }</pre>
   *
   * The code-completion string for this function would contain:
   *   - a TypedText chunk for "f".
   *   - a LeftParen chunk for "(".
   *   - a Placeholder chunk for "int x"
   *   - an Optional chunk containing the remaining defaulted arguments, e.g.,
   *       - a Comma chunk for ","
   *       - a Placeholder chunk for "float y"
   *       - an Optional chunk containing the last defaulted argument:
   *           - a Comma chunk for ","
   *           - a Placeholder chunk for "double z"
   *   - a RightParen chunk for ")"
   *
   * There are many ways to handle Optional chunks. Two simple approaches are:
   *   - Completely ignore optional chunks, in which case the template for the
   *     function "f" would only include the first parameter ("int x").
   *   - Fully expand all optional chunks, in which case the template for the
   *     function "f" would have all of the parameters.
   */
  CXCompletionChunk_Optional = 0,
  /**
   * \brief Text that a user would be expected to type to get this
   * code-completion result.
   *
   * There will be exactly one "typed text" chunk in a semantic string, which
   * will typically provide the spelling of a keyword or the name of a
   * declaration that could be used at the current code point. Clients are
   * expected to filter the code-completion results based on the text in this
   * chunk.
   */
  CXCompletionChunk_TypedText = 1,
  /**
   * \brief Text that should be inserted as part of a code-completion result.
   *
   * A "text" chunk represents text that is part of the template to be
   * inserted into user code should this particular code-completion result
   * be selected.
   */
  CXCompletionChunk_Text = 2,
  /**
   * \brief Placeholder text that should be replaced by the user.
   *
   * A "placeholder" chunk marks a place where the user should insert text
   * into the code-completion template. For example, placeholders might mark
   * the function parameters for a function declaration, to indicate that the
   * user should provide arguments for each of those parameters. The actual
   * text in a placeholder is a suggestion for the text to display before
   * the user replaces the placeholder with real code.
   */
  CXCompletionChunk_Placeholder = 3,
  /**
   * \brief Informative text that should be displayed but never inserted as
   * part of the template.
   *
   * An "informative" chunk contains annotations that can be displayed to
   * help the user decide whether a particular code-completion result is the
   * right option, but which is not part of the actual template to be inserted
   * by code completion.
   */
  CXCompletionChunk_Informative = 4,
  /**
   * \brief Text that describes the current parameter when code-completion is
   * referring to function call, message send, or template specialization.
   *
   * A "current parameter" chunk occurs when code-completion is providing
   * information about a parameter corresponding to the argument at the
   * code-completion point. For example, given a function
   *
   * <pre>{@code
   * int add(int x, int y);
   * }</pre>
   *
   * and the source code \c add(, where the code-completion point is after the
   * "(", the code-completion string will contain a "current parameter" chunk
   * for "int x", indicating that the current argument will initialize that
   * parameter. After typing further, to \c add(17, (where the code-completion
   * point is after the ","), the code-completion string will contain a
   * "current paremeter" chunk to "int y".
   */
  CXCompletionChunk_CurrentParameter = 5,
  /**
   * \brief A left parenthesis ('('), used to initiate a function call or
   * signal the beginning of a function parameter list.
   */
  CXCompletionChunk_LeftParen = 6,
  /**
   * \brief A right parenthesis (')'), used to finish a function call or
   * signal the end of a function parameter list.
   */
  CXCompletionChunk_RightParen = 7,
  /**
   * \brief A left bracket ('[').
   */
  CXCompletionChunk_LeftBracket = 8,
  /**
   * \brief A right bracket (']').
   */
  CXCompletionChunk_RightBracket = 9,
  /**
   * \brief A left brace ('{').
   */
  CXCompletionChunk_LeftBrace = 10,
  /**
   * \brief A right brace ('}').
   */
  CXCompletionChunk_RightBrace = 11,
  /**
   * \brief A left angle bracket ('<').
   */
  CXCompletionChunk_LeftAngle = 12,
  /**
   * \brief A right angle bracket ('>').
   */
  CXCompletionChunk_RightAngle = 13,
  /**
   * \brief A comma separator (',').
   */
  CXCompletionChunk_Comma = 14,
  /**
   * \brief Text that specifies the result type of a given result.
   *
   * This special kind of informative chunk is not meant to be inserted into
   * the text buffer. Rather, it is meant to illustrate the type that an
   * expression using the given completion string would have.
   */
  CXCompletionChunk_ResultType = 15,
  /**
   * \brief A colon (':').
   */
  CXCompletionChunk_Colon = 16,
  /**
   * \brief A semicolon (';').
   */
  CXCompletionChunk_SemiColon = 17,
  /**
   * \brief An '=' sign.
   */
  CXCompletionChunk_Equal = 18,
  /**
   * Horizontal space (' ').
   */
  CXCompletionChunk_HorizontalSpace = 19,
  /**
   * Vertical space ('\n'), after which it is generally a good idea to
   * perform indentation.
   */
  CXCompletionChunk_VerticalSpace = 20;

/**
 * \brief Determine the kind of a particular chunk within a completion string.
 *
 * @param completion_string the completion string to query.
 *
 * @param chunk_number the 0-based index of the chunk in the completion string.
 *
 * @return the kind of the chunk at the index \c chunk_number.
 */
public static native @Cast("CXCompletionChunkKind") int clang_getCompletionChunkKind(CXCompletionString completion_string,
                             @Cast("unsigned") int chunk_number);

/**
 * \brief Retrieve the text associated with a particular chunk within a
 * completion string.
 *
 * @param completion_string the completion string to query.
 *
 * @param chunk_number the 0-based index of the chunk in the completion string.
 *
 * @return the text associated with the chunk at index \c chunk_number.
 */
public static native @ByVal CXString clang_getCompletionChunkText(CXCompletionString completion_string,
                             @Cast("unsigned") int chunk_number);

/**
 * \brief Retrieve the completion string associated with a particular chunk
 * within a completion string.
 *
 * @param completion_string the completion string to query.
 *
 * @param chunk_number the 0-based index of the chunk in the completion string.
 *
 * @return the completion string associated with the chunk at index
 * \c chunk_number.
 */
public static native CXCompletionString clang_getCompletionChunkCompletionString(CXCompletionString completion_string,
                                         @Cast("unsigned") int chunk_number);

/**
 * \brief Retrieve the number of chunks in the given code-completion string.
 */
public static native @Cast("unsigned") int clang_getNumCompletionChunks(CXCompletionString completion_string);

/**
 * \brief Determine the priority of this code completion.
 *
 * The priority of a code completion indicates how likely it is that this 
 * particular completion is the completion that the user will select. The
 * priority is selected by various internal heuristics.
 *
 * @param completion_string The completion string to query.
 *
 * @return The priority of this completion string. Smaller values indicate
 * higher-priority (more likely) completions.
 */
public static native @Cast("unsigned") int clang_getCompletionPriority(CXCompletionString completion_string);
  
/**
 * \brief Determine the availability of the entity that this code-completion
 * string refers to.
 *
 * @param completion_string The completion string to query.
 *
 * @return The availability of the completion string.
 */
public static native @Cast("CXAvailabilityKind") int clang_getCompletionAvailability(CXCompletionString completion_string);

/**
 * \brief Retrieve the number of annotations associated with the given
 * completion string.
 *
 * @param completion_string the completion string to query.
 *
 * @return the number of annotations associated with the given completion
 * string.
 */
public static native @Cast("unsigned") int clang_getCompletionNumAnnotations(CXCompletionString completion_string);

/**
 * \brief Retrieve the annotation associated with the given completion string.
 *
 * @param completion_string the completion string to query.
 *
 * @param annotation_number the 0-based index of the annotation of the
 * completion string.
 *
 * @return annotation string associated with the completion at index
 * \c annotation_number, or a NULL string if that annotation is not available.
 */
public static native @ByVal CXString clang_getCompletionAnnotation(CXCompletionString completion_string,
                              @Cast("unsigned") int annotation_number);

/**
 * \brief Retrieve the parent context of the given completion string.
 *
 * The parent context of a completion string is the semantic parent of 
 * the declaration (if any) that the code completion represents. For example,
 * a code completion for an Objective-C method would have the method's class
 * or protocol as its context.
 *
 * @param completion_string The code completion string whose parent is
 * being queried.
 *
 * @param kind DEPRECATED: always set to CXCursor_NotImplemented if non-NULL.
 *
 * @return The name of the completion parent, e.g., "NSObject" if
 * the completion string represents a method in the NSObject class.
 */
public static native @ByVal CXString clang_getCompletionParent(CXCompletionString completion_string,
                          @Cast("CXCursorKind*") IntPointer kind);
public static native @ByVal CXString clang_getCompletionParent(CXCompletionString completion_string,
                          @Cast("CXCursorKind*") IntBuffer kind);
public static native @ByVal CXString clang_getCompletionParent(CXCompletionString completion_string,
                          @Cast("CXCursorKind*") int[] kind);

/**
 * \brief Retrieve the brief documentation comment attached to the declaration
 * that corresponds to the given completion string.
 */
public static native @ByVal CXString clang_getCompletionBriefComment(CXCompletionString completion_string);

/**
 * \brief Retrieve a completion string for an arbitrary declaration or macro
 * definition cursor.
 *
 * @param cursor The cursor to query.
 *
 * @return A non-context-sensitive completion string for declaration and macro
 * definition cursors, or NULL for other kinds of cursors.
 */
public static native CXCompletionString clang_getCursorCompletionString(@ByVal CXCursor cursor);
  
/**
 * \brief Contains the results of code-completion.
 *
 * This data structure contains the results of code completion, as
 * produced by \c clang_codeCompleteAt(). Its contents must be freed by
 * \c clang_disposeCodeCompleteResults.
 */
public static class CXCodeCompleteResults extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXCodeCompleteResults() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXCodeCompleteResults(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXCodeCompleteResults(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXCodeCompleteResults position(int position) {
        return (CXCodeCompleteResults)super.position(position);
    }

  /**
   * \brief The code-completion results.
   */
  public native CXCompletionResult Results(); public native CXCodeCompleteResults Results(CXCompletionResult Results);

  /**
   * \brief The number of code-completion results stored in the
   * \c Results array.
   */
  public native @Cast("unsigned") int NumResults(); public native CXCodeCompleteResults NumResults(int NumResults);
}

/**
 * \brief Flags that can be passed to \c clang_codeCompleteAt() to
 * modify its behavior.
 *
 * The enumerators in this enumeration can be bitwise-OR'd together to
 * provide multiple options to \c clang_codeCompleteAt().
 */
/** enum CXCodeComplete_Flags */
public static final int
  /**
   * \brief Whether to include macros within the set of code
   * completions returned.
   */
  CXCodeComplete_IncludeMacros =  0x01,

  /**
   * \brief Whether to include code patterns for language constructs
   * within the set of code completions, e.g., for loops.
   */
  CXCodeComplete_IncludeCodePatterns =  0x02,

  /**
   * \brief Whether to include brief documentation within the set of code
   * completions returned.
   */
  CXCodeComplete_IncludeBriefComments =  0x04;

/**
 * \brief Bits that represent the context under which completion is occurring.
 *
 * The enumerators in this enumeration may be bitwise-OR'd together if multiple
 * contexts are occurring simultaneously.
 */
/** enum CXCompletionContext */
public static final int
  /**
   * \brief The context for completions is unexposed, as only Clang results
   * should be included. (This is equivalent to having no context bits set.)
   */
  CXCompletionContext_Unexposed = 0,
  
  /**
   * \brief Completions for any possible type should be included in the results.
   */
  CXCompletionContext_AnyType =  1 << 0,
  
  /**
   * \brief Completions for any possible value (variables, function calls, etc.)
   * should be included in the results.
   */
  CXCompletionContext_AnyValue =  1 << 1,
  /**
   * \brief Completions for values that resolve to an Objective-C object should
   * be included in the results.
   */
  CXCompletionContext_ObjCObjectValue =  1 << 2,
  /**
   * \brief Completions for values that resolve to an Objective-C selector
   * should be included in the results.
   */
  CXCompletionContext_ObjCSelectorValue =  1 << 3,
  /**
   * \brief Completions for values that resolve to a C++ class type should be
   * included in the results.
   */
  CXCompletionContext_CXXClassTypeValue =  1 << 4,
  
  /**
   * \brief Completions for fields of the member being accessed using the dot
   * operator should be included in the results.
   */
  CXCompletionContext_DotMemberAccess =  1 << 5,
  /**
   * \brief Completions for fields of the member being accessed using the arrow
   * operator should be included in the results.
   */
  CXCompletionContext_ArrowMemberAccess =  1 << 6,
  /**
   * \brief Completions for properties of the Objective-C object being accessed
   * using the dot operator should be included in the results.
   */
  CXCompletionContext_ObjCPropertyAccess =  1 << 7,
  
  /**
   * \brief Completions for enum tags should be included in the results.
   */
  CXCompletionContext_EnumTag =  1 << 8,
  /**
   * \brief Completions for union tags should be included in the results.
   */
  CXCompletionContext_UnionTag =  1 << 9,
  /**
   * \brief Completions for struct tags should be included in the results.
   */
  CXCompletionContext_StructTag =  1 << 10,
  
  /**
   * \brief Completions for C++ class names should be included in the results.
   */
  CXCompletionContext_ClassTag =  1 << 11,
  /**
   * \brief Completions for C++ namespaces and namespace aliases should be
   * included in the results.
   */
  CXCompletionContext_Namespace =  1 << 12,
  /**
   * \brief Completions for C++ nested name specifiers should be included in
   * the results.
   */
  CXCompletionContext_NestedNameSpecifier =  1 << 13,
  
  /**
   * \brief Completions for Objective-C interfaces (classes) should be included
   * in the results.
   */
  CXCompletionContext_ObjCInterface =  1 << 14,
  /**
   * \brief Completions for Objective-C protocols should be included in
   * the results.
   */
  CXCompletionContext_ObjCProtocol =  1 << 15,
  /**
   * \brief Completions for Objective-C categories should be included in
   * the results.
   */
  CXCompletionContext_ObjCCategory =  1 << 16,
  /**
   * \brief Completions for Objective-C instance messages should be included
   * in the results.
   */
  CXCompletionContext_ObjCInstanceMessage =  1 << 17,
  /**
   * \brief Completions for Objective-C class messages should be included in
   * the results.
   */
  CXCompletionContext_ObjCClassMessage =  1 << 18,
  /**
   * \brief Completions for Objective-C selector names should be included in
   * the results.
   */
  CXCompletionContext_ObjCSelectorName =  1 << 19,
  
  /**
   * \brief Completions for preprocessor macro names should be included in
   * the results.
   */
  CXCompletionContext_MacroName =  1 << 20,
  
  /**
   * \brief Natural language completions should be included in the results.
   */
  CXCompletionContext_NaturalLanguage =  1 << 21,
  
  /**
   * \brief The current context is unknown, so set all contexts.
   */
  CXCompletionContext_Unknown =  ((1 << 22) - 1);
  
/**
 * \brief Returns a default set of code-completion options that can be
 * passed to\c clang_codeCompleteAt(). 
 */
public static native @Cast("unsigned") int clang_defaultCodeCompleteOptions();

/**
 * \brief Perform code completion at a given location in a translation unit.
 *
 * This function performs code completion at a particular file, line, and
 * column within source code, providing results that suggest potential
 * code snippets based on the context of the completion. The basic model
 * for code completion is that Clang will parse a complete source file,
 * performing syntax checking up to the location where code-completion has
 * been requested. At that point, a special code-completion token is passed
 * to the parser, which recognizes this token and determines, based on the
 * current location in the C/Objective-C/C++ grammar and the state of
 * semantic analysis, what completions to provide. These completions are
 * returned via a new \c CXCodeCompleteResults structure.
 *
 * Code completion itself is meant to be triggered by the client when the
 * user types punctuation characters or whitespace, at which point the
 * code-completion location will coincide with the cursor. For example, if \c p
 * is a pointer, code-completion might be triggered after the "-" and then
 * after the ">" in \c p->. When the code-completion location is afer the ">",
 * the completion results will provide, e.g., the members of the struct that
 * "p" points to. The client is responsible for placing the cursor at the
 * beginning of the token currently being typed, then filtering the results
 * based on the contents of the token. For example, when code-completing for
 * the expression \c p->get, the client should provide the location just after
 * the ">" (e.g., pointing at the "g") to this code-completion hook. Then, the
 * client can filter the results based on the current token text ("get"), only
 * showing those results that start with "get". The intent of this interface
 * is to separate the relatively high-latency acquisition of code-completion
 * results from the filtering of results on a per-character basis, which must
 * have a lower latency.
 *
 * @param TU The translation unit in which code-completion should
 * occur. The source files for this translation unit need not be
 * completely up-to-date (and the contents of those source files may
 * be overridden via \p unsaved_files). Cursors referring into the
 * translation unit may be invalidated by this invocation.
 *
 * @param complete_filename The name of the source file where code
 * completion should be performed. This filename may be any file
 * included in the translation unit.
 *
 * @param complete_line The line at which code-completion should occur.
 *
 * @param complete_column The column at which code-completion should occur.
 * Note that the column should point just after the syntactic construct that
 * initiated code completion, and not in the middle of a lexical token.
 *
 * @param unsaved_files the Tiles that have not yet been saved to disk
 * but may be required for parsing or code completion, including the
 * contents of those files.  The contents and name of these files (as
 * specified by CXUnsavedFile) are copied when necessary, so the
 * client only needs to guarantee their validity until the call to
 * this function returns.
 *
 * @param num_unsaved_files The number of unsaved file entries in \p
 * unsaved_files.
 *
 * @param options Extra options that control the behavior of code
 * completion, expressed as a bitwise OR of the enumerators of the
 * CXCodeComplete_Flags enumeration. The 
 * \c clang_defaultCodeCompleteOptions() function returns a default set
 * of code-completion options.
 *
 * @return If successful, a new \c CXCodeCompleteResults structure
 * containing code-completion results, which should eventually be
 * freed with \c clang_disposeCodeCompleteResults(). If code
 * completion fails, returns NULL.
 */
public static native CXCodeCompleteResults clang_codeCompleteAt(CXTranslationUnit TU,
                                            @Cast("const char*") BytePointer complete_filename,
                                            @Cast("unsigned") int complete_line,
                                            @Cast("unsigned") int complete_column,
                                            CXUnsavedFile unsaved_files,
                                            @Cast("unsigned") int num_unsaved_files,
                                            @Cast("unsigned") int options);
public static native CXCodeCompleteResults clang_codeCompleteAt(CXTranslationUnit TU,
                                            String complete_filename,
                                            @Cast("unsigned") int complete_line,
                                            @Cast("unsigned") int complete_column,
                                            CXUnsavedFile unsaved_files,
                                            @Cast("unsigned") int num_unsaved_files,
                                            @Cast("unsigned") int options);

/**
 * \brief Sort the code-completion results in case-insensitive alphabetical 
 * order.
 *
 * @param Results The set of results to sort.
 * @param NumResults The number of results in \p Results.
 */
public static native void clang_sortCodeCompletionResults(CXCompletionResult Results,
                                     @Cast("unsigned") int NumResults);
  
/**
 * \brief Free the given set of code-completion results.
 */
public static native void clang_disposeCodeCompleteResults(CXCodeCompleteResults Results);
  
/**
 * \brief Determine the number of diagnostics produced prior to the
 * location where code completion was performed.
 */
public static native @Cast("unsigned") int clang_codeCompleteGetNumDiagnostics(CXCodeCompleteResults Results);

/**
 * \brief Retrieve a diagnostic associated with the given code completion.
 *
 * @param Results the code completion results to query.
 * @param Index the zero-based diagnostic number to retrieve.
 *
 * @return the requested diagnostic. This diagnostic must be freed
 * via a call to \c clang_disposeDiagnostic().
 */
public static native CXDiagnostic clang_codeCompleteGetDiagnostic(CXCodeCompleteResults Results,
                                             @Cast("unsigned") int Index);

/**
 * \brief Determines what completions are appropriate for the context
 * the given code completion.
 * 
 * @param Results the code completion results to query
 *
 * @return the kinds of completions that are appropriate for use
 * along with the given code completion results.
 */
public static native @Cast("unsigned long long") long clang_codeCompleteGetContexts(
                                                CXCodeCompleteResults Results);

/**
 * \brief Returns the cursor kind for the container for the current code
 * completion context. The container is only guaranteed to be set for
 * contexts where a container exists (i.e. member accesses or Objective-C
 * message sends); if there is not a container, this function will return
 * CXCursor_InvalidCode.
 *
 * @param Results the code completion results to query
 *
 * @param IsIncomplete on return, this value will be false if Clang has complete
 * information about the container. If Clang does not have complete
 * information, this value will be true.
 *
 * @return the container kind, or CXCursor_InvalidCode if there is not a
 * container
 */
public static native @Cast("CXCursorKind") int clang_codeCompleteGetContainerKind(
                                                 CXCodeCompleteResults Results,
                                                     @Cast("unsigned*") IntPointer IsIncomplete);
public static native @Cast("CXCursorKind") int clang_codeCompleteGetContainerKind(
                                                 CXCodeCompleteResults Results,
                                                     @Cast("unsigned*") IntBuffer IsIncomplete);
public static native @Cast("CXCursorKind") int clang_codeCompleteGetContainerKind(
                                                 CXCodeCompleteResults Results,
                                                     @Cast("unsigned*") int[] IsIncomplete);

/**
 * \brief Returns the USR for the container for the current code completion
 * context. If there is not a container for the current context, this
 * function will return the empty string.
 *
 * @param Results the code completion results to query
 *
 * @return the USR for the container
 */
public static native @ByVal CXString clang_codeCompleteGetContainerUSR(CXCodeCompleteResults Results);
  
  
/**
 * \brief Returns the currently-entered selector for an Objective-C message
 * send, formatted like "initWithFoo:bar:". Only guaranteed to return a
 * non-empty string for CXCompletionContext_ObjCInstanceMessage and
 * CXCompletionContext_ObjCClassMessage.
 *
 * @param Results the code completion results to query
 *
 * @return the selector (or partial selector) that has been entered thus far
 * for an Objective-C message send.
 */
public static native @ByVal CXString clang_codeCompleteGetObjCSelector(CXCodeCompleteResults Results);
  
/**
 * \}
 */


/**
 * \defgroup CINDEX_MISC Miscellaneous utility functions
 *
 * \{
 */

/**
 * \brief Return a version string, suitable for showing to a user, but not
 *        intended to be parsed (the format is not guaranteed to be stable).
 */
public static native @ByVal CXString clang_getClangVersion();

  
/**
 * \brief Enable/disable crash recovery.
 *
 * @param isEnabled Flag to indicate if crash recovery is enabled.  A non-zero
 *        value enables crash recovery, while 0 disables it.
 */
public static native void clang_toggleCrashRecovery(@Cast("unsigned") int isEnabled);
  
 /**
  * \brief Visitor invoked for each file in a translation unit
  *        (used with clang_getInclusions()).
  *
  * This visitor function will be invoked by clang_getInclusions() for each
  * file included (either at the top-level or by \#include directives) within
  * a translation unit.  The first argument is the file being included, and
  * the second and third arguments provide the inclusion stack.  The
  * array is sorted in order of immediate inclusion.  For example,
  * the first element refers to the location that included 'included_file'.
  */
public static class CXInclusionVisitor extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CXInclusionVisitor(Pointer p) { super(p); }
    protected CXInclusionVisitor() { allocate(); }
    private native void allocate();
    public native void call(CXFile included_file,
                                   CXSourceLocation inclusion_stack,
                                   @Cast("unsigned") int include_len,
                                   CXClientData client_data);
}

/**
 * \brief Visit the set of preprocessor inclusions in a translation unit.
 *   The visitor function is called with the provided data for every included
 *   file.  This does not include headers included by the PCH file (unless one
 *   is inspecting the inclusions in the PCH file itself).
 */
public static native void clang_getInclusions(CXTranslationUnit tu,
                                        CXInclusionVisitor visitor,
                                        CXClientData client_data);

/**
 * \}
 */

/** \defgroup CINDEX_REMAPPING Remapping functions
 *
 * \{
 */

/**
 * \brief A remapping of original source files and their translated files.
 */
@Namespace @Name("void") @Opaque public static class CXRemapping extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXRemapping() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXRemapping(Pointer p) { super(p); }
}

/**
 * \brief Retrieve a remapping.
 *
 * @param path the path that contains metadata about remappings.
 *
 * @return the requested remapping. This remapping must be freed
 * via a call to \c clang_remap_dispose(). Can return NULL if an error occurred.
 */
public static native CXRemapping clang_getRemappings(@Cast("const char*") BytePointer path);
public static native CXRemapping clang_getRemappings(String path);

/**
 * \brief Retrieve a remapping.
 *
 * @param filePaths pointer to an array of file paths containing remapping info.
 *
 * @param numFiles number of file paths.
 *
 * @return the requested remapping. This remapping must be freed
 * via a call to \c clang_remap_dispose(). Can return NULL if an error occurred.
 */
public static native CXRemapping clang_getRemappingsFromFileList(@Cast("const char**") PointerPointer filePaths,
                                            @Cast("unsigned") int numFiles);
public static native CXRemapping clang_getRemappingsFromFileList(@Cast("const char**") @ByPtrPtr BytePointer filePaths,
                                            @Cast("unsigned") int numFiles);
public static native CXRemapping clang_getRemappingsFromFileList(@Cast("const char**") @ByPtrPtr ByteBuffer filePaths,
                                            @Cast("unsigned") int numFiles);
public static native CXRemapping clang_getRemappingsFromFileList(@Cast("const char**") @ByPtrPtr byte[] filePaths,
                                            @Cast("unsigned") int numFiles);

/**
 * \brief Determine the number of remappings.
 */
public static native @Cast("unsigned") int clang_remap_getNumFiles(CXRemapping arg0);

/**
 * \brief Get the original and the associated filename from the remapping.
 * 
 * @param original If non-NULL, will be set to the original filename.
 *
 * @param transformed If non-NULL, will be set to the filename that the original
 * is associated with.
 */
public static native void clang_remap_getFilenames(CXRemapping arg0, @Cast("unsigned") int index,
                                     CXString original, CXString transformed);

/**
 * \brief Dispose the remapping.
 */
public static native void clang_remap_dispose(CXRemapping arg0);

/**
 * \}
 */

/** \defgroup CINDEX_HIGH Higher level API functions
 *
 * \{
 */

/** enum CXVisitorResult */
public static final int
  CXVisit_Break = 0,
  CXVisit_Continue = 1;

public static class CXCursorAndRangeVisitor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXCursorAndRangeVisitor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXCursorAndRangeVisitor(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXCursorAndRangeVisitor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXCursorAndRangeVisitor position(int position) {
        return (CXCursorAndRangeVisitor)super.position(position);
    }

  public native Pointer context(); public native CXCursorAndRangeVisitor context(Pointer context);
  public static class Visit_Pointer_CXCursor_CXSourceRange extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Visit_Pointer_CXCursor_CXSourceRange(Pointer p) { super(p); }
      protected Visit_Pointer_CXCursor_CXSourceRange() { allocate(); }
      private native void allocate();
      public native @Cast("CXVisitorResult") int call(Pointer context, @ByVal CXCursor arg1, @ByVal CXSourceRange arg2);
  }
  public native Visit_Pointer_CXCursor_CXSourceRange visit(); public native CXCursorAndRangeVisitor visit(Visit_Pointer_CXCursor_CXSourceRange visit);
}

/** enum CXResult */
public static final int
  /**
   * \brief Function returned successfully.
   */
  CXResult_Success = 0,
  /**
   * \brief One of the parameters was invalid for the function.
   */
  CXResult_Invalid = 1,
  /**
   * \brief The function was terminated by a callback (e.g. it returned
   * CXVisit_Break)
   */
  CXResult_VisitBreak = 2;

/**
 * \brief Find references of a declaration in a specific file.
 * 
 * @param cursor pointing to a declaration or a reference of one.
 *
 * @param file to search for references.
 *
 * @param visitor callback that will receive pairs of CXCursor/CXSourceRange for
 * each reference found.
 * The CXSourceRange will point inside the file; if the reference is inside
 * a macro (and not a macro argument) the CXSourceRange will be invalid.
 *
 * @return one of the CXResult enumerators.
 */
public static native @Cast("CXResult") int clang_findReferencesInFile(@ByVal CXCursor cursor, CXFile file,
                                               @ByVal CXCursorAndRangeVisitor visitor);

/**
 * \brief Find #import/#include directives in a specific file.
 *
 * @param TU translation unit containing the file to query.
 *
 * @param file to search for #import/#include directives.
 *
 * @param visitor callback that will receive pairs of CXCursor/CXSourceRange for
 * each directive found.
 *
 * @return one of the CXResult enumerators.
 */
public static native @Cast("CXResult") int clang_findIncludesInFile(CXTranslationUnit TU,
                                                 CXFile file,
                                              @ByVal CXCursorAndRangeVisitor visitor);

// #ifdef __has_feature
// #  if __has_feature(blocks)

// #  endif
// #endif

/**
 * \brief The client's data object that is associated with a CXFile.
 */
@Namespace @Name("void") @Opaque public static class CXIdxClientFile extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXIdxClientFile() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxClientFile(Pointer p) { super(p); }
}

/**
 * \brief The client's data object that is associated with a semantic entity.
 */
@Namespace @Name("void") @Opaque public static class CXIdxClientEntity extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXIdxClientEntity() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxClientEntity(Pointer p) { super(p); }
}

/**
 * \brief The client's data object that is associated with a semantic container
 * of entities.
 */
@Namespace @Name("void") @Opaque public static class CXIdxClientContainer extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXIdxClientContainer() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxClientContainer(Pointer p) { super(p); }
}

/**
 * \brief The client's data object that is associated with an AST file (PCH
 * or module).
 */
@Namespace @Name("void") @Opaque public static class CXIdxClientASTFile extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXIdxClientASTFile() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxClientASTFile(Pointer p) { super(p); }
}

/**
 * \brief Source location passed to index callbacks.
 */
public static class CXIdxLoc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxLoc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxLoc(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxLoc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxLoc position(int position) {
        return (CXIdxLoc)super.position(position);
    }

  public native Pointer ptr_data(int i); public native CXIdxLoc ptr_data(int i, Pointer ptr_data);
  @MemberGetter public native @Cast("void**") PointerPointer ptr_data();
  public native @Cast("unsigned") int int_data(); public native CXIdxLoc int_data(int int_data);
}

/**
 * \brief Data for ppIncludedFile callback.
 */
public static class CXIdxIncludedFileInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxIncludedFileInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxIncludedFileInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxIncludedFileInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxIncludedFileInfo position(int position) {
        return (CXIdxIncludedFileInfo)super.position(position);
    }

  /**
   * \brief Location of '#' in the \#include/\#import directive.
   */
  public native @ByRef CXIdxLoc hashLoc(); public native CXIdxIncludedFileInfo hashLoc(CXIdxLoc hashLoc);
  /**
   * \brief Filename as written in the \#include/\#import directive.
   */
  @MemberGetter public native @Cast("const char*") BytePointer filename();
  /**
   * \brief The actual file that the \#include/\#import directive resolved to.
   */
  public native CXFile file(); public native CXIdxIncludedFileInfo file(CXFile file);
  public native int isImport(); public native CXIdxIncludedFileInfo isImport(int isImport);
  public native int isAngled(); public native CXIdxIncludedFileInfo isAngled(int isAngled);
  /**
   * \brief Non-zero if the directive was automatically turned into a module
   * import.
   */
  public native int isModuleImport(); public native CXIdxIncludedFileInfo isModuleImport(int isModuleImport);
}

/**
 * \brief Data for IndexerCallbacks#importedASTFile.
 */
public static class CXIdxImportedASTFileInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxImportedASTFileInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxImportedASTFileInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxImportedASTFileInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxImportedASTFileInfo position(int position) {
        return (CXIdxImportedASTFileInfo)super.position(position);
    }

  /**
   * \brief Top level AST file containing the imported PCH, module or submodule.
   */
  public native CXFile file(); public native CXIdxImportedASTFileInfo file(CXFile file);
  /**
   * \brief The imported module or NULL if the AST file is a PCH.
   */
  public native CXModule module(); public native CXIdxImportedASTFileInfo module(CXModule module);
  /**
   * \brief Location where the file is imported. Applicable only for modules.
   */
  public native @ByRef CXIdxLoc loc(); public native CXIdxImportedASTFileInfo loc(CXIdxLoc loc);
  /**
   * \brief Non-zero if an inclusion directive was automatically turned into
   * a module import. Applicable only for modules.
   */
  public native int isImplicit(); public native CXIdxImportedASTFileInfo isImplicit(int isImplicit);

}

/** enum CXIdxEntityKind */
public static final int
  CXIdxEntity_Unexposed     = 0,
  CXIdxEntity_Typedef       = 1,
  CXIdxEntity_Function      = 2,
  CXIdxEntity_Variable      = 3,
  CXIdxEntity_Field         = 4,
  CXIdxEntity_EnumConstant  = 5,

  CXIdxEntity_ObjCClass     = 6,
  CXIdxEntity_ObjCProtocol  = 7,
  CXIdxEntity_ObjCCategory  = 8,

  CXIdxEntity_ObjCInstanceMethod = 9,
  CXIdxEntity_ObjCClassMethod    = 10,
  CXIdxEntity_ObjCProperty  = 11,
  CXIdxEntity_ObjCIvar      = 12,

  CXIdxEntity_Enum          = 13,
  CXIdxEntity_Struct        = 14,
  CXIdxEntity_Union         = 15,

  CXIdxEntity_CXXClass              = 16,
  CXIdxEntity_CXXNamespace          = 17,
  CXIdxEntity_CXXNamespaceAlias     = 18,
  CXIdxEntity_CXXStaticVariable     = 19,
  CXIdxEntity_CXXStaticMethod       = 20,
  CXIdxEntity_CXXInstanceMethod     = 21,
  CXIdxEntity_CXXConstructor        = 22,
  CXIdxEntity_CXXDestructor         = 23,
  CXIdxEntity_CXXConversionFunction = 24,
  CXIdxEntity_CXXTypeAlias          = 25,
  CXIdxEntity_CXXInterface          = 26;

/** enum CXIdxEntityLanguage */
public static final int
  CXIdxEntityLang_None = 0,
  CXIdxEntityLang_C    = 1,
  CXIdxEntityLang_ObjC = 2,
  CXIdxEntityLang_CXX  = 3;

/**
 * \brief Extra C++ template information for an entity. This can apply to:
 * CXIdxEntity_Function
 * CXIdxEntity_CXXClass
 * CXIdxEntity_CXXStaticMethod
 * CXIdxEntity_CXXInstanceMethod
 * CXIdxEntity_CXXConstructor
 * CXIdxEntity_CXXConversionFunction
 * CXIdxEntity_CXXTypeAlias
 */
/** enum CXIdxEntityCXXTemplateKind */
public static final int
  CXIdxEntity_NonTemplate   = 0,
  CXIdxEntity_Template      = 1,
  CXIdxEntity_TemplatePartialSpecialization = 2,
  CXIdxEntity_TemplateSpecialization = 3;

/** enum CXIdxAttrKind */
public static final int
  CXIdxAttr_Unexposed     = 0,
  CXIdxAttr_IBAction      = 1,
  CXIdxAttr_IBOutlet      = 2,
  CXIdxAttr_IBOutletCollection = 3;

public static class CXIdxAttrInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxAttrInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxAttrInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxAttrInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxAttrInfo position(int position) {
        return (CXIdxAttrInfo)super.position(position);
    }

  public native @Cast("CXIdxAttrKind") int kind(); public native CXIdxAttrInfo kind(int kind);
  public native @ByRef CXCursor cursor(); public native CXIdxAttrInfo cursor(CXCursor cursor);
  public native @ByRef CXIdxLoc loc(); public native CXIdxAttrInfo loc(CXIdxLoc loc);
}

public static class CXIdxEntityInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxEntityInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxEntityInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxEntityInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxEntityInfo position(int position) {
        return (CXIdxEntityInfo)super.position(position);
    }

  public native @Cast("CXIdxEntityKind") int kind(); public native CXIdxEntityInfo kind(int kind);
  public native @Cast("CXIdxEntityCXXTemplateKind") int templateKind(); public native CXIdxEntityInfo templateKind(int templateKind);
  public native @Cast("CXIdxEntityLanguage") int lang(); public native CXIdxEntityInfo lang(int lang);
  @MemberGetter public native @Cast("const char*") BytePointer name();
  @MemberGetter public native @Cast("const char*") BytePointer USR();
  public native @ByRef CXCursor cursor(); public native CXIdxEntityInfo cursor(CXCursor cursor);
  @MemberGetter public native @Const CXIdxAttrInfo attributes(int i);
  @MemberGetter public native @Cast("const CXIdxAttrInfo*const*") PointerPointer attributes();
  public native @Cast("unsigned") int numAttributes(); public native CXIdxEntityInfo numAttributes(int numAttributes);
}

public static class CXIdxContainerInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxContainerInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxContainerInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxContainerInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxContainerInfo position(int position) {
        return (CXIdxContainerInfo)super.position(position);
    }

  public native @ByRef CXCursor cursor(); public native CXIdxContainerInfo cursor(CXCursor cursor);
}

public static class CXIdxIBOutletCollectionAttrInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxIBOutletCollectionAttrInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxIBOutletCollectionAttrInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxIBOutletCollectionAttrInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxIBOutletCollectionAttrInfo position(int position) {
        return (CXIdxIBOutletCollectionAttrInfo)super.position(position);
    }

  @MemberGetter public native @Const CXIdxAttrInfo attrInfo();
  @MemberGetter public native @Const CXIdxEntityInfo objcClass();
  public native @ByRef CXCursor classCursor(); public native CXIdxIBOutletCollectionAttrInfo classCursor(CXCursor classCursor);
  public native @ByRef CXIdxLoc classLoc(); public native CXIdxIBOutletCollectionAttrInfo classLoc(CXIdxLoc classLoc);
}

/** enum CXIdxDeclInfoFlags */
public static final int
  CXIdxDeclFlag_Skipped =  0x1;

public static class CXIdxDeclInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxDeclInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxDeclInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxDeclInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxDeclInfo position(int position) {
        return (CXIdxDeclInfo)super.position(position);
    }

  @MemberGetter public native @Const CXIdxEntityInfo entityInfo();
  public native @ByRef CXCursor cursor(); public native CXIdxDeclInfo cursor(CXCursor cursor);
  public native @ByRef CXIdxLoc loc(); public native CXIdxDeclInfo loc(CXIdxLoc loc);
  @MemberGetter public native @Const CXIdxContainerInfo semanticContainer();
  /**
   * \brief Generally same as #semanticContainer but can be different in
   * cases like out-of-line C++ member functions.
   */
  @MemberGetter public native @Const CXIdxContainerInfo lexicalContainer();
  public native int isRedeclaration(); public native CXIdxDeclInfo isRedeclaration(int isRedeclaration);
  public native int isDefinition(); public native CXIdxDeclInfo isDefinition(int isDefinition);
  public native int isContainer(); public native CXIdxDeclInfo isContainer(int isContainer);
  @MemberGetter public native @Const CXIdxContainerInfo declAsContainer();
  /**
   * \brief Whether the declaration exists in code or was created implicitly
   * by the compiler, e.g. implicit Objective-C methods for properties.
   */
  public native int isImplicit(); public native CXIdxDeclInfo isImplicit(int isImplicit);
  @MemberGetter public native @Const CXIdxAttrInfo attributes(int i);
  @MemberGetter public native @Cast("const CXIdxAttrInfo*const*") PointerPointer attributes();
  public native @Cast("unsigned") int numAttributes(); public native CXIdxDeclInfo numAttributes(int numAttributes);

  public native @Cast("unsigned") int flags(); public native CXIdxDeclInfo flags(int flags);

}

/** enum CXIdxObjCContainerKind */
public static final int
  CXIdxObjCContainer_ForwardRef = 0,
  CXIdxObjCContainer_Interface = 1,
  CXIdxObjCContainer_Implementation = 2;

public static class CXIdxObjCContainerDeclInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxObjCContainerDeclInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxObjCContainerDeclInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxObjCContainerDeclInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxObjCContainerDeclInfo position(int position) {
        return (CXIdxObjCContainerDeclInfo)super.position(position);
    }

  @MemberGetter public native @Const CXIdxDeclInfo declInfo();
  public native @Cast("CXIdxObjCContainerKind") int kind(); public native CXIdxObjCContainerDeclInfo kind(int kind);
}

public static class CXIdxBaseClassInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxBaseClassInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxBaseClassInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxBaseClassInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxBaseClassInfo position(int position) {
        return (CXIdxBaseClassInfo)super.position(position);
    }

  @MemberGetter public native @Const CXIdxEntityInfo base();
  public native @ByRef CXCursor cursor(); public native CXIdxBaseClassInfo cursor(CXCursor cursor);
  public native @ByRef CXIdxLoc loc(); public native CXIdxBaseClassInfo loc(CXIdxLoc loc);
}

public static class CXIdxObjCProtocolRefInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxObjCProtocolRefInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxObjCProtocolRefInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxObjCProtocolRefInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxObjCProtocolRefInfo position(int position) {
        return (CXIdxObjCProtocolRefInfo)super.position(position);
    }

  @MemberGetter public native @Const CXIdxEntityInfo protocol();
  public native @ByRef CXCursor cursor(); public native CXIdxObjCProtocolRefInfo cursor(CXCursor cursor);
  public native @ByRef CXIdxLoc loc(); public native CXIdxObjCProtocolRefInfo loc(CXIdxLoc loc);
}

public static class CXIdxObjCProtocolRefListInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxObjCProtocolRefListInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxObjCProtocolRefListInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxObjCProtocolRefListInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxObjCProtocolRefListInfo position(int position) {
        return (CXIdxObjCProtocolRefListInfo)super.position(position);
    }

  @MemberGetter public native @Const CXIdxObjCProtocolRefInfo protocols(int i);
  @MemberGetter public native @Cast("const CXIdxObjCProtocolRefInfo*const*") PointerPointer protocols();
  public native @Cast("unsigned") int numProtocols(); public native CXIdxObjCProtocolRefListInfo numProtocols(int numProtocols);
}

public static class CXIdxObjCInterfaceDeclInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxObjCInterfaceDeclInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxObjCInterfaceDeclInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxObjCInterfaceDeclInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxObjCInterfaceDeclInfo position(int position) {
        return (CXIdxObjCInterfaceDeclInfo)super.position(position);
    }

  @MemberGetter public native @Const CXIdxObjCContainerDeclInfo containerInfo();
  @MemberGetter public native @Const CXIdxBaseClassInfo superInfo();
  @MemberGetter public native @Const CXIdxObjCProtocolRefListInfo protocols();
}

public static class CXIdxObjCCategoryDeclInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxObjCCategoryDeclInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxObjCCategoryDeclInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxObjCCategoryDeclInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxObjCCategoryDeclInfo position(int position) {
        return (CXIdxObjCCategoryDeclInfo)super.position(position);
    }

  @MemberGetter public native @Const CXIdxObjCContainerDeclInfo containerInfo();
  @MemberGetter public native @Const CXIdxEntityInfo objcClass();
  public native @ByRef CXCursor classCursor(); public native CXIdxObjCCategoryDeclInfo classCursor(CXCursor classCursor);
  public native @ByRef CXIdxLoc classLoc(); public native CXIdxObjCCategoryDeclInfo classLoc(CXIdxLoc classLoc);
  @MemberGetter public native @Const CXIdxObjCProtocolRefListInfo protocols();
}

public static class CXIdxObjCPropertyDeclInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxObjCPropertyDeclInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxObjCPropertyDeclInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxObjCPropertyDeclInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxObjCPropertyDeclInfo position(int position) {
        return (CXIdxObjCPropertyDeclInfo)super.position(position);
    }

  @MemberGetter public native @Const CXIdxDeclInfo declInfo();
  @MemberGetter public native @Const CXIdxEntityInfo getter();
  @MemberGetter public native @Const CXIdxEntityInfo setter();
}

public static class CXIdxCXXClassDeclInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxCXXClassDeclInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxCXXClassDeclInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxCXXClassDeclInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxCXXClassDeclInfo position(int position) {
        return (CXIdxCXXClassDeclInfo)super.position(position);
    }

  @MemberGetter public native @Const CXIdxDeclInfo declInfo();
  @MemberGetter public native @Const CXIdxBaseClassInfo bases(int i);
  @MemberGetter public native @Cast("const CXIdxBaseClassInfo*const*") PointerPointer bases();
  public native @Cast("unsigned") int numBases(); public native CXIdxCXXClassDeclInfo numBases(int numBases);
}

/**
 * \brief Data for IndexerCallbacks#indexEntityReference.
 */
/** enum CXIdxEntityRefKind */
public static final int
  /**
   * \brief The entity is referenced directly in user's code.
   */
  CXIdxEntityRef_Direct = 1,
  /**
   * \brief An implicit reference, e.g. a reference of an Objective-C method
   * via the dot syntax.
   */
  CXIdxEntityRef_Implicit = 2;

/**
 * \brief Data for IndexerCallbacks#indexEntityReference.
 */
public static class CXIdxEntityRefInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxEntityRefInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXIdxEntityRefInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxEntityRefInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXIdxEntityRefInfo position(int position) {
        return (CXIdxEntityRefInfo)super.position(position);
    }

  public native @Cast("CXIdxEntityRefKind") int kind(); public native CXIdxEntityRefInfo kind(int kind);
  /**
   * \brief Reference cursor.
   */
  public native @ByRef CXCursor cursor(); public native CXIdxEntityRefInfo cursor(CXCursor cursor);
  public native @ByRef CXIdxLoc loc(); public native CXIdxEntityRefInfo loc(CXIdxLoc loc);
  /**
   * \brief The entity that gets referenced.
   */
  @MemberGetter public native @Const CXIdxEntityInfo referencedEntity();
  /**
   * \brief Immediate "parent" of the reference. For example:
   * 
   * <pre>{@code
   * Foo *var;
   * }</pre>
   * 
   * The parent of reference of type 'Foo' is the variable 'var'.
   * For references inside statement bodies of functions/methods,
   * the parentEntity will be the function/method.
   */
  @MemberGetter public native @Const CXIdxEntityInfo parentEntity();
  /**
   * \brief Lexical container context of the reference.
   */
  @MemberGetter public native @Const CXIdxContainerInfo container();
}

/**
 * \brief A group of callbacks used by #clang_indexSourceFile and
 * #clang_indexTranslationUnit.
 */
public static class IndexerCallbacks extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IndexerCallbacks() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public IndexerCallbacks(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IndexerCallbacks(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public IndexerCallbacks position(int position) {
        return (IndexerCallbacks)super.position(position);
    }

  /**
   * \brief Called periodically to check whether indexing should be aborted.
   * Should return 0 to continue, and non-zero to abort.
   */
  public static class AbortQuery_CXClientData_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    AbortQuery_CXClientData_Pointer(Pointer p) { super(p); }
      protected AbortQuery_CXClientData_Pointer() { allocate(); }
      private native void allocate();
      public native int call(CXClientData client_data, Pointer reserved);
  }
  public native AbortQuery_CXClientData_Pointer abortQuery(); public native IndexerCallbacks abortQuery(AbortQuery_CXClientData_Pointer abortQuery);

  /**
   * \brief Called at the end of indexing; passes the complete diagnostic set.
   */
  public static class Diagnostic_CXClientData_CXDiagnosticSet_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Diagnostic_CXClientData_CXDiagnosticSet_Pointer(Pointer p) { super(p); }
      protected Diagnostic_CXClientData_CXDiagnosticSet_Pointer() { allocate(); }
      private native void allocate();
      public native void call(CXClientData client_data,
                       CXDiagnosticSet arg1, Pointer reserved);
  }
  public native Diagnostic_CXClientData_CXDiagnosticSet_Pointer diagnostic(); public native IndexerCallbacks diagnostic(Diagnostic_CXClientData_CXDiagnosticSet_Pointer diagnostic);

  public static class EnteredMainFile_CXClientData_CXFile_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    EnteredMainFile_CXClientData_CXFile_Pointer(Pointer p) { super(p); }
      protected EnteredMainFile_CXClientData_CXFile_Pointer() { allocate(); }
      private native void allocate();
      public native CXIdxClientFile call(CXClientData client_data,
                                       CXFile mainFile, Pointer reserved);
  }
  public native EnteredMainFile_CXClientData_CXFile_Pointer enteredMainFile(); public native IndexerCallbacks enteredMainFile(EnteredMainFile_CXClientData_CXFile_Pointer enteredMainFile);
  
  /**
   * \brief Called when a file gets \#included/\#imported.
   */
  public static class PpIncludedFile_CXClientData_CXIdxIncludedFileInfo extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    PpIncludedFile_CXClientData_CXIdxIncludedFileInfo(Pointer p) { super(p); }
      protected PpIncludedFile_CXClientData_CXIdxIncludedFileInfo() { allocate(); }
      private native void allocate();
      public native CXIdxClientFile call(CXClientData client_data,
                                      @Const CXIdxIncludedFileInfo arg1);
  }
  public native PpIncludedFile_CXClientData_CXIdxIncludedFileInfo ppIncludedFile(); public native IndexerCallbacks ppIncludedFile(PpIncludedFile_CXClientData_CXIdxIncludedFileInfo ppIncludedFile);
  
  /**
   * \brief Called when a AST file (PCH or module) gets imported.
   * 
   * AST files will not get indexed (there will not be callbacks to index all
   * the entities in an AST file). The recommended action is that, if the AST
   * file is not already indexed, to initiate a new indexing job specific to
   * the AST file.
   */
  public static class ImportedASTFile_CXClientData_CXIdxImportedASTFileInfo extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    ImportedASTFile_CXClientData_CXIdxImportedASTFileInfo(Pointer p) { super(p); }
      protected ImportedASTFile_CXClientData_CXIdxImportedASTFileInfo() { allocate(); }
      private native void allocate();
      public native CXIdxClientASTFile call(CXClientData client_data,
                                          @Const CXIdxImportedASTFileInfo arg1);
  }
  public native ImportedASTFile_CXClientData_CXIdxImportedASTFileInfo importedASTFile(); public native IndexerCallbacks importedASTFile(ImportedASTFile_CXClientData_CXIdxImportedASTFileInfo importedASTFile);

  /**
   * \brief Called at the beginning of indexing a translation unit.
   */
  public static class StartedTranslationUnit_CXClientData_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    StartedTranslationUnit_CXClientData_Pointer(Pointer p) { super(p); }
      protected StartedTranslationUnit_CXClientData_Pointer() { allocate(); }
      private native void allocate();
      public native CXIdxClientContainer call(CXClientData client_data,
                                                   Pointer reserved);
  }
  public native StartedTranslationUnit_CXClientData_Pointer startedTranslationUnit(); public native IndexerCallbacks startedTranslationUnit(StartedTranslationUnit_CXClientData_Pointer startedTranslationUnit);

  public static class IndexDeclaration_CXClientData_CXIdxDeclInfo extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    IndexDeclaration_CXClientData_CXIdxDeclInfo(Pointer p) { super(p); }
      protected IndexDeclaration_CXClientData_CXIdxDeclInfo() { allocate(); }
      private native void allocate();
      public native void call(CXClientData client_data,
                             @Const CXIdxDeclInfo arg1);
  }
  public native IndexDeclaration_CXClientData_CXIdxDeclInfo indexDeclaration(); public native IndexerCallbacks indexDeclaration(IndexDeclaration_CXClientData_CXIdxDeclInfo indexDeclaration);

  /**
   * \brief Called to index a reference of an entity.
   */
  public static class IndexEntityReference_CXClientData_CXIdxEntityRefInfo extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    IndexEntityReference_CXClientData_CXIdxEntityRefInfo(Pointer p) { super(p); }
      protected IndexEntityReference_CXClientData_CXIdxEntityRefInfo() { allocate(); }
      private native void allocate();
      public native void call(CXClientData client_data,
                                 @Const CXIdxEntityRefInfo arg1);
  }
  public native IndexEntityReference_CXClientData_CXIdxEntityRefInfo indexEntityReference(); public native IndexerCallbacks indexEntityReference(IndexEntityReference_CXClientData_CXIdxEntityRefInfo indexEntityReference);

}

public static native int clang_index_isEntityObjCContainerKind(@Cast("CXIdxEntityKind") int arg0);
public static native @Const CXIdxObjCContainerDeclInfo clang_index_getObjCContainerDeclInfo(@Const CXIdxDeclInfo arg0);

public static native @Const CXIdxObjCInterfaceDeclInfo clang_index_getObjCInterfaceDeclInfo(@Const CXIdxDeclInfo arg0);

public static native @Const CXIdxObjCCategoryDeclInfo clang_index_getObjCCategoryDeclInfo(@Const CXIdxDeclInfo arg0);

public static native @Const CXIdxObjCProtocolRefListInfo clang_index_getObjCProtocolRefListInfo(@Const CXIdxDeclInfo arg0);

public static native @Const CXIdxObjCPropertyDeclInfo clang_index_getObjCPropertyDeclInfo(@Const CXIdxDeclInfo arg0);

public static native @Const CXIdxIBOutletCollectionAttrInfo clang_index_getIBOutletCollectionAttrInfo(@Const CXIdxAttrInfo arg0);

public static native @Const CXIdxCXXClassDeclInfo clang_index_getCXXClassDeclInfo(@Const CXIdxDeclInfo arg0);

/**
 * \brief For retrieving a custom CXIdxClientContainer attached to a
 * container.
 */
public static native CXIdxClientContainer clang_index_getClientContainer(@Const CXIdxContainerInfo arg0);

/**
 * \brief For setting a custom CXIdxClientContainer attached to a
 * container.
 */
public static native void clang_index_setClientContainer(@Const CXIdxContainerInfo arg0,CXIdxClientContainer arg1);

/**
 * \brief For retrieving a custom CXIdxClientEntity attached to an entity.
 */
public static native CXIdxClientEntity clang_index_getClientEntity(@Const CXIdxEntityInfo arg0);

/**
 * \brief For setting a custom CXIdxClientEntity attached to an entity.
 */
public static native void clang_index_setClientEntity(@Const CXIdxEntityInfo arg0, CXIdxClientEntity arg1);

/**
 * \brief An indexing action/session, to be applied to one or multiple
 * translation units.
 */
@Namespace @Name("void") @Opaque public static class CXIndexAction extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXIndexAction() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIndexAction(Pointer p) { super(p); }
}

/**
 * \brief An indexing action/session, to be applied to one or multiple
 * translation units.
 *
 * @param CIdx The index object with which the index action will be associated.
 */
public static native CXIndexAction clang_IndexAction_create(CXIndex CIdx);

/**
 * \brief Destroy the given index action.
 *
 * The index action must not be destroyed until all of the translation units
 * created within that index action have been destroyed.
 */
public static native void clang_IndexAction_dispose(CXIndexAction arg0);

/** enum CXIndexOptFlags */
public static final int
  /**
   * \brief Used to indicate that no special indexing options are needed.
   */
  CXIndexOpt_None =  0x0,
  
  /**
   * \brief Used to indicate that IndexerCallbacks#indexEntityReference should
   * be invoked for only one reference of an entity per source file that does
   * not also include a declaration/definition of the entity.
   */
  CXIndexOpt_SuppressRedundantRefs =  0x1,

  /**
   * \brief Function-local symbols should be indexed. If this is not set
   * function-local symbols will be ignored.
   */
  CXIndexOpt_IndexFunctionLocalSymbols =  0x2,

  /**
   * \brief Implicit function/class template instantiations should be indexed.
   * If this is not set, implicit instantiations will be ignored.
   */
  CXIndexOpt_IndexImplicitTemplateInstantiations =  0x4,

  /**
   * \brief Suppress all compiler warnings when parsing for indexing.
   */
  CXIndexOpt_SuppressWarnings =  0x8,

  /**
   * \brief Skip a function/method body that was already parsed during an
   * indexing session associated with a \c CXIndexAction object.
   * Bodies in system headers are always skipped.
   */
  CXIndexOpt_SkipParsedBodiesInSession =  0x10;

/**
 * \brief Index the given source file and the translation unit corresponding
 * to that file via callbacks implemented through #IndexerCallbacks.
 *
 * @param client_data pointer data supplied by the client, which will
 * be passed to the invoked callbacks.
 *
 * @param index_callbacks Pointer to indexing callbacks that the client
 * implements.
 *
 * @param index_callbacks_size Size of #IndexerCallbacks structure that gets
 * passed in index_callbacks.
 *
 * @param index_options A bitmask of options that affects how indexing is
 * performed. This should be a bitwise OR of the CXIndexOpt_XXX flags.
 *
 * @param [out] out_TU pointer to store a \c CXTranslationUnit that can be
 * reused after indexing is finished. Set to \c NULL if you do not require it.
 *
 * @return 0 on success or if there were errors from which the compiler could
 * recover.  If there is a failure from which there is no recovery, returns
 * a non-zero \c CXErrorCode.
 *
 * The rest of the parameters are the same as #clang_parseTranslationUnit.
 */
public static native int clang_indexSourceFile(CXIndexAction arg0,
                                         CXClientData client_data,
                                         IndexerCallbacks index_callbacks,
                                         @Cast("unsigned") int index_callbacks_size,
                                         @Cast("unsigned") int index_options,
                                         @Cast("const char*") BytePointer source_filename,
                                         @Cast("const char*const*") PointerPointer command_line_args,
                                         int num_command_line_args,
                                         CXUnsavedFile unsaved_files,
                                         @Cast("unsigned") int num_unsaved_files,
                                         @ByPtrPtr CXTranslationUnit out_TU,
                                         @Cast("unsigned") int TU_options);
public static native int clang_indexSourceFile(CXIndexAction arg0,
                                         CXClientData client_data,
                                         IndexerCallbacks index_callbacks,
                                         @Cast("unsigned") int index_callbacks_size,
                                         @Cast("unsigned") int index_options,
                                         @Cast("const char*") BytePointer source_filename,
                                         @Cast("const char*const*") @ByPtrPtr BytePointer command_line_args,
                                         int num_command_line_args,
                                         CXUnsavedFile unsaved_files,
                                         @Cast("unsigned") int num_unsaved_files,
                                         @ByPtrPtr CXTranslationUnit out_TU,
                                         @Cast("unsigned") int TU_options);
public static native int clang_indexSourceFile(CXIndexAction arg0,
                                         CXClientData client_data,
                                         IndexerCallbacks index_callbacks,
                                         @Cast("unsigned") int index_callbacks_size,
                                         @Cast("unsigned") int index_options,
                                         String source_filename,
                                         @Cast("const char*const*") @ByPtrPtr ByteBuffer command_line_args,
                                         int num_command_line_args,
                                         CXUnsavedFile unsaved_files,
                                         @Cast("unsigned") int num_unsaved_files,
                                         @Cast("CXTranslationUnit*") PointerPointer out_TU,
                                         @Cast("unsigned") int TU_options);
public static native int clang_indexSourceFile(CXIndexAction arg0,
                                         CXClientData client_data,
                                         IndexerCallbacks index_callbacks,
                                         @Cast("unsigned") int index_callbacks_size,
                                         @Cast("unsigned") int index_options,
                                         @Cast("const char*") BytePointer source_filename,
                                         @Cast("const char*const*") @ByPtrPtr byte[] command_line_args,
                                         int num_command_line_args,
                                         CXUnsavedFile unsaved_files,
                                         @Cast("unsigned") int num_unsaved_files,
                                         @ByPtrPtr CXTranslationUnit out_TU,
                                         @Cast("unsigned") int TU_options);
public static native int clang_indexSourceFile(CXIndexAction arg0,
                                         CXClientData client_data,
                                         IndexerCallbacks index_callbacks,
                                         @Cast("unsigned") int index_callbacks_size,
                                         @Cast("unsigned") int index_options,
                                         String source_filename,
                                         @Cast("const char*const*") @ByPtrPtr BytePointer command_line_args,
                                         int num_command_line_args,
                                         CXUnsavedFile unsaved_files,
                                         @Cast("unsigned") int num_unsaved_files,
                                         @Cast("CXTranslationUnit*") PointerPointer out_TU,
                                         @Cast("unsigned") int TU_options);
public static native int clang_indexSourceFile(CXIndexAction arg0,
                                         CXClientData client_data,
                                         IndexerCallbacks index_callbacks,
                                         @Cast("unsigned") int index_callbacks_size,
                                         @Cast("unsigned") int index_options,
                                         @Cast("const char*") BytePointer source_filename,
                                         @Cast("const char*const*") @ByPtrPtr ByteBuffer command_line_args,
                                         int num_command_line_args,
                                         CXUnsavedFile unsaved_files,
                                         @Cast("unsigned") int num_unsaved_files,
                                         @ByPtrPtr CXTranslationUnit out_TU,
                                         @Cast("unsigned") int TU_options);
public static native int clang_indexSourceFile(CXIndexAction arg0,
                                         CXClientData client_data,
                                         IndexerCallbacks index_callbacks,
                                         @Cast("unsigned") int index_callbacks_size,
                                         @Cast("unsigned") int index_options,
                                         String source_filename,
                                         @Cast("const char*const*") @ByPtrPtr byte[] command_line_args,
                                         int num_command_line_args,
                                         CXUnsavedFile unsaved_files,
                                         @Cast("unsigned") int num_unsaved_files,
                                         @Cast("CXTranslationUnit*") PointerPointer out_TU,
                                         @Cast("unsigned") int TU_options);

/**
 * \brief Index the given translation unit via callbacks implemented through
 * #IndexerCallbacks.
 * 
 * The order of callback invocations is not guaranteed to be the same as
 * when indexing a source file. The high level order will be:
 * 
 *   -Preprocessor callbacks invocations
 *   -Declaration/reference callbacks invocations
 *   -Diagnostic callback invocations
 *
 * The parameters are the same as #clang_indexSourceFile.
 * 
 * @return If there is a failure from which there is no recovery, returns
 * non-zero, otherwise returns 0.
 */
public static native int clang_indexTranslationUnit(CXIndexAction arg0,
                                              CXClientData client_data,
                                              IndexerCallbacks index_callbacks,
                                              @Cast("unsigned") int index_callbacks_size,
                                              @Cast("unsigned") int index_options,
                                              CXTranslationUnit arg5);

/**
 * \brief Retrieve the CXIdxFile, file, line, column, and offset represented by
 * the given CXIdxLoc.
 *
 * If the location refers into a macro expansion, retrieves the
 * location of the macro expansion and if it refers into a macro argument
 * retrieves the location of the argument.
 */
public static native void clang_indexLoc_getFileLocation(@ByVal CXIdxLoc loc,
                                                   @ByPtrPtr CXIdxClientFile indexFile,
                                                   @ByPtrPtr CXFile file,
                                                   @Cast("unsigned*") IntPointer line,
                                                   @Cast("unsigned*") IntPointer column,
                                                   @Cast("unsigned*") IntPointer offset);
public static native void clang_indexLoc_getFileLocation(@ByVal CXIdxLoc loc,
                                                   @ByPtrPtr CXIdxClientFile indexFile,
                                                   @ByPtrPtr CXFile file,
                                                   @Cast("unsigned*") IntBuffer line,
                                                   @Cast("unsigned*") IntBuffer column,
                                                   @Cast("unsigned*") IntBuffer offset);
public static native void clang_indexLoc_getFileLocation(@ByVal CXIdxLoc loc,
                                                   @ByPtrPtr CXIdxClientFile indexFile,
                                                   @ByPtrPtr CXFile file,
                                                   @Cast("unsigned*") int[] line,
                                                   @Cast("unsigned*") int[] column,
                                                   @Cast("unsigned*") int[] offset);

/**
 * \brief Retrieve the CXSourceLocation represented by the given CXIdxLoc.
 */
public static native @ByVal CXSourceLocation clang_indexLoc_getCXSourceLocation(@ByVal CXIdxLoc loc);

/**
 * \brief Visitor invoked for each field found by a traversal.
 *
 * This visitor function will be invoked for each field found by
 * \c clang_Type_visitFields. Its first argument is the cursor being
 * visited, its second argument is the client data provided to
 * \c clang_Type_visitFields.
 *
 * The visitor should return one of the \c CXVisitorResult values
 * to direct \c clang_Type_visitFields.
 */
public static class CXFieldVisitor extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CXFieldVisitor(Pointer p) { super(p); }
    protected CXFieldVisitor() { allocate(); }
    private native void allocate();
    public native @Cast("CXVisitorResult") int call(@ByVal CXCursor C,
                                               CXClientData client_data);
}

/**
 * \brief Visit the fields of a particular type.
 *
 * This function visits all the direct fields of the given cursor,
 * invoking the given \p visitor function with the cursors of each
 * visited field. The traversal may be ended prematurely, if
 * the visitor returns \c CXFieldVisit_Break.
 *
 * @param T the record type whose field may be visited.
 *
 * @param visitor the visitor function that will be invoked for each
 * field of \p T.
 *
 * @param client_data pointer data supplied by the client, which will
 * be passed to the visitor each time it is invoked.
 *
 * @return a non-zero value if the traversal was terminated
 * prematurely by the visitor returning \c CXFieldVisit_Break.
 */
public static native @Cast("unsigned") int clang_Type_visitFields(@ByVal CXType T,
                                               CXFieldVisitor visitor,
                                               CXClientData client_data);


/**
 * \}
 */

/**
 * \}
 */

// #ifdef __cplusplus
// #endif
// #endif



// Parsed from <clang-c/Documentation.h>

/*==-- clang-c/Documentation.h - Utilities for comment processing -*- C -*-===*\
|*                                                                            *|
|*                     The LLVM Compiler Infrastructure                       *|
|*                                                                            *|
|* This file is distributed under the University of Illinois Open Source      *|
|* License. See LICENSE.TXT for details.                                      *|
|*                                                                            *|
|*===----------------------------------------------------------------------===*|
|*                                                                            *|
|* This header provides a supplementary interface for inspecting              *|
|* documentation comments.                                                    *|
|*                                                                            *|
\*===----------------------------------------------------------------------===*/

// #ifndef LLVM_CLANG_C_DOCUMENTATION_H
// #define LLVM_CLANG_C_DOCUMENTATION_H

// #include "clang-c/Index.h"

// #ifdef __cplusplus
// #endif

/**
 * \defgroup CINDEX_COMMENT Comment introspection
 *
 * The routines in this group provide access to information in documentation
 * comments. These facilities are distinct from the core and may be subject to
 * their own schedule of stability and deprecation.
 *
 * \{
 */

/**
 * \brief A parsed comment.
 */
public static class CXComment extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXComment() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CXComment(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXComment(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CXComment position(int position) {
        return (CXComment)super.position(position);
    }

  @MemberGetter public native @Const Pointer ASTNode();
  public native CXTranslationUnit TranslationUnit(); public native CXComment TranslationUnit(CXTranslationUnit TranslationUnit);
}

/**
 * \brief Given a cursor that represents a documentable entity (e.g.,
 * declaration), return the associated parsed comment as a
 * \c CXComment_FullComment AST node.
 */
public static native @ByVal CXComment clang_Cursor_getParsedComment(@ByVal CXCursor C);

/**
 * \brief Describes the type of the comment AST node (\c CXComment).  A comment
 * node can be considered block content (e. g., paragraph), inline content
 * (plain text) or neither (the root AST node).
 */
/** enum CXCommentKind */
public static final int
  /**
   * \brief Null comment.  No AST node is constructed at the requested location
   * because there is no text or a syntax error.
   */
  CXComment_Null = 0,

  /**
   * \brief Plain text.  Inline content.
   */
  CXComment_Text = 1,

  /**
   * \brief A command with word-like arguments that is considered inline content.
   *
   * For example: \\c command.
   */
  CXComment_InlineCommand = 2,

  /**
   * \brief HTML start tag with attributes (name-value pairs).  Considered
   * inline content.
   *
   * For example:
   * <pre>{@literal
   * <br> <br /> <a href="http://example.org/">
   * }</pre>
   */
  CXComment_HTMLStartTag = 3,

  /**
   * \brief HTML end tag.  Considered inline content.
   *
   * For example:
   * <pre>{@literal
   * </a>
   * }</pre>
   */
  CXComment_HTMLEndTag = 4,

  /**
   * \brief A paragraph, contains inline comment.  The paragraph itself is
   * block content.
   */
  CXComment_Paragraph = 5,

  /**
   * \brief A command that has zero or more word-like arguments (number of
   * word-like arguments depends on command name) and a paragraph as an
   * argument.  Block command is block content.
   *
   * Paragraph argument is also a child of the block command.
   *
   * For example: \\brief has 0 word-like arguments and a paragraph argument.
   *
   * AST nodes of special kinds that parser knows about (e. g., \@param
   * command) have their own node kinds.
   */
  CXComment_BlockCommand = 6,

  /**
   * \brief A \@param or \\arg command that describes the function parameter
   * (name, passing direction, description).
   *
   * For example: \@param [in] ParamName description.
   */
  CXComment_ParamCommand = 7,

  /**
   * \brief A \\tparam command that describes a template parameter (name and
   * description).
   *
   * For example: \\tparam T description.
   */
  CXComment_TParamCommand = 8,

  /**
   * \brief A verbatim block command (e. g., preformatted code).  Verbatim
   * block has an opening and a closing command and contains multiple lines of
   * text (\c CXComment_VerbatimBlockLine child nodes).
   *
   * For example:
   * \<pre>{@literal
   * aaa
   * \}</pre>
   */
  CXComment_VerbatimBlockCommand = 9,

  /**
   * \brief A line of text that is contained within a
   * CXComment_VerbatimBlockCommand node.
   */
  CXComment_VerbatimBlockLine = 10,

  /**
   * \brief A verbatim line command.  Verbatim line has an opening command,
   * a single line of text (up to the newline after the opening command) and
   * has no closing command.
   */
  CXComment_VerbatimLine = 11,

  /**
   * \brief A full comment attached to a declaration, contains block content.
   */
  CXComment_FullComment = 12;

/**
 * \brief The most appropriate rendering mode for an inline command, chosen on
 * command semantics in Doxygen.
 */
/** enum CXCommentInlineCommandRenderKind */
public static final int
  /**
   * \brief Command argument should be rendered in a normal font.
   */
  CXCommentInlineCommandRenderKind_Normal = 0,

  /**
   * \brief Command argument should be rendered in a bold font.
   */
  CXCommentInlineCommandRenderKind_Bold = 1,

  /**
   * \brief Command argument should be rendered in a monospaced font.
   */
  CXCommentInlineCommandRenderKind_Monospaced = 2,

  /**
   * \brief Command argument should be rendered emphasized (typically italic
   * font).
   */
  CXCommentInlineCommandRenderKind_Emphasized = 3;

/**
 * \brief Describes parameter passing direction for \@param or \\arg command.
 */
/** enum CXCommentParamPassDirection */
public static final int
  /**
   * \brief The parameter is an input parameter.
   */
  CXCommentParamPassDirection_In = 0,

  /**
   * \brief The parameter is an output parameter.
   */
  CXCommentParamPassDirection_Out = 1,

  /**
   * \brief The parameter is an input and output parameter.
   */
  CXCommentParamPassDirection_InOut = 2;

/**
 * @param Comment AST node of any kind.
 *
 * @return the type of the AST node.
 */
public static native @Cast("CXCommentKind") int clang_Comment_getKind(@ByVal CXComment Comment);

/**
 * @param Comment AST node of any kind.
 *
 * @return number of children of the AST node.
 */
public static native @Cast("unsigned") int clang_Comment_getNumChildren(@ByVal CXComment Comment);

/**
 * @param Comment AST node of any kind.
 *
 * @param ChildIdx child index (zero-based).
 *
 * @return the specified child of the AST node.
 */
public static native @ByVal CXComment clang_Comment_getChild(@ByVal CXComment Comment, @Cast("unsigned") int ChildIdx);

/**
 * \brief A \c CXComment_Paragraph node is considered whitespace if it contains
 * only \c CXComment_Text nodes that are empty or whitespace.
 *
 * Other AST nodes (except \c CXComment_Paragraph and \c CXComment_Text) are
 * never considered whitespace.
 *
 * @return non-zero if \c Comment is whitespace.
 */
public static native @Cast("unsigned") int clang_Comment_isWhitespace(@ByVal CXComment Comment);

/**
 * @return non-zero if \c Comment is inline content and has a newline
 * immediately following it in the comment text.  Newlines between paragraphs
 * do not count.
 */
public static native @Cast("unsigned") int clang_InlineContentComment_hasTrailingNewline(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_Text AST node.
 *
 * @return text contained in the AST node.
 */
public static native @ByVal CXString clang_TextComment_getText(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_InlineCommand AST node.
 *
 * @return name of the inline command.
 */
public static native @ByVal CXString clang_InlineCommandComment_getCommandName(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_InlineCommand AST node.
 *
 * @return the most appropriate rendering mode, chosen on command
 * semantics in Doxygen.
 */
public static native @Cast("CXCommentInlineCommandRenderKind") int clang_InlineCommandComment_getRenderKind(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_InlineCommand AST node.
 *
 * @return number of command arguments.
 */
public static native @Cast("unsigned") int clang_InlineCommandComment_getNumArgs(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_InlineCommand AST node.
 *
 * @param ArgIdx argument index (zero-based).
 *
 * @return text of the specified argument.
 */
public static native @ByVal CXString clang_InlineCommandComment_getArgText(@ByVal CXComment Comment,
                                               @Cast("unsigned") int ArgIdx);

/**
 * @param Comment a \c CXComment_HTMLStartTag or \c CXComment_HTMLEndTag AST
 * node.
 *
 * @return HTML tag name.
 */
public static native @ByVal CXString clang_HTMLTagComment_getTagName(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_HTMLStartTag AST node.
 *
 * @return non-zero if tag is self-closing (for example, &lt;br /&gt;).
 */
public static native @Cast("unsigned") int clang_HTMLStartTagComment_isSelfClosing(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_HTMLStartTag AST node.
 *
 * @return number of attributes (name-value pairs) attached to the start tag.
 */
public static native @Cast("unsigned") int clang_HTMLStartTag_getNumAttrs(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_HTMLStartTag AST node.
 *
 * @param AttrIdx attribute index (zero-based).
 *
 * @return name of the specified attribute.
 */
public static native @ByVal CXString clang_HTMLStartTag_getAttrName(@ByVal CXComment Comment, @Cast("unsigned") int AttrIdx);

/**
 * @param Comment a \c CXComment_HTMLStartTag AST node.
 *
 * @param AttrIdx attribute index (zero-based).
 *
 * @return value of the specified attribute.
 */
public static native @ByVal CXString clang_HTMLStartTag_getAttrValue(@ByVal CXComment Comment, @Cast("unsigned") int AttrIdx);

/**
 * @param Comment a \c CXComment_BlockCommand AST node.
 *
 * @return name of the block command.
 */
public static native @ByVal CXString clang_BlockCommandComment_getCommandName(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_BlockCommand AST node.
 *
 * @return number of word-like arguments.
 */
public static native @Cast("unsigned") int clang_BlockCommandComment_getNumArgs(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_BlockCommand AST node.
 *
 * @param ArgIdx argument index (zero-based).
 *
 * @return text of the specified word-like argument.
 */
public static native @ByVal CXString clang_BlockCommandComment_getArgText(@ByVal CXComment Comment,
                                              @Cast("unsigned") int ArgIdx);

/**
 * @param Comment a \c CXComment_BlockCommand or
 * \c CXComment_VerbatimBlockCommand AST node.
 *
 * @return paragraph argument of the block command.
 */
public static native @ByVal CXComment clang_BlockCommandComment_getParagraph(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_ParamCommand AST node.
 *
 * @return parameter name.
 */
public static native @ByVal CXString clang_ParamCommandComment_getParamName(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_ParamCommand AST node.
 *
 * @return non-zero if the parameter that this AST node represents was found
 * in the function prototype and \c clang_ParamCommandComment_getParamIndex
 * function will return a meaningful value.
 */
public static native @Cast("unsigned") int clang_ParamCommandComment_isParamIndexValid(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_ParamCommand AST node.
 *
 * @return zero-based parameter index in function prototype.
 */
public static native @Cast("unsigned") int clang_ParamCommandComment_getParamIndex(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_ParamCommand AST node.
 *
 * @return non-zero if parameter passing direction was specified explicitly in
 * the comment.
 */
public static native @Cast("unsigned") int clang_ParamCommandComment_isDirectionExplicit(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_ParamCommand AST node.
 *
 * @return parameter passing direction.
 */
public static native @Cast("CXCommentParamPassDirection") int clang_ParamCommandComment_getDirection(
                                                            @ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_TParamCommand AST node.
 *
 * @return template parameter name.
 */
public static native @ByVal CXString clang_TParamCommandComment_getParamName(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_TParamCommand AST node.
 *
 * @return non-zero if the parameter that this AST node represents was found
 * in the template parameter list and
 * \c clang_TParamCommandComment_getDepth and
 * \c clang_TParamCommandComment_getIndex functions will return a meaningful
 * value.
 */
public static native @Cast("unsigned") int clang_TParamCommandComment_isParamPositionValid(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_TParamCommand AST node.
 *
 * @return zero-based nesting depth of this parameter in the template parameter list.
 *
 * For example,
 * <pre>{@literal
 *     template<typename C, template<typename T> class TT>
 *     void test(TT<int> aaa);
 * }</pre>
 * for C and TT nesting depth is 0,
 * for T nesting depth is 1.
 */
public static native @Cast("unsigned") int clang_TParamCommandComment_getDepth(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_TParamCommand AST node.
 *
 * @return zero-based parameter index in the template parameter list at a
 * given nesting depth.
 *
 * For example,
 * <pre>{@literal
 *     template<typename C, template<typename T> class TT>
 *     void test(TT<int> aaa);
 * }</pre>
 * for C and TT nesting depth is 0, so we can ask for index at depth 0:
 * at depth 0 C's index is 0, TT's index is 1.
 *
 * For T nesting depth is 1, so we can ask for index at depth 0 and 1:
 * at depth 0 T's index is 1 (same as TT's),
 * at depth 1 T's index is 0.
 */
public static native @Cast("unsigned") int clang_TParamCommandComment_getIndex(@ByVal CXComment Comment, @Cast("unsigned") int Depth);

/**
 * @param Comment a \c CXComment_VerbatimBlockLine AST node.
 *
 * @return text contained in the AST node.
 */
public static native @ByVal CXString clang_VerbatimBlockLineComment_getText(@ByVal CXComment Comment);

/**
 * @param Comment a \c CXComment_VerbatimLine AST node.
 *
 * @return text contained in the AST node.
 */
public static native @ByVal CXString clang_VerbatimLineComment_getText(@ByVal CXComment Comment);

/**
 * \brief Convert an HTML tag AST node to string.
 *
 * @param Comment a \c CXComment_HTMLStartTag or \c CXComment_HTMLEndTag AST
 * node.
 *
 * @return string containing an HTML tag.
 */
public static native @ByVal CXString clang_HTMLTagComment_getAsString(@ByVal CXComment Comment);

/**
 * \brief Convert a given full parsed comment to an HTML fragment.
 *
 * Specific details of HTML layout are subject to change.  Don't try to parse
 * this HTML back into an AST, use other APIs instead.
 *
 * Currently the following CSS classes are used:
 * \li "para-brief" for \\brief paragraph and equivalent commands;
 * \li "para-returns" for \@return paragraph and equivalent commands;
 * \li "word-returns" for the "Returns" word in \@return paragraph.
 *
 * Function argument documentation is rendered as a \<dl\> list with arguments
 * sorted in function prototype order.  CSS classes used:
 * \li "param-name-index-NUMBER" for parameter name (\<dt\>);
 * \li "param-descr-index-NUMBER" for parameter description (\<dd\>);
 * \li "param-name-index-invalid" and "param-descr-index-invalid" are used if
 * parameter index is invalid.
 *
 * Template parameter documentation is rendered as a \<dl\> list with
 * parameters sorted in template parameter list order.  CSS classes used:
 * \li "tparam-name-index-NUMBER" for parameter name (\<dt\>);
 * \li "tparam-descr-index-NUMBER" for parameter description (\<dd\>);
 * \li "tparam-name-index-other" and "tparam-descr-index-other" are used for
 * names inside template template parameters;
 * \li "tparam-name-index-invalid" and "tparam-descr-index-invalid" are used if
 * parameter position is invalid.
 *
 * @param Comment a \c CXComment_FullComment AST node.
 *
 * @return string containing an HTML fragment.
 */
public static native @ByVal CXString clang_FullComment_getAsHTML(@ByVal CXComment Comment);

/**
 * \brief Convert a given full parsed comment to an XML document.
 *
 * A Relax NG schema for the XML can be found in comment-xml-schema.rng file
 * inside clang source tree.
 *
 * @param Comment a \c CXComment_FullComment AST node.
 *
 * @return string containing an XML document.
 */
public static native @ByVal CXString clang_FullComment_getAsXML(@ByVal CXComment Comment);

/**
 * \}
 */


// #ifdef __cplusplus
// #endif

// #endif /* CLANG_C_DOCUMENTATION_H */



}
