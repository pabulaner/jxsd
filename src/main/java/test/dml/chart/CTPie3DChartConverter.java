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
import test.dml.chart.CTPie3DChartModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPie3DChartConverter
{
	
	private CTPie3DChartConverter() {
		// empty
	}
	
	public static CTPie3DChartModel fromDocx4j(CTPie3DChart value)
	{
		return new CTPie3DChartModel(
		CTBooleanConverter.fromDocx4j(value.getVaryColors())
		,
		value.getSer().stream().map(CTPieSerConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
