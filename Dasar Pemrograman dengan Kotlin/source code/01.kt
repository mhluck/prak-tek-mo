fun main() {
    println("Hello, Android!")

    println("Hello, Android!")
    println("Hello, Android!")

    /*fun main() {
        println("Today is sunny!) //Syntax error: Expecting '"'. Syntax error: Expecting ')'.
    }*/

    println("Today is sunny!") //Saya mambahkan tanda kutip penutup setelah tanda seru, sebelum tanda kurung penutup.

    // disini program dijalankan sesuai urutan baris dari atas ke bawah jadi tebakan saya outputnya angka 123 dari atas ke bawah
    println("1")
    println("2")
    println("3")

    // karena perintag latihan kalimatnya ditulis terpisah setiap baris jadi saya tulis dengan memisahkannya
    println("I'm")
    println("learning")
    println("Kotlin!")

    /*fun main() {
        println("Tuesday")
        println("Thursday")
        println("Wednesday")
        println("Friday")
        println("Monday")
    }*/

    // saya memperbaiki urutan baris kode agar output sesuai dengan perintah latihan
    println("Monday")
    println("Tuesday")
    println("Wednesday")
    println("Thursday")
    println("Friday")

    /*fun main() {
        println("Tomorrow is rainy") // Syntax error: Expecting '}'.
    */

    // saya menambah kurung kurawal penutup untuk mengakhiri blok fungsi
    println("Tomorrow is rainy")

    /*fun main() {
        printLine("There is a chance of snow") // Unresolved reference 'printLine'.
    }*/

    // disini printLine tidak dikenali oleh referensi yang mana seharusnya println
    println("There is a chance of snow")

    /*fun main() {
        println("Cloudy") println("Partly Cloudy") println("Windy") // Unresolved reference 'println'.
    }*/

    // disini seharusnya diberi titik koma jika kode ingin diekseskusi dalam 1 baris, namun sebaiknya setiap statement terpisah sesuai barisnya agar mudah dibaca
    println("Cloudy")
    println("Partly Cloudy")
    println("Windy")

    /*fun main() (
        println("How's the weather today?") // Function 'main' must have a body. Syntax error: Expecting a top level declaration.
    )*/

    // disini saya mengganti kurung biasa dngan kurung kurawal untuk mendefinisikan body
    println("How's the weather today?")
}