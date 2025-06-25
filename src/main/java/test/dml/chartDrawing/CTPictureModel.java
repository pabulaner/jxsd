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
import test.dml.chartDrawing.CTPictureModel.*;
import test.officeDocument.relationships.*;

public class CTPictureModel
{
	
	private final BooleanModel fPublished;
	private final StringModel macro;
	private final CTPictureNonVisualModel nvPicPr;
	private final CTBlipFillPropertiesModel blipFill;
	private final CTShapePropertiesModel spPr;
	private final CTShapeStyleModel style;
	
	public CTPictureModel(BooleanModel fPublished, StringModel macro, CTPictureNonVisualModel nvPicPr, CTBlipFillPropertiesModel blipFill, CTShapePropertiesModel spPr, CTShapeStyleModel style) {
		this.fPublished = fPublished;
		this.macro = macro;
		this.nvPicPr = nvPicPr;
		this.blipFill = blipFill;
		this.spPr = spPr;
		this.style = style;
	}
	
	public BooleanModel getFPublished() {
		return this.fPublished;
	}
	public StringModel getMacro() {
		return this.macro;
	}
	public CTPictureNonVisualModel getNvPicPr() {
		return this.nvPicPr;
	}
	public CTBlipFillPropertiesModel getBlipFill() {
		return this.blipFill;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTShapeStyleModel getStyle() {
		return this.style;
	}
}
