import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class prtm {
    public static void main(String[] args){
        List<String> letters = Arrays.asList("A","C","D","E","F","G","H","I","K","L","M",
                "N","P","Q","R","S","T","V","W","Y");
        Double[] weight = {71.03711, 103.00919, 115.02694,129.04259, 147.06841,57.02146,
                137.05891, 113.08406, 128.09496, 113.08406, 131.04049, 114.04293, 97.05276,
                128.05858, 156.10111, 87.03203, 101.04768, 99.06841, 186.07931, 163.06333};
        NumberFormat format = DecimalFormat.getInstance();
        format.setMaximumFractionDigits(3/*тот что N*/);

        Scanner sc = new Scanner(System.in);
        String  input = sc.nextLine();
        double sum = 0;
        for(int i = 0; i < input.length(); i++){
            sum += weight[letters.indexOf(Character.toString(input.charAt(i)))];
        }
        System.out.println( format.format(sum).replace(',','.'));
    }
}
