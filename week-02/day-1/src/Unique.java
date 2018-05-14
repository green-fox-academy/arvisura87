import java.util.Arrays;

public class Unique {

  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    int[] listOfNumbers = {1, 11, 34, 11, 52, 61, 1, 34};
    System.out.println(Arrays.toString(unique(listOfNumbers)));
    //  should print: `[1, 11, 34, 52, 61]`


  }

  public static int[] unique(int[] ints) {
    int[] uniqueNumbers = new int[ints.length];
    for (int i = 0; i < ints.length; i++) {
      for (int j = 0; j < uniqueNumbers.length; j++) {
        if (ints[i]!=uniqueNumbers[j]){
          uniqueNumbers[j]=ints[i];
        } else {
          break;
        }
      }
    }
    return uniqueNumbers;
  }

/*
  public static int[] unique(int[] list) {

    int newLength = list.length;
    // find length w/o duplicates:
    for (int i = 1; i < list.length; i++) {
      for (int j = 0; j < i; j++) {
        if (list[i] == list[j]) {   // if duplicate founded then decrease length by 1
          newLength--;
          break;
        }
      }
    }

    int[] newArray = new int[newLength]; // create new array with new length
    newArray[0] = list[0];  // 1st element goes to new array
    int inx = 1;            // index for 2nd element of new array
    boolean isDuplicate;

    for (int i = 1; i < list.length; i++) {
      isDuplicate = false;
      for (int j = 0; j < i; j++) {
        if (list[i] == list[j]) {  // if duplicate founded then change boolean variable and break
          isDuplicate = true;
          break;
        }
      }
      if (!isDuplicate) {     // if it's not duplicate then put it to new array
        newArray[inx] = list[i];
        inx++;
      }
    }
    return newArray;

  }
*/
}
