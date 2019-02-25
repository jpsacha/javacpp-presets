// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class OFSTRUCT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OFSTRUCT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OFSTRUCT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OFSTRUCT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OFSTRUCT position(long position) {
        return (OFSTRUCT)super.position(position);
    }

    public native @Cast("BYTE") byte cBytes(); public native OFSTRUCT cBytes(byte cBytes);
    public native @Cast("BYTE") byte fFixedDisk(); public native OFSTRUCT fFixedDisk(byte fFixedDisk);
    public native @Cast("WORD") short nErrCode(); public native OFSTRUCT nErrCode(short nErrCode);
    public native @Cast("WORD") short Reserved1(); public native OFSTRUCT Reserved1(short Reserved1);
    public native @Cast("WORD") short Reserved2(); public native OFSTRUCT Reserved2(short Reserved2);
    public native @Cast("CHAR") byte szPathName(int i); public native OFSTRUCT szPathName(int i, byte szPathName);
    @MemberGetter public native @Cast("CHAR*") BytePointer szPathName();
}
