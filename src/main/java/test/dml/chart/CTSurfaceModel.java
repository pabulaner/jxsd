package test.dml.chart;

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
import test.dml.chart.CTSurfaceModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTSurfaceModel
{
	
	private final CTUnsignedIntModel thickness;
	private final CTShapePropertiesModel spPr;
	private final CTPictureOptionsModel pictureOptions;
	private final CTExtensionListModel extLst;
	
	public CTSurfaceModel(CTUnsignedIntModel thickness, CTShapePropertiesModel spPr, CTPictureOptionsModel pictureOptions, CTExtensionListModel extLst) {
		this.thickness = thickness;
		this.spPr = spPr;
		this.pictureOptions = pictureOptions;
		this.extLst = extLst;
	}
	
	public CTUnsignedIntModel getThickness() {
		return this.thickness;
	}
	public CTShapePropertiesModel getSpPr() {
		return this.spPr;
	}
	public CTPictureOptionsModel getPictureOptions() {
		return this.pictureOptions;
	}
	public CTExtensionListModel getExtLst() {
		return this.extLst;
	}
}
