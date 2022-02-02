package lesson13;

public class Main1 {
    public static void main(String[] args) {
        StringUtilsImpl utils = new StringUtilsImpl();
        utils.div("99", "23");

        StringUtilsImpl utils1 = new StringUtilsImpl();
        utils1.findWord("Даша Саша Маша Вова Петя Саша", "Саша");
    }
}
