public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        FirstLambda greeting = () ->  System.out.println( "Sumaira Tariq Khan");

        Maths maths =(int q) ->  q*q  ;

        //addFunction = (int a, int b) -> a+b;

        Calculation safeDivision = (int a, int b) -> {
            if ( b == 0) return  0;
            else {
                return a/b;
            }
        };
    }
}

interface FirstLambda {

    void testMethod();
}

interface Maths{
    int multiply(int val);
}

interface Calculation{
    int safelyDivide(int val1, int val2);
}
