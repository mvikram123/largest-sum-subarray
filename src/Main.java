import java.util.*;
public class Main
{
    public static void main(String[] args) {


        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};

        int count=0;
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        // Arrays.sort(arr);
        for(int i=0; i<n; i++)
        {

            sum=0;
            for(int j=i+1; j<n; j++)
            {
                sum=sum+arr[j];
                max=Math.max(max,sum);
            }
        }
        if(max<sum)
        {
            max=sum;
            System.out.println("largest sum of subarray:"+max);
        }
        else{
            System.out.println("largest sum of subarray:"+max);
        }
    }
}

//output largest sum of subarray=4-1-2+1+5=7