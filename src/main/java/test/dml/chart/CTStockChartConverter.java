package test.dml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.CTStockChartModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTStockChartConverter
{
	
	private CTStockChartConverter() {
		// empty
	}
	
	public static CTStockChartModel fromDocx4j(CTStockChart value)
	{
		return new CTStockChartModel(
		value.getSer().stream().map(CTLineSerConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		CTChartLinesConverter.fromDocx4j(value.getDropLines())
		,
		CTChartLinesConverter.fromDocx4j(value.getHiLowLines())
		,
		CTUpDownBarsConverter.fromDocx4j(value.getUpDownBars())
		,
		value.getAxId().stream().map(CTUnsignedIntConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
