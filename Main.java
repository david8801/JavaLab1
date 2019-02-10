public class Main {
      
    public static void main(String[] args) {
        
             
        Ladder BMW = new Ladder("BMW", 200, 400, "wood");
        BMW.setWidth(50);
        BMW.setAmountOfSteps(10);
        BMW.toStr();
        BMW.printStaticPrice();
        
        Ladder Audi = new Ladder("Audi",150,300,"Steel", 30, 6, 20, "blue");
        Audi.toStr();
        Audi.printPrice();
        
        BMW.resetValues("Lada", 50, 200, "grass", 20, 5, 40, "red");
        System.out.println("---------------------------------------");
        System.out.println("Values after reset:");
        BMW.toStr();
    }

}
class Ladder{
     
    public String producer; 
    public int maxLength;
    public int maxWeight;
    public String material;
    private int width;
    private int amountOfSteps;
    protected int weight;
    protected String color;
    static int price;
 
    public Ladder(String producer, int maxLength, int maxWeight, String material){
        this.producer = producer;
        this.maxLength = maxLength;
        this.maxWeight = maxWeight;
        this.material = material;
    }
    public Ladder(String producer, int maxLength, int maxWeight, String material, int width, int amountOfSteps, int weight, String color){
        this(producer, maxLength, maxWeight, material);
        this.width = width;
        this.amountOfSteps = amountOfSteps;
        this.weight = weight;
        this.color = color;
    }
     public int getWidth(){
        return this.width;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getAmountOfSteps(){
        return this.amountOfSteps;
    }
    public void setAmountOfSteps(int amountOfSteps){
        this.amountOfSteps = amountOfSteps;
    }
    
    public void resetValues(String producer, int maxLength, int maxWeight, String material, int width, int amountOfSteps, int weight, String color) {
        this.producer = producer;
        this.maxLength = maxLength;
        this.maxWeight = maxWeight;
        this.material = material;   
        this.width = width;
        this.amountOfSteps = amountOfSteps;
        this.weight = weight;
        this.color = color;
    }
    
    public void toStr() {
        System.out.println("---------------------------------------");
        System.out.println("The ladder is produced by "+this.producer); 
        System.out.println("Ladder width equals " +this.width+" santimeters");      
        System.out.println("An amount of steps on ladder equals " +this.amountOfSteps);
        System.out.println("Maximal length of ladder equals " +this.maxLength+ " santimeters");  
        System.out.println("The ladder withstands up to " +this.maxWeight);   
        System.out.println("The ladder is made of " + this.material); 
        System.out.println("The ladder weights " +this.weight+ " kilogramms");
        System.out.println("The color of ladder is "+this.color );
    }
    
    public static void printStaticPrice(){
        price = 50;
        System.out.println("The static price is " +price+ " dollars");
    }
    
    public void printPrice() {
        price = 30;
        System.out.println("Second static price is "+price+ " dollars");
    }
    
}