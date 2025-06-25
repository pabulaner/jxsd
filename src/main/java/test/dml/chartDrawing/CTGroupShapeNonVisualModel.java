package test.dml.chartDrawing;

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
import test.dml.chartDrawing.CTGroupShapeNonVisualModel.*;
import test.officeDocument.relationships.*;

public class CTGroupShapeNonVisualModel
{
	
	private final CTNonVisualDrawingPropsModel cNvPr;
	private final CTNonVisualGroupDrawingShapePropsModel cNvGrpSpPr;
	
	public CTGroupShapeNonVisualModel(CTNonVisualDrawingPropsModel cNvPr, CTNonVisualGroupDrawingShapePropsModel cNvGrpSpPr) {
		this.cNvPr = cNvPr;
		this.cNvGrpSpPr = cNvGrpSpPr;
	}
	
	public CTNonVisualDrawingPropsModel getCNvPr() {
		return this.cNvPr;
	}
	public CTNonVisualGroupDrawingShapePropsModel getCNvGrpSpPr() {
		return this.cNvGrpSpPr;
	}
}
