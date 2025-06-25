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

public class CTPath2DConverter
{
	
	public static class CloseOrMoveToOrLnToConverter
	{
		
		private CTPath2DConverter() {
			// empty
		}
		
		public static CTPath2DModel fromDocx4j(CTPath2D value)
		{
			return new CloseOrMoveToOrLnToModel(
			CTPath2DCloseConverter.fromDocx4j(value.getClose())
			,
			CTPath2DMoveToConverter.fromDocx4j(value.getMoveTo())
			,
			CTPath2DLineToConverter.fromDocx4j(value.getLnTo())
			,
			CTPath2DArcToConverter.fromDocx4j(value.getArcTo())
			,
			CTPath2DQuadBezierToConverter.fromDocx4j(value.getQuadBezTo())
			,
			CTPath2DCubicBezierToConverter.fromDocx4j(value.getCubicBezTo())
			
			);
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
		value.getCloseOrMoveToOrLnTo().stream().map(CloseOrMoveToOrLnToConverter::fromDocx4j).collect(Collectors.toList());
		
		);
	}
}
