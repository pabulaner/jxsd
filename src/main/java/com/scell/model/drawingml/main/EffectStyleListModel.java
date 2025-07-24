package com.scell.model.drawingml.main;

import java.util.List;

public class EffectStyleListModel {
  private final List<EffectStyleItemModel> effectStyle;

  public EffectStyleListModel(List<EffectStyleItemModel> effectStyle) {
    this.effectStyle = effectStyle;
  }

  public List<EffectStyleItemModel> getEffectStyle() {
    return this.effectStyle;
  }
}
