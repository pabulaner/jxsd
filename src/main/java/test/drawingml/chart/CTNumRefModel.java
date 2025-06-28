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
import test.drawingml.chart.CTNumRefModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTNumRefModel
{
	
	private final StringModel f;
	private final CTNumDataModel numCache;
	private final CTExtensionListModel extLst;
	
	public CTNumRefModel(StringModel f, CTNumDataModel numCache, CTExtensionListModel extLst) {
		this.f = f;
		this.numCache = numCache;
		this.extLst = extLst;
	}
	
	public StringModel getF() {
		return this.f;
	}
	public CTNumDataModel getNumCache() {
		return this.numCache;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
