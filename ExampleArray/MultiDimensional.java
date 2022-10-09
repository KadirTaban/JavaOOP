package ExampleArray;

public class MultiDimensional {
    public static void main(String[] args){
        int [][] table = new int[][]{
            {1,23,23},
            {2,34,67},
            {4,54,34},
            {7,53,87},
            {4,76,56}
        };
        int[][] table2 = new int[5][3];
        table2[0][0] = 1;
        table2[0][1] = 23;
        table2[0][2] = 23;
        
        for(int i = 0; i<table.length; i++){
            for(int j = 0; j<table[0].length; j++ ){
                System.out.println(table[i][j] + " ");

            }
            System.out.println();
        }
    }
}
