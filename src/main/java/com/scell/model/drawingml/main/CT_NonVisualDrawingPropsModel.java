package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;

public class CT_NonVisualDrawingPropsModel {
  private final BooleanModel hidden;

  private final StringModel descr;

  private final ST_DrawingElementIdModel id;

  private final StringModel name;

  private final CT_HyperlinkModel hlinkClick;

  private final CT_HyperlinkModel hlinkHover;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_NonVisualDrawingPropsModel(BooleanModel hidden, StringModel descr,
      ST_DrawingElementIdModel id, StringModel name, CT_HyperlinkModel hlinkClick,
      CT_HyperlinkModel hlinkHover, CT_OfficeArtExtensionListModel extLst) {
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

  public ST_DrawingElementIdModel getId() {
    return this.id;
  }

  public StringModel getName() {
    return this.name;
  }

  public CT_HyperlinkModel getHlinkClick() {
    return this.hlinkClick;
  }

  public CT_HyperlinkModel getHlinkHover() {
    return this.hlinkHover;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
