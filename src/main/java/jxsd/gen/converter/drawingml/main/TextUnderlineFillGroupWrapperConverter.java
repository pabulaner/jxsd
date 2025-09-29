package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextUnderlineFillGroupWrapperModel;
import org.docx4j.dml.CTTextUnderlineFillGroupWrapper;

/**
 * This is a generated choice class.
 */
public class TextUnderlineFillGroupWrapperConverter {
  private TextUnderlineFillGroupWrapperConverter() {
  }

  public static TextUnderlineFillGroupWrapperModel fromDocx4j(
      CTTextUnderlineFillGroupWrapper value) {
    if (value == null) return null;
    if (value.getNoFill() != null) return TextUnderlineFillGroupWrapperModel.newNoFill(NoFillPropertiesConverter.fromDocx4j(value.getNoFill()));
    if (value.getSolidFill() != null) return TextUnderlineFillGroupWrapperModel.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill()));
    if (value.getGradFill() != null) return TextUnderlineFillGroupWrapperModel.newGradFill(GradientFillPropertiesConverter.fromDocx4j(value.getGradFill()));
    if (value.getBlipFill() != null) return TextUnderlineFillGroupWrapperModel.newBlipFill(BlipFillPropertiesConverter.fromDocx4j(value.getBlipFill()));
    if (value.getPattFill() != null) return TextUnderlineFillGroupWrapperModel.newPattFill(PatternFillPropertiesConverter.fromDocx4j(value.getPattFill()));
    if (value.getGrpFill() != null) return TextUnderlineFillGroupWrapperModel.newGrpFill(GroupFillPropertiesConverter.fromDocx4j(value.getGrpFill()));
    return new TextUnderlineFillGroupWrapperModel();
  }

  public static CTTextUnderlineFillGroupWrapper toDocx4j(TextUnderlineFillGroupWrapperModel value) {
    if (value == null) return null;
    CTTextUnderlineFillGroupWrapper result = new CTTextUnderlineFillGroupWrapper();
    if (value.isNoFill()) result.setNoFill(NoFillPropertiesConverter.toDocx4j(value.getNoFill()));
    if (value.isSolidFill()) result.setSolidFill(SolidColorFillPropertiesConverter.toDocx4j(value.getSolidFill()));
    if (value.isGradFill()) result.setGradFill(GradientFillPropertiesConverter.toDocx4j(value.getGradFill()));
    if (value.isBlipFill()) result.setBlipFill(BlipFillPropertiesConverter.toDocx4j(value.getBlipFill()));
    if (value.isPattFill()) result.setPattFill(PatternFillPropertiesConverter.toDocx4j(value.getPattFill()));
    if (value.isGrpFill()) result.setGrpFill(GroupFillPropertiesConverter.toDocx4j(value.getGrpFill()));
    return result;
  }
}
