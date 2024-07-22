import java.util.*;
public class program {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        Frequency(arr);
    }

    static void Frequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        map.forEach((key, value) ->
        System.out.println(key + " " + value));
    }
}
