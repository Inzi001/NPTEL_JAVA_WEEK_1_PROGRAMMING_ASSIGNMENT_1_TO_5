import java.util.Scanner;
public class Program_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        //define size of array
        s = input.nextInt();
        //The array is defined "arr" and inserted marks into it.
        int[] arr = new int[s];
        for(i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        result = arr[0];
        mark_avg = 0;
        for(i=0;i<arr.length;i++)
        {
            mark_avg += arr[i];
            if(arr[i]>result)
                result = arr[i];
        }
        mark_avg/=s;
        System.out.println(result);
        System.out.println(mark_avg);
    }
}
