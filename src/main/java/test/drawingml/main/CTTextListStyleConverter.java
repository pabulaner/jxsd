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
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;
import test.drawingml.main.CTTextListStyleModel.*;

// SEQUENCE CONVERTER
public class CTTextListStyleConverter
{
	
	private CTTextListStyleConverter() {
		// empty
	}
	
	public static CTTextListStyleModel fromDocx4j(CTTextListStyle value)
	{
		return new CTTextListStyleModel(
		CTTextParagraphPropertiesConverter.fromDocx4j(value.getDefPPr())
		,
		CTTextParagraphPropertiesConverter.fromDocx4j(value.getLvl1pPr())
		,
		CTTextParagraphPropertiesConverter.fromDocx4j(value.getLvl2pPr())
		,
		CTTextParagraphPropertiesConverter.fromDocx4j(value.getLvl3pPr())
		,
		CTTextParagraphPropertiesConverter.fromDocx4j(value.getLvl4pPr())
		,
		CTTextParagraphPropertiesConverter.fromDocx4j(value.getLvl5pPr())
		,
		CTTextParagraphPropertiesConverter.fromDocx4j(value.getLvl6pPr())
		,
		CTTextParagraphPropertiesConverter.fromDocx4j(value.getLvl7pPr())
		,
		CTTextParagraphPropertiesConverter.fromDocx4j(value.getLvl8pPr())
		,
		CTTextParagraphPropertiesConverter.fromDocx4j(value.getLvl9pPr())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
