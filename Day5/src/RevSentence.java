import java.util.Scanner;

public class RevSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("The reversed sentence is: ");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.println(words[i] +" ");
            }

        sc.close();
    }
}
