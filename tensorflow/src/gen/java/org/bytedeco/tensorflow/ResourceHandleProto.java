// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ResourceHandleProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ResourceHandleProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ResourceHandleProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ResourceHandleProto position(long position) {
        return (ResourceHandleProto)super.position(position);
    }

  public ResourceHandleProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ResourceHandleProto(@Const @ByRef ResourceHandleProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ResourceHandleProto from);

  public native @ByRef @Name("operator =") ResourceHandleProto put(@Const @ByRef ResourceHandleProto from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef ResourceHandleProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ResourceHandleProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(ResourceHandleProto other);
  public native void Swap(ResourceHandleProto other);
  

  // implements Message ----------------------------------------------

  public native ResourceHandleProto New();

  public native ResourceHandleProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef ResourceHandleProto from);
  public native void MergeFrom(@Const @ByRef ResourceHandleProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // string device = 1;
  public native void clear_device();
  @MemberGetter public static native int kDeviceFieldNumber();
  public static final int kDeviceFieldNumber = kDeviceFieldNumber();
  public native @StdString BytePointer device();
  public native void set_device(@StdString BytePointer value);
  public native void set_device(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_device(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_device(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_device();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_device();
  public native void set_allocated_device(@StdString @Cast({"char*", "std::string*"}) BytePointer device);
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_device();
  public native @Deprecated void unsafe_arena_set_allocated_device(
        @StdString @Cast({"char*", "std::string*"}) BytePointer device);

  // string container = 2;
  public native void clear_container();
  @MemberGetter public static native int kContainerFieldNumber();
  public static final int kContainerFieldNumber = kContainerFieldNumber();
  public native @StdString BytePointer container();
  public native void set_container(@StdString BytePointer value);
  public native void set_container(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_container(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_container(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_container();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_container();
  public native void set_allocated_container(@StdString @Cast({"char*", "std::string*"}) BytePointer container);
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_container();
  public native @Deprecated void unsafe_arena_set_allocated_container(
        @StdString @Cast({"char*", "std::string*"}) BytePointer container);

  // string name = 3;
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_name();
  public native @Deprecated void unsafe_arena_set_allocated_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // string maybe_type_name = 5;
  public native void clear_maybe_type_name();
  @MemberGetter public static native int kMaybeTypeNameFieldNumber();
  public static final int kMaybeTypeNameFieldNumber = kMaybeTypeNameFieldNumber();
  public native @StdString BytePointer maybe_type_name();
  public native void set_maybe_type_name(@StdString BytePointer value);
  public native void set_maybe_type_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_maybe_type_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_maybe_type_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_maybe_type_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_maybe_type_name();
  public native void set_allocated_maybe_type_name(@StdString @Cast({"char*", "std::string*"}) BytePointer maybe_type_name);
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_maybe_type_name();
  public native @Deprecated void unsafe_arena_set_allocated_maybe_type_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer maybe_type_name);

  // uint64 hash_code = 4;
  public native void clear_hash_code();
  @MemberGetter public static native int kHashCodeFieldNumber();
  public static final int kHashCodeFieldNumber = kHashCodeFieldNumber();
  public native @Cast("google::protobuf::uint64") long hash_code();
  public native void set_hash_code(@Cast("google::protobuf::uint64") long value);
}
