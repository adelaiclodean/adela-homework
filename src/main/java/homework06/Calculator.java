package homework06;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Map<String, Integer> unitsMapping = new HashMap<String, Integer>();
    public Calculator() {
        unitsMapping.put("mm", 0);
        unitsMapping.put("cm", 1);
        unitsMapping.put("dm", 2);
        unitsMapping.put("m", 3);
        unitsMapping.put("km", 6);
    }
    public Double convertUnit(double number, String fromUnit, String toUnit) {
       return number * Math.pow(10, (double) (unitsMapping.get(fromUnit) - unitsMapping.get(toUnit)));
   }
    public String calculate(String ex, String lowest) {
        Double tmp ;

        //we check if the expression contains valid operands
        if ((ex.contains("+") || ex.contains("-")) ) {
            //split the input expression into an array of sub-strings by using space " "
            //example: string "10 cm + 1 m" will result into an array of substrings {"10", "cm", "+", "1", "m"}
            String[] s = ex.split(" ");

            //find next operand and keep the result of its operators in "tmp" = temporary result
            tmp = convertUnit(Double.parseDouble(s[0]), s[1], lowest);
            for (int i = 2; i < s.length; i++) {
                if (s[i].equals("+")) {
                    tmp += convertUnit(Double.parseDouble(s[i + 1]), s[i + 2], lowest);
                } else if (s[i].equals("-")) {
                    tmp -= convertUnit(Double.parseDouble(s[i + 1]), s[i + 2], lowest);
                }
            }
            return (tmp + " " + lowest);
        } else
            return "Given expression contains invalid operands.";
    }
}

