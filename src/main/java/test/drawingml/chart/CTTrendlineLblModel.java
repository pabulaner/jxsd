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
import test.drawingml.chart.CTTrendlineLblModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTTrendlineLblModel
{
	
	private final CTLayoutModel layout;
	private final CTTxModel tx;
	private final CTNumFmtModel numFmt;
	private final CTShapePropertiesModel spPr;
	private final CTTextBodyModel txPr;
	private final CTExtensionListModel extLst;
	
	public CTTrendlineLblModel(CTLayoutModel layout, CTTxModel tx, CTNumFmtModel numFmt, CTShapePropertiesModel spPr, CTTextBodyModel txPr, CTExtensionListModel extLst) {
		this.layout = layout;
		this.tx = tx;
		this.numFmt = numFmt;
		this.spPr = spPr;
		this.txPr = txPr;
		this.extLst = extLst;
	}
	
	public CTLayoutModel getLayout() {
		return this.layout;
	}
	public CTTxModel getTx() {
		return this.tx;
	}
	public CTNumFmtModel getNumFmt() {
		return this.numFmt;
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
