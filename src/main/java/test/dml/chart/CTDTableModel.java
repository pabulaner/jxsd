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
import test.dml.chart.CTDTableModel.*;
import test.officeDocument.relationships.*;

public class CTDTableModel
{
	
	private final CTBooleanModel showHorzBorder;
	private final CTBooleanModel showVertBorder;
	private final CTBooleanModel showOutline;
	private final CTBooleanModel showKeys;
	private final CTShapePropertiesModel spPr;
	private final CTTextBodyModel txPr;
	private final CTExtensionListModel extLst;
	
	public CTDTableModel(CTBooleanModel showHorzBorder, CTBooleanModel showVertBorder, CTBooleanModel showOutline, CTBooleanModel showKeys, CTShapePropertiesModel spPr, CTTextBodyModel txPr, CTExtensionListModel extLst) {
		this.showHorzBorder = showHorzBorder;
		this.showVertBorder = showVertBorder;
		this.showOutline = showOutline;
		this.showKeys = showKeys;
		this.spPr = spPr;
		this.txPr = txPr;
		this.extLst = extLst;
	}
	
	public CTBooleanModel getShowHorzBorder() {
		return this.showHorzBorder;
	}
	public CTBooleanModel getShowVertBorder() {
		return this.showVertBorder;
	}
	public CTBooleanModel getShowOutline() {
		return this.showOutline;
	}
	public CTBooleanModel getShowKeys() {
		return this.showKeys;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTTextBodyModel getTxPr() {
		return this.txPr;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
