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

- **Deklarasi variabel**

```bash
// count adalah nama variabel
// Int adalah jenis data dari variabel tersebut
// angka 2 adalah nilai awal dari variabel tersebut.
fun main() {
    val count: Int = 2
    println(count)
}
```
```teks
2
```

- **Menggunakan variabel**

```bash
// println(count) mencetak variabel count ke output:
fun main() {
    val count: Int = 2
    println(count)
}
```
```teks
2
```

- **Menggunakan template string**

```bash
// disini $count yang berisi 2 diganti menjadi string sehingga ketika dijalankan akan mencetak isi vvariabel
fun main() {
    val count: Int = 2
    println("You have $count unread messages.")
}
```
```teks
You have 2 unread messages.
```

- **Mengubah nilai awal variabel**

```bash
// baris println() tetap berjalan dengan ketika saya rubah nilai awal nya 
fun main() {
    val count: Int = 10
    println("You have $count unread messages.")
}
```
```teks
You have 10 unread messages.
```

- **Menncoba operasi matematika dasar dengan bilangan bulat**

```bash
// ${unreadCount + readCount} menjumlahkan isi variabelnya kemudian dicetak dalam bentuk string
fun main() {
    val unreadCount = 7
    val readCount = 60
    println("You have ${unreadCount + readCount} total messages in your inbox.")
}
```
```teks
You have 67 total messages in your inbox.
```

- **Mencoba dengan variabel yang berbeda**

```bash
// 
fun main() {
    val numberOfPhotos = 85
    val photosEdited = 70
    println("$numberOfPhotos photos")
    println("$photosEdited photos edited")
    println("${numberOfPhotos - photosEdited} photos left")
}
```
```teks
85 photos
70 photos edited
15 photos left
```

- **Memperbarui variabel**

```bash
/*fun main() {
    val cartTotal = 0 // 'val' cannot be reassigned.
    cartTotal = 20
    println("Total: $cartTotal")
}*/

// val tidak bisa diperbarui/diubah nilainya, makanya disini menggunakan var untuk memperbarui nilai variabel
fun main() {
    var cartTotal = 0 // nilai awal variabel
    println("Total: $cartTotal")

    cartTotal = 20 // nilai baru variabel
    println("Total: $cartTotal")
}
```
```teks
Total: 0
Total: 20
```

- **Operator penambahan dan pengurangan**
- penambahan
```bash
/*
fun main() {
    val count: Int = 10 // val tidak bisa diubah nilainya
    println("You have $count unread messages.")
}

// disini dirubah menggunakan var karena akan dilakukan penambahan
fun main() {
    var count = 10 // nilai awal
    println("You have $count unread messages.")
    count = count + 1 // nilai awal ditambah 1
    println("You have $count unread messages.")
}*/

fun main() {
    var count = 10
    println("You have $count unread messages.")
    count++ // fungsinya sama saja dengan ditambah 1
    println("You have $count unread messages.")
}
```
```teks
You have 10 unread messages.
You have 11 unread messages.
```

- pengurangan
```bash
fun main() {
    var count = 10
    println("You have $count unread messages.")
    count-- // kalau ini fungsinya dikurangi 1
    println("You have $count unread messages.")
}
```
```teks
You have 10 unread messages.
You have 9 unread messages.
```

- **Mempelajari jenis data lainnya**
- Ganda

```bash
/*
fun main() {
    val trip1: Double = 3.20 //trip1 memiliki nilai tetap 3.20
    val trip2: Double = 4.10 //trip2 memiliki nilai tetap 4.10
    val trip3: Double = 1.72 //trip3 memiliki nilai tetap 1.72
    val totalTripLength: Double = 0.0 // //totalTripLength memiliki nilai tetap 0.0
    println("$totalTripLength miles left to destination") // disini yang dicetak hanya variabel totalTripLength 
}

fun main() {
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength: Double = trip1 + trip2 + trip3 // disini variabel totalTripLength nilainya dirubah dengan menjumlah semua trip 
    println("$totalTripLength miles left to destination")
}*/

// menghapus jenis data Double yang tidak perlu, dan kode menjadi lebih sederhana
fun main() {
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
}
```
```teks
9.02 miles left to destination
```

- String

