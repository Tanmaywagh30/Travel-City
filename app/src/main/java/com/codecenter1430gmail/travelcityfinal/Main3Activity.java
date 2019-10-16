package com.codecenter1430gmail.travelcityfinal;

import android.support.v7.app.AppCompatActivity;
        import android.animation.ObjectAnimator;
        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.graphics.drawable.BitmapDrawable;
        import android.graphics.drawable.ColorDrawable;
        import android.media.Image;
        import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
        import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
        import android.support.v4.widget.NestedScrollView;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutCompat;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.ScrollView;
        import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import org.w3c.dom.Text;

        import java.util.ArrayList;



public class Main3Activity extends AppCompatActivity {


    TextView sPlaces,sFood,sShop,sHotel,sTransport;
    String city_name;
    ScrollView sv;
    AdView mAdView;
    ImageView welcomeimg;


    //Arraylists required
    public  ArrayList<String> mPlaces = new ArrayList<>();
    public  ArrayList<Integer> mPImage = new ArrayList<>();
    public ArrayList<Bitmap>Places = new ArrayList<>();

    public ArrayList<String> mFood = new ArrayList<>();
    public ArrayList<Integer> mFImage = new ArrayList<>();
    public ArrayList<Bitmap>Food = new ArrayList<>();

    public ArrayList<String> mShop = new ArrayList<>();
    public ArrayList<Integer> mSImage = new ArrayList<>();
    public ArrayList<Bitmap>Shopping = new ArrayList<>();

    public ArrayList<String> mHotels = new ArrayList<>();
    public ArrayList<Integer> mHImage = new ArrayList<>();
    public ArrayList<Bitmap>Hotels = new ArrayList<>();

