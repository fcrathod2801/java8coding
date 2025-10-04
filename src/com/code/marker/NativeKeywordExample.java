package com.code.marker;

public class NativeKeywordExample {
    public native String getOSInfo();

    static {
        System.loadLibrary("sysinfo"); // loads sysinfo.dll or libsysinfo.so
    }

    public static void main(String[] args) {
        NativeKeywordExample info = new NativeKeywordExample();
        System.out.println(info.getOSInfo());
    }
}

