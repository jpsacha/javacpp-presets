// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;
	/* [NOTIMP] [RTS] call notification function */

@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class sigevent extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sigevent() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sigevent(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sigevent(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sigevent position(long position) {
        return (sigevent)super.position(position);
    }

	public native int sigev_notify(); public native sigevent sigev_notify(int sigev_notify);				/* Notification type */
	public native int sigev_signo(); public native sigevent sigev_signo(int sigev_signo);				/* Signal number */
	public native @ByRef sigval sigev_value(); public native sigevent sigev_value(sigval sigev_value);				/* Signal value */
	public static class Sigev_notify_function_sigval extends FunctionPointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public    Sigev_notify_function_sigval(Pointer p) { super(p); }
	    protected Sigev_notify_function_sigval() { allocate(); }
	    private native void allocate();
	    public native void call(@ByVal sigval arg0);
	}
	public native Sigev_notify_function_sigval sigev_notify_function(); public native sigevent sigev_notify_function(Sigev_notify_function_sigval sigev_notify_function);	  /* Notification function */
	public native @Cast("pthread_attr_t*") Pointer sigev_notify_attributes(); public native sigevent sigev_notify_attributes(Pointer sigev_notify_attributes);	/* Notification attributes */
}
