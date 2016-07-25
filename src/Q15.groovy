/**
 * Created by crk on 24/07/2016.
 */
Scanner input = new Scanner(System.in)
//int randomNumber = abs(random() * 1001)
int randomNumber = new Random().nextInt(1001)
int guess
print "This program picks a random number between 0 & 1,000 - "
int count = 1
while (true) {
    print "guess the number: "
    guess = input.nextInt()
    if (guess == randomNumber) {
        println "Correct! You took " + count + " guesses"
        break
    }
    print "No - " + guess + " is too "
    if (guess < randomNumber) {
        print "low, "
    } else {
        print "high, "
    }
    count++
}



