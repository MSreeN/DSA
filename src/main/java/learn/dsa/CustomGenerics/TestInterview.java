package learn.dsa.CustomGenerics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class TestInterview {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("ram", "Ram", "Rajesh", "rajesh", "Kumar");

        HashMap<String, Integer> map = new HashMap<>();
        for(String str : strList){
            if(map.containsKey(str.toUpperCase())) map.put(str.toUpperCase(), map.get(str.toUpperCase())+1);
            else map.put(str.toUpperCase(), 1);
        }

        for(Map.Entry entries: map.entrySet()){
            System.out.println(entries.getKey() + " " + entries.getValue());
        }

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
    }

//    select * from employee order by salary desc offset 1 limit 1;

}
