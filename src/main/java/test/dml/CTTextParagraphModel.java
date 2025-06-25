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
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTTextParagraphModel.*;
import test.dml.CTTextParagraphModel.ROrBrOrFldModel.*;
import test.officeDocument.relationships.*;

public class CTTextParagraphModel
{
	
	public static class ROrBrOrFldModel
	{
		
		private final CTRegularTextRunModel r;
		private final CTTextLineBreakModel br;
		private final CTTextFieldModel fld;
		
		public ROrBrOrFldModel(CTRegularTextRunModel r, CTTextLineBreakModel br, CTTextFieldModel fld) {
			this.r = r;
			this.br = br;
			this.fld = fld;
		}
		
		public CTRegularTextRunModel getR() {
			return this.r;
		}
		public CTTextLineBreakModel getBr() {
			return this.br;
		}
		public CTTextFieldModel getFld() {
			return this.fld;
		}
	}
	private final CTTextParagraphPropertiesModel pPr;
	private final List<ROrBrOrFldModel> rOrBrOrFld;
	private final CTTextCharacterPropertiesModel endParaRPr;
	
	public CTTextParagraphModel(CTTextParagraphPropertiesModel pPr, List<ROrBrOrFldModel> rOrBrOrFld, CTTextCharacterPropertiesModel endParaRPr) {
		this.pPr = pPr;
		this.rOrBrOrFld = rOrBrOrFld;
		this.endParaRPr = endParaRPr;
	}
	
	public CTTextParagraphPropertiesModel getPPr() {
		return this.pPr;
	}
	public List<ROrBrOrFldModel> getROrBrOrFld() {
		return this.rOrBrOrFld;
	}
	public CTTextCharacterPropertiesModel getEndParaRPr() {
		return this.endParaRPr;
	}
}
