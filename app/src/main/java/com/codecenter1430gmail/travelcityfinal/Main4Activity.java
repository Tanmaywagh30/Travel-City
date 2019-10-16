package com.codecenter1430gmail.travelcityfinal;


        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.graphics.drawable.ColorDrawable;
        import android.media.Image;
        import android.net.Uri;
        import android.support.design.widget.FloatingActionButton;
        import android.support.v7.app.ActionBarActivity;
        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.support.v7.app.ActionBarActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;

        import org.w3c.dom.Text;

        import java.util.ArrayList;

public class Main4Activity extends ActionBarActivity {
    ImageView img,next,prev;
    TextView heading,info;
    String rHeading,rInfo,rCoord;
    int rImg,index,maxSize;
    FloatingActionButton actionButton;
    InfoSetter i1;
    Intent I;
    Locationsetter l1;

    private   ArrayList<String> mPlaces = new ArrayList<>();
    private  ArrayList<Integer> mPImage = new ArrayList<>();

    private ArrayList<String> mFood = new ArrayList<>();
    private ArrayList<Integer> mFImage = new ArrayList<>();

    private ArrayList<String> mShop = new ArrayList<>();
    private ArrayList<Integer> mSImage = new ArrayList<>();

    private ArrayList<String> mHotels = new ArrayList<>();
    private ArrayList<Integer> mHImage = new ArrayList<>();

