package com.happy;
import java.util.*;
public class Main {

    public static void main(String[] args) {


            HashMap<String, Double> fastList = new HashMap<String, Double>();
            Double time;
            String lake;
            ArrayList lakeList = new ArrayList();


            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter the name of the lake");
                lake = scanner.nextLine();
                System.out.println("Enter time duration to run around the lake");
                String t = scanner.nextLine();
                time = Double.parseDouble(t);
                lakeList.add(lake);
                lakeList.add(time);
                if (fastList.containsKey(lake) && fastList.get(lake) > time) {

                    fastList.put(lake, time);
                } else if (!fastList.containsKey(lake)) {
                    fastList.put(lake, time);
                }

                System.out.println(" would you like to continue to run the other lake? press 'y'");
                String answer = scanner.nextLine();
                if (!answer.equals("y")) {
                    break;
                }

            }

            for (int x = 0 ; x <= lakeList.size()-1; x+=2){
                System.out.println(lakeList.get(x) + " : " + lakeList.get(x+1));

            }

            System.out.println("the fastest time ");

            Set keySet = fastList.keySet();  // this Creates a set of the keys and it will iterate over this
            for ( Object lakes : keySet) {
                // the key is used to get each value. Repeat for each key.
                System.out.println(lakes + " : " + fastList.get(lakes));
            }

        }
    }



