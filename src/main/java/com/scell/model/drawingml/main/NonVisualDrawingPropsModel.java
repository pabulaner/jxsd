package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;

public class NonVisualDrawingPropsModel {
  private final BooleanModel hidden;

  private final StringModel descr;

  private final DrawingElementIdModel id;

  private final StringModel name;

  private final HyperlinkModel hlinkClick;

  private final HyperlinkModel hlinkHover;

  private final OfficeArtExtensionListModel extLst;

  public NonVisualDrawingPropsModel(BooleanModel hidden, StringModel descr,
      DrawingElementIdModel id, StringModel name, HyperlinkModel hlinkClick,
      HyperlinkModel hlinkHover, OfficeArtExtensionListModel extLst) {
    this.hidden = hidden;
    this.descr = descr;
    this.id = id;
    this.name = name;
    this.hlinkClick = hlinkClick;
    this.hlinkHover = hlinkHover;
    this.extLst = extLst;
  }

  public BooleanModel getHidden() {
    return this.hidden;
  }

  public StringModel getDescr() {
    return this.descr;
  }

  public DrawingElementIdModel getId() {
    return this.id;
  }

  public StringModel getName() {
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
