import java.util.*;

public class B_Letter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s1 = new StringBuilder(sc.nextLine());
        StringBuilder s2 = new StringBuilder(sc.nextLine());
        int arrl[] = new int[26];
        int arru[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ')
                continue;
            if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
                arrl[s1.charAt(i) - 'a']++;
            if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
                arru[s1.charAt(i) - 'A']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == ' ')
                continue;
            if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z') {
                if (arrl[s2.charAt(i) - 'a'] == 0) {
                    System.out.println("NO");
                    return;
                }
                arrl[s2.charAt(i) - 'a']--;
            } else if (s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z') {
                if (arru[s2.charAt(i) - 'A'] == 0) {
                    System.out.println("NO");
                    return;
                }
                arru[s2.charAt(i) - 'A']--;
            }
        }
        System.out.println("YES\n");
    }
}