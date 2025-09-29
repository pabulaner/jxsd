package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.Area3DChartBuilder;

/**
 * This is a generated sequence class.
 */
public class Area3DChartModel {
  private final GroupingModel grouping;

  private final BooleanModel varyColors;

  private final List<AreaSerModel> ser;

  private final DLblsModel dLbls;

  private final ChartLinesModel dropLines;

  private final GapAmountModel gapDepth;

  private final List<UnsignedIntModel> axId;

  private final ExtensionListModel extLst;

  public Area3DChartModel(GroupingModel grouping, BooleanModel varyColors, List<AreaSerModel> ser,
      DLblsModel dLbls, ChartLinesModel dropLines, GapAmountModel gapDepth,
      List<UnsignedIntModel> axId, ExtensionListModel extLst) {
    this.grouping = grouping;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.dropLines = dropLines;
    this.gapDepth = gapDepth;
    this.axId = axId;
    this.extLst = extLst;
  }

  public Area3DChartBuilder builder() {
    return new Area3DChartBuilder().from(this);
  }

  public GroupingModel getGrouping() {
    return this.grouping;
  }

  public BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<AreaSerModel> getSer() {
    return this.ser;
  }

  public DLblsModel getDLbls() {
    return this.dLbls;
  }

  public ChartLinesModel getDropLines() {
    return this.dropLines;
  }

  public GapAmountModel getGapDepth() {
    return this.gapDepth;
  }

  public List<UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
