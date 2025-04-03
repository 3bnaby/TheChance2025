package week1Tasks.sudoku

fun main() {

}

fun isValidSudoku(game: List<CharArray>): Boolean {
    val rowSet = Array(9) { mutableSetOf<Char>() }
    val columnSet = Array(9) { mutableSetOf<Char>() }
    val boxSet = Array(9) { mutableSetOf<Char>() }
    val validChars = ('1'..'9').toSet() + '-'

    if (game.isEmpty()) {
        return false
    } else if (game.size != game[0].size) {
        return false
    } else {

        for (row in 0..<9) {
            for (column in 0..<9) {
                val number = game[row][column]
                val boxIndex = (row / 3) * 3 + (column / 3)
                if (number !in validChars) {
                    return false
                }
                if (number == '-') continue
                if (number in rowSet[row]) {
                    return false
                } else {
                    rowSet[row].add(number)
                }
                if (number in columnSet[column]) {
                    return false
                } else {
                    columnSet[column].add(number)
                }
                if (number in boxSet[boxIndex]) {
                    return false
                } else {
                    boxSet[boxIndex].add(number)
                }
            }
        }
    }
    return true
}
