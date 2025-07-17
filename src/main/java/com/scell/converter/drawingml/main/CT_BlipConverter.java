package com.scell.converter.drawingml.main;

import com.scell.converter.officeDocument.relationships.ST_RelationshipIdConverter;
import com.scell.model.drawingml.main.CT_BlipModel;
import java.util.stream.Collectors;
import org.docx4j.dml.CTBlip;

public class CT_BlipConverter {
  private CT_BlipConverter() {
  }

  public static CT_BlipModel fromDocx4j(CTBlip value) {
    if (value == null) return null;
    return new CT_BlipModel(ST_BlipCompressionConverter.fromDocx4j(value.getCstate()), ST_RelationshipIdConverter.fromDocx4j(value.getEmbed()), ST_RelationshipIdConverter.fromDocx4j(value.getLink()), value.getAlphaBiLevelOrAlphaCeilingOrAlphaFloor().stream().map(AlphaBiLevelOrAlphaCeilingOrAlphaFloorConverter::fromDocx4j).collect(Collectors.toList()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTBlip toDocx4j(CT_BlipModel value) {
    return null;
  }

  public static class AlphaBiLevelOrAlphaCeilingOrAlphaFloorConverter {
    private AlphaBiLevelOrAlphaCeilingOrAlphaFloorConverter() {
    }

    public static CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel fromDocx4j(
        CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor value) {
      if (value == null) return null;
    }

    public static CTBlip.AlphaBiLevelOrAlphaCeilingOrAlphaFloor toDocx4j(
        CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel value) {
      return null;
    }
  }
}
