package com.example.toko

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeCustomerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(
            R.layout.fragment_home_customer,
            container,
            false
        )

        val rvProduk = view.findViewById<RecyclerView>(R.id.rvProduk)
        rvProduk.layoutManager = LinearLayoutManager(requireContext())

        val listProduk = listOf(
            Produk("Alpukat", "Rp. 3.000 / kg", "Lemonilo", R.drawable.ic_launcher_foreground),
            Produk("Kentang", "Rp. 3.000 / kg", "Lemonilo", R.drawable.ic_launcher_foreground),
            Produk("Kangkung", "Rp. 3.000 / kg", "Lemonilo", R.drawable.ic_launcher_foreground),
            Produk("Apel", "Rp. 3.000 / kg", "Lemonilo", R.drawable.ic_launcher_foreground),
            Produk("Jeruk", "Rp. 3.000 / kg", "PKWT Anggajaya", R.drawable.ic_launcher_foreground)
        )

        rvProduk.adapter = ProdukAdapter(listProduk)

        return view
    }
}