package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.PictureFormatModel;
import jxsd.gen.model.drawingml.chart.PictureOptionsModel;
import jxsd.gen.model.drawingml.chart.PictureStackUnitModel;

/**
 * This is a generated sequence class.
 */
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

  public PictureOptionsBuilder from(PictureOptionsModel value) {
    this.applyToFront = value.getApplyToFront();
    this.applyToSides = value.getApplyToSides();
    this.applyToEnd = value.getApplyToEnd();
    this.pictureFormat = value.getPictureFormat();
    this.pictureStackUnit = value.getPictureStackUnit();
    return this;
  }

  public PictureOptionsModel build() {
    return new PictureOptionsModel(this.applyToFront, this.applyToSides, this.applyToEnd, this.pictureFormat, this.pictureStackUnit);
  }
}
