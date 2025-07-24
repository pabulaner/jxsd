package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FillOverlayEffectModel;
import org.docx4j.dml.CTFillOverlayEffect;

public class FillOverlayEffectConverter {
  private FillOverlayEffectConverter() {
  }

  public static FillOverlayEffectModel fromDocx4J(CTFillOverlayEffect value) {
    if (value == null) return null;
    FillOverlayEffectModel.FillPropertiesModel egFillProperties = new FillOverlayEffectModel.FillPropertiesModel();
    if (value.getNoFill() != null) egFillProperties = FillOverlayEffectModel.FillPropertiesModel.newNoFill(NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) egFillProperties = FillOverlayEffectModel.FillPropertiesModel.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) egFillProperties = FillOverlayEffectModel.FillPropertiesModel.newGradFill(GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) egFillProperties = FillOverlayEffectModel.FillPropertiesModel.newBlipFill(BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) egFillProperties = FillOverlayEffectModel.FillPropertiesModel.newPattFill(PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) egFillProperties = FillOverlayEffectModel.FillPropertiesModel.newGrpFill(GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    return new FillOverlayEffectModel(BlendModeConverter.fromDocx4J(value.getBlend()), egFillProperties);
  }
}
