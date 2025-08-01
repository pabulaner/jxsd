package com.scell.model.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.BlipFillPropertiesModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.ShapeStyleModel;

public class PictureModel {
  private final BooleanValueModel fPublished;

  private final StringValueModel macro;

  private final PictureNonVisualModel nvPicPr;

  private final BlipFillPropertiesModel blipFill;

  private final ShapePropertiesModel spPr;

  private final ShapeStyleModel style;

  public PictureModel(BooleanValueModel fPublished, StringValueModel macro,
      PictureNonVisualModel nvPicPr, BlipFillPropertiesModel blipFill, ShapePropertiesModel spPr,
      ShapeStyleModel style) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.nvPicPr = nvPicPr;
    this.blipFill = blipFill;
    this.spPr = spPr;
    this.style = style;
  }

  public BooleanValueModel getFPublished() {
    return this.fPublished;
  }

  public StringValueModel getMacro() {
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
