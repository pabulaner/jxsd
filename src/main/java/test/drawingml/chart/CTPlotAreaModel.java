package test.drawingml.chart;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.drawingml.main.CTShapePropertiesModel;

public class CTPlotAreaModel {
  private final CTLayoutModel layout;

  private final AreaChartOrArea3DChartOrLineChartModel areaChartOrArea3DChartOrLineChart;

  private final ValAxOrCatAxOrDateAxModel valAxOrCatAxOrDateAx;

  private final CTDTableModel dTable;

  private final CTShapePropertiesModel spPr;

  private final CTExtensionListModel extLst;

  public CTPlotAreaModel(CTLayoutModel layout,
      AreaChartOrArea3DChartOrLineChartModel areaChartOrArea3DChartOrLineChart,
      ValAxOrCatAxOrDateAxModel valAxOrCatAxOrDateAx, CTDTableModel dTable,
      CTShapePropertiesModel spPr, CTExtensionListModel extLst) {
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

  public AreaChartOrArea3DChartOrLineChartModel getAreaChartOrArea3DChartOrLineChart() {
    return this.areaChartOrArea3DChartOrLineChart;
  }

  public ValAxOrCatAxOrDateAxModel getValAxOrCatAxOrDateAx() {
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

  public static class AreaChartOrArea3DChartOrLineChartModel {
    private final Integer type;

    private final Object value;

    public AreaChartOrArea3DChartOrLineChartModel() {
      this(-1, null);
    }

    private AreaChartOrArea3DChartOrLineChartModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newAreaChart(CTAreaChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(0, value);
    }

    public Boolean isAreaChart() {
      return this.type == 0;
    }

    public CTAreaChartModel getAreaChart() {
      return (CTAreaChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newArea3DChart(CTArea3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(1, value);
    }

    public Boolean isArea3DChart() {
      return this.type == 1;
    }

    public CTArea3DChartModel getArea3DChart() {
      return (CTArea3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newLineChart(CTLineChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(2, value);
    }

    public Boolean isLineChart() {
      return this.type == 2;
    }

    public CTLineChartModel getLineChart() {
      return (CTLineChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newLine3DChart(CTLine3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(3, value);
    }

    public Boolean isLine3DChart() {
      return this.type == 3;
    }

    public CTLine3DChartModel getLine3DChart() {
      return (CTLine3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newStockChart(CTStockChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(4, value);
    }

    public Boolean isStockChart() {
      return this.type == 4;
    }

    public CTStockChartModel getStockChart() {
      return (CTStockChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newRadarChart(CTRadarChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(5, value);
    }

    public Boolean isRadarChart() {
      return this.type == 5;
    }

    public CTRadarChartModel getRadarChart() {
      return (CTRadarChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newScatterChart(
        CTScatterChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(6, value);
    }

    public Boolean isScatterChart() {
      return this.type == 6;
    }

    public CTScatterChartModel getScatterChart() {
      return (CTScatterChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newPieChart(CTPieChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(7, value);
    }

    public Boolean isPieChart() {
      return this.type == 7;
    }

    public CTPieChartModel getPieChart() {
      return (CTPieChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newPie3DChart(CTPie3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(8, value);
    }

    public Boolean isPie3DChart() {
      return this.type == 8;
    }

    public CTPie3DChartModel getPie3DChart() {
      return (CTPie3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newDoughnutChart(
        CTDoughnutChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(9, value);
    }

    public Boolean isDoughnutChart() {
      return this.type == 9;
    }

    public CTDoughnutChartModel getDoughnutChart() {
      return (CTDoughnutChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newBarChart(CTBarChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(10, value);
    }

    public Boolean isBarChart() {
      return this.type == 10;
    }

    public CTBarChartModel getBarChart() {
      return (CTBarChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newBar3DChart(CTBar3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(11, value);
    }

    public Boolean isBar3DChart() {
      return this.type == 11;
    }

    public CTBar3DChartModel getBar3DChart() {
      return (CTBar3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newOfPieChart(CTOfPieChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(12, value);
    }

    public Boolean isOfPieChart() {
      return this.type == 12;
    }

    public CTOfPieChartModel getOfPieChart() {
      return (CTOfPieChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newSurfaceChart(
        CTSurfaceChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(13, value);
    }

    public Boolean isSurfaceChart() {
      return this.type == 13;
    }

    public CTSurfaceChartModel getSurfaceChart() {
      return (CTSurfaceChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newSurface3DChart(
        CTSurface3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(14, value);
    }

    public Boolean isSurface3DChart() {
      return this.type == 14;
    }

    public CTSurface3DChartModel getSurface3DChart() {
      return (CTSurface3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newBubbleChart(CTBubbleChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(15, value);
    }

    public Boolean isBubbleChart() {
      return this.type == 15;
    }

    public CTBubbleChartModel getBubbleChart() {
      return (CTBubbleChartModel) this.value;
    }
  }

  public static class ValAxOrCatAxOrDateAxModel {
    private final Integer type;

    private final Object value;

    public ValAxOrCatAxOrDateAxModel() {
      this(-1, null);
    }

    private ValAxOrCatAxOrDateAxModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ValAxOrCatAxOrDateAxModel newValAx(CTValAxModel value) {
      return new ValAxOrCatAxOrDateAxModel(0, value);
    }

    public Boolean isValAx() {
      return this.type == 0;
    }

    public CTValAxModel getValAx() {
      return (CTValAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAxModel newCatAx(CTCatAxModel value) {
      return new ValAxOrCatAxOrDateAxModel(1, value);
    }

    public Boolean isCatAx() {
      return this.type == 1;
    }

    public CTCatAxModel getCatAx() {
      return (CTCatAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAxModel newDateAx(CTDateAxModel value) {
      return new ValAxOrCatAxOrDateAxModel(2, value);
    }

    public Boolean isDateAx() {
      return this.type == 2;
    }

    public CTDateAxModel getDateAx() {
      return (CTDateAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAxModel newSerAx(CTSerAxModel value) {
      return new ValAxOrCatAxOrDateAxModel(3, value);
    }

    public Boolean isSerAx() {
      return this.type == 3;
    }

    public CTSerAxModel getSerAx() {
      return (CTSerAxModel) this.value;
    }
  }
}
