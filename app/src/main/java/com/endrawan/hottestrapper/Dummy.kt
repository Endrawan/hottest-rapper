package com.endrawan.hottestrapper

import com.endrawan.hottestrapper.models.Album
import com.endrawan.hottestrapper.models.Rapper
import com.endrawan.hottestrapper.models.Stream

object Dummy {

    val dummyStream = Stream(
        "32 billion",
        "250 Million",
        "150 Million"
    )

    val drake = Rapper(
        "Drake",
        "Among the world's best-selling music artists, with over 170 million records " +
                "sold, Drake is ranked as the world's highest-certified digital singles artist by " +
                "the Recording Industry Association of America (RIAA). Drake also holds several " +
                "Billboard chart records; he has the most charted songs (205) among solo artists " +
                "in the history of the Billboard Hot 100, the most simultaneously charted Hot 100 " +
                "songs in a single week (27), the most time on the Hot 100 (431 weeks), and the " +
                "most Hot 100 debuts in a week (22).",
        "Canada",
        "October 24, 1986",
        "US$150 Million",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Drake_at_the_Velvet_Underground_-_2017_%2835986086223%29_%28cropped%29.jpg/220px-Drake_at_the_Velvet_Underground_-_2017_%2835986086223%29_%28cropped%29.jpg",
        dummyStream,
        listOf(
            Album("Scorpion", 2018, "https://img.discogs.com/BHfwqUxWegcK2PVBY3YEYSGbe5o=/100x100/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-12252821-1535317927-2134.jpeg.jpg"),
            Album("More Life: A Playlist By October Firm", 2017, "https://img.discogs.com/CJOVV8Tc6hyFIvnOiv0hhiyR_jo=/100x100/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-9999158-1538155037-8069.jpeg.jpg"),
            Album("Views", 2016, "https://img.discogs.com/jsyTLCxF833MH26j87IGCfa3wWU=/100x100/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-12558159-1579015174-9072.jpeg.jpg"),
            Album("If You're Reading This It's Too Late", 2015, "https://img.discogs.com/2ziCIWREVQ-2HeIZLxMIfFOZdQA=/100x100/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-6647427-1458379086-2376.jpeg.jpg")
        )
    )

    val jcole = Rapper(
        "J Cole",
        "Cole released his debut studio album, Cole World: The Sideline Story, in 2011. It " +
                "debuted at number one on the U.S. Billboard 200, and was soon certified platinum " +
                "by the Recording Industry Association of America (RIAA). His next two releases, " +
                "2013's Born Sinner and 2014's 2014 Forest Hills Drive, received mostly positive " +
                "reviews from critics,[5][6][7] and both were certified platinum in the United States.",
        "Germany",
        "January 28, 1985",
        "US$ 35 Million",
        "https://i.pinimg.com/originals/f9/33/ae/f933ae244533f20727d0daba173128b8.jpg",
        dummyStream,
        listOf(
            Album("KOD", 2018, "https://media.pitchfork.com/photos/5ad8b39b5fadaa7e89cfd808/1:1/w_160/KOD%20J.%20Cole.jpg"),
            Album("4 Your Eyez Only", 2016, "https://media.pitchfork.com/photos/5929c00fabf31b7dc71563da/1:1/w_320/6a6268b6.jpg"),
            Album("2014 Forest Hills Drive", 2014, "https://media.pitchfork.com/photos/5929ab805e6ef9596932176d/1:1/w_320/620dbc4d.jpg"),
            Album("Born Sinner", 2013, "https://media.pitchfork.com/photos/5929c216eb335119a49ed667/1:1/w_320/132aecb4.jpg")
        )
    )

    val savage = Rapper(
        "21 Savage",
        "His debut studio album, Issa Album, was released on July 7, 2017. It debuted at " +
                "number two on the Billboard 200 and gave him his first Billboard Hot 100 top 20 " +
                "song, \"Bank Account\". His first number one single came at the end of 2017 with " +
                "his feature on Post Malone's \"Rockstar\", which was nominated in two categories " +
                "at the 61st Grammy Awards.",
        "England",
        "October 22, 1992",
        "US$ 12 Million",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/21_Savage_2018.jpg/220px-21_Savage_2018.jpg",
        dummyStream,
        listOf(
            Album("I Am > I Was", 2019, "https://media.pitchfork.com/photos/5c191d10d8c626304c2d48cb/1:1/w_320/21%20savage_I%20am%20I%20was.jpg"),
            Album("Without Warning", 2017, "https://media.pitchfork.com/photos/59f9eac90f8bbf5002e775a4/1:1/w_320/21%20Savage:Offset:Metro%20Boomin_Without%20Warning.jpg"),
            Album("Issa Album", 2017, "https://media.pitchfork.com/photos/59653c3792e95525676e36b0/1:1/w_320/issaalbum_21savage.jpg"),
            Album("Savage Mode", 2016, "https://media.pitchfork.com/photos/5929bbd0eb335119a49ecb11/1:1/w_320/ae9b1153.jpg")
        )
    )

