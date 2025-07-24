package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlurEffectModel;
import com.scell.model.drawingml.main.EffectListModel;
import com.scell.model.drawingml.main.FillOverlayEffectModel;
import com.scell.model.drawingml.main.GlowEffectModel;
import com.scell.model.drawingml.main.InnerShadowEffectModel;
import com.scell.model.drawingml.main.OuterShadowEffectModel;
import com.scell.model.drawingml.main.PresetShadowEffectModel;
import com.scell.model.drawingml.main.ReflectionEffectModel;
import com.scell.model.drawingml.main.SoftEdgesEffectModel;

public class EffectListBuilder {
  private BlurEffectModel blur;

  private FillOverlayEffectModel fillOverlay;

  private GlowEffectModel glow;

  private InnerShadowEffectModel innerShdw;

  private OuterShadowEffectModel outerShdw;

  private PresetShadowEffectModel prstShdw;

  private ReflectionEffectModel reflection;

  private SoftEdgesEffectModel softEdge;

  public EffectListBuilder() {
  }

  public EffectListBuilder setBlur(BlurEffectModel blur) {
    this.blur = blur;
    return this;
  }

  public EffectListBuilder setFillOverlay(FillOverlayEffectModel fillOverlay) {
    this.fillOverlay = fillOverlay;
    return this;
  }

  public EffectListBuilder setGlow(GlowEffectModel glow) {
    this.glow = glow;
    return this;
  }

  public EffectListBuilder setInnerShdw(InnerShadowEffectModel innerShdw) {
    this.innerShdw = innerShdw;
    return this;
  }

  public EffectListBuilder setOuterShdw(OuterShadowEffectModel outerShdw) {
    this.outerShdw = outerShdw;
    return this;
  }

  public EffectListBuilder setPrstShdw(PresetShadowEffectModel prstShdw) {
    this.prstShdw = prstShdw;
    return this;
  }

  public EffectListBuilder setReflection(ReflectionEffectModel reflection) {
    this.reflection = reflection;
    return this;
  }

  public EffectListBuilder setSoftEdge(SoftEdgesEffectModel softEdge) {
    this.softEdge = softEdge;
    return this;
  }

  public EffectListModel build() {
    return new EffectListModel(this.blur, this.fillOverlay, this.glow, this.innerShdw, this.outerShdw, this.prstShdw, this.reflection, this.softEdge);
  }

  public EffectListBuilder from(EffectListModel value) {
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
