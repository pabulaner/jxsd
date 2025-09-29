package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.TextTabStopListModel;
import jxsd.gen.model.drawingml.main.TextTabStopModel;

/**
 * This is a generated sequence class.
 */
public class TextTabStopListBuilder {
  private List<TextTabStopModel> tab;

  public TextTabStopListBuilder() {
  }

  public TextTabStopListBuilder setTab(List<TextTabStopModel> tab) {
    this.tab = tab;
    return this;
  }

  public TextTabStopListBuilder from(TextTabStopListModel value) {
    this.tab = value.getTab();
    return this;
  }

  public TextTabStopListModel build() {
    return new TextTabStopListModel(this.tab);
  }
}
