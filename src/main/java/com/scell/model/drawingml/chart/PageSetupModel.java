package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.IntModel;
import com.scell.model.XMLSchema.UnsignedIntModel;

public class PageSetupModel {
  private final IntModel verticalDpi;

  private final IntModel horizontalDpi;

  private final UnsignedIntModel firstPageNumber;

  private final PageSetupOrientationModel orientation;

  private final BooleanModel draft;

  private final UnsignedIntModel copies;

  private final UnsignedIntModel paperSize;

  private final BooleanModel useFirstPageNumber;

  private final BooleanModel blackAndWhite;

  public PageSetupModel(IntModel verticalDpi, IntModel horizontalDpi,
      UnsignedIntModel firstPageNumber, PageSetupOrientationModel orientation, BooleanModel draft,
      UnsignedIntModel copies, UnsignedIntModel paperSize, BooleanModel useFirstPageNumber,
      BooleanModel blackAndWhite) {
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

  public IntModel getVerticalDpi() {
    return this.verticalDpi;
  }

  public IntModel getHorizontalDpi() {
    return this.horizontalDpi;
  }

  public UnsignedIntModel getFirstPageNumber() {
    return this.firstPageNumber;
  }

  public PageSetupOrientationModel getOrientation() {
    return this.orientation;
  }

  public BooleanModel getDraft() {
    return this.draft;
  }

  public UnsignedIntModel getCopies() {
    return this.copies;
  }

  public UnsignedIntModel getPaperSize() {
    return this.paperSize;
  }

  public BooleanModel getUseFirstPageNumber() {
    return this.useFirstPageNumber;
  }

  public BooleanModel getBlackAndWhite() {
    return this.blackAndWhite;
  }
}
