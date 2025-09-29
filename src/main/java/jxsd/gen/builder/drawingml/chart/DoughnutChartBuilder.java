package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.DoughnutChartModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.FirstSliceAngModel;
import jxsd.gen.model.drawingml.chart.HoleSizeModel;
import jxsd.gen.model.drawingml.chart.PieSerModel;

/**
 * This is a generated sequence class.
 */
public class DoughnutChartBuilder {
  private BooleanModel varyColors;

  private List<PieSerModel> ser;

  private DLblsModel dLbls;

  private FirstSliceAngModel firstSliceAng;

  private HoleSizeModel holeSize;

  private ExtensionListModel extLst;

  public DoughnutChartBuilder() {
  }

  public DoughnutChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public DoughnutChartBuilder setSer(List<PieSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public DoughnutChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public DoughnutChartBuilder setFirstSliceAng(FirstSliceAngModel firstSliceAng) {
    this.firstSliceAng = firstSliceAng;
    return this;
  }

  public DoughnutChartBuilder setHoleSize(HoleSizeModel holeSize) {
    this.holeSize = holeSize;
    return this;
  }

  public DoughnutChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public DoughnutChartBuilder from(DoughnutChartModel value) {
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.firstSliceAng = value.getFirstSliceAng();
    this.holeSize = value.getHoleSize();
    this.extLst = value.getExtLst();
    return this;
  }

  public DoughnutChartModel build() {
    return new DoughnutChartModel(this.varyColors, this.ser, this.dLbls, this.firstSliceAng, this.holeSize, this.extLst);
  }
}
