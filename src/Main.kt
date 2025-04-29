/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   Old Gold
 * Project Author: Billy Bridgeman
 * GitHub Repo:    https://github.com/waimea-bbridgeman/Level-2-programing-assessment
 * ---------------------------------------------------------------------
 * Notes:
 * Old gold is a game for two players that's
 * played on a one-dimensional grid with coins,
 * where the aim is to win by being the player who removes the gold coin.
 * =====================================================================
 */

const val gameLength = 15 //the length of the game board
const val EMPTY = "" //Is an empty slot on the board

fun main() {
    println()
    println("Welcome to the Old Gold Coin game!")
    println("-----------------------------------")
    println()



    val coins = mutableListOf<String>()
    coins.add("GC")
    coins.add("SC")
    coins.add("SC")
    coins.add("SC")
    coins.add("SC")
    coins.add("SC")
    coins.add("SC")
    coins.add(EMPTY)
    coins.add(EMPTY)
    coins.add(EMPTY)
    coins.add(EMPTY)
    coins.add(EMPTY)
    coins.add(EMPTY)
    coins.add(EMPTY)
    coins.add(EMPTY)


    val playerOne = getString("Enter player ones username: ")
    val playerTwo = getString("Enter player twos username: ")

//    confirm player names
    println("Player One: $playerOne")
    println("Player Two: $playerTwo")

    coins.shuffle() //randomises the coins to keep the game from being repetitive


    setUpGame()

    displayGame(coins)

    while (true) {
        println("$playerOne's turn")
        if (userInput(coins)) {
            println("$playerOne has removed the gold coin and won the game!")
            break
        }
        displayGame(coins)

        println("$playerTwo's turn")
        if (userInput(coins)) {
            println("$playerTwo has removed the gold coin and won the game!")
            break
        }
        displayGame(coins)
    }



}

fun setUpGame() {
    val gameBoard = mutableListOf<String>()
    gameBoard.add(EMPTY)

    //Rules
    println("Game rules: Old gold is a game for two players that's played on a one-dimensional grid, \n" +
            "where the aim is to win by being the player who removes the gold coin.\nYou cannot move a coin over or " +
            "on top of another coin, neither can you move a coin to \nthe right, only move coins to the left." +
            " Note: 'SC' is a silver coin and 'GC' is the gold coin. Press 'X' to remove from slot 1. ")
    println()

}

fun displayGame(coins: MutableList<String>) { //Prints and controls the length of the game board

    val banner = ("+----".repeat(gameLength) + "+")


    println(banner)


    for (i in 0..<gameLength) {
        print("| ${i + 1} " .padEnd(5))
    }
    println("|")

    println(banner)

    for (i in 0..<gameLength) {
        print("| ${coins[i]}" .padEnd(5))
    }



    println("|")

    println(banner)

}


fun userInput(gameBoard: MutableList<String>): Boolean {
    val input = getString("Enter the number above the coin you would like to move, or 'X' to remove a coin from slot 1: ")


    if (input.uppercase() == "X") {
        if (gameBoard[0] == "GC") {
            gameBoard[0] = EMPTY
            return true // Player wins after removing gold coin. Code checks if it's the GC thats been removed
            //if not then the game just continues, hence the true statement, if it is the GC then a win message appears
        } else {
            gameBoard[0] = EMPTY
            println("Coin removed from slot 1.")
            return false //Game continues as if nothing happened if a SC coin is removed
        }
    } else {
        val moveFrom = input.toInt()
        val moveTo = getInt("Enter the number above the slot you want to move to: ")
        swapCoins(gameBoard, moveFrom, moveTo)
        return false //Lets player move coins


    }
}

fun swapCoins(gameLength: MutableList<String>, slotNum1: Int, slotNum2: Int) {

    val swap = gameLength[slotNum1 - 1]

    gameLength[slotNum1 - 1] = gameLength[slotNum2 - 1]
    gameLength[slotNum2 - 1] = swap
}

fun getInt(prompt: String): Int { //player has to enter a number, if they enter nothing the program will repeat the message
    var intValue: Int?

    while (true) {
        val userInput = getString(prompt)
        intValue = userInput.toIntOrNull()
        if (intValue != null) break
    }
    return intValue!!
}

fun getString(prompt: String): String { //this code does the same as described above but is used for words rather than numbers
    var userInput: String
    while (true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank())
            break

    }
    return userInput
}
