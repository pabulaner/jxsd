package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PageSetupModel;
import jxsd.gen.model.drawingml.chart.PageSetupOrientationValueModel;

/**
 * This is a generated sequence class.
 */
public class PageSetupBuilder {
  private int verticalDpi;

  private int horizontalDpi;

  private long firstPageNumber;

  private PageSetupOrientationValueModel orientation;

  private boolean draft;

  private long copies;

  private long paperSize;

  private boolean useFirstPageNumber;

  private boolean blackAndWhite;

  public PageSetupBuilder() {
  }

  public PageSetupBuilder setVerticalDpi(int verticalDpi) {
    this.verticalDpi = verticalDpi;
    return this;
  }

  public PageSetupBuilder setHorizontalDpi(int horizontalDpi) {
    this.horizontalDpi = horizontalDpi;
    return this;
  }

  public PageSetupBuilder setFirstPageNumber(long firstPageNumber) {
    this.firstPageNumber = firstPageNumber;
    return this;
  }

  public PageSetupBuilder setOrientation(PageSetupOrientationValueModel orientation) {
    this.orientation = orientation;
    return this;
  }

  public PageSetupBuilder setDraft(boolean draft) {
    this.draft = draft;
    return this;
  }

  public PageSetupBuilder setCopies(long copies) {
    this.copies = copies;
    return this;
  }

  public PageSetupBuilder setPaperSize(long paperSize) {
    this.paperSize = paperSize;
    return this;
  }

  public PageSetupBuilder setUseFirstPageNumber(boolean useFirstPageNumber) {
    this.useFirstPageNumber = useFirstPageNumber;
    return this;
  }

  public PageSetupBuilder setBlackAndWhite(boolean blackAndWhite) {
    this.blackAndWhite = blackAndWhite;
    return this;
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

  public PageSetupModel build() {
    return new PageSetupModel(this.verticalDpi, this.horizontalDpi, this.firstPageNumber, this.orientation, this.draft, this.copies, this.paperSize, this.useFirstPageNumber, this.blackAndWhite);
  }
}
