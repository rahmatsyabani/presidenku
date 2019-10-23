package com.apkrahmat.presidenku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview =  findViewById<ListView>(R.id.listView)
        var list = mutableListOf<model>()

        list.add(model("Ir soekarno", "Presiden Pertama", R.drawable.skr))
        list.add(model("Soeharto", "Presiden Kedua", R.drawable.shr))
        list.add(model("BJ Habibie", "Presiden Ketiga", R.drawable.hbb))
        list.add(model("Abdurrahman Wahid", "Presiden Keempat", R.drawable.gsd))
        list.add(model("Megawati", "Presiden Kelima", R.drawable.mga))
        list.add(model("Susilo Bambang Yudhoyono", "Presiden Keenam", R.drawable.sby))
        list.add(model("Joko Widodo", "Presiden Ketujuh", R.drawable.jkw))

        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0 ){
                Toast.makeText(this@MainActivity, "Ir Soekarno adalah Presiden no 1. Lahir pada 6 Juni 1901 di Blitar, Jawa Timur. Meninggal : 21 Juni 1970 . ", Toast.LENGTH_LONG).show()
            }
            if (position == 1 ){
                Toast.makeText(this@MainActivity, "Haji Muhammad Soeharto. adalah Presiden no 2. lahir pada, 8 Juni 1921, di Kemusuk, Yogyakarta .", Toast.LENGTH_LONG).show()
            }
            if (position == 2 ){
                Toast.makeText(this@MainActivity, "BJ Habibie. adalah Presiden no 3. Lahir pada, 25 juni 1936 lahir di Parepare", Toast.LENGTH_LONG).show()
            }
            if (position == 3 ){
                Toast.makeText(this@MainActivity, "KH. Abdurrahman Wahid .adalah Presiden no4. Lahir pada , 04 Agustus 1940 di Jombang Jatim ", Toast.LENGTH_LONG).show()
            }
            if (position == 4 ){
                Toast.makeText(this@MainActivity, "Megawati Soekarno Putri. adalah Presiden no 5. Lahir pada  Lahir pada, 23 Januari 1947 di Yogyakarta ", Toast.LENGTH_LONG).show()
            }
            if (position == 5 ){
                Toast.makeText(this@MainActivity, "Susilo Bambang Yudhoyono SBY. Presiden adalah Presiden no 6.Lahir pada  9 September 1949 di Remas, Arjosari, Pacitan, Jawa Timur", Toast.LENGTH_LONG).show()
            }
            if (position == 6 ){
                Toast.makeText(this@MainActivity, "Jokowi .adalah Presiden no 7. Lahir pada, 21 Juni 1961 di Surakarta", Toast.LENGTH_LONG).show()
            }
        }
    }
}