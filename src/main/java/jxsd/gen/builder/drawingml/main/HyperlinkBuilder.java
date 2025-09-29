package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.EmbeddedWAVAudioFileModel;
import jxsd.gen.model.drawingml.main.HyperlinkModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;

/**
 * This is a generated sequence class.
 */
public class HyperlinkBuilder {
  private String invalidUrl;

  private String tgtFrame;

  private String id;

  private boolean history;

  private String tooltip;

  private boolean highlightClick;

  private String action;

  private boolean endSnd;

  private EmbeddedWAVAudioFileModel snd;

  private OfficeArtExtensionListModel extLst;

  public HyperlinkBuilder() {
  }

  public HyperlinkBuilder setInvalidUrl(String invalidUrl) {
    this.invalidUrl = invalidUrl;
    return this;
  }

  public HyperlinkBuilder setTgtFrame(String tgtFrame) {
    this.tgtFrame = tgtFrame;
    return this;
  }

  public HyperlinkBuilder setId(String id) {
    this.id = id;
    return this;
  }

  public HyperlinkBuilder setHistory(boolean history) {
    this.history = history;
    return this;
  }

  public HyperlinkBuilder setTooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  public HyperlinkBuilder setHighlightClick(boolean highlightClick) {
    this.highlightClick = highlightClick;
    return this;
  }

  public HyperlinkBuilder setAction(String action) {
    this.action = action;
    return this;
  }

  public HyperlinkBuilder setEndSnd(boolean endSnd) {
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

  public HyperlinkModel build() {
    return new HyperlinkModel(this.invalidUrl, this.tgtFrame, this.id, this.history, this.tooltip, this.highlightClick, this.action, this.endSnd, this.snd, this.extLst);
  }
}
