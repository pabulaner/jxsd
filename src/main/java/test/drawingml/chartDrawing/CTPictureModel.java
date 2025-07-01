package test.drawingml.chartDrawing;

import test.XMLSchema.BooleanModel;
import test.XMLSchema.StringModel;
import test.drawingml.main.CTBlipFillPropertiesModel;
import test.drawingml.main.CTShapePropertiesModel;
import test.drawingml.main.CTShapeStyleModel;

public class CTPictureModel {
  private final BooleanModel fPublished;

  private final StringModel macro;

  private final CTPictureNonVisualModel nvPicPr;

  private final CTBlipFillPropertiesModel blipFill;

  private final CTShapePropertiesModel spPr;

  private final CTShapeStyleModel style;

  public CTPictureModel(BooleanModel fPublished, StringModel macro, CTPictureNonVisualModel nvPicPr,
      CTBlipFillPropertiesModel blipFill, CTShapePropertiesModel spPr, CTShapeStyleModel style) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.nvPicPr = nvPicPr;
    this.blipFill = blipFill;
    this.spPr = spPr;
    this.style = style;
  }

  public BooleanModel getFPublished() {
    return this.fPublished;
  }

  public StringModel getMacro() {
    return this.macro;
  }

  public CTPictureNonVisualModel getNvPicPr() {
    return this.nvPicPr;
  }

  public CTBlipFillPropertiesModel getBlipFill() {
    return this.blipFill;
  }

  public CTShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CTShapeStyleModel getStyle() {
    return this.style;
  }
}
