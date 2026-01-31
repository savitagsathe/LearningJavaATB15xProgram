package ex_16_Arrays;

public class Lab164_2D_Arry_Iterate_star {
    static void main(String[] args) {
        //2d
        int [][]matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//Iterate 2D array
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print("*"+"|");
            }
            System.out.println("");
        }

    }
}
