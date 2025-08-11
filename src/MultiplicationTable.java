import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cần in ra bảng cửu chương: ");
        System.out.print("Nhập vào số Quả đấm: ");
        int n = scanner.nextInt();
        for(int i = 1; i<10; i++){
            i = n * (i+1);
            System.out.println(i);
        }
    }
}
