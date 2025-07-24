package com.scell.model.drawingml.chart;

import java.util.List;

public class BubbleChartModel {
  private final BooleanModel varyColors;

  private final List<BubbleSerModel> ser;

  private final DLblsModel dLbls;

  private final BooleanModel bubble3D;

  private final BubbleScaleModel bubbleScale;

  private final BooleanModel showNegBubbles;

  private final SizeRepresentsModel sizeRepresents;

  private final List<UnsignedIntModel> axId;

  private final ExtensionListModel extLst;

  public BubbleChartModel(BooleanModel varyColors, List<BubbleSerModel> ser, DLblsModel dLbls,
      BooleanModel bubble3D, BubbleScaleModel bubbleScale, BooleanModel showNegBubbles,
      SizeRepresentsModel sizeRepresents, List<UnsignedIntModel> axId, ExtensionListModel extLst) {
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.bubble3D = bubble3D;
    this.bubbleScale = bubbleScale;
    this.showNegBubbles = showNegBubbles;
    this.sizeRepresents = sizeRepresents;
    this.axId = axId;
    this.extLst = extLst;
  }

  public BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<BubbleSerModel> getSer() {
    return this.ser;
  }

  public DLblsModel getDLbls() {
    return this.dLbls;
  }

  public BooleanModel getBubble3D() {
    return this.bubble3D;
  }

  public BubbleScaleModel getBubbleScale() {
    return this.bubbleScale;
  }

  public BooleanModel getShowNegBubbles() {
    return this.showNegBubbles;
  }

  public SizeRepresentsModel getSizeRepresents() {
    return this.sizeRepresents;
  }

  public List<UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
