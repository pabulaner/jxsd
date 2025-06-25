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
import test.dml.CTEffectStyleItemModel.EffectLstOrEffectDagModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTEffectStyleItemModel.*;
import test.officeDocument.relationships.*;

public class CTEffectStyleItemConverter
{
	
	public static class EffectLstOrEffectDagConverter
	{
		
		private CTEffectStyleItemConverter() {
			// empty
		}
		
		public static CTEffectStyleItemModel fromDocx4j(CTEffectStyleItem value)
		{
			return new EffectLstOrEffectDagModel(
			CTEffectListConverter.fromDocx4j(value.getEffectLst())
			,
			CTEffectContainerConverter.fromDocx4j(value.getEffectDag())
			
			);
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
