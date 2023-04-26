/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.MerchantWorkArea;

import Business.Business;
import Business.Merchant.Merchant;
import Business.ProductSchedule.Schedule;
import Business.UserAccount.UserAccount;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;

/**
 *
 * @author tianzhichen
 */
public class DashboardJPanel extends javax.swing.JPanel {

    Business business;
    UserAccount userAccount;
    Map<Integer, String> monthMap = new HashMap<>(){
        {
            put(1, "January");
            put(2, "Feburary");
            put(3, "March");
            put(4, "April");
            put(5, "May");
            put(6, "June");
            put(7, "July");
            put(8, "August");
            put(9, "September");
            put(10, "October");
            put(11, "November");
            put(12, "December");
        }
    };

    /**
     * Creates new form DashboardJPanel
     */
    public DashboardJPanel() {
        initComponents();
    }

    public DashboardJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;

        showPieChart();
        showLineChart();
        showBarChart();
        showHistogram();
    }

    public void showPieChart() {

        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();
        barDataset.setValue("IPhone 5s", new Double(20));
        barDataset.setValue("SamSung Grand", new Double(20));
        barDataset.setValue("MotoG", new Double(40));
        barDataset.setValue("Nokia Lumia", new Double(10));

        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("mobile sales", barDataset, false, true, false);//explain

        PiePlot piePlot = (PiePlot) piechart.getPlot();

        //changing pie chart blocks colors
        piePlot.setSectionPaint("IPhone 5s", new Color(255, 255, 102));
        piePlot.setSectionPaint("SamSung Grand", new Color(102, 255, 102));
        piePlot.setSectionPaint("MotoG", new Color(255, 102, 153));
        piePlot.setSectionPaint("Nokia Lumia", new Color(0, 204, 204));

        piePlot.setBackgroundPaint(Color.white);

        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelPieChart.removeAll();
        panelPieChart.add(barChartPanel, BorderLayout.CENTER);
        panelPieChart.validate();
    }

    public void showLineChart() {
        //create dataset for the graph
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");

        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("contribution", "monthly", "amount",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        //create plot object
        CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
        // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);

        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204, 0, 51);
        lineRenderer.setSeriesPaint(0, lineChartColor);

        //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panelLineChart.removeAll();
        panelLineChart.add(lineChartPanel, BorderLayout.CENTER);
        panelLineChart.validate();
    }

    public void showBarChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Map<String, Double> revenues = this.calculateMonthlyRevenue();
        for (Map.Entry<String, Double> entry: revenues.entrySet()) {
            dataset.setValue(entry.getValue(), "Amount", entry.getKey());
        }
        dataset.setValue(200, "Amount", "January");
        dataset.setValue(150, "Amount", "February");
        dataset.setValue(18, "Amount", "March");
        dataset.setValue(100, "Amount", "April");
        dataset.setValue(80, "Amount", "May");
        dataset.setValue(250, "Amount", "June");

        JFreeChart chart = ChartFactory.createBarChart("contribution", "monthly", "amount",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204, 0, 51);
        renderer.setSeriesPaint(0, clr3);

        ChartPanel barpChartPanel = new ChartPanel(chart);
        panelBarChart.removeAll();
        panelBarChart.add(barpChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
    }
    
    
    
    private Map<String, Double> calculateMonthlyRevenue() {
        Merchant m = this.business.getMerchantDirectory().findMerchantByName(this.userAccount.getUsername());
        Map<String, Double> revenues = new HashMap<>();
        for (Schedule schedule: m.getScheduleDirectory().getScheduleList()) {
            Date date = schedule.getDate();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int month = cal.get(Calendar.MONTH);
            String month_ = this.monthMap.get(month);
            if (revenues.containsKey(month_)) {
                revenues.replace(month_, revenues.get(month_)+schedule.calculateTotalRevenue());
            } else {
                revenues.put(month_, schedule.calculateTotalRevenue());
            }
        }
        return revenues;
    }

    public void showHistogram() {

        double[] values = {95, 49, 14, 59, 50, 66, 47, 40, 1, 67,
            12, 58, 28, 63, 14, 9, 31, 17, 94, 71,
            49, 64, 73, 97, 15, 63, 10, 12, 31, 62,
            93, 49, 74, 90, 59, 14, 15, 88, 26, 57,
            77, 44, 58, 91, 10, 67, 57, 19, 88, 84
        };

        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("key", values, 20);

        JFreeChart chart = ChartFactory.createHistogram("Frequency Histogram", "Data", "Frequency", dataset, PlotOrientation.VERTICAL, false, true, false);
        XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);

        ChartPanel barpChartPanel2 = new ChartPanel(chart);
        panelHistogram.removeAll();
        panelHistogram.add(barpChartPanel2, BorderLayout.CENTER);
        panelHistogram.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPieChart = new javax.swing.JPanel();
        panelLineChart = new javax.swing.JPanel();
        panelBarChart = new javax.swing.JPanel();
        panelHistogram = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 1300));
        setMinimumSize(new java.awt.Dimension(1200, 1300));
        setPreferredSize(new java.awt.Dimension(1200, 1300));
        setSize(new java.awt.Dimension(1200, 1300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPieChart.setLayout(new java.awt.BorderLayout());
        add(panelPieChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 310, 300));

        panelLineChart.setLayout(new java.awt.BorderLayout());
        add(panelLineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 320, 300));

        panelBarChart.setLayout(new java.awt.BorderLayout());
        add(panelBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 350, 300));

        panelHistogram.setLayout(new java.awt.BorderLayout());
        add(panelHistogram, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 650, 270));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pawel-czerwinski-QY5U8JD3-tk-unsplash.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-720, -120, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelHistogram;
    private javax.swing.JPanel panelLineChart;
    private javax.swing.JPanel panelPieChart;
    // End of variables declaration//GEN-END:variables
}
