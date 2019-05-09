import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Point {

    @XmlElement(name = "latitude")
    double latitude;

    @XmlElement(name = "progress")
    double progress;

    public double getLatitude() {
        return latitude;
    }

    public double getProgress() {
        return progress;
    }
}
