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
import test.dml.CTNonVisualGraphicFramePropertiesModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTNonVisualGraphicFramePropertiesConverter
{
	
	private CTNonVisualGraphicFramePropertiesConverter() {
		// empty
	}
	
	public static CTNonVisualGraphicFramePropertiesModel fromDocx4j(CTNonVisualGraphicFrameProperties value)
	{
		return new CTNonVisualGraphicFramePropertiesModel(
		CTGraphicalObjectFrameLockingConverter.fromDocx4j(value.getGraphicFrameLocks())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
