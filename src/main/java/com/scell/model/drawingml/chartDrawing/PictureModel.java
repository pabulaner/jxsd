package com.scell.model.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.BlipFillPropertiesModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.ShapeStyleModel;

public class PictureModel {
  private final BooleanModel fPublished;

  private final StringModel macro;

  private final PictureNonVisualModel nvPicPr;

  private final BlipFillPropertiesModel blipFill;

  private final ShapePropertiesModel spPr;

  private final ShapeStyleModel style;

  public PictureModel(BooleanModel fPublished, StringModel macro, PictureNonVisualModel nvPicPr,
      BlipFillPropertiesModel blipFill, ShapePropertiesModel spPr, ShapeStyleModel style) {
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

  public PictureNonVisualModel getNvPicPr() {
    return this.nvPicPr;
  }

  public BlipFillPropertiesModel getBlipFill() {
    return this.blipFill;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public ShapeStyleModel getStyle() {
    return this.style;
  }
}
