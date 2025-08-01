package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.AreaChartModel;
import com.scell.model.drawingml.chart.AreaSerModel;
import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ChartLinesModel;
import com.scell.model.drawingml.chart.DLblsModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.GroupingModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import java.util.List;

public class AreaChartBuilder implements IAreaChartValueBuilder {
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

  public AreaChartModel build() {
    return new AreaChartModel(this.grouping, this.varyColors, this.ser, this.dLbls, this.dropLines, this.axId, this.extLst);
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
}
