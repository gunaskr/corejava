import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String m = in.nextLine();
        if(m.length()%2==0){
            System.out.println("Error");
            }else{
                for(int i=0;i<Math.ceil((double)m.length()/2);i++)
                {
                    String a = "";
                    for(int k=0;k<i;k++)a+=" ";
                    for(int j=i;j<m.length()-i;j++)a+=m.charAt(j);
                    System.out.println(a);
                }
                for(int i=(m.length()/2)-1;i>=0;i--)
                {
                    String a = "";
                    for(int k=0;k<i;k++)a+=" ";
                    for(int j=i;j<m.length()-i;j++)a+=m.charAt(j);
                    System.out.println(a);
                }
                }
    }
}