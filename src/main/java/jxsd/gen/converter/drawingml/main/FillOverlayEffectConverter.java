package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.FillOverlayEffectModel;
import org.docx4j.dml.CTFillOverlayEffect;

/**
 * This is a generated sequence class.
 */
public class FillOverlayEffectConverter {
  private FillOverlayEffectConverter() {
  }

  public static FillOverlayEffectModel fromDocx4j(CTFillOverlayEffect value) {
    if (value == null) return null;
    FillOverlayEffectModel.EG_FillProperties egFillProperties = new FillOverlayEffectModel.EG_FillProperties();
    if (value.getNoFill() != null) egFillProperties = FillOverlayEffectConverter.newEGFillProperties(FillOverlayEffectConverter.fromDocx4j(value.getNoFill()));
    if (value.getSolidFill() != null) egFillProperties = FillOverlayEffectConverter.newEGFillProperties(FillOverlayEffectConverter.fromDocx4j(value.getSolidFill()));
    if (value.getGradFill() != null) egFillProperties = FillOverlayEffectConverter.newEGFillProperties(FillOverlayEffectConverter.fromDocx4j(value.getGradFill()));
    if (value.getBlipFill() != null) egFillProperties = FillOverlayEffectConverter.newEGFillProperties(FillOverlayEffectConverter.fromDocx4j(value.getBlipFill()));
    if (value.getPattFill() != null) egFillProperties = FillOverlayEffectConverter.newEGFillProperties(FillOverlayEffectConverter.fromDocx4j(value.getPattFill()));
    if (value.getGrpFill() != null) egFillProperties = FillOverlayEffectConverter.newEGFillProperties(FillOverlayEffectConverter.fromDocx4j(value.getGrpFill()));
    return new FillOverlayEffectModel(BlendModeValueConverter.fromDocx4j(value.getBlend()), egFillProperties);
  }

  public static CTFillOverlayEffect toDocx4j(FillOverlayEffectModel value) {
    if (value == null) return null;
    CTFillOverlayEffect result = new CTFillOverlayEffect();
    result.setBlend(BlendModeValueConverter.toDocx4j(value.getBlend()));
    if (value.getEGFillProperties().isNoFill()) result.setNoFill(NoFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getNoFill()));
    if (value.getEGFillProperties().isSolidFill()) result.setSolidFill(SolidColorFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getSolidFill()));
    if (value.getEGFillProperties().isGradFill()) result.setGradFill(GradientFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getGradFill()));
    if (value.getEGFillProperties().isBlipFill()) result.setBlipFill(BlipFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getBlipFill()));
    if (value.getEGFillProperties().isPattFill()) result.setPattFill(PatternFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getPattFill()));
    if (value.getEGFillProperties().isGrpFill()) result.setGrpFill(GroupFillPropertiesConverter.toDocx4j(value.getEGFillProperties().getGrpFill()));
    return result;
  }
}
