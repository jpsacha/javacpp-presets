// Targeted by JavaCPP version 1.4.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.cuda.*;

public class nvgraph extends org.bytedeco.javacpp.presets.nvgraph {
    static { Loader.load(); }

// Parsed from <nvgraph.h>

/*
 * Copyright (c) 2016, NVIDIA CORPORATION.  All rights reserved.
 *
 * NVIDIA CORPORATION and its licensors retain all intellectual property
 * and proprietary rights in and to this software, related documentation
 * and any modifications thereto.  Any use, reproduction, disclosure or
 * distribution of this software and related documentation without an express
 * license agreement from NVIDIA CORPORATION is strictly prohibited.
 *
 */

// #ifndef _NVGRAPH_H_
// #define _NVGRAPH_H_

// #include "stddef.h"
// #include "cuda_runtime_api.h"
// #include <library_types.h>

// #include "stdint.h"

// #ifndef NVGRAPH_API
// #ifdef _WIN32
// #define NVGRAPH_API __stdcall
// #else
// #define NVGRAPH_API
// #endif
// #endif

// #ifdef __cplusplus
// #endif

/* nvGRAPH status type returns */
/** enum nvgraphStatus_t */
public static final int
    NVGRAPH_STATUS_SUCCESS            = 0,
    NVGRAPH_STATUS_NOT_INITIALIZED    = 1,
    NVGRAPH_STATUS_ALLOC_FAILED       = 2,
    NVGRAPH_STATUS_INVALID_VALUE      = 3,
    NVGRAPH_STATUS_ARCH_MISMATCH      = 4,
    NVGRAPH_STATUS_MAPPING_ERROR      = 5,
    NVGRAPH_STATUS_EXECUTION_FAILED   = 6,
    NVGRAPH_STATUS_INTERNAL_ERROR     = 7,
    NVGRAPH_STATUS_TYPE_NOT_SUPPORTED = 8,
    NVGRAPH_STATUS_NOT_CONVERGED      = 9,
    NVGRAPH_STATUS_GRAPH_TYPE_NOT_SUPPORTED = 10;

public static native @Cast("const char*") BytePointer nvgraphStatusGetString( @Cast("nvgraphStatus_t") int status);

/* Opaque structure holding nvGRAPH library context */
@Opaque public static class nvgraphContext extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public nvgraphContext() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvgraphContext(Pointer p) { super(p); }
}

/* Opaque structure holding the graph descriptor */
@Opaque public static class nvgraphGraphDescr extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public nvgraphGraphDescr() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvgraphGraphDescr(Pointer p) { super(p); }
}

/* Semi-ring types */
/** enum nvgraphSemiring_t */
public static final int
   NVGRAPH_PLUS_TIMES_SR = 0,
   NVGRAPH_MIN_PLUS_SR   = 1,
   NVGRAPH_MAX_MIN_SR    = 2,
   NVGRAPH_OR_AND_SR     = 3;

/* Topology types */
/** enum nvgraphTopologyType_t */
public static final int
   NVGRAPH_CSR_32 = 0,
   NVGRAPH_CSC_32 = 1,
   NVGRAPH_COO_32 = 2;

/** enum nvgraphTag_t */
public static final int
   NVGRAPH_DEFAULT                = 0,  // Default is unsorted.
   NVGRAPH_UNSORTED               = 1,  //
   NVGRAPH_SORTED_BY_SOURCE       = 2,  // CSR
   NVGRAPH_SORTED_BY_DESTINATION  = 3;   // CSC

/** enum nvgraphSemiringOps_t */
public static final int
  NVGRAPH_MULTIPLY                = 0,
  NVGRAPH_SUM                     = 1,
  NVGRAPH_MIN                     = 2,
  NVGRAPH_MAX                     = 3;

/** enum nvgraphSpectralClusteringType_t */
public static final int
  NVGRAPH_MODULARITY_MAXIMIZATION  = 0, //maximize modularity with Lanczos solver  
  NVGRAPH_BALANCED_CUT_LANCZOS = 1, //minimize balanced cut with Lanczos solver  
 NVGRAPH_BALANCED_CUT_LOBPCG = 2; //minimize balanced cut with LOPCG solver  

