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
import test.drawingml.main.CTTileInfoPropertiesModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTTileInfoPropertiesModel
{
	
	private final STPercentageModel sy;
	private final STCoordinateModel ty;
	private final STPercentageModel sx;
	private final STTileFlipModeModel flip;
	private final STCoordinateModel tx;
	private final STRectAlignmentModel algn;
	
	public CTTileInfoPropertiesModel(STPercentageModel sy, STCoordinateModel ty, STPercentageModel sx, STTileFlipModeModel flip, STCoordinateModel tx, STRectAlignmentModel algn) {
		this.sy = sy;
		this.ty = ty;
		this.sx = sx;
		this.flip = flip;
		this.tx = tx;
		this.algn = algn;
	}
	
	public STPercentageModel getSy() {
		return this.sy;
	}
	public STCoordinateModel getTy() {
		return this.ty;
	}
	public STPercentageModel getSx() {
		return this.sx;
	}
	public STTileFlipModeModel getFlip() {
		return this.flip;
	}
	public STCoordinateModel getTx() {
		return this.tx;
	}
	public STRectAlignmentModel getAlgn() {
		return this.algn;
	}
}
