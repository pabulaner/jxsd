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
import test.drawingml.chart.CTBandFmtModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTBandFmtModel
{
	
	private final CTUnsignedIntModel idx;
	private final CTShapePropertiesModel spPr;
	
	public CTBandFmtModel(CTUnsignedIntModel idx, CTShapePropertiesModel spPr) {
		this.idx = idx;
		this.spPr = spPr;
	}
	
	public CTUnsignedIntModel getIdx() {
		return this.idx;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
}
