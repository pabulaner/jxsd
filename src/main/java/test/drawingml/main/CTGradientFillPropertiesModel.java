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

// SEQUENCE MODEL
public class CTGradientFillPropertiesModel
{
	
	// CHOICE MODEL
	public static class LinOrPathModel
	{
		
		private final int type;
		
		private final Object value;
		
		public LinOrPathModel() {
			this(-1, null);
		}
		
		private LinOrPathModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static LinOrPathModel createLin(CTLinearShadePropertiesModel value) {
			return new LinOrPathModel(0, value);
		}
		public static LinOrPathModel createPath(CTPathShadePropertiesModel value) {
			return new LinOrPathModel(1, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isLin() {
			return this.type == 0;
		}
		
		public CTLinearShadePropertiesModel getLin() {
			if (this.type != 0) throw new ClassCastException();
			return (CTLinearShadePropertiesModel) value;
		}
		public boolean isPath() {
			return this.type == 1;
		}
		
		public CTPathShadePropertiesModel getPath() {
			if (this.type != 1) throw new ClassCastException();
			return (CTPathShadePropertiesModel) value;
		}
	}
	private final BooleanModel rotWithShape;
	private final STTileFlipModeModel flip;
	private final CTGradientStopListModel gsLst;
	private final LinOrPathModel linOrPath;
	private final CTRelativeRectModel tileRect;
	
	public CTGradientFillPropertiesModel(BooleanModel rotWithShape, STTileFlipModeModel flip, CTGradientStopListModel gsLst, LinOrPathModel linOrPath, CTRelativeRectModel tileRect) {
		this.rotWithShape = rotWithShape;
		this.flip = flip;
		this.gsLst = gsLst;
		this.linOrPath = linOrPath;
		this.tileRect = tileRect;
	}
	
	public BooleanModel getRotWithShape() {
		return this.rotWithShape;
	}
	public STTileFlipModeModel getFlip() {
		return this.flip;
	}
	public CTGradientStopListModel getGsLst() {
		return this.gsLst;
	}
	public LinOrPathModel getLinOrPath() {
		return this.linOrPath;
	}
	public CTRelativeRectModel getTileRect() {
		return this.tileRect;
	}
}
