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
import test.dml.CTTextCharacterPropertiesModel.UFillTxOrUFillModel.*;
import test.XMLSchema.*;
import test.dml.CTTextCharacterPropertiesModel.ULnTxOrULnModel.*;
import test.dml.CTTextCharacterPropertiesModel.NoFillOrSolidFillOrGradFillModel.*;
import test.officeDocument.relationships.*;
import org.docx4j.dml.chart.*;
import test.dml.CTTextCharacterPropertiesModel.*;
import test.dml.chartDrawing.*;
import test.dml.CTTextCharacterPropertiesModel.EffectLstOrEffectDagModel.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;

public class CTTextCharacterPropertiesConverter
{
	
	public static class NoFillOrSolidFillOrGradFillConverter
	{
		
		private CTTextCharacterPropertiesConverter() {
			// empty
		}
		
		public static CTTextCharacterPropertiesModel fromDocx4j(CTTextCharacterProperties value)
		{
			return new NoFillOrSolidFillOrGradFillModel(
			CTNoFillPropertiesConverter.fromDocx4j(value.getNoFill())
			,
			CTSolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill())
			,
			CTGradientFillPropertiesConverter.fromDocx4j(value.getGradFill())
			,
			CTBlipFillPropertiesConverter.fromDocx4j(value.getBlipFill())
			,
			CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
			,
			CTGroupFillPropertiesConverter.fromDocx4j(value.getGrpFill())
			
			);
		}
	}
	public static class EffectLstOrEffectDagConverter
	{
		
		private CTTextCharacterPropertiesConverter() {
			// empty
		}
		
		public static CTTextCharacterPropertiesModel fromDocx4j(CTTextCharacterProperties value)
		{
			return new EffectLstOrEffectDagModel(
			CTEffectListConverter.fromDocx4j(value.getEffectLst())
			,
			CTEffectContainerConverter.fromDocx4j(value.getEffectDag())
			
			);
		}
	}
	public static class ULnTxOrULnConverter
	{
		
		private CTTextCharacterPropertiesConverter() {
			// empty
		}
		
		public static CTTextCharacterPropertiesModel fromDocx4j(CTTextCharacterProperties value)
		{
			return new ULnTxOrULnModel(
			CTTextUnderlineLineFollowTextConverter.fromDocx4j(value.getULnTx())
			,
			CTLinePropertiesConverter.fromDocx4j(value.getULn())
			
			);
		}
	}
	public static class UFillTxOrUFillConverter
	{
		
		private CTTextCharacterPropertiesConverter() {
			// empty
		}
		
		public static CTTextCharacterPropertiesModel fromDocx4j(CTTextCharacterProperties value)
		{
			return new UFillTxOrUFillModel(
			CTTextUnderlineFillFollowTextConverter.fromDocx4j(value.getUFillTx())
			,
			CTTextUnderlineFillGroupWrapperConverter.fromDocx4j(value.getUFill())
			
			);
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
