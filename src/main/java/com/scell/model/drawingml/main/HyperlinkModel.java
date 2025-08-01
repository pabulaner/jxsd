package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.officeDocument.relationships.RelationshipIdValueModel;

public class HyperlinkModel {
  private final StringValueModel invalidUrl;

  private final StringValueModel tgtFrame;

  private final RelationshipIdValueModel id;

  private final BooleanValueModel history;

  private final StringValueModel tooltip;

  private final BooleanValueModel highlightClick;

  private final StringValueModel action;

  private final BooleanValueModel endSnd;

  private final EmbeddedWAVAudioFileModel snd;

  private final OfficeArtExtensionListModel extLst;

  public HyperlinkModel(StringValueModel invalidUrl, StringValueModel tgtFrame,
      RelationshipIdValueModel id, BooleanValueModel history, StringValueModel tooltip,
      BooleanValueModel highlightClick, StringValueModel action, BooleanValueModel endSnd,
      EmbeddedWAVAudioFileModel snd, OfficeArtExtensionListModel extLst) {
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

  public StringValueModel getInvalidUrl() {
    return this.invalidUrl;
  }

  public StringValueModel getTgtFrame() {
    return this.tgtFrame;
  }

  public RelationshipIdValueModel getId() {
    return this.id;
  }

  public BooleanValueModel getHistory() {
    return this.history;
  }

  public StringValueModel getTooltip() {
    return this.tooltip;
  }

  public BooleanValueModel getHighlightClick() {
    return this.highlightClick;
  }

  public StringValueModel getAction() {
    return this.action;
  }

  public BooleanValueModel getEndSnd() {
    return this.endSnd;
  }

  public EmbeddedWAVAudioFileModel getSnd() {
    return this.snd;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
