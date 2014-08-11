/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikpie3d;

import java.util.Locale;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.Rotation;

/**
 *
 * @author MrRoot
 */
public class GrafikPie3D extends  JFrame{
     private static final long serialVersionUID = 1L;
   
  public GrafikPie3D(String applicationTitle, 
String chartTitle) {
        super(applicationTitle);
        // This will create the dataset 
        PieDataset dataset = createDataset();
        // based on the dataset we create the chart
        JFreeChart chart = createChart
(dataset, chartTitle);
        // we put the chart into a panel
        ChartPanel chartPanel = new ChartPanel(chart);
        // default size
        chartPanel.setPreferredSize
(new java.awt.Dimension(500, 270));
        // add it to our application
        setContentPane(chartPanel);

    }
    
    
/**
     * Creates a sample dataset 
     */

     //Methot membuat data yang akan di bandingkan
    private  PieDataset createDataset() {
        
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Java Programming", 29);
        result.setValue("Android", 20);
        result.setValue("Desain", 51);
        result.setValue("Jaringan", 33);
        return result;
        
    }
    
    
/**
     * Creates a chart
     */

    private JFreeChart createChart(PieDataset dataset, String title) {
        
        JFreeChart chart = ChartFactory.createPieChart3D
(title,          // chart title
             dataset,                // data
            true,                   // include legend
            true,
            false);

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(400);
        plot.setDirection(Rotation.ANTICLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
        
    }
    
   
   
}
