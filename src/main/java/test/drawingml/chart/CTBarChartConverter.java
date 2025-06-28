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
import test.drawingml.chart.CTBarChartModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTBarChartConverter
{
	
	private CTBarChartConverter() {
		// empty
	}
	
	public static CTBarChartModel fromDocx4j(CTBarChart value)
	{
		return new CTBarChartModel(
		CTBarDirConverter.fromDocx4j(value.getBarDir())
		,
		CTBarGroupingConverter.fromDocx4j(value.getGrouping())
		,
		CTBooleanConverter.fromDocx4j(value.getVaryColors())
		,
		value.getSer().stream().map(CTBarSerConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		CTGapAmountConverter.fromDocx4j(value.getGapWidth())
		,
		CTOverlapConverter.fromDocx4j(value.getOverlap())
		,
		value.getSerLines().stream().map(CTChartLinesConverter::fromDocx4j).collect(Collectors.toList())
		,
		value.getAxId().stream().map(CTUnsignedIntConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
