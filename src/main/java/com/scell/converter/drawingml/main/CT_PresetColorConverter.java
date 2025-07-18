package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PresetColorModel;
import java.util.List;
import java.util.stream.Collectors;
import org.docx4j.dml.CTAngle;
import org.docx4j.dml.CTComplementTransform;
import org.docx4j.dml.CTFixedPercentage;
import org.docx4j.dml.CTGammaTransform;
import org.docx4j.dml.CTGrayscaleTransform;
import org.docx4j.dml.CTInverseGammaTransform;
import org.docx4j.dml.CTInverseTransform;
import org.docx4j.dml.CTPercentage;
import org.docx4j.dml.CTPositiveFixedAngle;
import org.docx4j.dml.CTPositiveFixedPercentage;
import org.docx4j.dml.CTPositivePercentage;
import org.docx4j.dml.CTPresetColor;

public class CT_PresetColorConverter {
  private CT_PresetColorConverter() {
  }

  public static CT_PresetColorModel fromDocx4J(CTPresetColor value) {
    if (value == null) return null;
    // look here true;
    List<CT_PresetColorModel.EG_ColorTransformModel> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      if (val instanceof CTPositiveFixedPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newTint(CT_PositiveFixedPercentageConverter.fromDocx4J((CTPositiveFixedPercentage) val));
      if (val instanceof CTPositiveFixedPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newShade(CT_PositiveFixedPercentageConverter.fromDocx4J((CTPositiveFixedPercentage) val));
      if (val instanceof CTComplementTransform) return CT_PresetColorModel.EG_ColorTransformModel.newComp(CT_ComplementTransformConverter.fromDocx4J((CTComplementTransform) val));
      if (val instanceof CTInverseTransform) return CT_PresetColorModel.EG_ColorTransformModel.newInv(CT_InverseTransformConverter.fromDocx4J((CTInverseTransform) val));
      if (val instanceof CTGrayscaleTransform) return CT_PresetColorModel.EG_ColorTransformModel.newGray(CT_GrayscaleTransformConverter.fromDocx4J((CTGrayscaleTransform) val));
      if (val instanceof CTPositiveFixedPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newAlpha(CT_PositiveFixedPercentageConverter.fromDocx4J((CTPositiveFixedPercentage) val));
      if (val instanceof CTFixedPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newAlphaOff(CT_FixedPercentageConverter.fromDocx4J((CTFixedPercentage) val));
      if (val instanceof CTPositivePercentage) return CT_PresetColorModel.EG_ColorTransformModel.newAlphaMod(CT_PositivePercentageConverter.fromDocx4J((CTPositivePercentage) val));
      if (val instanceof CTPositiveFixedAngle) return CT_PresetColorModel.EG_ColorTransformModel.newHue(CT_PositiveFixedAngleConverter.fromDocx4J((CTPositiveFixedAngle) val));
      if (val instanceof CTAngle) return CT_PresetColorModel.EG_ColorTransformModel.newHueOff(CT_AngleConverter.fromDocx4J((CTAngle) val));
      if (val instanceof CTPositivePercentage) return CT_PresetColorModel.EG_ColorTransformModel.newHueMod(CT_PositivePercentageConverter.fromDocx4J((CTPositivePercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newSat(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newSatOff(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newSatMod(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newLum(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newLumOff(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newLumMod(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newRed(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newRedOff(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newRedMod(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newGreen(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newGreenOff(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newGreenMod(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newBlue(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newBlueOff(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTPercentage) return CT_PresetColorModel.EG_ColorTransformModel.newBlueMod(CT_PercentageConverter.fromDocx4J((CTPercentage) val));
      if (val instanceof CTGammaTransform) return CT_PresetColorModel.EG_ColorTransformModel.newGamma(CT_GammaTransformConverter.fromDocx4J((CTGammaTransform) val));
      if (val instanceof CTInverseGammaTransform) return CT_PresetColorModel.EG_ColorTransformModel.newInvGamma(CT_InverseGammaTransformConverter.fromDocx4J((CTInverseGammaTransform) val));
      return null;
    } ).collect(Collectors.toList());
    return new CT_PresetColorModel(ST_PresetColorValConverter.fromDocx4J(value.getVal()), egColorTransform);
  }

  public static CTPresetColor toDocx4J(CT_PresetColorModel value) {
    return null;
  }
}
