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
import test.dml.chart.CTStrDataModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTStrDataModel
{
	
	private final CTUnsignedIntModel ptCount;
	private final List<CTStrValModel> pt;
	private final CTExtensionListModel extLst;
	
	public CTStrDataModel(CTUnsignedIntModel ptCount, List<CTStrValModel> pt, CTExtensionListModel extLst) {
		this.ptCount = ptCount;
		this.pt = pt;
		this.extLst = extLst;
	}
	
	public CTUnsignedIntModel getPtCount() {
		return this.ptCount;
	}
	public List<CTStrValModel> getPt() {
		return this.pt;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
