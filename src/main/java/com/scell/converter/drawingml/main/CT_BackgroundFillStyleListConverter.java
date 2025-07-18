package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_BackgroundFillStyleListModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTBackgroundFillStyleList;
import org.docx4j.dml.CTBlipFillProperties;
import org.docx4j.dml.CTGradientFillProperties;
import org.docx4j.dml.CTGroupFillProperties;
import org.docx4j.dml.CTNoFillProperties;
import org.docx4j.dml.CTPatternFillProperties;
import org.docx4j.dml.CTSolidColorFillProperties;

public class CT_BackgroundFillStyleListConverter {
  private CT_BackgroundFillStyleListConverter() {
  }

  public static CT_BackgroundFillStyleListModel fromDocx4J(CTBackgroundFillStyleList value) {
    if (value == null) return null;
    // look here true;
    List<CT_BackgroundFillStyleListModel.EG_FillPropertiesModel> egFillProperties = value.getEGFillProperties().stream().map(val -> {
      if (val instanceof CTNoFillProperties) return CT_BackgroundFillStyleListModel.EG_FillPropertiesModel.newNoFill(CT_NoFillPropertiesConverter.fromDocx4J((CTNoFillProperties) val));
      if (val instanceof CTSolidColorFillProperties) return CT_BackgroundFillStyleListModel.EG_FillPropertiesModel.newSolidFill(CT_SolidColorFillPropertiesConverter.fromDocx4J((CTSolidColorFillProperties) val));
      if (val instanceof CTGradientFillProperties) return CT_BackgroundFillStyleListModel.EG_FillPropertiesModel.newGradFill(CT_GradientFillPropertiesConverter.fromDocx4J((CTGradientFillProperties) val));
      if (val instanceof CTBlipFillProperties) return CT_BackgroundFillStyleListModel.EG_FillPropertiesModel.newBlipFill(CT_BlipFillPropertiesConverter.fromDocx4J((CTBlipFillProperties) val));
      if (val instanceof CTPatternFillProperties) return CT_BackgroundFillStyleListModel.EG_FillPropertiesModel.newPattFill(CT_PatternFillPropertiesConverter.fromDocx4J((CTPatternFillProperties) val));
      if (val instanceof CTGroupFillProperties) return CT_BackgroundFillStyleListModel.EG_FillPropertiesModel.newGrpFill(CT_GroupFillPropertiesConverter.fromDocx4J((CTGroupFillProperties) val));
      return null;
    } ).collect(Collectors.toList());
    return new CT_BackgroundFillStyleListModel(egFillProperties);
  }

  public static CTBackgroundFillStyleList toDocx4J(CT_BackgroundFillStyleListModel value) {
    return null;
  }
}
