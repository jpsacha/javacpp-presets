// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mxnet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;

import static org.bytedeco.mxnet.global.mxnet.*;


@Properties(inherit = org.bytedeco.mxnet.presets.mxnet.class)
public class NativeOpInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NativeOpInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NativeOpInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NativeOpInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NativeOpInfo position(long position) {
        return (NativeOpInfo)super.position(position);
    }

  public static class Forward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Forward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer(Pointer p) { super(p); }
      protected Forward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer() { allocate(); }
      private native void allocate();
      public native void call(int arg0, @Cast("float**") PointerPointer arg1, IntPointer arg2, @Cast("unsigned**") PointerPointer arg3, IntPointer arg4, Pointer arg5);
  }
  public native Forward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer forward(); public native NativeOpInfo forward(Forward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer forward);
  public static class Backward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Backward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer(Pointer p) { super(p); }
      protected Backward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer() { allocate(); }
      private native void allocate();
      public native void call(int arg0, @Cast("float**") PointerPointer arg1, IntPointer arg2, @Cast("unsigned**") PointerPointer arg3, IntPointer arg4, Pointer arg5);
  }
  public native Backward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer backward(); public native NativeOpInfo backward(Backward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer backward);
  public static class Infer_shape_int_IntPointer_PointerPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Infer_shape_int_IntPointer_PointerPointer_Pointer(Pointer p) { super(p); }
      protected Infer_shape_int_IntPointer_PointerPointer_Pointer() { allocate(); }
      private native void allocate();
      public native void call(int arg0, IntPointer arg1, @Cast("unsigned**") PointerPointer arg2, Pointer arg3);
  }
  public native Infer_shape_int_IntPointer_PointerPointer_Pointer infer_shape(); public native NativeOpInfo infer_shape(Infer_shape_int_IntPointer_PointerPointer_Pointer infer_shape);
  public static class List_outputs_PointerPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    List_outputs_PointerPointer_Pointer(Pointer p) { super(p); }
      protected List_outputs_PointerPointer_Pointer() { allocate(); }
      private native void allocate();
      public native void call(@Cast("char***") @ByPtrPtr PointerPointer arg0, Pointer arg1);
  }
  public native List_outputs_PointerPointer_Pointer list_outputs(); public native NativeOpInfo list_outputs(List_outputs_PointerPointer_Pointer list_outputs);
  public static class List_arguments_PointerPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    List_arguments_PointerPointer_Pointer(Pointer p) { super(p); }
      protected List_arguments_PointerPointer_Pointer() { allocate(); }
      private native void allocate();
      public native void call(@Cast("char***") @ByPtrPtr PointerPointer arg0, Pointer arg1);
  }
  public native List_arguments_PointerPointer_Pointer list_arguments(); public native NativeOpInfo list_arguments(List_arguments_PointerPointer_Pointer list_arguments);
  // all functions also pass a payload void* pointer
  public native Pointer p_forward(); public native NativeOpInfo p_forward(Pointer p_forward);
  public native Pointer p_backward(); public native NativeOpInfo p_backward(Pointer p_backward);
  public native Pointer p_infer_shape(); public native NativeOpInfo p_infer_shape(Pointer p_infer_shape);
  public native Pointer p_list_outputs(); public native NativeOpInfo p_list_outputs(Pointer p_list_outputs);
  public native Pointer p_list_arguments(); public native NativeOpInfo p_list_arguments(Pointer p_list_arguments);
}
