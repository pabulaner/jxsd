package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.Pie3DChartBuilder;

/**
 * This is a generated sequence class.
 */
public class Pie3DChartModel {
  private final BooleanModel varyColors;

  private final List<PieSerModel> ser;

  private final DLblsModel dLbls;

  private final ExtensionListModel extLst;

  public Pie3DChartModel(BooleanModel varyColors, List<PieSerModel> ser, DLblsModel dLbls,
      ExtensionListModel extLst) {
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.extLst = extLst;
  }

  public Pie3DChartBuilder builder() {
    return new Pie3DChartBuilder().from(this);
  }

  public BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<PieSerModel> getSer() {
    return this.ser;
  }

  public DLblsModel getDLbls() {
    return this.dLbls;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
