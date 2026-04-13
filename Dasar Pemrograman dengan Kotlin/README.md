## Dasar Pemrograman dengan Kotlin
Dalam laporan "**Dasar Pemrograman dengan Kotlin**" ini, saya merangkum proses belajar dan eksperimen langsung saya menggunakan bahasa Kotlin. Isinya saya buat to the point, mulai dari pemahaman konsep dasar sampai praktik penulisan kode yang rapi dan efisien. Karena saya lebih suka learning by doing, laporan ini lebih banyak fokus ke praktik pemecahan masalah ketimbang sekadar teori panjang lebar. Harapannya, catatan ini bisa jadi fondasi yang kuat buat saya atau siapa pun yang baca untuk mulai bikin program yang lebih kompleks ke depannya.

---

### 1. Program Pertama di Kotlin

- **Menjalankan program pertama**

```bash
fun main() {
    println("Hello, Android!")
}
```
```teks
Hello, Android!
```

- **Memodifikasi program**

```bash
fun main() {
    println("Hello, Android!")
    println("Hello, Android!")
}
```
```teks
Hello, Android!
Hello, Android!
```

- **Memperbaiki error**

```bash
/*fun main() {
    println("Today is sunny!) //Syntax error: Expecting '"'. Syntax error: Expecting ')'.
}*/

fun main() {
    println("Today is sunny!") //Saya mambahkan tanda kutip penutup setelah tanda seru, sebelum tanda kurung penutup.
}
```
```teks
Today is sunny!
```

- **Latihan 1: Menebak Output**

```bash
// disini program dijalankan sesuai urutan baris dari atas ke bawah jadi tebakan saya outputnya angka 123 dari atas ke bawah
fun main() {
    println("1")
    println("2")
    println("3")
}
```
```teks
1
2
3
```

- **Latihan 2: Menampilkan Pesan Beberapa Baris**

```bash
// karena perintag latihan kalimatnya ditulis terpisah setiap baris jadi saya tulis dengan memisahkannya
fun main() {
    println("I'm")
    println("learning")
    println("Kotlin!")
}
```
```teks
I'm
learning
Kotlin!
```

- **Latihan 3: Memperbaiki Urutan**

```bash
/*fun main() {
    println("Tuesday")
    println("Thursday")
    println("Wednesday")
    println("Friday")
    println("Monday")
}*/

// saya memperbaiki urutan baris kode agar output sesuai dengan perintah latihan
fun main() {
    println("Monday")
    println("Tuesday")
    println("Wednesday")
    println("Thursday")
    println("Friday")
}
```
```teks
Monday
Tuesday
Wednesday
Thursday
Friday
```

- **Latihan 4: Memperbaiki Error Sintaksis**

```bash
/*fun main() {
    println("Tomorrow is rainy") // Syntax error: Expecting '}'.
*/

// saya menambah kurung kurawal penutup untuk mengakhiri blok fungsi
fun main() {
    println("Tomorrow is rainy")
}
```
```teks
Tomorrow is rainy
```

- **Latihan 5: Memperbaiki Referensi**

```bash
/*fun main() {
    printLine("There is a chance of snow") // Unresolved reference 'printLine'.
}*/

// disini printLine tidak dikenali oleh referensi yang mana seharusnya println
fun main() {
    println("There is a chance of snow")
}
```
```teks
There is a chance of snow
```

- **Latihan 6: Memperbaiki Format Penulisan**

```bash
/*fun main() {
    println("Cloudy") println("Partly Cloudy") println("Windy") // Unresolved reference 'println'.
}*/

// disini seharusnya diberi titik koma jika kode ingin diekseskusi dalam 1 baris, namun sebaiknya setiap statement terpisah sesuai barisnya agar mudah dibaca
fun main() {
    println("Cloudy")
    println("Partly Cloudy")
    println("Windy")
}
```
```teks
Cloudy
Partly Cloudy
Windy
```

- **Latihan 7: Memperbaiki Deklarasi Fungsi**

```bash
/*fun main() (
    println("How's the weather today?") // Function 'main' must have a body. Syntax error: Expecting a top level declaration.
)*/

// disini saya mengganti kurung biasa dngan kurung kurawal untuk mendefinisikan body
fun main() {
    println("How's the weather today?")
}
```
```teks
How's the weather today?
```

- **Ringkasan**
    - Program Kotlin memerlukan fungsi **main** sebagai titik entri program.
    - Untuk menentukan fungsi di Kotlin, gunakan kata kunci **fun**, diikuti dengan nama fungsi, input apa pun yang diapit tanda kurung, diikuti dengan isi fungsi yang diapit tanda kurung kurawal.
    - Nama fungsi harus mengikuti konvensi camel case dan dimulai dengan huruf kecil.
    - Gunakan panggilan fungsi **println()** untuk mencetak beberapa teks ke output.
    - Lihat panduan gaya Kotlin untuk pemformatan dan konvensi kode yang harus diikuti saat membuat coding di Kotlin.
    - Pemecahan masalah adalah proses penyelesaian error dalam kode Anda.

---

### 2. Membuat dan menggunakan variabel di Kotlin