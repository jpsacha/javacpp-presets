// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the index with the largest value across dimensions of a tensor.
 * 
 *  Note that in case of ties the identity of the return value is not guaranteed.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * dimension: int32 or int64, must be in the range {@code [-rank(input), rank(input))}.
 *  Describes which dimension of the input Tensor to reduce across. For vectors,
 *  use dimension = 0.
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ArgMax extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArgMax(Pointer p) { super(p); }

  /** Optional attribute setters for ArgMax */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** Defaults to DT_INT64 */
    public native @ByVal Attrs OutputType(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::DataType") int output_type_(); public native Attrs output_type_(int output_type_);
  }
  public ArgMax(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input dimension) { super((Pointer)null); allocate(scope, input, dimension); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input dimension);
  public ArgMax(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input dimension, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, dimension, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input dimension, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs OutputType(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native ArgMax operation(Operation operation);
  public native @ByRef Output output(); public native ArgMax output(Output output);
}
