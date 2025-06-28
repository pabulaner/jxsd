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
import test.drawingml.chart.CTLineChartModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTLineChartModel
{
	
	private final CTGroupingModel grouping;
	private final CTBooleanModel varyColors;
	private final List<CTLineSerModel> ser;
	private final CTDLblsModel dLbls;
	private final CTChartLinesModel dropLines;
	private final CTChartLinesModel hiLowLines;
	private final CTUpDownBarsModel upDownBars;
	private final CTBooleanModel marker;
	private final CTBooleanModel smooth;
	private final List<CTUnsignedIntModel> axId;
	private final CTExtensionListModel extLst;
	
	public CTLineChartModel(CTGroupingModel grouping, CTBooleanModel varyColors, List<CTLineSerModel> ser, CTDLblsModel dLbls, CTChartLinesModel dropLines, CTChartLinesModel hiLowLines, CTUpDownBarsModel upDownBars, CTBooleanModel marker, CTBooleanModel smooth, List<CTUnsignedIntModel> axId, CTExtensionListModel extLst) {
		this.grouping = grouping;
		this.varyColors = varyColors;
		this.ser = ser;
		this.dLbls = dLbls;
		this.dropLines = dropLines;
		this.hiLowLines = hiLowLines;
		this.upDownBars = upDownBars;
		this.marker = marker;
		this.smooth = smooth;
		this.axId = axId;
		this.extLst = extLst;
	}
	
	public CTGroupingModel getGrouping() {
		return this.grouping;
	}
	public CTBooleanModel getVaryColors() {
		return this.varyColors;
	}
	public List<CTLineSerModel> getSer() {
		return this.ser;
	}
	public CTDLblsModel getDLbls() {
		return this.dLbls;
	}
	public CTChartLinesModel getDropLines() {
		return this.dropLines;
	}
	public CTChartLinesModel getHiLowLines() {
		return this.hiLowLines;
	}
	public CTUpDownBarsModel getUpDownBars() {
		return this.upDownBars;
	}
	public CTBooleanModel getMarker() {
		return this.marker;
	}
	public CTBooleanModel getSmooth() {
		return this.smooth;
	}
	public List<CTUnsignedIntModel> getAxId() {
		return this.axId;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
