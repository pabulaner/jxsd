package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.DoubleModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LayoutModeModel;
import jxsd.gen.model.drawingml.chart.LayoutTargetModel;
import jxsd.gen.model.drawingml.chart.ManualLayoutModel;

/**
 * This is a generated sequence class.
 */
public class ManualLayoutBuilder {
  private LayoutTargetModel layoutTarget;

  private LayoutModeModel xMode;

  private LayoutModeModel yMode;

  private LayoutModeModel wMode;

  private LayoutModeModel hMode;

  private DoubleModel x;

  private DoubleModel y;

  private DoubleModel w;

  private DoubleModel h;

  private ExtensionListModel extLst;

  public ManualLayoutBuilder() {
  }

  public ManualLayoutBuilder setLayoutTarget(LayoutTargetModel layoutTarget) {
    this.layoutTarget = layoutTarget;
    return this;
  }

  public ManualLayoutBuilder setXMode(LayoutModeModel xMode) {
    this.xMode = xMode;
    return this;
  }

  public ManualLayoutBuilder setYMode(LayoutModeModel yMode) {
    this.yMode = yMode;
    return this;
  }

  public ManualLayoutBuilder setWMode(LayoutModeModel wMode) {
    this.wMode = wMode;
    return this;
  }

  public ManualLayoutBuilder setHMode(LayoutModeModel hMode) {
    this.hMode = hMode;
    return this;
  }

  public ManualLayoutBuilder setX(DoubleModel x) {
    this.x = x;
    return this;
  }

  public ManualLayoutBuilder setY(DoubleModel y) {
    this.y = y;
    return this;
  }

  public ManualLayoutBuilder setW(DoubleModel w) {
    this.w = w;
    return this;
  }

  public ManualLayoutBuilder setH(DoubleModel h) {
    this.h = h;
    return this;
  }

  public ManualLayoutBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ManualLayoutBuilder from(ManualLayoutModel value) {
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

  public ManualLayoutModel build() {
    return new ManualLayoutModel(this.layoutTarget, this.xMode, this.yMode, this.wMode, this.hMode, this.x, this.y, this.w, this.h, this.extLst);
  }
}
