package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BackgroundFillStyleListModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTBackgroundFillStyleList;
import org.docx4j.dml.CTBlipFillProperties;
import org.docx4j.dml.CTGradientFillProperties;
import org.docx4j.dml.CTGroupFillProperties;
import org.docx4j.dml.CTNoFillProperties;
import org.docx4j.dml.CTPatternFillProperties;
import org.docx4j.dml.CTSolidColorFillProperties;

public class BackgroundFillStyleListConverter {
  private BackgroundFillStyleListConverter() {
  }

  public static BackgroundFillStyleListModel fromDocx4J(CTBackgroundFillStyleList value) {
    if (value == null) return null;
    List<BackgroundFillStyleListModel.FillPropertiesModel> egFillProperties = value.getEGFillProperties().stream().map(val -> {
      if (val instanceof CTNoFillProperties) return BackgroundFillStyleListModel.FillPropertiesModel.newNoFill(NoFillPropertiesConverter.fromDocx4J((CTNoFillProperties) val));
      if (val instanceof CTSolidColorFillProperties) return BackgroundFillStyleListModel.FillPropertiesModel.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4J((CTSolidColorFillProperties) val));
      if (val instanceof CTGradientFillProperties) return BackgroundFillStyleListModel.FillPropertiesModel.newGradFill(GradientFillPropertiesConverter.fromDocx4J((CTGradientFillProperties) val));
      if (val instanceof CTBlipFillProperties) return BackgroundFillStyleListModel.FillPropertiesModel.newBlipFill(BlipFillPropertiesConverter.fromDocx4J((CTBlipFillProperties) val));
      if (val instanceof CTPatternFillProperties) return BackgroundFillStyleListModel.FillPropertiesModel.newPattFill(PatternFillPropertiesConverter.fromDocx4J((CTPatternFillProperties) val));
      if (val instanceof CTGroupFillProperties) return BackgroundFillStyleListModel.FillPropertiesModel.newGrpFill(GroupFillPropertiesConverter.fromDocx4J((CTGroupFillProperties) val));
      return new BackgroundFillStyleListModel.FillPropertiesModel();
    } ).collect(Collectors.toList());
    return new BackgroundFillStyleListModel(egFillProperties);
  }
}
