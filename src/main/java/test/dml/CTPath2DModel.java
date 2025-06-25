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
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTPath2DModel.CloseOrMoveToOrLnToModel.*;
import test.dml.CTPath2DModel.*;
import test.officeDocument.relationships.*;

public class CTPath2DModel
{
	
	public static class CloseOrMoveToOrLnToModel
	{
		
		private final CTPath2DCloseModel close;
		private final CTPath2DMoveToModel moveTo;
		private final CTPath2DLineToModel lnTo;
		private final CTPath2DArcToModel arcTo;
		private final CTPath2DQuadBezierToModel quadBezTo;
		private final CTPath2DCubicBezierToModel cubicBezTo;
		
		public CloseOrMoveToOrLnToModel(CTPath2DCloseModel close, CTPath2DMoveToModel moveTo, CTPath2DLineToModel lnTo, CTPath2DArcToModel arcTo, CTPath2DQuadBezierToModel quadBezTo, CTPath2DCubicBezierToModel cubicBezTo) {
			this.close = close;
			this.moveTo = moveTo;
			this.lnTo = lnTo;
			this.arcTo = arcTo;
			this.quadBezTo = quadBezTo;
			this.cubicBezTo = cubicBezTo;
		}
		
		public CTPath2DCloseModel getClose() {
			return this.close;
		}
		public CTPath2DMoveToModel getMoveTo() {
			return this.moveTo;
		}
		public CTPath2DLineToModel getLnTo() {
			return this.lnTo;
		}
		public CTPath2DArcToModel getArcTo() {
			return this.arcTo;
		}
		public CTPath2DQuadBezierToModel getQuadBezTo() {
			return this.quadBezTo;
		}
		public CTPath2DCubicBezierToModel getCubicBezTo() {
			return this.cubicBezTo;
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