    val kendrick = Rapper(
        "Kendrick Lamar",
        "Raised in Compton, California, Lamar embarked on his musical career as a teenager " +
                "under the stage name K-Dot, releasing a mixtape that garnered local attention and " +
                "led to his signing with indie record label Top Dawg Entertainment (TDE). He began " +
                "to gain recognition in 2010 after his first retail release, Overly Dedicated. The " +
                "following year, he independently released his first studio album, Section.80, " +
                "which included his debut single \"HiiiPoWeR\".",
        "United States",
        "June 17, 1987",
        "US$ 75 Million",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Pulitzer2018-portraits-kendrick-lamar.jpg/220px-Pulitzer2018-portraits-kendrick-lamar.jpg",
        dummyStream,
        listOf(
            Album("DAMN.", 2017, "https://media.pitchfork.com/photos/5929c3e8eb335119a49ed80f/1:1/w_320/31d2b6fd.jpg"),
            Album("To Pimp a Butterfly", 2015, "https://media.pitchfork.com/photos/5929ad4cea9e61561daa60ba/1:1/w_320/d47a5880.jpg"),
            Album("good kid, m.A.A.d city", 2012, "https://media.pitchfork.com/photos/5929c04fea9e61561daa7bc5/1:1/w_320/25b1edda.jpg"),
            Album("Section.80", 2011, "https://media.pitchfork.com/photos/5929b026b1335d7bf169a080/1:1/w_320/2d538998.jpg")
        )
    )

    val postMalone = Rapper(
        "Post Malone",
        "Post's debut album Stoney (2016), which was trap and cloud rap focused, was a " +
                "commercial success and featured the hit single \"Congratulations\". In 2018, " +
                "the album broke the record for most weeks on the US Billboard Top R&B/Hip-Hop " +
                "Albums chart after it reached its 77th week on the chart.",
        "United States",
        "July 4, 1995",
        "US$ 14 Million",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/191125_Post_Malone_at_the_2019_American_Music_Awards.png/220px-191125_Post_Malone_at_the_2019_American_Music_Awards.png",
        dummyStream,
        listOf(
            Album("Hollywood's Bleeding", 2019, "https://media.pitchfork.com/photos/5d71762bc7531e0008f96fd8/1:1/w_320/postmalone_hollywoodsbleeding.jpg"),
            Album("Beerbongs & Bentley", 2018, "https://media.pitchfork.com/photos/5ae880dc59be997c863bb9ea/1:1/w_320/Beerbongs%20Bentley.jpg"),
            Album("Stoney", 2016, "https://media.pitchfork.com/photos/5929bff85e6ef959693234aa/1:1/w_320/422b7f24.jpg")
        )
    )

    val tekashi = Rapper(
        "6ix9ine",
        "The rapper became widely known in late 2017 after the release of his debut single," +
                " \"Gummo\". The song was a sleeper hit, peaking at number 12 on the Billboard Hot" +
                " 100, and was certified platinum. 6ix9ine subsequently released the mixtape Day69 " +
                "(2018), which peaked at number four on the Billboard 200, and contained the singles" +
                " \"Kooda\", \"Keke\", and \"Gotti\", all of which charted on the Hot 100.",
        "United States",
        "May 8, 1996",
        "US$ 5 Million",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/6ix9ine.jpg/220px-6ix9ine.jpg",
        dummyStream,
        listOf(
            Album("DUMMY BOY", 2018, "https://media.pitchfork.com/photos/5c01b5a1daf5486adde784f9/1:1/w_320/tek_6ix9ine.jpg")
        )
    )

    val lilPump = Rapper(
        "Lil Pump",
        "Lil Pump rose to popularity in 2017, after he released his single \"Gucci Gang\" " +
                "from his debut album Lil Pump, which peaked at number three on the U.S. Billboard " +
                "Hot 100, and is certified triple platinum by the Recording Industry Association of " +
                "America. He has since released other songs, including \"I Love It\" (with Kanye " +
                "West), \"Esskeetit\", \"Drug Addicts\", \"Butterfly Doors\", \"Racks on Racks\", " +
                "and \"Be Like Me\" (featuring Lil Wayne).",
        "United States",
        "August 17, 2000",
        "US$ 8 Million",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Lil_Pump_Icebox_2018_%28cropped%29.jpg/220px-Lil_Pump_Icebox_2018_%28cropped%29.jpg",
        dummyStream,
        listOf(
            Album("Harverd Droupout", 2019, "https://media.pitchfork.com/photos/5c673ed4817ba43f155f4ed0/1:1/w_320/harverd%20dropout_lil%20pump.jpg"),
            Album("Lil Pump", 2017, "https://media.pitchfork.com/photos/59db917f0fb2c63ca7e4ae44/1:1/w_320/lilpump:st.jpg")
        )

    )

