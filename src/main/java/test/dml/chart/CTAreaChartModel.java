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
import test.dml.chart.CTAreaChartModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTAreaChartModel
{
	
	private final CTGroupingModel grouping;
	private final CTBooleanModel varyColors;
	private final List<CTAreaSerModel> ser;
	private final CTDLblsModel dLbls;
	private final CTChartLinesModel dropLines;
	private final List<CTUnsignedIntModel> axId;
	private final CTExtensionListModel extLst;
	
	public CTAreaChartModel(CTGroupingModel grouping, CTBooleanModel varyColors, List<CTAreaSerModel> ser, CTDLblsModel dLbls, CTChartLinesModel dropLines, List<CTUnsignedIntModel> axId, CTExtensionListModel extLst) {
		this.grouping = grouping;
		this.varyColors = varyColors;
		this.ser = ser;
		this.dLbls = dLbls;
		this.dropLines = dropLines;
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
	public List<CTUnsignedIntModel> getAxId() {
		return this.axId;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
