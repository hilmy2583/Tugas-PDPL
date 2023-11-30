public class FaktorBentuk {
    // use getShape method to get object of type shape
    public Bentuk getShape(String shapeType){
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Lingkaran();
        } 
        else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new PersegiPanjang();
        } 
        else if (shapeType.equalsIgnoreCase("Square")) {
            return new Persegi();
        }
        return null;
    }
}
