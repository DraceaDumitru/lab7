package errorsexe;

public class Lab7 {
    public static void main(String[] args) throws Exception {
        double[]myArray ={15D,22D,38D,41D};
        Read err = new Read();
        double myDouble = err.readDouble();
        System.out.println(myArray[(int) myDouble]);
        System.out.println();
        int[]array = {10 ,20 , 30 ,40};
        Read nr = new Read();
        int myInteger = nr.readInt();
        System.out.println(array[myInteger]);
        System.out.println();
        float[]arrays = {1.4F ,2.2F , 3.5F ,4.7F};
        Read number = new Read();
        float myFloat = number.readFloat();
        System.out.println(arrays[(int) myFloat]);
        System.out.println();
        long[]arr = {-64L ,-92L ,-45L ,-77L};
        Read num = new Read();
        long myLong = num.readLong();
        System.out.println(arr[(int) myLong]);
        System.out.println();
        Read read = new Read();
        read.writeANrAndReturnIt();

        read.returnAnArray(4);
        read.returnAList();


    }
}