    private ArrayList<String> mTransport = new ArrayList<>();
    private ArrayList<Integer> mTImage = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Redcolor)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0);


        img = (ImageView)findViewById(R.id.fullimage);
        heading = (TextView)findViewById(R.id.heading);
        info = (TextView)findViewById(R.id.info);
        next = (ImageView)findViewById(R.id.next);
        prev = (ImageView)findViewById(R.id.prev);
        actionButton = (FloatingActionButton)findViewById(R.id.action_btn);

        rHeading = getIntent().getStringExtra("heading");
        rImg = getIntent().getIntExtra("image",10);
        index = getIntent().getIntExtra("index",0);

        InitAL(index);

        setData();


        //On click listener for next image
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(index)
                {
                    case 1:
                        maxSize = mPImage.size();

                        if(mPImage.indexOf(rImg)!=maxSize-1)
                        {
                            rImg = mPImage.get(mPImage.indexOf(rImg) + 1);
                            rHeading = mPlaces.get(mPlaces.indexOf(rHeading) + 1);
                        }
                        else {
                            rImg=mPImage.get(0);
                            rHeading=mPlaces.get(0);
                        }
                        break;

                    case 2:
                        maxSize = mFImage.size();

                        if(mFImage.indexOf(rImg)!=maxSize-1)
                        {
                            rImg = mFImage.get(mFImage.indexOf(rImg) + 1);
                            rHeading = mFood.get(mFood.indexOf(rHeading) + 1);
                        }
                        else {
                            rImg=mFImage.get(0);
                            rHeading=mFood.get(0);
                        }
                        break;

                    case 3:
                        maxSize = mSImage.size();

                        if(mSImage.indexOf(rImg)!=maxSize-1)
                        {
                            rImg = mSImage.get(mSImage.indexOf(rImg) + 1);
                            rHeading = mShop.get(mShop.indexOf(rHeading) + 1);
                        }
                        else {
                            rImg=mSImage.get(0);
                            rHeading=mShop.get(0);
                        }
                        break;

                    case 4:
                        maxSize = mHImage.size();

                        if(mHImage.indexOf(rImg)!=maxSize-1)
                        {
                            rImg = mHImage.get(mHImage.indexOf(rImg) + 1);
                            rHeading = mHotels.get(mHotels.indexOf(rHeading) + 1);
                        }
                        else {
                            rImg=mHImage.get(0);
                            rHeading=mHotels.get(0);
                        }
                        break;


                    case 5:
                        maxSize = mTImage.size();

                        if(mTImage.indexOf(rImg)!=maxSize-1)
                        {
                            rImg = mTImage.get(mTImage.indexOf(rImg) + 1);
                            rHeading = mTransport.get(mTransport.indexOf(rHeading) + 1);
                        }
                        else {
                            rImg=mTImage.get(0);
                            rHeading=mTransport.get(0);
                        }

                        break;
                }

                setData();
            }
        });

        //On click listener for previous image
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(index)
                {
                    case 1:
                        maxSize = mPImage.size();

                        if(mPImage.indexOf(rImg)!=0)
                        {
                            rImg = mPImage.get(mPImage.indexOf(rImg) - 1);
                            rHeading = mPlaces.get(mPlaces.indexOf(rHeading) - 1);
                        }
                        else {
                            rImg=mPImage.get(mPImage.size()-1);
                            rHeading=mPlaces.get(mPlaces.size()-1);
                        }
                        break;

                    case 2:
                        maxSize = mFImage.size();

                        if(mFImage.indexOf(rImg)!=0)
                        {
                            rImg = mFImage.get(mFImage.indexOf(rImg) - 1);
                            rHeading = mFood.get(mFood.indexOf(rHeading) - 1);
                        }
                        else {
                            rImg=mFImage.get(mFImage.size()-1);
                            rHeading=mFood.get(mFImage.size()-1);
                        }
                        break;

                    case 3:
                        maxSize = mSImage.size();

                        if(mSImage.indexOf(rImg)!=0)
                        {
                            rImg = mSImage.get(mSImage.indexOf(rImg) - 1);
                            rHeading = mShop.get(mShop.indexOf(rHeading) - 1);
                        }
                        else {
                            rImg=mSImage.get(mSImage.size()-1);
                            rHeading=mShop.get(mShop.size()-1);
                        }
                        break;

                    case 4:
                        maxSize = mHImage.size();

                        if(mHImage.indexOf(rImg)!=0)
                        {
                            rImg = mHImage.get(mHImage.indexOf(rImg) - 1);
                            rHeading = mHotels.get(mHotels.indexOf(rHeading) - 1);
                        }
                        else {
                            rImg=mHImage.get(mHImage.size()-1);
                            rHeading=mHotels.get(mHImage.size()-1);
                        }
                        break;


                    case 5:
                        maxSize = mTImage.size();

                        if(mTImage.indexOf(rImg)!=0)
                        {
                            rImg = mTImage.get(mTImage.indexOf(rImg) - 1);
                            rHeading = mTransport.get(mTransport.indexOf(rHeading) - 1);
                        }
                        else {
                            rImg=mTImage.get(mTImage.size()-1);
                            rHeading=mTransport.get(mTransport.size()-1);
                        }

                        break;
                }

                setData();


            }
        });


        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l1 = new Locationsetter();
                rCoord = l1.getLoc(rHeading);

                I = new Intent(Intent.ACTION_VIEW, Uri.parse(rCoord));
                I.setPackage("com.google.android.apps.maps");
                startActivity(I);

            }
        });


    }



    void setData()
    {
        i1 = new InfoSetter();
        rInfo = i1.getInfo(rHeading);
        img.setImageResource(rImg);
        heading.setText(rHeading);
        info.setText(rInfo);
    }

    void InitAL(int i)
    {
        switch (i) {
            case 1:
                mPImage = getIntent().getIntegerArrayListExtra("imagelist");
                mPlaces = getIntent().getStringArrayListExtra("namelist");
                break;

            case 2:
                mFImage = getIntent().getIntegerArrayListExtra("foodimage");
                mFood = getIntent().getStringArrayListExtra("foodname");
                break;

            case 3:
                mSImage = getIntent().getIntegerArrayListExtra("shopimage");
                mShop = getIntent().getStringArrayListExtra("shopname");
                break;

            case 4:
                mHImage = getIntent().getIntegerArrayListExtra("hotelimage");
                mHotels = getIntent().getStringArrayListExtra("hotelname");
                break;

            case 5:
                mTImage = getIntent().getIntegerArrayListExtra("transportimage");
                mTransport = getIntent().getStringArrayListExtra("transportname");
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
