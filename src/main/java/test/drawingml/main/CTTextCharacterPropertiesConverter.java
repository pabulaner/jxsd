package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.main.CTTextCharacterPropertiesModel.EffectLstOrEffectDagModel.*;
import test.XMLSchema.*;
import test.drawingml.main.*;
import test.drawingml.main.CTTextCharacterPropertiesModel.NoFillOrSolidFillOrGradFillModel.*;
import test.drawingml.main.CTTextCharacterPropertiesModel.ULnTxOrULnModel.*;
import test.officeDocument.relationships.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTTextCharacterPropertiesModel.UFillTxOrUFillModel.*;
import test.drawingml.main.CTTextCharacterPropertiesModel.*;

// SEQUENCE CONVERTER
public class CTTextCharacterPropertiesConverter
{
	
	// CHOICE CONVERTER
	public static class NoFillOrSolidFillOrGradFillConverter
	{
		
		private NoFillOrSolidFillOrGradFillConverter() {
			// empty
		}
		
		public static NoFillOrSolidFillOrGradFillModel fromDocx4j(NoFillOrSolidFillOrGradFill value)
		{
			if (value.getNoFill() != null) return NoFillOrSolidFillOrGradFillModel.createNoFill(
			CTNoFillPropertiesConverter.fromDocx4j(value.getNoFill())
			);
			// THIS IS A JAVA CHOICE
			if (value.getScrgbClr != null) return CTSolidColorFillPropertiesModel.createScrgbClr(
			CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
			);
			if (value.getSrgbClr != null) return CTSolidColorFillPropertiesModel.createSrgbClr(
			CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
			);
			if (value.getHslClr != null) return CTSolidColorFillPropertiesModel.createHslClr(
			CTHslColorConverter.fromDocx4j(value.getHslClr())
			);
			if (value.getSysClr != null) return CTSolidColorFillPropertiesModel.createSysClr(
			CTSystemColorConverter.fromDocx4j(value.getSysClr())
			);
			if (value.getSchemeClr != null) return CTSolidColorFillPropertiesModel.createSchemeClr(
			CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
			);
			if (value.getPrstClr != null) return CTSolidColorFillPropertiesModel.createPrstClr(
			CTPresetColorConverter.fromDocx4j(value.getPrstClr())
			);
			// THIS IS A JAVA CHOICE END
			if (value.getGradFill() != null) return NoFillOrSolidFillOrGradFillModel.createGradFill(
			CTGradientFillPropertiesConverter.fromDocx4j(value.getGradFill())
			);
			if (value.getBlipFill() != null) return NoFillOrSolidFillOrGradFillModel.createBlipFill(
			CTBlipFillPropertiesConverter.fromDocx4j(value.getBlipFill())
			);
			if (value.getPattFill() != null) return NoFillOrSolidFillOrGradFillModel.createPattFill(
			CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
			);
			if (value.getGrpFill() != null) return NoFillOrSolidFillOrGradFillModel.createGrpFill(
			CTGroupFillPropertiesConverter.fromDocx4j(value.getGrpFill())
			);
			
			return new NoFillOrSolidFillOrGradFillModel();
		}
	}
	// CHOICE CONVERTER
	public static class EffectLstOrEffectDagConverter
	{
		
		private EffectLstOrEffectDagConverter() {
			// empty
		}
		
		public static EffectLstOrEffectDagModel fromDocx4j(EffectLstOrEffectDag value)
		{
			if (value.getEffectLst() != null) return EffectLstOrEffectDagModel.createEffectLst(
			CTEffectListConverter.fromDocx4j(value.getEffectLst())
			);
			if (value.getEffectDag() != null) return EffectLstOrEffectDagModel.createEffectDag(
			CTEffectContainerConverter.fromDocx4j(value.getEffectDag())
			);
			
			return new EffectLstOrEffectDagModel();
		}
	}
	// CHOICE CONVERTER
	public static class ULnTxOrULnConverter
	{
		
		private ULnTxOrULnConverter() {
			// empty
		}
		
		public static ULnTxOrULnModel fromDocx4j(ULnTxOrULn value)
		{
			if (value.getULnTx() != null) return ULnTxOrULnModel.createULnTx(
			CTTextUnderlineLineFollowTextConverter.fromDocx4j(value.getULnTx())
			);
			if (value.getULn() != null) return ULnTxOrULnModel.createULn(
			CTLinePropertiesConverter.fromDocx4j(value.getULn())
			);
			
			return new ULnTxOrULnModel();
		}
	}
	// CHOICE CONVERTER
	public static class UFillTxOrUFillConverter
	{
		
