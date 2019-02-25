// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_VXD_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_VXD_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_VXD_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_VXD_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_VXD_HEADER position(long position) {
        return (IMAGE_VXD_HEADER)super.position(position);
    }
      // Windows VXD header
    public native @Cast("WORD") short e32_magic(); public native IMAGE_VXD_HEADER e32_magic(short e32_magic);                   // Magic number
    public native @Cast("BYTE") byte e32_border(); public native IMAGE_VXD_HEADER e32_border(byte e32_border);                  // The byte ordering for the VXD
    public native @Cast("BYTE") byte e32_worder(); public native IMAGE_VXD_HEADER e32_worder(byte e32_worder);                  // The word ordering for the VXD
    public native @Cast("DWORD") int e32_level(); public native IMAGE_VXD_HEADER e32_level(int e32_level);                   // The EXE format level for now = 0
    public native @Cast("WORD") short e32_cpu(); public native IMAGE_VXD_HEADER e32_cpu(short e32_cpu);                     // The CPU type
    public native @Cast("WORD") short e32_os(); public native IMAGE_VXD_HEADER e32_os(short e32_os);                      // The OS type
    public native @Cast("DWORD") int e32_ver(); public native IMAGE_VXD_HEADER e32_ver(int e32_ver);                     // Module version
    public native @Cast("DWORD") int e32_mflags(); public native IMAGE_VXD_HEADER e32_mflags(int e32_mflags);                  // Module flags
    public native @Cast("DWORD") int e32_mpages(); public native IMAGE_VXD_HEADER e32_mpages(int e32_mpages);                  // Module # pages
    public native @Cast("DWORD") int e32_startobj(); public native IMAGE_VXD_HEADER e32_startobj(int e32_startobj);                // Object # for instruction pointer
    public native @Cast("DWORD") int e32_eip(); public native IMAGE_VXD_HEADER e32_eip(int e32_eip);                     // Extended instruction pointer
    public native @Cast("DWORD") int e32_stackobj(); public native IMAGE_VXD_HEADER e32_stackobj(int e32_stackobj);                // Object # for stack pointer
    public native @Cast("DWORD") int e32_esp(); public native IMAGE_VXD_HEADER e32_esp(int e32_esp);                     // Extended stack pointer
    public native @Cast("DWORD") int e32_pagesize(); public native IMAGE_VXD_HEADER e32_pagesize(int e32_pagesize);                // VXD page size
    public native @Cast("DWORD") int e32_lastpagesize(); public native IMAGE_VXD_HEADER e32_lastpagesize(int e32_lastpagesize);            // Last page size in VXD
    public native @Cast("DWORD") int e32_fixupsize(); public native IMAGE_VXD_HEADER e32_fixupsize(int e32_fixupsize);               // Fixup section size
    public native @Cast("DWORD") int e32_fixupsum(); public native IMAGE_VXD_HEADER e32_fixupsum(int e32_fixupsum);                // Fixup section checksum
    public native @Cast("DWORD") int e32_ldrsize(); public native IMAGE_VXD_HEADER e32_ldrsize(int e32_ldrsize);                 // Loader section size
    public native @Cast("DWORD") int e32_ldrsum(); public native IMAGE_VXD_HEADER e32_ldrsum(int e32_ldrsum);                  // Loader section checksum
    public native @Cast("DWORD") int e32_objtab(); public native IMAGE_VXD_HEADER e32_objtab(int e32_objtab);                  // Object table offset
    public native @Cast("DWORD") int e32_objcnt(); public native IMAGE_VXD_HEADER e32_objcnt(int e32_objcnt);                  // Number of objects in module
    public native @Cast("DWORD") int e32_objmap(); public native IMAGE_VXD_HEADER e32_objmap(int e32_objmap);                  // Object page map offset
    public native @Cast("DWORD") int e32_itermap(); public native IMAGE_VXD_HEADER e32_itermap(int e32_itermap);                 // Object iterated data map offset
    public native @Cast("DWORD") int e32_rsrctab(); public native IMAGE_VXD_HEADER e32_rsrctab(int e32_rsrctab);                 // Offset of Resource Table
    public native @Cast("DWORD") int e32_rsrccnt(); public native IMAGE_VXD_HEADER e32_rsrccnt(int e32_rsrccnt);                 // Number of resource entries
    public native @Cast("DWORD") int e32_restab(); public native IMAGE_VXD_HEADER e32_restab(int e32_restab);                  // Offset of resident name table
    public native @Cast("DWORD") int e32_enttab(); public native IMAGE_VXD_HEADER e32_enttab(int e32_enttab);                  // Offset of Entry Table
    public native @Cast("DWORD") int e32_dirtab(); public native IMAGE_VXD_HEADER e32_dirtab(int e32_dirtab);                  // Offset of Module Directive Table
    public native @Cast("DWORD") int e32_dircnt(); public native IMAGE_VXD_HEADER e32_dircnt(int e32_dircnt);                  // Number of module directives
    public native @Cast("DWORD") int e32_fpagetab(); public native IMAGE_VXD_HEADER e32_fpagetab(int e32_fpagetab);                // Offset of Fixup Page Table
    public native @Cast("DWORD") int e32_frectab(); public native IMAGE_VXD_HEADER e32_frectab(int e32_frectab);                 // Offset of Fixup Record Table
    public native @Cast("DWORD") int e32_impmod(); public native IMAGE_VXD_HEADER e32_impmod(int e32_impmod);                  // Offset of Import Module Name Table
    public native @Cast("DWORD") int e32_impmodcnt(); public native IMAGE_VXD_HEADER e32_impmodcnt(int e32_impmodcnt);               // Number of entries in Import Module Name Table
    public native @Cast("DWORD") int e32_impproc(); public native IMAGE_VXD_HEADER e32_impproc(int e32_impproc);                 // Offset of Import Procedure Name Table
    public native @Cast("DWORD") int e32_pagesum(); public native IMAGE_VXD_HEADER e32_pagesum(int e32_pagesum);                 // Offset of Per-Page Checksum Table
    public native @Cast("DWORD") int e32_datapage(); public native IMAGE_VXD_HEADER e32_datapage(int e32_datapage);                // Offset of Enumerated Data Pages
    public native @Cast("DWORD") int e32_preload(); public native IMAGE_VXD_HEADER e32_preload(int e32_preload);                 // Number of preload pages
    public native @Cast("DWORD") int e32_nrestab(); public native IMAGE_VXD_HEADER e32_nrestab(int e32_nrestab);                 // Offset of Non-resident Names Table
    public native @Cast("DWORD") int e32_cbnrestab(); public native IMAGE_VXD_HEADER e32_cbnrestab(int e32_cbnrestab);               // Size of Non-resident Name Table
    public native @Cast("DWORD") int e32_nressum(); public native IMAGE_VXD_HEADER e32_nressum(int e32_nressum);                 // Non-resident Name Table Checksum
    public native @Cast("DWORD") int e32_autodata(); public native IMAGE_VXD_HEADER e32_autodata(int e32_autodata);                // Object # for automatic data object
    public native @Cast("DWORD") int e32_debuginfo(); public native IMAGE_VXD_HEADER e32_debuginfo(int e32_debuginfo);               // Offset of the debugging information
    public native @Cast("DWORD") int e32_debuglen(); public native IMAGE_VXD_HEADER e32_debuglen(int e32_debuglen);                // The length of the debugging info. in bytes
    public native @Cast("DWORD") int e32_instpreload(); public native IMAGE_VXD_HEADER e32_instpreload(int e32_instpreload);             // Number of instance pages in preload section of VXD file
    public native @Cast("DWORD") int e32_instdemand(); public native IMAGE_VXD_HEADER e32_instdemand(int e32_instdemand);              // Number of instance pages in demand load section of VXD file
    public native @Cast("DWORD") int e32_heapsize(); public native IMAGE_VXD_HEADER e32_heapsize(int e32_heapsize);                // Size of heap - for 16-bit apps
    public native @Cast("BYTE") byte e32_res3(int i); public native IMAGE_VXD_HEADER e32_res3(int i, byte e32_res3);
    @MemberGetter public native @Cast("BYTE*") BytePointer e32_res3();                // Reserved words
    public native @Cast("DWORD") int e32_winresoff(); public native IMAGE_VXD_HEADER e32_winresoff(int e32_winresoff);
    public native @Cast("DWORD") int e32_winreslen(); public native IMAGE_VXD_HEADER e32_winreslen(int e32_winreslen);
    public native @Cast("WORD") short e32_devid(); public native IMAGE_VXD_HEADER e32_devid(short e32_devid);                   // Device ID for VxD
    public native @Cast("WORD") short e32_ddkver(); public native IMAGE_VXD_HEADER e32_ddkver(short e32_ddkver);                  // DDK version for VxD
  }
