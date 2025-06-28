package test.drawingml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.CTDPtModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTDPtModel
{
	
	private final CTUnsignedIntModel idx;
	private final CTBooleanModel invertIfNegative;
	private final CTMarkerModel marker;
	private final CTBooleanModel bubble3D;
	private final CTUnsignedIntModel explosion;
	private final CTShapePropertiesModel spPr;
	private final CTPictureOptionsModel pictureOptions;
	private final CTExtensionListModel extLst;
	
	public CTDPtModel(CTUnsignedIntModel idx, CTBooleanModel invertIfNegative, CTMarkerModel marker, CTBooleanModel bubble3D, CTUnsignedIntModel explosion, CTShapePropertiesModel spPr, CTPictureOptionsModel pictureOptions, CTExtensionListModel extLst) {
		this.idx = idx;
		this.invertIfNegative = invertIfNegative;
		this.marker = marker;
		this.bubble3D = bubble3D;
		this.explosion = explosion;
		this.spPr = spPr;
		this.pictureOptions = pictureOptions;
		this.extLst = extLst;
	}
	
	public CTUnsignedIntModel getIdx() {
		return this.idx;
	}
	public CTBooleanModel getInvertIfNegative() {
		return this.invertIfNegative;
	}
	public CTMarkerModel getMarker() {
		return this.marker;
	}
	public CTBooleanModel getBubble3D() {
		return this.bubble3D;
	}
	public CTUnsignedIntModel getExplosion() {
		return this.explosion;
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
