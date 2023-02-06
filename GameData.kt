package com.example.tugasakhir

object GameData {

    private val gameNames = arrayOf("CSGO",
        "Dota 2",
        "GTA V",
        "GTA San Andreas",
        "League Of Legends",
        "Minecraft",
        "NFS Most Wanted",
        "Point Blank",
        "PUBG",
        "Valorant",
    )

    private val gameDetails = arrayOf("Counter Strike: Global Offensive adalah sebuah permainan dengan mode FPS yang dikembangkan oleh Valve Corporation dan Hidden Path Entertainment. Kedua perusahaan ini juga merupakan perusahaan yang mengembangkan Counter Strike: Source.",
        "Dota 2 adalah sebuah permainan arena pertarungan daring multipemain, dan merupakan sekuel dari Defense of the Ancients mod pada Warcraft 3: Reign of Chaos dan Warcraft 3: The Frozen Throne. DotA 2 dikembangkan oleh Valve Corporation, terbit juli 2013 dota 2 dapat dimainkan secara gratis pada sistem operasi Microsoft Windows, OS X and Linux. Dota 2 dapat dimainkan secara eksklusif melalui distributor resmi valve, Steam.",
        "Grand Theft Auto V (GTA 5) adalah permainan aksi-petualangan 2013 yang dikembangkan oleh Rockstar North dan diterbitkan oleh Rockstar Games. Ini adalah entri utama pertama dalam seri Grand Theft Auto sejak 2008 Grand Theft Auto IV. Berlatar di dalam negara bagian fiksi San Andreas, yang berbasis di California Selatan, kisah pemain tunggal mengikuti tiga kriminal dan upaya mereka untuk melakukan pencurian sementara di bawah tekanan dari agen pemerintah dan tokoh-tokoh kejahatan yang kuat. Desain dunia terbuka memungkinkan pemain bebas berkeliaran di pedesaan terbuka San Andreas dan kota fiksi Los Santos, yang berbasis di Los Angeles, Amerika Serikat.",
        "Grand Theft Auto: San Andreas (sering disingkat sebagai GTA: SA atau GTA: San Andreas), adalah permainan video laga-petualangan yang dikembangkan oleh Rockstar North, dan diterbitkan oleh Rockstar Games. Permainan ini adalah permainan 3D ke-7 dalam seri Grand Theft Auto, yang ke-5 pada rilis konsol dan permainan ke-7 secara keseluruhan. Pada awalnya dirilis untuk PlayStation 2 pada bulan Oktober 2004, permainan ini kemudian di pemortakan ke Xbox dan Microsoft Windows, kini yang baru rilis Android dan menerima penerimaan dan penjualan yang tinggi pada tiga platform tersebut, dan mendapat rekor penjualan permainan tertinggi di PlayStation 2. Grand Theft Auto: San Andreas diteruskan oleh Grand Theft Auto: Liberty City Stories dan didahului oleh Grand Theft Auto: Vice City.",
        "League of Legends adalah sebuah permainan video arena pertarungan daring multipemain yang dikembangkan dan dipublikasikan oleh Riot Games untuk Microsoft Windows dan macOS. Permainan tersebut terinspirasi oleh Warcraft III: The Frozen Throne dari seri Defense of the Ancients.",
        "Minecraft adalah sebuah permainan sandbox yang dikembangkan oleh pengembang permainan asal Swedia Mojang Studios. Permainan ini dibuat oleh Markus \"Notch\" Persson dalam bahasa pemrograman Java. Setelah beberapa versi pengujian pribadi awal, permainan ini pertama kali diterbitkan pada Mei 2009 sebelum sepenuhnya dirilis pada November 2011, kemudian Jens \"Jeb\" Bergensten mengambil alih pengembangan. Permainan ini adalah salah satu yang terlaris sepanjang masa, terjual lebih dari 238 juta kali dan dengan lebih dari 140 juta pemain aktif bulanan.",
        "Need for Speed: Most Wanted adalah permainan balapan multiplatform yang dikembangkan oleh EA Black Box dan pertama kali dirilis oleh Electronic Arts di Amerika Serikat pada 15 November 2005. Permainan ini merupakan bagian dari serial Need for Speed.",
        "Point Blank adalah sebuah permainan komputer ber-genre FPS yang dimainkan secara online. Permainan ini dikembangkan oleh Zepetto dari Korea Selatan dan dipublikasikan oleh Zepetto. Selain di Korea Selatan, permainan ini mempunyai server sendiri di beberapa negara seperti Thailand, Rusia, Indonesia, Brasil, Turki, Amerika Serikat, dan Peru. Di Indonesia, permainan ini sekarang telah dikelola oleh Zepetto. Point Blank berkisah tentang perseteruan antara Free Rebels dan pemerintah yang dalam hal ini adalah Counter Terrorist Force (CT-Force).",
        "PlayerUnknown's Battlegrounds (sering disingkat PUBG) adalah sebuah permainan battle royale, di mana 100 orang sekaligus dapat bermain secara daring. Pemenang dari permainan ini adalah individu atau tim yang dapat bertahan hingga akhir. Pemain bisa bermain sendirian (solo), tim dengan dua orang (duo), dan tim dengan empat orang (squad). Pemain bisa mengundang teman di daftar teman (friend list) untuk bergabung ke dalam permainan sebagai sebuah tim.",
        "Valorant (bergaya sebagai VALORANT) adalah penembak pahlawan orang pertama taktis multipemain gratis untuk dimainkan yang dikembangkan dan diterbitkan oleh Riot Games, untuk Microsoft Windows. Pertama kali menggoda dengan nama kode Project A pada Oktober 2019, permaian memulai periode beta tertutup dengan akses terbatas pada 7 April 2020, diikuti dengan perilisan resmi pada 2 Juni 2020. Pengembangan permainan dimulai pada 2014.",
    )

    private val gameImages = intArrayOf(R.drawable.csgo,
        R.drawable.dota,
        R.drawable.gta,
        R.drawable.gtasa,
        R.drawable.lol,
        R.drawable.mine,
        R.drawable.mostw,
        R.drawable.pb,
        R.drawable.pubg,
        R.drawable.valo,
    )

    val listData: ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (position in gameNames.indices) {
                val game = Game()
                game.name = gameNames[position]
                game.detail = gameDetails[position]
                game.photo = gameImages[position]
                list.add(game)
            }
            return list
        }


}