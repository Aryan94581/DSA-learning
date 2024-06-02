package Array;

public class Rotate2DArray {
    public static void main(String[] args) {

        int Arrar[][] = new int[3][3];
        Arrar[0][0] = 1;
        Arrar[0][1] = 2;
        Arrar[0][2] = 3;
        Arrar[1][0] = 4;
        Arrar[1][1] = 5;
        Arrar[1][2] = 6;
        Arrar[2][0] = 7;
        Arrar[2][1] = 8;
        Arrar[2][2] = 9;
        for (int i = 0; i < Arrar.length; i++) {
            for (int j = 0; j < Arrar.length; j++) {
                System.out.print(Arrar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
