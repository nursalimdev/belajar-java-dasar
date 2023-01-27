public class MethodVariableArgumentExample {
    public static void main(String[] args) {
        sayCongrats("Nursalim", new int[]{75, 100, 20, 50, 65});
        sayCongrats2("Ana Fauziah", 75, 100, 65, 85, 90);

    }

//    tanpa variable args
    static void sayCongrats(String nama, int[] nilais) {
        int totalNilai = 0;

        for (int nilai : nilais){
            totalNilai += nilai;
        }

        int rata2Nilai = totalNilai / nilais.length;

        if(rata2Nilai >= 75) {
            System.out.println("Selamat bro " + nama + " Kamu lulus");
        }else {
            System.out.println("Bro " + nama + " silakan mengulang");
        }
    }

//    dengan variable args

    static void sayCongrats2(String nama, int... nilais) {
        int totalNilai = 0;

        for (int nilai : nilais){
            totalNilai += nilai;
        }

        int rata2Nilai = totalNilai / nilais.length;

        if(rata2Nilai >= 75) {
            System.out.println("Selamat bro " + nama + " Kamu lulus");
        }else {
            System.out.println("Bro " + nama + " silakan mengulang");
        }
    }
}
