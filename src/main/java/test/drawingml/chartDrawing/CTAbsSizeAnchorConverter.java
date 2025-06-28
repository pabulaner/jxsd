package test.drawingml.chartDrawing;

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
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.chartDrawing.CTAbsSizeAnchorModel.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.chartDrawing.CTAbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTAbsSizeAnchorConverter
{
	
	// CHOICE CONVERTER
	public static class SpOrGrpSpOrGraphicFrameConverter
	{
		
		private SpOrGrpSpOrGraphicFrameConverter() {
			// empty
		}
		
		public static SpOrGrpSpOrGraphicFrameModel fromDocx4j(SpOrGrpSpOrGraphicFrame value)
		{
			if (value.getSp() != null) return SpOrGrpSpOrGraphicFrameModel.createSp(
			CTShapeConverter.fromDocx4j(value.getSp())
			);
			if (value.getGrpSp() != null) return SpOrGrpSpOrGraphicFrameModel.createGrpSp(
			CTGroupShapeConverter.fromDocx4j(value.getGrpSp())
			);
			if (value.getGraphicFrame() != null) return SpOrGrpSpOrGraphicFrameModel.createGraphicFrame(
			CTGraphicFrameConverter.fromDocx4j(value.getGraphicFrame())
			);
			if (value.getCxnSp() != null) return SpOrGrpSpOrGraphicFrameModel.createCxnSp(
			CTConnectorConverter.fromDocx4j(value.getCxnSp())
			);
			if (value.getPic() != null) return SpOrGrpSpOrGraphicFrameModel.createPic(
			CTPictureConverter.fromDocx4j(value.getPic())
			);
			
			return new SpOrGrpSpOrGraphicFrameModel();
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
