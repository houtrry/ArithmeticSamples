import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: houtrry
 * @time: 2019/4/29
 * @desc: 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 * <p>
 * 示例 2:
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class FindOnlyOneNumber {

    public static void main(String... args) {
        int[] arr =  {12, 10, 8, 12, 8, 12, 10, 7};
        System.out.print(findOnlyOneNumber(arr));
    }

    public static int findOnlyOneNumber(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("arr is null");
        }
        if (arr.length == 1) {
            return arr[0];
        }
        if (arr.length == 2) {
            throw new IllegalArgumentException("no such only number, and arr is " + Arrays.toString(arr));
        }
        List<Integer> oneNumberList = new ArrayList<>();
        List<Integer> otherNumberList = new ArrayList<>();
        int item;
        for (int i = 0; i < arr.length; i++) {
            item = arr[i];
            if (otherNumberList.contains(item)) {
                continue;
            } else if (oneNumberList.contains(item)) {
                oneNumberList.remove(Integer.valueOf(item));
                otherNumberList.add(item);
            } else {
                oneNumberList.add(item);
            }
        }
        if (oneNumberList.size() != 1) {
            throw new IllegalArgumentException("no such only number, and arr is " + Arrays.toString(arr));
        }
        return oneNumberList.get(0);
    }

}
