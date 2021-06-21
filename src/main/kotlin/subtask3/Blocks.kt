package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when(blockB) {
            // взависимости от класса blockB, работаем с массивом согласно условию
            String::class -> {
                //конкатенация строк
                return blockA.filterIsInstance<String>().joinToString()
            }
            Int::class -> {
                //сумма чисел
                return blockA.filterIsInstance<Int>().sum()
            }
            LocalDate::class -> {
                val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                // ближайшая к текущему дню дата
                return blockA.filterIsInstance<LocalDate>().max()?.format(formatter)!!
            }
        }

        return "Empty"
    }
}
