package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BandFmtsModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_SurfaceChartModel;
import com.scell.model.drawingml.chart.CT_SurfaceSerModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import java.util.List;

public class CT_SurfaceChartBuilder {
  private CT_BooleanModel wireframe;

  private List<CT_SurfaceSerModel> ser;

  private CT_BandFmtsModel bandFmts;

  private List<CT_UnsignedIntModel> axId;

  private CT_ExtensionListModel extLst;

  public CT_SurfaceChartBuilder() {
  }

  public CT_SurfaceChartBuilder setWireframe(CT_BooleanModel wireframe) {
    this.wireframe = wireframe;
    return this;
  }

  public CT_SurfaceChartBuilder setSer(List<CT_SurfaceSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_SurfaceChartBuilder setBandFmts(CT_BandFmtsModel bandFmts) {
    this.bandFmts = bandFmts;
    return this;
  }

  public CT_SurfaceChartBuilder setAxId(List<CT_UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public CT_SurfaceChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_SurfaceChartModel build() {
    return new CT_SurfaceChartModel(this.wireframe, this.ser, this.bandFmts, this.axId, this.extLst);
  }

  public CT_SurfaceChartBuilder from(CT_SurfaceChartModel value) {
    this.wireframe = value.getWireframe();
    this.ser = value.getSer();
    this.bandFmts = value.getBandFmts();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }
}
