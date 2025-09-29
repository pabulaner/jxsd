package jxsd.gen.builder.drawingml.chart;

import java.lang.Object;
import java.util.List;
import jxsd.gen.model.drawingml.chart.Area3DChartModel;
import jxsd.gen.model.drawingml.chart.AreaChartModel;
import jxsd.gen.model.drawingml.chart.Bar3DChartModel;
import jxsd.gen.model.drawingml.chart.BarChartModel;
import jxsd.gen.model.drawingml.chart.BubbleChartModel;
import jxsd.gen.model.drawingml.chart.CatAxModel;
import jxsd.gen.model.drawingml.chart.DTableModel;
import jxsd.gen.model.drawingml.chart.DateAxModel;
import jxsd.gen.model.drawingml.chart.DoughnutChartModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LayoutModel;
import jxsd.gen.model.drawingml.chart.Line3DChartModel;
import jxsd.gen.model.drawingml.chart.LineChartModel;
import jxsd.gen.model.drawingml.chart.OfPieChartModel;
import jxsd.gen.model.drawingml.chart.Pie3DChartModel;
import jxsd.gen.model.drawingml.chart.PieChartModel;
import jxsd.gen.model.drawingml.chart.PlotAreaModel;
import jxsd.gen.model.drawingml.chart.RadarChartModel;
import jxsd.gen.model.drawingml.chart.ScatterChartModel;
import jxsd.gen.model.drawingml.chart.SerAxModel;
import jxsd.gen.model.drawingml.chart.StockChartModel;
import jxsd.gen.model.drawingml.chart.Surface3DChartModel;
import jxsd.gen.model.drawingml.chart.SurfaceChartModel;
import jxsd.gen.model.drawingml.chart.ValAxModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class PlotAreaBuilder {
  private LayoutModel layout;

  private List<PlotAreaModel.AreaChartOrArea3DChartOrLineChart> areaChartOrArea3DChartOrLineChart;

  private List<PlotAreaModel.ValAxOrCatAxOrDateAx> valAxOrCatAxOrDateAx;

  private DTableModel dTable;

  private ShapePropertiesModel spPr;

  private ExtensionListModel extLst;

  public PlotAreaBuilder() {
  }

  public PlotAreaBuilder setLayout(LayoutModel layout) {
    this.layout = layout;
    return this;
  }

  public PlotAreaBuilder setAreaChartOrArea3DChartOrLineChart(
      List<PlotAreaModel.AreaChartOrArea3DChartOrLineChart> areaChartOrArea3DChartOrLineChart) {
    this.areaChartOrArea3DChartOrLineChart = areaChartOrArea3DChartOrLineChart;
    return this;
  }

  public PlotAreaBuilder setValAxOrCatAxOrDateAx(
      List<PlotAreaModel.ValAxOrCatAxOrDateAx> valAxOrCatAxOrDateAx) {
    this.valAxOrCatAxOrDateAx = valAxOrCatAxOrDateAx;
    return this;
  }

  public PlotAreaBuilder setDTable(DTableModel dTable) {
    this.dTable = dTable;
    return this;
  }

  public PlotAreaBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public PlotAreaBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public PlotAreaBuilder from(PlotAreaModel value) {
    this.layout = value.getLayout();
    this.areaChartOrArea3DChartOrLineChart = value.getAreaChartOrArea3DChartOrLineChart();
    this.valAxOrCatAxOrDateAx = value.getValAxOrCatAxOrDateAx();
    this.dTable = value.getDTable();
    this.spPr = value.getSpPr();
    this.extLst = value.getExtLst();
    return this;
  }

  public PlotAreaModel build() {
    return new PlotAreaModel(this.layout, this.areaChartOrArea3DChartOrLineChart, this.valAxOrCatAxOrDateAx, this.dTable, this.spPr, this.extLst);
  }

  /**
   * This is a generated choice class.
   */
  public static class AreaChartOrArea3DChartOrLineChart {
    private int type;

    private Object value;

    public AreaChartOrArea3DChartOrLineChart() {
      this.type = -1;
      this.value = null;
    }

    public AreaChartOrArea3DChartOrLineChart setAreaChart(AreaChartModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setArea3DChart(Area3DChartModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setLineChart(LineChartModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setLine3DChart(Line3DChartModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setStockChart(StockChartModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setRadarChart(RadarChartModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setScatterChart(ScatterChartModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setPieChart(PieChartModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setPie3DChart(Pie3DChartModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setDoughnutChart(DoughnutChartModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setBarChart(BarChartModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setBar3DChart(Bar3DChartModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setOfPieChart(OfPieChartModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setSurfaceChart(SurfaceChartModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setSurface3DChart(Surface3DChartModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart setBubbleChart(BubbleChartModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChart from(
        PlotAreaModel.AreaChartOrArea3DChartOrLineChart value) {
      this.type = -1;
      this.value = null;
      if (value.isAreaChart()) {
        this.type = 0;
        this.value = value.getAreaChart();
      }
      if (value.isArea3DChart()) {
        this.type = 1;
        this.value = value.getArea3DChart();
      }
      if (value.isLineChart()) {
        this.type = 2;
        this.value = value.getLineChart();
      }
      if (value.isLine3DChart()) {
        this.type = 3;
        this.value = value.getLine3DChart();
      }
      if (value.isStockChart()) {
        this.type = 4;
        this.value = value.getStockChart();
      }
      if (value.isRadarChart()) {
        this.type = 5;
        this.value = value.getRadarChart();
      }
      if (value.isScatterChart()) {
        this.type = 6;
        this.value = value.getScatterChart();
      }
      if (value.isPieChart()) {
        this.type = 7;
        this.value = value.getPieChart();
      }
      if (value.isPie3DChart()) {
        this.type = 8;
        this.value = value.getPie3DChart();
      }
      if (value.isDoughnutChart()) {
        this.type = 9;
        this.value = value.getDoughnutChart();
      }
      if (value.isBarChart()) {
        this.type = 10;
        this.value = value.getBarChart();
      }
      if (value.isBar3DChart()) {
        this.type = 11;
        this.value = value.getBar3DChart();
      }
      if (value.isOfPieChart()) {
        this.type = 12;
        this.value = value.getOfPieChart();
      }
      if (value.isSurfaceChart()) {
        this.type = 13;
        this.value = value.getSurfaceChart();
      }
      if (value.isSurface3DChart()) {
        this.type = 14;
        this.value = value.getSurface3DChart();
      }
      if (value.isBubbleChart()) {
        this.type = 15;
        this.value = value.getBubbleChart();
      }
      return this;
    }

    public PlotAreaModel.AreaChartOrArea3DChartOrLineChart build() {
      if (this.type == -1) return new PlotAreaModel.AreaChartOrArea3DChartOrLineChart();
      if (this.type == 0) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newAreaChart((AreaChartModel) this.value);
      if (this.type == 1) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newArea3DChart((Area3DChartModel) this.value);
      if (this.type == 2) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newLineChart((LineChartModel) this.value);
      if (this.type == 3) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newLine3DChart((Line3DChartModel) this.value);
      if (this.type == 4) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newStockChart((StockChartModel) this.value);
      if (this.type == 5) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newRadarChart((RadarChartModel) this.value);
      if (this.type == 6) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newScatterChart((ScatterChartModel) this.value);
      if (this.type == 7) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newPieChart((PieChartModel) this.value);
      if (this.type == 8) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newPie3DChart((Pie3DChartModel) this.value);
      if (this.type == 9) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newDoughnutChart((DoughnutChartModel) this.value);
      if (this.type == 10) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newBarChart((BarChartModel) this.value);
      if (this.type == 11) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newBar3DChart((Bar3DChartModel) this.value);
      if (this.type == 12) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newOfPieChart((OfPieChartModel) this.value);
      if (this.type == 13) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newSurfaceChart((SurfaceChartModel) this.value);
      if (this.type == 14) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newSurface3DChart((Surface3DChartModel) this.value);
      if (this.type == 15) return PlotAreaModel.AreaChartOrArea3DChartOrLineChart.newBubbleChart((BubbleChartModel) this.value);
      return null;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class ValAxOrCatAxOrDateAx {
    private int type;

    private Object value;

    public ValAxOrCatAxOrDateAx() {
      this.type = -1;
      this.value = null;
    }

    public ValAxOrCatAxOrDateAx setValAx(ValAxModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public ValAxOrCatAxOrDateAx setCatAx(CatAxModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public ValAxOrCatAxOrDateAx setDateAx(DateAxModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public ValAxOrCatAxOrDateAx setSerAx(SerAxModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public ValAxOrCatAxOrDateAx from(PlotAreaModel.ValAxOrCatAxOrDateAx value) {
      this.type = -1;
      this.value = null;
      if (value.isValAx()) {
        this.type = 0;
        this.value = value.getValAx();
      }
      if (value.isCatAx()) {
        this.type = 1;
        this.value = value.getCatAx();
      }
      if (value.isDateAx()) {
        this.type = 2;
        this.value = value.getDateAx();
      }
      if (value.isSerAx()) {
        this.type = 3;
        this.value = value.getSerAx();
      }
      return this;
    }

    public PlotAreaModel.ValAxOrCatAxOrDateAx build() {
      if (this.type == -1) return new PlotAreaModel.ValAxOrCatAxOrDateAx();
      if (this.type == 0) return PlotAreaModel.ValAxOrCatAxOrDateAx.newValAx((ValAxModel) this.value);
      if (this.type == 1) return PlotAreaModel.ValAxOrCatAxOrDateAx.newCatAx((CatAxModel) this.value);
      if (this.type == 2) return PlotAreaModel.ValAxOrCatAxOrDateAx.newDateAx((DateAxModel) this.value);
      if (this.type == 3) return PlotAreaModel.ValAxOrCatAxOrDateAx.newSerAx((SerAxModel) this.value);
      return null;
    }
  }
}
