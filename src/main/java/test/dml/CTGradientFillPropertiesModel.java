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

public class CTGradientFillPropertiesModel
{
	
	public static class LinOrPathModel
	{
		
		private final CTLinearShadePropertiesModel lin;
		private final CTPathShadePropertiesModel path;
		
		public LinOrPathModel(CTLinearShadePropertiesModel lin, CTPathShadePropertiesModel path) {
			this.lin = lin;
			this.path = path;
		}
		
		public CTLinearShadePropertiesModel getLin() {
			return this.lin;
		}
		public CTPathShadePropertiesModel getPath() {
			return this.path;
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
