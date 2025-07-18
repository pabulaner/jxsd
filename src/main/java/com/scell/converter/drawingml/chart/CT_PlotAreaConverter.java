package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_PlotAreaModel;
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

public class CT_PlotAreaConverter {
  private CT_PlotAreaConverter() {
  }

  public static CT_PlotAreaModel fromDocx4J(CTPlotArea value) {
    if (value == null) return null;
    // look here true;
    List<CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel> areaChartOrArea3DChartOrLineChart = value.getAreaChartOrArea3DChartOrLineChart().stream().map(val -> {
      if (val instanceof CTAreaChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newAreaChart(CT_AreaChartConverter.fromDocx4J((CTAreaChart) val));
      if (val instanceof CTArea3DChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newArea3DChart(CT_Area3DChartConverter.fromDocx4J((CTArea3DChart) val));
      if (val instanceof CTLineChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newLineChart(CT_LineChartConverter.fromDocx4J((CTLineChart) val));
      if (val instanceof CTLine3DChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newLine3DChart(CT_Line3DChartConverter.fromDocx4J((CTLine3DChart) val));
      if (val instanceof CTStockChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newStockChart(CT_StockChartConverter.fromDocx4J((CTStockChart) val));
      if (val instanceof CTRadarChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newRadarChart(CT_RadarChartConverter.fromDocx4J((CTRadarChart) val));
      if (val instanceof CTScatterChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newScatterChart(CT_ScatterChartConverter.fromDocx4J((CTScatterChart) val));
      if (val instanceof CTPieChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newPieChart(CT_PieChartConverter.fromDocx4J((CTPieChart) val));
      if (val instanceof CTPie3DChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newPie3DChart(CT_Pie3DChartConverter.fromDocx4J((CTPie3DChart) val));
      if (val instanceof CTDoughnutChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newDoughnutChart(CT_DoughnutChartConverter.fromDocx4J((CTDoughnutChart) val));
      if (val instanceof CTBarChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newBarChart(CT_BarChartConverter.fromDocx4J((CTBarChart) val));
      if (val instanceof CTBar3DChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newBar3DChart(CT_Bar3DChartConverter.fromDocx4J((CTBar3DChart) val));
      if (val instanceof CTOfPieChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newOfPieChart(CT_OfPieChartConverter.fromDocx4J((CTOfPieChart) val));
      if (val instanceof CTSurfaceChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newSurfaceChart(CT_SurfaceChartConverter.fromDocx4J((CTSurfaceChart) val));
      if (val instanceof CTSurface3DChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newSurface3DChart(CT_Surface3DChartConverter.fromDocx4J((CTSurface3DChart) val));
      if (val instanceof CTBubbleChart) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newBubbleChart(CT_BubbleChartConverter.fromDocx4J((CTBubbleChart) val));
      return null;
    } ).collect(Collectors.toList());
    // look here true;
    List<CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel> valAxOrCatAxOrDateAx = value.getValAxOrCatAxOrDateAx().stream().map(val -> {
      if (val instanceof CTValAx) return CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel.newValAx(CT_ValAxConverter.fromDocx4J((CTValAx) val));
      if (val instanceof CTCatAx) return CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel.newCatAx(CT_CatAxConverter.fromDocx4J((CTCatAx) val));
      if (val instanceof CTDateAx) return CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel.newDateAx(CT_DateAxConverter.fromDocx4J((CTDateAx) val));
      if (val instanceof CTSerAx) return CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel.newSerAx(CT_SerAxConverter.fromDocx4J((CTSerAx) val));
      return null;
    } ).collect(Collectors.toList());
    return new CT_PlotAreaModel(CT_LayoutConverter.fromDocx4J(value.getLayout()), areaChartOrArea3DChartOrLineChart, valAxOrCatAxOrDateAx, CT_DTableConverter.fromDocx4J(value.getDTable()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTPlotArea toDocx4J(CT_PlotAreaModel value) {
    return null;
  }
}
