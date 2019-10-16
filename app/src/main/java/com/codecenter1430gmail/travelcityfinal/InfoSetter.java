package com.codecenter1430gmail.travelcityfinal;

        import android.widget.TextView;

public class InfoSetter {

    String info;

    public String getInfo(String heading)
    {
        switch(heading) {

            //Pune Places Info
            case "Dagdusheth Temple":
                info = "One of the most famous temples in Pune and even in Maharashtra, Dagaduseth Halwai Ganpati Temple cannot be missed when planning a sightseeing tour in the city. The temple is dedicated to Hindu God Ganesha and was built by Dagduseth Halwai, a pious and honest man. The shrine is so popular that people from all over the country as well as world visit it. The best time to be here would be around Ganesh Festival.";
                break;

            case "LalMahal":
                info = "Opening time: 9 AM to 6 PM.\n" +
                        "The Lal Mahal of Pune is one of the most famous monuments located in Pune, India. In the year 1630 AD, Shivajimaharaj's Father Shahaji Bhosale, established the Lal Mahal for his wife Jijabai and son.";
                break;

            case "Agakhan Palace":
                info = "History buffs, this is the place for you. Built in 1892 by Sultan Muhammed Shah Aga Khan III, this palace is a witness to vital incidents of Indian history. The palace is an eyewitness to the rescue of famine-stricken locals, the imprisonment of Mahatama Gandhi, his wife Kasturba Gandhi, Mahadev Desai and Sarojini Naidu and the death of Mahadev Desai and Kasturba Gandhi. The main palace has been converted into Mahatama National Memorial, where photos and paintings exhibiting the life of Mahatama Gandhi have been kept.";
                break;

            case "Sarasbaug":
                info = "Saras Baug can be an ideal place to visit during the evening. It is one of those places in Pune, where you can sit back and enjoy the view of setting sun. Yes, there is a temple perched on a hillock but visiting it is solely one’s decision. People often come to Saras Baug to spend a lazy and peaceful evening making this park a popular place in Pune.";
                break;

            case "Shaniwarwada":
                info = "Opening Hours: 8AM to 6PM\n" +
                        "Probably the most famous place to visit in Pune, Shanivar Vada can rightly be called the landmark of the city. Dating back to 1736, this palace was built by Bajirao Peshwa I, thus one can consider it an important evidence of the glorious history of Peshwa Rule in Pune. The palace boasts five gateways, nine bastions, fine wooden pillars and lattice work. There have been many stories associated with this palace and one of the most popular ones describes this fort to be haunted. No, no don’t drop your plans to visit here! LOL, it is not a place to be missed as it can actually take you down on the road to golden period of Peshwas.";
                break;

            case "Sinhgad Fort":
                info = "It is a sight to cherish! The majestic Sinhagad Fort is perched on one of the isolated cliffs of Bhulaswar Range of the Sahyadris. The fort is reckoned to be built two years ago and has many myths and tales attached to it. Although, today the fort lay in ruins, it is certainly one of the best reflections of the glorious period of Pune. It has become a popular place to visit in Pune and many of the visitors like to trek to it from the base of the 700m hill that it is perched on.";
                break;

            case "Lavasa":
                info = "Ok, the USP of a trip to Pune! Lavasa, which is situated about 57kms from Pune makes an excellent place for a bike ride adventure. The journey between Pune and Lavasa is simply exotic; the winding path fringed one side with mountain and other with dense forest; roads that are just enough wide for a two –way traffic to move and the view that is somehow indescribable should not be missed. This is probably one bike trip in Pune that will remain etched in your memory.";
                break;

            case "Lonavla":
                info = "Lonavala is a small town and a picturesque hill station in Pune but with countless natural spots to indulge in adrenaline rushing activities and a peaceful weekend getaway and here is a guide to know the best places to visit in Lonavala without any doubt. The town is located about 64 kilometers from the main city of Pune and yes, it is well known for the indigenous production of the hard candy called chikki.";
                break;

            case "Blades Of Glory":
                info = "Timings: 10:00 AM to 07:00 PM\n" +
                        "Cost Of Ticket : 50/-\n" +
                        "The entrance of Blades of Glory welcomes you with a summary of how a cricket bat has evolved over the last three centuries. This justifies the name of the gallery. Spread over around 4,000 sq ft, Blades of Glory displays rarest of rare of cricket memorabilia. The artifacts include personally autographed cricket-related items by the who’s who of the gentleman’s game.";
                break;


            // Pune Food info
            case "Kayani Bakery":
                info = "Where:  6, Opposite Victory Theatre, Camp, East Street\n" +
                        "Time: 7.30 am to 1 pm and 3.30 pm to 8 pm\n" +
                        "Approximate cost for two: Rs 150, Cost of 1 kg Shrewsbury biscuits: Rs 320\n" +
                        "While the Kayani bakery in Pune is famous for almost everything they have on their menu. However, the Shrewsbury biscuits they have here are absolutely delicious. Though the bakery is open for quite some time, but these biscuits and the mava cakes get sold out in minutes on any ordinary day. So wake up early and sprint to the bakery at least by 8 am to take some home, you won’t regret it!";
                break;

            case "Sujata Mastani":
                info = "Where: Multiple outlets at Viman Nagar, Sadashiv Peth, East Streat, Aundh among others\n" +
                        "Time: 11 am to 11 pm\n" +
                        "Approximate cost for two: Rs 200\n" +
                        "Sujata Mastani is the most iconic ice cream houses in Pune. It is known to made 100% natural and vegetarian ice-creams. It has been running successfully for over 50 years. What’s special about Sujata Mastani, well, it’s the special Mastani which is a milkshake with a dollop of ice-cream and dried fruits.";
                break;

            case "Katakir":
                info = "Time: 8 am to 4.30 pm\n" +
                        "Approximate cost for two: Rs 200\n" +
                        "Puneri Misal is one of the spiciest misal preparations in all of Maharashtra. It is made of a gravy with lentils or peas, topped with fried munchies called farsan, chopped onions, a squeeze of lime and is served hot with pav. katakir  is one of the most famous joints that serve misal. Don’t expect a grand shop, it’s a small place that runs only on the credibility of the food they serve!";
                break;

            case "Chitale Bandhu":
                info = "Where: Multiple outlets near Deccan Gymkhana, Sadashiv Peth, Kalyani Nagar among others\n" +
                        "Time: 9 am to 9 pm\n" +
                        "Approximate cost for two: Rs 150, Cost for 1 kg of bhakarwadi: Rs 240\n" +
                        "Chitale Bandhu Mithaiwale has been running in Pune since 1950.  It is known all around the world for the scrumptious pedas and crunchy bhakarwadis. They prepare and sell close to 3,000 kg of bhakarwadi in a day. The deep fried maharashtrian snack is indeed one of the best things to eat in Pune.";
                break;

            case "Vaishali":
                info = "Where:  1218/1, FC Road\n" +
                        "Time: 7 am 11 pm\n" +
                        "Approximate cost for two: Rs 450\n" +
                        "Vaishali is another local favorites in Pune. It has a wide variety of snacks and dishes that will fill your tummy just the way you wish it to. Vaishali is big enough to accommodate big groups and youngsters are known come here in big numbers. And since it is located close to Ferguson College, it’s always crowded. The dosas here are to die for.";
                break;

            case "German Bakery":
                info = "Where: Near Chabad House, Opposite Osho Ashram, Koregaon Park\n" +
                        "Time: 7.45 am to 11.45 am\n" +
                        "Approximate cost for two: Rs 1,000\n" +
                        "The German Bakery in Pune is the place where all the traveling sould meet. It’s one of those places where you’ll find foreigners in big numbers. The food served here is perfect for a brunch with your friends or a weekend breakfast wehn you feel like treating yourself into something special. The pastries and sweet delicacies here are to die for.";
                break;

            case "Agent Jack":
                info = "Timings: 7 PM to 1:30 AM\n" +
                        "Cost for two: Rs. 1,300 (approximately)\n" +
                        "For one of the best after-dinner party scenes in Pune, head to the Agent Jacks . The perfect idea for a couple’s night out, if you’re looking to paint the town red with your significant other.";
                break;

            case "Miami":
                info = "Where is it: JW Marriott,Senapati Bapat Road\n" +
                        "Timings: 12 Midnight to 2:30 AM\n" +
                        "Cost for two: Rs. 2,500 (approximately)\n" +
                        "The delicious finger foods and drinks in the ambiance of arguably the best party place in Pune. Ask any Puneite about the best place to let your hair loose, and Mi-A-Mi would be on their top 3.";
                break;

            case "Mix 36":
                info = "Where is it: The Westin, Mundhwa Road, Koregaon Park Annexxe\n" +
                        "Timings: 5 PM to 1 AM\n" +
                        "Cost for two: Rs. 1,900 (approximately)\n" +
                        "Snazzy exteriors with the tables lit in pink, promise you an electric dining experience. There are also bean bags arranged outside where you can just sit and chit chat and have a good time with your friends till the wee hours of the night.";
                break;


            case "Penthouze":
                info = "Where is it: Onyx Tower, Next to Westin Hotel, Mundhwa Road, Koregaon Park Annexxe\n" +
                        "Timings: 8:30 PM to 1 AM\n" +
                        "Cost for two: Rs 2,500 (approximately)\n" +
                        "This clubbing hotspot is a rooftop joint and is thus known for its breathtaking panoramic view of the city. Other than the choice variety of alcohol, don’t forget to sample some of their Vietnamese Chicken Meatballs and Peri Peri Mushroom, which are their signature dishes.";
                break;

            //Pune Shopping Info
            case "Tulshi Baug":
                info = "Located very close to each other, these are probably the oldest shopping centres of Pune. While Laxmi Road has multiple saree shops, Tulshibaug offers accessories. Name the kind of shopping you want to do – you’ll find it all here. From kitchenware to clothes, from stationery to footwear, these places literally have it all. You must specially visit this place if you love possessing different jewellery pieces.\n" +
                        "Tip: Avoid Mondays, as most of the shops remain shut.";
                break;

            case "F-Street":
                info = "Much like the street with the same name in Mumbai, Pune's Fashion Street sells a huge variety of clothes you to satiate the shopaholic and fashionista in you. From the latest trends to underground grunge, this marketplace has it all. If you're an indecisive shopper, you'd be well advised to take along a companion to help you choose, or else you can have a hard time making up your mind. Considered one of Pune's posh shopping districts, and featuring over 450 stalls frequented by budget and discerning shoppers, this is a must-do experience for visitors in the city.";
                break;

            case "FC Road":
                info = "Apart from the restaurants, why do you think this place is so hyped? Located in heart of the city, FC Road has local shops that sell trendy footwear and bags. If buying in bulk is what matters to you, FC Road is a must visit. Many vendors come in the evenings with their cart and sell tops, for as cheap as INR 150. Though not very long lasting, they can definitely be used for a few months. Other than shopping, the restaurants on FC Road always welcome you when you wanna grab a quick bite.  \n" +
                        "Tip: Avoid weekends, if you hate rush.\n";
                break;

            case "Hong Kong Lane":
                info = "Located right at the corner of FC Road, is this busy lane. Variety of options are available in funky earrings, mobile cases and wallets. You’ll be amazed at how this tiny, narrow lane manages to get in more and more shopaholics. A lot of people go to buy cosmetics here, which are available at reasonably cheaper prices.";
                break;

            case "Appa Balvant Chowk":
                info = "This is for the book lovers or the ones who love studying. Spread across different price ranges, Appa Balwant Chowk has a number of stationery shops along with book stores. It’s the hub for book lovers- new, old, and reused, ABC gives you everything you were ever looking for.";
                break;

            case "Juna Bazar":
                info = "Tip: It’s open only on Wednesdays and Sundays.\n" +
                        "If ‘old is gold’ happens to be your mantra, you must visit Juna Bazaar. Shoes, luggage, furniture, stationery, kitchenware and whatnot! Juna Bazaar, if to be described properly, is the oldest and the most happening ‘flea market’ of Pune.\n" +
                        "So much to shop and so less time. Say bye to your ‘I’m so broke-how do I shop’ worries. These places are gonna surprise you. Happy shopping!  ";
                break;

            case "Amanora":
                info = "Timings : All Days – 11 AM to 11 PM (Shops, Food & Beverages, Multiplex)\n" +
                        "Amanora is perhaps the biggest shopping mall in Pune, with lots of shops, activities constantly going on in its premises.\n" +
                        "It has a unique Outdoor Open Lawn Amphi theatre where live sports events are streamed, a Multiplex and many Food & Beverage Places.\n" +
                        "Besides, that the number of Brand owned and Private shops available in Amanora ensure that you may run out of your time in trying to visit all the places present inside the Mall.";
                break;

            case "Seasons Mall":
                info = "Timings : 12 PM to 9:30 PM\n" +
                        "Built on a Plot of 12 Acres, the Seasons mall is right on the opposite side of road to Amanora Park Town. So, incase if you manage to complete Amanora Park Town in a single day, you still have Seasons Mall waiting for you outside!\n" +
                        "Seasons Mall like Park town has lots of indoor activities for Food & Beverages, Shopping. Also , it has frequent visits  from amongst the best actors in the Film Industry (Hindi & Marathi) for Promotional activities. Even SRK had to visit Seasons mall for his movie promotions. It has its own multiplex – Cinepolis in its premises.\n" +
                        "Besides, that the Lawn cum Grass court Go Playr is a very nice place to hangout for a Soccer / Football session.";
                break;

            case "Phoenix Mall":
                info = "Timings : Mon – Sun : 11:00 AM to 9:30 PM [Restaurants are open till 12:00 AM]\n" +
                        "Phoenix Market City situated in Viman Nagar is one of the largest malls in Asia with an area of 3.4 Million Square feet. Thus, it easily takes a complete day to explore the various places to eat , shop and roam at Phoenix Market City!\n" +
                        "Phoenix has a large Parking lot to park vehicles, a Multiplex, and numerous Food & Beverages joints, Family recreation shops.\n" +
                        "Combined with the musical events, comedy events organised by the Phoenix team. The place is one of the most happening places for Youth and Family alike.";
                break;


            //Pune Hotels info
            case "Conrad":
                info =   "Price: 8,000+\n" +
                        "There are 3 stylish restaurants, plus bars and a coffee shop. Other amenities include an outdoor pool, a 24-hour gym and a chic spa, plus 8,000 sq ft. of meeting and event space.\n" +
                        "In a striking modern building, this upscale hotel is 5 km from Aga Khan Palace. \n" +
                        "Sleek rooms have refined colour schemes and city views. All come with flat-screen TVs, espresso machines and minibars. Upgraded rooms add panoramic views; some have sitting areas. The 1-bedroom suites add living/dining areas and wet bars. Some upgraded quarters offer access to a lounge providing free breakfast, snacks and cocktails. Room service is available.";
                break;

            case "Royal Orchid":
                info = "Price: 4,000+\n" +
                        "Royal Orchid Central is located at Kalyani Nagar in Pune and is a 10-minute drive from Pune International Airport and the fast developing commercial areas of Magarpatta and Kharadi. The hotel has 111 Rooms & 4 Suites and offers unmatched luxury hospitality services. The Royal Orchid Group has 21 business and leisure hotels in 16 popular destinations in India.";
                break;

            case "Novotel":
                info = "Price: 5,000+\n" +
                        "Upscale rooms feature stylish decor, Wi-Fi and flat-screen TVs, along with minibars, tea and coffeemakers, safes, sofabeds and desks. Some bathrooms are glass-enclosed. Upgraded rooms have access to a lounge offering inclusive breakfast, soft drinks and evening cocktails, as well as airport transfers for no extra cost. Suites add separate living rooms. Room service is 24/7.\n" +
                        "Amenities include 3 modern restaurants (2 offering international food, while 1 is poolside), plus a slick bar, a seasonal outdoor pool and a fitness center.";
                break;

            case "Westin":
                info = "Price: 8,000+\n" +
                        "This upscale airport hotel along the Mula Mutha River lies 3.8 km from Pune Golf Course and 8 km from Pune Airport. \n" +
                        "The chic, earth-toned rooms and suites offer custom-designed beds, ergonomic desks, and couches, as well as flat-screens and free Wi-Fi. They also include tea and coffeemaking facilities. Upgraded rooms add terraces, and some provide private lounge access and complimentary airport transfers. Suites come with separate living and dining areas.\n" +
                        "Breakfast and parking are free. There are 3 restaurants and 2 bars, plus a deli. Other perks include a spa, a fitness room and an outdoor pool, plus 8 meeting rooms.";
                break;

            case "JW Marriott":
                info = "Price:8,500+\n" +
                        "The contemporary rooms have marble bathrooms, minibars, flat-screens and Wi-Fi (fee). Upgraded rooms add access to a private lounge, which serves free breakfast, drinks and snacks. Suites add kitchenettes and balconies. Turndown service is offered, as is room service.\n" +
                        "The hotel has 5 restaurants (Italian, international, deli, local and vegetarian), a night club and a refined bar. There's also a spa, an outdoor pool, a fitness room and a children's play area. A business centre, 12 event rooms and safe deposit boxes are on offer. Parking is free.";
                break;

            case "Hyatt":
                info = "Price: 7,500+\n" +
                        "Hyatt Regency Pune is an elegantly designed hotel located on Nagar Road, at a mere distance of 2.5 km from the Lohegaon International Airport. Situated in close proximity to the city’s entertainment areas of Koregaon Park and Kalyani Nagar, the Hyatt Regency Pune is sure to create a memorable stay experience whether travelling for business or leisure. \n" +
                        " 222 spacious rooms including 50 Regency Club™ rooms & 18 suites, in addition to 81 fully serviced apartments for short and long term stays";
                break;

            //Pune Transport
            case "Railway Station":
                info = "Address: Agarkar Nagar, Pune, Maharashtra 411001\n" +
                        "Line(s): Pune-Solapur line; Pune-Chennai line; Pune-Bangalore line\n" +
                        "Pune Junction railway station is the main railway hub of Pune. It is a railway junction with on the Pune – Chennai railway line. It is also the origin of Pune – Bengaluru railway line. \n";
                break;

            case "Airport":
                info = "Address: New Airport Rd, Lohegaon, Pune, Maharashtra 411032\n" +
                        "Code: PNQ\n" +
                        "Elevation: 592 m\n" +
                        "Phone: 020 2668 3232\n" +
                        "Did you know: Pune International Airport is India's 10th-busiest airport by passenger traffic.\n" +
                        "Pune Airport is located approximately 10 km north-east of Pune in the state of Maharashtra, India. The airport is a civil enclave operated by the Airports Authority of India at the eastern side of Lohegaon Air Force Station of the Indian Air Force. \n";
                break;

            //Mumbai Places
            case "Marine Drive":
                info = "Starting from the north of Nariman Point and ending at the famous Chowpatty beach, the Marine Drive is a 3km long arc shaped road along the sea coast of South Mumbai. The coast lines the Arabian sea and is the best place to watch the sunset in Mumbai.";
                break;

            case "Bandra-Worli SeaLink":
                info = "Spanning across the arc of Mumbai coastline, this sea link is a civil engineering wonder that reflects the modern infrastructure of the city of Mumbai.";
                break;

            case "Gateway of India":
                info = "Mumbai's most recognized monument, the Gateway of India, was constructed in 1924 to commemorate the visit of King George V and Queen Mary to the city. It's also where the last of the British troops departed, marking the end of British rule when India gained Independence in 1947. The looming Gateway is designed to be the first thing that visitors see when approaching Mumbai by boat. It's a popular place to start exploring Mumbai. These days the atmosphere around the monument resembles a circus at times, with numerous vendors peddling everything from balloons to Indian tea.";
                break;

            case "Juhu Beach":
                info = "At the end of a tiring day of sightseeing, relax with the locals on the beaches of Juhu , and watch the sunset. If you're feeling adventurous, you'll also be able to feast on tasty snacks offered by the multitude of food stalls and mobile food vendors. Favorites include roasted corn on the cob, bhel puri, pani puri and pav bhaji.";
                break;

            case "Haji Ali Dargah":
                info = "Situated at the backdrop of a beautiful view of the sea is the shrine of Haji Ali, a wealthy merchant turned into Muslim Sufi. People from all walks of life and religions come here to seek blessings.\n" +
                        "Location: Central Mumbai, just off the coast of Worli, not far from Mahalaxmi railway station.";
                break;

            case "Elephant Caves":
                info = "Gandhi National Park, in the suburb of Borivali, 40 kilometers (25 miles) north of Mumbai city center.\n" +
                        "An UNESCO World Heritage Site, Elephanta Caves is a specimen of rock cut art and architecture from the times of medieval India. It is an island and is located at a distance of 11km from the city of Mumbai. It also provides an amazing view of the Mumbai skyline.";
                break;

            case "Science Center":
                info = "Nehru Science Center is the largest interactive science centre in India. It is located in Worli, Mumbai. The centre is named after India's first Prime Minister, Jawaharlal Nehru.It has has more than 500 hands-on and interactive science exhibits on energy, sound, kinematics, mechanics, transport, etc. installed in the science park & different galleries.";
                break;

            case "Essel World":
                info = "Located on the edge of northern suburbs, Mumbai's favourite adventure and water park, Essel World and Water Kingdom are probably the best themed park and water park in India. During the hot and humid summer or Mumbai, a lot of locals and tourists throng Water Kingdom.";
                break;

            case "Wax Museum":
                info = "Red Carpet Wax Museum located in R City Mall, Ghatkopar is a gallery of global personalities showcased through 'life-like' wax statues. Organised in a plush setting which is unique and glamorous, the gallery gives the feeling of true red-carpet event to the audience. The motive of running this gallery is to support craftsmanship and present artists' perspective.";
                break;

            case "Siddhivinayak":
                info = "Located in Prabhadevi, Siddhivinayak is a Lord Ganesha temple, one of the most significant and frequented temples in Mumbai. Visitors visit this temple in large numbers on daily basis. It was built by Laxman Vithu and Deubai Patil in 1801. It is one of the richest temples in Mumbai. The wooden doors to the sanctum are carved with images of the Lord. The inner roof which is plated with gold has the central sculpture of Ganesha.";
                break;

            //Mumbai Food Info
            case "Ashok vadapav":
                info = "Located just down the road from Kirti College, and tucked within a very pleasant tree lined neighborhood, Ashok Vada Pav is a hotspot for vada pav lovers in Mumbai.\n" +
                        "The owner of Ashok Vada Pav, Mr. Ashok Thakur, who is credited with inventing vada pav, is a culinary hero to many who love to eat vada pav… and after you try the vada pav here, he’ll be your hero too.\n" +
                        "Along the road, right outside the gate of an apartment complex, you’ll see a crowd of people standing around, what’s little more than a permanent little stall with a tarp over it and a bar counter for serving.";
                break;

            case "Aswad":
                info = "Delighting guests since more than two decades, Aaswad Upahar Restaurant in Dadar West knows what its patrons prefer. The extensive menu of the restaurant offers guests a wide array of delectably tempting delicacies spanning across cuisines like Maharashtrian and South Indian preparations. Apart from this, it also serves lip-smacking street food and has an assortment of desserts to finish the meal. The food has a very traditional taste that takes one on a culinary journey. ";
                break;

            case "Punjabi Grill":
                info = "Star of the Show: Dahi Kebab/Murgh Malai Tikka\n" +
                        "Word to the Wise : Don’t miss the exclusive (and complimentary!) paan shots, which make for a perfect ending to an even better meal.\n" +
                        "Being a true blue Punjabi, Punjab Grill clearly tops the list for me among the many restaurants in Juhu. Founded by celebrity chef Jiggs Kalra, it is a premium fine dining restaurant. Sumptuous delicacies from undivided Punjab and an exotic collection of cocktails and mocktails await you here. Couple your meal with a glass of wine for a truly eclectic experience. Besides this, there are many fine dining restaurants in some hotels in Mumbai which you will love.";
                break;

            case "Cafe Mondegar":
                info = "Star of the Show: Beer with Onion Rings/Fried Chicken\n" +
                        "Word to the Wise : Wade through the vivacious Colaba Causeway before or after a meal at the café to shop for trinkets, antiques and other knick knacks. Don’t forget to haggle here!\n" +
                        "Located bang on Colaba Causeway, Café Mondegar or Mondy’s, is the place to head to for good times. High on energy, the café is a big hit among foreigners and youngsters for its wall murals, jukebox, finger foods and beer. The wall murals by Mario Miranda have become synonymous with Mondy’s and depict a bustling café in Mumbai. When browsing the various hotels in Mumbai, you can pick one closer to Colaba Causeway as that will make many tourist spots easily accessible.\n";
                break;

            case "Estella":
                info = "Estella boasts of being the first modern Australian restaurant. Their menu marries Australian essentials with Asian cuisine, and it’s a surprisingly good match.\n" +
                        "The thing you need to know about Estella is that it is a lounge that screams date night. With seating areas within as well as chairs on an open deck looking out to the best view of the Mumbai sunset {and an island bar connecting them both}, this is the place to go for a quiet date night, or a party on the later hours of the weekend.";
                break;

            case "Pizza by the bay":
                info = "Star of the Show: Pizzas, Pastas\n" +
                        "Word to the Wise : Try their thin crust Margherita pizza, baked with cherry tomatoes and with fresh mozzarella oozing out of its crust.\n" +
                        "Urbane interiors, soothing ambience and sea views…what could be a better place to savour the classic pizza? Beyond classic, this is where you can enjoy gourmet pizzas by the bay! Of the many restaurants in Mumbai, this one enjoys a very unique location. Located just opposite Marine Drive, this restaurant has both fine dining and casual seating arrangements. Come here for pizzas, pastas, risottos and everything Italian.";
                break;

            case "Sanchos":
                info = "Star of the Show: Nachos, Fish and Chicken Taquitos\n" +
                        "Word to the Wise: What’s your type of salsa - the mild cruda and verde, the hot pico or the ranch-style salsa ranchera? Sancho’s Restaurante & Cantina has it all; don’t forget to try out your favourite!\n" +
                        "Tantalise your palate at Sancho’s, which offers delectable Mexican cuisine and the best Margaritas  and Sangrias. This cool and relaxed dining outlet features a wonderful menu for the discerning gourmet. The authentic Mexican fare on the menu at Sancho’s is accompanied by swanky interiors, colourful wooden furniture and great music.";
                break;

            case "Tasting Room":
                info = "Star of the Show: Watermelon and Feta Cheese Salad\n" +
                        "Word to the Wise: After satisfying your taste buds, head to the adjacent Good Earth store for some retail therapy.\n" +
                        "Enter The Tasting Room and be prepared to be charmed by their fabulous food and earthy ambience. The touch of elegance that the place has truly sets it apart from other restaurants in Mumbai. Breakfast, lunch or dinner – you’ll find this place bustling with people at all times of the day. Just grab a coffee and one of their zillion salads or desserts (ranging from warm cheesecakes to chocolate pies). You can spend hours at this beautifully done up place without even realising so.";
                break;

            case "Aer":
                info = "One of the fanciest rooftop bars in Mumbai, AER has always been on our to-visit list, Since this is a lounge and not strictly a club, there is no entry charge. It is getting a table on a busy Friday and Saturday night that’s requires a cosmic interplay of luck and more luck, so we recommend booking in advance.AER is on the 34th floor of Four Seasons hotel, and has a gorgeous view of Mumbai. They play great lounge music that is loud enough to groove to but soft enough to be able to hold a conversation over without having to yell, ‘what?’ multiple times.";
                break;


            //Mumbai Shopping Info
            case "Colaba Causeway":
                info = "Location: Colaba Causeway, south Mumbai.\n" +
                        "Opening Hours: Daily from morning until night.\n" +
                        "What to Buy: Handicrafts, books, jewelry, crystals, brass items, incense, clothes.\n" +
                        "The everyday carnival that is the Colaba Causeway market is a shopping experience like no other in Mumbai. Geared especially towards tourists, that infamous Indian saying of \"sab kuch milega\" (you'll get everything) certainly applies at this market. Dodge persistent balloon and map sellers, as you meander along the sidewalk and peruse the stalls. Want your name written on a grain of rice? That's possible too. If you need a break from shopping, pop into Leopold's Cafe or Cafe Mondegar, two well known Mumbai hangouts.";
                break;

            case "Mangaldas Market":
                info = "Location: Near Zaveri Bazaar, Kalbadevi, south Mumbai. (If you're interested in gold, Zaveri Bazaar is popular gold market). Walk through the lane leading to Jama Masjid. Also in this area is the iconic Mumbadevi temple, which the city was named after.\n" +
                        "Opening Hours: Daily from morning until night, except Sundays.\n" +
                        "What to Buy: Cloth.\n" +
                        "If you're looking to buy cloth by the meter or un-stitched dress material to make Indian outfits, Mangaldas Market and Mulji Jetha Market (also known as M.J. Market) are where you should head. Located close to each other opposite Crawford Market, these sprawling wholesale markets are among the largest textile markets in Asia. You'll find rows and rows of stalls filled to the brim with a diverse assortment of fabrics, from bling to block prints!";
                break;

            case "Fashion Street":
                info = "Location: MG Road, south Mumbai. Near Metro Cinema and Victoria Terminus railway station (opposite Azad Maidan).\n" +
                        "Opening Hours: Daily from morning until night.\n" +
                        "What to Buy: Clothes, shoes, belts.\n" +
                        "Fashion Street is literally just that -- a street lined with fashion! There are around 150 stalls there. The market mainly attracts teenagers and college students, who come to grab the latest western clothes and fake brand names at cheap prices.\n" +
                        "Location: MG Road, south Mumbai. Near Metro Cinema and Victoria Terminus railway station (opposite Azad Maidan).\n" +
                        "Opening Hours: Daily from morning until night.\n" +
                        "What to Buy: Clothes, shoes, belts.";
                break;

            case "Chorbazar":
                info = "Location: Mutton Street, between S V Patel and Moulana Shaukat Ali Roads, near Mohammad Ali Road in south Mumbai.\n" +
                        "Opening Hours: Daily 11 a.m. until 7.30 p.m., except Friday. The Juma Market is held there on Fridays.\n" +
                        "What to Buy: Antiques, bronze items, vintage items, trash & treasure.\n" +
                        "Navigate your way through crowded streets and crumbling buildings, and you'll find Chor Bazaar, nestled in the heart of Mumbai's Muslim district. This fascinating market has a history spanning more than 150 years. Its name means \"thieves market\", but this was derived from the British mispronunciation of the its original name of Shor Bazaar, \"noisy market\". Eventually stolen goods started finding their way into the market, resulting in it living up to its new name!";
                break;

            case "Crawford Market":
                info = "Location: Lokmanya Tilak Marg, Dhobi Talao, Fort area, south Mumbai. It's near Chhatrapati Shivaji Terminus (Victoria Terminus) railway station. This market area is hectic and overwhelming, and it's easy to get lost. Hence, it's a good idea to explore it on a guided tour.\n" +
                        "Opening Hours: Daily from morning until night, except Sunday. Open mornings only on Sundays.\n" +
                        "What to Buy: Fruit, vegetables, spices, food, flowers, birds, fish, and other pets.\n" +
                        "If you want to see how the locals shop, head to Crawford Market. This old-style market, housed in an historic colonial building, specializes in wholesale fruit and vegetables. It's also got an entire section devoted to pets of all shapes, sizes, and breeds.";
                break;

            case "Manish Market":
                info = "A wholesale market for electronics, fabric and home decor items. Best market if you want to shop in bulk at a reasonable price so manish market should be your 1st option.\n" +
                        "How to reach: nearby station Marine Lines and take a taxi to reach Manish Market (Share taxi is available)";
                break;

            case "R City Mall":
                info = "How to Reach R-City Mall: Lal Bahadur Shashtri Marg, Ghatkopar West\n" +
                        "Opening Hours: 11 AM to 12 AM\n" +
                        "A new mall in the suburbs of Mumbai in Ghatkopar, R-city mall is a fun place to hang out and good options of shopping with exclusive outlets in this mall in Mumbai.";
                break;

            case "Sea Woods Mall":
                info = "Opening Hours: 11 AM to 10 PM\n" +
                        "One of the newest and modern mall in Navi Mumbai, it is located near to Seawoods railway station. There are multiple big and international shopping brands in the mall. The mall is spread in a huge area but has a food court with plenty of food options. This mall is well maintained and is of international standards.";
                break;

            case "Inorbit Mall":
                info = "How to Reach In-Orbit: Link Road, Malad West\n" +
                        "Opening Hours: 11 AM to 10 PM\n" +
                        "In series of malls in Mumbai, Inorbit is the best shopping mall in Mumbai. One can find all national and most branded international outlets across apparels, footwear and electronics. This is one of the best malls in Mumbai.";
                break;

            case "High Phoenix":
                info = "How to Reach High Street Phoenix: 5-7 min walk from Lower Parel Station.\n" +
                        "Opening Hours: 11 AM to 12 AM\n" +
                        "When you google or try to navigate, you will find the name Phoenix Mills; because the place was a textile mill actually. The Biggest mall in Mumbai is actually the biggest mall in India in terms of the floor area it has covered. One of a great destination for brand conscious shoppers and can find all types of eateries. This is also the best mall in Mumbai.\n";
                break;

            case "Vivian Mall":
                info = "Opening Hours: 11 AM to 10 PM\n" +
                        "This mall is considered to be one of the biggest malls in the whole of Asia. Viviana Mall in Thane is popularly known in Mumbai and is frequently visited by sub urban residents. The place has all kinds of stores available under its roof. Be it clothing, restaurants, movie halls the mall is a dreamland for shoppers; offering an endless list of shopping and leisure activities. The mall has three levels and a 650 foot frontage. On entering the mall the guests are welcomed into a courtyard plaza by a whole landscaped area with tall waterfalls. There are a number of food kiosks around with open air seating. When standing in the center you will notice a large atrium above that filters the harsh sunlight letting in only a few rays pass through; enough for a little light and warmth. ";
                break;


            //Mumbai Hotels Info
            case "Taj":
                info = "Price = 20000/- - 100,000/-\nBuilt in 1903, the hotel is an architectural marvel and brings together Moorish, Oriental and Florentine styles. Offering panoramic views of the Arabian Sea and the Gateway of India, the hotel is a gracious landmark of the city of Mumbai, showcasing contemporary Indian influences along with beautiful vaulted alabaster ceilings, onyx columns, graceful archways, hand-woven silk carpets, crystal chandeliers, a magnificent art collection, an eclectic collection of furniture, and a dramatic cantilever stairway.";
                break;

            case "Oberoi":
                info = "Price = 15000/- - 30000/-\nThe Oberoi, Mumbai is situated in the heart of the city’s business, financial and entertainment districts. Located on Marine Drive and minutes away from the many tourist attractions, the luxury hotel overlooks the ocean and Mumbai city’s skyline.\n" +
                        "The meticulously appointed rooms offer panoramic views of the ocean and the city, and are equipped with the latest technology. A variety of exclusive dining options cater to the refined palates of every discerning guest.\n" +
                        "Recreational facilities include an outdoor heated swimming pool, a 24-hour fitness centre and The Oberoi Spa and Salon. To provide a truly bespoke experience, the hotel offers each guest a personal butler service. Our Concierge will help you unravel everything the city has to offer, for business or leisure.";
                break;

            case "Trident":
                info = "Price = 11000/- - 20000/-\nThe warm colors and quirky bronze sculptures of the new Trident Bandra-Kurla are the first indication that if you're here to mix business with pleasure, this hotel will serve up a pretty heady cocktail.\n" +
                        "All rooms and suites come with iPod connectivity, DVD players with a USB plug-and-play port, and all hour valet and laundry services. \"The staff has been trained well to extend gracious, personalized and dependable service,\" says general manager Visheshwar Singh. And if you've brought the kids along, you can book the babysitter to watch them while you're out.";
                break;

            case "Pride":
                info = "Price: 3000/-\n" +
                        "Welcome to Hotel Pride. With 3 Star comforts, Hotel Pride offers a variety of Air-conditioned and Non-A/c room to fit the business traveler's budget. A/c Executive Room A/c Deluxe Room Non A/c Room. ";
                break;

            case "Hyatt ":
                info = "Price: 12,000/-\n" +
                        "Experience Hyatt Regency Mumbai - one of the foremost hotels in Mumbai which indulges guests in contemporary luxury and convenience.\n" +
                        "From the spacious, well-appointed guestrooms to world-class service, we ensure our guests make the most of being away when they stay with us. 401 spacious rooms fitted with premium furnishings and modern décor";
                break;

            case "Siesta":
                info = "Price: 3000 - 4000/-\n" +
                        "All rooms and suites come with iPod connectivity, DVD players with a USB plug-and-play port, and all hour valet and laundry services. \"The staff has been trained well to extend gracious, personalized and dependable service,\" says general manager Visheshwar Singh. And if you've brought the kids along, you can book the babysitter to watch them while you're out.";
                break;

            case "Atlas Plaza":
                info = "Price: 3000/- to 4,000/-\n" +
                        "In a lively area filled with shops, eateries and educational facilities, this informal hotel with a glass-fronted facade is a minute's walk from Chennai College of Commerce and Economics, 4 minutes' walk from Andheri metro station and 4 km from Juhu Beach.\n" +
                        "Featuring colourful accents, the unpretentious rooms, some with round beds, offer flat-screen TVs, free Wi-Fi and sitting areas. Room service is available.\n" +
                        "Breakfast is offered. Other perks include guest laundry facilities, and a casual lobby lounge with a marble floor.";
                break;


            //Mumbai Transport Info
            case "Mumbai Airport":
                info = "Chhatrapati Shivaji International Airport and Sahar International Airport, is the primary international airport serving the Mumbai Metropolitan Area, India. \n" +
                        "Address: Mumbai, Maharashtra 400099\n" +
                        "Code: BOM\n" +
                        "Elevation: 11 m\n" +
                        "Phone: 022 6685 1010\n" +
                        "Did you know: Chhatrapati Shivaji International Airport is India's second-busiest airport by passenger traffic.";
                break;

            case "CST":
                info = "Chhatrapati Shivaji Maharaj Terminus formerly known as Victoria Terminus is a historic railway station and a UNESCO World Heritage Site in Mumbai, Maharashtra, India which serves as the headquarters of the Central Railways. \n" +
                        "Opened: May 1888\n" +
                        "Town or city: Mumbai\n" +
                        "Engineer: Wilson Bell\n" +
                        "Did you know: Chhatrapati Shivaji Terminus of Mumbai (formerly Bombay) exhibits an important interchange of influences from Victorian Italianate Gothic Revival architecture, and from Indian traditional buildings.";
                break;

            case "Mumbai Metro":
                info = "Mumbai Metro is a rapid transit system serving the city of Mumbai, Maharashtra, and the wider MMR urban agglomeration. The system is designed to reduce traffic congestion in the city, and supplement the overcrowded Mumbai Suburban Railway network. \n" +
                        "Average speed: 33 km/h\n" +
                        "Began operation: 8 June 2014\n" +
                        "Daily ridership: 380,000 (July 2017)\n" +
                        "Top speed: 80 km/h (50 mph)\n" +
                        "Annual ridership: 130 million";
                break;

            case "Churchgate":
                info = "Churchgate is an area in south Mumbai. During the eighteenth and up to the mid-19th century, Mumbai was a walled city. The city walls had three gates, and Church Gate, named after St. Thomas Cathedral, Mumbai was one of the gates. \n" +
                        "Pin code: 400020\n" +
                        "Local time: Friday, 12:45 PM\n" +
                        "Weather: 28°C, Wind W at 18 km/h, 66% Humidity\n" +
                        "Area code: 022";
                break;

            case "Kalyan":
                info = "\n" +
                        "Kalyan Junction railway station is a major railway junction station on the central line of the Mumbai Suburban Railway network, lying at the junction of the north-east and south-east lines of the suburban Mumbai division of the Central Railway, 54 km (34 mi) north-east of Mumbai.\n" +
                        "Station code:KYN\tFare zone: Central Railway zone\n" +
                        "Platforms 08 Passengers: 360,000/day";
                break;

            case "Thane":
                info = "Thane is a major railway station on the Central line of the Indian Railways System It is a part of the Mumbai Suburban Railway network. It is one of the busiest railway stations in India. Thane was ranked as the busiest railway station on the Mumbai suburban network, followed by Andheri and Kalyan. As of 2013, Thane ...\n" +
                        "Station code: TNA\tLine(s): Central Line; Harbour Line;Mumbai D...\n" +
                        "Platforms:?10\tPassengers (2016-17)?: ?243,000 (daily)";
                break;

            //Delhi Places Info

            case "Akshardham":
                info = "Tip- Try to reach early so that you can experience all activities before the complex closes\n" +
                        "This is a must-see site and should be high on your priority list. Akshardham attracts 70% of all tourists who visit Delhi (not surprising at all!). Once you enter, I bet you wouldn’t want to leave. It has jaw-dropping architecture, a fascinating fountain show, an informative boat ride, a huge garden, a food court that offers scrumptious dishes and much more.\n" +
                        "Closest metro station- Akshardham (Blue Line)\n";
                break;

            case "Banglasahib Gurudwara":
                info = "Famous for: Sikhism, Serenity, History.\n" +
                        "Tickets: No entry fee.\n" +
                        "Opening Timings: Open all days\n" +
                        "Duration: 1.5-2 hours.\n" +
                        "Things to Do at Gurudwara Bangla Sahib:\n" +
                        "Eat at the langar (free kitchen).\n" +
                        "Pay your respects at the shrine.\n" +
                        "Spend some moments near the holy lake.\n" +
                        "Gurudwara Bangla Sahib holds special significance for Sikhs because of its relation with the eighth Sikh Guru, Guru Har Krishan who stayed here to cure thousands suffering from cholera and smallpox epidemic. The ‘Sarover’ or ‘lake’ inside the gurudwara is also worth a visit for its serenity and importance. In a recent survey, Gurudwara Bangla Sahib was ranked as the best place of pilgrimage in Delhi.\n";
                break;

            case "Humayun's Tomb":
                info = "Famous for: History, Architecture, Gardens, Photography.\n" +
                        "Tickets: 30 INR for adults and 500 INR for foreigners.\n" +
                        "Opening Timings: Open all days.\n" +
                        "Duration: 45 mins.\n" +
                        "Things to Do at Humayun’s Tomb:\n" +
                        "Explore the gardens.\n" +
                        "Visit Nizam al-Din Auliya dargah nearby.\n" +
                        "Built in the year 1570, Humayun’s Tomb is a monument built by Queen Haji Begum, widow of Humayun. The monument displays the inspiration of Persian architecture. The world famous Taj Mahal bears resemblance to this monument constructed during early Mughal rule in India. It is open on all days for visits. The best time to view Humayun’s Tomb would be in the late afternoon.";
                break;

            case "India Gate":
                info = "Famous for: War memorial, Architecture, Indian Army.\n" +
                        "Tickets: Free.\n" +
                        "Opening Timings: Open all days.\n" +
                        "Duration: 1-2 hours.\n" +
                        "Things to Do near India Gate:\n" +
                        "Pay your respects at Amar Jawan Jyoti.\n" +
                        "Relax in the surrounding gardens.\n" +
                        "India Gate was constructed in the year 1931 as a war memorial for over 70,000 soldiers killed during First World War and Afghan War. The names of the soldiers are inscribed in the walls of India Gate. It was earlier known as “All India War Memorial”. Situated on Rajpath, India Gate looks stunning in the evening lights.";
                break;
            case "Jama Masjid":
                info = "Famous for: Mosque, Architecture, History, Serenity.\n" +
                        "Tickets: No entry fee.\n" +
                        "Opening Timings: Open all days from 7am to 12 pm & 1.30pm to 6.30pm. Tourists not allowed during prayer times.\n" +
                        "Duration: 1 hour.\n" +
                        "Things to Do near Jama Masjid:\n" +
                        "Visit the Chawri market.\n" +
                        "Go to the old city.\n" +
                        "Jama Masjid is another fine example of Mughal architecture’s golden age under Shah Jahan. It is India’s largest mosque and its courtyard can carry more than 25,000 devotees at a single time. The building consists of three great gates, four towers and two minarets made from a combination of  red sandstone and white marble. Apart from being a major place of worship for Muslims, Jama Masjid is also visited by many tourists for its amazing architecture.";
                break;

            case "Jantar Mantar":
                info = "Jantar Mantar observatory consists of masonry built astronomical instruments that have stood the test of time and still work as well as they did in the olden days. Maharaja Jai Singh II of Jaipur was keenly interested in these astronomical observations and the study of all the systems, and this observatory was erected by him upon the instructions of Muhammad Shah. Built out of brick, rubble and then plastered with lime, these instruments have been repaired and restored from time to time without making any significant alteration. The apparatus here pertains to Egypt's Ptolemaic astronomy and follows three classical celestial coordinates to track the positions of heavenly bodies- namely horizon-zenith local system, the equatorial system and the ecliptic system. There are four primary devices constructed here: The Samrat Yantra, the Jai Prakash, Ram Yantra and Misra Yantra. There lies a small temple of Bhairava to the east of the main site and even that was built by Maharaja Jai Singh II.\n";
                break;

            case "Lotus Temple":
                info = "Famous for: Religion, Architecture.\n" +
                        "Tickets: Free.\n" +
                        "Opening Timings: Open all days from Tue to Sun (9am to 5:30pm).\n" +
                        "Duration: 1.5 hours.\n" +
                        "Things to Do near Lotus Temple:\n" +
                        "Meditation and praying.\n" +
                        "Visit the Baha’i World Centre Library.\n" +
                        "Explore the nine surrounding ponds and the gardens.\n" +
                        "Bahai Temple is famously known as Lotus Temple owing to its resemblance to lotus flower. Lotus symbolizes four religions namely Hinduism, Islam, Buddhism and Jainism. Out of the seven major Bahai temples constructed around the world, the one in Delhi was constructed last. The place is serene and is open for prayers and meditation by people who follow any religion. The nine pools of water around the petals is a sight to watch at dusk.";
                break;

            case "National Rail Museum":
                info = "Famous for: History, Relics, Educational.\n" +
                        "Tickets: 20 INR for Indians, 650 INR for Foreigners and free for school children.\n" +
                        "Opening Timings: Open daily except Monday from 10 am to 6 pm.\n" +
                        "Duration: 3-4 hours.\n" +
                        "Things to Do at National Museum\n" +
                        "Attend films on Indian history at auditorium.\n" +
                        "Attend an exhibition on art, history and culture.\n" +
                        "Visit the library to read publications by the museum.\n" +
                        "National Museum offers a peek in Indian History, right from pre civilization era. It is one of India’s largest museums with artifacts ranging from Harappan civilization to British colonial era. Mughal era paintings, Coins from Gupta dynasty, relics from Mauryan times etc are some of the displays here. National Museum has beautifully captured India’s history in a nutshell and therefore a visit here is absolutely recommended for everyone.";
                break;

            case "Science Center ":
                info = "The National Science Centre, Delhi is a unit of the National Council of Science Museums (NCSM), which is an autonomous body under the Ministry of Culture of the Government of India. It is a pioneering institute engaged in the popularisation of science among the people of the northern part of India in general and among the students in particular. It was inaugurated on the 9th of January 1992 by the then Prime Minister of India . Since opening, the Centre has rendered yeoman service to the cause of science popularisation.";
                break;

            case "Qutubminar":
                info = "Famous for: History, Architecture, Photography.\n" +
                        "Tickets: 30 INR for Indians and 500 INR for foreigners..\n" +
                        "Opening Timings: Open all days from sunrise till sunset.\n" +
                        "Duration: 30 mins.\n" +
                        "The tallest tower in India, Qutab Minar, is believed to commemorate the victory and the beginning of Mughal era in India. The 73-meter tall tower was built by Qutab-ud-din Aibak after defeating the last Hindu Kingdom. However, some say that it was built to serve as a minaret to call those faithful to prayer. While red sandstone was used in the construction of first three storeys, marble and sandstone were used to construct the last two storeys. India’s first ever mosque, Quwwat-ul-Islam is at the foot of Qutab Minar.";
                break;

            case "Rajghat":
                info = "Famous for: Memorials, Mahatma Gandhi.\n" +
                        "Tickets: No entry fee.\n" +
                        "Opening Timings: Open all days from 6:30 am to 6 pm.\n" +
                        "Duration: 45 mins.\n" +
                        "Things to Do near Raj Ghat and associated memorials:\n" +
                        "Pay your respects at all the memorials.\n" +
                        "Visit the two museum dedicated to Mahatma Gandhi.\n" +
                        "Raj Ghat is Mahatma Gandhi’s memorial and also his cremation ground. The memorial has a black marble slab facing upwards and is surrounded by lush green lawns at all sides. Other memorials around Raj Ghat are for Jawaharlal Nehru, Lal Bahadur Shastri, Indira Gandhi, Jagjivan Ram, Choudhary Charan Singh, Rajiv Gandhi, Giani Zail Singh, Shankar Dayal Sharma, Devi Lal, P. V. Narasimha Rao, Chandra Shekhar and I. K. Gujral. All major foreign dignitaries visit this place to pay their respects to the Father of Nation.\n";
                break;

            case "Rashtrapati Bhavan":
                info = "Famous for: Central government, Architecture, Gardens\n" +
                        "Tickets: Prior permission required before visiting. 50 INR per person and free for children below 8yrs.\n" +
                        "Opening Timings: Fridays, Saturdays and Sundays from 9 am hrs to 4 pm (subject to change).\n" +
                        "Duration: About 2 hours.\n" +
                        "Things to Do at Rashtrapati Bhavan:\n" +
                        "Visit Rashtrapati Bhavan and the Central gardens.\n" +
                        "Tour of the Rashtrapati Bhavan Museum Complex.\n" +
                        "Visit The Mughal Gardens.\n" +
                        "The official home of the President of India, Rashtrapati Bhavan was completed in the year 1929. It was designed by the famous British architect Edwin Lutyens with the intention of becoming the official residence of the then viceroy of India. The architectural marvel of Rashtrapati Bhavan combined with the majestic gardens around the place are some of the reasons to visit this place.";
                break;

            case "RedFort":
                info = "Famous for: History, Architecture, Photography.\n" +
                        "Tickets: Entry fee is 35 INR for Indians and 500 INR for foreigners. Light and Sound will cost about 80 INR for adults and 30 INR for children.\n" +
                        "Opening Timings: Open Tue to Sun from sunrise to sunset. Light and Sound show at 6pm everyday\n" +
                        "Duration: 1-2 hours.\n" +
                        "Things to Do in Red Fort:\n" +
                        "Light and sound show.\n" +
                        "Take a guided tour around the fort.\n" +
                        "Red Fort symbolizes the era of Mughal rule in India. The Fort, built in 1638, is a magnificent monument that captivates your attention and exhibits the show of architectural splendor of Mughals. The 33m high walls of Red Fort are yet another special feature of the fort.";
                break;

            case "Safdarjung's Tomb":
                info = "Tip– If you have a partner, the gardens are the place to get all cuddly!\n" +
                        "This monument was described as the ‘last flicker in the lamp of Mughal architecture’. It was built in 1754 for statesman Safdarjung. The huge structure is surrounded by beautiful gardens of the Mughal charbagh style. You’ll be certainly surprised with the silent environment here even though it is right next to the busy Lodi Road.\n" +
                        "Closest metro station- Jor bagh (Yellow line)";
                break;

            //Delhi Food Info
            case "Beeryani":
                info = "Highlights: Beer + Biryani\n" +
                        "Must-Haves: Handi Biryani, Mojito\n" +
                        "Cost For Two: Rs. 700\n" +
                        "Cuisine: North Indian, Biryani\n" +
                        "A small place located in the heart of the SDA market near IIT, this joint is popular amongst students as it supplies them with the only two things they desire in life - Beer and Biryani. Apart from having a unique concept, the drinks are cheap and the biryanis are lip-smackingly delicious. Once you visit Beeryani with your friends, you're bound to become a regular.";
                break;

            case "Bishan Swaroop":
                info = "One of the hidden gems of Chandni Chowk is Bishan Swaroop. Located on the unruly side streets of Chandni Chowk, this place is totally worth the effort put in finding it. The average cost for two is a meager Rs. 50 for two people! The fruit chaat & aloo kulla (scooped out boiled potato and having the filling of chickpeas with the garnishing of spices and lemon) is totally mouth watering!";
                break;

            case "Bukhara":
                info = "Highlights: Luxury Dhaba Ambience\n" +
                        "Must-Haves: Dal Bukhara, Malai Chicken Kebab, Phirni\n" +
                        "Cost For Two: Rs. 6,500\n" +
                        "Cuisine: North Indian\n" +
                        "Bukhara has been voted amongst the best restaurants in Asia, and for a good reason. The Dhaba-like ambience and the absence of cutlery ensure that you get a truly Indian eating experience. It's not easy to find a table here so make sure you book in advance";
                break;

            case "Chorbizzare":
                info = "Highlights: Vintage Ambience, Kashmiri Food\n" +
                        "Must-Haves: Roganjosh, Seekh Kebab, Rajma\n" +
                        "Cost For Two: Rs. 2,000\n" +
                        "Cuisine: Kashmiri, North Indian, Chinese, Thai, Korean\n" +
                        "As the name suggests, Chor Bizzare's ambience is inspired by a local thieves' market. Everything in the restaurant is made to look like it's been stolen from somewhere. This includes a vintage car in the middle of the restaurant! While the ambience certainly gets full marks, the food is out of this world as well. One of the few places in Delhi which does justice to Kashmiri food, Chor Bizarre is bound to steal your heart (pun intended).";
                break;

            case "Khandani Pakoda":
                info = "There is nothing better than munching on pakodas and sipping on tea during the winters. The Khandani Pakode wala in Sarojini Nagar Ring Road Market is heaven for those who love to gorge on some pakodas. The outlet dishes out 10 types of pakodas at any given time. The bread pakoda and the Paneer pakodas are the hottest properties at this outlet and the chutneys that come along are just an icing on them. The price for these lovely pakodas is in the range of 10 to 12 rupees only!";
                break;

            case "Lalababu Chaat":
                info = "If authentic chat is the need of the hour then Lala Babu Chaat Bhandaar is the perfect place to head to. Located in the Chandni Chowk, bang opposite McDonalds this chat stall one to saviour. The Gobi muttar samosas are a must try and at Rs. 80 for two people, definitely no one will be complaining.";
                break;

            case "Lord of drinks":
                info = "Highlights: Medieval Ambience, Variety in Drinks\n" +
                        "Must-Haves: Chicken Curry, Mezze Platter, LIIT\n" +
                        "Cost For Two: Rs. 1,950\n" +
                        "Cuisine: Italian, Chinese, European, North Indian and American\n" +
                        "A cool and laid-back lounge with a fully stocked bar filled with a fine alcohol collection. The ambience makes you feel like you're bang in the middle of Game of Thrones, which makes things all the more interesting. The best time to head to LOTD is during IPL season. Things get crazy!";
                break;

            case "Paranthe wali gali":
                info = "Located in the Chandni Chowk area of New Delhi, the Paranthe wali gali as the name suggests is renowned for the huge number of shops selling paratha that is a fried Indian bread. Note that the parathas are strictly vegetarian! The parathas are very budget-friendly and you can eat to your taste buds content!";
                break;

            case "Punjabi Grill ":
                info = "Highlights: Buffet, Outdoor Seating, Huge Proportions\n" +
                        "Must-Haves: Tandoori Gobhi, Butter Chicken,\n" +
                        "Cost For Two: Rs. 1,950\n" +
                        "Cuisine: North Indian, Mughlai\n" +
                        "Punjab Grill’s food and ambience rivals to that of a fine dining restaurant, but without the added cost. Their service is prompt, and the super-friendly staff will make you feel like royalty. The food proportions are huge, so make sure you order accordingly. If you’re craving for a traditional, heavy North Indian meal which is rich in flavors, then look no further.";
                break;

            case "Rose Cafe":
                info = "Highlights: Outdoor Seating, Cosy Ambience\n" +
                        "Must-Haves: Mezze Platter, Waffles\n" +
                        "Cost For Two: Rs. 1,300\n" +
                        "Cuisine: Continental, Italian, and Mediterranean\n" +
                        "This cosy Victorian-style cafe offers light meals and freshly prepared desserts. The location and ambience of this place make you feel like you’re having food in some sleepy town in a European country. The view of their beautiful garden makes the experience even more surreal. Head out here on a date for a guaranteed good time.";
                break;

            case "Salim's Kebab":
                info = "A small wonder that has shifted from Khan Market to Defence Colony Market, the kakori kebabs at Salim’s Kebabs are delicious! The kebabs simply melt in the mouth the minute you put a morsel in. Roll them up in rumali roti, these kebabs as rolls will cost you just Rs. 100!";
                break;

            case "Shree Balaji Chat":
                info = "The list of popular chaat places is incomplete without mentioning Shree Balaji Chaat Bhandar. One of the best chaat places in Old Delhi, Shree Balaji Chaat Bhandar is popular amongst everyone. The array of snacks is quite extensive and at an average cost RS. 80 for two, this place is just too good. The papri chaat is a must try for everyone who visits here.";
                break;

            case "Summer house":
                info = "Highlights: Musical Events, Rooftop Seating, Karaoke\n" +
                        "Must-Haves: Keema Pav, Penne Arrabiata, Waffles\n" +
                        "Cost For Two: Rs. 1,850\n" +
                        "Cuisine: Italian, Continental\n" +
                        "If you're a party animal, this place is exactly what you've been looking for. With its unique blend of cocktails, wild parties, and good music, Summer House Cafe has something for everyone. Have memorable conversations on their terrace, or dance the night away with your partner during their Salsa night.";
                break;

            case "Thalaivar":
                info = "Highlights: Serves South Indian Non-Veg Specialities\n" +
                        "Must-Haves: Roast Mutton, Filter Coffee, Appam\n" +
                        "Cost For Two: Rs. 800\n" +
                        "Cuisine: South Indian, Kerala\n" +
                        "If you’re bored of the regular veg South Indian dishes that most of us usually come across, then Thailavar is going to be a pleasant surprise. Known for their meat-based grub and authentic Kerala dishes, Thailavar’s take on South Indian cuisine will win you over and ensure you come back for more.";
                break;

            case "The big Yellow door":
                info = "Highlights: Quirky Ambience, Huge Portions\n" +
                        "Must-Haves: Bomb Burger, Butter Chicken Pasta, Butterscotch Shake\n" +
                        "Cost For Two: Rs. 600\n" +
                        "Cuisine: Italian, Fast Food\n" +
                        "This gem of a place is great for hanging out with your buddies over delicious pastas and burgers. The ambience will transport you to a different world, away from the chaos of Delhi. It's a miracle that this place is so pocket-friendly!";
                break;


            //Delhi Shopping Info
            case "Ambience Mall":
                info = "Address: Ambience Commercial Developers Private Limited, 2, Nelson Mandela Marg, Vasant Kunj\n" +
                        "Telephone: 011 4087 0064\n" +
                        "Hours/Timings: Monday to Sunday, 10:00 am to 10:00 pm\n" +
                        "Ambience Mall is one of the best shopping malls in Delhi. It is located in Vasant Kunj, Nelson Mandela Marg in New Delhi. There are lots of popular brands available in the mall such as Blackberrys, Thomas Pink, Louis Philippe, Timberland, Reliance Digital, Woodland and more.";
                break;

            case "Connaught Place":
                info = "Things to Know :-\n" +
                        "Location: Connaught Place, New Delhi, India\n" +
                        "How to Reach: Metro (Rajiv Chowk Metro Station)\n" +
                        "What to Buy: Clothes, jewelry, books, Indian handcraft items, electronic products and more\n" +
                        "Timings: Till late night\n" +
                        "The busiest of all the shopping places of Delhi is Connaught Place. This shopping place looks great with its white appearance. You will find the outlets of all brands here at the same point within a distance of few steps. The well organized showrooms and stores of Connaught Place offers a range of classy fabric, jewelry, Indian books, handcraft items, electronic goods and more. Besides showrooms and stores, it has numerous hotels, restaurants, café and multiplexers. It is considered as the best place to find the finest of what you want.";
                break;

            case "Chandani Chowk":
                info = "Things to Know :-\n" +
                        "Location: Chandni Chowk, Old Delhi, India\n" +
                        "How to Reach: Metro (Chandni Chowk Metro Station)\n" +
                        "What to Buy: Wedding lehengas, embroidered bags, semi-precious jewelry, silk and cotton clothes, books and electronic products\n" +
                        "Timings: All days of the week except Sunday\n" +
                        "Chandni Chowk is one of the most popular shopping places in Delhi. Tough the winding lanes of this area are untidy and congested, yet people visit this place for purchasing inexpensive things like wedding lehengas, embroidered bags, semi-precious jewelry, silk and cotton clothes. One can also buy books and electronic products from Chandni Chowk. Do satisfy your taste buds by tasting the traditional food from the stalls of culinary lanes.";
                break;


            case "Dilihaat":
                info = "Things to Know :-\n" +
                        "Location: Sri Aurobindo Marg, New Delhi, India\n" +
                        "How to Reach: Metro (INA Metro Station)\n" +
                        "What to Buy: Jewelry, paintings, fabrics, saris, pottery, furniture and many more\n" +
                        "Timings: 11:00AM to 9:00PM (all days of the week)\n" +
                        "Dilli Haat is a colorful shopping place that offers traditional handicrafts and handlooms from the villages of India. Therefore, it is named as Dilli Haat because it is set up in a manner Indian village markets are set up. You will get the ultimate feel of Indian villages as the shops resembles like thatched roof cottages. Besides purchasing pottery, jewelry, saris and paintings, you can also taste the spicy and delicious food served in the stalls within the campus.";
                break;


            case "DLF Promenade":
                info = "Address: # 3, Nelson Mandela Road, Vasant Kunj Malls, Vasant Kunj II\n" +
                        "Telephone: 011 4610 4466\n" +
                        "Hours/Timings: Monday to Sunday 10:00 am to 11:00 pm\n" +
                        "DLF Promenade is a shopping mall, located in Vasant Kunj, Nelson Mandela Road in New Delhi. It was developed by the DLF, one of the largest real estate companies in India. DLF Promenade constructed on the land of 4.6 lacs sq feet. There are three floors and several national and International brands such as Satya Paul, Promod, Steve Madden, FabIndia, UCB and more. The mall has a unique leisure zone only for kids, named as Kiddyland.";
                break;


            case "Janpath Market":
                info = "Things to Know:\n" +
                        "Location: Janpath, New Delhi, India\n" +
                        "How to Reach: Metro (Janpath Metro Station)\n" +
                        "What to Buy: Traditional and western clothes, accessories, footwear, antiques, handicrafts, paintings, leather work, cheap jewelry, etc.\n" +
                        "Timings: 10:00AM to 9:00PM (Monday to Saturday), 11:00AM to 8:00PM (on Sundays)\n" +
                        "Janpath is a popular local market of Delhi that offers a lot of things. People of all ages and taste can pick something of their choice from Janpath Market. The shops of Janpath offer goods from Tibet and all over India. It is a good place to shop souvenirs and many other useful things. To get the products at decent price one requires bargaining skills. As the market always remains overcrowded, one has to be careful regarding their wallets, pockets and purses.";
                break;


            case "Karol Bagh Market":
                info = "Things to Know :-\n" +
                        "Location: Karol Bagh, New Delhi, India\n" +
                        "How to Reach: Metro (Karol Bagh Metro Station)\n" +
                        "What to Buy: Bridal wear, cosmetics, books, shoes, gadgets and electronic items\n" +
                        "Timings: 10:00AM to 8:00PM (all days of the week) except Monaday.\n" +
                        "One of the oldest shopping areas is Karol Bagh. It is popularly known for offering an array of gorgeous bridal wears and traditional Indian garments. Besides, cosmetics, books, shoes, gadgets and electronic items are the things you can grab from the market places. There are some well known shopping places around Karol Bagh like Ajmal Khan Road (known for inexpensive readymade), Ghaffar (popular for imported good), Arya Samajh Road (visited for second hand books) and Bank Street (popular for gold jewelry).\n";
                break;


            case "Khan Market":
                info = "Things to Know :-\n" +
                        "Location: Humanyun Road, New Delhi, India\n" +
                        "How to Reach: Metro (Khan Market Metro Station)\n" +
                        "What to Buy: Garments, books, lifestyle items, food items\n" +
                        "Timings: 10:00AM to 11:00PM (all days of the week) except Sunday\n" +
                        "Khan market is regarded as one of the posh shopping places in Delhi. This specially designed U-shaped market has well organized book shops, showrooms of branded clothes, boutiques and stores offering classy lifestyle items. It is also popular for its food joints, cafes and restaurants which serve mouthwatering cuisines of Delhi. It is a nice place to be visited by travelers.";
                break;


            case "Lajpat nagar Market":
                info = "Things to Know :-\n" +
                        "Location: Lajpat Nagar, New Delhi, India\n" +
                        "How to Reach: Metro (Lajpat Nagar Metro Station)\n" +
                        "What to Buy: Garments, accessories, footwear, bags, home furnishing and décor items\n" +
                        "Timings: 10:00AM to 9:00PM (all days of the week) except Monday\n" +
                        "Lajpat Nagar Market is popular for offering all types of formal and casual wear. It is popular for offering garments at reasonable prices especially traditional Indian dresses like saris and salwar kameezes. Besides, you can also pick good quality footwear, accessories and bags from Lajpat Nagar Market. Trendy boys and girls can pick their kind of goods from this shopping place. Not only this, you can also pick furnishing and decor products from the stores of Lajpat Market.";
                break;


            case "Palika Bazar":
                info = "Things to Know :-\n" +
                        "Location: Connaught Place, New Delhi, India\n" +
                        "How to Reach: Metro (Rajiv Chowk Metro Station)\n" +
                        "What to Buy: Clothes, perfumes, accessories, footwear, electronic goods, CDs\n" +
                        "Timings: 10:00 AM - 7:00 PM (all days of the week) except Sunday\n" +
                        "This shopping plaza is situated at the center of Connaught Place and is fully air-conditioned. Delhiites and people visiting Delhi from other region of India purchase clothes, perfumes, accessories, footwear, electronic products, CDs and many other products from Palika Bazaar. One should have the ability to bargain to get the products at reasonable prices. This place is well connected through all modes of public transport such as buses, taxies, autos and metro.";
                break;


            case "Sarojini Market":
                info = "Things to Know :-\n" +
                        "Location: Sarojini Nagar, Near Dilli Haat, New Delhi, India\n" +
                        "How to Reach: Metro (INA Metro Station)\n" +
                        "What to Buy: Apparel, accessories, household items, kitchenware, electronic products\n" +
                        "Timings: 10:00AM to 9:00PM (all days of the week), except Monday\n" +
                        "Sarojini Nagar offers range of fashionable clothes at cheap rates. From apparel to kitchenware, accessories to household items, you will get everything in this market. To get the trendiest of things you can opt for Sarojini Market. But you should have good capability of bargaining within you to get your product at decent price. Teenagers and people following trend love to shop from this market.";
                break;


            case "Select City Walk":
                info = "Telephone: 011 4211 4211\n" +
                        "Hours/Timings: Monday to Sunday – 10:00 am to 11:00 pm\n" +
                        "Select Citywalk is one of the largest shopping malls in Delhi, which spread over the land of 1,300,000 sq ft. There are three floors, consist of 180 stores and 500 brands. The Select Citywalk shopping mall is located in Saket, New Delhi.\n" +
                        "Address: Select Citywalk, A-3m District Centre Saket, Sector 6, Pushp Vihar.";
                break;

            //Delhi Hotels Info
            case "Leroi":
                info = "Located near New Delhi Railway Station, Le ROI Delhi Hotel is a wonderful budget property. The Paharganj hotel is in close proximity to Rama Krishna Ashram Marg Metro station and provides you easy access to all of New Delhi without the worry of traffic. The Indira Gandhi International Airport, Commercial Centres, Famous Markets like Connaught Place and Karol Bagh, and Historic Places and Monuments like Jama Masjid, Red Fort and more are within close proximity to the hotel.\n" +
                        "Le ROI Delhi Hotel has richly appointed rooms and suites, which feature sound proof windows & doors, giving you peace and privacy right in the middle of bustling Central New Delhi. Hotel Le ROI Delhi, Paharganj offers a perfect blend of Indian tradition and International sophistication at surprisingly affordable prices. We invite you to experience true Indian hospitality at its finest!";
                break;


            case "Toronto":
                info = "In New Delhi stands the Hotel Toronto, just 1 kilometer from the New Delhi Railway Station. It offers free Wi-Fi connectivity throughout the property. The property has a total of 20 rooms spread across 4 floors.\n" +
                        "Each air conditioned room has a sitting area, flat screen television, mini bar, room heater, bottled drinking water, wardrobe and attached bathroom with free toiletries. Other services include travel counter, luggage storage space, 24-hour front desk, laundry services, medical services and room service facility. Attractions around the hotel include Akshardham Temple (11 km), Lotus Temple (17 km), Humayun's Tomb (10km), The Red Fort (6 km), Lodi Gardens (7 km), Gurudwara Bangla Sahib (3 km),India Gate (6km), Gaffar Market (2 km), Sadar Market (1 km), Conneaut Palace (1 km), Chandni Chowk (3 km), Jantar Mantar (4 km) and Laxminarayan Temple (3 km).";
                break;


            case "ITC Maurya":
                info = "ITC Maurya (formerly The Maurya New Delhi), a premier 5 star hotel in Delhi is named after the famous ‘Mauryan” dynasty which gave Indian history it’s golden age where art, culture and architecture flourished.This luxury hotel in Delhi has 440 rooms, including 29 uniquely-designed suites, are available in a bouquet of room categories, from the Executive Club which pioneers a tradition in corporate hospitality to the Towers’ eight luxurious floors of elegance and tranquility. The Mauryan Chamber combines the best of opulence, space, and service standards and the ITC one PURE rooms – our premium room category offers an allergy friendly environment with magnificent decor, impeccable service, and the latest in modern conveniences and amenities. Behind the lavishness is a crisp efficiency and a deep understanding of the needs of the global traveler.";
                break;


            case "JW Marriott ":
                info = "The JW Marriott Hotel New Delhi Aerocity welcomes business and leisure travelers here to India with 5-star luxury, carefully chosen amenities and world-class service. Located adjacent to Indira Gandhi International Airport, our hotel features exceptionally large accommodation with ultra-comfortable bedding and marble bathrooms, as well as 24-hour room service and modern technology. Choose among several outstanding on-site restaurants, including an all-day diner, K3 and Modern Japanese at Akira Back.";
                break;


            case "The Lodhi":
                info = "The Lodhi (formerly Aman New Delhi) ethos is simple and easy luxury It is also an ethos of contrasts. From the dynamic and vibrant atmosphere in the restaurants, courtyards and public areas to the seclusion, peace and club- like atmosphere of the seven floors of guest accommodation. The Lodhi epitomizes contemporary India-culturally, artistically with our changing art exhibitions, our food, our environment, our guests and our visitors but we also reflect tradition and history-our name, our location, our predecessors, our city, our India! We offer comfort, warmth, recognition, smiles and our personal attention And we are discretely efficient with high standards of service and Commitment. After growing up as an Aman city resort since opening in 2009 , we are now, proudly, an independent, standalone entity, a boutique city property reflecting all that we were as an Aman resorts and more now that we are The Lodhi.";
                break;


            case "Taj Mahal":
                info = "Central to The Taj Mahal Hotel's prominence is its old-world grace and charm, blended effortlessly with contemporary comforts and amenities. In its unique blend of warmth and welcome and assiduous attention to service, The Taj Mahal Hotel is a true ambassador of the Taj hospitality experience.\n" +
                        "Every single one of the 294 rooms and 27 suites is a \"room with a view\" and offers all the modern conveniences to match. Mouth-watering treats welcome you to the room upon check-in. While you are away at dinner, somehow a small treat made personally by Chef Kim Caula appears in your room to complete the evening. This is just one of many gestures that make a stay the Taj Mahal Hotel an experience one is eager to repeat.\n" +
                        "In addition to the luxurious Taj Club Rooms, the hotel has Executive Balcony Suites and Luxury Suites for those keen on an especially noteworthy stay. And then there is the internationally acclaimed Grand Presidential Suite, which reflects the pinnacle of high life in Lutyens' Delhi. With its perfectly honed details and elevated level of service, this suite is a favourite of heads of state, Presidents, Prime Ministers and CEOs worldwide";
                break;


            //Delhi Transport Info
            case "Chandni Chowk Metro":
                info = "Chandni Chowk is a station on the Yellow Line of the Delhi Metro.[2] It serves the Chandni Chowk market area, and is near the Red Fort. It is also walking distance to the Old Delhi Railway Station of Indian Railways.\n" +
                        "List of available ATM at Chandni Chowk Metro station are State Bank of India Public toilets are present inside station premises. Ticket vending machines are available in the metro station.";
                break;


            case "Indira Gandhi Airport":
                info = "Indira Gandhi International Airport serves as the primary civilian aviation hub for the National Capital Region of Delhi, India. The airport, spread over an area of 5,106 acres (2,066 ha), is situated in Palam, 15 km (9.3 mi) south-west of the New Delhi railway station and 16 km (9.9 mi) from New Delhi city centre.\n" +
                        "Named after Indira Gandhi, a former Prime Minister of India, it is the busiest airport in India in terms of passenger traffic since 2009. It is also the busiest airport in the country in terms of cargo traffic overtaking Mumbai during late 2015. In calendar year 2016, it was the 21st busiest airport in the world and 10th busiest airport in Asia by passenger traffic handling over 55 million passengers.The airport handled over 57.7 million passengers in fiscal year 2016-17. It is the world's busiest airport for Airbus A320 aircraft";
                break;

            case "New Delhi Station":
                info = "The New Delhi Railway Station (station code NDLS), situated between Ajmeri Gate and Paharganj is the main railway station in Delhi. It is the one of the busiest Railway Station in the country in terms of frequency of trains and busiest in terms of passenger movement. Around 400 trains starts, ends, or passes through the station daily and handles 500,000 passengers daily with 16 platforms.The New Delhi railway station holds the record for the largest route interlocking system in the world along with the Kanpur Central Railway Station i.e. 48. The station is about two kilometres north of Connaught Place, in central Delhi.";
                break;

            case "Old Delhi Station":
                info = "Delhi Junction, also known as Old Delhi Railway Station (station code DLI), is the oldest railway station of Delhi city and a Junction station. It is the one of busiest railway station in India in terms of frequency. Around 250 trains starts, ends, or passes through the station daily. It was established near Chandni Chowk in 1864 when trains from Howrah, Calcutta started operating up to Delhi. Its present building was constructed by the British Indian government in the style of nearby red-coloured fort and opened in 1903. It has been an important railway station of the country, and preceded the New Delhi Railway Station by about 60 years. Chandni Chowk underground station of the Delhi Metro is near it.";
                break;

            //Chennai Places

            case "Arignaranna Zoo":
                info = "Timings: 9 am to 5 pm (except Tuesdays)\n" +
                        "Entry Fee: INR 30 for adults and INR 10 for children between 5-12 years\n" +
                        "Photography: Allowed, INR 25 for camera and INR150 for a handycam.\n" +
                        "Located 35 km from the city centre, this zoological park is one of the places to visit in Chennai with kids. The expansive grounds of the zoo are home to 1500 species of wild beings, some of which are even endangered. An aviary, a lion safari, a deer safari and an elephant safari form the popular sections of the zoo. There is a separate section for nocturnal animals, an aquarium and a butterfly house too.";
                break;

            case "Birla Planetarium":
                info = "Timings: 10 am to 5:45 pm\n" +
                        "Entry Fee: INR 40 for adults, INR 25 for children.\n" +
                        "Situated close to the Anna University in Chennai, Birla Planetarium is an important part of Periyar Science and Technology Museum. There are regular audio-visual programs on astronomy conducted here apart from exhibits that include Solar System, Cycle of Stars, Sky and Seasons, Comets and Man on the Moon. Science Park, Traffic Park and Science on Wheelsare the highlights of Science Centre which are of special interest for young visitors.\n";
                break;

            case "Elliot Beach":
                info = "It can also be said that Adyar estuary is the north extension of the Elliot beach. Elliot beach is sometimes also referred as one of the cleanest beach of the Chennai. As mentioned, this part of Chennai is not so polluted and mostly inhabited by the richer part of the society. All these factors attracts more lovers to this beach including presence of good restaurants along the beach.\n" +
                        "This beach also hosts some of the festivals like Pongal, food festivals, new year fireworks or some concerts.\n" +
                        "More Info:\n" +
                        "Nearest Stop: Besant Nagar Bus stop (2 Kms) local buses connect this place to Adyar bus depot (3.5 Kms)\n" +
                        "Places to see around:\n" +
                        "Annai Velankanni Church, Restaurants along the beach road, Shopping area along the beach";
                break;

            case "Fort St George":
                info = "Timings: 9 am to 5 pm (except Friday)\n" +
                        "Entry Fee: INR 100 for foreign tourists and INR 5 for Indian visitors (only the museum)\n" +
                        "Photography: Allowed\n" +
                        "A delight for history buffs, this fort constructed during the British Rule, encloses historic monuments of St. Mary’s church and St. George museum. The museum houses artefacts from that era including paintings, coins, silverware, arms, porcelain and documents.";
                break;

            case "Kapaleeswarar Temple":
                info = "Timings: 5:30 am to 12 pm, 5-9 pm\n" +
                        "Entry Fee: None\n" +
                        "Photography: Allowed\n" +
                        "Apart from being a religious spot, what draws crowds to this temple is its unique architecture. The detailed Gopuram of this structure is 37 metres high and is a fine example of Dravidian style of construction. The temple, home to the deities Shiva and Karpagambal, even holds a festival in the months of March and April.";
                break;

            case "Marina Beach":
                info = "India’s largest beach happens to be Chennai’s Marina Beach which extends from Fort St. George to Besant Nagar. One of the best places to visit in Chennai for viewing a spectacular sun rise, this sandy delight is lined by palm trees on one side.\nAn old light house stands on the southern end of Marina along with several other structures including an aquarium, a swimming pool and a park. With food stalls, rides on ponies, kite flying and beach games to entertain you, a visit to here must be included on your trip to this city.";
                break;

            case "MGM dizzee world":
                info = "Timings: 9:30 am to 5:30 pm on weekdays, 10:30 am to 7:30 pm on weekends and holidays\n" +
                        "Entry Fee: INR 799 for adults (with food), INR 577 for kids (food included), INR 550 for adults, INR 450 for kids\n" +
                        "Photography: Allowed\n" +
                        "This amusement park, located on the East coast road, is a wholesome entertaining spot for young and old alike. With several thrilling rides and an amphi-theatre for performances, guests to Dizzee World would surely enjoy a day spent here. The water park on the premises has a wave pool apart from many other rides and slides.";
                break;

            case "National Art Gallery":
                info = "The National Art Gallery is one of the museums in the Government Museum, Chennai. The gallery has a wide collection of arts and crafts, especially paintings from the 14th and 15th centuries. Children would love the rock and cave art showcased in this gallery. The museum also displays paintings of renowned painter Raja Ravi Varma.";
                break;

            case "Santhome Church":
                info = "Timings: 6 am to 8 pm\n" +
                        "Entry Fee: None\n" +
                        "Photography: Allowed\n" +
                        "An important religious spot for the Christian community, the sparkling white structure of San Thome stands on the tomb of St Thomas. This structure, which is a reminder of the colonial past of the city, has stained glass windows and a statue of St Thomas in a sitting posture. A museum, a library and a shop selling prayer material are found within the church premises too.  ";
                break;

            case "Thousands Light Mosque":
                info = "Timings: 5:30 am to 9 pm\n" +
                        "Entry Fee: None\n" +
                        "Photography: Not allowed\n" +
                        "Another place to see in Chennai for its architectural magnificence is this mosque which holds a special place in the Shia community. A total of 1000 oil lamps light up the hall of the mosque, which is how it got its name. Its multi-domes and twin minarets enclose the main hallwhere  men offer their prayers. There is a separate hall for the women.";
                break;


            // Food
            case "Anna Laxmi":
                info = "Annalakshmi in Chennai is among the best places to satisfy the urge for delicious Tamil Nadu vegetarian food at an affordable price, transforming vegetarian dining into a cultural experience. Such is the popularity of Annalakshmi that it now has branches in four countries, India, Malaysia, Singapore and Australia. The vegetarian thali is a popular dining option with rich and varied dishes ending with payasam and ice cream; Annalakshmi Chennai also offers a varied à la carte menu. A popular dining location, booking in advance is highly recommended.";
                break;

            case "Barbeque Nation":
                info = "Crowds flock to Barbeque Nation every night of the week for its infamous kababs, considered some of the best in Chennai. Indeed, one can easily fill up on starters at Barbeque Nation with both vegetarian and non-vegetarian grilled options, including paneer tikka, chicken, mutton and fish. Kababs are grilled at the table, providing a wonderful communal dining experience with a contemporary ambiance that is both tasty and fun";
                break;

            case "Benjarong":
                info = "Bringing together a harmonious fusion of spices in a way only the Thai know, Benjarong creates the culinary magic of authentic Thai cuisine right in the heart of Chennai. In a country where Thai cuisine has become ubiquitous and associated with the all too familiar soups, stir-fries and curries, Benjarong gives Thai cuisine a refreshing meaning with its wide range of offerings.\nWhile Gai Hor Baitey (chicken base), Soft Shell Crab, Goong Tod Samunpai (prawn based), Pla Rad Prik (fish based), Khao Pad Sapparot (pineapple fried rice base) are few of the restaurant's signature dishes and a must try any given day, you would do well to take your pick from whatever catches your fancy as it is bound to be palatable, provided you have a taste for Thai flavours. With a service that is accommodating to a fault and charming ambience, Benjarong is ideal for both vegetarians and non-vegetarian gourmet as well as the more relaxed diners. A must try is Tub Tim Grob, a dessert consisting of water chestnuts soaked in sweetened coconut milk.";
                break;


            case "Bombay Lassi":
                info = "Tucked away in a narrow alley, this joint is one of the most famous places in the city that makes piping hot samosas. Located right behind Devi theater, this place also has thick lassi, jelebi, rabdi, and kachodi. Bombay Lassi is more of a stall with no place to sit, but people from all over the city throng here to bite into some delicious samosas.";
                break;

            case "Dakshin":
                info = "As India’s ‘Gateway to the South’, Chennai is at the crossroads of southern India’s great culinary traditions, from the tastes of Kerala to the fiery, spiced foods characteristic of Chettinad cuisine which is considered by many to be to be the most aromatic and flavourful, packed with spices. For diners craving simple, authentic south Indian food with hints of Chettinad influence, Dakshin at the Park Sheraton in Chennai is the perfect option. Diners can opt for the traditional thali or order from the menu. Southern dishes including rasam, dosai, chutneys, spicy Andhra style chicken and more feature. The classical south Indian fare is complemented by the traditional ambiance, which features Tanjore paintings as well as live classical Karnatic Indian music.";
                break;

            case "Italia at the parkpod":
                info = "Whilst Italian cuisine isn’t the first that comes to mind when you think of Chennai, Italia at The Park Pod hotel in Chennai has garnered rave reviews from locals and visitors alike for its classy Italian-inspired dishes. Airy and spacious with an outdoor courtyard lounge area and a glass-encased patio, Italia is an ideal dining space for anyone seeking a respite from the scorching Chennai summer and a perfect evening dining setting. Visitors can get a taste of Italy with thin crust pizzas, mushroom risotto, lasagnas and other Italian classics.";
                break;

            case "Madras Pavillion":
                info = "A sister restaurant to Pan Asian at the palatial ITC Grand Chola in Chennai, Madras Pavilion serves an eclectic array of dishes with both Western and Eastern roots. Widely considered Chennai’s best fine dining buffet restaurant, the Madras Pavilion offers a huge selection without compromising the quality of dishes. Madras Pavilion provides a top-notch dining experience with excellent service in a refined setting.";
                break;

            case "Murugan Idli Shop":
                info = "Murugan Idli Shop in Chennai originated in Madurai in Tamil Nadu with multiple locations in Chennai, Madurai and Singapore and, as its name suggests, it specialises in idli. Traditionally served as a traditional south Indian breakfast food, idli is a savoury cake made with fermented black lentils and rice. Murugan Idli Shop is famed for its idli, with milagai podi (chili powder), chutney and sambar, and its dosai.";
                break;

            case "Panasian":
                info = "Pan Asian at the luxurious ITC Grand Chola is one of the city’s most exciting restaurants with a pan Asian focus. The restaurant has quickly become the go-to spot for Asian fusion foodsi. Diners who visit Pan Asian are treated to a five-star meal in a tastefully designed space that is grand, spacious and airy. Pan Asian is headed up by Chef Vikramjit Roy, one of India’s rising stars who spent years honing his skills in kitchens from Tokyo to Delhi as well as at the renowned Wasabi by Masaharu Morimoto. Chef Roy brings this culinary expertise to Pan Asian, creating East Asian dishes that integrate the rich spices and ingredients of the subcontinent.";
                break;

            case "Southern Spice":
                info = "Southern Spice at the Taj Coromandel Hotel offers a perfect introduction to south Indian food, featuring the classic dishes from south India’s four states: Andhra Pradesh, Karnataka, Kerala and, of course, Tamil Nadu. The dining space integrates traditional Indian decorative elements with a contemporary vibe, its carved pillars and mural paintings evoke dynastic temple architecture, drawing on Tamil Nadu’s rich cultural heritage, whilst the high ceilings and modern setting evokes the coming of age of cosmopolitan Chennai. The traditional thali meal begins with appetisers and amuse-bouche, with papads and chutneys (the coconut chutney has been proclaimed the ‘best in the world’), appams and dosai (rice-based pancakes) giving diners a delectable start to the meal. These are followed by various stews, meat dishes and curries, as well as sweets including payasam with rasam, which is served as a drink, throughout the meal. Whilst Southern Spice is on the high-end of Chennai dining with prices to match, its flavourful dishes present the best of south Indian cuisine.";
                break;

            case "Thalapakattu Biryani":
                info = "The Thalappakatti Biriyani Hotel’s roots can be traced all the way back to 1957. Founded by Mr. Nagasamy Naidu under the name Anandha Vilas Biriyani Hotel in Dindigul. He always wore a turban called THALAPA(a traditional head dress), which over the years became synonymous with his brand and cooking styles…";
                break;


            //Shopping in chennai
            case "Abirami Mall":
                info = "Abirami Mega Mall is one of the largest shopping malls in Chennai. It is located in Purasawalkam, Chennai. The mall has an ample space of car parking in the basement. There are total four theatres in the mall, namely, Abirami 7 Star Theatre, Swarna Sakthi Abirami, Shree Annai Abirami, and Robot Bala Abirami. The mall has a large number of shopping outlets including beauty salon, food outlets, and tattoo parlour.";
                break;

            case "Express Avenue":
                info = "Express Avenue is considered as one of the largest shopping malls in Chennai. The Express Avenue Shopping Mall has a large number of entertainment related facilities such as PIX 5D Movies, Kids Play Zone, and Gaming Zone. The Express Avenue mall has a large number of shopping related stores in various categories such as Footwear, Automobiles, Fitness, Handicrafts, Saloon & Spa, Watches, Health & Beauty, Kids & Mother Care, and much more. The mall is situated at the Whites Road, Royapettah in Chennai.\n";
                break;

            case "Nungam Bakkam":
                info = "Now for those of you, who love to have that stylish edge to everything in your house, Nungambakkam and it’s neighbourhood are the places to shop at. From luxurious branded clothing to well-crafted handicrafts, you get everything here with the price tag “expensive” on it.";
                break;

            case "Parrys Corner":
                info = "Known to be the wholesale central in Chennai, Parry’s corner is the one stop shop for all those who want reasonably priced yet ethnic goods to decorate their homes. Also, if you are tired of shopping at Saravana stores, we suggest you go here to buy all those steel utensils or lamps.\n";
                break;

            case "Phoenix Mall ":
                info = "Phoenix Market City shopping mall is situated on Velachery Main Road. It is the largest shopping mall in Chennai and also considered as one of the best shopping destination in the city of Chennai. There are several brands available in the mall such as Big Bazaar, Allen Solly, Cha-Republic, Costa Coffee, and others.";
                break;

            case "Pondi Bazaar":
                info = "Very close to the T. Nagar shopping area is Pondy Bazaar. This is also the rightful place to go to for some street shopping. Especially if you are looking to not to travel to the other end of the city for some cheap yet everyday clothing and footwear, try this area.";
                break;

            case "Ritchie Street":
                info = "This is like Palika Bazar in Delhi (if one has been there). You can buy all these electronic goods for some really cheap prices, but they come without a warranty. So if you are little sceptical on the experience, we suggest going with a local so that you are not fooled.";
                break;

            case "Snow Carpet":
                info = "If you are looking for street shopping with a North Indian essence, then head straight to Sowcarpet. You can buy some awesome lehenga cholis or jazzy salwar suits at wholesale prices. And this is one of the best places in Chennai to enjoy some mouth-watering chaat while shopping.\n";
                break;

            case "Spencer Plaza":
                info = "One of the oldest malls in Chennai is Spencer Plaza. Even though it might have a lot of shops,you will still enjoy walking through it until you find what you are looking for. The third floor has a wide range of shops selling everything from pashminas to curtains and art that are totally worth the price.";
                break;

            case "T Nagar":
                info = "The largest shopping district of the county lies in the city of Chennai and is known as Theagaraya Nagar. While most of the shops here deal in gold jewelry, there are a host of shops that sell almost everything that one can ask for. From silk sarees to household items - crockery, cutlery, toiletries, cosmetics, clothing and footwear, the list is endless. The market is also known for its varied price range. One can get a very good bargain here while some items are extremely expensive. The roadside stalls are a must visit as they stock some very good products to be purchased at good bargains.";
                break;


            //Hotels in Chennai
            case "Belstead":
                info = "Price: 2400/-\n" +
                        "In a vibrant commercial area surrounded by shops and restaurants, this casual hotel is 2 km from Chennai Chetpat train station and 6 km from Marina Beach on the Bay of Bengal. \n" +
                        "Streamlined rooms with colourful accents provide free Wi-Fi and flat-screen TVs. Upgraded rooms add minibars, sitting areas, and tea and coffeemaking facilities; suites have living areas. Room service is available.\n" +
                        "Parking is free. A retro-style restaurant features a parked car inside, and there's also a 24-hour coffee shop. Other amenities include a terrace and a TV lounge.";
                break;

            case "ITC Grand Chola":
                info = "Price: 14k+\n" +
                        "Set in an opulent, palatial design which pays homage to Southern India’s grand empires, the ITC Grand Chola, Chennai overlooks verdant parks and gardens. Experience understated Indian hospitality in an exquisite property with a distinct personality.\n" +
                        "Discover new flavours from India, Asia and Italy in our exceptional restaurants, indulge in a pampering treatment in the spa and unwind in the three swimming pools and fitness centers. Over 4,700 square metres of meeting space will enhance any event.\n" +
                        "Our 600 spacious guest rooms, suites and serviced apartments are the epitome of Indian grace and style, expertly appointed with thoughtful amenities. The needs of the business traveller meld with the personalised desires of a destination connoisseur.";
                break;

            case "Pandian":
                info = "Price: 860/-\n" +
                        "Set 1.9 km from Chennai Central Station, this laid-back hotel is also 4.5 km from Marina Beach. \n" +
                        "Featuring colourful decor, the straightforward rooms come with in-room basins and TVs. Upgraded rooms add modern decor, air-conditioning and/or minifridges, plus tea and coffeemaking facilities. Room service is available.\n" +
                        "Free perks include a breakfast buffet and parking. There's also a relaxed international restaurant and a bar, as well as a fitness room. Pets are welcome.";
                break;

            case "Park Hyatt":
                info = "Price: 10k to 15 k\n" +
                        "The 201 luxurious rooms and suites are thoughtfully designed to delight you. The restaurants offer a vibrant gastronomic journey across the culinary capitals of the world and the focus is on extraordinary cuisine in distinctive settings. For social gatherings and meetings, Park Hyatt Chennai offers a unique residential-style banqueting space, The Apartment, which is truly versatile and exclusive. A floating oasis above the din of the city, Antahpura Spa provides holistic wellness therapies inspired from the legendary traditions of Chettinad. The spa also features a rooftop infinity pool and a world-class fitness center with stunning views of the city.";
                break;

            case "Radison":
                info = "Price: 5k to 8k\n" +
                        "With a prime location just 10 minutes from Anna International and Kamaraj Domestic terminals at Chennai International Airport, the Radisson Hotel Chennai provides access to shopping and major attractions. Guests at our hotel in Chennai enjoy a Business Centre, a Fitness Studio and complimentary airport transfers. Book your stay at the Radisson and enjoy the quality services and convenient location of one of the top Chennai hotels.";
                break;

            case "Royal Agency":
                info = "Price : 2000/-\n" +
                        "Overlooking the Cooum River, this informal hotel is a 12-minute walk from Chennai Central train station, 3.1 km from Express Avenue mall and 4.8 km from Marina Beach. \n" +
                        "Featuring free Wi-Fi, the straightforward rooms and suites also come with satellite TV, minibars, and tea and coffeemaking facilities.\n" +
                        "Complimentary amenities include breakfast and parking. There’s also a casual restaurant.";
                break;

            case "Savera":
                info = "Price:2500 to 5000\n" +
                        "The Savera is an 11-storied four-star hotel located in Mylapore, Chennai, India.\n" +
                        "The hotel features seven food and beverage venues, namely, the multi-cuisine restaurant named The Piano, a South Indian restaurant named Malgudi, Curry Town, Bay 146, Bamboo Bar, Brew Room and a cake shop named Baker’s Basket. The hotel has 10 meeting venues.\n" +
                        "The hotel has a corporate social responsibility entity named Savera Hotel Academy established to guide students towards a career in hospitality industry.";
                break;

            case "Leela Palace":
                info = "Price: 11k to 13k\n" +
                        "Abutting the pristine and the azure Bay of Bengal, The Leela Palace is Chennai’s first and only seafront city hotel. Drawn from the inspiration of Chettinad Dynasty, the architecture of the Palace Hotel exudes the regal and opulent style. Set on 6 acres of land, the 11-storeyed hotel features 326 rooms and suites and also has a Software Park included. Equipped with world-class amenities, the meeting and conference centres are luxuriously and lavishly spread. Its close proximity to the central business district and local attractions and having a spectacular sea view on offer is sure to make the experience of our guests a very memorable one.\n";
                break;

            case "Park Chennai":
                info = "Price:3k to 5k\n" +
                        "The Park in Chennai is an urban haven, located on Anna Salai in the heart of the business district of Tamil Nadu's vibrant capital. This elegant and lavish 214-room hotel stands on the historic premises of the erstwhile Gemini Film Studios. The Precincts that created larger than life heroes and heroines since the 1940's, mesmerising millions with Technicolor dreams have now been transformed to house the theatre of life in its private and public spaces.\n" +
                        "The hotel creates a unique story of textures, surfaces, shadow and light inspired by film and performance in its various forms.";
                break;

            //Transport Chennai

            case "Chennai Airport":
                info = "Did you know: Chennai International Airport is India's fourth-busiest airport by passenger traffic.\n" +
                        "Code: MAA\n" +
                        "Elevation: 16 m\n" +
                        "Phone: 044 2256 0551\n" +
                        "Owner: Airports Authority of India\n" +
                        "Chennai International Airport is an international airport serving the city of Chennai, Tamil Nadu, India and its metropolitan area. It is located at Meenambakkam, 21 km from Chennai";
                break;

            case "Central Railway Station":
                info = "Station code: MAS\n" +
                        "Parking: Available\n" +
                        "Platforms: 17 (12 long distance, 5 suburban)\n" +
                        "Status: functioning\n" +
                        "Chennai Central, erstwhile Madras Central, is the main railway terminus in the city of Chennai, Tamil Nadu, India.\n" +
                        "It is one of the most important hubs in the South. It is connected to Moore Market Complex railway station and Chennai Park railway station, and is adjacent to Chennai Egmore railway station. \n" +
                        "Chennai Central connects the city to all northern cities of India, including Kolkata, Mumbai and New Delhi.";
                break;

            case "Egmore":
                info = "Opened: 1905\n" +
                        "Station code: MS\n" +
                        "Parking: Available\n" +
                        "Passengers: 1,50,000 per day (approx.)\n" +
                        "Chennai Egmore (formerly known as Madras Egmore) is a railway station in Chennai, India. \n" +
                        "Situated in the neighborhood of Egmore, it is one of the two intercity railway terminals in the city.\n" +
                        "The station is about 750 m long and has 11 platforms. Platforms 1, 2 and 3 are on the eastern side.";
                break;

            case "Chennai Metro":
                info = "Hours: Closed · Opens 9:30AM Mon\n" +
                        "Began operation: 29 June 2015\n" +
                        "Phone: 044 2379 2000\n" +
                        "Owner: Chennai Metro Rail Limited (CMRL)\n" +
                        "The Chennai Metro is a rapid transit system serving the city of Chennai, Tamil Nadu, India. The system commenced service in 2015 after partially opening the first phase of the project.";
                break;


            //BAnglore Places

            case "Banglore Palace":
                info = "Famous for: Architecture, History, Palace.\n" +
                        "Tickets: 230 INR for Indians and 460 INR for foreigners. Extra charge of 685 INR for still camera.\n" +
                        "Opening Timings: Open on all days from 10am to 5pm.\n" +
                        "Duration: 1.5 hours.\n" +
                        "Bangalore Palace was constructed by Chamaraja Wodeyar in the year 1884 and he had his inspiration from England’s Windsor Castle. Located at city’s center, the Tudor style construction has Gothic windows, woodcarvings and turrets, which stand proof of the stunning architecture during the period. The 430-acre land that holds the palace has beautiful gardens. The palace is now used to conduct exhibitions and concerts.";
                break;

            case "Baner Ghatta Park":
                info = "Famous for: Wildlife, Flora, Adventure.\n" +
                        "Tickets: Safari for 260 INR (Adult Indian), 130 INR (children from 6-12 yrs) and 400 INR (foreigners from non SAARC countries)\n" +
                        "Opening Timings: Open on all days from 9am to 5pm.\n" +
                        "Duration: 2 hours.\n" +
                        "A biological recreational centre built near the chaotic city of Bengaluru, Bannerghatta National Park is perfect for wildlife lovers. The park aims to promote eco tourism and teach the young generation about the importance of wildlife conservation. A zoo was created in the middle of the beautiful Champakadhama hills valley inside the Bannerghatta National Park. A butterfly farm is also a new addition to look forward to.";
                break;

            case "Cubbon Park":
                info = "Famous for: Gardens, Nature, Recreation, Walks.\n" +
                        "Tickets: No entry fee.\n" +
                        "Opening Timings: Open on all days.\n" +
                        "Duration: 1.5 hours.\n" +
                        "Cubbon Park is situated in 300 acres of land. It was constructed by Richard Sankey who was the Chief Engineer of Mysore. The massive green parks and the lawns that are well maintained need special mention. The Park offers beautiful walk way. It is a perfect place for you to be during your hectic holiday tour. It deserves to be called a Paradise for walkers. Statues of famous personalities are situated here. You will be mesmerized by the sight of Cubbon Park in the evening when the lights are turned on.";
                break;

            case "Innovative Film City":
                info = "This is an entertainment theme park with something for everybody. Located about 40 km from Bangalore, we can somewhat equate this to Disneyland of the United States of America.\n" +
                        "Located on a 50-acre land, the city offers many entertainment facilities to suit all age groups such as Teddy Museum, Louis Tussaud’s Wax Museum, Mini Golf field, Ripley’s Believe It or Not, Haunted Mansion, Bungee Jumping and so much more.\n" +
                        "A wide range of food options are available at the food court and elsewhere. There is a Handicraft and Cultural Village, where the native arts and crafts and cuisines of different states can be found.\n" +
                        "The tariff is Rs.599/- per adult for a standard package, while there are special offers for school children.\n";
                break;

            case "Kaiwara Temple":
                info = "Famous for: Temples, Mahabharata, History.\n" +
                        "Tickets:  No entry tickets.\n" +
                        "Opening Timings: Open daily.\n" +
                        "Duration: One day.\n" +
                        "Distance from Bangalore: 1 hr 47 min (79 km).\n" +
                        "The ancient town of Kaivara finds mention in many scriptures. Pandavas stayed here for some time during their exile and the bilingual saint poet Saint Narayanappa lived here for between the late 18th to the early 19th century. Many of his poems dedicated to Lord Vishnu were composed both in Telugu and Kannada in this city. The Amaranarayana Swamy Temple here is a major attraction for its connection to Lord Venkateshwara of Tripura.";
                break;

            case "Lal Bagh Botanicals":
                info = "Famous for: Architecture, Tipu Sultan, Garden, Flora\n" +
                        "Tickets: 20 INR for Indians and 15 INR for children.\n" +
                        "Opening Timings: Open on all days from 6am to 7pm.\n" +
                        "Duration: 1.5 hours.\n" +
                        "This botanical garden is one of the most beautiful botanical gardens you could find in India. Constructed by Haider Ali, it was later modified by Tipu Sultan. The Glass House in the gardens was inspired by the London Crystal Palace. Spread across a sprawling 240 acres of land, the garden has above 1800 species of plants, herbs and trees. The lawn clock in the garden is the first of its kind in India.";
                break;

            case "Nandi Hills":
                info = "Famous for: Hill station, Mountains, Climate, Views.\n" +
                        "Tickets: No entry fee.\n" +
                        "Opening Timings: Open on all days.\n" +
                        "Duration: 2 hours.\n" +
                        "Nandi Hills is a perfect location to feel one with nature. Located 60 kms away from Bangalore, it is one of the hill stations near Bangalore with the solid monolithic granite mass that offers the best view. Rivers Palar and Arkavathi originate from here. The hill was named after the renowned Nandi temple, which is situated at the top of the hill. It is situated 1478 meters above sea level. The climate is pleasant and hence any time is the right time to visit the place. Some of the tourist attractions here include Amruth Sarovar, Tippu’s Summer Palace and Fort, Horse Way, origins of Palar and Arkavathi rivers, Yoga Nandeeshwara Temple and Tippu Drop. You can find a playground for children here with excellent facilities to enhance the spirit of children.";
                break;

            case "National Gallery of Art":
                info = "Famous for: Paintings, History, Exhibitions, Art.\n" +
                        "Tickets: 10 INR for Indians, 1 INR for children and 150 INR for foreigners.\n" +
                        "Opening Timings: Open on all days from 10am to 5pm.\n" +
                        "Duration: 2 hours.\n" +
                        "\n" +
                        "If you're an art lover, don't miss visiting the National Gallery of Modern Art on Palace Road. This gallery, which opened in 2009, is the third such one in India (the others are in Delhi and Mumbai). It's housed in a Colonial mansion with a garden setting, and has two interconnected wings. The old wing features works from the early 18th century up until India's Independence, while the new one displays works from a large number of modern and contemporary artists. There's a cafe on the premises as well.";
                break;

            case "Shivsamudra Falls":
                info = "Famous for: Waterfalls, Trekking, Nature\n" +
                        "Tickets: No entry fee.\n" +
                        "Opening Timings: Open on all days. Dayvisit recommended.\n" +
                        "Duration:  130 km\n" +
                        "Distance from Bangaluru: 3 hr (132.5 km).\n" +
                        "The place is famous for having Asia’s first hydroelectric power station. If you love trekking, you would not want to miss this place. To reach this falls, you need to trek a distance of 2 kms and you will enjoy the journey that takes you through lush greenery. The best time to visit the falls is between June and September as you can have stunning view of the water falling magnificently.";
                break;

            case "St. Mary Basilica":
                info = "Famous for: Christianity, Gothic architecture, Serenity\n" +
                        "Tickets: Free entry.\n" +
                        "Opening Timings: Open on all days from 6am to 9pm.\n" +
                        "Duration: 45 mins.\n" +
                        "St. Mary’s Basilica is Bengaluru’s oldest church is famous for St. Mary’s Feast in the month of September. The church’s first foundation was laid in the 17th century and it was rebuilt to its original glorious structure in 1875. The church is only the sixth church in India which has been elevated to a minor basilica. A long history is associated with the church; The two statues of St. Mary also have an interesting legend behind their inception in the church. The Gothic architecture, beautiful pillars, stained windows make this church a sight to behold.";
                break;

            case "Tipusultan Fort":
                info = "Famous for: History, Architecture, Tipu Sultan, Fort\n" +
                        "Tickets: 15 INR for Indians and 200 INR for foreigners.\n" +
                        "Opening Timings: Open on all days from 8:30 am to 5:30 pm.\n" +
                        "Duration: 45 mins.\n" +
                        "Located in the most crowded market area, Tipu Sultan Fort represents the artistic talent that prevailed in the past. It was originally constructed by Kempegowda in the year 1537 using mud bricks. It was modified and extended by Haider Ali, who used granite stones in the process. It was Tipu Sultan who completed it during 1791 and it served as his summer retreat. The two-storied structure has pillars, carved arches and balconies. It represents Islamic style and you could find a temple of Ganesha, a Hindu god. This throws light on the religious tolerance exhibited by the ruler. If you love to go deep into historical facts, you need to visit the art gallery in the fort, which houses historical paintings, photos and carvings. ";
                break;

            case "Vidhan Soudha":
                info = "Famous for: Legislative Assembly, Architecture, Landmark.\n" +
                        "Tickets: Prior permission required to gain entry inside.\n" +
                        "Opening Timings: Open Mon to Fri from 9am to 5pm.\n" +
                        "Duration: 45 mins.\n" +
                        "A stunning example of Indo-Saracenic and Dravidian architecture, Vidhana Soudha is one of the most visible landmarks of Bengaluru. The foundation stone was laid by Pt. Jawaharlal Nehru in 1951 and it was completed in 1956. It has the distinction of being the largest legislative building in India and therefore many people don’t even enter the premises and a glimpse from outside is enough to satisfy them.";
                break;

            //Food in blore

            case "Central Tiffin Room":
                info = "Serving utterly delicious Butter Masala Dosa continuously to a huge number of customers is no child’s play. But CTR at Margosa Road, Malleshwaram has done this effortlessly and brilliantly for over six decades and is thus, a delight for Dosa lovers. Even to this day, this Tiffin Room is one of the best places to have South Indian Street Food in Bangalore. Apart from variety of dosas they also serve idly – vada, kesribath and the poori sagu. There are also other shops which serve ice creams, chats and other stuff around the place.";
                break;

            case "Dakshin ":
                info = "Opening Hours: 12.30 p.m. to 2.45 p.m. for lunch. 7.00 p.m. to 11.30 p.m. for dinner daily.\n" +
                        "Cost: 3,000 rupees for two people.\n" +
                        "What's Good: The thali has mouthwatering mix of food from all the southern states.\n" +
                        "Elegant Dakshin is the ITC hotel chain's signature south Indian fine dining restaurant. Its menu consists of a diverse array of home-style dishes sourced from traditional communities in each south Indian state. Dakshin is also renowned for its Iyer's Trolley, filled with an appetizing assortment of adais, banana dosais, and kunni paniyaram. The fresh chutneys are highlight as well. Diners are serenaded by soulful live classical Indian music to complete the experience. Do note that children below 12 years of age are not permitted.";
                break;

            case "Karavalli":
                info = "Seafood lovers must make it a point to come to Karavalli, where the specialty is coastal Indian cuisine served on banana leaf. The restaurant is decorated in the style of a traditional local house, with high wooden ceilings and a variety of antique furniture and seafarers maps. The atmosphere is cozy and relaxed inside, and outdoor dining is also a treat in the open-air courtyard and garden.";
                break;

            case "Koshy's Bar and Restro":
                info = "Opening Hours: 9 a.m. to 11.30 p.m.\n" +
                        "Cost: 700 rupees for two people.\n" +
                        "What's Good: The breakfasts are very popular. Otherwise, try the Fish Pakauda Curry or Koshy's Special Chicken Curry.\nKoshy's is another much-loved Bangalore dining institution that's withstood the test of time. It's a simple place with consistently good food, and has been open since before the British left. Head for the newer, air conditioned \"Jewel Box\" if you're after a fancier menu with a few exclusive options. However, the more laid back non air-conditioned section is what attracts the diverse crowd for breakfast, a leisurely Sunday brunch, high tea, or to linger over a beer or vodka.";
                break;

            case "Mavalli Tiffin Rooms":
                info = "Opening Hours: 6.30 a.m. to 11.00 a.m. for breakfast. 12.30 p.m. to 2.30 p.m. for lunch. 3.30 p.m. to 8.30 p.m. for snacks and dinner. Closed Mondays.\n" +
                        "Cost: 300 rupees for two people.\n" +
                        "What's Good: Rava idli, masala dosa, and pure filter coffee.\nMavalli Tiffin Rooms (commonly referred to as MTR) has been dishing up fuss-free vegetarian south Indian cuisine since 1924! It's the oldest idli dosa place in Bangalore. This legendary restaurant's main claim to fame is that it invented the rava idli, during World War II when rice was scarce. History, not ambiance, is what's important there. Expect to wait to be seated as it gets crowded.";
                break;

            case "Puchkas":
                info = "After some desi South Indian dishes and some delicious chats, its time to head to taste some lovely Indori food. This stall is located near the Purva Rivera Apartments at Silver Spring Layout in Marathahalli, Bangalore. The price here are relatively high compared to the ones told before but, it is in no match to the wonderful taste of the food served and the hygiene maintained here. Some of the famous dishes served here are the hot dogs, puchkas and many more.";
                break;

            case "Punjab Pleasures":
                info = "Opening Hours: Noon to 3.30 p.m. for lunch. 7.00 p.m. to 11.30 p.m. for dinner daily.\n" +
                        "Cost: 1,500 rupees for two people.\n" +
                        "What's Good: The tandoori platter, with an assortment kebabs and classic tandoori chicken.\nAnother veteran Bangalore restaurants that's been in business for decades, Tandoor may be nondescript on the outside but it has the grand ambiance of an old haveli (mansion) on the inside, with chandeliers and beautiful murals painted on its walls. The kitchen has large glass windows, providing an interesting view of the tandoor and chefs at work.\n";
                break;

            case "Shahi Darbar":
                info = "Located very next to the M S Rammiah ground in Mattikere – Yeshawanthpur, this chat stall offers yummy and extra delicious rolls which are quite low priced and absolutely delightful. This street food place is often crowded by students for its mouthwatering food served and the quality maintained here. Some of the best rolls are double paneer roll, double egg chicken roll and the simplest veg roll.";
                break;

            case "Sri Sairam's Chaat":
                info = "Be it the famous Sai Ram’s Special or the mouth watering dahi puri, this chat stall at Margosa Road, Malleshwaram has everything more to offer than you can ever expect. The person serving here always has a warm and heartily smile to add a bit of extra flavor to your already delicious food. They serve a numerous variety of chats which includes wafers chat, chips masala, disco chat, crazy masala and a lot more. It now also sells specially prepared home-made chocolates from Ooty. Ans yes, you miss the extra whole bunch of fun if you forget to ask for a plain puri soaked in pani and the sweet mixture at the end.";
                break;

            case "VW Puram Food Street ":
                info = "From the hot and spicy Masala Dosa to the sweet and sublime Dal Holige drenched in pure ghee, there is everything on this Food Street in Bangalore that you may want to eat. The rose gulkand enriched with the goodness of pure Honey and white Butter is one thing you should not miss at the Shivanna Gulkand Center. The food here is also quite economical and one of the best in Bengaluru. There are a number of stalls here including the Pav Bajji stall, the Sweet Corn stall, Manchurian stall to name a few.";
                break;



            //Code for setting shops Info

            case "Basavana Gudi":
                info = "Located in South Bangalore, Basavanagudi is another of the busiest shopping places in Bangalore. The place gets its name from the Bull Temple located close to the locality. Basavanagudi is considered as one of the heritage localities of Old Bangalore. Basavanagudi’s market is a burst of vibrant colours, smells and sounds, luring you there simply with its buzzing activity. From dry fruits to vegetables, home decor to apparel, you’ll find them all here. Whether it’s a simple wind chime to spruce up your space or farm-fresh veggies, the products here are available for quite a steal.\n";
                break;

            case "Brigade Road":
                info = "Don’t be fooled by the swanky showrooms and dazzling lights of Brigade Road. This affluent location has many a hidden gem, waiting to be discovered! Located between MG Road and Residency Road, Brigade Road is another option if you’re looking for budget shopping places in Bangalore. Some of the must-visit spots here include the all-time favourite bookstores, Blossoms and Bookworm, and Eva Mall where you can find styling casual wear for reasonable rates. Accessories, bags, footwear, even customised goodies are available here, and all for a steal. Make sure you hone your bargaining skills before heading there, of course.\n";
                break;

            case "Chick Pet":
                info = "This market is a treasure trove for shopaholics. Best known for its silk fabrics, this is one of the budget shopping places in Bangalore for ethnic wear like sarees. Some of the shops to visit in Chickpet market are Sudarshan silks, Prabhat Fancy store, Kiran Metal House and Kanchi Co-Shrinidhi Silk. The marketplace also has stores selling casual wear, footwear, jewellery, home decor and electronics, among other products. If you are a fitness freak and want to set up a small gym at home, Chickpet market has a few stores specializing in gym equipment, available for reasonable rates.";
                break;

            case "Commercial Street":
                info = "Commercial street is one of the best budget shopping places in Bangalore. A paradise for shopaholics, Commercial Street is synonymous with weekend shopping. Touted as one of the oldest shopping zones here, your hunt for value for money goodies is bound to end at Commercial Street. From bags to shoes, jewellery to trinkets and, of course, clothes, there ‘s enough here to please any shopping enthusiast. Apart from a whole lane dedicated to shoes and another to silver jewellery, there are streets lined with stores selling factory rejects, partywear, dupattas, ethnic outfits, home decor and antiques as well.";
                break;

            case "Forum Mall":
                info = "Timings: 10AM to 10PM\n" +
                        "For the more serious shoppers out there, this city is brimming with glitzy shopping malls inundated with a plethora of high-end, high-street and local brands. Forum Mall on Hosur Road offers several floors of stores and boutiques, food courts and restaurants and even entertainment facilities, and can take up to an entire day to traverse. Located within Bangalore's upmarket and affluent neighbourhood of Koramangla, this is the preferred one-stop-shop for the discerning shoppers.";
                break;

            case "Gandhi Bazar":
                info = "One of the oldest shopping areas in the city, Gandhi Bazaar is located in Basavanagudi. While you soak in the old-world charm of the neighbourhood, go shopping without worries of burning a hole in your pocket. If you get tired of looking at too many products that this bazaar offers, you can relax and have some delicious food at the restaurants nearby. Everything fits into your budget here. Some of the best shops to visit in Gandhi Bazaar are Mayuri’s Novelties, National Novelties, Greeting Gardens and Jai Shree Novelty, among others. Many textile retailers can also be found in Gandhi Bazaar. Some of the popular fabric stores are Vittal Dresses, Rajaram’s, Mysore Saree Emporium, Indu Fashion, and several other smaller establishments.";
                break;

            case "Jaynagar 4th Block":
                info = "Jayanagar shopping complex is located in Jayanagar 4th Block and is one of the busiest shopping places in Bangalore. This shopping complex is quite lik a maze; vast and confusing with several access points. Spices, sweets, herbs, flowers, handmade products, artwork, pottery, sculptures, home decor – the place is overflowing with options! Things ranging from daily routine items to luxurious items can be purchased from here. Whether it’s about house décor or party décor, all the props will be available here. Plus, apparel, footwear and accessories!";
                break;

            case "Malleshwar Market":
                info = "This bustling market in Malleshwaram retains the old-world charm of Bangalore. From the sweet fragrance of flower garlands to the freshness of herbs and veggies, from trinkets and toys to mouth-watering street food, you will find the market to be a hub of activity and trade. There is a vast flower market here, which you must visit for sure. Frequented by locals who prefer the market to grocery stores, you will find everything from farm produce to clothes in one place.\n";
                break;

            case "Mantri Square":
                info = "Garuda Mall is a modern multi-level shopping mall, located in Ashok Nagar, Bengaluru. Many popular brands have their retail outlets in this mall, such as Fab India, Levi’s, Marks and Spencer, Adidas, Sony, Provogue, and a lot more.";
                break;

            case "UB City":
                info = "From Louis Vuitton and Burberry, to Canali and Rolex, over 40 of the biggest names in retail are scattered across three levels, interspersed with some superb dining, drinking and entertainment options. This is a one-stop destination for Bangalore’s big spenders.";
                break;

            case "Garud Mall":
                info = "Garuda Mall is a modern multi-level shopping mall, located in Ashok Nagar, Bengaluru. Many popular brands have their retail outlets in this mall, such as Fab India, Levi’s, Marks and Spencer, Adidas, Sony, Provogue, and a lot more.";
                break;

            //Code for setting hotels info

            case "Golden Residency":
                info = "Price: 1300 - 2000\n" +
                        "Parking and breakfast are included.\n" +
                        "In the Gandhi Nagar district, and a 15-minute walk from Bangalore City railway station, this relaxed hotel is 3.5 km from Bengaluru Palace and 3.9 km from the Lalbagh botanical garden. \n" +
                        "Modest rooms with wooden furnishings offer free Wi-Fi and satellite TV, in addition to desks, fans, and tea and coffeemaking facilities. Upgraded rooms and suites have air-conditioning; some add sofas. Room service is available.";
                break;

            case "HM Suites":
                info = "Price: 2000 - 4000/-\n" +
                        "Set 3.2 km from Lal Bagh botanical garden, this contemporary hotel is 4.1 km from Bangalore City Junction rail station and 4.5 km from the castle-like Bangaluru Palace. \n" +
                        "The warmly decorated rooms and suites feature wood flooring and wall panelling, along with free Wi-Fi, flat-screen TVs and safes. They also come with minifridges, fruit platters and tea and coffeemaking facilities. Upgraded rooms add sitting areas and beverages.\n" +
                        "Breakfast and parking are complimentary. Other amenities include a relaxed restaurant, a rooftop terrace cafe and a lobby lounge with a library. There’s also a fitness room, a business centre and event space.";
                break;

            case "ITC Windsor":
                info = "Price:10000 - 20000/-\n" +
                        "The ITC Windsor, Bengaluru merges an old world ambiance with international service to create a hotel experience that goes beyond expectation. The hotel has long acquired a reputation of playing host to the aristocracy of the world.\n" +
                        "As one is driven over the bridge to the ITC Windsor, and through the grand entrance, one can't but help feeling a transition within. The modern world with its many realities slowly fades out of existence. In its place emerges a gracious old world, beautiful, caring and charming. Imposing Regency Architecture, Victorian Decor, Spacious Grounds and Service of an unobtrusive, even colonial nature.\n";
                break;

            case "Lalit Ashok":
                info = "Price: 6000 - 11000/-\n" +
                        "Nestled in an oasis of 10 acres of sprawling landscape and manicured lawns, The LaLiT Ashok is one of the finest five star hotel amongst all Bangalore luxury hotels.The luxury hotel wears a contemporary and elegant look featuring the latest in technology along with trendy guest amenities and services. A sweeping drive-way lined with tall trees leads you to the porch of this recently renovated hotel. Besides its exclusive location, the hotel is also well known for its creative dining options and the city's largest banquet facilities.\n" +
                        "This Bangalore five star hotel offers 184 fully furnished extra large guest rooms and suites spread over 8 floors, all lavishly decorated and extravagantly pampering and newly renovated, boasting of modern guest amenities and facilities. However, after a hectic day at work, if it is relaxing and unwinding that the guests look forward to a relaxed evening this business hotels also offers Rejuve - The spa. This spa hotel in Bangalore is the best place to reinvigorate senses and pamper yourself. The LaLiT Ashok Bangalore also has its own pool and tennis court for those who want to stress themselves out a little. And if the stage is set for serious business, we also have the right set-up with the adjacent golf course.";
                break;

            case "LeeLa Palace":
                info = "Price: 14k - 35k\n" +
                        "Ensconced in 9 acres of tranquility that includes an azure lagoon, The Leela Palace Bangalore mirrors the lushness of the Garden City. Harking back to the royal heritage of the Vijaynagar Dynasty, this luxury hotel in Bangalore earns it name by showcasing gold leaf domes, ornate ceiling and grand arches, making it one of the most admired Bangalore hotels.\n" +
                        "Every room and suite at The Leela Palace Bangalore mirrors the royal resplendence befitting a business hotel created for the emperors of the IT world.\n" +
                        "Choose from a wide array of rooms and suites, each one of which will make a visit to India’s IT capital that much more memorable. Bringing Bangalore luxury hotels to new heights, The Leela Palace Bangalore, provides a truly exceptional experience. The Leela Palace Bangalore effortlessly marries the traditional past of Bangalore with its technological present. Liberally sprinkled with both business essentials and creature comforts, it is conveniently close to both Bangalore's business districts as well as its golfing greens.";
                break;

            case "Mint Propus":
                info = "Price: 1300 - 3500/-\n" +
                        "Complimentary breakfast is served in a 24-hour rooftop restaurant. There's also a gym.\n" +
                        "Set in a polished building on a bustling commercial thoroughfare, this modern hotel is 6 km from Bangalore City railway station and 3 km from Lalbagh Botanical Garden. \n" +
                        "Warmly furnished rooms have flat-screen TVs, safes and minifridges, as well as tea and coffeemaking facilities. Upgraded rooms and suites add sitting areas. Room service is available.";
                break;

            case "The Oberoi":
                info = "Price: 11000 - 72000/-\n" +
                        "Located on MG Road, in the heart of the business and shopping districts of Bangalore, the luxury hotel has an abundance of greenery that is characteristic of the \"Garden City.\" And is also the globally renowned centre of India’s software industry. At The Oberoi, Bangalore, all the tastefully appointed rooms overlook landscaped gardens and guests can enjoy cuisine from around the world. The hotel offers impeccable service, understated luxury, fine cuisine and most modern facilities for discerning business travelers.";
                break;

            case "Signature Inn":
                info = "Price: 700 - 1700/-\n" +
                        "Set in a luminous concrete-and-glass building, this simple budget hotel in the Majestic district lies 9 minutes' walk from Kempegowda Bus Station, 2 km from the 18th-century Bangalore Fort and 5 km from Bangalore Palace.\n" +
                        "Basic rooms offer desks, flat-screen TVs with satellite channels, and free Wi-Fi. Some rooms also have wicker sitting areas and/or air-conditioning. Room service is available.\n" +
                        "Amenities include a straightforward restaurant with global cuisine, as well as a warm, plush lobby lounge. There's also a doctor on call.";
                break;

            case "Treebo Silver Star":
                info = "Price: 1500 - 4000/-\n" +
                        "A kilometre from Bangalore City train station, this polished hotel set on a lively street is 4 km from both Lal Bagh botanical garden and the 19th-century Cubbon Park. \n" +
                        "Streamlined rooms offer free Wi-Fi, and tea and coffeemaking facilities; room service is available. Some rooms add free-standing tubs.\n" +
                        "Breakfast is complimentary. There's also a modern restaurant.";
                break;

            case "Zuri White Field":
                info = "Price:7500 - 13000/-\n" +
                        "The trendy 5 star The Zuri Whitefield gives you a feel of elegance and cool urbanity for all kinds of business meets and pleasure pursuits. This hotel features an outdoor swimming pool, health club with fitness equipment, meeting rooms, and on-site dining option.\n" +
                        "The Zuri Whitefield, Bangalore opened its doors to guests in February 09. The Zuri Whitefield promises to be a 5-star business hotel with 162 rooms (2 Presidential Suites and 4 Executive Suites) and 5 F&B outlets, The Zuri Whitefield caters to every need of its guests, be it the discerning business traveler or the leisure seeker. Extremely strong on F&B options, this chic and young hotel has an Italian fine dining restaurant, a Pan-Asian restaurant, an all day dining multi-cuisine restaurant, an executive bar & grill and a hip & happening lounge bar.";
                break;

            case "ITC Gardenia":
                info = "Price: 13k - 27k\n" +
                        "It is the first green luxury hotel in the city that believes in delivering the best in 'Responsible Luxury' and giving back more to the environment. The ethos of ITC Royal Gardenia is \"Forward to Green, Back to Nature\". \"Forward to green\" highlights the environment friendly practices such as Energy Efficiency, Zero Solid Waste management, Green Banqueting and more. \"Back to nature\" brings about those aspects of the hotel that amalgamates with nature.\n" +
                        "The hotel offers 292 large and well equipped rooms, including 13 suites and the largest Presidential Suite in India. The interiors of the rooms manifests different layers of life forms offered through nature and each floor follows this theme through colours, motifs and textures. Setting the mood for a greener era, ITC Royal Gardenia offers subtle experiences for discerning visitors, an unmatched sojourn of responsible luxury, complementing a city known for it's lush gardens and verdant foliage.";
                break;
            //Code for setting Transport

            case "Banglore Airport":
                info = "Kempegowda International Airport is an international airport serving Bangalore, the capital of the Indian state of Karnataka. Spread over 4,000 acres, it is located about 40 kilometres north of the city near the village of Devanahalli. Wikipedia\n" +
                        "Address: KIAL Rd, Devanahalli, Bengaluru, Karnataka 560300\n" +
                        "Code: BLR\n" +
                        "Phone: 1800 425 4425\n" +
                        "Opened: 24 May 2008\n" +
                        "Hub for: AirAsia India, Alliance Air, IndiGo, Jet Airways\n" +
                        "Did you know: Kempegowda International Airport is India's third-busiest airport by passenger traffic.";
                break;

            case "Banglore Railway Station":
                info = "Bangalore City railway station (Station code: SBC), officially known as Krantivira Sangolli Rayanna railway station, is the main railway station serving the city of Bengaluru, Karnataka, India.";
                break;

            case "Banglore Metro":
                info = "Namma Metro, also known as Bengaluru Metro is a metro system serving the city of Bengaluru, India. It is currently the second longest operational metro network in India after the Delhi Metro. Wikipedia\n" +
                        "Began operation: 20 October 2011\n" +
                        "Number of stations: 41\n" +
                        "Electrification: 750 V DC third rail\n" +
                        "Train length: 3 coaches (extendable to 6 coaches)\n" +
                        "Number of lines: 2\n" +
                        "Owner: Bangalore Metro Rail Corporation Ltd. (BMRCL)\n" +
                        "Daily ridership: 350,000 (September 2017)";
                break;

            case "Yeshvantpur":
                info = "This station is located on the Bangalore-Pune & Bangalore-Hyderabad main lines. Being a main location, all trains bound towards Hubli & Hyderabad either originate from here or the ones from Bangalore City have a stop at this station. Direct trains to major Indian cities such as Delhi, Mumbai, Pune, Indore, Bhopal, Gwalior, Jabalpur, Jaipur, Gorakhpur, Lucknow, Chandigarh, Howrah, Chennai etc. also originate from Yeshwantpur.\n";
                break;


            //Kolkata Places
            case "Belur Math":
                info ="Location: Belur, Howrah, West Bengal\nTimings: 6 am to 11:30 am, and 4 pm to 7 pm\nEntry Fee: Free EntryBelur Math is an important pilgrimage site, and the headquarters of Ramakrishna Math and Mission. It is one of the best places to visit in Kolkata for people who wish to seek inner peace. The tranquil surroundings, and architectural creativity make this place a hotspot of Kolkata tourism.\n";
                break;


            case "Botanical Gardens":
                info ="Timings: 10 am to 5 pm\nEntry Fee: INR 10 for Indians, and INR 100 for foreigners\nLocated along the western banks of River Ganga, Botanical Garden is a 273 acre garden known for its extensive floral diversity. Housing more than 12,000 different species of plants, it is one of the most beautiful places to see in Kolkata for travelers who wish to witness the mesmerising beauty of nature.\nLocation: Shibpur, Howrah, West Bengal";
                break;


            case "Fort William":
                info ="Timings: 10 am to 5:30 pm\nEntry Fee: Free Entry\nSituated on the eastern banks of Hooghly river, Fort Williams is a huge building from the colonial era that has served multiple purposes till date. It is one of the few Kolkata points of interest which is a must visit place during your Kolkata sightseeing tour. Known as the black hole of Calcutta, this place was once a temporary jail where prisoners were hauled, but now it serves as the headquarters of the Eastern Command.\n\nLocation: Fort William, Hastings, Kolkata\n";
                break;


            case "Howrah Bridge":
                info ="A Kolkata sightseeing tour is truly incomplete without visiting the Harbour Bridge of India, the Howrah Bridge. Titled as the oldest but the busiest place in Kolkata, the Howrah Bridge was built over the Hooghly river to ensure connectivity between the two major cities of Kolkata and Howrah.";
                break;


            case "Indian Museum":
                info ="Timings: 10 am to 5 pm\nEntry Fee: INR 20 for Indians, and INR 500 for foreignersWitness the charm of the glorious country of India the oldest, and the largest museum in India, the Indian Museum. It is one of the best places to visit in Kolkata for youngsters where they can gain insights to the rich traditional, and cultural heritage of their country.";
                break;


            case "St. Paul's":
                info ="Timings: 9 am to 12 pm, and 3 pm to 6 pm\nEntry Fee: Free Entry\nKnown for its Gothic style of architecture, St. Pauls Cathedral is the largest cathedral in Kolkata. Resembling closely to Norwich Cathedral,St Pauls Cathedral is also one of the best places to visit in Kolkata for people seeking a religious tour.";
                break;


            case "Victoria Meomrial":
                info ="Timing :10am to 6pm\nThe Victoria Memorial is a large marble building in Kolkata, West Bengal, India, which was built between 1906 and 1921.\n It is dedicated to the memory of Queen Victoria (1819-1901) and is now a museum and tourist destination under the auspices of the Ministry of Culture. The memorial lies on the maidan (grounds) by the bank of the Hooghly River, near Jawaharlal Nehru road.";
                break;

            case "Alipore Zoo":
                info = "Timing : 10am to 4pm\nThe Zoological Garden, Alipore (also informally called the Alipore Zoo or Calcutta Zoo) is India's oldest formally stated zoological park (as opposed to royal and British menageries) and a big tourist attraction in Kolkata, West Bengal. It has been open as a zoo since 1876, and covers 18.81 ha (46.5 acres). It is probably best known as the home of the now expired Aldabra giant tortoise Adwaita, who was reputed to have been over 250 years old when he died in 2006.";
                break;

            case "Birla Planetarium ":
                info ="Timing :12.30pm to 6pm\nThe Birla Planetarium in Kolkata, West Bengal, India, is a single-storeyed circular structure designed in the typical Indian style, whose architecture is loosely styled on the Buddhist Stupa at Sanchi.\n Situated at Chowringhee Road adjacent to the Victoria Memorial, St. Paul's Cathedral, and the Maidan in South Kolkata, it is the largest planetarium in Asia and the second largest planetarium in the world. There are two other Birla Planetariums in India: B.M. Birla Planetarium in Chennai and the Birla Planetarium in Hyderabad.";
                break;

            case "Esplanade":
                info ="Esplanade is a neighbourhood of central Kolkata, earlier known as Calcutta, in Kolkata district in the Indian state of West Bengal.\nThis is not a conventional esplanade in the sense that the place is not exactly situated alongside a waterbody. However, the river Ganga, also known as the Ganges or the Hooghly, flows nearby.";
                break;


            //Food in kolkata

            case "Ganguram Sweets":
                info ="Price: 350/-\nThis venerable sweet meat shop (mithai) was set up in 1885 and serves both traditional Bengali sweets and innovative variations based on old favorites. With a huge variety of sandesh flavors including mango and strawberry, milk chamcham, rasmadhuri and kesharia rasmalai, Ganguram Sweets has built up a loyal following among Kolkatans. Locals come here especially for their perfectly balanced mishti doi, which is often cited as the best in Kolkata.";
                break;


            case "Oh! Calcutta":
                info = "What's Good: You can't go wrong with the seafood. The Bhapa Hilsa (steamed Hilsa fish) and Smoked Bhetki (smoked Bhekti fish) are legendary.\nCost: About 2,000 rupees for two people.\nIf you've got money to splurge on eating out, you won't be disappointed with Oh! Calcutta. This award winning, fine dining restaurant can now be found in major cities across India. It aims to recreate dishes from traditional old style Bengali recipes, selected through painstaking research. The environment is elegant, and there's a private dining area as well.";
                break;


            case "6 Ballygunge Place":
                info = "What's Good: Pabda Macher Jhal (spicy fish curry, prepared with mustard paste and poppy seeds.)\nCost: A meal for two at this mid-range restaurant will cost around 1,000-1,200 rupees. For a real feast, go for the sumptuous lunch and dinner buffets.\n6 Ballygunge Place was founded in 2003 to fill the gap in the market for standalone Bengali specialty restaurants in Kolkata. The original one is located in a white, century-old and character-filled converted bungalow in upmarket Ballygunge. Its dishes were developed from scouring renowned cookbooks, including those containing traditional recipes from Rabindranath Tagore's family.";
                break;

            case "Bohemian":
                info ="What's Good: Royal Bengal roast mutton.\nCost: About 1,800 rupees for two people.\nChef Joy Banerjees restaurant is indeed bohemian both in looks and what it feeds you  free spirited in nature. Banerjee uses traditional Bengali ingredients to craft unconventional dishes, portraying a contemporary take on Bengali food. In each dish, the local ingredients take centrestage";
                break;

            case "Jiyo Piyo":
                info = "Meal for two: Rs 600\nKolkata boy gone national (and hopefully global), Chef Vikramjit Roy of Tian says it is one of those places where nothing is authentic but everything is absolutely delish. So if you are not looking for something authentic and are alright with turning a blind eye to the ambience, this could be your fix for comfort food  dosa, chole bhature, shakes, et al!";
                break;

            case "Kew Pie's Kitchen":
                info ="What's Good: The traditional Bengali thali (platter) served on a banana leaf.\nCost: Expect to pay 800-900 rupees for two people.\nKewpies Kitchen started as an intimate, unassuming, family run restaurant over a decade ago and has become a famed place to dine in Kolkata. Located in the owner's home, it seats just 50 people. Sadly, the standard has reportedly dropped in recent years but if you want reasonably priced Bengali food in a unique environment, do give it a try.";
                break;

            case "Ganguram":
                info ="What's Good: Kochu Pata Diye Ilish Bhapa, Bhetki Paturi, and Chingri Machher Malai Curry.\nCost: Expect to pay around 400 rupees for two.\nAlso in the New Market area and serving primarily Dhakai Bangladeshi cuisine, The Bhoj Company opened in 2012. It's a small restaurant that's developed a loyal local following. The food is affordable, super authentic and servings are generous. Service could be better though.";
                break;

            case "The Bhoj Company":
                info ="Price: 200 rupees for two\nIf youre in Kolkata, your Kolkata Street Food experience will be incomplete if you dont have Kochuri! The Kochuri or Radhabollobi, is one of its kind at Gangurams. To finish, simply wash it down with some amazing Mishti Doi, or treat yourself to their sweet nothings!";
                break;


            //Code for setting shops in kolkata
            case "College Street":
                info ="Opening Hours: 9 a.m. to 9 p.m. Closed on Sunday.\nBooks, books, and more books is what you'll find at College Street.  The book market there is the largest second-hand book market in the world, and largest book market in India. It's renowned for stocking rare books at cheap prices. Do haggle! In addition, some of Kolkata's oldest bookstores and publishing houses are in the College Street area. For an added touch of nostalgia, drop into the Indian Coffee House opposite Presidency Collage. It's one of India's historic restaurants, dating back to 1942.";
                break;

            case "Bura Bazar":
                info = "Tours: Visit College Street and Bara Bazar on this Morning Kolkata Market Walking Tour.\nOpening Hours:  10.30 a.m. to 7.30 p.m. Closed on Sunday.\nIf you want to experience a chaotic Indian-style market area that's often likened to Delhi's famous Chandni Chowk, head to Bara Bazaar (also known as Burrabazar). This wholesale market, which started out as a yarn and textile market, offers everything at cheap prices. It's not easy to navigate though. Similar to New Market, it's divided into separate sections specializing in various items such as spices, electronic goods, textiles, home decor, toys, cosmetics, and artificial jewelry. The market is particularly colorful during festivals such as Diwali, when special stalls selling diyas and lanterns are set up.";
                break;

            case "Phool Bazaar":
                info = "Timings : 7 am to 10 pm\nThe flower market that sits on the east side of the erstwhile and iconic Howrah Bridge is a celebration of colours and aromas. Trucks from all over the country drop of rare and exotic flowers here that are then sold by local vendors. This flower market offers one with a variety of flower species that range from tuberoses to orchids, lilies to gladiolas and much more.";
                break;

            case "Gariahat":
                info = "Timings: 11 AM to 8:00 PM Monday - Saturday ; Sunday Closed\nA major shopping attraction in South Kolkata, Gariahat Market is spread along a long stretch of road with shops on either side of it selling a huge variety of clothes, jewellery and electronic items. There are a lot of makeshift tents in addition to the big shops, selling items at a lower cost. The sight is breathtaking with all the interesting items hanging out of the stores, or the glittery lights casting a dancing shadow on the long road which they flank. There are also a bunch of restaurants and food stalls so one can sneak in and grab a quick bite between shopping sprees.";
                break;

            case "Hatibagan":
                info ="Timings: Sunrise to Sunset on Sundays\nOnce famous for the various birds and animals that used to be sold, before a fire burned down the majority, the market is still famous for the Star Theatre, a cinema complex that screens movies at really affordable prices. The markets around here offer some of the best silks and cotton in sarees that are there.";
                break;

            case "New Market":
                info ="Timings: Monday-Friday 10 AM to 8 PM\nSaturday 10 AM - 2:30 PM; Sunday Closed \nOne of the oldest shopping areas, dating back to the colonial era, New Market is a shopper's paradise. Amidst the rush of excited shoppers, one can find a range of products, extending from shoes, sarees, exotic flowers and rare cheese. Name it, and you have it all. True to the proverb, all the shops of similar items are clustered in a block, thus making it more orderly. One can choose from over 2000 stalls that are clumped in the region. Located on the Lindsay Street, New Market offers everything that is there to ask.";
                break;

            case "South City Mall":
                info = "Timings: 10 AM to 10 PM; All days\nLocated on Prince Anwar Shah Road in the southern end of the city, the South City Mall is a state of the art mall with a shopping area of about 1,000,000 square feet. Consumers can select from a range of exclusive international and national retail brand outlets that load up the area. There is also a multiplex located in the mall where movie buffs can enjoy their day out.";
                break;


            //Code for setting hotels in kolkata
            case "De Sovrani":
                info ="Price: 2,800/-\nThis upscale hotel is a 7-minute walk from Central Park metro station, 14 minutes on foot from the butterfly garden at Salt Lake Central Park and 7 km from the neoclassical 19th-century Marble Palace.\nWarmly decorated rooms have free Wi-Fi, flat-screen TVs, and tea and coffeemakers. Suites provide separate living areas and a courtesy area shuttle. Some offer city views, minibars and 24-hour butler service. Room service is available 24/7.\nA complimentary breakfast buffet is served in a restaurant that has an open kitchen. Other amenities consist of a hip lounge, a gym, and a rooftop area offering an outdoor pool, a hot tub and city views.";
                break;

            case "Novotel ":
                info = "Price: 7k - 13k\nIn Kolkatas Newtown suburb, this polished hotel is across the street from Axis Mall, a 2-minute walk from a metro station and a 15-minute walk from Rabindra Tirtha cultural centre. \nUpmarket rooms, suites and apartments come with Wi-Fi, flat-screen TVs, and tea and coffeemaking facilities; apartments add kitchenettes. Some quarters also offer city views. Room service is available 24/7, and kids 15 and under stay free.\nThere are 3 refined restaurants and 2 bars. Other amenities include an outdoor pool, a spa and a 24-hour fitness room.";
                break;

            case "Park Prime":
                info ="Price: 4,300/- +\nAn 11-minute walk from Rabindra Sadan metro station, this contemporary hotel is also 2.4 km from the Indian Museum and 3 km from Alipore Zoological Gardens. \nContemporary rooms with wood floors and colourful wall murals feature en suite bathrooms, flat-screen TVs and free Wi-Fi, plus minibars and tea and coffeemaking facilities. Suites offer living rooms. Room service is available.";
                break;

            case "Pipal Tree":
                info ="Price: 3,500 - 5,000 /-\nAn 11-minute walk from the City Centre mall, this relaxed hotel is 4 km from Netaji Subhash Chandra Bose International Airport and 11 km from the Aquatica water park. \nCasual rooms feature flat-screen TVs, Wi-Fi access and electric foot massagers, as well as minibars, and tea and coffeemakers. Suites add living areas and 4-poster beds. Room service is available 24/7.\nA breakfast buffet is free. There's a relaxed, all-day cafe/bakery, a restaurant serving international cuisine, and a modern lounge bar. Other amenities include a gym, a library and a game room.";
                break;

            case "The Lalit Great Eastern":
                info ="Price: 6k - 14k\nBuilt in 1841, this high-end hotel with a posh, modern interior is set a 6-minute walk from a metro stop and 3.1 km from the white marble Victoria Memorial. \nContemporary, elegant rooms feature free Wi-Fi, flat-screen TVs, tea and coffeemaking facilities, and terraces with pool or garden views. Upgraded rooms add increased floor space and sitting areas; some have details such as bay windows and marble floors. Suites include living rooms. Room service is available.";
                break;


            //Code for setting transport
            case "Kolkata Airport":
                info ="Netaji Subhas Chandra Bose International Airport is an international airport located in Kolkata, West Bengal, India, serving the Kolkata metropolitan area. It is located approximately 17 km from the city center. \nElevation: 7 m\nPhone: 033 2511 8036\nDid you know: Netaji Subhas Chandra Bose International Airport is India's fifth-busiest airport by passenger traffic.";
                break;


            case "Howrah Station":
                info ="Kolkata railway station formerly known as Chitpur Station, is the newest of the four intercity railway stations serving Howrah and Kolkata, India; the others are Sealdah Station, in Kolkata, Shalimar Station in Howrah and Howrah Station in Howrah, Santragachi Junction railway station in Howrah. Kolkata station is situated in the Chitpur locality of north central Kolkata.\nOperated b Eastern Railway zone\nPlatforms\t     5";
                break;

            case "Kolkata Metro":
                info ="The Kolkata Metro is a rapid transit system serving the Kolkata metropolitan area in the Indian state of West Bengal. \nBegan operation: 24 October 1984\nAverage speed: 55-60 KMPH\nNumber of vehicles: 27\nTrain length: 8 Coaches (Line 1, Line 3, Line 4, Line 5, Line 6) 6 Coaches (Line 2)";
                break;


            //Hyderabad

            case"Charminar":
                info = "Famous for: History, Architecture, Heritage Site.\\nTickets: 5 INR for Indians and 100 INR for Foreigners.\\nOpening Timings: Open all days from 9:30 AM to 5:30 PM.\\nDuration: 1 hour\\nThe first tourist attraction that comes to mind when you think of Hyderabad is Charminar, which is located in the heart of the city. Mohammed Quli Qutub Shah constructed this monument in the year 1591. The architecture of Charminar reflects Cazia style.There is a mosque and 45 prayer spaces inside Charminar. Do not get discouraged by the crowd there if you want to have a feel of the old city and its culture. The shopping area around the monument offers products for cheap rates.\";";
                break;


            case"Ramoji Film City":
                info ="Famous for: Film industry, Lawns, Tourism\nTickets: Approx 1100 INR for Adults, 1000 INR for children (between 3 & 12 years).\nOpening Timings: Open all days except Sunday from 9Am to 6PM.\nDuration: 1 hour.\nRamoji Film City has the Guinness Book Record of being the worlds largest film studio. The lavish gardens and open spaces have been featured in many Indian films, the most recent example being Bahubali, which was shot extensively here. A tour of this film city is an experience on its own and therefore, Ramoji Film City is one of Hyderabads main attraction.";
                break;



            case"Hussain Sagar":
                info ="Famous for: Artificial Lake, Heart Shape, Boating, Parks.\nTickets: No entry fee. Charges for boating.\nOpening Timings: Open all days from 9 AM to 9:30 PM.\nDuration: 1-2 hours.\nYet another popular tourist spot in Hyderabad is Asias largest artificial lake named Hussain Sagar Lake. It connects Hyderabad and Secunderabad, called the twin cities. It was excavated during the period of Ibrahim Quli Qutub Shah in 1562 AD. The statue of Buddha in the middle of the lake is 16 meters tall. Boating facilities are available here. You could take part in watersports namely boating, skiing, cruising and para sailing. Apart from Hussain Sagar Lake, even the surroundings offer entertainment as you can find NTR Gardens, Sanjeevaiah Park, Lumbini Park and so on.\n";
                break;


            case"Salar Jung Museum":
                info ="Famous for: Museum, History,\nTickets: 20 INR for Indians, 500 INR for foreigners and free for students/children.\nOpening Timings: Open all days except Friday from 10AM to 5PM.\nDuration: 1.5-2 hours.\nSalarjung Museum was founded in the year 1951. The museum has stunning collections and most of them were from Mir Yousuf Ali Khan, famously called as Salar Jung III. The collections are exhaustive and could be classified as Indian Art, European Art, Art of the Middle East, Far Eastern Art and a section for children. ";
                break;



            case"Birla Mandir":
                info ="Famous for: Temples, Birla, Architecture, Marble.\nTickets: No entry fee.\nOpening Timings: Open all days from 7AM to 12PM & 3PM to 9PM.\nDuration: 30 mins to 1 hour.\nBirla Mandir is situated at the southern end of Hussain Sagar at the top of the hill. This beautiful temple built using white marble offers a stunning view of the lake and the city. The construction resembles the architectures of South Indian and Oriya temples. The amazing construction makes you want to revisit this place. A tour to Hyderabad is complete only if you visit Birla Mandir.";
                break;



            case"Nehru Zoological Park":
                info ="Famous for: Wildlife, Zoo, Rides.\nTickets: Entry fee are 30 INR for adults and 15 INR for children below 12 yrs. Extra charge of 20 INR for Still Camera (Amatuer).\nOpening Timings: Open all days except Monday from 8AM5:30PM.\nDuration: 1.5 hours.\nThe 300-acre park with over 1500 wildlife was established in the year 1959 and inaugurated in 1963. You will find lion, royal Bengal tiger, white tiger, rhinoceros, orangutan and a lot more. Reptiles such as Indian cobra, star tortoises, and giant tortoises are also here. Elephant rides are available to enjoy the lush greenery here. Some other main attractions in this area include Lion Safari Park, Childrens Train and Natural History Museum.";
                break;


            case"Golconda Fort":
                info ="Famous for: Architecture, Heritage, Fort, History.\nTickets: 5 INR for Indians and 100 INR for Foreigners.\nOpening Timings: Open all days from 9 AM to 5:30 PM.\nDuration: 1 hour.\nThe Golconda fort dates back to 13th century. The acoustics effects are excellent in the fort. If you clap your hands at Fateh Darwaza, the sound can be clearly heard at Bala Hissar, which is located a kilometer away. The royal palaces and whispering walls are some of its main attractions.";
                break;



            case"Lumbini Park":
                info = "Timings: 9 AM TO 9 PM (Closed on Monday)\nEntry Fee: 10 per Person, 50 per person for Speed Boating (Adults / Children), 40 per person for boating (Adults / Children), 50 per person for LASER Show\nDeveloped in 1994 by the Hyderabad Urban Development Authority, Lumbini Park has been named after birthplace of Lord Buddha. Located quite close to the Hussain Sagar Lake, it is one of the popular tourist spots of Hyderabad. The giant clock designed with varied kinds of captivating flowering plants, which you see at the entrance is one of the prime attractions of the park. The musical fountain and the laser show here mustnt be missed. Another key feature of Lumbini Park is its rich flora.";
                break;



            case"Snow World":
                info ="Timings:11 AM TO 9 PM\nEntry Fee: 450 per Adult (4ft 6inch & above), 250 per Child (2ft to 4ft 6inch), 300 per person College (above 10th class), 250 per person School (upto 10th class)\nWith the fame of being the first ever snow themed park in India, Snow World is a place which you must visit when in Hyderabad. Developed by the Ocean Park Multi Tech Limited (OPML), it is spread over an impressive area of 17,000 square feet. Located at the Lower Tank Bund Road, this theme-park is easily accessible. Apart from playing with the snow, which is made up of mineral water, you can also try sports such as ice skating, ice boarding, snow slides with bumping-car and toboggan rides. The Cryo Zone is one of the most popular sections.";
                break;



            case"NTR Garden":
                info ="Timings: 12:30 PM TO 9 PM\nEntry Fee: 15 per Adult, 10 per Child\nSpread over an area of 36 acres, the captivating NTR Gardens was developed in the memory of late Shri N T Rama Rao. Not just lush green landscape, this park also has a wide range of recreational choices for visitors such as boating, machan tree, etc. There is ample of place especially for children. You will have ample of eating options as well, including cafes, restaurant and eat out joints. The mini train offering a short ride through the park is major attractions.";
                break;



            case"Paradise Biryani":
                info ="Price: 800 for two\nWith six outlets throughout the city, Paradise is a food empire not limited to Hyderabad specializing in Hyderabadi, Indian and Chinese delicacies. The branches range from large spaces in pre-established compounds to enormous venues comprising several different eateries under the same roof  quite the progress for a little cafe that first opened in 1953 to serve tea and a few snacks. The secret to Paradises wild success is the ridiculously good biryanis, the best in town by general consensus. One of the most frequented Paradise spots is the food court located in the district of Secunderabad. Here, a multi-level, modern palace hosts a cafe, a bakery, an al fresco restaurant on the roof, another one with seating on the street level patio, and the acclaimed Persis Gold restaurant.";
                break;



            case"Chutneys":
                info ="Price: 900 for two\nIn India and the entire South Asia, chutneys are available in an incredible number of variants, consisting of a dip obtained from a combination of spices, vegetables and fruits. These traditional delights give the name to Hyderabads Chutneys, a famed, local set of restaurants serving scrumptious, traditional South Indian food, including a signature selection of six different type of chutneys. Here you can also try other yummy treats courtesy of South India like dosas, idlis and pesarattus  three different type of wraps, all equally delicious. Alternatively, join Chutneys for breakfast and try upma, a favorite staple similar to porridge.";
                break;



            case"Jash e Audh":
                info ="Cost For Two: 1000 (approx)\nThis is your perfect destination for delicious mouth watering Awadhi food in Hyderabad. The richness of this place lies not only in the variety of cuisine but also in the ingredients used like mutton, paneer, and rich spices, which include cardamom and saffron.\nOrder: Jash E Murgh Khaas, Guchchi Zafrani, Paneer Rezala, Gusse Waley Nawaab.\nWhere: 1st Floor, Teja's Fortune Towers, Beside Wells Fargo, Raidurgam, Gachibowli. ";
                break;



            case"Ohm":
                info ="Price: 2500 for two\nOhm is all set to raise the bar for fine-dining Asian cuisine in the city, thanks to its innovative fusing of global food styles and flavours, besides an uber stylish presentation.";
                break;



            case"Dakshin  ":
                info ="Price : 1800 for two\nThere is something about Dakshin, which invariably contributes to a fine-dining experience, even though the ambience has seen no makeover, in the last couple of years.";
                break;



            case"Minerva Coffee Shop":
                info ="Price: 800 for two\nMinerva Coffee Shop has been part of Hyderabads dining scene for many years now. The restaurant has a solid fan base of foodies that thoroughly enjoy the scrumptious, authentic dishes of Indian cuisine expertly prepared by the kitchen. In fact, Minerva provides all the highlights of both North and South Indian cooking, which can be quite different from each other. Open all day-round from breakfast time to dinner, this casual haunt has one of its major draws in South Indias tiffins, a collective name used to describe an array of inviting snack pastries like the dosas or the idlis.";
                break;



            case"Guffa":
                info ="\nPrice: 1,000 for two\nChoose Gufaa for an unconventional dining experience in Hyderabad. The themed restaurants rocky walls are designed to resemble the inside of a cave. Sculptures of elephant and tiger heads are hung on the walls, plant roots and branches creep up the rocks and a large mural mimics ancient mans rock drawings, as dim lighting plunges the restaurant into half darkness. Sit in one of the bamboo chairs with zebra-skin cushions and enjoy a meal of tasty Indian fare.";
                break;



            case"Olive Bistro":
                info ="Price: 2,000 for two\nStepping into irresistibly charming restaurant Olive Bistro, you are made to wonder whether youre still in Hyderabad or if you have been magically teleported to the Greek island of Santorini. Beautifully decorated, the bistros whitewashed walls are nicely complemented by faux vaults, tablecloths in floral patterns and pastel tints, and a stunning tile floor. The outdoor patio is simply magical, complemented by garden furniture and offering panoramic views of the freshwater Durgam Cheruvu lake ahead. A gem of a restaurant in a lucky location, come to Olive Bistro to experience exquisite Mediterranean fare.";
                break;




            case"Sahib Sindh Sultan":
                info ="Price: 1,400 for two\nThe first train to ever take to the rails in India took off from Bori Bunder in 1853, during the British Raj. Hyderabads restaurant Sahib Sindh Sultan celebrates that historical episode and era in a truly unique way. The venue is set up like a train station: on one side, plenty of tables are arranged on what would be the stations platform; on the other, extra seating is available in the wagons of a pretend train that carries the name of the restaurant spelled in gold lettering. Elegant decor, silverware, silk tapestries and exquisite Anglo-Indian dishes complete a mesmerizing, must-visit restaurant in Hyderabad.";
                break;



            case"Begum Bazar":
                info ="Timings: The shops open at 10am and close at 11pm. The bazaar is closed on Sundays.\nThe Begum of all bazaars is the Begum Bazaar Hyderabad. Shopping in Hyderabad, for all the tobacco takers, Begum Bazar is the place to be at. By far, this isnt the only product sold here.  This place is one of the largest commercial markets in Hyderabad and retailers from all across the country deal with products from here. You can very well imagine the awesome bargains that one will get here. This message goes out to all the shopaholics  get your shoes on, purse ready and head to Begum Bazar Hyderabad.";
                break;



            case"KOTI":
                info ="Timings: The market is open from 1oam till 6pm.\nIn existence for around 200 years, Koti Sultan Bazar is famous for the latest fashion when it comes to womens clothing. From silver junk jewellery to rare pieces, this market is a one-stop-shop for shopping in Hyderabad for all you ladies out there. From stylish Indian salwar kameez sets to churidars and dazzling footwear, this market has row after row of shops that display the finery that Hyderabad has to offer. Before you venture out to shop here, you should brace yourself for a long day. The variety on offer is mind boggling and the amazing deals you can get here will surely confuse you. Street shopping in Hyderabad at its best!";
                break;



            case"Nampally":
                info ="Timings: Open from 10am to 11pm everyday.\nIf you visit the city of Hyderabad, it would be a treat to visit Nampally. This destination for shopping in Hyderabad is known for the diversity merchandise found here. Clothes, footwear, bangles, bags and wallets, jewellery; you name it and this market stocks it. If you happen to be in the city anytime between the months of January and mid-February, the Numaish exhibition is the place to be at for shopping in Hyderabad. One will find every imaginable product at this famous exhibition. This carries on into the year and you will get what you are looking for at this marketplace.You are sure to get the best deals here and will also save up some money. Street shopping at its best!";
                break;



            case"Tobacco Bazar":
                info ="Timings: 10am to 10pm\nKnown as either Tobacco bazaar or General Bazar, or both, this place on M.G Road must make it to our list of 6 cheap places for shopping in Hyderabad. The market begins as a small lane but let that not dampen your spirit as there are over 300 shops to browse through. Standing tall for 60 years, this market has a reputation for selling the best fabrics. If variety is what you are looking for, then that is exactly what you get with the market dealing in chiffon, pochampally, brocade and much more. Women can go through thousands of options when it comes to purchasing kurtis, dupattas, salwar kameezes and blouses it is the hub of street shopping in Hyderabad.";
                break;



            case"Laad Bazar":
                info ="Timings: 11am t0 10.30pm. The real charm of this market comes out in the evening.\nThe famous Choodi Bazar that is situated to the west of the Charminar is a paradise of bangle shopping in Hyderabad. This happens to be one of the oldest markets in Hyderabad and is famous for the artificial jewellery sold here. Apart from this, silverware, antique items, silk sarees, khara dupattas (a traditional variety), fabrics, spices, and perfumes are sold here. The truth is there is much more that one can get their hands on at this market.";
                break;



            case"Forum Sujana Mall":
                info ="Time: 10am to 10pm\nForum Sujana Mall is a shopping mall located at Kukatpally. Zara made their Hyderabad debut at The Forum Sujana Mall. The mall houses a 9-screen multiplex from PVR Cinemas.";
                break;



            case"Hyderabad Central":
                info = "Time : 11am to 9.30pm\nHyderabad Central is a shopping mall in Hyderabad, India, located on the Punjagutta road. The mall includes Marks and Spencer, as well as a range of movies, music, books, coffee shops, a food court, supermarket and restaurants";
                break;



            case"Perfume Market":
                info ="Hyderabads perfume market is located between Laad Bazaar and Moti Chowk, near Charminar. A row of shops sell ittar or locally-produced perfumes packed in small glass vials. Unlike alcohol-based perfumes, these are made with a base of sandalwood oil, in fragrances like musk, jasmine and rose. You can also head to the family run-shop Hyderabad Perfumers in Patergatty near Charminar.";
                break;



            case"ITC Kakatiya":
                info ="Price: 10k - 18k.\nGentle echoes of Kakatiya art and sculpture commemorate the legendary spirit of the Kakatiya dynasty at the ITC Kakatiya, Hyderabad. Overlooking the picturesque Hussain Sagar Lake, the hotel is located in the new commercial heart of the Hyderabad.\nBuilt to mark a renaissance in standards of service and style, the 188 exquisitely-furnished guest rooms and suites present the finest in hospitality and personalised service. The discerning business traveller will appreciate the state-of-the art business and conference facilities as well as a selection of refined cuisine. Gourmet delights are available at the 24-hour coffee shop and speciality Indian restaurants serving the best cuisine from northwest frontier to the south of India. ";
                break;



            case"Trident ":
                info ="Price: 9k - 17k\nThe hotel blends the natural elements of height, light and space into its design. The 323 guest rooms and suites, starting at a spacious 440 square feet, are amongst the largest accommodations in Hyderabad. The rooms combine modern comfort with five star luxury and timeless good taste. The dcor features all the modern day amenities, like complimentary high speed Internet access for up to four devices, LCD televisions and well-appointed working desks, essential for the contemporary traveller.";
                break;



            case"Westin ":
                info ="Price: 9k - 20k\nThe hotel blends the natural elements of height, light and space into its design. The 323 guest rooms and suites, starting at a spacious 440 square feet, are amongst the largest accommodations in Hyderabad. The rooms combine modern comfort with five star luxury and timeless good taste. The dcor features all the modern day amenities, like complimentary high speed Internet access for up to four devices, LCD televisions and well-appointed working desks, essential for the contemporary traveller.";
                break;



            case"Taj Banjara":
                info ="Price: 5 - 8k\nOverlooking its own private lake, this modern hotel is 6 km from both the Jalavihar water park and the Birla Mandir temple, and 9 km from the Chowmahalla Palace. \nUpscale rooms feature free Wi-Fi, flat-screen TVs, tea and coffeemaking facilities, and minibars. Most have lake views. Suites add living areas and upgraded suites offer whirlpool tubs and refined decor. There's 24-hour room service.\nBreakfast and parking are free. Dining options include a casual buffet restaurant, an open-air BBQ option and a nautical-themed pub. Other amenities include an outdoor pool, a fitness centre, a gift shop, a jewellery store and a business centre.";
                break;



            case"Vivanta Taj":
                info ="Price: 6k - 13k\nA 13-minute walk from Begumpet train station, this sophisticated hotel in north Hyderabad is also 12 km from the 16th-century Charminar mosque.\nContemporary rooms include free Wi-Fi and smart TVs, as well as desks, minibars, and tea and coffeemaking facilities. Upgraded rooms offer club lounge access. Suites have separate living/dining areas; 1 also adds a kitchenette. Room service is available 24/7.\nBreakfast and parking are complimentary, and there are 2 hip restaurants serving Thai and European fare. Other amenities include a bar, a 24-hour gym and an outdoor pool with a poolside eatery, plus a day spa and 800 sq m of event space.";
                break;



            case"Sheraton":
                info ="Price: 7k - 14k\nThe polished rooms come with free Wi-Fi and flat-screens, plus iPod docks and laptop-sized safes. All include minibars, and tea and coffeemaking facilities; some offer sitting areas. Suites include separate living rooms. Club level quarters add access to a private lounge. Room service is offered.\nThere are 2 stylish restaurants, a cafe and a hip Asian-themed bar. Other amenities include a gym, an outdoor pool and an elegant spa. Meeting facilities are on-site.";
                break;



            case"The Park":
                info ="Price: 5k - 8k\nAcross the highway from Necklace Road train station, this upmarket design hotel with a sleek metal exterior is 3 km from bustling Lumbini Park and 5 km from Hussain Sagar, a heart-shaped lake.\nFeaturing city, lake or pool views, the airy rooms offer complimentary Wi-Fi and fresh fruit, as well as flat-screen TVs, desks, sitting areas, and tea and coffeemaking facilities. Suites, some of which are themed, grant private lounge access.\nDining options include a 24/7 alfresco eatery, poolside snacks, fine dining and a night club. An outdoor infinity pool has colourful cabanas and panoramic city views. There's also a spa and a gym.";
                break;



            case"Secunderabad":
                info ="Secunderabad railway station, is a major intercity railway station and a commuter rail hub in the Hyderabad Urban Area. It is located in the heart of the city of Hyderabad and falls under the South Central Railway zone of Indian Railways. \nZone(s): South Central Railway zone (headquarters)\nDid you know: Secunderabad Railway station is the zonal Headquarters of South Central Railway and divisional Headquarters of the secunderabad division.";
                break;



            case"Hyderabad Metro":
                info ="Hyderabad Metro is a rapid transit system, serving the city of Hyderabad, Telangana, India. It is in Secant Operational model. Wikipedia\nBegan operation: 29 November 2017\nNumber of stations: 24 (Operational); 64 (Phase I)\nAnnual ridership: 720,000\nDaily ridership: 60,000\nNo. of tracks: 2";
                break;



            case"Rajiv Gandhi Airport":
                info ="\nRajiv Gandhi International Airport is an international airport that serves Hyderabad, the capital and largest city of the Indian state of Telangana. It is located in Shamshabad, about 24 kilometres south of Hyderabad. \nAddress: Shamshabad, Hyderabad, Telangana 500409\nElevation: 617 m\nPhone: 040 6654 6370\nHub for: Alliance Air, SpiceJet, TruJet, Quikjet Airlines, Lufthansa Cargo, Blue Dart Aviation\nDid you know: Rajiv Gandhi International Airport is India's sixth-busiest airport by passenger traffic.";
                break;

            case"Hyderabad Railway Station":
                        info ="The Hyderabad Deccan railway station, popularly known as Nampally railway station, is located at Nampally, a locality in Hyderabad. \nAddress: Red Hills, Lakdikapul, Hyderabad, Telangana 500004\nStation code: HYB\nDivision(s): Secunderabad\nPlatforms in use: 6";
                break;


            //Jaipur Starts Here

            case "Hawa Mahal":
                info ="Visiting Hours: 9:00 a.m. to 4:30 p.m.\nEntry Fee:\n    -For Indians: 10 Rs.\n    -For Foreign Nationals: 50 Rs.\n    -Entry is Free on Monday and Closed on Friday\nHawa Mahal or Palace of the Winds, or also called Palace of the Breeze, is one of the important places to visit in Jaipur. Built by Maharaja Sawai Pratap Singh in 1798, Hawa Mahal is a five-storey extension in the form of a honeycomb. This unique building has 953 small windows, called jharokas, decorated with intricate lattice work. The entire palace represents the crown of the Hindu God, Lord Krishna.";
            break;

            case "Jaigarh Fort":
                info ="Visiting Hours: 9:00 a.m. to 4:30 p.m.\nEntry Fee:\n    -For Indians: 25 Rs (Adults)\n    -For Foreign Nationals: 75 Rs (Adults)\nThis fort is situated on the rugged promontory of the Aravalli Hills, called the Cheel ka Teela or the Hill of Eagles. If the majestic appearance of Jaigarh Fort has to be compared with other forts and palaces in Jaipur, it will surely stand ahead of most.Some of the best places to visit here are the Ram Harihar Temple, Kal Bhairav Temple and a museum that showcases primitive arms and ammunition. Once a popular cannon foundry of the Mughals and Rajputs, Jaigarh Fort is also home to Jaivana, the world's largest cannon-on-wheels.";
                break;


            case "Amber Fort":
                info ="Entry Fee:\n -For Indians: 25Rs. (Inclusive of Entry & Camera )\n    -Foreign Nationals: 150 Rs. (Inclusive of Entry & Camera)\nLocated amidst the picturesque and rocky Aravalli Hills, Amber Palace is a not-to-be-missed place to in Jaipur. The foundation stone of this palace was laid by Raja Man Singh I and was completed by Mirja Raja Jai Singh. Beguiling beauty of the red sandstone and white marble adds to the magnificence.\nWhile the high formidable walls defended its residents from enemy attacks, the main building of the citadel served its people with all the luxuries and amenities.The scenic backdrop of the Maota Lake and panoramic views of sunrise and sunset contribute to the eternal beauty of this palace.";
                break;


            case "Jal Mahal":
                info ="Visiting Hours: 6:00 a.m. - 6:00 p.m.\nPhotography Allowed: Yes\nIt was during the Rajput era that India has seen some of the glorious forts and palaces. Jal Mahal or the Water Palace is one of the classic names in the list of Rajputana architecture.\nLocated in the middle of the Man Sagar Lake, this palace is also a fusion of Mughal and Rajput styles of architecture. Built in red sandstone, Jal Mahal is a five-storey building, of which four storeys remain underwater when the lake is filled.Since the palace is located in the middle of the lake, traditional boats are used to reach the palace";
                break;


            case "Jantar Mantar ":
                info ="Entry Cost: 200 rupees for foreigners. 50 rupees for Indians.\nHours: 9 a.m. to 4.30 p.m. daily.\nJantar Mantar, built by King Jai Singh II between 1727 and 1734, literally means \"calculation instrument\". More than just a curious collection of sculptures, each structure at the intriguing Jantar Mantar observatory has a specialized astronomical function. There are 14 structures in total, which measure time, predict eclipses, and track stars. The most impressive one is the huge Samrat Yantra sundial. At a height of 90 feet (27 meters), it has a shadow that moves roughly the width of a person's hand every minute. It's a profound display of how quickly time does in fact go!";
                break;


            case "Nahargarh Fort":
                info ="Entry Cost: 200 rupees for foreigners. 50 rupees for Indians.\nHours: Sunrise to sunset, daily. Palace open from 10 a.m. to 5.30 p.m. daily.\nNahargarh Fort, also known as Tiger Fort, is perched high on the rugged Aravali Hills overlooking Jaipur city. The fort was built 1734 to help defend the city. It found fame in 2006, after many scenes from the movie Rang De Basanti were filmed there. Nahargarh Fort offers spectacular views, which are best seen at sunset. A number of new attractions recently opened there including a wax museum, sculpture park, and fine-dining restaurant. The fort looks particularly attractive at night when it's lit up.";
                break;


            case "Albert Hall Musuem":
                info = "Entry Cost: 300 rupees for foreigners. 40 rupees for Indians. Museum @ Night tickets cost 100 rupees for foreigners and Indians.\nHours: 10 a.m. to 5 p.m. daily. And 7 p.m. to 10 p.m. for night viewing.\nThis old and famous museum was modeled on the Victoria and Albert Museum in London, with a fusion of Islamic and Neo-Gothic architecture. It was established as a public museum in 1887. The collection includes portraits of local kings, costumes, woodcarvings, paintings, and arts and crafts. The museum is particularly notable for its Egyptian mummy, belonging to the Ptolemaic dynasty. Unfortunately photography isn't allowed. The museum is beautifully illuminated after dark and it opened for night viewing in 2015.";
                break;


            case "RajMandir":
                info = "Visiting Hours: 11:00 am   2:00 am\nPhotography Allowed: No\nRaj Mandir a meringue shaped cinema complex, located on Bhagwan Das Road, Jaipur, it is one of the best places in the entire city to enjoy all the Bollywood masala flicks. The fame of this cinema complex has gained immense popularity with the locals as well as with the tourists. Built in 1976, this movie complex has a capacity to hold a 1300-strong audience, and it is often called the Pride of Asia. Till date, this theatre has screened several private as well as public film premieres.";
                break;


            case "City Palace":
                info ="Visiting Hours: 9.30 a.m to 5 p.m\nEntry Fees for Indians:\n    -Adults: 40 Rs\n    -Children (5 -12 yrs): 25 Rs\n    -Cameras: 50 Rs\n    -Video Camera: 200\nEntry Fees for Foreign Nationals:\n    -Adults: 300 Rs\n    -Children (5 -12 yrs): 200 Rs\n    -Cameras/Video: 200 RsLocated in the heart of Jaipur, City Palace is the most remarkable monument in the list of places to visit in Jaipur. Guarded by huge impounding walls, this palace is a fusion of Rajput and Mughal architecture.  Whether with its everlasting architecture or the enchanting decorations, City Palace has kept the amplitude of the Rajputs alive";
                break;


            case "Monkey Temple":
                info = "Visiting Hours: Sunrise to Sunset, on all weekdays\nPhotography Allowed: Yes\nGaltaji or Galta Monkey Temple is a popular Hindu pilgrimage site in Jaipur. Built during the 18th century by Diwan Rao Kriparam, this temple is located 10 km away from Jaipur. Scenic Aravalli Hills surround this temple and the dense green forests help in keeping the temperature of this place moderate.During every Makar Sankranti, devotees from various places gather in this temple and take a holy dip in these kunds. According to Hindu religious beliefs, taking a dip in these kunds washes away all ones sins.";
                break;


            case "Sisodiya Garden":
                info ="Sisodia Rani Garden entry timings: all days of the week- 08:00 am to 06:00 pm.\nEntry fee: INR 10 to 30 per person\nSisodia Rani Garden and Palace have a popular space in the tourist section of Rajasthan as hundreds of people come to visit and enjoy the stunning beauty of a picturesque garden and the architectural brilliance portrayed on the palace walls. It is located about 6 kilometers away from Jaipur city and was built by Maharaja Sawai Jai Singh II in 1728. It consists of tiered gardens with fountains, watercourses and colorful pavilions. v";
                break;


            case "1135 AD":
                info = "Approximate cost for two people:  Rs 2,700\nThis restaurant lives up to its name. The imperial ambience with regal chairs, gold enameled walls and magnificent tables takes you back in time. The elegant decor and romantic outdoors create a perfect ambience to watch the sun go down in style. The stunning view makes you forget yourself and so does the food. Their menu comprises a mix of Mughlai, Rajasthani and North Indian delights. Food is served on silver plates with silver cutlery to reflect royalty. The Lal Maas really stood out. It was so tender that the meat was falling off at the bone. The Jungli Maas, Sula Biryani and Paneer Aftab certainly hit the spot.";
                break;


            case "Suvarna Mahal":
                info = "Price for Two: The average cost of a dinner for two people will be approximately INR 9000/ USD 140. \nTimings: 7:00 to 11:45 pm\nEmbedding the rich cultural heritage of Rajasthan in its cuisine, Suvarna Mahal is one of the most exquisite restaurants in Jaipur in a fine dining experience. With its high ceilings, gilded mirrors and Florentine frescoes, the d cor of Suvarna Mahal will take you back in the regal past of the state that was once embellished by royalty. \nHere you can spice up your taste buds with an exotic array of dishes brought together by amazing chefs from different parts of India. Some of the most popular dishes offered here are murgh tikka zaffrani, dahi ka mass, papad ki sabzi and ras malai. ";
                break;


            case "Peacock Rooftop":
                info ="Price for Two:A meal shared by two people at Peacock Rooftop Restaurant costs approximately INR 900/ USD 14\nTimings: 7:30 AM to 11 PM\nRelish the savoury dishes enjoying a spectacular 360-degree view of the city from the rooftop restaurant at Hotel Pearl Palace in Jaipur. Serving Indian and non-Indian selections, Peacock Rooftop Restaurant offers a fun ambience with quirky d cor and a great value for money. \nThe most recommended dishes here are Mocktails, Lassi, Butter Chicken, Gulab Jamun, Kadhai Murgh, Dal Makhani,Tandoori Chicken.";
                break;


            case "Laksmi Misthan":
                info =" Approximate cost for two people: Rs 900\nLakshmi Mishtan Bhandar or LMB as fondly called is one of the most popular restaurants in Jaipur.  From north Indian delights, delicious fast-food to the city s best sweets, this place has everything under one roof.  After a sumptuous meal at LMB, you can call for paneer ghewar or mawa kachori which is their specialty dessert. An absolute delight for vegetarians, you must visit this restaurant. It may look like an ordinary restaurant from the outside, but trust us, the food is worth-trying and so are the mind-blowing interiors.";
                break;

            case "Sanjay's Omlette":
                info = "Not just for breakfast, you can eat eggs all day, every day and they show you how. The place is owned by Mr. Sanjay Sharma who was also one of the participants of MasterChef India and has been serving the city for over two decades. Tucked away in the backstreets, it does a winning line in everything made with eggs   from curries to omelette, parathas to rolls and even pizzas. The egg pizza is quite something and my personal favourite. You ll be amazed to see the variety of dishes and flavours. Burgers, sandwiches, salads or soup   just put an egg on it. ";
                break;


            case "Om Revolving Restaurant":
                info = "Approximate cost for two people:  Rs 1000\nLike the name aptly suggests, Om Revolving restaurant offers a complete panoramic view of the beautiful pink city of India, Jaipur.  Whether you go for lunch with friends or dinner with family, the view of the city is out of this world. With such beautiful views, you will be served the tastiest India food,  sizzlers and also thalis.  Dishes like  Paneer Tikka Masala  and chaat find many takers. Enjoy the food here  with ghazal songs played live especially during late evening. Music, good food and a view of the revolving landscapes of Jaipur, what more could you ask for!";
                break;

            case "Dragon House":
                info ="Price for Two:At Dragon House, a dining experience for two people will cost approximately INR 1800/ USD 28. \nTimings:12:30 PM to 3 PM, 7:30 PM to 11:30 PM\nFor fans of Thai and Chinese cuisine, Dragon House in Jaipur is the best place to be to satiate your hunger. The extensive menu aided by the warm and courteous staff will offer you one of the best experiences of Oriental dining in India. \nThe most popular delicacies which one can enjoy here are Noodles, Manchurian, Manchow Soup,Fortune Cookie, Dim Sums, Dimsum, Hot Jasmine Tea. So if you wish to have a taste of some China on a vacation through the deserts of Rajasthan, check out the Dragon House in Jaipur.";
                break;

            case "Okra":
                info = "Price for Two: At Okra, the average cost of a meal for two people costs about INR 2200/ USD 36\nTimings: Open 24 hours\nWhether you re looking for a scrumptious brunch or a delectable buffet, Okra hits the spot in many ways for culinary enthusiasts in Jaipur. Offering North Indian, Continental, Asian and Italian cuisine, there is hardly a soul that goes disappointed after a meal at Okra. \nThe lavish restaurant is popular for pleasing its guests with a wide array of dishes, the most popular being Okra, Sushi, Cappuccino, Lal Maans, Dim Sums, Clear Soup and Panipuri. ";
                break;

            case "Peshwari":
                info ="\nPrice for Two:The average cost of a dinner for two people will be approximately INR 3000/ USD 46\nTimings:12:30 PM to 2:45 PM, 7:30 PM to 10:30 PM\nAt Peshawri, get transported to North West Frontier of India with its authentic flavours brought alive by its delectable dishes. With its barbecued specialities and baked Indian breads, Peshawri with its spectacular ambience will enthral you more than any other restaurant in Jaipur.\nThe range of dishes offered here is an amalgamation of authentic recipes and is stimulated by the dining traditions of aristocracies mastering in spice and flavour comprising of appetizing tandoori kababs like reshmi , murgh malai , kastoori etc.  Some of the signature creations at Peshawri are Dal Bukhara, Sikandari Raan, Barrah Kabab, Tandoori Jhinga and Murgh Malai Kabab. ";
                break;

            case "World Trade Park":
                info = "Timings: 10am - 10pm\nWorld Trade Park is a complete package for shopping, fun, movie, masti, etc. in Pink City. It is one of the famous and biggest malls serving leisure with shopping having all domestic as well as international brands like Shoppers Stop, Zara, Nike, etc. The mall also has a Cinepolis multiplex and a food court serving the variety of cuisines.";
                break;

            case "Pink Square Mall":
                info ="Timings: 11am - 10pm\nPink Square  Mall is basically a commercial center with some good shopping stores of domestic as well as international brands. One can easily find outlets of all major clothing brands and commercial offices at Pink Square  Mall. This mall also has some good eating food joints that serve the variety of dishes.";
                break;

            case "Nehru Bazar":
                info ="What to buy: Rajasthani jootis, trinkets, perfumes, and ready made garments\nTimings: 10:30 am to 7:30 pm; open all days of the week\nNearest Bus Stop: Hathoj Bus Stop\nIt is a traditionally built market, popular for readymade garments, household items, footwear, bags, and gifts. There are also numerous shops demonstrating authentic Rajasthani crafts. A vibrant and colorful market, you can find everything in Nehru Bazaar, from textiles to perfumes to Rajasthanijootis and trinkets. Exquisite blue pottery is also famous here. It is located on MI Road, at close proximity to Kishanpol Bazaar and Chaura Rasta, and is the ideal place to take back beautiful souvenirs for your friends and family.";
                break;

            case "Kishan Poli Bazar":
                info ="Specialty: Check out the wonderful wooden sculptures and souvenirs at this Jaipur shopping place\nTimings:11 am to 9 pm ; all days open\nNearest Bus Stop: Choti Chopad Bus Stop\nKishanpole is best known for textile goods which can be bought at reasonable prices. It is also one of the best places to visit in Jaipur for shopping, to get your loved ones some wooden souvenirs; as Kishanpole Bazaar is home to many skilled artists renowned for their unique wooden carvings.";
                break;

            case "Johari Bazar":
                info ="What to buy: gold, silver, emerald, diamond and kundan jewellery, \nsarees and lehengas, Jaipuri quilts\nTimings: 10:00 am to 11:00 pm; open all days of the week\nNearest Bus Stop: Badi Chopar Bus Stop.\nJohari Bazaar is one of the earliest Jaipur shopping places where you can buy all these. The plethora of choices and amazing designs makes it one of the best places to shop in Jaipur and also, it will leave you spellbound, especially the wonderful handmade, delicate jewelry.";
                break;

            case "Tripoli Bazar":
                info ="What to buy: Lac bangles, brass-ware, carpets, precious stones and jewelry\nTimings: 10:00 am to 7:00 pm; closed on Sundays\nNearest Bus Stop: Choti Chopad Bus Stop\nTripolia Bazaar is known for its lac jewelry and the beautiful varieties of bangles is the best shopping area in Jaipur. Shop for the textiles in Tripolia Bazaar. Flaunt the popular Bandini tie and dye fabrics with rich embroideries are also available here. Also, you can buy designer carpets, brass ware and other traditional wears.";
                break;

            case "Bapu Bazar":
                info ="What to buy: Mojari shoes, camel leather products, handicrafts, textiles, marble and sandstone carvings, and Rajasthani souvenirs\nTimings: 10:30 am to 7:30 pm; open all days of the wee\nNearest Bus Stop: Sindhi Camp Bus Stop\nThe best place to visit in Jaipur for shopping, Bapu Bazaar is a one stop destination for all the Jaipuri items as you could almost buy anything for a reasonable price. This bazaar stands out for the moderate prices of items like textiles and Joothis. Here you can enjoy the novelty of street shopping in Jaipur. Plus, the bazaar lies in a pretty location and you could get to witness the  pink  side of the city!";
                break;

            case "Mirza Ismael Road":
                info ="Timings: 11 am onwards ; All days Open\nWhat to buy : the colorful pots and wooden souvenirs from this shopping place in Jaipur\nNearest Bus Stop: Ajmeri Gate Bus Stop\nPottery in Jaipur is taken too seriously -And you re sure to fall in love with the pottery works the moment your gaze falls on them! Visit MI   the most vibrant of the shopping places in Jaipur   road to shop for pottery work, which dates back to the days of the Rajput kings who used the pots extensively to beautify their palaces. So head there to add some beautiful collections to your home. Also, look for brass statues and wooden items.";
                break;

            case "Sireh Deori Bazar":
                info ="Timings:  11 am onwards ; all days open\nSpecialty: Out of all the shopping places in Jaipur, you will get best Camel Leather products here\nNearest Bus Stop: Badi Choupad Bus Stop\nSireh Deori Bazaar, opposite to the famous Hawa Mahal is a perfect place for window shopping and street shopping in Jaipur, since you get a glimpse of the overall shopping items available here. Leather shoes, puppets, knickknacks and some unique hangings can be picked up from here, which are exclusive make of Jaipur.";
                break;

            case "ITC RajPutana":
                info ="Price: 6.5k - 15k\nSet in the city center, this luxe hotel with a lavish lobby is a 7-minute walk from Jaipur Junction train station and 3.9 km from the unique Hawa Mahal palace, built to shield royal women from the public.\nRefined rooms offer flat-screens, and tea and coffeemaking facilities. Upgraded rooms add club lounge access and butler service, and suites provide separate sitting areas. Room service is available 24/7.\nFreebies include parking, and a breakfast buffet served in the coffee shop. There are also 2 chic restaurants and 2 bars (including 1 poolside). Other amenities include an outdoor pool, a gym and a spa area, plus kids' activities.\n";
                break;

            case "Lalit":
                info = "Price: 4k+\nElegant rooms and suites infused with Rajasthani art come with free Wi-Fi, flat-screen TVs and desks. They also have minibars and tea and coffeemaking facilities. Upgraded rooms add living rooms with sofas. There is 24-hour room service.\nBreakfast and parking are free. The hotel has 3 gourmet dining options, including a restaurant with a circular wine cellar. It has a coffee shop, a spa and an exercise room. Additional amenities include an outdoor pool, a business centre and a childcare centre.";
                break;

            case "Oberoi Raj Vilas":
                info ="Price: 28k - 75k\nThe Oberoi Rajvilas is a unique way to experience Jaipur, one of India s most vibrant and exotic destinations. A luxury resort with its own distinctive character, it revives the gracious lifestyles of India s legendary Rajput princes.\nRecreating the magnificence of princely Rajasthan, in a beautiful fort setting, with Jaipur as its backdrop; The Oberoi Rajvilas is set in 32 acres of landscaped gardens with pavilions and reflection pools that create the romance and grandeur of Rajasthan. Rooms, luxury tents and villas with private pools are clustered around private courtyards in a richly embellished fort setting.";
                break;

            case "Ramada":
                info ="Price : 4k+\nThis warm, modern hotel is 1.6 km from Jaipur bus station, 4.4 km from City Palace and 7 km from Jaipur Junction railway station. \nFeaturing wooden floors, the polished, minimalist rooms feature free Wi-Fi, flat-screen TVs, and tea and coffeemaking facilities. Suites add living rooms, and upgraded rooms offer access to a lounge. Room service is available 24/7.\nA breakfast buffet is complimentary. There are 4 restaurants, including a cocktail bar with international cuisine and a vegetarian Indian option. Other amenities include a fitness room and a terrace with an outdoor pool, plus a 24-hour business centre and 7 meeting rooms";
                break;

            case "Ram Baugh Palace":
                info = "Price: 32k - 85k\nRambagh Palace in Jaipur offers 79 rooms and stunningly restored suites, which were the chambers of the former Maharaja. Use of rich fabrics and silk drapes draw from the colourful art and warm hues of the state of Rajasthan. Request the legendary Peacock suite, which overlooks the Mughal Terrace and the garden where the Maharaja used to celebrate \"Holi,\" the festival of color and lights. Stage an evening of high romance in a private tent, illuminated only by torchlight.";
                break;

            case "Trident  ":
                info ="Price: 6k- 14k\nAcross the road from Man Sagar Lake, this upscale hotel is also 3.9 km from the red sandstone Jal Mahal Palace and 4.2 km from the iconic Amber Fort. \nRefined rooms with balconies feature free Wi-Fi, flat-screen TVs and iPod docks, plus minibars, and tea and coffeemakers. Upgraded rooms add lake views, while suites offer separate living areas. Room service is available.";
                break;

            case "Holiday Inn":
                info ="Price : 4k+\nSet in Jaipur's business district, this upscale hotel is 3 km from the Raj Mandir Cinema, and 5 km from both Hawa Mahal palace and the Jantar Mantar monument. \nThe sleek, modern rooms provide free Wi-Fi, flat-screen TVs and iPod docks, as well as sofabeds, minibars, and tea and coffeemakers. Club rooms feature complimentary breakfast. Suites add living rooms.\nThere are 3 restaurants, including 1 serving pan-Asian cuisine and 1 offering casual American-style dining. Other amenities consist of a cosy bar with dark wood accents and plush armchairs, in addition to a business centre, a gym and an outdoor pool.";
                break;

            case "Fern":
                info ="Price: 2,800+\nThe stylish, contemporary rooms have Wi-Fi (fee), flat-screen TVs and minibars, as well as tea and coffeemakers. Upgraded rooms add free Wi-Fi, welcome drinks and club lounge access. Suites include living rooms, extra bathrooms and DVD players. Upgraded suites offer extra space and private service staff. Room service is on offer 24 hours.\nA free breakfast buffet is served in a low-key international restaurant with a 24-hour cafe. There's an European cake shop and a chic nightclub. Other amenities include a spa, a rooftop pool and a fitness centre.";
                break;

            case "Radison Blu":
                info ="Price:3,800+\nThis upscale hotel is 1.5 km from Jawahar Circle, 2.3 km from Durgapura railway station and 8 km from Rambagh Palace. \nThe bright rooms come with free Wi-Fi, flat-screen TVs, and desks. They also feature seating areas and minibars, along with tea and coffeemaking facilities. Suites add separate living rooms with sofas, and some have dining rooms. Room service is available.\nThe hotel offers free parking and a breakfast buffet. Other amenities include a restaurant, a coffee shop and a chic bar. There's also an outdoor rooftop pool with a an adjacent bar, plus a fitness room and a business centre.";
                break;

            case "Jaipur Airport":
                info = "Jaipur International Airport is the primary airport serving Jaipur, the capital of the Indian state of Rajasthan. Address: Airport Road, Sanganer, Jaipur, Rajasthan 302011\nCode: JAI\nElevation: 385 m\nPhone: 0141 255 0623";
                break;

            case "Jaipur Railway Station":
                info = "Jaipur Junction railway station is a railway station in Jaipur. Jaipur also serves as the headquarters of the North Western Railway zone of the Indian Railways since 2002.The Jaipur Division of the North Western Railway is also headquartered at Jaipur.\nElevation\t434 metres (1,424 ft)\nOwned by\tIndian Railways\nLine(s)\tDelhi-Jaipur line\n           Jaipur-Ahmedabad line\n           Jaipur-Sawai Madhopur\nPlatforms\t 7 \nZone(s)\tNorth Western Railway";
                break;


            case "Jaipur Metro":
                info ="Jaipur Metro is a rapid transit system in the city of Jaipur, Rajasthan, India. Construction on the mostly elevated part of the first line, called Phase 1A, comprising 9.63 kilometres of route .\nHeadway: 10 minutes 0 seconds\nBegan operation: 3 June 2015\nNumber of lines: 1 (operational, planned)\nNumber of stations: 9\nDaily ridership: 17,649(November 2017)";
                break;




        }

        return info;
    }


}
