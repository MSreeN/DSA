package learn.dsa.Strings;

import org.apache.poi.hpsf.Decimal;

import java.math.BigDecimal;

public class FractionToRecurringDecimal {
    public static void main(String[] args) {
        fractionToRecurring(2, 2);
    }

    public static void fractionToRecurring(int numerator, int denominator){
//        BigDecimal result = BigDecimal.valueOf(numerator).divide(BigDecimal.valueOf(denominator));
//        System.out.println(result);
//        Double d = (double) numerator / (double) denominator;
//        Double d = 98.736274847d;
        Double d = 9d;
        String result = String.valueOf(d);
        String afterDecimal = result.substring(result.indexOf(".")+1);
        if(afterDecimal.length()>1){
            result = result.substring(0, result.indexOf('.')+1)+"("+afterDecimal+")";
        } else if (afterDecimal.length() == 1 && afterDecimal.equals("0")){
            result = result.substring(0, result.indexOf('.'));
        }
        System.out.println(result);

    }
}
