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
import test.drawingml.main.CTPath2DModel.*;
import test.XMLSchema.*;
import test.drawingml.main.CTPath2DModel.CloseOrMoveToOrLnToModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPath2DModel
{
	
	// CHOICE MODEL
	public static class CloseOrMoveToOrLnToModel
	{
		
		private final int type;
		
		private final Object value;
		
		public CloseOrMoveToOrLnToModel() {
			this(-1, null);
		}
		
		private CloseOrMoveToOrLnToModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static CloseOrMoveToOrLnToModel createClose(CTPath2DCloseModel value) {
			return new CloseOrMoveToOrLnToModel(0, value);
		}
		public static CloseOrMoveToOrLnToModel createMoveTo(CTPath2DMoveToModel value) {
			return new CloseOrMoveToOrLnToModel(1, value);
		}
		public static CloseOrMoveToOrLnToModel createLnTo(CTPath2DLineToModel value) {
			return new CloseOrMoveToOrLnToModel(2, value);
		}
		public static CloseOrMoveToOrLnToModel createArcTo(CTPath2DArcToModel value) {
			return new CloseOrMoveToOrLnToModel(3, value);
		}
		public static CloseOrMoveToOrLnToModel createQuadBezTo(CTPath2DQuadBezierToModel value) {
			return new CloseOrMoveToOrLnToModel(4, value);
		}
		public static CloseOrMoveToOrLnToModel createCubicBezTo(CTPath2DCubicBezierToModel value) {
			return new CloseOrMoveToOrLnToModel(5, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isClose() {
			return this.type == 0;
		}
		
		public CTPath2DCloseModel getClose() {
			if (this.type != 0) throw new ClassCastException();
			return (CTPath2DCloseModel) value;
		}
		public boolean isMoveTo() {
			return this.type == 1;
		}
		
		public CTPath2DMoveToModel getMoveTo() {
			if (this.type != 1) throw new ClassCastException();
			return (CTPath2DMoveToModel) value;
		}
		public boolean isLnTo() {
			return this.type == 2;
		}
		
		public CTPath2DLineToModel getLnTo() {
			if (this.type != 2) throw new ClassCastException();
			return (CTPath2DLineToModel) value;
		}
		public boolean isArcTo() {
			return this.type == 3;
		}
		
		public CTPath2DArcToModel getArcTo() {
			if (this.type != 3) throw new ClassCastException();
			return (CTPath2DArcToModel) value;
		}
		public boolean isQuadBezTo() {
			return this.type == 4;
		}
		
		public CTPath2DQuadBezierToModel getQuadBezTo() {
			if (this.type != 4) throw new ClassCastException();
			return (CTPath2DQuadBezierToModel) value;
		}
		public boolean isCubicBezTo() {
			return this.type == 5;
		}
		
		public CTPath2DCubicBezierToModel getCubicBezTo() {
			if (this.type != 5) throw new ClassCastException();
			return (CTPath2DCubicBezierToModel) value;
		}
	}
	private final STPathFillModeModel fill;
	private final BooleanModel extrusionOk;
	private final STPositiveCoordinateModel h;
	private final STPositiveCoordinateModel w;
	private final BooleanModel stroke;
	private final List<CloseOrMoveToOrLnToModel> closeOrMoveToOrLnTo;
	
	public CTPath2DModel(STPathFillModeModel fill, BooleanModel extrusionOk, STPositiveCoordinateModel h, STPositiveCoordinateModel w, BooleanModel stroke, List<CloseOrMoveToOrLnToModel> closeOrMoveToOrLnTo) {
		this.fill = fill;
		this.extrusionOk = extrusionOk;
		this.h = h;
		this.w = w;
		this.stroke = stroke;
		this.closeOrMoveToOrLnTo = closeOrMoveToOrLnTo;
	}
	
	public STPathFillModeModel getFill() {
		return this.fill;
	}
	public BooleanModel getExtrusionOk() {
		return this.extrusionOk;
	}
	public STPositiveCoordinateModel getH() {
		return this.h;
	}
	public STPositiveCoordinateModel getW() {
		return this.w;
	}
	public BooleanModel getStroke() {
		return this.stroke;
	}
	public List<CloseOrMoveToOrLnToModel> getCloseOrMoveToOrLnTo() {
		return this.closeOrMoveToOrLnTo;
	}
}
