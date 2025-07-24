package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.PictureFormatModel;
import com.scell.model.drawingml.chart.PictureOptionsModel;
import com.scell.model.drawingml.chart.PictureStackUnitModel;

public class PictureOptionsBuilder {
  private BooleanModel applyToFront;

  private BooleanModel applyToSides;

  private BooleanModel applyToEnd;

  private PictureFormatModel pictureFormat;

  private PictureStackUnitModel pictureStackUnit;

  public PictureOptionsBuilder() {
  }

  public PictureOptionsBuilder setApplyToFront(BooleanModel applyToFront) {
    this.applyToFront = applyToFront;
    return this;
  }

  public PictureOptionsBuilder setApplyToSides(BooleanModel applyToSides) {
    this.applyToSides = applyToSides;
    return this;
  }

  public PictureOptionsBuilder setApplyToEnd(BooleanModel applyToEnd) {
    this.applyToEnd = applyToEnd;
    return this;
  }

  public PictureOptionsBuilder setPictureFormat(PictureFormatModel pictureFormat) {
    this.pictureFormat = pictureFormat;
    return this;
  }

  public PictureOptionsBuilder setPictureStackUnit(PictureStackUnitModel pictureStackUnit) {
    this.pictureStackUnit = pictureStackUnit;
    return this;
  }

  public PictureOptionsModel build() {
    return new PictureOptionsModel(this.applyToFront, this.applyToSides, this.applyToEnd, this.pictureFormat, this.pictureStackUnit);
  }

  public PictureOptionsBuilder from(PictureOptionsModel value) {
    this.applyToFront = value.getApplyToFront();
    this.applyToSides = value.getApplyToSides();
    this.applyToEnd = value.getApplyToEnd();
    this.pictureFormat = value.getPictureFormat();
    this.pictureStackUnit = value.getPictureStackUnit();
    return this;
  }
}
