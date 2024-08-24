package learn.dsa.Sorting;

import java.util.ArrayList;
import java.util.List;

public class ChocolateDistribution {
    public static void main(String[] args) {
        long ans = findMinDiff(new ArrayList<Integer>(List.of(3, 4, 1, 9, 56, 7, 9 ,12)), 8, 5);
        System.out.println(ans);
    }

    public static long findMinDiff(List<Integer> a, int n, int m) {
        // your code here
        sortList(a, 0, n - 1);
        long min = Long.MAX_VALUE;
        for (int i = 0; i <= a.size() - m; i++) {
            if (a.get(i + (m-1)) - a.get(i) < min)
                min = (long) a.get(i + m - 1) - a.get(i);
        }
        return min;
}

    public static void sortList(List<Integer> list, int l, int h) {
        if (l < h) {
            int p = hoareSort(list, l, h);
            sortList(list, l, p);
            sortList(list, p + 1, h);
        }
    }

    public static int hoareSort(List<Integer> list, int l, int h) {
        int low = l - 1;
        int high = h + 1;
        int pivot = list.get(l);
        while (true) {
            do {
                low++;
            } while (list.get(low) < pivot);

            do {
                high--;
            } while (list.get(high) > pivot); // <-- Corrected condition

            if (low >= high) return high;

            int temp = list.get(low);
            list.set(low, list.get(high));
            list.set(high, temp);
        }
    }

}
