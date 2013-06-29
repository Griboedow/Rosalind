import java.util.ArrayList;

import java.util.Scanner;


public class revp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ourstr = sc.nextLine();
        ArrayList<Integer[]> res = new ArrayList<Integer[]>();
        ourstr = sc.nextLine();
        while(!sc.hasNextInt()){
            ourstr = ourstr + sc.nextLine();
        }

        for(int i = 0; i < ourstr.length(); i++){
            for(int step = 4; step <= 12; step +=2){
                if(i<ourstr.length()-step+1){
                    if(sp(ourstr.substring(i, i+step))){
                        System.out.print(i+1);
                        System.out.print(" ");
                        System.out.println(step);
                    }
                }
            }
        }
    }

    public static char inverse(char chr){
        char res = ' ';

        switch(chr){
            case 'A':
                res = 'T';
                break;
            case 'T':
                res = 'A';
                break;
            case 'C':
                res = 'G';
                break;
            case 'G':
                res = 'C';
                break;
            default:
                break;
        }
        return res;

    }

    public static boolean sp(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != inverse(str.charAt(str.length()-i-1))){
                return false;
            }
        }
        return true;
    }

}


