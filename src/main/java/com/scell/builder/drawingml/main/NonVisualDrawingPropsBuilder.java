package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.DrawingElementIdModel;
import com.scell.model.drawingml.main.HyperlinkModel;
import com.scell.model.drawingml.main.NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;

public class NonVisualDrawingPropsBuilder {
  private BooleanModel hidden;

  private StringModel descr;

  private DrawingElementIdModel id;

  private StringModel name;

  private HyperlinkModel hlinkClick;

  private HyperlinkModel hlinkHover;

  private OfficeArtExtensionListModel extLst;

  public NonVisualDrawingPropsBuilder() {
  }

  public NonVisualDrawingPropsBuilder setHidden(BooleanModel hidden) {
    this.hidden = hidden;
    return this;
  }

  public NonVisualDrawingPropsBuilder setDescr(StringModel descr) {
    this.descr = descr;
    return this;
  }

  public NonVisualDrawingPropsBuilder setId(DrawingElementIdModel id) {
    this.id = id;
    return this;
  }

  public NonVisualDrawingPropsBuilder setName(StringModel name) {
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

  public NonVisualDrawingPropsModel build() {
    return new NonVisualDrawingPropsModel(this.hidden, this.descr, this.id, this.name, this.hlinkClick, this.hlinkHover, this.extLst);
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
}
