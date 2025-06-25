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
import test.officeDocument.relationships.*;
import test.dml.chartDrawing.CTShapeNonVisualModel.*;

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
