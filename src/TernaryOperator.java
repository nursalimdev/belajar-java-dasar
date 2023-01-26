public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 80;
        String ucapan;

        if(nilai >= 75) {
            ucapan = "Selamat Anda lulus";
        }else{
            ucapan = "Silakan coba lagi";
        }

        System.out.println(ucapan);

        // Menggunakan ternary operator
        String ucapan2 = nilai >= 75 ? "Selamat Anda Lulus" : "Silakan coba lagi";
        System.out.println(ucapan2);
    }
}
