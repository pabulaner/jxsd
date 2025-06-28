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
import test.drawingml.main.CTDefaultShapeDefinitionModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
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
