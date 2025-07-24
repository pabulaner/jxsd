package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;

public class TrendlineModel {
  private final StringModel name;

  private final ShapePropertiesModel spPr;

  private final TrendlineTypeModel trendlineType;

  private final OrderModel order;

  private final PeriodModel period;

  private final DoubleModel forward;

  private final DoubleModel backward;

  private final DoubleModel intercept;

  private final BooleanModel dispRSqr;

  private final BooleanModel dispEq;

  private final TrendlineLblModel trendlineLbl;

  private final ExtensionListModel extLst;

  public TrendlineModel(StringModel name, ShapePropertiesModel spPr,
      TrendlineTypeModel trendlineType, OrderModel order, PeriodModel period, DoubleModel forward,
      DoubleModel backward, DoubleModel intercept, BooleanModel dispRSqr, BooleanModel dispEq,
      TrendlineLblModel trendlineLbl, ExtensionListModel extLst) {
    this.name = name;
    this.spPr = spPr;
    this.trendlineType = trendlineType;
    this.order = order;
    this.period = period;
    this.forward = forward;
    this.backward = backward;
    this.intercept = intercept;
    this.dispRSqr = dispRSqr;
    this.dispEq = dispEq;
    this.trendlineLbl = trendlineLbl;
    this.extLst = extLst;
  }

  public StringModel getName() {
    return this.name;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public TrendlineTypeModel getTrendlineType() {
    return this.trendlineType;
  }

  public OrderModel getOrder() {
    return this.order;
  }

  public PeriodModel getPeriod() {
    return this.period;
  }

  public DoubleModel getForward() {
    return this.forward;
  }

  public DoubleModel getBackward() {
    return this.backward;
  }

  public DoubleModel getIntercept() {
    return this.intercept;
  }

  public BooleanModel getDispRSqr() {
    return this.dispRSqr;
  }

  public BooleanModel getDispEq() {
    return this.dispEq;
  }

  public TrendlineLblModel getTrendlineLbl() {
    return this.trendlineLbl;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
