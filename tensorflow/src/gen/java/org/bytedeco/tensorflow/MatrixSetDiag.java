// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns a batched matrix tensor with new batched diagonal values.
 * 
 *  Given {@code input} and {@code diagonal}, this operation returns a tensor with the
 *  same shape and values as {@code input}, except for the main diagonal of the
 *  innermost matrices.  These will be overwritten by the values in {@code diagonal}.
 * 
 *  The output is computed as follows:
 * 
 *  Assume {@code input} has {@code k+1} dimensions {@code [I, J, K, ..., M, N]} and {@code diagonal} has
 *  {@code k} dimensions {@code [I, J, K, ..., min(M, N)]}.  Then the output is a
 *  tensor of rank {@code k+1} with dimensions {@code [I, J, K, ..., M, N]} where:
 * 
 *    * {@code output[i, j, k, ..., m, n] = diagonal[i, j, k, ..., n]} for {@code m == n}.
 *    * {@code output[i, j, k, ..., m, n] = input[i, j, k, ..., m, n]} for {@code m != n}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Rank {@code k+1}, where {@code k >= 1}.
 *  * diagonal: Rank {@code k}, where {@code k >= 1}.
 * 
 *  Returns:
 *  * {@code Output}: Rank {@code k+1}, with {@code output.shape = input.shape}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MatrixSetDiag extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatrixSetDiag(Pointer p) { super(p); }

  public MatrixSetDiag(@Const @ByRef Scope scope, @ByVal Input input,
                @ByVal Input diagonal) { super((Pointer)null); allocate(scope, input, diagonal); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                @ByVal Input diagonal);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native MatrixSetDiag operation(Operation operation);
  public native @ByRef Output output(); public native MatrixSetDiag output(Output output);
}
