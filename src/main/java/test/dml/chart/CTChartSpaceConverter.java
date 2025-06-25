package test.dml.chart;

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
import test.dml.chart.CTChartSpaceModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTChartSpaceConverter
{
	
	private CTChartSpaceConverter() {
		// empty
	}
	
	public static CTChartSpaceModel fromDocx4j(CTChartSpace value)
	{
		return new CTChartSpaceModel(
		CTBooleanConverter.fromDocx4j(value.getDate1904())
		,
		CTTextLanguageIDConverter.fromDocx4j(value.getLang())
		,
		CTBooleanConverter.fromDocx4j(value.getRoundedCorners())
		,
		CTStyleConverter.fromDocx4j(value.getStyle())
		,
		CTColorMappingConverter.fromDocx4j(value.getClrMapOvr())
		,
		CTPivotSourceConverter.fromDocx4j(value.getPivotSource())
		,
		CTProtectionConverter.fromDocx4j(value.getProtection())
		,
		CTChartConverter.fromDocx4j(value.getChart())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTTextBodyConverter.fromDocx4j(value.getTxPr())
		,
		CTExternalDataConverter.fromDocx4j(value.getExternalData())
		,
		CTPrintSettingsConverter.fromDocx4j(value.getPrintSettings())
		,
		CTRelIdConverter.fromDocx4j(value.getUserShapes())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
