package com.example.toko.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.toko.R
import com.example.toko.model.Keranjang

class KeranjangAdapter(
    private val list: MutableList<Keranjang>
) : RecyclerView.Adapter<KeranjangAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNama: TextView = view.findViewById(R.id.tvNamaProduk)
        val tvHarga: TextView = view.findViewById(R.id.tvHargaProduk)
        val tvJumlah: TextView = view.findViewById(R.id.tvJumlah)
        val btnTambah: Button = view.findViewById(R.id.btnTambah)
        val btnKurang: Button = view.findViewById(R.id.btnKurang)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_keranjang_customer, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.tvNama.text = item.nama
        holder.tvJumlah.text = item.jumlah.toString()
        holder.tvHarga.text = "Rp ${item.harga * item.jumlah}/Kg"

        holder.btnTambah.setOnClickListener {
            item.jumlah++
            notifyItemChanged(position)
        }

        holder.btnKurang.setOnClickListener {
            if (item.jumlah > 1) {
                item.jumlah--
                notifyItemChanged(position)
            }
        }
    }

    override fun getItemCount(): Int = list.size
}