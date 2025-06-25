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
import test.dml.chart.CTPlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.*;
import test.dml.chart.CTPlotAreaModel.ValAxOrCatAxOrDateAxModel.*;
import test.dml.chart.CTPlotAreaModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPlotAreaConverter
{
	
	public static class AreaChartOrArea3DChartOrLineChartConverter
	{
		
		private CTPlotAreaConverter() {
			// empty
		}
		
		public static CTPlotAreaModel fromDocx4j(CTPlotArea value)
		{
			return new AreaChartOrArea3DChartOrLineChartModel(
			CTAreaChartConverter.fromDocx4j(value.getAreaChart())
			,
			CTArea3DChartConverter.fromDocx4j(value.getArea3DChart())
			,
			CTLineChartConverter.fromDocx4j(value.getLineChart())
			,
			CTLine3DChartConverter.fromDocx4j(value.getLine3DChart())
			,
			CTStockChartConverter.fromDocx4j(value.getStockChart())
			,
			CTRadarChartConverter.fromDocx4j(value.getRadarChart())
			,
			CTScatterChartConverter.fromDocx4j(value.getScatterChart())
			,
			CTPieChartConverter.fromDocx4j(value.getPieChart())
			,
			CTPie3DChartConverter.fromDocx4j(value.getPie3DChart())
			,
			CTDoughnutChartConverter.fromDocx4j(value.getDoughnutChart())
			,
			CTBarChartConverter.fromDocx4j(value.getBarChart())
			,
			CTBar3DChartConverter.fromDocx4j(value.getBar3DChart())
			,
			CTOfPieChartConverter.fromDocx4j(value.getOfPieChart())
			,
			CTSurfaceChartConverter.fromDocx4j(value.getSurfaceChart())
			,
			CTSurface3DChartConverter.fromDocx4j(value.getSurface3DChart())
			,
			CTBubbleChartConverter.fromDocx4j(value.getBubbleChart())
			
			);
		}
	}
	public static class ValAxOrCatAxOrDateAxConverter
	{
		
		private CTPlotAreaConverter() {
			// empty
		}
		
		public static CTPlotAreaModel fromDocx4j(CTPlotArea value)
		{
			return new ValAxOrCatAxOrDateAxModel(
			CTValAxConverter.fromDocx4j(value.getValAx())
			,
			CTCatAxConverter.fromDocx4j(value.getCatAx())
			,
			CTDateAxConverter.fromDocx4j(value.getDateAx())
			,
			CTSerAxConverter.fromDocx4j(value.getSerAx())
			
			);
		}
	}
	private CTPlotAreaConverter() {
		// empty
	}
	
	public static CTPlotAreaModel fromDocx4j(CTPlotArea value)
	{
		return new CTPlotAreaModel(
		CTLayoutConverter.fromDocx4j(value.getLayout())
		,
		value.getAreaChartOrArea3DChartOrLineChart().stream().map(AreaChartOrArea3DChartOrLineChartConverter::fromDocx4j).collect(Collectors.toList());
		,
		value.getValAxOrCatAxOrDateAx().stream().map(ValAxOrCatAxOrDateAxConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTDTableConverter.fromDocx4j(value.getDTable())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
