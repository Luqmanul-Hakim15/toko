package com.example.toko.model

data class Keranjang(
    val nama: String,
    val harga: Int,
    var jumlah: Int = 1
)