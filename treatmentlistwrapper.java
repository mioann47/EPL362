package com.dendro.recommender.server;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
/**
 * Created by AndreasC on 05-May-17.
 */
public class treatmentlistwrapper {

    private ArrayList<treatment> pList;

    public ArrayList<treatment> getpList() {
        return pList;
    }

    public void setpList(ArrayList<treatment> pList) {
        this.pList = pList;
    }

}
