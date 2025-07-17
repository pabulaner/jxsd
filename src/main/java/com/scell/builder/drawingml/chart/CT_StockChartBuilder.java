package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ChartLinesModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LineSerModel;
import com.scell.model.drawingml.chart.CT_StockChartModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.chart.CT_UpDownBarsModel;
import java.util.List;

public class CT_StockChartBuilder {
  private List<CT_LineSerModel> ser;

  private CT_DLblsModel dLbls;

  private CT_ChartLinesModel dropLines;

  private CT_ChartLinesModel hiLowLines;

  private CT_UpDownBarsModel upDownBars;

  private List<CT_UnsignedIntModel> axId;

  private CT_ExtensionListModel extLst;

  public CT_StockChartBuilder() {
  }

  public CT_StockChartBuilder setSer(List<CT_LineSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_StockChartBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_StockChartBuilder setDropLines(CT_ChartLinesModel dropLines) {
    this.dropLines = dropLines;
    return this;
  }

  public CT_StockChartBuilder setHiLowLines(CT_ChartLinesModel hiLowLines) {
    this.hiLowLines = hiLowLines;
    return this;
  }

  public CT_StockChartBuilder setUpDownBars(CT_UpDownBarsModel upDownBars) {
    this.upDownBars = upDownBars;
    return this;
  }

  public CT_StockChartBuilder setAxId(List<CT_UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public CT_StockChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_StockChartModel build() {
    return new CT_StockChartModel(this.ser, this.dLbls, this.dropLines, this.hiLowLines, this.upDownBars, this.axId, this.extLst);
  }

  public CT_StockChartBuilder from(CT_StockChartModel value) {
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.dropLines = value.getDropLines();
    this.hiLowLines = value.getHiLowLines();
    this.upDownBars = value.getUpDownBars();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }
}
