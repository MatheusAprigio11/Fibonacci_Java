public class Main {
    public static void main(String[] args) {
        int[] fibonacci = new int[20];

        int first = 0;
        int second = 1;

        fibonacci[0] = first;
        fibonacci[1] = second;

        for (int i=1; i<20; i++){
            second = first + second;
            first = second - first;
            fibonacci[i] = first;
        }
        for (int element : fibonacci) {
            System.out.print(element + ", ");
        }
    }
}