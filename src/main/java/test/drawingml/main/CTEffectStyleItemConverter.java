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
import test.XMLSchema.*;
import test.drawingml.main.CTEffectStyleItemModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import test.drawingml.main.CTEffectStyleItemModel.EffectLstOrEffectDagModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTEffectStyleItemConverter
{
	
	// CHOICE CONVERTER
	public static class EffectLstOrEffectDagConverter
	{
		
		private EffectLstOrEffectDagConverter() {
			// empty
		}
		
		public static EffectLstOrEffectDagModel fromDocx4j(EffectLstOrEffectDag value)
		{
			if (value.getEffectLst() != null) return EffectLstOrEffectDagModel.createEffectLst(
			CTEffectListConverter.fromDocx4j(value.getEffectLst())
			);
			if (value.getEffectDag() != null) return EffectLstOrEffectDagModel.createEffectDag(
			CTEffectContainerConverter.fromDocx4j(value.getEffectDag())
			);
			
			return new EffectLstOrEffectDagModel();
		}
	}
	private CTEffectStyleItemConverter() {
		// empty
	}
	
	public static CTEffectStyleItemModel fromDocx4j(CTEffectStyleItem value)
	{
		return new CTEffectStyleItemModel(
		EffectLstOrEffectDagConverter.fromDocx4j(value.getEffectLstOrEffectDag())
		,
		CTScene3DConverter.fromDocx4j(value.getScene3d())
		,
		CTShape3DConverter.fromDocx4j(value.getSp3d())
		
		);
	}
}
