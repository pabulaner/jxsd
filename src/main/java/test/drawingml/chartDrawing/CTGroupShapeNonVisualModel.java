package test.drawingml.chartDrawing;

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
import test.drawingml.chartDrawing.CTGroupShapeNonVisualModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
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
