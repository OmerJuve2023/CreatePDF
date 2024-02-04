package service;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import dto.FIle;

import javax.swing.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;

public class CreatePNG extends JFrame {
    FIle arch = new FIle();

    public void init(double[] x, double[] y) {
        EventQueue.invokeLater(() -> initUI(x, y));
    }

    private void initUI(double[] x, double[] y) {

        XYDataset dataset = createDataset(x, y);
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        chartPanel.setSize(300, 300);
        chartPanel.setBackground(Color.WHITE);
        add(chartPanel);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String namepng = arch.save() + "\\imagen.png";
        System.out.println(namepng);
        try {
            ChartUtils.saveChartAsPNG(new File(namepng), chart, 450, 350);
        } catch (IOException e) {
            System.out.println("Error al guardar la imagen:\n" + e.getMessage());
        }
    }

    private XYDataset createDataset(double[] x, double[] y) {
        XYSeries series = new XYSeries("");
        for (int i = 0; i < x.length; i++) {
            series.add(x[i], y[i]);
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        return dataset;
    }

    private JFreeChart createChart(XYDataset dataset) {
        JFreeChart chart = ChartFactory.createXYLineChart(null, "x", "y", dataset, PlotOrientation.VERTICAL, true, true, true);
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);
        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);
        chart.getLegend().setFrame(BlockBorder.NONE);
        return chart;
    }

}
