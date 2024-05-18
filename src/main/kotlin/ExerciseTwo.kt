/**
 * Latihan Tipe Data Primitive di Kotlin
 *
 * Tipe data primitive di Kotlin mencakup beberapa jenis seperti Byte, Short, Int, Long, Float, Double, Char, dan Boolean.
 * Masing-masing tipe data ini memiliki ukuran dan rentang nilai yang berbeda.
 *
 * @since 1.0
 * @version 1.0
 * @author [Arfan Siregar]
 */
internal class ExerciseTwo {
    companion object {
        /**
         * Contoh penggunaan tipe data Byte.
         * Byte memiliki ukuran 8-bit dan rentang nilai dari -128 hingga 127.
         */
        fun exampleByte() {
            val minByteValue: Byte = Byte.MIN_VALUE
            val maxByteValue: Byte = Byte.MAX_VALUE
            println("Min Byte Value: $minByteValue")
            println("Max Byte Value: $maxByteValue")
        }

        /**
         * Contoh penggunaan tipe data Short.
         * Short memiliki ukuran 16-bit dan rentang nilai dari -32768 hingga 32767.
         */
        fun exampleShort(
            minShortValue: Short = Short.MIN_VALUE,
            maxShortValue: Short = Short.MAX_VALUE
        ) {
            println("Min Short Value: $minShortValue")
            println("Max Short Value: $maxShortValue")
        }

        /**
         * Contoh penggunaan tipe data Int.
         * Int memiliki ukuran 32-bit dan rentang nilai dari -2147483648 hingga 2147483647.
         */
        fun exampleInt(
            minIntValue: Int = Int.MIN_VALUE,
            maxIntValue: Int = Int.MAX_VALUE
        ) {
            println("Min Int Value: $minIntValue")
            println("Max Int Value: $maxIntValue")
        }

        /**
         * Contoh penggunaan tipe data Long.
         * Long memiliki ukuran 64-bit dan rentang nilai dari -9223372036854775808 hingga 9223372036854775807.
         */
        fun exampleLong(
            minLongValue: Long = Long.MIN_VALUE,
            maxLongValue: Long = Long.MAX_VALUE
        ) {
            println("Min Long Value: $minLongValue")
            println("Max Long Value: $maxLongValue")
        }

        /**
         * Contoh penggunaan tipe data Float.
         * Float memiliki ukuran 32-bit dan digunakan untuk menyimpan nilai desimal dengan presisi tunggal.
         */
        fun exampleFloat(
            minFloatValue: Float = Float.MIN_VALUE,
            maxFloatValue: Float = Float.MAX_VALUE
        ) {
            println("Min Float Value: $minFloatValue")
            println("Max Float Value: $maxFloatValue")
        }

        /**
         * Contoh penggunaan tipe data Double.
         * Double memiliki ukuran 64-bit dan digunakan untuk menyimpan nilai desimal dengan presisi ganda.
         */
        fun exampleDouble(
            minDoubleValue: Double = Double.MIN_VALUE,
            maxDoubleValue: Double = Double.MAX_VALUE
        ) {
            println("Min Double Value: $minDoubleValue")
            println("Max Double Value: $maxDoubleValue")
        }

        /**
         * Contoh penggunaan tipe data Char.
         * Char digunakan untuk menyimpan karakter tunggal seperti huruf, angka, atau simbol.
         */
        fun exampleChar(
            charValue: Char = 'A'
        ) {
            println("Char Value: $charValue")
        }

        /**
         * Contoh penggunaan tipe data Boolean.
         * Boolean memiliki dua nilai: true dan false.
         */
        fun exampleBoolean(
            booleanValueTrue: Boolean = true,
            booleanValueFalse: Boolean = false
        ) {
            println("Boolean Value (True): $booleanValueTrue")
            println("Boolean Value (False): $booleanValueFalse")
        }

        /**
         * Fungsi utama untuk menjalankan semua contoh penggunaan tipe data primitive.
         */
        fun runAllExamples() {
            exampleByte()
            exampleShort()
            exampleInt()
            exampleLong()
            exampleFloat()
            exampleDouble()
            exampleChar()
            exampleBoolean()
        }
    }
}

fun main() {
    ExerciseTwo.runAllExamples()
}