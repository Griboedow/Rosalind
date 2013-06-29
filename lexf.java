import java.util.Scanner;


public class lexf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = sc.nextInt();
        input = input.replaceAll(" ", "");
        System.out.println(input);
        String temp = "";
        proc(temp, n, input);

    }

    public static void proc(String construct, int n, String s){
        if (n == 1){
            for(int i = 0; i < s.length(); i++){
                System.out.println(construct + s.charAt(i));
            }
        }
        else{
            for(int i = 0; i < s.length(); i++){
                String s1 = construct + s.charAt(i);
                proc(s1, n-1, s);
            }
        }
    }
}
