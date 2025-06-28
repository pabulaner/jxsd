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
import test.drawingml.chart.CTMultiLvlStrDataModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTMultiLvlStrDataModel
{
	
	private final CTUnsignedIntModel ptCount;
	private final List<CTLvlModel> lvl;
	private final CTExtensionListModel extLst;
	
	public CTMultiLvlStrDataModel(CTUnsignedIntModel ptCount, List<CTLvlModel> lvl, CTExtensionListModel extLst) {
		this.ptCount = ptCount;
		this.lvl = lvl;
		this.extLst = extLst;
	}
	
	public CTUnsignedIntModel getPtCount() {
		return this.ptCount;
	}
	public List<CTLvlModel> getLvl() {
		return this.lvl;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
