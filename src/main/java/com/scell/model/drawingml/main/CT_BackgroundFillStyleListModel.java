package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_BackgroundFillStyleListModel {
  private final List<EG_FillPropertiesModel> egFillProperties;

  public CT_BackgroundFillStyleListModel(List<EG_FillPropertiesModel> egFillProperties) {
    this.egFillProperties = egFillProperties;
  }

  public List<EG_FillPropertiesModel> getEGFillProperties() {
    return this.egFillProperties;
  }

  public static class EG_FillPropertiesModel {
    private final int type;

    private final Object value;

    public EG_FillPropertiesModel() {
      this(-1, null);
    }

    private EG_FillPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_FillPropertiesModel newNoFill(CT_NoFillPropertiesModel value) {
      return new EG_FillPropertiesModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public CT_NoFillPropertiesModel getNoFill() {
      return (CT_NoFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newSolidFill(CT_SolidColorFillPropertiesModel value) {
      return new EG_FillPropertiesModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public CT_SolidColorFillPropertiesModel getSolidFill() {
      return (CT_SolidColorFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newGradFill(CT_GradientFillPropertiesModel value) {
      return new EG_FillPropertiesModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public CT_GradientFillPropertiesModel getGradFill() {
      return (CT_GradientFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newBlipFill(CT_BlipFillPropertiesModel value) {
      return new EG_FillPropertiesModel(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public CT_BlipFillPropertiesModel getBlipFill() {
      return (CT_BlipFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newPattFill(CT_PatternFillPropertiesModel value) {
      return new EG_FillPropertiesModel(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public CT_PatternFillPropertiesModel getPattFill() {
      return (CT_PatternFillPropertiesModel) this.value;
    }

    public static EG_FillPropertiesModel newGrpFill(CT_GroupFillPropertiesModel value) {
      return new EG_FillPropertiesModel(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public CT_GroupFillPropertiesModel getGrpFill() {
      return (CT_GroupFillPropertiesModel) this.value;
    }
  }
}
