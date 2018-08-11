import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProjectEuler1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long target = in.nextLong() - 1;
            System.out.println(SumDivisibleBy(target, 3)+SumDivisibleBy(target, 5)-SumDivisibleBy(target, 15));
        }
    }
    public static long SumDivisibleBy(long target, long n){
        long p=target/n;
        return n*(p*(p+1))/2;
    }
}

