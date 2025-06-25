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
import test.dml.chart.CTNumDataModel.*;
import test.officeDocument.relationships.*;

public class CTNumDataModel
{
	
	private final STXstringModel formatCode;
	private final CTUnsignedIntModel ptCount;
	private final List<CTNumValModel> pt;
	private final CTExtensionListModel extLst;
	
	public CTNumDataModel(STXstringModel formatCode, CTUnsignedIntModel ptCount, List<CTNumValModel> pt, CTExtensionListModel extLst) {
		this.formatCode = formatCode;
		this.ptCount = ptCount;
		this.pt = pt;
		this.extLst = extLst;
	}
	
	public STXstringModel getFormatCode() {
		return this.formatCode;
	}
	public CTUnsignedIntModel getPtCount() {
		return this.ptCount;
	}
	public List<CTNumValModel> getPt() {
		return this.pt;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
