// AidlDemo.aidl
package com.AIDL;

// Declare any non-default types here with import statements

interface AidlDemo {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
   String name();                //里面定义的两个方法，记得另一个app也要有一个同样的包名，同样包名里面的这个文件
}
