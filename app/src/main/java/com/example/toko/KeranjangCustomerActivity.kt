class KeranjangCustomerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keranjang_customer)

        val rvKeranjang = findViewById<RecyclerView>(R.id.rvKeranjang)
        val tvTotalHarga = findViewById<TextView>(R.id.tvTotalHarga)

        val data = mutableListOf(
            Keranjang("Kentang", 10000),
            Keranjang("Wortel", 8000),
            Keranjang("Tomat", 6000)
        )

        rvKeranjang.layoutManager = LinearLayoutManager(this)
        rvKeranjang.adapter = KeranjangAdapter(data)

        val total = data.sumOf { it.harga * it.jumlah }
        tvTotalHarga.text = "Rp $total"
    }
}