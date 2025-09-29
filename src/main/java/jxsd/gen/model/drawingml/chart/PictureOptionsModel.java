package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.PictureOptionsBuilder;

/**
 * This is a generated sequence class.
 */
public class PictureOptionsModel {
  private final BooleanModel applyToFront;

  private final BooleanModel applyToSides;

  private final BooleanModel applyToEnd;

  private final PictureFormatModel pictureFormat;

  private final PictureStackUnitModel pictureStackUnit;

  public PictureOptionsModel(BooleanModel applyToFront, BooleanModel applyToSides,
      BooleanModel applyToEnd, PictureFormatModel pictureFormat,
      PictureStackUnitModel pictureStackUnit) {
    this.applyToFront = applyToFront;
    this.applyToSides = applyToSides;
    this.applyToEnd = applyToEnd;
    this.pictureFormat = pictureFormat;
    this.pictureStackUnit = pictureStackUnit;
  }

  public PictureOptionsBuilder builder() {
    return new PictureOptionsBuilder().from(this);
  }

  public BooleanModel getApplyToFront() {
    return this.applyToFront;
  }

  public BooleanModel getApplyToSides() {
    return this.applyToSides;
  }

  public BooleanModel getApplyToEnd() {
    return this.applyToEnd;
  }

  public PictureFormatModel getPictureFormat() {
    return this.pictureFormat;
  }

  public PictureStackUnitModel getPictureStackUnit() {
    return this.pictureStackUnit;
  }
}
