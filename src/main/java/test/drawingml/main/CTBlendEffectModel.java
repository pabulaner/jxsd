package test.drawingml.main;

public class CTBlendEffectModel {
  private final STBlendModeModel blend;

  private final CTEffectContainerModel cont;

  public CTBlendEffectModel(STBlendModeModel blend, CTEffectContainerModel cont) {
    this.blend = blend;
    this.cont = cont;
  }

  public STBlendModeModel getBlend() {
    return this.blend;
  }

  public CTEffectContainerModel getCont() {
    return this.cont;
  }
}
