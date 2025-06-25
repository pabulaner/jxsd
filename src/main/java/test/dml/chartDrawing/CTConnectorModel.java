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
import test.dml.chartDrawing.CTConnectorModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTConnectorModel
{
	
	private final BooleanModel fPublished;
	private final StringModel macro;
	private final CTConnectorNonVisualModel nvCxnSpPr;
	private final CTShapePropertiesModel spPr;
	private final CTShapeStyleModel style;
	
	public CTConnectorModel(BooleanModel fPublished, StringModel macro, CTConnectorNonVisualModel nvCxnSpPr, CTShapePropertiesModel spPr, CTShapeStyleModel style) {
		this.fPublished = fPublished;
		this.macro = macro;
		this.nvCxnSpPr = nvCxnSpPr;
		this.spPr = spPr;
		this.style = style;
	}
	
	public BooleanModel getFPublished() {
		return this.fPublished;
	}
	public StringModel getMacro() {
		return this.macro;
	}
	public CTConnectorNonVisualModel getNvCxnSpPr() {
		return this.nvCxnSpPr;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTShapeStyleModel getStyle() {
		return this.style;
	}
}
