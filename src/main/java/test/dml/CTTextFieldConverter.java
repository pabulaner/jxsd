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
import test.dml.CTTextFieldModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTTextFieldConverter
{
	
	private CTTextFieldConverter() {
		// empty
	}
	
	public static CTTextFieldModel fromDocx4j(CTTextField value)
	{
		return new CTTextFieldModel(
		StringConverter.fromDocx4j(value.getType())
		,
		STGuidConverter.fromDocx4j(value.getId())
		,
		CTTextCharacterPropertiesConverter.fromDocx4j(value.getRPr())
		,
		CTTextParagraphPropertiesConverter.fromDocx4j(value.getPPr())
		,
		StringConverter.fromDocx4j(value.getT())
		
		);
	}
}
