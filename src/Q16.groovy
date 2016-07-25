import static java.lang.Math.abs

/**
 * Created by crk on 25/07/2016.
 */
// No error checking on inputs for simplicity
Scanner input = new Scanner(System.in)
println "Rock, Paper, Scissors - enter r for rock, p for paper, s for scissors"
println "Press return after both players have typed their selection"
int score1, score2
String turn
while (abs(score1 - score2) <= 3) {
    println "Player 1 selection - Player 2 selection - Return..."
    turn = input.next()
    if ((turn.charAt(0) == 'r' && turn.charAt(1) == 's')
    || (turn.charAt(0) == 'p' && turn.charAt(1) == 'r')
    || (turn.charAt(0) == 's' && turn.charAt(1) == 'p')) {
        score1++
        // We're assuming inputs are all valid
    } else if (turn.charAt(0) != turn.charAt(1)) {
        score2++
    }
    println "Player 1: " + score1 + "\nPlayer 2: " + score2
}
println "The winner is " + ((score1 > score2) ? "Player 1" : "Player 2")


