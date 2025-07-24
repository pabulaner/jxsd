package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BandFmtsModel;
import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.SurfaceChartModel;
import com.scell.model.drawingml.chart.SurfaceSerModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import java.util.List;

public class SurfaceChartBuilder {
  private BooleanModel wireframe;

  private List<SurfaceSerModel> ser;

  private BandFmtsModel bandFmts;

  private List<UnsignedIntModel> axId;

  private ExtensionListModel extLst;

  public SurfaceChartBuilder() {
  }

  public SurfaceChartBuilder setWireframe(BooleanModel wireframe) {
    this.wireframe = wireframe;
    return this;
  }

  public SurfaceChartBuilder setSer(List<SurfaceSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public SurfaceChartBuilder setBandFmts(BandFmtsModel bandFmts) {
    this.bandFmts = bandFmts;
    return this;
  }

  public SurfaceChartBuilder setAxId(List<UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public SurfaceChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public SurfaceChartModel build() {
    return new SurfaceChartModel(this.wireframe, this.ser, this.bandFmts, this.axId, this.extLst);
  }

  public SurfaceChartBuilder from(SurfaceChartModel value) {
    this.wireframe = value.getWireframe();
    this.ser = value.getSer();
    this.bandFmts = value.getBandFmts();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }
}
