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
import test.dml.chart.CTLayoutModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTLayoutModel
{
	
	private final CTManualLayoutModel manualLayout;
	private final CTExtensionListModel extLst;
	
	public CTLayoutModel(CTManualLayoutModel manualLayout, CTExtensionListModel extLst) {
		this.manualLayout = manualLayout;
		this.extLst = extLst;
	}
	
	public CTManualLayoutModel getManualLayout() {
		return this.manualLayout;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
