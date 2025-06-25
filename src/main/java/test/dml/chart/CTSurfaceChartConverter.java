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
import test.dml.chart.CTSurfaceChartModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTSurfaceChartConverter
{
	
	private CTSurfaceChartConverter() {
		// empty
	}
	
	public static CTSurfaceChartModel fromDocx4j(CTSurfaceChart value)
	{
		return new CTSurfaceChartModel(
		CTBooleanConverter.fromDocx4j(value.getWireframe())
		,
		value.getSer().stream().map(CTSurfaceSerConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTBandFmtsConverter.fromDocx4j(value.getBandFmts())
		,
		value.getAxId().stream().map(CTUnsignedIntConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
