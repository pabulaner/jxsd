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
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.chart.CTPictureOptionsModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPictureOptionsModel
{
	
	private final CTBooleanModel applyToFront;
	private final CTBooleanModel applyToSides;
	private final CTBooleanModel applyToEnd;
	private final CTPictureFormatModel pictureFormat;
	private final CTPictureStackUnitModel pictureStackUnit;
	
	public CTPictureOptionsModel(CTBooleanModel applyToFront, CTBooleanModel applyToSides, CTBooleanModel applyToEnd, CTPictureFormatModel pictureFormat, CTPictureStackUnitModel pictureStackUnit) {
		this.applyToFront = applyToFront;
		this.applyToSides = applyToSides;
		this.applyToEnd = applyToEnd;
		this.pictureFormat = pictureFormat;
		this.pictureStackUnit = pictureStackUnit;
	}
	
	public CTBooleanModel getApplyToFront() {
		return this.applyToFront;
	}
	public CTBooleanModel getApplyToSides() {
		return this.applyToSides;
	}
	public CTBooleanModel getApplyToEnd() {
		return this.applyToEnd;
	}
	public CTPictureFormatModel getPictureFormat() {
		return this.pictureFormat;
	}
	public CTPictureStackUnitModel getPictureStackUnit() {
		return this.pictureStackUnit;
	}
}
