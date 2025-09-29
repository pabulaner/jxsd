package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.Bar3DChartBuilder;

/**
 * This is a generated sequence class.
 */
public class Bar3DChartModel {
  private final BarDirModel barDir;

  private final BarGroupingModel grouping;

  private final BooleanModel varyColors;

  private final List<BarSerModel> ser;

  private final DLblsModel dLbls;

  private final GapAmountModel gapWidth;

  private final GapAmountModel gapDepth;

  private final ShapeModel shape;

  private final List<UnsignedIntModel> axId;

  private final ExtensionListModel extLst;

  public Bar3DChartModel(BarDirModel barDir, BarGroupingModel grouping, BooleanModel varyColors,
      List<BarSerModel> ser, DLblsModel dLbls, GapAmountModel gapWidth, GapAmountModel gapDepth,
      ShapeModel shape, List<UnsignedIntModel> axId, ExtensionListModel extLst) {
    this.barDir = barDir;
    this.grouping = grouping;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.gapWidth = gapWidth;
    this.gapDepth = gapDepth;
    this.shape = shape;
    this.axId = axId;
    this.extLst = extLst;
  }

  public Bar3DChartBuilder builder() {
    return new Bar3DChartBuilder().from(this);
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

  public GapAmountModel getGapDepth() {
    return this.gapDepth;
  }

  public ShapeModel getShape() {
    return this.shape;
  }

  public List<UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
