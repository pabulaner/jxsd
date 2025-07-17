package model.drawingml.chartDrawing;

import model.XMLSchema.booleanModel;
import model.XMLSchema.stringModel;
import model.drawingml.main.CT_BlipFillPropertiesModel;
import model.drawingml.main.CT_ShapePropertiesModel;
import model.drawingml.main.CT_ShapeStyleModel;

public class CT_PictureModel {
  private final booleanModel fPublished;

  private final stringModel macro;

  private final CT_PictureNonVisualModel nvPicPr;

  private final CT_BlipFillPropertiesModel blipFill;

  private final CT_ShapePropertiesModel spPr;

  private final CT_ShapeStyleModel style;

  public CT_PictureModel(booleanModel fPublished, stringModel macro,
      CT_PictureNonVisualModel nvPicPr, CT_BlipFillPropertiesModel blipFill,
      CT_ShapePropertiesModel spPr, CT_ShapeStyleModel style) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.nvPicPr = nvPicPr;
    this.blipFill = blipFill;
    this.spPr = spPr;
    this.style = style;
  }

  public booleanModel getFPublished() {
    return this.fPublished;
  }

  public stringModel getMacro() {
    return this.macro;
  }

  public CT_PictureNonVisualModel getNvPicPr() {
    return this.nvPicPr;
  }

  public CT_BlipFillPropertiesModel getBlipFill() {
    return this.blipFill;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CT_ShapeStyleModel getStyle() {
    return this.style;
  }
}
