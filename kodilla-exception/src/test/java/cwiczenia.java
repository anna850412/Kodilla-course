import java.math.BigDecimal;
import java.math.RoundingMode;

public class cwiczenia {


    public static void main(String[] args) {
        double malyDouble = 2.4;
        Double duzyDouble = 2.6;
        BigDecimal ania = new BigDecimal(2.4953);

        BigDecimal bigDecimal = BigDecimal.valueOf(2.5);
        BigDecimal bigDecimal2 = new BigDecimal(1);

        BigDecimal result = bigDecimal.add(bigDecimal2);
        System.out.println(result);
        BigDecimal result2 = ania.setScale(4, RoundingMode.HALF_DOWN);
        BigDecimal result3 = ania.setScale(4, RoundingMode.HALF_UP);
        System.out.println(ania);
        System.out.println(result2);
        System.out.println(result3);


    }
}


