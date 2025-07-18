package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ChartLinesModel;
import com.scell.model.drawingml.chart.CT_CustSplitModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_DoubleModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_GapAmountModel;
import com.scell.model.drawingml.chart.CT_OfPieChartModel;
import com.scell.model.drawingml.chart.CT_OfPieTypeModel;
import com.scell.model.drawingml.chart.CT_PieSerModel;
import com.scell.model.drawingml.chart.CT_SecondPieSizeModel;
import com.scell.model.drawingml.chart.CT_SplitTypeModel;
import java.util.List;

public class CT_OfPieChartBuilder {
  private CT_OfPieTypeModel ofPieType;

  private CT_BooleanModel varyColors;

  private List<CT_PieSerModel> ser;

  private CT_DLblsModel dLbls;

  private CT_GapAmountModel gapWidth;

  private CT_SplitTypeModel splitType;

  private CT_DoubleModel splitPos;

  private CT_CustSplitModel custSplit;

  private CT_SecondPieSizeModel secondPieSize;

  private List<CT_ChartLinesModel> serLines;

  private CT_ExtensionListModel extLst;

  public CT_OfPieChartBuilder() {
  }

  public CT_OfPieChartBuilder setOfPieType(CT_OfPieTypeModel ofPieType) {
    this.ofPieType = ofPieType;
    return this;
  }

  public CT_OfPieChartBuilder setVaryColors(CT_BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public CT_OfPieChartBuilder setSer(List<CT_PieSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_OfPieChartBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_OfPieChartBuilder setGapWidth(CT_GapAmountModel gapWidth) {
    this.gapWidth = gapWidth;
    return this;
  }

  public CT_OfPieChartBuilder setSplitType(CT_SplitTypeModel splitType) {
    this.splitType = splitType;
    return this;
  }

  public CT_OfPieChartBuilder setSplitPos(CT_DoubleModel splitPos) {
    this.splitPos = splitPos;
    return this;
  }

  public CT_OfPieChartBuilder setCustSplit(CT_CustSplitModel custSplit) {
    this.custSplit = custSplit;
    return this;
  }

  public CT_OfPieChartBuilder setSecondPieSize(CT_SecondPieSizeModel secondPieSize) {
    this.secondPieSize = secondPieSize;
    return this;
  }

  public CT_OfPieChartBuilder setSerLines(List<CT_ChartLinesModel> serLines) {
    this.serLines = serLines;
    return this;
  }

  public CT_OfPieChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_OfPieChartModel build() {
    return new CT_OfPieChartModel(this.ofPieType, this.varyColors, this.ser, this.dLbls, this.gapWidth, this.splitType, this.splitPos, this.custSplit, this.secondPieSize, this.serLines, this.extLst);
  }

  public CT_OfPieChartBuilder from(CT_OfPieChartModel value) {
    this.ofPieType = value.getOfPieType();
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.gapWidth = value.getGapWidth();
    this.splitType = value.getSplitType();
    this.splitPos = value.getSplitPos();
    this.custSplit = value.getCustSplit();
    this.secondPieSize = value.getSecondPieSize();
    this.serLines = value.getSerLines();
    this.extLst = value.getExtLst();
    return this;
  }
}
