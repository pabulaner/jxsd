package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.StockChartBuilder;

/**
 * This is a generated sequence class.
 */
public class StockChartModel {
  private final List<LineSerModel> ser;

  private final DLblsModel dLbls;

  private final ChartLinesModel dropLines;

  private final ChartLinesModel hiLowLines;

  private final UpDownBarsModel upDownBars;

  private final List<UnsignedIntModel> axId;

  private final ExtensionListModel extLst;

  public StockChartModel(List<LineSerModel> ser, DLblsModel dLbls, ChartLinesModel dropLines,
      ChartLinesModel hiLowLines, UpDownBarsModel upDownBars, List<UnsignedIntModel> axId,
      ExtensionListModel extLst) {
    this.ser = ser;
    this.dLbls = dLbls;
    this.dropLines = dropLines;
    this.hiLowLines = hiLowLines;
    this.upDownBars = upDownBars;
    this.axId = axId;
    this.extLst = extLst;
  }

  public StockChartBuilder builder() {
    return new StockChartBuilder().from(this);
  }

  public List<LineSerModel> getSer() {
    return this.ser;
  }

  public DLblsModel getDLbls() {
    return this.dLbls;
  }

  public ChartLinesModel getDropLines() {
    return this.dropLines;
  }

  public ChartLinesModel getHiLowLines() {
    return this.hiLowLines;
  }

  public UpDownBarsModel getUpDownBars() {
    return this.upDownBars;
  }

  public List<UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
