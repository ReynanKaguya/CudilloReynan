import java.util.Scanner;

public class PEMDAS{

public static void main(String[]a){

Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Interactive PEMDAS Calculator!");
        
        while (true) {
            System.out.print("Enter an arithmetic expression or 'exit' to quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                double result = evaluateExpression(input);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Invalid input or expression. Please try again.");
            }
        }

        scanner.close();
    }

    public static double evaluateExpression(String expression) throws Exception {
               expression = expression.replaceAll("\\s+", "").toLowerCase();
        
               if (!expression.matches("^[0-9()+\\-*/^\\. ]*$")) {
            throw new Exception("Invalid characters in the expression.");
        }
        
        return evaluate(expression);
    }

    private static double evaluate(String expression) throws Exception {
                return new Object() {
            int index = -1, token;

            void nextToken() {
                token = (++index < expression.length()) ? expression.charAt(index) : -1;
            }

            boolean isDigit(int c) {
                return Character.isDigit(c) || c == '.';
            }

            double parse() throws Exception {
                nextToken();
                double x = parseExpression();
                if (index < expression.length()) {
                    throw new Exception("Unexpected: " + (char) token);
                }
                return x;
            }

            double parseExpression() throws Exception {
                double x = parseTerm();
                while (true) {
                    if (token == '+') {
                        nextToken();
                        x += parseTerm();
                    } else if (token == '-') {
                        nextToken();
                        x -= parseTerm();
                    } else {
                        return x;
                    }
                }
            }

            double parseTerm() throws Exception {
                double x = parseFactor();
                while (true) {
                    if (token == '*') {
                        nextToken();
                        x *= parseFactor();
                    } else if (token == '/') {
                        nextToken();
                        double divisor = parseFactor();
                        if (divisor == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        x /= divisor;
                    } else {
                        return x;
                    }
                }
            }

            double parseFactor() throws Exception {
                if (token == '(') {
                    nextToken();
                    double x = parseExpression();
                    if (token != ')') {
                        throw new Exception("Expected ')'");
                    }
                    nextToken();
                    return x;
                }
                if (isDigit(token) || (token == '-' && isDigit(expression.charAt(index + 1)))) {
                    StringBuilder num = new StringBuilder();
                    while (isDigit(token)) {
                        num.append((char) token);
                        nextToken();
                    }
                    return Double.parseDouble(num.toString());
                }
                throw new Exception("Unexpected: " + (char) token);
            }
        }.parse();
    }
}