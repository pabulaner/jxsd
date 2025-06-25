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
import test.dml.CTBlipFillPropertiesModel.TileOrStretchModel.*;
import test.dml.CTBlipFillPropertiesModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTBlipFillPropertiesConverter
{
	
	public static class TileOrStretchConverter
	{
		
		private CTBlipFillPropertiesConverter() {
			// empty
		}
		
		public static CTBlipFillPropertiesModel fromDocx4j(CTBlipFillProperties value)
		{
			return new TileOrStretchModel(
			CTTileInfoPropertiesConverter.fromDocx4j(value.getTile())
			,
			CTStretchInfoPropertiesConverter.fromDocx4j(value.getStretch())
			
			);
		}
	}
	private CTBlipFillPropertiesConverter() {
		// empty
	}
	
	public static CTBlipFillPropertiesModel fromDocx4j(CTBlipFillProperties value)
	{
		return new CTBlipFillPropertiesModel(
		BooleanConverter.fromDocx4j(value.getRotWithShape())
		,
		UnsignedIntConverter.fromDocx4j(value.getDpi())
		,
		CTBlipConverter.fromDocx4j(value.getBlip())
		,
		CTRelativeRectConverter.fromDocx4j(value.getSrcRect())
		,
		TileOrStretchConverter.fromDocx4j(value.getTileOrStretch())
		
		);
	}
}
