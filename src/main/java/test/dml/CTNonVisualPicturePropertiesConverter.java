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
import test.dml.CTNonVisualPicturePropertiesModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTNonVisualPicturePropertiesConverter
{
	
	private CTNonVisualPicturePropertiesConverter() {
		// empty
	}
	
	public static CTNonVisualPicturePropertiesModel fromDocx4j(CTNonVisualPictureProperties value)
	{
		return new CTNonVisualPicturePropertiesModel(
		BooleanConverter.fromDocx4j(value.getPreferRelativeResize())
		,
		CTPictureLockingConverter.fromDocx4j(value.getPicLocks())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
