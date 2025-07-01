package test.drawingml.chart;

public class CTPictureOptionsModel {
  private final CTBooleanModel applyToFront;

  private final CTBooleanModel applyToSides;

  private final CTBooleanModel applyToEnd;

  private final CTPictureFormatModel pictureFormat;

  private final CTPictureStackUnitModel pictureStackUnit;

  public CTPictureOptionsModel(CTBooleanModel applyToFront, CTBooleanModel applyToSides,
      CTBooleanModel applyToEnd, CTPictureFormatModel pictureFormat,
      CTPictureStackUnitModel pictureStackUnit) {
    this.applyToFront = applyToFront;
    this.applyToSides = applyToSides;
    this.applyToEnd = applyToEnd;
    this.pictureFormat = pictureFormat;
    this.pictureStackUnit = pictureStackUnit;
  }

  public CTBooleanModel getApplyToFront() {
    return this.applyToFront;
  }

  public CTBooleanModel getApplyToSides() {
    return this.applyToSides;
  }

  public CTBooleanModel getApplyToEnd() {
    return this.applyToEnd;
  }

  public CTPictureFormatModel getPictureFormat() {
    return this.pictureFormat;
  }

  public CTPictureStackUnitModel getPictureStackUnit() {
    return this.pictureStackUnit;
  }
}
