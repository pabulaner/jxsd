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
import test.dml.CTBlipModel.AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTBlipModel.*;
import test.officeDocument.relationships.*;

public class CTBlipConverter
{
	
	public static class AlphaBiLevelOrAlphaCeilingOrAlphaFloorConverter
	{
		
		private CTBlipConverter() {
			// empty
		}
		
		public static CTBlipModel fromDocx4j(CTBlip value)
		{
			return new AlphaBiLevelOrAlphaCeilingOrAlphaFloorModel(
			CTAlphaBiLevelEffectConverter.fromDocx4j(value.getAlphaBiLevel())
			,
			CTAlphaCeilingEffectConverter.fromDocx4j(value.getAlphaCeiling())
			,
			CTAlphaFloorEffectConverter.fromDocx4j(value.getAlphaFloor())
			,
			CTAlphaInverseEffectConverter.fromDocx4j(value.getAlphaInv())
			,
			CTAlphaModulateEffectConverter.fromDocx4j(value.getAlphaMod())
			,
			CTAlphaModulateFixedEffectConverter.fromDocx4j(value.getAlphaModFix())
			,
			CTAlphaReplaceEffectConverter.fromDocx4j(value.getAlphaRepl())
			,
			CTBiLevelEffectConverter.fromDocx4j(value.getBiLevel())
			,
			CTBlurEffectConverter.fromDocx4j(value.getBlur())
			,
			CTColorChangeEffectConverter.fromDocx4j(value.getClrChange())
			,
			CTColorReplaceEffectConverter.fromDocx4j(value.getClrRepl())
			,
			CTDuotoneEffectConverter.fromDocx4j(value.getDuotone())
			,
			CTFillOverlayEffectConverter.fromDocx4j(value.getFillOverlay())
			,
			CTGrayscaleEffectConverter.fromDocx4j(value.getGrayscl())
			,
			CTHSLEffectConverter.fromDocx4j(value.getHsl())
			,
			CTLuminanceEffectConverter.fromDocx4j(value.getLum())
			,
			CTTintEffectConverter.fromDocx4j(value.getTint())
			
			);
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
		value.getAlphaBiLevelOrAlphaCeilingOrAlphaFloor().stream().map(AlphaBiLevelOrAlphaCeilingOrAlphaFloorConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
