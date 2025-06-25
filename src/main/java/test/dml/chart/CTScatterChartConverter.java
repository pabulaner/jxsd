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
import test.dml.chart.CTScatterChartModel.*;
import test.officeDocument.relationships.*;

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
		value.getSer().stream().map(CTScatterSerConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		value.getAxId().stream().map(CTUnsignedIntConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
