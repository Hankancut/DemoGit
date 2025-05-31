import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubblesort = new BubbleSort(); //khoi tao doi tuong 
        
        int number = bubblesort.getInt("Enter number of array: ", "wrong1(do chua biet de bai yeu cau nhap tu bao nhieu)", "number must > 0", "input phai la so", 0, Integer.MAX_VALUE); //yeu cau nguoi dung nhap dung format so 

        int[] array = new int[number]; //tao ra mang co kich thuoc bang so ma nguoi dung da nhap o tren 

        bubblesort.randomElement(array); //tao ra cac so ngau nhien roi gan vao mang 
        System.out.println("Unsorted array: " + Arrays.toString(array)); //in ra danh sach mang chua sap xep
        bubblesort.bubble_sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

    }

}
