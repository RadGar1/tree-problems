//////////////////////////////////////////////////////////////
//
//  Garrett Raddohl / 400C 001
//
//////////////////////////////////////////////////////////////

import java.util.*;

public class TreeProblems {

  /*
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are not in both sets. In otherwords, return a TreeSet of all the 
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    Set<Integer> tmp1 = new TreeSet<Integer>(setA);
    Set<Integer> tmp2 = new TreeSet<Integer>(setB);
    tmp1.retainAll(setB);
    tmp2.addAll(setA);
    tmp2.removeAll(tmp1);
    return tmp2;
      
    // Use the TreeSet methods to return the correct set. This can
    // be done with only *several* lines of code by creating two temporary
    // TreeSets and using the methods retainAll(), addAll(), and removeAll(). 
    // But in the end, get something to work. 

    //Set<Integer> tmp = new TreeSet<>(setA);

  }


  /*
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    Iterator<Integer> i1 = treeMap.keySet().iterator();
    
    while(i1.hasNext()){
      int key = i1.next();
      if(key % 2 == 0){
        i1.remove();
      }
    }

    return;
  }

}
