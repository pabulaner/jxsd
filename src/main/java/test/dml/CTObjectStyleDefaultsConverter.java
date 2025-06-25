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
import test.dml.CTObjectStyleDefaultsModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTObjectStyleDefaultsConverter
{
	
	private CTObjectStyleDefaultsConverter() {
		// empty
	}
	
	public static CTObjectStyleDefaultsModel fromDocx4j(CTObjectStyleDefaults value)
	{
		return new CTObjectStyleDefaultsModel(
		CTDefaultShapeDefinitionConverter.fromDocx4j(value.getSpDef())
		,
		CTDefaultShapeDefinitionConverter.fromDocx4j(value.getLnDef())
		,
		CTDefaultShapeDefinitionConverter.fromDocx4j(value.getTxDef())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
