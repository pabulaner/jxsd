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
import test.drawingml.chart.CTSurfaceSerModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTSurfaceSerModel
{
	
	private final CTUnsignedIntModel idx;
	private final CTUnsignedIntModel order;
	private final CTSerTxModel tx;
	private final CTShapePropertiesModel spPr;
	private final CTAxDataSourceModel cat;
	private final CTNumDataSourceModel val;
	private final CTExtensionListModel extLst;
	
	public CTSurfaceSerModel(CTUnsignedIntModel idx, CTUnsignedIntModel order, CTSerTxModel tx, CTShapePropertiesModel spPr, CTAxDataSourceModel cat, CTNumDataSourceModel val, CTExtensionListModel extLst) {
		this.idx = idx;
		this.order = order;
		this.tx = tx;
		this.spPr = spPr;
		this.cat = cat;
		this.val = val;
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
	public CTAxDataSourceModel getCat() {
		return this.cat;
	}
	public CTNumDataSourceModel getVal() {
		return this.val;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