```bash
/*
fun main() {
    val nextMeeting = "Next meeting:" // variabel nextMeeting dan date berisi string
    val date = "January 1"
    val reminder = nextMeeting + date // kedua variabel tersebut digabungkan disini 
    println(reminder) // disini dicetak dengan output "Next meeting:January 1"
}

fun main() {
    val nextMeeting = "Next meeting: " // disini saya tambah spasi sebelum tanda kutip penutup
    val date = "January 1"
    val reminder = nextMeeting + date
    println(reminder) // outputnya "Next meeting: January 1"
}

fun main() {
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work" // at work menggunakan tanda kutip karena bukan variabel
    println(reminder)
}*/

fun main() {
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work \"FO UTDI\""
    // ketika perlu tanda kutip di dalam string maka harus ditambah garis miring terbalik sebelum tanda petik ganda
    println(reminder)
}
```
```teks
Next meeting: January 1 at work "FO UTDI"
```

- Boolean

```bash
/*
fun main() {
    val notificationsEnabled: Boolean = true // notificationsEnabled adalah variabel boolean dengan inisialisasi true
    println(notificationsEnabled)
}

fun main() {
    val notificationsEnabled: Boolean = false // disini nilainya diganti dengan false
    println(notificationsEnabled)
}*/

fun main() {
    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)
    // disini eksekusi variabelnya bisa disambung dengan string
}
```
```teks
Are notifications enabled? false
```

- **Memberi komentar di kode**

```bash
/*
 * ini adalah contoh komentar multi-baris
 * yang mana harus ditambah tanda bintang di awal setiap baris baru dikomentar
 * dan diakhiri simbol tanda bintang dan garis miring
 */
fun main() {
    // kalau ini contoh komentar ditengah baris kode
    var count = 10
    println("You have $count unread messages.")

    // nah komentar komentar ini tidak ikut dieksekusi ketika kode dijalankan
    count--
    println("You have $count unread messages.")
}
```

- **Ringkasan**
    - Variabel adalah penampung untuk satu bagian data.
    - Anda harus mendeklarasikan variabel terlebih dahulu sebelum menggunakannya.
    - Gunakan kata kunci val untuk menentukan variabel yang bersifat hanya baca jika tempat nilai tidak dapat berubah setelah ditetapkan.
    - Gunakan kata kunci var untuk menentukan variabel yang dapat diubah atau diubah.
    - Di Kotlin, sebaiknya gunakan val daripada var jika memungkinkan.
    - Untuk mendeklarasikan variabel, mulai dengan kata kunci val atau var. Kemudian, tentukan nama variabel, jenis data, dan nilai awal. Misalnya: val count: Int = 2.
    - Dengan inferensi jenis, hilangkan jenis data dalam deklarasi variabel jika nilai awal diberikan.
    - Beberapa jenis data Kotlin dasar yang umum mencakup: Int, String, Boolean, Float, dan Double.
    - Gunakan operator penetapan (=) untuk menetapkan nilai ke variabel selama deklarasi variabel atau memperbarui variabel.
    - Anda hanya dapat memperbarui variabel yang telah dideklarasikan sebagai variabel yang dapat diubah (dengan var).
    - Gunakan operator penambahan (++) atau operator pengurangan (--) untuk menambah atau mengurangi nilai variabel bilangan bulat masing-masing sebesar 1.
    - Gunakan simbol + untuk menyambungkan string menjadi satu. Anda juga dapat menyambungkan variabel dari jenis data lain seperti Int dan Boolean ke Strings.

---

### 3. Membuat dan menggunakan fungsi di Kotlin

- **Menentukan dan Memanggil fungsi**

```bash
fun main() { // fungsi utama, pertama kali dijalankan
    birthdayGreeting() // memanggil fungsi birthdayGreeting untuk dijalankan
}

fun birthdayGreeting() { // fungsi baru untuk menampilkan ucapan
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}
```
```teks
Happy Birthday, Rover!
You are now 5 years old!
```

- **Menambahkan parameter ke fungsi birthdayGreeting()**

```bash
fun birthdayGreeting(name: String): String { // menambah parameter name dari jenis String
    val nameGreeting = "Happy Birthday, $name!" // rover diganti dengan parameter $name
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun main() {
    println(birthdayGreeting("Rover")) // disini lah nilai parameter $name diisi
    println(birthdayGreeting("Gwen")) // birthdayGreeting() bisa dipanggil lagi dengan nama/argumen yang berbeda
}
```
```teks
Happy Birthday, Rover!
You are now 5 years old!
Happy Birthday, Gwen!
You are now 5 years old!
```

- **Fungsi dengan beberapa parameter**

