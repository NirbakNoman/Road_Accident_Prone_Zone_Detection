
package roadaccident;

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
public class LineChart_Vehicle extends JFrame {

    
    public LineChart_Vehicle(final String title) {

        super(title);

        final XYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(820, 550));
        setContentPane(chartPanel);
        

    }
    
   
    private XYDataset createDataset() {
        
    
        
         
        
        
        int i;

        int start_year = 2007;
        Calendar now = Calendar.getInstance();   // Gets the current date and time
        int current_year = now.get(Calendar.YEAR);

       //vehicle_id=1
        
        final XYSeries series1 = new XYSeries("Bus");
        
        try
        
        {
        
            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+1+"' and date like'"+i+"%'";
             PreparedStatement preparedStm = conn.prepareStatement(query);
             preparedStm.execute();
             ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    Number number = i;
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

        
     
        
        
        
        
      
        //vehicle_id=2

        final XYSeries series2 = new XYSeries("Truck");
        
         try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+2+"' and date like'"+i+"%'";
                PreparedStatement preparedStm = conn.prepareStatement(query);
            preparedStm.execute();
            ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                       {

//          Number number = (Number) entry.getValue();
                    Number number = i;
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
                } catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }

         
         
         
         
            //vehicle_id=3
         
         
                 final XYSeries series3 = new XYSeries("Maxi");
   
          try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+3+"' and date like'"+i+"%'";
             PreparedStatement preparedStm = conn.prepareStatement(query);
             preparedStm.execute();
             ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    Number number = i;
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
            
            



            //p.setRangeGridlinePaint(Color.BLUE);

           


        } catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }
          
          
          
          //vehicle_id=4
    
    final XYSeries series4 = new XYSeries("Covered Van");

          
          try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+4+"' and date like'"+i+"%'";
             PreparedStatement preparedStm = conn.prepareStatement(query);
             preparedStm.execute();
             ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    Number number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series4.add(number,p);

                           }

                        }
            
               } 
          catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }
    
          
          
          
          //vehicle_id=5
          
            final XYSeries series5 = new XYSeries("Pick Up");

          
          try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+5+"' and date like'"+i+"%'";
              PreparedStatement preparedStm = conn.prepareStatement(query);
            preparedStm.execute();
            ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    Number number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series5.add(number,p);

                           }

                        }
            
            



            //p.setRangeGridlinePaint(Color.BLUE);

           


        } catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }
    
          
          
          
            //vehicle_id=6
          
            final XYSeries series6 = new XYSeries("CNG");

          
          try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+6+"' and date like'"+i+"%'";
              PreparedStatement preparedStm = conn.prepareStatement(query);
            preparedStm.execute();
            ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    Number number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series6.add(number,p);

                           }

                        }
            
            



            //p.setRangeGridlinePaint(Color.BLUE);

           


        } catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }
    
          
          
          
          
           //vehicle_id=7
          
            final XYSeries series7 = new XYSeries("Private Car");

          
          try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

            String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+7+"' and date like'"+i+"%'";
              PreparedStatement preparedStm = conn.prepareStatement(query);
            preparedStm.execute();
            ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    Number number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series7.add(number,p);

                           }

                        }
            
            
        } catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }
    
           
         
          
            //vehicle_id=8
          
            final XYSeries series8 = new XYSeries("Micro Bus");

          
          try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+8+"' and date like'"+i+"%'";
              PreparedStatement preparedStm = conn.prepareStatement(query);
            preparedStm.execute();
            ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    Number number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series8.add(number,p);

                           }

                        }
            
            



             }
          catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }
    
          
            //vehicle_id=9
          
            final XYSeries series9 = new XYSeries("Bike");

          
          try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+9+"' and date like'"+i+"%'";
              PreparedStatement preparedStm = conn.prepareStatement(query);
            preparedStm.execute();
            ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    Number number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series9.add(number,p);

                           }

                        }
            
            



            //p.setRangeGridlinePaint(Color.BLUE);

           


        } catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }
    
          
         
          
            //vehicle_id=10
          
            final XYSeries series10 = new XYSeries("Long Vehicle");

          
          try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

            String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+10+"' and date like'"+i+"%'";
              PreparedStatement preparedStm = conn.prepareStatement(query);
            preparedStm.execute();
            ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    Number number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series10.add(number,p);

                           }

                        }
            
                     
          
        } catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }
    
          
          
            //vehicle_id=11
          
            final XYSeries series11 = new XYSeries("Jip");

          
          try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+11+"' and date like'"+i+"%'";
              PreparedStatement preparedStm = conn.prepareStatement(query);
            preparedStm.execute();
            ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    Number number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series11.add(number,p);

                           }

                        }
            
            
                   


        } catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }
    
          
            //vehicle_id=12
          
            final XYSeries series12 = new XYSeries("Rickshaw");

          
          try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+12+"' and date like'"+i+"%'";
             PreparedStatement preparedStm = conn.prepareStatement(query);
             preparedStm.execute();
             ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    Number number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series12.add(number,p);

                           }

                        }
            
            



            //p.setRangeGridlinePaint(Color.BLUE);

           


        } catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }
    
          
          
            //vehicle_id=13
          
            final XYSeries series13 = new XYSeries("Bicycle");

          
          try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+13+"' and date like'"+i+"%'";
              PreparedStatement preparedStm = conn.prepareStatement(query);
            preparedStm.execute();
            ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    Number number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series13.add(number,p);

                           }

                        }
            
            
           
        } catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }
    
          
            //vehicle_id=5
          
            final XYSeries series14= new XYSeries("Leguna");

          
          try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";

            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
       
     
             for (i = start_year; i < current_year; i++)
                  {

             String query="Select a.vehicle_name,count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+14+"' and date like'"+i+"%'";
             PreparedStatement preparedStm = conn.prepareStatement(query);
             preparedStm.execute();
             ResultSet rs2 = preparedStm.getResultSet();


           while (rs2.next())
               
                   {

//          Number number = (Number) entry.getValue();
                    Number number = i;
                   // String v = number.toString();
//               Double j=Double.parseDouble(value);

                    int m = rs2.getInt("total_accident");
                    Number number1 = m;
                    String q = number1.toString();
                    Double p = Double.parseDouble(q);
                    //summary = rs.getInt("SummaryOfCalls");

                series14.add(number,p);

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
        dataset.addSeries(series4);
        dataset.addSeries(series5);
        dataset.addSeries(series6);
        dataset.addSeries(series7);
        dataset.addSeries(series8);
        dataset.addSeries(series9);
        dataset.addSeries(series10);
        dataset.addSeries(series11);
        dataset.addSeries(series12);
        dataset.addSeries(series13);
        dataset.addSeries(series14);
         
        return dataset;
        
    }
    
    
    private JFreeChart createChart(final XYDataset dataset) {
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "Comparison of  Accidents based on Vehicles",      // chart title
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

        final LineChart_Vehicle demo = new LineChart_Vehicle("Black Spots of Bangladesh");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }

}

