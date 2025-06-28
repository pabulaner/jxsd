package test.drawingml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.chart.CTTrendlineModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTTrendlineModel
{
	
	private final StringModel name;
	private final CTShapePropertiesModel spPr;
	private final CTTrendlineTypeModel trendlineType;
	private final CTOrderModel order;
	private final CTPeriodModel period;
	private final CTDoubleModel forward;
	private final CTDoubleModel backward;
	private final CTDoubleModel intercept;
	private final CTBooleanModel dispRSqr;
	private final CTBooleanModel dispEq;
	private final CTTrendlineLblModel trendlineLbl;
	private final CTExtensionListModel extLst;
	
	public CTTrendlineModel(StringModel name, CTShapePropertiesModel spPr, CTTrendlineTypeModel trendlineType, CTOrderModel order, CTPeriodModel period, CTDoubleModel forward, CTDoubleModel backward, CTDoubleModel intercept, CTBooleanModel dispRSqr, CTBooleanModel dispEq, CTTrendlineLblModel trendlineLbl, CTExtensionListModel extLst) {
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
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTTrendlineTypeModel getTrendlineType() {
		return this.trendlineType;
	}
	public CTOrderModel getOrder() {
		return this.order;
	}
	public CTPeriodModel getPeriod() {
		return this.period;
	}
	public CTDoubleModel getForward() {
		return this.forward;
	}
	public CTDoubleModel getBackward() {
		return this.backward;
	}
	public CTDoubleModel getIntercept() {
		return this.intercept;
	}
	public CTBooleanModel getDispRSqr() {
		return this.dispRSqr;
	}
	public CTBooleanModel getDispEq() {
		return this.dispEq;
	}
	public CTTrendlineLblModel getTrendlineLbl() {
		return this.trendlineLbl;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
