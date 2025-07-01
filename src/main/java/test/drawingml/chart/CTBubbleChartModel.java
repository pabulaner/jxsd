package test.drawingml.chart;

public class CTBubbleChartModel {
  private final CTBooleanModel varyColors;

  private final CTBubbleSerModel ser;

  private final CTDLblsModel dLbls;

  private final CTBooleanModel bubble3D;

  private final CTBubbleScaleModel bubbleScale;

  private final CTBooleanModel showNegBubbles;

  private final CTSizeRepresentsModel sizeRepresents;

  private final CTUnsignedIntModel axId;

  private final CTExtensionListModel extLst;

  public CTBubbleChartModel(CTBooleanModel varyColors, CTBubbleSerModel ser, CTDLblsModel dLbls,
      CTBooleanModel bubble3D, CTBubbleScaleModel bubbleScale, CTBooleanModel showNegBubbles,
      CTSizeRepresentsModel sizeRepresents, CTUnsignedIntModel axId, CTExtensionListModel extLst) {
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

  public CTBooleanModel getVaryColors() {
    return this.varyColors;
  }

  public CTBubbleSerModel getSer() {
    return this.ser;
  }

  public CTDLblsModel getDLbls() {
    return this.dLbls;
  }

  public CTBooleanModel getBubble3D() {
    return this.bubble3D;
  }

  public CTBubbleScaleModel getBubbleScale() {
    return this.bubbleScale;
  }

  public CTBooleanModel getShowNegBubbles() {
    return this.showNegBubbles;
  }

  public CTSizeRepresentsModel getSizeRepresents() {
    return this.sizeRepresents;
  }

  public CTUnsignedIntModel getAxId() {
    return this.axId;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
