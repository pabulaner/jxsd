package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.Bar3DChartModel;
import jxsd.gen.model.drawingml.chart.BarDirModel;
import jxsd.gen.model.drawingml.chart.BarGroupingModel;
import jxsd.gen.model.drawingml.chart.BarSerModel;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.GapAmountModel;
import jxsd.gen.model.drawingml.chart.ShapeModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;

/**
 * This is a generated sequence class.
 */
public class Bar3DChartBuilder {
  private BarDirModel barDir;

  private BarGroupingModel grouping;

  private BooleanModel varyColors;

  private List<BarSerModel> ser;

  private DLblsModel dLbls;

  private GapAmountModel gapWidth;

  private GapAmountModel gapDepth;

  private ShapeModel shape;

  private List<UnsignedIntModel> axId;

  private ExtensionListModel extLst;

  public Bar3DChartBuilder() {
  }

  public Bar3DChartBuilder setBarDir(BarDirModel barDir) {
    this.barDir = barDir;
    return this;
  }

  public Bar3DChartBuilder setGrouping(BarGroupingModel grouping) {
    this.grouping = grouping;
    return this;
  }

  public Bar3DChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public Bar3DChartBuilder setSer(List<BarSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public Bar3DChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public Bar3DChartBuilder setGapWidth(GapAmountModel gapWidth) {
    this.gapWidth = gapWidth;
    return this;
  }

  public Bar3DChartBuilder setGapDepth(GapAmountModel gapDepth) {
    this.gapDepth = gapDepth;
    return this;
  }

  public Bar3DChartBuilder setShape(ShapeModel shape) {
    this.shape = shape;
    return this;
  }

  public Bar3DChartBuilder setAxId(List<UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public Bar3DChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public Bar3DChartBuilder from(Bar3DChartModel value) {
    this.barDir = value.getBarDir();
    this.grouping = value.getGrouping();
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.gapWidth = value.getGapWidth();
    this.gapDepth = value.getGapDepth();
    this.shape = value.getShape();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }

  public Bar3DChartModel build() {
    return new Bar3DChartModel(this.barDir, this.grouping, this.varyColors, this.ser, this.dLbls, this.gapWidth, this.gapDepth, this.shape, this.axId, this.extLst);
  }
}
