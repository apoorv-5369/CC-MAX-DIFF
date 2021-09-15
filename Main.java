import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       int[] p = new int[2*t];
       for(int i=0; i<t*2; i+=2) {
    	   for(int j=i; j<i+2; j++) {
    		   p[j] = sc.nextInt();
    	   }	   
       }
       for(int i=0; i<t*2; i+=2) {
    	   if(p[i]>p[i+1]) System.out.println(p[i+1]);
    	   else if(p[i]==p[i+1]) System.out.println(p[i]);
    	   else if(p[i]<p[i+1]) System.out.println(2*p[i]-p[i+1]);
       }
	}
}
