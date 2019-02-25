// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ale.global.ale.*;


/**
  This class is an abstract base class for the various sound objects.
  It has no functionality whatsoever.
  <p>
  @author Stephen Anthony
  @version $Id: Sound.hxx,v 1.23 2007/01/01 18:04:50 stephena Exp $
*/
@NoOffset @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class Sound extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Sound(Pointer p) { super(p); }

    /**
      Create a new sound object.  The init method must be invoked before
      using the object.
    */

    /**
      Destructor
    */ 
    /**
      Enables/disables the sound subsystem.
      <p>
      @param enable  Either true or false, to enable or disable the sound system
    */
    public native void setEnabled(@Cast("bool") boolean enable);

    /**
      The system cycle counter is being adjusting by the specified amount.  Any
      members using the system cycle counter should be adjusted as needed.
      <p>
      @param amount The amount the cycle counter is being adjusted by
    */
    public native void adjustCycleCounter(@Cast("Int32") int amount);

    /**
      Sets the number of channels (mono or stereo sound).
      <p>
      @param channels The number of channels
    */
    public native void setChannels(@Cast("uInt32") int channels);

    /**
      Sets the display framerate.  Sound generation for NTSC and PAL games
      depends on the framerate, so we need to set it here.
      <p>
      @param framerate The base framerate depending on NTSC or PAL ROM
    */
    public native void setFrameRate(@Cast("uInt32") int framerate);

    /**
      Initializes the sound device.  This must be called before any
      calls are made to derived methods.
    */
    public native void initialize();

    /**
      Should be called to close the sound device.  Once called the sound
      device can be started again using the initialize method.
    */
    public native @Name("close") void _close();

    /**
      Return true iff the sound device was successfully initialized.
      <p>
      @return true iff the sound device was successfully initialized.
    */
    public native @Cast("bool") boolean isSuccessfullyInitialized();

    /**
      Set the mute state of the sound object.  While muted no sound is played.
      <p>
      @param state Mutes sound if true, unmute if false
    */
    public native void mute(@Cast("bool") boolean state);

    /**
      Reset the sound device.
    */
    public native void reset();

    /**
      Sets the sound register to a given value.
      <p>
      @param addr  The register address
      @param value The value to save into the register
      @param cycle The system cycle at which the register is being updated
    */
    public native void set(@Cast("uInt16") short addr, @Cast("uInt8") byte value, @Cast("Int32") int cycle);

    /**
      Sets the volume of the sound device to the specified level.  The
      volume is given as a percentage from 0 to 100.  Values outside
      this range indicate that the volume shouldn't be changed at all.
      <p>
      @param percent The new volume percentage level for the sound device
    */
    public native void setVolume(@Cast("Int32") int percent);

    /**
      Adjusts the volume of the sound device based on the given direction.
      <p>
      @param direction  Increase or decrease the current volume by a predefined
                        amount based on the direction (1 = increase, -1 =decrease)
    */
    public native void adjustVolume(@Cast("Int8") byte direction);

    /**
      * Tells the sound engine to record one frame's worth of sound.
      */
    public native void recordNextFrame();
    /**
      Loads the current state of this device from the given Deserializer.
      <p>
      @param in The deserializer device to load from.
      @return The result of the load.  True on success, false on failure.
    */
    public native @Cast("bool") boolean load(@ByRef Deserializer in);

    /**
      Saves the current state of this device to the given Serializer.
      <p>
      @param out The serializer device to save to.
      @return The result of the save.  True on success, false on failure.
    */
    public native @Cast("bool") boolean save(@ByRef Serializer out);
}
