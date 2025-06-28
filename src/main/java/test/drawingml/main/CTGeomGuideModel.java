package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.main.CTGeomGuideModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTGeomGuideModel
{
	
	private final STGeomGuideFormulaModel fmla;
	private final STGeomGuideNameModel name;
	
	public CTGeomGuideModel(STGeomGuideFormulaModel fmla, STGeomGuideNameModel name) {
		this.fmla = fmla;
		this.name = name;
	}
	
	public STGeomGuideFormulaModel getFmla() {
		return this.fmla;
	}
	public STGeomGuideNameModel getName() {
		return this.name;
	}
}
