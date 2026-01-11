public class SieveOfEratosthnes {
    public static void main(String args[]) {
        int n = 120;
        primeSieve(n);
    }

    public static void primeSieve(int n) {
        int[] prime = new int[n + 1];
        // initially all numbers are prime -> assumption
        // 1 -> not a prime
        // 0 -> prime

        // 0 & 1 is not a prime number
        prime[0] = 1;
        prime[1] = 1;

        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i] == 0) { // already prime
                for (int j = i * i; j < prime.length; j = j + i) {
                    prime[j] = 1; // now, not prime
                }
            }
        }

        for (int i = 2; i < prime.length; i++) {
            if (prime[i] == 0) { // prime
                System.out.println(i + " ");
            }
        }
    }
}
