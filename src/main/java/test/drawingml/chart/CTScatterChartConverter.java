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
import test.drawingml.chart.CTScatterChartModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTScatterChartConverter
{
	
	private CTScatterChartConverter() {
		// empty
	}
	
	public static CTScatterChartModel fromDocx4j(CTScatterChart value)
	{
		return new CTScatterChartModel(
		CTScatterStyleConverter.fromDocx4j(value.getScatterStyle())
		,
		CTBooleanConverter.fromDocx4j(value.getVaryColors())
		,
		value.getSer().stream().map(CTScatterSerConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		value.getAxId().stream().map(CTUnsignedIntConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
