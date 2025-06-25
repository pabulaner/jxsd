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
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chartDrawing.CTPictureNonVisualModel.*;
import test.officeDocument.relationships.*;

public class CTPictureNonVisualModel
{
	
	private final CTNonVisualDrawingPropsModel cNvPr;
	private final CTNonVisualPicturePropertiesModel cNvPicPr;
	
	public CTPictureNonVisualModel(CTNonVisualDrawingPropsModel cNvPr, CTNonVisualPicturePropertiesModel cNvPicPr) {
		this.cNvPr = cNvPr;
		this.cNvPicPr = cNvPicPr;
	}
	
	public CTNonVisualDrawingPropsModel getCNvPr() {
		return this.cNvPr;
	}
	public CTNonVisualPicturePropertiesModel getCNvPicPr() {
		return this.cNvPicPr;
	}
}
