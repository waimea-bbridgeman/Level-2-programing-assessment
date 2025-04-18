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

fun main() {
    println()
    println("Welcome to the Old Gold Coin game!")
    println("-----------------------------------")
    println()

    setupCoins()

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
       println("$playerOne 's turn")
       userInput(coins)
       displayGame(coins)

       println("$playerTwo 's turn")
       userInput(coins)
       displayGame(coins)
//      if {
//          //check for win
//      }


   }





}

fun setUpGame() {
    val gameBoard = mutableListOf<String>()
    gameBoard.add(EMPTY)

    println("Game rules: Old gold is a game for two players that's played on a one-dimensional grid with coins, \n" +
            "where the aim is to win by being the player who removes the gold coin. Note: 'Slvr coin' is a silver coin\n" +
            "and 'Gld coin' is the gold coin.")
    println()





}



fun displayGame(coins: MutableList<String>) {

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



fun userInput(gameLength: MutableList<String>) {
  val moveFrom = getInt("Enter the number above the coin you would like to move: ")
    val moveTo = getInt("Enter the number above the coin you would like to move to: ")
    swapCoins(gameLength, moveFrom, moveTo)
}

fun swapCoins(gameLength: MutableList<String>, slotNum1: Int, slotNum2: Int) {

    val swap = gameLength[slotNum1 - 1]

    gameLength[slotNum1 - 1] = gameLength[slotNum2 - 1]
    gameLength[slotNum2 - 1] = swap
}

fun setupCoins(): MutableList<String> {
    val boardLength = mutableListOf<String>()
    for (i in 1..gameLength) boardLength.add(EMPTY)
    return boardLength
}
fun getInt(prompt: String): Int {
    var intValue: Int?

    while (true) {
        val userInput = getString(prompt)
        intValue = userInput.toIntOrNull()
        if (intValue != null) break
    }
    return intValue!!
}