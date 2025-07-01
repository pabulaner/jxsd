package test.drawingml.chart;

public class CTView3DModel {
  private final CTRotXModel rotX;

  private final CTHPercentModel hPercent;

  private final CTRotYModel rotY;

  private final CTDepthPercentModel depthPercent;

  private final CTBooleanModel rAngAx;

  private final CTPerspectiveModel perspective;

  private final CTExtensionListModel extLst;

  public CTView3DModel(CTRotXModel rotX, CTHPercentModel hPercent, CTRotYModel rotY,
      CTDepthPercentModel depthPercent, CTBooleanModel rAngAx, CTPerspectiveModel perspective,
      CTExtensionListModel extLst) {
    this.rotX = rotX;
    this.hPercent = hPercent;
    this.rotY = rotY;
    this.depthPercent = depthPercent;
    this.rAngAx = rAngAx;
    this.perspective = perspective;
    this.extLst = extLst;
  }

  public CTRotXModel getRotX() {
    return this.rotX;
  }

  public CTHPercentModel getHPercent() {
    return this.hPercent;
  }

  public CTRotYModel getRotY() {
    return this.rotY;
  }

  public CTDepthPercentModel getDepthPercent() {
    return this.depthPercent;
  }

  public CTBooleanModel getRAngAx() {
    return this.rAngAx;
  }

  public CTPerspectiveModel getPerspective() {
    return this.perspective;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
