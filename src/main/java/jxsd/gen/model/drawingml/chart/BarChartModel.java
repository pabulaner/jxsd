package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.BarChartBuilder;

/**
 * This is a generated sequence class.
 */
public class BarChartModel {
  private final BarDirModel barDir;

  private final BarGroupingModel grouping;

  private final BooleanModel varyColors;

  private final List<BarSerModel> ser;

  private final DLblsModel dLbls;

  private final GapAmountModel gapWidth;

  private final OverlapModel overlap;

  private final List<ChartLinesModel> serLines;

  private final List<UnsignedIntModel> axId;

  private final ExtensionListModel extLst;

  public BarChartModel(BarDirModel barDir, BarGroupingModel grouping, BooleanModel varyColors,
      List<BarSerModel> ser, DLblsModel dLbls, GapAmountModel gapWidth, OverlapModel overlap,
      List<ChartLinesModel> serLines, List<UnsignedIntModel> axId, ExtensionListModel extLst) {
    this.barDir = barDir;
    this.grouping = grouping;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.gapWidth = gapWidth;
    this.overlap = overlap;
    this.serLines = serLines;
    this.axId = axId;
    this.extLst = extLst;
  }

  public BarChartBuilder builder() {
    return new BarChartBuilder().from(this);
  }

  public BarDirModel getBarDir() {
    return this.barDir;
  }

  public BarGroupingModel getGrouping() {
    return this.grouping;
  }

  public BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<BarSerModel> getSer() {
    return this.ser;
  }

  public DLblsModel getDLbls() {
    return this.dLbls;
  }

  public GapAmountModel getGapWidth() {
    return this.gapWidth;
  }

  public OverlapModel getOverlap() {
    return this.overlap;
  }

  public List<ChartLinesModel> getSerLines() {
    return this.serLines;
  }

  public List<UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
