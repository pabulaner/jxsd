package test.drawingml.chartDrawing;

import test.XMLSchema.BooleanModel;
import test.XMLSchema.StringModel;
import test.drawingml.main.CTShapePropertiesModel;
import test.drawingml.main.CTShapeStyleModel;

public class CTConnectorModel {
  private final BooleanModel fPublished;

  private final StringModel macro;

  private final CTConnectorNonVisualModel nvCxnSpPr;

  private final CTShapePropertiesModel spPr;

  private final CTShapeStyleModel style;

  public CTConnectorModel(BooleanModel fPublished, StringModel macro,
      CTConnectorNonVisualModel nvCxnSpPr, CTShapePropertiesModel spPr, CTShapeStyleModel style) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.nvCxnSpPr = nvCxnSpPr;
    this.spPr = spPr;
    this.style = style;
  }

  public BooleanModel getFPublished() {
    return this.fPublished;
  }

  public StringModel getMacro() {
    return this.macro;
  }

  public CTConnectorNonVisualModel getNvCxnSpPr() {
    return this.nvCxnSpPr;
  }

  public CTShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CTShapeStyleModel getStyle() {
    return this.style;
  }
}
