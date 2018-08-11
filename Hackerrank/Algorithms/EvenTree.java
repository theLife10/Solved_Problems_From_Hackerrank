import java.io.*;
import java.util.*;

public class Solution {
    static int count=0;
    static Map<Integer,ArrayList<Integer>>tree;
    static Scanner keyboard= new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        tree = new HashMap<Integer,ArrayList<Integer>>();
        int vertices= keyboard.nextInt();
        int edges = keyboard.nextInt();
        
        for(int i =0; i <= vertices; i++){
            tree.put(i, new ArrayList<Integer>());
        }
        for(int i =0; i < edges; i++){
             
            int c= keyboard.nextInt();
            int p = keyboard.nextInt();
            tree.get(p).add(c);
        }
        
        for(int i =2; i <tree.size(); i++){
            if(count(i) % 2 != 0){
                count++;
            }
        }
        System.out.println(count);
        
    }
    public static int count(int n){
        int numberOfChildern= tree.get(n).size();
        
        for(int c : tree.get(n)){
            numberOfChildern+=count(c);
        }
        return numberOfChildern;
    }
}
