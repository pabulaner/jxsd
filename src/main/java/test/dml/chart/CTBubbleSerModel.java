package test.dml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chart.CTBubbleSerModel.*;
import test.officeDocument.relationships.*;

public class CTBubbleSerModel
{
	
	private final CTUnsignedIntModel idx;
	private final CTUnsignedIntModel order;
	private final CTSerTxModel tx;
	private final CTShapePropertiesModel spPr;
	private final CTBooleanModel invertIfNegative;
	private final List<CTDPtModel> dPt;
	private final CTDLblsModel dLbls;
	private final List<CTTrendlineModel> trendline;
	private final List<CTErrBarsModel> errBars;
	private final CTAxDataSourceModel xVal;
	private final CTNumDataSourceModel yVal;
	private final CTNumDataSourceModel bubbleSize;
	private final CTBooleanModel bubble3D;
	private final CTExtensionListModel extLst;
	
	public CTBubbleSerModel(CTUnsignedIntModel idx, CTUnsignedIntModel order, CTSerTxModel tx, CTShapePropertiesModel spPr, CTBooleanModel invertIfNegative, List<CTDPtModel> dPt, CTDLblsModel dLbls, List<CTTrendlineModel> trendline, List<CTErrBarsModel> errBars, CTAxDataSourceModel xVal, CTNumDataSourceModel yVal, CTNumDataSourceModel bubbleSize, CTBooleanModel bubble3D, CTExtensionListModel extLst) {
		this.idx = idx;
		this.order = order;
		this.tx = tx;
		this.spPr = spPr;
		this.invertIfNegative = invertIfNegative;
		this.dPt = dPt;
		this.dLbls = dLbls;
		this.trendline = trendline;
		this.errBars = errBars;
		this.xVal = xVal;
		this.yVal = yVal;
		this.bubbleSize = bubbleSize;
		this.bubble3D = bubble3D;
		this.extLst = extLst;
	}
	
	public CTUnsignedIntModel getIdx() {
		return this.idx;
	}
	public CTUnsignedIntModel getOrder() {
		return this.order;
	}
	public CTSerTxModel getTx() {
		return this.tx;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTBooleanModel getInvertIfNegative() {
		return this.invertIfNegative;
	}
	public List<CTDPtModel> getDPt() {
		return this.dPt;
	}
	public CTDLblsModel getDLbls() {
		return this.dLbls;
	}
	public List<CTTrendlineModel> getTrendline() {
		return this.trendline;
	}
	public List<CTErrBarsModel> getErrBars() {
		return this.errBars;
	}
	public CTAxDataSourceModel getXVal() {
		return this.xVal;
	}
	public CTNumDataSourceModel getYVal() {
		return this.yVal;
	}
	public CTNumDataSourceModel getBubbleSize() {
		return this.bubbleSize;
	}
	public CTBooleanModel getBubble3D() {
		return this.bubble3D;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
