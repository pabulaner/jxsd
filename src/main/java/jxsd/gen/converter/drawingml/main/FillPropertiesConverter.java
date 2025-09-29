package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.FillPropertiesModel;
import org.docx4j.dml.CTFillProperties;

/**
 * This is a generated choice class.
 */
public class FillPropertiesConverter {
  private FillPropertiesConverter() {
  }

  public static FillPropertiesModel fromDocx4j(CTFillProperties value) {
    if (value == null) return null;
    if (value.getNoFill() != null) return FillPropertiesModel.newNoFill(NoFillPropertiesConverter.fromDocx4j(value.getNoFill()));
    if (value.getSolidFill() != null) return FillPropertiesModel.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill()));
    if (value.getGradFill() != null) return FillPropertiesModel.newGradFill(GradientFillPropertiesConverter.fromDocx4j(value.getGradFill()));
    if (value.getBlipFill() != null) return FillPropertiesModel.newBlipFill(BlipFillPropertiesConverter.fromDocx4j(value.getBlipFill()));
    if (value.getPattFill() != null) return FillPropertiesModel.newPattFill(PatternFillPropertiesConverter.fromDocx4j(value.getPattFill()));
    if (value.getGrpFill() != null) return FillPropertiesModel.newGrpFill(GroupFillPropertiesConverter.fromDocx4j(value.getGrpFill()));
    return new FillPropertiesModel();
  }

  public static CTFillProperties toDocx4j(FillPropertiesModel value) {
    if (value == null) return null;
    CTFillProperties result = new CTFillProperties();
    if (value.isNoFill()) result.setNoFill(NoFillPropertiesConverter.toDocx4j(value.getNoFill()));
    if (value.isSolidFill()) result.setSolidFill(SolidColorFillPropertiesConverter.toDocx4j(value.getSolidFill()));
    if (value.isGradFill()) result.setGradFill(GradientFillPropertiesConverter.toDocx4j(value.getGradFill()));
    if (value.isBlipFill()) result.setBlipFill(BlipFillPropertiesConverter.toDocx4j(value.getBlipFill()));
    if (value.isPattFill()) result.setPattFill(PatternFillPropertiesConverter.toDocx4j(value.getPattFill()));
    if (value.isGrpFill()) result.setGrpFill(GroupFillPropertiesConverter.toDocx4j(value.getGrpFill()));
    return result;
  }
}
