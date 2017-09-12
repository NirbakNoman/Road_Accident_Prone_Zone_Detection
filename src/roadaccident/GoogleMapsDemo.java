package roadaccident;

/**
 *
 * @author Noman
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GoogleMapsDemo {

    private String color = "red";

    public GoogleMapsDemo() {

        try {

            URL url_image = null;
            String markers = "";
            Accident_Prone_Zone1 zone = new Accident_Prone_Zone1("location_id");
            Map<String, Double> map = zone.getData();
            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";


            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);


            int index = 0;
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                if (index < 5) {

                    String key = entry.getKey().toString();
                    //  System.out.println(key);
//                       Number number = (Number) entry.getValue();
//                       String value = number.toString();
//                       Double value1 = Double.parseDouble(value);
//                       
                    String query = "Select lat, lon from location where location_id = " + key;
                    PreparedStatement prepareStm = conn.prepareStatement(query);
                    prepareStm.execute();
                    ResultSet rs2 = prepareStm.getResultSet();
                    while (rs2.next()) {
                        String lat = rs2.getDouble("lat") + "";
                        String lon = rs2.getDouble("lon") + "";
                        markers += "&markers=color:" + color + "%7Clabel:S%7C" + lat + "," + lon;
//                            System.out.println(markers);

                    }
                    index++;

                } 
                else {
                    break;
                }
            }
//String loc_url =  "http://maps.googleapis.com/maps/api/staticmap?size=400x1200&maptype=roadmap"+markers+"&sensor=false";
            url_image = new URL("http://maps.googleapis.com/maps/api/staticmap?size=1000x660&maptype=roadmap" + markers + "&sensor=false");
//System.out.println(loc_url);


            String destinationFile = "image.jpg";

            InputStream is = url_image.openStream();
            OutputStream os = new FileOutputStream(destinationFile);
            byte[] b = new byte[2048];
            int length;
            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }
            is.close();
            os.close();


        } catch (Exception ex) {
            ex.printStackTrace();
        }

        JFrame test = new JFrame("Black Spots of Bangladesh in Map");
        ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
                .getImage().getScaledInstance(1000, 650,
                java.awt.Image.SCALE_SMOOTH));
        test.add(new JLabel(imageIcon));
// show the GUI window
        test.setVisible(true);
        test.pack();

    }

    public static void main(String[] args) throws IOException {

        new GoogleMapsDemo();

    }
}
