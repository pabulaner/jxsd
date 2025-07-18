package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextUnderlineFillGroupWrapperModel;
import org.docx4j.dml.CTTextUnderlineFillGroupWrapper;

public class CT_TextUnderlineFillGroupWrapperConverter {
  private CT_TextUnderlineFillGroupWrapperConverter() {
  }

  public static CT_TextUnderlineFillGroupWrapperModel fromDocx4J(
      CTTextUnderlineFillGroupWrapper value) {
    if (value == null) return null;
    if (value.getNoFill() != null) return CT_TextUnderlineFillGroupWrapperModel.newNoFill(CT_NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) return CT_TextUnderlineFillGroupWrapperModel.newSolidFill(CT_SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) return CT_TextUnderlineFillGroupWrapperModel.newGradFill(CT_GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) return CT_TextUnderlineFillGroupWrapperModel.newBlipFill(CT_BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) return CT_TextUnderlineFillGroupWrapperModel.newPattFill(CT_PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) return CT_TextUnderlineFillGroupWrapperModel.newGrpFill(CT_GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    return new CT_TextUnderlineFillGroupWrapperModel();
  }

  public static CTTextUnderlineFillGroupWrapper toDocx4J(
      CT_TextUnderlineFillGroupWrapperModel value) {
    return null;
  }
}
