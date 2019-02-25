// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/** \class IConstantLayer
 * 
 *  \brief Layer that represents a constant value.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IConstantLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IConstantLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the weights for the layer.
     * 
     *  @see getWeights()
     *  */
    
    
    //!
    //!
    //!
    public native void setWeights(@ByVal Weights weights);

    /**
     *  \brief Get the weights for the layer.
     * 
     *  @see setWeights
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @ByVal Weights getWeights();

    /**
     *  \brief Set the dimensions for the layer.
     * 
     *  @param dimensions The dimensions of the layer
     * 
     *  @see setDimensions
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void setDimensions(@ByVal Dims dimensions);

    /**
     *  \brief Get the dimensions for the layer.
     * 
     *  @return the dimensions for the layer
     * 
     *  @see getDimensions
     *  */
    public native @ByVal Dims getDimensions();
}
