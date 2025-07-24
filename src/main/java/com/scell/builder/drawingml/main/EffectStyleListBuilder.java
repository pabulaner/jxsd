package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.EffectStyleItemModel;
import com.scell.model.drawingml.main.EffectStyleListModel;
import java.util.List;

public class EffectStyleListBuilder {
  private List<EffectStyleItemModel> effectStyle;

  public EffectStyleListBuilder() {
  }

  public EffectStyleListBuilder setEffectStyle(List<EffectStyleItemModel> effectStyle) {
    this.effectStyle = effectStyle;
    return this;
  }

  public EffectStyleListModel build() {
    return new EffectStyleListModel(this.effectStyle);
  }

  public EffectStyleListBuilder from(EffectStyleListModel value) {
    this.effectStyle = value.getEffectStyle();
    return this;
  }
}
