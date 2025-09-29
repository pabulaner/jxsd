package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.DepthPercentModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.HPercentModel;
import jxsd.gen.model.drawingml.chart.PerspectiveModel;
import jxsd.gen.model.drawingml.chart.RotXModel;
import jxsd.gen.model.drawingml.chart.RotYModel;
import jxsd.gen.model.drawingml.chart.View3DModel;

/**
 * This is a generated sequence class.
 */
public class View3DBuilder {
  private RotXModel rotX;

  private HPercentModel hPercent;

  private RotYModel rotY;

  private DepthPercentModel depthPercent;

  private BooleanModel rAngAx;

  private PerspectiveModel perspective;

  private ExtensionListModel extLst;

  public View3DBuilder() {
  }

  public View3DBuilder setRotX(RotXModel rotX) {
    this.rotX = rotX;
    return this;
  }

  public View3DBuilder setHPercent(HPercentModel hPercent) {
    this.hPercent = hPercent;
    return this;
  }

  public View3DBuilder setRotY(RotYModel rotY) {
    this.rotY = rotY;
    return this;
  }

  public View3DBuilder setDepthPercent(DepthPercentModel depthPercent) {
    this.depthPercent = depthPercent;
    return this;
  }

  public View3DBuilder setRAngAx(BooleanModel rAngAx) {
    this.rAngAx = rAngAx;
    return this;
  }

  public View3DBuilder setPerspective(PerspectiveModel perspective) {
    this.perspective = perspective;
    return this;
  }

  public View3DBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public View3DBuilder from(View3DModel value) {
    this.rotX = value.getRotX();
    this.hPercent = value.getHPercent();
    this.rotY = value.getRotY();
    this.depthPercent = value.getDepthPercent();
    this.rAngAx = value.getRAngAx();
    this.perspective = value.getPerspective();
    this.extLst = value.getExtLst();
    return this;
  }

  public View3DModel build() {
    return new View3DModel(this.rotX, this.hPercent, this.rotY, this.depthPercent, this.rAngAx, this.perspective, this.extLst);
  }
}
