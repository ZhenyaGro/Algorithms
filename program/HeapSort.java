package program;

public class HeapSort {

  public static int[] sort(int[] array) {

    // Built a heap
    for (int i = array.length / 2 - 1; i >= 0; i--)
      heapify(array, array.length, i);

    for (int i = array.length - 1; i >= 0; i--) {
      int temp = array[0];
      array[0] = array[i];
      array[i] = temp;

      heapify(array, i, 0);
    }

    return array;
  }

  private static void heapify(int[] array, int heapSize, int rootIndex) {
    int largest = rootIndex;
    int leftChild = 2 * rootIndex + 1;
    int rightChild = 2 * rootIndex + 2;

    // If one of the child is bigger than the root
    if (leftChild < heapSize && array[leftChild] > array[largest])
      largest = leftChild;

    if (rightChild < heapSize && array[rightChild] > array[largest])
      largest = leftChild;

    // If root isn't the biggest
    if (largest != rootIndex) {
      int temp = array[rootIndex];
      array[rootIndex] = array[largest];
      array[largest] = temp;

      heapify(array, heapSize, largest);
    }
  }
}
