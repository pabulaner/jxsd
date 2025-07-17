package model.drawingml.main;

public class CT_PresetLineDashPropertiesModel {
  private final ST_PresetLineDashValModel val;

  public CT_PresetLineDashPropertiesModel(ST_PresetLineDashValModel val) {
    this.val = val;
  }

  public ST_PresetLineDashValModel getVal() {
    return this.val;
  }
}
