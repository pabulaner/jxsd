package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_PlotAreaModel {
  private final CT_LayoutModel layout;

  private final List<AreaChartOrArea3DChartOrLineChartModel> areaChartOrArea3DChartOrLineChart;

  private final List<ValAxOrCatAxOrDateAxModel> valAxOrCatAxOrDateAx;

  private final CT_DTableModel dTable;

  private final CT_ShapePropertiesModel spPr;

  private final CT_ExtensionListModel extLst;

  public CT_PlotAreaModel(CT_LayoutModel layout,
      List<AreaChartOrArea3DChartOrLineChartModel> areaChartOrArea3DChartOrLineChart,
      List<ValAxOrCatAxOrDateAxModel> valAxOrCatAxOrDateAx, CT_DTableModel dTable,
      CT_ShapePropertiesModel spPr, CT_ExtensionListModel extLst) {
    this.layout = layout;
    this.areaChartOrArea3DChartOrLineChart = areaChartOrArea3DChartOrLineChart;
    this.valAxOrCatAxOrDateAx = valAxOrCatAxOrDateAx;
    this.dTable = dTable;
    this.spPr = spPr;
    this.extLst = extLst;
  }

  public CT_LayoutModel getLayout() {
    return this.layout;
  }

  public List<AreaChartOrArea3DChartOrLineChartModel> getAreaChartOrArea3DChartOrLineChart() {
    return this.areaChartOrArea3DChartOrLineChart;
  }

  public List<ValAxOrCatAxOrDateAxModel> getValAxOrCatAxOrDateAx() {
    return this.valAxOrCatAxOrDateAx;
  }

  public CT_DTableModel getDTable() {
    return this.dTable;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CT_ExtensionListModel getExtLst() {
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

    public static AreaChartOrArea3DChartOrLineChartModel newAreaChart(CT_AreaChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(0, value);
    }

    public boolean isAreaChart() {
      return this.type == 0;
    }

    public CT_AreaChartModel getAreaChart() {
      return (CT_AreaChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newArea3DChart(CT_Area3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(1, value);
    }

    public boolean isArea3DChart() {
      return this.type == 1;
    }

    public CT_Area3DChartModel getArea3DChart() {
      return (CT_Area3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newLineChart(CT_LineChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(2, value);
    }

    public boolean isLineChart() {
      return this.type == 2;
    }

    public CT_LineChartModel getLineChart() {
      return (CT_LineChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newLine3DChart(CT_Line3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(3, value);
    }

    public boolean isLine3DChart() {
      return this.type == 3;
    }

    public CT_Line3DChartModel getLine3DChart() {
      return (CT_Line3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newStockChart(CT_StockChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(4, value);
    }

    public boolean isStockChart() {
      return this.type == 4;
    }

    public CT_StockChartModel getStockChart() {
      return (CT_StockChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newRadarChart(CT_RadarChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(5, value);
    }

    public boolean isRadarChart() {
      return this.type == 5;
    }

    public CT_RadarChartModel getRadarChart() {
      return (CT_RadarChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newScatterChart(
        CT_ScatterChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(6, value);
    }

    public boolean isScatterChart() {
      return this.type == 6;
    }

    public CT_ScatterChartModel getScatterChart() {
      return (CT_ScatterChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newPieChart(CT_PieChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(7, value);
    }

    public boolean isPieChart() {
      return this.type == 7;
    }

    public CT_PieChartModel getPieChart() {
      return (CT_PieChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newPie3DChart(CT_Pie3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(8, value);
    }

    public boolean isPie3DChart() {
      return this.type == 8;
    }

    public CT_Pie3DChartModel getPie3DChart() {
      return (CT_Pie3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newDoughnutChart(
        CT_DoughnutChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(9, value);
    }

    public boolean isDoughnutChart() {
      return this.type == 9;
    }

    public CT_DoughnutChartModel getDoughnutChart() {
      return (CT_DoughnutChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newBarChart(CT_BarChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(10, value);
    }

    public boolean isBarChart() {
      return this.type == 10;
    }

    public CT_BarChartModel getBarChart() {
      return (CT_BarChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newBar3DChart(CT_Bar3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(11, value);
    }

    public boolean isBar3DChart() {
      return this.type == 11;
    }

    public CT_Bar3DChartModel getBar3DChart() {
      return (CT_Bar3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newOfPieChart(CT_OfPieChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(12, value);
    }

    public boolean isOfPieChart() {
      return this.type == 12;
    }

    public CT_OfPieChartModel getOfPieChart() {
      return (CT_OfPieChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newSurfaceChart(
        CT_SurfaceChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(13, value);
    }

    public boolean isSurfaceChart() {
      return this.type == 13;
    }

    public CT_SurfaceChartModel getSurfaceChart() {
      return (CT_SurfaceChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newSurface3DChart(
        CT_Surface3DChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(14, value);
    }

    public boolean isSurface3DChart() {
      return this.type == 14;
    }

    public CT_Surface3DChartModel getSurface3DChart() {
      return (CT_Surface3DChartModel) this.value;
    }

    public static AreaChartOrArea3DChartOrLineChartModel newBubbleChart(CT_BubbleChartModel value) {
      return new AreaChartOrArea3DChartOrLineChartModel(15, value);
    }

    public boolean isBubbleChart() {
      return this.type == 15;
    }

    public CT_BubbleChartModel getBubbleChart() {
      return (CT_BubbleChartModel) this.value;
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

    public static ValAxOrCatAxOrDateAxModel newValAx(CT_ValAxModel value) {
      return new ValAxOrCatAxOrDateAxModel(0, value);
    }

    public boolean isValAx() {
      return this.type == 0;
    }

    public CT_ValAxModel getValAx() {
      return (CT_ValAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAxModel newCatAx(CT_CatAxModel value) {
      return new ValAxOrCatAxOrDateAxModel(1, value);
    }

    public boolean isCatAx() {
      return this.type == 1;
    }

    public CT_CatAxModel getCatAx() {
      return (CT_CatAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAxModel newDateAx(CT_DateAxModel value) {
      return new ValAxOrCatAxOrDateAxModel(2, value);
    }

    public boolean isDateAx() {
      return this.type == 2;
    }

    public CT_DateAxModel getDateAx() {
      return (CT_DateAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAxModel newSerAx(CT_SerAxModel value) {
      return new ValAxOrCatAxOrDateAxModel(3, value);
    }

    public boolean isSerAx() {
      return this.type == 3;
    }

    public CT_SerAxModel getSerAx() {
      return (CT_SerAxModel) this.value;
    }
  }
}
