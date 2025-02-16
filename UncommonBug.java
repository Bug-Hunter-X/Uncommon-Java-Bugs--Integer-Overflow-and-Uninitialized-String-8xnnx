public class UncommonBug {

    public static void main(String[] args) {
        // This code demonstrates an uncommon bug related to integer overflow.
        int largeValue = Integer.MAX_VALUE;
        System.out.println("Initial largeValue: " + largeValue);

        // Adding 1 to the maximum integer value causes an overflow,
        // resulting in the minimum integer value.
        int overflowResult = largeValue + 1;
        System.out.println("Overflow result: " + overflowResult); 

        //This code shows another uncommon bug: using a string variable that is not initialized before usage.
        String uninitializedString;
        System.out.println("Uninitialized string:" + uninitializedString);
    }
}