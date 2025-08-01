package com.scell.converter.drawingml.main;

import com.scell.converter.officeDocument.relationships.RelationshipIdValueConverter;
import com.scell.model.drawingml.main.BlipModel;
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

public class BlipConverter {
  private BlipConverter() {
  }

  public static BlipModel fromDocx4J(CTBlip value) {
    if (value == null) return null;
    List<BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel> alphaBiLevelOrAlphaCeilingOrAlphaFloor = value.getAlphaBiLevelOrAlphaCeilingOrAlphaFloor().stream().map(val -> {
      if (val instanceof CTAlphaBiLevelEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaBiLevel(AlphaBiLevelEffectConverter.fromDocx4J((CTAlphaBiLevelEffect) val));
      if (val instanceof CTAlphaCeilingEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaCeiling(AlphaCeilingEffectConverter.fromDocx4J((CTAlphaCeilingEffect) val));
      if (val instanceof CTAlphaFloorEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaFloor(AlphaFloorEffectConverter.fromDocx4J((CTAlphaFloorEffect) val));
      if (val instanceof CTAlphaInverseEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaInv(AlphaInverseEffectConverter.fromDocx4J((CTAlphaInverseEffect) val));
      if (val instanceof CTAlphaModulateEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaMod(AlphaModulateEffectConverter.fromDocx4J((CTAlphaModulateEffect) val));
      if (val instanceof CTAlphaModulateFixedEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaModFix(AlphaModulateFixedEffectConverter.fromDocx4J((CTAlphaModulateFixedEffect) val));
      if (val instanceof CTAlphaReplaceEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newAlphaRepl(AlphaReplaceEffectConverter.fromDocx4J((CTAlphaReplaceEffect) val));
      if (val instanceof CTBiLevelEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newBiLevel(BiLevelEffectConverter.fromDocx4J((CTBiLevelEffect) val));
      if (val instanceof CTBlurEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newBlur(BlurEffectConverter.fromDocx4J((CTBlurEffect) val));
      if (val instanceof CTColorChangeEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newClrChange(ColorChangeEffectConverter.fromDocx4J((CTColorChangeEffect) val));
      if (val instanceof CTColorReplaceEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newClrRepl(ColorReplaceEffectConverter.fromDocx4J((CTColorReplaceEffect) val));
      if (val instanceof CTDuotoneEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newDuotone(DuotoneEffectConverter.fromDocx4J((CTDuotoneEffect) val));
      if (val instanceof CTFillOverlayEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newFillOverlay(FillOverlayEffectConverter.fromDocx4J((CTFillOverlayEffect) val));
      if (val instanceof CTGrayscaleEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newGrayscl(GrayscaleEffectConverter.fromDocx4J((CTGrayscaleEffect) val));
      if (val instanceof CTHSLEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newHsl(HSLEffectConverter.fromDocx4J((CTHSLEffect) val));
      if (val instanceof CTLuminanceEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newLum(LuminanceEffectConverter.fromDocx4J((CTLuminanceEffect) val));
      if (val instanceof CTTintEffect) return BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel.newTint(TintEffectConverter.fromDocx4J((CTTintEffect) val));
      return new BlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorValueModel();
    } ).collect(Collectors.toList());
    return new BlipModel(BlipCompressionValueConverter.fromDocx4J(value.getCstate()), RelationshipIdValueConverter.fromDocx4J(value.getEmbed()), RelationshipIdValueConverter.fromDocx4J(value.getLink()), alphaBiLevelOrAlphaCeilingOrAlphaFloor, OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
