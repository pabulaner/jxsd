package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DoubleModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_OrderModel;
import com.scell.model.drawingml.chart.CT_PeriodModel;
import com.scell.model.drawingml.chart.CT_TrendlineLblModel;
import com.scell.model.drawingml.chart.CT_TrendlineModel;
import com.scell.model.drawingml.chart.CT_TrendlineTypeModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;

public class CT_TrendlineBuilder {
  private StringModel name;

  private CT_ShapePropertiesModel spPr;

  private CT_TrendlineTypeModel trendlineType;

  private CT_OrderModel order;

  private CT_PeriodModel period;

  private CT_DoubleModel forward;

  private CT_DoubleModel backward;

  private CT_DoubleModel intercept;

  private CT_BooleanModel dispRSqr;

  private CT_BooleanModel dispEq;

  private CT_TrendlineLblModel trendlineLbl;

  private CT_ExtensionListModel extLst;

  public CT_TrendlineBuilder() {
  }

  public CT_TrendlineBuilder setName(StringModel name) {
    this.name = name;
    return this;
  }

  public CT_TrendlineBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_TrendlineBuilder setTrendlineType(CT_TrendlineTypeModel trendlineType) {
    this.trendlineType = trendlineType;
    return this;
  }

  public CT_TrendlineBuilder setOrder(CT_OrderModel order) {
    this.order = order;
    return this;
  }

  public CT_TrendlineBuilder setPeriod(CT_PeriodModel period) {
    this.period = period;
    return this;
  }

  public CT_TrendlineBuilder setForward(CT_DoubleModel forward) {
    this.forward = forward;
    return this;
  }

  public CT_TrendlineBuilder setBackward(CT_DoubleModel backward) {
    this.backward = backward;
    return this;
  }

  public CT_TrendlineBuilder setIntercept(CT_DoubleModel intercept) {
    this.intercept = intercept;
    return this;
  }

  public CT_TrendlineBuilder setDispRSqr(CT_BooleanModel dispRSqr) {
    this.dispRSqr = dispRSqr;
    return this;
  }

  public CT_TrendlineBuilder setDispEq(CT_BooleanModel dispEq) {
    this.dispEq = dispEq;
    return this;
  }

  public CT_TrendlineBuilder setTrendlineLbl(CT_TrendlineLblModel trendlineLbl) {
    this.trendlineLbl = trendlineLbl;
    return this;
  }

  public CT_TrendlineBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_TrendlineModel build() {
    return new CT_TrendlineModel(this.name, this.spPr, this.trendlineType, this.order, this.period, this.forward, this.backward, this.intercept, this.dispRSqr, this.dispEq, this.trendlineLbl, this.extLst);
  }

  public CT_TrendlineBuilder from(CT_TrendlineModel value) {
    this.name = value.getName();
    this.spPr = value.getSpPr();
    this.trendlineType = value.getTrendlineType();
    this.order = value.getOrder();
    this.period = value.getPeriod();
    this.forward = value.getForward();
    this.backward = value.getBackward();
    this.intercept = value.getIntercept();
    this.dispRSqr = value.getDispRSqr();
    this.dispEq = value.getDispEq();
    this.trendlineLbl = value.getTrendlineLbl();
    this.extLst = value.getExtLst();
    return this;
  }
}
