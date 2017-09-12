
package roadaccident;

/**
 *
 * @author Noman
 */
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
//import org.jfree.ui.Spacer;
public class LineChart_Season extends JFrame {

    
    public LineChart_Season(final String title) {

        super(title);

        final XYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(720, 500));
        setContentPane(chartPanel);
        

    }
    
   
    private XYDataset createDataset() {
        
     //    final XYSeries series1 = new XYSeries("Morning");
        
        int i;

        int start_year = 2007;
        Calendar now = Calendar.getInstance();   // Gets the current date and time
        int current_year = now.get(Calendar.YEAR);

        //season_id=1
        
       final XYSeries series1 = new XYSeries("First Portion");

        try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.season_name ,count(b.accident_no) as total_accident from season a left join  accident b on a.season_id=b.season_id  where b.season_id='"+1+"' and date like'"+i+"%'";
             PreparedStatement preparedStm = conn.prepareStatement(query);
             preparedStm.execute();
             ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    int number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series1.add(number,p);

                           }

                        }
            
            
              }
        
        catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }

        
      
        
        
      
        
        //season_id=2

        final XYSeries series2 = new XYSeries("Second Portion");
        
         try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.season_name ,count(b.accident_no) as total_accident from season a left join  accident b on a.season_id=b.season_id  where b.season_id='"+2+"' and date like'"+i+"%'";
             PreparedStatement preparedStm = conn.prepareStatement(query);
             preparedStm.execute();
             ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    int number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series2.add(number,p);

                           }

                        }
         }
        
        catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }

         
          //season_id=3
          
          final XYSeries series3 = new XYSeries("Third Portion");

        try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.season_name ,count(b.accident_no) as total_accident from season a left join  accident b on a.season_id=b.season_id  where b.season_id='"+3+"' and date like'"+i+"%'";
             PreparedStatement preparedStm = conn.prepareStatement(query);
             preparedStm.execute();
             ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    int number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series3.add(number,p);

                           }

                        }
                }
        
        catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }


          
          
          
          
          final XYSeriesCollection dataset = new XYSeriesCollection();
          dataset.addSeries(series1);
          dataset.addSeries(series2);
          dataset.addSeries(series3);
       
          return dataset;
        
    }
    
    
    private JFreeChart createChart(final XYDataset dataset) {
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "Comparison of Accidents based on Year Portion",      // chart title
            "Year",                      // x axis label
            "Number of Accident",                      // y axis label
            dataset,                  // data
            PlotOrientation.VERTICAL,
            true,                     // include legend
            true,                     // tooltips
            false                     // urls
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
        chart.setBackgroundPaint(Color.white);

//        final StandardLegend legend = (StandardLegend) chart.getLegend();
  //      legend.setDisplaySeriesShapes(true);
        
        // get a reference to the plot for further customisation...
        final XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.lightGray);
    //    plot.setAxisOffset(new Spacer(Spacer.ABSOLUTE, 5.0, 5.0, 5.0, 5.0));
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        
        final XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0, true);
        renderer.setSeriesShapesVisible(1, true);
        plot.setRenderer(renderer);

        // change the auto tick unit selection to integer units only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        // OPTIONAL CUSTOMISATION COMPLETED.
                
        return chart;
        
    }


    public static void main(final String[] args) {

        final LineChart_Season demo = new LineChart_Season("Black Spots of Bangladesh");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }

}
