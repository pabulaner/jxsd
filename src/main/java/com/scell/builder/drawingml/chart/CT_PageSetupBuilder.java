package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.IntModel;
import com.scell.model.XMLSchema.UnsignedIntModel;
import com.scell.model.drawingml.chart.CT_PageSetupModel;
import com.scell.model.drawingml.chart.ST_PageSetupOrientationModel;

public class CT_PageSetupBuilder {
  private IntModel verticalDpi;

  private IntModel horizontalDpi;

  private UnsignedIntModel firstPageNumber;

  private ST_PageSetupOrientationModel orientation;

  private BooleanModel draft;

  private UnsignedIntModel copies;

  private UnsignedIntModel paperSize;

  private BooleanModel useFirstPageNumber;

  private BooleanModel blackAndWhite;

  public CT_PageSetupBuilder() {
  }

  public CT_PageSetupBuilder setVerticalDpi(IntModel verticalDpi) {
    this.verticalDpi = verticalDpi;
    return this;
  }

  public CT_PageSetupBuilder setHorizontalDpi(IntModel horizontalDpi) {
    this.horizontalDpi = horizontalDpi;
    return this;
  }

  public CT_PageSetupBuilder setFirstPageNumber(UnsignedIntModel firstPageNumber) {
    this.firstPageNumber = firstPageNumber;
    return this;
  }

  public CT_PageSetupBuilder setOrientation(ST_PageSetupOrientationModel orientation) {
    this.orientation = orientation;
    return this;
  }

  public CT_PageSetupBuilder setDraft(BooleanModel draft) {
    this.draft = draft;
    return this;
  }

  public CT_PageSetupBuilder setCopies(UnsignedIntModel copies) {
    this.copies = copies;
    return this;
  }

  public CT_PageSetupBuilder setPaperSize(UnsignedIntModel paperSize) {
    this.paperSize = paperSize;
    return this;
  }

  public CT_PageSetupBuilder setUseFirstPageNumber(BooleanModel useFirstPageNumber) {
    this.useFirstPageNumber = useFirstPageNumber;
    return this;
  }

  public CT_PageSetupBuilder setBlackAndWhite(BooleanModel blackAndWhite) {
    this.blackAndWhite = blackAndWhite;
    return this;
  }

  public CT_PageSetupModel build() {
    return new CT_PageSetupModel(this.verticalDpi, this.horizontalDpi, this.firstPageNumber, this.orientation, this.draft, this.copies, this.paperSize, this.useFirstPageNumber, this.blackAndWhite);
  }

  public CT_PageSetupBuilder from(CT_PageSetupModel value) {
    this.verticalDpi = value.getVerticalDpi();
    this.horizontalDpi = value.getHorizontalDpi();
    this.firstPageNumber = value.getFirstPageNumber();
    this.orientation = value.getOrientation();
    this.draft = value.getDraft();
    this.copies = value.getCopies();
    this.paperSize = value.getPaperSize();
    this.useFirstPageNumber = value.getUseFirstPageNumber();
    this.blackAndWhite = value.getBlackAndWhite();
    return this;
  }
}
