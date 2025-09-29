package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.LineChartBuilder;

/**
 * This is a generated sequence class.
 */
public class LineChartModel {
  private final GroupingModel grouping;

  private final BooleanModel varyColors;

  private final List<LineSerModel> ser;

  private final DLblsModel dLbls;

  private final ChartLinesModel dropLines;

  private final ChartLinesModel hiLowLines;

  private final UpDownBarsModel upDownBars;

  private final BooleanModel marker;

  private final BooleanModel smooth;

  private final List<UnsignedIntModel> axId;

  private final ExtensionListModel extLst;

  public LineChartModel(GroupingModel grouping, BooleanModel varyColors, List<LineSerModel> ser,
      DLblsModel dLbls, ChartLinesModel dropLines, ChartLinesModel hiLowLines,
      UpDownBarsModel upDownBars, BooleanModel marker, BooleanModel smooth,
      List<UnsignedIntModel> axId, ExtensionListModel extLst) {
    this.grouping = grouping;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.dropLines = dropLines;
    this.hiLowLines = hiLowLines;
    this.upDownBars = upDownBars;
    this.marker = marker;
    this.smooth = smooth;
    this.axId = axId;
    this.extLst = extLst;
  }

  public LineChartBuilder builder() {
    return new LineChartBuilder().from(this);
  }

  public GroupingModel getGrouping() {
    return this.grouping;
  }

  public BooleanModel getVaryColors() {
    return this.varyColors;
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

  public BooleanModel getMarker() {
    return this.marker;
  }

  public BooleanModel getSmooth() {
    return this.smooth;
  }

  public List<UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
