// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class CACHE_RELATIONSHIP extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CACHE_RELATIONSHIP() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CACHE_RELATIONSHIP(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CACHE_RELATIONSHIP(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CACHE_RELATIONSHIP position(long position) {
        return (CACHE_RELATIONSHIP)super.position(position);
    }

    public native @Cast("BYTE") byte Level(); public native CACHE_RELATIONSHIP Level(byte Level);
    public native @Cast("BYTE") byte Associativity(); public native CACHE_RELATIONSHIP Associativity(byte Associativity);
    public native @Cast("WORD") short LineSize(); public native CACHE_RELATIONSHIP LineSize(short LineSize);
    public native @Cast("DWORD") int CacheSize(); public native CACHE_RELATIONSHIP CacheSize(int CacheSize);
    public native @Cast("PROCESSOR_CACHE_TYPE") int Type(); public native CACHE_RELATIONSHIP Type(int Type);
    public native @Cast("BYTE") byte Reserved(int i); public native CACHE_RELATIONSHIP Reserved(int i, byte Reserved);
    @MemberGetter public native @Cast("BYTE*") BytePointer Reserved();
    public native @ByRef GROUP_AFFINITY GroupMask(); public native CACHE_RELATIONSHIP GroupMask(GROUP_AFFINITY GroupMask);
}
