package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.ChartLinesModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LineSerModel;
import jxsd.gen.model.drawingml.chart.StockChartModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.chart.UpDownBarsModel;

/**
 * This is a generated sequence class.
 */
public class StockChartBuilder {
  private List<LineSerModel> ser;

  private DLblsModel dLbls;

  private ChartLinesModel dropLines;

  private ChartLinesModel hiLowLines;

  private UpDownBarsModel upDownBars;

  private List<UnsignedIntModel> axId;

  private ExtensionListModel extLst;

  public StockChartBuilder() {
  }

  public StockChartBuilder setSer(List<LineSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public StockChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public StockChartBuilder setDropLines(ChartLinesModel dropLines) {
    this.dropLines = dropLines;
    return this;
  }

  public StockChartBuilder setHiLowLines(ChartLinesModel hiLowLines) {
    this.hiLowLines = hiLowLines;
    return this;
  }

  public StockChartBuilder setUpDownBars(UpDownBarsModel upDownBars) {
    this.upDownBars = upDownBars;
    return this;
  }

  public StockChartBuilder setAxId(List<UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public StockChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public StockChartBuilder from(StockChartModel value) {
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.dropLines = value.getDropLines();
    this.hiLowLines = value.getHiLowLines();
    this.upDownBars = value.getUpDownBars();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }

  public StockChartModel build() {
    return new StockChartModel(this.ser, this.dLbls, this.dropLines, this.hiLowLines, this.upDownBars, this.axId, this.extLst);
  }
}
