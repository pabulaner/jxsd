package com.scell.converter.drawingml.main;

import com.scell.converter.officeDocument.relationships.ST_RelationshipIdConverter;
import com.scell.model.drawingml.main.CT_BlipModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTAlphaBiLevelEffect;
import org.docx4j.dml.CTAlphaCeilingEffect;
import org.docx4j.dml.CTAlphaFloorEffect;
import org.docx4j.dml.CTAlphaInverseEffect;
import org.docx4j.dml.CTAlphaModulateEffect;
import org.docx4j.dml.CTAlphaModulateFixedEffect;
import org.docx4j.dml.CTAlphaReplaceEffect;
import org.docx4j.dml.CTBiLevelEffect;
import org.docx4j.dml.CTBlip;
import org.docx4j.dml.CTBlurEffect;
import org.docx4j.dml.CTColorChangeEffect;
import org.docx4j.dml.CTColorReplaceEffect;
import org.docx4j.dml.CTDuotoneEffect;
import org.docx4j.dml.CTFillOverlayEffect;
import org.docx4j.dml.CTGrayscaleEffect;
import org.docx4j.dml.CTHSLEffect;
import org.docx4j.dml.CTLuminanceEffect;
import org.docx4j.dml.CTTintEffect;

public class CT_BlipConverter {
  private CT_BlipConverter() {
  }

  public static CT_BlipModel fromDocx4J(CTBlip value) {
    if (value == null) return null;
    // look here true;
    List<CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor = value.getAlphaBiLevelOrAlphaCeilingOrAlphaFloor().stream().map(val -> {
      if (val instanceof CTAlphaBiLevelEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaBiLevel(CT_AlphaBiLevelEffectConverter.fromDocx4J((CTAlphaBiLevelEffect) val));
      if (val instanceof CTAlphaCeilingEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaCeiling(CT_AlphaCeilingEffectConverter.fromDocx4J((CTAlphaCeilingEffect) val));
      if (val instanceof CTAlphaFloorEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaFloor(CT_AlphaFloorEffectConverter.fromDocx4J((CTAlphaFloorEffect) val));
      if (val instanceof CTAlphaInverseEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaInv(CT_AlphaInverseEffectConverter.fromDocx4J((CTAlphaInverseEffect) val));
      if (val instanceof CTAlphaModulateEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaMod(CT_AlphaModulateEffectConverter.fromDocx4J((CTAlphaModulateEffect) val));
      if (val instanceof CTAlphaModulateFixedEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaModFix(CT_AlphaModulateFixedEffectConverter.fromDocx4J((CTAlphaModulateFixedEffect) val));
      if (val instanceof CTAlphaReplaceEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newAlphaRepl(CT_AlphaReplaceEffectConverter.fromDocx4J((CTAlphaReplaceEffect) val));
      if (val instanceof CTBiLevelEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newBiLevel(CT_BiLevelEffectConverter.fromDocx4J((CTBiLevelEffect) val));
      if (val instanceof CTBlurEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newBlur(CT_BlurEffectConverter.fromDocx4J((CTBlurEffect) val));
      if (val instanceof CTColorChangeEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newClrChange(CT_ColorChangeEffectConverter.fromDocx4J((CTColorChangeEffect) val));
      if (val instanceof CTColorReplaceEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newClrRepl(CT_ColorReplaceEffectConverter.fromDocx4J((CTColorReplaceEffect) val));
      if (val instanceof CTDuotoneEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newDuotone(CT_DuotoneEffectConverter.fromDocx4J((CTDuotoneEffect) val));
      if (val instanceof CTFillOverlayEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newFillOverlay(CT_FillOverlayEffectConverter.fromDocx4J((CTFillOverlayEffect) val));
      if (val instanceof CTGrayscaleEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newGrayscl(CT_GrayscaleEffectConverter.fromDocx4J((CTGrayscaleEffect) val));
      if (val instanceof CTHSLEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newHsl(CT_HSLEffectConverter.fromDocx4J((CTHSLEffect) val));
      if (val instanceof CTLuminanceEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newLum(CT_LuminanceEffectConverter.fromDocx4J((CTLuminanceEffect) val));
      if (val instanceof CTTintEffect) return CT_BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.newTint(CT_TintEffectConverter.fromDocx4J((CTTintEffect) val));
      return null;
    } ).collect(Collectors.toList());
    return new CT_BlipModel(ST_BlipCompressionConverter.fromDocx4J(value.getCstate()), ST_RelationshipIdConverter.fromDocx4J(value.getEmbed()), ST_RelationshipIdConverter.fromDocx4J(value.getLink()), alphaBiLevelOrAlphaCeilingOrAlphaFloor, CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTBlip toDocx4J(CT_BlipModel value) {
    return null;
  }
}
