package org.velezreyes.quiz.question6;



public class VendingMachineImpl {

  public static Integer money = 0;
  public static VendingMachine getInstance() {
    // Fix me!
    VendingMachine vendingMachine = new VendingMachine() {
      @Override
      public void insertQuarter() {
        money = money + 25;
      }
      @Override
      public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        if(name.equals("ScottCola") && money == 0){
          throw new NotEnoughMoneyException();
        }else if(name.equals("ScottCola") && money == 75){
          Drink drink = new Drink() {
            @Override
            public String getName() {
              return name;
            }

            @Override
            public boolean isFizzy() {
              return true;
            }
          };
          money = 0;
          return drink;
        }else if(name.equals("KarenTea") && money <= 75){
          throw new NotEnoughMoneyException();
        }else if(name.equals("KarenTea") && money > 75){
          Drink drink = new Drink() {
            @Override
            public String getName() {
              return name;
            }

            @Override
            public boolean isFizzy() {
              return false;
            }
          };
          return drink;
        }else if(name.equals("BessieBooze")){
          throw new UnknownDrinkException();
        }
        return null;
      }
    };
    return vendingMachine;
  }


}