```bash
fun birthdayGreeting(name: String, age: Int): String {
    // menambah parameter age dengan jenis Int dan harus dipisahkan menggunakan koma dengan parameter sebelumnya
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!" // parameter age digunakan disini
    return "$nameGreeting\n$ageGreeting"
}

fun main() {
    // memanggil fungsi dengan mengirimkan nama dan umur yang berbeda
    println(birthdayGreeting("Rover", 5))
    println(birthdayGreeting("Gwen", 2))
}
```
```teks
Happy Birthday, Rover!
You are now 5 years old!
Happy Birthday, Gwen!
You are now 2 years old!
```

- **Argumen yang dinamai**

```bash
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun main() {
    // menggunakan argumen yang dinamai
    println(birthdayGreeting(name = "Rover", age = 5))
    // argumen yang dinamai ini bisa dibalik karena sudah menyebut nama parameternya
    println(birthdayGreeting(age = 2, name = "Gwen"))
}
```
```teks
Happy Birthday, Rover!
You are now 5 years old!
Happy Birthday, Gwen!
You are now 2 years old!
```

- **Argumen default**

```bash
// nilai default paramater name sekarang adalah Rover
fun birthdayGreeting(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}

/*fun main() {
    // disini Rover akan dicetak (default) karena saya tidak menentukan namanya
    println(birthdayGreeting(age = 5))
    // dan untuk Gwen akan dicetak karena masih menggunakan nilai Gwen
    println(birthdayGreeting("Gwen", 2))
}*/

fun main() {
    // sekarang kedua panggilan untuk birthdayGreeting() mencetak "Rover"
    // karena tidak ada argumen nama yang diteruskan
    println(birthdayGreeting(age = 5))
    println(birthdayGreeting(age = 2))
}
```
```teks
Happy Birthday, Rover! You are now 5 years old!
Happy Birthday, Rover! You are now 2 years old!
```

- **Ringkasan**
    - Fungsi ditetapkan dengan kata kunci fun dan berisi bagian kode yang dapat digunakan kembali.
    - Fungsi membantu membuat program yang lebih besar menjadi lebih mudah dikelola dan mencegah pengulangan kode yang tidak perlu.
    - Fungsi dapat menampilkan nilai yang dapat Anda simpan dalam variabel untuk digunakan di lain waktu.
    - Fungsi dapat menggunakan parameter, yaitu variabel yang tersedia di dalam isi fungsi.
    - Argumen adalah nilai yang Anda teruskan saat memanggil fungsi.
    - Anda dapat memberi nama argumen saat memanggil fungsi. Saat menggunakan argumen yang dinamai, Anda dapat menyusun ulang argumen tanpa memengaruhi output.
    - Anda dapat menentukan argumen default yang memungkinkan Anda menghilangkan argumen saat memanggil fungsi.

---

### 4. Soal Latihan: Dasar-Dasar Kotlin

- **Mencetak pesan**

```bash
fun main() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}
```
```teks
Use the val keyword when the value doesn't change.
Use the var keyword when the value can change.
When you define a function, you define the parameters that can be passed to it.
When you call a function, you pass arguments for the parameters.
```

- **Memperbaiki error kompilasi**

```bash
/*fun main() { 
    println("New chat message from a friend'}
    // Syntax error: Expecting '"'.
    // Syntax error: Expecting ')'.
}*/

// kode sebelumnya mengalami error karena penutup pesannya menggunakan tanda kutip biasa bukan ganda
// lalu penutup println seharusnya kurung kurawal bukan kurung biasa
fun main() { 
    println("New chat message from a friend")
}
```
```teks
New chat message from a friend
```

- **Template string**

```bash
/*fun main() {
    val discountPercentage: Int = 0 // 'val' cannot be reassigned.
    val offer: String = "" // 'val' cannot be reassigned.   
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}*/

fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    // karena variabel discountPercentage dan offer nilainya akan diperbarui nantinya
    // maka tidak bisa menggunakan val, harus menggunakan var
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}
```
```teks
Sale - Up to 20% discount on Google Chromecast! Hurry up!
```

- **Penyambungan string**

```bash
/*fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
    // kode akan mencetak parameter $total berupa 2030, kenapa bukan 50
    // karena inisialisasi nilainya menggunakan cara inisialisasi string yang menggunakan tanda kutip ganda
}*/

fun main() {
    // disini kedua variabel yang disambung sudah saya rubah cara inisialisasinya
    // sesuai dengan cara inisialisasi Int tanpa menggunakan tanda kutip ganda
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
```
```teks
The total party size is: 50
```

- **Pemformatan pesan**

