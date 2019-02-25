// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;
	/* isn't compatibility wonderful! */
// #endif /* (!_POSIX_C_SOURCE || _DARWIN_C_SOURCE) */

/*
 * Structure used in sigstack call.
 */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class sigstack extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sigstack() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sigstack(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sigstack(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sigstack position(long position) {
        return (sigstack)super.position(position);
    }

	public native @Cast("char*") BytePointer ss_sp(); public native sigstack ss_sp(BytePointer ss_sp);			/* signal stack pointer */
	public native int ss_onstack(); public native sigstack ss_onstack(int ss_onstack);		/* current status */
}
