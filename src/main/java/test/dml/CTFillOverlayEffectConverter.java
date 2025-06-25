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
import test.dml.CTFillOverlayEffectModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTFillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel.*;
import test.officeDocument.relationships.*;

public class CTFillOverlayEffectConverter
{
	
	public static class NoFillOrSolidFillOrGradFillConverter
	{
		
		private CTFillOverlayEffectConverter() {
			// empty
		}
		
		public static CTFillOverlayEffectModel fromDocx4j(CTFillOverlayEffect value)
		{
			return new NoFillOrSolidFillOrGradFillModel(
			CTNoFillPropertiesConverter.fromDocx4j(value.getNoFill())
			,
			CTSolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill())
			,
			CTGradientFillPropertiesConverter.fromDocx4j(value.getGradFill())
			,
			CTBlipFillPropertiesConverter.fromDocx4j(value.getBlipFill())
			,
			CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
			,
			CTGroupFillPropertiesConverter.fromDocx4j(value.getGrpFill())
			
			);
		}
	}
	private CTFillOverlayEffectConverter() {
		// empty
	}
	
	public static CTFillOverlayEffectModel fromDocx4j(CTFillOverlayEffect value)
	{
		return new CTFillOverlayEffectModel(
		STBlendModeConverter.fromDocx4j(value.getBlend())
		,
		NoFillOrSolidFillOrGradFillConverter.fromDocx4j(value.getNoFillOrSolidFillOrGradFill())
		
		);
	}
}
