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
import test.dml.chart.CTMarkerModel.*;
import test.officeDocument.relationships.*;

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
