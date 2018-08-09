import java.util.Scanner;

public class SplitArray {
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

        //Vị trí muốn tách
        System.out.println("\nNhập vào vị trí thứ nhất tách mảng:");
        int index_1 = scanner.nextInt();
        System.out.println("Nhập vào vị trí thứ hai tách mảng:");
        int index_2 = scanner.nextInt();
    }
}
