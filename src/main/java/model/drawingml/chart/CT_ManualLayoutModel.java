package model.drawingml.chart;

public class CT_ManualLayoutModel {
  private final CT_LayoutTargetModel layoutTarget;

  private final CT_LayoutModeModel xMode;

  private final CT_LayoutModeModel yMode;

  private final CT_LayoutModeModel wMode;

  private final CT_LayoutModeModel hMode;

  private final CT_DoubleModel x;

  private final CT_DoubleModel y;

  private final CT_DoubleModel w;

  private final CT_DoubleModel h;

  private final CT_ExtensionListModel extLst;

  public CT_ManualLayoutModel(CT_LayoutTargetModel layoutTarget, CT_LayoutModeModel xMode,
      CT_LayoutModeModel yMode, CT_LayoutModeModel wMode, CT_LayoutModeModel hMode,
      CT_DoubleModel x, CT_DoubleModel y, CT_DoubleModel w, CT_DoubleModel h,
      CT_ExtensionListModel extLst) {
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

  public CT_LayoutTargetModel getLayoutTarget() {
    return this.layoutTarget;
  }

  public CT_LayoutModeModel getXMode() {
    return this.xMode;
  }

  public CT_LayoutModeModel getYMode() {
    return this.yMode;
  }

  public CT_LayoutModeModel getWMode() {
    return this.wMode;
  }

  public CT_LayoutModeModel getHMode() {
    return this.hMode;
  }

  public CT_DoubleModel getX() {
    return this.x;
  }

  public CT_DoubleModel getY() {
    return this.y;
  }

  public CT_DoubleModel getW() {
    return this.w;
  }

  public CT_DoubleModel getH() {
    return this.h;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
