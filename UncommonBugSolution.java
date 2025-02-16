public class UncommonBugSolution {

    public static void main(String[] args) {
        //To avoid integer overflow, use a larger data type like long, or add input validation.
        long largeValue = Long.MAX_VALUE;
        System.out.println("Initial largeValue: " + largeValue);

        long overflowResult = largeValue + 1;
        System.out.println("Overflow result (using long): " + overflowResult);

        //Always initialize string variables before use.
        String initializedString = "This string is initialized.";
        System.out.println("Initialized string:" + initializedString);
        
        //Example of Input Validation
        int input = 100;
        if(input < Integer.MAX_VALUE){
            int result = input + 1;
            System.out.println("Result after input validation: " + result);
        }else{
            System.out.println("Input is too large to avoid overflow!");
        }
    }
} 