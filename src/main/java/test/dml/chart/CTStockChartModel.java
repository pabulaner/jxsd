package test.dml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.CTStockChartModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTStockChartModel
{
	
	private final List<CTLineSerModel> ser;
	private final CTDLblsModel dLbls;
	private final CTChartLinesModel dropLines;
	private final CTChartLinesModel hiLowLines;
	private final CTUpDownBarsModel upDownBars;
	private final List<CTUnsignedIntModel> axId;
	private final CTExtensionListModel extLst;
	
	public CTStockChartModel(List<CTLineSerModel> ser, CTDLblsModel dLbls, CTChartLinesModel dropLines, CTChartLinesModel hiLowLines, CTUpDownBarsModel upDownBars, List<CTUnsignedIntModel> axId, CTExtensionListModel extLst) {
		this.ser = ser;
		this.dLbls = dLbls;
		this.dropLines = dropLines;
		this.hiLowLines = hiLowLines;
		this.upDownBars = upDownBars;
		this.axId = axId;
		this.extLst = extLst;
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
	public List<CTUnsignedIntModel> getAxId() {
		return this.axId;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
