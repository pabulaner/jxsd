package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.StockChartModel;
import org.docx4j.dml.chart.CTStockChart;

/**
 * This is a generated sequence class.
 */
public class StockChartConverter {
  private StockChartConverter() {
  }

  public static StockChartModel fromDocx4j(CTStockChart value) {
    if (value == null) return null;
    return new StockChartModel(value.getSer().stream().map(LineSerConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), ChartLinesConverter.fromDocx4j(value.getDropLines()), ChartLinesConverter.fromDocx4j(value.getHiLowLines()), UpDownBarsConverter.fromDocx4j(value.getUpDownBars()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTStockChart toDocx4j(StockChartModel value) {
    if (value == null) return null;
    CTStockChart result = new CTStockChart();
    result.getSer().addAll(value.getSer().stream().map(LineSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.setDropLines(ChartLinesConverter.toDocx4j(value.getDropLines()));
    result.setHiLowLines(ChartLinesConverter.toDocx4j(value.getHiLowLines()));
    result.setUpDownBars(UpDownBarsConverter.toDocx4j(value.getUpDownBars()));
    result.getAxId().addAll(value.getAxId().stream().map(UnsignedIntConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
