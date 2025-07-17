package model.drawingml.main;

import model.XMLSchema.booleanModel;
import model.XMLSchema.stringModel;
import model.officeDocument.relationships.ST_RelationshipIdModel;

public class CT_HyperlinkModel {
  private final stringModel invalidUrl;

  private final stringModel tgtFrame;

  private final ST_RelationshipIdModel id;

  private final booleanModel history;

  private final stringModel tooltip;

  private final booleanModel highlightClick;

  private final stringModel action;

  private final booleanModel endSnd;

  private final CT_EmbeddedWAVAudioFileModel snd;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_HyperlinkModel(stringModel invalidUrl, stringModel tgtFrame, ST_RelationshipIdModel id,
      booleanModel history, stringModel tooltip, booleanModel highlightClick, stringModel action,
      booleanModel endSnd, CT_EmbeddedWAVAudioFileModel snd,
      CT_OfficeArtExtensionListModel extLst) {
    this.invalidUrl = invalidUrl;
    this.tgtFrame = tgtFrame;
    this.id = id;
    this.history = history;
    this.tooltip = tooltip;
    this.highlightClick = highlightClick;
    this.action = action;
    this.endSnd = endSnd;
    this.snd = snd;
    this.extLst = extLst;
  }

  public stringModel getInvalidUrl() {
    return this.invalidUrl;
  }

  public stringModel getTgtFrame() {
    return this.tgtFrame;
  }

  public ST_RelationshipIdModel getId() {
    return this.id;
  }

  public booleanModel getHistory() {
    return this.history;
  }

  public stringModel getTooltip() {
    return this.tooltip;
  }

  public booleanModel getHighlightClick() {
    return this.highlightClick;
  }

  public stringModel getAction() {
    return this.action;
  }

  public booleanModel getEndSnd() {
    return this.endSnd;
  }

  public CT_EmbeddedWAVAudioFileModel getSnd() {
    return this.snd;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
