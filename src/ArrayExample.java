public class ArrayExample {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Nursalim";
        stringArray[1] = "Nani Indriyani";
        stringArray[2] = "Ana Fauziah";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Budi";
        System.out.println(stringArray[0]);

        String[] siswa = new String[3];

        String[] namaMahasiswa = new String[]{"Adam", "Budi", "Cepot"};

        int[] umurMahasiswa = {20, 21, 19};

        umurMahasiswa[0] = 30;
        System.out.println(umurMahasiswa[0]);
        System.out.println(umurMahasiswa[1]);
        System.out.println(umurMahasiswa.length);

        // array 2 dimensi
        String[][] members = {
                {"Nursalim", "Alfarizi"},
                {"Naura", "Krasiva"},
                {"Joko"},
        };
        System.out.println(members[0][1]);

    }
}
