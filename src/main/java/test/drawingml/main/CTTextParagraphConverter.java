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

// SEQUENCE CONVERTER
public class CTTextParagraphConverter
{
	
	// CHOICE CONVERTER
	public static class ROrBrOrFldConverter
	{
		
		private ROrBrOrFldConverter() {
			// empty
		}
		
		public static ROrBrOrFldModel fromDocx4j(ROrBrOrFld value)
		{
			if (value.getR() != null) return ROrBrOrFldModel.createR(
			CTRegularTextRunConverter.fromDocx4j(value.getR())
			);
			if (value.getBr() != null) return ROrBrOrFldModel.createBr(
			CTTextLineBreakConverter.fromDocx4j(value.getBr())
			);
			if (value.getFld() != null) return ROrBrOrFldModel.createFld(
			CTTextFieldConverter.fromDocx4j(value.getFld())
			);
			
			return new ROrBrOrFldModel();
		}
	}
	private CTTextParagraphConverter() {
		// empty
	}
	
	public static CTTextParagraphModel fromDocx4j(CTTextParagraph value)
	{
		return new CTTextParagraphModel(
		CTTextParagraphPropertiesConverter.fromDocx4j(value.getPPr())
		,
		value.getROrBrOrFld().stream().map(ROrBrOrFldConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTTextCharacterPropertiesConverter.fromDocx4j(value.getEndParaRPr())
		
		);
	}
}
