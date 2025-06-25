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
import test.dml.chart.CTBandFmtModel.*;
import test.officeDocument.relationships.*;

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
