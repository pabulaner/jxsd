package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TextTabStopListModel;
import com.scell.model.drawingml.main.CT_TextTabStopModel;
import java.util.List;

public class CT_TextTabStopListBuilder {
  private List<CT_TextTabStopModel> tab;

  public CT_TextTabStopListBuilder() {
  }

  public CT_TextTabStopListBuilder setTab(List<CT_TextTabStopModel> tab) {
    this.tab = tab;
    return this;
  }

  public CT_TextTabStopListModel build() {
    return new CT_TextTabStopListModel(this.tab);
  }

  public CT_TextTabStopListBuilder from(CT_TextTabStopListModel value) {
    this.tab = value.getTab();
    return this;
  }
}
