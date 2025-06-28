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
import test.drawingml.main.CTBlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.*;
import test.drawingml.chart.*;
import test.drawingml.main.CTBlipModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTBlipConverter
{
	
	// CHOICE CONVERTER
	public static class AlphaBiLevelOrAlphaCeilingOrAlphaFloorConverter
	{
		
		private AlphaBiLevelOrAlphaCeilingOrAlphaFloorConverter() {
			// empty
		}
		
		public static AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel fromDocx4j(AlphaBiLevelOrAlphaCeilingOrAlphaFloor value)
		{
			if (value.getAlphaBiLevel() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createAlphaBiLevel(
			CTAlphaBiLevelEffectConverter.fromDocx4j(value.getAlphaBiLevel())
			);
			if (value.getAlphaCeiling() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createAlphaCeiling(
			CTAlphaCeilingEffectConverter.fromDocx4j(value.getAlphaCeiling())
			);
			if (value.getAlphaFloor() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createAlphaFloor(
			CTAlphaFloorEffectConverter.fromDocx4j(value.getAlphaFloor())
			);
			// THIS IS A JAVA CHOICE
			if (value.getScrgbClr != null) return CTAlphaInverseEffectModel.createScrgbClr(
			CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
			);
			if (value.getSrgbClr != null) return CTAlphaInverseEffectModel.createSrgbClr(
			CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
			);
			if (value.getHslClr != null) return CTAlphaInverseEffectModel.createHslClr(
			CTHslColorConverter.fromDocx4j(value.getHslClr())
			);
			if (value.getSysClr != null) return CTAlphaInverseEffectModel.createSysClr(
			CTSystemColorConverter.fromDocx4j(value.getSysClr())
			);
			if (value.getSchemeClr != null) return CTAlphaInverseEffectModel.createSchemeClr(
			CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
			);
			if (value.getPrstClr != null) return CTAlphaInverseEffectModel.createPrstClr(
			CTPresetColorConverter.fromDocx4j(value.getPrstClr())
			);
			// THIS IS A JAVA CHOICE END
			if (value.getAlphaMod() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createAlphaMod(
			CTAlphaModulateEffectConverter.fromDocx4j(value.getAlphaMod())
			);
			if (value.getAlphaModFix() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createAlphaModFix(
			CTAlphaModulateFixedEffectConverter.fromDocx4j(value.getAlphaModFix())
			);
			if (value.getAlphaRepl() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createAlphaRepl(
			CTAlphaReplaceEffectConverter.fromDocx4j(value.getAlphaRepl())
			);
			if (value.getBiLevel() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createBiLevel(
			CTBiLevelEffectConverter.fromDocx4j(value.getBiLevel())
			);
			if (value.getBlur() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createBlur(
			CTBlurEffectConverter.fromDocx4j(value.getBlur())
			);
			if (value.getClrChange() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createClrChange(
			CTColorChangeEffectConverter.fromDocx4j(value.getClrChange())
			);
			// THIS IS A JAVA CHOICE
			if (value.getScrgbClr != null) return CTColorReplaceEffectModel.createScrgbClr(
			CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
			);
			if (value.getSrgbClr != null) return CTColorReplaceEffectModel.createSrgbClr(
			CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
			);
			if (value.getHslClr != null) return CTColorReplaceEffectModel.createHslClr(
			CTHslColorConverter.fromDocx4j(value.getHslClr())
			);
			if (value.getSysClr != null) return CTColorReplaceEffectModel.createSysClr(
			CTSystemColorConverter.fromDocx4j(value.getSysClr())
			);
			if (value.getSchemeClr != null) return CTColorReplaceEffectModel.createSchemeClr(
			CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
			);
			if (value.getPrstClr != null) return CTColorReplaceEffectModel.createPrstClr(
			CTPresetColorConverter.fromDocx4j(value.getPrstClr())
			);
			// THIS IS A JAVA CHOICE END
			// THIS IS A JAVA CHOICE
			if (value.getScrgbClr != null) return CTDuotoneEffectModel.createScrgbClr(
			CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
			);
			if (value.getSrgbClr != null) return CTDuotoneEffectModel.createSrgbClr(
			CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
			);
			if (value.getHslClr != null) return CTDuotoneEffectModel.createHslClr(
			CTHslColorConverter.fromDocx4j(value.getHslClr())
			);
			if (value.getSysClr != null) return CTDuotoneEffectModel.createSysClr(
			CTSystemColorConverter.fromDocx4j(value.getSysClr())
			);
			if (value.getSchemeClr != null) return CTDuotoneEffectModel.createSchemeClr(
			CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
			);
			if (value.getPrstClr != null) return CTDuotoneEffectModel.createPrstClr(
			CTPresetColorConverter.fromDocx4j(value.getPrstClr())
			);
			// THIS IS A JAVA CHOICE END
			if (value.getFillOverlay() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createFillOverlay(
			CTFillOverlayEffectConverter.fromDocx4j(value.getFillOverlay())
			);
			if (value.getGrayscl() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createGrayscl(
			CTGrayscaleEffectConverter.fromDocx4j(value.getGrayscl())
			);
			if (value.getHsl() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createHsl(
			CTHSLEffectConverter.fromDocx4j(value.getHsl())
			);
			if (value.getLum() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createLum(
			CTLuminanceEffectConverter.fromDocx4j(value.getLum())
			);
			if (value.getTint() != null) return AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.createTint(
			CTTintEffectConverter.fromDocx4j(value.getTint())
			);
			
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel();
		}
	}
	private CTBlipConverter() {
		// empty
	}
	
	public static CTBlipModel fromDocx4j(CTBlip value)
	{
		return new CTBlipModel(
		STBlipCompressionConverter.fromDocx4j(value.getCstate())
		,
		STRelationshipIdConverter.fromDocx4j(value.getEmbed())
		,
		STRelationshipIdConverter.fromDocx4j(value.getLink())
		,
		value.getAlphaBiLevelOrAlphaCeilingOrAlphaFloor().stream().map(AlphaBiLevelOrAlphaCeilingOrAlphaFloorConverter::fromDocx4j).collect(Collectors.toList())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
