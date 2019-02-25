// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Runtime statistics collected by an allocator.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AllocatorStats extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AllocatorStats(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AllocatorStats(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AllocatorStats position(long position) {
        return (AllocatorStats)super.position(position);
    }

  public native @Cast("tensorflow::int64") long num_allocs(); public native AllocatorStats num_allocs(long num_allocs);        // Number of allocations.
  public native @Cast("tensorflow::int64") long bytes_in_use(); public native AllocatorStats bytes_in_use(long bytes_in_use);      // Number of bytes in use.
  public native @Cast("tensorflow::int64") long max_bytes_in_use(); public native AllocatorStats max_bytes_in_use(long max_bytes_in_use);  // The maximum bytes in use.
  public native @Cast("tensorflow::int64") long max_alloc_size(); public native AllocatorStats max_alloc_size(long max_alloc_size);    // The max single allocation seen.

  // The upper limit what the allocator can allocate, if such a limit
  // is known. Certain allocator may return 0 to indicate the limit is
  // unknown.
  public native @Cast("tensorflow::int64") long bytes_limit(); public native AllocatorStats bytes_limit(long bytes_limit);

  public AllocatorStats() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native void Clear();
  public native @StdString BytePointer DebugString();
}
