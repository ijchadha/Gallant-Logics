package soft.gallantlogics.activity;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

import soft.gallantlogics.R;


public class Splash extends AppCompatActivity {

    private static final int SPLASH_DURATION = 3;
    private ImageView splashImageView;
    private boolean isBackPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       new Handler().postDelayed(new Runnable() {
            @Override
          public void run() {
                if(!isBackPressed) {
                    startActivity(new Intent(Splash.this, HomeActivity.class));
                    finish();
                }
        }
        }, SPLASH_DURATION * 3000);
    }

//    private void setResponsiveSplashLogo() {
//        splashImageView = (ImageView) findViewById(R.id.splashImageView);
//        splashImageView.getLayoutParams().width = (int) (getWindowSize(this).x * 0.75);
//    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        isBackPressed = true;
        super.onBackPressed();
    }
}

