package model.drawingml.main;

public class CT_BlendEffectModel {
  private final ST_BlendModeModel blend;

  private final CT_EffectContainerModel cont;

  public CT_BlendEffectModel(ST_BlendModeModel blend, CT_EffectContainerModel cont) {
    this.blend = blend;
    this.cont = cont;
  }

  public ST_BlendModeModel getBlend() {
    return this.blend;
  }

  public CT_EffectContainerModel getCont() {
    return this.cont;
  }
}
