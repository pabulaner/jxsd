package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class PlotAreaModel {
  private final LayoutModel layout;

  private final List<AreaChartOrArea3DChartOrLineChartModel> areaChartOrArea3DChartOrLineChart;

  private final List<ValAxOrCatAxOrDateAxModel> valAxOrCatAxOrDateAx;

  private final DTableModel dTable;

  private final ShapePropertiesModel spPr;

  private final ExtensionListModel extLst;

  public PlotAreaModel(LayoutModel layout,
      List<AreaChartOrArea3DChartOrLineChartModel> areaChartOrArea3DChartOrLineChart,
      List<ValAxOrCatAxOrDateAxModel> valAxOrCatAxOrDateAx, DTableModel dTable,
      ShapePropertiesModel spPr, ExtensionListModel extLst) {
    this.layout = layout;
    this.areaChartOrArea3DChartOrLineChart = areaChartOrArea3DChartOrLineChart;
    this.valAxOrCatAxOrDateAx = valAxOrCatAxOrDateAx;
    this.dTable = dTable;
    this.spPr = spPr;
    this.extLst = extLst;
  }

  public LayoutModel getLayout() {
    return this.layout;
  }

  public List<AreaChartOrArea3DChartOrLineChartModel> getAreaChartOrArea3DChartOrLineChart() {
    return this.areaChartOrArea3DChartOrLineChart;
  }

  public List<ValAxOrCatAxOrDateAxModel> getValAxOrCatAxOrDateAx() {
    return this.valAxOrCatAxOrDateAx;
  }

  public DTableModel getDTable() {
    return this.dTable;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class AreaChartOrArea3DChartOrLineChartModel {
    private final int type;

    private final Object value;

    public AreaChartOrArea3DChartOrLineChartModel() {
      this(-1, null);
    }

    private AreaChartOrArea3DChartOrLineChartModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newAreaChart(AreaChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(0, value);
    }

    public boolean isAreaChart() {
      return this.type == 0;
    }

    public AreaChartModel getAreaChart() {
      return (AreaChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newArea3DChart(Area3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(1, value);
    }

    public boolean isArea3DChart() {
      return this.type == 1;
    }

    public Area3DChartModel getArea3DChart() {
      return (Area3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newLineChart(LineChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(2, value);
    }

    public boolean isLineChart() {
      return this.type == 2;
    }

    public LineChartModel getLineChart() {
      return (LineChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newLine3DChart(Line3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(3, value);
    }

    public boolean isLine3DChart() {
      return this.type == 3;
    }

    public Line3DChartModel getLine3DChart() {
      return (Line3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newStockChart(StockChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(4, value);
    }

    public boolean isStockChart() {
      return this.type == 4;
    }

    public StockChartModel getStockChart() {
      return (StockChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newRadarChart(RadarChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(5, value);
    }

    public boolean isRadarChart() {
      return this.type == 5;
    }

    public RadarChartModel getRadarChart() {
      return (RadarChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newScatterChart(ScatterChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(6, value);
    }

    public boolean isScatterChart() {
      return this.type == 6;
    }

    public ScatterChartModel getScatterChart() {
      return (ScatterChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newPieChart(PieChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(7, value);
    }

    public boolean isPieChart() {
      return this.type == 7;
    }

    public PieChartModel getPieChart() {
      return (PieChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newPie3DChart(Pie3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(8, value);
    }

    public boolean isPie3DChart() {
      return this.type == 8;
    }

    public Pie3DChartModel getPie3DChart() {
      return (Pie3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newDoughnutChart(
        DoughnutChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(9, value);
    }

    public boolean isDoughnutChart() {
      return this.type == 9;
    }

    public DoughnutChartModel getDoughnutChart() {
      return (DoughnutChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newBarChart(BarChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(10, value);
    }

    public boolean isBarChart() {
      return this.type == 10;
    }

    public BarChartModel getBarChart() {
      return (BarChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newBar3DChart(Bar3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(11, value);
    }

    public boolean isBar3DChart() {
      return this.type == 11;
    }

    public Bar3DChartModel getBar3DChart() {
      return (Bar3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newOfPieChart(OfPieChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(12, value);
    }

    public boolean isOfPieChart() {
      return this.type == 12;
    }

    public OfPieChartModel getOfPieChart() {
      return (OfPieChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newSurfaceChart(SurfaceChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(13, value);
    }

    public boolean isSurfaceChart() {
      return this.type == 13;
    }

    public SurfaceChartModel getSurfaceChart() {
      return (SurfaceChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newSurface3DChart(
        Surface3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(14, value);
    }

    public boolean isSurface3DChart() {
      return this.type == 14;
    }

    public Surface3DChartModel getSurface3DChart() {
      return (Surface3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newBubbleChart(BubbleChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(15, value);
    }

    public boolean isBubbleChart() {
      return this.type == 15;
    }

    public BubbleChartModel getBubbleChart() {
      return (BubbleChartModel) this.value;
    }
  }

  public static class ValAxOrCatAxOrDateAxModel {
    private final int type;

    private final Object value;

    public ValAxOrCatAxOrDateAxModel() {
      this(-1, null);
    }

    private ValAxOrCatAxOrDateAxModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ValAxOrCatAxOrDateAxModel newValAx(ValAxModel value) {
      return new ValAxOrCatAxOrDateAxModel(0, value);
    }

    public boolean isValAx() {
      return this.type == 0;
    }

    public ValAxModel getValAx() {
      return (ValAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAxModel newCatAx(CatAxModel value) {
      return new ValAxOrCatAxOrDateAxModel(1, value);
    }

    public boolean isCatAx() {
      return this.type == 1;
    }

    public CatAxModel getCatAx() {
      return (CatAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAxModel newDateAx(DateAxModel value) {
      return new ValAxOrCatAxOrDateAxModel(2, value);
    }

    public boolean isDateAx() {
      return this.type == 2;
    }

    public DateAxModel getDateAx() {
      return (DateAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAxModel newSerAx(SerAxModel value) {
      return new ValAxOrCatAxOrDateAxModel(3, value);
    }

    public boolean isSerAx() {
      return this.type == 3;
    }

    public SerAxModel getSerAx() {
      return (SerAxModel) this.value;
    }
  }
}
