// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class Dims4
 *  \brief Descriptor for four-dimensional data.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class Dims4 extends Dims {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dims4(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Dims4(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Dims4 position(long position) {
        return (Dims4)super.position(position);
    }

    /**
     *  \brief Construct an empty Dims2 object.
     *  */
    
    
    //!
    //!
    //!
    public Dims4() { super((Pointer)null); allocate(); }
    private native void allocate();

    /**
     *  \brief Construct a Dims4 from 4 elements.
     * 
     *  @param d0 The first element.
     *  @param d1 The second element.
     *  @param d2 The third element.
     *  @param d3 The fourth element.
     *  */
    public Dims4(int d0, int d1, int d2, int d3) { super((Pointer)null); allocate(d0, d1, d2, d3); }
    private native void allocate(int d0, int d1, int d2, int d3);
}
