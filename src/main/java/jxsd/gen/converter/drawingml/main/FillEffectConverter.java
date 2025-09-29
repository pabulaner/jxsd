package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.FillEffectModel;
import org.docx4j.dml.CTFillEffect;

/**
 * This is a generated choice class.
 */
public class FillEffectConverter {
  private FillEffectConverter() {
  }

  public static FillEffectModel fromDocx4j(CTFillEffect value) {
    if (value == null) return null;
    if (value.getNoFill() != null) return FillEffectModel.newNoFill(NoFillPropertiesConverter.fromDocx4j(value.getNoFill()));
    if (value.getSolidFill() != null) return FillEffectModel.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill()));
    if (value.getGradFill() != null) return FillEffectModel.newGradFill(GradientFillPropertiesConverter.fromDocx4j(value.getGradFill()));
    if (value.getBlipFill() != null) return FillEffectModel.newBlipFill(BlipFillPropertiesConverter.fromDocx4j(value.getBlipFill()));
    if (value.getPattFill() != null) return FillEffectModel.newPattFill(PatternFillPropertiesConverter.fromDocx4j(value.getPattFill()));
    if (value.getGrpFill() != null) return FillEffectModel.newGrpFill(GroupFillPropertiesConverter.fromDocx4j(value.getGrpFill()));
    return new FillEffectModel();
  }

  public static CTFillEffect toDocx4j(FillEffectModel value) {
    if (value == null) return null;
    CTFillEffect result = new CTFillEffect();
    if (value.isNoFill()) result.setNoFill(NoFillPropertiesConverter.toDocx4j(value.getNoFill()));
    if (value.isSolidFill()) result.setSolidFill(SolidColorFillPropertiesConverter.toDocx4j(value.getSolidFill()));
    if (value.isGradFill()) result.setGradFill(GradientFillPropertiesConverter.toDocx4j(value.getGradFill()));
    if (value.isBlipFill()) result.setBlipFill(BlipFillPropertiesConverter.toDocx4j(value.getBlipFill()));
    if (value.isPattFill()) result.setPattFill(PatternFillPropertiesConverter.toDocx4j(value.getPattFill()));
    if (value.isGrpFill()) result.setGrpFill(GroupFillPropertiesConverter.toDocx4j(value.getGrpFill()));
    return result;
  }
}
