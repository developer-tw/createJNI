#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_sqtek_nativejnilib_NativeLib_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jint JNICALL
Java_com_sqtek_nativejnilib_NativeLib_addTwoNum(
        JNIEnv* env,
        jobject,
        jint a,
        jint b) {
    int sun = a + b;
    return (jint) sun;
}