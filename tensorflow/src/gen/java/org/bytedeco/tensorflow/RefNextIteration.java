// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Makes its input available to the next iteration.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * data: The tensor to be made available to the next iteration.
 * 
 *  Returns:
 *  * {@code Output}: The same tensor as {@code data}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RefNextIteration extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RefNextIteration(Pointer p) { super(p); }

  public RefNextIteration(@Const @ByRef Scope scope, @ByVal Input data) { super((Pointer)null); allocate(scope, data); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native RefNextIteration operation(Operation operation);
  public native @ByRef Output output(); public native RefNextIteration output(Output output);
}
