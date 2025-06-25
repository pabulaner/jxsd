package test.dml;

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
import test.dml.CTGeomGuideModel.*;
import test.officeDocument.relationships.*;

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
