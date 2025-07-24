package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BandFmtsModel;
import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.Surface3DChartModel;
import com.scell.model.drawingml.chart.SurfaceSerModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import java.util.List;

public class Surface3DChartBuilder {
  private BooleanModel wireframe;

  private List<SurfaceSerModel> ser;

  private BandFmtsModel bandFmts;

  private List<UnsignedIntModel> axId;

  private ExtensionListModel extLst;

  public Surface3DChartBuilder() {
  }

  public Surface3DChartBuilder setWireframe(BooleanModel wireframe) {
    this.wireframe = wireframe;
    return this;
  }

  public Surface3DChartBuilder setSer(List<SurfaceSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public Surface3DChartBuilder setBandFmts(BandFmtsModel bandFmts) {
    this.bandFmts = bandFmts;
    return this;
  }

  public Surface3DChartBuilder setAxId(List<UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public Surface3DChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public Surface3DChartModel build() {
    return new Surface3DChartModel(this.wireframe, this.ser, this.bandFmts, this.axId, this.extLst);
  }

  public Surface3DChartBuilder from(Surface3DChartModel value) {
    this.wireframe = value.getWireframe();
    this.ser = value.getSer();
    this.bandFmts = value.getBandFmts();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }
}
