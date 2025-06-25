package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTSystemColorModel.*;
import test.officeDocument.relationships.*;
import test.dml.CTSystemColorModel.TintOrShadeOrCompModel.*;

public class CTSystemColorConverter
{
	
	public static class TintOrShadeOrCompConverter
	{
		
		private CTSystemColorConverter() {
			// empty
		}
		
		public static CTSystemColorModel fromDocx4j(CTSystemColor value)
		{
			return new TintOrShadeOrCompModel(
			CTPositiveFixedPercentageConverter.fromDocx4j(value.getTint())
			,
			CTPositiveFixedPercentageConverter.fromDocx4j(value.getShade())
			,
			CTComplementTransformConverter.fromDocx4j(value.getComp())
			,
			CTInverseTransformConverter.fromDocx4j(value.getInv())
			,
			CTGrayscaleTransformConverter.fromDocx4j(value.getGray())
			,
			CTPositiveFixedPercentageConverter.fromDocx4j(value.getAlpha())
			,
			CTFixedPercentageConverter.fromDocx4j(value.getAlphaOff())
			,
			CTPositivePercentageConverter.fromDocx4j(value.getAlphaMod())
			,
			CTPositiveFixedAngleConverter.fromDocx4j(value.getHue())
			,
			CTAngleConverter.fromDocx4j(value.getHueOff())
			,
			CTPositivePercentageConverter.fromDocx4j(value.getHueMod())
			,
			CTPercentageConverter.fromDocx4j(value.getSat())
			,
			CTPercentageConverter.fromDocx4j(value.getSatOff())
			,
			CTPercentageConverter.fromDocx4j(value.getSatMod())
			,
			CTPercentageConverter.fromDocx4j(value.getLum())
			,
			CTPercentageConverter.fromDocx4j(value.getLumOff())
			,
			CTPercentageConverter.fromDocx4j(value.getLumMod())
			,
			CTPercentageConverter.fromDocx4j(value.getRed())
			,
			CTPercentageConverter.fromDocx4j(value.getRedOff())
			,
			CTPercentageConverter.fromDocx4j(value.getRedMod())
			,
			CTPercentageConverter.fromDocx4j(value.getGreen())
			,
			CTPercentageConverter.fromDocx4j(value.getGreenOff())
			,
			CTPercentageConverter.fromDocx4j(value.getGreenMod())
			,
			CTPercentageConverter.fromDocx4j(value.getBlue())
			,
			CTPercentageConverter.fromDocx4j(value.getBlueOff())
			,
			CTPercentageConverter.fromDocx4j(value.getBlueMod())
			,
			CTGammaTransformConverter.fromDocx4j(value.getGamma())
			,
			CTInverseGammaTransformConverter.fromDocx4j(value.getInvGamma())
			
			);
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
		value.getTintOrShadeOrComp().stream().map(TintOrShadeOrCompConverter::fromDocx4j).collect(Collectors.toList());
		
		);
	}
}
