package lab_5

fun main() {
    println("Введите строку: ")
    val stringOfWords = readln()
    println("Количество слов в данной строке: ${countWords(stringOfWords)}")
    println("Количество слов в данной строке: ${countWordsSec(stringOfWords)}")
}

fun countWords(stringOfWords: String): Int {
    return stringOfWords.replace(Regex("\\p{Punct}\\d[ \\t]"), " ").trim().split(Regex("\\s+")).size
}

fun countWordsSec(input: String): Int {
    return input.foldIndexed(0) { index, acc, char ->
        if (char.isLetter()) {
            if (index == 0 || !input[index - 1].isLetter()) acc + 1 else acc
        } else acc
    }
}