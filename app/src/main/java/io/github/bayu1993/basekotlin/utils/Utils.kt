package io.github.bayu1993.basekotlin.utils

import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonElement
import io.github.bayu1993.basekotlin.BuildConfig

/**
 * Created by Bayu teguh pamuji on 8/25/18.
 * email : bayuteguhpamuji@gmail.com.
 */

fun logI(tag:String, msg:String){
    if (BuildConfig.DEBUG) Log.i(tag,msg)
}

fun logW(tag: String, msg: String){
    if (BuildConfig.DEBUG) Log.w(tag, msg)
}

fun logE(tag: String,msg: String){
    if (BuildConfig.DEBUG) Log.e(tag,msg)
}

fun logD(tag: String, msg: String){
    if (BuildConfig.DEBUG) Log.d(tag, msg)
}

fun toJsonElement(any: Any):JsonElement = Gson().toJsonTree(any)