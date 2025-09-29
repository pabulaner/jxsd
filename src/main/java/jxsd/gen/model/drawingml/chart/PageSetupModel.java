package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.PageSetupBuilder;

/**
 * This is a generated sequence class.
 */
public class PageSetupModel {
  private final int verticalDpi;

  private final int horizontalDpi;

  private final long firstPageNumber;

  private final PageSetupOrientationValueModel orientation;

  private final boolean draft;

  private final long copies;

  private final long paperSize;

  private final boolean useFirstPageNumber;

  private final boolean blackAndWhite;

  public PageSetupModel(int verticalDpi, int horizontalDpi, long firstPageNumber,
      PageSetupOrientationValueModel orientation, boolean draft, long copies, long paperSize,
      boolean useFirstPageNumber, boolean blackAndWhite) {
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

  public PageSetupBuilder builder() {
    return new PageSetupBuilder().from(this);
  }

  public int getVerticalDpi() {
    return this.verticalDpi;
  }

  public int getHorizontalDpi() {
    return this.horizontalDpi;
  }

  public long getFirstPageNumber() {
    return this.firstPageNumber;
  }

  public PageSetupOrientationValueModel getOrientation() {
    return this.orientation;
  }

  public boolean getDraft() {
    return this.draft;
  }

  public long getCopies() {
    return this.copies;
  }

  public long getPaperSize() {
    return this.paperSize;
  }

  public boolean getUseFirstPageNumber() {
    return this.useFirstPageNumber;
  }

  public boolean getBlackAndWhite() {
    return this.blackAndWhite;
  }
}
