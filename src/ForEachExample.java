public class ForEachExample {
    public static void main(String[] args) {
        String[] array = {
                "Nursalim", "Nani Indriyani", "Ana Fauziah", "Naura Krasiva"
        };

//        tanpa foreach
        for(var i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        // dengan foreach
        for(String nama : array){
            System.out.println(nama);
        }
    }
}
