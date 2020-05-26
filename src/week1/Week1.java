/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;

/**
 *
 * @author carlo
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] flowers = {"petunia", "parse", "rose", "violet", "daisy"};
        double[] cost = {.50, .75, 1.50, 1.00, .80};
        System.out.println("Please enter a name of one flower ex.");

        for (String f : flowers) {
            System.out.print(f + ",");
        }
        System.out.println("");
        Scanner s1 = new Scanner(System.in);
        System.out.print("please enter your flower :  ");
        String flow;
         String stop = "stop";
        flow = s1.nextLine();
        System.out.println("the flower you chousse si " + flow);

        for (int i = 0; i < flowers.length; i++) {
            double d = cost[i];
            {
                if (flow.equalsIgnoreCase(flowers[i])) {
                    System.out.println("the flowers price " + cost[i]);
                }
              //  else (flow.equalsIgnoreCase(stop)){
                   // System.out.println("your total is ");
                }

            }

        }

        // TODO code application logic here
    }

}
