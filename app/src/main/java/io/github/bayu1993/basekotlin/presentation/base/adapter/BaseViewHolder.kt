package io.github.bayu1993.basekotlin.presentation.base.adapter

import android.content.Context
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import java.util.jar.Attributes

/**
 * Created by Bayu teguh pamuji on 8/25/18.
 * email : bayuteguhpamuji@gmail.com.
 */

abstract class BaseViewHolder<T:Parcelable>:RelativeLayout{
    constructor(context: Context?):super(context){
        init()
    }

    constructor(context: Context?, attrs:AttributeSet?):super(context, attrs){
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr:Int):super(context,attrs,defStyleAttr){
        init()
    }

    private fun init(){
        View.inflate(context, layoutResId(),this)
    }

    protected abstract fun layoutResId():Int

    abstract fun bind(item:T)
}