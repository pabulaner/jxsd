package com.scell.model.drawingml.chart;

public class ManualLayoutModel {
  private final LayoutTargetModel layoutTarget;

  private final LayoutModeModel xMode;

  private final LayoutModeModel yMode;

  private final LayoutModeModel wMode;

  private final LayoutModeModel hMode;

  private final DoubleModel x;

  private final DoubleModel y;

  private final DoubleModel w;

  private final DoubleModel h;

  private final ExtensionListModel extLst;

  public ManualLayoutModel(LayoutTargetModel layoutTarget, LayoutModeModel xMode,
      LayoutModeModel yMode, LayoutModeModel wMode, LayoutModeModel hMode, DoubleModel x,
      DoubleModel y, DoubleModel w, DoubleModel h, ExtensionListModel extLst) {
    this.layoutTarget = layoutTarget;
    this.xMode = xMode;
    this.yMode = yMode;
    this.wMode = wMode;
    this.hMode = hMode;
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    this.extLst = extLst;
  }

  public LayoutTargetModel getLayoutTarget() {
    return this.layoutTarget;
  }

  public LayoutModeModel getXMode() {
    return this.xMode;
  }

  public LayoutModeModel getYMode() {
    return this.yMode;
  }

  public LayoutModeModel getWMode() {
    return this.wMode;
  }

  public LayoutModeModel getHMode() {
    return this.hMode;
  }

  public DoubleModel getX() {
    return this.x;
  }

  public DoubleModel getY() {
    return this.y;
  }

  public DoubleModel getW() {
    return this.w;
  }

  public DoubleModel getH() {
    return this.h;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
