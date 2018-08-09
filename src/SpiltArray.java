import java.util.Scanner;

public class SpiltArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng
        System.out.println("Nhập vào kích thước của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            array[i] = scanner.nextInt();
        }
        //Hiển thị mảng vừa nhập
        System.out.println("Mảng đã nhập:");
        for (int i = 0; i < size; i++) {
            System.out.printf(array[i] + "\t");
        }
    }
}