    val travis = Rapper(
        "Travis Scott",
        "Scott's first full-length project, the mixtape Owl Pharaoh, was self-released in 2013. " +
                "It was followed with a second mixtape, Days Before Rodeo, in August 2014. His " +
                "debut studio album, Rodeo (2015), was led by the hit single \"Antidote\". His " +
                "second album, Birds in the Trap Sing McKnight (2016) became his first number one " +
                "album on the Billboard 200. ",
        "United States",
        "April 30, 1992",
        "US$ 40 Million",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Travis_Scott_April_2017.jpg/220px-Travis_Scott_April_2017.jpg",
        dummyStream,
        listOf(
            Album("JACKBOYS", 2020, "https://media.pitchfork.com/photos/5e0f6f452ff48f0008f567cb/1:1/w_320/jackboys_travis.jpg"),
            Album("Astroworld", 2018, "https://media.pitchfork.com/photos/5b60c32dc50e6c2e339b99fe/1:1/w_320/Travis%20Scott_Astroworld.jpg"),
            Album("Birds in the Trap Sing McKnight", 2016, "https://media.pitchfork.com/photos/5929bc47abf31b7dc7155c9b/1:1/w_320/2a8b2311.jpg"),
            Album("Rodeo", 2015, "https://media.pitchfork.com/photos/5929b07ac0084474cd0c1c63/1:1/w_320/eae6dd69.jpg")
        )
    )

    val cardiB = Rapper(
        "Cardi B",
        "Cardi B has since earned three number-one singles on the Billboard Hot 100; \"Bodak " +
                "Yellow\" made her the second female rapper to top the chart with a solo " +
                "output—following Lauryn Hill in 1998, \"I Like It\" made her the only female rapper " +
                "to attain multiple number-one songs on the chart, and her Maroon 5 collaboration " +
                "\"Girls Like You\" made her the sixth female artist to achieve three number-one " +
                "singles on the chart during the 2010s.",
        "United States",
        "October 11, 1992",
        "US$ 12 Million",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Cardi_B_-_Openair_Frauenfeld_2019_07.jpg/220px-Cardi_B_-_Openair_Frauenfeld_2019_07.jpg",
        dummyStream,
        listOf(
            Album("Invasion of Privacy", 2018, "https://media.pitchfork.com/photos/5ac2386498b8787dde3c7666/1:1/w_320/cardi-b-invasion-of-privacy.jpg")
        )
    )

    val eminem = Rapper(
        "Eminem",
        "After his debut album Infinite (1996) and the extended play Slim Shady EP (1997), " +
                "Eminem signed with Dr. Dre's Aftermath Entertainment and subsequently achieved " +
                "mainstream popularity in 1999 with The Slim Shady LP and its lead single " +
                "\"My Name Is\". His next two releases The Marshall Mathers LP (2000) and The " +
                "Eminem Show (2002) were worldwide successes and were both nominated for the Grammy " +
                "Award for Album of the Year.",
        "United States",
        "October 17, 1972",
        "US$ 100 Million",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Eminem_live_at_D.C._2014_%28cropped%29.jpg/220px-Eminem_live_at_D.C._2014_%28cropped%29.jpg",
        dummyStream,
        listOf(
            Album("Music to Be Murdered By", 2020, "https://media.pitchfork.com/photos/5e273d36d7f8cd0008150f58/1:1/w_320/eminem_music.jpg"),
            Album("Kamikaze", 2018, "https://media.pitchfork.com/photos/5b8ffa5ddb74e05a644701f7/1:1/w_320/Eminem_Kamikaze.jpg"),
            Album("Revival", 2017, "https://media.pitchfork.com/photos/5a2eac6f49e3044f38ff9e57/1:1/w_320/Revival%20Eminem%20.jpg"),
            Album("Recovery", 2010, "https://media.pitchfork.com/photos/5929aa5613d1975652139a06/1:1/w_320/8b4716c0.jpg")
        )
    )

    val dummyRappers = listOf(drake, jcole, savage, kendrick, postMalone, tekashi, lilPump, travis, cardiB, eminem)
}