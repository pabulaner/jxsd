package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.EffectStyleItemModel;
import jxsd.gen.model.drawingml.main.EffectStyleListModel;

/**
 * This is a generated sequence class.
 */
public class EffectStyleListBuilder {
  private List<EffectStyleItemModel> effectStyle;

  public EffectStyleListBuilder() {
  }

  public EffectStyleListBuilder setEffectStyle(List<EffectStyleItemModel> effectStyle) {
    this.effectStyle = effectStyle;
    return this;
  }

  public EffectStyleListBuilder from(EffectStyleListModel value) {
    this.effectStyle = value.getEffectStyle();
    return this;
  }

  public EffectStyleListModel build() {
    return new EffectStyleListModel(this.effectStyle);
  }
}
