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
import test.dml.chart.CTScatterChartModel.*;
import test.officeDocument.relationships.*;

public class CTScatterChartModel
{
	
	private final CTScatterStyleModel scatterStyle;
	private final CTBooleanModel varyColors;
	private final List<CTScatterSerModel> ser;
	private final CTDLblsModel dLbls;
	private final List<CTUnsignedIntModel> axId;
	private final CTExtensionListModel extLst;
	
	public CTScatterChartModel(CTScatterStyleModel scatterStyle, CTBooleanModel varyColors, List<CTScatterSerModel> ser, CTDLblsModel dLbls, List<CTUnsignedIntModel> axId, CTExtensionListModel extLst) {
		this.scatterStyle = scatterStyle;
		this.varyColors = varyColors;
		this.ser = ser;
		this.dLbls = dLbls;
		this.axId = axId;
		this.extLst = extLst;
	}
	
	public CTScatterStyleModel getScatterStyle() {
		return this.scatterStyle;
	}
	public CTBooleanModel getVaryColors() {
		return this.varyColors;
	}
	public List<CTScatterSerModel> getSer() {
		return this.ser;
	}
	public CTDLblsModel getDLbls() {
		return this.dLbls;
	}
	public List<CTUnsignedIntModel> getAxId() {
		return this.axId;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
