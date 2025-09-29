package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.RadarChartBuilder;

/**
 * This is a generated sequence class.
 */
public class RadarChartModel {
  private final RadarStyleModel radarStyle;

  private final BooleanModel varyColors;

  private final List<RadarSerModel> ser;

  private final DLblsModel dLbls;

  private final List<UnsignedIntModel> axId;

  private final ExtensionListModel extLst;

  public RadarChartModel(RadarStyleModel radarStyle, BooleanModel varyColors,
      List<RadarSerModel> ser, DLblsModel dLbls, List<UnsignedIntModel> axId,
      ExtensionListModel extLst) {
    this.radarStyle = radarStyle;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.axId = axId;
    this.extLst = extLst;
  }

  public RadarChartBuilder builder() {
    return new RadarChartBuilder().from(this);
  }

  public RadarStyleModel getRadarStyle() {
    return this.radarStyle;
  }

  public BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<RadarSerModel> getSer() {
    return this.ser;
  }

  public DLblsModel getDLbls() {
    return this.dLbls;
  }

  public List<UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
