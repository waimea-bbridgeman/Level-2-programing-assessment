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

    const val gameLength = 15
    const val EMPTY = ""
    const val REMOVE = 'X'

fun main() {
    println()
    println("Welcome to the Old Gold Coin game!")
    println("-----------------------------------")
    println()

    val coins = mutableListOf<String>()
    coins.add("Slvr coin")
    coins.add("Slvr coin")
    coins.add("Slvr coin")
    coins.add("gldCoin")
    coins.add("Slvr coin")




    setUpGame()

    displayGame()



//  while (true) {
//      val action = getUserAction()
//
//      if (action == REMOVE) {
//          coins.removeAt(1)
//      }
//      //Ask player one for move
//      val playerOneMove = (userInput)
//
//
//
//
//     //ask player two for move
//      val playerTwoMove = (userInput2)
//      if (gldCoin == null) break
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

    println("Game rules: Old gold is a game for two players that's played on a one-dimensional grid with coins, " +
            "where the aim is to win by being the player who removes the gold coin. Note: 'Slvr coin' is a silver coin" +
            " and 'Gld coin' is the gold coin.")
    println()

//    Get player names
    val playerOne = getString("Enter player ones username: ")
    val playerTwo = getString("Enter player twos username: ")

//    confirm player names
    println("Player One: $playerOne")
    println("Player Two: $playerTwo")


}



fun displayGame() {

    val banner = ("+--------".repeat(gameLength) + "+")


    println(banner)

//    for (i in 0..<gameLength) {
//        print("${i} ".padEnd(9))
//    }


    for (i in 0..<gameLength) {
        print("| ${i + 1} " .padEnd(9))
    }

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

//fun userInput(): String {
//
//    when (playerOneMove) {
//        l -> move coin to left
//        r -> move coin to right
//
//    }
//}