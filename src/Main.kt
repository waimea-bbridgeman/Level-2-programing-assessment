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
    const val REMOVE = 'X' //Will remove a coin from the 1 slot on the board

fun main() { //do some testing
    println()
    println("Welcome to the Old Gold Coin game!")
    println("-----------------------------------")
    println()

   setupCoins()

    coins.add("slvr coin") 

    setupCoins().shuffle() //randomises the coins to keep the game from being repetitive
    println(setupCoins())

    //coinsOnBoard() display coins on the board from random


    setUpGame()

    displayGame()



//  while (true) {
//      playerMove = userInput()
//
//
//
//
//
//  }

}

fun setUpGame() {
    val gameBoard = mutableListOf<String>()
    gameBoard.add(EMPTY)

    println("Game rules: Old gold is a game for two players that's played on a one-dimensional grid with coins, \n" +
            "where the aim is to win by being the player who removes the gold coin. Note: 'Slvr coin' is a silver coin\n" +
            "and 'Gld coin' is the gold coin.")
    println()

//    Get player names
    val playerOne = getString("Enter player ones username: ")
    val playerTwo = getString("Enter player twos username: ")

//    confirm player names
    println("Player One: $playerOne")
    println("Player Two: $playerTwo")


}



fun displayGame() {

    val banner = ("+----".repeat(gameLength) + "+")


    println(banner)


    for (i in 0..<gameLength) {
        print("| ${i + 1} " .padEnd(5))
    }
    println("|")

    println(banner)


    for (i in 0..<gameLength) {
        print("| ${setupCoins()}" .padEnd(5))
    }

//for (i in 0..<cageList.size) {
//        print("| ${cageList[i]}" .padEnd(9))
//    }

    println("|")

    println(banner)

}

fun getString(prompt: String): String {
    var userInput: String
    while (true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank())
            break

    }
    return userInput
}

fun getUserAction(): Char {
    return REMOVE
}

//fun userInput() {
//
//    when (playerMove) {
//        'l' -> left
//        'X' -> REMOVE
//
//    }
//}

fun setupCoins(): MutableList<String> {
    val coins = mutableListOf<String>()
    for (i in 1..gameLength) coins.add(EMPTY)
    return coins
}