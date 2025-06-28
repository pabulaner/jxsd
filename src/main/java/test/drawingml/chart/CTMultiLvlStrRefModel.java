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
import test.drawingml.chart.CTMultiLvlStrRefModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTMultiLvlStrRefModel
{
	
	private final StringModel f;
	private final CTMultiLvlStrDataModel multiLvlStrCache;
	private final CTExtensionListModel extLst;
	
	public CTMultiLvlStrRefModel(StringModel f, CTMultiLvlStrDataModel multiLvlStrCache, CTExtensionListModel extLst) {
		this.f = f;
		this.multiLvlStrCache = multiLvlStrCache;
		this.extLst = extLst;
	}
	
	public StringModel getF() {
		return this.f;
	}
	public CTMultiLvlStrDataModel getMultiLvlStrCache() {
		return this.multiLvlStrCache;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
