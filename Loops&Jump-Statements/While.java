import java.util.Scanner;
public class While{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no. ");
        int n = sc.nextInt();

        int i = 0;

        //While loop
        while( i++ < n ){
            System.out.println(i);
            
        }sc.close();

    }
}