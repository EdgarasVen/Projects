import xml.BuilderXml;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!

        /*DataBase dataBase = new DataBase();
        dataBase.addNewPerson("vasia", 86000011);
        dataBase.addNewPerson("misa");
        dataBase.addNewPerson("andrej", 86000022,"vilnius","aantakalnis");
        dataBase.addNewPerson("andzej", 86000033,"vilnius","zirmunai");
        dataBase.printAllPersonInformation();
        System.out.println();
        dataBase.printSortedByNameAllPersons();*/

        BuilderXml builderXml = new BuilderXml();
        builderXml.createRoot("data");
        builderXml.addPersonAkaElement("Edgar",800001,"Vilnius","Liepkalnis");
        builderXml.createXmlFile();
    }
}
