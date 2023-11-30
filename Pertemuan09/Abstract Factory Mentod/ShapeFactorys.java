public class ShapeFactorys extends AbstractFactory {
   @Override
   public Shapes getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangles();         
      }
      else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Squares();
      }	 
      return null;
   }
}