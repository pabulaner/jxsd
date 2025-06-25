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
import test.dml.chart.CTDispUnitsLblModel.*;
import test.officeDocument.relationships.*;

public class CTDispUnitsLblModel
{
	
	private final CTLayoutModel layout;
	private final CTTxModel tx;
	private final CTShapePropertiesModel spPr;
	private final CTTextBodyModel txPr;
	
	public CTDispUnitsLblModel(CTLayoutModel layout, CTTxModel tx, CTShapePropertiesModel spPr, CTTextBodyModel txPr) {
		this.layout = layout;
		this.tx = tx;
		this.spPr = spPr;
		this.txPr = txPr;
	}
	
	public CTLayoutModel getLayout() {
		return this.layout;
	}
	public CTTxModel getTx() {
		return this.tx;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTTextBodyModel getTxPr() {
		return this.txPr;
	}
}
