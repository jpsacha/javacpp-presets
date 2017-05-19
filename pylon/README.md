JavaCPP Presets for Basler Pylon
================================

Introduction
------------
This directory contains the JavaCPP Presets module for:

 * Pylon 5.0.5  http://www.baslerweb.com/en/support/downloads

Please refer to the parent README.md file for more detailed information about the JavaCPP Presets.

The wrappers are currently used development and were tested only on Windows 7 64, should work on Windows 8, 10 including 32-bit versions. Pylon can also be used on Linux.


Building Pylon Presets
----------------------

To build Pylon presets follow normal javacpp-presets setup. You will need to install [Pylon 5.0.5](http://www.baslerweb.com/en/support/downloads) in default location. You do not need `buildcpp` as the installed Pylon binaries are used. Tu build presets run:

```
mvn -Djavacpp.cppbuild.skip=true install --projects .,pylon
```

Examples of Use
---------------

Example project with examples of using Pylon C++ API and C API can be found in [javacv-example](https://github.com/bytedeco/javacv-examples) in subdirectory `pylon-demo`, branch `wpi/pylon`.