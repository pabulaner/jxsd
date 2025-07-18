package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_FillPropertiesModel;
import org.docx4j.dml.CTFillProperties;

public class CT_FillPropertiesConverter {
  private CT_FillPropertiesConverter() {
  }

  public static CT_FillPropertiesModel fromDocx4J(CTFillProperties value) {
    if (value == null) return null;
    if (value.getNoFill() != null) return CT_FillPropertiesModel.newNoFill(CT_NoFillPropertiesConverter.fromDocx4J(value.getNoFill()));
    if (value.getSolidFill() != null) return CT_FillPropertiesModel.newSolidFill(CT_SolidColorFillPropertiesConverter.fromDocx4J(value.getSolidFill()));
    if (value.getGradFill() != null) return CT_FillPropertiesModel.newGradFill(CT_GradientFillPropertiesConverter.fromDocx4J(value.getGradFill()));
    if (value.getBlipFill() != null) return CT_FillPropertiesModel.newBlipFill(CT_BlipFillPropertiesConverter.fromDocx4J(value.getBlipFill()));
    if (value.getPattFill() != null) return CT_FillPropertiesModel.newPattFill(CT_PatternFillPropertiesConverter.fromDocx4J(value.getPattFill()));
    if (value.getGrpFill() != null) return CT_FillPropertiesModel.newGrpFill(CT_GroupFillPropertiesConverter.fromDocx4J(value.getGrpFill()));
    return new CT_FillPropertiesModel();
  }

  public static CTFillProperties toDocx4J(CT_FillPropertiesModel value) {
    return null;
  }
}
