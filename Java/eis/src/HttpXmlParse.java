import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import java.util.ArrayList;

public class HttpXmlParse {
    private String value="";
    private ArrayList<String> list = new ArrayList<>();

    public String getValue(NodeList nodes){
        for (int i = 0; i < nodes.getLength(); i++) {
            if(nodes.item(i) instanceof Element ) {
                if (nodes.item(i).hasChildNodes()) {
                    getValue(nodes.item(i).getChildNodes());
                    if(!nodes.item(i).getTextContent().trim().isEmpty()) {
                        Text text = (Text)nodes.item(i).getFirstChild();
                        value +=" | "+text.getData().trim();
                    }
                }
            }
        }
        return value;
    }
    public ArrayList<String> parse(NodeList nodes){
        for (int i = 0; i < nodes.getLength(); i++) {
            String string =getValue(nodes.item(i).getChildNodes());
            if(!string.isEmpty())
                list.add(string);
            value="";
        }
        return list;
    }

}
