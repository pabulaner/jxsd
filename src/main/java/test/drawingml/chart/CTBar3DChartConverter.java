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
import test.drawingml.chart.CTBar3DChartModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTBar3DChartConverter
{
	
	private CTBar3DChartConverter() {
		// empty
	}
	
	public static CTBar3DChartModel fromDocx4j(CTBar3DChart value)
	{
		return new CTBar3DChartModel(
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
		CTGapAmountConverter.fromDocx4j(value.getGapDepth())
		,
		CTShapeConverter.fromDocx4j(value.getShape())
		,
		value.getAxId().stream().map(CTUnsignedIntConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
