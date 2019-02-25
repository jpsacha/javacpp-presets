// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


            /** \brief Base class for annotations added to graph ops */
            @Namespace("ngraph::op::util") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class OpAnnotations extends Pointer {
                static { Loader.load(); }
                /** Default native constructor. */
                public OpAnnotations() { super((Pointer)null); allocate(); }
                /** Native array allocator. Access with {@link Pointer#position(long)}. */
                public OpAnnotations(long size) { super((Pointer)null); allocateArray(size); }
                /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                public OpAnnotations(Pointer p) { super(p); }
                private native void allocate();
                private native void allocateArray(long size);
                @Override public OpAnnotations position(long position) {
                    return (OpAnnotations)super.position(position);
                }
            

                public native void add_in_place_oi_pair(@Const @ByRef oi_pair oi);

                public native @StdVector oi_pair get_in_place_oi_pairs();

                public native @Cast("bool") boolean is_cacheable();
                public native void set_cacheable(@Cast("bool") boolean val);
            }
