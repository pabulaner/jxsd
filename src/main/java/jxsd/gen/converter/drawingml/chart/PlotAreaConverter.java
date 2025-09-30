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
      if (val instanceof CTAreaChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newAreaChart(AreaChartConverter.fromDocx4j((CTAreaChart) val));
      if (val instanceof CTArea3DChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newArea3DChart(Area3DChartConverter.fromDocx4j((CTArea3DChart) val));
      if (val instanceof CTLineChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newLineChart(LineChartConverter.fromDocx4j((CTLineChart) val));
      if (val instanceof CTLine3DChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newLine3DChart(Line3DChartConverter.fromDocx4j((CTLine3DChart) val));
      if (val instanceof CTStockChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newStockChart(StockChartConverter.fromDocx4j((CTStockChart) val));
      if (val instanceof CTRadarChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newRadarChart(RadarChartConverter.fromDocx4j((CTRadarChart) val));
      if (val instanceof CTScatterChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newScatterChart(ScatterChartConverter.fromDocx4j((CTScatterChart) val));
      if (val instanceof CTPieChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newPieChart(PieChartConverter.fromDocx4j((CTPieChart) val));
      if (val instanceof CTPie3DChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newPie3DChart(Pie3DChartConverter.fromDocx4j((CTPie3DChart) val));
      if (val instanceof CTDoughnutChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newDoughnutChart(DoughnutChartConverter.fromDocx4j((CTDoughnutChart) val));
      if (val instanceof CTBarChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newBarChart(BarChartConverter.fromDocx4j((CTBarChart) val));
      if (val instanceof CTBar3DChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newBar3DChart(Bar3DChartConverter.fromDocx4j((CTBar3DChart) val));
      if (val instanceof CTOfPieChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newOfPieChart(OfPieChartConverter.fromDocx4j((CTOfPieChart) val));
      if (val instanceof CTSurfaceChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newSurfaceChart(SurfaceChartConverter.fromDocx4j((CTSurfaceChart) val));
      if (val instanceof CTSurface3DChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newSurface3DChart(Surface3DChartConverter.fromDocx4j((CTSurface3DChart) val));
      if (val instanceof CTBubbleChart) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newBubbleChart(BubbleChartConverter.fromDocx4j((CTBubbleChart) val));
      return null;
    } ).collect(Collectors.toList());
    List<PlotAreaModel.ValAxOrCatAxOrDateAx> valAxOrCatAxOrDateAx = value.getValAxOrCatAxOrDateAx().stream().map(val -> {
      if (val instanceof CTValAx) return PlotAreaModel.ValAxOrCatAxOrDateAx.newValAx(ValAxConverter.fromDocx4j((CTValAx) val));
      if (val instanceof CTCatAx) return PlotAreaModel.ValAxOrCatAxOrDateAx.newCatAx(CatAxConverter.fromDocx4j((CTCatAx) val));
      if (val instanceof CTDateAx) return PlotAreaModel.ValAxOrCatAxOrDateAx.newDateAx(DateAxConverter.fromDocx4j((CTDateAx) val));
      if (val instanceof CTSerAx) return PlotAreaModel.ValAxOrCatAxOrDateAx.newSerAx(SerAxConverter.fromDocx4j((CTSerAx) val));
      return null;
    } ).collect(Collectors.toList());
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
      if (val.isAreaChart()) return AreaChartConverter.toDocx4j(val.getAreaChart());
      if (val.isArea3DChart()) return Area3DChartConverter.toDocx4j(val.getArea3DChart());
      if (val.isLineChart()) return LineChartConverter.toDocx4j(val.getLineChart());
      if (val.isLine3DChart()) return Line3DChartConverter.toDocx4j(val.getLine3DChart());
      if (val.isStockChart()) return StockChartConverter.toDocx4j(val.getStockChart());
      if (val.isRadarChart()) return RadarChartConverter.toDocx4j(val.getRadarChart());
      if (val.isScatterChart()) return ScatterChartConverter.toDocx4j(val.getScatterChart());
      if (val.isPieChart()) return PieChartConverter.toDocx4j(val.getPieChart());
      if (val.isPie3DChart()) return Pie3DChartConverter.toDocx4j(val.getPie3DChart());
      if (val.isDoughnutChart()) return DoughnutChartConverter.toDocx4j(val.getDoughnutChart());
      if (val.isBarChart()) return BarChartConverter.toDocx4j(val.getBarChart());
      if (val.isBar3DChart()) return Bar3DChartConverter.toDocx4j(val.getBar3DChart());
      if (val.isOfPieChart()) return OfPieChartConverter.toDocx4j(val.getOfPieChart());
      if (val.isSurfaceChart()) return SurfaceChartConverter.toDocx4j(val.getSurfaceChart());
      if (val.isSurface3DChart()) return Surface3DChartConverter.toDocx4j(val.getSurface3DChart());
      if (val.isBubbleChart()) return BubbleChartConverter.toDocx4j(val.getBubbleChart());
      return null;
    } ).collect(Collectors.toList()));
    result.getValAxOrCatAxOrDateAx().addAll(value.getValAxOrCatAxOrDateAx().stream().map(val -> {
      if (val.isValAx()) return ValAxConverter.toDocx4j(val.getValAx());
      if (val.isCatAx()) return CatAxConverter.toDocx4j(val.getCatAx());
      if (val.isDateAx()) return DateAxConverter.toDocx4j(val.getDateAx());
      if (val.isSerAx()) return SerAxConverter.toDocx4j(val.getSerAx());
      return null;
    } ).collect(Collectors.toList()));
    return result;
  }
}
