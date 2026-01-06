package com.example.toko

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.toko.HomeCustomerActivity
import com.google.android.material.imageview.ShapeableImageView

class Akun : AppCompatActivity() {

    // Deklarasi variabel untuk view
    private lateinit var imgProfile: ShapeableImageView
    private lateinit var btnUploadImage: View

    // 1. Launcher untuk membuka galeri foto
    private val getImage = registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        uri?.let {
            // Menampilkan gambar yang dipilih ke ImageView profil
            imgProfile.setImageURI(it)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun_tab_pembelian)

        // Inisialisasi View
        imgProfile = findViewById(R.id.imgProfile)
        btnUploadImage = findViewById(R.id.btnUploadImage)

        // --- LOGIKA UPLOAD GAMBAR ---
        btnUploadImage.setOnClickListener {
            // Membuka galeri untuk memilih file gambar
            getImage.launch("image/*")
        }

        // --- NAVIGASI BOTTOM BAR ---

        // 1. Navigasi ke Home
        findViewById<LinearLayout>(R.id.btnNavHome).setOnClickListener {
            startActivity(Intent(this, HomeCustomerActivity::class.java))
            finish()
        }

        // 2. Navigasi ke Transaksi
        findViewById<LinearLayout>(R.id.btnNavTransaksi).setOnClickListener {
            startActivity(Intent(this, Transaksi::class.java))
            finish()
        }

        // 3. Navigasi ke Etalase
        findViewById<LinearLayout>(R.id.btnNavEtalase).setOnClickListener {
            // startActivity(Intent(this, EtalaseActivity::class.java))
            // finish()
        }

        // 4. Navigasi ke Verifikasi
        findViewById<LinearLayout>(R.id.btnNavVerifikasi).setOnClickListener {
            // startActivity(Intent(this, VerifikasiActivity::class.java))
            // finish()
        }

        // Catatan: btnNavAkun tidak perlu listener karena sudah di halaman Akun
    }
}