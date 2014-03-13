import sorts.Sort;


public class BubbleSortAlgorithms implements SortAlgorithms {

	@Override
	public int[] sort(int[] unSortedData) {
		return Sort.bubbleSort(unSortedData);
	}

}
