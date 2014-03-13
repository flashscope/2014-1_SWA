import sorts.Sort;


public class QuickSortAlgorithms implements SortAlgorithms {

	@Override
	public int[] sort(int[] unSortedData) {
		return Sort.quickSort(unSortedData);
	}

}
