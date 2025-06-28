package test.drawingml.chart;

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
import test.drawingml.chart.CTAreaChartModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTAreaChartConverter
{
	
	private CTAreaChartConverter() {
		// empty
	}
	
	public static CTAreaChartModel fromDocx4j(CTAreaChart value)
	{
		return new CTAreaChartModel(
		CTGroupingConverter.fromDocx4j(value.getGrouping())
		,
		CTBooleanConverter.fromDocx4j(value.getVaryColors())
		,
		value.getSer().stream().map(CTAreaSerConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		CTChartLinesConverter.fromDocx4j(value.getDropLines())
		,
		value.getAxId().stream().map(CTUnsignedIntConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
