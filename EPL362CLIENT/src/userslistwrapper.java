
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class userslistwrapper {

    private ArrayList<users> pList;

    public ArrayList<users> getpList() {
        return pList;
    }

    public void setpList(ArrayList<users> pList) {
        this.pList = pList;
    }



}
