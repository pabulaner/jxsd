package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_FillOverlayEffectModel;
import org.docx4j.dml.CTFillOverlayEffect;

public class CT_FillOverlayEffectConverter {
  private CT_FillOverlayEffectConverter() {
  }

  public static CT_FillOverlayEffectModel fromDocx4j(CTFillOverlayEffect value) {
    if (value == null) return null;
    return new CT_FillOverlayEffectModel(ST_BlendModeConverter.fromDocx4j(value.getBlend()), NoFillOrSolidFillOrGradFillConverter.fromDocx4j(value.getNoFillOrSolidFillOrGradFill()));
  }

  public static CTFillOverlayEffect toDocx4j(CT_FillOverlayEffectModel value) {
    return null;
  }

  public static class NoFillOrSolidFillOrGradFillConverter {
    private NoFillOrSolidFillOrGradFillConverter() {
    }

    public static CT_FillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel fromDocx4j(
        CTFillOverlayEffect.NoFillOrSolidFillOrGradFill value) {
      if (value == null) return null;
    }

    public static CTFillOverlayEffect.NoFillOrSolidFillOrGradFill toDocx4j(
        CT_FillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel value) {
      return null;
    }
  }
}