		private UFillTxOrUFillConverter() {
			// empty
		}
		
		public static UFillTxOrUFillModel fromDocx4j(UFillTxOrUFill value)
		{
			if (value.getUFillTx() != null) return UFillTxOrUFillModel.createUFillTx(
			CTTextUnderlineFillFollowTextConverter.fromDocx4j(value.getUFillTx())
			);
			// THIS IS A JAVA CHOICE
			if (value.getNoFill != null) return CTTextUnderlineFillGroupWrapperModel.createNoFill(
			CTNoFillPropertiesConverter.fromDocx4j(value.getNoFill())
			);
			if (value.getSolidFill != null) return CTTextUnderlineFillGroupWrapperModel.createSolidFill(
			CTSolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill())
			);
			if (value.getGradFill != null) return CTTextUnderlineFillGroupWrapperModel.createGradFill(
			CTGradientFillPropertiesConverter.fromDocx4j(value.getGradFill())
			);
			if (value.getBlipFill != null) return CTTextUnderlineFillGroupWrapperModel.createBlipFill(
			CTBlipFillPropertiesConverter.fromDocx4j(value.getBlipFill())
			);
			if (value.getPattFill != null) return CTTextUnderlineFillGroupWrapperModel.createPattFill(
			CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
			);
			if (value.getGrpFill != null) return CTTextUnderlineFillGroupWrapperModel.createGrpFill(
			CTGroupFillPropertiesConverter.fromDocx4j(value.getGrpFill())
			);
			// THIS IS A JAVA CHOICE END
			
			return new UFillTxOrUFillModel();
		}
	}
	private CTTextCharacterPropertiesConverter() {
		// empty
	}
	
	public static CTTextCharacterPropertiesModel fromDocx4j(CTTextCharacterProperties value)
	{
		return new CTTextCharacterPropertiesModel(
		STTextStrikeTypeConverter.fromDocx4j(value.getStrike())
		,
		BooleanConverter.fromDocx4j(value.getNoProof())
		,
		StringConverter.fromDocx4j(value.getBmk())
		,
		STPercentageConverter.fromDocx4j(value.getBaseline())
		,
		BooleanConverter.fromDocx4j(value.getDirty())
		,
		BooleanConverter.fromDocx4j(value.getSmtClean())
		,
		BooleanConverter.fromDocx4j(value.getErr())
		,
		BooleanConverter.fromDocx4j(value.getKumimoji())
		,
		BooleanConverter.fromDocx4j(value.getB())
		,
		BooleanConverter.fromDocx4j(value.getI())
		,
		STTextLanguageIDConverter.fromDocx4j(value.getLang())
		,
		STTextFontSizeConverter.fromDocx4j(value.getSz())
		,
		UnsignedIntConverter.fromDocx4j(value.getSmtId())
		,
		BooleanConverter.fromDocx4j(value.getNormalizeH())
		,
		STTextUnderlineTypeConverter.fromDocx4j(value.getU())
		,
		STTextNonNegativePointConverter.fromDocx4j(value.getKern())
		,
		STTextCapsTypeConverter.fromDocx4j(value.getCap())
		,
		STTextLanguageIDConverter.fromDocx4j(value.getAltLang())
		,
		STTextPointConverter.fromDocx4j(value.getSpc())
		,
		CTLinePropertiesConverter.fromDocx4j(value.getLn())
		,
		NoFillOrSolidFillOrGradFillConverter.fromDocx4j(value.getNoFillOrSolidFillOrGradFill())
		,
		EffectLstOrEffectDagConverter.fromDocx4j(value.getEffectLstOrEffectDag())
		,
		CTColorConverter.fromDocx4j(value.getHighlight())
		,
		ULnTxOrULnConverter.fromDocx4j(value.getULnTxOrULn())
		,
		UFillTxOrUFillConverter.fromDocx4j(value.getUFillTxOrUFill())
		,
		CTTextFontConverter.fromDocx4j(value.getLatin())
		,
		CTTextFontConverter.fromDocx4j(value.getEa())
		,
		CTTextFontConverter.fromDocx4j(value.getCs())
		,
		CTTextFontConverter.fromDocx4j(value.getSym())
		,
		CTHyperlinkConverter.fromDocx4j(value.getHlinkClick())
		,
		CTHyperlinkConverter.fromDocx4j(value.getHlinkMouseOver())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
