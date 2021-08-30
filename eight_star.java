import java.util.Scanner;

public class eight_star {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter Symbol: ");
        char c = sc.next().charAt(0);
        int i =1;
        int j;
        int k = n*2-1;
        while(i<=k){
            if(i==1 || i==n || i ==k){
                j=1;
                while(j<=n){
                    if(j==1 || j==n)
                    System.out.print(" ");
                    else
                    System.out.print(c);
                    j++;
                }
            }
            else{
                j=1;
                while(j<=n){
                    if(j==1 || j==n)
                    System.out.print(c);
                    else
                    System.out.print(" ");
                    j++;
                }
            }
            System.out.println();
            i++;
        }
    }
}
