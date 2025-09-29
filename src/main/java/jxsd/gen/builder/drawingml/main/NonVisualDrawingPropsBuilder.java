package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.HyperlinkModel;
import jxsd.gen.model.drawingml.main.NonVisualDrawingPropsModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;

/**
 * This is a generated sequence class.
 */
public class NonVisualDrawingPropsBuilder {
  private boolean hidden;

  private String descr;

  private long id;

  private String name;

  private HyperlinkModel hlinkClick;

  private HyperlinkModel hlinkHover;

  private OfficeArtExtensionListModel extLst;

  public NonVisualDrawingPropsBuilder() {
  }

  public NonVisualDrawingPropsBuilder setHidden(boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  public NonVisualDrawingPropsBuilder setDescr(String descr) {
    this.descr = descr;
    return this;
  }

  public NonVisualDrawingPropsBuilder setId(long id) {
    this.id = id;
    return this;
  }

  public NonVisualDrawingPropsBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public NonVisualDrawingPropsBuilder setHlinkClick(HyperlinkModel hlinkClick) {
    this.hlinkClick = hlinkClick;
    return this;
  }

  public NonVisualDrawingPropsBuilder setHlinkHover(HyperlinkModel hlinkHover) {
    this.hlinkHover = hlinkHover;
    return this;
  }

  public NonVisualDrawingPropsBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public NonVisualDrawingPropsBuilder from(NonVisualDrawingPropsModel value) {
    this.hidden = value.getHidden();
    this.descr = value.getDescr();
    this.id = value.getId();
    this.name = value.getName();
    this.hlinkClick = value.getHlinkClick();
    this.hlinkHover = value.getHlinkHover();
    this.extLst = value.getExtLst();
    return this;
  }

  public NonVisualDrawingPropsModel build() {
    return new NonVisualDrawingPropsModel(this.hidden, this.descr, this.id, this.name, this.hlinkClick, this.hlinkHover, this.extLst);
  }
}
