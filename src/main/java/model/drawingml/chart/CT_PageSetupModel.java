package model.drawingml.chart;

import model.XMLSchema.booleanModel;
import model.XMLSchema.intModel;
import model.XMLSchema.unsignedIntModel;

public class CT_PageSetupModel {
  private final intModel verticalDpi;

  private final intModel horizontalDpi;

  private final unsignedIntModel firstPageNumber;

  private final ST_PageSetupOrientationModel orientation;

  private final booleanModel draft;

  private final unsignedIntModel copies;

  private final unsignedIntModel paperSize;

  private final booleanModel useFirstPageNumber;

  private final booleanModel blackAndWhite;

  public CT_PageSetupModel(intModel verticalDpi, intModel horizontalDpi,
      unsignedIntModel firstPageNumber, ST_PageSetupOrientationModel orientation,
      booleanModel draft, unsignedIntModel copies, unsignedIntModel paperSize,
      booleanModel useFirstPageNumber, booleanModel blackAndWhite) {
    this.verticalDpi = verticalDpi;
    this.horizontalDpi = horizontalDpi;
    this.firstPageNumber = firstPageNumber;
    this.orientation = orientation;
    this.draft = draft;
    this.copies = copies;
    this.paperSize = paperSize;
    this.useFirstPageNumber = useFirstPageNumber;
    this.blackAndWhite = blackAndWhite;
  }

  public intModel getVerticalDpi() {
    return this.verticalDpi;
  }

  public intModel getHorizontalDpi() {
    return this.horizontalDpi;
  }

  public unsignedIntModel getFirstPageNumber() {
    return this.firstPageNumber;
  }

  public ST_PageSetupOrientationModel getOrientation() {
    return this.orientation;
  }

  public booleanModel getDraft() {
    return this.draft;
  }

  public unsignedIntModel getCopies() {
    return this.copies;
  }

  public unsignedIntModel getPaperSize() {
    return this.paperSize;
  }

  public booleanModel getUseFirstPageNumber() {
    return this.useFirstPageNumber;
  }

  public booleanModel getBlackAndWhite() {
    return this.blackAndWhite;
  }
}
