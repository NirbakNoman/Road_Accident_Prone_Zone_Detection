
package roadaccident;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Noman
 */
public class ImageRequest extends JFrame 
{ 
   private String color = "red";
public ImageRequest() 
{ 

URL url_image = null; 

try 
{ 
String markers = "";    
 Accident_Prone_Zone1 zone = new Accident_Prone_Zone1("location_id");
 Map<String, Double> map = zone.getData();
     String url="jdbc:mysql://localhost:3306/road_accident"; 
       String user="root";
       String pass="";
       
       
       Connection conn=(Connection)DriverManager.getConnection(url, user, pass);

       
        int index = 0;
        for (Map.Entry<String, Double> entry : map.entrySet())
                {
                   if(index<5)
                   {
                      
                       String key = entry.getKey().toString();
                     //  System.out.println(key);
//                       Number number = (Number) entry.getValue();
//                       String value = number.toString();
//                       Double value1 = Double.parseDouble(value);
//                       
                        String query="Select lat, lon from location where location_id = "+key;
                        PreparedStatement prepareStm=conn.prepareStatement(query);
                        prepareStm.execute();
                        ResultSet rs2=prepareStm.getResultSet();
                        while(rs2.next())
                        {
                            String lat = rs2.getDouble("lat")+"";
                            String lon = rs2.getDouble("lon")+"";   
                            markers += "&markers=color:"+ color+"%7Clabel:S%7C"+lat+","+lon;
//                            System.out.println(markers);
                          
                        }
                         index++;
                       
                   }
                   else
                     break;
                }   
//String loc_url =  "http://maps.googleapis.com/maps/api/staticmap?size=400x1200&maptype=roadmap"+markers+"&sensor=false";
url_image = new URL("http://maps.googleapis.com/maps/api/staticmap?size=1100x860&maptype=roadmap"+markers+"&sensor=false");
//System.out.println(loc_url);
} 
catch (Exception ex) 
{ 
ex.printStackTrace(); 
} 

ImageIcon imageIcon = new ImageIcon(url_image); 

Container container = getContentPane(); 
container.setLayout(new BorderLayout()); 
container.add(new ImagePanel(imageIcon), BorderLayout.CENTER); 

pack(); 

setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
setLocationRelativeTo(null); 
setVisible(true); 

} 

public static void main(String[] args) 
{ 
new ImageRequest(); 
} 

}