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
import test.drawingml.chart.CTStrRefModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTStrRefModel
{
	
	private final StringModel f;
	private final CTStrDataModel strCache;
	private final CTExtensionListModel extLst;
	
	public CTStrRefModel(StringModel f, CTStrDataModel strCache, CTExtensionListModel extLst) {
		this.f = f;
		this.strCache = strCache;
		this.extLst = extLst;
	}
	
	public StringModel getF() {
		return this.f;
	}
	public CTStrDataModel getStrCache() {
		return this.strCache;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
