public class ScopeExample {
    public static void main(String[] args) {
//        System.out.println(hello); error out of scope
    }

    static void sayHello(String name){
        String hello = "Hello " + name;

        if(!name.isBlank()) {
            String hi = "hi "+ name;
            System.out.println(hi);
        }

        System.out.println(hello);
//        System.out.println(hi); error out of scope
    }
}
