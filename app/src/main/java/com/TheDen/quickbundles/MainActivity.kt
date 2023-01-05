package com.TheDen.quickbundles

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    val REQUEST_CALL_PERMISSION =1

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager:ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tablayout)
        viewPager= findViewById(R.id.pager1)

        val permission = Manifest.permission.CALL_PHONE

        if (ContextCompat.checkSelfPermission(this,permission) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(
                this,
                arrayOf(permission),
                REQUEST_CALL_PERMISSION
            )


        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<out String>, grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            REQUEST_CALL_PERMISSION -> {

                // If request is cancelled, the result arrays are empty.
                if (grantResults.equals(1)
                    && grantResults[0] === PackageManager.PERMISSION_GRANTED
                ) {

                    // permission was granted, yay! Do the phone call
                } else {

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return
            }
        }
    }


}