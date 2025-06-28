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
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.chartDrawing.CTShapeNonVisualModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTShapeNonVisualModel
{
	
	private final CTNonVisualDrawingPropsModel cNvPr;
	private final CTNonVisualDrawingShapePropsModel cNvSpPr;
	
	public CTShapeNonVisualModel(CTNonVisualDrawingPropsModel cNvPr, CTNonVisualDrawingShapePropsModel cNvSpPr) {
		this.cNvPr = cNvPr;
		this.cNvSpPr = cNvSpPr;
	}
	
	public CTNonVisualDrawingPropsModel getCNvPr() {
		return this.cNvPr;
	}
	public CTNonVisualDrawingShapePropsModel getCNvSpPr() {
		return this.cNvSpPr;
	}
}
