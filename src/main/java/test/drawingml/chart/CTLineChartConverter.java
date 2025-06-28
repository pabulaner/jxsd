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
import test.drawingml.chart.CTLineChartModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTLineChartConverter
{
	
	private CTLineChartConverter() {
		// empty
	}
	
	public static CTLineChartModel fromDocx4j(CTLineChart value)
	{
		return new CTLineChartModel(
		CTGroupingConverter.fromDocx4j(value.getGrouping())
		,
		CTBooleanConverter.fromDocx4j(value.getVaryColors())
		,
		value.getSer().stream().map(CTLineSerConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		CTChartLinesConverter.fromDocx4j(value.getDropLines())
		,
		CTChartLinesConverter.fromDocx4j(value.getHiLowLines())
		,
		CTUpDownBarsConverter.fromDocx4j(value.getUpDownBars())
		,
		CTBooleanConverter.fromDocx4j(value.getMarker())
		,
		CTBooleanConverter.fromDocx4j(value.getSmooth())
		,
		value.getAxId().stream().map(CTUnsignedIntConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