```bash
/*fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    // jika nilai totalSalary diambil dari 2 variabel sebelumnya
    // maka cukup panggil nama variabelnya saja dengan menjumlahkannya
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}*/

fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    // jika memanggil 2 variabelnya menggunakan tanda kutip ganda dan simbol dolar
    // maka akan dianggap sebagai string yang dijumlahkan, bukan Int
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
```
```teks
Congratulations for your bonus! You will receive a total of 6000 (additional bonus).
```

- **Mengimplementasikan operasi matematika dasar**

- langkah 1

```bash
/*fun main() {
    val firstNumber = 10
    val secondNumber = 5
    
    println("$firstNumber + $secondNumber = $result")
    // Unresolved reference 'result'.
}*/

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    
    // kode sebelumnya bermasalah karena ketika memanggil variabel result
    // result belum dideklarasikan, makanya tidak ditemukan referensinya
    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
}
```
```teks
10 + 5 = 15
```

- langkah 2

```bash
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    // memanggil fungsi add untuk menjumlahkan dua angka
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// fungsi ini untuk menjumlahkan 2 angka
fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}
```
```teks
10 + 5 = 15
10 + 8 = 18
```

- langkah 3

```bash
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = subtrack(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

// fungsi ini untuk mengurangi 2 angka
fun subtrack(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}
```
```teks
10 + 5 = 15
10 - 8 = 2
```

- **Parameter default**

```bash
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // memanggil fungsi hanya dengan emailId
    // operatingSystem tidak diisi, jadi menggunakan nilai default "Unknown OS"
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    // memanggil fungsi dengan 2 argumen (urutan sesuai parameter)
    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    // memanggil fungsi dengan 2 argumen lagi
    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

// fungsi dengan parameter default
// operatingSystem punya nilai default "Unknown OS"
fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}
```
```teks
There is a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.

There is a new sign-in request on Windows for your Google Account user_two@gmail.com.

There is a new sign-in request on Mac OS for your Google Account user_three@gmail.com.
```

- **Pedometer**

```bash
fun main() {
    // penamaan variabel menggunakan standar kotlin
    // yang awalnya Steps (huruf besar di awal) saya ganti dengan steps
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories") 
}

// nam fungsinya juga saya ganti yang awalnya PEDOMETERstepsTOcalories menjadi pedometerStepsToCalories
// agar lebih rapi, mudah dibaca, dan mengikuti standar kotlin
fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}
```
```teks
Walking 4000 steps burns 160.0 calories
```

- **Membandingkan dua angka**

```bash
fun main() {
    // memanggil fungsi compareTime dengan berbagai nilai
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
    // 300 > 250 → hasilnya true

    println("Have I spent more time using my phone today: ${compareTime(300, 300)}")
    // 300 = 300 → hasilnya false (karena tidak lebih besar)

    println("Have I spent more time using my phone today: ${compareTime(200, 220)}")
    // 200 < 220 → hasilnya false
}

// fungsi untuk membandingkan waktu penggunaan hari ini dan kemarin
fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday 
    // mengembalikan true jika hari ini lebih lama, selain itu false
}
```
```teks
Have I spent more time using my phone today: true
Have I spent more time using my phone today: false
Have I spent more time using my phone today: false
```

- **Memindahkan kode duplikat ke fungsi**

```bash
/* untuk kode ini contoh jika menulisnya tanpa fungsi jadi kurang efisien dan resiko error
fun main() {
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()
    
    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()
    
    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
}*/

// agar tidka mengulang kode disini saya cukup memanggil fungsi untuk setiap kota 
fun main() {
    printWeatherForCity("Ankara", 27, 31, 82)
    printWeatherForCity("Tokyo", 32, 36, 10)
    printWeatherForCity("Cape Town", 59, 64, 2)
    printWeatherForCity("Guatemala City", 50, 55, 7)
}

// ini fungsi untuk menampilkan data cuacanya
fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $cityName") // menampilkan nama kota
    println("Low temperature: $lowTemp, High temperature: $highTemp") // suhu
    println("Chance of rain: $chanceOfRain%") // peluang hujan
    println() // baris kosong sebagai pemisah
}
```
```teks
City: Ankara
Low temperature: 27, High temperature: 31
Chance of rain: 82%

City: Tokyo
Low temperature: 32, High temperature: 36
Chance of rain: 10%

City: Cape Town
Low temperature: 59, High temperature: 64
Chance of rain: 2%

City: Guatemala City
Low temperature: 50, High temperature: 55
Chance of rain: 7%
```