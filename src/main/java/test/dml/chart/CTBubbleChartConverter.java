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
import test.dml.chart.CTBubbleChartModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTBubbleChartConverter
{
	
	private CTBubbleChartConverter() {
		// empty
	}
	
	public static CTBubbleChartModel fromDocx4j(CTBubbleChart value)
	{
		return new CTBubbleChartModel(
		CTBooleanConverter.fromDocx4j(value.getVaryColors())
		,
		value.getSer().stream().map(CTBubbleSerConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		CTBooleanConverter.fromDocx4j(value.getBubble3D())
		,
		CTBubbleScaleConverter.fromDocx4j(value.getBubbleScale())
		,
		CTBooleanConverter.fromDocx4j(value.getShowNegBubbles())
		,
		CTSizeRepresentsConverter.fromDocx4j(value.getSizeRepresents())
		,
		value.getAxId().stream().map(CTUnsignedIntConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
