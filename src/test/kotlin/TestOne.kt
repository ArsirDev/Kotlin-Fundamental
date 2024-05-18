import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

/**
 * Kelas ini berisi metode untuk menguji fungsi `showingData` dari kelas `ExerciseOne`.
 *
 * @constructor Membuat objek TestOne.
 *
 * @since 1.0
 * @version 1.0
 * @author [Arfan Siregar]
 */
internal class TestOne {

    /**
     * Menguji fungsi `showingData` dari kelas `ExerciseOne`.
     *
     * Fungsi ini memastikan bahwa hasil dari pemanggilan `showingData` tidak null dan merupakan instance dari kelas `Unit`.
     *
     * @throws AssertionError jika hasilnya null atau bukan instance dari `Unit`.
     */
    @Test
    fun `exercise one`() = run {
        val exerciseOne = ExerciseOne.showingData
        assertThat(exerciseOne).isNotNull()
        assertThat(exerciseOne).isInstanceOf(Unit::class.java)
    }
}