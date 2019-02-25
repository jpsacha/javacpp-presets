// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@NoOffset @Name("std::pair<tensorflow::shape_inference::DimensionHandle,tensorflow::shape_inference::DimensionHandle>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DimensionHandlePair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DimensionHandlePair(Pointer p) { super(p); }
    public DimensionHandlePair(DimensionHandle firstValue, DimensionHandle secondValue) { this(); put(firstValue, secondValue); }
    public DimensionHandlePair()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef DimensionHandlePair put(@ByRef DimensionHandlePair x);


    @MemberGetter public native @ByRef DimensionHandle first(); public native DimensionHandlePair first(DimensionHandle first);
    @MemberGetter public native @ByRef DimensionHandle second();  public native DimensionHandlePair second(DimensionHandle second);

    public DimensionHandlePair put(DimensionHandle firstValue, DimensionHandle secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

