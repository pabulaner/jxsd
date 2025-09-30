package jxsd.gen.converter.drawingml.main;

import jakarta.xml.bind.JAXBElement;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.namespace.QName;
import jxsd.gen.model.drawingml.main.SRgbColorModel;
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
import org.docx4j.dml.CTSRgbColor;

/**
 * This is a generated sequence class.
 */
public class SRgbColorConverter {
  private SRgbColorConverter() {
  }

  public static SRgbColorModel fromDocx4j(CTSRgbColor value) {
    if (value == null) return null;
    List<SRgbColorModel.EG_ColorTransform> egColorTransform = value.getEGColorTransform().stream().map(val -> {
      if (val.getName().getLocalPart().equals("tint")) return SRgbColorModel.EG_ColorTransform.newTint(PositiveFixedPercentageConverter.fromDocx4j((CTPositiveFixedPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("shade")) return SRgbColorModel.EG_ColorTransform.newShade(PositiveFixedPercentageConverter.fromDocx4j((CTPositiveFixedPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("comp")) return SRgbColorModel.EG_ColorTransform.newComp(ComplementTransformConverter.fromDocx4j((CTComplementTransform) val.getValue()));
      if (val.getName().getLocalPart().equals("inv")) return SRgbColorModel.EG_ColorTransform.newInv(InverseTransformConverter.fromDocx4j((CTInverseTransform) val.getValue()));
      if (val.getName().getLocalPart().equals("gray")) return SRgbColorModel.EG_ColorTransform.newGray(GrayscaleTransformConverter.fromDocx4j((CTGrayscaleTransform) val.getValue()));
      if (val.getName().getLocalPart().equals("alpha")) return SRgbColorModel.EG_ColorTransform.newAlpha(PositiveFixedPercentageConverter.fromDocx4j((CTPositiveFixedPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("alphaOff")) return SRgbColorModel.EG_ColorTransform.newAlphaOff(FixedPercentageConverter.fromDocx4j((CTFixedPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("alphaMod")) return SRgbColorModel.EG_ColorTransform.newAlphaMod(PositivePercentageConverter.fromDocx4j((CTPositivePercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("hue")) return SRgbColorModel.EG_ColorTransform.newHue(PositiveFixedAngleConverter.fromDocx4j((CTPositiveFixedAngle) val.getValue()));
      if (val.getName().getLocalPart().equals("hueOff")) return SRgbColorModel.EG_ColorTransform.newHueOff(AngleConverter.fromDocx4j((CTAngle) val.getValue()));
      if (val.getName().getLocalPart().equals("hueMod")) return SRgbColorModel.EG_ColorTransform.newHueMod(PositivePercentageConverter.fromDocx4j((CTPositivePercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("sat")) return SRgbColorModel.EG_ColorTransform.newSat(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("satOff")) return SRgbColorModel.EG_ColorTransform.newSatOff(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("satMod")) return SRgbColorModel.EG_ColorTransform.newSatMod(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("lum")) return SRgbColorModel.EG_ColorTransform.newLum(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("lumOff")) return SRgbColorModel.EG_ColorTransform.newLumOff(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("lumMod")) return SRgbColorModel.EG_ColorTransform.newLumMod(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("red")) return SRgbColorModel.EG_ColorTransform.newRed(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("redOff")) return SRgbColorModel.EG_ColorTransform.newRedOff(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("redMod")) return SRgbColorModel.EG_ColorTransform.newRedMod(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("green")) return SRgbColorModel.EG_ColorTransform.newGreen(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("greenOff")) return SRgbColorModel.EG_ColorTransform.newGreenOff(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("greenMod")) return SRgbColorModel.EG_ColorTransform.newGreenMod(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("blue")) return SRgbColorModel.EG_ColorTransform.newBlue(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("blueOff")) return SRgbColorModel.EG_ColorTransform.newBlueOff(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("blueMod")) return SRgbColorModel.EG_ColorTransform.newBlueMod(PercentageConverter.fromDocx4j((CTPercentage) val.getValue()));
      if (val.getName().getLocalPart().equals("gamma")) return SRgbColorModel.EG_ColorTransform.newGamma(GammaTransformConverter.fromDocx4j((CTGammaTransform) val.getValue()));
      if (val.getName().getLocalPart().equals("invGamma")) return SRgbColorModel.EG_ColorTransform.newInvGamma(InverseGammaTransformConverter.fromDocx4j((CTInverseGammaTransform) val.getValue()));
      return null;
    } ).collect(Collectors.toList());
    return new SRgbColorModel(HexBinary3ValueConverter.fromDocx4j(value.getVal()), egColorTransform);
  }

  public static CTSRgbColor toDocx4j(SRgbColorModel value) {
    if (value == null) return null;
    CTSRgbColor result = new CTSRgbColor();
    result.setVal(HexBinary3ValueConverter.toDocx4j(value.getVal()));
    result.getEGColorTransform().addAll(value.getEGColorTransform().stream().map(val -> {
      if (val.isTint()) return new JAXBElement<>(new QName("tint"), CTPositiveFixedPercentage.class, PositiveFixedPercentageConverter.toDocx4j(val.getTint()));
      if (val.isShade()) return new JAXBElement<>(new QName("shade"), CTPositiveFixedPercentage.class, PositiveFixedPercentageConverter.toDocx4j(val.getShade()));
      if (val.isComp()) return new JAXBElement<>(new QName("comp"), CTComplementTransform.class, ComplementTransformConverter.toDocx4j(val.getComp()));
      if (val.isInv()) return new JAXBElement<>(new QName("inv"), CTInverseTransform.class, InverseTransformConverter.toDocx4j(val.getInv()));
      if (val.isGray()) return new JAXBElement<>(new QName("gray"), CTGrayscaleTransform.class, GrayscaleTransformConverter.toDocx4j(val.getGray()));
      if (val.isAlpha()) return new JAXBElement<>(new QName("alpha"), CTPositiveFixedPercentage.class, PositiveFixedPercentageConverter.toDocx4j(val.getAlpha()));
      if (val.isAlphaOff()) return new JAXBElement<>(new QName("alphaOff"), CTFixedPercentage.class, FixedPercentageConverter.toDocx4j(val.getAlphaOff()));
      if (val.isAlphaMod()) return new JAXBElement<>(new QName("alphaMod"), CTPositivePercentage.class, PositivePercentageConverter.toDocx4j(val.getAlphaMod()));
      if (val.isHue()) return new JAXBElement<>(new QName("hue"), CTPositiveFixedAngle.class, PositiveFixedAngleConverter.toDocx4j(val.getHue()));
      if (val.isHueOff()) return new JAXBElement<>(new QName("hueOff"), CTAngle.class, AngleConverter.toDocx4j(val.getHueOff()));
      if (val.isHueMod()) return new JAXBElement<>(new QName("hueMod"), CTPositivePercentage.class, PositivePercentageConverter.toDocx4j(val.getHueMod()));
      if (val.isSat()) return new JAXBElement<>(new QName("sat"), CTPercentage.class, PercentageConverter.toDocx4j(val.getSat()));
      if (val.isSatOff()) return new JAXBElement<>(new QName("satOff"), CTPercentage.class, PercentageConverter.toDocx4j(val.getSatOff()));
      if (val.isSatMod()) return new JAXBElement<>(new QName("satMod"), CTPercentage.class, PercentageConverter.toDocx4j(val.getSatMod()));
      if (val.isLum()) return new JAXBElement<>(new QName("lum"), CTPercentage.class, PercentageConverter.toDocx4j(val.getLum()));
      if (val.isLumOff()) return new JAXBElement<>(new QName("lumOff"), CTPercentage.class, PercentageConverter.toDocx4j(val.getLumOff()));
      if (val.isLumMod()) return new JAXBElement<>(new QName("lumMod"), CTPercentage.class, PercentageConverter.toDocx4j(val.getLumMod()));
      if (val.isRed()) return new JAXBElement<>(new QName("red"), CTPercentage.class, PercentageConverter.toDocx4j(val.getRed()));
      if (val.isRedOff()) return new JAXBElement<>(new QName("redOff"), CTPercentage.class, PercentageConverter.toDocx4j(val.getRedOff()));
      if (val.isRedMod()) return new JAXBElement<>(new QName("redMod"), CTPercentage.class, PercentageConverter.toDocx4j(val.getRedMod()));
      if (val.isGreen()) return new JAXBElement<>(new QName("green"), CTPercentage.class, PercentageConverter.toDocx4j(val.getGreen()));
      if (val.isGreenOff()) return new JAXBElement<>(new QName("greenOff"), CTPercentage.class, PercentageConverter.toDocx4j(val.getGreenOff()));
      if (val.isGreenMod()) return new JAXBElement<>(new QName("greenMod"), CTPercentage.class, PercentageConverter.toDocx4j(val.getGreenMod()));
      if (val.isBlue()) return new JAXBElement<>(new QName("blue"), CTPercentage.class, PercentageConverter.toDocx4j(val.getBlue()));
      if (val.isBlueOff()) return new JAXBElement<>(new QName("blueOff"), CTPercentage.class, PercentageConverter.toDocx4j(val.getBlueOff()));
      if (val.isBlueMod()) return new JAXBElement<>(new QName("blueMod"), CTPercentage.class, PercentageConverter.toDocx4j(val.getBlueMod()));
      if (val.isGamma()) return new JAXBElement<>(new QName("gamma"), CTGammaTransform.class, GammaTransformConverter.toDocx4j(val.getGamma()));
      if (val.isInvGamma()) return new JAXBElement<>(new QName("invGamma"), CTInverseGammaTransform.class, InverseGammaTransformConverter.toDocx4j(val.getInvGamma()));
      return null;
    } ).collect(Collectors.toList()));
    return result;
  }
}