public static class SpectralClusteringParameter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SpectralClusteringParameter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SpectralClusteringParameter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SpectralClusteringParameter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SpectralClusteringParameter position(long position) {
        return (SpectralClusteringParameter)super.position(position);
    }

       public native int n_clusters(); public native SpectralClusteringParameter n_clusters(int n_clusters); //number of clusters
       public native int n_eig_vects(); public native SpectralClusteringParameter n_eig_vects(int n_eig_vects); // //number of eigenvectors
       public native @Cast("nvgraphSpectralClusteringType_t") int algorithm(); public native SpectralClusteringParameter algorithm(int algorithm); // algorithm to use
       public native float evs_tolerance(); public native SpectralClusteringParameter evs_tolerance(float evs_tolerance); // tolerance of the eigensolver
       public native int evs_max_iter(); public native SpectralClusteringParameter evs_max_iter(int evs_max_iter); // maximum number of iterations of the eigensolver
       public native float kmean_tolerance(); public native SpectralClusteringParameter kmean_tolerance(float kmean_tolerance); // tolerance of kmeans
       public native int kmean_max_iter(); public native SpectralClusteringParameter kmean_max_iter(int kmean_max_iter); // maximum number of iterations of kemeans 
       public native Pointer opt(); public native SpectralClusteringParameter opt(Pointer opt); // optional parameter that can be used for preconditioning in the future
}

/** enum nvgraphClusteringMetric_t */
public static final int
NVGRAPH_MODULARITY = 0,  // clustering score telling how good the clustering is compared to random assignment.
NVGRAPH_EDGE_CUT = 1,  // total number of edges between clusters.
NVGRAPH_RATIO_CUT = 2; // sum for all clusters of the number of edges going outside of the cluster divided by the number of vertex inside the cluster

