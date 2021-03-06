package nyc.c4q.ramonaharrison.scientificcalculator;

import com.bestcode.mathparser.IMathParser;
import com.bestcode.mathparser.MathParserFactory;

import java.util.ArrayList;

public class Calculate
{
    public static void main(String[] args)
    {
//        String inputExpression = "4! + 3!";
//        System.out.println(calculate(inputExpression, false));

    }

    public static ArrayList findFactorialEnds(String parseExpression) {
        ArrayList<Integer> factorialEnds = new ArrayList<Integer>();
        int start = 0;
        int facEnd = 0;
        while (facEnd != -1) {
            facEnd = parseExpression.indexOf('!', start);
            if (facEnd > 0) {
                factorialEnds.add(facEnd);
                start = facEnd + 1;

            }
        }
        return factorialEnds;
    }

    public static ArrayList findFactorialStarts(String parseExpression, ArrayList<Integer> factorialEnds) {

        ArrayList<String> factorials = new ArrayList<String>();

        for (int exclamation : factorialEnds) {
            String stringFactorial = "";
            for (int i = exclamation; i >= 0; i--) {
                char c = parseExpression.charAt(i);
                if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0' || c == '.' || c == 'E' || c == '!') {
                    stringFactorial = c + stringFactorial;
                } else {
                    factorials.add(stringFactorial);
                    break;
                }
                if (i == 0) {
                    factorials.add(stringFactorial);
                }
            }

        }
        return factorials;
    }

    public static ArrayList<String> parseFactorials(ArrayList<String> factorials){

        ArrayList<String> parsedFacs = new ArrayList<String>();

        for (String fac: factorials){

            int factorial = Integer.valueOf(fac.substring(0, fac.length() - 1));
            int n = 1;

            while(factorial != 1) {
                n *= factorial;
                factorial--;
            }
            parsedFacs.add(String.valueOf(n));
        }
        return parsedFacs;
    }
    public static String calculate(String inputExpression, boolean degrees) {

        String parseExpression = "";

        // Makes most string expressions readable by the parser.
        if(!inputExpression.equals("")) {

            parseExpression = inputExpression.replaceAll("%", "*.01");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("e", "2.71828182846");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("√\\(", "SQRT(");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("π", "PI");
            inputExpression = parseExpression;

            parseExpression = inputExpression.replaceAll("0p", "0*p");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("0\\(", "0*(");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("0a", "0*a");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("0l", "0*l");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("0s", "0*s");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("0c", "0*c");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("0t", "0*t");
            inputExpression = parseExpression;

            parseExpression = inputExpression.replaceAll("1p", "1*p");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("1\\(", "1*(");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("1a", "1*a");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("1l", "1*l");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("1s", "1*s");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("1c", "1*c");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("1t", "1*t");
            inputExpression = parseExpression;

            parseExpression = inputExpression.replaceAll("2p", "2*p");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("2\\(", "2*(");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("2a", "2*a");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("2l", "2*l");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("2s", "2*s");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("2c", "2*c");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("2t", "2*t");
            inputExpression = parseExpression;

            parseExpression = inputExpression.replaceAll("3p", "3*p");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("3\\(", "3*(");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("3a", "3*a");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("3l", "3*l");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("3s", "3*s");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("3c", "3*c");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("3t", "3*t");
            inputExpression = parseExpression;

            parseExpression = inputExpression.replaceAll("4p", "4*p");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("4\\(", "4*(");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("4a", "4*a");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("4l", "4*l");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("4s", "4*s");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("4c", "4*c");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("4t", "4*t");
            inputExpression = parseExpression;

            parseExpression = inputExpression.replaceAll("5p", "5*p");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("5\\(", "5*(");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("5a", "5*a");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("5l", "5*l");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("5s", "5*s");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("5c", "5*c");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("5t", "5*t");
            inputExpression = parseExpression;

            parseExpression = inputExpression.replaceAll("6p", "6*p");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("6\\(", "6*(");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("6a", "6*a");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("6l", "6*l");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("6s", "6*s");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("6c", "6*c");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("6t", "6*t");
            inputExpression = parseExpression;

            parseExpression = inputExpression.replaceAll("7p", "7*p");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("7\\(", "7*(");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("7a", "7*a");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("7l", "7*l");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("7s", "7*s");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("7c", "7*c");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("7t", "7*t");
            inputExpression = parseExpression;

            parseExpression = inputExpression.replaceAll("8p", "8*p");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("8\\(", "8*(");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("8a", "8*a");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("8l", "8*l");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("8s", "8*s");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("8c", "8*c");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("8t", "8*t");
            inputExpression = parseExpression;

            parseExpression = inputExpression.replaceAll("9p", "9*p");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("9\\(", "9*(");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("9a", "9*a");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("9l", "9*l");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("9s", "9*s");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("9c", "9*c");
            inputExpression = parseExpression;
            parseExpression = inputExpression.replaceAll("9t", "9*t");
            inputExpression = parseExpression;


            ArrayList<Integer> facEnds = findFactorialEnds(parseExpression);
            ArrayList<String> facs = findFactorialStarts(parseExpression, facEnds);
            ArrayList<String> parsedFacs = parseFactorials(facs);
            for (String fac: facs) {
                System.out.println(fac);
            }

            for (int i = 0; i <= facs.size()-1; i++){
                parseExpression = inputExpression.replaceAll(facs.get(i), parsedFacs.get(i));
                inputExpression = parseExpression;
            }
        }

        String result = "";
        try{
            IMathParser parser = MathParserFactory.create();
            Double resultDouble = 0.0;

            parser.setExpression(parseExpression);

            resultDouble = parser.getValue();

            result = resultDouble.toString();

            System.out.println(result);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        return result;
    }
}