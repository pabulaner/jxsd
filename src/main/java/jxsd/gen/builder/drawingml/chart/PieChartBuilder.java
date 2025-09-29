package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.FirstSliceAngModel;
import jxsd.gen.model.drawingml.chart.PieChartModel;
import jxsd.gen.model.drawingml.chart.PieSerModel;

/**
 * This is a generated sequence class.
 */
public class PieChartBuilder {
  private BooleanModel varyColors;

  private List<PieSerModel> ser;

  private DLblsModel dLbls;

  private FirstSliceAngModel firstSliceAng;

  private ExtensionListModel extLst;

  public PieChartBuilder() {
  }

  public PieChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public PieChartBuilder setSer(List<PieSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public PieChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public PieChartBuilder setFirstSliceAng(FirstSliceAngModel firstSliceAng) {
    this.firstSliceAng = firstSliceAng;
    return this;
  }

  public PieChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public PieChartBuilder from(PieChartModel value) {
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.firstSliceAng = value.getFirstSliceAng();
    this.extLst = value.getExtLst();
    return this;
  }

  public PieChartModel build() {
    return new PieChartModel(this.varyColors, this.ser, this.dLbls, this.firstSliceAng, this.extLst);
  }
}
