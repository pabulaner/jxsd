package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.drawingml.main.CTSystemColorModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTSystemColorModel.TintOrShadeOrCompModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTSystemColorConverter
{
	
	// CHOICE CONVERTER
	public static class TintOrShadeOrCompConverter
	{
		
		private TintOrShadeOrCompConverter() {
			// empty
		}
		
		public static TintOrShadeOrCompModel fromDocx4j(TintOrShadeOrComp value)
		{
			if (value.getTint() != null) return TintOrShadeOrCompModel.createTint(
			CTPositiveFixedPercentageConverter.fromDocx4j(value.getTint())
			);
			if (value.getShade() != null) return TintOrShadeOrCompModel.createShade(
			CTPositiveFixedPercentageConverter.fromDocx4j(value.getShade())
			);
			if (value.getComp() != null) return TintOrShadeOrCompModel.createComp(
			CTComplementTransformConverter.fromDocx4j(value.getComp())
			);
			if (value.getInv() != null) return TintOrShadeOrCompModel.createInv(
			CTInverseTransformConverter.fromDocx4j(value.getInv())
			);
			if (value.getGray() != null) return TintOrShadeOrCompModel.createGray(
			CTGrayscaleTransformConverter.fromDocx4j(value.getGray())
			);
			if (value.getAlpha() != null) return TintOrShadeOrCompModel.createAlpha(
			CTPositiveFixedPercentageConverter.fromDocx4j(value.getAlpha())
			);
			if (value.getAlphaOff() != null) return TintOrShadeOrCompModel.createAlphaOff(
			CTFixedPercentageConverter.fromDocx4j(value.getAlphaOff())
			);
			if (value.getAlphaMod() != null) return TintOrShadeOrCompModel.createAlphaMod(
			CTPositivePercentageConverter.fromDocx4j(value.getAlphaMod())
			);
			if (value.getHue() != null) return TintOrShadeOrCompModel.createHue(
			CTPositiveFixedAngleConverter.fromDocx4j(value.getHue())
			);
			if (value.getHueOff() != null) return TintOrShadeOrCompModel.createHueOff(
			CTAngleConverter.fromDocx4j(value.getHueOff())
			);
			if (value.getHueMod() != null) return TintOrShadeOrCompModel.createHueMod(
			CTPositivePercentageConverter.fromDocx4j(value.getHueMod())
			);
			if (value.getSat() != null) return TintOrShadeOrCompModel.createSat(
			CTPercentageConverter.fromDocx4j(value.getSat())
			);
			if (value.getSatOff() != null) return TintOrShadeOrCompModel.createSatOff(
			CTPercentageConverter.fromDocx4j(value.getSatOff())
			);
			if (value.getSatMod() != null) return TintOrShadeOrCompModel.createSatMod(
			CTPercentageConverter.fromDocx4j(value.getSatMod())
			);
			if (value.getLum() != null) return TintOrShadeOrCompModel.createLum(
			CTPercentageConverter.fromDocx4j(value.getLum())
			);
			if (value.getLumOff() != null) return TintOrShadeOrCompModel.createLumOff(
			CTPercentageConverter.fromDocx4j(value.getLumOff())
			);
			if (value.getLumMod() != null) return TintOrShadeOrCompModel.createLumMod(
			CTPercentageConverter.fromDocx4j(value.getLumMod())
			);
			if (value.getRed() != null) return TintOrShadeOrCompModel.createRed(
			CTPercentageConverter.fromDocx4j(value.getRed())
			);
			if (value.getRedOff() != null) return TintOrShadeOrCompModel.createRedOff(
			CTPercentageConverter.fromDocx4j(value.getRedOff())
			);
			if (value.getRedMod() != null) return TintOrShadeOrCompModel.createRedMod(
			CTPercentageConverter.fromDocx4j(value.getRedMod())
			);
			if (value.getGreen() != null) return TintOrShadeOrCompModel.createGreen(
			CTPercentageConverter.fromDocx4j(value.getGreen())
			);
			if (value.getGreenOff() != null) return TintOrShadeOrCompModel.createGreenOff(
			CTPercentageConverter.fromDocx4j(value.getGreenOff())
			);
			if (value.getGreenMod() != null) return TintOrShadeOrCompModel.createGreenMod(
			CTPercentageConverter.fromDocx4j(value.getGreenMod())
			);
			if (value.getBlue() != null) return TintOrShadeOrCompModel.createBlue(
			CTPercentageConverter.fromDocx4j(value.getBlue())
			);
			if (value.getBlueOff() != null) return TintOrShadeOrCompModel.createBlueOff(
			CTPercentageConverter.fromDocx4j(value.getBlueOff())
			);
			if (value.getBlueMod() != null) return TintOrShadeOrCompModel.createBlueMod(
			CTPercentageConverter.fromDocx4j(value.getBlueMod())
			);
			if (value.getGamma() != null) return TintOrShadeOrCompModel.createGamma(
			CTGammaTransformConverter.fromDocx4j(value.getGamma())
			);
			if (value.getInvGamma() != null) return TintOrShadeOrCompModel.createInvGamma(
			CTInverseGammaTransformConverter.fromDocx4j(value.getInvGamma())
			);
			
			return new TintOrShadeOrCompModel();
		}
	}
	private CTSystemColorConverter() {
		// empty
	}
	
	public static CTSystemColorModel fromDocx4j(CTSystemColor value)
	{
		return new CTSystemColorModel(
		STSystemColorValConverter.fromDocx4j(value.getVal())
		,
		STHexBinary3Converter.fromDocx4j(value.getLastClr())
		,
		value.getTintOrShadeOrComp().stream().map(TintOrShadeOrCompConverter::fromDocx4j).collect(Collectors.toList())
		
		);
	}
}
