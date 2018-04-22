import java.util.Arrays;

/**
 * @author: houtrry
 * @time: 2018/4/22
 * @desc: 简单实现冒泡排序
 */
public class BubbleSort {

    public static void main(String... args) {

        int[] arr = {10, 2, 6, 50, 21, 70, 3, 5};

        print("arr: " + Arrays.toString(arr));
        sort(arr, true);
        print("arr: " + Arrays.toString(arr));
    }

    /**
     * @param arr   数组
     * @param order true:从小到大;false:从大到小;
     */
    public static void sort(int[] arr, boolean order) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((order && arr[i] <= arr[j]) || (!order && arr[i] >= arr[j])) {
                    continue;
                }
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void print(String message) {
        if (message != null) {
            System.out.println(message);
        }
    }
}
