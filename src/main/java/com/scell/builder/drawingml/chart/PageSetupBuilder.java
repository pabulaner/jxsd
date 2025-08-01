package com.scell.builder.drawingml.chart;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.IntValueModel;
import com.scell.model.XMLSchema.UnsignedIntValueModel;
import com.scell.model.drawingml.chart.PageSetupModel;
import com.scell.model.drawingml.chart.PageSetupOrientationValueModel;

public class PageSetupBuilder {
  private IntValueModel verticalDpi;

  private IntValueModel horizontalDpi;

  private UnsignedIntValueModel firstPageNumber;

  private PageSetupOrientationValueModel orientation;

  private BooleanValueModel draft;

  private UnsignedIntValueModel copies;

  private UnsignedIntValueModel paperSize;

  private BooleanValueModel useFirstPageNumber;

  private BooleanValueModel blackAndWhite;

  public PageSetupBuilder() {
  }

  public PageSetupBuilder setVerticalDpi(IntValueModel verticalDpi) {
    this.verticalDpi = verticalDpi;
    return this;
  }

  public PageSetupBuilder setHorizontalDpi(IntValueModel horizontalDpi) {
    this.horizontalDpi = horizontalDpi;
    return this;
  }

  public PageSetupBuilder setFirstPageNumber(UnsignedIntValueModel firstPageNumber) {
    this.firstPageNumber = firstPageNumber;
    return this;
  }

  public PageSetupBuilder setOrientation(PageSetupOrientationValueModel orientation) {
    this.orientation = orientation;
    return this;
  }

  public PageSetupBuilder setDraft(BooleanValueModel draft) {
    this.draft = draft;
    return this;
  }

  public PageSetupBuilder setCopies(UnsignedIntValueModel copies) {
    this.copies = copies;
    return this;
  }

  public PageSetupBuilder setPaperSize(UnsignedIntValueModel paperSize) {
    this.paperSize = paperSize;
    return this;
  }

  public PageSetupBuilder setUseFirstPageNumber(BooleanValueModel useFirstPageNumber) {
    this.useFirstPageNumber = useFirstPageNumber;
    return this;
  }

  public PageSetupBuilder setBlackAndWhite(BooleanValueModel blackAndWhite) {
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
