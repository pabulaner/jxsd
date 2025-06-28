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
import test.drawingml.chart.CTPie3DChartModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPie3DChartModel
{
	
	private final CTBooleanModel varyColors;
	private final List<CTPieSerModel> ser;
	private final CTDLblsModel dLbls;
	private final CTExtensionListModel extLst;
	
	public CTPie3DChartModel(CTBooleanModel varyColors, List<CTPieSerModel> ser, CTDLblsModel dLbls, CTExtensionListModel extLst) {
		this.varyColors = varyColors;
		this.ser = ser;
		this.dLbls = dLbls;
		this.extLst = extLst;
	}
	
	public CTBooleanModel getVaryColors() {
		return this.varyColors;
	}
	public List<CTPieSerModel> getSer() {
		return this.ser;
	}
	public CTDLblsModel getDLbls() {
		return this.dLbls;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