public static class nvgraphCSRTopology32I_st extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvgraphCSRTopology32I_st() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvgraphCSRTopology32I_st(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvgraphCSRTopology32I_st(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvgraphCSRTopology32I_st position(long position) {
        return (nvgraphCSRTopology32I_st)super.position(position);
    }

  public native int nvertices(); public native nvgraphCSRTopology32I_st nvertices(int nvertices); // n+1
  public native int nedges(); public native nvgraphCSRTopology32I_st nedges(int nedges); // nnz
  public native IntPointer source_offsets(); public native nvgraphCSRTopology32I_st source_offsets(IntPointer source_offsets); // rowPtr
  public native IntPointer destination_indices(); public native nvgraphCSRTopology32I_st destination_indices(IntPointer destination_indices); // colInd
}

public static class nvgraphCSCTopology32I_st extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvgraphCSCTopology32I_st() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvgraphCSCTopology32I_st(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvgraphCSCTopology32I_st(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvgraphCSCTopology32I_st position(long position) {
        return (nvgraphCSCTopology32I_st)super.position(position);
    }

  public native int nvertices(); public native nvgraphCSCTopology32I_st nvertices(int nvertices); // n+1
  public native int nedges(); public native nvgraphCSCTopology32I_st nedges(int nedges); // nnz
  public native IntPointer destination_offsets(); public native nvgraphCSCTopology32I_st destination_offsets(IntPointer destination_offsets); // colPtr
  public native IntPointer source_indices(); public native nvgraphCSCTopology32I_st source_indices(IntPointer source_indices); // rowInd
}

public static class nvgraphCOOTopology32I_st extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvgraphCOOTopology32I_st() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvgraphCOOTopology32I_st(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvgraphCOOTopology32I_st(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvgraphCOOTopology32I_st position(long position) {
        return (nvgraphCOOTopology32I_st)super.position(position);
    }

  public native int nvertices(); public native nvgraphCOOTopology32I_st nvertices(int nvertices); // n+1
  public native int nedges(); public native nvgraphCOOTopology32I_st nedges(int nedges); // nnz
  public native IntPointer source_indices(); public native nvgraphCOOTopology32I_st source_indices(IntPointer source_indices); // rowInd
  public native IntPointer destination_indices(); public native nvgraphCOOTopology32I_st destination_indices(IntPointer destination_indices); // colInd
  public native @Cast("nvgraphTag_t") int tag(); public native nvgraphCOOTopology32I_st tag(int tag);
}
/* Return properties values for the nvGraph library, such as library version */
public static native @Cast("nvgraphStatus_t") int nvgraphGetProperty(@Cast("libraryPropertyType") int type, IntPointer value);
public static native @Cast("nvgraphStatus_t") int nvgraphGetProperty(@Cast("libraryPropertyType") int type, IntBuffer value);
public static native @Cast("nvgraphStatus_t") int nvgraphGetProperty(@Cast("libraryPropertyType") int type, int[] value);

/* Open the library and create the handle */
public static native @Cast("nvgraphStatus_t") int nvgraphCreate(@ByPtrPtr nvgraphContext handle);
public static native @Cast("nvgraphStatus_t") int nvgraphCreate(@Cast("nvgraphContext**") PointerPointer handle);

/*  Close the library and destroy the handle  */
public static native @Cast("nvgraphStatus_t") int nvgraphDestroy(nvgraphContext handle);

/* Create an empty graph descriptor */
public static native @Cast("nvgraphStatus_t") int nvgraphCreateGraphDescr(nvgraphContext handle, @ByPtrPtr nvgraphGraphDescr descrG);
public static native @Cast("nvgraphStatus_t") int nvgraphCreateGraphDescr(nvgraphContext handle, @Cast("nvgraphGraphDescr**") PointerPointer descrG);

/* Destroy a graph descriptor */
public static native @Cast("nvgraphStatus_t") int nvgraphDestroyGraphDescr(nvgraphContext handle, nvgraphGraphDescr descrG);

/* Set size, topology data in the graph descriptor  */
public static native @Cast("nvgraphStatus_t") int nvgraphSetGraphStructure(nvgraphContext handle, nvgraphGraphDescr descrG, Pointer topologyData, @Cast("nvgraphTopologyType_t") int TType);

/* Query size and topology information from the graph descriptor */
public static native @Cast("nvgraphStatus_t") int nvgraphGetGraphStructure(nvgraphContext handle, nvgraphGraphDescr descrG, Pointer topologyData, @Cast("nvgraphTopologyType_t*") IntPointer TType);
public static native @Cast("nvgraphStatus_t") int nvgraphGetGraphStructure(nvgraphContext handle, nvgraphGraphDescr descrG, Pointer topologyData, @Cast("nvgraphTopologyType_t*") IntBuffer TType);
public static native @Cast("nvgraphStatus_t") int nvgraphGetGraphStructure(nvgraphContext handle, nvgraphGraphDescr descrG, Pointer topologyData, @Cast("nvgraphTopologyType_t*") int[] TType);

/* Allocate numsets vectors of size V reprensenting Vertex Data and attached them the graph.
 * settypes[i] is the type of vector #i, currently all Vertex and Edge data should have the same type */
public static native @Cast("nvgraphStatus_t") int nvgraphAllocateVertexData(nvgraphContext handle, nvgraphGraphDescr descrG, @Cast("size_t") long numsets, @Cast("cudaDataType_t*") IntPointer settypes);
public static native @Cast("nvgraphStatus_t") int nvgraphAllocateVertexData(nvgraphContext handle, nvgraphGraphDescr descrG, @Cast("size_t") long numsets, @Cast("cudaDataType_t*") IntBuffer settypes);
public static native @Cast("nvgraphStatus_t") int nvgraphAllocateVertexData(nvgraphContext handle, nvgraphGraphDescr descrG, @Cast("size_t") long numsets, @Cast("cudaDataType_t*") int[] settypes);

/* Allocate numsets vectors of size E reprensenting Edge Data and attached them the graph.
 * settypes[i] is the type of vector #i, currently all Vertex and Edge data should have the same type */
public static native @Cast("nvgraphStatus_t") int nvgraphAllocateEdgeData(nvgraphContext handle, nvgraphGraphDescr descrG, @Cast("size_t") long numsets, @Cast("cudaDataType_t*") IntPointer settypes);
public static native @Cast("nvgraphStatus_t") int nvgraphAllocateEdgeData(nvgraphContext handle, nvgraphGraphDescr descrG, @Cast("size_t") long numsets, @Cast("cudaDataType_t*") IntBuffer settypes);
public static native @Cast("nvgraphStatus_t") int nvgraphAllocateEdgeData(nvgraphContext handle, nvgraphGraphDescr descrG, @Cast("size_t") long numsets, @Cast("cudaDataType_t*") int[] settypes);

/* Update the vertex set #setnum with the data in *vertexData, sets have 0-based index
 *  Conversions are not sopported so nvgraphTopologyType_t should match the graph structure */
public static native @Cast("nvgraphStatus_t") int nvgraphSetVertexData(nvgraphContext handle, nvgraphGraphDescr descrG, Pointer vertexData, @Cast("size_t") long setnum);

/* Copy the edge set #setnum in *edgeData, sets have 0-based index
 *  Conversions are not sopported so nvgraphTopologyType_t should match the graph structure */
public static native @Cast("nvgraphStatus_t") int nvgraphGetVertexData(nvgraphContext handle, nvgraphGraphDescr descrG, Pointer vertexData, @Cast("size_t") long setnum);

/* Convert the edge data to another topology
 */
public static native @Cast("nvgraphStatus_t") int nvgraphConvertTopology(nvgraphContext handle,
                                @Cast("nvgraphTopologyType_t") int srcTType, Pointer srcTopology, Pointer srcEdgeData, @Cast("cudaDataType_t*") IntPointer dataType,
                                @Cast("nvgraphTopologyType_t") int dstTType, Pointer dstTopology, Pointer dstEdgeData);
public static native @Cast("nvgraphStatus_t") int nvgraphConvertTopology(nvgraphContext handle,
                                @Cast("nvgraphTopologyType_t") int srcTType, Pointer srcTopology, Pointer srcEdgeData, @Cast("cudaDataType_t*") IntBuffer dataType,
                                @Cast("nvgraphTopologyType_t") int dstTType, Pointer dstTopology, Pointer dstEdgeData);
public static native @Cast("nvgraphStatus_t") int nvgraphConvertTopology(nvgraphContext handle,
                                @Cast("nvgraphTopologyType_t") int srcTType, Pointer srcTopology, Pointer srcEdgeData, @Cast("cudaDataType_t*") int[] dataType,
                                @Cast("nvgraphTopologyType_t") int dstTType, Pointer dstTopology, Pointer dstEdgeData);

/* Convert graph to another structure
 */
public static native @Cast("nvgraphStatus_t") int nvgraphConvertGraph(nvgraphContext handle, nvgraphGraphDescr srcDescrG, nvgraphGraphDescr dstDescrG, @Cast("nvgraphTopologyType_t") int dstTType);

/* Update the edge set #setnum with the data in *edgeData, sets have 0-based index
 */
public static native @Cast("nvgraphStatus_t") int nvgraphSetEdgeData(nvgraphContext handle, nvgraphGraphDescr descrG, Pointer edgeData, @Cast("size_t") long setnum);

/* Copy the edge set #setnum in *edgeData, sets have 0-based index
 */
public static native @Cast("nvgraphStatus_t") int nvgraphGetEdgeData(nvgraphContext handle, nvgraphGraphDescr descrG, Pointer edgeData, @Cast("size_t") long setnum);

/* create a new graph by extracting a subgraph given a list of vertices
 */
public static native @Cast("nvgraphStatus_t") int nvgraphExtractSubgraphByVertex(nvgraphContext handle, nvgraphGraphDescr descrG, nvgraphGraphDescr subdescrG, IntPointer subvertices, @Cast("size_t") long numvertices );
public static native @Cast("nvgraphStatus_t") int nvgraphExtractSubgraphByVertex(nvgraphContext handle, nvgraphGraphDescr descrG, nvgraphGraphDescr subdescrG, IntBuffer subvertices, @Cast("size_t") long numvertices );
public static native @Cast("nvgraphStatus_t") int nvgraphExtractSubgraphByVertex(nvgraphContext handle, nvgraphGraphDescr descrG, nvgraphGraphDescr subdescrG, int[] subvertices, @Cast("size_t") long numvertices );
/* create a new graph by extracting a subgraph given a list of edges
 */
public static native @Cast("nvgraphStatus_t") int nvgraphExtractSubgraphByEdge( nvgraphContext handle, nvgraphGraphDescr descrG, nvgraphGraphDescr subdescrG, IntPointer subedges, @Cast("size_t") long numedges);
public static native @Cast("nvgraphStatus_t") int nvgraphExtractSubgraphByEdge( nvgraphContext handle, nvgraphGraphDescr descrG, nvgraphGraphDescr subdescrG, IntBuffer subedges, @Cast("size_t") long numedges);
public static native @Cast("nvgraphStatus_t") int nvgraphExtractSubgraphByEdge( nvgraphContext handle, nvgraphGraphDescr descrG, nvgraphGraphDescr subdescrG, int[] subedges, @Cast("size_t") long numedges);

/* nvGRAPH Semi-ring sparse matrix vector multiplication
 */
public static native @Cast("nvgraphStatus_t") int nvgraphSrSpmv(nvgraphContext handle,
                                 nvgraphGraphDescr descrG,
                                 @Cast("const size_t") long weight_index,
                                 @Const Pointer alpha,
                                 @Cast("const size_t") long x_index,
                                 @Const Pointer beta,
                                 @Cast("const size_t") long y_index,
                                 @Cast("const nvgraphSemiring_t") int SR);

/* Helper struct for Traversal parameters
 */
public static class nvgraphTraversalParameter_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvgraphTraversalParameter_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvgraphTraversalParameter_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvgraphTraversalParameter_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvgraphTraversalParameter_t position(long position) {
        return (nvgraphTraversalParameter_t)super.position(position);
    }

	public native @Cast("size_t") long pad(int i); public native nvgraphTraversalParameter_t pad(int i, long pad);
	@MemberGetter public native @Cast("size_t*") SizeTPointer pad();
} 


/* Initializes traversal parameters with default values
 */
public static native @Cast("nvgraphStatus_t") int nvgraphTraversalParameterInit(nvgraphTraversalParameter_t param);

/* Stores/retrieves index of a vertex data where target distances will be stored 
 */ 
public static native @Cast("nvgraphStatus_t") int nvgraphTraversalSetDistancesIndex(nvgraphTraversalParameter_t param, @Cast("const size_t") long value);

public static native @Cast("nvgraphStatus_t") int nvgraphTraversalGetDistancesIndex(@Const @ByVal nvgraphTraversalParameter_t param, @Cast("size_t*") SizeTPointer value);

/* Stores/retrieves index of a vertex data where path predecessors will be stored
 */
public static native @Cast("nvgraphStatus_t") int nvgraphTraversalSetPredecessorsIndex(nvgraphTraversalParameter_t param, @Cast("const size_t") long value);

public static native @Cast("nvgraphStatus_t") int nvgraphTraversalGetPredecessorsIndex(@Const @ByVal nvgraphTraversalParameter_t param, @Cast("size_t*") SizeTPointer value);

/* Stores/retrieves index of an edge data which tells traversal algorithm whether path can go through an edge or not
 */
public static native @Cast("nvgraphStatus_t") int nvgraphTraversalSetEdgeMaskIndex(nvgraphTraversalParameter_t param, @Cast("const size_t") long value);

public static native @Cast("nvgraphStatus_t") int nvgraphTraversalGetEdgeMaskIndex(@Const @ByVal nvgraphTraversalParameter_t param, @Cast("size_t*") SizeTPointer value);

/* Stores/retrieves flag that tells an algorithm whether the graph is directed or not
 */
public static native @Cast("nvgraphStatus_t") int nvgraphTraversalSetUndirectedFlag(nvgraphTraversalParameter_t param, @Cast("const size_t") long value);

public static native @Cast("nvgraphStatus_t") int nvgraphTraversalGetUndirectedFlag(@Const @ByVal nvgraphTraversalParameter_t param, @Cast("size_t*") SizeTPointer value);

/* Stores/retrieves 'alpha' and 'beta' parameters for BFS traversal algorithm
 */










//Traversal available
/** enum nvgraphTraversal_t */
public static final int
	NVGRAPH_TRAVERSAL_BFS = 0;


/* nvGRAPH Traversal API
 * Compute a traversal of the graph from a single vertex using algorithm specified by traversalT parameter
 */
public static native @Cast("nvgraphStatus_t") int nvgraphTraversal(nvgraphContext handle,
                               nvgraphGraphDescr descrG,
                               @Cast("const nvgraphTraversal_t") int traversalT,
			       @Const IntPointer source_vert,
			       @Const @ByVal nvgraphTraversalParameter_t params);
public static native @Cast("nvgraphStatus_t") int nvgraphTraversal(nvgraphContext handle,
                               nvgraphGraphDescr descrG,
                               @Cast("const nvgraphTraversal_t") int traversalT,
			       @Const IntBuffer source_vert,
			       @Const @ByVal nvgraphTraversalParameter_t params);
public static native @Cast("nvgraphStatus_t") int nvgraphTraversal(nvgraphContext handle,
                               nvgraphGraphDescr descrG,
                               @Cast("const nvgraphTraversal_t") int traversalT,
			       @Const int[] source_vert,
			       @Const @ByVal nvgraphTraversalParameter_t params);

/* nvGRAPH Single Source Shortest Path (SSSP)
 * Calculate the shortest path distance from a single vertex in the graph to all other vertices.
 */
public static native @Cast("nvgraphStatus_t") int nvgraphSssp(nvgraphContext handle,
                               nvgraphGraphDescr descrG,
                               @Cast("const size_t") long weight_index,
                               @Const IntPointer source_vert,
                               @Cast("const size_t") long sssp_index);
public static native @Cast("nvgraphStatus_t") int nvgraphSssp(nvgraphContext handle,
                               nvgraphGraphDescr descrG,
                               @Cast("const size_t") long weight_index,
                               @Const IntBuffer source_vert,
                               @Cast("const size_t") long sssp_index);
public static native @Cast("nvgraphStatus_t") int nvgraphSssp(nvgraphContext handle,
                               nvgraphGraphDescr descrG,
                               @Cast("const size_t") long weight_index,
                               @Const int[] source_vert,
                               @Cast("const size_t") long sssp_index);

/* nvGRAPH WidestPath
 * Find widest path potential from source_index to every other vertices.
 */
public static native @Cast("nvgraphStatus_t") int nvgraphWidestPath(nvgraphContext handle,
                                  nvgraphGraphDescr descrG,
                                  @Cast("const size_t") long weight_index,
                                  @Const IntPointer source_vert,
                                  @Cast("const size_t") long widest_path_index);
public static native @Cast("nvgraphStatus_t") int nvgraphWidestPath(nvgraphContext handle,
                                  nvgraphGraphDescr descrG,
                                  @Cast("const size_t") long weight_index,
                                  @Const IntBuffer source_vert,
                                  @Cast("const size_t") long widest_path_index);
public static native @Cast("nvgraphStatus_t") int nvgraphWidestPath(nvgraphContext handle,
                                  nvgraphGraphDescr descrG,
                                  @Cast("const size_t") long weight_index,
                                  @Const int[] source_vert,
                                  @Cast("const size_t") long widest_path_index);

/* nvGRAPH PageRank
 * Find PageRank for each vertex of a graph with a given transition probabilities, a bookmark vector of dangling vertices, and the damping factor.
 */
public static native @Cast("nvgraphStatus_t") int nvgraphPagerank(nvgraphContext handle,
                                   nvgraphGraphDescr descrG,
                                   @Cast("const size_t") long weight_index,
                                   @Const Pointer alpha,
                                   @Cast("const size_t") long bookmark_index,
                                   int has_guess,
                                   @Cast("const size_t") long pagerank_index,
                                   float tolerance,
                                   int max_iter );

/* nvGRAPH contraction
 * given array of agregates contract graph with 
 * given (Combine, Reduce) operators for Vertex Set
 * and Edge Set;
 */ 
public static native @Cast("nvgraphStatus_t") int nvgraphContractGraph(nvgraphContext handle, 
                                                 nvgraphGraphDescr descrG, 
                                                 nvgraphGraphDescr contrdescrG, 
                                                 IntPointer aggregates, 
                                                 @Cast("size_t") long numaggregates,
                                                 @Cast("nvgraphSemiringOps_t") int VertexCombineOp,
                                                 @Cast("nvgraphSemiringOps_t") int VertexReduceOp,
                                                 @Cast("nvgraphSemiringOps_t") int EdgeCombineOp,
                                                 @Cast("nvgraphSemiringOps_t") int EdgeReduceOp,
                                                 int flag );
public static native @Cast("nvgraphStatus_t") int nvgraphContractGraph(nvgraphContext handle, 
                                                 nvgraphGraphDescr descrG, 
                                                 nvgraphGraphDescr contrdescrG, 
                                                 IntBuffer aggregates, 
                                                 @Cast("size_t") long numaggregates,
                                                 @Cast("nvgraphSemiringOps_t") int VertexCombineOp,
                                                 @Cast("nvgraphSemiringOps_t") int VertexReduceOp,
                                                 @Cast("nvgraphSemiringOps_t") int EdgeCombineOp,
                                                 @Cast("nvgraphSemiringOps_t") int EdgeReduceOp,
                                                 int flag );
public static native @Cast("nvgraphStatus_t") int nvgraphContractGraph(nvgraphContext handle, 
                                                 nvgraphGraphDescr descrG, 
                                                 nvgraphGraphDescr contrdescrG, 
                                                 int[] aggregates, 
                                                 @Cast("size_t") long numaggregates,
                                                 @Cast("nvgraphSemiringOps_t") int VertexCombineOp,
                                                 @Cast("nvgraphSemiringOps_t") int VertexReduceOp,
                                                 @Cast("nvgraphSemiringOps_t") int EdgeCombineOp,
                                                 @Cast("nvgraphSemiringOps_t") int EdgeReduceOp,
                                                 int flag );

/* nvGRAPH spectral clustering
 * given a graph and solver parameters of struct SpectralClusteringParameter, 
 * assign vertices to groups such as 
 * intra-group connections are strong and/or inter-groups connections are weak 
 * using spectral technique.
 */ 
public static native @Cast("nvgraphStatus_t") int nvgraphSpectralClustering(nvgraphContext handle, 
                                   nvgraphGraphDescr graph_descr,
                                   @Cast("const size_t") long weight_index, 
                                   @Const SpectralClusteringParameter params,
                                   IntPointer clustering, 
                                   Pointer eig_vals,  
                                   Pointer eig_vects);
public static native @Cast("nvgraphStatus_t") int nvgraphSpectralClustering(nvgraphContext handle, 
                                   nvgraphGraphDescr graph_descr,
                                   @Cast("const size_t") long weight_index, 
                                   @Const SpectralClusteringParameter params,
                                   IntBuffer clustering, 
                                   Pointer eig_vals,  
                                   Pointer eig_vects);
public static native @Cast("nvgraphStatus_t") int nvgraphSpectralClustering(nvgraphContext handle, 
                                   nvgraphGraphDescr graph_descr,
                                   @Cast("const size_t") long weight_index, 
                                   @Const SpectralClusteringParameter params,
                                   int[] clustering, 
                                   Pointer eig_vals,  
                                   Pointer eig_vects); 

/* nvGRAPH analyze clustering
 * Given a graph, a clustering, and a metric
 * compute the score that measures the clustering quality according to the metric.
 */ 
public static native @Cast("nvgraphStatus_t") int nvgraphAnalyzeClustering( nvgraphContext handle, 
                                  nvgraphGraphDescr graph_descr, 
                                  @Cast("const size_t") long weight_index,
                                  int n_clusters, 
                                  @Const IntPointer clustering,
                                  @Cast("nvgraphClusteringMetric_t") int metric, 
                                  FloatPointer score);
public static native @Cast("nvgraphStatus_t") int nvgraphAnalyzeClustering( nvgraphContext handle, 
                                  nvgraphGraphDescr graph_descr, 
                                  @Cast("const size_t") long weight_index,
                                  int n_clusters, 
                                  @Const IntBuffer clustering,
                                  @Cast("nvgraphClusteringMetric_t") int metric, 
                                  FloatBuffer score);
public static native @Cast("nvgraphStatus_t") int nvgraphAnalyzeClustering( nvgraphContext handle, 
                                  nvgraphGraphDescr graph_descr, 
                                  @Cast("const size_t") long weight_index,
                                  int n_clusters, 
                                  @Const int[] clustering,
                                  @Cast("nvgraphClusteringMetric_t") int metric, 
                                  float[] score); 

/* nvGRAPH Triangles counting
 * count number of triangles (cycles of size 3) formed by graph edges
 */
public static native @Cast("nvgraphStatus_t") int nvgraphTriangleCount(nvgraphContext handle, 
                                   nvgraphGraphDescr graph_descr, 
                                   @Cast("uint64_t*") LongPointer result);
public static native @Cast("nvgraphStatus_t") int nvgraphTriangleCount(nvgraphContext handle, 
                                   nvgraphGraphDescr graph_descr, 
                                   @Cast("uint64_t*") LongBuffer result);
public static native @Cast("nvgraphStatus_t") int nvgraphTriangleCount(nvgraphContext handle, 
                                   nvgraphGraphDescr graph_descr, 
                                   @Cast("uint64_t*") long[] result); 

// #if defined(__cplusplus) /* extern "C" */
// #endif

// #endif /* _NVGRAPH_H_ */



}
