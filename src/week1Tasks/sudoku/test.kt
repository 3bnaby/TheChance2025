package week1Tasks.sudoku

fun main () {
    testTheValidityOfSudokuGame(
        testName = "when number of columns equals number of rows then return true",
        actualResult = isValidSudoku(
            listOf(
                charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),

                charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),

                charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        correctResult = true
    )
    testTheValidityOfSudokuGame(
        testName = "when number isn't repeated in row then return true",
        actualResult = isValidSudoku(
            listOf(
                charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),

                charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),

                charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        correctResult = true
    )
    testTheValidityOfSudokuGame(
        testName = "when number isn't repeated in column then return true",
        actualResult = isValidSudoku(
            listOf(
                charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),

                charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),

                charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        correctResult = true
    )
    testTheValidityOfSudokuGame(
        testName = "when number isn't repeated in subgrid(box) then return true",
        actualResult = isValidSudoku(
            listOf(
                charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),

                charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),

                charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        correctResult = true
    )

    testTheValidityOfSudokuGame(
        testName = "when its an empty list then return false",
        actualResult = isValidSudoku(emptyList()),
        correctResult = false
    )

    testTheValidityOfSudokuGame(
        testName = "when number of columns is less than number of rows then return false",
        actualResult = isValidSudoku(
            listOf(
                charArrayOf('5','3','-',   '-','7','-',   '-','-'), // "9" rows vs "8" columns
                charArrayOf('6','-','-',   '1','9','5',   '-','-'),
                charArrayOf('-','9','8',   '-','-','-',   '-','6'),

                charArrayOf('8','-','-',   '-','6','-',   '-','-'),
                charArrayOf('4','-','-',   '8','-','3',   '-','-'),
                charArrayOf('7','-','-',   '-','2','-',   '-','-'),

                charArrayOf('-','6','-',   '-','-','-',   '2','8'),
                charArrayOf('-','-','-',   '4','1','9',   '-','-'),
                charArrayOf('-','-','-',   '-','8','-',   '-','7')
            )
        ),
        correctResult = false
    )
    testTheValidityOfSudokuGame(
        testName = "when number of rows is less than number of columns then return false",
        actualResult = isValidSudoku(
            listOf(
                charArrayOf('5','3','-',   '-','7','-',   '-','-','-'), // "7" rows vs "9" columns
                charArrayOf('6','-','-',   '1','9','5',   '-','-','-'),
                charArrayOf('-','9','8',   '-','-','-',   '-','6','-'),

                charArrayOf('8','-','-',   '-','6','-',   '-','-','3'),
                charArrayOf('4','-','-',   '8','-','3',   '-','-','1'),
                charArrayOf('7','-','-',   '-','2','-',   '-','-','6'),

                charArrayOf('-','6','-',   '-','-','-',   '2','8','-'),
            )
        ),
        correctResult = false
    )

    testTheValidityOfSudokuGame(
        testName = "when number is duplicated in row then return false",
        actualResult = isValidSudoku(
            listOf(
                charArrayOf('5','3','-',   '3','7','-',   '-','-','-'), // duplicated number "3" in row "1"
                charArrayOf('6','-','-',   '1','9','5',   '-','-','-'),
                charArrayOf('-','9','8',   '-','-','-',   '-','6','-'),

                charArrayOf('8','-','-',   '-','6','-',   '-','-','3'),
                charArrayOf('4','-','-',   '8','-','3',   '-','-','1'),
                charArrayOf('7','-','-',   '-','2','-',   '-','-','6'),

                charArrayOf('-','6','-',   '-','-','-',   '2','8','-'),
                charArrayOf('-','-','-',   '4','1','9',   '-','-','5'),
                charArrayOf('-','-','-',   '-','8','-',   '-','7','9')
            )
        ),
        correctResult = false
    )
    testTheValidityOfSudokuGame(
        testName = "when number is duplicated in column then return false",
        actualResult = isValidSudoku(
            listOf(
                charArrayOf('5','3','-',   '-','7','-',   '2','-','-'), //duplicated number "2" in column "7"
                charArrayOf('6','-','-',   '1','9','5',   '-','-','-'),
                charArrayOf('-','9','8',   '-','-','-',   '-','6','-'),

                charArrayOf('8','-','-',   '-','6','-',   '-','-','3'),
                charArrayOf('4','-','-',   '8','-','3',   '-','-','1'),
                charArrayOf('7','-','-',   '-','2','-',   '-','-','6'),

                charArrayOf('-','6','-',   '-','-','-',   '2','8','-'), //duplicated number "2" in column "7"
                charArrayOf('-','-','-',   '4','1','9',   '-','-','5'),
                charArrayOf('-','-','-',   '-','8','-',   '-','7','9')
            )
        ),
        correctResult = false
    )
    testTheValidityOfSudokuGame(
        testName = "when number is duplicated in subgrid(box) then return false",
        actualResult = isValidSudoku(
            listOf(
                charArrayOf('5','3','-',   '-','7','-',   '-','-','-'),
                charArrayOf('6','-','-',   '1','9','5',   '-','-','-'),
                charArrayOf('-','9','8',   '-','-','-',   '-','6','-'),

                charArrayOf('8','-','-',   '-','6','-',   '-','-','3'), //number "3"
                charArrayOf('4','-','-',   '8','-','3',   '-','-','1'), //both of them are in the same box
                charArrayOf('7','-','-',   '-','2','-',   '3','-','6'), //number "3"

                charArrayOf('-','6','-',   '-','-','-',   '2','8','-'),
                charArrayOf('-','-','-',   '4','1','9',   '-','-','5'),
                charArrayOf('-','-','-',   '-','8','-',   '-','7','9')
            )
        ),
        correctResult = false
    )
    testTheValidityOfSudokuGame(
        testName = "when input is something else '-' or number then return false",
        actualResult = isValidSudoku(
            listOf(
                charArrayOf('5','3','-',   '-','7','-',   '-','-','-'),
                charArrayOf('6','-','-',   '1','9','5',   '-','-','-'),
                charArrayOf('-','9','8',   '-','-','-',   '/','6','-'), // invalid character "/" in row "3" and column "7"

                charArrayOf('8','-','-',   '-','6','-',   '-','-','3'),
                charArrayOf('4','-','-',   '8','-','3',   '-','-','1'),
                charArrayOf('7','-','-',   '-','2','-',   '-','-','6'),

                charArrayOf('-','6','-',   '-','-','-',   '2','8','-'),
                charArrayOf('-','-','-',   '4','1','9',   '-','-','5'),
                charArrayOf('-','-','-',   '-','8','-',   '-','7','9')
            )
        ),
        correctResult = false
    )
    testTheValidityOfSudokuGame(
        testName = "when no input and the cell is empty then return false",
        actualResult = isValidSudoku(
            listOf(
                charArrayOf('5','3','-',   '-','7','-',   '-','-','-'),
                charArrayOf('6','-','-',   '1','9','5',   '-','-','-'),
                charArrayOf('-','9','8',   '-','-','-',   '-','6','-'),

                charArrayOf('8','-','-',   '-','6','-',   '-','-','3'),
                charArrayOf('4','-','-',   '8','-','3',   '-','-','1'),
                charArrayOf('7','-','-',   '-','2','-',   '-','-','6'),

                charArrayOf('-','6','-',   '-',' ','-',   '2','8','-'), // empty cell in row "7" and column "5" should contain a '-'character
                charArrayOf('-','-','-',   '4','1','9',   '-','-','5'),
                charArrayOf('-','-','-',   '-','8','-',   '-','7','9')
            )
        ),
        correctResult = false
    )
    testTheValidityOfSudokuGame(
        testName = "when input is zero then return false",
        actualResult = isValidSudoku(
            listOf(
                charArrayOf('5','3','-',   '-','7','-',   '-','-','-'),
                charArrayOf('6','-','-',   '1','9','5',   '-','-','0'), // input zero in row "2" and column "9"
                charArrayOf('-','9','8',   '-','-','-',   '-','6','-'), // numbers should be between "1" to "9"

                charArrayOf('8','-','-',   '-','6','-',   '-','-','3'),
                charArrayOf('4','-','-',   '8','-','3',   '-','-','1'),
                charArrayOf('7','-','-',   '-','2','-',   '-','-','6'),

                charArrayOf('-','6','-',   '-','-','-',   '2','8','-'),
                charArrayOf('-','-','-',   '4','1','9',   '-','-','5'),
                charArrayOf('-','-','-',   '-','8','-',   '-','7','9')
            )
        ),
        correctResult = false
    )

}

fun testTheValidityOfSudokuGame(testName : String, actualResult : Boolean, correctResult : Boolean){
    if (actualResult == correctResult) {
        println("success $testName")
    }else{
        println("Failed $testName")
    }
}