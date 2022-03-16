package questions;
// Sieve of eratosthenes
//Time Complexity - N*log(logN)
public class Seive {
    public static void main(String[] args){
     int n = 1000;
        boolean[] primes = new boolean[n+1];
        primes(n,primes);
    }

    static void primes(int n,  boolean[] prime){
        for(int i =2; i*i<=n; i++){
            if(!prime[i]){
                for(int j = i*2; j<=n; j+=i){
                    prime[j] = true;
                }
            }
        }

        for(int i =2; i<=n; i++){
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }
}
