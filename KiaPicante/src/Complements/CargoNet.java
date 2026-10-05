public class CargoNet extends AdditionsDecorator {
  KiaPicanto kiapicanto;

  public CargoNet(KiaPicanto kiapicanto) {
    this.kiapicanto = kiapicanto;
  }

  public String getDescription() {
    return kiapicanto.getDescription() + "cargo net ";
  }

  public double cost(){
    return 110000 + kiapicanto.cost();
  }
}
