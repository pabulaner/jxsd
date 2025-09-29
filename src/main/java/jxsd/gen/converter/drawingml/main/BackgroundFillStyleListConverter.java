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
      if (val instanceof CTNoFillProperties) return CTBackgroundFillStyleList.EGFillProperties.newNoFill(NoFillPropertiesConverter.fromDocx4j((CTNoFillProperties) val));
      if (val instanceof CTSolidColorFillProperties) return CTBackgroundFillStyleList.EGFillProperties.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4j((CTSolidColorFillProperties) val));
      if (val instanceof CTGradientFillProperties) return CTBackgroundFillStyleList.EGFillProperties.newGradFill(GradientFillPropertiesConverter.fromDocx4j((CTGradientFillProperties) val));
      if (val instanceof CTBlipFillProperties) return CTBackgroundFillStyleList.EGFillProperties.newBlipFill(BlipFillPropertiesConverter.fromDocx4j((CTBlipFillProperties) val));
      if (val instanceof CTPatternFillProperties) return CTBackgroundFillStyleList.EGFillProperties.newPattFill(PatternFillPropertiesConverter.fromDocx4j((CTPatternFillProperties) val));
      if (val instanceof CTGroupFillProperties) return CTBackgroundFillStyleList.EGFillProperties.newGrpFill(GroupFillPropertiesConverter.fromDocx4j((CTGroupFillProperties) val));
      return new BackgroundFillStyleListModel(egFillProperties);
    }

    public static CTBackgroundFillStyleList toDocx4j(BackgroundFillStyleListModel value) {
      if (value == null) return null;
      CTBackgroundFillStyleList result = new CTBackgroundFillStyleList();
      result.getEGFillProperties().addAll(value.getEGFillProperties().stream().map(val -> {
        if (val.isNoFill()) return BackgroundFillStyleListConverter.toDocx4j(val.getNoFill());
        if (val.isSolidFill()) return BackgroundFillStyleListConverter.toDocx4j(val.getSolidFill());
        if (val.isGradFill()) return BackgroundFillStyleListConverter.toDocx4j(val.getGradFill());
        if (val.isBlipFill()) return BackgroundFillStyleListConverter.toDocx4j(val.getBlipFill());
        if (val.isPattFill()) return BackgroundFillStyleListConverter.toDocx4j(val.getPattFill());
        if (val.isGrpFill()) return BackgroundFillStyleListConverter.toDocx4j(val.getGrpFill());
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
