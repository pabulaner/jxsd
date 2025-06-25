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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chart.CTLegendModel.*;
import test.officeDocument.relationships.*;

public class CTLegendConverter
{
	
	private CTLegendConverter() {
		// empty
	}
	
	public static CTLegendModel fromDocx4j(CTLegend value)
	{
		return new CTLegendModel(
		CTLegendPosConverter.fromDocx4j(value.getLegendPos())
		,
		value.getLegendEntry().stream().map(CTLegendEntryConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTLayoutConverter.fromDocx4j(value.getLayout())
		,
		CTBooleanConverter.fromDocx4j(value.getOverlay())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTTextBodyConverter.fromDocx4j(value.getTxPr())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
