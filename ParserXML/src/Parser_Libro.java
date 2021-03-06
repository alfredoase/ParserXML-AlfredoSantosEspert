import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class Parser_Libro {

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException{
		String file = null;
		Scanner scanner = new Scanner(System.in);

		//File name to show
		System.out.print("Ingresa nombre del archivo: ");
		file = scanner.nextLine();
		
		Parser parser = new Parser();
		parser.parseFileXML(file);	
		parser.parseDocument();
		parser.print();
	}
}
