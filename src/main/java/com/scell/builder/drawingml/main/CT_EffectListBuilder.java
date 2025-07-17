package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BlurEffectModel;
import com.scell.model.drawingml.main.CT_EffectListModel;
import com.scell.model.drawingml.main.CT_FillOverlayEffectModel;
import com.scell.model.drawingml.main.CT_GlowEffectModel;
import com.scell.model.drawingml.main.CT_InnerShadowEffectModel;
import com.scell.model.drawingml.main.CT_OuterShadowEffectModel;
import com.scell.model.drawingml.main.CT_PresetShadowEffectModel;
import com.scell.model.drawingml.main.CT_ReflectionEffectModel;
import com.scell.model.drawingml.main.CT_SoftEdgesEffectModel;

public class CT_EffectListBuilder {
  private CT_BlurEffectModel blur;

  private CT_FillOverlayEffectModel fillOverlay;

  private CT_GlowEffectModel glow;

  private CT_InnerShadowEffectModel innerShdw;

  private CT_OuterShadowEffectModel outerShdw;

  private CT_PresetShadowEffectModel prstShdw;

  private CT_ReflectionEffectModel reflection;

  private CT_SoftEdgesEffectModel softEdge;

  public CT_EffectListBuilder() {
  }

  public CT_EffectListBuilder setBlur(CT_BlurEffectModel blur) {
    this.blur = blur;
    return this;
  }

  public CT_EffectListBuilder setFillOverlay(CT_FillOverlayEffectModel fillOverlay) {
    this.fillOverlay = fillOverlay;
    return this;
  }

  public CT_EffectListBuilder setGlow(CT_GlowEffectModel glow) {
    this.glow = glow;
    return this;
  }

  public CT_EffectListBuilder setInnerShdw(CT_InnerShadowEffectModel innerShdw) {
    this.innerShdw = innerShdw;
    return this;
  }

  public CT_EffectListBuilder setOuterShdw(CT_OuterShadowEffectModel outerShdw) {
    this.outerShdw = outerShdw;
    return this;
  }

  public CT_EffectListBuilder setPrstShdw(CT_PresetShadowEffectModel prstShdw) {
    this.prstShdw = prstShdw;
    return this;
  }

  public CT_EffectListBuilder setReflection(CT_ReflectionEffectModel reflection) {
    this.reflection = reflection;
    return this;
  }

  public CT_EffectListBuilder setSoftEdge(CT_SoftEdgesEffectModel softEdge) {
    this.softEdge = softEdge;
    return this;
  }

  public CT_EffectListModel build() {
    return new CT_EffectListModel(this.blur, this.fillOverlay, this.glow, this.innerShdw, this.outerShdw, this.prstShdw, this.reflection, this.softEdge);
  }

  public CT_EffectListBuilder from(CT_EffectListModel value) {
    this.blur = value.getBlur();
    this.fillOverlay = value.getFillOverlay();
    this.glow = value.getGlow();
    this.innerShdw = value.getInnerShdw();
    this.outerShdw = value.getOuterShdw();
    this.prstShdw = value.getPrstShdw();
    this.reflection = value.getReflection();
    this.softEdge = value.getSoftEdge();
    return this;
  }
}
