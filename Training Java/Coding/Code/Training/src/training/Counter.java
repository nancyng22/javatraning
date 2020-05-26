
import com.sun.media.jfxmediaimpl.MediaUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Counter {

    public static void main(String[] args) {
        System.out.println("Assignment02 Nguyen Van Anh");
        System.out.print("Enter input: ");
        Scanner scanner = new Scanner(System.in);
        String content = scanner.nextLine();

        Counter counter = new Counter();
        System.out.print("Total word: ");
        counter.countWord(content);
        System.out.println("Total character: " + content.length());

    }

    public int countWord(String content) {
        int count = 0;
        for (int i = 0; i < content.length(); i++) {
            if (i == content.length() - 1) {
                i += 0;
            } else {
                if (content.charAt(i) == ' ') {
                    if ((content.charAt(i + 1) == '\n') || (content.charAt(i + 1) == ' ')) {
                        count += 0;
                    } else {
                        count++;
                    }
                }
            }
        }
        if (content.charAt(0) == ' ') {
            System.out.println(count);
        } else {
            System.out.println(count + 1);
        }
        return count;
    }

}
