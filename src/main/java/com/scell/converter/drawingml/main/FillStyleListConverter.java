package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FillStyleListModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTBlipFillProperties;
import org.docx4j.dml.CTFillStyleList;
import org.docx4j.dml.CTGradientFillProperties;
import org.docx4j.dml.CTGroupFillProperties;
import org.docx4j.dml.CTNoFillProperties;
import org.docx4j.dml.CTPatternFillProperties;
import org.docx4j.dml.CTSolidColorFillProperties;

public class FillStyleListConverter {
  private FillStyleListConverter() {
  }

  public static FillStyleListModel fromDocx4J(CTFillStyleList value) {
    if (value == null) return null;
    List<FillStyleListModel.FillPropertiesModel> egFillProperties = value.getEGFillProperties().stream().map(val -> {
      if (val instanceof CTNoFillProperties) return FillStyleListModel.FillPropertiesModel.newNoFill(NoFillPropertiesConverter.fromDocx4J((CTNoFillProperties) val));
      if (val instanceof CTSolidColorFillProperties) return FillStyleListModel.FillPropertiesModel.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4J((CTSolidColorFillProperties) val));
      if (val instanceof CTGradientFillProperties) return FillStyleListModel.FillPropertiesModel.newGradFill(GradientFillPropertiesConverter.fromDocx4J((CTGradientFillProperties) val));
      if (val instanceof CTBlipFillProperties) return FillStyleListModel.FillPropertiesModel.newBlipFill(BlipFillPropertiesConverter.fromDocx4J((CTBlipFillProperties) val));
      if (val instanceof CTPatternFillProperties) return FillStyleListModel.FillPropertiesModel.newPattFill(PatternFillPropertiesConverter.fromDocx4J((CTPatternFillProperties) val));
      if (val instanceof CTGroupFillProperties) return FillStyleListModel.FillPropertiesModel.newGrpFill(GroupFillPropertiesConverter.fromDocx4J((CTGroupFillProperties) val));
      return new FillStyleListModel.FillPropertiesModel();
    } ).collect(Collectors.toList());
    return new FillStyleListModel(egFillProperties);
  }
}
