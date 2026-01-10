package com.example.toko

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProdukAdapter(
    private val listProduk: List<Produk>
) : RecyclerView.Adapter<ProdukAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgProduk: ImageView = view.findViewById(R.id.imgProduk)
        val txtNama: TextView = view.findViewById(R.id.txtNama)
        val txtHarga: TextView = view.findViewById(R.id.txtHarga)
        val txtToko: TextView = view.findViewById(R.id.txtToko)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_produk, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produk = listProduk[position]
        holder.txtNama.text = produk.nama
        holder.txtHarga.text = produk.harga
        holder.txtToko.text = produk.toko
        holder.imgProduk.setImageResource(produk.gambar)
    }

    override fun getItemCount(): Int = listProduk.size
}