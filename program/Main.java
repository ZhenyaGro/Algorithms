package program;

import program.HeapSort;

public class Main {
  public static void main(String[] args) {

    int[] array = new int[] { 1, 4, 2, 5, 3 };

    int[] test = HeapSort.sort(array);

    for (int el : test) {
      System.out.print(el + " ");
    }
  }
}
