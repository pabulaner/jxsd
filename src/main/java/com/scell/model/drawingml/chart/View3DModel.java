package com.scell.model.drawingml.chart;

public class View3DModel {
  private final RotXModel rotX;

  private final HPercentModel hPercent;

  private final RotYModel rotY;

  private final DepthPercentModel depthPercent;

  private final BooleanModel rAngAx;

  private final PerspectiveModel perspective;

  private final ExtensionListModel extLst;

  public View3DModel(RotXModel rotX, HPercentModel hPercent, RotYModel rotY,
      DepthPercentModel depthPercent, BooleanModel rAngAx, PerspectiveModel perspective,
      ExtensionListModel extLst) {
    this.rotX = rotX;
    this.hPercent = hPercent;
    this.rotY = rotY;
    this.depthPercent = depthPercent;
    this.rAngAx = rAngAx;
    this.perspective = perspective;
    this.extLst = extLst;
  }

  public RotXModel getRotX() {
    return this.rotX;
  }

  public HPercentModel getHPercent() {
    return this.hPercent;
  }

  public RotYModel getRotY() {
    return this.rotY;
  }

  public DepthPercentModel getDepthPercent() {
    return this.depthPercent;
  }

  public BooleanModel getRAngAx() {
    return this.rAngAx;
  }

  public PerspectiveModel getPerspective() {
    return this.perspective;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
