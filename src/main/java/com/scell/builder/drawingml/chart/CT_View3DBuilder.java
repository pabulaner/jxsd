package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DepthPercentModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_HPercentModel;
import com.scell.model.drawingml.chart.CT_PerspectiveModel;
import com.scell.model.drawingml.chart.CT_RotXModel;
import com.scell.model.drawingml.chart.CT_RotYModel;
import com.scell.model.drawingml.chart.CT_View3DModel;

public class CT_View3DBuilder {
  private CT_RotXModel rotX;

  private CT_HPercentModel hPercent;

  private CT_RotYModel rotY;

  private CT_DepthPercentModel depthPercent;

  private CT_BooleanModel rAngAx;

  private CT_PerspectiveModel perspective;

  private CT_ExtensionListModel extLst;

  public CT_View3DBuilder() {
  }

  public CT_View3DBuilder setRotX(CT_RotXModel rotX) {
    this.rotX = rotX;
    return this;
  }

  public CT_View3DBuilder setHPercent(CT_HPercentModel hPercent) {
    this.hPercent = hPercent;
    return this;
  }

  public CT_View3DBuilder setRotY(CT_RotYModel rotY) {
    this.rotY = rotY;
    return this;
  }

  public CT_View3DBuilder setDepthPercent(CT_DepthPercentModel depthPercent) {
    this.depthPercent = depthPercent;
    return this;
  }

  public CT_View3DBuilder setRAngAx(CT_BooleanModel rAngAx) {
    this.rAngAx = rAngAx;
    return this;
  }

  public CT_View3DBuilder setPerspective(CT_PerspectiveModel perspective) {
    this.perspective = perspective;
    return this;
  }

  public CT_View3DBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_View3DModel build() {
    return new CT_View3DModel(this.rotX, this.hPercent, this.rotY, this.depthPercent, this.rAngAx, this.perspective, this.extLst);
  }

  public CT_View3DBuilder from(CT_View3DModel value) {
    this.rotX = value.getRotX();
    this.hPercent = value.getHPercent();
    this.rotY = value.getRotY();
    this.depthPercent = value.getDepthPercent();
    this.rAngAx = value.getRAngAx();
    this.perspective = value.getPerspective();
    this.extLst = value.getExtLst();
    return this;
  }
}
