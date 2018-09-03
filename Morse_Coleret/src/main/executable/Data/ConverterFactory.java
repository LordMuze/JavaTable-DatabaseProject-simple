package Data;
public class ConverterFactory {
	private String name;
	public ConverterFactory(String name) {
		this.name = name;
	}
	public Driving_Conversion_Interface getDataConverterFactory() {
		if(name == "default") {
			return new DefaultConverter();
		}
		return null;
	}
}
