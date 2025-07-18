package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AreaChartModel;
import com.scell.model.drawingml.chart.CT_AreaSerModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ChartLinesModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_GroupingModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import java.util.List;

public class CT_AreaChartBuilder {
  private CT_GroupingModel grouping;

  private CT_BooleanModel varyColors;

  private List<CT_AreaSerModel> ser;

  private CT_DLblsModel dLbls;

  private CT_ChartLinesModel dropLines;

  private List<CT_UnsignedIntModel> axId;

  private CT_ExtensionListModel extLst;

  public CT_AreaChartBuilder() {
  }

  public CT_AreaChartBuilder setGrouping(CT_GroupingModel grouping) {
    this.grouping = grouping;
    return this;
  }

  public CT_AreaChartBuilder setVaryColors(CT_BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public CT_AreaChartBuilder setSer(List<CT_AreaSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_AreaChartBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_AreaChartBuilder setDropLines(CT_ChartLinesModel dropLines) {
    this.dropLines = dropLines;
    return this;
  }

  public CT_AreaChartBuilder setAxId(List<CT_UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public CT_AreaChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_AreaChartModel build() {
    return new CT_AreaChartModel(this.grouping, this.varyColors, this.ser, this.dLbls, this.dropLines, this.axId, this.extLst);
  }

  public CT_AreaChartBuilder from(CT_AreaChartModel value) {
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
