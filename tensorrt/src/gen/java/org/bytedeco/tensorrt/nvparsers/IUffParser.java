// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvparsers;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

import static org.bytedeco.tensorrt.global.nvparsers.*;


/**
 *  \class IUffParser
 * 
 *  \brief Class used for parsing models described using the UFF format.
 *  */
@Namespace("nvuffparser") @Properties(inherit = org.bytedeco.tensorrt.presets.nvparsers.class)
public class IUffParser extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IUffParser(Pointer p) { super(p); }

    /**
     *  \brief Register an input name of a UFF network with the associated Dimensions.
     * 
     *  @param inputName Input name.
     *  @param inputDims Input Dimensions, always provide your dimensions in CHW even if your network
     *                   input was in HWC in yout original framework.
     *  @param inputOrder Input order on which the framework input was originally.
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("bool") boolean registerInput(String inputName, @ByVal Dims inputDims, UffInputOrder inputOrder);
    public native @Cast("bool") boolean registerInput(@Cast("const char*") BytePointer inputName, @ByVal Dims inputDims, @Cast("nvuffparser::UffInputOrder") int inputOrder);

    /**
     *  \brief Register an output name of a UFF network.
     * 
     *  @param outputName Output name.
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("bool") boolean registerOutput(String outputName);
    public native @Cast("bool") boolean registerOutput(@Cast("const char*") BytePointer outputName);

    /**
     *  \brief Parse a UFF file.
     * 
     *  @param file File name of the UFF file.
     *  @param network Network in which the UFFParser will fill the layers.
     *  @param weightsType The type on which the weights will transformed in.
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("bool") boolean parse(String file,
                           @ByRef INetworkDefinition network,
                           DataType weightsType/*=nvinfer1::DataType::kFLOAT*/);
    public native @Cast("bool") boolean parse(String file,
                           @ByRef INetworkDefinition network);
    public native @Cast("bool") boolean parse(@Cast("const char*") BytePointer file,
                           @ByRef INetworkDefinition network,
                           @Cast("nvinfer1::DataType") int weightsType/*=nvinfer1::DataType::kFLOAT*/);
    public native @Cast("bool") boolean parse(@Cast("const char*") BytePointer file,
                           @ByRef INetworkDefinition network);

    /**
     *  \brief Parse a UFF buffer, useful if the file already live in memory.
     * 
     *  @param buffer Buffer of the UFF file.
     *  @param size Size of buffer of the UFF file.
     *  @param network Network in which the UFFParser will fill the layers.
     *  @param weightsType The type on which the weights will transformed in.
     *  */
    public native @Cast("bool") boolean parseBuffer(String buffer, @Cast("std::size_t") long size,
                                 @ByRef INetworkDefinition network,
                                 DataType weightsType/*=nvinfer1::DataType::kFLOAT*/);
    public native @Cast("bool") boolean parseBuffer(String buffer, @Cast("std::size_t") long size,
                                 @ByRef INetworkDefinition network);
    public native @Cast("bool") boolean parseBuffer(@Cast("const char*") BytePointer buffer, @Cast("std::size_t") long size,
                                 @ByRef INetworkDefinition network,
                                 @Cast("nvinfer1::DataType") int weightsType/*=nvinfer1::DataType::kFLOAT*/);
    public native @Cast("bool") boolean parseBuffer(@Cast("const char*") BytePointer buffer, @Cast("std::size_t") long size,
                                 @ByRef INetworkDefinition network);

    
    
    //!
    //!
    public native void destroy();

    /**
     *  \brief Return Version Major of the UFF.
     *  */
    
    
    //!
    //!
    public native int getUffRequiredVersionMajor();

    /**
     *  \brief Return Version Minor of the UFF.
     *  */
    
    
    //!
    //!
    public native int getUffRequiredVersionMinor();

    /**
     *  \brief Return Patch Version of the UFF.
     *  */
    
    
    //!
    //!
    //!
    public native int getUffRequiredVersionPatch();

    /**
     *  \brief Set the IPluginFactory used to create the user defined plugins.
     * 
     *  @param factory Pointer to an instance of the user implmentation of IPluginFactory.
     *  */
    
    
    //!
    //!
    //!
    public native void setPluginFactory(IUffPluginFactory factory);

    /**
     *  \brief Set the IPluginFactoryExt used to create the user defined pluginExts.
     * 
     *  @param factory Pointer to an instance of the user implmentation of IPluginFactoryExt.
     *  */
    public native void setPluginFactoryExt(IUffPluginFactoryExt factory);
}
