// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILE_ID_BOTH_DIR_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILE_ID_BOTH_DIR_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILE_ID_BOTH_DIR_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILE_ID_BOTH_DIR_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILE_ID_BOTH_DIR_INFO position(long position) {
        return (FILE_ID_BOTH_DIR_INFO)super.position(position);
    }

    public native @Cast("DWORD") int NextEntryOffset(); public native FILE_ID_BOTH_DIR_INFO NextEntryOffset(int NextEntryOffset);
    public native @Cast("DWORD") int FileIndex(); public native FILE_ID_BOTH_DIR_INFO FileIndex(int FileIndex);
    public native @ByRef LARGE_INTEGER CreationTime(); public native FILE_ID_BOTH_DIR_INFO CreationTime(LARGE_INTEGER CreationTime);
    public native @ByRef LARGE_INTEGER LastAccessTime(); public native FILE_ID_BOTH_DIR_INFO LastAccessTime(LARGE_INTEGER LastAccessTime);
    public native @ByRef LARGE_INTEGER LastWriteTime(); public native FILE_ID_BOTH_DIR_INFO LastWriteTime(LARGE_INTEGER LastWriteTime);
    public native @ByRef LARGE_INTEGER ChangeTime(); public native FILE_ID_BOTH_DIR_INFO ChangeTime(LARGE_INTEGER ChangeTime);
    public native @ByRef LARGE_INTEGER EndOfFile(); public native FILE_ID_BOTH_DIR_INFO EndOfFile(LARGE_INTEGER EndOfFile);
    public native @ByRef LARGE_INTEGER AllocationSize(); public native FILE_ID_BOTH_DIR_INFO AllocationSize(LARGE_INTEGER AllocationSize);
    public native @Cast("DWORD") int FileAttributes(); public native FILE_ID_BOTH_DIR_INFO FileAttributes(int FileAttributes);
    public native @Cast("DWORD") int FileNameLength(); public native FILE_ID_BOTH_DIR_INFO FileNameLength(int FileNameLength);
    public native @Cast("DWORD") int EaSize(); public native FILE_ID_BOTH_DIR_INFO EaSize(int EaSize);
    public native @Cast("CCHAR") byte ShortNameLength(); public native FILE_ID_BOTH_DIR_INFO ShortNameLength(byte ShortNameLength);
    public native @Cast("WCHAR") char ShortName(int i); public native FILE_ID_BOTH_DIR_INFO ShortName(int i, char ShortName);
    @MemberGetter public native @Cast("WCHAR*") CharPointer ShortName();
    public native @ByRef LARGE_INTEGER FileId(); public native FILE_ID_BOTH_DIR_INFO FileId(LARGE_INTEGER FileId);
    public native @Cast("WCHAR") char FileName(int i); public native FILE_ID_BOTH_DIR_INFO FileName(int i, char FileName);
    @MemberGetter public native @Cast("WCHAR*") CharPointer FileName();
}
