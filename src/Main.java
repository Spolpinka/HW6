public class Main {
    public static void main(String[] args) {task1();} {

    }
    private static void task1 () {
        int [] first = new int [3];
        first [0] = 1;
        first [1] = 2;
        first [2] = 3;

        double [] second = {1.57, 7.654, 9.986};

        String [] third = {"aaa", "bbb", "ccc"};

        //task 2
        for (int i : first){
            if (i != first[first.length-1]){
                System.out.print(i + ", ");
            }
            else {
                System.out.print(i);
            }
        }
        System.out.println("");
        for (double sec : second){
            if (sec != second[second.length-1]) {
                System.out.print(sec + ", ");
            } else {
                System.out.print(sec);
            }
        }
        System.out.println("");
        for (String s : third){
            if (s != third[third.length-1]) {
                System.out.print(s + ", ");
            } else {
                System.out.print(s);
            }
        }
        System.out.println("");

        // task3

        for (int i = first.length-1; i >=0; i--) {
            if (i != 0) {
                System.out.print(first[i] + ", ");
            } else {
                System.out.print(first[i]);
            }
        }
        System.out.println("");
        for (int i = second.length-1; i >= 0; i--) {
            if (i != 0){
                System.out.print(second[i] + ", ");
            } else {
                System.out.print(second[i]);
            }
        }
        System.out.println("");
        for (int y = third.length-1; y >= 0; y--) {
            if (y != 0){
                System.out.print(third[y] + ", ");
            } else {
                System.out.print(third[y]);
            }
        }
        System.out.println("");

        //task4

        for (int i = 0; i < first.length; i++){
            if (first[i]%2 != 0){
                first[i] += 1;
            }
        }
        for (int i : first){
            System.out.print(i + ", ");
        }
    }
}
