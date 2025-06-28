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
import test.drawingml.main.CTGradientFillPropertiesModel.LinOrPathModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTGradientFillPropertiesModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTGradientFillPropertiesConverter
{
	
	// CHOICE CONVERTER
	public static class LinOrPathConverter
	{
		
		private LinOrPathConverter() {
			// empty
		}
		
		public static LinOrPathModel fromDocx4j(LinOrPath value)
		{
			if (value.getLin() != null) return LinOrPathModel.createLin(
			CTLinearShadePropertiesConverter.fromDocx4j(value.getLin())
			);
			if (value.getPath() != null) return LinOrPathModel.createPath(
			CTPathShadePropertiesConverter.fromDocx4j(value.getPath())
			);
			
			return new LinOrPathModel();
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
