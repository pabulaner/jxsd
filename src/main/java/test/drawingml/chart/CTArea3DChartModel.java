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
import test.drawingml.chart.CTArea3DChartModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTArea3DChartModel
{
	
	private final CTGroupingModel grouping;
	private final CTBooleanModel varyColors;
	private final List<CTAreaSerModel> ser;
	private final CTDLblsModel dLbls;
	private final CTChartLinesModel dropLines;
	private final CTGapAmountModel gapDepth;
	private final List<CTUnsignedIntModel> axId;
	private final CTExtensionListModel extLst;
	
	public CTArea3DChartModel(CTGroupingModel grouping, CTBooleanModel varyColors, List<CTAreaSerModel> ser, CTDLblsModel dLbls, CTChartLinesModel dropLines, CTGapAmountModel gapDepth, List<CTUnsignedIntModel> axId, CTExtensionListModel extLst) {
		this.grouping = grouping;
		this.varyColors = varyColors;
		this.ser = ser;
		this.dLbls = dLbls;
		this.dropLines = dropLines;
		this.gapDepth = gapDepth;
		this.axId = axId;
		this.extLst = extLst;
	}
	
	public CTGroupingModel getGrouping() {
		return this.grouping;
	}
	public CTBooleanModel getVaryColors() {
		return this.varyColors;
	}
	public List<CTAreaSerModel> getSer() {
		return this.ser;
	}
	public CTDLblsModel getDLbls() {
		return this.dLbls;
	}
	public CTChartLinesModel getDropLines() {
		return this.dropLines;
	}
	public CTGapAmountModel getGapDepth() {
		return this.gapDepth;
	}
	public List<CTUnsignedIntModel> getAxId() {
		return this.axId;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
