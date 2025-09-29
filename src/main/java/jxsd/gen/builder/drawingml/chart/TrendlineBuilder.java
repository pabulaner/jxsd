package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.DoubleModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.OrderModel;
import jxsd.gen.model.drawingml.chart.PeriodModel;
import jxsd.gen.model.drawingml.chart.TrendlineLblModel;
import jxsd.gen.model.drawingml.chart.TrendlineModel;
import jxsd.gen.model.drawingml.chart.TrendlineTypeModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class TrendlineBuilder {
  private String name;

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

  public TrendlineBuilder setName(String name) {
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

  public TrendlineModel build() {
    return new TrendlineModel(this.name, this.spPr, this.trendlineType, this.order, this.period, this.forward, this.backward, this.intercept, this.dispRSqr, this.dispEq, this.trendlineLbl, this.extLst);
  }
}
