// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Updates the accumulator with a new value for global_step.
 * 
 *  Logs warning if the accumulator's value is already higher than
 *  new_global_step.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to an accumulator.
 *  * new_global_step: The new global_step value to set.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AccumulatorSetGlobalStep extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AccumulatorSetGlobalStep(Pointer p) { super(p); }

  public AccumulatorSetGlobalStep(@Const @ByRef Scope scope, @ByVal Input handle, @ByVal Input new_global_step) { super((Pointer)null); allocate(scope, handle, new_global_step); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle, @ByVal Input new_global_step);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public native @ByRef Operation operation(); public native AccumulatorSetGlobalStep operation(Operation operation);
}
