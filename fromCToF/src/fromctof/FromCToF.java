package fromctof;

import java.util.Scanner;

public class FromCToF {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int degree = scanner.nextInt();
        
        degree = (int) (degree * 1.8 +32);
        
        System.out.println(degree);
    }
    
}
