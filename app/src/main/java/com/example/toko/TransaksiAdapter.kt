package com.example.toko

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransaksiAdapter(private val list: List<Transaksi>) :
    RecyclerView.Adapter<TransaksiAdapter.ViewHolder>() {

    // Tambahkan interface untuk menangani klik jika diperlukan nanti
    private var onItemClickCallback: OnItemClickCallback? = null

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Transaksi)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Pastikan ID ini sesuai dengan item_transaksi.xml Anda
        val tvNomorNama: TextView = view.findViewById(R.id.tvNomorNama)
        val tvHarga: TextView = view.findViewById(R.id.tvHarga)
        val tvTanggal: TextView = view.findViewById(R.id.tvTanggal)
        val tvItem: TextView = view.findViewById(R.id.tvTotalItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_transaksi, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]

        // Mengatur teks dengan format yang rapi
        holder.tvNomorNama.text = "${data.nomor} - ${data.nama}"
        holder.tvHarga.text = data.harga
        holder.tvTanggal.text = data.tanggal
        holder.tvItem.text = data.item

        // Menangani klik pada item
        holder.itemView.setOnClickListener {
            onItemClickCallback?.onItemClicked(list[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int = list.size
}