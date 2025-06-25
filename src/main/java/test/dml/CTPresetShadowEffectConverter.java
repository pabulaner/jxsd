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
import test.dml.CTPresetShadowEffectModel.ScrgbClrOrSrgbClrOrHslClrModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import test.dml.CTPresetShadowEffectModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPresetShadowEffectConverter
{
	
	public static class ScrgbClrOrSrgbClrOrHslClrConverter
	{
		
		private CTPresetShadowEffectConverter() {
			// empty
		}
		
		public static CTPresetShadowEffectModel fromDocx4j(CTPresetShadowEffect value)
		{
			return new ScrgbClrOrSrgbClrOrHslClrModel(
			CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
			,
			CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
			,
			CTHslColorConverter.fromDocx4j(value.getHslClr())
			,
			CTSystemColorConverter.fromDocx4j(value.getSysClr())
			,
			CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
			,
			CTPresetColorConverter.fromDocx4j(value.getPrstClr())
			
			);
		}
	}
	private CTPresetShadowEffectConverter() {
		// empty
	}
	
	public static CTPresetShadowEffectModel fromDocx4j(CTPresetShadowEffect value)
	{
		return new CTPresetShadowEffectModel(
		STPositiveCoordinateConverter.fromDocx4j(value.getDist())
		,
		STPresetShadowValConverter.fromDocx4j(value.getPrst())
		,
		STPositiveFixedAngleConverter.fromDocx4j(value.getDir())
		,
		ScrgbClrOrSrgbClrOrHslClrConverter.fromDocx4j(value.getScrgbClrOrSrgbClrOrHslClr())
		
		);
	}
}
