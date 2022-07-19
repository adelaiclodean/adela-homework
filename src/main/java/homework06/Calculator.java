package homework06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    private static final Map<String, Integer> unitsMapping = new HashMap<>();

    public Calculator() {
        unitsMapping.put("mm", 0);
        unitsMapping.put("cm", 1);
        unitsMapping.put("dm", 2);
        unitsMapping.put("m", 3);
        unitsMapping.put("km", 6);
    }
    public static double convert (double value, String unitFrom, String unitTo) {
       return value * Math.pow(10, unitsMapping.get(unitFrom) - unitsMapping.get(unitTo));
   }
    public String calculate(String ex, String lowest) {
        double tmp ;

        //we check if the expression contains valid operands
        if ((ex.contains("+") || ex.contains("-")) ) {
            //split the input expression into an array " "
            //example: string "10 cm + 1 m" will result into an array of substrings {"10", "cm", "+", "1", "m"}
            String[] s = ex.split(" ");

            //find next operand and keep the result of its operators in "tmp" = temporary result
            tmp = convert(Double.parseDouble(s[0]), s[1], lowest);
            for (int i = 2; i < s.length; i++) {
                if (s[i].equals("+")) {
                    tmp += convert(Double.parseDouble(s[i + 1]), s[i + 2], lowest);
                } else if (s[i].equals("-")) {
                    tmp -= convert(Double.parseDouble(s[i + 1]), s[i + 2], lowest);
                }
            }
            return (tmp + " " + lowest);
        } else
            return "The expression contains invalid operands.";
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert unit: ");
        String unit = scanner.nextLine();
        Calculator calc = new Calculator();
        System.out.println(calc.calculate("10 cm + 1 m - 10 mm", unit));
    }
}

