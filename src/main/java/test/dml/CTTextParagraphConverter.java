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

public class CTTextParagraphConverter
{
	
	public static class ROrBrOrFldConverter
	{
		
		private CTTextParagraphConverter() {
			// empty
		}
		
		public static CTTextParagraphModel fromDocx4j(CTTextParagraph value)
		{
			return new ROrBrOrFldModel(
			CTRegularTextRunConverter.fromDocx4j(value.getR())
			,
			CTTextLineBreakConverter.fromDocx4j(value.getBr())
			,
			CTTextFieldConverter.fromDocx4j(value.getFld())
			
			);
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
		value.getROrBrOrFld().stream().map(ROrBrOrFldConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTTextCharacterPropertiesConverter.fromDocx4j(value.getEndParaRPr())
		
		);
	}
}
