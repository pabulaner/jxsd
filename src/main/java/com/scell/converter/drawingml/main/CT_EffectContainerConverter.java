package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.TokenConverter;
import com.scell.model.drawingml.main.CT_EffectContainerModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTEffectContainer;

public class CT_EffectContainerConverter {
  private CT_EffectContainerConverter() {
  }

  public static CT_EffectContainerModel fromDocx4j(CTEffectContainer value) {
    if (value == null) return null;
    return new CT_EffectContainerModel(ST_EffectContainerTypeConverter.fromDocx4j(value.getType()), TokenConverter.fromDocx4j(value.getName()), value.getContOrEffectOrAlphaBiLevel().stream().map(ContOrEffectOrAlphaBiLevelConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTEffectContainer toDocx4j(CT_EffectContainerModel value) {
    return null;
  }

  public static class ContOrEffectOrAlphaBiLevelConverter {
    private ContOrEffectOrAlphaBiLevelConverter() {
    }

    public static CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel fromDocx4j(
        CTEffectContainer.ContOrEffectOrAlphaBiLevel value) {
      if (value == null) return null;
    }

    public static CTEffectContainer.ContOrEffectOrAlphaBiLevel toDocx4j(
        CT_EffectContainerModel.ContOrEffectOrAlphaBiLevelModel value) {
      return null;
    }
  }
}
