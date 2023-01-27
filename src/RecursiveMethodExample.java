public class RecursiveMethodExample {
    public static void main(String[] args) {
//        without recursive
        System.out.println(factorialLoop(5));

//        with recursive
        System.out.println(factorialRecursive(5));

        loop(100);
    }

    static int factorialLoop(int value){
        var result = 1;
        for(int i = 1; i <= value; i++){
            result *= i;
        }

        return result;
    }

    static int factorialRecursive(int value){
        if(value == 1) {
            return 1;
        }else {
            return value * factorialRecursive(value - 1);
        }

    }

    static void loop(int value) {
        if(value == 0) {
            System.out.println("Loop sama dengan 0");
        }else {
            System.out.println("Loop : " + value);
            loop(value - 1);
        }
    }
}
