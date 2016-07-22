import static java.lang.Math.sqrt

/**
 * Created by crk on 20/07/2016.
 */
int number = 2
while (number <=1000) {
    boolean prime = true
    int i = 2
    while (i <= ((int) sqrt(number)) && prime) {
        if (number % i == 0) {
            prime = false
        }
        i++
    }
    if (prime) {
        println number
    }
    number++
}