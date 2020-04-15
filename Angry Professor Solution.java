import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static void print(int arr[],int k,int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=0){
                count++;
            }
            
        }
        if(count>=k){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            
            }
            print(arr,k,n);
        }
       // print(arr,k,n);
    }

    
}
