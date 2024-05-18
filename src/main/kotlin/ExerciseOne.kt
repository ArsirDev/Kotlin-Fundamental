/**
 * Kelas ini berisi metode untuk latihan pertama dalam penggunaan fungsi `print` dan `println` pada Kotlin.
 * Menyediakan fungsi untuk menampilkan berbagai contoh penggunaan fungsi `print` dan `println`.
 *
 * @constructor Membuat objek ExerciseOne.
 *
 * @since 1.0
 * @version 1.0
 * @author [Arfan Siregar]
 */
internal class ExerciseOne {
    companion object {
        /**
         * Menampilkan data ke konsol menggunakan fungsi `print` dan `println`.
         */
        val showingData = showingData()
    }
}

/**
 * Fungsi ini digunakan untuk menampilkan data ke konsol menggunakan fungsi `print` dan `println`.
 *
 * Fungsi ini mencetak berbagai teks, angka, dan operasi matematika ke konsol,
 * serta menunjukkan perbedaan antara `print` dan `println`.
 *
 * @since 1.0
 */
internal fun showingData() {
    // Menggunakan println untuk mencetak teks dan berpindah ke baris baru
    println("Hello, World!")
    println("Selamat datang di belajar Kotlin.")

    // Menggunakan print untuk mencetak teks tanpa berpindah ke baris baru
    print("Ini adalah contoh ")
    print("menggunakan print ")
    print("tanpa baris baru.\n")

    // Kombinasi penggunaan print dan println
    println("Kombinasi print dan println:")
    print("Baris pertama menggunakan print.")
    println("Baris kedua menggunakan println.")
    print("Baris ketiga menggunakan print.")
    println("Baris keempat menggunakan println.")

    // Menggunakan println untuk mencetak angka
    println(123)
    println(456.789)

    // Menggunakan print untuk mencetak beberapa angka dalam satu baris
    print(1)
    print(" + ")
    print(2)
    print(" = ")
    println(1 + 2)

    // Menggunakan println untuk mencetak operasi matematika
    println("5 * 3 = " + (5 * 3))
    println("10 / 2 = " + (10 / 2))
    println("15 - 4 = " + (15 - 4))
    println("7 + 8 = " + (7 + 8))

    // Mencetak string dengan escape sequences
    println("Ini adalah baris pertama.\nIni adalah baris kedua.")
    println("Tab\tberikutnya.")
    println("Backslash: \\")

    // Mencetak kutipan di dalam string
    println("Kata orang bijak, \"Belajar itu sepanjang hayat.\"")
    println("Karakter 'a' adalah huruf kecil.")

    // Menggunakan print untuk mencetak beberapa hal dalam satu baris
    print("A")
    print("B")
    print("C")
    print("D")
    println("E")
}