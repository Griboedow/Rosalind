import sun.org.mozilla.javascript.ast.Yield;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: coob
 * Date: 29.06.13
 * Time: 1:47
 * To change this template use File | Settings | File Templates.
 */
public class mrna {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
/*
        ArrayList<String> cods = new ArrayList<String>();
        int[] nums = new int[40];
        String temp = "";
        boolean stop = false;
        while(true){
            temp = sc.nextLine();
            if(temp.equals("show")){
                break;
            }
            temp = temp.substring(temp.indexOf(" "));
            temp = temp.replaceAll(" ","");
            if(cods.contains(temp)){
                nums[cods.indexOf(temp)]++;
            }
            else{
                cods.add(temp);
                nums[cods.indexOf(temp)]++;
            }
        }
        System.out.println("");
        for(String s : cods){
            System.out.print(s);
        }
        System.out.println("");
        System.out.print("{");
        for(String s : cods){
            System.out.print(nums[cods.indexOf(s)] + ",");
        }
*/
        String cods = "FLIVMSPTAYHND$QKECRGW";
        int[] nums = {2,6,3,4,1,6,4,4,4,2,2,2,2,3,2,2,2,2,6,4,1};
        String input = sc.nextLine();
        long res = 1;
        for(int i = 0; i < input.length(); i++){
            res = res % 1000000;
            res = res * nums[cods.indexOf(input.charAt(i))];
        }
        System.out.println(res * nums[cods.indexOf("$")] % 1000000);
    }
}
