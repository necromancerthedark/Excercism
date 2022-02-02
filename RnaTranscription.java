import java.util.Scanner;

class RnaTranscription {

    public static String transcribe(String dnaStrand) {
        int i = 0;
        StringBuilder ans = new StringBuilder();
        for (i = 0; i < dnaStrand.length(); i++) {
            if (dnaStrand.charAt(i) == 'G') {
                ans.append("C");
            }
            if (dnaStrand.charAt(i) == 'C') {
                ans.append("G");
            }
            if (dnaStrand.charAt(i) == 'T') {
                ans.append("A");
            }
            if (dnaStrand.charAt(i) == 'A') {
                ans.append("U");
            }
        }
        return ans.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String ans = transcribe(src);
        System.out.println(ans);
        sc.close();
    }

}
