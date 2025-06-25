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
import test.dml.chart.CTSurfaceChartModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTSurfaceChartModel
{
	
	private final CTBooleanModel wireframe;
	private final List<CTSurfaceSerModel> ser;
	private final CTBandFmtsModel bandFmts;
	private final List<CTUnsignedIntModel> axId;
	private final CTExtensionListModel extLst;
	
	public CTSurfaceChartModel(CTBooleanModel wireframe, List<CTSurfaceSerModel> ser, CTBandFmtsModel bandFmts, List<CTUnsignedIntModel> axId, CTExtensionListModel extLst) {
		this.wireframe = wireframe;
		this.ser = ser;
		this.bandFmts = bandFmts;
		this.axId = axId;
		this.extLst = extLst;
	}
	
	public CTBooleanModel getWireframe() {
		return this.wireframe;
	}
	public List<CTSurfaceSerModel> getSer() {
		return this.ser;
	}
	public CTBandFmtsModel getBandFmts() {
		return this.bandFmts;
	}
	public List<CTUnsignedIntModel> getAxId() {
		return this.axId;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
