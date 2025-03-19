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

fun setUpGame() {
    println("Game rules: Old gold is a game for two players that's played on a one-dimensional grid with coins, " +
            "where the aim is to win by being the player who removes the gold coin.")

    val playerOne = println("Enter player ones username")
    val playerTwo = println("Enter player twos username")


}





fun main() {
    println("Welcome to the Old Gold Coin game!")
    println("-----------------------------------")


    displayGame()




}

fun displayGame() {

    val banner = ("+--------".repeat(gameLength) + "+")


    println(banner)

    for (i in 0..<gameSize.size) {
        print("| Cage ${i + 1} " .padEnd(9))
    }
    println("|")

    println(banner)

    for (i in 0..<cageList.size) {
        print("| ${cageList[i]}" .padEnd(9))
    }

    println("|")

    println(banner)

}

