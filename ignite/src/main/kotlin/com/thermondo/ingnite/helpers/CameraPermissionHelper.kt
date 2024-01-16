package com.thermondo.ingnite.helpers

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

// Request Camera Permission
class CameraPermissionHelper(private val context: Context) {

    companion object {
        const val CAMERA_PERMISSION_CODE = 0 // You can use any value
    }

    fun requestCameraPermission() {
        if (!hasCameraPermission()) {
            ActivityCompat.requestPermissions(
                context as Activity,
                arrayOf(android.Manifest.permission.CAMERA),
                CAMERA_PERMISSION_CODE
            )
        }
    }

    fun hasCameraPermission(): Boolean {
        return ContextCompat.checkSelfPermission(
            context,
            android.Manifest.permission.CAMERA
        ) == PackageManager.PERMISSION_GRANTED
    }
}
