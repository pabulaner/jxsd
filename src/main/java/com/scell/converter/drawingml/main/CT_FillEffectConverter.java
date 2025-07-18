package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_FillEffectModel;
import org.docx4j.dml.CTFillEffect;

public class CT_FillEffectConverter {
  private CT_FillEffectConverter() {
  }

  public static CT_FillEffectModel fromDocx4J(CTFillEffect value) {
    if (value == null) return null;
    if (value.getNoFill() != null) return CT_FillEffectModel.newNoFill(CT_NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) return CT_FillEffectModel.newSolidFill(CT_SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) return CT_FillEffectModel.newGradFill(CT_GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) return CT_FillEffectModel.newBlipFill(CT_BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) return CT_FillEffectModel.newPattFill(CT_PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) return CT_FillEffectModel.newGrpFill(CT_GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    return new CT_FillEffectModel();
  }

  public static CTFillEffect toDocx4J(CT_FillEffectModel value) {
    return null;
  }
}
