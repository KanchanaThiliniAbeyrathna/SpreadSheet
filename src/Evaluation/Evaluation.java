
package Evaluation;

import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JTable;

public class Evaluation {
    

    public static String Evaluation(String string,JTable table) {

        DataTypes.StringParser sp = new DataTypes.StringParser();

        String expression = string.substring(1);
        String answer = null;

        int a = 0, b = 0;
        int start = 0, end = 0;
        ArrayList l = DataTypes.StringTokenizer.torkenize(expression);
        boolean b1 = sp.checkValue(l);
        System.out.println(b1);
        if (b1) {
            for (int i = 0; i < expression.length(); i++) {
                if (expression.charAt(i) == '(') {
                    a++;
                    start = i;

                } else if (expression.charAt(i) == ')') {
                    b++;
                    end = i;

                }
            }

            if (a == 0 && b == 0) {

                Stack<Integer> operators = new Stack<>();
                Stack<Double> values = new Stack<>();

                Stack<Double> temp_values = new Stack<>();
                Stack<Integer> temp_operators = new Stack<>();

                expression = expression.replaceAll("-", "+-");

                String val = "";
                for (int i = 0; i < expression.length(); i++) {

                    char ch = expression.charAt(i);

                    if (ch == '-') {
                        val = "-" + val;
                    } else if (ch != '+' && ch != '*' && ch != '/') {
                        val = val + ch;
                    } else {
                        values.push(Double.parseDouble(val));
                        operators.push((int) ch);
                        val = "";
                    }
                }
                values.push(Double.parseDouble(val));

                char op[] = {'/', '*', '+'};

                for (int i = 0; i < 3; i++) {

                    boolean it = false;
                    while (!operators.isEmpty()) {

                        int optr = operators.pop();
                        double v1 = values.pop();
                        double v2 = values.pop();

                        if (optr == op[i]) {

                            if (i == 0) {

                                temp_values.push(v2 / v1);
                                it = true;
                                break;

                            } else if (i == 1) {

                                temp_values.push(v2 * v1);
                                it = true;
                                break;

                            } else if (i == 2) {

                                temp_values.push(v2 + v1);
                                it = true;
                                break;
                            }
                        } else {

                            temp_values.push(v1);
                            values.push(v2);
                            temp_operators.push(optr);
                        }
                    }

                    while (!temp_values.isEmpty()) {
                        values.push(temp_values.pop());
                    }
                    while (!temp_operators.isEmpty()) {
                        operators.push(temp_operators.pop());
                    }

                    if (it) {
                        i--;
                    }
                }

                answer = Double.toString(values.pop());

            } else if (a == 1 && b == 1) {
                String middle = expression.substring(start + 1, end);
                
                if ( middle.length() == 2 ){
                    DataTypes.Text t = new DataTypes.Text();

                    t.setStr((String) table.getValueAt(Character.getNumericValue(middle.charAt(1))-1, middle.charAt(0) - 'A' + 1));

                    switch (expression.substring(0, start)) {
                        case "UPPER":
                            answer = t.Upper(t);
                            break;
                        case "LOWER":
                            answer = t.Lower(t);
                            break;
                        case "LEN":
                            answer = Integer.toString(t.Len(t));
                            break;
                        case "REPEAT":
                            answer = t.Repeat(t, 5);
                            break;
                    }
                } 
            } else {
                answer = "Expression is not valid.";
            }
        }else{
            answer = "!Value";
        }
        return answer;

    }

}

