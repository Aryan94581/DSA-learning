// star pattern
public class Starpattern {
    
    public static void main(String[] args) {
        System.out.println("1 .Type");
        System.out.println("");
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("2. Type");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");    
        }
        System.out.println("");
        System.out.println("3. Type ");
        System.out.println("");

        for (int i = 5; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j +" ");
            }
            System.out.println("");    
        }
        System.out.println("");
        System.out.println("4. Type ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");    
        }
        for (int i = 5; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");    
        }
        System.out.println("");
        System.out.println("5. Type ");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");    
        }
        System.out.println("");
        System.out.println("6. Type ");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("7. Type ");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("8. Type ");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("9. Type ");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }    
            System.out.println("");
        }
        System.out.println("");
        System.out.println("10. Type ");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("* ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("* ");
            }    
            System.out.println("");
        }
        System.out.println("");
        System.out.println("11. Type ");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }    
            System.out.println("");
        }
        for (int i = 1; i <=5; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("  ");
            }
            for (int k = 3; k >= i; k--) {
                System.out.print("* ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("* ");
            }    
            System.out.println("");
        }
        System.out.println("");
        System.out.println("12. Type ");
        System.out.println("");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("* ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("* ");
            }    
            System.out.println("");
        }
        for (int i = 2; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }    
            System.out.println("");
        }
        System.out.println("");
        System.out.println("13. Type ");
        System.out.println("");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("13. Type ");
        System.out.println("");
        n = 5;
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >=1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
        
    }
}
