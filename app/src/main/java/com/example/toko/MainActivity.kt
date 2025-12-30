package com.example.toko

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. Menghubungkan ke layout yang benar
        setContentView(R.layout.activity_rekap_transaksi)

        // 2. Inisialisasi Spinner (Filter "Semua")
        val spinnerStatus = findViewById<Spinner>(R.id.spinnerStatus)
        val listStatus = arrayOf("Semua", "Berhasil", "Pending", "Gagal")

        // Membuat adapter menggunakan layout bawaan Android
        val adapterSpinner = ArrayAdapter(this, android.R.layout.simple_spinner_item, listStatus)
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

// Menghubungkan adapter ke Spinner
        spinnerStatus.adapter = adapterSpinner

        // 3. Inisialisasi RecyclerView (Daftar Transaksi)
        val rvTransaksi = findViewById<RecyclerView>(R.id.rvTransaksi)
        rvTransaksi.layoutManager = LinearLayoutManager(this)

        // 4. Menyiapkan Data sesuai Gambar Target (image_34b9cd.png)
        // Kita buat data yang banyak (misal 10) agar list bisa di-scroll
        val listData = mutableListOf<Transaksi>()
        repeat(10) {
            listData.add(
                Transaksi(
                    "#00010101202502",
                    "Luqmanul Hakim",
                    "Rp. 60,000",
                    "01 Jan 2025",
                    "1 Item"
                )
            )
        }

        // 5. Menghubungkan Data ke Adapter
        rvTransaksi.adapter = TransaksiAdapter(listData)
    }
}