import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProjectEuler2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            
            System.out.println(sumsEvenFib(n));
        }
    }
    
    public static  List<Long> genFib(long maxValue) {
        List<Long> fib = new ArrayList<Long>();
        fib.add(1L);
        fib.add(2L);
        
        while(true){
           long nextFib =fib.get(fib.size()-1)+fib.get(fib.size()-2);
            if(nextFib > maxValue){
                break;
            }
            fib.add(nextFib);
        }
        return fib;
    }
    public static long sumsEvenFib(long n) {
        long sum=0;
        List<Long> fib = genFib(n);
        
        for (int i =0; i < fib.size(); i++){
            if(fib.get(i)%2==0){
                sum+=fib.get(i);
            }
        }
            
        return sum;
    }
}




