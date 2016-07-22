import static java.lang.Math.sqrt

int count = 0
int number = 2
while (count < 1000) {
    boolean prime = true
    int i = 2
    while (i <= (int) sqrt(number) && prime) {
        if (number % i == 0) {
            prime = false
        }
        i++
    }
    if (prime) {
        count++
        println number
    }
    number++
}