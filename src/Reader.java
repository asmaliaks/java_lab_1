import java.util.*;

/**
 * Created by asmalouski on 31.5.15.
 */
public class Reader {
    int i;
    int k;

    public void scan(){
        System.out.println("Enter your first digit");
        Scanner scn = new Scanner(System.in);
        i = scn.nextInt();
        System.out.println("Enter your second digit");
        k = scn.nextInt();
    }
}
