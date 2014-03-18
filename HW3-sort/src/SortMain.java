import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class SortMain {

	public static void main(String[] args) {
		int testData[] = { 3, 5, 7, 2, 9, 0, 12, 27, 18 };

		System.out.println("Before");
		printArray(testData);

		SortAlgorithms sortAlgorithms;

		Serializer serializer = new Persister();
		File source = new File("algorithms.xml");

		try {
			AlgorithmsXMLParser parser = serializer.read( AlgorithmsXMLParser.class, source );
			
			sortAlgorithms = (SortAlgorithms)Class.forName( parser.getClassName() ).newInstance();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println( "PARSE ERROR:" + e.getMessage() );
			sortAlgorithms = new QuickSortAlgorithms();
		}
		
		testData = sortAlgorithms.sort(testData);

		System.out.println("After");
		printArray(testData);

	}

	private static void printArray(int[] arrayData) {
		for (int i = 0; i < arrayData.length; ++i) {
			System.out.printf("[%d]", arrayData[i]);
		}
		System.out.printf("\n");
	}

}
