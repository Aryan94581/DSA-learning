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
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");    
        }
        System.out.println("");
        System.out.println("3. Type ");
        for (int i = 5; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");    
        }
        System.out.println("");
        System.out.println("4. Type ");
        
    }
}
