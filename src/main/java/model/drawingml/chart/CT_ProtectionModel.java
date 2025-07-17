package model.drawingml.chart;

public class CT_ProtectionModel {
  private final CT_BooleanModel chartObject;

  private final CT_BooleanModel data;

  private final CT_BooleanModel formatting;

  private final CT_BooleanModel selection;

  private final CT_BooleanModel userInterface;

  public CT_ProtectionModel(CT_BooleanModel chartObject, CT_BooleanModel data,
      CT_BooleanModel formatting, CT_BooleanModel selection, CT_BooleanModel userInterface) {
    this.chartObject = chartObject;
    this.data = data;
    this.formatting = formatting;
    this.selection = selection;
    this.userInterface = userInterface;
  }

  public CT_BooleanModel getChartObject() {
    return this.chartObject;
  }

  public CT_BooleanModel getData() {
    return this.data;
  }

  public CT_BooleanModel getFormatting() {
    return this.formatting;
  }

  public CT_BooleanModel getSelection() {
    return this.selection;
  }

  public CT_BooleanModel getUserInterface() {
    return this.userInterface;
  }
}
