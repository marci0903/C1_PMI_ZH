import java.util.ArrayList;

public class Matrix {
    public static int sumOfEvenNumbers(int[][] matrix){
        int result=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][j]%2==0){
                    result+=matrix[i][j];
                }
            }
        }
        return result;
    }
    public static ArrayList<Integer> rowsWithZero(int[][] matrix){
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                if(matrix[i][j]==0) {
                    result.add(i);
                    break;
                }

            }
        }
        return result;
    }
}
