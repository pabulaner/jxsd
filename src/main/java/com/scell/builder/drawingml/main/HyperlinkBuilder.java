package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.EmbeddedWAVAudioFileModel;
import com.scell.model.drawingml.main.HyperlinkModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.officeDocument.relationships.RelationshipIdValueModel;

public class HyperlinkBuilder {
  private StringValueModel invalidUrl;

  private StringValueModel tgtFrame;

  private RelationshipIdValueModel id;

  private BooleanValueModel history;

  private StringValueModel tooltip;

  private BooleanValueModel highlightClick;

  private StringValueModel action;

  private BooleanValueModel endSnd;

  private EmbeddedWAVAudioFileModel snd;

  private OfficeArtExtensionListModel extLst;

  public HyperlinkBuilder() {
  }

  public HyperlinkBuilder setInvalidUrl(StringValueModel invalidUrl) {
    this.invalidUrl = invalidUrl;
    return this;
  }

  public HyperlinkBuilder setTgtFrame(StringValueModel tgtFrame) {
    this.tgtFrame = tgtFrame;
    return this;
  }

  public HyperlinkBuilder setId(RelationshipIdValueModel id) {
    this.id = id;
    return this;
  }

  public HyperlinkBuilder setHistory(BooleanValueModel history) {
    this.history = history;
    return this;
  }

  public HyperlinkBuilder setTooltip(StringValueModel tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  public HyperlinkBuilder setHighlightClick(BooleanValueModel highlightClick) {
    this.highlightClick = highlightClick;
    return this;
  }

  public HyperlinkBuilder setAction(StringValueModel action) {
    this.action = action;
    return this;
  }

  public HyperlinkBuilder setEndSnd(BooleanValueModel endSnd) {
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
