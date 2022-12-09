import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner  sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        String a = sc.nextLine();
        switch (a){
            case "+":
                pilus(b, sc.nextInt());
                break;
            case "-":
                minus(b, sc.nextInt());
                break;
            case "*":
                koboituu(b, sc.nextInt());
                break;
            case "/":
                boluu(b, sc.nextInt());
                break;
            case "%":
                kaldyk(b, sc.nextInt());
                break;
            default:
                System.out.println("tuura emes operatsia");
        }
    }
    public static void pilus(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void minus(int a, int b) {
        int sum = a - b;
        System.out.println(sum);
    }

    public static void boluu(int a, int b) {
        int sum = a / b;
        System.out.println(sum);
    }

    public static void koboituu(int a, int b) {
        int sum = a * b;
        System.out.println(sum);
    }
    public static void kaldyk(int a, int b) {
        int sum = a % b;
        System.out.println(sum);
    }
}