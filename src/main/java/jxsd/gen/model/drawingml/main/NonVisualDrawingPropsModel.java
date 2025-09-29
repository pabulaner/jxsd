package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.NonVisualDrawingPropsBuilder;

/**
 * This is a generated sequence class.
 */
public class NonVisualDrawingPropsModel {
  private final boolean hidden;

  private final String descr;

  private final long id;

  private final String name;

  private final HyperlinkModel hlinkClick;

  private final HyperlinkModel hlinkHover;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualDrawingPropsModel(boolean hidden, String descr, long id, String name,
      HyperlinkModel hlinkClick, HyperlinkModel hlinkHover, OfficeArtExtensionListModel extLst) {
    this.hidden = hidden;
    this.descr = descr;
    this.id = id;
    this.name = name;
    this.hlinkClick = hlinkClick;
    this.hlinkHover = hlinkHover;
    this.extLst = extLst;
  }

  public NonVisualDrawingPropsBuilder builder() {
    return new NonVisualDrawingPropsBuilder().from(this);
  }

  public boolean getHidden() {
    return this.hidden;
  }

  public String getDescr() {
    return this.descr;
  }

  public long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public HyperlinkModel getHlinkClick() {
    return this.hlinkClick;
  }

  public HyperlinkModel getHlinkHover() {
    return this.hlinkHover;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
