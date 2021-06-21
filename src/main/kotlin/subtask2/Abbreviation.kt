package subtask2

class Abbreviation {
    fun abbreviationFromA(a: String, b: String): String {
        // приведем строки к спискам
        val firstList = a.toLowerCase().toList()
        val secondList = b.toLowerCase().toList()
        // с помощью intersect найдем пересечение двух списков и
        // если пересечение есть и равно secondlist,
        // то всё верно и возвращаем YES иначе NO
        if (firstList.intersect(secondList).toList() == secondList) {
            return "YES"
        } else {
            return "NO"
        }
    }
}
