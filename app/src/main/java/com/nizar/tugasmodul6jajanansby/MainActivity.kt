package com.nizar.tugasmodul6jajanansby

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createJajan()
        rv_makanan.layoutManager = LinearLayoutManager(this)
        rv_makanan.setHasFixedSize(true)
        rv_makanan.adapter = Adapter(testData, { fakItem: Data_makanan -> resepItemClicked(fakItem)})
    }
    private fun resepItemClicked(Item: Data_makanan) {
        val showDetailActivityIntent = Intent(this, Makanan_Detail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, Item.NamaJajan.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_COMPONENT_NAME, Item.DescJajan.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, Item.hargaJajan.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_REFERRER, Item.imgJajan.toString())
        startActivity(showDetailActivityIntent)
    }
    private fun createJajan() : List<Data_makanan> {
        val partList = ArrayList<Data_makanan>()
        partList.add(
            Data_makanan("Roti John",
                "Roti John Merupakan Jajanan Khas Surabaya yang baru-baru ini ramai diperbincangkan.\n\n" +
                        "Berbeda dengan roti bakar lainnya roti john ini memiliki texture roti yang lembut dengan isian daging , telur dan keju serta rempah rempah yang melimpah\n\n" +
                        "Kalian Bisa membeli Roti John ini di Alun alun Kodam Surabaya.",
                "Rp. 50.000",R.drawable.roti_john))
        partList.add(
                Data_makanan("Janji Jiwa",
                        "Janji Jiwa merupakan Outlet minuman Kopi yang sangat diminati arek arek surabaya.\n\n" +
                                "Janji jiwa sendiri memiliki ciri khas rasa yang berbeda daripada minuman kopi yang lainnya ,pokok e wenak rek\n\n" +
                                "Kalian Bisa membeli Janji jiwa di setiap outlet yang ada di aplikasi Jiwa +.",
                        "Rp. 18.000",R.drawable.janji_jiwa))
        partList.add(
                Data_makanan("Lapis Kukus Pahlawan",
                        "Lapis Kukus merupakan jajanan oleh - oleh khas surabaya yang wajib dibeli.\n\n" +
                                "Lapis kukus Pahlawan sendiri memiliki berbagai varian rasa ada ori,pandan,terang bulam,coklat dan masih banyak lagi\n\n" +
                                "Kalian Bisa membeli Lapis kukus di setiap gerai partner Lapis Kukus Pahlawan.",
                        "Rp. 40.000",R.drawable.lapis_kukus))
        partList.add(
                Data_makanan("Es Coklat Panjang Umur",
                        "Es Coklat Panjang umur merupakan kuliner yang legendaris sekali.\n\n" +
                                "Meski terkesan sederhana, kualitas es cokelat yang disajikan tidak bisa dipandang sebelah mata. Rasanya begitu menyegarkan, terutama ketika disantap siang hari\n\n" +
                                "Kalian Bisa membeli Es coklat panjang umur ini di Jalan Simokerto Nomor 49.",
                        "Rp. 10.000",R.drawable.es_coklat))
        partList.add(
                Data_makanan("Sate Ponorogo",
                        "Sate Ponorogo Pak seger merupakan salah satu kuliner legendaris.\n\n" +
                                "Ukuran dagingnya cukup besar. Gak cuma sate ayam, ada pula sate kambing, sate kulit, sate usus, dan sate jeroan. Biar makin lezat, kamu bisa menambahkan kerupuk, ada kerupuk udang, kerupuk bawang, dan kerupuk puli\n\n" +
                                "Kalian Bisa membeli Sate ini di Jalan Dharmawangsa Nomor 117, Kertajaya, Kecamatan Gubeng, Surabaya.",
                        "Rp. 30.000",R.drawable.sate_ponorogo))
        partList.add(
                Data_makanan("Spikoe",
                        "Spikoe Resep Kuno merupakan pengembangan bisnis Keluarga Santoso. Ceritanya, pada tahun 1976, kue spiku buatan Nyonya Santoso sangat berjaya.\n\n" +
                                "Resep turun menurun itulah yang membuat Spikoe menjadi oleh - oleh legendaris surabaya dengan resep kuno nya\n\n" +
                                "Kalian Bisa membeli Spikoe di Jl. Rungkut Madya No.41, Rungkut Kidul, Kec. Rungkut, Kota SBY.",
                        "Rp. 10.000",R.drawable.spikoe))
        return partList
    }
}