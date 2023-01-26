public class MethodReturnValue {
    public static void main(String[] args) {
        var angka1 = 10;
        var angka2 = 30;

        var jumlah = sum(angka1, angka2);
        System.out.println(jumlah);

        System.out.println(hitung(10, "+", 5));
    }

    static int sum(int n1, int n2){
        return n1 + n2;
    }

    static int hitung(int n1, String operasi, int n2){
        switch (operasi) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return n1/n2;
            default:
                return 0;
        }
    }
}
