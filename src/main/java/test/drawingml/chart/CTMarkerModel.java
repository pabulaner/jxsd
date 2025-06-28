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
import test.drawingml.chart.CTMarkerModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTMarkerModel
{
	
	private final CTMarkerStyleModel symbol;
	private final CTMarkerSizeModel size;
	private final CTShapePropertiesModel spPr;
	private final CTExtensionListModel extLst;
	
	public CTMarkerModel(CTMarkerStyleModel symbol, CTMarkerSizeModel size, CTShapePropertiesModel spPr, CTExtensionListModel extLst) {
		this.symbol = symbol;
		this.size = size;
		this.spPr = spPr;
		this.extLst = extLst;
	}
	
	public CTMarkerStyleModel getSymbol() {
		return this.symbol;
	}
	public CTMarkerSizeModel getSize() {
		return this.size;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
