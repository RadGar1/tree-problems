/*
 * Unit Testing
 */

import java.util.TreeSet;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;

public class Main {
  
  public static void main(String[] args) {

    TreeProblems problem = new TreeProblems();

    /*
     * Test 1 - Sample Test for method different()
     */
    
    Set<Integer> treeSet0 = new TreeSet<>();
    treeSet0.add(9);
    treeSet0.add(7);
    treeSet0.add(6);
    treeSet0.add(3);
    
    Set<Integer> treeSet1 = new TreeSet<>();
    treeSet1.add(4);
    treeSet1.add(7);
    treeSet1.add(6);
    treeSet1.add(2);

    System.out.println("Test 1 - method different()");
    System.out.println("Set 0: " + treeSet0);    // Set 0 is [3, 6, 7, 9]
    System.out.println("Set 1: " + treeSet1);    // Set 1 is [2, 4, 6, 7]
    
    // Prints all elements not in both sets; should print [2, 3, 4, 9]
    System.out.println("Output from different(): " 
                      + problem.different(treeSet0, treeSet1));

    
    /*
     * Test 2 - Sample Test for method removeEven()
     */

    Map<Integer, String> ages = new TreeMap<>();
    ages.put(10, "James");
    ages.put(13, "Tony");
    ages.put(15, "Britany");
    ages.put(16, "Maria");
    ages.put(17, "Geoffrey");

    System.out.println("\nTest 2 - method removeEven()");
    System.out.println("Original TreeMap contents : " + ages);
    
    // Should print {13=Tony, 15=Britany, 17=Geoffrey}
    problem.removeEven(ages);
    System.out.println("Updated TreeMap contents  : " + ages);
  }
}