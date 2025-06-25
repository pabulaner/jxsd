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
import test.dml.chart.CTPivotSourceModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPivotSourceModel
{
	
	private final STXstringModel name;
	private final CTUnsignedIntModel fmtId;
	private final List<CTExtensionListModel> extLst;
	
	public CTPivotSourceModel(STXstringModel name, CTUnsignedIntModel fmtId, List<CTExtensionListModel> extLst) {
		this.name = name;
		this.fmtId = fmtId;
		this.extLst = extLst;
	}
	
	public STXstringModel getName() {
		return this.name;
	}
	public CTUnsignedIntModel getFmtId() {
		return this.fmtId;
	}
	public List<CTExtensionListModel> getExtLst() {
		return this.extLst;
	}
}
