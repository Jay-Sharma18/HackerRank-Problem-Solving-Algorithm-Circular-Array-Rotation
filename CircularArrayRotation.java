package JavaAlgorithms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CircularArrayRotation {
	


	    // Complete the circularArrayRotation function below.
	    static int[] circularArrayRotate(int[] a, int k, int[] queries) {
	        //array to hold elements queried from rotated array
	        int[] answer=new int[queries.length];
	        //if no. of rotations is higher than array length, set rotations to
	        //mod of array length as an n sized array rotated n times would be the same as
	        //original array
	        if(k>a.length)
	        {
	            k=k%a.length;
	        }
	        else if(k<a.length)
	        {   
	            //loop to run rotation required no of times
	            for(int i=0;i<k;i++)
	            {   
	                //logic to rotate array once
	                int temp=a[a.length-1];
	                for(int j=a.length-1;j>=1;j--)
	                {
	                    a[j]=a[j-1];
	                }
	                a[0]=temp;
	            }
	        }
	        
	        //queried elements from rotated array saved in new array
	        for(int i=0;i<queries.length;i++)
	        {
	            answer[i]=a[queries[i]];
	        }

	        return answer;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Jay\\Desktop\\Selenium and Drivers\\test.txt"));

	        String[] nkq = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nkq[0]);

	        int k = Integer.parseInt(nkq[1]);

	        int q = Integer.parseInt(nkq[2]);

	        int[] a = new int[n];

	        String[] aItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }

	        int[] queries = new int[q];

	        for (int i = 0; i < q; i++) {
	            int queriesItem = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	            queries[i] = queriesItem;
	        }

	        int[] result = circularArrayRotate(a, k, queries);

	        for (int i = 0; i < result.length; i++) {
	            bufferedWriter.write(String.valueOf(result[i]));

	            if (i != result.length - 1) {
	                bufferedWriter.write("\n");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	
}


