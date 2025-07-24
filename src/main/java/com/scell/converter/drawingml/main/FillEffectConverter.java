package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FillEffectModel;
import org.docx4j.dml.CTFillEffect;

public class FillEffectConverter {
  private FillEffectConverter() {
  }

  public static FillEffectModel fromDocx4J(CTFillEffect value) {
    if (value == null) return null;
    if (value.getNoFill() != null) return FillEffectModel.newNoFill(NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) return FillEffectModel.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) return FillEffectModel.newGradFill(GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) return FillEffectModel.newBlipFill(BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) return FillEffectModel.newPattFill(PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) return FillEffectModel.newGrpFill(GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    return new FillEffectModel();
  }
}
