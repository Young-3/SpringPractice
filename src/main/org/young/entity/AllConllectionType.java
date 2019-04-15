package main.org.young.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AllConllectionType {
    private List<String> listElement;
    private String[] arrayElenment;
    private Set<String> setElenment;
    private Map<String,String> mapElenment;
    private Properties props;

    public AllConllectionType() {

    }

    public AllConllectionType(List<String> listElement, String[] arrayElenment, Set<String> setElenment, Map<String, String> mapElenment, Properties props) {
        this.listElement = listElement;
        this.arrayElenment = arrayElenment;
        this.setElenment = setElenment;
        this.mapElenment = mapElenment;
        this.props = props;
    }

    public List<String> getListElement() {
        return listElement;
    }

    public void setListElement(List<String> listElement) {
        this.listElement = listElement;
    }

    public String[] getArrayElenment() {
        return arrayElenment;
    }

    public void setArrayElenment(String[] arrayElenment) {
        this.arrayElenment = arrayElenment;
    }

    public Set<String> getSetElenment() {
        return setElenment;
    }

    public void setSetElenment(Set<String> setElenment) {
        this.setElenment = setElenment;
    }

    public Map<String, String> getMapElenment() {
        return mapElenment;
    }

    public void setMapElenment(Map<String, String> mapElenment) {
        this.mapElenment = mapElenment;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        String strContent = "";
        for (String str:arrayElenment) {
            strContent += str +",";
        }
        return "list"+this.listElement+"\nset"+this.setElenment+"\nmap"+this.mapElenment+"\nprops"+this.props+"\narray"+strContent;
    }
}
