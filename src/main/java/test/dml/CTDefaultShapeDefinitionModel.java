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
import test.dml.CTDefaultShapeDefinitionModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
