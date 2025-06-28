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
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import test.drawingml.main.CTOuterShadowEffectModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.main.CTOuterShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTOuterShadowEffectConverter
{
	
	// CHOICE CONVERTER
	public static class ScrgbClrOrSrgbClrOrHslClrConverter
	{
		
		private ScrgbClrOrSrgbClrOrHslClrConverter() {
			// empty
		}
		
		public static ScrgbClrOrSrgbClrOrHslClrModel fromDocx4j(ScrgbClrOrSrgbClrOrHslClr value)
		{
			if (value.getScrgbClr() != null) return ScrgbClrOrSrgbClrOrHslClrModel.createScrgbClr(
			CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
			);
			if (value.getSrgbClr() != null) return ScrgbClrOrSrgbClrOrHslClrModel.createSrgbClr(
			CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
			);
			if (value.getHslClr() != null) return ScrgbClrOrSrgbClrOrHslClrModel.createHslClr(
			CTHslColorConverter.fromDocx4j(value.getHslClr())
			);
			if (value.getSysClr() != null) return ScrgbClrOrSrgbClrOrHslClrModel.createSysClr(
			CTSystemColorConverter.fromDocx4j(value.getSysClr())
			);
			if (value.getSchemeClr() != null) return ScrgbClrOrSrgbClrOrHslClrModel.createSchemeClr(
			CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
			);
			if (value.getPrstClr() != null) return ScrgbClrOrSrgbClrOrHslClrModel.createPrstClr(
			CTPresetColorConverter.fromDocx4j(value.getPrstClr())
			);
			
			return new ScrgbClrOrSrgbClrOrHslClrModel();
		}
	}
	private CTOuterShadowEffectConverter() {
		// empty
	}
	
	public static CTOuterShadowEffectModel fromDocx4j(CTOuterShadowEffect value)
	{
		return new CTOuterShadowEffectModel(
		STPositiveCoordinateConverter.fromDocx4j(value.getBlurRad())
		,
		STPositiveCoordinateConverter.fromDocx4j(value.getDist())
		,
		BooleanConverter.fromDocx4j(value.getRotWithShape())
		,
		STPercentageConverter.fromDocx4j(value.getSy())
		,
		STFixedAngleConverter.fromDocx4j(value.getKy())
		,
		STPercentageConverter.fromDocx4j(value.getSx())
		,
		STFixedAngleConverter.fromDocx4j(value.getKx())
		,
		STPositiveFixedAngleConverter.fromDocx4j(value.getDir())
		,
		STRectAlignmentConverter.fromDocx4j(value.getAlgn())
		,
		ScrgbClrOrSrgbClrOrHslClrConverter.fromDocx4j(value.getScrgbClrOrSrgbClrOrHslClr())
		
		);
	}
}
