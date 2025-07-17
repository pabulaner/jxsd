package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ProtectionModel;

public class CT_ProtectionBuilder {
  private CT_BooleanModel chartObject;

  private CT_BooleanModel data;

  private CT_BooleanModel formatting;

  private CT_BooleanModel selection;

  private CT_BooleanModel userInterface;

  public CT_ProtectionBuilder() {
  }

  public CT_ProtectionBuilder setChartObject(CT_BooleanModel chartObject) {
    this.chartObject = chartObject;
    return this;
  }

  public CT_ProtectionBuilder setData(CT_BooleanModel data) {
    this.data = data;
    return this;
  }

  public CT_ProtectionBuilder setFormatting(CT_BooleanModel formatting) {
    this.formatting = formatting;
    return this;
  }

  public CT_ProtectionBuilder setSelection(CT_BooleanModel selection) {
    this.selection = selection;
    return this;
  }

  public CT_ProtectionBuilder setUserInterface(CT_BooleanModel userInterface) {
    this.userInterface = userInterface;
    return this;
  }

  public CT_ProtectionModel build() {
    return new CT_ProtectionModel(this.chartObject, this.data, this.formatting, this.selection, this.userInterface);
  }

  public CT_ProtectionBuilder from(CT_ProtectionModel value) {
    this.chartObject = value.getChartObject();
    this.data = value.getData();
    this.formatting = value.getFormatting();
    this.selection = value.getSelection();
    this.userInterface = value.getUserInterface();
    return this;
  }
}
