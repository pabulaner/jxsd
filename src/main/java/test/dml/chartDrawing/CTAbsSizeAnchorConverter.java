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
import test.dml.chartDrawing.CTAbsSizeAnchorModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import test.dml.chartDrawing.CTAbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTAbsSizeAnchorConverter
{
	
	public static class SpOrGrpSpOrGraphicFrameConverter
	{
		
		private CTAbsSizeAnchorConverter() {
			// empty
		}
		
		public static CTAbsSizeAnchorModel fromDocx4j(CTAbsSizeAnchor value)
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
	private CTAbsSizeAnchorConverter() {
		// empty
	}
	
	public static CTAbsSizeAnchorModel fromDocx4j(CTAbsSizeAnchor value)
	{
		return new CTAbsSizeAnchorModel(
		CTMarkerConverter.fromDocx4j(value.getFrom())
		,
		CTPositiveSize2DConverter.fromDocx4j(value.getExt())
		,
		SpOrGrpSpOrGraphicFrameConverter.fromDocx4j(value.getSpOrGrpSpOrGraphicFrame())
		
		);
	}
}
