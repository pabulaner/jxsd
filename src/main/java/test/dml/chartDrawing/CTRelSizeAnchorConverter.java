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
import test.dml.chartDrawing.CTRelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chartDrawing.CTRelSizeAnchorModel.*;
import test.officeDocument.relationships.*;

public class CTRelSizeAnchorConverter
{
	
	public static class SpOrGrpSpOrGraphicFrameConverter
	{
		
		private CTRelSizeAnchorConverter() {
			// empty
		}
		
		public static CTRelSizeAnchorModel fromDocx4j(CTRelSizeAnchor value)
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
	private CTRelSizeAnchorConverter() {
		// empty
	}
	
	public static CTRelSizeAnchorModel fromDocx4j(CTRelSizeAnchor value)
	{
		return new CTRelSizeAnchorModel(
		CTMarkerConverter.fromDocx4j(value.getFrom())
		,
		CTMarkerConverter.fromDocx4j(value.getTo())
		,
		SpOrGrpSpOrGraphicFrameConverter.fromDocx4j(value.getSpOrGrpSpOrGraphicFrame())
		
		);
	}
}
