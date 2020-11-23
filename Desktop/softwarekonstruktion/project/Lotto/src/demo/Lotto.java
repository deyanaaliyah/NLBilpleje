package demo;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lotto {

    public void generateUserNumbers() {
        Set<Integer> usersNumbers = new HashSet<>();

        // save user's numbers onto the hash set
        //System.out.println();
        Scanner obj = new Scanner(System.in);
        String num = obj.nextLine();
        String[] stnum = num.split(",");

        // iterate numbers that are chosen
        for (String s : stnum) {
            usersNumbers.add(Integer.parseInt(s));
        }

        // let the user know
        System.out.println(usersNumbers);
    }

    public void lottoSimulation() {
        generateUserNumbers();

        // create hash set of lottery numbers to be randomised
        Set<Integer> lotteryNumbers = new HashSet<>();

        // randomise the numbers
        Random r = new Random(); // instanciate the randomiser class

        while (lotteryNumbers.size() < 7) {
            lotteryNumbers.add(r.nextInt(36) + 1);
        }

        // print out the numbers
        System.out.println("\nthe lottery numbers are:\n" + lotteryNumbers);
    }
}
