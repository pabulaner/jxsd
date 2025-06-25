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

public class CTBlipFillPropertiesModel
{
	
	public static class TileOrStretchModel
	{
		
		private final CTTileInfoPropertiesModel tile;
		private final CTStretchInfoPropertiesModel stretch;
		
		public TileOrStretchModel(CTTileInfoPropertiesModel tile, CTStretchInfoPropertiesModel stretch) {
			this.tile = tile;
			this.stretch = stretch;
		}
		
		public CTTileInfoPropertiesModel getTile() {
			return this.tile;
		}
		public CTStretchInfoPropertiesModel getStretch() {
			return this.stretch;
		}
	}
	private final BooleanModel rotWithShape;
	private final UnsignedIntModel dpi;
	private final CTBlipModel blip;
	private final CTRelativeRectModel srcRect;
	private final TileOrStretchModel tileOrStretch;
	
	public CTBlipFillPropertiesModel(BooleanModel rotWithShape, UnsignedIntModel dpi, CTBlipModel blip, CTRelativeRectModel srcRect, TileOrStretchModel tileOrStretch) {
		this.rotWithShape = rotWithShape;
		this.dpi = dpi;
		this.blip = blip;
		this.srcRect = srcRect;
		this.tileOrStretch = tileOrStretch;
	}
	
	public BooleanModel getRotWithShape() {
		return this.rotWithShape;
	}
	public UnsignedIntModel getDpi() {
		return this.dpi;
	}
	public CTBlipModel getBlip() {
		return this.blip;
	}
	public CTRelativeRectModel getSrcRect() {
		return this.srcRect;
	}
	public TileOrStretchModel getTileOrStretch() {
		return this.tileOrStretch;
	}
}
