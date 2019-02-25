// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILE_ID_DESCRIPTOR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILE_ID_DESCRIPTOR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILE_ID_DESCRIPTOR(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILE_ID_DESCRIPTOR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILE_ID_DESCRIPTOR position(long position) {
        return (FILE_ID_DESCRIPTOR)super.position(position);
    }

    public native @Cast("DWORD") int dwSize(); public native FILE_ID_DESCRIPTOR dwSize(int dwSize);  // Size of the struct
    public native @Cast("FILE_ID_TYPE") int Type(); public native FILE_ID_DESCRIPTOR Type(int Type); // Describes the type of identifier passed in.
        public native @ByRef LARGE_INTEGER FileId(); public native FILE_ID_DESCRIPTOR FileId(LARGE_INTEGER FileId);
        public native @ByRef GUID ObjectId(); public native FILE_ID_DESCRIPTOR ObjectId(GUID ObjectId);
// #if (_WIN32_WINNT >= _WIN32_WINNT_WIN8)
// #endif 
}
