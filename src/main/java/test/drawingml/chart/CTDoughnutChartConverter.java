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
import test.drawingml.chart.CTDoughnutChartModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTDoughnutChartConverter
{
	
	private CTDoughnutChartConverter() {
		// empty
	}
	
	public static CTDoughnutChartModel fromDocx4j(CTDoughnutChart value)
	{
		return new CTDoughnutChartModel(
		CTBooleanConverter.fromDocx4j(value.getVaryColors())
		,
		value.getSer().stream().map(CTPieSerConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		CTFirstSliceAngConverter.fromDocx4j(value.getFirstSliceAng())
		,
		CTHoleSizeConverter.fromDocx4j(value.getHoleSize())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
