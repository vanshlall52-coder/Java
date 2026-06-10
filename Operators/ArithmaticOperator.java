public class ArithmaticOperator {
    public static void main (String[] args ) {
        int a = 10;
        int b = 5;
        int c = 80;
        int d = 90;
        int sum = a + b + c + d;

        int sub = a - d;
        int mul = d * c;
        int div = b / d;

        System.out.println("The sum of a, b, c and d is: " + sum);
        System.out.println("The difference of a and d is: " + sub);
        System.out.println("The product of d and c is: " + mul);
        System.out.println("The quotient of b and d is: " + div);

        int h = a + 2;
        h += 2; // h = h + 2
        h -= 5; // h  = h - 5

    
        System.out.println("The value of h is :"+ h);

        // 2.Increment and Decrement Operators
        int i = 15;
        i++; // i = i + 1 --> i += 1
        System.out.println("The value of i after increament is : " + i);

        int j = 35;
        j--; // i = i - 1 --> i -= 1
        System.out.println("The value of j after decreament is : "+ j);

        // 3. Prefix and Postfix Increamend - Decreament Operators
        int k = 4;
        k++; // Postfix Increament
        ++k; // Prefix Increament
        System.out.println("THe value of k is : "+ k);


    }

}