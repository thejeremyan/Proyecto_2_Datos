package tree;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class    InfixToPreFix {
    static int precedence(char c) {
        /**Priority of the expression operators**/
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
    /**Is static so it isnt necessary to instantiate**/
    static StringBuilder infixToPreFix(String expression) {

        StringBuilder result = new StringBuilder();
        StringBuilder input = new StringBuilder(expression);
        input.reverse();
        Stack<Character> stack = new Stack<Character>();

        char[] charsExp = new String(input).toCharArray();
        for (int i = 0; i < charsExp.length; i++) {

            if (charsExp[i] == '(') {
                charsExp[i] = ')';
                i++;
            } else if (charsExp[i] == ')') {
                charsExp[i] = '(';
                i++;
            }
        }
        for (int i = 0; i < charsExp.length; i++) {
            char c = charsExp[i];

            /**Check if the element is an operator or an operand**/
            if (precedence(c) > 0) {
                while (stack.isEmpty() == false && precedence(stack.peek()) >= precedence(c)) {
                    result.append(stack.pop());
                }
                stack.push(c);
            } else if (c == ')') {
                char x = stack.pop();
                while (x != '(') {
                    result.append(x);
                    x = stack.pop();
                }
            } else if (c == '(') {
                stack.push(c);
            } else {
                /**check if the character is different from operator or bracket**/
                result.append(c);
            }
        }

        for (int i = 0; i <= stack.size(); i++) {
            result.append(stack.pop());
        }
        return result.reverse();
    }


    /**Constructor**/
    public InfixToPreFix() throws IOException {
        /**Encapsulamiento de infix y prefix**/
        EncapsulationTree encapsulationTree =EncapsulationTree.getInstance();

        System.out.println("Prefix Expression: " + infixToPreFix(encapsulationTree.getInfix()));

        StringBuilder prefix_sb = infixToPreFix(encapsulationTree.getInfix());

        String prefix_string = prefix_sb.toString();

        encapsulationTree.setPrefix(prefix_string);

        /**Instanciar "constructor artificial" del arbol**/
        ExpressionTreeTest test = new ExpressionTreeTest();


    }

    /**public static void main(String[] args) {
    }**/
}
/**(8-5)*((4+2)/3)**/