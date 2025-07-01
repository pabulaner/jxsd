package test.drawingml.chart;

public class CTProtectionModel {
  private final CTBooleanModel chartObject;

  private final CTBooleanModel data;

  private final CTBooleanModel formatting;

  private final CTBooleanModel selection;

  private final CTBooleanModel userInterface;

  public CTProtectionModel(CTBooleanModel chartObject, CTBooleanModel data,
      CTBooleanModel formatting, CTBooleanModel selection, CTBooleanModel userInterface) {
    this.chartObject = chartObject;
    this.data = data;
    this.formatting = formatting;
    this.selection = selection;
    this.userInterface = userInterface;
  }

  public CTBooleanModel getChartObject() {
    return this.chartObject;
  }

  public CTBooleanModel getData() {
    return this.data;
  }

  public CTBooleanModel getFormatting() {
    return this.formatting;
  }

  public CTBooleanModel getSelection() {
    return this.selection;
  }

  public CTBooleanModel getUserInterface() {
    return this.userInterface;
  }
}
