package model.drawingml.main;

import model.XMLSchema.booleanModel;
import model.XMLSchema.stringModel;

public class CT_NonVisualDrawingPropsModel {
  private final booleanModel hidden;

  private final stringModel descr;

  private final ST_DrawingElementIdModel id;

  private final stringModel name;

  private final CT_HyperlinkModel hlinkClick;

  private final CT_HyperlinkModel hlinkHover;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_NonVisualDrawingPropsModel(booleanModel hidden, stringModel descr,
      ST_DrawingElementIdModel id, stringModel name, CT_HyperlinkModel hlinkClick,
      CT_HyperlinkModel hlinkHover, CT_OfficeArtExtensionListModel extLst) {
    this.hidden = hidden;
    this.descr = descr;
    this.id = id;
    this.name = name;
    this.hlinkClick = hlinkClick;
    this.hlinkHover = hlinkHover;
    this.extLst = extLst;
  }

  public booleanModel getHidden() {
    return this.hidden;
  }

  public stringModel getDescr() {
    return this.descr;
  }

  public ST_DrawingElementIdModel getId() {
    return this.id;
  }

  public stringModel getName() {
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
