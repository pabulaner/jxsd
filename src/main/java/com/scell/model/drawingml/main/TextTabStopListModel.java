package com.scell.model.drawingml.main;

import java.util.List;

public class TextTabStopListModel {
  private final List<TextTabStopModel> tab;

  public TextTabStopListModel(List<TextTabStopModel> tab) {
    this.tab = tab;
  }

  public List<TextTabStopModel> getTab() {
    return this.tab;
  }
}
