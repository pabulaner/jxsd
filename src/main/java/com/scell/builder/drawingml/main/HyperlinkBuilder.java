package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.EmbeddedWAVAudioFileModel;
import com.scell.model.drawingml.main.HyperlinkModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.officeDocument.relationships.RelationshipIdModel;

public class HyperlinkBuilder {
  private StringModel invalidUrl;

  private StringModel tgtFrame;

  private RelationshipIdModel id;

  private BooleanModel history;

  private StringModel tooltip;

  private BooleanModel highlightClick;

  private StringModel action;

  private BooleanModel endSnd;

  private EmbeddedWAVAudioFileModel snd;

  private OfficeArtExtensionListModel extLst;

  public HyperlinkBuilder() {
  }

  public HyperlinkBuilder setInvalidUrl(StringModel invalidUrl) {
    this.invalidUrl = invalidUrl;
    return this;
  }

  public HyperlinkBuilder setTgtFrame(StringModel tgtFrame) {
    this.tgtFrame = tgtFrame;
    return this;
  }

  public HyperlinkBuilder setId(RelationshipIdModel id) {
    this.id = id;
    return this;
  }

  public HyperlinkBuilder setHistory(BooleanModel history) {
    this.history = history;
    return this;
  }

  public HyperlinkBuilder setTooltip(StringModel tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  public HyperlinkBuilder setHighlightClick(BooleanModel highlightClick) {
    this.highlightClick = highlightClick;
    return this;
  }

  public HyperlinkBuilder setAction(StringModel action) {
    this.action = action;
    return this;
  }

  public HyperlinkBuilder setEndSnd(BooleanModel endSnd) {
    this.endSnd = endSnd;
    return this;
  }

  public HyperlinkBuilder setSnd(EmbeddedWAVAudioFileModel snd) {
    this.snd = snd;
    return this;
  }

  public HyperlinkBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public HyperlinkModel build() {
    return new HyperlinkModel(this.invalidUrl, this.tgtFrame, this.id, this.history, this.tooltip, this.highlightClick, this.action, this.endSnd, this.snd, this.extLst);
  }

  public HyperlinkBuilder from(HyperlinkModel value) {
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
