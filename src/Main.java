import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("4216712120") + " expected 2");
        System.out.println(solution("255255255255") + " expected 1");
        System.out.println(solution("188212") + " expected 8");
    }

    public static int solution(String S) throws InterruptedException {
        // write your code in Java SE 8
        String str = "";
        Set<String> ips = new HashSet();
        for (int i = 1; i < S.length() && Integer.parseInt(S.substring(0, i)) <= 255; i++) {
            for (int j = i + 1; j < S.length() && Integer.parseInt(S.substring(i, j)) <= 255; j++) {
                for (int k = j + 1; k < S.length() && Integer.parseInt(S.substring(j, k)) <= 255; k++) {
                    str = S.substring(0, i) + "." + S.substring(i, j) + "." + S.substring(j, k) + "." + S.substring(k);
                    System.out.println("ip=" + str);
                    if (Integer.parseInt(S.substring(0, i)) <= 255
                            && Integer.parseInt(S.substring(i, j)) <= 255
                            & Integer.parseInt(S.substring(j, k)) <= 255
                            && Integer.parseInt(S.substring(k)) <= 255) {

                        ips.add(str);
                        Thread.sleep(2);
                    }
                }
            }
        }
        return ips.size();
    }
}
