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
import test.dml.CTTextBodyModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTTextBodyModel
{
	
	private final CTTextBodyPropertiesModel bodyPr;
	private final CTTextListStyleModel lstStyle;
	private final List<CTTextParagraphModel> p;
	
	public CTTextBodyModel(CTTextBodyPropertiesModel bodyPr, CTTextListStyleModel lstStyle, List<CTTextParagraphModel> p) {
		this.bodyPr = bodyPr;
		this.lstStyle = lstStyle;
		this.p = p;
	}
	
	public CTTextBodyPropertiesModel getBodyPr() {
		return this.bodyPr;
	}
	public CTTextListStyleModel getLstStyle() {
		return this.lstStyle;
	}
	public List<CTTextParagraphModel> getP() {
		return this.p;
	}
}
