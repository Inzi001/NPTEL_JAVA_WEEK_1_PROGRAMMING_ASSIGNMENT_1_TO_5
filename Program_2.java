import java.util.Scanner;
public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=0;
        while(i< n*2) {
            if (i % 3 == 0) {
                sum += i;
            }
            i += 2;
        }
        System.out.print(sum);
    }

    }

