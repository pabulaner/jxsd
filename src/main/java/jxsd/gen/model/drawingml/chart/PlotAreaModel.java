package jxsd.gen.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import jxsd.gen.builder.drawingml.chart.PlotAreaBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class PlotAreaModel {
  private final LayoutModel layout;

  private final List<AreaChartOrArea3DChartOrLineChart> areaChartOrArea3DChartOrLineChart;

  private final List<ValAxOrCatAxOrDateAx> valAxOrCatAxOrDateAx;

  private final DTableModel dTable;

  private final ShapePropertiesModel spPr;

  private final ExtensionListModel extLst;

  public PlotAreaModel(LayoutModel layout,
      List<AreaChartOrArea3DChartOrLineChart> areaChartOrArea3DChartOrLineChart,
      List<ValAxOrCatAxOrDateAx> valAxOrCatAxOrDateAx, DTableModel dTable,
      ShapePropertiesModel spPr, ExtensionListModel extLst) {
    this.layout = layout;
    this.areaChartOrArea3DChartOrLineChart = areaChartOrArea3DChartOrLineChart;
    this.valAxOrCatAxOrDateAx = valAxOrCatAxOrDateAx;
    this.dTable = dTable;
    this.spPr = spPr;
    this.extLst = extLst;
  }

  public PlotAreaBuilder builder() {
    return new PlotAreaBuilder().from(this);
  }

  public LayoutModel getLayout() {
    return this.layout;
  }

  public List<AreaChartOrArea3DChartOrLineChart> getAreaChartOrArea3DChartOrLineChart() {
    return this.areaChartOrArea3DChartOrLineChart;
  }

  public List<ValAxOrCatAxOrDateAx> getValAxOrCatAxOrDateAx() {
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

  /**
   * This is a generated choice class.
   */
  public static class AreaChartOrArea3DChartOrLineChart {
    private final int type;

    private final Object value;

    public AreaChartOrArea3DChartOrLineChart() {
      this(-1, null);
    }

    private AreaChartOrArea3DChartOrLineChart(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public PlotAreaBuilder.AreaChartOrArea3DChartOrLineChart builder() {
      return new PlotAreaBuilder.AreaChartOrArea3DChartOrLineChart().from(this);
    }

    public static AreaChartOrArea3DChartOrLineChart newAreaChart(AreaChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(0, value);
    }

    public boolean isAreaChart() {
      return this.type == 0;
    }

    public AreaChartModel getAreaChart() {
      return (AreaChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newArea3DChart(Area3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(1, value);
    }

    public boolean isArea3DChart() {
      return this.type == 1;
    }

    public Area3DChartModel getArea3DChart() {
      return (Area3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newLineChart(LineChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(2, value);
    }

    public boolean isLineChart() {
      return this.type == 2;
    }

    public LineChartModel getLineChart() {
      return (LineChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newLine3DChart(Line3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(3, value);
    }

    public boolean isLine3DChart() {
      return this.type == 3;
    }

    public Line3DChartModel getLine3DChart() {
      return (Line3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newStockChart(StockChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(4, value);
    }

    public boolean isStockChart() {
      return this.type == 4;
    }

    public StockChartModel getStockChart() {
      return (StockChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newRadarChart(RadarChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(5, value);
    }

    public boolean isRadarChart() {
      return this.type == 5;
    }

    public RadarChartModel getRadarChart() {
      return (RadarChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newScatterChart(ScatterChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(6, value);
    }

    public boolean isScatterChart() {
      return this.type == 6;
    }

    public ScatterChartModel getScatterChart() {
      return (ScatterChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newPieChart(PieChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(7, value);
    }

    public boolean isPieChart() {
      return this.type == 7;
    }

    public PieChartModel getPieChart() {
      return (PieChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newPie3DChart(Pie3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(8, value);
    }

    public boolean isPie3DChart() {
      return this.type == 8;
    }

    public Pie3DChartModel getPie3DChart() {
      return (Pie3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newDoughnutChart(DoughnutChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(9, value);
    }

    public boolean isDoughnutChart() {
      return this.type == 9;
    }

    public DoughnutChartModel getDoughnutChart() {
      return (DoughnutChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newBarChart(BarChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(10, value);
    }

    public boolean isBarChart() {
      return this.type == 10;
    }

    public BarChartModel getBarChart() {
      return (BarChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newBar3DChart(Bar3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(11, value);
    }

    public boolean isBar3DChart() {
      return this.type == 11;
    }

    public Bar3DChartModel getBar3DChart() {
      return (Bar3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newOfPieChart(OfPieChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(12, value);
    }

    public boolean isOfPieChart() {
      return this.type == 12;
    }

    public OfPieChartModel getOfPieChart() {
      return (OfPieChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newSurfaceChart(SurfaceChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(13, value);
    }

    public boolean isSurfaceChart() {
      return this.type == 13;
    }

    public SurfaceChartModel getSurfaceChart() {
      return (SurfaceChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newSurface3DChart(Surface3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(14, value);
    }

    public boolean isSurface3DChart() {
      return this.type == 14;
    }

    public Surface3DChartModel getSurface3DChart() {
      return (Surface3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChart newBubbleChart(BubbleChartModel value) {
      return new AreaChartOrArea3DChartOrLineChart(15, value);
    }

    public boolean isBubbleChart() {
      return this.type == 15;
    }

    public BubbleChartModel getBubbleChart() {
      return (BubbleChartModel) this.value;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class ValAxOrCatAxOrDateAx {
    private final int type;

    private final Object value;

    public ValAxOrCatAxOrDateAx() {
      this(-1, null);
    }

    private ValAxOrCatAxOrDateAx(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public PlotAreaBuilder.ValAxOrCatAxOrDateAx builder() {
      return new PlotAreaBuilder.ValAxOrCatAxOrDateAx().from(this);
    }

    public static ValAxOrCatAxOrDateAx newValAx(ValAxModel value) {
      return new ValAxOrCatAxOrDateAx(0, value);
    }

    public boolean isValAx() {
      return this.type == 0;
    }

    public ValAxModel getValAx() {
      return (ValAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAx newCatAx(CatAxModel value) {
      return new ValAxOrCatAxOrDateAx(1, value);
    }

    public boolean isCatAx() {
      return this.type == 1;
    }

    public CatAxModel getCatAx() {
      return (CatAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAx newDateAx(DateAxModel value) {
      return new ValAxOrCatAxOrDateAx(2, value);
    }

    public boolean isDateAx() {
      return this.type == 2;
    }

    public DateAxModel getDateAx() {
      return (DateAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAx newSerAx(SerAxModel value) {
      return new ValAxOrCatAxOrDateAx(3, value);
    }

    public boolean isSerAx() {
      return this.type == 3;
    }

    public SerAxModel getSerAx() {
      return (SerAxModel) this.value;
    }
  }
}
