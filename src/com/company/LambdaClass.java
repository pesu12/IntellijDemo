package com.company;

public class LambdaClass {

    public LambdaClass() {

        LambdaClass tester = new LambdaClass();

        //with type declaration
        LambdaClass.MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        LambdaClass.MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        LambdaClass.MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        LambdaClass.MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //without parenthesis
        LambdaClass.GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        //with parenthesis
        LambdaClass.GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");


    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, LambdaClass.MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }


}
