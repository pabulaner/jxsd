package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.EffectStyleListBuilder;

/**
 * This is a generated sequence class.
 */
public class EffectStyleListModel {
  private final List<EffectStyleItemModel> effectStyle;

  public EffectStyleListModel(List<EffectStyleItemModel> effectStyle) {
    this.effectStyle = effectStyle;
  }

  public EffectStyleListBuilder builder() {
    return new EffectStyleListBuilder().from(this);
  }

  public List<EffectStyleItemModel> getEffectStyle() {
    return this.effectStyle;
  }
}
