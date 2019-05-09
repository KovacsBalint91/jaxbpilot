import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "class")
@XmlAccessorType(XmlAccessType.FIELD)
public class Root {

    @XmlElementWrapper(name = "uavs")
    @XmlElement(name = "uav")
    private List<Uav> uavs;

    public List<Uav> getUavs() {
        return uavs;
    }
}
