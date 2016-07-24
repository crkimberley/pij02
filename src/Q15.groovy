import static java.lang.Math.random

/**
 * Created by crk on 24/07/2016.
 */
Scanner input = new Scanner(System.in)
int randomNumber = (int) (random() * 1001)
int guess
println "Guess a random number between 0 & 1,000"
int count = 1
while (true) {
    print " - guess the number: "
    guess = input.nextInt()
    if (guess == randomNumber) {
        println "Correct! You took " + count + " guesses"
        break
    }
    if (guess < randomNumber) {
        print " too low\t"
    } else {
        print " too high\t"
    }
    count++
}



