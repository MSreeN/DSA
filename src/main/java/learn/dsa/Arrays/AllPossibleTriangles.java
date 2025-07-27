package learn.dsa.Arrays;

import java.lang.reflect.Field;
import java.util.Arrays;

public class AllPossibleTriangles {
    int a;
    public static void main(String[] args) throws ClassNotFoundException {
//        Class<?> a =  Class.forName("learn.dsa.Arrays.AllPossibleTriangles");
        Class<?> a = ClassLoader.getPlatformClassLoader().loadClass("learn.dsa.Arrays.AllPossibleTriangles");
        Field[] field = a.getDeclaredFields();
        for(Field f: field){
            System.out.println(f.getName());
        }
//        if( a instanceof AllPossibleTriangles>)
    }

    public static int findAllPossibleTriangles(int[] arr){
        Arrays.sort(arr);
        int result = 0;
        if(arr.length < 2) return result;

//        for(int i = 0; i< arr.length; i++){
//
//        }
        int i = 0, j =0, k = 0;
//        while()
        return result;
    }
}
