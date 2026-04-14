fun main() {
    // count adalah nama variabel
    // Int adalah jenis data dari variabel tersebut
    // angka 2 adalah nilai awal dari variabel tersebut.
    val count1: Int = 2
    println(count1)

    // println(count) mencetak variabel count ke output:
    val count2: Int = 2
    println(count2)

    // disini $count yang berisi 2 diganti menjadi string sehingga ketika dijalankan akan mencetak isi vvariabel
    val count3: Int = 2
    println("You have $count3 unread messages.")

    // baris println() tetap berjalan dengan ketika saya rubah nilai awal nya 
    val count4: Int = 10
    println("You have $count4 unread messages.")

    // ${unreadCount + readCount} menjumlahkan isi variabelnya kemudian dicetak dalam bentuk string
    val unreadCount = 7
    val readCount = 60
    println("You have ${unreadCount + readCount} total messages in your inbox.")

    // 
    val numberOfPhotos = 85
    val photosEdited = 70
    println("$numberOfPhotos photos")
    println("$photosEdited photos edited")
    println("${numberOfPhotos - photosEdited} photos left")

    /*fun main() {
        val cartTotal = 0 // 'val' cannot be reassigned.
        cartTotal = 20
        println("Total: $cartTotal")
    }*/

    // val tidak bisa diperbarui/diubah nilainya, makanya disini menggunakan var untuk memperbarui nilai variabel
    var cartTotal = 0 // nilai awal variabel
    println("Total: $cartTotal")

    cartTotal = 20 // nilai baru variabel
    println("Total: $cartTotal")

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

    var count5 = 10
    println("You have $count5 unread messages.")
    count5++ // fungsinya sama saja dengan ditambah 1
    println("You have $count5 unread messages.")

    var count6 = 10
    println("You have $count6 unread messages.")
    count6-- // kalau ini fungsinya dikurangi 1
    println("You have $count6 unread messages.")

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
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

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

    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work \"FO UTDI\""
    // ketika perlu tanda kutip di dalam string maka harus ditambah garis miring terbalik sebelum tanda petik ganda
    println(reminder)

    /*
    fun main() {
        val notificationsEnabled: Boolean = true // notificationsEnabled adalah variabel boolean dengan inisialisasi true
        println(notificationsEnabled)
    }

    fun main() {
        val notificationsEnabled: Boolean = false // disini nilainya diganti dengan false
        println(notificationsEnabled)
    }*/

    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)
    // disini eksekusi variabelnya bisa disambung dengan string

    /*
     * ini adalah contoh komentar multi-baris
     * yang mana harus ditambah tanda bintang di awal setiap baris baru dikomentar
     * dan diakhiri simbol tanda bintang dan garis miring
     */

    // kalau ini contoh komentar ditengah baris kode
    var count7 = 10
    println("You have $count7 unread messages.")

    // nah komentar komentar ini tidak ikut dieksekusi ketika kode dijalankan
    count7--
    println("You have $count7 unread messages.")
}