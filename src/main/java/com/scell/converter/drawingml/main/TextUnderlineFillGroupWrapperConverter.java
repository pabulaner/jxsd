package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextUnderlineFillGroupWrapperModel;
import org.docx4j.dml.CTTextUnderlineFillGroupWrapper;

public class TextUnderlineFillGroupWrapperConverter {
  private TextUnderlineFillGroupWrapperConverter() {
  }

  public static TextUnderlineFillGroupWrapperModel fromDocx4J(
      CTTextUnderlineFillGroupWrapper value) {
    if (value == null) return null;
    if (value.getNoFill() != null) return TextUnderlineFillGroupWrapperModel.newNoFill(NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) return TextUnderlineFillGroupWrapperModel.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) return TextUnderlineFillGroupWrapperModel.newGradFill(GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) return TextUnderlineFillGroupWrapperModel.newBlipFill(BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) return TextUnderlineFillGroupWrapperModel.newPattFill(PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) return TextUnderlineFillGroupWrapperModel.newGrpFill(GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    return new TextUnderlineFillGroupWrapperModel();
  }
}
