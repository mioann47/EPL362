package epl362rest;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

@XmlRootElement
public class requestlistwrapper {

    private ArrayList<request> pList;

    public ArrayList<request> getpList() {
        return pList;
    }

    public void setpList(ArrayList<request> pList) {
        this.pList = pList;
    }




}
