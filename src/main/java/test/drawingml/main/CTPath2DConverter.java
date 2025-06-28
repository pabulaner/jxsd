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

// SEQUENCE CONVERTER
public class CTPath2DConverter
{
	
	// CHOICE CONVERTER
	public static class CloseOrMoveToOrLnToConverter
	{
		
		private CloseOrMoveToOrLnToConverter() {
			// empty
		}
		
		public static CloseOrMoveToOrLnToModel fromDocx4j(CloseOrMoveToOrLnTo value)
		{
			if (value.getClose() != null) return CloseOrMoveToOrLnToModel.createClose(
			CTPath2DCloseConverter.fromDocx4j(value.getClose())
			);
			if (value.getMoveTo() != null) return CloseOrMoveToOrLnToModel.createMoveTo(
			CTPath2DMoveToConverter.fromDocx4j(value.getMoveTo())
			);
			if (value.getLnTo() != null) return CloseOrMoveToOrLnToModel.createLnTo(
			CTPath2DLineToConverter.fromDocx4j(value.getLnTo())
			);
			if (value.getArcTo() != null) return CloseOrMoveToOrLnToModel.createArcTo(
			CTPath2DArcToConverter.fromDocx4j(value.getArcTo())
			);
			if (value.getQuadBezTo() != null) return CloseOrMoveToOrLnToModel.createQuadBezTo(
			CTPath2DQuadBezierToConverter.fromDocx4j(value.getQuadBezTo())
			);
			if (value.getCubicBezTo() != null) return CloseOrMoveToOrLnToModel.createCubicBezTo(
			CTPath2DCubicBezierToConverter.fromDocx4j(value.getCubicBezTo())
			);
			
			return new CloseOrMoveToOrLnToModel();
		}
	}
	private CTPath2DConverter() {
		// empty
	}
	
	public static CTPath2DModel fromDocx4j(CTPath2D value)
	{
		return new CTPath2DModel(
		STPathFillModeConverter.fromDocx4j(value.getFill())
		,
		BooleanConverter.fromDocx4j(value.getExtrusionOk())
		,
		STPositiveCoordinateConverter.fromDocx4j(value.getH())
		,
		STPositiveCoordinateConverter.fromDocx4j(value.getW())
		,
		BooleanConverter.fromDocx4j(value.getStroke())
		,
		value.getCloseOrMoveToOrLnTo().stream().map(CloseOrMoveToOrLnToConverter::fromDocx4j).collect(Collectors.toList())
		
		);
	}
}
