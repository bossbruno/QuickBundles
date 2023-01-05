package com.TheDen.quickbundles

import android.Manifest
import android.content.pm.PackageManager
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.TheDen.quickbundles.MTN.MtnScrollingFragment
import com.TheDen.quickbundles.Tigo.TigoScrollingFragment
import com.TheDen.quickbundles.Vodafone.VodafoneScrollingFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

private  const val  NUM_PAGES = 3
val REQUEST_CALL_PERMISSION =1
class ScreenSlidePagerActivity : FragmentActivity() {
    private lateinit var  viewPager : ViewPager2

    private lateinit var tabLayout: TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_slide)

        val permission = Manifest.permission.CALL_PHONE

        if (ContextCompat.checkSelfPermission(this,permission) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(
                this,
                arrayOf(permission),
                REQUEST_CALL_PERMISSION
            )


        }
        viewPager = findViewById(R.id.pager)
        tabLayout = findViewById(R.id.tablayout1)
        val pagerAdapter = ScreenSlidePagerAdapter(this)
        viewPager.adapter = pagerAdapter
        viewPager.setPageTransformer(ZoomOutPageTransformer())
        TabLayoutMediator(tabLayout,viewPager){
            tab,index ->
            tab.text = when(index){
                0 -> {"Tigo"}
                1-> { "Vodafone" }
                2 -> {"MTN"}
                else ->{throw Resources.NotFoundException("Position Not Found") }


                }

        }.attach()

    }

    override fun onBackPressed() {
        if(viewPager.currentItem ==0){
            super.onBackPressed()
        } else{
            viewPager.currentItem = viewPager.currentItem -1
        }

    }
    private inner class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
        override fun getItemCount(): Int = NUM_PAGES

        override fun createFragment(position: Int): Fragment{
            return when(position){
                0 -> {TigoScrollingFragment()}
                1 -> {VodafoneScrollingFragment()}
                2-> {MtnScrollingFragment()}
                else ->{throw Resources.NotFoundException("Position Not Found")
                }
            }

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