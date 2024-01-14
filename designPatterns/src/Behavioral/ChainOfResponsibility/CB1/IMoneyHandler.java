package Behavioral.ChainOfResponsibility.CB1;
/*
 * @created 05/01/2024 - 18:39
 * @project designPatterns
 * @author TaosDev
 */

public interface IMoneyHandler {
   IMoneyHandler capCaoHon (IMoneyHandler moneyHandler);
   void handleMoney(int amount,int denomination);
   int getSotien();
}
