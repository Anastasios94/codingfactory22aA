package gr.aueb.cf.ch2;

public class ExpresionsApp {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        result2 = num1++;// result2-> πρωτα εκχωρειτε num1(12) στο result και μετα θα προστεθει το ++ αρα num1 -> 13
        result1++;  // => result1 = result1 + 1
        result2 = ++num2;  // num2(5) -> γινεται 6 με το ++ και μετα εκχωρειτε σαν result2 =6

        // Τελεστες συντμησης Π.χ.
        result1 = result1 + 10;
        result1 +=10;

        result1 = result1 * 12;
        result1 *=12;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;
        // Με παρενθεσεις δινουμε πρωτεραιοτητα
        result1 = (num1 + num2 * (num2 - (15 / num1)));

        System.out.printf("sum: %d, sub: %d, mul: %d, div: %d, mod: %d", sum, sub, mul, div, mod);
    }

}