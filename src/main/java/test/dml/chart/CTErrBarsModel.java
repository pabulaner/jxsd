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
import test.officeDocument.relationships.*;
import test.dml.chart.CTErrBarsModel.*;

public class CTErrBarsModel
{
	
	private final CTErrDirModel errDir;
	private final CTErrBarTypeModel errBarType;
	private final CTErrValTypeModel errValType;
	private final CTBooleanModel noEndCap;
	private final CTNumDataSourceModel plus;
	private final CTNumDataSourceModel minus;
	private final CTDoubleModel val;
	private final CTShapePropertiesModel spPr;
	private final CTExtensionListModel extLst;
	
	public CTErrBarsModel(CTErrDirModel errDir, CTErrBarTypeModel errBarType, CTErrValTypeModel errValType, CTBooleanModel noEndCap, CTNumDataSourceModel plus, CTNumDataSourceModel minus, CTDoubleModel val, CTShapePropertiesModel spPr, CTExtensionListModel extLst) {
		this.errDir = errDir;
		this.errBarType = errBarType;
		this.errValType = errValType;
		this.noEndCap = noEndCap;
		this.plus = plus;
		this.minus = minus;
		this.val = val;
		this.spPr = spPr;
		this.extLst = extLst;
	}
	
	public CTErrDirModel getErrDir() {
		return this.errDir;
	}
	public CTErrBarTypeModel getErrBarType() {
		return this.errBarType;
	}
	public CTErrValTypeModel getErrValType() {
		return this.errValType;
	}
	public CTBooleanModel getNoEndCap() {
		return this.noEndCap;
	}
	public CTNumDataSourceModel getPlus() {
		return this.plus;
	}
	public CTNumDataSourceModel getMinus() {
		return this.minus;
	}
	public CTDoubleModel getVal() {
		return this.val;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
