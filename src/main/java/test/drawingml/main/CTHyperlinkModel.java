package test.drawingml.main;

import test.XMLSchema.BooleanModel;
import test.XMLSchema.StringModel;
import test.officeDocument.relationships.STRelationshipIdModel;

public class CTHyperlinkModel {
  private final StringModel invalidUrl;

  private final StringModel tgtFrame;

  private final STRelationshipIdModel id;

  private final BooleanModel history;

  private final StringModel tooltip;

  private final BooleanModel highlightClick;

  private final StringModel action;

  private final BooleanModel endSnd;

  private final CTEmbeddedWAVAudioFileModel snd;

  private final CTOfficeArtExtensionListModel extLst;

  public CTHyperlinkModel(StringModel invalidUrl, StringModel tgtFrame, STRelationshipIdModel id,
      BooleanModel history, StringModel tooltip, BooleanModel highlightClick, StringModel action,
      BooleanModel endSnd, CTEmbeddedWAVAudioFileModel snd, CTOfficeArtExtensionListModel extLst) {
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

  public StringModel getInvalidUrl() {
    return this.invalidUrl;
  }

  public StringModel getTgtFrame() {
    return this.tgtFrame;
  }

  public STRelationshipIdModel getId() {
    return this.id;
  }

  public BooleanModel getHistory() {
    return this.history;
  }

  public StringModel getTooltip() {
    return this.tooltip;
  }

  public BooleanModel getHighlightClick() {
    return this.highlightClick;
  }

  public StringModel getAction() {
    return this.action;
  }

  public BooleanModel getEndSnd() {
    return this.endSnd;
  }

  public CTEmbeddedWAVAudioFileModel getSnd() {
    return this.snd;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
