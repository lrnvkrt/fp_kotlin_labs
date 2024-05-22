package lab_6

import java.text.SimpleDateFormat
import java.util.Date

fun createDateFormatter(format: String): (Date) -> String {
    return { date: Date -> SimpleDateFormat(format).format(date) }
}

fun main() {
    val firstFormatDate = createDateFormatter("dd.MM.yyyy")
    val secondFormatDate = createDateFormatter("MMMM dd, yyyy")
    val thirdFormatDate = createDateFormatter("EEE, dd MMM yyyy HH:mm:ss z")
    val today = Date()
    println(firstFormatDate(today))
    println(secondFormatDate(today))
    println(thirdFormatDate(today))
}
