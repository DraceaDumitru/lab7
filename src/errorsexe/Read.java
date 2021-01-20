package errorsexe;

import java.util.*;

public class Read {
    //Ex 1
    public void writeANrAndReturnIt() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input a number: ");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("user number" + num);

    }

    //Ex 2
    public long readLong() {
        long w = 0;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare:  ");
            try {
                w = scanner.nextLong();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect . ");
            }
        }
        return w;
    }

    public float readFloat() {
        float z = 0;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare:  ");
            try {
                z = scanner.nextFloat();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect . ");
            }
        }
        return z;
    }

    public int readInt() {
        int y = 0;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare:  ");
            try {
                y = scanner.nextInt();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect . ");
            }
        }
        return y;
    }

    public double readDouble() {
        double x = 0;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare:  ");
            try {
                x = scanner.nextDouble();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect . ");
            }
        }
        return x;
    }

    //Ex 3
    public void returnAnArray(int position) {
        String[] fillArray = new String[18];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < fillArray.length; i++) {
            System.out.println("Enter a number: ");
            fillArray[i] = scan.next();
        }
        scan.close();
        Scanner scan1 = new Scanner(System.in);
        String selection;

        System.out.println("Enter an int between 0 and 18 to retrieve the Selection: ");
        selection = scan1.next();
        int i = Integer.parseInt(selection);

        System.out.println("The Selection is: " + fillArray[i]);

    }

    //Ex 4
    public void returnAList() {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("please enter an integer: ");
            try {
                int value = Integer.parseInt(input.next());
                myArrayList.add(value);
            } catch (NumberFormatException e) {
            }
            try {
                myArrayList.add(input.nextInt());
            } catch (InputMismatchException e) {
            } catch (NoSuchElementException e1) {
            } catch (IllegalStateException e2) {
            }

        }
    }
}