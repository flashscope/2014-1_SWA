import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class AlgorithmsXMLParser {

	@Element
	private String className;

	public AlgorithmsXMLParser() {
		super();
	}

	public AlgorithmsXMLParser(String className) {
		this.className = className;
	}

	public String getClassName() {
		return className;
	}
}