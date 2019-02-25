// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// Do not manipulate this structure directly!  Allocate space for it
// and use the inline interfaces below.
//

// #if (_WIN32_WINNT >= _WIN32_WINNT_WIN7)

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TP_CALLBACK_ENVIRON_V3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TP_CALLBACK_ENVIRON_V3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TP_CALLBACK_ENVIRON_V3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TP_CALLBACK_ENVIRON_V3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TP_CALLBACK_ENVIRON_V3 position(long position) {
        return (TP_CALLBACK_ENVIRON_V3)super.position(position);
    }

    public native @Cast("TP_VERSION") int Version(); public native TP_CALLBACK_ENVIRON_V3 Version(int Version);
    public native @Cast("PTP_POOL") TP_POOL Pool(); public native TP_CALLBACK_ENVIRON_V3 Pool(TP_POOL Pool);
    public native @Cast("PTP_CLEANUP_GROUP") TP_CLEANUP_GROUP CleanupGroup(); public native TP_CALLBACK_ENVIRON_V3 CleanupGroup(TP_CLEANUP_GROUP CleanupGroup);
    public native PTP_CLEANUP_GROUP_CANCEL_CALLBACK CleanupGroupCancelCallback(); public native TP_CALLBACK_ENVIRON_V3 CleanupGroupCancelCallback(PTP_CLEANUP_GROUP_CANCEL_CALLBACK CleanupGroupCancelCallback);
    public native @Cast("PVOID") Pointer RaceDll(); public native TP_CALLBACK_ENVIRON_V3 RaceDll(Pointer RaceDll);
    public native @Cast("_ACTIVATION_CONTEXT*") Pointer ActivationContext(); public native TP_CALLBACK_ENVIRON_V3 ActivationContext(Pointer ActivationContext);
    public native PTP_SIMPLE_CALLBACK FinalizationCallback(); public native TP_CALLBACK_ENVIRON_V3 FinalizationCallback(PTP_SIMPLE_CALLBACK FinalizationCallback);
        @Name("u.Flags") public native @Cast("DWORD") int u_Flags(); public native TP_CALLBACK_ENVIRON_V3 u_Flags(int u_Flags);
            @Name("u.s.LongFunction") public native @Cast("DWORD") @NoOffset int u_s_LongFunction(); public native TP_CALLBACK_ENVIRON_V3 u_s_LongFunction(int u_s_LongFunction);
            @Name("u.s.Persistent") public native @Cast("DWORD") @NoOffset int u_s_Persistent(); public native TP_CALLBACK_ENVIRON_V3 u_s_Persistent(int u_s_Persistent);
            @Name("u.s.Private") public native @Cast("DWORD") @NoOffset int u_s_Private(); public native TP_CALLBACK_ENVIRON_V3 u_s_Private(int u_s_Private);
    public native @Cast("TP_CALLBACK_PRIORITY") int CallbackPriority(); public native TP_CALLBACK_ENVIRON_V3 CallbackPriority(int CallbackPriority);
    public native @Cast("DWORD") int Size(); public native TP_CALLBACK_ENVIRON_V3 Size(int Size);
}
