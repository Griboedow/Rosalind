import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: coob
 * Date: 29.06.13
 * Time: 2:22
 * To change this template use File | Settings | File Templates.
 */
public class lexv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replaceAll(" ", "");
        int n = sc.nextInt();
        proc(n, "", input);
    }

    public static void proc(int n, String construct, String s){
        if(n > 0){
            for(int i = 0; i < s.length(); i++ ){
                String construct1 = construct + s.charAt(i);
                System.out.println(construct1);
                proc(n-1, construct1, s);
            }
        }
    }
}
