package questions;

public class Sqrt {
    // Find the sqrt of  a number
    public static void main(String[]  args){
        int n = 40;
        int  d = 3;
        System.out.printf("%.3f",sqrt(40,3));
    }
   // Time Complexity- O(log(n))
    static double sqrt(int n, int d){
        int s =0;
        int e =n;

        double root = 0.0;

        while(s<=e){

            int m = s + (e-s)/2;
            if(m *m == n){
                return m;
            }
            if(m*m > n){
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        double incr = 0.1;
        for(int i= 0; i<d; i++){
            while(root*root <= n){
                root+=incr;
            }
            root-=incr;
            incr = incr/10;

        }


return root;
    }
}
