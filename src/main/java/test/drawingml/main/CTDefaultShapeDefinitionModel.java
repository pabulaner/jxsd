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
import test.drawingml.chart.*;
import test.drawingml.main.CTDefaultShapeDefinitionModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTDefaultShapeDefinitionModel
{
	
	private final CTShapePropertiesModel spPr;
	private final CTTextBodyPropertiesModel bodyPr;
	private final CTTextListStyleModel lstStyle;
	private final CTShapeStyleModel style;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTDefaultShapeDefinitionModel(CTShapePropertiesModel spPr, CTTextBodyPropertiesModel bodyPr, CTTextListStyleModel lstStyle, CTShapeStyleModel style, CTOfficeArtExtensionListModel extLst) {
		this.spPr = spPr;
		this.bodyPr = bodyPr;
		this.lstStyle = lstStyle;
		this.style = style;
		this.extLst = extLst;
	}
	
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTTextBodyPropertiesModel getBodyPr() {
		return this.bodyPr;
	}
	public CTTextListStyleModel getLstStyle() {
		return this.lstStyle;
	}
	public CTShapeStyleModel getStyle() {
		return this.style;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
