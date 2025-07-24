package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ChartLinesModel;
import com.scell.model.drawingml.chart.CustSplitModel;
import com.scell.model.drawingml.chart.DLblsModel;
import com.scell.model.drawingml.chart.DoubleModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.GapAmountModel;
import com.scell.model.drawingml.chart.OfPieChartModel;
import com.scell.model.drawingml.chart.OfPieTypeModel;
import com.scell.model.drawingml.chart.PieSerModel;
import com.scell.model.drawingml.chart.SecondPieSizeModel;
import com.scell.model.drawingml.chart.SplitTypeModel;
import java.util.List;

public class OfPieChartBuilder {
  private OfPieTypeModel ofPieType;

  private BooleanModel varyColors;

  private List<PieSerModel> ser;

  private DLblsModel dLbls;

  private GapAmountModel gapWidth;

  private SplitTypeModel splitType;

  private DoubleModel splitPos;

  private CustSplitModel custSplit;

  private SecondPieSizeModel secondPieSize;

  private List<ChartLinesModel> serLines;

  private ExtensionListModel extLst;

  public OfPieChartBuilder() {
  }

  public OfPieChartBuilder setOfPieType(OfPieTypeModel ofPieType) {
    this.ofPieType = ofPieType;
    return this;
  }

  public OfPieChartBuilder setVaryColors(BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public OfPieChartBuilder setSer(List<PieSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public OfPieChartBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public OfPieChartBuilder setGapWidth(GapAmountModel gapWidth) {
    this.gapWidth = gapWidth;
    return this;
  }

  public OfPieChartBuilder setSplitType(SplitTypeModel splitType) {
    this.splitType = splitType;
    return this;
  }

  public OfPieChartBuilder setSplitPos(DoubleModel splitPos) {
    this.splitPos = splitPos;
    return this;
  }

  public OfPieChartBuilder setCustSplit(CustSplitModel custSplit) {
    this.custSplit = custSplit;
    return this;
  }

  public OfPieChartBuilder setSecondPieSize(SecondPieSizeModel secondPieSize) {
    this.secondPieSize = secondPieSize;
    return this;
  }

  public OfPieChartBuilder setSerLines(List<ChartLinesModel> serLines) {
    this.serLines = serLines;
    return this;
  }

  public OfPieChartBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public OfPieChartModel build() {
    return new OfPieChartModel(this.ofPieType, this.varyColors, this.ser, this.dLbls, this.gapWidth, this.splitType, this.splitPos, this.custSplit, this.secondPieSize, this.serLines, this.extLst);
  }

  public OfPieChartBuilder from(OfPieChartModel value) {
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
