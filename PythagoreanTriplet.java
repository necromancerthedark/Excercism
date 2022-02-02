import java.util.*;

class PythagoreanTriplet {

    // I am not sure what to do here! This program prints all pythogorean triplet
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        int i, j, k;
        for (i = 0; i < N / 3; i++) {
            for (j = i; j < N / 2; j++) {
                k = N - i - j;
                if ((i * i + j * j) == k * k) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}