package AlgorithmicToolbox.Week3;

import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int numRefills = 0, currentRefill = 0, lastRefill;
        int stopsLen = stops.length;
        while(currentRefill < dist){
            lastRefill = currentRefill;
            while (currentRefill< stopsLen &&
                    stops[currentRefill+1] - stops[lastRefill]<= tank){
                currentRefill = currentRefill + 1;
            }
            if (currentRefill == lastRefill){
                return -1;
            }
            if (currentRefill< dist) {
                numRefills = numRefills + 1;
            }

        }
        return numRefills;
    }

    static int computeMinRefills2(int dist, int tank, int[] stops) {
        int numRefills = 0, currentRefill = 0, i = 0;
        while(currentRefill< dist){
            if( stops[i]< (tank - currentRefill)){
                currentRefill = stops[i];
                i++;
            } else {
                numRefills++;
            }
        }
        return numRefills;
    }

    static int computeMinRefills3(int dist, int tank, int[] stops) {
        int numRefills = 0, currentRefill = 0, i = 0, lastRefill = 0;
        while(i < stops.length - 1){
            lastRefill = i;

            while ((i<stops.length) && (i< stops.length - 1) && tank >= (stops[i+1]-stops[lastRefill])){
                i++;
            }
            if(lastRefill == i)
                return -1;
            if(i < (stops.length - 1))
                numRefills++;
        }
        return numRefills;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n+2];
        stops[0] = 0;
        for (int i = 1; i <= n ; i++) {
            stops[i] = scanner.nextInt();
        }
        stops[n+1] = dist;

        System.out.println(computeMinRefills3(dist, tank, stops));
    }
}
