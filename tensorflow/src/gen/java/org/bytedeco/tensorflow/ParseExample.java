// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Transforms a vector of brain.Example protos (as strings) into typed tensors.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * serialized: A vector containing a batch of binary serialized Example protos.
 *  * names: A vector containing the names of the serialized protos.
 *  May contain, for example, table key (descriptive) names for the
 *  corresponding serialized protos.  These are purely useful for debugging
 *  purposes, and the presence of values here has no effect on the output.
 *  May also be an empty vector if no names are available.
 *  If non-empty, this vector must be the same length as "serialized".
 *  * sparse_keys: A list of Nsparse string Tensors (scalars).
 *  The keys expected in the Examples' features associated with sparse values.
 *  * dense_keys: A list of Ndense string Tensors (scalars).
 *  The keys expected in the Examples' features associated with dense values.
 *  * dense_defaults: A list of Ndense Tensors (some may be empty).
 *  dense_defaults[j] provides default values
 *  when the example's feature_map lacks dense_key[j].  If an empty Tensor is
 *  provided for dense_defaults[j], then the Feature dense_keys[j] is required.
 *  The input type is inferred from dense_defaults[j], even when it's empty.
 *  If dense_defaults[j] is not empty, and dense_shapes[j] is fully defined,
 *  then the shape of dense_defaults[j] must match that of dense_shapes[j].
 *  If dense_shapes[j] has an undefined major dimension (variable strides dense
 *  feature), dense_defaults[j] must contain a single element:
 *  the padding element.
 *  * sparse_types: A list of Nsparse types; the data types of data in each Feature
 *  given in sparse_keys.
 *  Currently the ParseExample supports DT_FLOAT (FloatList),
 *  DT_INT64 (Int64List), and DT_STRING (BytesList).
 *  * dense_shapes: A list of Ndense shapes; the shapes of data in each Feature
 *  given in dense_keys.
 *  The number of elements in the Feature corresponding to dense_key[j]
 *  must always equal dense_shapes[j].NumEntries().
 *  If dense_shapes[j] == (D0, D1, ..., DN) then the shape of output
 *  Tensor dense_values[j] will be (|serialized|, D0, D1, ..., DN):
 *  The dense outputs are just the inputs row-stacked by batch.
 *  This works for dense_shapes[j] = (-1, D1, ..., DN).  In this case
 *  the shape of the output Tensor dense_values[j] will be
 *  (|serialized|, M, D1, .., DN), where M is the maximum number of blocks
 *  of elements of length D1 * .... * DN, across all minibatch entries
 *  in the input.  Any minibatch entry with less than M blocks of elements of
 *  length D1 * ... * DN will be padded with the corresponding default_value
 *  scalar element along the second dimension.
 * 
 *  Returns:
 *  * {@code OutputList} sparse_indices
 *  * {@code OutputList} sparse_values
 *  * {@code OutputList} sparse_shapes
 *  * {@code OutputList} dense_values */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ParseExample extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParseExample(Pointer p) { super(p); }

  public ParseExample(@Const @ByRef Scope scope, @ByVal Input serialized,
               @ByVal Input names, @ByVal InputList sparse_keys,
               @ByVal InputList dense_keys, @ByVal InputList dense_defaults, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector sparse_types, @ArraySlice PartialTensorShape dense_shapes) { super((Pointer)null); allocate(scope, serialized, names, sparse_keys, dense_keys, dense_defaults, sparse_types, dense_shapes); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input serialized,
               @ByVal Input names, @ByVal InputList sparse_keys,
               @ByVal InputList dense_keys, @ByVal InputList dense_defaults, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector sparse_types, @ArraySlice PartialTensorShape dense_shapes);

  public native @ByRef Operation operation(); public native ParseExample operation(Operation operation);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector sparse_indices(); public native ParseExample sparse_indices(OutputVector sparse_indices);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector sparse_values(); public native ParseExample sparse_values(OutputVector sparse_values);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector sparse_shapes(); public native ParseExample sparse_shapes(OutputVector sparse_shapes);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector dense_values(); public native ParseExample dense_values(OutputVector dense_values);
}
