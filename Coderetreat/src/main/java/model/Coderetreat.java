package model;

public class Coderetreat {

    private boolean[][] matrix;

    // Parameterized constructor to accept a custom matrix
    public Coderetreat(boolean[][] matrix) {
        this.matrix = matrix;
    }

    public int neighbours() {
        int neighbours = 0;

        // Loop through the neighbors of cell (1,1) in a 3x3 matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Skip the center cell itself
                if (i == 1 && j == 1) continue;
                // Count `true` cells surrounding the center cell
                if (matrix[i][j]) {
                    neighbours++;
                }
            }
        }
        return neighbours;
    }

    // Optional method to print the matrix for debugging
    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage with a custom matrix
        boolean[][] customMatrix = {
            {false, true, false},
            {true, true, false},
            {false, false, true}
        };

        Coderetreat coderetreat = new Coderetreat(customMatrix);
        coderetreat.printMatrix();
        System.out.println("Neighbours: " + coderetreat.neighbours());
    }
}