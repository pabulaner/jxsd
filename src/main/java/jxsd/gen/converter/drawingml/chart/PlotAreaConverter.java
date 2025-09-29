package jxsd.gen.converter.drawingml.chart;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.PlotAreaModel;
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

/**
 * This is a generated sequence class.
 */
public class PlotAreaConverter {
  private PlotAreaConverter() {
  }

  public static PlotAreaModel fromDocx4j(CTPlotArea value) {
    if (value == null) return null;
    List<PlotAreaModel.AreaChartOrArea3DChartOrLineChart> areaChartOrArea3DChartOrLineChart = value.getAreaChartOrArea3DChartOrLineChart().stream().map(val -> {
      if (val instanceof CTAreaChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newAreaChart(AreaChartConverter.fromDocx4j((CTAreaChart) val));
      if (val instanceof CTArea3DChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newArea3DChart(Area3DChartConverter.fromDocx4j((CTArea3DChart) val));
      if (val instanceof CTLineChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newLineChart(LineChartConverter.fromDocx4j((CTLineChart) val));
      if (val instanceof CTLine3DChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newLine3DChart(Line3DChartConverter.fromDocx4j((CTLine3DChart) val));
      if (val instanceof CTStockChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newStockChart(StockChartConverter.fromDocx4j((CTStockChart) val));
      if (val instanceof CTRadarChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newRadarChart(RadarChartConverter.fromDocx4j((CTRadarChart) val));
      if (val instanceof CTScatterChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newScatterChart(ScatterChartConverter.fromDocx4j((CTScatterChart) val));
      if (val instanceof CTPieChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newPieChart(PieChartConverter.fromDocx4j((CTPieChart) val));
      if (val instanceof CTPie3DChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newPie3DChart(Pie3DChartConverter.fromDocx4j((CTPie3DChart) val));
      if (val instanceof CTDoughnutChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newDoughnutChart(DoughnutChartConverter.fromDocx4j((CTDoughnutChart) val));
      if (val instanceof CTBarChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newBarChart(BarChartConverter.fromDocx4j((CTBarChart) val));
      if (val instanceof CTBar3DChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newBar3DChart(Bar3DChartConverter.fromDocx4j((CTBar3DChart) val));
      if (val instanceof CTOfPieChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newOfPieChart(OfPieChartConverter.fromDocx4j((CTOfPieChart) val));
      if (val instanceof CTSurfaceChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newSurfaceChart(SurfaceChartConverter.fromDocx4j((CTSurfaceChart) val));
      if (val instanceof CTSurface3DChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newSurface3DChart(Surface3DChartConverter.fromDocx4j((CTSurface3DChart) val));
      if (val instanceof CTBubbleChart) return CTPlotArea.AreaChartOrArea3DChartOrLineChart.newBubbleChart(BubbleChartConverter.fromDocx4j((CTBubbleChart) val));
      List<PlotAreaModel.ValAxOrCatAxOrDateAx> valAxOrCatAxOrDateAx = value.getValAxOrCatAxOrDateAx().stream().map(val -> {
        if (val instanceof CTValAx) return CTPlotArea.ValAxOrCatAxOrDateAx.newValAx(ValAxConverter.fromDocx4j((CTValAx) val));
        if (val instanceof CTCatAx) return CTPlotArea.ValAxOrCatAxOrDateAx.newCatAx(CatAxConverter.fromDocx4j((CTCatAx) val));
        if (val instanceof CTDateAx) return CTPlotArea.ValAxOrCatAxOrDateAx.newDateAx(DateAxConverter.fromDocx4j((CTDateAx) val));
        if (val instanceof CTSerAx) return CTPlotArea.ValAxOrCatAxOrDateAx.newSerAx(SerAxConverter.fromDocx4j((CTSerAx) val));
        return new PlotAreaModel(LayoutConverter.fromDocx4j(value.getLayout()), areaChartOrArea3DChartOrLineChart, valAxOrCatAxOrDateAx, DTableConverter.fromDocx4j(value.getDTable()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
      }

      public static CTPlotArea toDocx4j(PlotAreaModel value) {
        if (value == null) return null;
        CTPlotArea result = new CTPlotArea();
        result.setLayout(LayoutConverter.toDocx4j(value.getLayout()));
        result.setDTable(DTableConverter.toDocx4j(value.getDTable()));
        result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
        result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
        result.getAreaChartOrArea3DChartOrLineChart().addAll(value.getAreaChartOrArea3DChartOrLineChart().stream().map(val -> {
          if (val.isAreaChart()) return PlotAreaConverter.toDocx4j(val.getAreaChart());
          if (val.isArea3DChart()) return PlotAreaConverter.toDocx4j(val.getArea3DChart());
          if (val.isLineChart()) return PlotAreaConverter.toDocx4j(val.getLineChart());
          if (val.isLine3DChart()) return PlotAreaConverter.toDocx4j(val.getLine3DChart());
          if (val.isStockChart()) return PlotAreaConverter.toDocx4j(val.getStockChart());
          if (val.isRadarChart()) return PlotAreaConverter.toDocx4j(val.getRadarChart());
          if (val.isScatterChart()) return PlotAreaConverter.toDocx4j(val.getScatterChart());
          if (val.isPieChart()) return PlotAreaConverter.toDocx4j(val.getPieChart());
          if (val.isPie3DChart()) return PlotAreaConverter.toDocx4j(val.getPie3DChart());
          if (val.isDoughnutChart()) return PlotAreaConverter.toDocx4j(val.getDoughnutChart());
          if (val.isBarChart()) return PlotAreaConverter.toDocx4j(val.getBarChart());
          if (val.isBar3DChart()) return PlotAreaConverter.toDocx4j(val.getBar3DChart());
          if (val.isOfPieChart()) return PlotAreaConverter.toDocx4j(val.getOfPieChart());
          if (val.isSurfaceChart()) return PlotAreaConverter.toDocx4j(val.getSurfaceChart());
          if (val.isSurface3DChart()) return PlotAreaConverter.toDocx4j(val.getSurface3DChart());
          if (val.isBubbleChart()) return PlotAreaConverter.toDocx4j(val.getBubbleChart());
          return null;
        } ).collect(Collectors.toList());
        result.getValAxOrCatAxOrDateAx().addAll(value.getValAxOrCatAxOrDateAx().stream().map(val -> {
          if (val.isValAx()) return PlotAreaConverter.toDocx4j(val.getValAx());
          if (val.isCatAx()) return PlotAreaConverter.toDocx4j(val.getCatAx());
          if (val.isDateAx()) return PlotAreaConverter.toDocx4j(val.getDateAx());
          if (val.isSerAx()) return PlotAreaConverter.toDocx4j(val.getSerAx());
          return null;
        } ).collect(Collectors.toList());
        return result;
      }
    }
