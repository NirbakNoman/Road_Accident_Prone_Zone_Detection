
package roadaccident;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Noman
 */
public class ImagePanel extends JPanel 
{ 

private ImageIcon imageIcon; 

public ImagePanel(ImageIcon imageIcon) 
{ 
this.imageIcon = imageIcon; 
} 


@Override 
public void paintComponent(Graphics g) 
{ 
Graphics2D graphics2D = (Graphics2D) g; 
//graphics2D.drawImage(imageIcon.getImage(), null, this);
graphics2D.drawImage(imageIcon.getImage(), 20,50, null); 
} 

} 