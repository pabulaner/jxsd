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

public class CTTextBodyConverter
{
	
	private CTTextBodyConverter() {
		// empty
	}
	
	public static CTTextBodyModel fromDocx4j(CTTextBody value)
	{
		return new CTTextBodyModel(
		CTTextBodyPropertiesConverter.fromDocx4j(value.getBodyPr())
		,
		CTTextListStyleConverter.fromDocx4j(value.getLstStyle())
		,
		value.getP().stream().map(CTTextParagraphConverter::fromDocx4j).collect(Collectors.toList());
		
		);
	}
}
