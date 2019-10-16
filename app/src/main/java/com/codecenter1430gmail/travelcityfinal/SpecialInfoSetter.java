package com.codecenter1430gmail.travelcityfinal;

        import android.graphics.Bitmap;
        import android.graphics.drawable.BitmapDrawable;
        import android.graphics.drawable.ColorDrawable;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.view.MenuItem;
        import android.widget.TextView;

        import org.w3c.dom.Text;

        import java.util.ArrayList;

public class SpecialInfoSetter extends AppCompatActivity {

    String spec_info;


    public String getSpecial_info(String heading)
    {



        switch(heading)
        {

            case "Dagdusheth Temple":
                spec_info = "6am to 10pm";
                break;

            case "LalMahal":
                spec_info = "9am to 6pm";
                break;

            case "Agakhan Palace":
                spec_info = "9am to 5.30pm";
                break;

            case "Sarasbaug":
                spec_info = "6 am to 9 pm";
                break;

            case "Shaniwarwada":
                spec_info = "9am to 5:30pm";
                break;

            case "Sinhgad Fort":
                spec_info = "9am to 5pm";
                break;

            case "Lavasa":
                spec_info = "8am to 10pm";
                break;

            case "Blades Of Glory":
                spec_info = "10am to 7pm";
                break;


            // Pune Food info
            case "Kayani Bakery":
                spec_info = "150/- for 2";
                break;

            case "Sujata Mastani":
                spec_info = "200/- for 2";
                break;

            case "Katakir":
                spec_info = "200/- for 2";
                break;

            case "Chitale Bandhu":
                spec_info = "150/- for 2";
                break;

            case "Vaishali":
                spec_info = "500/- for 2";
                break;

            case "German Bakery":
                spec_info = "1100/- for 2";
                break;

            case "Agent Jack":
                spec_info = "1300/- for 2";
                break;

            case "Miami":
                spec_info = "2500/- for 2";
                break;

            case "Mix 36":
                spec_info = "4000/- for 2";
                break;


            case "Penthouze":
                spec_info = "2200/- for 2";
                break;

            //Pune Shopping Info
            case "Tulshi Baug":
                spec_info = "Monday closed";
                break;

            case "F-Street":
                spec_info = "9am to 10pm";
                break;

            case "FC Road":
                spec_info = "9am to 10pm";
                break;

            case "Hong Kong Lane":
                spec_info = "9am to 10pm";
                break;

            case "Appa Balvant Chowk":
                spec_info = "Monday Closed";
                break;

            case "Juna Bazar":
                spec_info = "9am to 10pm";
                break;

            case "Amanora":
                spec_info = "11am to 11pm";
                break;

            case "Seasons Mall":
                spec_info = "12pm to 9.30pm";
                break;

            case "Phoenix Mall":
                spec_info = "11am to 9.30";
                break;


            //Pune Hotels info
            case "Conrad":
                spec_info = "Price: 8,000+";
                break;

            case "Royal Orchid":
                spec_info = "Price: 4,000+";
                break;

            case "Novotel":
                spec_info = "Price: 5,000+";
                break;

            case "Westin":
                spec_info = "Price: 8,000+";
                break;

            case "JW Marriott":
                spec_info = "Price:8,500+";
                break;

            case "Hyatt":
                spec_info = "Price: 7,500+";
                break;

            //Mumbai Places

            case "Haji Ali Dargah":
                spec_info = "5.30am to 10pm";
                break;

            case "Elephant Caves":
                spec_info = "9am to 5.30pm";
                break;

            case "Science Center":
                spec_info = "10am to 6pm";
                break;

            case "Essel World":
                spec_info = "10am to 7pm";
                break;

            case "Wax Museum":
                spec_info = "9.45am to 9.30pm";
                break;

            case "Siddhivinayak":
                spec_info = "5am to 10pm";
                break;

            //Mumbai Food Info
            case "Ashok vadapav":
                spec_info = "50/- for 2";
                break;

            case "Aswad":
                spec_info = "300/- for 2";
                break;

            case "Punjabi Grill":
                spec_info = "2000/- for 2";
                break;

            case "Cafe Mondegar":
                spec_info = "1300/- for 2";
                break;

            case "Estella":
                spec_info = "2500/- for 2";
                break;

            case "Pizza by the bay":
                spec_info = "2000/- for 2";
                break;

            case "Tasting Room":
                spec_info = "1800/- for 2";
                break;

            case "Aer":
                spec_info = "4000/- for 2";
                break;


            //Mumbai Shopping Info
            case "Colaba Causeway":
                spec_info = "9am to 10pm";
                break;

            case "Mangaldas Market":
                spec_info = "11am to 9pm";
                break;

            case "Fashion Street":
                spec_info = "11am to 9pm";
                break;

            case "Chorbazar":
                spec_info = "Friday Closed";
                break;

            case "Crawford Market":
                spec_info = "10am to 8pm";
                break;

            case "Manish Market":
                spec_info = "10am to 8.45pm";
                break;

            case "R City Mall":
                spec_info = "11am to 9.30pm";
                break;

            case "Sea Woods Mall":
                spec_info = "11am to 9.30pm";
                break;

            case "Inorbit Mall":
                spec_info = "11am to 9.30pm";
                break;

            case "High Phoenix":
                spec_info = "11am to 10pm";
                break;

            case "Vivian Mall":
                spec_info = "11am to 10pm";
                break;


            //Mumbai Hotels Info
            case "Taj":
                spec_info = "20,000/- to 80,000/-";
                break;

            case "Oberoi":
                spec_info = "20,000/- to 30,000/-";
                break;

            case "Trident":
                spec_info = "11000/- to 20000/-";
                break;

            case "Pride":
                spec_info = "3000/-";
                break;

            case "Hyatt ":
                spec_info = "12,000/-";
                break;

            case "Siesta":
                spec_info = "3000/- to 4000/-";
                break;

            case "Atlas Plaza":
                spec_info = "3000/- to 4,000/-";
                break;



            //Delhi Places Info

            case "Akshardham":
                spec_info = "9.30am to 6.30pm";
                break;

            case "Banglasahib Gurudwara":
                spec_info = "24 hours";
                break;


            case "Jama Masjid":
                spec_info = "7am to 6.30pm";
                break;

            case "Jantar Mantar":
                spec_info = "6am to 6pm";
                break;

            case "Lotus Temple":
                spec_info = "9am to 5pm";
                break;

            case "National Rail Museum":
                spec_info = "10am to 5pm";
                break;

            case "Science Center ":
                spec_info = "10am to 5.30pm";
                break;

            case "Qutubminar":
                spec_info = "7am to 5pm";
                break;

            case "Rajghat":
                spec_info = "6.30am to 6pm";
                break;

            case "Rashtrapati Bhavan":
                spec_info = "9.30am to 5.30pm";
                break;

            case "RedFort":
                spec_info = "9.30am to 4.30pm";
                break;

            case "Safdarjung's Tomb":
                spec_info = "7am to 5pm";
                break;

            //Delhi Food Info
            case "Beeryani":
                spec_info = "700/- for 2";
                break;

            case "Bishan Swaroop":
                spec_info = "400/- for 2";
                break;

            case "Bukhara":
                spec_info = "6500/- for 2";
                break;

            case "Chorbizzare":
                spec_info = "2000/- for 2";
                break;

            case "Khandani Pakoda":
                spec_info = "50/- for 2";
                break;

            case "Lalababu Chaat":
                spec_info = "80/- for 2";
                break;

            case "Lord of drinks":
                spec_info = "1850/- for 2";
                break;

            case "Paranthe wali gali":
                spec_info = "160/- for 2";
                break;

            case "Punjabi Grill ":
                spec_info = "1950/- for 2";
                break;

            case "Rose Cafe":
                spec_info = "1300/- for 2";
                break;

            case "Salim's Kebab":
                spec_info = "200/- for 2";
                break;

            case "Shree Balaji Chat":
                spec_info = "80/- for 2";
                break;

            case "Summer house":
                spec_info = "1850/- for 2";
                break;

            case "Thalaivar":
                spec_info = "800/- for 2";
                break;

            case "The big Yellow door":
                spec_info = "600/- for 2";
                break;


            //Delhi Shopping Info
            case "Ambience Mall":
                spec_info = "10am to 10pm";
                break;

            case "Connaught Place":
                spec_info = "Till late night";
                break;

            case "Chandani Chowk":
                spec_info = "Sunday Closed";
                break;


            case "Dilihaat":
                spec_info = "10am to 9pm";
                break;


            case "DLF Promenade":
                spec_info = "10am to 11pm";
                break;


            case "Janpath Market":
                spec_info = "10am to 9pm";
                break;


            case "Karol Bagh Market":
                spec_info = "10am to 8pm";
                break;


            case "Khan Market":
                spec_info = "10am to 11pm";
                break;


            case "Lajpat nagar Market":
                spec_info = "10am to 9pm";
                break;


            case "Palika Bazar":
                spec_info = "10am to 7pm";
                break;


            case "Sarojini Market":
                spec_info = "10am to 9pm";
                break;


            case "Select City Walk":
                spec_info = "10am to 11pm";
                break;

            //Delhi Hotels Info
            case "Leroi":
                spec_info = "3000/-";
                break;


            case "Toronto":
                spec_info = "3000/-";
                break;


            case "ITC Maurya":
                spec_info = "11000/-";
                break;


            case "JW Marriott ":
                spec_info = "10,000/- to 30,000/-";
                break;


            case "The Lodhi":
                spec_info = "15000/-";
                break;


            case "Taj Mahal":
                spec_info = "20,000/- to 80,000/-";
                break;



            //Chennai Places

            case "Arignaranna Zoo":
                spec_info = "9am to 6pm";
                break;

            case "Birla Planetarium":
                spec_info = "10am to 6pm";
                break;

            case "Fort St George":
                spec_info = "Friday Closed";
                break;

            case "Kapaleeswarar Temple":
                spec_info = "5am to 12pm";
                break;

            case "MGM dizzee world":
                spec_info = "10.30am to 6.30pm";
                break;

            case "National Art Gallery":
                spec_info = "Friday Closed";
                break;

            case "Santhome Church":
                spec_info = "6am to 9pm";
                break;

            case "Thousands Light Mosque":
                spec_info = "6am to 9pm";
                break;


            // Food
            case "Anna Laxmi":
                spec_info = "1100/-for 2";
                break;

            case "Barbeque Nation":
                spec_info = "1500/-for 2";
                break;

            case "Benjarong":
                spec_info = "2000/-for 2";
                break;


            case "Bombay Lassi":
                spec_info = "100/-for 2";
                break;

            case "Dakshin":
                spec_info = "1800/-for 2";
                break;

            case "Italia at the parkpod":
                spec_info = "1000/-for 2";
                break;

            case "Madras Pavillion":
                spec_info = "4000/-for 2";
                break;

            case "Murugan Idli Shop":
                spec_info = "200/-for 2";
                break;

            case "Panasian":
                spec_info = "4200/-for 2";
                break;

            case "Southern Spice":
                spec_info = "3000/-for 2";
                break;

            case "Thalapakattu Biryani":
                spec_info = "500/-for 2";
                break;


            //Shopping in chennai
            case "Abirami Mall":
                spec_info = "10am to 10pm";
                break;

            case "Express Avenue":
                spec_info = "10am to 9.30pm";
                break;

            case "Parrys Corner":
                spec_info = "10am to 4pm";
                break;

            case "Phoenix Mall ":
                spec_info = "11am to 10pm";
                break;

            case "Pondi Bazaar":
                spec_info = "10am to 10pm";
                break;

            case "Ritchie Street":
                spec_info = "10am to 9pm";
                break;

            case "Snow Carpet":
                spec_info = "10am to 9pm";
                break;

            case "Spencer Plaza":
                spec_info = "10am to 10pm";
                break;

            case "T Nagar":
                spec_info = "10am to 10pm";
                break;


            //Hotels in Chennai
            case "Belstead":
                spec_info = "2400/-";
                break;

            case "ITC Grand Chola":
                spec_info = "14k+";
                break;

            case "Pandian":
                spec_info = "860/-";
                break;

            case "Park Hyatt":
                spec_info = "10k to 15 k";
                break;

            case "Radison":
                spec_info = "5k to 8k";
                break;

            case "Royal Agency":
                spec_info = "2000/-";
                break;

            case "Savera":
                spec_info = "2500/- to 5000/-";
                break;

            case "Leela Palace":
                spec_info = "11k to 13k";
                break;

            case "Park Chennai":
                spec_info = "3k to 5k";
                break;


            //BAnglore Places

            case "Banglore Palace":
                spec_info = "10am to 5pm";
                break;

            case "Baner Ghatta Park":
                spec_info = "9am to 5pm";
                break;

            case "Cubbon Park":
                spec_info = "6am to 5pm";
                break;

            case "Innovative Film City":
                spec_info = "10am to 7pm";
                break;

            case "Kaiwara Temple":
                spec_info = "10am to 5pm";
                break;

            case "Lal Bagh Botanicals":
                spec_info = "6am to 6pm";
                break;

            case "Nandi Hills":
                spec_info = "6am to 10pm";
                break;

            case "National Gallery of Art":
                spec_info = "11am to 6pm";
                break;


            case "St. Mary Basilica":
                spec_info = "6am to 6pm";
                break;

            case "Tipusultan Fort":
                spec_info = "10am to 5.30pm";
                break;

            case "Vidhan Soudha":
                spec_info = "10am to 5.30pm";
                break;

            //Food in blore

            case "Central Tiffin Room":
                spec_info = "200/- for 2";
                break;

            case "Dakshin ":
                spec_info = "1800/- for 2";
                break;

            case "Karavalli":
                spec_info = "800/- for 2";
                break;

            case "Koshy's Bar and Restro":
                spec_info = "700/- for 2";
                break;

            case "Mavalli Tiffin Rooms":
                spec_info = "250/- for 2";
                break;

            case "Puchkas":
                spec_info = "200/- for 2";
                break;

            case "Punjab Pleasures":
                spec_info = "500/- for 2";
                break;

            case "Shahi Darbar":
                spec_info = "400/- for 2";
                break;

            case "Sri Sairam's Chaat":
                spec_info = "100/- for 2";
                break;

            case "VW Puram Food Street ":
                spec_info = "500/- for 2";
                break;



            //Code for setting shops Info

            case "Basavana Gudi":
                spec_info = "5.30am to 9pm";
                break;


            case "Chick Pet":
                spec_info = "10am to 9pm";
                break;


            case "Forum Mall":
                spec_info = "10am to 10pm";
                break;

            case "Gandhi Bazar":
                spec_info = "10am to 4pm";
                break;


            case "Malleshwar Market":
                spec_info = "7am to 9pm";
                break;


            case "UB City":
                spec_info = "10.30am to 8.30pm";
                break;

            case "Garud Mall":
                spec_info = "10.30am to 10pm";
                break;

            //Code for setting hotels info

            case "Golden Residency":
                spec_info = "1300/- - 2000/-";
                break;

            case "HM Suites":
                spec_info = "2000/- - 4000/-";
                break;

            case "ITC Windsor":
                spec_info = "10000 - 20000/-";
                break;

            case "Lalit Ashok":
                spec_info = "6000 - 11000/-";
                break;

            case "LeeLa Palace":
                spec_info = "14k - 35k";
                break;

            case "Mint Propus":
                spec_info = "1300 - 3500/-";
                break;

            case "The Oberoi":
                spec_info = "11000 - 72000/-";
                break;

            case "Signature Inn":
                spec_info = "700 - 1700/-";
                break;

            case "Treebo Silver Star":
                spec_info = "1500 - 4000/-";
                break;

            case "Zuri White Field":
                spec_info = "7500 - 13000/-";
                break;

            case "ITC Gardenia":
                spec_info = "13k - 27k";
                break;


            //Kolkata Places
            case "Belur Math":
                spec_info = "6amto 12pm,4pm to 9pm";
                break;


            case "Botanical Gardens":
                spec_info = "10am to 5pm";
                break;


            case "Fort William":
                spec_info = "10am to 5pm";
                break;


            case "Indian Museum":
                spec_info = "10am to 5pm";
                break;


            case "St. Paul's":
                spec_info = "10am to 4pm";
                break;


            case "Victoria Meomrial":
                spec_info = "10am to 6pm";
                break;

            case "Alipore Zoo":
                spec_info ="9am to 4.30pm";
                break;

            case "Birla Planetarium ":
                spec_info ="12.30pm to 6pm";
                break;

            case "Esplanade":
                spec_info ="";
                break;


            //Food in kolkata

            case "Ganguram Sweets":
                spec_info = "350/- for 2";
                break;


            case "Oh! Calcutta":
                spec_info = "2000/- for 2";
                break;

            case "6 Ballygunge Place":
                spec_info = "1100/- for 2";
                break;

            case "Bohemian":
                spec_info = "1800/- for 2";
                break;

            case "Jiyo Piyo":
                spec_info = "600/- for 2";
                break;

            case "Kew Pie's Kitchen":
                spec_info = "800/- for 2";
                break;

            case "Ganguram":
                spec_info = "200/- for 2";
                break;

            case "The Bhoj Company":
                spec_info = "400/- for 2";
                break;

            //Code for setting shops in kolkata
            case "College Street":
                spec_info = "9 a.m. to 9 p";
                break;

            case "Bura Bazar":
                spec_info = "10.30 a.m. to 7.30 pm";
                break;

            case "Phool Bazaar":
                spec_info = "7 am to 10 p";
                break;

            case "Gariahat":
                spec_info = "11 AM to 8:00 pm";
                break;

            case "Hatibagan":
                spec_info = "24 hours";
                break;

            case "New Market":
                spec_info = "Sunday Closed";
                break;

            case "South City Mall":
                spec_info = "10 AM to 10 pm";
                break;

            //Code for setting hotels in kolkata
            case "De Sovrani":
                spec_info = "2,800/-";
                break;

            case "Novotel ":
                spec_info = "7k to 13";
                break;

            case "Park Prime":
                spec_info = "4,300/- +";
                break;

            case "Pipal Tree":
                spec_info = "3,500 - 5,000 /-";
                break;

            case "The Lalit Great Eastern":
                spec_info = "6k to 14k";
                break;

            //Hyderabad Special Info Places

            case"Charminar":
                spec_info ="9:30 AM to 5:30 pm";
                break;

            case"Ramoji Film City":
                spec_info ="Sunday Closed";
                break;

            case"Hussain Sagar":
                spec_info ="9 AM to 9:30 pm";
                break;

            case"Salar Jung Museum":
                spec_info ="10AM to 5pm";
                break;

            case"Birla Mandir":
                spec_info ="AM to 9pm";
                break;

            case"Nehru Zoological Park":
                spec_info ="8AM to 5:30pm";
                break;

            case"Golconda Fort":
                spec_info ="9 AM to 5:30 pm";
                break;

            case"Lumbini Park":
                spec_info ="9 AM TO 9 pm";
                break;

            case"Snow World":
                spec_info ="11 AM TO 9 pm";
                break;

            case"NTR Garden":
                spec_info ="12:30 pm TO 9 pm";
                break;

            //Food in hyderabad

            case"Paradise Biryani":
                spec_info ="800/- for two";
                break;

            case"Chutneys":
                spec_info ="900/- for two";
                break;

            case"Jash e Audh":
                spec_info ="1000/- for two";
                break;

            case"Ohm":
                spec_info ="2500/- for two";
                break;

            case "Dakshin  ":
                spec_info = "1800/- for two";
                break;

            case"Minerva Coffee Shop":
                spec_info ="800/- for two";
                break;

            case"Guffa":
                spec_info ="1,000/- for two";
                break;

            case"Olive Bistro":
                spec_info ="2,000/- for tw";
                break;

            case"Sahib Sindh Sultan":
                spec_info ="1,400/- for two";
                break;

            //Market
            case"Begum Bazar":
                spec_info ="10am to 11pm";
                break;

            case"KOTI":
                spec_info ="10am to 6pm";
                break;

            case"Nampally":
                spec_info ="10am to 11pm";
                break;

            case"Tobacco Bazar":
                spec_info ="10am to 10pm";
                break;

            case"Laad Bazar":
                spec_info ="11am to 10.30pm";
                break;

            case"Forum Sujana Mall":
                spec_info ="10am to 10pm";
                break;

            case"Hyderabad Central":
                spec_info ="11am to 9.30pm";
                break;

            case"Perfume Market":
                spec_info ="";
                break;

            //Hotels
            case"ITC Kakatiya":
                spec_info ="10k - 18k";
                break;

            case"Trident ":
                spec_info ="9k - 17k";
                break;

            case"Westin ":
                spec_info ="9k - 20k";
                break;

            case"Taj Banjara":
                spec_info ="5k - 8k";
                break;

            case"Vivanta Taj":
                spec_info ="6k - 13k";
                break;


            case"Sheraton":
                spec_info ="7k - 14k";
                break;


            case"The Park":
                spec_info ="5k - 8k";
                break;


            case"Secunderabad":
                spec_info ="";
                break;


            case"Hyderabad Metro":
                spec_info ="";
                break;


            case"Rajiv Gandhi Airport":
                spec_info ="";
                break;


            case"Hyderabad Railway Station":
                spec_info ="";
                break;




            //Jaipur starts here
            case "Hawa Mahal":
                spec_info ="9:00 am to 4:30 pm";
                break;



            case "Jaigarh Fort":
                spec_info ="9:00 am to 4:30 pm";
                break;


            case "Amber Fort":
                spec_info ="8:00am to 5:30 pm";
                break;


            case "Jal Mahal":
                spec_info ="6:00 am - 6:00 pm";
                break;


            case "Jantar Mantar ":
                spec_info ="9.30am to 5 pm";
                break;


            case "Nahargarh Fort":
                spec_info ="9 am to 4.30 pm";
                break;


            case "Albert Hall Musuem":
                spec_info ="10 am to 5.30 pm";
                break;


            case "RajMandir":
                spec_info ="10 am to 5 pm";
                break;


            case "City Palace":
                spec_info ="11:00 am to 2:00 am";
                break;


            case "Monkey Temple":
                spec_info ="24 hours";
                break;


            case "Sisodiya Garden":
                spec_info ="8:00 am to 06:00 pm";
                break;


            case "1135 AD":
                spec_info ="2,700/- for two";
                break;


            case "Suvarna Mahal":
                spec_info ="9000/- for tw";
                break;


            case "Peacock Rooftop":
                spec_info ="900/- for two";
                break;


            case "Laksmi Misthan":
                spec_info ="900/- for two";
                break;

            case "Sanjay's Omlette":
                spec_info ="300/- for two";
                break;


            case "Om Revolving Restaurant":
                spec_info ="1000/- for two";
                break;

            case "Dragon House":
                spec_info ="1800/- for two";
                break;

            case "Okra":
                spec_info ="2200/- for two";
                break;

            case "Peshwari":
                spec_info ="3000/- for two";
                break;

            case "World Trade Park":
                spec_info ="10am - 10pm";
                break;

            case "Pink Square Mall":
                spec_info ="11am - 10pm";
                break;

            case "Nehru Bazar":
                spec_info ="10:30 am to 7:30 pm";
                break;

            case "Kishan Poli Bazar":
                spec_info ="11 am to 9 pm";
                break;

            case "Johari Bazar":
                spec_info ="10:00 am to 11:00 pm";
                break;

            case "Tripoli Bazar":
                spec_info ="10:00 am to 7:00 pm";
                break;

            case "Bapu Bazar":
                spec_info ="10:30 am to 7:30 pm";
                break;

            case "Mirza Ismael Road":
                spec_info ="11 am onwards";
                break;

            case "Sireh Deori Bazar":
                spec_info ="11 am onwards";
                break;

            case "ITC RajPutana":
                spec_info ="6.5k - 15k";
                break;

            case "Lalit":
                spec_info ="4000+";
                break;

            case "Oberoi Raj Vilas":
                spec_info ="28k - 75k";
                break;

            case "Ramada":
                spec_info ="4k+";
                break;

            case "Ram Baugh Palace":
                spec_info ="32k - 85k";
                break;

            case "Trident  ":
                spec_info ="6k- 14k";
                break;

            case "Holiday Inn":
                spec_info ="4k+";
                break;

            case "Fern":
                spec_info ="2,800+";
                break;

            case "Radison Blu":
                spec_info ="3,800+";
                break;

            case "Jaipur Airport":
                spec_info ="";
                break;

            case "Jaipur Railway Station":
                spec_info ="";
                break;


            case "Jaipur Metro":
                spec_info ="";
                break;

            default:
                spec_info = "";
                break;
        }




        return spec_info;
    }





}

