package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.RadarChartModel;
import jxsd.gen.model.drawingml.chart.RadarSerModel;
import jxsd.gen.model.drawingml.chart.RadarStyleModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;

/**
 * This is a generated sequence class.
 */
public class RadarChartBuilder {
  private RadarStyleModel radarStyle;

  private BooleanModel varyColors;

  private List<RadarSerModel> ser;

  private DLblsModel dLbls;

  private List<UnsignedIntModel> axId;

  private ExtensionListModel extLst;

  public RadarChartBuilder() {
  }

  public RadarChartBuilder setRadarStyle(RadarStyleModel radarStyle) {
    this.radarStyle = radarStyle;
    return this;
  }

  public RadarChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public RadarChartBuilder setSer(List<RadarSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public RadarChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public RadarChartBuilder setAxId(List<UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public RadarChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public RadarChartBuilder from(RadarChartModel value) {
    this.radarStyle = value.getRadarStyle();
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }

  public RadarChartModel build() {
    return new RadarChartModel(this.radarStyle, this.varyColors, this.ser, this.dLbls, this.axId, this.extLst);
  }
}
