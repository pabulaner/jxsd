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

public class CTDefaultShapeDefinitionConverter
{
	
	private CTDefaultShapeDefinitionConverter() {
		// empty
	}
	
	public static CTDefaultShapeDefinitionModel fromDocx4j(CTDefaultShapeDefinition value)
	{
		return new CTDefaultShapeDefinitionModel(
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTTextBodyPropertiesConverter.fromDocx4j(value.getBodyPr())
		,
		CTTextListStyleConverter.fromDocx4j(value.getLstStyle())
		,
		CTShapeStyleConverter.fromDocx4j(value.getStyle())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
