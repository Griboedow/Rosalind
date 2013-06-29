import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: coob
 * Date: 29.06.13
 * Time: 2:47
 * To change this template use File | Settings | File Templates.
 */
public class tree {

    static int size = 1000 + 10;
    static int[] adj;
    static boolean[] usd = new boolean[size];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] adj= new boolean[n+1][n+1];
        while(sc.hasNextInt()){
            int tmp1 = sc.nextInt();
            int tmp2 = sc.nextInt();
            adj[tmp1][tmp2] = true;
            adj[tmp2][tmp1] = true;
        }

        boolean usd[] = new boolean[1000];

        for (int k=1;k<=n;++k){
            for (int i=1;i<=n;++i){
                for (int j=1;j<=n;++j){
                    if (adj[i][k] && adj[k][j])
                        adj[i][j] = true;
                }
            }
        }

        int cnt = 0;
        for (int i=1;i<=n;++i) {
            if (!usd[i]) {
                ++cnt;
                usd[i] = true;
                for (int j=1;j<=n;++j) {
                    if (adj[i][j] && !usd[j])
                        usd[j] = true;
                }
            }
        }
        System.out.println(cnt-1);

    }




}
