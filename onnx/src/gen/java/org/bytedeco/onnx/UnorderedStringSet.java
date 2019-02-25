// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;

@Name("std::unordered_set<std::string>") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class UnorderedStringSet extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnorderedStringSet(Pointer p) { super(p); }
    public UnorderedStringSet()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef UnorderedStringSet put(@ByRef UnorderedStringSet x);

    public boolean empty() { return size() == 0; }
    public native long size();

    public native void insert(@StdString BytePointer value);
    public native void erase(@StdString BytePointer value);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") @StdString BytePointer get();
    }
}

