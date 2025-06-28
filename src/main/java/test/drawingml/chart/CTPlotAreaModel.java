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

// SEQUENCE MODEL
public class CTPlotAreaModel
{
	
	// CHOICE MODEL
	public static class AreaChartOrArea3DChartOrLineChartModel
	{
		
		private final int type;
		
		private final Object value;
		
		public AreaChartOrArea3DChartOrLineChartModel() {
			this(-1, null);
		}
		
		private AreaChartOrArea3DChartOrLineChartModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static AreaChartOrArea3DChartOrLineChartModel createAreaChart(CTAreaChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(0, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createArea3DChart(CTArea3DChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(1, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createLineChart(CTLineChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(2, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createLine3DChart(CTLine3DChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(3, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createStockChart(CTStockChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(4, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createRadarChart(CTRadarChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(5, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createScatterChart(CTScatterChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(6, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createPieChart(CTPieChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(7, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createPie3DChart(CTPie3DChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(8, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createDoughnutChart(CTDoughnutChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(9, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createBarChart(CTBarChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(10, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createBar3DChart(CTBar3DChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(11, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createOfPieChart(CTOfPieChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(12, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createSurfaceChart(CTSurfaceChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(13, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createSurface3DChart(CTSurface3DChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(14, value);
		}
		public static AreaChartOrArea3DChartOrLineChartModel createBubbleChart(CTBubbleChartModel value) {
			return new AreaChartOrArea3DChartOrLineChartModel(15, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isAreaChart() {
			return this.type == 0;
		}
		
		public CTAreaChartModel getAreaChart() {
			if (this.type != 0) throw new ClassCastException();
			return (CTAreaChartModel) value;
		}
		public boolean isArea3DChart() {
			return this.type == 1;
		}
		
		public CTArea3DChartModel getArea3DChart() {
			if (this.type != 1) throw new ClassCastException();
			return (CTArea3DChartModel) value;
		}
		public boolean isLineChart() {
			return this.type == 2;
		}
		
		public CTLineChartModel getLineChart() {
			if (this.type != 2) throw new ClassCastException();
			return (CTLineChartModel) value;
		}
		public boolean isLine3DChart() {
			return this.type == 3;
		}
		
		public CTLine3DChartModel getLine3DChart() {
			if (this.type != 3) throw new ClassCastException();
			return (CTLine3DChartModel) value;
		}
		public boolean isStockChart() {
			return this.type == 4;
		}
		
		public CTStockChartModel getStockChart() {
			if (this.type != 4) throw new ClassCastException();
			return (CTStockChartModel) value;
		}
		public boolean isRadarChart() {
			return this.type == 5;
		}
		
		public CTRadarChartModel getRadarChart() {
			if (this.type != 5) throw new ClassCastException();
			return (CTRadarChartModel) value;
		}
		public boolean isScatterChart() {
			return this.type == 6;
		}
		
		public CTScatterChartModel getScatterChart() {
			if (this.type != 6) throw new ClassCastException();
			return (CTScatterChartModel) value;
		}
		public boolean isPieChart() {
			return this.type == 7;
		}
		
		public CTPieChartModel getPieChart() {
			if (this.type != 7) throw new ClassCastException();
			return (CTPieChartModel) value;
		}
		public boolean isPie3DChart() {
			return this.type == 8;
		}
		
		public CTPie3DChartModel getPie3DChart() {
			if (this.type != 8) throw new ClassCastException();
			return (CTPie3DChartModel) value;
		}
		public boolean isDoughnutChart() {
			return this.type == 9;
		}
		
		public CTDoughnutChartModel getDoughnutChart() {
			if (this.type != 9) throw new ClassCastException();
			return (CTDoughnutChartModel) value;
		}
		public boolean isBarChart() {
			return this.type == 10;
		}
		
		public CTBarChartModel getBarChart() {
			if (this.type != 10) throw new ClassCastException();
			return (CTBarChartModel) value;
		}
		public boolean isBar3DChart() {
			return this.type == 11;
		}
		
		public CTBar3DChartModel getBar3DChart() {
			if (this.type != 11) throw new ClassCastException();
			return (CTBar3DChartModel) value;
		}
		public boolean isOfPieChart() {
			return this.type == 12;
		}
		
		public CTOfPieChartModel getOfPieChart() {
			if (this.type != 12) throw new ClassCastException();
			return (CTOfPieChartModel) value;
		}
		public boolean isSurfaceChart() {
			return this.type == 13;
		}
		
		public CTSurfaceChartModel getSurfaceChart() {
			if (this.type != 13) throw new ClassCastException();
			return (CTSurfaceChartModel) value;
		}
		public boolean isSurface3DChart() {
			return this.type == 14;
		}
		
		public CTSurface3DChartModel getSurface3DChart() {
			if (this.type != 14) throw new ClassCastException();
			return (CTSurface3DChartModel) value;
		}
		public boolean isBubbleChart() {
			return this.type == 15;
		}
		
		public CTBubbleChartModel getBubbleChart() {
			if (this.type != 15) throw new ClassCastException();
			return (CTBubbleChartModel) value;
		}
	}
	// CHOICE MODEL
	public static class ValAxOrCatAxOrDateAxModel
	{
		
		private final int type;
		
		private final Object value;
		
		public ValAxOrCatAxOrDateAxModel() {
			this(-1, null);
		}
		
		private ValAxOrCatAxOrDateAxModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static ValAxOrCatAxOrDateAxModel createValAx(CTValAxModel value) {
			return new ValAxOrCatAxOrDateAxModel(0, value);
		}
		public static ValAxOrCatAxOrDateAxModel createCatAx(CTCatAxModel value) {
			return new ValAxOrCatAxOrDateAxModel(1, value);
		}
		public static ValAxOrCatAxOrDateAxModel createDateAx(CTDateAxModel value) {
			return new ValAxOrCatAxOrDateAxModel(2, value);
		}
		public static ValAxOrCatAxOrDateAxModel createSerAx(CTSerAxModel value) {
			return new ValAxOrCatAxOrDateAxModel(3, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isValAx() {
			return this.type == 0;
		}
		
		public CTValAxModel getValAx() {
			if (this.type != 0) throw new ClassCastException();
			return (CTValAxModel) value;
		}
		public boolean isCatAx() {
			return this.type == 1;
		}
		
		public CTCatAxModel getCatAx() {
			if (this.type != 1) throw new ClassCastException();
			return (CTCatAxModel) value;
		}
		public boolean isDateAx() {
			return this.type == 2;
		}
		
		public CTDateAxModel getDateAx() {
			if (this.type != 2) throw new ClassCastException();
			return (CTDateAxModel) value;
		}
		public boolean isSerAx() {
			return this.type == 3;
		}
		
		public CTSerAxModel getSerAx() {
			if (this.type != 3) throw new ClassCastException();
			return (CTSerAxModel) value;
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
