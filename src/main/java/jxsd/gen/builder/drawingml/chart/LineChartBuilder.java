package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.ChartLinesModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.GroupingModel;
import jxsd.gen.model.drawingml.chart.LineChartModel;
import jxsd.gen.model.drawingml.chart.LineSerModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.chart.UpDownBarsModel;

/**
 * This is a generated sequence class.
 */
public class LineChartBuilder {
  private GroupingModel grouping;

  private BooleanModel varyColors;

  private List<LineSerModel> ser;

  private DLblsModel dLbls;

  private ChartLinesModel dropLines;

  private ChartLinesModel hiLowLines;

  private UpDownBarsModel upDownBars;

  private BooleanModel marker;

  private BooleanModel smooth;

  private List<UnsignedIntModel> axId;

  private ExtensionListModel extLst;

  public LineChartBuilder() {
  }

  public LineChartBuilder setGrouping(GroupingModel grouping) {
    this.grouping = grouping;
    return this;
  }

  public LineChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public LineChartBuilder setSer(List<LineSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public LineChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public LineChartBuilder setDropLines(ChartLinesModel dropLines) {
    this.dropLines = dropLines;
    return this;
  }

  public LineChartBuilder setHiLowLines(ChartLinesModel hiLowLines) {
    this.hiLowLines = hiLowLines;
    return this;
  }

  public LineChartBuilder setUpDownBars(UpDownBarsModel upDownBars) {
    this.upDownBars = upDownBars;
    return this;
  }

  public LineChartBuilder setMarker(BooleanModel marker) {
    this.marker = marker;
    return this;
  }

  public LineChartBuilder setSmooth(BooleanModel smooth) {
    this.smooth = smooth;
    return this;
  }

  public LineChartBuilder setAxId(List<UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public LineChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public LineChartBuilder from(LineChartModel value) {
    this.grouping = value.getGrouping();
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.dropLines = value.getDropLines();
    this.hiLowLines = value.getHiLowLines();
    this.upDownBars = value.getUpDownBars();
    this.marker = value.getMarker();
    this.smooth = value.getSmooth();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }

  public LineChartModel build() {
    return new LineChartModel(this.grouping, this.varyColors, this.ser, this.dLbls, this.dropLines, this.hiLowLines, this.upDownBars, this.marker, this.smooth, this.axId, this.extLst);
  }
}
