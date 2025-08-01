package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.StringValueModel;

public class NonVisualDrawingPropsModel {
  private final BooleanValueModel hidden;

  private final StringValueModel descr;

  private final DrawingElementIdValueModel id;

  private final StringValueModel name;

  private final HyperlinkModel hlinkClick;

  private final HyperlinkModel hlinkHover;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualDrawingPropsModel(BooleanValueModel hidden, StringValueModel descr,
      DrawingElementIdValueModel id, StringValueModel name, HyperlinkModel hlinkClick,
      HyperlinkModel hlinkHover, OfficeArtExtensionListModel extLst) {
    this.hidden = hidden;
    this.descr = descr;
    this.id = id;
    this.name = name;
    this.hlinkClick = hlinkClick;
    this.hlinkHover = hlinkHover;
    this.extLst = extLst;
  }

  public BooleanValueModel getHidden() {
    return this.hidden;
  }

  public StringValueModel getDescr() {
    return this.descr;
  }

  public DrawingElementIdValueModel getId() {
    return this.id;
  }

  public StringValueModel getName() {
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
