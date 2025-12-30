package com.example.toko

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Transaksi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rekap_transaksi)

        // 1. Inisialisasi semua tombol navigasi dari XML
        val btnHome = findViewById<LinearLayout>(R.id.btnNavHome)
        val btnTransaksi = findViewById<LinearLayout>(R.id.btnNavTransaksi)
        val btnEtalase = findViewById<LinearLayout>(R.id.btnNavEtalase)
        val btnVerifikasi = findViewById<LinearLayout>(R.id.btnNavVerifikasi)
        val btnAkun = findViewById<LinearLayout>(R.id.btnNavAkun)

        // 2. Logika Klik Tombol

        // Kembali ke Home
        btnHome.setOnClickListener {
            // Jika Home adalah activity utama, cukup gunakan finish()
            finish()
        }

        // Sudah di halaman Transaksi (Tidak perlu pindah)
        btnTransaksi.setOnClickListener {
            // Anda bisa menambahkan fungsi refresh data di sini jika mau
        }

        // Pindah ke halaman Etalase
        btnEtalase.setOnClickListener {
            // Ganti 'EtalaseActivity' dengan nama file Activity Etalase Anda
            // val intent = Intent(this, EtalaseActivity::class.java)
            // startActivity(intent)
        }

        // Pindah ke halaman Verifikasi
        btnVerifikasi.setOnClickListener {
            // val intent = Intent(this, VerifikasiActivity::class.java)
            // startActivity(intent)
        }

        // Pindah ke halaman Akun
        btnAkun.setOnClickListener {
            // Ganti 'AkunActivity' dengan nama file Activity Akun Anda
            // val intent = Intent(this, AkunActivity::class.java)
            // startActivity(intent)
            // finish() // Tambahkan ini jika tidak ingin user menumpuk banyak halaman
        }
    }
}