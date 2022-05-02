package com.topjohnwu.magisk.view

import android.content.Context
import android.content.Intent
import android.content.pm.ShortcutInfo
import android.content.pm.ShortcutManager
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.content.getSystemService
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.ShortcutManagerCompat
import androidx.core.graphics.drawable.IconCompat
import com.topjohnwu.magisk.R
import com.topjohnwu.magisk.core.Const
import com.topjohnwu.magisk.core.Info
import com.topjohnwu.magisk.ktx.getBitmap
import com.topjohnwu.magisk.utils.Utils

object Shortcuts {

    fun setupDynamic(context: Context) {
        return
    }

    fun addHomeIcon(context: Context) {
        return
    }

    private fun Context.getIconCompat(id: Int): IconCompat? {
        return null
    }

    @RequiresApi(api = 23)
    private fun Context.getIcon(id: Int) = null

    @RequiresApi(api = 25)
    private fun getShortCuts(context: Context): List<ShortcutInfo> {
        return emptyList()
    }
}
