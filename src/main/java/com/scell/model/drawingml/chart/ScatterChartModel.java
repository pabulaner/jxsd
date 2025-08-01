package com.scell.model.drawingml.chart;

import java.util.List;

public class ScatterChartModel implements IScatterChartValueModel {
  private final ScatterStyleModel scatterStyle;

  private final BooleanModel varyColors;

  private final List<ScatterSerModel> ser;

  private final DLblsModel dLbls;

  private final List<UnsignedIntModel> axId;

  private final ExtensionListModel extLst;

  public ScatterChartModel(ScatterStyleModel scatterStyle, BooleanModel varyColors,
      List<ScatterSerModel> ser, DLblsModel dLbls, List<UnsignedIntModel> axId,
      ExtensionListModel extLst) {
    this.scatterStyle = scatterStyle;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.axId = axId;
    this.extLst = extLst;
  }

  public ScatterStyleModel getScatterStyle() {
    return this.scatterStyle;
  }

  public BooleanModel getVaryColors() {
    return this.varyColors;
  }

  public List<ScatterSerModel> getSer() {
    return this.ser;
  }

  public DLblsModel getDLbls() {
    return this.dLbls;
  }

  public List<UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
