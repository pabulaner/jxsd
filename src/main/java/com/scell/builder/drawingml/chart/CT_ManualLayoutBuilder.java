package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DoubleModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LayoutModeModel;
import com.scell.model.drawingml.chart.CT_LayoutTargetModel;
import com.scell.model.drawingml.chart.CT_ManualLayoutModel;

public class CT_ManualLayoutBuilder {
  private CT_LayoutTargetModel layoutTarget;

  private CT_LayoutModeModel xMode;

  private CT_LayoutModeModel yMode;

  private CT_LayoutModeModel wMode;

  private CT_LayoutModeModel hMode;

  private CT_DoubleModel x;

  private CT_DoubleModel y;

  private CT_DoubleModel w;

  private CT_DoubleModel h;

  private CT_ExtensionListModel extLst;

  public CT_ManualLayoutBuilder() {
  }

  public CT_ManualLayoutBuilder setLayoutTarget(CT_LayoutTargetModel layoutTarget) {
    this.layoutTarget = layoutTarget;
    return this;
  }

  public CT_ManualLayoutBuilder setXMode(CT_LayoutModeModel xMode) {
    this.xMode = xMode;
    return this;
  }

  public CT_ManualLayoutBuilder setYMode(CT_LayoutModeModel yMode) {
    this.yMode = yMode;
    return this;
  }

  public CT_ManualLayoutBuilder setWMode(CT_LayoutModeModel wMode) {
    this.wMode = wMode;
    return this;
  }

  public CT_ManualLayoutBuilder setHMode(CT_LayoutModeModel hMode) {
    this.hMode = hMode;
    return this;
  }

  public CT_ManualLayoutBuilder setX(CT_DoubleModel x) {
    this.x = x;
    return this;
  }

  public CT_ManualLayoutBuilder setY(CT_DoubleModel y) {
    this.y = y;
    return this;
  }

  public CT_ManualLayoutBuilder setW(CT_DoubleModel w) {
    this.w = w;
    return this;
  }

  public CT_ManualLayoutBuilder setH(CT_DoubleModel h) {
    this.h = h;
    return this;
  }

  public CT_ManualLayoutBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_ManualLayoutModel build() {
    return new CT_ManualLayoutModel(this.layoutTarget, this.xMode, this.yMode, this.wMode, this.hMode, this.x, this.y, this.w, this.h, this.extLst);
  }

  public CT_ManualLayoutBuilder from(CT_ManualLayoutModel value) {
    this.layoutTarget = value.getLayoutTarget();
    this.xMode = value.getXMode();
    this.yMode = value.getYMode();
    this.wMode = value.getWMode();
    this.hMode = value.getHMode();
    this.x = value.getX();
    this.y = value.getY();
    this.w = value.getW();
    this.h = value.getH();
    this.extLst = value.getExtLst();
    return this;
  }
}
