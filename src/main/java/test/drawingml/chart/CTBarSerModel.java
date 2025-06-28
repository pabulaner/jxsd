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
import test.drawingml.chart.CTBarSerModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTBarSerModel
{
	
	private final CTUnsignedIntModel idx;
	private final CTUnsignedIntModel order;
	private final CTSerTxModel tx;
	private final CTShapePropertiesModel spPr;
	private final CTBooleanModel invertIfNegative;
	private final CTPictureOptionsModel pictureOptions;
	private final List<CTDPtModel> dPt;
	private final CTDLblsModel dLbls;
	private final List<CTTrendlineModel> trendline;
	private final CTErrBarsModel errBars;
	private final CTAxDataSourceModel cat;
	private final CTNumDataSourceModel val;
	private final CTShapeModel shape;
	private final CTExtensionListModel extLst;
	
	public CTBarSerModel(CTUnsignedIntModel idx, CTUnsignedIntModel order, CTSerTxModel tx, CTShapePropertiesModel spPr, CTBooleanModel invertIfNegative, CTPictureOptionsModel pictureOptions, List<CTDPtModel> dPt, CTDLblsModel dLbls, List<CTTrendlineModel> trendline, CTErrBarsModel errBars, CTAxDataSourceModel cat, CTNumDataSourceModel val, CTShapeModel shape, CTExtensionListModel extLst) {
		this.idx = idx;
		this.order = order;
		this.tx = tx;
		this.spPr = spPr;
		this.invertIfNegative = invertIfNegative;
		this.pictureOptions = pictureOptions;
		this.dPt = dPt;
		this.dLbls = dLbls;
		this.trendline = trendline;
		this.errBars = errBars;
		this.cat = cat;
		this.val = val;
		this.shape = shape;
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
	public CTPictureOptionsModel getPictureOptions() {
		return this.pictureOptions;
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
	public CTErrBarsModel getErrBars() {
		return this.errBars;
	}
	public CTAxDataSourceModel getCat() {
		return this.cat;
	}
	public CTNumDataSourceModel getVal() {
		return this.val;
	}
	public CTShapeModel getShape() {
		return this.shape;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
