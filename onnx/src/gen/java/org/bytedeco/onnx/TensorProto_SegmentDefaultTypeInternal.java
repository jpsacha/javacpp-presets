// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;

@Namespace("onnx") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TensorProto_SegmentDefaultTypeInternal extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TensorProto_SegmentDefaultTypeInternal() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorProto_SegmentDefaultTypeInternal(Pointer p) { super(p); }
}
