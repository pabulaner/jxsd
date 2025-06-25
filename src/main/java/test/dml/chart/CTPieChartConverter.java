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
import test.dml.chart.CTPieChartModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPieChartConverter
{
	
	private CTPieChartConverter() {
		// empty
	}
	
	public static CTPieChartModel fromDocx4j(CTPieChart value)
	{
		return new CTPieChartModel(
		CTBooleanConverter.fromDocx4j(value.getVaryColors())
		,
		value.getSer().stream().map(CTPieSerConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		CTFirstSliceAngConverter.fromDocx4j(value.getFirstSliceAng())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
