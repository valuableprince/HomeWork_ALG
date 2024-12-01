import java.util.Comparator;
import java.util.List;

public class Collections {

    public static <T> int binarySearch(List<T> list, T key) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Comparable<? super T> midVal = (Comparable<? super T>) list.get(mid);
            int comparison = midVal.compareTo(key);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static <T> int binarySearch(List<T> list, T key, Comparator<? super T> c) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            T midVal = list.get(mid);
            int comparison = c.compare(midVal, key);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
