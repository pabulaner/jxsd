package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.Area3DChartModel;
import com.scell.model.drawingml.chart.AreaChartModel;
import com.scell.model.drawingml.chart.Bar3DChartModel;
import com.scell.model.drawingml.chart.BarChartModel;
import com.scell.model.drawingml.chart.BubbleChartModel;
import com.scell.model.drawingml.chart.CatAxModel;
import com.scell.model.drawingml.chart.DTableModel;
import com.scell.model.drawingml.chart.DateAxModel;
import com.scell.model.drawingml.chart.DoughnutChartModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.LayoutModel;
import com.scell.model.drawingml.chart.Line3DChartModel;
import com.scell.model.drawingml.chart.LineChartModel;
import com.scell.model.drawingml.chart.OfPieChartModel;
import com.scell.model.drawingml.chart.Pie3DChartModel;
import com.scell.model.drawingml.chart.PieChartModel;
import com.scell.model.drawingml.chart.PlotAreaModel;
import com.scell.model.drawingml.chart.RadarChartModel;
import com.scell.model.drawingml.chart.ScatterChartModel;
import com.scell.model.drawingml.chart.SerAxModel;
import com.scell.model.drawingml.chart.StockChartModel;
import com.scell.model.drawingml.chart.Surface3DChartModel;
import com.scell.model.drawingml.chart.SurfaceChartModel;
import com.scell.model.drawingml.chart.ValAxModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import java.lang.Object;
import java.util.List;

public class PlotAreaBuilder {
  private LayoutModel layout;

  private List<PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel> areaChartOrArea3DChartOrLineChart;

  private List<PlotAreaModel.ValAxOrCatAxOrDateAxModel> valAxOrCatAxOrDateAx;

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
      List<PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel> areaChartOrArea3DChartOrLineChart) {
    this.areaChartOrArea3DChartOrLineChart = areaChartOrArea3DChartOrLineChart;
    return this;
  }

  public PlotAreaBuilder setValAxOrCatAxOrDateAx(
      List<PlotAreaModel.ValAxOrCatAxOrDateAxModel> valAxOrCatAxOrDateAx) {
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

  public PlotAreaModel build() {
    return new PlotAreaModel(this.layout, this.areaChartOrArea3DChartOrLineChart, this.valAxOrCatAxOrDateAx, this.dTable, this.spPr, this.extLst);
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

  public static class AreaChartOrArea3DChartOrLineChartBuilder {
    private int type;

    private Object value;

    public AreaChartOrArea3DChartOrLineChartBuilder() {
      this.type = -1;
      this.value = null;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setAreaChart(AreaChartModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setArea3DChart(Area3DChartModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setLineChart(LineChartModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setLine3DChart(Line3DChartModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setStockChart(StockChartModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setRadarChart(RadarChartModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setScatterChart(ScatterChartModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setPieChart(PieChartModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setPie3DChart(Pie3DChartModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setDoughnutChart(DoughnutChartModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setBarChart(BarChartModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setBar3DChart(Bar3DChartModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setOfPieChart(OfPieChartModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setSurfaceChart(SurfaceChartModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setSurface3DChart(Surface3DChartModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setBubbleChart(BubbleChartModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel build() {
      if (this.type == -1) return new PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel();
      if (this.type == 0) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newAreaChart((AreaChartModel) this.value);
      if (this.type == 1) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newArea3DChart((Area3DChartModel) this.value);
      if (this.type == 2) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newLineChart((LineChartModel) this.value);
      if (this.type == 3) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newLine3DChart((Line3DChartModel) this.value);
      if (this.type == 4) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newStockChart((StockChartModel) this.value);
      if (this.type == 5) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newRadarChart((RadarChartModel) this.value);
      if (this.type == 6) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newScatterChart((ScatterChartModel) this.value);
      if (this.type == 7) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newPieChart((PieChartModel) this.value);
      if (this.type == 8) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newPie3DChart((Pie3DChartModel) this.value);
      if (this.type == 9) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newDoughnutChart((DoughnutChartModel) this.value);
      if (this.type == 10) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newBarChart((BarChartModel) this.value);
      if (this.type == 11) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newBar3DChart((Bar3DChartModel) this.value);
      if (this.type == 12) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newOfPieChart((OfPieChartModel) this.value);
      if (this.type == 13) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newSurfaceChart((SurfaceChartModel) this.value);
      if (this.type == 14) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newSurface3DChart((Surface3DChartModel) this.value);
      if (this.type == 15) return PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newBubbleChart((BubbleChartModel) this.value);
      return null;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder from(
        PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel value) {
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
  }

  public static class ValAxOrCatAxOrDateAxBuilder {
    private int type;

    private Object value;

    public ValAxOrCatAxOrDateAxBuilder() {
      this.type = -1;
      this.value = null;
    }

    public ValAxOrCatAxOrDateAxBuilder setValAx(ValAxModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public ValAxOrCatAxOrDateAxBuilder setCatAx(CatAxModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public ValAxOrCatAxOrDateAxBuilder setDateAx(DateAxModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public ValAxOrCatAxOrDateAxBuilder setSerAx(SerAxModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public PlotAreaModel.ValAxOrCatAxOrDateAxModel build() {
      if (this.type == -1) return new PlotAreaModel.ValAxOrCatAxOrDateAxModel();
      if (this.type == 0) return PlotAreaModel.ValAxOrCatAxOrDateAxModel.newValAx((ValAxModel) this.value);
      if (this.type == 1) return PlotAreaModel.ValAxOrCatAxOrDateAxModel.newCatAx((CatAxModel) this.value);
      if (this.type == 2) return PlotAreaModel.ValAxOrCatAxOrDateAxModel.newDateAx((DateAxModel) this.value);
      if (this.type == 3) return PlotAreaModel.ValAxOrCatAxOrDateAxModel.newSerAx((SerAxModel) this.value);
      return null;
    }

    public ValAxOrCatAxOrDateAxBuilder from(PlotAreaModel.ValAxOrCatAxOrDateAxModel value) {
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
  }
}
