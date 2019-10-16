package com.codecenter1430gmail.travelcityfinal;

import android.support.v7.app.AppCompatActivity;


        import android.graphics.Bitmap;
        import android.graphics.drawable.BitmapDrawable;
        import android.graphics.drawable.ColorDrawable;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.view.MenuItem;

        import java.util.ArrayList;

public class FullView extends AppCompatActivity {

    String city_name;
    int category;


    public ArrayList<String> mCommon = new ArrayList<>();
    public ArrayList<Integer> mCommonImage = new ArrayList<>();
    public ArrayList<Bitmap> BitImage = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Redcolor)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0);


        city_name = getIntent().getStringExtra("city_name");
        category = getIntent().getIntExtra("category", 0);


        switch (city_name) {

            case "pune":

                switch (category) {
                    case 1:
                        mCommonImage.add(R.drawable.p_dagdushet);
                        mCommon.add("Dagdusheth Temple");

                        mCommonImage.add(R.drawable.p_lalmahal);
                        mCommon.add("LalMahal");

                        mCommonImage.add(R.drawable.p_agakhanpalace);
                        mCommon.add("Agakhan Palace");

                        mCommonImage.add(R.drawable.p_sarasbaugh);
                        mCommon.add("Sarasbaug");

                        mCommonImage.add(R.drawable.p_shaniwarwada);
                        mCommon.add("Shaniwarwada");

                        mCommonImage.add(R.drawable.p_sinhagadfort);
                        mCommon.add("Sinhgad Fort");

                        mCommonImage.add(R.drawable.p_lavasa);
                        mCommon.add("Lavasa");

                        mCommonImage.add(R.drawable.p_lonavla);
                        mCommon.add("Lonavla");

                        mCommonImage.add(R.drawable.p_bladesofglorymeuseum);
                        mCommon.add("Blades Of Glory");

                        break;


                    case 2:
                        mCommonImage.add(R.drawable.p_kayanibakery);
                        mCommon.add("Kayani Bakery");

                        mCommonImage.add(R.drawable.p_sujatamastani);
                        mCommon.add("Sujata Mastani");

                        mCommonImage.add(R.drawable.p_katakir);
                        mCommon.add("Katakir");

                        mCommonImage.add(R.drawable.p_chitalebandhu);
                        mCommon.add("Chitale Bandhu");

                        mCommonImage.add(R.drawable.p_vaishali);
                        mCommon.add("Vaishali");

                        mCommonImage.add(R.drawable.p_german);
                        mCommon.add("German Bakery");

                        mCommonImage.add(R.drawable.p_agentjack);
                        mCommon.add("Agent Jack");

                        mCommonImage.add(R.drawable.p_miami);
                        mCommon.add("Miami");

                        mCommonImage.add(R.drawable.p_mix36);
                        mCommon.add("Mix 36");

                        mCommonImage.add(R.drawable.p_penthouze);
                        mCommon.add("Penthouze");


                        break;


                    case 3:
                        mCommonImage.add(R.drawable.p_tulsibaugh);
                        mCommon.add("Tulshi Baug");

                        mCommonImage.add(R.drawable.p_fashionstreet);
                        mCommon.add("F-Street");

                        mCommonImage.add(R.drawable.p_fcroad);
                        mCommon.add("FC Road");

                        mCommonImage.add(R.drawable.hongkonglane);
                        mCommon.add("Hong Kong Lane");

                        mCommonImage.add(R.drawable.abc);
                        mCommon.add("Appa Balvant Chowk");

                        mCommonImage.add(R.drawable.juna_bazar);
                        mCommon.add("Juna Bazar");

                        mCommonImage.add(R.drawable.amanora);
                        mCommon.add("Amanora");

                        mCommonImage.add(R.drawable.seasonsmall);
                        mCommon.add("Seasons Mall");

                        mCommonImage.add(R.drawable.p_phoenix);
                        mCommon.add("Phoenix Mall");


                        break;


                    case 4:

                        mCommonImage.add(R.drawable.p_westin);
                        mCommon.add("Westin");

                        mCommonImage.add(R.drawable.p_jw);
                        mCommon.add("JW Marriott");

                        mCommonImage.add(R.drawable.p_hyatt);
                        mCommon.add("Hyatt");

                        mCommonImage.add(R.drawable.p_royalorchid);
                        mCommon.add("Royal Orchid");

                        mCommonImage.add(R.drawable.p_conard);
                        mCommon.add("Conrad");

                        mCommonImage.add(R.drawable.p_novotel);
                        mCommon.add("Novotel");

                        break;


                    case 5:
                        mCommonImage.add(R.drawable.punestation);
                        mCommon.add("Railway Station");

                        mCommonImage.add(R.drawable.puneairport);
                        mCommon.add("Airport");
                        break;

                }

                setData();
                break;


            case "mumbai":


                switch (category) {
                    case 1:
                        mCommonImage.add(R.drawable.m_marinedrive);
                        mCommon.add("Marine Drive");

                        mCommonImage.add(R.drawable.m_bandraworli);
                        mCommon.add("Bandra-Worli SeaLink");

                        mCommonImage.add(R.drawable.m_gatewayofindia);
                        mCommon.add("Gateway of India");

                        mCommonImage.add(R.drawable.m_juhubeach);
                        mCommon.add("Juhu Beach");

                        mCommonImage.add(R.drawable.m_hajialidargah);
                        mCommon.add("Haji Ali Dargah");

                        mCommonImage.add(R.drawable.m_elephantacaves);
                        mCommon.add("Elephant Caves");

                        mCommonImage.add(R.drawable.m_nehrusciencecenter);
                        mCommon.add("Science Center");

                        mCommonImage.add(R.drawable.m_esselworld);
                        mCommon.add("Essel World");

                        mCommonImage.add(R.drawable.m_redcarpetwaxmuseum);
                        mCommon.add("Wax Museum");

                        mCommonImage.add(R.drawable.m_siddhivinayaka);
                        mCommon.add("Siddhivinayak");

                        break;


                    case 2:
                        mCommonImage.add(R.drawable.m_ashokvadapav);
                        mCommon.add("Ashok vadapav");

                        mCommonImage.add(R.drawable.m_aswad);
                        mCommon.add("Aswad");

                        mCommonImage.add(R.drawable.m_punjabgrill);
                        mCommon.add("Punjabi Grill");

                        mCommonImage.add(R.drawable.m_cafemondeger);
                        mCommon.add("Cafe Mondegar");

                        mCommonImage.add(R.drawable.m_estella);
                        mCommon.add("Estella");

                        mCommonImage.add(R.drawable.m_pizzabythebay);
                        mCommon.add("Pizza by the bay");

                        mCommonImage.add(R.drawable.m_sanchos);
                        mCommon.add("Sanchos");

                        mCommonImage.add(R.drawable.m_tastingroom);
                        mCommon.add("Tasting Room");

                        mCommonImage.add(R.drawable.m_aer);
                        mCommon.add("Aer");

                        break;


                    case 3:
                        mCommonImage.add(R.drawable.m_colobacauseway);
                        mCommon.add("Colaba Causeway");

                        mCommonImage.add(R.drawable.m_mangaldasmarket);
                        mCommon.add("Mangaldas Market");

                        mCommonImage.add(R.drawable.m_fashionstreet);
                        mCommon.add("Fashion Street");

                        mCommonImage.add(R.drawable.m_chorbazar);
                        mCommon.add("Chorbazar");

                        mCommonImage.add(R.drawable.m_crawfordmarket);
                        mCommon.add("Crawford Market");

                        mCommonImage.add(R.drawable.m_manishmarket);
                        mCommon.add("Manish Market");

                        mCommonImage.add(R.drawable.m_rcitymall);
                        mCommon.add("R City Mall");

                        mCommonImage.add(R.drawable.m_seawoodsgrandcentralmall);
                        mCommon.add("Sea Woods Mall");

                        mCommonImage.add(R.drawable.m_inorbitshoppingmall);
                        mCommon.add("Inorbit Mall");

                        mCommonImage.add(R.drawable.m_highpheonix);
                        mCommon.add("High Phoenix");

                        mCommonImage.add(R.drawable.m_vivianamall);
                        mCommon.add("Vivian Mall");
                        break;


                    case 4:
                        mCommonImage.add(R.drawable.m_tajhotel);
                        mCommon.add("Taj");

                        mCommonImage.add(R.drawable.m_oberio);
                        mCommon.add("Oberoi");

                        mCommonImage.add(R.drawable.m_tridentnarimanpoint);
                        mCommon.add("Trident");

                        mCommonImage.add(R.drawable.m_pridehotel);
                        mCommon.add("Pride");

                        mCommonImage.add(R.drawable.m_hyatt);
                        mCommon.add("Hyatt ");

                        mCommonImage.add(R.drawable.m_siestahotel);
                        mCommon.add("Siesta");

                        mCommonImage.add(R.drawable.m_atlasplaza);
                        mCommon.add("Atlas Plaza");

                        break;


                    case 5:


                        mCommonImage.add(R.drawable.m_airport);
                        mCommon.add("Mumbai Airport");

                        mCommonImage.add(R.drawable.m_cst);
                        mCommon.add("CST");

                        mCommonImage.add(R.drawable.m_andherimetro);
                        mCommon.add("Mumbai Metro");

                        mCommonImage.add(R.drawable.m_churchgate);
                        mCommon.add("Churchgate");

                        mCommonImage.add(R.drawable.m_kalyan);
                        mCommon.add("Kalyan");

                        mCommonImage.add(R.drawable.m_thane);
                        mCommon.add("Thane");


                        break;
                }
                setData();
                break;


            case "delhi":


                switch (category) {
                    case 1:
                        mCommonImage.add(R.drawable.d_akshardham);
                        mCommon.add("Akshardham");

                        mCommonImage.add(R.drawable.d_banglasahibgurudwara);
                        mCommon.add("Banglasahib Gurudwara");

                        mCommonImage.add(R.drawable.d_humayunstomb);
                        mCommon.add("Humayun's Tomb");

                        mCommonImage.add(R.drawable.d_indiagate);
                        mCommon.add("India Gate");

                        mCommonImage.add(R.drawable.d_jamamasjid);
                        mCommon.add("Jama Masjid");

                        mCommonImage.add(R.drawable.d_jantarmantar);
                        mCommon.add("Jantar Mantar");

                        mCommonImage.add(R.drawable.d_lotustemple);
                        mCommon.add("Lotus Temple");

                        mCommonImage.add(R.drawable.d_nationalrailmuseum);
                        mCommon.add("National Rail Museum");

                        mCommonImage.add(R.drawable.d_nationalsciencecenter);
                        mCommon.add("Science Center ");

                        mCommonImage.add(R.drawable.d_qutubminar);
                        mCommon.add("Qutubminar");

                        mCommonImage.add(R.drawable.d_rajghat);
                        mCommon.add("Rajghat");

                        mCommonImage.add(R.drawable.d_rashtrapatibhavan);
                        mCommon.add("Rashtrapati Bhavan");

                        mCommonImage.add(R.drawable.d_redfort);
                        mCommon.add("RedFort");

                        mCommonImage.add(R.drawable.d_safdarjungstomb);
                        mCommon.add("Safdarjung's Tomb");


                        break;


                    case 2:
                        mCommonImage.add(R.drawable.d_beeryani);
                        mCommon.add("Beeryani");

                        mCommonImage.add(R.drawable.d_bishanswaroop);
                        mCommon.add("Bishan Swaroop");

                        mCommonImage.add(R.drawable.d_bukhara);
                        mCommon.add("Bukhara");

                        mCommonImage.add(R.drawable.d_chorbizarre);
                        mCommon.add("Chorbizzare");

                        mCommonImage.add(R.drawable.d_khandanipakodewala);
                        mCommon.add("Khandani Pakoda");

                        mCommonImage.add(R.drawable.d_lalababuchatbhandar);
                        mCommon.add("Lalababu Chaat");

                        mCommonImage.add(R.drawable.d_lordofdrinks);
                        mCommon.add("Lord of drinks");

                        mCommonImage.add(R.drawable.d_paranthewaligali);
                        mCommon.add("Paranthe wali gali");

                        mCommonImage.add(R.drawable.d_punjabgrill);
                        mCommon.add("Punjabi Grill ");

                        mCommonImage.add(R.drawable.d_rosecafe);
                        mCommon.add("Rose Cafe");

                        mCommonImage.add(R.drawable.d_salimskebab);
                        mCommon.add("Salim's Kebab");

                        mCommonImage.add(R.drawable.d_shreebalajichatbhandar);
                        mCommon.add("Shree Balaji Chat");

                        mCommonImage.add(R.drawable.d_summerhousecafe);
                        mCommon.add("Summer house");

                        mCommonImage.add(R.drawable.d_thalaivar);
                        mCommon.add("Thalaivar");

                        mCommonImage.add(R.drawable.d_thebigyellowdoor);
                        mCommon.add("The big Yellow door");
                        break;


                    case 3:
                        mCommonImage.add(R.drawable.d_ambiencemall);
                        mCommon.add("Ambience Mall");

                        mCommonImage.add(R.drawable.d_cannaughtplace);
                        mCommon.add("Connaught Place");

                        mCommonImage.add(R.drawable.d_chandanichowk);
                        mCommon.add("Chandani Chowk");

                        mCommonImage.add(R.drawable.d_dilihaat);
                        mCommon.add("Dilihaat");

                        mCommonImage.add(R.drawable.d_dlfpromenade);
                        mCommon.add("DLF Promenade");

                        mCommonImage.add(R.drawable.d_janpathmarket);
                        mCommon.add("Janpath Market");

                        mCommonImage.add(R.drawable.d_karolbaghmarket);
                        mCommon.add("Karol Bagh Market");

                        mCommonImage.add(R.drawable.d_khanmarket);
                        mCommon.add("Khan Market");

                        mCommonImage.add(R.drawable.d_lajpatnagarmarket);
                        mCommon.add("Lajpat nagar Market");

                        mCommonImage.add(R.drawable.d_palikabazar);
                        mCommon.add("Palika Bazar");

                        mCommonImage.add(R.drawable.d_sarojinimarket);
                        mCommon.add("Sarojini Market");

                        mCommonImage.add(R.drawable.d_selectcitywalk);
                        mCommon.add("Select City Walk");
                        break;


                    case 4:

                        mCommonImage.add(R.drawable.d_hotelleroi);
                        mCommon.add("Leroi");

                        mCommonImage.add(R.drawable.d_hoteltoronto);
                        mCommon.add("Toronto");

                        mCommonImage.add(R.drawable.d_itcmaurya);
                        mCommon.add("ITC Maurya");

                        mCommonImage.add(R.drawable.d_jwmariot);
                        mCommon.add("JW Marriott ");

                        mCommonImage.add(R.drawable.d_thelodhi);
                        mCommon.add("The Lodhi");

                        mCommonImage.add(R.drawable.d_thetajmahalhotel);
                        mCommon.add("Taj Mahal");
                        break;


                    case 5:
                        mCommonImage.add(R.drawable.d_chandanichowkmetrostation);
                        mCommon.add("Chandni Chowk Metro");

                        mCommonImage.add(R.drawable.d_indiragandhiairport);
                        mCommon.add("Indira Gandhi Airport");

                        mCommonImage.add(R.drawable.d_newdelhistation);
                        mCommon.add("New Delhi Station");

                        mCommonImage.add(R.drawable.d_olddelhistation);
                        mCommon.add("Old Delhi Station");


                        break;
                }
                setData();
                break;


            case "blore":


                switch (category) {
                    case 1:
                        mCommonImage.add(R.drawable.b_bangalorepalace);
                        mCommon.add("Banglore Palace");

                        mCommonImage.add(R.drawable.b_bannerghattanationalpark);
                        mCommon.add("Baner Ghatta Park");

                        mCommonImage.add(R.drawable.b_cubbonpark);
                        mCommon.add("Cubbon Park");

                        mCommonImage.add(R.drawable.b_innovativefilmcity);
                        mCommon.add("Innovative Film City");

                        mCommonImage.add(R.drawable.b_kaiwaratemple);
                        mCommon.add("Kaiwara Temple");

                        mCommonImage.add(R.drawable.b_lalbaghbotanicalgardens);
                        mCommon.add("Lal Bagh Botanicals");

                        mCommonImage.add(R.drawable.b_nandihills);
                        mCommon.add("Nandi Hills");

                        mCommonImage.add(R.drawable.b_nationalgalleryofmodernart);
                        mCommon.add("National Gallery of Art");

                        mCommonImage.add(R.drawable.b_shivasamudramfalls);
                        mCommon.add("Shivsamudra Falls");

                        mCommonImage.add(R.drawable.b_stmarybasilica);
                        mCommon.add("St. Mary Basilica");

                        mCommonImage.add(R.drawable.b_tipusultanfort);
                        mCommon.add("Tipusultan Fort");

                        mCommonImage.add(R.drawable.b_vidhansoudha);
                        mCommon.add("Vidhan Soudha");

                        break;


                    case 2:
                        mCommonImage.add(R.drawable.b_centraltiffinroom);
                        mCommon.add("Central Tiffin Room");

                        mCommonImage.add(R.drawable.b_dakshin);
                        mCommon.add("Dakshin ");

                        mCommonImage.add(R.drawable.b_karavalli);
                        mCommon.add("Karavalli");

                        mCommonImage.add(R.drawable.b_koshysbarandrestaurant);
                        mCommon.add("Koshy's Bar and Restro");

                        mCommonImage.add(R.drawable.b_mavallitiffinrooms);
                        mCommon.add("Mavalli Tiffin Rooms");

                        mCommonImage.add(R.drawable.b_puchkas);
                        mCommon.add("Puchkas");

                        mCommonImage.add(R.drawable.b_punjabpleasures);
                        mCommon.add("Punjab Pleasures");

                        mCommonImage.add(R.drawable.b_shahidarbar);
                        mCommon.add("Shahi Darbar");

                        mCommonImage.add(R.drawable.b_srisairamschatsandjuice);
                        mCommon.add("Sri Sairam's Chaat");

                        mCommonImage.add(R.drawable.b_vwpuramfoodstreet);
                        mCommon.add("VW Puram Food Street ");
                        break;


                    case 3:
                        mCommonImage.add(R.drawable.b_basavanagudi);
                        mCommon.add("Basavana Gudi");

                        mCommonImage.add(R.drawable.b_brigaderoad);
                        mCommon.add("Brigade Road");

                        mCommonImage.add(R.drawable.b_chickpet);
                        mCommon.add("Chick Pet");

                        mCommonImage.add(R.drawable.b_commercialstreet);
                        mCommon.add("Commercial Street");

                        mCommonImage.add(R.drawable.b_forummall);
                        mCommon.add("Forum Mall");

                        mCommonImage.add(R.drawable.b_gandhibazar);
                        mCommon.add("Gandhi Bazar");

                        mCommonImage.add(R.drawable.b_jayanagarfourththblock);
                        mCommon.add("Jaynagar 4th Block");

                        mCommonImage.add(R.drawable.b_malleshwarmarket);
                        mCommon.add("Malleshwar Market");

                        mCommonImage.add(R.drawable.b_mantrisquare);
                        mCommon.add("Mantri Square");

                        mCommonImage.add(R.drawable.b_ubcity);
                        mCommon.add("UB City");

                        mCommonImage.add(R.drawable.g_garudamall);
                        mCommon.add("Garud Mall");

                        break;


                    case 4:

                        mCommonImage.add(R.drawable.b_goldenrecidency);
                        mCommon.add("Golden Residency");

                        mCommonImage.add(R.drawable.b_hmsuitesandstudios);
                        mCommon.add("HM Suites");

                        mCommonImage.add(R.drawable.b_itcwindsor);
                        mCommon.add("ITC Windsor");

                        mCommonImage.add(R.drawable.b_lalitashok);
                        mCommon.add("Lalit Ashok");

                        mCommonImage.add(R.drawable.b_leelapalace);
                        mCommon.add("LeeLa Palace");

                        mCommonImage.add(R.drawable.b_mintpropus);
                        mCommon.add("Mint Propus");

                        mCommonImage.add(R.drawable.b_oberio);
                        mCommon.add("The Oberoi");

                        mCommonImage.add(R.drawable.b_signatureinn);
                        mCommon.add("Signature Inn");

                        mCommonImage.add(R.drawable.b_treebosilverstar);
                        mCommon.add("Treebo Silver Star");

                        mCommonImage.add(R.drawable.b_zuriwhitefield);
                        mCommon.add("Zuri White Field");

                        mCommonImage.add(R.drawable.d_itcgardenia);
                        mCommon.add("ITC Gardenia");
                        break;


                    case 5:

                        mCommonImage.add(R.drawable.b_airport);
                        mCommon.add("Banglore Airport");

                        mCommonImage.add(R.drawable.b_bangalorerailwaystation);
                        mCommon.add("Banglore Railway Station");

                        mCommonImage.add(R.drawable.b_metro);
                        mCommon.add("Banglore Metro");

                        mCommonImage.add(R.drawable.b_yeshvantpur);
                        mCommon.add("Yeshvantpur");


                        break;

                }
                setData();
                break;


            case "kolkata":

                switch (category) {
                    case 1:
                        mCommonImage.add(R.drawable.k_belur_math);
                        mCommon.add("Belur Math");

                        mCommonImage.add(R.drawable.k_botanical_gardens);
                        mCommon.add("Botanical Gardens");

                        mCommonImage.add(R.drawable.k_fort_william);
                        mCommon.add("Fort William");

                        mCommonImage.add(R.drawable.k_aliporezoo);
                        mCommon.add("Alipore Zoo");

                        mCommonImage.add(R.drawable.k_birla_planetarium);
                        mCommon.add("Birla Planetarium ");

                        mCommonImage.add(R.drawable.k_esplanade);
                        mCommon.add("Esplanade");

                        mCommonImage.add(R.drawable.k_howrah_bridge);
                        mCommon.add("Howrah Bridge");

                        mCommonImage.add(R.drawable.k_indian_mus);
                        mCommon.add("Indian Museum");

                        mCommonImage.add(R.drawable.k_st_pauls);
                        mCommon.add("St. Paul's");

                        mCommonImage.add(R.drawable.k_victoria_memorial);
                        mCommon.add("Victoria Meomrial");

                        break;


                    case 2:
                        mCommonImage.add(R.drawable.k_ganguramsweets);
                        mCommon.add("Ganguram Sweets");

                        mCommonImage.add(R.drawable.k_ohcalcutta);
                        mCommon.add("Oh! Calcutta");

                        mCommonImage.add(R.drawable.k_sixballygungeplace);
                        mCommon.add("6 Ballygunge Place");

                        mCommonImage.add(R.drawable.k_bohemian);
                        mCommon.add("Bohemian");

                        mCommonImage.add(R.drawable.k_jiyopiyo);
                        mCommon.add("Jiyo Piyo");

                        mCommonImage.add(R.drawable.k_kewpieskitchen);
                        mCommon.add("Kew Pie's Kitchen");

                        mCommonImage.add(R.drawable.k_ganguram);
                        mCommon.add("Ganguram");

                        mCommonImage.add(R.drawable.k_thebhojcompany);
                        mCommon.add("The Bhoj Company");


                        break;


                    case 3:
                        mCommonImage.add(R.drawable.k_clg_street);
                        mCommon.add("College Street");

                        mCommonImage.add(R.drawable.k_burabazar);
                        mCommon.add("Bura Bazar");

                        mCommonImage.add(R.drawable.k_colorful_wholesale_flowers);
                        mCommon.add("Phool Bazaar");

                        mCommonImage.add(R.drawable.k_gariahat);
                        mCommon.add("Gariahat");

                        mCommonImage.add(R.drawable.k_hatibagan);
                        mCommon.add("Hatibagan");

                        mCommonImage.add(R.drawable.k_newmarket);
                        mCommon.add("New Market");

                        mCommonImage.add(R.drawable.k_south_city_mall);
                        mCommon.add("South City Mall");
                        break;


                    case 4:
                        mCommonImage.add(R.drawable.k_de_sovrani);
                        mCommon.add("De Sovrani");

                        mCommonImage.add(R.drawable.k_novetel);
                        mCommon.add("Novotel ");

                        mCommonImage.add(R.drawable.k_parkprime);
                        mCommon.add("Park Prime");

                        mCommonImage.add(R.drawable.k_pipaltree);
                        mCommon.add("Pipal Tree");

                        mCommonImage.add(R.drawable.k_the_lalit_great_eastern);
                        mCommon.add("The Lalit Great Eastern");

                        break;


                    case 5:

                        mCommonImage.add(R.drawable.k_airport);
                        mCommon.add("Kolkata Airport");

                        mCommonImage.add(R.drawable.k_howrah_station);
                        mCommon.add("Howrah Station");

                        mCommonImage.add(R.drawable.k_metro);
                        mCommon.add("Kolkata Metro");

                        break;
                }
                setData();
                break;


            case "chennai":


                switch (category) {
                    case 1:
                        mCommonImage.add(R.drawable.c_arignarannazoologicalpark);
                        mCommon.add("Arignaranna Zoo");

                        mCommonImage.add(R.drawable.c_birlaplanetarium);
                        mCommon.add("Birla Planetarium");

                        mCommonImage.add(R.drawable.c_elloitbeach);
                        mCommon.add("Elliot Beach");

                        mCommonImage.add(R.drawable.c_fortstgeorge);
                        mCommon.add("Fort St George");

                        mCommonImage.add(R.drawable.c_kapaleeswarartemple);
                        mCommon.add("Kapaleeswarar Temple");

                        mCommonImage.add(R.drawable.c_marinabeach);
                        mCommon.add("Marina Beach");

                        mCommonImage.add(R.drawable.c_mgmdizzeeworld);
                        mCommon.add("MGM dizzee world");

                        mCommonImage.add(R.drawable.c_nationalartgallery);
                        mCommon.add("National Art Gallery");

                        mCommonImage.add(R.drawable.c_santhomechurch);
                        mCommon.add("Santhome Church");

                        mCommonImage.add(R.drawable.c_thousandslightmosque);
                        mCommon.add("Thousands Light Mosque");

                        break;


                    case 2:
                        mCommonImage.add(R.drawable.c_annalaxmi);
                        mCommon.add("Anna Laxmi");

                        mCommonImage.add(R.drawable.c_barbequenation);
                        mCommon.add("Barbeque Nation");

                        mCommonImage.add(R.drawable.c_benjarong);
                        mCommon.add("Benjarong");

                        mCommonImage.add(R.drawable.c_bombaylassi);
                        mCommon.add("Bombay Lassi");

                        mCommonImage.add(R.drawable.c_dakshin);
                        mCommon.add("Dakshin");

                        mCommonImage.add(R.drawable.c_italiaattheparkpod);
                        mCommon.add("Italia at the parkpod");

                        mCommonImage.add(R.drawable.c_madraspavilion);
                        mCommon.add("Madras Pavillion");

                        mCommonImage.add(R.drawable.c_muruganidlishop);
                        mCommon.add("Murugan Idli Shop");

                        mCommonImage.add(R.drawable.c_panasian);
                        mCommon.add("Panasian");

                        mCommonImage.add(R.drawable.c_southernspice);
                        mCommon.add("Southern Spice");

                        mCommonImage.add(R.drawable.c_thalapakattubiryani);
                        mCommon.add("Thalapakattu Biryani");

                        break;


                    case 3:
                        mCommonImage.add(R.drawable.c_abiramimegamall);
                        mCommon.add("Abirami Mall");

                        mCommonImage.add(R.drawable.c_expressavenue);
                        mCommon.add("Express Avenue");

                        mCommonImage.add(R.drawable.c_nungambakkam);
                        mCommon.add("Nungam Bakkam");

                        mCommonImage.add(R.drawable.c_parryscorner);
                        mCommon.add("Parrys Corner");

                        mCommonImage.add(R.drawable.c_phoenix);
                        mCommon.add("Phoenix Mall ");

                        mCommonImage.add(R.drawable.c_pondibazaar);
                        mCommon.add("Pondi Bazaar");

                        mCommonImage.add(R.drawable.c_ritchiestreet);
                        mCommon.add("Ritchie Street");

                        mCommonImage.add(R.drawable.c_snowcarpet);
                        mCommon.add("Snow Carpet");

                        mCommonImage.add(R.drawable.c_spencerplaza);
                        mCommon.add("Spencer Plaza");

                        mCommonImage.add(R.drawable.c_tnagar);
                        mCommon.add("T Nagar");


                        break;


                    case 4:
                        mCommonImage.add(R.drawable.c_belstead);
                        mCommon.add("Belstead");

                        mCommonImage.add(R.drawable.c_itcgrandchola);
                        mCommon.add("ITC Grand Chola");

                        mCommonImage.add(R.drawable.c_pandian);
                        mCommon.add("Pandian");

                        mCommonImage.add(R.drawable.c_parkhyatt);
                        mCommon.add("Park Hyatt");

                        mCommonImage.add(R.drawable.c_radison);
                        mCommon.add("Radison");

                        mCommonImage.add(R.drawable.c_royalregency);
                        mCommon.add("Royal Agency");

                        mCommonImage.add(R.drawable.c_savera);
                        mCommon.add("Savera");

                        mCommonImage.add(R.drawable.c_theleelapalace);
                        mCommon.add("Leela Palace");

                        mCommonImage.add(R.drawable.c_theparkchennai);
                        mCommon.add("Park Chennai");
                        break;


                    case 5:
                        mCommonImage.add(R.drawable.c_chennaiairport);
                        mCommon.add("Chennai Airport");

                        mCommonImage.add(R.drawable.c_chennaicentralrailwaystation);
                        mCommon.add("Central Railway Station");

                        mCommonImage.add(R.drawable.c_egmore);
                        mCommon.add("Egmore");

                        mCommonImage.add(R.drawable.c_metro);
                        mCommon.add("Chennai Metro");

                        break;
                }
                setData();
                break;

            case "hyderabad": {
                switch (category) {
                    case 1:
                        mCommonImage.add(R.drawable.h_charminar);
                        mCommon.add("Charminar");

                        mCommonImage.add(R.drawable.h_ramojifilmcity);
                        mCommon.add("Ramoji Film City");

                        mCommonImage.add(R.drawable.h_hussainsagar);
                        mCommon.add("Hussain Sagar");

                        mCommonImage.add(R.drawable.h_salarjungmuseum);
                        mCommon.add("Salar Jung Museum");

                        mCommonImage.add(R.drawable.h_birlamandir);
                        mCommon.add("Birla Mandir");

                        mCommonImage.add(R.drawable.h_nehruzoologicalpark);
                        mCommon.add("Nehru Zoological Park");

                        mCommonImage.add(R.drawable.h_golcondafort);
                        mCommon.add("Golconda Fort");

                        mCommonImage.add(R.drawable.h_lumbinipark);
                        mCommon.add("Lumbini Park");

                        mCommonImage.add(R.drawable.h_snowworld);
                        mCommon.add("Snow World");

                        mCommonImage.add(R.drawable.h_ntrgarden);
                        mCommon.add("NTR Garden");
                        break;


                    case 2:

                        mCommonImage.add(R.drawable.h_paradisebiryani);
                        mCommon.add("Paradise Biryani");

                        mCommonImage.add(R.drawable.h_chutneys);
                        mCommon.add("Chutneys");

                        mCommonImage.add(R.drawable.h_jasheaudh);
                        mCommon.add("Jash e Audh");

                        mCommonImage.add(R.drawable.h_ohm);
                        mCommon.add("Ohm");

                        mCommonImage.add(R.drawable.h_dakshin);
                        mCommon.add("Dakshin  ");

                        mCommonImage.add(R.drawable.h_minervacoffeshop);
                        mCommon.add("Minerva Coffee Shop");

                        mCommonImage.add(R.drawable.h_guffa);
                        mCommon.add("Guffa");

                        mCommonImage.add(R.drawable.h_olivebistro);
                        mCommon.add("Olive Bistro");

                        mCommonImage.add(R.drawable.h_sahibsindhsultan);
                        mCommon.add("Sahib Sindh Sultan");

                        break;


                    case 3:

                        mCommonImage.add(R.drawable.h_begumbazar);
                        mCommon.add("Begum Bazar");

                        mCommonImage.add(R.drawable.h_koti);
                        mCommon.add("KOTI");

                        mCommonImage.add(R.drawable.h_nampally);
                        mCommon.add("Nampally");

                        mCommonImage.add(R.drawable.h_tobacobazar);
                        mCommon.add("Tobaco Bazar");

                        mCommonImage.add(R.drawable.h_laadbazar);
                        mCommon.add("Laad Bazar");

                        mCommonImage.add(R.drawable.h_forumsujana);
                        mCommon.add("Forum Sujana Mall");

                        mCommonImage.add(R.drawable.h_centralmall);
                        mCommon.add("Hyderabad Central");

                        mCommonImage.add(R.drawable.h_perfume);
                        mCommon.add("Perfume Market");

                        break;


                    case 4:

                        mCommonImage.add(R.drawable.h_itckakatiya);
                        mCommon.add("ITC Kakatiya");

                        mCommonImage.add(R.drawable.h_trident);
                        mCommon.add("Trident ");

                        mCommonImage.add(R.drawable.h_westin);
                        mCommon.add("Westin ");

                        mCommonImage.add(R.drawable.h_tajbanjara);
                        mCommon.add("Taj Banjara");

                        mCommonImage.add(R.drawable.h_vivantataj);
                        mCommon.add("Vivanta Taj");

                        mCommonImage.add(R.drawable.h_sheraton);
                        mCommon.add("Sheraton");

                        mCommonImage.add(R.drawable.h_thepark);
                        mCommon.add("The Park");

                        break;


                    case 5:

                        mCommonImage.add(R.drawable.h_secunderabad);
                        mCommon.add("Secunderabad");

                        mCommonImage.add(R.drawable.h_metro);
                        mCommon.add("Hyderabad Metro");

                        mCommonImage.add(R.drawable.h_rajivgandhiinternationalairport);
                        mCommon.add("Rajiv Gandhi Airport");

                        mCommonImage.add(R.drawable.h_hyderabad);
                        mCommon.add("Hyderabad Railway Station");
                        break;

                }
                setData();
                break;
            }

            case "jaipur": {
                switch (category) {
                    case 1:
                        mCommonImage.add(R.drawable.j_hawamahal);
                        mCommon.add("Hawa Mahal");

                        mCommonImage.add(R.drawable.j_jaigarhfort);
                        mCommon.add("Jaigarh Fort");

                        mCommonImage.add(R.drawable.j_amberfort);
                        mCommon.add("Amber Fort");

                        mCommonImage.add(R.drawable.j_jalmahal);
                        mCommon.add("Jal Mahal");

                        mCommonImage.add(R.drawable.j_jantarmantar);
                        mCommon.add("Jantar Mantar");

                        mCommonImage.add(R.drawable.j_nahargarhfort);
                        mCommon.add("Nahargarh Fort");

                        mCommonImage.add(R.drawable.j_alberthallmuseum);
                        mCommon.add("Albert Hall Musuem");

                        mCommonImage.add(R.drawable.j_rajmandir);
                        mCommon.add("RajMandir");

                        mCommonImage.add(R.drawable.j_citypalace);
                        mCommon.add("City Palace");

                        mCommonImage.add(R.drawable.j_monkeytemple);
                        mCommon.add("Monkey Temple");

                        mCommonImage.add(R.drawable.j_sisodiyaranigarden);
                        mCommon.add("Sisodiya Garden");

                        mCommonImage.add(R.drawable.j_peshwari);
                        mCommon.add("Peshwari");


                    break;

                    case 2:

                        mCommonImage.add(R.drawable.j_onethreefivead);
                        mCommon.add("1135 AD");

                        mCommonImage.add(R.drawable.j_suvarnamahal);
                        mCommon.add("Suvarna Mahal");

                        mCommonImage.add(R.drawable.j_peacockrooftop);
                        mCommon.add("Peacock Rooftop");

                        mCommonImage.add(R.drawable.j_laksmimishtan);
                        mCommon.add("Laksmi Misthan");

                        mCommonImage.add(R.drawable.j_sanjaysomelette);
                        mCommon.add("Sanjay's Omlette");

                        mCommonImage.add(R.drawable.j_dragonhouse);
                        mCommon.add("Dragon House");

                        mCommonImage.add(R.drawable.j_okra);
                        mCommon.add("Okra");

                        mCommonImage.add(R.drawable.j_peshwari);
                        mCommon.add("Peshwari");

                        break;


                    case 3:

                        mCommonImage.add(R.drawable.j_worldtradepark);
                        mCommon.add("World Trade Park");

                        mCommonImage.add(R.drawable.j_pinksquaremall);
                        mCommon.add("Pink Square Mall");

                        mCommonImage.add(R.drawable.j_nehrubazar);
                        mCommon.add("Nehru Bazar");

                        mCommonImage.add(R.drawable.j_kishanpolibazar);
                        mCommon.add("Kishan Poli Bazar");

                        mCommonImage.add(R.drawable.j_joharibazar);
                        mCommon.add("Johari Bazar");

                        mCommonImage.add(R.drawable.j_tripolibazar);
                        mCommon.add("Tripoli Bazar");

                        mCommonImage.add(R.drawable.j_bapubazar);
                        mCommon.add("Bapu Bazar");

                        mCommonImage.add(R.drawable.j_mirzaismaelroad);
                        mCommon.add("Mirza Ismael Road");

                        mCommonImage.add(R.drawable.j_sirehdeoribazar);
                        mCommon.add("Sireh Deori Bazar");



                        break;


                    case 4:

                        mCommonImage.add(R.drawable.j_itcrajputana);
                        mCommon.add("ITC RajPutana");

                        mCommonImage.add(R.drawable.j_lalit);
                        mCommon.add("Lalit");

                        mCommonImage.add(R.drawable.j_oberoirajvilas);
                        mCommon.add("Oberoi Raj Vilas");

                        mCommonImage.add(R.drawable.j_ramada);
                        mCommon.add("Ramada");

                        mCommonImage.add(R.drawable.j_rambaughpalace);
                        mCommon.add("Ram Baugh Palace");

                        mCommonImage.add(R.drawable.j_trident);
                        mCommon.add("Trident  ");

                        mCommonImage.add(R.drawable.j_holidayinn);
                        mCommon.add("Holiday Inn");

                        mCommonImage.add(R.drawable.j_fern);
                        mCommon.add("Fern");

                        mCommonImage.add(R.drawable.j_radisonblu);
                        mCommon.add("Radison Blu");


                        break;


                    case 5:

                        mCommonImage.add(R.drawable.j_airport);
                        mCommon.add("Jaipur Airport");

                        mCommonImage.add(R.drawable.j_jaipurrailwaystation);
                        mCommon.add("Jaipur Railway Station");

                        mCommonImage.add(R.drawable.j_metro);
                        mCommon.add("Jaipur Metro");

                        break;

                }
                setData();
                break;
            }
        }
    }

    public void setData() {

        for (int i = 0; i < mCommonImage.size(); i++) {
            BitImage.add(ImageScaler.decodeSampledBitmapFromResource(getResources(), mCommonImage.get(i), 160, 160));

        }


        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.fullviewrecycler);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter_Final adapter = new RecyclerViewAdapter_Final(this, mCommon, mCommonImage, BitImage);
        recyclerView.setAdapter(adapter);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

    }




