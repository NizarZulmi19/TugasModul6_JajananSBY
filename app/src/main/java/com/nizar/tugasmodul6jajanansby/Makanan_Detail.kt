package com.nizar.tugasmodul6jajanansby

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.isi_makanan.*

class Makanan_Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.isi_makanan)

        var intentThatStartedThisActivity = getIntent()


        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partNama = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partDesc = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_COMPONENT_NAME)
            var partHarga = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            val partFoto = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER)
                ?.toInt()
            namajajan2.text = partNama
            descjajan.text = partDesc
            harga.text = partHarga
            if (partFoto != null) {
                imgjajan2.setImageResource(partFoto)
            }
        }
    }
}