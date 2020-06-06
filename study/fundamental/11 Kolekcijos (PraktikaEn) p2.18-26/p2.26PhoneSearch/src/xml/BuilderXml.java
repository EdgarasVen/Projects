package xml;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class BuilderXml {
    DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
    Document document = documentBuilder.newDocument();
    Element root;

    public BuilderXml() throws ParserConfigurationException {
    }

    public void createRoot(String root){
        try {
            this.root = document.createElement(root);
            document.appendChild(this.root);
        } catch (DOMException e) {
            e.printStackTrace();
        }
    }
    public void addPersonAkaElement(String name,int number,String city,String street){
        try {
            Element person = document.createElement("person");
            root.appendChild(person);

            Element firstName = document.createElement("name");
            firstName.appendChild(document.createTextNode(name));
            person.appendChild(firstName);

            Element telNumber = document.createElement("number");
            telNumber.appendChild(document.createTextNode(String.valueOf(number)));
            person.appendChild(telNumber);

            Element addressCity = document.createElement("city");
            addressCity.appendChild(document.createTextNode(city));
            person.appendChild(addressCity);

            Element addressStreet = document.createElement("street");
            addressStreet.appendChild(document.createTextNode(street));
            person.appendChild(addressStreet);
        } catch (DOMException e) {
            e.printStackTrace();
        }

    }
    public void addPersonNumber(String name,int number){
        NodeList nodeList = document.getElementsByTagName(name);
        Element telNumber = document.createElement("number");
        telNumber.appendChild(document.createTextNode(String.valueOf(number)));
        nodeList.item(0).getParentNode().insertBefore(telNumber,nodeList.item(0));
    }

    public void createXmlFile()  {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File("C:\\Users\\Venzed\\Documents\\Projects\\java\\fundamental\\11 Kolekcijos (PraktikaEn) p2.18-26\\p2.26PhoneSearch\\xmlFile.xml"));
            transformer.transform(domSource, streamResult);
            System.out.println("Done creating XML File");
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
    protected Node getNode(String tagName, NodeList nodes, String name) {
        Node node = null;
        for ( int x = 0; x < nodes.getLength(); x++ ) {
            if(nodes.item(x).getTextContent().equals(name)) {
                 node = nodes.item(x);
            }
            assert node != null;
            if (node.getNodeName().equalsIgnoreCase(tagName)) {
                return node;
            }
        }

        return null;
    }
}

