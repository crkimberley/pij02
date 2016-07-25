import static java.lang.Math.sqrt

/**
 * Created by crk on 25/07/2016.
 */
Scanner input = new Scanner(System.in)
int lowPrime, highPrime
print "Enter number to find closest primes: "
int number = input.nextInt()
print "Closest prime(s) to " + number + " = "
// Special cases for numbers <=2
if (number > 2) {
    // routine runs twice - up & down, using upOrDown variable -1 or +1
    int upOrDown = -1
    while (upOrDown < 2) {
        int possiblePrime = number + upOrDown
        while (possiblePrime > 1) {
            boolean prime = true
            int i = 2
            while (i <= ((int) sqrt(possiblePrime)) && prime) {
                if (possiblePrime % i == 0) {
                    prime = false
                }
                i++
            }
            if (prime) {
                break
            }
            possiblePrime = possiblePrime + upOrDown
        }
        if (upOrDown < 0) {
            lowPrime = possiblePrime
        } else {
            highPrime = possiblePrime
        }
        upOrDown = upOrDown + 2
    }
    // print low & high primes if equidistant, else closest
    if (number - lowPrime == highPrime - number) {
        println lowPrime + " & " + highPrime
    } else {
        println (number - lowPrime < highPrime - number ? lowPrime : highPrime)
    }
    // special cases for numbers <= 2
} else {
    if (number == 2) {
        println "3"
    } else {
        println "2"
    }
}