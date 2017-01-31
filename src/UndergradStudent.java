public class UndergradStudent extends Student {
    private int hope = 100;
    private int pizza;

    public UndergradStudent(String f, String l, String u, int sH, int nSH, int pizzaInitial) {
        super(f,l,u,sH,nSH);
        if (pizzaInitial >= 0)
            pizza = pizzaInitial;
    }

    public int getHope() {
        return hope;
    }
    public void loseHope(int hopeLoss) {
        if (hopeLoss >= 0) {
            if (hope - hopeLoss >= 0) //hope cannot go past 0
                hope -= hopeLoss;
            else
                hope = 0; //hopeLoss is greater than remaining hope. force hope to 0
        }
    }
    public int getPizza() {
        return pizza;
    }
    public void eatPizza(int pizzas) {
        if (pizzas >= 0)
            pizza += pizzas;
    }
}