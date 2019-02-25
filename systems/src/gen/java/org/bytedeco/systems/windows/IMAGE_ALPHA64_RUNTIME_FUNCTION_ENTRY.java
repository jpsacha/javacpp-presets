// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY position(long position) {
        return (IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY)super.position(position);
    }

    public native @Cast("ULONGLONG") long BeginAddress(); public native IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY BeginAddress(long BeginAddress);
    public native @Cast("ULONGLONG") long EndAddress(); public native IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY EndAddress(long EndAddress);
    public native @Cast("ULONGLONG") long ExceptionHandler(); public native IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY ExceptionHandler(long ExceptionHandler);
    public native @Cast("ULONGLONG") long HandlerData(); public native IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY HandlerData(long HandlerData);
    public native @Cast("ULONGLONG") long PrologEndAddress(); public native IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY PrologEndAddress(long PrologEndAddress);
}
