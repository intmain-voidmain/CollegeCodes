package objectorientedjava;

public class Transposematrix {
    public static void main(String[] args) {
        int og[][]={{1,2,3},{4,5,6},{7,8,9}};
        int transpose[][]=new int[3][3];
        for (int i = 0; i < og.length; i++) {
            for (int j = 0; j < og.length; j++) {
                transpose[j][i]=og[i][j];
            }
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose.length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
