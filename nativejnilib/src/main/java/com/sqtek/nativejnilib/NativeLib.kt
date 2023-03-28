package com.sqtek.nativejnilib

class NativeLib {

    /**
     * A native method that is implemented by the 'nativejnilib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    external fun addTwoNum(a: Int, b: Int): Int

    companion object {
        // Used to load the 'nativejnilib' library on application startup.
        init {
            System.loadLibrary("nativejnilib")
        }
    }
}