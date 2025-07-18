package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_EmbeddedWAVAudioFileModel;
import com.scell.model.drawingml.main.CT_HyperlinkModel;
import com.scell.model.drawingml.main.CT_OfficeArtExtensionListModel;
import com.scell.model.officeDocument.relationships.ST_RelationshipIdModel;

public class CT_HyperlinkBuilder {
  private StringModel invalidUrl;

  private StringModel tgtFrame;

  private ST_RelationshipIdModel id;

  private BooleanModel history;

  private StringModel tooltip;

  private BooleanModel highlightClick;

  private StringModel action;

  private BooleanModel endSnd;

  private CT_EmbeddedWAVAudioFileModel snd;

  private CT_OfficeArtExtensionListModel extLst;

  public CT_HyperlinkBuilder() {
  }

  public CT_HyperlinkBuilder setInvalidUrl(StringModel invalidUrl) {
    this.invalidUrl = invalidUrl;
    return this;
  }

  public CT_HyperlinkBuilder setTgtFrame(StringModel tgtFrame) {
    this.tgtFrame = tgtFrame;
    return this;
  }

  public CT_HyperlinkBuilder setId(ST_RelationshipIdModel id) {
    this.id = id;
    return this;
  }

  public CT_HyperlinkBuilder setHistory(BooleanModel history) {
    this.history = history;
    return this;
  }

  public CT_HyperlinkBuilder setTooltip(StringModel tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  public CT_HyperlinkBuilder setHighlightClick(BooleanModel highlightClick) {
    this.highlightClick = highlightClick;
    return this;
  }

  public CT_HyperlinkBuilder setAction(StringModel action) {
    this.action = action;
    return this;
  }

  public CT_HyperlinkBuilder setEndSnd(BooleanModel endSnd) {
    this.endSnd = endSnd;
    return this;
  }

  public CT_HyperlinkBuilder setSnd(CT_EmbeddedWAVAudioFileModel snd) {
    this.snd = snd;
    return this;
  }

  public CT_HyperlinkBuilder setExtLst(CT_OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_HyperlinkModel build() {
    return new CT_HyperlinkModel(this.invalidUrl, this.tgtFrame, this.id, this.history, this.tooltip, this.highlightClick, this.action, this.endSnd, this.snd, this.extLst);
  }

  public CT_HyperlinkBuilder from(CT_HyperlinkModel value) {
    this.invalidUrl = value.getInvalidUrl();
    this.tgtFrame = value.getTgtFrame();
    this.id = value.getId();
    this.history = value.getHistory();
    this.tooltip = value.getTooltip();
    this.highlightClick = value.getHighlightClick();
    this.action = value.getAction();
    this.endSnd = value.getEndSnd();
    this.snd = value.getSnd();
    this.extLst = value.getExtLst();
    return this;
  }
}
