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

public class CTPlotAreaModel
{
	
	public static class AreaChartOrArea3DChartOrLineChartModel
	{
		
		private final CTAreaChartModel areaChart;
		private final CTArea3DChartModel area3DChart;
		private final CTLineChartModel lineChart;
		private final CTLine3DChartModel line3DChart;
		private final CTStockChartModel stockChart;
		private final CTRadarChartModel radarChart;
		private final CTScatterChartModel scatterChart;
		private final CTPieChartModel pieChart;
		private final CTPie3DChartModel pie3DChart;
		private final CTDoughnutChartModel doughnutChart;
		private final CTBarChartModel barChart;
		private final CTBar3DChartModel bar3DChart;
		private final CTOfPieChartModel ofPieChart;
		private final CTSurfaceChartModel surfaceChart;
		private final CTSurface3DChartModel surface3DChart;
		private final CTBubbleChartModel bubbleChart;
		
		public AreaChartOrArea3DChartOrLineChartModel(CTAreaChartModel areaChart, CTArea3DChartModel area3DChart, CTLineChartModel lineChart, CTLine3DChartModel line3DChart, CTStockChartModel stockChart, CTRadarChartModel radarChart, CTScatterChartModel scatterChart, CTPieChartModel pieChart, CTPie3DChartModel pie3DChart, CTDoughnutChartModel doughnutChart, CTBarChartModel barChart, CTBar3DChartModel bar3DChart, CTOfPieChartModel ofPieChart, CTSurfaceChartModel surfaceChart, CTSurface3DChartModel surface3DChart, CTBubbleChartModel bubbleChart) {
			this.areaChart = areaChart;
			this.area3DChart = area3DChart;
			this.lineChart = lineChart;
			this.line3DChart = line3DChart;
			this.stockChart = stockChart;
			this.radarChart = radarChart;
			this.scatterChart = scatterChart;
			this.pieChart = pieChart;
			this.pie3DChart = pie3DChart;
			this.doughnutChart = doughnutChart;
			this.barChart = barChart;
			this.bar3DChart = bar3DChart;
			this.ofPieChart = ofPieChart;
			this.surfaceChart = surfaceChart;
			this.surface3DChart = surface3DChart;
			this.bubbleChart = bubbleChart;
		}
		
		public CTAreaChartModel getAreaChart() {
			return this.areaChart;
		}
		public CTArea3DChartModel getArea3DChart() {
			return this.area3DChart;
		}
		public CTLineChartModel getLineChart() {
			return this.lineChart;
		}
		public CTLine3DChartModel getLine3DChart() {
			return this.line3DChart;
		}
		public CTStockChartModel getStockChart() {
			return this.stockChart;
		}
		public CTRadarChartModel getRadarChart() {
			return this.radarChart;
		}
		public CTScatterChartModel getScatterChart() {
			return this.scatterChart;
		}
		public CTPieChartModel getPieChart() {
			return this.pieChart;
		}
		public CTPie3DChartModel getPie3DChart() {
			return this.pie3DChart;
		}
		public CTDoughnutChartModel getDoughnutChart() {
			return this.doughnutChart;
		}
		public CTBarChartModel getBarChart() {
			return this.barChart;
		}
		public CTBar3DChartModel getBar3DChart() {
			return this.bar3DChart;
		}
		public CTOfPieChartModel getOfPieChart() {
			return this.ofPieChart;
		}
		public CTSurfaceChartModel getSurfaceChart() {
			return this.surfaceChart;
		}
		public CTSurface3DChartModel getSurface3DChart() {
			return this.surface3DChart;
		}
		public CTBubbleChartModel getBubbleChart() {
			return this.bubbleChart;
		}
	}
	public static class ValAxOrCatAxOrDateAxModel
	{
		
		private final CTValAxModel valAx;
		private final CTCatAxModel catAx;
		private final CTDateAxModel dateAx;
		private final CTSerAxModel serAx;
		
		public ValAxOrCatAxOrDateAxModel(CTValAxModel valAx, CTCatAxModel catAx, CTDateAxModel dateAx, CTSerAxModel serAx) {
			this.valAx = valAx;
			this.catAx = catAx;
			this.dateAx = dateAx;
			this.serAx = serAx;
		}
		
		public CTValAxModel getValAx() {
			return this.valAx;
		}
		public CTCatAxModel getCatAx() {
			return this.catAx;
		}
		public CTDateAxModel getDateAx() {
			return this.dateAx;
		}
		public CTSerAxModel getSerAx() {
			return this.serAx;
		}
	}
	private final CTLayoutModel layout;
	private final List<AreaChartOrArea3DChartOrLineChartModel> areaChartOrArea3DChartOrLineChart;
	private final List<ValAxOrCatAxOrDateAxModel> valAxOrCatAxOrDateAx;
	private final CTDTableModel dTable;
	private final CTShapePropertiesModel spPr;
	private final CTExtensionListModel extLst;
	
	public CTPlotAreaModel(CTLayoutModel layout, List<AreaChartOrArea3DChartOrLineChartModel> areaChartOrArea3DChartOrLineChart, List<ValAxOrCatAxOrDateAxModel> valAxOrCatAxOrDateAx, CTDTableModel dTable, CTShapePropertiesModel spPr, CTExtensionListModel extLst) {
		this.layout = layout;
		this.areaChartOrArea3DChartOrLineChart = areaChartOrArea3DChartOrLineChart;
		this.valAxOrCatAxOrDateAx = valAxOrCatAxOrDateAx;
		this.dTable = dTable;
		this.spPr = spPr;
		this.extLst = extLst;
	}
	
	public CTLayoutModel getLayout() {
		return this.layout;
	}
	public List<AreaChartOrArea3DChartOrLineChartModel> getAreaChartOrArea3DChartOrLineChart() {
		return this.areaChartOrArea3DChartOrLineChart;
	}
	public List<ValAxOrCatAxOrDateAxModel> getValAxOrCatAxOrDateAx() {
		return this.valAxOrCatAxOrDateAx;
	}
	public CTDTableModel getDTable() {
		return this.dTable;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
