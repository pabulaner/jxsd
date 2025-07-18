package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_BubbleChartModel;
import com.scell.model.drawingml.chart.CT_BubbleScaleModel;
import com.scell.model.drawingml.chart.CT_BubbleSerModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_SizeRepresentsModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import java.util.List;

public class CT_BubbleChartBuilder {
  private CT_BooleanModel varyColors;

  private List<CT_BubbleSerModel> ser;

  private CT_DLblsModel dLbls;

  private CT_BooleanModel bubble3D;

  private CT_BubbleScaleModel bubbleScale;

  private CT_BooleanModel showNegBubbles;

  private CT_SizeRepresentsModel sizeRepresents;

  private List<CT_UnsignedIntModel> axId;

  private CT_ExtensionListModel extLst;

  public CT_BubbleChartBuilder() {
  }

  public CT_BubbleChartBuilder setVaryColors(CT_BooleanModel varyColors) {
    this.varyColors = varyColors;
    return this;
  }

  public CT_BubbleChartBuilder setSer(List<CT_BubbleSerModel> ser) {
    this.ser = ser;
    return this;
  }

  public CT_BubbleChartBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_BubbleChartBuilder setBubble3D(CT_BooleanModel bubble3D) {
    this.bubble3D = bubble3D;
    return this;
  }

  public CT_BubbleChartBuilder setBubbleScale(CT_BubbleScaleModel bubbleScale) {
    this.bubbleScale = bubbleScale;
    return this;
  }

  public CT_BubbleChartBuilder setShowNegBubbles(CT_BooleanModel showNegBubbles) {
    this.showNegBubbles = showNegBubbles;
    return this;
  }

  public CT_BubbleChartBuilder setSizeRepresents(CT_SizeRepresentsModel sizeRepresents) {
    this.sizeRepresents = sizeRepresents;
    return this;
  }

  public CT_BubbleChartBuilder setAxId(List<CT_UnsignedIntModel> axId) {
    this.axId = axId;
    return this;
  }

  public CT_BubbleChartBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_BubbleChartModel build() {
    return new CT_BubbleChartModel(this.varyColors, this.ser, this.dLbls, this.bubble3D, this.bubbleScale, this.showNegBubbles, this.sizeRepresents, this.axId, this.extLst);
  }

  public CT_BubbleChartBuilder from(CT_BubbleChartModel value) {
    this.varyColors = value.getVaryColors();
    this.ser = value.getSer();
    this.dLbls = value.getDLbls();
    this.bubble3D = value.getBubble3D();
    this.bubbleScale = value.getBubbleScale();
    this.showNegBubbles = value.getShowNegBubbles();
    this.sizeRepresents = value.getSizeRepresents();
    this.axId = value.getAxId();
    this.extLst = value.getExtLst();
    return this;
  }
}
