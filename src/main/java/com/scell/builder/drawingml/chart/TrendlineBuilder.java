package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.DoubleModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.OrderModel;
import com.scell.model.drawingml.chart.PeriodModel;
import com.scell.model.drawingml.chart.TrendlineLblModel;
import com.scell.model.drawingml.chart.TrendlineModel;
import com.scell.model.drawingml.chart.TrendlineTypeModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;

public class TrendlineBuilder {
  private StringModel name;

  private ShapePropertiesModel spPr;

  private TrendlineTypeModel trendlineType;

  private OrderModel order;

  private PeriodModel period;

  private DoubleModel forward;

  private DoubleModel backward;

  private DoubleModel intercept;

  private BooleanModel dispRSqr;

  private BooleanModel dispEq;

  private TrendlineLblModel trendlineLbl;

  private ExtensionListModel extLst;

  public TrendlineBuilder() {
  }

  public TrendlineBuilder setName(StringModel name) {
    this.name = name;
    return this;
  }

  public TrendlineBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public TrendlineBuilder setTrendlineType(TrendlineTypeModel trendlineType) {
    this.trendlineType = trendlineType;
    return this;
  }

  public TrendlineBuilder setOrder(OrderModel order) {
    this.order = order;
    return this;
  }

  public TrendlineBuilder setPeriod(PeriodModel period) {
    this.period = period;
    return this;
  }

  public TrendlineBuilder setForward(DoubleModel forward) {
    this.forward = forward;
    return this;
  }

  public TrendlineBuilder setBackward(DoubleModel backward) {
    this.backward = backward;
    return this;
  }

  public TrendlineBuilder setIntercept(DoubleModel intercept) {
    this.intercept = intercept;
    return this;
  }

  public TrendlineBuilder setDispRSqr(BooleanModel dispRSqr) {
    this.dispRSqr = dispRSqr;
    return this;
  }

  public TrendlineBuilder setDispEq(BooleanModel dispEq) {
    this.dispEq = dispEq;
    return this;
  }

  public TrendlineBuilder setTrendlineLbl(TrendlineLblModel trendlineLbl) {
    this.trendlineLbl = trendlineLbl;
    return this;
  }

  public TrendlineBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public TrendlineModel build() {
    return new TrendlineModel(this.name, this.spPr, this.trendlineType, this.order, this.period, this.forward, this.backward, this.intercept, this.dispRSqr, this.dispEq, this.trendlineLbl, this.extLst);
  }

  public TrendlineBuilder from(TrendlineModel value) {
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
