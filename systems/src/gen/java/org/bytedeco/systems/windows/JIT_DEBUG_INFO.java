// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// JIT Debugging Info. This structure is defined to have constant size in
// both the emulated and native environment.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class JIT_DEBUG_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public JIT_DEBUG_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JIT_DEBUG_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JIT_DEBUG_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JIT_DEBUG_INFO position(long position) {
        return (JIT_DEBUG_INFO)super.position(position);
    }

    public native @Cast("DWORD") int dwSize(); public native JIT_DEBUG_INFO dwSize(int dwSize);
    public native @Cast("DWORD") int dwProcessorArchitecture(); public native JIT_DEBUG_INFO dwProcessorArchitecture(int dwProcessorArchitecture);
    public native @Cast("DWORD") int dwThreadID(); public native JIT_DEBUG_INFO dwThreadID(int dwThreadID);
    public native @Cast("DWORD") int dwReserved0(); public native JIT_DEBUG_INFO dwReserved0(int dwReserved0);
    public native @Cast("ULONG64") long lpExceptionAddress(); public native JIT_DEBUG_INFO lpExceptionAddress(long lpExceptionAddress);
    public native @Cast("ULONG64") long lpExceptionRecord(); public native JIT_DEBUG_INFO lpExceptionRecord(long lpExceptionRecord);
    public native @Cast("ULONG64") long lpContextRecord(); public native JIT_DEBUG_INFO lpContextRecord(long lpContextRecord);
}
