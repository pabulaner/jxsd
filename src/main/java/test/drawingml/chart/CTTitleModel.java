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
import test.officeDocument.relationships.*;
import test.drawingml.chart.CTTitleModel.*;

// SEQUENCE MODEL
public class CTTitleModel
{
	
	private final CTTxModel tx;
	private final CTLayoutModel layout;
	private final CTBooleanModel overlay;
	private final CTShapePropertiesModel spPr;
	private final CTTextBodyModel txPr;
	private final CTExtensionListModel extLst;
	
	public CTTitleModel(CTTxModel tx, CTLayoutModel layout, CTBooleanModel overlay, CTShapePropertiesModel spPr, CTTextBodyModel txPr, CTExtensionListModel extLst) {
		this.tx = tx;
		this.layout = layout;
		this.overlay = overlay;
		this.spPr = spPr;
		this.txPr = txPr;
		this.extLst = extLst;
	}
	
	public CTTxModel getTx() {
		return this.tx;
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
