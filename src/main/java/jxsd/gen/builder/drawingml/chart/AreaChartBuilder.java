package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.AreaChartModel;
import jxsd.gen.model.drawingml.chart.AreaSerModel;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.ChartLinesModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.GroupingModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;

/**
 * This is a generated sequence class.
 */
public class AreaChartBuilder {
  private GroupingModel grouping;

  private BooleanModel varyColors;

  private List<AreaSerModel> ser;

  private DLblsModel dLbls;

  private ChartLinesModel dropLines;

  private List<UnsignedIntModel> axId;

  private ExtensionListModel extLst;

  public AreaChartBuilder() {
  }

  public AreaChartBuilder setGrouping(GroupingModel grouping) {
    this.grouping = grouping;
    return this;
  }

  public AreaChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public AreaChartBuilder setSer(List<AreaSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public AreaChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public AreaChartBuilder setDropLines(ChartLinesModel dropLines) {
    this.dropLines = dropLines;
    return this;
  }

  public AreaChartBuilder setAxId(List<UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public AreaChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public AreaChartBuilder from(AreaChartModel value) {
    this.grouping = value.getGrouping();
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.dropLines = value.getDropLines();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }

  public AreaChartModel build() {
    return new AreaChartModel(this.grouping, this.varyColors, this.ser, this.dLbls, this.dropLines, this.axId, this.extLst);
  }
}
