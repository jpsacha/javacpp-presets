// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Takes the given number of completed elements from a barrier.
 * 
 *  This operation concatenates completed-element component tensors along
 *  the 0th dimension to make a single component tensor.
 * 
 *  Elements come out of the barrier when they are complete, and in the order
 *  in which they were placed into the barrier.  The indices output provides
 *  information about the batch in which each element was originally inserted
 *  into the barrier.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to a barrier.
 *  * num_elements: A single-element tensor containing the number of elements to
 *  take.
 *  * component_types: The type of each component in a value.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * allow_small_batch: Allow to return less than num_elements items if barrier is
 *  already closed.
 *  * timeout_ms: If the queue is empty, this operation will block for up to
 *  timeout_ms milliseconds.
 *  Note: This option is not supported yet.
 * 
 *  Returns:
 *  * {@code Output} indices: A one-dimensional tensor of indices, with length num_elems.
 *  These indices refer to the batch in which the values were placed into the
 *  barrier (starting with MIN_LONG and increasing with each BarrierInsertMany).
 *  * {@code Output} keys: A one-dimensional tensor of keys, with length num_elements.
 *  * {@code OutputList} values: One any-dimensional tensor per component in a barrier element. All
 *  values have length num_elements in the 0th dimension. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class BarrierTakeMany extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BarrierTakeMany(Pointer p) { super(p); }

  /** Optional attribute setters for BarrierTakeMany */
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
  
    /** Allow to return less than num_elements items if barrier is
     *  already closed.
     * 
     *  Defaults to false */
    public native @ByVal Attrs AllowSmallBatch(@Cast("bool") boolean x);

    /** Defaults to false */
    
    ///
    public native @ByVal Attrs WaitForIncomplete(@Cast("bool") boolean x);

    /** If the queue is empty, this operation will block for up to
     *  timeout_ms milliseconds.
     *  Note: This option is not supported yet.
     * 
     *  Defaults to -1 */
    public native @ByVal Attrs TimeoutMs(@Cast("tensorflow::int64") long x);

    public native @Cast("bool") boolean allow_small_batch_(); public native Attrs allow_small_batch_(boolean allow_small_batch_);
    public native @Cast("bool") boolean wait_for_incomplete_(); public native Attrs wait_for_incomplete_(boolean wait_for_incomplete_);
    public native @Cast("tensorflow::int64") long timeout_ms_(); public native Attrs timeout_ms_(long timeout_ms_);
  }
  public BarrierTakeMany(@Const @ByRef Scope scope, @ByVal Input handle,
                  @ByVal Input num_elements, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector component_types) { super((Pointer)null); allocate(scope, handle, num_elements, component_types); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                  @ByVal Input num_elements, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector component_types);
  public BarrierTakeMany(@Const @ByRef Scope scope, @ByVal Input handle,
                  @ByVal Input num_elements, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector component_types, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, handle, num_elements, component_types, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                  @ByVal Input num_elements, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector component_types, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs AllowSmallBatch(@Cast("bool") boolean x);
  public static native @ByVal Attrs WaitForIncomplete(@Cast("bool") boolean x);
  public static native @ByVal Attrs TimeoutMs(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native BarrierTakeMany operation(Operation operation);
  public native @ByRef Output indices(); public native BarrierTakeMany indices(Output indices);
  public native @ByRef Output keys(); public native BarrierTakeMany keys(Output keys);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector values(); public native BarrierTakeMany values(OutputVector values);
}
