package defensive;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import com.cookandroid.stoneagedc.R;

public class stolarge extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.defensive_stolarge);
        setTitle("스토라지");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

/*
            //펫의 공략 종류 어댑터 연결.
            ViewPager viewPager = findViewById(R.id.kindViewPager);
            ViewPagerAdapter viewpageradapter = new ViewPagerAdapter(getSupportFragmentManager());
            viewPager.setAdapter(viewpageradapter);
           //탭레이아웃과 연동
            TabLayout tbly = findViewById(R.id.kindTab);
            tbly.setupWithViewPager(viewPager);
*/
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ //toolbar의 back키 눌렀을 때 동작
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}


