package test.dml.chartDrawing;

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
import test.dml.chartDrawing.CTGraphicFrameModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTGraphicFrameConverter
{
	
	private CTGraphicFrameConverter() {
		// empty
	}
	
	public static CTGraphicFrameModel fromDocx4j(CTGraphicFrame value)
	{
		return new CTGraphicFrameModel(
		BooleanConverter.fromDocx4j(value.getFPublished())
		,
		StringConverter.fromDocx4j(value.getMacro())
		,
		CTGraphicFrameNonVisualConverter.fromDocx4j(value.getNvGraphicFramePr())
		,
		CTTransform2DConverter.fromDocx4j(value.getXfrm())
		,
		CTGraphicalObjectConverter.fromDocx4j(value.getGraphic())
		
		);
	}
}
