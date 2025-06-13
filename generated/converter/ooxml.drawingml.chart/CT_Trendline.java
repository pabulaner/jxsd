


public class CT_TrendlineModel {


    private final StringModel name;
    private final CT_ShapePropertiesModel spPr;
    private final CT_TrendlineTypeModel trendlineType;
    private final CT_OrderModel order;
    private final CT_PeriodModel period;
    private final CT_DoubleModel forward;
    private final CT_DoubleModel backward;
    private final CT_DoubleModel intercept;
    private final CT_BooleanModel dispRSqr;
    private final CT_BooleanModel dispEq;
    private final CT_TrendlineLblModel trendlineLbl;
    private final CT_ExtensionListModel extLst;

    public CT_TrendlineModel(StringModel name , CT_ShapePropertiesModel spPr , CT_TrendlineTypeModel trendlineType , CT_OrderModel order , CT_PeriodModel period , CT_DoubleModel forward , CT_DoubleModel backward , CT_DoubleModel intercept , CT_BooleanModel dispRSqr , CT_BooleanModel dispEq , CT_TrendlineLblModel trendlineLbl , CT_ExtensionListModel extLst ) {
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
    public CT_ShapePropertiesModel getSpPr() {
        return this.spPr;
    }
    public CT_TrendlineTypeModel getTrendlineType() {
        return this.trendlineType;
    }
    public CT_OrderModel getOrder() {
        return this.order;
    }
    public CT_PeriodModel getPeriod() {
        return this.period;
    }
    public CT_DoubleModel getForward() {
        return this.forward;
    }
    public CT_DoubleModel getBackward() {
        return this.backward;
    }
    public CT_DoubleModel getIntercept() {
        return this.intercept;
    }
    public CT_BooleanModel getDispRSqr() {
        return this.dispRSqr;
    }
    public CT_BooleanModel getDispEq() {
        return this.dispEq;
    }
    public CT_TrendlineLblModel getTrendlineLbl() {
        return this.trendlineLbl;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}