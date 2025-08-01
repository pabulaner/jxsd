package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class PlotAreaModel {
  private final LayoutModel layout;

  private final List<PlotAreaModel.AreaChartOrArea3DChartOrLineChartValueModel> areaChartOrArea3DChartOrLineChart;

  private final List<ValAxOrCatAxOrDateAxValueModel> valAxOrCatAxOrDateAx;

  private final DTableModel dTable;

  private final ShapePropertiesModel spPr;

  private final ExtensionListModel extLst;

  public PlotAreaModel(LayoutModel layout,
      List<PlotAreaModel.AreaChartOrArea3DChartOrLineChartValueModel> areaChartOrArea3DChartOrLineChart,
      List<ValAxOrCatAxOrDateAxValueModel> valAxOrCatAxOrDateAx, DTableModel dTable,
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

  public List<PlotAreaModel.AreaChartOrArea3DChartOrLineChartValueModel> getAreaChartOrArea3DChartOrLineChart(
      ) {
    return this.areaChartOrArea3DChartOrLineChart;
  }

  public List<ValAxOrCatAxOrDateAxValueModel> getValAxOrCatAxOrDateAx() {
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

  public static class ValAxOrCatAxOrDateAxValueModel {
    private final int type;

    private final Object value;

    public ValAxOrCatAxOrDateAxValueModel() {
      this(-1, null);
    }

    private ValAxOrCatAxOrDateAxValueModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ValAxOrCatAxOrDateAxValueModel newValAx(ValAxModel value) {
      return new ValAxOrCatAxOrDateAxValueModel(0, value);
    }

    public boolean isValAx() {
      return this.type == 0;
    }

    public ValAxModel getValAx() {
      return (ValAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAxValueModel newCatAx(CatAxModel value) {
      return new ValAxOrCatAxOrDateAxValueModel(1, value);
    }

    public boolean isCatAx() {
      return this.type == 1;
    }

    public CatAxModel getCatAx() {
      return (CatAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAxValueModel newDateAx(DateAxModel value) {
      return new ValAxOrCatAxOrDateAxValueModel(2, value);
    }

    public boolean isDateAx() {
      return this.type == 2;
    }

    public DateAxModel getDateAx() {
      return (DateAxModel) this.value;
    }

    public static ValAxOrCatAxOrDateAxValueModel newSerAx(SerAxModel value) {
      return new ValAxOrCatAxOrDateAxValueModel(3, value);
    }

    public boolean isSerAx() {
      return this.type == 3;
    }

    public SerAxModel getSerAx() {
      return (SerAxModel) this.value;
    }
  }
}
