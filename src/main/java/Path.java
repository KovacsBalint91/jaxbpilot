import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Path {

    @XmlAttribute(name = "roundTimeInMs")
    int roundTimeInMs;

    @XmlElement(name = "point")
    List<Point> points;

    public int getRoundTimeInMs() {
        return roundTimeInMs;
    }

    public List<Point> getPoints() {
        return points;
    }

}
