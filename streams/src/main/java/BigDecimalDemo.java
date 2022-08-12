import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double d1 = 174.56;
        double d2 = 174.26;
        System.out.println(d1-d2); //no precision, not good for financial application

        //big decimal is a class and it provides precise info
        BigDecimal b1 = new BigDecimal("174.56");
        BigDecimal b2 = new BigDecimal("174.26");
        System.out.println(b1.subtract(b2));//b1 , b2 are objects hence needs methods

        //scaling and rounding
        BigDecimal num1 = new BigDecimal(23.12);
        System.out.println(num1.setScale(1, RoundingMode.DOWN)); // just wanna see one digit and is rounding down
        System.out.println(num1.setScale(2,RoundingMode.CEILING));//ceiling: round up... 2 digits

        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2"))); // equal output is 0
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("3"))); //2-3, output is -1
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2"))); // 3-2 output is 1

        //big decimals are immutable


    }
}
