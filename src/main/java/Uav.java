import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Uav {

    @XmlAttribute(name = "id")
    int id;
    @XmlAttribute(name = "typeOfUav")
    String typeOfUav;

    @XmlElement(name = "path")
    Path path;

    public int getId() {
        return id;
    }

    public String getTypeOfUav() {
        return typeOfUav;
    }

}
