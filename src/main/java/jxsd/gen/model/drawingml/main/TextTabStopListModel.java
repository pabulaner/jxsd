package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.TextTabStopListBuilder;

/**
 * This is a generated sequence class.
 */
public class TextTabStopListModel {
  private final List<TextTabStopModel> tab;

  public TextTabStopListModel(List<TextTabStopModel> tab) {
    this.tab = tab;
  }

  public TextTabStopListBuilder builder() {
    return new TextTabStopListBuilder().from(this);
  }

  public List<TextTabStopModel> getTab() {
    return this.tab;
  }
}
