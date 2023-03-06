public class Main {
    public static void main(String[] args) {
        int[][] tablasMultiplicar = new int[10][10]; // Creamos una matriz de 10x10

        // Rellenamos la matriz con los resultados de las multiplicaciones
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablasMultiplicar[i][j] = (i + 1) * (j + 1);
            }
        }

        // Imprimir las tablas de multiplicar
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablasMultiplicar[i][j] + "\t"); //Caracter tabulacion \t
            }
            System.out.println();// Salto de linea cada 10
        }
    }
}