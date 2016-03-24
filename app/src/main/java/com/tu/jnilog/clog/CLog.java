package com.tu.jnilog.clog;

/**
 * Created by Tu on 16/3/24.
 */
public class CLog {
  public static native void i();
  static{
    System.loadLibrary("CLog");
  }
}
