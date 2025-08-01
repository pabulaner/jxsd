package com.scell.model.drawingml.chart;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.IntValueModel;
import com.scell.model.XMLSchema.UnsignedIntValueModel;

public class PageSetupModel {
  private final IntValueModel verticalDpi;

  private final IntValueModel horizontalDpi;

  private final UnsignedIntValueModel firstPageNumber;

  private final PageSetupOrientationValueModel orientation;

  private final BooleanValueModel draft;

  private final UnsignedIntValueModel copies;

  private final UnsignedIntValueModel paperSize;

  private final BooleanValueModel useFirstPageNumber;

  private final BooleanValueModel blackAndWhite;

  public PageSetupModel(IntValueModel verticalDpi, IntValueModel horizontalDpi,
      UnsignedIntValueModel firstPageNumber, PageSetupOrientationValueModel orientation,
      BooleanValueModel draft, UnsignedIntValueModel copies, UnsignedIntValueModel paperSize,
      BooleanValueModel useFirstPageNumber, BooleanValueModel blackAndWhite) {
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

  public IntValueModel getVerticalDpi() {
    return this.verticalDpi;
  }

  public IntValueModel getHorizontalDpi() {
    return this.horizontalDpi;
  }

  public UnsignedIntValueModel getFirstPageNumber() {
    return this.firstPageNumber;
  }

  public PageSetupOrientationValueModel getOrientation() {
    return this.orientation;
  }

  public BooleanValueModel getDraft() {
    return this.draft;
  }

  public UnsignedIntValueModel getCopies() {
    return this.copies;
  }

  public UnsignedIntValueModel getPaperSize() {
    return this.paperSize;
  }

  public BooleanValueModel getUseFirstPageNumber() {
    return this.useFirstPageNumber;
  }

  public BooleanValueModel getBlackAndWhite() {
    return this.blackAndWhite;
  }
}
