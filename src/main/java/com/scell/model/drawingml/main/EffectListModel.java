package com.scell.model.drawingml.main;

public class EffectListModel {
  private final BlurEffectModel blur;

  private final FillOverlayEffectModel fillOverlay;

  private final GlowEffectModel glow;

  private final InnerShadowEffectModel innerShdw;

  private final OuterShadowEffectModel outerShdw;

  private final PresetShadowEffectModel prstShdw;

  private final ReflectionEffectModel reflection;

  private final SoftEdgesEffectModel softEdge;

  public EffectListModel(BlurEffectModel blur, FillOverlayEffectModel fillOverlay,
      GlowEffectModel glow, InnerShadowEffectModel innerShdw, OuterShadowEffectModel outerShdw,
      PresetShadowEffectModel prstShdw, ReflectionEffectModel reflection,
      SoftEdgesEffectModel softEdge) {
    this.blur = blur;
    this.fillOverlay = fillOverlay;
    this.glow = glow;
    this.innerShdw = innerShdw;
    this.outerShdw = outerShdw;
    this.prstShdw = prstShdw;
    this.reflection = reflection;
    this.softEdge = softEdge;
  }

  public BlurEffectModel getBlur() {
    return this.blur;
  }

  public FillOverlayEffectModel getFillOverlay() {
    return this.fillOverlay;
  }

  public GlowEffectModel getGlow() {
    return this.glow;
  }

  public InnerShadowEffectModel getInnerShdw() {
    return this.innerShdw;
  }

  public OuterShadowEffectModel getOuterShdw() {
    return this.outerShdw;
  }

  public PresetShadowEffectModel getPrstShdw() {
    return this.prstShdw;
  }

  public ReflectionEffectModel getReflection() {
    return this.reflection;
  }

  public SoftEdgesEffectModel getSoftEdge() {
    return this.softEdge;
  }
}
