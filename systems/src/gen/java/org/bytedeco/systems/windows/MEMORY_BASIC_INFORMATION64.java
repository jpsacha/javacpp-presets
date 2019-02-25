// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class MEMORY_BASIC_INFORMATION64 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MEMORY_BASIC_INFORMATION64() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MEMORY_BASIC_INFORMATION64(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MEMORY_BASIC_INFORMATION64(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MEMORY_BASIC_INFORMATION64 position(long position) {
        return (MEMORY_BASIC_INFORMATION64)super.position(position);
    }

    public native @Cast("ULONGLONG") long BaseAddress(); public native MEMORY_BASIC_INFORMATION64 BaseAddress(long BaseAddress);
    public native @Cast("ULONGLONG") long AllocationBase(); public native MEMORY_BASIC_INFORMATION64 AllocationBase(long AllocationBase);
    public native @Cast("DWORD") int AllocationProtect(); public native MEMORY_BASIC_INFORMATION64 AllocationProtect(int AllocationProtect);
    public native @Cast("DWORD") int __alignment1(); public native MEMORY_BASIC_INFORMATION64 __alignment1(int __alignment1);
    public native @Cast("ULONGLONG") long RegionSize(); public native MEMORY_BASIC_INFORMATION64 RegionSize(long RegionSize);
    public native @Cast("DWORD") int State(); public native MEMORY_BASIC_INFORMATION64 State(int State);
    public native @Cast("DWORD") int Protect(); public native MEMORY_BASIC_INFORMATION64 Protect(int Protect);
    public native @Cast("DWORD") int Type(); public native MEMORY_BASIC_INFORMATION64 Type(int Type);
    public native @Cast("DWORD") int __alignment2(); public native MEMORY_BASIC_INFORMATION64 __alignment2(int __alignment2);
}
