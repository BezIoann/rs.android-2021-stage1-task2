package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import javax.swing.text.DateFormatter
import kotlin.reflect.KClass
import kotlin.reflect.typeOf

class Blocks {
    private fun returnIntSum(block: Array<*>): Int {
        var sum = 0
        for (e in block) {
            if (e is Int) {
                sum += e
            }
        }
        return sum
    }
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when(blockB) {
            // взависимости от класса blockB, работаем с массивом согласно условию
            String::class -> {
                //конкатенация строк
                return blockA.filterIsInstance<String>().joinToString()
            }
            Int::class -> {
                //сумма чисел
                return returnIntSum(blockA)
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
