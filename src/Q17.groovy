import static java.lang.Math.sqrt

/**
 * Created by crk on 25/07/2016.
 */
Scanner input = new Scanner(System.in)
print "Enter number to find closest primes: "
int number = input.nextInt()
print "Closest prime(s) to " + number + " = "
if (number > 2) {
    int lowPrime = number - 1
    while (lowPrime > 1) {
        boolean prime = true
        int i = 2
        while (i <= ((int) sqrt(lowPrime)) && prime) {
            if (lowPrime % i == 0) {
                prime = false
            }
            i++
        }
        if (prime) {
            break
        }
        lowPrime--
    }
    int highPrime = number + 1
    while (true) {
        boolean prime = true
        int i = 2
        while (i <= ((int) sqrt(highPrime)) && prime) {
            if (highPrime % i == 0) {
                prime = false
            }
            i++
        }
        if (prime) {
            break
        }
        highPrime++
    }
    if (number - lowPrime == highPrime - number) {
        println lowPrime + " & " + highPrime
    } else {
        println (number - lowPrime < highPrime - number ? lowPrime : highPrime)
    }
} else {
    if (number == 2) {
        println "3"
    } else {
        println "2"
    }
}