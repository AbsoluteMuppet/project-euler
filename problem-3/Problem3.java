import java.math.BigInteger;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */

public class Problem3 {
    
    public static void main(String[] args) {
        
        BigInteger num = new BigInteger("600851475143");

        BigInteger largestPrimeFactor = new BigInteger("1");
        BigInteger currDivisor = new BigInteger("2");

        while (num.longValue() != 1) {

            if (num.remainder(currDivisor).intValue() == 0) {

                num = num.divide(currDivisor);
                largestPrimeFactor = currDivisor;
            }
            else {

                currDivisor = currDivisor.add(new BigInteger("1"));
            }
        }

        System.out.println(largestPrimeFactor.longValue());
    }
}
