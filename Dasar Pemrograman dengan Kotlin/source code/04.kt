/*
fun main() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

---

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

---

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

---

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

---

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

---

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

---

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

---

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

---

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

---

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

---

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

---
*/

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