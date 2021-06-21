package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

class DateFormatter {
    private val ruFormatter = DateTimeFormatter
        .ofPattern("d MMMM, eeee", Locale("RU"))

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            LocalDate.of(
                year.toInt(),
                month.toInt(),
                day.toInt()
            ).format(ruFormatter)
        } catch (e: Exception) {
            "Такого дня не существует"
        }
    }
}
