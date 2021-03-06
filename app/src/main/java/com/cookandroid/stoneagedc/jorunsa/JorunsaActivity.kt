package com.cookandroid.stoneagedc.jorunsa

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.cookandroid.stoneagedc.AdsFull
import com.cookandroid.stoneagedc.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.jorunsa.*

class JorunsaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.jorunsa)
        title = "조련사 육성법"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val weaponAdapter = WeaponAdapter(supportFragmentManager, lifecycle)
        for (i in 0..0) {
            weaponAdapter.addFragment(WeaponFragment.newInstance())
        }

        weaponViewPager.adapter = weaponAdapter

        // TabLayout에 ViewPager를 연동
        TabLayoutMediator(tabLyWeapon, weaponViewPager, TabLayoutMediator.TabConfigurationStrategy { tab, position ->
            when (position) {
                0 -> tab.text = "투척도끼"
//                1 -> tab.text = "도끼"
//                2 -> tab.text = "활"
//                3 -> tab.text = "부메랑"
//                4 -> tab.text = "돌주머니"
//                5 -> tab.text = "활"
//                6 -> tab.text = "몽둥이"
//                7 -> tab.text = "창"
                else -> {
                    Log.d("Test", "Error!!")
                }
            }
        }).attach()

        // 광고넣기
        AdsFull.getInstance(this)

        // 배너광고
        var mAdView = findViewById<AdView>(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {//toolbar의 back키 눌렀을 때 동작
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}