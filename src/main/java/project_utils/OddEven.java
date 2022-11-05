package project_utils;

public class OddEven {
    public String oddEven(int n) { //-345
        if (n >= 0) {
            if (n % 2 == 0) {
                return "Even";
            }
        }
        return "Odd";
    }
}
