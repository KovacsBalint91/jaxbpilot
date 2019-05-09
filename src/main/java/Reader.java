import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class Reader {

    public static void main (String[] args) {
        Reader reader = new Reader();
        reader.parseRoot();
    }

    public void parseRoot() {
        try {
            JAXBContext context = JAXBContext.newInstance(Root.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            File xml = new File(getClass().getClassLoader().getResource("dummy.xml").toURI());
            StreamSource source = new StreamSource(xml);
            Root root = (Root) unmarshaller.unmarshal(source);

            for(Uav item: root.getUavs()){
                System.out.println("id: " + item.getId());
                System.out.println("type: " + item.getTypeOfUav());
                System.out.println("roundtime: " + item.path.getRoundTimeInMs());

                for(Point p: item.path.points){
                    System.out.println("Latitude: " + p.getLatitude());
                    System.out.println("Progress: " + p.getProgress());
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
