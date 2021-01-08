package java;

public class Calculator {
    public static void main(String[] args) throws Exception {
        if(args.length!=2)
            throw new Exception("There should be two input arguments used with the calculator");

        String arg1 = args[0];
        String arg2 = args[1];

        
        System.out.println(arg1 + "+" + arg2 + "=" + Integer.parseInt(arg1)+Integer.parseInt(arg2));
    }
}
