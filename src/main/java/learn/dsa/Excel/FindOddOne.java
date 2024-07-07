package learn.dsa.Excel;

import java.util.ArrayList;
import java.util.List;

public class FindOddOne {
    public static void sample(String siteId, String[] ppay, String... args) {
        List<String> ppayList = List.of(ppay);
        List<String> xstageId = new ArrayList<>();
        for (String a : args) {
            String siteIdIn = siteId;
            int noOfZeroes = 0;
            if (a.length() < 12) {
                noOfZeroes = (12 - a.length());
            }
            siteIdIn = String.format("%-" + noOfZeroes + "s", siteIdIn).replace(" ", "0");
            xstageId.add(siteIdIn + a);
        }

        for (String id : ppayList) {
            if (!xstageId.contains(id)) {
                System.out.println(id);
            }
        }
    }
}
