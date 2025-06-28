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

// SEQUENCE MODEL
public class CTBlipFillPropertiesModel
{
	
	// CHOICE MODEL
	public static class TileOrStretchModel
	{
		
		private final int type;
		
		private final Object value;
		
		public TileOrStretchModel() {
			this(-1, null);
		}
		
		private TileOrStretchModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static TileOrStretchModel createTile(CTTileInfoPropertiesModel value) {
			return new TileOrStretchModel(0, value);
		}
		public static TileOrStretchModel createStretch(CTStretchInfoPropertiesModel value) {
			return new TileOrStretchModel(1, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isTile() {
			return this.type == 0;
		}
		
		public CTTileInfoPropertiesModel getTile() {
			if (this.type != 0) throw new ClassCastException();
			return (CTTileInfoPropertiesModel) value;
		}
		public boolean isStretch() {
			return this.type == 1;
		}
		
		public CTStretchInfoPropertiesModel getStretch() {
			if (this.type != 1) throw new ClassCastException();
			return (CTStretchInfoPropertiesModel) value;
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
