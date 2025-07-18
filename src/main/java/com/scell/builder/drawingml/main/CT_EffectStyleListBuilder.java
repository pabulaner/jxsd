package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_EffectStyleItemModel;
import com.scell.model.drawingml.main.CT_EffectStyleListModel;
import java.util.List;

public class CT_EffectStyleListBuilder {
  private List<CT_EffectStyleItemModel> effectStyle;

  public CT_EffectStyleListBuilder() {
  }

  public CT_EffectStyleListBuilder setEffectStyle(List<CT_EffectStyleItemModel> effectStyle) {
    this.effectStyle = effectStyle;
    return this;
  }

  public CT_EffectStyleListModel build() {
    return new CT_EffectStyleListModel(this.effectStyle);
  }

  public CT_EffectStyleListBuilder from(CT_EffectStyleListModel value) {
    this.effectStyle = value.getEffectStyle();
    return this;
  }
}
