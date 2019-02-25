// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;




//
// Quality Of Service
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SECURITY_QUALITY_OF_SERVICE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SECURITY_QUALITY_OF_SERVICE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SECURITY_QUALITY_OF_SERVICE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SECURITY_QUALITY_OF_SERVICE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SECURITY_QUALITY_OF_SERVICE position(long position) {
        return (SECURITY_QUALITY_OF_SERVICE)super.position(position);
    }

    public native @Cast("DWORD") int Length(); public native SECURITY_QUALITY_OF_SERVICE Length(int Length);
    public native @Cast("SECURITY_IMPERSONATION_LEVEL") int ImpersonationLevel(); public native SECURITY_QUALITY_OF_SERVICE ImpersonationLevel(int ImpersonationLevel);
    public native @Cast("SECURITY_CONTEXT_TRACKING_MODE") boolean ContextTrackingMode(); public native SECURITY_QUALITY_OF_SERVICE ContextTrackingMode(boolean ContextTrackingMode);
    public native @Cast("BOOLEAN") boolean EffectiveOnly(); public native SECURITY_QUALITY_OF_SERVICE EffectiveOnly(boolean EffectiveOnly);
    }
