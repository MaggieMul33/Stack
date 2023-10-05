package StackPackage;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
/**
 * Stack5 Class's Purpose:
 * - accept inputted integers and store in list
 * - sort list in ascending order
 * - add list to stack
 * - display stack
 * @author Maggie Mulhall
 * @version 1.0.0
 * @since Week 5 of CSC6301
*/
public class Stack5{
/**
 * Main Class's Purpose:
 * - entry point of program
 * @param args default parameter for main (not used)
*/
public static void main(String args[]) {
    List<Integer> numList = new ArrayList<>();
    //Get and store validated inputted values
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nEnter 5 whole numbers (hit enter in between each): ");
            for(int i=0; i<5; i++){
                int num = scanner.nextInt();
                numList.add(num);
            }
            //Sort list, add to stack, and display stack
            Collections.sort(numList);
            Stack<Integer> MaggiesStack = new Stack<>();
            MaggiesStack.addAll(numList);
            System.out.println(MaggiesStack);
        }catch (Exception e) {
            System.out.println("Something went wrong.");
   }
}}
 