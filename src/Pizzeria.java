public class Pizzeria {
    public Pizza orderPizza(String type) {
       Pizza pizza;
       if (type.equals("cheese")){
           pizza=new CheezePizza();
       }
       if (type.equals("ham")){
           pizza=new HamPizza();
       }
       if (type.equals("tomato")){
           pizza=new TomatoPizza();
       }
       else {
           pizza=new DefaultPizza();
       }
       pizza.bake();
       return pizza;

    }

}
