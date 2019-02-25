// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class JOBOBJECT_ASSOCIATE_COMPLETION_PORT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public JOBOBJECT_ASSOCIATE_COMPLETION_PORT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JOBOBJECT_ASSOCIATE_COMPLETION_PORT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JOBOBJECT_ASSOCIATE_COMPLETION_PORT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JOBOBJECT_ASSOCIATE_COMPLETION_PORT position(long position) {
        return (JOBOBJECT_ASSOCIATE_COMPLETION_PORT)super.position(position);
    }

    public native @Cast("PVOID") Pointer CompletionKey(); public native JOBOBJECT_ASSOCIATE_COMPLETION_PORT CompletionKey(Pointer CompletionKey);
    public native @Cast("HANDLE") Pointer CompletionPort(); public native JOBOBJECT_ASSOCIATE_COMPLETION_PORT CompletionPort(Pointer CompletionPort);
}
