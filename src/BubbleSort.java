
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    //ham check xu lieu dau vao 

    public int getInt(String message, String firstError, String secondError, String thirdError, int min, int max) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(message);
                String input = sc.nextLine();
                int number = Integer.parseInt(input);  //nhan vao 1 string va ep thanh so 

                //check range
                if (number > max) {
                    System.out.println("firstError");
                } else if (number < min) {
                    System.out.println("secondError");

                } else {
                    return number;
                }

            } catch (NumberFormatException ex) { //xay ra khi nguoi dung khong nhap so nguyen
                System.out.println("thirdError");
            }

        }
    }

    //ham tao random de khoi tao mang voi cac gia tri ngau nhien ma khong can nguoi dung nhap thu cong vao, test bubblesort    
    void randomElement(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length); //sinh ra cac so ngau nhien va gan phan tu vao mang
        }
    }

    //ham sap xep 
    void bubble_sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { //so lan so sanh
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
    }
}
