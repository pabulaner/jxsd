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
import test.dml.CTGradientFillPropertiesModel.LinOrPathModel.*;
import test.dml.CTGradientFillPropertiesModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTGradientFillPropertiesConverter
{
	
	public static class LinOrPathConverter
	{
		
		private CTGradientFillPropertiesConverter() {
			// empty
		}
		
		public static CTGradientFillPropertiesModel fromDocx4j(CTGradientFillProperties value)
		{
			return new LinOrPathModel(
			CTLinearShadePropertiesConverter.fromDocx4j(value.getLin())
			,
			CTPathShadePropertiesConverter.fromDocx4j(value.getPath())
			
			);
		}
	}
	private CTGradientFillPropertiesConverter() {
		// empty
	}
	
	public static CTGradientFillPropertiesModel fromDocx4j(CTGradientFillProperties value)
	{
		return new CTGradientFillPropertiesModel(
		BooleanConverter.fromDocx4j(value.getRotWithShape())
		,
		STTileFlipModeConverter.fromDocx4j(value.getFlip())
		,
		CTGradientStopListConverter.fromDocx4j(value.getGsLst())
		,
		LinOrPathConverter.fromDocx4j(value.getLinOrPath())
		,
		CTRelativeRectConverter.fromDocx4j(value.getTileRect())
		
		);
	}
}
