package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.main.CTTextParagraphPropertiesModel.BuClrTxOrBuClrModel.*;
import test.drawingml.main.CTTextParagraphPropertiesModel.*;
import test.XMLSchema.*;
import test.drawingml.main.CTTextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel.*;
import test.drawingml.main.*;
import test.officeDocument.relationships.*;
import org.docx4j.dml.chart.*;
import test.drawingml.main.CTTextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel.*;
import test.drawingml.chart.*;
import test.drawingml.main.CTTextParagraphPropertiesModel.BuFontTxOrBuFontModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;

// SEQUENCE CONVERTER
public class CTTextParagraphPropertiesConverter
{
	
	// CHOICE CONVERTER
	public static class BuClrTxOrBuClrConverter
	{
		
		private BuClrTxOrBuClrConverter() {
			// empty
		}
		
		public static BuClrTxOrBuClrModel fromDocx4j(BuClrTxOrBuClr value)
		{
			if (value.getBuClrTx() != null) return BuClrTxOrBuClrModel.createBuClrTx(
			CTTextBulletColorFollowTextConverter.fromDocx4j(value.getBuClrTx())
			);
			// THIS IS A JAVA CHOICE
			if (value.getScrgbClr != null) return CTColorModel.createScrgbClr(
			CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
			);
			if (value.getSrgbClr != null) return CTColorModel.createSrgbClr(
			CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
			);
			if (value.getHslClr != null) return CTColorModel.createHslClr(
			CTHslColorConverter.fromDocx4j(value.getHslClr())
			);
			if (value.getSysClr != null) return CTColorModel.createSysClr(
			CTSystemColorConverter.fromDocx4j(value.getSysClr())
			);
			if (value.getSchemeClr != null) return CTColorModel.createSchemeClr(
			CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
			);
			if (value.getPrstClr != null) return CTColorModel.createPrstClr(
			CTPresetColorConverter.fromDocx4j(value.getPrstClr())
			);
			// THIS IS A JAVA CHOICE END
			
			return new BuClrTxOrBuClrModel();
		}
	}
	// CHOICE CONVERTER
	public static class BuSzTxOrBuSzPctOrBuSzPtsConverter
	{
		
		private BuSzTxOrBuSzPctOrBuSzPtsConverter() {
			// empty
		}
		
		public static BuSzTxOrBuSzPctOrBuSzPtsModel fromDocx4j(BuSzTxOrBuSzPctOrBuSzPts value)
		{
			if (value.getBuSzTx() != null) return BuSzTxOrBuSzPctOrBuSzPtsModel.createBuSzTx(
			CTTextBulletSizeFollowTextConverter.fromDocx4j(value.getBuSzTx())
			);
			if (value.getBuSzPct() != null) return BuSzTxOrBuSzPctOrBuSzPtsModel.createBuSzPct(
			CTTextBulletSizePercentConverter.fromDocx4j(value.getBuSzPct())
			);
			if (value.getBuSzPts() != null) return BuSzTxOrBuSzPctOrBuSzPtsModel.createBuSzPts(
			CTTextBulletSizePointConverter.fromDocx4j(value.getBuSzPts())
			);
			
			return new BuSzTxOrBuSzPctOrBuSzPtsModel();
		}
	}
	// CHOICE CONVERTER
	public static class BuFontTxOrBuFontConverter
	{
		
		private BuFontTxOrBuFontConverter() {
			// empty
		}
		
		public static BuFontTxOrBuFontModel fromDocx4j(BuFontTxOrBuFont value)
		{
			if (value.getBuFontTx() != null) return BuFontTxOrBuFontModel.createBuFontTx(
			CTTextBulletTypefaceFollowTextConverter.fromDocx4j(value.getBuFontTx())
			);
			if (value.getBuFont() != null) return BuFontTxOrBuFontModel.createBuFont(
			CTTextFontConverter.fromDocx4j(value.getBuFont())
			);
			
			return new BuFontTxOrBuFontModel();
		}
	}
	// CHOICE CONVERTER
	public static class BuNoneOrBuAutoNumOrBuCharConverter
	{
		
		private BuNoneOrBuAutoNumOrBuCharConverter() {
			// empty
		}
		
		public static BuNoneOrBuAutoNumOrBuCharModel fromDocx4j(BuNoneOrBuAutoNumOrBuChar value)
		{
			if (value.getBuNone() != null) return BuNoneOrBuAutoNumOrBuCharModel.createBuNone(
			CTTextNoBulletConverter.fromDocx4j(value.getBuNone())
			);
			if (value.getBuAutoNum() != null) return BuNoneOrBuAutoNumOrBuCharModel.createBuAutoNum(
			CTTextAutonumberBulletConverter.fromDocx4j(value.getBuAutoNum())
			);
			if (value.getBuChar() != null) return BuNoneOrBuAutoNumOrBuCharModel.createBuChar(
			CTTextCharBulletConverter.fromDocx4j(value.getBuChar())
			);
			if (value.getBuBlip() != null) return BuNoneOrBuAutoNumOrBuCharModel.createBuBlip(
			CTTextBlipBulletConverter.fromDocx4j(value.getBuBlip())
			);
			
			return new BuNoneOrBuAutoNumOrBuCharModel();
		}
	}
	private CTTextParagraphPropertiesConverter() {
		// empty
	}
	
	public static CTTextParagraphPropertiesModel fromDocx4j(CTTextParagraphProperties value)
	{
		return new CTTextParagraphPropertiesModel(
		STTextIndentConverter.fromDocx4j(value.getIndent())
		,
		BooleanConverter.fromDocx4j(value.getLatinLnBrk())
		,
		STTextMarginConverter.fromDocx4j(value.getMarR())
		,
		BooleanConverter.fromDocx4j(value.getHangingPunct())
		,
		STTextFontAlignTypeConverter.fromDocx4j(value.getFontAlgn())
		,
		BooleanConverter.fromDocx4j(value.getEaLnBrk())
		,
		BooleanConverter.fromDocx4j(value.getRtl())
		,
		STTextIndentLevelTypeConverter.fromDocx4j(value.getLvl())
		,
		STTextMarginConverter.fromDocx4j(value.getMarL())
		,
		STCoordinate32Converter.fromDocx4j(value.getDefTabSz())
		,
		STTextAlignTypeConverter.fromDocx4j(value.getAlgn())
		,
		CTTextSpacingConverter.fromDocx4j(value.getLnSpc())
		,
		CTTextSpacingConverter.fromDocx4j(value.getSpcBef())
		,
		CTTextSpacingConverter.fromDocx4j(value.getSpcAft())
		,
		BuClrTxOrBuClrConverter.fromDocx4j(value.getBuClrTxOrBuClr())
		,
		BuSzTxOrBuSzPctOrBuSzPtsConverter.fromDocx4j(value.getBuSzTxOrBuSzPctOrBuSzPts())
		,
		BuFontTxOrBuFontConverter.fromDocx4j(value.getBuFontTxOrBuFont())
		,
		BuNoneOrBuAutoNumOrBuCharConverter.fromDocx4j(value.getBuNoneOrBuAutoNumOrBuChar())
		,
		CTTextTabStopListConverter.fromDocx4j(value.getTabLst())
		,
		CTTextCharacterPropertiesConverter.fromDocx4j(value.getDefRPr())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