    public ArrayList<String> mTransport = new ArrayList<>();
    public ArrayList<Integer> mTImage = new ArrayList<>();
    public ArrayList<Bitmap>Transport = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Redcolor)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0);


        MobileAds.initialize(this, "ca-app-pub-1315104419551050/1819125896");
        this.mAdView = ((AdView)findViewById(R.id.adView));
        AdRequest adRequest = new AdRequest.Builder().build();
        this.mAdView.loadAd(adRequest);


        sv = (ScrollView)findViewById(R.id.sv);
        city_name = getIntent().getStringExtra("City");


        sPlaces = (TextView)findViewById(R.id.see_places);
        sFood = (TextView)findViewById(R.id.see_food);
        sShop = (TextView)findViewById(R.id.see_shop);
        sHotel = (TextView)findViewById(R.id.see_hotel);
        sTransport = (TextView)findViewById(R.id.see_transport);
        welcomeimg = (ImageView)findViewById(R.id.welcomeimg);

        sv.scrollTo(0,0);
        sv.smoothScrollTo(0,0);



        //City Name selection
        Adddata(city_name);



        sPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,FullView.class);
                i.putExtra("city_name",city_name);
                i.putExtra("category",1);
                startActivity(i);
            }
        });


        sFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,FullView.class);
                i.putExtra("city_name",city_name);
                i.putExtra("category",2);
                startActivity(i);
            }
        });

        sShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,FullView.class);
                i.putExtra("city_name",city_name);
                i.putExtra("category",3);
                startActivity(i);
            }
        });

        sHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,FullView.class);
                i.putExtra("city_name",city_name);
                i.putExtra("category",4);
                startActivity(i);
            }
        });

        sTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,FullView.class);
                i.putExtra("city_name",city_name);
                i.putExtra("category",5);
                startActivity(i);
            }
        });


    }

    //Adding data based on city
    void Adddata(String city)
    {

        switch(city)
        {
            case "pune":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.pune_edited,200,200));
                AddData2(1);
                break;

            case "mumbai":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.mumbai_edited,200,200));
                AddData2(2);
                break;

            case "delhi":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.delhi_edited,200,200));
                AddData2(3);
                break;

            case "blore":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.banglore_edited,200,200));
                AddData2(4);
                break;

            case "kolkata":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.kolkata_edited,200,200));
                AddData2(5);
                break;

            case "chennai":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.chennai_edited,200,200));
                AddData2(6);
                break;

            case "hyderabad":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.hyderabad_edited,200,200));
                AddData2(7);
                break;

            case "jaipur":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.jaipur_edited,200,200));
                AddData2(8);
                break;

        }

    }

    //Selecting only 4 things in
    void AddData2(int i)
    {
        switch(i)
        {
            case 1:

                //Code for setting place of the city
                mPImage.add(R.drawable.p_dagdushet);
                mPlaces.add("Dagdusheth Temple");

                mPImage.add(R.drawable.p_lalmahal);
                mPlaces.add("LalMahal");

                mPImage.add(R.drawable.p_agakhanpalace);
                mPlaces.add("Agakhan Palace");

                mPImage.add(R.drawable.p_sarasbaugh);
                mPlaces.add("Sarasbaug");


                // Code for setting Food of the city

                mFImage.add(R.drawable.p_kayanibakery);
                mFood.add("Kayani Bakery");

                mFImage.add(R.drawable.p_sujatamastani);
                mFood.add("Sujata Mastani");

                mFImage.add(R.drawable.p_katakir);
                mFood.add("Katakir");

                mFImage.add(R.drawable.p_chitalebandhu);
                mFood.add("Chitale Bandhu");


                // Code for setting shopping
                mSImage.add(R.drawable.p_tulsibaugh);
                mShop.add("Tulshi Baug");

                mSImage.add(R.drawable.p_fashionstreet);
                mShop.add("F-Street");

                mSImage.add(R.drawable.p_fcroad);
                mShop.add("FC Road");

                mSImage.add(R.drawable.p_phoenix);
                mShop.add("Phoenix Mall");

                //Code to set Hotels

                mHImage.add(R.drawable.p_westin);
                mHotels.add("Westin");

                mHImage.add(R.drawable.p_jw);
                mHotels.add("JW Marriott");

                mHImage.add(R.drawable.p_hyatt);
                mHotels.add("Hyatt");

                mHImage.add(R.drawable.p_royalorchid);
                mHotels.add("Royal Orchid");


                //Code for setting transport

                mTImage.add(R.drawable.punestation);
                mTransport.add("Railway Station");

                mTImage.add(R.drawable.puneairport);
                mTransport.add("Airport");


                initRecyclerView();
                break;

            case 2:
                //Code for setting places
                mPImage.add(R.drawable.m_marinedrive);
                mPlaces.add("Marine Drive");

                mPImage.add(R.drawable.m_bandraworli);
                mPlaces.add("Bandra-Worli SeaLink");

                mPImage.add(R.drawable.m_gatewayofindia);
                mPlaces.add("Gateway of India");

                mPImage.add(R.drawable.m_juhubeach);
                mPlaces.add("Juhu Beach");

                //Code for food

                mFImage.add(R.drawable.m_ashokvadapav);
                mFood.add("Ashok vadapav");

                mFImage.add(R.drawable.m_aswad);
                mFood.add("Aswad");

                mFImage.add(R.drawable.m_punjabgrill);
                mFood.add("Punjabi Grill");

                mFImage.add(R.drawable.m_cafemondeger);
                mFood.add("Cafe Mondegar");


                //Code for shopping

                mSImage.add(R.drawable.m_colobacauseway);
                mShop.add("Colaba Causeway");

                mSImage.add(R.drawable.m_mangaldasmarket);
                mShop.add("Mangaldas Market");

                mSImage.add(R.drawable.m_fashionstreet);
                mShop.add("Fashion Street");

                mSImage.add(R.drawable.m_chorbazar);
                mShop.add("Chorbazar");


                //Code to set Hotels

                mHImage.add(R.drawable.m_tajhotel);
                mHotels.add("Taj");

                mHImage.add(R.drawable.m_oberio);
                mHotels.add("Oberoi");

                mHImage.add(R.drawable.m_tridentnarimanpoint);
                mHotels.add("Trident");

                mHImage.add(R.drawable.m_pridehotel);
                mHotels.add("Pride");


                //Code to set Transport

                mTImage.add(R.drawable.m_airport);
                mTransport.add("Mumbai Airport");

                mTImage.add(R.drawable.m_cst);
                mTransport.add("CST");

                mTImage.add(R.drawable.m_andherimetro);
                mTransport.add("Mumbai Metro");

                mTImage.add(R.drawable.m_churchgate);
                mTransport.add("Churchgate");

                initRecyclerView();
                break;

            case 3:
                //Code for setting places
                mPImage.add(R.drawable.d_akshardham);
                mPlaces.add("Akshardham");

                mPImage.add(R.drawable.d_banglasahibgurudwara);
                mPlaces.add("Banglasahib Gurudwara");

                mPImage.add(R.drawable.d_humayunstomb);
                mPlaces.add("Humayun's Tomb");

                mPImage.add(R.drawable.d_indiagate);
                mPlaces.add("India Gate");


                //Code for setting food

                mFImage.add(R.drawable.d_beeryani);
                mFood.add("Beeryani");

                mFImage.add(R.drawable.d_bishanswaroop);
                mFood.add("Bishan Swaroop");

                mFImage.add(R.drawable.d_bukhara);
                mFood.add("Bukhara");

                mFImage.add(R.drawable.d_chorbizarre);
                mFood.add("Chorbizzare");


                //Code for setting shopping

                mSImage.add(R.drawable.d_ambiencemall);
                mShop.add("Ambience Mall");

                mSImage.add(R.drawable.d_cannaughtplace);
                mShop.add("Connaught Place");

                mSImage.add(R.drawable.d_chandanichowk);
                mShop.add("Chandani Chowk");

                mSImage.add(R.drawable.d_dilihaat);
                mShop.add("Dilihaat");


                //Code for setting hotels

                mHImage.add(R.drawable.d_hotelleroi);
                mHotels.add("Leroi");

                mHImage.add(R.drawable.d_hoteltoronto);
                mHotels.add("Toronto");

                mHImage.add(R.drawable.d_itcmaurya);
                mHotels.add("ITC Maurya");

                mHImage.add(R.drawable.d_jwmariot);
                mHotels.add("JW Marriott ");


                //Code for setting transport

                mTImage.add(R.drawable.d_chandanichowkmetrostation);
                mTransport.add("Chandni Chowk Metro");

                mTImage.add(R.drawable.d_indiragandhiairport);
                mTransport.add("Indira Gandhi Airport");

                mTImage.add(R.drawable.d_newdelhistation);
                mTransport.add("New Delhi Station");

                mTImage.add(R.drawable.d_olddelhistation);
                mTransport.add("Old Delhi Station");

                initRecyclerView();
                break;


            case 4:
                //Places top visit in banglore
                mPImage.add(R.drawable.b_bangalorepalace);
                mPlaces.add("Banglore Palace");

                mPImage.add(R.drawable.b_bannerghattanationalpark);
                mPlaces.add("Baner Ghatta Park");

                mPImage.add(R.drawable.b_cubbonpark);
                mPlaces.add("Cubbon Park");

                mPImage.add(R.drawable.b_innovativefilmcity);
                mPlaces.add("Innovative Film City");

                // Food in banglore
                mFImage.add(R.drawable.b_centraltiffinroom);
                mFood.add("Central Tiffin Room");

                mFImage.add(R.drawable.b_dakshin);
                mFood.add("Dakshin ");

                mFImage.add(R.drawable.b_karavalli);
                mFood.add("Karavalli");

                mFImage.add(R.drawable.b_koshysbarandrestaurant);
                mFood.add("Koshy's Bar and Restro");



                //Code for setting shops
                mSImage.add(R.drawable.b_basavanagudi);
                mShop.add("Basavana Gudi");

                mSImage.add(R.drawable.b_brigaderoad);
                mShop.add("Brigade Road");

                mSImage.add(R.drawable.b_chickpet);
                mShop.add("Chick Pet");

                mSImage.add(R.drawable.b_commercialstreet);
                mShop.add("Commercial Street");


                //Code for setting Hotels

                mHImage.add(R.drawable.b_goldenrecidency);
                mHotels.add("Golden Residency");

                mHImage.add(R.drawable.b_hmsuitesandstudios);
                mHotels.add("HM Suites");

                mHImage.add(R.drawable.b_itcwindsor);
                mHotels.add("ITC Windsor");

                mHImage.add(R.drawable.b_lalitashok);
                mHotels.add("Lalit Ashok");


                //Code for setting transport

                mTImage.add(R.drawable.b_airport);
                mTransport.add("Banglore Airport");

                mTImage.add(R.drawable.b_bangalorerailwaystation);
                mTransport.add("Banglore Railway Station");

                mTImage.add(R.drawable.b_metro);
                mTransport.add("Banglore Metro");

                mTImage.add(R.drawable.b_yeshvantpur);
                mTransport.add("Yeshvantpur");

                initRecyclerView();
                break;


            case 5:
                //Code for setting places kolkata

                mPImage.add(R.drawable.k_belur_math);
                mPlaces.add("Belur Math");

                mPImage.add(R.drawable.k_botanical_gardens);
                mPlaces.add("Botanical Gardens");

                mPImage.add(R.drawable.k_fort_william);
                mPlaces.add("Fort William");

                mPImage.add(R.drawable.k_howrah_bridge);
                mPlaces.add("Howrah Bridge");


                //Code for setting food

                mFImage.add(R.drawable.k_ganguramsweets);
                mFood.add("Fruit Kulfi");

                mFImage.add(R.drawable.k_ohcalcutta);
                mFood.add("Kochuri");

                mFImage.add(R.drawable.k_sixballygungeplace);
                mFood.add("Luchi");

                mFImage.add(R.drawable.k_ganguram);
                mFood.add("Ghugni");


                //Code for setting shops kolkata

                mSImage.add(R.drawable.k_clg_street);
                mShop.add("College Street");

                mSImage.add(R.drawable.k_burabazar);
                mShop.add("Bura Bazar");

                mSImage.add(R.drawable.k_colorful_wholesale_flowers);
                mShop.add("Phool Bazaar");

                mSImage.add(R.drawable.k_gariahat);
                mShop.add("Gariahat");



                //Hotels in kolkata

                mHImage.add(R.drawable.k_de_sovrani);
                mHotels.add("De Sovrani");

                mHImage.add(R.drawable.k_novetel);
                mHotels.add("Novotel ");

                mHImage.add(R.drawable.k_parkprime);
                mHotels.add("Park Prime");

                mHImage.add(R.drawable.k_pipaltree);
                mHotels.add("Pipal Tree");


                //Transport

                mTImage.add(R.drawable.k_airport);
                mTransport.add("Kolkata Airport");

                mTImage.add(R.drawable.k_howrah_station);
                mTransport.add("Howrah Station");

                mTImage.add(R.drawable.k_metro);
                mTransport.add("Kolkata Metro");

                initRecyclerView();
                break;

            case 6:
                //Code for setting places to visit
                mPImage.add(R.drawable.c_arignarannazoologicalpark);
                mPlaces.add("Arignaranna Zoo");

                mPImage.add(R.drawable.c_birlaplanetarium);
                mPlaces.add("Birla Planetarium");

                mPImage.add(R.drawable.c_elloitbeach);
                mPlaces.add("Elliot Beach");

                mPImage.add(R.drawable.c_fortstgeorge);
                mPlaces.add("Fort St George");


                //Code for setting food
                mFImage.add(R.drawable.c_annalaxmi);
                mFood.add("Anna Laxmi");

                mFImage.add(R.drawable.c_barbequenation);
                mFood.add("Barbeque Nation");

                mFImage.add(R.drawable.c_benjarong);
                mFood.add("Benjarong");

                mFImage.add(R.drawable.c_bombaylassi);
                mFood.add("Bombay Lassi");

                //Code for setting shops

                mSImage.add(R.drawable.c_abiramimegamall);
                mShop.add("Abirami Mall");

                mSImage.add(R.drawable.c_expressavenue);
                mShop.add("Express Avenue");

                mSImage.add(R.drawable.c_nungambakkam);
                mShop.add("Nungam Bakkam");

                mSImage.add(R.drawable.c_parryscorner);
                mShop.add("Parrys Corner");



                //Hotels

                mHImage.add(R.drawable.c_belstead);
                mHotels.add("Belstead");

                mHImage.add(R.drawable.c_itcgrandchola);
                mHotels.add("ITC Grand Chola");

                mHImage.add(R.drawable.c_pandian);
                mHotels.add("Pandian");

                mHImage.add(R.drawable.c_parkhyatt);
                mHotels.add("Park Hyatt");

                //Transport

                mTImage.add(R.drawable.c_chennaiairport);
                mTransport.add("Chennai Airport");

                mTImage.add(R.drawable.c_chennaicentralrailwaystation);
                mTransport.add("Central Railway Station");

                mTImage.add(R.drawable.c_egmore);
                mTransport.add("Egmore");

                mTImage.add(R.drawable.c_metro);
                mTransport.add("Chennai Metro");

                initRecyclerView();
                break;




            case 7:
                //Places in hyderabad

                mPImage.add(R.drawable.h_charminar);
                mPlaces.add("Charminar");

                mPImage.add(R.drawable.h_ramojifilmcity);
                mPlaces.add("Ramoji Film City");

                mPImage.add(R.drawable.h_hussainsagar);
                mPlaces.add("Hussain Sagar");

                mPImage.add(R.drawable.h_salarjungmuseum);
                mPlaces.add("Salar Jung Museum");


                //Food in hyderabad

                mFImage.add(R.drawable.h_paradisebiryani);
                mFood.add("Paradise Biryani");

                mFImage.add(R.drawable.h_chutneys);
                mFood.add("Chutneys");

                mFImage.add(R.drawable.h_jasheaudh);
                mFood.add("Jash e Audh");

                mFImage.add(R.drawable.h_ohm);
                mFood.add("Ohm");

                //Shopping in hyderabad

                mSImage.add(R.drawable.h_begumbazar);
                mShop.add("Begum Bazar");

                mSImage.add(R.drawable.h_koti);
                mShop.add("KOTI");

                mSImage.add(R.drawable.h_nampally);
                mShop.add("Nampally");

                mSImage.add(R.drawable.h_tobacobazar);
                mShop.add("Tobaco Bazar");



                //Hotels in hyderabad



                mHImage.add(R.drawable.h_itckakatiya);
                mHotels.add("ITC Kakatiya");


                mHImage.add(R.drawable.h_trident);
                mHotels.add("Trident ");

                mHImage.add(R.drawable.h_westin);
                mHotels.add("Westin ");

                mHImage.add(R.drawable.h_tajbanjara);
                mHotels.add("Taj Banjara");

                //Transport in hyderabad


                mTImage.add(R.drawable.h_secunderabad);
                mTransport.add("Secunderabad");

                mTImage.add(R.drawable.h_metro);
                mTransport.add("Hyderabad Metro");

                mTImage.add(R.drawable.h_rajivgandhiinternationalairport);
                mTransport.add("Rajiv Gandhi Airport");

                initRecyclerView();
                break;


            case 8:
                //Places in jaipur

                mPImage.add(R.drawable.j_hawamahal);
                mPlaces.add("Hawa Mahal");

                mPImage.add(R.drawable.j_jaigarhfort);
                mPlaces.add("Jaigarh Fort");

                mPImage.add(R.drawable.j_amberfort);
                mPlaces.add("Amber Fort");

                mPImage.add(R.drawable.j_jalmahal);
                mPlaces.add("Jal Mahal");


                //Food in hyderabad

                mFImage.add(R.drawable.j_onethreefivead);
                mFood.add("1135 AD");

                mFImage.add(R.drawable.j_suvarnamahal);
                mFood.add("Suvarna Mahal");

                mFImage.add(R.drawable.j_peacockrooftop);
                mFood.add("Peacock Rooftop");

                mFImage.add(R.drawable.j_laksmimishtan);
                mFood.add("Laksmi Misthan");

                //Shopping in jaipur

                mSImage.add(R.drawable.j_worldtradepark);
                mShop.add("World Trade Park");

                mSImage.add(R.drawable.j_pinksquaremall);
                mShop.add("Pink Square Mall");

                mSImage.add(R.drawable.j_nehrubazar);
                mShop.add("Nehru Bazar");

                mSImage.add(R.drawable.j_kishanpolibazar);
                mShop.add("Kishan Poli Bazar");



                //Hotels in jaipur



                mHImage.add(R.drawable.j_itcrajputana);
                mHotels.add("ITC Rajputana");


                mHImage.add(R.drawable.j_lalit);
                mHotels.add("Lalit");

                mHImage.add(R.drawable.j_oberoirajvilas);
                mHotels.add("Oberoi Raj Vilas");

                mHImage.add(R.drawable.j_ramada);
                mHotels.add("Ramada");

                //Transport in jaipur


                mTImage.add(R.drawable.j_airport);
                mTransport.add("Jaipur Airport");

                mTImage.add(R.drawable.j_jaipurrailwaystation);
                mTransport.add("Jaipur Railway Station");

                mTImage.add(R.drawable.j_metro);
                mTransport.add("Jaipur Metro");

                initRecyclerView();
                break;
        }

    }




    //Converting all drawable images to bitmap images
    private void initRecyclerView() {

        for(int i=0 ; i<mPImage.size();i++)
        {
            Places.add(ImageScaler.decodeSampledBitmapFromResource(getResources(),mPImage.get(i),120,120));

        }

        for(int i=0 ; i<mFImage.size();i++)
        {
            Food.add(ImageScaler.decodeSampledBitmapFromResource(getResources(),mFImage.get(i),120,120));

        }

        for(int i=0 ; i<mSImage.size();i++)
        {
            Shopping.add(ImageScaler.decodeSampledBitmapFromResource(getResources(),mSImage.get(i),120,120));

        }

        for(int i=0 ; i<mHImage.size();i++)
        {
            Hotels.add(ImageScaler.decodeSampledBitmapFromResource(getResources(),mHImage.get(i),120,120));

        }

        for(int i=0 ; i<mTImage.size();i++)
        {
            Transport.add(ImageScaler.decodeSampledBitmapFromResource(getResources(),mTImage.get(i),120,120));

        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mPlaces, mPImage,Places);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.recycler2);
        recyclerView2.setLayoutManager(layoutManager2);
        RecyclerViewAdapter2 adapter2 = new RecyclerViewAdapter2(this, mFood, mFImage,Food);
        recyclerView2.setAdapter(adapter2);

        LinearLayoutManager layoutManager3 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.recycler3);
        recyclerView3.setLayoutManager(layoutManager3);
        RecyclerViewAdapter3 adapter3 = new RecyclerViewAdapter3(this, mShop, mSImage,Shopping);
        recyclerView3.setAdapter(adapter3);

        LinearLayoutManager layoutManager4 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView4 = (RecyclerView) findViewById(R.id.recycler4);
        recyclerView4.setLayoutManager(layoutManager4);
        RecyclerViewAdapter4 adapter4 = new RecyclerViewAdapter4(this, mHotels, mHImage,Hotels);
        recyclerView4.setAdapter(adapter4);

        LinearLayoutManager layoutManager5 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView5 = (RecyclerView) findViewById(R.id.recycler5);
        recyclerView5.setLayoutManager(layoutManager5);
        RecyclerViewAdapter5 adapter5 = new RecyclerViewAdapter5(this, mTransport, mTImage,Transport);
        recyclerView5.setAdapter(adapter5);

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
