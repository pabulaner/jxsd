package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.IntModel;
import com.scell.model.XMLSchema.UnsignedIntModel;
import com.scell.model.drawingml.chart.PageSetupModel;
import com.scell.model.drawingml.chart.PageSetupOrientationModel;

public class PageSetupBuilder {
  private IntModel verticalDpi;

  private IntModel horizontalDpi;

  private UnsignedIntModel firstPageNumber;

  private PageSetupOrientationModel orientation;

  private BooleanModel draft;

  private UnsignedIntModel copies;

  private UnsignedIntModel paperSize;

  private BooleanModel useFirstPageNumber;

  private BooleanModel blackAndWhite;

  public PageSetupBuilder() {
  }

  public PageSetupBuilder setVerticalDpi(IntModel verticalDpi) {
    this.verticalDpi = verticalDpi;
    return this;
  }

  public PageSetupBuilder setHorizontalDpi(IntModel horizontalDpi) {
    this.horizontalDpi = horizontalDpi;
    return this;
  }

  public PageSetupBuilder setFirstPageNumber(UnsignedIntModel firstPageNumber) {
    this.firstPageNumber = firstPageNumber;
    return this;
  }

  public PageSetupBuilder setOrientation(PageSetupOrientationModel orientation) {
    this.orientation = orientation;
    return this;
  }

  public PageSetupBuilder setDraft(BooleanModel draft) {
    this.draft = draft;
    return this;
  }

  public PageSetupBuilder setCopies(UnsignedIntModel copies) {
    this.copies = copies;
    return this;
  }

  public PageSetupBuilder setPaperSize(UnsignedIntModel paperSize) {
    this.paperSize = paperSize;
    return this;
  }

  public PageSetupBuilder setUseFirstPageNumber(BooleanModel useFirstPageNumber) {
    this.useFirstPageNumber = useFirstPageNumber;
    return this;
  }

  public PageSetupBuilder setBlackAndWhite(BooleanModel blackAndWhite) {
    this.blackAndWhite = blackAndWhite;
    return this;
  }

  public PageSetupModel build() {
    return new PageSetupModel(this.verticalDpi, this.horizontalDpi, this.firstPageNumber, this.orientation, this.draft, this.copies, this.paperSize, this.useFirstPageNumber, this.blackAndWhite);
  }

  public PageSetupBuilder from(PageSetupModel value) {
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
