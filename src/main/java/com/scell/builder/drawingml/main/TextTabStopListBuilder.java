package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextTabStopListModel;
import com.scell.model.drawingml.main.TextTabStopModel;
import java.util.List;

public class TextTabStopListBuilder {
  private List<TextTabStopModel> tab;

  public TextTabStopListBuilder() {
  }

  public TextTabStopListBuilder setTab(List<TextTabStopModel> tab) {
    this.tab = tab;
    return this;
  }

  public TextTabStopListModel build() {
    return new TextTabStopListModel(this.tab);
  }

  public TextTabStopListBuilder from(TextTabStopListModel value) {
    this.tab = value.getTab();
    return this;
  }
}
