package lab_2

fun main() {
    println("Введите три числа. Помните, что все три числа не должны совпадать!")
    print("Введите первое число: ")
    val firstNum = readln().toInt()
    print("Введите второе число: ")
    val secondNum = readln().toInt()
    print("Введите третье число: ")
    val thirdNum = readln().toInt()
    if (areIdentical(firstNum, secondNum, thirdNum)) {
        println("Ошибка")
    } else {
        val result = findAvg(firstNum, secondNum, thirdNum)
        println("Результат: $result")
    }
}

fun areIdentical(fNum: Int, sNum: Int, tNum: Int): Boolean {
    return (fNum == sNum) || (sNum == tNum) || (fNum == tNum)
}

fun findAvg(fNum: Int, sNum: Int, tNum: Int): Int {
    if (sNum in fNum..tNum || sNum in tNum..fNum) {
        return sNum
    }
    return if (fNum in sNum..tNum || fNum in tNum..sNum) {
        fNum
    }
    else {
        tNum
    }
}
