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
import test.dml.chart.CTLine3DChartModel.*;
import test.officeDocument.relationships.*;

public class CTLine3DChartConverter
{
	
	private CTLine3DChartConverter() {
		// empty
	}
	
	public static CTLine3DChartModel fromDocx4j(CTLine3DChart value)
	{
		return new CTLine3DChartModel(
		CTGroupingConverter.fromDocx4j(value.getGrouping())
		,
		CTBooleanConverter.fromDocx4j(value.getVaryColors())
		,
		value.getSer().stream().map(CTLineSerConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		CTChartLinesConverter.fromDocx4j(value.getDropLines())
		,
		CTGapAmountConverter.fromDocx4j(value.getGapDepth())
		,
		value.getAxId().stream().map(CTUnsignedIntConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
