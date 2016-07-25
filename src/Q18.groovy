import static java.lang.Math.pow

/**
 * Created by crk on 25/07/2016.
 */
print "PI Calculator - enter number of terms for calculation: "
int k = new Scanner(System.in).nextInt() - 1
double piEstimate = 0
while (k >= 0) {
    piEstimate = piEstimate + 4 * pow(-1,k) / (2 * k + 1)
    k--
}
println "PI calculation = " + piEstimate