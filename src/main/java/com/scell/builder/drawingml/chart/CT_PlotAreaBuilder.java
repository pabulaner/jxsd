package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_Area3DChartModel;
import com.scell.model.drawingml.chart.CT_AreaChartModel;
import com.scell.model.drawingml.chart.CT_Bar3DChartModel;
import com.scell.model.drawingml.chart.CT_BarChartModel;
import com.scell.model.drawingml.chart.CT_BubbleChartModel;
import com.scell.model.drawingml.chart.CT_CatAxModel;
import com.scell.model.drawingml.chart.CT_DTableModel;
import com.scell.model.drawingml.chart.CT_DateAxModel;
import com.scell.model.drawingml.chart.CT_DoughnutChartModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LayoutModel;
import com.scell.model.drawingml.chart.CT_Line3DChartModel;
import com.scell.model.drawingml.chart.CT_LineChartModel;
import com.scell.model.drawingml.chart.CT_OfPieChartModel;
import com.scell.model.drawingml.chart.CT_Pie3DChartModel;
import com.scell.model.drawingml.chart.CT_PieChartModel;
import com.scell.model.drawingml.chart.CT_PlotAreaModel;
import com.scell.model.drawingml.chart.CT_RadarChartModel;
import com.scell.model.drawingml.chart.CT_ScatterChartModel;
import com.scell.model.drawingml.chart.CT_SerAxModel;
import com.scell.model.drawingml.chart.CT_StockChartModel;
import com.scell.model.drawingml.chart.CT_Surface3DChartModel;
import com.scell.model.drawingml.chart.CT_SurfaceChartModel;
import com.scell.model.drawingml.chart.CT_ValAxModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import java.lang.Object;
import java.util.List;

public class CT_PlotAreaBuilder {
  private CT_LayoutModel layout;

  private List<CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel> areaChartOrArea3DChartOrLineChart;

  private List<CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel> valAxOrCatAxOrDateAx;

  private CT_DTableModel dTable;

  private CT_ShapePropertiesModel spPr;

  private CT_ExtensionListModel extLst;

  public CT_PlotAreaBuilder() {
  }

  public CT_PlotAreaBuilder setLayout(CT_LayoutModel layout) {
    this.layout = layout;
    return this;
  }

  public CT_PlotAreaBuilder setAreaChartOrArea3DChartOrLineChart(
      List<CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel> areaChartOrArea3DChartOrLineChart) {
    this.areaChartOrArea3DChartOrLineChart = areaChartOrArea3DChartOrLineChart;
    return this;
  }

  public CT_PlotAreaBuilder setValAxOrCatAxOrDateAx(
      List<CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel> valAxOrCatAxOrDateAx) {
    this.valAxOrCatAxOrDateAx = valAxOrCatAxOrDateAx;
    return this;
  }

  public CT_PlotAreaBuilder setDTable(CT_DTableModel dTable) {
    this.dTable = dTable;
    return this;
  }

  public CT_PlotAreaBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_PlotAreaBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_PlotAreaModel build() {
    return new CT_PlotAreaModel(this.layout, this.areaChartOrArea3DChartOrLineChart, this.valAxOrCatAxOrDateAx, this.dTable, this.spPr, this.extLst);
  }

  public CT_PlotAreaBuilder from(CT_PlotAreaModel value) {
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

    public AreaChartOrArea3DChartOrLineChartBuilder setAreaChart(CT_AreaChartModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setArea3DChart(CT_Area3DChartModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setLineChart(CT_LineChartModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setLine3DChart(CT_Line3DChartModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setStockChart(CT_StockChartModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setRadarChart(CT_RadarChartModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setScatterChart(CT_ScatterChartModel value) {
      this.type = 6;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setPieChart(CT_PieChartModel value) {
      this.type = 7;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setPie3DChart(CT_Pie3DChartModel value) {
      this.type = 8;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setDoughnutChart(CT_DoughnutChartModel value) {
      this.type = 9;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setBarChart(CT_BarChartModel value) {
      this.type = 10;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setBar3DChart(CT_Bar3DChartModel value) {
      this.type = 11;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setOfPieChart(CT_OfPieChartModel value) {
      this.type = 12;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setSurfaceChart(CT_SurfaceChartModel value) {
      this.type = 13;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setSurface3DChart(
        CT_Surface3DChartModel value) {
      this.type = 14;
      this.value = value;
      return this;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder setBubbleChart(CT_BubbleChartModel value) {
      this.type = 15;
      this.value = value;
      return this;
    }

    public CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel build() {
      if (this.type == -1) return new CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel();
      if (this.type == 0) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newAreaChart((CT_AreaChartModel) this.value);
      if (this.type == 1) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newArea3DChart((CT_Area3DChartModel) this.value);
      if (this.type == 2) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newLineChart((CT_LineChartModel) this.value);
      if (this.type == 3) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newLine3DChart((CT_Line3DChartModel) this.value);
      if (this.type == 4) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newStockChart((CT_StockChartModel) this.value);
      if (this.type == 5) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newRadarChart((CT_RadarChartModel) this.value);
      if (this.type == 6) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newScatterChart((CT_ScatterChartModel) this.value);
      if (this.type == 7) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newPieChart((CT_PieChartModel) this.value);
      if (this.type == 8) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newPie3DChart((CT_Pie3DChartModel) this.value);
      if (this.type == 9) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newDoughnutChart((CT_DoughnutChartModel) this.value);
      if (this.type == 10) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newBarChart((CT_BarChartModel) this.value);
      if (this.type == 11) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newBar3DChart((CT_Bar3DChartModel) this.value);
      if (this.type == 12) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newOfPieChart((CT_OfPieChartModel) this.value);
      if (this.type == 13) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newSurfaceChart((CT_SurfaceChartModel) this.value);
      if (this.type == 14) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newSurface3DChart((CT_Surface3DChartModel) this.value);
      if (this.type == 15) return CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel.newBubbleChart((CT_BubbleChartModel) this.value);
      return null;
    }

    public AreaChartOrArea3DChartOrLineChartBuilder from(
        CT_PlotAreaModel.AreaChartOrArea3DChartOrLineChartModel value) {
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

    public ValAxOrCatAxOrDateAxBuilder setValAx(CT_ValAxModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public ValAxOrCatAxOrDateAxBuilder setCatAx(CT_CatAxModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public ValAxOrCatAxOrDateAxBuilder setDateAx(CT_DateAxModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public ValAxOrCatAxOrDateAxBuilder setSerAx(CT_SerAxModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel build() {
      if (this.type == -1) return new CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel();
      if (this.type == 0) return CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel.newValAx((CT_ValAxModel) this.value);
      if (this.type == 1) return CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel.newCatAx((CT_CatAxModel) this.value);
      if (this.type == 2) return CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel.newDateAx((CT_DateAxModel) this.value);
      if (this.type == 3) return CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel.newSerAx((CT_SerAxModel) this.value);
      return null;
    }

    public ValAxOrCatAxOrDateAxBuilder from(CT_PlotAreaModel.ValAxOrCatAxOrDateAxModel value) {
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
