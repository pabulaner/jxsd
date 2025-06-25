package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTTextNormalAutofitModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTTextNormalAutofitModel
{
	
	private final STTextFontScalePercentModel fontScale;
	private final STTextSpacingPercentModel lnSpcReduction;
	
	public CTTextNormalAutofitModel(STTextFontScalePercentModel fontScale, STTextSpacingPercentModel lnSpcReduction) {
		this.fontScale = fontScale;
		this.lnSpcReduction = lnSpcReduction;
	}
	
	public STTextFontScalePercentModel getFontScale() {
		return this.fontScale;
	}
	public STTextSpacingPercentModel getLnSpcReduction() {
		return this.lnSpcReduction;
	}
}
