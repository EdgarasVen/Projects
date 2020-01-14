package com.company;

import org.w3c.dom.Node;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class FileXmlCreator {

    public static void createXmlFile(Node document)  {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File("C:\\Users\\Venzed\\Documents\\Projects\\java\\lb\\src\\com"));
            transformer.transform(domSource, streamResult);
            System.out.println("Done creating XML File");
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
