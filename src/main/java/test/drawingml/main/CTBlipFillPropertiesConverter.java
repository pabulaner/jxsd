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
import test.drawingml.main.CTBlipFillPropertiesModel.TileOrStretchModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.CTBlipFillPropertiesModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTBlipFillPropertiesConverter
{
	
	// CHOICE CONVERTER
	public static class TileOrStretchConverter
	{
		
		private TileOrStretchConverter() {
			// empty
		}
		
		public static TileOrStretchModel fromDocx4j(TileOrStretch value)
		{
			if (value.getTile() != null) return TileOrStretchModel.createTile(
			CTTileInfoPropertiesConverter.fromDocx4j(value.getTile())
			);
			if (value.getStretch() != null) return TileOrStretchModel.createStretch(
			CTStretchInfoPropertiesConverter.fromDocx4j(value.getStretch())
			);
			
			return new TileOrStretchModel();
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
