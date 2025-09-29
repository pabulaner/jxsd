package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.HyperlinkBuilder;

/**
 * This is a generated sequence class.
 */
public class HyperlinkModel {
  private final String invalidUrl;

  private final String tgtFrame;

  private final String id;

  private final boolean history;

  private final String tooltip;

  private final boolean highlightClick;

  private final String action;

  private final boolean endSnd;

  private final EmbeddedWAVAudioFileModel snd;

  private final OfficeArtExtensionListModel extLst;

  public HyperlinkModel(String invalidUrl, String tgtFrame, String id, boolean history,
      String tooltip, boolean highlightClick, String action, boolean endSnd,
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

  public HyperlinkBuilder builder() {
    return new HyperlinkBuilder().from(this);
  }

  public String getInvalidUrl() {
    return this.invalidUrl;
  }

  public String getTgtFrame() {
    return this.tgtFrame;
  }

  public String getId() {
    return this.id;
  }

  public boolean getHistory() {
    return this.history;
  }

  public String getTooltip() {
    return this.tooltip;
  }

  public boolean getHighlightClick() {
    return this.highlightClick;
  }

  public String getAction() {
    return this.action;
  }

  public boolean getEndSnd() {
    return this.endSnd;
  }

  public EmbeddedWAVAudioFileModel getSnd() {
    return this.snd;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }
}
