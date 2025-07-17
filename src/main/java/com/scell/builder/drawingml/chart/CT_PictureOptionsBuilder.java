package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_PictureFormatModel;
import com.scell.model.drawingml.chart.CT_PictureOptionsModel;
import com.scell.model.drawingml.chart.CT_PictureStackUnitModel;

public class CT_PictureOptionsBuilder {
  private CT_BooleanModel applyToFront;

  private CT_BooleanModel applyToSides;

  private CT_BooleanModel applyToEnd;

  private CT_PictureFormatModel pictureFormat;

  private CT_PictureStackUnitModel pictureStackUnit;

  public CT_PictureOptionsBuilder() {
  }

  public CT_PictureOptionsBuilder setApplyToFront(CT_BooleanModel applyToFront) {
    this.applyToFront = applyToFront;
    return this;
  }

  public CT_PictureOptionsBuilder setApplyToSides(CT_BooleanModel applyToSides) {
    this.applyToSides = applyToSides;
    return this;
  }

  public CT_PictureOptionsBuilder setApplyToEnd(CT_BooleanModel applyToEnd) {
    this.applyToEnd = applyToEnd;
    return this;
  }

  public CT_PictureOptionsBuilder setPictureFormat(CT_PictureFormatModel pictureFormat) {
    this.pictureFormat = pictureFormat;
    return this;
  }

  public CT_PictureOptionsBuilder setPictureStackUnit(CT_PictureStackUnitModel pictureStackUnit) {
    this.pictureStackUnit = pictureStackUnit;
    return this;
  }

  public CT_PictureOptionsModel build() {
    return new CT_PictureOptionsModel(this.applyToFront, this.applyToSides, this.applyToEnd, this.pictureFormat, this.pictureStackUnit);
  }

  public CT_PictureOptionsBuilder from(CT_PictureOptionsModel value) {
    this.applyToFront = value.getApplyToFront();
    this.applyToSides = value.getApplyToSides();
    this.applyToEnd = value.getApplyToEnd();
    this.pictureFormat = value.getPictureFormat();
    this.pictureStackUnit = value.getPictureStackUnit();
    return this;
  }
}
