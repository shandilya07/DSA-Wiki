package recursionAndBacktracking;

public class PrintStringNTimes {
    public static void main(String[] args) {
        print("Recursion", 5, 1);
    }

    private static void print(String string, int times, int currentIteration) {
        if(currentIteration > times)
            return;
        System.out.println(string);
        print(string, times, ++currentIteration);
    }
}

// !!TIP!!
// In line #12 if you use, currentIteration++ it will not work as expected. It looks
// as if currentIteration++ will increment the value, however, in Java post increment,
// value is first passed and then incremented, thus, value being passed in the recursion
// is never updated. Instead of currentIteration++ we can make use of ++currentIteration
// which effectively means value is first incremented and then passed in the recursive call.
// Otherwise, currentIteration+1 works as expected as well