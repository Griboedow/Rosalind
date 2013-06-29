import java.util.Scanner;


public class IEV {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] multiplier = {1.0, 1.0, 1.0, 0.75, 0.5, 0};
        double res = 0;
        for(int i = 0; i < 6; i++){
            res += multiplier[i]*sc.nextInt()*2;
        }
        System.out.println(res);

    }
}
