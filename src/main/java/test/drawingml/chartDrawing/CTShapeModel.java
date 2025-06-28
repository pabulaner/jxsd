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
import test.drawingml.chartDrawing.CTShapeModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTShapeModel
{
	
	private final BooleanModel fPublished;
	private final StringModel macro;
	private final BooleanModel fLocksText;
	private final StringModel textlink;
	private final CTShapeNonVisualModel nvSpPr;
	private final CTShapePropertiesModel spPr;
	private final CTShapeStyleModel style;
	private final CTTextBodyModel txBody;
	
	public CTShapeModel(BooleanModel fPublished, StringModel macro, BooleanModel fLocksText, StringModel textlink, CTShapeNonVisualModel nvSpPr, CTShapePropertiesModel spPr, CTShapeStyleModel style, CTTextBodyModel txBody) {
		this.fPublished = fPublished;
		this.macro = macro;
		this.fLocksText = fLocksText;
		this.textlink = textlink;
		this.nvSpPr = nvSpPr;
		this.spPr = spPr;
		this.style = style;
		this.txBody = txBody;
	}
	
	public BooleanModel getFPublished() {
		return this.fPublished;
	}
	public StringModel getMacro() {
		return this.macro;
	}
	public BooleanModel getFLocksText() {
		return this.fLocksText;
	}
	public StringModel getTextlink() {
		return this.textlink;
	}
	public CTShapeNonVisualModel getNvSpPr() {
		return this.nvSpPr;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTShapeStyleModel getStyle() {
		return this.style;
	}
	public CTTextBodyModel getTxBody() {
		return this.txBody;
	}
}
