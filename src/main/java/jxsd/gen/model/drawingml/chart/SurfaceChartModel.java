package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.SurfaceChartBuilder;

/**
 * This is a generated sequence class.
 */
public class SurfaceChartModel {
  private final BooleanModel wireframe;

  private final List<SurfaceSerModel> ser;

  private final BandFmtsModel bandFmts;

  private final List<UnsignedIntModel> axId;

  private final ExtensionListModel extLst;

  public SurfaceChartModel(BooleanModel wireframe, List<SurfaceSerModel> ser,
      BandFmtsModel bandFmts, List<UnsignedIntModel> axId, ExtensionListModel extLst) {
    this.wireframe = wireframe;
    this.ser = ser;
    this.bandFmts = bandFmts;
    this.axId = axId;
    this.extLst = extLst;
  }

  public SurfaceChartBuilder builder() {
    return new SurfaceChartBuilder().from(this);
  }

  public BooleanModel getWireframe() {
    return this.wireframe;
  }

  public List<SurfaceSerModel> getSer() {
    return this.ser;
  }

  public BandFmtsModel getBandFmts() {
    return this.bandFmts;
  }

  public List<UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
