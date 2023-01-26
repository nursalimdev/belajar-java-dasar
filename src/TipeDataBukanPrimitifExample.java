public class TipeDataBukanPrimitifExample {
    public static void main(String[] args) {
        Integer thisInteger = 100;
        Long thisLong = 10000L;
        Byte thisByte = null;

        System.out.println(thisInteger);
        System.out.println(thisLong);
        System.out.println(thisByte);

        thisByte = 100;
        System.out.println(thisByte);

        // konversi dari primitif ke tipe data bukan primitif
        int thisInt = 100;
        Integer thisObject = thisInt;

        short thisShort = thisObject.shortValue();
        long thisLong2 = thisObject.longValue();
        float thisFloat = thisObject.floatValue();

        Long amount = 10000L;
        amount.floatValue();
    }
}
