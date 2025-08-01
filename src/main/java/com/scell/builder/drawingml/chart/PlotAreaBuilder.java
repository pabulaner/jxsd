package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CatAxModel;
import com.scell.model.drawingml.chart.DTableModel;
import com.scell.model.drawingml.chart.DateAxModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.LayoutModel;
import com.scell.model.drawingml.chart.PlotAreaModel;
import com.scell.model.drawingml.chart.SerAxModel;
import com.scell.model.drawingml.chart.ValAxModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import java.lang.Object;
import java.util.List;

public class PlotAreaBuilder {
  private LayoutModel layout;

  private List<PlotAreaModel.AreaChartOrArea3DChartOrLineChartValueModel> areaChartOrArea3DChartOrLineChart;

  private List<PlotAreaModel.ValAxOrCatAxOrDateAxValueModel> valAxOrCatAxOrDateAx;

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
      List<PlotAreaModel.AreaChartOrArea3DChartOrLineChartValueModel> areaChartOrArea3DChartOrLineChart) {
    this.areaChartOrArea3DChartOrLineChart = areaChartOrArea3DChartOrLineChart;
    return this;
  }

  public PlotAreaBuilder setValAxOrCatAxOrDateAx(
      List<PlotAreaModel.ValAxOrCatAxOrDateAxValueModel> valAxOrCatAxOrDateAx) {
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

  public static class ValAxOrCatAxOrDateAxValueBuilder {
    private int type;

    private Object value;

    public ValAxOrCatAxOrDateAxValueBuilder() {
      this.type = -1;
      this.value = null;
    }

    public ValAxOrCatAxOrDateAxValueBuilder setValAx(ValAxModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public ValAxOrCatAxOrDateAxValueBuilder setCatAx(CatAxModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public ValAxOrCatAxOrDateAxValueBuilder setDateAx(DateAxModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public ValAxOrCatAxOrDateAxValueBuilder setSerAx(SerAxModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public PlotAreaModel.ValAxOrCatAxOrDateAxValueModel build() {
      if (this.type == -1) return new PlotAreaModel.ValAxOrCatAxOrDateAxValueModel();
      if (this.type == 0) return PlotAreaModel.ValAxOrCatAxOrDateAxValueModel.newValAx((ValAxModel) this.value);
      if (this.type == 1) return PlotAreaModel.ValAxOrCatAxOrDateAxValueModel.newCatAx((CatAxModel) this.value);
      if (this.type == 2) return PlotAreaModel.ValAxOrCatAxOrDateAxValueModel.newDateAx((DateAxModel) this.value);
      if (this.type == 3) return PlotAreaModel.ValAxOrCatAxOrDateAxValueModel.newSerAx((SerAxModel) this.value);
      return null;
    }

    public ValAxOrCatAxOrDateAxValueBuilder from(
        PlotAreaModel.ValAxOrCatAxOrDateAxValueModel value) {
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
