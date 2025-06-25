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
import test.dml.chart.CTLegendModel.*;
import test.officeDocument.relationships.*;

public class CTLegendModel
{
	
	private final CTLegendPosModel legendPos;
	private final List<CTLegendEntryModel> legendEntry;
	private final CTLayoutModel layout;
	private final CTBooleanModel overlay;
	private final CTShapePropertiesModel spPr;
	private final CTTextBodyModel txPr;
	private final CTExtensionListModel extLst;
	
	public CTLegendModel(CTLegendPosModel legendPos, List<CTLegendEntryModel> legendEntry, CTLayoutModel layout, CTBooleanModel overlay, CTShapePropertiesModel spPr, CTTextBodyModel txPr, CTExtensionListModel extLst) {
		this.legendPos = legendPos;
		this.legendEntry = legendEntry;
		this.layout = layout;
		this.overlay = overlay;
		this.spPr = spPr;
		this.txPr = txPr;
		this.extLst = extLst;
	}
	
	public CTLegendPosModel getLegendPos() {
		return this.legendPos;
	}
	public List<CTLegendEntryModel> getLegendEntry() {
		return this.legendEntry;
	}
	public CTLayoutModel getLayout() {
		return this.layout;
	}
	public CTBooleanModel getOverlay() {
		return this.overlay;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTTextBodyModel getTxPr() {
		return this.txPr;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
