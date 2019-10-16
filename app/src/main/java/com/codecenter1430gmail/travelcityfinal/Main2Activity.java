package com.codecenter1430gmail.travelcityfinal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Main2Activity
        extends ActionBarActivity
{
    RelativeLayout b_bg;
    RelativeLayout c_bg;
    CardView cv_blore;
    Intent i;
    AdView mAdView;
    CardView cv_chennai;
    CardView cv_delhi;
    CardView cv_hyderabad;
    CardView cv_jaipur;
    CardView cv_kolkata;
    CardView cv_mumbai;
    CardView cv_pune;
    RelativeLayout d_bg;
    RelativeLayout h_bg;
    RelativeLayout j_bg;
    RelativeLayout k_bg;

    RelativeLayout m_bg;
    RelativeLayout p_bg;

    protected void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Redcolor)));
        getSupportActionBar().setTitle("Travel City");
        this.cv_pune = ((CardView)findViewById(R.id.pune));
        this.cv_mumbai = ((CardView)findViewById(R.id.mumbai));
        this.cv_blore = ((CardView)findViewById(R.id.blore));
        this.cv_delhi = ((CardView)findViewById(R.id.delhi));
        this.cv_kolkata = ((CardView)findViewById(R.id.kolkata));
        this.cv_chennai = ((CardView)findViewById(R.id.chennai));
        this.cv_hyderabad = ((CardView)findViewById(R.id.hyderabad));
        this.cv_jaipur = ((CardView)findViewById(R.id.jaipur));
        this.p_bg = ((RelativeLayout)findViewById(R.id.pune_bg));
        this.m_bg = ((RelativeLayout)findViewById(R.id.mumbai_bg));
        this.d_bg = ((RelativeLayout)findViewById(R.id.delhi_bg));
        this.b_bg = ((RelativeLayout)findViewById(R.id.blore_bg));
        this.k_bg = ((RelativeLayout)findViewById(R.id.kolkata_bg));
        this.c_bg = ((RelativeLayout)findViewById(R.id.chennai_bg));
        this.h_bg = ((RelativeLayout)findViewById(R.id.hyderabad_bg));
        this.j_bg = ((RelativeLayout)findViewById(R.id.jaipur_bg));
        this.p_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.punefinal, 200, 200)));
        this.m_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.mumbaifinal, 200, 200)));
        this.d_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.delhifinal, 200, 200)));
        this.b_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.banglorefinal, 200, 200)));
        this.k_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.kolkatafinal, 200, 200)));
        this.c_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.chennaifinal, 200, 200)));
        this.h_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.hyderabad_final, 200, 200)));
        this.j_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.jaipurfinal, 200, 200)));

        MobileAds.initialize(this, "ca-app-pub-1315104419551050/1819125896");
        this.mAdView = ((AdView)findViewById(R.id.adView));
        AdRequest adRequest = new AdRequest.Builder().build();
        this.mAdView.loadAd(adRequest);

        this.cv_pune.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "pune");
                Main2Activity.this.startActivity(i);
            }
        });



        this.cv_mumbai.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "mumbai");
                Main2Activity.this.startActivity(i);
            }
        });
        this.cv_blore.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "blore");
                Main2Activity.this.startActivity(i);
            }
        });
        this.cv_delhi.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "delhi");
                Main2Activity.this.startActivity(i);
            }
        });
        this.cv_kolkata.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "kolkata");
                Main2Activity.this.startActivity(i);
            }
        });
        this.cv_chennai.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "chennai");
                Main2Activity.this.startActivity(i);
            }
        });
        this.cv_hyderabad.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "hyderabad");
                Main2Activity.this.startActivity(i);
            }
        });
        this.cv_jaipur.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "jaipur");
                Main2Activity.this.startActivity(i);
            }
        });
    }



}
