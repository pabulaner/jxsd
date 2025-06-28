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

// SEQUENCE MODEL
public class CTEffectStyleItemModel
{
	
	// CHOICE MODEL
	public static class EffectLstOrEffectDagModel
	{
		
		private final int type;
		
		private final Object value;
		
		public EffectLstOrEffectDagModel() {
			this(-1, null);
		}
		
		private EffectLstOrEffectDagModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static EffectLstOrEffectDagModel createEffectLst(CTEffectListModel value) {
			return new EffectLstOrEffectDagModel(0, value);
		}
		public static EffectLstOrEffectDagModel createEffectDag(CTEffectContainerModel value) {
			return new EffectLstOrEffectDagModel(1, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isEffectLst() {
			return this.type == 0;
		}
		
		public CTEffectListModel getEffectLst() {
			if (this.type != 0) throw new ClassCastException();
			return (CTEffectListModel) value;
		}
		public boolean isEffectDag() {
			return this.type == 1;
		}
		
		public CTEffectContainerModel getEffectDag() {
			if (this.type != 1) throw new ClassCastException();
			return (CTEffectContainerModel) value;
		}
	}
	private final EffectLstOrEffectDagModel effectLstOrEffectDag;
	private final CTScene3DModel scene3d;
	private final CTShape3DModel sp3d;
	
	public CTEffectStyleItemModel(EffectLstOrEffectDagModel effectLstOrEffectDag, CTScene3DModel scene3d, CTShape3DModel sp3d) {
		this.effectLstOrEffectDag = effectLstOrEffectDag;
		this.scene3d = scene3d;
		this.sp3d = sp3d;
	}
	
	public EffectLstOrEffectDagModel getEffectLstOrEffectDag() {
		return this.effectLstOrEffectDag;
	}
	public CTScene3DModel getScene3d() {
		return this.scene3d;
	}
	public CTShape3DModel getSp3d() {
		return this.sp3d;
	}
}
