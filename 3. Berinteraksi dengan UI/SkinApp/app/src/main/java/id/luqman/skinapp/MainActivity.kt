package id.luqman.skinapp

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.luqman.skinapp.ui.theme.SkinAppTheme

data class SkinItem(
    val imageResId: Int,  // ID Gambar dari res/drawable
    val name: String,     // Nama Skin
    val category: String, // Kategori (Prime, Legend, dll)
    val price: String     // Poin
)

// Daftar koleksi skin.
val skinCatalog = listOf(
    SkinItem(R.drawable.skin_item_1, "Claude – Cosmic Blaze", "Prime", "1200 poin"),
    SkinItem(R.drawable.skin_item_2, "Gusion – Cosmic Gleam", "Legend", "3000 poin"),
    SkinItem(R.drawable.skin_item_3, "Alpha – Mecha-King Perseus", "Collector", "1500 poin")
)

// ACTIVITY UTAMA
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SkinAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SkinApp()
                }
            }
        }
    }
}

// TAMPILAN UTAMA (COMPOSABLE)
@Composable
fun SkinApp() {
    // Menyimpan urutan gambar saat ini. (Dimulai dari 0)
    var currentIndex by remember { mutableIntStateOf(0) }

    // Mengambil data spesifik berdasarkan nomor urut (index)
    val currentItem = skinCatalog[currentIndex]

    // Cek orientasi HP (Apakah sedang posisi miring / Landscape?)
    val isLandscape = LocalConfiguration.current.orientation == Configuration.ORIENTATION_LANDSCAPE

    // Logika tombol dibuat di sini agar tidak perlu ditulis berulang kali di bawah.
    val onPreviousClick = {
        // Jika di awal (0), lari ke paling belakang. Jika tidak, mundur 1.
        currentIndex = if (currentIndex == 0) skinCatalog.size - 1 else currentIndex - 1
    }

    val onNextClick = {
        // Maju 1. Tanda % memastikan jika sudah di ujung, dia kembali ke 0.
        currentIndex = (currentIndex + 1) % skinCatalog.size
    }

    // LAYOUT
    if (isLandscape) {
        // Layout HP Miring (Kiri: Gambar, Kanan: Info & Tombol)
        Row(
            modifier = Modifier.fillMaxSize().padding(24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // weight(1f) membagi layar sama rata (50% kiri, 50% kanan)
            Box(modifier = Modifier.weight(1f)) {
                SkinImageCard(imageRes = currentItem.imageResId)
            }
            Spacer(modifier = Modifier.width(24.dp))
            Column(modifier = Modifier.weight(1f)) {
                SkinInfoCard(item = currentItem)
                Spacer(modifier = Modifier.height(24.dp))
                NavButtons(onPrev = onPreviousClick, onNext = onNextClick)
            }
        }
    } else {
        // Layout HP Berdiri (Atas: Gambar, Tengah: Info, Bawah: Tombol)
        Column(
            modifier = Modifier.fillMaxSize().padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            SkinImageCard(imageRes = currentItem.imageResId)
            Spacer(modifier = Modifier.height(24.dp))
            SkinInfoCard(item = currentItem)
            Spacer(modifier = Modifier.height(24.dp))
            NavButtons(onPrev = onPreviousClick, onNext = onNextClick)
        }
    }
}

// Komponen Menampilkan Gambar
@Composable
fun SkinImageCard(imageRes: Int) {
    // Card otomatis memberikan efek sudut melengkung dan bayangan
    Card(
        modifier = Modifier.fillMaxWidth().height(300.dp)
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "Preview Skin",
            modifier = Modifier.fillMaxSize().padding(16.dp),
            contentScale = ContentScale.Fit // Memastikan gambar tidak terpotong
        )
    }
}

// Komponen Menampilkan Teks Detail
@Composable
fun SkinInfoCard(item: SkinItem) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF1F8F6)) // Warna khusus
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = item.name,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2C3E50)
            )
            Spacer(modifier = Modifier.height(4.dp)) // Jarak kecil antara judul dan kategori
            Text(
                text = "${item.category} • ${item.price}", // Menggabungkan 2 teks jadi 1 baris
                fontSize = 16.sp,
                color = Color(0xFF27AE60),
                fontWeight = FontWeight.Medium
            )
        }
    }
}

// Komponen Menampilkan Tombol Navigasi
@Composable
fun NavButtons(onPrev: () -> Unit, onNext: () -> Unit) {
    // spacedBy(16.dp) otomatis memberi jarak antar elemen di dalam Row
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Button(
            onClick = onPrev,
            modifier = Modifier.weight(1f) // 50% ruang
        ) {
            Text("Sebelumnya")
        }
        Button(
            onClick = onNext,
            modifier = Modifier.weight(1f) // 50% ruang
        ) {
            Text("Selanjutnya")
        }
    }
}