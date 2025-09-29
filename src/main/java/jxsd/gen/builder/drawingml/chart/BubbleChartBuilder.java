package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.BubbleChartModel;
import jxsd.gen.model.drawingml.chart.BubbleScaleModel;
import jxsd.gen.model.drawingml.chart.BubbleSerModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.SizeRepresentsModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;

/**
 * This is a generated sequence class.
 */
public class BubbleChartBuilder {
  private BooleanModel varyColors;

  private List<BubbleSerModel> ser;

  private DLblsModel dLbls;

  private BooleanModel bubble3D;

  private BubbleScaleModel bubbleScale;

  private BooleanModel showNegBubbles;

  private SizeRepresentsModel sizeRepresents;

  private List<UnsignedIntModel> axId;

  private ExtensionListModel extLst;

  public BubbleChartBuilder() {
  }

  public BubbleChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public BubbleChartBuilder setSer(List<BubbleSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public BubbleChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public BubbleChartBuilder setBubble3D(BooleanModel bubble3D) {
    this.bubble3D = bubble3D;
    return this;
  }

  public BubbleChartBuilder setBubbleScale(BubbleScaleModel bubbleScale) {
    this.bubbleScale = bubbleScale;
    return this;
  }

  public BubbleChartBuilder setShowNegBubbles(BooleanModel showNegBubbles) {
    this.showNegBubbles = showNegBubbles;
    return this;
  }

  public BubbleChartBuilder setSizeRepresents(SizeRepresentsModel sizeRepresents) {
    this.sizeRepresents = sizeRepresents;
    return this;
  }

  public BubbleChartBuilder setAxId(List<UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public BubbleChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public BubbleChartBuilder from(BubbleChartModel value) {
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.bubble3D = value.getBubble3D();
    this.bubbleScale = value.getBubbleScale();
    this.showNegBubbles = value.getShowNegBubbles();
    this.sizeRepresents = value.getSizeRepresents();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }

  public BubbleChartModel build() {
    return new BubbleChartModel(this.varyColors, this.ser, this.dLbls, this.bubble3D, this.bubbleScale, this.showNegBubbles, this.sizeRepresents, this.axId, this.extLst);
  }
}
