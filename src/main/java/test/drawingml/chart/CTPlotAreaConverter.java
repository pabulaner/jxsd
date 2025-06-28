package test.drawingml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.chart.CTPlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.drawingml.chart.CTPlotAreaModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import test.drawingml.chart.CTPlotAreaModel.ValAxOrCatAxOrDateAxModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTPlotAreaConverter
{
	
	// CHOICE CONVERTER
	public static class AreaChartOrArea3DChartOrLineChartConverter
	{
		
		private AreaChartOrArea3DChartOrLineChartConverter() {
			// empty
		}
		
		public static AreaChartOrArea3DChartOrLineChartModel fromDocx4j(AreaChartOrArea3DChartOrLineChart value)
		{
			if (value.getAreaChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createAreaChart(
			CTAreaChartConverter.fromDocx4j(value.getAreaChart())
			);
			if (value.getArea3DChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createArea3DChart(
			CTArea3DChartConverter.fromDocx4j(value.getArea3DChart())
			);
			if (value.getLineChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createLineChart(
			CTLineChartConverter.fromDocx4j(value.getLineChart())
			);
			if (value.getLine3DChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createLine3DChart(
			CTLine3DChartConverter.fromDocx4j(value.getLine3DChart())
			);
			if (value.getStockChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createStockChart(
			CTStockChartConverter.fromDocx4j(value.getStockChart())
			);
			if (value.getRadarChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createRadarChart(
			CTRadarChartConverter.fromDocx4j(value.getRadarChart())
			);
			if (value.getScatterChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createScatterChart(
			CTScatterChartConverter.fromDocx4j(value.getScatterChart())
			);
			if (value.getPieChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createPieChart(
			CTPieChartConverter.fromDocx4j(value.getPieChart())
			);
			if (value.getPie3DChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createPie3DChart(
			CTPie3DChartConverter.fromDocx4j(value.getPie3DChart())
			);
			if (value.getDoughnutChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createDoughnutChart(
			CTDoughnutChartConverter.fromDocx4j(value.getDoughnutChart())
			);
			if (value.getBarChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createBarChart(
			CTBarChartConverter.fromDocx4j(value.getBarChart())
			);
			if (value.getBar3DChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createBar3DChart(
			CTBar3DChartConverter.fromDocx4j(value.getBar3DChart())
			);
			if (value.getOfPieChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createOfPieChart(
			CTOfPieChartConverter.fromDocx4j(value.getOfPieChart())
			);
			if (value.getSurfaceChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createSurfaceChart(
			CTSurfaceChartConverter.fromDocx4j(value.getSurfaceChart())
			);
			if (value.getSurface3DChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createSurface3DChart(
			CTSurface3DChartConverter.fromDocx4j(value.getSurface3DChart())
			);
			if (value.getBubbleChart() != null) return AreaChartOrArea3DChartOrLineChartModel.createBubbleChart(
			CTBubbleChartConverter.fromDocx4j(value.getBubbleChart())
			);
			
			return new AreaChartOrArea3DChartOrLineChartModel();
		}
	}
	// CHOICE CONVERTER
	public static class ValAxOrCatAxOrDateAxConverter
	{
		
		private ValAxOrCatAxOrDateAxConverter() {
			// empty
		}
		
		public static ValAxOrCatAxOrDateAxModel fromDocx4j(ValAxOrCatAxOrDateAx value)
		{
			if (value.getValAx() != null) return ValAxOrCatAxOrDateAxModel.createValAx(
			CTValAxConverter.fromDocx4j(value.getValAx())
			);
			if (value.getCatAx() != null) return ValAxOrCatAxOrDateAxModel.createCatAx(
			CTCatAxConverter.fromDocx4j(value.getCatAx())
			);
			if (value.getDateAx() != null) return ValAxOrCatAxOrDateAxModel.createDateAx(
			CTDateAxConverter.fromDocx4j(value.getDateAx())
			);
			if (value.getSerAx() != null) return ValAxOrCatAxOrDateAxModel.createSerAx(
			CTSerAxConverter.fromDocx4j(value.getSerAx())
			);
			
			return new ValAxOrCatAxOrDateAxModel();
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
		value.getAreaChartOrArea3DChartOrLineChart().stream().map(AreaChartOrArea3DChartOrLineChartConverter::fromDocx4j).collect(Collectors.toList())
		,
		value.getValAxOrCatAxOrDateAx().stream().map(ValAxOrCatAxOrDateAxConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTDTableConverter.fromDocx4j(value.getDTable())
		,
		CTShapePropertiesConverter.fromDocx4j(value.getSpPr())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
