package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FillPropertiesModel;
import org.docx4j.dml.CTFillProperties;

public class FillPropertiesConverter {
  private FillPropertiesConverter() {
  }

  public static FillPropertiesModel fromDocx4J(CTFillProperties value) {
    if (value == null) return null;
    if (value.getNoFill() != null) return FillPropertiesModel.newNoFill(NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) return FillPropertiesModel.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) return FillPropertiesModel.newGradFill(GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) return FillPropertiesModel.newBlipFill(BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) return FillPropertiesModel.newPattFill(PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) return FillPropertiesModel.newGrpFill(GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    return new FillPropertiesModel();
  }
}
