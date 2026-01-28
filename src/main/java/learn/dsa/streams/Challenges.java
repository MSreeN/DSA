package learn.dsa.streams;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Challenges {


    public static void averageOfIntegers(){
        Stream.of(1,2,3,4,5).mapToDouble(ele -> ele).average().ifPresent(System.out::println);
    }

    public static void stringsToUppercase(){
        List<String> str =
                Stream.of("h","e","l","lo").map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(str.toString());

    }

    public static void sumOfEvenOddNumbers(){
        int[] numbers = {1,2,3,4,5,6};
        int evenSum = Arrays.stream(numbers).filter(ele -> ele%2==0).sum();
        int oddSum = Arrays.stream(numbers).filter(ele->ele%2!=0).sum();
        System.out.println(evenSum +" "+oddSum);
    }

    public static void removeDuplicatesFromList(){
        List<Integer> numbers = List.of(1,2,3,2,4,5,6,2,4,7,4,5);
        List<Integer> uniqueNumbers = numbers.stream().distinct().toList();
        System.out.println(uniqueNumbers.toString());
    }

    public static void findNumberOfStringStartWithSpecificLetter(){
        List<String> strings = List.of("hello", "harish", "world","warangal", "khyathi");
        Long specificStringCount = strings.stream().filter(ele -> ele.startsWith("w")).count();
        System.out.println(specificStringCount);
    }

    public static void sortString(){
        List<String> strings = List.of("a", "d","z","c","d");
        List<String> sortedStrings =
                strings.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedStrings);
    }

    public static void maxAndMin(){
        List<Integer> numbers = List.of(4,3,6,3,89);
        int min = numbers.stream().min(Comparator.reverseOrder()).get();
        int max = numbers.stream().max(Integer::compare).get();
        System.out.println(min);
        System.out.println(max);
    }

    public static void secondSmallestAndLargest(){
        List<Integer> numbers = List.of(-1,1,4,5,3,2,6,7,8,23,44,56,99);
        int secondSmallest = numbers.stream().distinct().sorted().skip(1).findFirst().orElse(-1);
        int secondLargest =
                numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
        System.out.println(secondSmallest + " "+secondLargest);
    }

    public static void frequencyOfEachElement(){
        BiConsumer<String, List<String>> consumer =
                (key, value) -> System.out.println(key +" "+value.size());
        List<String> elements = List.of("a","a", "b", "b","c");
        elements.stream().collect(Collectors.groupingBy(ele -> ele)).forEach(consumer);
    }

    public static void joinStrings(){
        List<String> elements = List.of("a", "a", "b", "b", "c");
        Function<String, String> stringWithBraces = s-> '['+s+']';
        String str = elements.stream().map(stringWithBraces::apply)
                .collect(Collectors.joining(",","[","]"));
        System.out.println(str);

    }

    public static void sortDecimals(){
        List<Double> decimals = List.of(10.4, 23.67,1.4,45.00);
        List<Double> sortedDecimals = decimals.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedDecimals);
    }

    public static void frequencyOfCharInString(){
        String str = "abcdacda";
         Map<String,List<String>> freq =
                 Arrays.stream(str.split("")).collect(Collectors.groupingBy(ele->ele));
        System.out.println(freq);
    }

    private static void mergeUnsortedArrayIntoSorted() {
        int[] randomNumbers = {12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};
        int[] randomNumber2 = {4, 3, 2, 5, 6, 78, 98, 53, 90};

       int sortedArrayByMergingTwoArray = IntStream.concat(Arrays.stream(randomNumbers),
                Arrays.stream(randomNumber2)).boxed().sorted(Comparator.reverseOrder()).min(Comparator.reverseOrder()).orElse(-1);
//        System.out.println(Arrays.toString(sortedArrayByMergingTwoArray));
        System.out.println(sortedArrayByMergingTwoArray);
    }

    private static void mergeUnsortedArrayIntoSortedWithoutDuplicate() {
        int[] randomNumbers = {12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};
        int[] randomNumber2 = {4, 32, 2, 5, 6, 78, 98, 53, 90};

        int[] mergedArray = IntStream.concat(Arrays.stream(randomNumbers),
            Arrays.stream(randomNumber2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(mergedArray));
    }

    private static void min3max3() {
        List<Integer> randomNumbers = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        List<Integer> result = randomNumbers.stream().sorted().limit(3).toList();
    }

    private static void isAnagram2() {

        String string1 = "listen";
        String string2 = "silent";

        String str1 = Arrays.stream(string1.split("")).sorted().collect(Collectors.joining());
        String str2 = Arrays.stream(string2.split("")).sorted().collect(Collectors.joining());
        System.out.println(str1+" "+str2);
        if(str1.equals(str2)) System.out.println("true");
    }

    private static void sumOf() {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = oneToTen.stream().reduce(Integer::sum).get();
        System.out.println(sum);
    }

    private static void secondLargestNumberFromList() {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int secondLargest =
                oneToTen.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargest);

    }

    private static void sortByLengthOfList() {
        List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
        List<String> increasingOrderNames =
                names.stream().sorted(Comparator.comparingInt(String::length)).toList();
        Iterator<String> itr = increasingOrderNames.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    private static void commonElements() {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> twoToTen = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> intersectingEles = oneToTen.stream().filter(twoToTen::contains).toList();
        Iterator<Integer> itr = intersectingEles.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    private static void reverseEachWord() {
        String stmt = "java is OOP language";
//        String reversedString =
//                Arrays.stream(stmt.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining(" "));
//        System.out.println(reversedString);
        String reversedString =
                Arrays.stream(stmt.split(" ")).map(str -> new StringBuilder().append(str).reverse()).collect(Collectors.joining(" "));
        System.out.println(reversedString);
    }

    public static void findFirstTest(){
        int[] elements = {2, 3, 1, 4, 4, 1, 4, 333, 3, 333, 2, 2, 2, 5, 222};
        boolean ele = Arrays.stream(elements).
                allMatch(e -> e%2 == 0);
        System.out.println(ele);
    }

    private static void mostRepeatedElement() {
        int[] elements = {2, 3, 1, 4, 4, 1, 4, 333, 3, 333, 2, 2, 2, 5, 222};
//        Arrays.stream(elements).
    }

    private static void checkIfStringPalindrome(){
        String str = "racecar";
        String finalStr = str.replaceAll("\\s+", "").toLowerCase();
        boolean res =  IntStream.rangeClosed(0, finalStr.length()/2)
                .noneMatch(i -> finalStr.charAt(i) != finalStr.charAt(finalStr.length() -1 -i));
        System.out.println(res);
    }

    private static void sortEmployeesBasedOnSalaryIntoMap(){
        List<Employee> employees = Arrays.asList(
                new Employee(1,3 ,"vishnu", "70000"),
                new Employee(2,3, "chaitanys", "60000"),
                new Employee(2,6, "sai", "300000"),
                new Employee(2, 8,"khyathi", "6500000"),
                new Employee(2, 8,"mahesh", "5500000")
        );
        Map<String, String> map =
                employees.stream().sorted(Comparator.comparing(Employee::salary)).
                collect(Collectors.toMap(Employee::name, Employee::salary, (a, b)->a,
                        LinkedHashMap::new));
        map.forEach((ele, v) -> System.out.println(ele+" "+v));

    }

    //     Filter Even Numbers from a List
    public static void filterEvenNumbersFromAList() {
        Stream.of(1, 2, 3, 4, 5, 6).filter(ele -> ele % 2 == 0).forEach(System.out::println);
    }

//    . Find Maximum in a List
    public static void FindMaxInList(){
//        System.out.println(Stream.of(1,2,3,4,5,4).max(Comparator.naturalOrder()).orElseGet(() -> null));
        System.out.println(Stream.of(1,2,8,3,4,5,4).max((a, b) -> b-a).orElseGet(() -> null));
    }

    public static void SortEmployeeReverse(){
        List<Employee> employees = Arrays.asList(
                new Employee(1,4, "vishnu", "70000"),
                new Employee(2, 4, "chaitanys", "60000"),
                new Employee(3, 4, "sai", "300000"),
                new Employee(4, 4, "khyathi", "6500000"),
                new Employee(5, 4, "mahesh", "5500000")
        );
        employees.stream().sorted(Comparator.comparing(Employee::salary).reversed()).toList();
    }

//    Count Strings with Specific Prefix
    public static void countStringsWithSpecificPrefix(){
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        names.stream().filter(ele -> ele.startsWith("A")).count();
    }

    public static void findLongestString(){
        List<String> listOfStrings = List.of("aaaaa", "b", "cde", "bc");
        String s = listOfStrings.stream().max(Comparator.comparing(String::length)).orElse(null);
        System.out.println(s);
    }

    public static void employeeAvgAge(){
        List<Employee> employeeList = List.of(
                new Employee(1, 20, "abc", "1"),
                new Employee(1, 25, "abc", "1"),
                new Employee(1, 46, "abc", "1"),
                new Employee(1, 49, "abc", "1")
        );

        double avg = employeeList.stream().mapToInt(Employee::age).average().orElse(0.00);
        System.out.println(avg);
    }

    public static void mergeTwoUnsortedLists(){
        List<Integer> list = List.of(5,7,6,3,2);
        List<Integer> list2 = List.of(2,8,6,8,4,1,7,2);
        List<Integer> result = Stream.concat(list.stream(), list2.stream()).sorted().distinct().toList();
        System.out.println(result);
    }

    public static void groupByEmployeeName(){
        List<Employee> employeeList = List.of(
                new Employee(1, 20, "abc", "100"),
                new Employee(1, 25, "abc", "100"),
                new Employee(1, 46, "abc", "100"),
                new Employee(1, 49, "cde", "10"),
                new Employee(1, 49, "cde", "10"),
                new Employee(1, 49, "cde", "10")
        );

        Map<String, Integer> map =
                employeeList.stream().collect(Collectors.groupingBy(Employee::name
                , Collectors.summingInt(emp -> Integer.parseInt(emp.salary()))));
        System.out.println(map);
    }

    public static void occurrencesOfString(){
        List<String> names = List.of("Khyathi", "mahesh", "khyathi", "nag", "nag");
        Map<String, Long> table =
                names.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println(table);
    }

    public static void occurrencesOfString2() {
        List<String> names = List.of("Khyathi", "lkijuhy", "mahesh", "khyathi", "nag", "nag");
        names.stream().collect(Collectors.joining("[", ",", "]"));
        Map<Integer, Long> table =
                names.stream().collect(Collectors.groupingBy(String::length,
                        Collectors.counting()));
        System.out.println(table);
    }

    public static void sumWithReduce(){
        List<Integer> list = List.of(1,2,9,3,4,5);
        int res = list.stream().reduce( Integer::sum).orElse(0);
        System.out.println(res);
    }

    public static void findMaxElementWithReduce(){
        List<Integer> list = List.of(100, 1,2,9,3,4,5);
//        int res = list.stream().min(Comparator.reverseOrder()).orElse(-1);
        int res = list.stream().reduce((a, b) -> a>b? a:b).orElse(-1);
        System.out.println(res);
    }

//    Concatenate all strings with - between them
    public static void concatenateString(){
        List<String> names = List.of("Khyathi", "lkijuhy", "mahesh", "khyathi", "nag", "nag");
        String res = String.join("-", names);
        res = names.stream().collect(Collectors.joining("-"));
        res = names.stream().reduce((a, b) -> a+"-"+b).orElse("");
        System.out.println(res);
    }

    public static void findLongestString2(){
        List<String> names = List.of("asdkfjadsfkjasfd", "Khyathadfi", "lkijuhy", "mahesh",
                "khyathi", "nag", "nag");
        String longestString = names.stream().max(Comparator.reverseOrder()).orElse("");
        longestString = names.stream().max(Comparator.comparing(String::length)).orElse("");
        System.out.println(longestString);
    }

    public static void countTotalCharactersAcrossAllStrings(){
        List<String> names = List.of("asdkfjadsfkjasfd", "Khyathadfi", "lkijuhy", "mahesh",
                "khyathi", "nag");
        Map<String, Integer> map = names.stream().collect(Collectors.toMap(Function.identity(),
                String::length));
//        int i = names.stream().reduce(0, (a, b) -> a+b.length());
        int totalChars = names.stream()
                .reduce(0,
                        (sum, str) -> sum + str.length(), Integer::sum);
        System.out.println(map);
    }

    public static void frequencyOfCharsInString2(){
        String s = "strings";
        char[] c = s.toCharArray();
        BiConsumer<String, List<String>> consumer = (k, v) -> System.out.println(v.size());
        Arrays.stream(s.split("")).collect(Collectors.groupingBy(e -> e))
                .forEach(consumer);
    }


    public static void main(String[] args) {
//        frequencyOfCharInString();
//        findFirstTest();
//        checkIfStringPalindrome();
//        sortEmployeesBasedOnSalaryIntoMap();
//        filterEvenNumbersFromAList();
//        FindMaxInList();
//        findLongestString();
//        employeeAvgAge();
//        mergeTwoUnsortedLists();
//        groupByEmployeeName();
//        occurrencesOfString2();
//        sumWithReduce();
//        findMaxElementWithReduce();
//        concatenateString();
//        findLongestString2();
//        countTotalCharactersAcrossAllStrings();
//        frequencyOfCharInString();
        frequencyOfCharsInString2();
    }
}
