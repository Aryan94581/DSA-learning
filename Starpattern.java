public class Starpattern {
    
    public static void main(String[] args) {
        System.out.println("1 .Type");
        System.out.println("");
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("2. Type");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");    
        }
        System.out.println("");
        System.out.println("3. Type ");
        System.out.println("");

        for (int i = 5; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");    
        }
        System.out.println("");
        System.out.println("4. Type ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");    
        }
        for (int i = 5; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");    
        }
        System.out.println("");
        System.out.println("5. Type ");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println("");    
        }
        System.out.println("");
        System.out.println("6. Type ");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("7. Type ");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("8. Type ");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
