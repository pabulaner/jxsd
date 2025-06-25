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
import test.dml.chartDrawing.CTGroupShapeModel.SpOrGrpSpOrGraphicFrameModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chartDrawing.CTGroupShapeModel.*;
import test.officeDocument.relationships.*;

public class CTGroupShapeConverter
{
	
	public static class SpOrGrpSpOrGraphicFrameConverter
	{
		
		private CTGroupShapeConverter() {
			// empty
		}
		
		public static CTGroupShapeModel fromDocx4j(CTGroupShape value)
		{
			return new SpOrGrpSpOrGraphicFrameModel(
			CTShapeConverter.fromDocx4j(value.getSp())
			,
			CTGroupShapeConverter.fromDocx4j(value.getGrpSp())
			,
			CTGraphicFrameConverter.fromDocx4j(value.getGraphicFrame())
			,
			CTConnectorConverter.fromDocx4j(value.getCxnSp())
			,
			CTPictureConverter.fromDocx4j(value.getPic())
			
			);
		}
	}
	private CTGroupShapeConverter() {
		// empty
	}
	
	public static CTGroupShapeModel fromDocx4j(CTGroupShape value)
	{
		return new CTGroupShapeModel(
		CTGroupShapeNonVisualConverter.fromDocx4j(value.getNvGrpSpPr())
		,
		CTGroupShapePropertiesConverter.fromDocx4j(value.getGrpSpPr())
		,
		value.getSpOrGrpSpOrGraphicFrame().stream().map(SpOrGrpSpOrGraphicFrameConverter::fromDocx4j).collect(Collectors.toList());
		
		);
	}
}
