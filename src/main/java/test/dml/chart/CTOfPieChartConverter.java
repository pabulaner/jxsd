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
import test.dml.chart.CTOfPieChartModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTOfPieChartConverter
{
	
	private CTOfPieChartConverter() {
		// empty
	}
	
	public static CTOfPieChartModel fromDocx4j(CTOfPieChart value)
	{
		return new CTOfPieChartModel(
		CTOfPieTypeConverter.fromDocx4j(value.getOfPieType())
		,
		CTBooleanConverter.fromDocx4j(value.getVaryColors())
		,
		value.getSer().stream().map(CTPieSerConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTDLblsConverter.fromDocx4j(value.getDLbls())
		,
		CTGapAmountConverter.fromDocx4j(value.getGapWidth())
		,
		CTSplitTypeConverter.fromDocx4j(value.getSplitType())
		,
		CTDoubleConverter.fromDocx4j(value.getSplitPos())
		,
		CTCustSplitConverter.fromDocx4j(value.getCustSplit())
		,
		CTSecondPieSizeConverter.fromDocx4j(value.getSecondPieSize())
		,
		value.getSerLines().stream().map(CTChartLinesConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
