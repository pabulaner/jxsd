package jxsd.gen.converter.drawingml.main;

import java.util.List;
import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.main.FillStyleListModel;
import org.docx4j.dml.CTBlipFillProperties;
import org.docx4j.dml.CTFillStyleList;
import org.docx4j.dml.CTGradientFillProperties;
import org.docx4j.dml.CTGroupFillProperties;
import org.docx4j.dml.CTNoFillProperties;
import org.docx4j.dml.CTPatternFillProperties;
import org.docx4j.dml.CTSolidColorFillProperties;

/**
 * This is a generated sequence class.
 */
public class FillStyleListConverter {
  private FillStyleListConverter() {
  }

  public static FillStyleListModel fromDocx4j(CTFillStyleList value) {
    if (value == null) return null;
    List<FillStyleListModel.EG_FillProperties> egFillProperties = value.getEGFillProperties().stream().map(val -> {
      if (val instanceof CTNoFillProperties) return CTFillStyleList.EGFillProperties.newNoFill(NoFillPropertiesConverter.fromDocx4j((CTNoFillProperties) val));
      if (val instanceof CTSolidColorFillProperties) return CTFillStyleList.EGFillProperties.newSolidFill(SolidColorFillPropertiesConverter.fromDocx4j((CTSolidColorFillProperties) val));
      if (val instanceof CTGradientFillProperties) return CTFillStyleList.EGFillProperties.newGradFill(GradientFillPropertiesConverter.fromDocx4j((CTGradientFillProperties) val));
      if (val instanceof CTBlipFillProperties) return CTFillStyleList.EGFillProperties.newBlipFill(BlipFillPropertiesConverter.fromDocx4j((CTBlipFillProperties) val));
      if (val instanceof CTPatternFillProperties) return CTFillStyleList.EGFillProperties.newPattFill(PatternFillPropertiesConverter.fromDocx4j((CTPatternFillProperties) val));
      if (val instanceof CTGroupFillProperties) return CTFillStyleList.EGFillProperties.newGrpFill(GroupFillPropertiesConverter.fromDocx4j((CTGroupFillProperties) val));
      return new FillStyleListModel(egFillProperties);
    }

    public static CTFillStyleList toDocx4j(FillStyleListModel value) {
      if (value == null) return null;
      CTFillStyleList result = new CTFillStyleList();
      result.getEGFillProperties().addAll(value.getEGFillProperties().stream().map(val -> {
        if (val.isNoFill()) return FillStyleListConverter.toDocx4j(val.getNoFill());
        if (val.isSolidFill()) return FillStyleListConverter.toDocx4j(val.getSolidFill());
        if (val.isGradFill()) return FillStyleListConverter.toDocx4j(val.getGradFill());
        if (val.isBlipFill()) return FillStyleListConverter.toDocx4j(val.getBlipFill());
        if (val.isPattFill()) return FillStyleListConverter.toDocx4j(val.getPattFill());
        if (val.isGrpFill()) return FillStyleListConverter.toDocx4j(val.getGrpFill());
        return null;
      } ).collect(Collectors.toList());
      return result;
    }
  }
