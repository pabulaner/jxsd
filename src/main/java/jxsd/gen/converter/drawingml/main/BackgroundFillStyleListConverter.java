package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.BackgroundFillStyleListModel;
import org.docx4j.dml.CTBackgroundFillStyleList;
import org.docx4j.dml.CTBlipFillProperties;
import org.docx4j.dml.CTGradientFillProperties;
import org.docx4j.dml.CTGroupFillProperties;
import org.docx4j.dml.CTNoFillProperties;
import org.docx4j.dml.CTPatternFillProperties;
import org.docx4j.dml.CTSolidColorFillProperties;

/**
 * This is a generated sequence class.
 */
public class BackgroundFillStyleListConverter {
  private BackgroundFillStyleListConverter() {
  }

  public static BackgroundFillStyleListModel fromDocx4j(CTBackgroundFillStyleList value) {
    if (value == null) return null;
    List<BackgroundFillStyleListModel.EG_FillProperties> egFillProperties = value.getEGFillProperties().stream().map(val -> {
      if (val instanceof CTNoFillProperties) return BackgroundFillStyleListModel.EG_FillProperties.newNoFill(NoFillPropertiesConverter.fromDocx4j((CTNoFillProperties) val));
      if (val instanceof CTSolidColorFillProperties) return BackgroundFillStyleListModel.EG_FillProperties.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4j((CTSolidColorFillProperties) val));
      if (val instanceof CTGradientFillProperties) return BackgroundFillStyleListModel.EG_FillProperties.newGradFill(GradientFillPropertiesConverter.fromDocx4j((CTGradientFillProperties) val));
      if (val instanceof CTBlipFillProperties) return BackgroundFillStyleListModel.EG_FillProperties.newBlipFill(BlipFillPropertiesConverter.fromDocx4j((CTBlipFillProperties) val));
      if (val instanceof CTPatternFillProperties) return BackgroundFillStyleListModel.EG_FillProperties.newPattFill(PatternFillPropertiesConverter.fromDocx4j((CTPatternFillProperties) val));
      if (val instanceof CTGroupFillProperties) return BackgroundFillStyleListModel.EG_FillProperties.newGrpFill(GroupFillPropertiesConverter.fromDocx4j((CTGroupFillProperties) val));
      return null;
    } ).collect(Collectors.toList());
    return new BackgroundFillStyleListModel(egFillProperties);
  }

  public static CTBackgroundFillStyleList toDocx4j(BackgroundFillStyleListModel value) {
    if (value == null) return null;
    CTBackgroundFillStyleList result = new CTBackgroundFillStyleList();
    result.getEGFillProperties().addAll(value.getEGFillProperties().stream().map(val -> {
      if (val.isNoFill()) return NoFillPropertiesConverter.toDocx4j(val.getNoFill());
      if (val.isSolidFill()) return SolidColorFillPropertiesConverter.toDocx4j(val.getSolidFill());
      if (val.isGradFill()) return GradientFillPropertiesConverter.toDocx4j(val.getGradFill());
      if (val.isBlipFill()) return BlipFillPropertiesConverter.toDocx4j(val.getBlipFill());
      if (val.isPattFill()) return PatternFillPropertiesConverter.toDocx4j(val.getPattFill());
      if (val.isGrpFill()) return GroupFillPropertiesConverter.toDocx4j(val.getGrpFill());
      return null;
    } ).collect(Collectors.toList()));
    return result;
  }
}
