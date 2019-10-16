package com.codecenter1430gmail.travelcityfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity
        extends ActionBarActivity
{
    Intent i;
    ImageView logo;
    AdView mAdView;


    protected void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        logo = (ImageView)findViewById(R.id.logo);

        logo.startAnimation(myanim);
        MobileAds.initialize(this, "ca-app-pub-1315104419551050/1819125896");
        this.mAdView = ((AdView)findViewById(R.id.adView));
        AdRequest adRequest = new AdRequest.Builder().build();
        this.mAdView.loadAd(adRequest);

        this.i = new Intent(this, Main2Activity.class);
        new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(1800L);
                    MainActivity.this.startActivity(MainActivity.this.i);
                    MainActivity.this.finish();
                    return;
                }
                catch (InterruptedException localInterruptedException)
                {
                    localInterruptedException = localInterruptedException;
                    MainActivity.this.startActivity(MainActivity.this.i);
                    MainActivity.this.finish();
                    return;
                }

            }
        }.start();
    }
}
