package io.github.bayu1993.basekotlin.data.local

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by Bayu teguh pamuji on 8/25/18.
 * email : bayuteguhpamuji@gmail.com.
 */

class PreferenceManager(context:Context){
    private val sp: SharedPreferences = context.getSharedPreferences("my_share_preferences", Context.MODE_PRIVATE)
    private val spe: SharedPreferences.Editor = sp.edit()
}