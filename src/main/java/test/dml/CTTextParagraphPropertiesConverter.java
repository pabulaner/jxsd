package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTTextParagraphPropertiesModel.BuSzTxOrBuSzPctOrBuSzPtsModel.*;
import test.dml.chart.*;
import test.dml.CTTextParagraphPropertiesModel.BuClrTxOrBuClrModel.*;
import test.XMLSchema.*;
import test.officeDocument.relationships.*;
import org.docx4j.dml.chart.*;
import test.dml.CTTextParagraphPropertiesModel.BuNoneOrBuAutoNumOrBuCharModel.*;
import test.dml.CTTextParagraphPropertiesModel.*;
import test.dml.CTTextParagraphPropertiesModel.BuFontTxOrBuFontModel.*;
import test.dml.chartDrawing.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;

public class CTTextParagraphPropertiesConverter
{
	
	public static class BuClrTxOrBuClrConverter
	{
		
		private CTTextParagraphPropertiesConverter() {
			// empty
		}
		
		public static CTTextParagraphPropertiesModel fromDocx4j(CTTextParagraphProperties value)
		{
			return new BuClrTxOrBuClrModel(
			CTTextBulletColorFollowTextConverter.fromDocx4j(value.getBuClrTx())
			,
			CTColorConverter.fromDocx4j(value.getBuClr())
			
			);
		}
	}
	public static class BuSzTxOrBuSzPctOrBuSzPtsConverter
	{
		
		private CTTextParagraphPropertiesConverter() {
			// empty
		}
		
		public static CTTextParagraphPropertiesModel fromDocx4j(CTTextParagraphProperties value)
		{
			return new BuSzTxOrBuSzPctOrBuSzPtsModel(
			CTTextBulletSizeFollowTextConverter.fromDocx4j(value.getBuSzTx())
			,
			CTTextBulletSizePercentConverter.fromDocx4j(value.getBuSzPct())
			,
			CTTextBulletSizePointConverter.fromDocx4j(value.getBuSzPts())
			
			);
		}
	}
	public static class BuFontTxOrBuFontConverter
	{
		
		private CTTextParagraphPropertiesConverter() {
			// empty
		}
		
		public static CTTextParagraphPropertiesModel fromDocx4j(CTTextParagraphProperties value)
		{
			return new BuFontTxOrBuFontModel(
			CTTextBulletTypefaceFollowTextConverter.fromDocx4j(value.getBuFontTx())
			,
			CTTextFontConverter.fromDocx4j(value.getBuFont())
			
			);
		}
	}
	public static class BuNoneOrBuAutoNumOrBuCharConverter
	{
		
		private CTTextParagraphPropertiesConverter() {
			// empty
		}
		
		public static CTTextParagraphPropertiesModel fromDocx4j(CTTextParagraphProperties value)
		{
			return new BuNoneOrBuAutoNumOrBuCharModel(
			CTTextNoBulletConverter.fromDocx4j(value.getBuNone())
			,
			CTTextAutonumberBulletConverter.fromDocx4j(value.getBuAutoNum())
			,
			CTTextCharBulletConverter.fromDocx4j(value.getBuChar())
			,
			CTTextBlipBulletConverter.fromDocx4j(value.getBuBlip())
			
			);
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
