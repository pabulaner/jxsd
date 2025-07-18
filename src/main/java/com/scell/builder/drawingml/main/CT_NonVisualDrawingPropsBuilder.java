package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_HyperlinkModel;
import com.scell.model.drawingml.main.CT_NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.ST_DrawingElementIdModel;

public class CT_NonVisualDrawingPropsBuilder {
  private BooleanModel hidden;

  private StringModel descr;

  private ST_DrawingElementIdModel id;

  private StringModel name;

  private CT_HyperlinkModel hlinkClick;

  private CT_HyperlinkModel hlinkHover;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_NonVisualDrawingPropsBuilder() {
  }

  public CT_NonVisualDrawingPropsBuilder setHidden(BooleanModel hidden) {
    this.hidden = hidden;
    return this;
  }

  public CT_NonVisualDrawingPropsBuilder setDescr(StringModel descr) {
    this.descr = descr;
    return this;
  }

  public CT_NonVisualDrawingPropsBuilder setId(ST_DrawingElementIdModel id) {
    this.id = id;
    return this;
  }

  public CT_NonVisualDrawingPropsBuilder setName(StringModel name) {
    this.name = name;
    return this;
  }

  public CT_NonVisualDrawingPropsBuilder setHlinkClick(CT_HyperlinkModel hlinkClick) {
    this.hlinkClick = hlinkClick;
    return this;
  }

  public CT_NonVisualDrawingPropsBuilder setHlinkHover(CT_HyperlinkModel hlinkHover) {
    this.hlinkHover = hlinkHover;
    return this;
  }

  public CT_NonVisualDrawingPropsBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_NonVisualDrawingPropsModel build() {
    return new CT_NonVisualDrawingPropsModel(this.hidden, this.descr, this.id, this.name, this.hlinkClick, this.hlinkHover, this.extLst);
  }

  public CT_NonVisualDrawingPropsBuilder from(CT_NonVisualDrawingPropsModel value) {
    this.hidden = value.getHidden();
    this.descr = value.getDescr();
    this.id = value.getId();
    this.name = value.getName();
    this.hlinkClick = value.getHlinkClick();
    this.hlinkHover = value.getHlinkHover();
    this.extLst = value.getExtLst();
    return this;
  }
}
