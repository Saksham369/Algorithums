package questions;

public class EuclideanM {
    //Euclidean Method
    //it helps in finding gcd/hcf of 2 numbers
    //it can also be used to exchange larger number with smaller number

    public static void main(String[] args){

        System.out.println(gcd(27,21));

    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }

            return gcd(b%a,a);
    }
}
