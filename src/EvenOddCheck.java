import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên: ");
        int a = scanner.nextInt();
        if (a %2 == 0){
            System.out.println(a + " là số chẵn");
        }
        else {
            System.out.println(a + " là số lẻ");
        }
    }
}
