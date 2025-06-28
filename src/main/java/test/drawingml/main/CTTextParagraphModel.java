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
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.main.CTTextParagraphModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;
import test.drawingml.main.CTTextParagraphModel.ROrBrOrFldModel.*;

// SEQUENCE MODEL
public class CTTextParagraphModel
{
	
	// CHOICE MODEL
	public static class ROrBrOrFldModel
	{
		
		private final int type;
		
		private final Object value;
		
		public ROrBrOrFldModel() {
			this(-1, null);
		}
		
		private ROrBrOrFldModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static ROrBrOrFldModel createR(CTRegularTextRunModel value) {
			return new ROrBrOrFldModel(0, value);
		}
		public static ROrBrOrFldModel createBr(CTTextLineBreakModel value) {
			return new ROrBrOrFldModel(1, value);
		}
		public static ROrBrOrFldModel createFld(CTTextFieldModel value) {
			return new ROrBrOrFldModel(2, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isR() {
			return this.type == 0;
		}
		
		public CTRegularTextRunModel getR() {
			if (this.type != 0) throw new ClassCastException();
			return (CTRegularTextRunModel) value;
		}
		public boolean isBr() {
			return this.type == 1;
		}
		
		public CTTextLineBreakModel getBr() {
			if (this.type != 1) throw new ClassCastException();
			return (CTTextLineBreakModel) value;
		}
		public boolean isFld() {
			return this.type == 2;
		}
		
		public CTTextFieldModel getFld() {
			if (this.type != 2) throw new ClassCastException();
			return (CTTextFieldModel) value;
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
