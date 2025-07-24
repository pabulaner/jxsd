package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.PlotAreaModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTArea3DChart;
import org.docx4j.dml.chart.CTAreaChart;
import org.docx4j.dml.chart.CTBar3DChart;
import org.docx4j.dml.chart.CTBarChart;
import org.docx4j.dml.chart.CTBubbleChart;
import org.docx4j.dml.chart.CTCatAx;
import org.docx4j.dml.chart.CTDateAx;
import org.docx4j.dml.chart.CTDoughnutChart;
import org.docx4j.dml.chart.CTLine3DChart;
import org.docx4j.dml.chart.CTLineChart;
import org.docx4j.dml.chart.CTOfPieChart;
import org.docx4j.dml.chart.CTPie3DChart;
import org.docx4j.dml.chart.CTPieChart;
import org.docx4j.dml.chart.CTPlotArea;
import org.docx4j.dml.chart.CTRadarChart;
import org.docx4j.dml.chart.CTScatterChart;
import org.docx4j.dml.chart.CTSerAx;
import org.docx4j.dml.chart.CTStockChart;
import org.docx4j.dml.chart.CTSurface3DChart;
import org.docx4j.dml.chart.CTSurfaceChart;
import org.docx4j.dml.chart.CTValAx;

public class PlotAreaConverter {
  private PlotAreaConverter() {
  }

  public static PlotAreaModel fromDocx4J(CTPlotArea value) {
    if (value == null) return null;
    List<PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel> areaChartOrArea3DChartOrLineChart = value.getAreaChartOrArea3DChartOrLineChart().stream().map(val -> {
      if (val instanceof CTAreaChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newAreaChart(AreaChartConverter.fromDocx4J((CTAreaChart) val));
      if (val instanceof CTArea3DChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newArea3DChart(Area3DChartConverter.fromDocx4J((CTArea3DChart) val));
      if (val instanceof CTLineChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newLineChart(LineChartConverter.fromDocx4J((CTLineChart) val));
      if (val instanceof CTLine3DChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newLine3DChart(Line3DChartConverter.fromDocx4J((CTLine3DChart) val));
      if (val instanceof CTStockChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newStockChart(StockChartConverter.fromDocx4J((CTStockChart) val));
      if (val instanceof CTRadarChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newRadarChart(RadarChartConverter.fromDocx4J((CTRadarChart) val));
      if (val instanceof CTScatterChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newScatterChart(ScatterChartConverter.fromDocx4J((CTScatterChart) val));
      if (val instanceof CTPieChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newPieChart(PieChartConverter.fromDocx4J((CTPieChart) val));
      if (val instanceof CTPie3DChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newPie3DChart(Pie3DChartConverter.fromDocx4J((CTPie3DChart) val));
      if (val instanceof CTDoughnutChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newDoughnutChart(DoughnutChartConverter.fromDocx4J((CTDoughnutChart) val));
      if (val instanceof CTBarChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newBarChart(BarChartConverter.fromDocx4J((CTBarChart) val));
      if (val instanceof CTBar3DChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newBar3DChart(Bar3DChartConverter.fromDocx4J((CTBar3DChart) val));
      if (val instanceof CTOfPieChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newOfPieChart(OfPieChartConverter.fromDocx4J((CTOfPieChart) val));
      if (val instanceof CTSurfaceChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newSurfaceChart(SurfaceChartConverter.fromDocx4J((CTSurfaceChart) val));
      if (val instanceof CTSurface3DChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newSurface3DChart(Surface3DChartConverter.fromDocx4J((CTSurface3DChart) val));
      if (val instanceof CTBubbleChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newBubbleChart(BubbleChartConverter.fromDocx4J((CTBubbleChart) val));
      return new PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel();
    } ).collect(Collectors.toList());
    List<PlotAreaModel.ValAxOrCatAxOrDateAxModel> valAxOrCatAxOrDateAx = value.getValAxOrCatAxOrDateAx().stream().map(val -> {
      if (val instanceof CTValAx) return PlotAreaModel.ValAxOrCatAxOrDateAxModel.newValAx(ValAxConverter.fromDocx4J((CTValAx) val));
      if (val instanceof CTCatAx) return PlotAreaModel.ValAxOrCatAxOrDateAxModel.newCatAx(CatAxConverter.fromDocx4J((CTCatAx) val));
      if (val instanceof CTDateAx) return PlotAreaModel.ValAxOrCatAxOrDateAxModel.newDateAx(DateAxConverter.fromDocx4J((CTDateAx) val));
      if (val instanceof CTSerAx) return PlotAreaModel.ValAxOrCatAxOrDateAxModel.newSerAx(SerAxConverter.fromDocx4J((CTSerAx) val));
      return new PlotAreaModel.ValAxOrCatAxOrDateAxModel();
    } ).collect(Collectors.toList());
    return new PlotAreaModel(LayoutConverter.fromDocx4J(value.getLayout()), areaChartOrArea3DChartOrLineChart, valAxOrCatAxOrDateAx, DTableConverter.fromDocx4J(value.getDTable()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
