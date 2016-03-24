//
// Created by Tu on 16/3/24.
//

#include "com_tu_jnilog_clog_CLog.h"
#include <android/log.h>
#define LOG_TAG "CLOG"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)

void Java_com_tu_jnilog_clog_CLog_i
        (JNIEnv *env, jclass){
        LOGI("c++ call android log api");
}