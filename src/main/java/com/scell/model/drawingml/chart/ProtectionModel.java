package com.scell.model.drawingml.chart;

public class ProtectionModel {
  private final BooleanModel chartObject;

  private final BooleanModel data;

  private final BooleanModel formatting;

  private final BooleanModel selection;

  private final BooleanModel userInterface;

  public ProtectionModel(BooleanModel chartObject, BooleanModel data, BooleanModel formatting,
      BooleanModel selection, BooleanModel userInterface) {
    this.chartObject = chartObject;
    this.data = data;
    this.formatting = formatting;
    this.selection = selection;
    this.userInterface = userInterface;
  }

  public BooleanModel getChartObject() {
    return this.chartObject;
  }

  public BooleanModel getData() {
    return this.data;
  }

  public BooleanModel getFormatting() {
    return this.formatting;
  }

  public BooleanModel getSelection() {
    return this.selection;
  }

  public BooleanModel getUserInterface() {
    return this.userInterface;
  }
}
