public class Test8 {
	public static void main(String[] args) {
    printArrowHead(5);
}

public static void printArrowHead(int n) {
    if (n < 1) {
        System.out.println("n>0");
    }
    
    for(int i = 0; i < n; i++) {
        for(int j = 0; j <= i; j++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    for(int i = 1; i < n; i++) {
        for(int j = (n - i); j > 0; j--) {
            System.out.print("*");
            }
            System.out.print("\n");
            }
        }
    }