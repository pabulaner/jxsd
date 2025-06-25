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
import test.officeDocument.relationships.*;
import test.dml.CTPresetTextShapeModel.*;

public class CTPresetTextShapeConverter
{
	
	private CTPresetTextShapeConverter() {
		// empty
	}
	
	public static CTPresetTextShapeModel fromDocx4j(CTPresetTextShape value)
	{
		return new CTPresetTextShapeModel(
		STTextShapeTypeConverter.fromDocx4j(value.getPrst())
		,
		CTGeomGuideListConverter.fromDocx4j(value.getAvLst())
		
		);
	}
}
