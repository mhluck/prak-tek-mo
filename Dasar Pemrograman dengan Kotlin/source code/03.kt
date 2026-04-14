/*
fun main() { // fungsi utama, pertama kali dijalankan
    birthdayGreeting() // memanggil fungsi birthdayGreeting untuk dijalankan
}

fun birthdayGreeting() { // fungsi baru untuk menampilkan ucapan
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

---

fun birthdayGreeting(name: String): String { // menambah parameter name dari jenis String
    val nameGreeting = "Happy Birthday, $name!" // rover diganti dengan parameter $name
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun main() {
    println(birthdayGreeting("Rover")) // disini lah nilai parameter $name diisi
    println(birthdayGreeting("Gwen")) // birthdayGreeting() bisa dipanggil lagi dengan nama/argumen yang berbeda
}

---

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

---

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

---
*/


// nilai default paramater name sekarang adalah Rover
fun birthdayGreeting(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}

/*fun main() {
    // disini Rover akan dicetak (default) karena saya tidak menentukan namanyaa
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

