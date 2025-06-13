


public class ST_OrderModel extends UnsignedByteModel {

    public ST_OrderModel(decimal value) {
        super(value);

        if (!(value >= 2)) throw new IllegalArgumentException();
        if (!(value <= 6)) throw new IllegalArgumentException();
    }
}