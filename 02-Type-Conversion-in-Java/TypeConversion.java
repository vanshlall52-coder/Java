public class TypeConversion {
    public static void main(String[] args) {
        // 1. Implicit Type Conversion 
        // byte to int
        byte b = 25;
        int i = b;
        System.out.println(i); // Output : 25

        // 2. char to int
        char c = 'A';
        int z = c;
        System.out.println(z); // output : 65

        // 3. Explicit Type Conversion 
        // int to byte
        int x = 300;
        byte y = (byte) x;
        System.out.println(y); // Output : 44

        // 4. Truncating Conversion
        float f = 6.7658f;
        int k = (int)f;
        System.out.println(k); // Output : 6 

        // 5. Type Promotion 
        byte g = 50;
        g = (byte) (g * 2);// Output : 100
        System.out.println(g);
        
    }
}