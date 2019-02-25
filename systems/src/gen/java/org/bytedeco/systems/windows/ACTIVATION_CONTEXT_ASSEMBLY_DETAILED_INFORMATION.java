// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION position(long position) {
        return (ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION)super.position(position);
    }

    public native @Cast("DWORD") int ulFlags(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION ulFlags(int ulFlags);
    public native @Cast("DWORD") int ulEncodedAssemblyIdentityLength(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION ulEncodedAssemblyIdentityLength(int ulEncodedAssemblyIdentityLength);      // in bytes
    public native @Cast("DWORD") int ulManifestPathType(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION ulManifestPathType(int ulManifestPathType);                   // ACTIVATION_CONTEXT_PATH_TYPE_*
    public native @Cast("DWORD") int ulManifestPathLength(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION ulManifestPathLength(int ulManifestPathLength);                 // in bytes
    public native @ByRef LARGE_INTEGER liManifestLastWriteTime(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION liManifestLastWriteTime(LARGE_INTEGER liManifestLastWriteTime);      // FILETIME
    public native @Cast("DWORD") int ulPolicyPathType(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION ulPolicyPathType(int ulPolicyPathType);                     // ACTIVATION_CONTEXT_PATH_TYPE_*
    public native @Cast("DWORD") int ulPolicyPathLength(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION ulPolicyPathLength(int ulPolicyPathLength);                   // in bytes
    public native @ByRef LARGE_INTEGER liPolicyLastWriteTime(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION liPolicyLastWriteTime(LARGE_INTEGER liPolicyLastWriteTime);        // FILETIME
    public native @Cast("DWORD") int ulMetadataSatelliteRosterIndex(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION ulMetadataSatelliteRosterIndex(int ulMetadataSatelliteRosterIndex);

    public native @Cast("DWORD") int ulManifestVersionMajor(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION ulManifestVersionMajor(int ulManifestVersionMajor);               // 1
    public native @Cast("DWORD") int ulManifestVersionMinor(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION ulManifestVersionMinor(int ulManifestVersionMinor);               // 0
    public native @Cast("DWORD") int ulPolicyVersionMajor(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION ulPolicyVersionMajor(int ulPolicyVersionMajor);                 // 0
    public native @Cast("DWORD") int ulPolicyVersionMinor(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION ulPolicyVersionMinor(int ulPolicyVersionMinor);                 // 0
    public native @Cast("DWORD") int ulAssemblyDirectoryNameLength(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION ulAssemblyDirectoryNameLength(int ulAssemblyDirectoryNameLength);        // in bytes

    public native @Cast("PCWSTR") CharPointer lpAssemblyEncodedAssemblyIdentity(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION lpAssemblyEncodedAssemblyIdentity(CharPointer lpAssemblyEncodedAssemblyIdentity);
    public native @Cast("PCWSTR") CharPointer lpAssemblyManifestPath(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION lpAssemblyManifestPath(CharPointer lpAssemblyManifestPath);
    public native @Cast("PCWSTR") CharPointer lpAssemblyPolicyPath(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION lpAssemblyPolicyPath(CharPointer lpAssemblyPolicyPath);
    public native @Cast("PCWSTR") CharPointer lpAssemblyDirectoryName(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION lpAssemblyDirectoryName(CharPointer lpAssemblyDirectoryName);

    public native @Cast("DWORD") int ulFileCount(); public native ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION ulFileCount(int ulFileCount);
}
