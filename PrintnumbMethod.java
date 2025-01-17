public class PrintnumbMethod {
    public static void main(String[] args) {
        printNumbers(1);
    }

    public static void printNumbers(int number) {
        if (number <= 10) {
            System.out.println(number);
            printNumbers(number + 1); 
        }
    } 
}
