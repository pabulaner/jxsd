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
import test.drawingml.chart.CTSurface3DChartModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTSurface3DChartConverter
{
	
	private CTSurface3DChartConverter() {
		// empty
	}
	
	public static CTSurface3DChartModel fromDocx4j(CTSurface3DChart value)
	{
		return new CTSurface3DChartModel(
		CTBooleanConverter.fromDocx4j(value.getWireframe())
		,
		value.getSer().stream().map(CTSurfaceSerConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTBandFmtsConverter.fromDocx4j(value.getBandFmts())
		,
		value.getAxId().stream().map(CTUnsignedIntConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
