// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::BaseBinaryScalar<arrow::LargeBinaryType>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseLargeBinaryScalar extends Scalar {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseLargeBinaryScalar(Pointer p) { super(p); }

  public native @SharedPtr @ByRef ArrowBuffer value(); public native BaseLargeBinaryScalar value(ArrowBuffer setter);
}