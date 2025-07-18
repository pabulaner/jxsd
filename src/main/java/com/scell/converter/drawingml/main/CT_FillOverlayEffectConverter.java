package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_FillOverlayEffectModel;
import org.docx4j.dml.CTFillOverlayEffect;

public class CT_FillOverlayEffectConverter {
  private CT_FillOverlayEffectConverter() {
  }

  public static CT_FillOverlayEffectModel fromDocx4J(CTFillOverlayEffect value) {
    if (value == null) return null;
    // look here false;
    CT_FillOverlayEffectModel.EG_FillPropertiesModel egFillProperties = new CT_FillOverlayEffectModel.EG_FillPropertiesModel();
    if (value.getNoFill() != null) egFillProperties = CT_FillOverlayEffectModel.EG_FillPropertiesModel.newNoFill(CT_NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) egFillProperties = CT_FillOverlayEffectModel.EG_FillPropertiesModel.newSolidFill(CT_SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) egFillProperties = CT_FillOverlayEffectModel.EG_FillPropertiesModel.newGradFill(CT_GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) egFillProperties = CT_FillOverlayEffectModel.EG_FillPropertiesModel.newBlipFill(CT_BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) egFillProperties = CT_FillOverlayEffectModel.EG_FillPropertiesModel.newPattFill(CT_PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) egFillProperties = CT_FillOverlayEffectModel.EG_FillPropertiesModel.newGrpFill(CT_GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    return new CT_FillOverlayEffectModel(ST_BlendModeConverter.fromDocx4J(value.getBlend()), egFillProperties);
  }

  public static CTFillOverlayEffect toDocx4J(CT_FillOverlayEffectModel value) {
    return null;
  }
}
