/*public class GenericMath<T extends MathOperations<T>> {

    public T add(T first, T second){
        return first.plus(second);
    }

    public T subtract(T first, T second){
        return first.minus(second);
    }

    public T multiply(T first, T second){
        return first.mult(second);
    }

    public T divide(T first, T second){
        return first.div(second);
    }

}*/

interface MathOperations<T> {
    T plus(T other);
    T minus(T other);
    T mult(T other);
    T div(T other);
    Number get();
}

//implement more types in the future as needed
//TODO: Implement operations for each type

class GenericInt implements MathOperations<GenericInt>{
    private int val;

    private GenericInt(int val){
        this.val = val;
    }

    public static GenericInt of(int val){
        return new GenericInt(val);
    }

    public static GenericInt of(Integer val){
        return new GenericInt(val);
    }

    public Number get(){
        return val;
    }

    public void set(int val){
        this.val = val;
    }

    @Override
    public GenericInt plus(GenericInt other) {
        return of(this.val*other.val);
    }

    @Override
    public GenericInt minus(GenericInt other) {
        return null;
    }

    @Override
    public GenericInt mult(GenericInt other) {
        return null;
    }

    @Override
    public GenericInt div(GenericInt other) {
        return null;
    }
}

class GenericLong implements MathOperations<GenericLong>{
    private long val;

    private GenericLong(long val){
        this.val = val;
    }

    public static GenericLong of(long val){
        return new GenericLong(val);
    }

    public static GenericLong of(Long val){
        return new GenericLong(val);
    }

    public Number get(){
        return val;
    }

    public void set(long val){
        this.val = val;
    }

    @Override
    public GenericLong plus(GenericLong other) {
        return null;
    }

    @Override
    public GenericLong minus(GenericLong other) {
        return null;
    }

    @Override
    public GenericLong mult(GenericLong other) {
        return null;
    }

    @Override
    public GenericLong div(GenericLong other) {
        return null;
    }
}

class GenericFloat implements MathOperations<GenericFloat>{
    private float val;

    private GenericFloat(float val){
        this.val = val;
    }

    public static GenericFloat of(float val){
        return new GenericFloat(val);
    }

    public static GenericFloat of(Float val){
        return new GenericFloat(val);
    }

    public Number get(){
        return val;
    }

    public void set(float val){
        this.val = val;
    }

    @Override
    public GenericFloat plus(GenericFloat other) {
        return null;
    }

    @Override
    public GenericFloat minus(GenericFloat other) {
        return null;
    }

    @Override
    public GenericFloat mult(GenericFloat other) {
        return null;
    }

    @Override
    public GenericFloat div(GenericFloat other) {
        return null;
    }
}

class GenericDouble implements MathOperations<GenericDouble>{
    private double val;

    private GenericDouble(double val){
        this.val = val;
    }

    public static GenericDouble of(double val){
        return new GenericDouble(val);
    }

    public static GenericDouble of(Double val){
        return new GenericDouble(val);
    }

    public Number get(){
        return val;
    }

    public void set(double val){
        this.val = val;
    }

    @Override
    public GenericDouble plus(GenericDouble other) {
        return null;
    }

    @Override
    public GenericDouble minus(GenericDouble other) {
        return null;
    }

    @Override
    public GenericDouble mult(GenericDouble other) {
        return null;
    }

    @Override
    public GenericDouble div(GenericDouble other) {
        return null;
    }
}

class GenericByte implements MathOperations<GenericByte>{
    private byte val;

    private GenericByte(byte val){
        this.val = val;
    }

    public static GenericByte of(byte val){
        return new GenericByte(val);
    }

    public static GenericByte of(Byte val){
        return new GenericByte(val);
    }

    public Number get(){
        return val;
    }

    public void set(byte val){
        this.val = val;
    }

    @Override
    public GenericByte plus(GenericByte other) {
        return null;
    }

    @Override
    public GenericByte minus(GenericByte other) {
        return null;
    }

    @Override
    public GenericByte mult(GenericByte other) {
        return null;
    }

    @Override
    public GenericByte div(GenericByte other) {
        return null;
    }
}

class GenericShort implements MathOperations<GenericShort>{
    private short val;

    private GenericShort(short val){
        this.val = val;
    }

    public static GenericShort of(short val){
        return new GenericShort(val);
    }

    public static GenericShort of(Short val){
        return new GenericShort(val);
    }

    public Number get(){
        return val;
    }

    public void set(short val){
        this.val = val;
    }

    @Override
    public GenericShort plus(GenericShort other) {
        return null;
    }

    @Override
    public GenericShort minus(GenericShort other) {
        return null;
    }

    @Override
    public GenericShort mult(GenericShort other) {
        return null;
    }

    @Override
    public GenericShort div(GenericShort other) {
        return null;
    }
}