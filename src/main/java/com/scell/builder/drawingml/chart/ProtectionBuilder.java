package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ProtectionModel;

public class ProtectionBuilder {
  private BooleanModel chartObject;

  private BooleanModel data;

  private BooleanModel formatting;

  private BooleanModel selection;

  private BooleanModel userInterface;

  public ProtectionBuilder() {
  }

  public ProtectionBuilder setChartObject(BooleanModel chartObject) {
    this.chartObject = chartObject;
    return this;
  }

  public ProtectionBuilder setData(BooleanModel data) {
    this.data = data;
    return this;
  }

  public ProtectionBuilder setFormatting(BooleanModel formatting) {
    this.formatting = formatting;
    return this;
  }

  public ProtectionBuilder setSelection(BooleanModel selection) {
    this.selection = selection;
    return this;
  }

  public ProtectionBuilder setUserInterface(BooleanModel userInterface) {
    this.userInterface = userInterface;
    return this;
  }

  public ProtectionModel build() {
    return new ProtectionModel(this.chartObject, this.data, this.formatting, this.selection, this.userInterface);
  }

  public ProtectionBuilder from(ProtectionModel value) {
    this.chartObject = value.getChartObject();
    this.data = value.getData();
    this.formatting = value.getFormatting();
    this.selection = value.getSelection();
    this.userInterface = value.getUserInterface();
    return this;
  }
}
