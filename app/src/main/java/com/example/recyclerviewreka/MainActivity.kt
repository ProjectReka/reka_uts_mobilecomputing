package com.example.recyclerviewreka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<Image>(
            Image(
                R.drawable.ikanbakarmanokwari,
                "IKAN BAKAR MANOKWARI",
                "Sekilas, proses pembuatan ikan bakar manokwari, sama dengan cara bakar ikan pada umumnya. Ikan dilumuri dengan jeruk nipis terlebih dahulu sebelum dibakar. Perbedaan ikan bakar manokwari khas Papua dengan ikan bakar lainnya, terletak pada cara penyajiannya. Jika daerah lain menggunakan kecap atau bumbu kacang, ikan bakar manokwari disajikan menggunakan sambal dan rempah yang digiling kasar. "
            ),
            Image(
                R.drawable.ikanbungkus,
                "IKAN BUNGKUS",
                "Ikan bungkus merupakan makanan khas Papua yang dibuat dengan bahan ikan laut yang diberi bumbu, kemudian dibungkus daun. Sekilas, ikan bungkus hampir mirip dengan ikan pepes. Namun, jika ikan pepes dibungkus dengan daun pisang, maka ikan bungkus khas Papua ini dibungkus pakai daun talas."
            ),
            Image(
                R.drawable.papeda,
                "PAPEDA",
                "Makanan tradisional Papua yang satu ini sudah banyak dikenal masyarakat. Papeda yang terbuat dari tepung sagu, memiliki rasa cukup tawar atau hambar. Oleh karena itu, untuk menikmati enaknya papeda, biasanya makanan tradisional Papua ini disajikan dengan ikan kuah kuning, ikan bakar, atau ikan kuah bening.\n" +
                        "\n" +
                        "Papeda merupakan makanan khas daerah Papua yang sangat populer di Indonesia Timur. Jadi, ketika berkunjung ke daerah-daerah yang berada di ujung timur Indonesia, kamu bisa dengan mudah menemukan rumah makan yang menjual papeda."
            ),
            Image(
                R.drawable.sateulatsagu,
                "SATE ULAT SAGU",
                "Makanan tradisional Papua satu ini terlihat ekstrim, ya. Namun, jangan salah! Kuliner ekstrim yang terbuat dari ulat sagu ini justru kaya akan protein, bisa jadi sumber energi, dan rendah kolesterol. Untuk mendapatkan ulat sagu yang akan dijadikan sate, orang Papua memotong pohon sagu dan membiarkan batang pohon sagu tersebut membusuk.\n" +
                        "\n" +
                        "Cara membuat sate ulat sagu ini tidak berbeda jauh dengan cara membuat sate pada umumnya. Setelah ulat sagu selesai dibakar, kemudian diberi bumbu sate dan disajikan bersama roti sagu atau papeda. Kamu berani mencobanya?"
            ),
            Image(
                R.drawable.udangselingkuhpapua,
                "UDANG SELINGKUH PAPUA",
                "Makanan khas Papua yang satu ini memiliki nama yang unik, ya! Disebut udang selingkuh karena bahan utama masakan ini memiliki badan udang, namun capitnya seperti kepiting. Jadi, masyarakat lokal menganggap udang tersebut adalah hasil perselingkuhan udang dan kepiting.\n" +
                        "\n" +
                        "Makanan udang selingkuh, dibuat dengan bahan utama udang air tawar yang diambil dari sungai. Udang ini kemudian dimasak sambal asam manis, saus tiram, saus padang, atau saus mentega. Kamu bisa memilih sausnya sesuai selera. Soal rasa, udang selingkuh memiliki tekstur yang lebih lembut dan manis dibanding udang air laut."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.imageRecyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=ImageAdapter(this, imageList) {
            val intent = Intent (this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}