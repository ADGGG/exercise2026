public class fibonacciNumber {     
    public static void main(String[] args) {         
        int f1 = 1, f2 = 1;                  
        System.out.print("First 10 Fibonacci numbers: ");         
        System.out.print(f1 + " " + f2 + " ");                  
        for (int i = 3; i <= 10; i++) {             
            int fn = f1 + f2;             
            System.out.print(fn + " ");             
            f1 = f2;             
            f2 = fn;         
        }     
    } 
} 