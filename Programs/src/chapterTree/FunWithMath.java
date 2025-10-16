package Programs.src.chapterTree;

import java.text.DecimalFormat;

public class FunWithMath {
    public static void main(String[] args) {
        DecimalFormat dFormat = new DecimalFormat("#.##");

        double sqrt = Math.sqrt(4);
        double power = Math.pow(2, 2);

        double area = Math.PI * Math.pow(4, 2);

        System.out.println("sqrt of 4: " + sqrt);
        System.out.println("pow of 2^2: " + power);
        System.out.println("Area 4: " + dFormat.format(area));

    }
}
