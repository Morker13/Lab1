public class Primes {

    public static void main(String[] args) {
        for (int i = 2; i < 100; i = i + 1) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    //isPrime проверяет является ли число простым
    public static boolean isPrime (int n){

                for (int j = 2; j < n; j++) {
                    if (n % j == 0) {
                        return false;
                    }
                }
                return true;
    }
}

