package EjercicioBillete;
import java.util.*;
public class tabla {
    public static void main(String[] args) {
        int billete = 20;
        int[][] tabla = new int[8][4];
        Random random = new Random();
        int x = random.nextInt(8);
        int y = random.nextInt(4);
        tabla[x][y] = billete;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(tabla[i][j]+ "#");
            }
            System.out.println();
        }
    }
}
