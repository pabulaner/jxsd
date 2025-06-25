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
import test.dml.chart.CTScatterSerModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTScatterSerModel
{
	
	private final CTUnsignedIntModel idx;
	private final CTUnsignedIntModel order;
	private final CTSerTxModel tx;
	private final CTShapePropertiesModel spPr;
	private final CTMarkerModel marker;
	private final List<CTDPtModel> dPt;
	private final CTDLblsModel dLbls;
	private final List<CTTrendlineModel> trendline;
	private final List<CTErrBarsModel> errBars;
	private final CTAxDataSourceModel xVal;
	private final CTNumDataSourceModel yVal;
	private final CTBooleanModel smooth;
	private final CTExtensionListModel extLst;
	
	public CTScatterSerModel(CTUnsignedIntModel idx, CTUnsignedIntModel order, CTSerTxModel tx, CTShapePropertiesModel spPr, CTMarkerModel marker, List<CTDPtModel> dPt, CTDLblsModel dLbls, List<CTTrendlineModel> trendline, List<CTErrBarsModel> errBars, CTAxDataSourceModel xVal, CTNumDataSourceModel yVal, CTBooleanModel smooth, CTExtensionListModel extLst) {
		this.idx = idx;
		this.order = order;
		this.tx = tx;
		this.spPr = spPr;
		this.marker = marker;
		this.dPt = dPt;
		this.dLbls = dLbls;
		this.trendline = trendline;
		this.errBars = errBars;
		this.xVal = xVal;
		this.yVal = yVal;
		this.smooth = smooth;
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
	public CTMarkerModel getMarker() {
		return this.marker;
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
	public CTBooleanModel getSmooth() {
		return this.smooth;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
