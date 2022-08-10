import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {task5(); task6(); task7(); task8(); task9();} {

    }
    private static void task5 () {
        int hight = 3; // высота массива
        int lenght = 3;// ширина массива
        int [][] matrix = new int[hight][lenght];// объявили массив
        int numb = 1; // любое значение для проставления по диагонали
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || j == matrix[i].length-1-i) {
                    matrix[j][i] = numb;
                }
            }
        }

        for (int [] row : matrix){
            for (int column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int [] arr1 = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length-1-i];
        }
        arr = arr1;
        System.out.println(Arrays.toString(arr));
    }

    public static void task7(){
        int[] arr = new int[]{5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int leghtMin = arr.length/2;
        for (int i = 0; i < leghtMin; i++) {
            int x = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = x;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task8(){
        int[] arr = new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int summ = -2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i]+arr[j] == summ){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + summ);
                    i = arr.length-1;
                }
            }
        }
    }
    public static void task9(){
        int[] arr = new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int summ = -2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i]+arr[j] == summ){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + summ);
                }
            }
        }
    }
}
